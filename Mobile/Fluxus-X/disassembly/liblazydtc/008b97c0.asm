; _INIT_163 @ 008b97c0
008b97c0	movi v0.2D,#0x0
008b97c4	adrp x1,0xd1f000
008b97c8	add x1,x1,#0xb08
008b97cc	mov w8,#0x3f800000
008b97d0	nop
008b97d4	adr x0,0x7fbc70
008b97d8	adrp x2,0xc48000
008b97dc	add x2,x2,#0x880
008b97e0	str w8,[x1, #0x20]
008b97e4	stp q0,q0,[x1]
008b97e8	b 0x00c2fe70
