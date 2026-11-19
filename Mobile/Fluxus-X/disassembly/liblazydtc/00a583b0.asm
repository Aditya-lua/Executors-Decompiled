; EVP_MD_CTX_set_params @ 00a583b0
00a583b0	ldr x9,[x0, #0x28]
00a583b4	cbz x9,0x00a583e8
00a583b8	ldr w8,[x9]
00a583bc	cmp w8,#0x100
00a583c0	b.eq 0x00a583cc
00a583c4	cmp w8,#0x80
00a583c8	b.ne 0x00a583e8
00a583cc	ldr x8,[x9, #0x30]
00a583d0	cbz x8,0x00a583e8
00a583d4	ldr x9,[x9, #0x28]
00a583d8	ldr x2,[x9, #0xe8]
00a583dc	cbz x2,0x00a583e8
00a583e0	mov x0,x8
00a583e4	br x2
00a583e8	ldr x8,[x0, #0x8]
00a583ec	cbz x8,0x00a58400
00a583f0	ldr x2,[x8, #0xc8]
00a583f4	cbz x2,0x00a58400
00a583f8	ldr x0,[x0, #0x38]
00a583fc	br x2
00a58400	mov w0,wzr
00a58404	ret
