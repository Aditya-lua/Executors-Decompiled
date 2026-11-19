; _INIT_156 @ 008b5258
008b5258	stp x29,x30,[sp, #-0x10]!
008b525c	mov x29,sp
008b5260	movi v0.2D,#0x0
008b5264	adrp x1,0xd1f000
008b5268	add x1,x1,#0x448
008b526c	mov w8,#0x3f800000
008b5270	nop
008b5274	adr x0,0x7fbc70
008b5278	adrp x2,0xc48000
008b527c	add x2,x2,#0x880
008b5280	str w8,[x1, #0x20]
008b5284	stp q0,q0,[x1]
008b5288	bl 0x00c2fe70
008b528c	adrp x8,0xd1f000
008b5290	add x8,x8,#0x470
008b5294	mov w9,#0x20
008b5298	adrp x10,0xd1e000
008b529c	str w9,[x8]
008b52a0	adrp x11,0x2ba000
008b52a4	add x11,x11,#0xf5c
008b52a8	ldr x9,[x10, #0xec8]
008b52ac	strb wzr,[x8, #0x4]
008b52b0	str wzr,[x8, #0x18]
008b52b4	stp x11,x9,[x8, #0x8]
008b52b8	str x8,[x10, #0xec8]
008b52bc	ldp x29,x30,[sp], #0x10
008b52c0	ret
