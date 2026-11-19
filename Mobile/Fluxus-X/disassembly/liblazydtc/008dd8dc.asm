; FUN_008dd8dc @ 008dd8dc
008dd8dc	cmp w1,#0x3f
008dd8e0	cset w8,gt
008dd8e4	ldr x8,[x0, w8, UXTW #0x3]
008dd8e8	lsr x8,x8,x1
008dd8ec	and w0,w8,#0x1
008dd8f0	ret
