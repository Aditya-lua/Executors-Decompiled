; std::__ndk1::ctype<wchar_t>::do_tolower @ 00bfc7a4
00bfc7a4	paciasp
00bfc7a8	stp x29,x30,[sp, #-0x20]!
00bfc7ac	str x19,[sp, #0x10]
00bfc7b0	mov x29,sp
00bfc7b4	mov w19,w1
00bfc7b8	cmp w1,#0x7f
00bfc7bc	b.hi 0x00bfc7e0
00bfc7c0	adrp x8,0xd27000
00bfc7c4	add x8,x8,#0xf8
00bfc7c8	ldarb w8,[x8]
00bfc7cc	tbz w8,#0x0,0x00bfc7f4
00bfc7d0	sub w8,w19,#0x5b
00bfc7d4	add w9,w19,#0x20
00bfc7d8	cmn w8,#0x1a
00bfc7dc	csel w19,w19,w9,cc
00bfc7e0	mov w0,w19
00bfc7e4	ldr x19,[sp, #0x10]
00bfc7e8	ldp x29,x30,[sp], #0x20
00bfc7ec	autiasp
00bfc7f0	ret
00bfc7f4	adrp x0,0xd27000
00bfc7f8	add x0,x0,#0xf8
00bfc7fc	bl 0x00c2fe90
00bfc800	cbz w0,0x00bfc7d0
00bfc804	adrp x1,0x2c6000
00bfc808	add x1,x1,#0xbfc
00bfc80c	mov w0,#0x1fbf
00bfc810	mov x2,xzr
00bfc814	bl 0x00c43890
00bfc818	adrp x8,0xd27000
00bfc81c	str x0,[x8, #0xf0]
00bfc820	adrp x0,0xd27000
00bfc824	add x0,x0,#0xf8
00bfc828	bl 0x00c2fea0
00bfc82c	b 0x00bfc7d0
