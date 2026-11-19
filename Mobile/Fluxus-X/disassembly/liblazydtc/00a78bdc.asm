; ossl_dh_get_named_group_uid_from_size @ 00a78bdc
00a78bdc	sub w9,w0,#0x800
00a78be0	ror w8,w9,#0xa
00a78be4	cmp w8,#0x6
00a78be8	mov w0,wzr
00a78bec	b.hi 0x00a78c10
00a78bf0	ubfx x9,x9,#0xa,#0x8
00a78bf4	mov w10,#0x57
00a78bf8	lsr w9,w10,w9
00a78bfc	mov w0,wzr
00a78c00	tbz w9,#0x0,0x00a78c10
00a78c04	adrp x9,0x766000
00a78c08	add x9,x9,#0x920
00a78c0c	ldr w0,[x9, w8, SXTW #0x2]
00a78c10	ret
