; std::__ndk1::basic_ofstream<char,std::__ndk1::char_traits<char>>::open @ 00bd7fc4
00bd7fc4	paciasp
00bd7fc8	stp x29,x30,[sp, #-0x20]!
00bd7fcc	str x19,[sp, #0x10]
00bd7fd0	mov x29,sp
00bd7fd4	mov x19,x0
00bd7fd8	add x0,x0,#0x8
00bd7fdc	orr w2,w2,#0x10
00bd7fe0	bl 0x00c30120
00bd7fe4	ldr x8,[x19]
00bd7fe8	ldur x9,[x8, #-0x18]
00bd7fec	mov x8,x0
00bd7ff0	add x0,x19,x9
00bd7ff4	cbz x8,0x00bd8000
00bd7ff8	mov w1,wzr
00bd7ffc	b 0x00bd8008
00bd8000	ldr w8,[x0, #0x20]
00bd8004	orr w1,w8,#0x4
00bd8008	ldr x19,[sp, #0x10]
00bd800c	ldp x29,x30,[sp], #0x20
00bd8010	autiasp
00bd8014	b 0x00c30130
