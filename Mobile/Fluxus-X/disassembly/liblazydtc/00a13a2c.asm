; CT_POLICY_EVAL_CTX_new @ 00a13a2c
00a13a2c	str x19,[sp, #-0x20]!
00a13a30	adrp x1,0x29e000
00a13a34	add x1,x1,#0x9
00a13a38	orr w0,wzr,#0x30
00a13a3c	orr w2,wzr,#0x1f
00a13a40	stp x29,x30,[sp, #0x10]
00a13a44	add x29,sp,#0x10
00a13a48	bl 0x00c34250
00a13a4c	mov x19,x0
00a13a50	cbz x0,0x00a13a78
00a13a54	mov x0,xzr
00a13a58	str xzr,[x19, #0x20]
00a13a5c	bl 0x00c30970
00a13a60	mov w9,#0x93e0
00a13a64	mov w8,#0x3e8
00a13a68	movk w9,#0x4, LSL #16
00a13a6c	madd x8,x0,x8,x9
00a13a70	str x8,[x19, #0x18]
00a13a74	b 0x00a13aa8
00a13a78	bl 0x00c342a0
00a13a7c	adrp x0,0x29e000
00a13a80	adrp x2,0x2c1000
00a13a84	add x0,x0,#0x9
00a13a88	add x2,x2,#0xa7d
00a13a8c	mov w1,#0x22
00a13a90	bl 0x00c342b0
00a13a94	mov w1,#0x100
00a13a98	mov w0,#0x32
00a13a9c	movk w1,#0xc, LSL #16
00a13aa0	mov x2,xzr
00a13aa4	bl 0x00c342c0
00a13aa8	ldp x29,x30,[sp, #0x10]
00a13aac	mov x0,x19
00a13ab0	ldr x19,[sp], #0x20
00a13ab4	ret
