; ossl_bn_mask_bits_fixed_top @ 00a02878
00a02878	tbnz w1,#0x1f,0x00a028c4
00a0287c	ldr w8,[x0, #0x8]
00a02880	lsr w9,w1,#0x6
00a02884	cmp w9,w8
00a02888	mov w8,wzr
00a0288c	b.ge 0x00a028d4
00a02890	and w8,w1,#0x3f
00a02894	cbz w8,0x00a028cc
00a02898	ldr x11,[x0]
00a0289c	add w10,w9,#0x1
00a028a0	mov w9,w9
00a028a4	str w10,[x0, #0x8]
00a028a8	lsl x9,x9,#0x3
00a028ac	ldr x10,[x11, x9#0x0]
00a028b0	mov x12,#-0x1
00a028b4	lsl x8,x12,x8
00a028b8	bic x8,x10,x8
00a028bc	str x8,[x11, x9#0x0]
00a028c0	b 0x00a028d0
00a028c4	mov w0,wzr
00a028c8	ret
00a028cc	str w9,[x0, #0x8]
00a028d0	mov w8,#0x1
00a028d4	mov w0,w8
00a028d8	ret
