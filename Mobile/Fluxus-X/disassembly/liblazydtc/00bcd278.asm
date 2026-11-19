; std::__ndk1::thread::detach @ 00bcd278
00bcd278	paciasp
00bcd27c	stp x29,x30,[sp, #-0x20]!
00bcd280	str x19,[sp, #0x10]
00bcd284	mov x29,sp
00bcd288	mov x19,x0
00bcd28c	ldr x0,[x0]
00bcd290	cbz x0,0x00bcd2b0
00bcd294	bl 0x00c31cf0
00bcd298	cbnz w0,0x00bcd2b4
00bcd29c	str xzr,[x19]
00bcd2a0	ldr x19,[sp, #0x10]
00bcd2a4	ldp x29,x30,[sp], #0x20
00bcd2a8	autiasp
00bcd2ac	ret
00bcd2b0	mov w0,#0x16
00bcd2b4	adrp x1,0x2b8000
00bcd2b8	add x1,x1,#0xc96
00bcd2bc	bl 0x00c2ffc0
