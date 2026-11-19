; FUN_0080df10 @ 0080df10
0080df10	stp x29,x30,[sp, #-0x10]!
0080df14	mov x29,sp
0080df18	adrp x8,0xd1b000
0080df1c	add x8,x8,#0x848
0080df20	ldarb w8,[x8]
0080df24	tbz w8,#0x0,0x0080df30
0080df28	ldp x29,x30,[sp], #0x10
0080df2c	ret
0080df30	adrp x0,0xd1b000
0080df34	add x0,x0,#0x848
0080df38	bl 0x00c2fe90
0080df3c	cbz w0,0x0080df28
0080df40	adrp x9,0x32d000
0080df44	add x9,x9,#0x4e6
0080df48	adrp x1,0xd1b000
0080df4c	add x1,x1,#0x7e8
0080df50	ldp q0,q1,[x9, #0x20]
0080df54	ldr q2,[x9, #0x40]
0080df58	mov w8,#0x1
0080df5c	nop
0080df60	adr x0,0x80e9d4
0080df64	adrp x2,0xc48000
0080df68	add x2,x2,#0x880
0080df6c	stp q0,q1,[x1, #0x20]
0080df70	ldur q0,[x9, #0x4d]
0080df74	str q2,[x1, #0x40]
0080df78	stur q0,[x1, #0x4d]
0080df7c	ldp q1,q0,[x9]
0080df80	strb w8,[x1, #0x5d]
0080df84	stp q1,q0,[x1]
0080df88	bl 0x00c2fe70
0080df8c	adrp x0,0xd1b000
0080df90	add x0,x0,#0x848
0080df94	ldp x29,x30,[sp], #0x10
0080df98	b 0x00c2fea0
