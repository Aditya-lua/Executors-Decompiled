; ossl_blake2s_param_set_personal @ 00b2fc04
00b2fc04	stp x20,x19,[sp, #-0x20]!
00b2fc08	add x20,x0,#0x18
00b2fc0c	mov x0,x20
00b2fc10	stp x29,x30,[sp, #0x10]
00b2fc14	add x29,sp,#0x10
00b2fc18	mov x19,x2
00b2fc1c	bl 0x00c2ffd0
00b2fc20	ldp x29,x30,[sp, #0x10]
00b2fc24	mov w8,#0x8
00b2fc28	add x0,x20,x19
00b2fc2c	sub x2,x8,x19
00b2fc30	mov w1,wzr
00b2fc34	ldp x20,x19,[sp], #0x20
00b2fc38	b 0x00c301c0
