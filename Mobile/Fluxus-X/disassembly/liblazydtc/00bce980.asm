; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sputc @ 00bce980
00bce980	bti c
00bce984	ldp x9,x10,[x0, #0x30]
00bce988	mov x8,x0
00bce98c	cmp x9,x10
00bce990	b.eq 0x00bce9a8
00bce994	add x10,x9,#0x1
00bce998	and w0,w1,#0xff
00bce99c	str x10,[x8, #0x30]
00bce9a0	strb w1,[x9]
00bce9a4	ret
00bce9a8	ldr x9,[x8]
00bce9ac	and w1,w1,#0xff
00bce9b0	mov x0,x8
00bce9b4	ldr x16,[x9, #0x68]
00bce9b8	br x16
