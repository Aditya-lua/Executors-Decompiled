; ossl_rsa_oaeppss_md2nid @ 00ad9230
00ad9230	str x19,[sp, #-0x20]!
00ad9234	stp x29,x30,[sp, #0x10]
00ad9238	add x29,sp,#0x10
00ad923c	cbz x0,0x00ad930c
00ad9240	adrp x1,0x2d1000
00ad9244	add x1,x1,#0x42e
00ad9248	mov x19,x0
00ad924c	bl 0x00c34610
00ad9250	mov x8,xzr
00ad9254	cbnz w0,0x00ad92fc
00ad9258	adrp x1,0x2a0000
00ad925c	add x1,x1,#0xbe3
00ad9260	mov x0,x19
00ad9264	bl 0x00c34610
00ad9268	cbz w0,0x00ad9274
00ad926c	mov w8,#0x1
00ad9270	b 0x00ad92fc
00ad9274	adrp x1,0x2a9000
00ad9278	add x1,x1,#0xb18
00ad927c	mov x0,x19
00ad9280	bl 0x00c34610
00ad9284	cbz w0,0x00ad9290
00ad9288	mov w8,#0x2
00ad928c	b 0x00ad92fc
00ad9290	adrp x1,0x2b2000
00ad9294	add x1,x1,#0xb64
00ad9298	mov x0,x19
00ad929c	bl 0x00c34610
00ad92a0	cbz w0,0x00ad92ac
00ad92a4	orr w8,wzr,#0x3
00ad92a8	b 0x00ad92fc
00ad92ac	adrp x1,0x2b6000
00ad92b0	add x1,x1,#0x439
00ad92b4	mov x0,x19
00ad92b8	bl 0x00c34610
00ad92bc	cbz w0,0x00ad92c8
00ad92c0	mov w8,#0x4
00ad92c4	b 0x00ad92fc
00ad92c8	adrp x1,0x2b0000
00ad92cc	add x1,x1,#0x88f
00ad92d0	mov x0,x19
00ad92d4	bl 0x00c34610
00ad92d8	cbz w0,0x00ad92e4
00ad92dc	mov w8,#0x5
00ad92e0	b 0x00ad92fc
00ad92e4	adrp x1,0x29e000
00ad92e8	add x1,x1,#0xa05
00ad92ec	mov x0,x19
00ad92f0	bl 0x00c34610
00ad92f4	cbz w0,0x00ad930c
00ad92f8	orr w8,wzr,#0x6
00ad92fc	adrp x9,0xc7d000
00ad9300	lsl x8,x8,#0x4
00ad9304	add x9,x9,#0xa88
00ad9308	ldr w0,[x9, x8#0x0]
00ad930c	ldp x29,x30,[sp, #0x10]
00ad9310	ldr x19,[sp], #0x20
00ad9314	ret
