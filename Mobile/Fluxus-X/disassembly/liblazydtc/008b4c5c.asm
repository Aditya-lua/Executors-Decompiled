; _INIT_155 @ 008b4c5c
008b4c5c	stp x29,x30,[sp, #-0x10]!
008b4c60	mov x29,sp
008b4c64	movi v0.2D,#0x0
008b4c68	adrp x1,0xd1f000
008b4c6c	add x1,x1,#0x3e0
008b4c70	mov w8,#0x3f800000
008b4c74	nop
008b4c78	adr x0,0x7fbc70
008b4c7c	adrp x2,0xc48000
008b4c80	add x2,x2,#0x880
008b4c84	str w8,[x1, #0x20]
008b4c88	stp q0,q0,[x1]
008b4c8c	bl 0x00c2fe70
008b4c90	adrp x9,0xd1e000
008b4c94	adrp x8,0xd1f000
008b4c98	add x8,x8,#0x408
008b4c9c	ldr x10,[x9, #0xec0]
008b4ca0	adrp x11,0x2ce000
008b4ca4	add x11,x11,#0xe35
008b4ca8	strh wzr,[x8]
008b4cac	stp x11,x10,[x8, #0x8]
008b4cb0	adrp x10,0xd1f000
008b4cb4	add x10,x10,#0x428
008b4cb8	adrp x11,0x2af000
008b4cbc	add x11,x11,#0x55
008b4cc0	str wzr,[x8, #0x18]
008b4cc4	strh wzr,[x10]
008b4cc8	stp x11,x8,[x10, #0x8]
008b4ccc	str wzr,[x10, #0x18]
008b4cd0	str x10,[x9, #0xec0]
008b4cd4	ldp x29,x30,[sp], #0x10
008b4cd8	ret
