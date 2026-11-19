; evp_pkey_get0_EC_KEY_int @ 00a6bc88
00a6bc88	str x19,[sp, #-0x20]!
00a6bc8c	stp x29,x30,[sp, #0x10]
00a6bc90	add x29,sp,#0x10
00a6bc94	mov x19,x0
00a6bc98	bl 0x00c37cd0
00a6bc9c	cmp w0,#0x198
00a6bca0	b.ne 0x00a6bcb0
00a6bca4	mov x0,x19
00a6bca8	bl 0x00c3b2e0
00a6bcac	b 0x00a6bce0
00a6bcb0	bl 0x00c342a0
00a6bcb4	adrp x0,0x2b2000
00a6bcb8	adrp x2,0x2d1000
00a6bcbc	add x0,x0,#0x267
00a6bcc0	add x2,x2,#0xa4f
00a6bcc4	mov w1,#0x48
00a6bcc8	bl 0x00c342b0
00a6bccc	orr w0,wzr,#0x6
00a6bcd0	mov w1,#0x8e
00a6bcd4	mov x2,xzr
00a6bcd8	bl 0x00c342c0
00a6bcdc	mov x0,xzr
00a6bce0	ldp x29,x30,[sp, #0x10]
00a6bce4	ldr x19,[sp], #0x20
00a6bce8	ret
