; FUN_00b2ce34 @ 00b2ce34
00b2ce34	sub sp,sp,#0xa0
00b2ce38	stp x28,x27,[sp, #0x40]
00b2ce3c	stp x26,x25,[sp, #0x50]
00b2ce40	stp x24,x23,[sp, #0x60]
00b2ce44	stp x22,x21,[sp, #0x70]
00b2ce48	stp x20,x19,[sp, #0x80]
00b2ce4c	stp x29,x30,[sp, #0x90]
00b2ce50	ldr w8,[x0, #0xa0]
00b2ce54	mov x20,x3
00b2ce58	mov x23,x2
00b2ce5c	mov x19,x0
00b2ce60	lsr x9,x3,#0x1e
00b2ce64	add x29,sp,#0x90
00b2ce68	str w8,[sp, #0x3c]
00b2ce6c	cbz x9,0x00b2cf0c
00b2ce70	orr x22,xzr,#-0x40000000
00b2ce74	add x8,x20,x22
00b2ce78	str x8,[sp, #0x20]
00b2ce7c	and x8,x8,#-0x40000000
00b2ce80	mov w21,#0x40000000
00b2ce84	str x8,[sp, #0x18]
00b2ce88	add x8,x8,x21
00b2ce8c	add x24,x19,#0xc0
00b2ce90	add x25,x19,#0x140
00b2ce94	add x26,x19,#0x1c0
00b2ce98	add x27,x19,#0x20
00b2ce9c	str x8,[sp, #0x10]
00b2cea0	add x8,x23,x8
00b2cea4	mov x28,x1
00b2cea8	stp x8,x1,[sp, #0x28]
00b2ceac	ldrb w8,[x19, #0x6c]
00b2ceb0	mov w2,#0x40000000
00b2ceb4	add x7,sp,#0x3c
00b2ceb8	mov x0,x23
00b2cebc	ubfx w8,w8,#0x1,#0x1
00b2cec0	mov x1,x28
00b2cec4	mov x3,x24
00b2cec8	mov x4,x25
00b2cecc	mov x5,x26
00b2ced0	mov x6,x27
00b2ced4	str w8,[sp]
00b2ced8	bl 0x00c399a0
00b2cedc	add x20,x20,x22
00b2cee0	add x23,x23,x21
00b2cee4	lsr x8,x20,#0x1e
00b2cee8	add x28,x28,x21
00b2ceec	cbnz x8,0x00b2ceac
00b2cef0	ldp x9,x8,[sp, #0x18]
00b2cef4	ldp x0,x1,[sp, #0x28]
00b2cef8	sub x20,x8,x9
00b2cefc	ldr x8,[sp, #0x10]
00b2cf00	add x1,x1,x8
00b2cf04	cbnz x20,0x00b2cf14
00b2cf08	b 0x00b2cf3c
00b2cf0c	mov x0,x23
00b2cf10	cbz x20,0x00b2cf3c
00b2cf14	ldrb w8,[x19, #0x6c]
00b2cf18	add x3,x19,#0xc0
00b2cf1c	add x4,x19,#0x140
00b2cf20	add x5,x19,#0x1c0
00b2cf24	add x6,x19,#0x20
00b2cf28	ubfx w8,w8,#0x1,#0x1
00b2cf2c	add x7,sp,#0x3c
00b2cf30	mov x2,x20
00b2cf34	str w8,[sp]
00b2cf38	bl 0x00c399a0
00b2cf3c	ldr w8,[sp, #0x3c]
00b2cf40	mov w0,#0x1
00b2cf44	str w8,[x19, #0xa0]
00b2cf48	ldp x29,x30,[sp, #0x90]
00b2cf4c	ldp x20,x19,[sp, #0x80]
00b2cf50	ldp x22,x21,[sp, #0x70]
00b2cf54	ldp x24,x23,[sp, #0x60]
00b2cf58	ldp x26,x25,[sp, #0x50]
00b2cf5c	ldp x28,x27,[sp, #0x40]
00b2cf60	add sp,sp,#0xa0
00b2cf64	ret
