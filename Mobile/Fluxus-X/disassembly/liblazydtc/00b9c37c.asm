; mbedtls_hmac_drbg_seed_buf @ 00b9c37c
00b9c37c	str x23,[sp, #-0x40]!
00b9c380	stp x22,x21,[sp, #0x10]
00b9c384	stp x20,x19,[sp, #0x20]
00b9c388	stp x29,x30,[sp, #0x30]
00b9c38c	add x29,sp,#0x30
00b9c390	mov x20,x2
00b9c394	mov w2,#0x1
00b9c398	mov x19,x3
00b9c39c	mov x22,x1
00b9c3a0	mov x21,x0
00b9c3a4	bl 0x00c42850
00b9c3a8	cbnz w0,0x00b9c3cc
00b9c3ac	mov x0,x22
00b9c3b0	add x23,x21,#0x18
00b9c3b4	bl 0x00c302d0
00b9c3b8	and x2,x0,#0xff
00b9c3bc	mov x0,x21
00b9c3c0	mov x1,x23
00b9c3c4	bl 0x00c42970
00b9c3c8	cbz w0,0x00b9c3e0
00b9c3cc	ldp x29,x30,[sp, #0x30]
00b9c3d0	ldp x20,x19,[sp, #0x20]
00b9c3d4	ldp x22,x21,[sp, #0x10]
00b9c3d8	ldr x23,[sp], #0x40
00b9c3dc	ret
00b9c3e0	mov x0,x22
00b9c3e4	bl 0x00c302d0
00b9c3e8	and x2,x0,#0xff
00b9c3ec	mov w1,#0x1
00b9c3f0	mov x0,x23
00b9c3f4	bl 0x00c301c0
00b9c3f8	mov x0,x21
00b9c3fc	mov x1,x20
00b9c400	mov x2,x19
00b9c404	ldp x29,x30,[sp, #0x30]
00b9c408	ldp x20,x19,[sp, #0x20]
00b9c40c	ldp x22,x21,[sp, #0x10]
00b9c410	ldr x23,[sp], #0x40
00b9c414	b 0x00c428c0
