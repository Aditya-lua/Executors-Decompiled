; EVP_PKEY_CTX_add1_tls1_prf_seed @ 00a76854
00a76854	ldr x8,[x0, #0x30]
00a76858	mov w6,w2
00a7685c	adrp x2,0x2bb000
00a76860	add x2,x2,#0x864
00a76864	cmp x8,#0x0
00a76868	cset w8,eq
00a7686c	mov w3,#0x800
00a76870	mov w4,#0x1002
00a76874	mov x5,x1
00a76878	mov w1,w8
00a7687c	b 0x00a766c4
