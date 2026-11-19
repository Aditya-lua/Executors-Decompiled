; X509V3_EXT_cleanup @ 00af59f8
00af59f8	str x19,[sp, #-0x20]!
00af59fc	adrp x19,0xd22000
00af5a00	ldr x0,[x19, #0x7d8]
00af5a04	adrp x1,0xaf5000
00af5a08	add x1,x1,#0xa28
00af5a0c	stp x29,x30,[sp, #0x10]
00af5a10	add x29,sp,#0x10
00af5a14	bl 0x00c32600
00af5a18	ldp x29,x30,[sp, #0x10]
00af5a1c	str xzr,[x19, #0x7d8]
00af5a20	ldr x19,[sp], #0x20
00af5a24	ret
