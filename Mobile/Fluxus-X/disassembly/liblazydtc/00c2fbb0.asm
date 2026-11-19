; FUN_00c2fbb0 @ 00c2fbb0
00c2fbb0	bti c
00c2fbb4	add w8,w0,#0x2
00c2fbb8	cmp w8,#0x61
00c2fbbc	b.hi 0x00c2fbd4
00c2fbc0	adrp x9,0x78d000
00c2fbc4	add x9,x9,#0x8e4
00c2fbc8	ldrsw x8,[x9, w8, UXTW #0x2]
00c2fbcc	add x0,x9,x8
00c2fbd0	ret
00c2fbd4	adrp x0,0x2cc000
00c2fbd8	add x0,x0,#0xab4
00c2fbdc	ret
