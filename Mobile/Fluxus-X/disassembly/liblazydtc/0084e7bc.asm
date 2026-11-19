; _INIT_93 @ 0084e7bc
0084e7bc	stp x29,x30,[sp, #-0x20]!
0084e7c0	stp x20,x19,[sp, #0x10]
0084e7c4	mov x29,sp
0084e7c8	movi v0.2D,#0x0
0084e7cc	adrp x19,0xc48000
0084e7d0	add x19,x19,#0x880
0084e7d4	adrp x1,0xd1e000
0084e7d8	add x1,x1,#0x628
0084e7dc	mov w20,#0x3f800000
0084e7e0	nop
0084e7e4	adr x0,0x7fbc70
0084e7e8	mov x2,x19
0084e7ec	str w20,[x1, #0x20]
0084e7f0	stp q0,q0,[x1]
0084e7f4	bl 0x00c2fe70
0084e7f8	adrp x0,0xcb4000
0084e7fc	adrp x1,0xd1e000
0084e800	add x1,x1,#0x650
0084e804	ldr x0,[x0, #0x958]
0084e808	mov x2,x19
0084e80c	bl 0x00c2fe70
0084e810	movi v0.2D,#0x0
0084e814	adrp x1,0xd1e000
0084e818	add x1,x1,#0x678
0084e81c	nop
0084e820	adr x0,0x83f7cc
0084e824	mov x2,x19
0084e828	stp q0,q0,[x1]
0084e82c	str w20,[x1, #0x20]
0084e830	ldp x20,x19,[sp, #0x10]
0084e834	ldp x29,x30,[sp], #0x20
0084e838	b 0x00c2fe70
