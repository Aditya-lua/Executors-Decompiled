; std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname @ 00c026c0
00c026c0	paciasp
00c026c4	stp x29,x30,[sp, #-0x20]!
00c026c8	stp x20,x19,[sp, #0x10]
00c026cc	mov x29,sp
00c026d0	adrp x8,0x29b000
00c026d4	stp xzr,xzr,[x0, #0x20]
00c026d8	sub x9,x2,#0x1
00c026dc	ldr d0,[x8, #0xa48]
00c026e0	str xzr,[x0, #0x18]
00c026e4	adrp x8,0xcb5000
00c026e8	ldr x8,[x8, #0xe50]
00c026ec	mov x19,x0
00c026f0	str d0,[x0, #0x10]
00c026f4	add x8,x8,#0x10
00c026f8	stp x8,x9,[x0]
00c026fc	ldrb w8,[x1]
00c02700	ldr x9,[x1, #0x10]
00c02704	tst w8,#0x1
00c02708	csinc x1,x9,x1,ne
00c0270c	bl 0x00c44640
00c02710	ldp x20,x19,[sp, #0x10]
00c02714	ldp x29,x30,[sp], #0x20
00c02718	autiasp
00c0271c	ret
