; CONF_load_fp @ 00a0cef0
00a0cef0	sub sp,sp,#0x60
00a0cef4	stp x22,x21,[sp, #0x30]
00a0cef8	mov x21,x0
00a0cefc	mov x0,x1
00a0cf00	mov w1,wzr
00a0cf04	stp x20,x19,[sp, #0x40]
00a0cf08	stp x29,x30,[sp, #0x50]
00a0cf0c	add x29,sp,#0x50
00a0cf10	mov x20,x2
00a0cf14	bl 0x00c37810
00a0cf18	cbz x0,0x00a0cf74
00a0cf1c	adrp x22,0xd21000
00a0cf20	mov x19,x0
00a0cf24	ldr x0,[x22, #0x950]
00a0cf28	cbnz x0,0x00a0cf34
00a0cf2c	bl 0x00c39420
00a0cf30	str x0,[x22, #0x950]
00a0cf34	ldr x8,[x0, #0x10]
00a0cf38	mov x0,sp
00a0cf3c	blr x8
00a0cf40	ldr x8,[sp]
00a0cf44	str x21,[sp, #0x10]
00a0cf48	mov x0,sp
00a0cf4c	mov x1,x19
00a0cf50	ldr x8,[x8, #0x28]
00a0cf54	mov x2,x20
00a0cf58	blr x8
00a0cf5c	ldr x8,[sp, #0x10]
00a0cf60	cmp w0,#0x0
00a0cf64	mov x0,x19
00a0cf68	csel x20,xzr,x8,eq
00a0cf6c	bl 0x00c31a40
00a0cf70	b 0x00a0cfa8
00a0cf74	bl 0x00c342a0
00a0cf78	adrp x0,0x2af000
00a0cf7c	adrp x2,0x2b9000
00a0cf80	add x0,x0,#0xd73
00a0cf84	add x2,x2,#0xb92
00a0cf88	mov w1,#0x4b
00a0cf8c	bl 0x00c342b0
00a0cf90	mov w1,#0x7
00a0cf94	orr w0,wzr,#0xe
00a0cf98	movk w1,#0x8, LSL #16
00a0cf9c	mov x2,xzr
00a0cfa0	bl 0x00c342c0
00a0cfa4	mov x20,xzr
00a0cfa8	mov x0,x20
00a0cfac	ldp x29,x30,[sp, #0x50]
00a0cfb0	ldp x20,x19,[sp, #0x40]
00a0cfb4	ldp x22,x21,[sp, #0x30]
00a0cfb8	add sp,sp,#0x60
00a0cfbc	ret
