; FUN_00b59cd8 @ 00b59cd8
00b59cd8	sub sp,sp,#0x20
00b59cdc	adrp x8,0xb5a000
00b59ce0	adrp x3,0xb5a000
00b59ce4	adrp x4,0xb59000
00b59ce8	adrp x5,0xb5a000
00b59cec	adrp x6,0xb5a000
00b59cf0	adrp x7,0xb5a000
00b59cf4	add x8,x8,#0x294
00b59cf8	add x3,x3,#0x44
00b59cfc	add x4,x4,#0xd28
00b59d00	add x5,x5,#0xdc
00b59d04	add x6,x6,#0x1b0
00b59d08	add x7,x7,#0x1f8
00b59d0c	stp x29,x30,[sp, #0x10]
00b59d10	add x29,sp,#0x10
00b59d14	str x8,[sp]
00b59d18	bl 0x00c41810
00b59d1c	ldp x29,x30,[sp, #0x10]
00b59d20	add sp,sp,#0x20
00b59d24	ret
