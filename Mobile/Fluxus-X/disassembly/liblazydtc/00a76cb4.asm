; EVP_PKEY_CTX_set1_pbe_pass @ 00a76cb4
00a76cb4	ldr x8,[x0, #0x30]
00a76cb8	mov w6,w2
00a76cbc	adrp x2,0x2c3000
00a76cc0	add x2,x2,#0xa6a
00a76cc4	cmp x8,#0x0
00a76cc8	cset w8,eq
00a76ccc	mov w3,#0x800
00a76cd0	mov w4,#0x1008
00a76cd4	mov x5,x1
00a76cd8	mov w1,w8
00a76cdc	b 0x00a766c4
