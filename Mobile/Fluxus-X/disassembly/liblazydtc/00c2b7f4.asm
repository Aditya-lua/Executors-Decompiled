; FUN_00c2b7f4 @ 00c2b7f4
00c2b7f4	paciasp
00c2b7f8	str x30,[sp, #-0x10]!
00c2b7fc	adrp x0,0xd28000
00c2b800	add x0,x0,#0xa4
00c2b804	nop
00c2b808	adr x1,0xc2b830
00c2b80c	bl 0x00c3ecf0
00c2b810	cbnz w0,0x00c2b82c
00c2b814	adrp x8,0xd28000
00c2b818	mov w9,#0x1
00c2b81c	strb w9,[x8, #0xa0]
00c2b820	ldr x30,[sp], #0x10
00c2b824	autiasp
00c2b828	ret
00c2b82c	bl 0x00c30b40
