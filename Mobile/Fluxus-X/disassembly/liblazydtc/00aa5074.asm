; OSSL_SELF_TEST_get_callback @ 00aa5074
00aa5074	stp x20,x19,[sp, #-0x20]!
00aa5078	mov x19,x2
00aa507c	adrp x2,0xc6d000
00aa5080	mov x20,x1
00aa5084	add x2,x2,#0x920
00aa5088	orr w1,wzr,#0xc
00aa508c	stp x29,x30,[sp, #0x10]
00aa5090	add x29,sp,#0x10
00aa5094	bl 0x00c3b520
00aa5098	cbz x20,0x00aa50b0
00aa509c	cbz x0,0x00aa50a8
00aa50a0	ldr x8,[x0]
00aa50a4	b 0x00aa50ac
00aa50a8	mov x8,xzr
00aa50ac	str x8,[x20]
00aa50b0	cbz x19,0x00aa50c8
00aa50b4	cbz x0,0x00aa50c0
00aa50b8	ldr x8,[x0, #0x8]
00aa50bc	b 0x00aa50c4
00aa50c0	mov x8,xzr
00aa50c4	str x8,[x19]
00aa50c8	ldp x29,x30,[sp, #0x10]
00aa50cc	ldp x20,x19,[sp], #0x20
00aa50d0	ret
