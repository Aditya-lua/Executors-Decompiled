; EVP_PKEY_get1_EC_KEY @ 00a6bd50
00a6bd50	str x19,[sp, #-0x20]!
00a6bd54	stp x29,x30,[sp, #0x10]
00a6bd58	add x29,sp,#0x10
00a6bd5c	mov x19,x0
00a6bd60	bl 0x00c37cd0
00a6bd64	cmp w0,#0x198
00a6bd68	b.ne 0x00a6bd8c
00a6bd6c	mov x0,x19
00a6bd70	bl 0x00c3b2e0
00a6bd74	cbz x0,0x00a6bdb8
00a6bd78	mov x19,x0
00a6bd7c	bl 0x00c3afa0
00a6bd80	cmp w0,#0x0
00a6bd84	csel x0,xzr,x19,eq
00a6bd88	b 0x00a6bdbc
00a6bd8c	bl 0x00c342a0
00a6bd90	adrp x0,0x2b2000
00a6bd94	adrp x2,0x2d1000
00a6bd98	add x0,x0,#0x267
00a6bd9c	add x2,x2,#0xa4f
00a6bda0	mov w1,#0x48
00a6bda4	bl 0x00c342b0
00a6bda8	orr w0,wzr,#0x6
00a6bdac	mov w1,#0x8e
00a6bdb0	mov x2,xzr
00a6bdb4	bl 0x00c342c0
00a6bdb8	mov x0,xzr
00a6bdbc	ldp x29,x30,[sp, #0x10]
00a6bdc0	ldr x19,[sp], #0x20
00a6bdc4	ret
