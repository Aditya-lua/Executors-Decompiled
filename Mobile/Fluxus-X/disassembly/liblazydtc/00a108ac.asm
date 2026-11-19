; ASN1_STRING_TABLE_cleanup @ 00a108ac
00a108ac	adrp x8,0xd21000
00a108b0	ldr x0,[x8, #0x958]
00a108b4	cbz x0,0x00a108c8
00a108b8	adrp x1,0xa10000
00a108bc	add x1,x1,#0x8cc
00a108c0	str xzr,[x8, #0x958]
00a108c4	b 0x00c32600
00a108c8	ret
