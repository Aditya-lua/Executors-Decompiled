; FUN_0084f9b4 @ 0084f9b4
0084f9b4	stp x29,x30,[sp, #-0x20]!
0084f9b8	stp x20,x19,[sp, #0x10]
0084f9bc	mov x29,sp
0084f9c0	ldr x8,[x1]
0084f9c4	mov x20,x0
0084f9c8	mov x19,x1
0084f9cc	mov x0,x1
0084f9d0	mov x1,x20
0084f9d4	ldr x8,[x8, #0xe8]
0084f9d8	blr x8
0084f9dc	tbz w0,#0x0,0x0084fa5c
0084f9e0	adrp x8,0xd1e000
0084f9e4	add x8,x8,#0xce0
0084f9e8	ldrb w8,[x8]
0084f9ec	cmp w8,#0x1
0084f9f0	b.ne 0x0084fa14
0084f9f4	ldr x8,[x20, #0x60]
0084f9f8	cbz x8,0x0084fa14
0084f9fc	ldr x0,[x8, #0x38]
0084fa00	cbz x0,0x0084fa14
0084fa04	ldr x8,[x0]
0084fa08	mov x1,x19
0084fa0c	ldr x8,[x8]
0084fa10	blr x8
0084fa14	ldr x0,[x20, #0x20]
0084fa18	mov x1,x19
0084fa1c	ldr x8,[x0]
0084fa20	ldr x8,[x8]
0084fa24	blr x8
0084fa28	ldr x0,[x20, #0x28]
0084fa2c	mov x1,x19
0084fa30	ldr x8,[x0]
0084fa34	ldr x8,[x8]
0084fa38	blr x8
0084fa3c	ldr x0,[x20, #0x30]
0084fa40	cbz x0,0x0084fa5c
0084fa44	ldr x8,[x0]
0084fa48	ldr x2,[x8]
0084fa4c	mov x1,x19
0084fa50	ldp x20,x19,[sp, #0x10]
0084fa54	ldp x29,x30,[sp], #0x20
0084fa58	br x2
0084fa5c	ldp x20,x19,[sp, #0x10]
0084fa60	ldp x29,x30,[sp], #0x20
0084fa64	ret
