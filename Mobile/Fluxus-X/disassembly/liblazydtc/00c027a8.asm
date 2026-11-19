; std::__ndk1::__num_put_base::__format_int @ 00c027a8
00c027a8	bti c
00c027ac	tbz w3,#0xb,0x00c027d4
00c027b0	mov w8,#0x4a
00c027b4	and w8,w3,w8
00c027b8	cmp w8,#0x8
00c027bc	b.eq 0x00c027d4
00c027c0	cmp w8,#0x40
00c027c4	b.eq 0x00c027d4
00c027c8	tbz w2,#0x0,0x00c027d4
00c027cc	mov w8,#0x2b
00c027d0	strb w8,[x0], #0x1
00c027d4	tbz w3,#0x9,0x00c027e0
00c027d8	mov w8,#0x23
00c027dc	strb w8,[x0], #0x1
00c027e0	ldrb w8,[x1]
00c027e4	cbz w8,0x00c027f8
00c027e8	add x9,x1,#0x1
00c027ec	strb w8,[x0], #0x1
00c027f0	ldrb w8,[x9], #0x1
00c027f4	cbnz w8,0x00c027ec
00c027f8	mov w8,#0x4a
00c027fc	and w8,w3,w8
00c02800	cmp w8,#0x40
00c02804	b.eq 0x00c02828
00c02808	cmp w8,#0x8
00c0280c	b.ne 0x00c02834
00c02810	tst w3,#0x4000
00c02814	mov w8,#0x58
00c02818	mov w9,#0x78
00c0281c	csel w8,w9,w8,eq
00c02820	strb w8,[x0]
00c02824	ret
00c02828	mov w8,#0x6f
00c0282c	strb w8,[x0]
00c02830	ret
00c02834	tst w2,#0x1
00c02838	mov w8,#0x75
00c0283c	mov w9,#0x64
00c02840	csel w8,w9,w8,ne
00c02844	strb w8,[x0]
00c02848	ret
