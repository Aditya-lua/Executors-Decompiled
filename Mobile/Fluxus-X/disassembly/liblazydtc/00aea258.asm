; OSSL_STORE_INFO_new_NAME @ 00aea258
00aea258	str x19,[sp, #-0x20]!
00aea25c	adrp x1,0x2c2000
00aea260	mov x19,x0
00aea264	add x1,x1,#0x3bd
00aea268	orr w0,wzr,#0x18
00aea26c	mov w2,#0x220
00aea270	stp x29,x30,[sp, #0x10]
00aea274	add x29,sp,#0x10
00aea278	bl 0x00c34250
00aea27c	cbz x0,0x00aea290
00aea280	mov w8,#0x1
00aea284	str w8,[x0]
00aea288	stp x19,xzr,[x0, #0x8]
00aea28c	b 0x00aea2c4
00aea290	bl 0x00c342a0
00aea294	adrp x0,0x2c2000
00aea298	adrp x2,0x2d0000
00aea29c	add x0,x0,#0x3bd
00aea2a0	add x2,x2,#0x3c1
00aea2a4	mov w1,#0x22f
00aea2a8	bl 0x00c342b0
00aea2ac	mov w1,#0x100
00aea2b0	mov w0,#0x2c
00aea2b4	movk w1,#0xc, LSL #16
00aea2b8	mov x2,xzr
00aea2bc	bl 0x00c342c0
00aea2c0	mov x0,xzr
00aea2c4	ldp x29,x30,[sp, #0x10]
00aea2c8	ldr x19,[sp], #0x20
00aea2cc	ret
