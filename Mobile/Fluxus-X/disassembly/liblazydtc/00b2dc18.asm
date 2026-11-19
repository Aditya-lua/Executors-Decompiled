; ossl_blake2b_param_set_salt @ 00b2dc18
00b2dc18	stp x20,x19,[sp, #-0x20]!
00b2dc1c	add x20,x0,#0x20
00b2dc20	mov x0,x20
00b2dc24	stp x29,x30,[sp, #0x10]
00b2dc28	add x29,sp,#0x10
00b2dc2c	mov x19,x2
00b2dc30	bl 0x00c2ffd0
00b2dc34	ldp x29,x30,[sp, #0x10]
00b2dc38	mov w8,#0x10
00b2dc3c	add x0,x20,x19
00b2dc40	sub x2,x8,x19
00b2dc44	mov w1,wzr
00b2dc48	ldp x20,x19,[sp], #0x20
00b2dc4c	b 0x00c301c0
