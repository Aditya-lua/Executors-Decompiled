; FUN_0080e1c8 @ 0080e1c8
0080e1c8	stp x29,x30,[sp, #-0x10]!
0080e1cc	mov x29,sp
0080e1d0	adrp x8,0xd1b000
0080e1d4	add x8,x8,#0x938
0080e1d8	ldarb w8,[x8]
0080e1dc	tbz w8,#0x0,0x0080e1e8
0080e1e0	ldp x29,x30,[sp], #0x10
0080e1e4	ret
0080e1e8	adrp x0,0xd1b000
0080e1ec	add x0,x0,#0x938
0080e1f0	bl 0x00c2fe90
0080e1f4	cbz w0,0x0080e1e0
0080e1f8	adrp x9,0x32d000
0080e1fc	add x9,x9,#0x5a1
0080e200	adrp x1,0xd1b000
0080e204	add x1,x1,#0x8b8
0080e208	ldp q0,q1,[x9, #0x40]
0080e20c	ldr q2,[x9, #0x60]
0080e210	mov w8,#0x1
0080e214	nop
0080e218	adr x0,0x80ea04
0080e21c	adrp x2,0xc48000
0080e220	add x2,x2,#0x880
0080e224	stp q0,q1,[x1, #0x40]
0080e228	ldur q0,[x9, #0x6a]
0080e22c	str q2,[x1, #0x60]
0080e230	stur q0,[x1, #0x6a]
0080e234	ldp q1,q0,[x9]
0080e238	strb w8,[x1, #0x7a]
0080e23c	stp q1,q0,[x1]
0080e240	ldp q2,q0,[x9, #0x20]
0080e244	stp q2,q0,[x1, #0x20]
0080e248	bl 0x00c2fe70
0080e24c	adrp x0,0xd1b000
0080e250	add x0,x0,#0x938
0080e254	ldp x29,x30,[sp], #0x10
0080e258	b 0x00c2fea0
