; std::__ndk1::__num_put_base::__identify_padding @ 00be53b0
00be53b0	bti c
00be53b4	ldr w8,[x2, #0x8]
00be53b8	mov w9,#0xb0
00be53bc	and w8,w8,w9
00be53c0	cmp w8,#0x20
00be53c4	b.eq 0x00be53ec
00be53c8	cmp w8,#0x10
00be53cc	b.ne 0x00be541c
00be53d0	ldrb w8,[x0]
00be53d4	cmp w8,#0x2d
00be53d8	b.eq 0x00be53e4
00be53dc	cmp w8,#0x2b
00be53e0	b.ne 0x00be53f4
00be53e4	add x0,x0,#0x1
00be53e8	ret
00be53ec	mov x0,x1
00be53f0	ret
00be53f4	sub x9,x1,x0
00be53f8	cmp x9,#0x2
00be53fc	b.lt 0x00be541c
00be5400	cmp w8,#0x30
00be5404	b.ne 0x00be541c
00be5408	ldrb w8,[x0, #0x1]
00be540c	orr w8,w8,#0x20
00be5410	cmp w8,#0x78
00be5414	b.ne 0x00be541c
00be5418	add x0,x0,#0x2
00be541c	ret
