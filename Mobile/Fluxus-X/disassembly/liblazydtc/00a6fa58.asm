; EVP_PKEY_get_field_type @ 00a6fa58
00a6fa58	sub sp,sp,#0xf0
00a6fa5c	stp x20,x19,[sp, #0xd0]
00a6fa60	stp x29,x30,[sp, #0xe0]
00a6fa64	add x29,sp,#0xe0
00a6fa68	cbz x0,0x00a6fb60
00a6fa6c	ldr x8,[x0, #0x60]
00a6fa70	mov x19,x0
00a6fa74	cbz x8,0x00a6fb40
00a6fa78	ldr x8,[x19, #0x68]
00a6fa7c	cbz x8,0x00a6fb40
00a6fa80	adrp x0,0x2a0000
00a6fa84	add x0,x0,#0x20
00a6fa88	add x8,sp,#0x58
00a6fa8c	add x1,sp,#0x8
00a6fa90	mov w2,#0x50
00a6fa94	sub x20,x29,#0x60
00a6fa98	bl 0x00c36280
00a6fa9c	ldr x8,[sp, #0x78]
00a6faa0	ldur q0,[sp, #0x68]
00a6faa4	ldur q1,[sp, #0x58]
00a6faa8	stur x8,[x29, #-0x40]
00a6faac	add x8,sp,#0x58
00a6fab0	str q0,[x20, #0x10]
00a6fab4	stur q1,[x29, #-0x60]
00a6fab8	bl 0x00c34c40
00a6fabc	ldr x8,[sp, #0x78]
00a6fac0	ldur q0,[sp, #0x68]
00a6fac4	ldur q1,[sp, #0x58]
00a6fac8	sub x1,x29,#0x60
00a6facc	mov x0,x19
00a6fad0	stur x8,[x29, #-0x18]
00a6fad4	stur q0,[x20, #0x38]
00a6fad8	stur q1,[x20, #0x28]
00a6fadc	bl 0x00a6f360
00a6fae0	cbz w0,0x00a6fb5c
00a6fae4	mov w19,w0
00a6fae8	sub x0,x29,#0x60
00a6faec	bl 0x00c3d030
00a6faf0	cbz w0,0x00a6fb5c
00a6faf4	ldur x8,[x29, #-0x40]
00a6faf8	cmp x8,#0x50
00a6fafc	b.eq 0x00a6fb5c
00a6fb00	add x9,sp,#0x8
00a6fb04	strb wzr,[x9, x8]
00a6fb08	cbz w19,0x00a6fb5c
00a6fb0c	adrp x1,0x2c5000
00a6fb10	add x1,x1,#0x892
00a6fb14	add x0,sp,#0x8
00a6fb18	bl 0x00c301f0
00a6fb1c	cbz w0,0x00a6fb70
00a6fb20	adrp x1,0x2c9000
00a6fb24	add x1,x1,#0x68d
00a6fb28	add x0,sp,#0x8
00a6fb2c	bl 0x00c301f0
00a6fb30	cmp w0,#0x0
00a6fb34	mov w8,#0x197
00a6fb38	csel w0,wzr,w8,eq
00a6fb3c	b 0x00a6fb60
00a6fb40	mov x0,x19
00a6fb44	bl 0x00c3a8b0
00a6fb48	cbz x0,0x00a6fb60
00a6fb4c	bl 0x00c36880
00a6fb50	cbz x0,0x00a6fb60
00a6fb54	bl 0x00c3aa80
00a6fb58	b 0x00a6fb60
00a6fb5c	mov w0,wzr
00a6fb60	ldp x29,x30,[sp, #0xe0]
00a6fb64	ldp x20,x19,[sp, #0xd0]
00a6fb68	add sp,sp,#0xf0
00a6fb6c	ret
00a6fb70	mov w0,#0x196
00a6fb74	b 0x00a6fb60
