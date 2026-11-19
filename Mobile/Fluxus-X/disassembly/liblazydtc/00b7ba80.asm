; mbedtls_ecc_group_to_psa @ 00b7ba80
00b7ba80	sub w8,w0,#0x1
00b7ba84	cmp w8,#0xc
00b7ba88	b.hi 0x00b7bb38
00b7ba8c	adrp x9,0x780000
00b7ba90	add x9,x9,#0x4a4
00b7ba94	ldrsw x8,[x9, x8, LSL #0x2]
00b7ba98	mov w0,#0x12
00b7ba9c	add x9,x8,x9
00b7baa0	orr w8,wzr,#0xc0
00b7baa4	br x9
00b7baa8	mov w0,#0x12
00b7baac	orr w8,wzr,#0xe0
00b7bab0	str x8,[x1]
00b7bab4	ret
00b7bab8	mov w0,#0x12
00b7babc	mov w8,#0x100
00b7bac0	str x8,[x1]
00b7bac4	ret
00b7bac8	mov w0,#0x12
00b7bacc	orr w8,wzr,#0x180
00b7bad0	str x8,[x1]
00b7bad4	ret
00b7bad8	mov w0,#0x12
00b7badc	mov w8,#0x209
00b7bae0	str x8,[x1]
00b7bae4	ret
00b7bae8	orr w0,wzr,#0x30
00b7baec	mov w8,#0x100
00b7baf0	str x8,[x1]
00b7baf4	ret
00b7baf8	orr w0,wzr,#0x30
00b7bafc	orr w8,wzr,#0x180
00b7bb00	str x8,[x1]
00b7bb04	ret
00b7bb08	orr w0,wzr,#0x30
00b7bb0c	mov w8,#0x200
00b7bb10	str x8,[x1]
00b7bb14	ret
00b7bb18	mov w0,#0x41
00b7bb1c	orr w8,wzr,#0xff
00b7bb20	str x8,[x1]
00b7bb24	ret
00b7bb28	mov w0,#0x17
00b7bb2c	orr w8,wzr,#0xc0
00b7bb30	str x8,[x1]
00b7bb34	ret
00b7bb38	mov x8,xzr
00b7bb3c	mov w0,wzr
00b7bb40	str x8,[x1]
00b7bb44	ret
00b7bb48	mov w0,#0x17
00b7bb4c	mov w8,#0x100
00b7bb50	str x8,[x1]
00b7bb54	ret
00b7bb58	mov w0,#0x41
00b7bb5c	orr w8,wzr,#0x1c0
00b7bb60	str x8,[x1]
00b7bb64	ret
