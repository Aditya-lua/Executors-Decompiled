; ossl_gcm_aad_update @ 00b680c4
00b680c4	stp x29,x30,[sp, #-0x10]!
00b680c8	add x0,x0,#0xf8
00b680cc	mov x29,sp
00b680d0	bl 0x00c3e330
00b680d4	cmp w0,#0x0
00b680d8	cset w0,eq
00b680dc	ldp x29,x30,[sp], #0x10
00b680e0	ret
