; std::__ndk1::ctype<char>::do_tolower @ 00bfcd50
00bfcd50	paciasp
00bfcd54	stp x29,x30,[sp, #-0x20]!
00bfcd58	str x19,[sp, #0x10]
00bfcd5c	mov x29,sp
00bfcd60	and w19,w1,#0xff
00bfcd64	tbnz w1,#0x7,0x00bfcd88
00bfcd68	adrp x8,0xd27000
00bfcd6c	add x8,x8,#0xf8
00bfcd70	ldarb w8,[x8]
00bfcd74	tbz w8,#0x0,0x00bfcd9c
00bfcd78	sub w8,w19,#0x5b
00bfcd7c	add w9,w19,#0x20
00bfcd80	cmn w8,#0x1a
00bfcd84	csel w19,w19,w9,cc
00bfcd88	mov w0,w19
00bfcd8c	ldr x19,[sp, #0x10]
00bfcd90	ldp x29,x30,[sp], #0x20
00bfcd94	autiasp
00bfcd98	ret
00bfcd9c	adrp x0,0xd27000
00bfcda0	add x0,x0,#0xf8
00bfcda4	bl 0x00c2fe90
00bfcda8	cbz w0,0x00bfcd78
00bfcdac	adrp x1,0x2c6000
00bfcdb0	add x1,x1,#0xbfc
00bfcdb4	mov w0,#0x1fbf
00bfcdb8	mov x2,xzr
00bfcdbc	bl 0x00c43890
00bfcdc0	adrp x8,0xd27000
00bfcdc4	str x0,[x8, #0xf0]
00bfcdc8	adrp x0,0xd27000
00bfcdcc	add x0,x0,#0xf8
00bfcdd0	bl 0x00c2fea0
00bfcdd4	b 0x00bfcd78
