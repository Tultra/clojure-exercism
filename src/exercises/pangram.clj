(ns exercises.pangram)

(def alphabet "abcdefghijklmnopqrstuvwxyz")

(defn alphabet-freq [alpha]
  (let [letters (seq alpha)
        freq nil]
       (apply merge (map #(assoc freq % 0) letters))))

(defn pangram? [phrase] ;; <- arglist goes here
  ;; your code goes here
  (let [x (merge (alphabet-freq alphabet) (frequencies (clojure.string/lower-case phrase)))
        y (filter #(= (second %) 0) x)]
        (if (> (count y) 0) false true)
    )
)

;; (pangram? "the quick brown fox jumps over the lazy dog")
(frequencies (re-seq #"[a-z]" "the quick brown fox jumps over the lazy "))

;; (alphabet)
;;
