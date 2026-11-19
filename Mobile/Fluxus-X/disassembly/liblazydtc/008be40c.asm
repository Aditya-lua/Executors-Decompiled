; _INIT_173 @ 008be40c
008be40c	movi v0.2D,#0x0
008be410	adrp x1,0xd1f000
008be414	add x1,x1,#0xd58
008be418	mov w8,#0x3f800000
008be41c	nop
008be420	adr x0,0x7fbc70
008be424	adrp x2,0xc48000
008be428	add x2,x2,#0x880
008be42c	str w8,[x1, #0x20]
008be430	stp q0,q0,[x1]
008be434	b 0x00c2fe70
