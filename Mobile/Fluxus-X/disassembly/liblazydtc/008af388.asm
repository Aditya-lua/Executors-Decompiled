; _INIT_146 @ 008af388
008af388	movi v0.2D,#0x0
008af38c	adrp x1,0xd1f000
008af390	add x1,x1,#0x238
008af394	mov w8,#0x3f800000
008af398	nop
008af39c	adr x0,0x7fbc70
008af3a0	adrp x2,0xc48000
008af3a4	add x2,x2,#0x880
008af3a8	str w8,[x1, #0x20]
008af3ac	stp q0,q0,[x1]
008af3b0	b 0x00c2fe70
