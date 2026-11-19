; _INIT_165 @ 008b9b28
008b9b28	stp x29,x30,[sp, #-0x10]!
008b9b2c	mov x29,sp
008b9b30	movi v0.2D,#0x0
008b9b34	adrp x1,0xd1f000
008b9b38	add x1,x1,#0xb68
008b9b3c	mov w8,#0x3f800000
008b9b40	nop
008b9b44	adr x0,0x7fbc70
008b9b48	adrp x2,0xc48000
008b9b4c	add x2,x2,#0x880
008b9b50	str w8,[x1, #0x20]
008b9b54	stp q0,q0,[x1]
008b9b58	bl 0x00c2fe70
008b9b5c	adrp x9,0xd1e000
008b9b60	adrp x8,0xd1f000
008b9b64	add x8,x8,#0xb90
008b9b68	ldr x10,[x9, #0xec0]
008b9b6c	adrp x11,0x2d7000
008b9b70	add x11,x11,#0x12a
008b9b74	strh wzr,[x8]
008b9b78	str wzr,[x8, #0x18]
008b9b7c	stp x11,x10,[x8, #0x8]
008b9b80	str x8,[x9, #0xec0]
008b9b84	ldp x29,x30,[sp], #0x10
008b9b88	ret
