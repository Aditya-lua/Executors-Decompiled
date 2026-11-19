; std::__ndk1::numpunct_byname<char>::numpunct_byname @ 00c02378
00c02378	paciasp
00c0237c	stp x29,x30,[sp, #-0x20]!
00c02380	stp x20,x19,[sp, #0x10]
00c02384	mov x29,sp
00c02388	mov w8,#0x2c2e
00c0238c	str xzr,[x0, #0x28]
00c02390	sub x9,x2,#0x1
00c02394	strh w8,[x0, #0x10]
00c02398	adrp x8,0xcb5000
00c0239c	mov x19,x0
00c023a0	ldr x8,[x8, #0xe48]
00c023a4	stp xzr,xzr,[x0, #0x18]
00c023a8	add x8,x8,#0x10
00c023ac	stp x8,x9,[x0]
00c023b0	ldrb w8,[x1]
00c023b4	ldr x9,[x1, #0x10]
00c023b8	tst w8,#0x1
00c023bc	csinc x1,x9,x1,ne
00c023c0	bl 0x00c44620
00c023c4	ldp x20,x19,[sp, #0x10]
00c023c8	ldp x29,x30,[sp], #0x20
00c023cc	autiasp
00c023d0	ret
