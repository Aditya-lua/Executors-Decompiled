; UTF8_getc @ 009f0034
009f0034	cmp w1,#0x1
009f0038	b.lt 0x009f0054
009f003c	ldrb w8,[x0]
009f0040	tbnz w8,#0x7,0x009f005c
009f0044	and w8,w8,#0x7f
009f0048	mov w0,#0x1
009f004c	str x8,[x2]
009f0050	ret
009f0054	mov w0,wzr
009f0058	ret
009f005c	and w9,w8,#0xe0
009f0060	cmp w9,#0xc0
009f0064	b.ne 0x009f0078
009f0068	cmp w1,#0x2
009f006c	b.ge 0x009f0094
009f0070	mov w0,#0xffffffff
009f0074	ret
009f0078	and w9,w8,#0xf0
009f007c	cmp w9,#0xe0
009f0080	b.ne 0x009f00bc
009f0084	cmp w1,#0x3
009f0088	b.ge 0x009f00d8
009f008c	mov w0,#0xffffffff
009f0090	ret
009f0094	ldrb w9,[x0, #0x1]
009f0098	and w10,w9,#0xc0
009f009c	cmp w10,#0x80
009f00a0	b.ne 0x009f011c
009f00a4	ubfiz w8,w8,#0x6,#0x5
009f00a8	bfxil x8,x9,#0x0,#0x6
009f00ac	cmp x8,#0x80
009f00b0	b.cs 0x009f012c
009f00b4	orr w0,wzr,#0xfffffffc
009f00b8	ret
009f00bc	and w9,w8,#0xf8
009f00c0	cmp w9,#0xf0
009f00c4	b.ne 0x009f0124
009f00c8	cmp w1,#0x4
009f00cc	b.ge 0x009f0138
009f00d0	mov w0,#0xffffffff
009f00d4	ret
009f00d8	ldrb w9,[x0, #0x1]
009f00dc	and w10,w9,#0xc0
009f00e0	cmp w10,#0x80
009f00e4	b.ne 0x009f0190
009f00e8	ldrb w10,[x0, #0x2]
009f00ec	and w11,w10,#0xc0
009f00f0	cmp w11,#0x80
009f00f4	b.ne 0x009f0198
009f00f8	ubfiz w11,w8,#0xc,#0x4
009f00fc	and x8,x9,#0x3f
009f0100	bfm x11,x8,#0x3a,#0x5
009f0104	mov x8,x11
009f0108	bfxil x8,x10,#0x0,#0x6
009f010c	cmp x8,#0x800
009f0110	b.cs 0x009f01a8
009f0114	orr w0,wzr,#0xfffffffc
009f0118	ret
009f011c	orr w0,wzr,#0xfffffffd
009f0120	ret
009f0124	orr w0,wzr,#0xfffffffe
009f0128	ret
009f012c	mov w0,#0x2
009f0130	str x8,[x2]
009f0134	ret
009f0138	ldrb w9,[x0, #0x1]
009f013c	and w10,w9,#0xc0
009f0140	cmp w10,#0x80
009f0144	b.ne 0x009f01a0
009f0148	ldrb w10,[x0, #0x2]
009f014c	and w11,w10,#0xc0
009f0150	cmp w11,#0x80
009f0154	b.ne 0x009f01c0
009f0158	ldrb w11,[x0, #0x3]
009f015c	and w12,w11,#0xc0
009f0160	cmp w12,#0x80
009f0164	b.ne 0x009f01c8
009f0168	ubfiz w8,w8,#0x12,#0x3
009f016c	and x9,x9,#0x3f
009f0170	bfm x8,x9,#0x34,#0x5
009f0174	and x9,x10,#0x3f
009f0178	bfm x8,x9,#0x3a,#0x5
009f017c	bfxil x8,x11,#0x0,#0x6
009f0180	cmp x8,#0x10, LSL #12
009f0184	b.cs 0x009f01dc
009f0188	orr w0,wzr,#0xfffffffc
009f018c	ret
009f0190	orr w0,wzr,#0xfffffffd
009f0194	ret
009f0198	orr w0,wzr,#0xfffffffd
009f019c	ret
009f01a0	orr w0,wzr,#0xfffffffd
009f01a4	ret
009f01a8	and x9,x11,#0xf800
009f01ac	mov w10,#0xd800
009f01b0	cmp x9,x10
009f01b4	b.ne 0x009f01d0
009f01b8	orr w0,wzr,#0xfffffffe
009f01bc	ret
009f01c0	orr w0,wzr,#0xfffffffd
009f01c4	ret
009f01c8	orr w0,wzr,#0xfffffffd
009f01cc	ret
009f01d0	orr w0,wzr,#0x3
009f01d4	str x8,[x2]
009f01d8	ret
009f01dc	mov w0,#0x4
009f01e0	str x8,[x2]
009f01e4	ret
