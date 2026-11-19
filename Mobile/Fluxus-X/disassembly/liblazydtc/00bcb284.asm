; std::__ndk1::system_category @ 00bcb284
00bcb284	paciasp
00bcb288	stp x29,x30,[sp, #-0x10]!
00bcb28c	mov x29,sp
00bcb290	adrp x8,0xd26000
00bcb294	add x8,x8,#0x6f8
00bcb298	ldarb w8,[x8]
00bcb29c	tbz w8,#0x0,0x00bcb2b4
00bcb2a0	nop
00bcb2a4	adr x0,0xcca5e8
00bcb2a8	ldp x29,x30,[sp], #0x10
00bcb2ac	autiasp
00bcb2b0	ret
00bcb2b4	adrp x0,0xd26000
00bcb2b8	add x0,x0,#0x6f8
00bcb2bc	bl 0x00c2fe90
00bcb2c0	cbz w0,0x00bcb2a0
00bcb2c4	adrp x0,0xd26000
00bcb2c8	add x0,x0,#0x6f8
00bcb2cc	bl 0x00c2fea0
00bcb2d0	b 0x00bcb2a0
