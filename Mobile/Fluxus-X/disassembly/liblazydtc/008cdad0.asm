; _INIT_177 @ 008cdad0
008cdad0	movi v0.2D,#0x0
008cdad4	adrp x1,0xd1f000
008cdad8	add x1,x1,#0xe98
008cdadc	mov w8,#0x3f800000
008cdae0	nop
008cdae4	adr x0,0x7fbc70
008cdae8	adrp x2,0xc48000
008cdaec	add x2,x2,#0x880
008cdaf0	str w8,[x1, #0x20]
008cdaf4	stp q0,q0,[x1]
008cdaf8	b 0x00c2fe70
