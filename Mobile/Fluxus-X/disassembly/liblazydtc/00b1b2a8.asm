; X509_CRL_add0_revoked @ 00b1b2a8
00b1b2a8	stp x20,x19,[sp, #-0x20]!
00b1b2ac	stp x29,x30,[sp, #0x10]
00b1b2b0	mov x19,x0
00b1b2b4	ldr x0,[x0, #0x30]
00b1b2b8	mov x20,x1
00b1b2bc	add x29,sp,#0x10
00b1b2c0	cbnz x0,0x00b1b2d8
00b1b2c4	adrp x0,0xb1b000
00b1b2c8	add x0,x0,#0x330
00b1b2cc	bl 0x00c35340
00b1b2d0	str x0,[x19, #0x30]
00b1b2d4	cbz x0,0x00b1b2f0
00b1b2d8	mov x1,x20
00b1b2dc	bl 0x00c347a0
00b1b2e0	cbz w0,0x00b1b2f0
00b1b2e4	mov w0,#0x1
00b1b2e8	str w0,[x19, #0x50]
00b1b2ec	b 0x00b1b324
00b1b2f0	bl 0x00c342a0
00b1b2f4	adrp x0,0x2d6000
00b1b2f8	adrp x2,0x2da000
00b1b2fc	add x0,x0,#0x879
00b1b300	add x2,x2,#0x82c
00b1b304	mov w1,#0x16f
00b1b308	bl 0x00c342b0
00b1b30c	mov w1,#0x100
00b1b310	mov w0,#0xd
00b1b314	movk w1,#0xc, LSL #16
00b1b318	mov x2,xzr
00b1b31c	bl 0x00c342c0
00b1b320	mov w0,wzr
00b1b324	ldp x29,x30,[sp, #0x10]
00b1b328	ldp x20,x19,[sp], #0x20
00b1b32c	ret
