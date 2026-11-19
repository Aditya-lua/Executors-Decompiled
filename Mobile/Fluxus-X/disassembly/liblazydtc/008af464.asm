; _INIT_147 @ 008af464
008af464	movi v0.2D,#0x0
008af468	adrp x1,0xd1f000
008af46c	add x1,x1,#0x260
008af470	mov w8,#0x3f800000
008af474	nop
008af478	adr x0,0x7fbc70
008af47c	adrp x2,0xc48000
008af480	add x2,x2,#0x880
008af484	str w8,[x1, #0x20]
008af488	stp q0,q0,[x1]
008af48c	b 0x00c2fe70
