; _INIT_174 @ 008be448
008be448	movi v0.2D,#0x0
008be44c	adrp x1,0xd1f000
008be450	add x1,x1,#0xd80
008be454	mov w8,#0x3f800000
008be458	nop
008be45c	adr x0,0x7fbc70
008be460	adrp x2,0xc48000
008be464	add x2,x2,#0x880
008be468	str w8,[x1, #0x20]
008be46c	stp q0,q0,[x1]
008be470	b 0x00c2fe70
