; psa_pake_set_password_key @ 00b8fcc4
00b8fcc4	sub sp,sp,#0x40
00b8fcc8	str x21,[sp, #0x10]
00b8fccc	stp x20,x19,[sp, #0x20]
00b8fcd0	stp x29,x30,[sp, #0x30]
00b8fcd4	add x29,sp,#0x30
00b8fcd8	mrs x21,tpidr_el0
00b8fcdc	ldr x8,[x21, #0x28]
00b8fce0	mov x19,x0
00b8fce4	str x8,[sp, #0x8]
00b8fce8	str xzr,[sp]
00b8fcec	ldrb w8,[x0, #0xc]
00b8fcf0	mov w0,w1
00b8fcf4	cmp w8,#0x1
00b8fcf8	b.ne 0x00b8fd54
00b8fcfc	ldr w3,[x19, #0x4]
00b8fd00	mov x1,sp
00b8fd04	mov w2,#0x4000
00b8fd08	bl 0x00b86e5c
00b8fd0c	mov w20,w0
00b8fd10	cbz w0,0x00b8fdc0
00b8fd14	ldrb w8,[x19, #0xc]
00b8fd18	cmp w8,#0x2
00b8fd1c	b.eq 0x00b8fd60
00b8fd20	cmp w8,#0x1
00b8fd24	b.ne 0x00b8fd80
00b8fd28	ldr x0,[x19, #0x20]
00b8fd2c	cbz x0,0x00b8fd38
00b8fd30	ldr x1,[x19, #0x28]
00b8fd34	bl 0x00c42230
00b8fd38	ldr x0,[x19, #0x30]
00b8fd3c	cbz x0,0x00b8fd44
00b8fd40	bl 0x00c30960
00b8fd44	ldr x0,[x19, #0x40]
00b8fd48	cbz x0,0x00b8fd80
00b8fd4c	bl 0x00c30960
00b8fd50	b 0x00b8fd80
00b8fd54	mov w20,#0xffffff77
00b8fd58	cmp w8,#0x2
00b8fd5c	b.ne 0x00b8fd20
00b8fd60	ldr w8,[x19]
00b8fd64	cmp w8,#0x1
00b8fd68	b.ne 0x00b8fd80
00b8fd6c	add x0,x19,#0x20
00b8fd70	bl 0x00c430b0
00b8fd74	ldrb w8,[x19, #0xc]
00b8fd78	cmp w8,#0x1
00b8fd7c	b.eq 0x00b8fd28
00b8fd80	mov w2,#0x390
00b8fd84	mov x0,x19
00b8fd88	mov w1,wzr
00b8fd8c	bl 0x00c301c0
00b8fd90	ldr x0,[sp]
00b8fd94	bl 0x00c431e0
00b8fd98	ldr x8,[x21, #0x28]
00b8fd9c	ldr x9,[sp, #0x8]
00b8fda0	cmp x8,x9
00b8fda4	b.ne 0x00b8fe34
00b8fda8	mov w0,w20
00b8fdac	ldp x29,x30,[sp, #0x30]
00b8fdb0	ldp x20,x19,[sp, #0x20]
00b8fdb4	ldr x21,[sp, #0x10]
00b8fdb8	add sp,sp,#0x40
00b8fdbc	ret
00b8fdc0	ldr x20,[sp]
00b8fdc4	mov w9,#0x1205
00b8fdc8	ldrh w8,[x20]
00b8fdcc	cmp w8,w9
00b8fdd0	b.eq 0x00b8fde0
00b8fdd4	mov w9,#0x1203
00b8fdd8	cmp w8,w9
00b8fddc	b.ne 0x00b8fe24
00b8fde0	ldr x1,[x20, #0x30]
00b8fde4	mov w0,#0x1
00b8fde8	bl 0x00c30a30
00b8fdec	str x0,[x19, #0x20]
00b8fdf0	cbz x0,0x00b8fe2c
00b8fdf4	ldp x1,x2,[x20, #0x28]
00b8fdf8	bl 0x00c2ffd0
00b8fdfc	ldr x8,[x20, #0x30]
00b8fe00	mov x0,x20
00b8fe04	str x8,[x19, #0x28]
00b8fe08	ldr x8,[x20, #0x10]
00b8fe0c	str x8,[x19, #0x60]
00b8fe10	ldr q0,[x20]
00b8fe14	str q0,[x19, #0x50]
00b8fe18	bl 0x00c431e0
00b8fe1c	mov w20,w0
00b8fe20	b 0x00b8fd98
00b8fe24	mov w20,#0xffffff79
00b8fe28	b 0x00b8fd14
00b8fe2c	mov w20,#0xffffff73
00b8fe30	b 0x00b8fd14
00b8fe34	bl 0x00c2fec0
