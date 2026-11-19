; _INIT_166 @ 008ba4ac
008ba4ac	stp x29,x30,[sp, #-0x10]!
008ba4b0	mov x29,sp
008ba4b4	movi v0.2D,#0x0
008ba4b8	adrp x1,0xd1f000
008ba4bc	add x1,x1,#0xbb0
008ba4c0	mov w8,#0x3f800000
008ba4c4	nop
008ba4c8	adr x0,0x7fbc70
008ba4cc	adrp x2,0xc48000
008ba4d0	add x2,x2,#0x880
008ba4d4	str w8,[x1, #0x20]
008ba4d8	stp q0,q0,[x1]
008ba4dc	bl 0x00c2fe70
008ba4e0	adrp x9,0xd1e000
008ba4e4	adrp x8,0xd1f000
008ba4e8	add x8,x8,#0xbd8
008ba4ec	ldr x10,[x9, #0xec0]
008ba4f0	adrp x11,0x2b9000
008ba4f4	add x11,x11,#0x37
008ba4f8	strh wzr,[x8]
008ba4fc	str wzr,[x8, #0x18]
008ba500	stp x11,x10,[x8, #0x8]
008ba504	str x8,[x9, #0xec0]
008ba508	ldp x29,x30,[sp], #0x10
008ba50c	ret
