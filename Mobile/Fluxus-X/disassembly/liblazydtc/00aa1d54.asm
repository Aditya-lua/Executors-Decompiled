; ossl_provider_up_ref_parent @ 00aa1d54
00aa1d54	str x21,[sp, #-0x30]!
00aa1d58	stp x20,x19,[sp, #0x10]
00aa1d5c	stp x29,x30,[sp, #0x20]
00aa1d60	add x29,sp,#0x20
00aa1d64	mov w19,w1
00aa1d68	mov x20,x0
00aa1d6c	bl 0x00c3b2f0
00aa1d70	adrp x2,0xc6d000
00aa1d74	add x2,x2,#0x498
00aa1d78	mov w1,#0x12
00aa1d7c	bl 0x00c3b520
00aa1d80	cbz x0,0x00aa1db8
00aa1d84	mov x21,x0
00aa1d88	mov x0,x20
00aa1d8c	bl 0x00c3eb60
00aa1d90	ldr x8,[x21]
00aa1d94	cmp x0,x8
00aa1d98	b.eq 0x00aa1db4
00aa1d9c	ldr x2,[x21, #0x48]
00aa1da0	mov w1,w19
00aa1da4	ldp x29,x30,[sp, #0x20]
00aa1da8	ldp x20,x19,[sp, #0x10]
00aa1dac	ldr x21,[sp], #0x30
00aa1db0	br x2
00aa1db4	mov w0,#0x1
00aa1db8	ldp x29,x30,[sp, #0x20]
00aa1dbc	ldp x20,x19,[sp, #0x10]
00aa1dc0	ldr x21,[sp], #0x30
00aa1dc4	ret
