; OSSL_DECODER_from_fp @ 00a4d1c4
00a4d1c4	str x21,[sp, #-0x30]!
00a4d1c8	stp x20,x19,[sp, #0x10]
00a4d1cc	stp x29,x30,[sp, #0x20]
00a4d1d0	add x29,sp,#0x20
00a4d1d4	mov x21,x1
00a4d1d8	mov x20,x0
00a4d1dc	bl 0x00c32270
00a4d1e0	bl 0x00c32240
00a4d1e4	mov x19,x0
00a4d1e8	cbz x0,0x00a4d214
00a4d1ec	mov w1,#0x6a
00a4d1f0	mov x0,x19
00a4d1f4	mov x2,xzr
00a4d1f8	mov x3,x21
00a4d1fc	bl 0x00c321a0
00a4d200	mov x0,x20
00a4d204	mov x1,x19
00a4d208	bl 0x00a4cba0
00a4d20c	mov w20,w0
00a4d210	b 0x00a4d248
00a4d214	bl 0x00c342a0
00a4d218	adrp x0,0x2bd000
00a4d21c	adrp x2,0x2c7000
00a4d220	add x0,x0,#0x9db
00a4d224	add x2,x2,#0x8d6
00a4d228	orr w1,wzr,#0x7c
00a4d22c	bl 0x00c342b0
00a4d230	mov w1,#0x20
00a4d234	orr w0,wzr,#0x3c
00a4d238	movk w1,#0x8, LSL #16
00a4d23c	mov x2,xzr
00a4d240	bl 0x00c342c0
00a4d244	mov w20,wzr
00a4d248	mov x0,x19
00a4d24c	bl 0x00c31a40
00a4d250	mov w0,w20
00a4d254	ldp x29,x30,[sp, #0x20]
00a4d258	ldp x20,x19,[sp, #0x10]
00a4d25c	ldr x21,[sp], #0x30
00a4d260	ret
