; ossl_blake2b_param_set_personal @ 00b2dbe0
00b2dbe0	stp x20,x19,[sp, #-0x20]!
00b2dbe4	add x20,x0,#0x30
00b2dbe8	mov x0,x20
00b2dbec	stp x29,x30,[sp, #0x10]
00b2dbf0	add x29,sp,#0x10
00b2dbf4	mov x19,x2
00b2dbf8	bl 0x00c2ffd0
00b2dbfc	ldp x29,x30,[sp, #0x10]
00b2dc00	mov w8,#0x10
00b2dc04	add x0,x20,x19
00b2dc08	sub x2,x8,x19
00b2dc0c	mov w1,wzr
00b2dc10	ldp x20,x19,[sp], #0x20
00b2dc14	b 0x00c301c0
