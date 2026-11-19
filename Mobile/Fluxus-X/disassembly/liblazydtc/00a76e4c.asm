; EVP_PKEY_CTX_set_mac_key @ 00a76e4c
00a76e4c	ldr x8,[x0, #0x28]
00a76e50	mov w6,w2
00a76e54	adrp x2,0x2a3000
00a76e58	add x2,x2,#0xe83
00a76e5c	cmp x8,#0x0
00a76e60	cset w8,eq
00a76e64	mov w3,#0x4
00a76e68	orr w4,wzr,#0x6
00a76e6c	mov x5,x1
00a76e70	mov w1,w8
00a76e74	b 0x00a766c4
