; CRYPTO_ccm128_init @ 00aa78bc
00aa78bc	lsl w9,w1,#0x2
00aa78c0	add w9,w9,#0x38
00aa78c4	sub w8,w2,#0x1
00aa78c8	and w9,w9,#0x38
00aa78cc	bfxil w9,w8,#0x0,#0x3
00aa78d0	stp xzr,xzr,[x0]
00aa78d4	stp xzr,x4,[x0, #0x20]
00aa78d8	strb w9,[x0]
00aa78dc	str x3,[x0, #0x30]
00aa78e0	ret
