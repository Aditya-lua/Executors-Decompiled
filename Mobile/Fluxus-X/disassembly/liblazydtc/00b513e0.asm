; ossl_mac_key_up_ref @ 00b513e0
00b513e0	str x19,[sp, #-0x20]!
00b513e4	stp x29,x30,[sp, #0x10]
00b513e8	add x29,sp,#0x10
00b513ec	mov x19,x0
00b513f0	bl 0x00c41000
00b513f4	cbz w0,0x00b51410
00b513f8	add x8,x19,#0x10
00b513fc	ldxr w9,[x8]
00b51400	add w9,w9,#0x1
00b51404	stxr w10,w9,[x8]
00b51408	cbnz w10,0x00b513fc
00b5140c	mov w0,#0x1
00b51410	ldp x29,x30,[sp, #0x10]
00b51414	ldr x19,[sp], #0x20
00b51418	ret
