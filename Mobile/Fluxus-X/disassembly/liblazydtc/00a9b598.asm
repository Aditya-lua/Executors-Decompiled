; CRYPTO_memdup @ 00a9b598
00a9b598	str x21,[sp, #-0x30]!
00a9b59c	stp x20,x19,[sp, #0x10]
00a9b5a0	mov x19,xzr
00a9b5a4	stp x29,x30,[sp, #0x20]
00a9b5a8	add x29,sp,#0x20
00a9b5ac	cbz x0,0x00a9b620
00a9b5b0	orr w8,wzr,#0x7ffffffe
00a9b5b4	mov x20,x1
00a9b5b8	cmp x1,x8
00a9b5bc	b.hi 0x00a9b620
00a9b5c0	mov x21,x0
00a9b5c4	mov x0,x20
00a9b5c8	mov x1,x2
00a9b5cc	mov w2,w3
00a9b5d0	bl 0x00c32320
00a9b5d4	mov x19,x0
00a9b5d8	cbz x0,0x00a9b5f0
00a9b5dc	mov x0,x19
00a9b5e0	mov x1,x21
00a9b5e4	mov x2,x20
00a9b5e8	bl 0x00c2ffd0
00a9b5ec	b 0x00a9b620
00a9b5f0	bl 0x00c342a0
00a9b5f4	adrp x0,0x2c9000
00a9b5f8	adrp x2,0x2b8000
00a9b5fc	add x0,x0,#0xd7c
00a9b600	add x2,x2,#0x10
00a9b604	orr w1,wzr,#0x3c
00a9b608	bl 0x00c342b0
00a9b60c	mov w1,#0x100
00a9b610	orr w0,wzr,#0xf
00a9b614	movk w1,#0xc, LSL #16
00a9b618	mov x2,xzr
00a9b61c	bl 0x00c342c0
00a9b620	mov x0,x19
00a9b624	ldp x29,x30,[sp, #0x20]
00a9b628	ldp x20,x19,[sp, #0x10]
00a9b62c	ldr x21,[sp], #0x30
00a9b630	ret
