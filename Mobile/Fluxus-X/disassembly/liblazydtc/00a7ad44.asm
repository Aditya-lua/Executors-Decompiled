; EVP_PKEY_CTX_get_ecdh_kdf_outlen @ 00a7ad44
00a7ad44	sub sp,sp,#0xb0
00a7ad48	stp x29,x30,[sp, #0xa0]
00a7ad4c	add x29,sp,#0xa0
00a7ad50	mov w8,#0xffffffff
00a7ad54	stp x20,x19,[sp, #0x90]
00a7ad58	stur x8,[x29, #-0x18]
00a7ad5c	cbz x0,0x00a7adfc
00a7ad60	ldr w8,[x0]
00a7ad64	mov x20,x0
00a7ad68	cmp w8,#0x800
00a7ad6c	b.ne 0x00a7adfc
00a7ad70	ldr x8,[x20, #0x20]
00a7ad74	mov x19,x1
00a7ad78	cbz x8,0x00a7ae3c
00a7ad7c	adrp x0,0x2c9000
00a7ad80	add x0,x0,#0x866
00a7ad84	add x8,sp,#0x8
00a7ad88	sub x1,x29,#0x18
00a7ad8c	bl 0x00c36270
00a7ad90	ldr x8,[sp, #0x28]
00a7ad94	ldur q0,[sp, #0x18]
00a7ad98	ldur q1,[sp, #0x8]
00a7ad9c	str x8,[sp, #0x50]
00a7ada0	add x8,sp,#0x8
00a7ada4	stp q1,q0,[sp, #0x30]
00a7ada8	bl 0x00c34c40
00a7adac	ldr x8,[sp, #0x28]
00a7adb0	ldur q0,[sp, #0x18]
00a7adb4	ldur q1,[sp, #0x8]
00a7adb8	add x1,sp,#0x30
00a7adbc	mov x0,x20
00a7adc0	str x8,[sp, #0x78]
00a7adc4	stur q0,[sp, #0x68]
00a7adc8	stur q1,[sp, #0x58]
00a7adcc	bl 0x00c3c110
00a7add0	cmp w0,#0x1
00a7add4	b.eq 0x00a7ae54
00a7add8	cmn w0,#0x2
00a7addc	b.ne 0x00a7ae6c
00a7ade0	bl 0x00c342a0
00a7ade4	adrp x0,0x2d9000
00a7ade8	adrp x2,0x2d3000
00a7adec	add x0,x0,#0xd63
00a7adf0	add x2,x2,#0xbb7
00a7adf4	mov w1,#0xc2
00a7adf8	b 0x00a7ae14
00a7adfc	bl 0x00c342a0
00a7ae00	adrp x0,0x2d9000
00a7ae04	adrp x2,0x2bd000
00a7ae08	add x0,x0,#0xd63
00a7ae0c	add x2,x2,#0xbcb
00a7ae10	mov w1,#0x1b
00a7ae14	bl 0x00c342b0
00a7ae18	orr w0,wzr,#0x6
00a7ae1c	mov w1,#0x93
00a7ae20	mov x2,xzr
00a7ae24	bl 0x00c342c0
00a7ae28	orr w0,wzr,#0xfffffffe
00a7ae2c	ldp x29,x30,[sp, #0xa0]
00a7ae30	ldp x20,x19,[sp, #0x90]
00a7ae34	add sp,sp,#0xb0
00a7ae38	ret
00a7ae3c	ldr x8,[x20, #0x78]
00a7ae40	cbz x8,0x00a7ad7c
00a7ae44	ldr w8,[x8]
00a7ae48	cmp w8,#0x198
00a7ae4c	b.eq 0x00a7ad7c
00a7ae50	b 0x00a7ae6c
00a7ae54	ldur x8,[x29, #-0x18]
00a7ae58	lsr x9,x8,#0x1f
00a7ae5c	cbnz x9,0x00a7ae6c
00a7ae60	mov w0,#0x1
00a7ae64	str w8,[x19]
00a7ae68	b 0x00a7ae2c
00a7ae6c	mov w0,#0xffffffff
00a7ae70	b 0x00a7ae2c
