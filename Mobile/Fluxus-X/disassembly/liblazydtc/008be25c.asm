; _INIT_170 @ 008be25c
008be25c	movi v0.2D,#0x0
008be260	adrp x1,0xd1f000
008be264	add x1,x1,#0xce0
008be268	mov w8,#0x3f800000
008be26c	nop
008be270	adr x0,0x7fbc70
008be274	adrp x2,0xc48000
008be278	add x2,x2,#0x880
008be27c	str w8,[x1, #0x20]
008be280	stp q0,q0,[x1]
008be284	b 0x00c2fe70
