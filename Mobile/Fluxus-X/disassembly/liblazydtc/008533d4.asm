; FUN_008533d4 @ 008533d4
008533d4	lsr x8,x4,#0x20
008533d8	stp x1,x2,[x0]
008533dc	stp wzr,w4,[x0, #0x10]
008533e0	neg w9,w8
008533e4	stp w4,w8,[x0, #0x2c]
008533e8	mov w8,#0x100
008533ec	str w9,[x0, #0x18]
008533f0	str wzr,[x0, #0x20]
008533f4	stur x4,[x0, #0x24]
008533f8	stur xzr,[x0, #0x34]
008533fc	stur xzr,[x0, #0x44]
00853400	stur xzr,[x0, #0x3c]
00853404	str wzr,[x0, #0x4c]
00853408	str x3,[x0, #0x50]
0085340c	strh w8,[x0, #0x58]
00853410	stp xzr,xzr,[x0, #0x68]
00853414	str xzr,[x0, #0x60]
00853418	ret
