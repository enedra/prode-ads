INFERANALYZE = '/usr/local/lib/infer/infer/bin/infer-analyze' --no-report --results-dir '/home/mariano/Dev/prode-ads/infer-out' 

CLUSTERS=cl1 

default: test

all: test

test: $(CLUSTERS)
	@echo

#/home/mariano/Dev/prode-ads/infer-out/captured/App.java.b3a820eeb08a48757c97dde324d29a7a
cl1: 
	@$(INFERANALYZE) --cluster '/home/mariano/Dev/prode-ads/infer-out/multicore/xcl1.cluster'
	@touch $@


clean:
	rm -f $(CLUSTERS)
