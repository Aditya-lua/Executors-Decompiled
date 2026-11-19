; ossl_cipher_hw_tdes_ede3_initkey @ 00b2d1f4
00b2d1f4	stp x20,x19,[sp, #-0x20]!
00b2d1f8	mov x19,x1
00b2d1fc	stp x29,x30,[sp, #0x10]
00b2d200	mov x20,x0
00b2d204	str xzr,[x0, #0x240]
00b2d208	add x1,x0,#0xc0
00b2d20c	mov x0,x19
00b2d210	add x29,sp,#0x10
00b2d214	bl 0x00c32090
00b2d218	add x0,x19,#0x8
00b2d21c	add x1,x20,#0x140
00b2d220	bl 0x00c32090
00b2d224	add x0,x19,#0x10
00b2d228	add x1,x20,#0x1c0
00b2d22c	bl 0x00c32090
00b2d230	ldp x29,x30,[sp, #0x10]
00b2d234	mov w0,#0x1
00b2d238	ldp x20,x19,[sp], #0x20
00b2d23c	ret
