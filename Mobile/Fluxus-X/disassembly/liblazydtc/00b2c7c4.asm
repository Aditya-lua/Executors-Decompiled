; ossl_tdes_freectx @ 00b2c7c4
00b2c7c4	str x19,[sp, #-0x20]!
00b2c7c8	stp x29,x30,[sp, #0x10]
00b2c7cc	add x29,sp,#0x10
00b2c7d0	mov x19,x0
00b2c7d4	bl 0x00c41290
00b2c7d8	ldp x29,x30,[sp, #0x10]
00b2c7dc	adrp x2,0x2a4000
00b2c7e0	add x2,x2,#0xdfc
00b2c7e4	mov w1,#0x248
00b2c7e8	mov w3,#0x3d
00b2c7ec	mov x0,x19
00b2c7f0	ldr x19,[sp], #0x20
00b2c7f4	b 0x00c345e0
