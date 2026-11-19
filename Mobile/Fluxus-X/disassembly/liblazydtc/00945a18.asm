; FUN_00945a18 @ 00945a18
00945a18	ldr x8,[x1, #0x1f0]
00945a1c	str x2,[x0]
00945a20	str wzr,[x0, #0x8]
00945a24	str xzr,[x0, #0x10]
00945a28	strh wzr,[x0, #0x18]
00945a2c	ldrh w9,[x2, #0x38]
00945a30	ldrb w10,[x0, #0x1e]
00945a34	cmp x8,#0x1
00945a38	strh wzr,[x0, #0x1c]
00945a3c	strh w9,[x0, #0x1a]
00945a40	and w9,w10,#0xf8
00945a44	orr w9,w9,#0x1
00945a48	strb w9,[x0, #0x1e]
00945a4c	b.eq 0x00945a88
00945a50	tst x8,#0x1
00945a54	orr w9,wzr,#0x3
00945a58	lsr w12,w8,#0x1
00945a5c	csel w9,wzr,w9,eq
00945a60	lsr w11,w8,#0x3
00945a64	bfm w9,w12,#0x1d,#0x0
00945a68	bfm w9,w11,#0x1a,#0x0
00945a6c	orr w11,w9,#0x180
00945a70	tst x8,#0x40
00945a74	lsr w10,w8,#0x2
00945a78	csel w8,w9,w11,eq
00945a7c	bfm w8,w10,#0x1c,#0x0
00945a80	cbz w8,0x00945a88
00945a84	strh w8,[x0, #0x1a]
00945a88	ret
