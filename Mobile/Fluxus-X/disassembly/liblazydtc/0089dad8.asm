; FUN_0089dad8 @ 0089dad8
0089dad8	stp x29,x30,[sp, #-0x50]!
0089dadc	str x25,[sp, #0x10]
0089dae0	stp x24,x23,[sp, #0x20]
0089dae4	stp x22,x21,[sp, #0x30]
0089dae8	stp x20,x19,[sp, #0x40]
0089daec	mov x29,sp
0089daf0	ldr x8,[x0, #0x10]
0089daf4	ldr x19,[x0]
0089daf8	orr x9,xzr,#-0x3333333333333334
0089dafc	movk x9,#0xcccd
0089db00	sub x20,x8,x19
0089db04	asr x8,x20,#0x3
0089db08	mul x8,x8,x9
0089db0c	cmp x1,x8
0089db10	b.ls 0x0089db88
0089db14	orr x8,xzr,#0x6666666666666666
0089db18	movk x8,#0x6667
0089db1c	movk x8,#0x666, LSL #48
0089db20	cmp x1,x8
0089db24	b.cs 0x0089dba0
0089db28	add x8,x1,x1, LSL #0x2
0089db2c	ldr x9,[x0, #0x8]
0089db30	mov x24,x0
0089db34	lsl x21,x8,#0x3
0089db38	sub x22,x9,x19
0089db3c	mov x0,x21
0089db40	bl 0x00c2fed0
0089db44	mov x1,x19
0089db48	mov x2,x22
0089db4c	mov x23,x0
0089db50	add x25,x0,x22
0089db54	add x21,x0,x21
0089db58	bl 0x00c2ffd0
0089db5c	stp x23,x25,[x24]
0089db60	str x21,[x24, #0x10]
0089db64	cbz x19,0x0089db88
0089db68	mov x0,x19
0089db6c	mov x1,x20
0089db70	ldp x20,x19,[sp, #0x40]
0089db74	ldr x25,[sp, #0x10]
0089db78	ldp x22,x21,[sp, #0x30]
0089db7c	ldp x24,x23,[sp, #0x20]
0089db80	ldp x29,x30,[sp], #0x50
0089db84	b 0x00c2fe80
0089db88	ldp x20,x19,[sp, #0x40]
0089db8c	ldr x25,[sp, #0x10]
0089db90	ldp x22,x21,[sp, #0x30]
0089db94	ldp x24,x23,[sp, #0x20]
0089db98	ldp x29,x30,[sp], #0x50
0089db9c	ret
0089dba0	bl 0x0089f5b8
