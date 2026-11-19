; engine_table_doall @ 00a530f0
00a530f0	sub sp,sp,#0x20
00a530f4	stp x29,x30,[sp, #0x10]
00a530f8	add x29,sp,#0x10
00a530fc	stp x1,x2,[sp]
00a53100	cbz x0,0x00a53114
00a53104	adrp x1,0xa53000
00a53108	add x1,x1,#0x120
00a5310c	mov x2,sp
00a53110	bl 0x00c395c0
00a53114	ldp x29,x30,[sp, #0x10]
00a53118	add sp,sp,#0x20
00a5311c	ret
