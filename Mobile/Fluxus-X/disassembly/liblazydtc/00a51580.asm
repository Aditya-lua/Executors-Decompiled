; engine_cleanup_int @ 00a51580
00a51580	str x19,[sp, #-0x20]!
00a51584	adrp x19,0xd21000
00a51588	ldr x0,[x19, #0x998]
00a5158c	stp x29,x30,[sp, #0x10]
00a51590	add x29,sp,#0x10
00a51594	cbz x0,0x00a515a8
00a51598	adrp x1,0xa51000
00a5159c	add x1,x1,#0x5c8
00a515a0	bl 0x00c32600
00a515a4	str xzr,[x19, #0x998]
00a515a8	adrp x19,0xcb5000
00a515ac	ldr x19,[x19, #0x5d8]
00a515b0	ldr x0,[x19]
00a515b4	bl 0x00c34d40
00a515b8	ldp x29,x30,[sp, #0x10]
00a515bc	str xzr,[x19]
00a515c0	ldr x19,[sp], #0x20
00a515c4	ret
