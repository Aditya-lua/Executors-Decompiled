; ossl_blake2s_param_set_salt @ 00b2fc3c
00b2fc3c	stp x20,x19,[sp, #-0x20]!
00b2fc40	add x20,x0,#0x10
00b2fc44	mov x0,x20
00b2fc48	stp x29,x30,[sp, #0x10]
00b2fc4c	add x29,sp,#0x10
00b2fc50	mov x19,x2
00b2fc54	bl 0x00c2ffd0
00b2fc58	ldp x29,x30,[sp, #0x10]
00b2fc5c	mov w8,#0x8
00b2fc60	add x0,x20,x19
00b2fc64	sub x2,x8,x19
00b2fc68	mov w1,wzr
00b2fc6c	ldp x20,x19,[sp], #0x20
00b2fc70	b 0x00c301c0
