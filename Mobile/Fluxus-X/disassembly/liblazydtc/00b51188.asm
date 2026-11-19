; ossl_kdf_data_up_ref @ 00b51188
00b51188	str x19,[sp, #-0x20]!
00b5118c	stp x29,x30,[sp, #0x10]
00b51190	add x29,sp,#0x10
00b51194	mov x19,x0
00b51198	bl 0x00c41000
00b5119c	cbz w0,0x00b511b8
00b511a0	add x8,x19,#0x8
00b511a4	ldxr w9,[x8]
00b511a8	add w9,w9,#0x1
00b511ac	stxr w10,w9,[x8]
00b511b0	cbnz w10,0x00b511a4
00b511b4	mov w0,#0x1
00b511b8	ldp x29,x30,[sp, #0x10]
00b511bc	ldr x19,[sp], #0x20
00b511c0	ret
