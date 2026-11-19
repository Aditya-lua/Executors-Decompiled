; _INIT_171 @ 008be3b4
008be3b4	movi v0.2D,#0x0
008be3b8	adrp x1,0xd1f000
008be3bc	add x1,x1,#0xd08
008be3c0	mov w8,#0x3f800000
008be3c4	nop
008be3c8	adr x0,0x7fbc70
008be3cc	adrp x2,0xc48000
008be3d0	add x2,x2,#0x880
008be3d4	str w8,[x1, #0x20]
008be3d8	stp q0,q0,[x1]
008be3dc	b 0x00c2fe70
