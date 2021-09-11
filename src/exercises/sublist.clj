(ns exercises.sublist
  (:require [clojure.string :refer [join includes?]]))

(defn sublist? [listA listB]
  ;; for whatever reason (apply str listA) didnt work for solving the exercise
  ;; after inserting switching to (join "," listA), it passed
(let [A (join "," listA)
      B (join "," listB)]
  (includes? B A )))

(defn classify [list1 list2] ;; <- arglist goes here
      ;; your code goes here
  (cond (= list1 list2) :equal
        (sublist? list1 list2) :sublist
        (sublist? list2 list1) :superlist
        :else :unequal))

;; (classify [1 1 1 1 2 3 4 5] [1 4 3] )

;; (apply str [1 2 3 4])
