; FUN_00b5a860 @ 00b5a860
00b5a860	sub sp,sp,#0x20
00b5a864	adrp x8,0xb5a000
00b5a868	adrp x3,0xb5a000
00b5a86c	adrp x4,0xb5a000
00b5a870	adrp x5,0xb5a000
00b5a874	adrp x6,0xb5a000
00b5a878	adrp x7,0xb5a000
00b5a87c	add x8,x8,#0xeb8
00b5a880	add x3,x3,#0xc18
00b5a884	add x4,x4,#0x8b0
00b5a888	add x5,x5,#0xca8
00b5a88c	add x6,x6,#0xdd8
00b5a890	add x7,x7,#0xe14
00b5a894	stp x29,x30,[sp, #0x10]
00b5a898	add x29,sp,#0x10
00b5a89c	str x8,[sp]
00b5a8a0	bl 0x00c41810
00b5a8a4	ldp x29,x30,[sp, #0x10]
00b5a8a8	add sp,sp,#0x20
00b5a8ac	ret
