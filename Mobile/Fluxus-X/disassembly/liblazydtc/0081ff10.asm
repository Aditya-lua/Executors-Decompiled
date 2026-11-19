; FUN_0081ff10 @ 0081ff10
0081ff10	cbz x2,0x0081ff94
0081ff14	stp x29,x30,[sp, #-0x30]!
0081ff18	stp x22,x21,[sp, #0x10]
0081ff1c	stp x20,x19,[sp, #0x20]
0081ff20	mov x29,sp
0081ff24	ldrb w8,[x0]
0081ff28	ldp x10,x11,[x0, #0x8]
0081ff2c	lsr x9,x8,#0x1
0081ff30	tst w8,#0x1
0081ff34	csinc x19,x11,x0,ne
0081ff38	csel x20,x9,x10,eq
0081ff3c	sub x9,x20,x1
0081ff40	cmp x9,x2
0081ff44	csel x21,x9,x2,cc
0081ff48	b.ls 0x0081ff6c
0081ff4c	add x8,x19,x1
0081ff50	sub x2,x9,x21
0081ff54	mov x22,x0
0081ff58	add x1,x8,x21
0081ff5c	mov x0,x8
0081ff60	bl 0x00c2ff60
0081ff64	ldrb w8,[x22]
0081ff68	mov x0,x22
0081ff6c	sub x9,x20,x21
0081ff70	tbnz w8,#0x0,0x0081ff80
0081ff74	lsl w8,w9,#0x1
0081ff78	strb w8,[x0]
0081ff7c	b 0x0081ff84
0081ff80	str x9,[x0, #0x8]
0081ff84	strb wzr,[x19, x9]
0081ff88	ldp x20,x19,[sp, #0x20]
0081ff8c	ldp x22,x21,[sp, #0x10]
0081ff90	ldp x29,x30,[sp], #0x30
0081ff94	ret
