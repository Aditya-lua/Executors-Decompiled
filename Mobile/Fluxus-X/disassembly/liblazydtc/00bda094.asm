; std::__ndk1::collate<char>::do_compare @ 00bda094
00bda094	bti c
00bda098	cmp x3,x4
00bda09c	b.eq 0x00bda0dc
00bda0a0	sub x8,x4,x3
00bda0a4	add x8,x1,x8
00bda0a8	cmp x1,x2
00bda0ac	b.eq 0x00bda0e8
00bda0b0	ldrb w9,[x1]
00bda0b4	ldrb w10,[x3]
00bda0b8	cmp w9,w10
00bda0bc	b.cc 0x00bda0e8
00bda0c0	cmp w10,w9
00bda0c4	b.cc 0x00bda0f0
00bda0c8	add x3,x3,#0x1
00bda0cc	add x1,x1,#0x1
00bda0d0	cmp x3,x4
00bda0d4	b.ne 0x00bda0a8
00bda0d8	mov x1,x8
00bda0dc	cmp x1,x2
00bda0e0	cset w0,ne
00bda0e4	ret
00bda0e8	mov w0,#0xffffffff
00bda0ec	ret
00bda0f0	mov w0,#0x1
00bda0f4	ret
