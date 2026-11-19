; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_year @ 00be9400
00be9400	paciasp
00be9404	stp x29,x30,[sp, #-0x20]!
00be9408	stp x20,x19,[sp, #0x10]
00be940c	mov x29,sp
00be9410	mov x20,x4
00be9414	mov x0,x2
00be9418	mov x19,x1
00be941c	mov x1,x3
00be9420	mov x2,x4
00be9424	mov x3,x5
00be9428	mov w4,#0x4
00be942c	bl 0x00bea2fc
00be9430	ldrb w8,[x20]
00be9434	tbnz w8,#0x2,0x00be9458
00be9438	add w8,w0,#0x76c
00be943c	cmp w0,#0x64
00be9440	add w9,w0,#0x7d0
00be9444	csel w8,w8,w0,cc
00be9448	cmp w0,#0x45
00be944c	csel w8,w9,w8,lt
00be9450	sub w8,w8,#0x76c
00be9454	str w8,[x19]
00be9458	ldp x20,x19,[sp, #0x10]
00be945c	ldp x29,x30,[sp], #0x20
00be9460	autiasp
00be9464	ret
