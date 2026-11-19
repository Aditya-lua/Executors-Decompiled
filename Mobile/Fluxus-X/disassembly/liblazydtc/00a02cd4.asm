; BN_abs_is_word @ 00a02cd4
00a02cd4	ldr w8,[x0, #0x8]
00a02cd8	cmp w8,#0x1
00a02cdc	b.ne 0x00a02cf8
00a02ce0	ldr x9,[x0]
00a02ce4	ldr x9,[x9]
00a02ce8	cmp x9,x1
00a02cec	b.ne 0x00a02cf8
00a02cf0	mov w0,#0x1
00a02cf4	ret
00a02cf8	mov w0,wzr
00a02cfc	cbz x1,0x00a02d04
00a02d00	ret
00a02d04	cmp w8,#0x0
00a02d08	cset w0,eq
00a02d0c	ret
