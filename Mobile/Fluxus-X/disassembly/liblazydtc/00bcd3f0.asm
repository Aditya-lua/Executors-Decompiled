; FUN_00bcd3f0 @ 00bcd3f0
00bcd3f0	paciasp
00bcd3f4	stp x29,x30,[sp, #-0x10]!
00bcd3f8	mov x29,sp
00bcd3fc	nop
00bcd400	adr x1,0xbcd75c
00bcd404	bl 0x00c3ecf0
00bcd408	cbnz w0,0x00bcd418
00bcd40c	ldp x29,x30,[sp], #0x10
00bcd410	autiasp
00bcd414	ret
00bcd418	adrp x1,0x2a6000
00bcd41c	add x1,x1,#0xf0b
00bcd420	bl 0x00c2ffc0
