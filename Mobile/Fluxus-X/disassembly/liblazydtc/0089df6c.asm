; FUN_0089df6c @ 0089df6c
0089df6c	cmp w1,#0x2
0089df70	b.eq 0x0089dfe4
0089df74	cmp w1,#0x1
0089df78	b.eq 0x0089dfb8
0089df7c	cbnz w1,0x0089e004
0089df80	ldr w8,[x2]
0089df84	cbz w8,0x0089e004
0089df88	mov w8,#0x2
0089df8c	str w8,[x0]
0089df90	ldr w8,[x2]
0089df94	cmp w8,#0x1
0089df98	b.eq 0x0089e07c
0089df9c	cmp w8,#0x2
0089dfa0	b.ne 0x0089e078
0089dfa4	ldrb w8,[x2, #0x8]
0089dfa8	cmp w8,#0x0
0089dfac	cset w8,eq
0089dfb0	strb w8,[x0, #0x8]
0089dfb4	ret
0089dfb8	ldr w8,[x2]
0089dfbc	cmp w8,#0x5
0089dfc0	b.eq 0x0089e040
0089dfc4	cmp w8,#0x4
0089dfc8	b.eq 0x0089e008
0089dfcc	cmp w8,#0x3
0089dfd0	b.ne 0x0089e004
0089dfd4	str w8,[x0]
0089dfd8	ldr d0,[x2, #0x8]
0089dfdc	fneg d0,d0
0089dfe0	b 0x0089e000
0089dfe4	ldr w8,[x2]
0089dfe8	cmp w8,#0x6
0089dfec	b.ne 0x0089e004
0089dff0	ldr s0,[x2, #0x4]
0089dff4	mov w8,#0x3
0089dff8	str w8,[x0]
0089dffc	ucvtf d0,d0
0089e000	str d0,[x0, #0x8]
0089e004	ret
0089e008	str w8,[x0]
0089e00c	ldr s0,[x2, #0x8]
0089e010	fneg s0,s0
0089e014	str s0,[x0, #0x8]
0089e018	ldr s0,[x2, #0xc]
0089e01c	fneg s0,s0
0089e020	str s0,[x0, #0xc]
0089e024	ldr s0,[x2, #0x10]
0089e028	fneg s0,s0
0089e02c	str s0,[x0, #0x10]
0089e030	ldr s0,[x2, #0x14]
0089e034	fneg s0,s0
0089e038	str s0,[x0, #0x14]
0089e03c	ret
0089e040	str w8,[x0]
0089e044	ldr d0,[x2, #0x8]
0089e048	fneg d0,d0
0089e04c	str d0,[x0, #0x8]
0089e050	ldr d0,[x2, #0x10]
0089e054	fneg d0,d0
0089e058	str d0,[x0, #0x10]
0089e05c	ldr d0,[x2, #0x18]
0089e060	fneg d0,d0
0089e064	str d0,[x0, #0x18]
0089e068	ldr d0,[x2, #0x20]
0089e06c	fneg d0,d0
0089e070	str d0,[x0, #0x20]
0089e074	ret
0089e078	mov w8,wzr
0089e07c	strb w8,[x0, #0x8]
0089e080	ret
