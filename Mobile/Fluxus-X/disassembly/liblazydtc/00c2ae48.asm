; FUN_00c2ae48 @ 00c2ae48
00c2ae48	bti c
00c2ae4c	cbz x0,0x00c2aea0
00c2ae50	cmp x0,#0x0
00c2ae54	cneg x8,x0,mi
00c2ae58	clz x9,x8
00c2ae5c	lsr x11,x8,#0x1
00c2ae60	add w10,w9,#0x31
00c2ae64	mvn w12,w10
00c2ae68	lsl x8,x8,x10
00c2ae6c	tst x10,#0x40
00c2ae70	lsr x11,x11,x12
00c2ae74	csel x10,x8,x11,ne
00c2ae78	mov w11,#0x403e
00c2ae7c	csel x8,xzr,x8,ne
00c2ae80	eor x10,x10,#0x1000000000000
00c2ae84	sub w9,w11,w9
00c2ae88	add x9,x10,x9, LSL #0x30
00c2ae8c	and x10,x0,#-0x8000000000000000
00c2ae90	orr x9,x9,x10
00c2ae94	stp x8,x9,[sp, #-0x10]!
00c2ae98	ldr q0,[sp], #0x10
00c2ae9c	ret
00c2aea0	adrp x8,0x29c000
00c2aea4	ldr q0,[x8, #0xec0]
00c2aea8	ret
