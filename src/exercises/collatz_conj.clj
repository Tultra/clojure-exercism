(ns exercises.collatz-conj)

(defn collatz ;; <- arglist goes here
  ;; your code goes here
  ([num]
   (let [step 0]
     (cond (<= num 0) (throw (Exception. "my exception message"))
           (= num 1) step
           (even? num) (collatz (/ num 2) step)
           :else (collatz (+ (* num 3) 1) step))))
  ([num step]
   (let [step (+ step 1)]
     (cond (= num 1) step
           (even? num) (collatz (/ num 2) step)
           :else (collatz (+ (* num 3) 1) step)))))

