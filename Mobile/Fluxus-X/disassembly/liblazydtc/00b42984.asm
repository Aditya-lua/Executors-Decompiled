; ossl_prov_free_key @ 00b42984
00b42984	add x8,x0,#0x8
00b42988	ldur w9,[x8, #-0x8]
00b4298c	cbnz w9,0x00b429a0
00b42990	b 0x00b429b8
00b42994	add x8,x8,#0x10
00b42998	ldur w9,[x8, #-0x8]
00b4299c	cbz w9,0x00b429b8
00b429a0	cmp w9,#0xa
00b429a4	b.ne 0x00b42994
00b429a8	ldr x2,[x8]
00b429ac	cbz x2,0x00b429b8
00b429b0	mov x0,x1
00b429b4	br x2
00b429b8	ret
