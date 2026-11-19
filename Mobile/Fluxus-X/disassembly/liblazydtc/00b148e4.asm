; X509_VERIFY_PARAM_table_cleanup @ 00b148e4
00b148e4	str x19,[sp, #-0x20]!
00b148e8	stp x29,x30,[sp, #0x10]
00b148ec	adrp x19,0xd22000
00b148f0	adrp x1,0xcb5000
00b148f4	ldr x0,[x19, #0x7f0]
00b148f8	ldr x1,[x1, #0x1a8]
00b148fc	add x29,sp,#0x10
00b14900	bl 0x00c32600
00b14904	ldp x29,x30,[sp, #0x10]
00b14908	str xzr,[x19, #0x7f0]
00b1490c	ldr x19,[sp], #0x20
00b14910	ret
