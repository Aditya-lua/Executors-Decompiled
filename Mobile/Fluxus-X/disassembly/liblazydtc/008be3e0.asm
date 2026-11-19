; _INIT_172 @ 008be3e0
008be3e0	movi v0.2D,#0x0
008be3e4	adrp x1,0xd1f000
008be3e8	add x1,x1,#0xd30
008be3ec	mov w8,#0x3f800000
008be3f0	nop
008be3f4	adr x0,0x7fbc70
008be3f8	adrp x2,0xc48000
008be3fc	add x2,x2,#0x880
008be400	str w8,[x1, #0x20]
008be404	stp q0,q0,[x1]
008be408	b 0x00c2fe70
