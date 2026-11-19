; FUN_00c2b8b8 @ 00c2b8b8
00c2b8b8	bti c
00c2b8bc	mrs x8,fpcr
00c2b8c0	adrp x9,0x29c000
00c2b8c4	add x9,x9,#0x9f0
00c2b8c8	ubfx x8,x8,#0x16,#0x2
00c2b8cc	ldr w0,[x9, x8, LSL #0x2]
00c2b8d0	ret
