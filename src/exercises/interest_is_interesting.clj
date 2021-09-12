(ns exercises.interest-is-interesting)

;; Again, event though this solutions passes all tests, the exercise is not sucessfully completed.
;; Explanations for solving it are also not well written

(defn interest-rate
  [balance]
  (cond (neg? balance) -3.213
        (> balance 5000) 2.475
        (> balance 1000) 1.621
        :else 0.5 )
  )

(defn annual-balance-update
  [balance]
  (bigdec (+ balance (* balance (interest-rate balance))))
  )

(defn amount-to-donate
  [balance tax-free-percentage]
  (if (> balance 0.0M)
  (let [tax-rate (/ tax-free-percentage 100M)]
    (int (* 2 (* balance tax-rate))))))

;; (annual-balance-update 0.0M)
;; (amount-to-donate 550.5M 2.5)
