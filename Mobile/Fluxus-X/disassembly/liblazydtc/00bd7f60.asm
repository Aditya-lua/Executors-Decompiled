; std::__ndk1::basic_ifstream<char,std::__ndk1::char_traits<char>>::open @ 00bd7f60
00bd7f60	paciasp
00bd7f64	stp x29,x30,[sp, #-0x20]!
00bd7f68	str x19,[sp, #0x10]
00bd7f6c	mov x29,sp
00bd7f70	ldrb w8,[x1]
00bd7f74	ldr x9,[x1, #0x10]
00bd7f78	mov x19,x0
00bd7f7c	add x0,x0,#0x10
00bd7f80	orr w2,w2,#0x8
00bd7f84	tst w8,#0x1
00bd7f88	csinc x1,x9,x1,ne
00bd7f8c	bl 0x00c30120
00bd7f90	ldr x8,[x19]
00bd7f94	ldur x9,[x8, #-0x18]
00bd7f98	mov x8,x0
00bd7f9c	add x0,x19,x9
00bd7fa0	cbz x8,0x00bd7fac
00bd7fa4	mov w1,wzr
00bd7fa8	b 0x00bd7fb4
00bd7fac	ldr w8,[x0, #0x20]
00bd7fb0	orr w1,w8,#0x4
00bd7fb4	ldr x19,[sp, #0x10]
00bd7fb8	ldp x29,x30,[sp], #0x20
00bd7fbc	autiasp
00bd7fc0	b 0x00c30130
