; std::__ndk1::__cloc @ 00bdead0
00bdead0	paciasp
00bdead4	stp x29,x30,[sp, #-0x20]!
00bdead8	str x19,[sp, #0x10]
00bdeadc	mov x29,sp
00bdeae0	adrp x8,0xd27000
00bdeae4	add x8,x8,#0xf8
00bdeae8	adrp x19,0xd27000
00bdeaec	ldarb w8,[x8]
00bdeaf0	tbz w8,#0x0,0x00bdeb08
00bdeaf4	ldr x0,[x19, #0xf0]
00bdeaf8	ldr x19,[sp, #0x10]
00bdeafc	ldp x29,x30,[sp], #0x20
00bdeb00	autiasp
00bdeb04	ret
00bdeb08	adrp x0,0xd27000
00bdeb0c	add x0,x0,#0xf8
00bdeb10	bl 0x00c2fe90
00bdeb14	cbz w0,0x00bdeaf4
00bdeb18	adrp x1,0x2c6000
00bdeb1c	add x1,x1,#0xbfc
00bdeb20	mov w0,#0x1fbf
00bdeb24	mov x2,xzr
00bdeb28	bl 0x00c43890
00bdeb2c	str x0,[x19, #0xf0]
00bdeb30	adrp x0,0xd27000
00bdeb34	add x0,x0,#0xf8
00bdeb38	bl 0x00c2fea0
00bdeb3c	b 0x00bdeaf4
