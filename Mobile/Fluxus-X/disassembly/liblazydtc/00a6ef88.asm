; EVP_PKEY_up_ref @ 00a6ef88
00a6ef88	add x8,x0,#0x30
00a6ef8c	ldxr w9,[x8]
00a6ef90	add w10,w9,#0x1
00a6ef94	stxr w11,w10,[x8]
00a6ef98	cbnz w11,0x00a6ef8c
00a6ef9c	cmp w9,#0x0
00a6efa0	cset w0,gt
00a6efa4	ret
