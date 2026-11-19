; _INIT_83 @ 0080ed18
0080ed18	stp x29,x30,[sp, #-0x20]!
0080ed1c	stp x20,x19,[sp, #0x10]
0080ed20	mov x29,sp
0080ed24	movi v0.2D,#0x0
0080ed28	adrp x19,0xc48000
0080ed2c	add x19,x19,#0x880
0080ed30	adrp x1,0xd1b000
0080ed34	add x1,x1,#0x520
0080ed38	mov w20,#0x3f800000
0080ed3c	nop
0080ed40	adr x0,0x7fbc70
0080ed44	mov x2,x19
0080ed48	str w20,[x1, #0x20]
0080ed4c	stp q0,q0,[x1]
0080ed50	bl 0x00c2fe70
0080ed54	movi v0.2D,#0x0
0080ed58	adrp x8,0xcca000
0080ed5c	adrp x1,0xd1b000
0080ed60	add x1,x1,#0x548
0080ed64	ldr x8,[x8, #0x878]
0080ed68	adrp x9,0xd1b000
0080ed6c	nop
0080ed70	adr x0,0x8088e4
0080ed74	mov x2,x19
0080ed78	str x8,[x9, #0x598]
0080ed7c	stp q0,q0,[x1]
0080ed80	str w20,[x1, #0x20]
0080ed84	bl 0x00c2fe70
0080ed88	movi v0.2D,#0x0
0080ed8c	adrp x1,0xd1b000
0080ed90	add x1,x1,#0x570
0080ed94	nop
0080ed98	adr x0,0x808980
0080ed9c	mov x2,x19
0080eda0	stp q0,q0,[x1]
0080eda4	str w20,[x1, #0x20]
0080eda8	ldp x20,x19,[sp, #0x10]
0080edac	ldp x29,x30,[sp], #0x20
0080edb0	b 0x00c2fe70
