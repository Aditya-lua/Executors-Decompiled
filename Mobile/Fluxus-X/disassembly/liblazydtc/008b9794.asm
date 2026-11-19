; _INIT_162 @ 008b9794
008b9794	movi v0.2D,#0x0
008b9798	adrp x1,0xd1f000
008b979c	add x1,x1,#0xae0
008b97a0	mov w8,#0x3f800000
008b97a4	nop
008b97a8	adr x0,0x7fbc70
008b97ac	adrp x2,0xc48000
008b97b0	add x2,x2,#0x880
008b97b4	str w8,[x1, #0x20]
008b97b8	stp q0,q0,[x1]
008b97bc	b 0x00c2fe70
