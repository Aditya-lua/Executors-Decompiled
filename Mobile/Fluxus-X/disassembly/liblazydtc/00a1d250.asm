; BN_RECP_CTX_new @ 00a1d250
00a1d250	str x19,[sp, #-0x20]!
00a1d254	adrp x1,0x2af000
00a1d258	add x1,x1,#0xddf
00a1d25c	mov w0,#0x40
00a1d260	orr w2,wzr,#0x18
00a1d264	stp x29,x30,[sp, #0x10]
00a1d268	add x29,sp,#0x10
00a1d26c	bl 0x00c34250
00a1d270	mov x19,x0
00a1d274	cbz x0,0x00a1d294
00a1d278	mov x0,x19
00a1d27c	bl 0x00c38e70
00a1d280	add x0,x19,#0x18
00a1d284	bl 0x00c38e70
00a1d288	mov w8,#0x1
00a1d28c	str w8,[x19, #0x38]
00a1d290	b 0x00a1d2c4
00a1d294	bl 0x00c342a0
00a1d298	adrp x0,0x2af000
00a1d29c	adrp x2,0x2b5000
00a1d2a0	add x0,x0,#0xddf
00a1d2a4	add x2,x2,#0xb02
00a1d2a8	mov w1,#0x19
00a1d2ac	bl 0x00c342b0
00a1d2b0	mov w1,#0x100
00a1d2b4	orr w0,wzr,#0x3
00a1d2b8	movk w1,#0xc, LSL #16
00a1d2bc	mov x2,xzr
00a1d2c0	bl 0x00c342c0
00a1d2c4	ldp x29,x30,[sp, #0x10]
00a1d2c8	mov x0,x19
00a1d2cc	ldr x19,[sp], #0x20
00a1d2d0	ret
