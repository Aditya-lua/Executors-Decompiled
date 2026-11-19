; std::__ndk1::ctype<char>::do_tolower @ 00bfcdf0
00bfcdf0	paciasp
00bfcdf4	stp x29,x30,[sp, #-0x40]!
00bfcdf8	str x23,[sp, #0x10]
00bfcdfc	stp x22,x21,[sp, #0x20]
00bfce00	stp x20,x19,[sp, #0x30]
00bfce04	mov x29,sp
00bfce08	mov x19,x1
00bfce0c	cmp x1,x2
00bfce10	b.eq 0x00bfce8c
00bfce14	mov x20,x2
00bfce18	adrp x21,0xd27000
00bfce1c	add x21,x21,#0xf8
00bfce20	adrp x22,0xd27000
00bfce24	b 0x00bfce4c
00bfce28	sub w8,w23,#0x5b
00bfce2c	ldrb w9,[x19]
00bfce30	and w8,w8,#0xff
00bfce34	add w10,w9,#0x20
00bfce38	cmp w8,#0xe6
00bfce3c	csel w23,w9,w10,cc
00bfce40	strb w23,[x19], #0x1
00bfce44	cmp x19,x20
00bfce48	b.eq 0x00bfce8c
00bfce4c	ldrsb w23,[x19]
00bfce50	tbnz w23,#0x1f,0x00bfce40
00bfce54	ldarb w8,[x21]
00bfce58	tbnz w8,#0x0,0x00bfce28
00bfce5c	mov x0,x21
00bfce60	bl 0x00c2fe90
00bfce64	adrp x1,0x2c6000
00bfce68	add x1,x1,#0xbfc
00bfce6c	cbz w0,0x00bfce28
00bfce70	mov w0,#0x1fbf
00bfce74	mov x2,xzr
00bfce78	bl 0x00c43890
00bfce7c	str x0,[x22, #0xf0]
00bfce80	mov x0,x21
00bfce84	bl 0x00c2fea0
00bfce88	b 0x00bfce28
00bfce8c	mov x0,x19
00bfce90	ldp x20,x19,[sp, #0x30]
00bfce94	ldr x23,[sp, #0x10]
00bfce98	ldp x22,x21,[sp, #0x20]
00bfce9c	ldp x29,x30,[sp], #0x40
00bfcea0	autiasp
00bfcea4	ret
