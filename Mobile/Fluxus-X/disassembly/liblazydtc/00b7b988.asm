; psa_generic_status_to_mbedtls @ 00b7b988
00b7b988	add w8,w0,#0x97
00b7b98c	cmp w8,#0x11
00b7b990	b.hi 0x00b7b9b0
00b7b994	adrp x9,0x780000
00b7b998	add x9,x9,#0x408
00b7b99c	ldrsw x8,[x9, x8, LSL #0x2]
00b7b9a0	add x8,x8,x9
00b7b9a4	br x8
00b7b9a8	mov w0,#0xffffff90
00b7b9ac	ret
00b7b9b0	cbnz w0,0x00b7b9b8
00b7b9b4	ret
00b7b9b8	mov w0,#0xffffffff
00b7b9bc	ret
00b7b9c0	mov w0,#0xffffff92
00b7b9c4	ret
00b7b9c8	mov w0,#0xffffff8e
00b7b9cc	ret
