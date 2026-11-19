; OSSL_PARAM_merge @ 00a9fc24
00a9fc24	str x28,[sp, #-0x40]!
00a9fc28	stp x22,x21,[sp, #0x10]
00a9fc2c	stp x20,x19,[sp, #0x20]
00a9fc30	stp x29,x30,[sp, #0x30]
00a9fc34	add x29,sp,#0x30
00a9fc38	sub sp,sp,#0x810
00a9fc3c	orr x8,x0,x1
00a9fc40	mov x19,xzr
00a9fc44	cbz x8,0x00a9fe48
00a9fc48	cbz x0,0x00a9fc78
00a9fc4c	ldr x8,[x0]
00a9fc50	cbz x8,0x00a9fc78
00a9fc54	mov x19,xzr
00a9fc58	add x8,sp,#0x408
00a9fc5c	str x0,[x8, x19, LSL #0x3]
00a9fc60	ldr x9,[x0, #0x28]!
00a9fc64	add x19,x19,#0x1
00a9fc68	cmp x19,#0x7f
00a9fc6c	b.hi 0x00a9fc7c
00a9fc70	cbnz x9,0x00a9fc5c
00a9fc74	b 0x00a9fc7c
00a9fc78	mov x19,xzr
00a9fc7c	add x8,sp,#0x408
00a9fc80	str xzr,[x8, x19, LSL #0x3]
00a9fc84	cbz x1,0x00a9fcb4
00a9fc88	ldr x8,[x1]
00a9fc8c	cbz x8,0x00a9fcb4
00a9fc90	mov x20,xzr
00a9fc94	mov x8,sp
00a9fc98	str x1,[x8, x20, LSL #0x3]
00a9fc9c	ldr x9,[x1, #0x28]!
00a9fca0	add x20,x20,#0x1
00a9fca4	cmp x20,#0x7f
00a9fca8	b.hi 0x00a9fcb8
00a9fcac	cbnz x9,0x00a9fc98
00a9fcb0	b 0x00a9fcb8
00a9fcb4	mov x20,xzr
00a9fcb8	mov x8,sp
00a9fcbc	orr x9,x20,x19
00a9fcc0	str xzr,[x8, x20, LSL #0x3]
00a9fcc4	cbz x9,0x00a9fdb0
00a9fcc8	adrp x21,0xa9f000
00a9fccc	add x21,x21,#0xe64
00a9fcd0	add x0,sp,#0x408
00a9fcd4	mov w2,#0x8
00a9fcd8	mov x1,x19
00a9fcdc	mov x3,x21
00a9fce0	bl 0x00c31d30
00a9fce4	mov x0,sp
00a9fce8	mov w2,#0x8
00a9fcec	mov x1,x20
00a9fcf0	mov x3,x21
00a9fcf4	bl 0x00c31d30
00a9fcf8	add x8,x20,x19
00a9fcfc	mov w9,#0x28
00a9fd00	mul x8,x8,x9
00a9fd04	adrp x1,0x2b2000
00a9fd08	add x0,x8,#0x28
00a9fd0c	add x1,x1,#0x53b
00a9fd10	mov w2,#0xb5
00a9fd14	bl 0x00c34250
00a9fd18	mov x19,x0
00a9fd1c	cbz x0,0x00a9fdb8
00a9fd20	ldr x9,[sp, #0x408]
00a9fd24	cbz x9,0x00a9fdec
00a9fd28	add x21,sp,#0x408
00a9fd2c	mov x20,sp
00a9fd30	mov x22,x19
00a9fd34	ldr x8,[x20]
00a9fd38	cbz x8,0x00a9fe20
00a9fd3c	ldr x0,[x9]
00a9fd40	ldr x1,[x8]
00a9fd44	bl 0x00c35ee0
00a9fd48	cbz w0,0x00a9fd60
00a9fd4c	cmp w0,#0x1
00a9fd50	add x8,x22,#0x28
00a9fd54	b.lt 0x00a9fd84
00a9fd58	ldr x9,[x20], #0x8
00a9fd5c	b 0x00a9fd88
00a9fd60	ldr x8,[x20], #0x8
00a9fd64	add x21,x21,#0x8
00a9fd68	ldr x9,[x8, #0x20]
00a9fd6c	str x9,[x22, #0x20]
00a9fd70	ldr q0,[x8, #0x10]
00a9fd74	str q0,[x22, #0x10]
00a9fd78	ldr q0,[x8]
00a9fd7c	add x8,x22,#0x28
00a9fd80	b 0x00a9fd9c
00a9fd84	ldr x9,[x21], #0x8
00a9fd88	ldr x10,[x9, #0x20]
00a9fd8c	str x10,[x22, #0x20]
00a9fd90	ldr q0,[x9, #0x10]
00a9fd94	str q0,[x22, #0x10]
00a9fd98	ldr q0,[x9]
00a9fd9c	str q0,[x22]
00a9fda0	ldr x9,[x21]
00a9fda4	mov x22,x8
00a9fda8	cbnz x9,0x00a9fd34
00a9fdac	b 0x00a9fdf4
00a9fdb0	mov x19,xzr
00a9fdb4	b 0x00a9fe48
00a9fdb8	bl 0x00c342a0
00a9fdbc	adrp x0,0x2b2000
00a9fdc0	adrp x2,0x2c7000
00a9fdc4	add x0,x0,#0x53b
00a9fdc8	add x2,x2,#0xbdb
00a9fdcc	mov w1,#0xb7
00a9fdd0	bl 0x00c342b0
00a9fdd4	mov w1,#0x100
00a9fdd8	orr w0,wzr,#0xf
00a9fddc	movk w1,#0xc, LSL #16
00a9fde0	mov x2,xzr
00a9fde4	bl 0x00c342c0
00a9fde8	b 0x00a9fe48
00a9fdec	mov x20,sp
00a9fdf0	mov x8,x19
00a9fdf4	add x9,x20,#0x8
00a9fdf8	ldur x10,[x9, #-0x8]
00a9fdfc	ldr x11,[x10, #0x20]
00a9fe00	str x11,[x8, #0x20]
00a9fe04	ldr q0,[x10, #0x10]
00a9fe08	str q0,[x8, #0x10]
00a9fe0c	ldr q0,[x10]
00a9fe10	str q0,[x8], #0x28
00a9fe14	ldr x10,[x9], #0x8
00a9fe18	cbnz x10,0x00a9fdf8
00a9fe1c	b 0x00a9fe48
00a9fe20	add x8,x21,#0x8
00a9fe24	ldur x9,[x8, #-0x8]
00a9fe28	ldr x10,[x9, #0x20]
00a9fe2c	str x10,[x22, #0x20]
00a9fe30	ldr q0,[x9, #0x10]
00a9fe34	str q0,[x22, #0x10]
00a9fe38	ldr q0,[x9]
00a9fe3c	str q0,[x22], #0x28
00a9fe40	ldr x9,[x8], #0x8
00a9fe44	cbnz x9,0x00a9fe24
00a9fe48	mov x0,x19
00a9fe4c	add sp,sp,#0x810
00a9fe50	ldp x29,x30,[sp, #0x30]
00a9fe54	ldp x20,x19,[sp, #0x20]
00a9fe58	ldp x22,x21,[sp, #0x10]
00a9fe5c	ldr x28,[sp], #0x40
00a9fe60	ret
