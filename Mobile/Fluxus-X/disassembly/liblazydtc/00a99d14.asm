; CRYPTO_clear_free @ 00a99d14
00a99d14	str x21,[sp, #-0x30]!
00a99d18	stp x20,x19,[sp, #0x10]
00a99d1c	stp x29,x30,[sp, #0x20]
00a99d20	add x29,sp,#0x20
00a99d24	cbz x0,0x00a99d74
00a99d28	mov w19,w3
00a99d2c	mov x20,x2
00a99d30	mov x21,x0
00a99d34	cbz x1,0x00a99d40
00a99d38	mov x0,x21
00a99d3c	bl 0x00c34750
00a99d40	adrp x8,0xcc9000
00a99d44	ldr x3,[x8, #0x148]
00a99d48	adrp x8,0xcb4000
00a99d4c	ldr x8,[x8, #0xe60]
00a99d50	mov x0,x21
00a99d54	cmp x3,x8
00a99d58	b.eq 0x00a99d84
00a99d5c	mov x1,x20
00a99d60	mov w2,w19
00a99d64	ldp x29,x30,[sp, #0x20]
00a99d68	ldp x20,x19,[sp, #0x10]
00a99d6c	ldr x21,[sp], #0x30
00a99d70	br x3
00a99d74	ldp x29,x30,[sp, #0x20]
00a99d78	ldp x20,x19,[sp, #0x10]
00a99d7c	ldr x21,[sp], #0x30
00a99d80	ret
00a99d84	ldp x29,x30,[sp, #0x20]
00a99d88	ldp x20,x19,[sp, #0x10]
00a99d8c	ldr x21,[sp], #0x30
00a99d90	b 0x00c30960
