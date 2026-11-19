; psa_is_valid_key_id @ 00ba2cb0
00ba2cb0	sub w8,w0,#0x1
00ba2cb4	orr w9,wzr,#0x3fffffff
00ba2cb8	cmp w8,w9
00ba2cbc	b.cs 0x00ba2cc8
00ba2cc0	mov w0,#0x1
00ba2cc4	ret
00ba2cc8	cmp w1,#0x0
00ba2ccc	lsr w8,w0,#0x1e
00ba2cd0	cset w9,ne
00ba2cd4	cmp w8,#0x0
00ba2cd8	cset w8,ne
00ba2cdc	cmp w0,#0x0
00ba2ce0	and w8,w8,w9
00ba2ce4	cset w9,ge
00ba2ce8	and w0,w9,w8
00ba2cec	ret
