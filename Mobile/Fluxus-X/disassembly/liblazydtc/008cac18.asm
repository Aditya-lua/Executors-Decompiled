; _INIT_176 @ 008cac18
008cac18	stp x29,x30,[sp, #-0x10]!
008cac1c	mov x29,sp
008cac20	movi v0.2D,#0x0
008cac24	adrp x1,0xd1f000
008cac28	add x1,x1,#0xe10
008cac2c	mov w8,#0x3f800000
008cac30	nop
008cac34	adr x0,0x7fbc70
008cac38	adrp x2,0xc48000
008cac3c	add x2,x2,#0x880
008cac40	str w8,[x1, #0x20]
008cac44	stp q0,q0,[x1]
008cac48	bl 0x00c2fe70
008cac4c	adrp x9,0xd1e000
008cac50	adrp x8,0xd1f000
008cac54	add x8,x8,#0xe38
008cac58	ldr x10,[x9, #0xec0]
008cac5c	adrp x11,0x2c4000
008cac60	add x11,x11,#0xd66
008cac64	strh wzr,[x8]
008cac68	stp x11,x10,[x8, #0x8]
008cac6c	adrp x10,0xd1f000
008cac70	add x10,x10,#0xe58
008cac74	adrp x11,0x2ce000
008cac78	add x11,x11,#0xe57
008cac7c	str wzr,[x8, #0x18]
008cac80	stp x11,x8,[x10, #0x8]
008cac84	adrp x8,0xd1f000
008cac88	add x8,x8,#0xe78
008cac8c	adrp x11,0x2c4000
008cac90	add x11,x11,#0xd74
008cac94	strh wzr,[x10]
008cac98	str wzr,[x10, #0x18]
008cac9c	strh wzr,[x8]
008caca0	stp x11,x10,[x8, #0x8]
008caca4	str wzr,[x8, #0x18]
008caca8	str x8,[x9, #0xec0]
008cacac	ldp x29,x30,[sp], #0x10
008cacb0	ret
