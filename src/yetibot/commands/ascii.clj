(ns yetibot.commands.ascii
  (:require 
    [yetibot.core.hooks :refer [cmd-hook]]
    [yetibot.core.util.http :refer [fetch encode]]))

(def endpoint "http://asciime.heroku.com/generate_ascii?s=")

(defn ascii
  "ascii <text> # generates ascii art representation of <text>"
  [{text :match}]
  (fetch (str endpoint (encode text))))

;; disabled - api is gone
;; (cmd-hook ["ascii" #"^ascii$"]
;;           #"^.+" ascii)
