; _INIT_150 @ 008b34b8
008b34b8	movi v0.2D,#0x0
008b34bc	adrp x1,0xd1f000
008b34c0	add x1,x1,#0x2f8
008b34c4	mov w8,#0x3f800000
008b34c8	nop
008b34cc	adr x0,0x7fbc70
008b34d0	adrp x2,0xc48000
008b34d4	add x2,x2,#0x880
008b34d8	str w8,[x1, #0x20]
008b34dc	stp q0,q0,[x1]
008b34e0	b 0x00c2fe70
