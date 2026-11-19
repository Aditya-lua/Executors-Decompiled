; std::__ndk1::locale::__global @ 00bfacc0
00bfacc0	paciasp
00bfacc4	stp x29,x30,[sp, #-0x20]!
00bfacc8	str x19,[sp, #0x10]
00bfaccc	mov x29,sp
00bfacd0	adrp x8,0xd27000
00bfacd4	add x8,x8,#0x250
00bfacd8	ldarb w8,[x8]
00bfacdc	tbz w8,#0x0,0x00bfacf8
00bface0	adrp x0,0xd27000
00bface4	add x0,x0,#0x248
00bface8	ldr x19,[sp, #0x10]
00bfacec	ldp x29,x30,[sp], #0x20
00bfacf0	autiasp
00bfacf4	ret
00bfacf8	adrp x0,0xd27000
00bfacfc	add x0,x0,#0x250
00bfad00	bl 0x00c2fe90
00bfad04	cbz w0,0x00bface0
00bfad08	bl 0x00c44420
00bfad0c	mov x1,x0
00bfad10	adrp x0,0xd27000
00bfad14	add x0,x0,#0x248
00bfad18	bl 0x00c30660
00bfad1c	adrp x0,0xd27000
00bfad20	add x0,x0,#0x250
00bfad24	bl 0x00c2fea0
00bfad28	b 0x00bface0
