#!/bin/bash
i=1
for file in $(echo *.png);
do
	mv ${file} treble_${i}.png
	let i=i+1
done
