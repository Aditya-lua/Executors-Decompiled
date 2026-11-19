; EC_KEY_priv2buf @ 00a2fac0
00a2fac0	stp x22,x21,[sp, #-0x30]!
00a2fac4	stp x20,x19,[sp, #0x10]
00a2fac8	stp x29,x30,[sp, #0x20]
00a2facc	ldr x8,[x0, #0x18]
00a2fad0	add x29,sp,#0x20
00a2fad4	cbz x8,0x00a2fbf8
00a2fad8	ldr x8,[x8]
00a2fadc	cbz x8,0x00a2fbf8
00a2fae0	ldr x8,[x8, #0x130]
00a2fae4	cbz x8,0x00a2fb50
00a2fae8	mov x19,x1
00a2faec	mov x1,xzr
00a2faf0	mov x2,xzr
00a2faf4	mov x21,x0
00a2faf8	blr x8
00a2fafc	cbz x0,0x00a2fbfc
00a2fb00	adrp x1,0x2b4000
00a2fb04	add x1,x1,#0x15e
00a2fb08	mov w2,#0x3d0
00a2fb0c	mov x22,x0
00a2fb10	bl 0x00c32320
00a2fb14	cbz x0,0x00a2fb7c
00a2fb18	ldr x8,[x21, #0x18]
00a2fb1c	mov x20,x0
00a2fb20	cbz x8,0x00a2fbe4
00a2fb24	ldr x8,[x8]
00a2fb28	cbz x8,0x00a2fbe4
00a2fb2c	ldr x8,[x8, #0x130]
00a2fb30	cbz x8,0x00a2fbb4
00a2fb34	mov x0,x21
00a2fb38	mov x1,x20
00a2fb3c	mov x2,x22
00a2fb40	blr x8
00a2fb44	cbz x0,0x00a2fbe4
00a2fb48	str x20,[x19]
00a2fb4c	b 0x00a2fbfc
00a2fb50	bl 0x00c342a0
00a2fb54	adrp x0,0x2b4000
00a2fb58	adrp x2,0x2c7000
00a2fb5c	add x0,x0,#0x15e
00a2fb60	add x2,x2,#0x870
00a2fb64	mov w1,#0x389
00a2fb68	bl 0x00c342b0
00a2fb6c	mov w1,#0x101
00a2fb70	mov w0,#0x10
00a2fb74	movk w1,#0xc, LSL #16
00a2fb78	b 0x00a2fba8
00a2fb7c	bl 0x00c342a0
00a2fb80	adrp x0,0x2b4000
00a2fb84	adrp x2,0x2c5000
00a2fb88	add x0,x0,#0x15e
00a2fb8c	add x2,x2,#0x92f
00a2fb90	mov w1,#0x3d1
00a2fb94	bl 0x00c342b0
00a2fb98	mov w8,#0x101
00a2fb9c	movk w8,#0xc, LSL #16
00a2fba0	sub w1,w8,#0x1
00a2fba4	mov w0,#0x10
00a2fba8	mov x2,xzr
00a2fbac	bl 0x00c342c0
00a2fbb0	b 0x00a2fbf8
00a2fbb4	bl 0x00c342a0
00a2fbb8	adrp x0,0x2b4000
00a2fbbc	adrp x2,0x2c7000
00a2fbc0	add x0,x0,#0x15e
00a2fbc4	add x2,x2,#0x870
00a2fbc8	mov w1,#0x389
00a2fbcc	bl 0x00c342b0
00a2fbd0	mov w1,#0x101
00a2fbd4	mov w0,#0x10
00a2fbd8	movk w1,#0xc, LSL #16
00a2fbdc	mov x2,xzr
00a2fbe0	bl 0x00c342c0
00a2fbe4	adrp x1,0x2b4000
00a2fbe8	add x1,x1,#0x15e
00a2fbec	mov w2,#0x3d6
00a2fbf0	mov x0,x20
00a2fbf4	bl 0x00c32310
00a2fbf8	mov x0,xzr
00a2fbfc	ldp x29,x30,[sp, #0x20]
00a2fc00	ldp x20,x19,[sp, #0x10]
00a2fc04	ldp x22,x21,[sp], #0x30
00a2fc08	ret
