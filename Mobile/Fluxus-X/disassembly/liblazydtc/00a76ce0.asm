; EVP_PKEY_CTX_set1_scrypt_salt @ 00a76ce0
00a76ce0	ldr x8,[x0, #0x30]
00a76ce4	mov w6,w2
00a76ce8	adrp x2,0x2a7000
00a76cec	add x2,x2,#0xb6c
00a76cf0	cmp x8,#0x0
00a76cf4	cset w8,eq
00a76cf8	mov w3,#0x800
00a76cfc	mov w4,#0x1009
00a76d00	mov x5,x1
00a76d04	mov w1,w8
00a76d08	b 0x00a766c4
