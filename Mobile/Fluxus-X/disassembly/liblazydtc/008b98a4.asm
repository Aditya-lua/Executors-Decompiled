; _INIT_164 @ 008b98a4
008b98a4	movi v0.2D,#0x0
008b98a8	adrp x1,0xd1f000
008b98ac	add x1,x1,#0xb30
008b98b0	mov w8,#0x3f800000
008b98b4	nop
008b98b8	adr x0,0x7fbc70
008b98bc	adrp x2,0xc48000
008b98c0	add x2,x2,#0x880
008b98c4	str w8,[x1, #0x20]
008b98c8	stp q0,q0,[x1]
008b98cc	b 0x00c2fe70
