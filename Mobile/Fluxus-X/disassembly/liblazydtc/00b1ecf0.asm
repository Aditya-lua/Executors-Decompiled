; i2d_X509_AUX @ 00b1ecf0
00b1ecf0	sub sp,sp,#0x40
00b1ecf4	stp x22,x21,[sp, #0x10]
00b1ecf8	stp x20,x19,[sp, #0x20]
00b1ecfc	mov x19,x1
00b1ed00	mov x21,x0
00b1ed04	stp x29,x30,[sp, #0x30]
00b1ed08	add x29,sp,#0x30
00b1ed0c	cbz x1,0x00b1edc0
00b1ed10	ldr x22,[x19]
00b1ed14	cbnz x22,0x00b1edc4
00b1ed18	adrp x2,0xc82000
00b1ed1c	add x2,x2,#0x968
00b1ed20	mov x0,x21
00b1ed24	mov x1,xzr
00b1ed28	bl 0x00c36170
00b1ed2c	mov w20,w0
00b1ed30	cbz x21,0x00b1ed50
00b1ed34	cmp w20,#0x1
00b1ed38	b.lt 0x00b1ed50
00b1ed3c	ldr x0,[x21, #0x150]
00b1ed40	mov x1,xzr
00b1ed44	bl 0x00c40f70
00b1ed48	tbnz w0,#0x1f,0x00b1ee08
00b1ed4c	add w20,w0,w20
00b1ed50	cmp w20,#0x1
00b1ed54	b.lt 0x00b1ee0c
00b1ed58	adrp x1,0x29e000
00b1ed5c	sxtw x0,w20
00b1ed60	add x1,x1,#0xcf5
00b1ed64	mov w2,#0x112
00b1ed68	bl 0x00c32320
00b1ed6c	str x0,[sp, #0x8]
00b1ed70	str x0,[x19]
00b1ed74	cbz x0,0x00b1ee24
00b1ed78	adrp x2,0xc82000
00b1ed7c	mov x22,x0
00b1ed80	add x2,x2,#0x968
00b1ed84	add x1,sp,#0x8
00b1ed88	mov x0,x21
00b1ed8c	bl 0x00c36170
00b1ed90	mov w20,w0
00b1ed94	cbz x21,0x00b1edb4
00b1ed98	cmp w20,#0x1
00b1ed9c	b.lt 0x00b1edb4
00b1eda0	ldr x0,[x21, #0x150]
00b1eda4	add x1,sp,#0x8
00b1eda8	bl 0x00c40f70
00b1edac	tbnz w0,#0x1f,0x00b1ee5c
00b1edb0	add w20,w0,w20
00b1edb4	cmp w20,#0x0
00b1edb8	b.gt 0x00b1ee0c
00b1edbc	b 0x00b1ee64
00b1edc0	mov x22,xzr
00b1edc4	adrp x2,0xc82000
00b1edc8	add x2,x2,#0x968
00b1edcc	mov x0,x21
00b1edd0	mov x1,x19
00b1edd4	bl 0x00c36170
00b1edd8	mov w20,w0
00b1eddc	cbz x21,0x00b1ee0c
00b1ede0	cmp w20,#0x1
00b1ede4	b.lt 0x00b1ee0c
00b1ede8	ldr x0,[x21, #0x150]
00b1edec	mov x1,x19
00b1edf0	bl 0x00c40f70
00b1edf4	tbnz w0,#0x1f,0x00b1ee00
00b1edf8	add w20,w0,w20
00b1edfc	b 0x00b1ee0c
00b1ee00	cbz x22,0x00b1ee08
00b1ee04	str x22,[x19]
00b1ee08	mov w20,w0
00b1ee0c	mov w0,w20
00b1ee10	ldp x29,x30,[sp, #0x30]
00b1ee14	ldp x20,x19,[sp, #0x20]
00b1ee18	ldp x22,x21,[sp, #0x10]
00b1ee1c	add sp,sp,#0x40
00b1ee20	ret
00b1ee24	bl 0x00c342a0
00b1ee28	adrp x0,0x29e000
00b1ee2c	adrp x2,0x2c4000
00b1ee30	add x0,x0,#0xcf5
00b1ee34	add x2,x2,#0x42c
00b1ee38	mov w1,#0x114
00b1ee3c	bl 0x00c342b0
00b1ee40	mov w1,#0x100
00b1ee44	mov w0,#0xb
00b1ee48	movk w1,#0xc, LSL #16
00b1ee4c	mov x2,xzr
00b1ee50	bl 0x00c342c0
00b1ee54	mov w20,#0xffffffff
00b1ee58	b 0x00b1ee0c
00b1ee5c	str x22,[sp, #0x8]
00b1ee60	mov w20,w0
00b1ee64	ldr x0,[x19]
00b1ee68	adrp x1,0x29e000
00b1ee6c	add x1,x1,#0xcf5
00b1ee70	mov w2,#0x11b
00b1ee74	bl 0x00c32310
00b1ee78	str xzr,[x19]
00b1ee7c	b 0x00b1ee0c
