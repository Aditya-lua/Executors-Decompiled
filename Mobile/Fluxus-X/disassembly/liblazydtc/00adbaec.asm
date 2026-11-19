; RSA_X931_hash_id @ 00adbaec
00adbaec	cmp w0,#0x2a0
00adbaf0	b.gt 0x00adbb0c
00adbaf4	cmp w0,#0x40
00adbaf8	b.eq 0x00adbb2c
00adbafc	cmp w0,#0x2a0
00adbb00	b.ne 0x00adbb24
00adbb04	mov w0,#0x34
00adbb08	ret
00adbb0c	cmp w0,#0x2a1
00adbb10	b.eq 0x00adbb34
00adbb14	cmp w0,#0x2a2
00adbb18	b.ne 0x00adbb24
00adbb1c	mov w0,#0x35
00adbb20	ret
00adbb24	mov w0,#0xffffffff
00adbb28	ret
00adbb2c	mov w0,#0x33
00adbb30	ret
00adbb34	mov w0,#0x36
00adbb38	ret
