(ns exercises.bob-response)

(defn response-for [s] ;; <- arglist goes here
  ;; your code goes here
  (let [letters (apply str (filter #(Character/isLetter %) s))]

    (cond (and (every? #(Character/isUpperCase %) letters)
               (> (count letters) 0)
               (re-find #"\?" s)) "Calm down, I know what I'm doing!"

          (and (every? #(Character/isUpperCase %) letters)
               (re-find #"!" s)) "Whoa, chill out!"

          (and (every? #(Character/isUpperCase %) letters)
               (> (count letters) 0)) "Whoa, chill out!"

          (and (some #(or (Character/isLowerCase %)(Character/isDigit %)) s)
               (re-find #"\?$|\?\s*$" s)) "Sure."

          (and (not (some #(Character/isLetter %) s))
               (re-find #"\?$|\?\s*$" s)) "Sure."

          (and (some #(or (Character/isLowerCase %) (Character/isDigit %)) s)
               (re-find #"!$|.$|\s+$" s)) "Whatever."

          :else "Fine. Be that way!")))

