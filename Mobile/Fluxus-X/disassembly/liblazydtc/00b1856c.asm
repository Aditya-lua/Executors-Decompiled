; OSSL_HTTP_REQ_CTX_nbio_d2i @ 00b1856c
00b1856c	str x21,[sp, #-0x30]!
00b18570	stp x20,x19,[sp, #0x10]
00b18574	stp x29,x30,[sp, #0x20]
00b18578	add x29,sp,#0x20
00b1857c	mov x20,x2
00b18580	mov x19,x1
00b18584	mov x21,x0
00b18588	str xzr,[x1]
00b1858c	bl 0x00b17960
00b18590	cmp w0,#0x1
00b18594	b.ne 0x00b185cc
00b18598	ldr x0,[x21, #0x58]
00b1859c	orr w1,wzr,#0x3
00b185a0	add x3,sp,#0x8
00b185a4	mov x2,xzr
00b185a8	bl 0x00c321a0
00b185ac	mov x2,x0
00b185b0	add x1,sp,#0x8
00b185b4	mov x0,xzr
00b185b8	mov x3,x20
00b185bc	bl 0x00c36150
00b185c0	cmp x0,#0x0
00b185c4	str x0,[x19]
00b185c8	cset w0,ne
00b185cc	ldp x29,x30,[sp, #0x20]
00b185d0	ldp x20,x19,[sp, #0x10]
00b185d4	ldr x21,[sp], #0x30
00b185d8	ret
