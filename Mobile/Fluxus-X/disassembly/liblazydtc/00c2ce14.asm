; FUN_00c2ce14 @ 00c2ce14
00c2ce14	paciasp
00c2ce18	stp x29,x30,[sp, #-0x40]!
00c2ce1c	str x28,[sp, #0x10]
00c2ce20	stp x22,x21,[sp, #0x20]
00c2ce24	stp x20,x19,[sp, #0x30]
00c2ce28	mov x29,sp
00c2ce2c	sub sp,sp,#0x6c0
00c2ce30	ldr x8,[x0]
00c2ce34	strb wzr,[x0, #0x26a]
00c2ce38	mov w20,w1
00c2ce3c	mov w1,#0xffffffff
00c2ce40	mov x19,x0
00c2ce44	ldr x8,[x8, #0x18]
00c2ce48	blr x8
00c2ce4c	cbz x0,0x00c2d034
00c2ce50	and x9,x20,#0x1
00c2ce54	ldrb w10,[x19, #0x269]
00c2ce58	ldr x8,[x19, #0x8]
00c2ce5c	sub x9,x0,x9
00c2ce60	add x11,sp,#0x70
00c2ce64	nop
00c2ce68	adr x0,0xc2f528
00c2ce6c	add x20,x9,x10
00c2ce70	add x1,sp,#0xa0
00c2ce74	stp x8,x11,[sp, #0xa0]
00c2ce78	str x20,[sp, #0xb0]
00c2ce7c	bl 0x00c44870
00c2ce80	cbz w0,0x00c2cea4
00c2ce84	ldr x8,[sp, #0x80]
00c2ce88	cbz x8,0x00c2cea4
00c2ce8c	add x2,sp,#0x70
00c2ce90	mov x0,x19
00c2ce94	mov x1,x20
00c2ce98	mov w3,wzr
00c2ce9c	bl 0x00c2f254
00c2cea0	tbnz w0,#0x0,0x00c2d03c
00c2cea4	nop
00c2cea8	adr x0,0xd280f4
00c2ceac	bl 0x00c3ed40
00c2ceb0	adrp x8,0xcca000
00c2ceb4	adrp x9,0xcca000
00c2ceb8	ldr x8,[x8, #0x6a0]
00c2cebc	ldr x9,[x9, #0x6a8]
00c2cec0	b 0x00c2cec8
00c2cec4	add x8,x8,#0x20
00c2cec8	cmp x8,x9
00c2cecc	b.cs 0x00c2cf88
00c2ced0	ldr x10,[x8, #0x8]
00c2ced4	cmp x10,x20
00c2ced8	b.hi 0x00c2cec4
00c2cedc	ldr x10,[x8, #0x10]
00c2cee0	cmp x20,x10
00c2cee4	b.cs 0x00c2cec4
00c2cee8	ldr x21,[x8, #0x18]
00c2ceec	nop
00c2cef0	adr x0,0xd280f4
00c2cef4	bl 0x00c3ed50
00c2cef8	cbz x21,0x00c2cf94
00c2cefc	ldr x0,[x19, #0x8]
00c2cf00	add x2,sp,#0x40
00c2cf04	add x3,sp,#0x8
00c2cf08	mov x1,x21
00c2cf0c	mov w4,wzr
00c2cf10	bl 0x00c2c5cc
00c2cf14	cbnz x0,0x00c2cf94
00c2cf18	add x0,sp,#0xa0
00c2cf1c	mov w1,wzr
00c2cf20	mov w2,#0x620
00c2cf24	bl 0x00c301c0
00c2cf28	ldr x0,[x19, #0x8]
00c2cf2c	add x1,sp,#0x40
00c2cf30	add x2,sp,#0x8
00c2cf34	add x5,sp,#0xa0
00c2cf38	mov x3,x20
00c2cf3c	mov w4,#0x4
00c2cf40	bl 0x00c2d520
00c2cf44	tbz w0,#0x0,0x00c2cf94
00c2cf48	ldr x8,[sp, #0x68]
00c2cf4c	ldr x9,[sp, #0x28]
00c2cf50	ldur q0,[sp, #0x58]
00c2cf54	str xzr,[x19, #0x248]
00c2cf58	str x8,[x19, #0x230]
00c2cf5c	ldr w8,[sp, #0xb0]
00c2cf60	str x9,[x19, #0x238]
00c2cf64	mov w9,#0x3000000
00c2cf68	str x8,[x19, #0x240]
00c2cf6c	str w9,[x19, #0x250]
00c2cf70	ldp x8,x9,[sp, #0x40]
00c2cf74	str q0,[x19, #0x220]
00c2cf78	str xzr,[x19, #0x260]
00c2cf7c	str x8,[x19, #0x258]
00c2cf80	str w9,[x19, #0x254]
00c2cf84	b 0x00c2d03c
00c2cf88	nop
00c2cf8c	adr x0,0xd280f4
00c2cf90	bl 0x00c3ed50
00c2cf94	ldr x8,[x19]
00c2cf98	mov x0,x19
00c2cf9c	mov w1,#0xffffffff
00c2cfa0	ldr x8,[x8, #0x18]
00c2cfa4	blr x8
00c2cfa8	cbz x0,0x00c2d034
00c2cfac	mov x20,x0
00c2cfb0	bl 0x00c30710
00c2cfb4	mov x21,x0
00c2cfb8	ldr w22,[x0]
00c2cfbc	mov w0,#0x87
00c2cfc0	mov w1,#0xffffffff
00c2cfc4	mov x2,x20
00c2cfc8	mov x3,xzr
00c2cfcc	mov w4,#0x8
00c2cfd0	bl 0x00c30bb0
00c2cfd4	ldr w8,[x21]
00c2cfd8	str w22,[x21]
00c2cfdc	cmp w8,#0xe
00c2cfe0	b.eq 0x00c2d034
00c2cfe4	ldr w8,[x20]
00c2cfe8	mov w9,#0x1168
00c2cfec	movk w9,#0xd280, LSL #16
00c2cff0	cmp w8,w9
00c2cff4	b.ne 0x00c2d034
00c2cff8	ldr w8,[x20, #0x4]
00c2cffc	mov w9,#0x1
00c2d000	movk w9,#0xd400, LSL #16
00c2d004	cmp w8,w9
00c2d008	b.ne 0x00c2d034
00c2d00c	movi v0.2D,#0x0
00c2d010	add x8,x20,#0x4
00c2d014	str xzr,[x19, #0x260]
00c2d018	str x8,[x19, #0x228]
00c2d01c	mov w8,#0x1
00c2d020	str x20,[x19, #0x220]
00c2d024	strb w8,[x19, #0x26a]
00c2d028	stp q0,q0,[x19, #0x240]
00c2d02c	str q0,[x19, #0x230]
00c2d030	b 0x00c2d03c
00c2d034	mov w8,#0x1
00c2d038	strb w8,[x19, #0x268]
00c2d03c	add sp,sp,#0x6c0
00c2d040	ldp x20,x19,[sp, #0x30]
00c2d044	ldr x28,[sp, #0x10]
00c2d048	ldp x22,x21,[sp, #0x20]
00c2d04c	ldp x29,x30,[sp], #0x40
00c2d050	autiasp
00c2d054	ret
