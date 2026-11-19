; EVP_PKEY_eq @ 00a6ca98
00a6ca98	stp x20,x19,[sp, #-0x20]!
00a6ca9c	cmp x0,x1
00a6caa0	stp x29,x30,[sp, #0x10]
00a6caa4	add x29,sp,#0x10
00a6caa8	b.eq 0x00a6caf8
00a6caac	mov x20,x0
00a6cab0	cbz x0,0x00a6cb18
00a6cab4	mov x19,x1
00a6cab8	mov w0,wzr
00a6cabc	cbz x1,0x00a6cb1c
00a6cac0	ldr x8,[x20, #0x60]
00a6cac4	cbnz x8,0x00a6cad0
00a6cac8	ldr x8,[x19, #0x60]
00a6cacc	cbz x8,0x00a6cb28
00a6cad0	mov w1,#0x2
00a6cad4	mov x0,x20
00a6cad8	bl 0x00c37d30
00a6cadc	cbz w0,0x00a6cb00
00a6cae0	mov w1,#0x2
00a6cae4	mov x0,x19
00a6cae8	bl 0x00c37d30
00a6caec	cbz w0,0x00a6cb00
00a6caf0	orr w2,wzr,#0x6
00a6caf4	b 0x00a6cb04
00a6caf8	mov w0,#0x1
00a6cafc	b 0x00a6cb1c
00a6cb00	orr w2,wzr,#0x7
00a6cb04	ldp x29,x30,[sp, #0x10]
00a6cb08	mov x0,x20
00a6cb0c	mov x1,x19
00a6cb10	ldp x20,x19,[sp], #0x20
00a6cb14	b 0x00a6c90c
00a6cb18	mov w0,wzr
00a6cb1c	ldp x29,x30,[sp, #0x10]
00a6cb20	ldp x20,x19,[sp], #0x20
00a6cb24	ret
00a6cb28	ldr w8,[x20]
00a6cb2c	ldr w9,[x19]
00a6cb30	cmp w8,w9
00a6cb34	b.ne 0x00a6cb7c
00a6cb38	ldr x8,[x20, #0x8]
00a6cb3c	cbz x8,0x00a6cb84
00a6cb40	ldr x9,[x8, #0x90]
00a6cb44	cbz x9,0x00a6cb60
00a6cb48	mov x0,x20
00a6cb4c	mov x1,x19
00a6cb50	blr x9
00a6cb54	cmp w0,#0x1
00a6cb58	b.lt 0x00a6cb1c
00a6cb5c	ldr x8,[x20, #0x8]
00a6cb60	ldr x2,[x8, #0x30]
00a6cb64	cbz x2,0x00a6cb84
00a6cb68	ldp x29,x30,[sp, #0x10]
00a6cb6c	mov x0,x20
00a6cb70	mov x1,x19
00a6cb74	ldp x20,x19,[sp], #0x20
00a6cb78	br x2
00a6cb7c	mov w0,#0xffffffff
00a6cb80	b 0x00a6cb1c
00a6cb84	orr w0,wzr,#0xfffffffe
00a6cb88	b 0x00a6cb1c
