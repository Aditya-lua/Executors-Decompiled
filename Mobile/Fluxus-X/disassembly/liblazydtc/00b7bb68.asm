; mbedtls_ecc_group_from_psa @ 00b7bb68
00b7bb68	and w8,w0,#0xff
00b7bb6c	cmp w8,#0x2f
00b7bb70	b.gt 0x00b7bba0
00b7bb74	cmp w8,#0x12
00b7bb78	b.eq 0x00b7bbcc
00b7bb7c	cmp w8,#0x17
00b7bb80	b.ne 0x00b7bc2c
00b7bb84	cmp x1,#0x100
00b7bb88	orr w8,wzr,#0xc
00b7bb8c	csel w8,w8,wzr,eq
00b7bb90	cmp x1,#0xc0
00b7bb94	mov w9,#0xa
00b7bb98	csel w0,w9,w8,eq
00b7bb9c	ret
00b7bba0	cmp w8,#0x30
00b7bba4	b.eq 0x00b7bbf4
00b7bba8	cmp w8,#0x41
00b7bbac	b.ne 0x00b7bc2c
00b7bbb0	cmp x1,#0x1c0
00b7bbb4	mov w8,#0xd
00b7bbb8	csel w8,w8,wzr,eq
00b7bbbc	cmp x1,#0xff
00b7bbc0	mov w9,#0x9
00b7bbc4	csel w0,w9,w8,eq
00b7bbc8	ret
00b7bbcc	cmp x1,#0xff
00b7bbd0	b.le 0x00b7bc14
00b7bbd4	cmp x1,#0x100
00b7bbd8	b.eq 0x00b7bc44
00b7bbdc	cmp x1,#0x180
00b7bbe0	b.eq 0x00b7bc4c
00b7bbe4	cmp x1,#0x209
00b7bbe8	b.ne 0x00b7bc2c
00b7bbec	mov w0,#0x5
00b7bbf0	ret
00b7bbf4	cmp x1,#0x100
00b7bbf8	b.eq 0x00b7bc3c
00b7bbfc	cmp x1,#0x200
00b7bc00	b.eq 0x00b7bc34
00b7bc04	cmp x1,#0x180
00b7bc08	b.ne 0x00b7bc2c
00b7bc0c	orr w0,wzr,#0x7
00b7bc10	ret
00b7bc14	cmp x1,#0xc0
00b7bc18	b.eq 0x00b7bc54
00b7bc1c	cmp x1,#0xe0
00b7bc20	b.ne 0x00b7bc2c
00b7bc24	mov w0,#0x2
00b7bc28	ret
00b7bc2c	mov w0,wzr
00b7bc30	ret
00b7bc34	mov w0,#0x8
00b7bc38	ret
00b7bc3c	orr w0,wzr,#0x6
00b7bc40	ret
00b7bc44	orr w0,wzr,#0x3
00b7bc48	ret
00b7bc4c	mov w0,#0x4
00b7bc50	ret
00b7bc54	mov w0,#0x1
00b7bc58	ret
