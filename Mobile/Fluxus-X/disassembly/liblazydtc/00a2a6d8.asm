; ossl_ec_GF2m_simple_invert @ 00a2a6d8
00a2a6d8	str x21,[sp, #-0x30]!
00a2a6dc	stp x20,x19,[sp, #0x10]
00a2a6e0	stp x29,x30,[sp, #0x20]
00a2a6e4	add x29,sp,#0x20
00a2a6e8	mov x20,x2
00a2a6ec	mov x19,x1
00a2a6f0	mov x21,x0
00a2a6f4	bl 0x00c3ae10
00a2a6f8	cbnz w0,0x00a2a708
00a2a6fc	ldr x0,[x19, #0x18]
00a2a700	bl 0x00c369b0
00a2a704	cbz w0,0x00a2a71c
00a2a708	mov w0,#0x1
00a2a70c	ldp x29,x30,[sp, #0x20]
00a2a710	ldp x20,x19,[sp, #0x10]
00a2a714	ldr x21,[sp], #0x30
00a2a718	ret
00a2a71c	ldr x8,[x21]
00a2a720	ldr x8,[x8, #0xd0]
00a2a724	cbz x8,0x00a2a754
00a2a728	mov x0,x21
00a2a72c	mov x1,x19
00a2a730	mov x2,x20
00a2a734	blr x8
00a2a738	cbz w0,0x00a2a70c
00a2a73c	ldp x1,x0,[x19, #0x10]
00a2a740	ldp x29,x30,[sp, #0x20]
00a2a744	ldp x20,x19,[sp, #0x10]
00a2a748	mov x2,x0
00a2a74c	ldr x21,[sp], #0x30
00a2a750	b 0x00c38b40
00a2a754	mov w0,wzr
00a2a758	b 0x00a2a70c
