(ns exercises.bird-watcher)

(def last-week
  [0 2 5 3 7 8 4])

(def birds-per-day
  [2 5 0 7 4 1])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (conj (pop birds) (+ (last birds) 1)))

(defn day-without-birds? [birds]
  (some #(= 0 %) birds))

(defn n-days-count [birds n]
  (apply + (take n birds)))

(defn busy-days [birds]
  (count (filter #(> % 4) birds)))

(defn odd-week? [birds]
  (let [x (re-find #"00|11" (apply str birds))]
    (if (nil? x)
      true
      false)))

;; (busy-days birds-per-day)
;;
;; (odd-week? [0 1 0 1 0 1 0 1])

;; (nil? (re-find #"00|11" (apply str [2 5 0 7 4 1])))
