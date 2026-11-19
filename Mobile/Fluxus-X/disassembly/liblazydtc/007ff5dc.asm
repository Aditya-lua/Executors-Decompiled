; _INIT_18 @ 007ff5dc
007ff5dc	movi v0.2D,#0x0
007ff5e0	adrp x1,0xcca000
007ff5e4	add x1,x1,#0x820
007ff5e8	mov w8,#0x3f800000
007ff5ec	nop
007ff5f0	adr x0,0x7fbc70
007ff5f4	adrp x2,0xc48000
007ff5f8	add x2,x2,#0x880
007ff5fc	str w8,[x1, #0x20]
007ff600	stp q0,q0,[x1]
007ff604	b 0x00c2fe70
