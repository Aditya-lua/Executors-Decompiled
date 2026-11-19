; FUN_00b50c5c @ 00b50c5c
00b50c5c	sub sp,sp,#0x30
00b50c60	stp x20,x19,[sp, #0x10]
00b50c64	stp x29,x30,[sp, #0x20]
00b50c68	add x29,sp,#0x20
00b50c6c	cbz x1,0x00b50d40
00b50c70	mov x20,x1
00b50c74	adrp x1,0x2bd000
00b50c78	mov x19,x0
00b50c7c	add x1,x1,#0xb5e
00b50c80	mov x0,x20
00b50c84	bl 0x00c36530
00b50c88	cbz x0,0x00b50cdc
00b50c8c	add x8,x19,#0x11
00b50c90	str x8,[sp, #0x8]
00b50c94	ldr x8,[x0, #0x18]
00b50c98	ldr x9,[x19, #0x58]
00b50c9c	cmp x8,x9
00b50ca0	b.ne 0x00b50d78
00b50ca4	add x1,sp,#0x8
00b50ca8	mov w2,#0x39
00b50cac	mov x3,xzr
00b50cb0	bl 0x00c3ace0
00b50cb4	cbz w0,0x00b50d78
00b50cb8	ldp x0,x1,[x19, #0x50]
00b50cbc	adrp x2,0x2a6000
00b50cc0	add x2,x2,#0xc95
00b50cc4	mov w3,#0x19b
00b50cc8	bl 0x00c345e0
00b50ccc	ldrb w8,[x19, #0x10]
00b50cd0	str xzr,[x19, #0x50]
00b50cd4	orr w8,w8,#0x1
00b50cd8	strb w8,[x19, #0x10]
00b50cdc	adrp x1,0x2d3000
00b50ce0	add x1,x1,#0x7c2
00b50ce4	mov x0,x20
00b50ce8	bl 0x00c36530
00b50cec	cbz x0,0x00b50d40
00b50cf0	ldr w9,[x0, #0x8]
00b50cf4	mov x8,x0
00b50cf8	mov w0,wzr
00b50cfc	cmp w9,#0x4
00b50d00	b.ne 0x00b50d7c
00b50d04	ldr x0,[x19, #0x8]
00b50d08	ldr x20,[x8, #0x10]
00b50d0c	adrp x1,0x2a6000
00b50d10	add x1,x1,#0xc95
00b50d14	mov w2,#0x17f
00b50d18	bl 0x00c32310
00b50d1c	str xzr,[x19, #0x8]
00b50d20	cbz x20,0x00b50d40
00b50d24	adrp x1,0x2a6000
00b50d28	add x1,x1,#0xc95
00b50d2c	mov w2,#0x182
00b50d30	mov x0,x20
00b50d34	bl 0x00c34600
00b50d38	str x0,[x19, #0x8]
00b50d3c	cbz x0,0x00b50d48
00b50d40	mov w0,#0x1
00b50d44	b 0x00b50d7c
00b50d48	bl 0x00c342a0
00b50d4c	adrp x0,0x2a6000
00b50d50	adrp x2,0x2b8000
00b50d54	add x0,x0,#0xc95
00b50d58	add x2,x2,#0xac1
00b50d5c	mov w1,#0x184
00b50d60	bl 0x00c342b0
00b50d64	mov w1,#0x100
00b50d68	mov w0,#0x39
00b50d6c	movk w1,#0xc, LSL #16
00b50d70	mov x2,xzr
00b50d74	bl 0x00c342c0
00b50d78	mov w0,wzr
00b50d7c	ldp x29,x30,[sp, #0x20]
00b50d80	ldp x20,x19,[sp, #0x10]
00b50d84	add sp,sp,#0x30
00b50d88	ret
