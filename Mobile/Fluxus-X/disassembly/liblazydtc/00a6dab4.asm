; EVP_PKEY_get1_DSA @ 00a6dab4
00a6dab4	str x19,[sp, #-0x20]!
00a6dab8	stp x29,x30,[sp, #0x10]
00a6dabc	ldr w8,[x0]
00a6dac0	add x29,sp,#0x10
00a6dac4	cmp w8,#0x74
00a6dac8	b.ne 0x00a6dae4
00a6dacc	bl 0x00a6d87c
00a6dad0	mov x19,x0
00a6dad4	cbz x0,0x00a6db14
00a6dad8	mov x0,x19
00a6dadc	bl 0x00c3a2f0
00a6dae0	b 0x00a6db14
00a6dae4	bl 0x00c342a0
00a6dae8	adrp x0,0x2c1000
00a6daec	adrp x2,0x2cd000
00a6daf0	add x0,x0,#0xcf9
00a6daf4	add x2,x2,#0xb13
00a6daf8	mov w1,#0x351
00a6dafc	bl 0x00c342b0
00a6db00	orr w0,wzr,#0x6
00a6db04	mov w1,#0x81
00a6db08	mov x2,xzr
00a6db0c	bl 0x00c342c0
00a6db10	mov x19,xzr
00a6db14	ldp x29,x30,[sp, #0x10]
00a6db18	mov x0,x19
00a6db1c	ldr x19,[sp], #0x20
00a6db20	ret
