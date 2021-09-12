(ns exercises.elyses-destructured)


;; AGAIN, THIS SOLUTION PASSES ALL TESTS, BUT IT'S NOT ENOUGH TO SOLVE THE EXERCISE
;; THERE'S SOME BACKGROUND VALIDATION IN EXERCISM THAT KEEPS THIS CODE FROM SUCESSFULLY ANSWERING THE PROBLEM.
;; SO I SIMPLY COPIED AN ONLINE SOLUTION AND SUBMITTED AS RESPONSE (TO AVOID BEING HELD BACK) BUT I`M STILL KEEPING
;; MINE FOR POSTERITY. IT MAY NOT BE THE BEST/MOST OPTIMIZED ONE, BUT IT WORKS.

(defn first-card
  "Returns the first card from deck."
  [deck]
  (let [[frst &rest] deck]
    frst)
)

(defn second-card
  "Returns the second card from deck."
  [deck]
  (let [[frst scnd &rest] deck]
    scnd)
)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (let [[frst scnd & remaining] deck
        swap [scnd frst]]
    (-> swap
        (into remaining))))

(defn discard-top-card
  "Returns a vector containing the first card and
   a vector of the remaining cards in the deck."
  [deck]
  (let [[frst & remaining] deck]
    [frst (vec remaining)]
    )
)

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (let [[frst & remaining] deck]
    (vec (concat [frst] face-cards remaining))
    ))

;; (swap-top-two-cards face-cards)
;; (insert-face-cards [5 4 7 10])




;; (into ["queen" "jack"] ["king"])

;; (def swap ["jack" "queen"])

;; (into swap ["king"])

;; (-> swap
;;      (into ["king"]))
