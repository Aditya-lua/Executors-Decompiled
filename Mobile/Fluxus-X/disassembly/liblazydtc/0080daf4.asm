; FUN_0080daf4 @ 0080daf4
0080daf4	stp x29,x30,[sp, #-0x20]!
0080daf8	stp x20,x19,[sp, #0x10]
0080dafc	mov x29,sp
0080db00	ldr x19,[x0]
0080db04	str xzr,[x0]
0080db08	cbz x19,0x0080db5c
0080db0c	ldrb w8,[x0, #0x10]
0080db10	cmp w8,#0x1
0080db14	b.ne 0x0080db48
0080db18	ldr x20,[x19, #0x20]
0080db1c	cbz x20,0x0080db48
0080db20	add x1,x20,#0x8
0080db24	mov x0,#-0x1
0080db28	bl 0x00c2bd10
0080db2c	cbnz x0,0x0080db48
0080db30	ldr x8,[x20]
0080db34	mov x0,x20
0080db38	ldr x8,[x8, #0x10]
0080db3c	blr x8
0080db40	mov x0,x20
0080db44	bl 0x00c2ff00
0080db48	mov x0,x19
0080db4c	mov w1,#0x28
0080db50	ldp x20,x19,[sp, #0x10]
0080db54	ldp x29,x30,[sp], #0x20
0080db58	b 0x00c2fe80
0080db5c	ldp x20,x19,[sp, #0x10]
0080db60	ldp x29,x30,[sp], #0x20
0080db64	ret
