; _CONF_new_section @ 00a0fcec
00a0fcec	str x23,[sp, #-0x40]!
00a0fcf0	stp x22,x21,[sp, #0x10]
00a0fcf4	stp x20,x19,[sp, #0x20]
00a0fcf8	stp x29,x30,[sp, #0x30]
00a0fcfc	add x29,sp,#0x30
00a0fd00	mov x22,x1
00a0fd04	mov x21,x0
00a0fd08	bl 0x00c34780
00a0fd0c	cbz x0,0x00a0fdb0
00a0fd10	adrp x1,0x2c1000
00a0fd14	mov x20,x0
00a0fd18	add x1,x1,#0xa51
00a0fd1c	orr w0,wzr,#0x18
00a0fd20	mov w2,#0xc1
00a0fd24	bl 0x00c32320
00a0fd28	mov x19,x0
00a0fd2c	cbz x0,0x00a0fdbc
00a0fd30	mov x0,x22
00a0fd34	bl 0x00c2ff50
00a0fd38	orr x8,xzr,#0x100000000
00a0fd3c	add x8,x8,x0, LSL #0x20
00a0fd40	asr x23,x8,#0x20
00a0fd44	adrp x1,0x2c1000
00a0fd48	add x1,x1,#0xa51
00a0fd4c	mov w2,#0xc4
00a0fd50	mov x0,x23
00a0fd54	bl 0x00c32320
00a0fd58	str x0,[x19]
00a0fd5c	cbz x0,0x00a0fd90
00a0fd60	mov x1,x22
00a0fd64	mov x2,x23
00a0fd68	bl 0x00c2ffd0
00a0fd6c	stp xzr,x20,[x19, #0x8]
00a0fd70	ldr x0,[x21, #0x10]
00a0fd74	mov x1,x19
00a0fd78	bl 0x00c34dc0
00a0fd7c	cbnz x0,0x00a0fd90
00a0fd80	ldr x0,[x21, #0x10]
00a0fd84	bl 0x00c395f0
00a0fd88	cmp w0,#0x1
00a0fd8c	b.lt 0x00a0fddc
00a0fd90	mov x0,x20
00a0fd94	bl 0x00c34770
00a0fd98	ldr x0,[x19]
00a0fd9c	adrp x1,0x2c1000
00a0fda0	add x1,x1,#0xa51
00a0fda4	mov w2,#0xd3
00a0fda8	bl 0x00c32310
00a0fdac	b 0x00a0fdc4
00a0fdb0	bl 0x00c34770
00a0fdb4	mov x19,xzr
00a0fdb8	b 0x00a0fdc4
00a0fdbc	mov x0,x20
00a0fdc0	bl 0x00c34770
00a0fdc4	adrp x1,0x2c1000
00a0fdc8	add x1,x1,#0xa51
00a0fdcc	mov w2,#0xd4
00a0fdd0	mov x0,x19
00a0fdd4	bl 0x00c32310
00a0fdd8	mov x19,xzr
00a0fddc	mov x0,x19
00a0fde0	ldp x29,x30,[sp, #0x30]
00a0fde4	ldp x20,x19,[sp, #0x20]
00a0fde8	ldp x22,x21,[sp, #0x10]
00a0fdec	ldr x23,[sp], #0x40
00a0fdf0	ret
