(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (<= 0 x)
    x
    (* -1 x))
  )

(defn divides? [divisor n]
  (if (mod divisor divisor)
    true
    false)
  )

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
