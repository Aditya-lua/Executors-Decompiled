; FUN_00c0b850 @ 00c0b850
00c0b850	paciasp
00c0b854	stp x29,x30,[sp, #-0x10]!
00c0b858	mov x29,sp
00c0b85c	ldr x0,[x0]
00c0b860	cbz x0,0x00c0b868
00c0b864	bl 0x00c43880
00c0b868	ldp x29,x30,[sp], #0x10
00c0b86c	autiasp
00c0b870	ret
