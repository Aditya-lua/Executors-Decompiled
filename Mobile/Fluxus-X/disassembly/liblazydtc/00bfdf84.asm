; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt @ 00bfdf84
00bfdf84	paciasp
00bfdf88	stp x29,x30,[sp, #-0x20]!
00bfdf8c	stp x20,x19,[sp, #0x10]
00bfdf90	mov x29,sp
00bfdf94	adrp x8,0xcb5000
00bfdf98	sub x9,x1,#0x1
00bfdf9c	mov x19,x0
00bfdfa0	ldr x8,[x8, #0xe30]
00bfdfa4	adrp x20,0xd27000
00bfdfa8	add x8,x8,#0x10
00bfdfac	stp x8,x9,[x0]
00bfdfb0	adrp x8,0xd27000
00bfdfb4	add x8,x8,#0xf8
00bfdfb8	ldarb w8,[x8]
00bfdfbc	tbz w8,#0x0,0x00bfdfd8
00bfdfc0	ldr x8,[x20, #0xf0]
00bfdfc4	str x8,[x19, #0x10]
00bfdfc8	ldp x20,x19,[sp, #0x10]
00bfdfcc	ldp x29,x30,[sp], #0x20
00bfdfd0	autiasp
00bfdfd4	ret
00bfdfd8	adrp x0,0xd27000
00bfdfdc	add x0,x0,#0xf8
00bfdfe0	bl 0x00c2fe90
00bfdfe4	cbz w0,0x00bfdfc0
00bfdfe8	adrp x1,0x2c6000
00bfdfec	add x1,x1,#0xbfc
00bfdff0	mov w0,#0x1fbf
00bfdff4	mov x2,xzr
00bfdff8	bl 0x00c43890
00bfdffc	str x0,[x20, #0xf0]
00bfe000	adrp x0,0xd27000
00bfe004	add x0,x0,#0xf8
00bfe008	bl 0x00c2fea0
00bfe00c	b 0x00bfdfc0
