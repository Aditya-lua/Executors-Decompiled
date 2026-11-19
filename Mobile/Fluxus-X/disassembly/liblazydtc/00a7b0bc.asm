; EVP_PKEY_CTX_set_ec_paramgen_curve_nid @ 00a7b0bc
00a7b0bc	cmp w1,#0x494
00a7b0c0	mov w8,#0x198
00a7b0c4	mov w4,w1
00a7b0c8	orr w2,wzr,#0x6
00a7b0cc	csel w1,w1,w8,eq
00a7b0d0	mov w3,#0x1001
00a7b0d4	mov x5,xzr
00a7b0d8	b 0x00c370f0
