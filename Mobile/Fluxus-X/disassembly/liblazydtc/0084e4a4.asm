; FUN_0084e4a4 @ 0084e4a4
0084e4a4	stp x29,x30,[sp, #-0x10]!
0084e4a8	mov x29,sp
0084e4ac	adrp x8,0xd1e000
0084e4b0	add x8,x8,#0x838
0084e4b4	ldarb w8,[x8]
0084e4b8	tbz w8,#0x0,0x0084e4c4
0084e4bc	ldp x29,x30,[sp], #0x10
0084e4c0	ret
0084e4c4	adrp x0,0xd1e000
0084e4c8	add x0,x0,#0x838
0084e4cc	bl 0x00c2fe90
0084e4d0	cbz w0,0x0084e4bc
0084e4d4	adrp x8,0x29b000
0084e4d8	adrp x1,0xd1e000
0084e4dc	add x1,x1,#0x828
0084e4e0	ldr d0,[x8, #0x48]
0084e4e4	mov w8,#0x1bf
0084e4e8	nop
0084e4ec	adr x0,0x84e778
0084e4f0	adrp x2,0xc48000
0084e4f4	add x2,x2,#0x880
0084e4f8	str d0,[x1]
0084e4fc	strh w8,[x1, #0x8]
0084e500	bl 0x00c2fe70
0084e504	adrp x0,0xd1e000
0084e508	add x0,x0,#0x838
0084e50c	ldp x29,x30,[sp], #0x10
0084e510	b 0x00c2fea0
