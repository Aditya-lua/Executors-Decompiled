; EC_POINT_is_at_infinity @ 00a31a54
00a31a54	stp x29,x30,[sp, #-0x10]!
00a31a58	ldr x8,[x0]
00a31a5c	mov x29,sp
00a31a60	ldr x2,[x8, #0xb8]
00a31a64	cbz x2,0x00a31a9c
00a31a68	ldr x9,[x1]
00a31a6c	cmp x8,x9
00a31a70	b.eq 0x00a31ad8
00a31a74	bl 0x00c342a0
00a31a78	adrp x0,0x29e000
00a31a7c	adrp x2,0x2cb000
00a31a80	add x0,x0,#0xa7
00a31a84	add x2,x2,#0x862
00a31a88	mov w1,#0x3da
00a31a8c	bl 0x00c342b0
00a31a90	mov w0,#0x10
00a31a94	mov w1,#0x65
00a31a98	b 0x00a31ac4
00a31a9c	bl 0x00c342a0
00a31aa0	adrp x0,0x29e000
00a31aa4	adrp x2,0x2cb000
00a31aa8	add x0,x0,#0xa7
00a31aac	add x2,x2,#0x862
00a31ab0	mov w1,#0x3d6
00a31ab4	bl 0x00c342b0
00a31ab8	mov w1,#0x101
00a31abc	mov w0,#0x10
00a31ac0	movk w1,#0xc, LSL #16
00a31ac4	mov x2,xzr
00a31ac8	bl 0x00c342c0
00a31acc	mov w0,wzr
00a31ad0	ldp x29,x30,[sp], #0x10
00a31ad4	ret
00a31ad8	ldr w8,[x0, #0x20]
00a31adc	cbz w8,0x00a31af0
00a31ae0	ldr w9,[x1, #0x8]
00a31ae4	cbz w9,0x00a31af0
00a31ae8	cmp w8,w9
00a31aec	b.ne 0x00a31a74
00a31af0	ldp x29,x30,[sp], #0x10
00a31af4	br x2
