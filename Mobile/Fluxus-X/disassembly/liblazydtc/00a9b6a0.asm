; OPENSSL_strlcat @ 00a9b6a0
00a9b6a0	stp x20,x19,[sp, #-0x20]!
00a9b6a4	stp x29,x30,[sp, #0x10]
00a9b6a8	add x29,sp,#0x10
00a9b6ac	cbz x2,0x00a9b6d8
00a9b6b0	mov x8,xzr
00a9b6b4	ldrb w9,[x0]
00a9b6b8	cbz w9,0x00a9b6e4
00a9b6bc	sub x8,x8,#0x1
00a9b6c0	cmn x2,x8
00a9b6c4	add x0,x0,#0x1
00a9b6c8	b.ne 0x00a9b6b4
00a9b6cc	mov x20,xzr
00a9b6d0	neg x19,x8
00a9b6d4	b 0x00a9b734
00a9b6d8	mov x19,xzr
00a9b6dc	mov x20,xzr
00a9b6e0	b 0x00a9b734
00a9b6e4	add x9,x2,x8
00a9b6e8	cmp x9,#0x2
00a9b6ec	neg x19,x8
00a9b6f0	mov x20,xzr
00a9b6f4	b.cc 0x00a9b730
00a9b6f8	ldrb w10,[x1, x20]
00a9b6fc	cbz w10,0x00a9b728
00a9b700	sub x9,x9,#0x1
00a9b704	strb w10,[x0, x20]
00a9b708	cmp x9,#0x1
00a9b70c	add x20,x20,#0x1
00a9b710	b.hi 0x00a9b6f8
00a9b714	add x8,x2,x8
00a9b718	cmp x8,x20
00a9b71c	add x1,x1,x20
00a9b720	b.ne 0x00a9b72c
00a9b724	b 0x00a9b734
00a9b728	add x1,x1,x20
00a9b72c	add x0,x0,x20
00a9b730	strb wzr,[x0]
00a9b734	mov x0,x1
00a9b738	bl 0x00c2ff50
00a9b73c	ldp x29,x30,[sp, #0x10]
00a9b740	add x8,x20,x19
00a9b744	add x0,x8,x0
00a9b748	ldp x20,x19,[sp], #0x20
00a9b74c	ret
