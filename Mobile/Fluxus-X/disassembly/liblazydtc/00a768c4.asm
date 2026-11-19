; EVP_PKEY_CTX_set1_hkdf_key @ 00a768c4
00a768c4	ldr x8,[x0, #0x30]
00a768c8	mov w6,w2
00a768cc	adrp x2,0x2c5000
00a768d0	add x2,x2,#0x67e
00a768d4	cmp x8,#0x0
00a768d8	cset w8,eq
00a768dc	mov w3,#0x800
00a768e0	mov w4,#0x1005
00a768e4	mov x5,x1
00a768e8	mov w1,w8
00a768ec	b 0x00a766c4
