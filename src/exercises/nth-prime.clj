(ns exercises.nth-prime)

;; (defn prime? [candidate]
;;   (let [x (take 1 (filter #(= 0 (mod candidate %)) (iterate inc 2)))]
;;     (if (= (apply int x) candidate)
;;       true
;;       false)))

(defn prime? [candidate]
  (if (= 0 (reduce + (for [x (range 2 (+ (Math/floor (Math/sqrt candidate)) 1))]
                       (if (= 0 (mod candidate x)) 1 0))))
    true
    false))

;; (defn prime? [candidate]
;;   (if (= 0 (reduce + (for [x (range 2 (Math/floor (Math/sqrt candidate)))]
;;                        (if (= 0 (mod candidate x)) 1 0))))
;;     true
;;     false))

(defn nth-prime [target] ;; <- arglist goes here
  ;; your code goes here
  (if (<= target 0)
    (throw (IllegalArgumentException. "my exception message"))
    (last (take target (filter #(prime? %) (iterate inc 2))))))

(nth-prime 10)
;;
;; (take 1 (filter #(= 0 (mod 11 %)) (iterate inc 2)))

;; (= 11 (apply int (take 1 (filter #(= 0 (mod 11 %)) (iterate inc 2)))))
