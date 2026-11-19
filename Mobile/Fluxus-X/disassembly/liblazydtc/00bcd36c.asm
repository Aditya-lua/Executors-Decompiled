; std::__ndk1::__thread_local_data @ 00bcd36c
00bcd36c	paciasp
00bcd370	stp x29,x30,[sp, #-0x20]!
00bcd374	stp x20,x19,[sp, #0x10]
00bcd378	mov x29,sp
00bcd37c	adrp x8,0xd26000
00bcd380	add x8,x8,#0x718
00bcd384	adrp x20,0xd26000
00bcd388	ldarb w8,[x8]
00bcd38c	tbz w8,#0x0,0x00bcd3a4
00bcd390	ldr x0,[x20, #0x710]
00bcd394	ldp x20,x19,[sp, #0x10]
00bcd398	ldp x29,x30,[sp], #0x20
00bcd39c	autiasp
00bcd3a0	ret
00bcd3a4	adrp x0,0xd26000
00bcd3a8	add x0,x0,#0x718
00bcd3ac	bl 0x00c2fe90
00bcd3b0	cbz w0,0x00bcd390
00bcd3b4	adrp x19,0xd26000
00bcd3b8	add x19,x19,#0x708
00bcd3bc	mov x0,x19
00bcd3c0	bl 0x00bcd3f0
00bcd3c4	adrp x0,0xd26000
00bcd3c8	add x0,x0,#0x718
00bcd3cc	str x19,[x20, #0x710]
00bcd3d0	bl 0x00c2fea0
00bcd3d4	b 0x00bcd390
