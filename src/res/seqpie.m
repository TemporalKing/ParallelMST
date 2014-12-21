sort = mean(importdata('proc\kssortp'));
main = mean(importdata('proc\ksmainp'));

%sort * 100 / (sort + main)

labels = {'Sorting (89.8286%)', 'Main Kruskal Loop (10.1744%)'};

pie([sort main], labels);
title('Sequential Kruskal - Proportion of total time of execution per phase');