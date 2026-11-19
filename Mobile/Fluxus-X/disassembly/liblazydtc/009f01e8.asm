; UTF8_putc @ 009f01e8
009f01e8	cbz x0,0x009f0210
009f01ec	cmp w1,#0x1
009f01f0	b.lt 0x009f025c
009f01f4	cmp x2,#0x7f
009f01f8	b.hi 0x009f021c
009f01fc	cbz x0,0x009f0288
009f0200	mov w8,#0x1
009f0204	strb w2,[x0]
009f0208	mov w0,w8
009f020c	ret
009f0210	mov w1,#0x4
009f0214	cmp x2,#0x7f
009f0218	b.ls 0x009f01fc
009f021c	cmp x2,#0x7ff
009f0220	b.hi 0x009f0268
009f0224	cmp w1,#0x2
009f0228	mov w8,#0x2
009f022c	csinv w8,w8,wzr,ge
009f0230	b.lt 0x009f032c
009f0234	cbz x0,0x009f032c
009f0238	orr w8,wzr,#0xc0
009f023c	mov w9,#0x80
009f0240	bfxil w8,w2,#0x6,#0x5
009f0244	bfxil w9,w2,#0x0,#0x6
009f0248	strb w8,[x0]
009f024c	mov w8,#0x2
009f0250	strb w9,[x0, #0x1]
009f0254	mov w0,w8
009f0258	ret
009f025c	mov w8,#0xffffffff
009f0260	mov w0,w8
009f0264	ret
009f0268	lsr x8,x2,#0x10
009f026c	cbnz x8,0x009f0294
009f0270	lsr x8,x2,#0xb
009f0274	cmp x8,#0x1b
009f0278	b.ne 0x009f02e8
009f027c	orr w8,wzr,#0xfffffffe
009f0280	mov w0,w8
009f0284	ret
009f0288	mov w8,#0x1
009f028c	mov w0,w8
009f0290	ret
009f0294	cmp x8,#0x10
009f0298	b.hi 0x009f0334
009f029c	cmp w1,#0x4
009f02a0	mov w8,#0x4
009f02a4	csinv w8,w8,wzr,ge
009f02a8	b.lt 0x009f032c
009f02ac	cbz x0,0x009f032c
009f02b0	orr w8,wzr,#0xf0
009f02b4	mov w9,#0x80
009f02b8	mov w10,#0x80
009f02bc	mov w11,#0x80
009f02c0	bfxil w8,w2,#0x12,#0x3
009f02c4	bfxil w10,w2,#0xc,#0x6
009f02c8	bfxil w11,w2,#0x6,#0x6
009f02cc	bfxil w9,w2,#0x0,#0x6
009f02d0	strb w8,[x0]
009f02d4	mov w8,#0x4
009f02d8	strb w10,[x0, #0x1]
009f02dc	strb w11,[x0, #0x2]
009f02e0	strb w9,[x0, #0x3]
009f02e4	b 0x009f032c
009f02e8	cmp w1,#0x3
009f02ec	orr w8,wzr,#0x3
009f02f0	csinv w8,w8,wzr,ge
009f02f4	b.lt 0x009f032c
009f02f8	cbz x0,0x009f032c
009f02fc	orr w8,wzr,#0xe0
009f0300	mov w9,#0x80
009f0304	mov w10,#0x80
009f0308	bfxil w8,w2,#0xc,#0x4
009f030c	bfxil w10,w2,#0x6,#0x6
009f0310	bfxil w9,w2,#0x0,#0x6
009f0314	strb w8,[x0]
009f0318	orr w8,wzr,#0x3
009f031c	strb w10,[x0, #0x1]
009f0320	strb w9,[x0, #0x2]
009f0324	mov w0,w8
009f0328	ret
009f032c	mov w0,w8
009f0330	ret
009f0334	orr w8,wzr,#0xfffffffe
009f0338	mov w0,w8
009f033c	ret
