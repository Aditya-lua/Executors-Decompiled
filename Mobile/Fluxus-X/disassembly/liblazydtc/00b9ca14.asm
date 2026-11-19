; mbedtls_hmac_drbg_update_seed_file @ 00b9ca14
00b9ca14	sub sp,sp,#0x170
00b9ca18	str x28,[sp, #0x120]
00b9ca1c	stp x24,x23,[sp, #0x130]
00b9ca20	stp x22,x21,[sp, #0x140]
00b9ca24	stp x20,x19,[sp, #0x150]
00b9ca28	stp x29,x30,[sp, #0x160]
00b9ca2c	add x29,sp,#0x160
00b9ca30	mrs x23,tpidr_el0
00b9ca34	ldr x8,[x23, #0x28]
00b9ca38	mov x19,x1
00b9ca3c	adrp x1,0x2bb000
00b9ca40	mov x20,x0
00b9ca44	add x24,sp,#0x8
00b9ca48	add x1,x1,#0x65
00b9ca4c	mov x0,x19
00b9ca50	str x8,[x24]
00b9ca54	bl 0x00c30c10
00b9ca58	mov x21,x0
00b9ca5c	cbz x0,0x00b9caa4
00b9ca60	mov x0,x21
00b9ca64	mov x1,xzr
00b9ca68	bl 0x00c42490
00b9ca6c	add x0,sp,#0x18
00b9ca70	mov w1,#0x1
00b9ca74	mov w2,#0x100
00b9ca78	mov x3,x21
00b9ca7c	bl 0x00c31e60
00b9ca80	mov x22,x0
00b9ca84	add x0,sp,#0x14
00b9ca88	mov w1,#0x1
00b9ca8c	mov w2,#0x1
00b9ca90	mov x3,x21
00b9ca94	bl 0x00c31e60
00b9ca98	cbz x0,0x00b9caac
00b9ca9c	orr w22,wzr,#0xfffffffb
00b9caa0	b 0x00b9cac0
00b9caa4	orr w22,wzr,#0xfffffff9
00b9caa8	b 0x00b9cad4
00b9caac	cbz x22,0x00b9cabc
00b9cab0	mov x0,x21
00b9cab4	bl 0x00c38800
00b9cab8	cbz w0,0x00b9cb04
00b9cabc	orr w22,wzr,#0xfffffff9
00b9cac0	add x0,sp,#0x18
00b9cac4	mov w1,#0x100
00b9cac8	bl 0x00c42220
00b9cacc	mov x0,x21
00b9cad0	bl 0x00c30be0
00b9cad4	ldr x8,[x23, #0x28]
00b9cad8	ldr x9,[x24]
00b9cadc	cmp x8,x9
00b9cae0	b.ne 0x00b9cb44
00b9cae4	mov w0,w22
00b9cae8	ldp x29,x30,[sp, #0x160]
00b9caec	ldp x20,x19,[sp, #0x150]
00b9caf0	ldp x22,x21,[sp, #0x140]
00b9caf4	ldp x24,x23,[sp, #0x130]
00b9caf8	ldr x28,[sp, #0x120]
00b9cafc	add sp,sp,#0x170
00b9cb00	ret
00b9cb04	mov x0,x21
00b9cb08	bl 0x00c30be0
00b9cb0c	add x1,sp,#0x18
00b9cb10	mov x0,x20
00b9cb14	mov x2,x22
00b9cb18	bl 0x00c428c0
00b9cb1c	mov w22,w0
00b9cb20	add x0,sp,#0x18
00b9cb24	mov w1,#0x100
00b9cb28	bl 0x00c42220
00b9cb2c	cbnz w22,0x00b9cad4
00b9cb30	mov x0,x20
00b9cb34	mov x1,x19
00b9cb38	bl 0x00c428d0
00b9cb3c	mov w22,w0
00b9cb40	b 0x00b9cad4
00b9cb44	bl 0x00c2fec0
