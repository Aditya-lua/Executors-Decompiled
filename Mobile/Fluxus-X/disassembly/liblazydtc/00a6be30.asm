; EVP_PKEY_save_parameters @ 00a6be30
00a6be30	ldr w9,[x0]
00a6be34	mov x8,x0
00a6be38	cmp w9,#0x198
00a6be3c	b.eq 0x00a6be4c
00a6be40	cmp w9,#0x74
00a6be44	mov w0,wzr
00a6be48	b.ne 0x00a6be58
00a6be4c	ldr w0,[x8, #0x48]
00a6be50	tbnz w1,#0x1f,0x00a6be58
00a6be54	str w1,[x8, #0x48]
00a6be58	ret
