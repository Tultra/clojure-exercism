(ns exercises.anagram)

(defn check-match [word match]
  (let [w (seq word)
        m (seq match)
        n (for [letter m
                  :when (.contains w letter)]
              letter)]
    (if (= (frequencies n) (frequencies w))
      (apply str n)
      nil)))

(defn anagrams-for [word prospect-list] ;; <- arglist goes here
  ;; your code goes here
  (let [match (filter #(if (and (= (count word) (count %))
                                (not= (clojure.string/lower-case (apply str word)) (clojure.string/lower-case (apply str %))))
                         %
                         nil) prospect-list)]
    (filter #(check-match (clojure.string/lower-case word) (clojure.string/lower-case %)) match)))

;; (anagrams-for "eagle" ["galee"])

(check-match "eagle" "galea")
