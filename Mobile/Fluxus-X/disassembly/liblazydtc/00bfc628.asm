; std::__ndk1::ctype<wchar_t>::do_toupper @ 00bfc628
00bfc628	paciasp
00bfc62c	stp x29,x30,[sp, #-0x20]!
00bfc630	stp x20,x19,[sp, #0x10]
00bfc634	mov x29,sp
00bfc638	mov w19,w1
00bfc63c	cmp w1,#0x7f
00bfc640	b.hi 0x00bfc670
00bfc644	adrp x8,0xd27000
00bfc648	add x8,x8,#0xf8
00bfc64c	adrp x20,0xd27000
00bfc650	ldarb w8,[x8]
00bfc654	tbz w8,#0x0,0x00bfc684
00bfc658	ldr x1,[x20, #0xf0]
00bfc65c	mov w0,w19
00bfc660	bl 0x00c437d0
00bfc664	sub w8,w19,#0x20
00bfc668	cmp w0,#0x0
00bfc66c	csel w19,w19,w8,eq
00bfc670	mov w0,w19
00bfc674	ldp x20,x19,[sp, #0x10]
00bfc678	ldp x29,x30,[sp], #0x20
00bfc67c	autiasp
00bfc680	ret
00bfc684	adrp x0,0xd27000
00bfc688	add x0,x0,#0xf8
00bfc68c	bl 0x00c2fe90
00bfc690	cbz w0,0x00bfc658
00bfc694	adrp x1,0x2c6000
00bfc698	add x1,x1,#0xbfc
00bfc69c	mov w0,#0x1fbf
00bfc6a0	mov x2,xzr
00bfc6a4	bl 0x00c43890
00bfc6a8	str x0,[x20, #0xf0]
00bfc6ac	adrp x0,0xd27000
00bfc6b0	add x0,x0,#0xf8
00bfc6b4	bl 0x00c2fea0
00bfc6b8	b 0x00bfc658
