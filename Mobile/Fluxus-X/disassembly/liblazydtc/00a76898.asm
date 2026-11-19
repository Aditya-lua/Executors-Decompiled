; EVP_PKEY_CTX_set1_hkdf_salt @ 00a76898
00a76898	ldr x8,[x0, #0x30]
00a7689c	mov w6,w2
00a768a0	adrp x2,0x2a7000
00a768a4	add x2,x2,#0xb6c
00a768a8	cmp x8,#0x0
00a768ac	cset w8,eq
00a768b0	mov w3,#0x800
00a768b4	mov w4,#0x1004
00a768b8	mov x5,x1
00a768bc	mov w1,w8
00a768c0	b 0x00a766c4
