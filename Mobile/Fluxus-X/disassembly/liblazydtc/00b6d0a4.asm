; mbedtls_chachapoly_update_aad @ 00b6d0a4
00b6d0a4	ldr w8,[x0, #0xe8]
00b6d0a8	cmp w8,#0x1
00b6d0ac	b.ne 0x00b6d0c8
00b6d0b0	ldr x8,[x0, #0xd8]
00b6d0b4	add x9,x8,x2
00b6d0b8	add x8,x0,#0x88
00b6d0bc	str x9,[x0, #0xd8]
00b6d0c0	mov x0,x8
00b6d0c4	b 0x00c42290
00b6d0c8	mov w0,#0xffffffac
00b6d0cc	ret
