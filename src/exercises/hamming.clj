(ns exercises.hamming)

(defn distance [strand1 strand2] ; <- arglist goes here
  ;; your code goes here
  (cond (not= (count strand1) (count strand2)) nil
        :else (reduce +(map #(if (not= %1 %2) 1 0) strand1 strand2))))

(distance "ACT" "GTA")
