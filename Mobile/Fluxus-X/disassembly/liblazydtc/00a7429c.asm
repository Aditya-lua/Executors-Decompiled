; EVP_PKEY_pairwise_check @ 00a7429c
00a7429c	stp x20,x19,[sp, #-0x20]!
00a742a0	stp x29,x30,[sp, #0x10]
00a742a4	ldr x19,[x0, #0x88]
00a742a8	add x29,sp,#0x10
00a742ac	cbz x19,0x00a742ec
00a742b0	orr w1,wzr,#0x3
00a742b4	mov w2,wzr
00a742b8	mov x20,x0
00a742bc	bl 0x00a741fc
00a742c0	cmn w0,#0x1
00a742c4	b.ne 0x00a74360
00a742c8	ldr w8,[x19]
00a742cc	cbz w8,0x00a74330
00a742d0	ldr x8,[x20, #0x78]
00a742d4	ldr x1,[x8, #0xe0]
00a742d8	cbz x1,0x00a74320
00a742dc	ldp x29,x30,[sp, #0x10]
00a742e0	mov x0,x19
00a742e4	ldp x20,x19,[sp], #0x20
00a742e8	br x1
00a742ec	bl 0x00c342a0
00a742f0	adrp x0,0x2a6000
00a742f4	adrp x2,0x2c7000
00a742f8	add x0,x0,#0x4f
00a742fc	add x2,x2,#0xa3c
00a74300	mov w1,#0xa6
00a74304	bl 0x00c342b0
00a74308	orr w0,wzr,#0x6
00a7430c	mov w1,#0x9a
00a74310	mov x2,xzr
00a74314	bl 0x00c342c0
00a74318	mov w0,wzr
00a7431c	b 0x00a74360
00a74320	ldr x8,[x19, #0x8]
00a74324	cbz x8,0x00a74330
00a74328	ldr x1,[x8, #0xe0]
00a7432c	cbnz x1,0x00a742dc
00a74330	bl 0x00c342a0
00a74334	adrp x0,0x2a6000
00a74338	adrp x2,0x2c7000
00a7433c	add x0,x0,#0x4f
00a74340	add x2,x2,#0xa3c
00a74344	mov w1,#0xbe
00a74348	bl 0x00c342b0
00a7434c	orr w0,wzr,#0x6
00a74350	mov w1,#0x96
00a74354	mov x2,xzr
00a74358	bl 0x00c342c0
00a7435c	orr w0,wzr,#0xfffffffe
00a74360	ldp x29,x30,[sp, #0x10]
00a74364	ldp x20,x19,[sp], #0x20
00a74368	ret
