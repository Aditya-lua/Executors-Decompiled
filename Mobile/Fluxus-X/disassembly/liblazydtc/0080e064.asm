; FUN_0080e064 @ 0080e064
0080e064	stp x29,x30,[sp, #-0x10]!
0080e068	mov x29,sp
0080e06c	adrp x8,0xd1b000
0080e070	add x8,x8,#0x8b0
0080e074	ldarb w8,[x8]
0080e078	tbz w8,#0x0,0x0080e084
0080e07c	ldp x29,x30,[sp], #0x10
0080e080	ret
0080e084	adrp x0,0xd1b000
0080e088	add x0,x0,#0x8b0
0080e08c	bl 0x00c2fe90
0080e090	cbz w0,0x0080e07c
0080e094	adrp x9,0x32d000
0080e098	add x9,x9,#0x543
0080e09c	adrp x1,0xd1b000
0080e0a0	add x1,x1,#0x850
0080e0a4	ldp q0,q1,[x9, #0x20]
0080e0a8	ldr q2,[x9, #0x40]
0080e0ac	mov w8,#0x1
0080e0b0	nop
0080e0b4	adr x0,0x80e9ec
0080e0b8	adrp x2,0xc48000
0080e0bc	add x2,x2,#0x880
0080e0c0	stp q0,q1,[x1, #0x20]
0080e0c4	ldur q0,[x9, #0x4e]
0080e0c8	str q2,[x1, #0x40]
0080e0cc	stur q0,[x1, #0x4e]
0080e0d0	ldp q1,q0,[x9]
0080e0d4	strb w8,[x1, #0x5e]
0080e0d8	stp q1,q0,[x1]
0080e0dc	bl 0x00c2fe70
0080e0e0	adrp x0,0xd1b000
0080e0e4	add x0,x0,#0x8b0
0080e0e8	ldp x29,x30,[sp], #0x10
0080e0ec	b 0x00c2fea0
