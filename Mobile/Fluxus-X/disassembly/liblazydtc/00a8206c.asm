; ossl_algorithm_get1_first_name @ 00a8206c
00a8206c	str x19,[sp, #-0x20]!
00a82070	stp x29,x30,[sp, #0x10]
00a82074	ldr x19,[x0]
00a82078	add x29,sp,#0x10
00a8207c	cbz x19,0x00a820ec
00a82080	mov w1,#0x3a
00a82084	mov x0,x19
00a82088	bl 0x00c30890
00a8208c	cbz x0,0x00a82098
00a82090	sub x1,x0,x19
00a82094	b 0x00a820a4
00a82098	mov x0,x19
00a8209c	bl 0x00c2ff50
00a820a0	mov x1,x0
00a820a4	adrp x2,0x29e000
00a820a8	add x2,x2,#0x24f
00a820ac	mov w3,#0xc3
00a820b0	mov x0,x19
00a820b4	bl 0x00c36180
00a820b8	cbnz x0,0x00a820f0
00a820bc	bl 0x00c342a0
00a820c0	adrp x0,0x29e000
00a820c4	adrp x2,0x2ad000
00a820c8	add x0,x0,#0x24f
00a820cc	add x2,x2,#0xd10
00a820d0	mov w1,#0xc5
00a820d4	bl 0x00c342b0
00a820d8	mov w1,#0x100
00a820dc	orr w0,wzr,#0x6
00a820e0	movk w1,#0xc, LSL #16
00a820e4	mov x2,xzr
00a820e8	bl 0x00c342c0
00a820ec	mov x0,xzr
00a820f0	ldp x29,x30,[sp, #0x10]
00a820f4	ldr x19,[sp], #0x20
00a820f8	ret
