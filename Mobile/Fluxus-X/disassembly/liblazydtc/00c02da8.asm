; std::__ndk1::__time_get_c_storage<wchar_t>::__weeks @ 00c02da8
00c02da8	paciasp
00c02dac	stp x29,x30,[sp, #-0x20]!
00c02db0	str x19,[sp, #0x10]
00c02db4	mov x29,sp
00c02db8	adrp x8,0xd27000
00c02dbc	add x8,x8,#0x318
00c02dc0	adrp x19,0xd27000
00c02dc4	ldarb w8,[x8]
00c02dc8	tbz w8,#0x0,0x00c02de0
00c02dcc	ldr x0,[x19, #0x310]
00c02dd0	ldr x19,[sp, #0x10]
00c02dd4	ldp x29,x30,[sp], #0x20
00c02dd8	autiasp
00c02ddc	ret
00c02de0	adrp x0,0xd27000
00c02de4	add x0,x0,#0x318
00c02de8	bl 0x00c2fe90
00c02dec	cbz w0,0x00c02dcc
00c02df0	bl 0x00c02e28
00c02df4	adrp x8,0xd27000
00c02df8	add x8,x8,#0x558
00c02dfc	adrp x0,0xd27000
00c02e00	add x0,x0,#0x318
00c02e04	str x8,[x19, #0x310]
00c02e08	bl 0x00c2fea0
00c02e0c	b 0x00c02dcc
