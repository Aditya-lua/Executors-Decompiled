; DH_check_params_ex @ 00a19a1c
00a19a1c	str x19,[sp, #-0x20]!
00a19a20	stp x29,x30,[sp, #0x10]
00a19a24	add x29,sp,#0x10
00a19a28	sub x1,x29,#0x4
00a19a2c	stur wzr,[x29, #-0x4]
00a19a30	bl 0x00a19b20
00a19a34	cbz w0,0x00a19a80
00a19a38	ldur w19,[x29, #-0x4]
00a19a3c	tbnz w19,#0x0,0x00a19a8c
00a19a40	tbnz w19,#0x3,0x00a19abc
00a19a44	tbnz w19,#0x7,0x00a19aec
00a19a48	tbz w19,#0x8,0x00a19a78
00a19a4c	bl 0x00c342a0
00a19a50	adrp x0,0x2d9000
00a19a54	adrp x2,0x2aa000
00a19a58	add x0,x0,#0xa63
00a19a5c	add x2,x2,#0x2f
00a19a60	mov w1,#0x2a
00a19a64	bl 0x00c342b0
00a19a68	mov w0,#0x5
00a19a6c	mov w1,#0x67
00a19a70	mov x2,xzr
00a19a74	bl 0x00c342c0
00a19a78	cmp w19,#0x0
00a19a7c	cset w0,eq
00a19a80	ldp x29,x30,[sp, #0x10]
00a19a84	ldr x19,[sp], #0x20
00a19a88	ret
00a19a8c	bl 0x00c342a0
00a19a90	adrp x0,0x2d9000
00a19a94	adrp x2,0x2aa000
00a19a98	add x0,x0,#0xa63
00a19a9c	add x2,x2,#0x2f
00a19aa0	mov w1,#0x24
00a19aa4	bl 0x00c342b0
00a19aa8	mov w0,#0x5
00a19aac	mov w1,#0x75
00a19ab0	mov x2,xzr
00a19ab4	bl 0x00c342c0
00a19ab8	tbz w19,#0x3,0x00a19a44
00a19abc	bl 0x00c342a0
00a19ac0	adrp x0,0x2d9000
00a19ac4	adrp x2,0x2aa000
00a19ac8	add x0,x0,#0xa63
00a19acc	add x2,x2,#0x2f
00a19ad0	mov w1,#0x26
00a19ad4	bl 0x00c342b0
00a19ad8	mov w0,#0x5
00a19adc	orr w1,wzr,#0x78
00a19ae0	mov x2,xzr
00a19ae4	bl 0x00c342c0
00a19ae8	tbz w19,#0x7,0x00a19a48
00a19aec	bl 0x00c342a0
00a19af0	adrp x0,0x2d9000
00a19af4	adrp x2,0x2aa000
00a19af8	add x0,x0,#0xa63
00a19afc	add x2,x2,#0x2f
00a19b00	mov w1,#0x28
00a19b04	bl 0x00c342b0
00a19b08	mov w0,#0x5
00a19b0c	orr w1,wzr,#0x7e
00a19b10	mov x2,xzr
00a19b14	bl 0x00c342c0
00a19b18	tbnz w19,#0x8,0x00a19a4c
00a19b1c	b 0x00a19a78
