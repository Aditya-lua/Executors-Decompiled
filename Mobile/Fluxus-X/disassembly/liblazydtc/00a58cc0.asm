; EVP_MD_CTX_get_params @ 00a58cc0
00a58cc0	ldr x9,[x0, #0x28]
00a58cc4	cbz x9,0x00a58cf8
00a58cc8	ldr w8,[x9]
00a58ccc	cmp w8,#0x100
00a58cd0	b.eq 0x00a58cdc
00a58cd4	cmp w8,#0x80
00a58cd8	b.ne 0x00a58cf8
00a58cdc	ldr x8,[x9, #0x30]
00a58ce0	cbz x8,0x00a58cf8
00a58ce4	ldr x9,[x9, #0x28]
00a58ce8	ldr x2,[x9, #0xd8]
00a58cec	cbz x2,0x00a58cf8
00a58cf0	mov x0,x8
00a58cf4	br x2
00a58cf8	ldr x8,[x0, #0x8]
00a58cfc	cbz x8,0x00a58d10
00a58d00	ldr x2,[x8, #0xd0]
00a58d04	cbz x2,0x00a58d10
00a58d08	ldr x0,[x0, #0x38]
00a58d0c	br x2
00a58d10	mov w0,wzr
00a58d14	ret
