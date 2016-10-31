(ns codewars-clojure.moves-in-squared-strings-i.solution
  (:require [clojure.string :as str]))

(defn split-str [string]
  (if (str/blank? string)
    []
    (str/split string #"\n")))

(defn join-list [strings]
  (str/join "\n" strings))

(defn vert-mirror [string]
  (let [split (split-str string)
        reversed (map str/reverse split)
        joined (join-list reversed)]
    joined))

(defn hor-mirror [string]
  (let [split (split-str string)
        reversed (reverse split)
        joined (join-list reversed)]
    joined))

(defn oper [str-fn string]
  (str-fn string))