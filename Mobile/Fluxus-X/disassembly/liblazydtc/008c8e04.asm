; _INIT_175 @ 008c8e04
008c8e04	stp x29,x30,[sp, #-0x10]!
008c8e08	mov x29,sp
008c8e0c	movi v0.2D,#0x0
008c8e10	adrp x1,0xd1f000
008c8e14	add x1,x1,#0xda8
008c8e18	mov w8,#0x3f800000
008c8e1c	nop
008c8e20	adr x0,0x7fbc70
008c8e24	adrp x2,0xc48000
008c8e28	add x2,x2,#0x880
008c8e2c	str w8,[x1, #0x20]
008c8e30	stp q0,q0,[x1]
008c8e34	bl 0x00c2fe70
008c8e38	adrp x9,0xd1e000
008c8e3c	adrp x8,0xd1f000
008c8e40	add x8,x8,#0xdd0
008c8e44	ldr x10,[x9, #0xec0]
008c8e48	adrp x11,0x2c6000
008c8e4c	add x11,x11,#0xc1f
008c8e50	strh wzr,[x8]
008c8e54	stp x11,x10,[x8, #0x8]
008c8e58	adrp x10,0xd1f000
008c8e5c	add x10,x10,#0xdf0
008c8e60	adrp x11,0x29f000
008c8e64	add x11,x11,#0x39f
008c8e68	str wzr,[x8, #0x18]
008c8e6c	strh wzr,[x10]
008c8e70	stp x11,x8,[x10, #0x8]
008c8e74	str wzr,[x10, #0x18]
008c8e78	str x10,[x9, #0xec0]
008c8e7c	ldp x29,x30,[sp], #0x10
008c8e80	ret
