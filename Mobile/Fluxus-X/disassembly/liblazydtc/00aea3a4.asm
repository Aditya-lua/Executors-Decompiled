; OSSL_STORE_INFO_new_PUBKEY @ 00aea3a4
00aea3a4	str x19,[sp, #-0x20]!
00aea3a8	adrp x1,0x2c2000
00aea3ac	mov x19,x0
00aea3b0	add x1,x1,#0x3bd
00aea3b4	orr w0,wzr,#0x18
00aea3b8	mov w2,#0x220
00aea3bc	stp x29,x30,[sp, #0x10]
00aea3c0	add x29,sp,#0x10
00aea3c4	bl 0x00c34250
00aea3c8	cbz x0,0x00aea3dc
00aea3cc	orr w8,wzr,#0x3
00aea3d0	str w8,[x0]
00aea3d4	str x19,[x0, #0x8]
00aea3d8	b 0x00aea410
00aea3dc	bl 0x00c342a0
00aea3e0	adrp x0,0x2c2000
00aea3e4	adrp x2,0x2dc000
00aea3e8	add x0,x0,#0x3bd
00aea3ec	add x2,x2,#0x97a
00aea3f0	mov w1,#0x252
00aea3f4	bl 0x00c342b0
00aea3f8	mov w1,#0x100
00aea3fc	mov w0,#0x2c
00aea400	movk w1,#0xc, LSL #16
00aea404	mov x2,xzr
00aea408	bl 0x00c342c0
00aea40c	mov x0,xzr
00aea410	ldp x29,x30,[sp, #0x10]
00aea414	ldr x19,[sp], #0x20
00aea418	ret
