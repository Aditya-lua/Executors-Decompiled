; EVP_PKEY_get0_siphash @ 00a6d9b0
00a6d9b0	str x19,[sp, #-0x20]!
00a6d9b4	stp x29,x30,[sp, #0x10]
00a6d9b8	ldr w8,[x0]
00a6d9bc	add x29,sp,#0x10
00a6d9c0	cmp w8,#0x426
00a6d9c4	b.ne 0x00a6d9e4
00a6d9c8	mov x19,x1
00a6d9cc	bl 0x00a6d87c
00a6d9d0	cbz x0,0x00a6da14
00a6d9d4	ldrsw x8,[x0]
00a6d9d8	str x8,[x19]
00a6d9dc	ldr x0,[x0, #0x8]
00a6d9e0	b 0x00a6da14
00a6d9e4	bl 0x00c342a0
00a6d9e8	adrp x0,0x2c1000
00a6d9ec	adrp x2,0x2cd000
00a6d9f0	add x0,x0,#0xcf9
00a6d9f4	add x2,x2,#0xaed
00a6d9f8	mov w1,#0x341
00a6d9fc	bl 0x00c342b0
00a6da00	orr w0,wzr,#0x6
00a6da04	mov w1,#0xaf
00a6da08	mov x2,xzr
00a6da0c	bl 0x00c342c0
00a6da10	mov x0,xzr
00a6da14	ldp x29,x30,[sp, #0x10]
00a6da18	ldr x19,[sp], #0x20
00a6da1c	ret
