; EVP_PKEY_print_params_fp @ 00a6e584
00a6e584	stp x22,x21,[sp, #-0x30]!
00a6e588	mov x21,x1
00a6e58c	mov w1,wzr
00a6e590	stp x20,x19,[sp, #0x10]
00a6e594	stp x29,x30,[sp, #0x20]
00a6e598	add x29,sp,#0x20
00a6e59c	mov x19,x3
00a6e5a0	mov w20,w2
00a6e5a4	bl 0x00c37810
00a6e5a8	cbz x0,0x00a6e5ec
00a6e5ac	ldr x8,[x21, #0x8]
00a6e5b0	mov x22,x0
00a6e5b4	cbz x8,0x00a6e5c0
00a6e5b8	ldr x4,[x8, #0x98]
00a6e5bc	b 0x00a6e5c4
00a6e5c0	mov x4,xzr
00a6e5c4	mov w3,#0x84
00a6e5c8	mov x0,x21
00a6e5cc	mov x1,x22
00a6e5d0	mov w2,w20
00a6e5d4	mov x5,x19
00a6e5d8	bl 0x00a6e250
00a6e5dc	mov w19,w0
00a6e5e0	mov x0,x22
00a6e5e4	bl 0x00c31a40
00a6e5e8	mov w0,w19
00a6e5ec	ldp x29,x30,[sp, #0x20]
00a6e5f0	ldp x20,x19,[sp, #0x10]
00a6e5f4	ldp x22,x21,[sp], #0x30
00a6e5f8	ret
