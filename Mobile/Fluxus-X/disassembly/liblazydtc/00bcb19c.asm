; std::__ndk1::generic_category @ 00bcb19c
00bcb19c	paciasp
00bcb1a0	stp x29,x30,[sp, #-0x10]!
00bcb1a4	mov x29,sp
00bcb1a8	adrp x8,0xd26000
00bcb1ac	add x8,x8,#0x6f0
00bcb1b0	ldarb w8,[x8]
00bcb1b4	tbz w8,#0x0,0x00bcb1cc
00bcb1b8	nop
00bcb1bc	adr x0,0xcca5e0
00bcb1c0	ldp x29,x30,[sp], #0x10
00bcb1c4	autiasp
00bcb1c8	ret
00bcb1cc	adrp x0,0xd26000
00bcb1d0	add x0,x0,#0x6f0
00bcb1d4	bl 0x00c2fe90
00bcb1d8	cbz w0,0x00bcb1b8
00bcb1dc	adrp x0,0xd26000
00bcb1e0	add x0,x0,#0x6f0
00bcb1e4	bl 0x00c2fea0
00bcb1e8	b 0x00bcb1b8
