; EVP_PKEY_CTX_set1_tls1_prf_secret @ 00a76698
00a76698	ldr x8,[x0, #0x30]
00a7669c	mov w6,w2
00a766a0	adrp x2,0x2cd000
00a766a4	add x2,x2,#0x6e9
00a766a8	cmp x8,#0x0
00a766ac	cset w8,eq
00a766b0	mov w3,#0x800
00a766b4	mov w4,#0x1001
00a766b8	mov x5,x1
00a766bc	mov w1,w8
00a766c0	b 0x00a766c4
