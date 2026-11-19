; psa_pk_status_to_mbedtls @ 00b7ba04
00b7ba04	add w8,w0,#0x99
00b7ba08	cmp w8,#0x14
00b7ba0c	b.hi 0x00b7ba38
00b7ba10	adrp x9,0x780000
00b7ba14	add x9,x9,#0x450
00b7ba18	ldrsw x8,[x9, x8, LSL #0x2]
00b7ba1c	mov w0,#0xffffc300
00b7ba20	add x8,x8,x9
00b7ba24	br x8
00b7ba28	mov w0,#0xffffc200
00b7ba2c	ret
00b7ba30	mov w0,#0xffffff90
00b7ba34	ret
00b7ba38	cbnz w0,0x00b7ba40
00b7ba3c	ret
00b7ba40	mov w0,#0xffffffff
00b7ba44	ret
00b7ba48	mov w0,#0xffffff92
00b7ba4c	ret
00b7ba50	mov w0,#0xffffc780
00b7ba54	ret
00b7ba58	mov w0,#0xffffc180
00b7ba5c	ret
00b7ba60	mov w0,#0xffffc580
00b7ba64	ret
00b7ba68	mov w0,#0xffffc680
00b7ba6c	ret
00b7ba70	mov w0,#0xffffc100
00b7ba74	ret
00b7ba78	mov w0,#0xffffc080
00b7ba7c	ret
