; ossl_provider_free_parent @ 00aa1dc8
00aa1dc8	str x21,[sp, #-0x30]!
00aa1dcc	stp x20,x19,[sp, #0x10]
00aa1dd0	stp x29,x30,[sp, #0x20]
00aa1dd4	add x29,sp,#0x20
00aa1dd8	mov w19,w1
00aa1ddc	mov x20,x0
00aa1de0	bl 0x00c3b2f0
00aa1de4	adrp x2,0xc6d000
00aa1de8	add x2,x2,#0x498
00aa1dec	mov w1,#0x12
00aa1df0	bl 0x00c3b520
00aa1df4	cbz x0,0x00aa1e3c
00aa1df8	mov x21,x0
00aa1dfc	mov x0,x20
00aa1e00	bl 0x00c3eb60
00aa1e04	ldr x8,[x21]
00aa1e08	cmp x0,x8
00aa1e0c	b.eq 0x00aa1e38
00aa1e10	ldr x0,[x21, #0x50]
00aa1e14	str x0,[sp, #0x8]
00aa1e18	mov x0,x20
00aa1e1c	bl 0x00c3eb60
00aa1e20	mov w1,w19
00aa1e24	ldr x2,[sp, #0x8]
00aa1e28	ldp x29,x30,[sp, #0x20]
00aa1e2c	ldp x20,x19,[sp, #0x10]
00aa1e30	ldr x21,[sp], #0x30
00aa1e34	br x2
00aa1e38	mov w0,#0x1
00aa1e3c	ldp x29,x30,[sp, #0x20]
00aa1e40	ldp x20,x19,[sp, #0x10]
00aa1e44	ldr x21,[sp], #0x30
00aa1e48	ret
