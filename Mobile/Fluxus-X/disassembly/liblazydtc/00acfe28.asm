; ossl_rsa_key_from_pkcs8 @ 00acfe28
00acfe28	sub sp,sp,#0x30
00acfe2c	stp x29,x30,[sp, #0x20]
00acfe30	add x29,sp,#0x20
00acfe34	mov x4,x0
00acfe38	sub x1,x29,#0x8
00acfe3c	add x2,sp,#0xc
00acfe40	mov x3,sp
00acfe44	mov x0,xzr
00acfe48	str x19,[sp, #0x10]
00acfe4c	bl 0x00c37eb0
00acfe50	cbz w0,0x00acfeb0
00acfe54	ldrsw x2,[sp, #0xc]
00acfe58	sub x1,x29,#0x8
00acfe5c	mov x0,xzr
00acfe60	bl 0x00c3fad0
00acfe64	mov x19,x0
00acfe68	cbz x0,0x00acfeb8
00acfe6c	ldr x1,[sp]
00acfe70	mov x0,x19
00acfe74	bl 0x00acfc74
00acfe78	cbz w0,0x00acfeec
00acfe7c	orr w1,wzr,#0xf000
00acfe80	mov x0,x19
00acfe84	bl 0x00c3fa80
00acfe88	ldr x8,[sp]
00acfe8c	ldr x0,[x8]
00acfe90	bl 0x00c37750
00acfe94	cmp w0,#0x390
00acfe98	b.eq 0x00acfefc
00acfe9c	cmp w0,#0x6
00acfea0	b.ne 0x00acff08
00acfea4	mov x0,x19
00acfea8	mov w1,wzr
00acfeac	b 0x00acff04
00acfeb0	mov x19,xzr
00acfeb4	b 0x00acff08
00acfeb8	bl 0x00c342a0
00acfebc	adrp x0,0x2c4000
00acfec0	adrp x2,0x2d4000
00acfec4	add x0,x0,#0x1a6
00acfec8	add x2,x2,#0x3fd
00acfecc	mov w1,#0x230
00acfed0	bl 0x00c342b0
00acfed4	mov w1,#0x4
00acfed8	mov w0,#0x4
00acfedc	movk w1,#0x8, LSL #16
00acfee0	mov x2,xzr
00acfee4	bl 0x00c342c0
00acfee8	b 0x00acff08
00acfeec	mov x0,x19
00acfef0	bl 0x00c326d0
00acfef4	mov x19,xzr
00acfef8	b 0x00acff08
00acfefc	mov w1,#0x1000
00acff00	mov x0,x19
00acff04	bl 0x00c3faa0
00acff08	mov x0,x19
00acff0c	ldp x29,x30,[sp, #0x20]
00acff10	ldr x19,[sp, #0x10]
00acff14	add sp,sp,#0x30
00acff18	ret
