; std::__ndk1::basic_ofstream<char,std::__ndk1::char_traits<char>>::open @ 00bd8018
00bd8018	paciasp
00bd801c	stp x29,x30,[sp, #-0x20]!
00bd8020	str x19,[sp, #0x10]
00bd8024	mov x29,sp
00bd8028	ldrb w8,[x1]
00bd802c	ldr x9,[x1, #0x10]
00bd8030	mov x19,x0
00bd8034	add x0,x0,#0x8
00bd8038	orr w2,w2,#0x10
00bd803c	tst w8,#0x1
00bd8040	csinc x1,x9,x1,ne
00bd8044	bl 0x00c30120
00bd8048	ldr x8,[x19]
00bd804c	ldur x9,[x8, #-0x18]
00bd8050	mov x8,x0
00bd8054	add x0,x19,x9
00bd8058	cbz x8,0x00bd8064
00bd805c	mov w1,wzr
00bd8060	b 0x00bd806c
00bd8064	ldr w8,[x0, #0x20]
00bd8068	orr w1,w8,#0x4
00bd806c	ldr x19,[sp, #0x10]
00bd8070	ldp x29,x30,[sp], #0x20
00bd8074	autiasp
00bd8078	b 0x00c30130
