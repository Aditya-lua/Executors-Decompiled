; EC_KEY_generate_key @ 00a2e9c4
00a2e9c4	str x19,[sp, #-0x20]!
00a2e9c8	stp x29,x30,[sp, #0x10]
00a2e9cc	add x29,sp,#0x10
00a2e9d0	cbz x0,0x00a2ea0c
00a2e9d4	ldr x8,[x0, #0x18]
00a2e9d8	mov x19,x0
00a2e9dc	cbz x8,0x00a2ea0c
00a2e9e0	ldr x8,[x19]
00a2e9e4	ldr x8,[x8, #0x40]
00a2e9e8	cbz x8,0x00a2ea38
00a2e9ec	mov x0,x19
00a2e9f0	blr x8
00a2e9f4	cmp w0,#0x1
00a2e9f8	b.ne 0x00a2ea68
00a2e9fc	ldr x8,[x19, #0x68]
00a2ea00	add x8,x8,#0x1
00a2ea04	str x8,[x19, #0x68]
00a2ea08	b 0x00a2ea68
00a2ea0c	bl 0x00c342a0
00a2ea10	adrp x0,0x2b4000
00a2ea14	adrp x2,0x2c9000
00a2ea18	add x0,x0,#0x15e
00a2ea1c	add x2,x2,#0x71a
00a2ea20	mov w1,#0xd4
00a2ea24	bl 0x00c342b0
00a2ea28	mov w1,#0x102
00a2ea2c	mov w0,#0x10
00a2ea30	movk w1,#0xc, LSL #16
00a2ea34	b 0x00a2ea5c
00a2ea38	bl 0x00c342a0
00a2ea3c	adrp x0,0x2b4000
00a2ea40	adrp x2,0x2c9000
00a2ea44	add x0,x0,#0x15e
00a2ea48	add x2,x2,#0x71a
00a2ea4c	orr w1,wzr,#0xe0
00a2ea50	bl 0x00c342b0
00a2ea54	mov w0,#0x10
00a2ea58	mov w1,#0x98
00a2ea5c	mov x2,xzr
00a2ea60	bl 0x00c342c0
00a2ea64	mov w0,wzr
00a2ea68	ldp x29,x30,[sp, #0x10]
00a2ea6c	ldr x19,[sp], #0x20
00a2ea70	ret
