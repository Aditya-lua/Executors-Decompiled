; EC_POINT_set_to_infinity @ 00a31588
00a31588	stp x29,x30,[sp, #-0x10]!
00a3158c	ldr x8,[x0]
00a31590	mov x29,sp
00a31594	ldr x2,[x8, #0x70]
00a31598	cbz x2,0x00a315d0
00a3159c	ldr x9,[x1]
00a315a0	cmp x8,x9
00a315a4	b.eq 0x00a3160c
00a315a8	bl 0x00c342a0
00a315ac	adrp x0,0x29e000
00a315b0	adrp x2,0x2c5000
00a315b4	add x0,x0,#0xa7
00a315b8	add x2,x2,#0x93f
00a315bc	mov w1,#0x332
00a315c0	bl 0x00c342b0
00a315c4	mov w0,#0x10
00a315c8	mov w1,#0x65
00a315cc	b 0x00a315f8
00a315d0	bl 0x00c342a0
00a315d4	adrp x0,0x29e000
00a315d8	adrp x2,0x2c5000
00a315dc	add x0,x0,#0xa7
00a315e0	add x2,x2,#0x93f
00a315e4	mov w1,#0x32e
00a315e8	bl 0x00c342b0
00a315ec	mov w1,#0x101
00a315f0	mov w0,#0x10
00a315f4	movk w1,#0xc, LSL #16
00a315f8	mov x2,xzr
00a315fc	bl 0x00c342c0
00a31600	mov w0,wzr
00a31604	ldp x29,x30,[sp], #0x10
00a31608	ret
00a3160c	ldp x29,x30,[sp], #0x10
00a31610	br x2
