; _INIT_161 @ 008b8c20
008b8c20	stp x29,x30,[sp, #-0x10]!
008b8c24	mov x29,sp
008b8c28	movi v0.2D,#0x0
008b8c2c	adrp x1,0xd1f000
008b8c30	add x1,x1,#0x5d0
008b8c34	mov w8,#0x3f800000
008b8c38	nop
008b8c3c	adr x0,0x7fbc70
008b8c40	adrp x2,0xc48000
008b8c44	add x2,x2,#0x880
008b8c48	str w8,[x1, #0x20]
008b8c4c	stp q0,q0,[x1]
008b8c50	bl 0x00c2fe70
008b8c54	adrp x9,0xd1e000
008b8c58	adrp x8,0xd1f000
008b8c5c	add x8,x8,#0x5f8
008b8c60	ldr x10,[x9, #0xec0]
008b8c64	adrp x11,0x2ba000
008b8c68	add x11,x11,#0xf74
008b8c6c	adrp x0,0xd1f000
008b8c70	add x0,x0,#0x638
008b8c74	strh wzr,[x8]
008b8c78	stp x11,x10,[x8, #0x8]
008b8c7c	adrp x10,0xd1f000
008b8c80	add x10,x10,#0x618
008b8c84	adrp x11,0x2b3000
008b8c88	add x11,x11,#0x4a3
008b8c8c	str wzr,[x8, #0x18]
008b8c90	strh wzr,[x10]
008b8c94	stp x11,x8,[x10, #0x8]
008b8c98	str wzr,[x10, #0x18]
008b8c9c	str x10,[x9, #0xec0]
008b8ca0	bl 0x008b7508
008b8ca4	ldp x29,x30,[sp], #0x10
008b8ca8	ret
