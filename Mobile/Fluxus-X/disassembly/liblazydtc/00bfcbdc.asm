; std::__ndk1::ctype<char>::do_toupper @ 00bfcbdc
00bfcbdc	paciasp
00bfcbe0	stp x29,x30,[sp, #-0x20]!
00bfcbe4	str x19,[sp, #0x10]
00bfcbe8	mov x29,sp
00bfcbec	mov w19,w1
00bfcbf0	tbnz w1,#0x7,0x00bfcc18
00bfcbf4	adrp x8,0xd27000
00bfcbf8	add x8,x8,#0xf8
00bfcbfc	ldarb w8,[x8]
00bfcc00	tbz w8,#0x0,0x00bfcc2c
00bfcc04	sub w8,w19,#0x7b
00bfcc08	sub w9,w19,#0x20
00bfcc0c	and w8,w8,#0xff
00bfcc10	cmp w8,#0xe6
00bfcc14	csel w19,w19,w9,cc
00bfcc18	mov w0,w19
00bfcc1c	ldr x19,[sp, #0x10]
00bfcc20	ldp x29,x30,[sp], #0x20
00bfcc24	autiasp
00bfcc28	ret
00bfcc2c	adrp x0,0xd27000
00bfcc30	add x0,x0,#0xf8
00bfcc34	bl 0x00c2fe90
00bfcc38	cbz w0,0x00bfcc04
00bfcc3c	adrp x1,0x2c6000
00bfcc40	add x1,x1,#0xbfc
00bfcc44	mov w0,#0x1fbf
00bfcc48	mov x2,xzr
00bfcc4c	bl 0x00c43890
00bfcc50	adrp x8,0xd27000
00bfcc54	str x0,[x8, #0xf0]
00bfcc58	adrp x0,0xd27000
00bfcc5c	add x0,x0,#0xf8
00bfcc60	bl 0x00c2fea0
00bfcc64	b 0x00bfcc04
