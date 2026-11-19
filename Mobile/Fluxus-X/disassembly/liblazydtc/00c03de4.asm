; std::__ndk1::__time_get_c_storage<char>::__am_pm @ 00c03de4
00c03de4	paciasp
00c03de8	stp x29,x30,[sp, #-0x10]!
00c03dec	mov x29,sp
00c03df0	adrp x8,0xd27000
00c03df4	add x8,x8,#0x348
00c03df8	ldarb w9,[x8]
00c03dfc	adrp x8,0xd27000
00c03e00	tbz w9,#0x0,0x00c03e14
00c03e04	ldr x0,[x8, #0x340]
00c03e08	ldp x29,x30,[sp], #0x10
00c03e0c	autiasp
00c03e10	ret
00c03e14	adrp x0,0xd27000
00c03e18	add x0,x0,#0x348
00c03e1c	bl 0x00c2fe90
00c03e20	adrp x8,0xd27000
00c03e24	cbz w0,0x00c03e04
00c03e28	bl 0x00c03e50
00c03e2c	adrp x9,0xd27000
00c03e30	add x9,x9,#0xb40
00c03e34	adrp x8,0xd27000
00c03e38	adrp x0,0xd27000
00c03e3c	add x0,x0,#0x348
00c03e40	str x9,[x8, #0x340]
00c03e44	bl 0x00c2fea0
00c03e48	adrp x8,0xd27000
00c03e4c	b 0x00c03e04
