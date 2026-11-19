; std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname @ 00c02440
00c02440	paciasp
00c02444	stp x29,x30,[sp, #-0x20]!
00c02448	stp x20,x19,[sp, #0x10]
00c0244c	mov x29,sp
00c02450	adrp x8,0x29b000
00c02454	stp xzr,xzr,[x0, #0x20]
00c02458	mov x19,x0
00c0245c	ldr d0,[x8, #0xa48]
00c02460	str xzr,[x0, #0x18]
00c02464	adrp x8,0xcb5000
00c02468	ldr x8,[x8, #0xe50]
00c0246c	sub x9,x2,#0x1
00c02470	str d0,[x0, #0x10]
00c02474	add x8,x8,#0x10
00c02478	stp x8,x9,[x0]
00c0247c	bl 0x00c44640
00c02480	ldp x20,x19,[sp, #0x10]
00c02484	ldp x29,x30,[sp], #0x20
00c02488	autiasp
00c0248c	ret
