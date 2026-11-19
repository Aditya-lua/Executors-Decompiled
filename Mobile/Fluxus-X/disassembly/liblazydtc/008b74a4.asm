; _INIT_160 @ 008b74a4
008b74a4	stp x29,x30,[sp, #-0x10]!
008b74a8	mov x29,sp
008b74ac	movi v0.2D,#0x0
008b74b0	adrp x1,0xd1f000
008b74b4	add x1,x1,#0x588
008b74b8	mov w8,#0x3f800000
008b74bc	nop
008b74c0	adr x0,0x7fbc70
008b74c4	adrp x2,0xc48000
008b74c8	add x2,x2,#0x880
008b74cc	str w8,[x1, #0x20]
008b74d0	stp q0,q0,[x1]
008b74d4	bl 0x00c2fe70
008b74d8	adrp x9,0xd1e000
008b74dc	adrp x8,0xd1f000
008b74e0	add x8,x8,#0x5b0
008b74e4	ldr x10,[x9, #0xec0]
008b74e8	adrp x11,0x2be000
008b74ec	add x11,x11,#0xfc5
008b74f0	strh wzr,[x8]
008b74f4	str wzr,[x8, #0x18]
008b74f8	stp x11,x10,[x8, #0x8]
008b74fc	str x8,[x9, #0xec0]
008b7500	ldp x29,x30,[sp], #0x10
008b7504	ret
