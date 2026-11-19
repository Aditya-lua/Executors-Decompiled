; ossl_ec_wNAF_have_precompute_mult @ 00a34a74
00a34a74	ldr w8,[x0, #0x98]
00a34a78	cmp w8,#0x5
00a34a7c	mov w8,wzr
00a34a80	b.ne 0x00a34a90
00a34a84	ldr x8,[x0, #0xa0]
00a34a88	cmp x8,#0x0
00a34a8c	cset w8,ne
00a34a90	mov w0,w8
00a34a94	ret
