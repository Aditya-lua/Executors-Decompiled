; FUN_00b11c58 @ 00b11c58
00b11c58	stp x22,x21,[sp, #-0x30]!
00b11c5c	stp x20,x19,[sp, #0x10]
00b11c60	stp x29,x30,[sp, #0x20]
00b11c64	ldr x9,[x0, #0x20]
00b11c68	mov w20,w2
00b11c6c	mov x19,x0
00b11c70	mov x21,x1
00b11c74	ldr x8,[x9, #0x18]
00b11c78	add x29,sp,#0x20
00b11c7c	tbnz w8,#0x1,0x00b11cbc
00b11c80	mov x22,xzr
00b11c84	tbnz w8,#0x15,0x00b11d50
00b11c88	cbz w20,0x00b11c90
00b11c8c	str x21,[x19, #0xc8]
00b11c90	mov x0,x21
00b11c94	bl 0x00c40d60
00b11c98	mov x1,x22
00b11c9c	bl 0x00b0ea2c
00b11ca0	cbz w0,0x00b11cc8
00b11ca4	cmp w0,#0x1
00b11ca8	b.lt 0x00b11ce8
00b11cac	cbz w20,0x00b11d58
00b11cb0	ldr x8,[x19, #0x38]
00b11cb4	mov w9,#0xb
00b11cb8	b 0x00b11cd4
00b11cbc	add x22,x9,#0x8
00b11cc0	cbnz w20,0x00b11c8c
00b11cc4	b 0x00b11c90
00b11cc8	cbz w20,0x00b11d58
00b11ccc	ldr x8,[x19, #0x38]
00b11cd0	orr w9,wzr,#0xf
00b11cd4	mov w0,wzr
00b11cd8	mov x1,x19
00b11cdc	str w9,[x19, #0xb0]
00b11ce0	blr x8
00b11ce4	cbz w0,0x00b11d5c
00b11ce8	mov x0,x21
00b11cec	bl 0x00c40d70
00b11cf0	cbz x0,0x00b11d24
00b11cf4	mov x0,x21
00b11cf8	bl 0x00c40d70
00b11cfc	mov x1,x22
00b11d00	bl 0x00b0ea2c
00b11d04	cbz w0,0x00b11d2c
00b11d08	tbz w0,#0x1f,0x00b11d24
00b11d0c	ldrb w8,[x19, #0xd0]
00b11d10	tbnz w8,#0x1,0x00b11d24
00b11d14	cbz w20,0x00b11d58
00b11d18	ldr x8,[x19, #0x38]
00b11d1c	orr w9,wzr,#0xc
00b11d20	b 0x00b11d38
00b11d24	cbnz w20,0x00b11d4c
00b11d28	b 0x00b11d50
00b11d2c	cbz w20,0x00b11d58
00b11d30	ldr x8,[x19, #0x38]
00b11d34	mov w9,#0x10
00b11d38	mov w0,wzr
00b11d3c	mov x1,x19
00b11d40	str w9,[x19, #0xb0]
00b11d44	blr x8
00b11d48	cbz w0,0x00b11d5c
00b11d4c	str xzr,[x19, #0xc8]
00b11d50	mov w0,#0x1
00b11d54	b 0x00b11d5c
00b11d58	mov w0,wzr
00b11d5c	ldp x29,x30,[sp, #0x20]
00b11d60	ldp x20,x19,[sp, #0x10]
00b11d64	ldp x22,x21,[sp], #0x30
00b11d68	ret
