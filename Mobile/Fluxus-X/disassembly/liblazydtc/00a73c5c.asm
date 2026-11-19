; ossl_dh_gen_type_id2name @ 00a73c5c
00a73c5c	cmp w0,#0x3
00a73c60	mov x8,xzr
00a73c64	b.hi 0x00a73c84
00a73c68	adrp x8,0x364000
00a73c6c	add x8,x8,#0xdf0
00a73c70	ldr x8,[x8, w0, SXTW #0x3]
00a73c74	adrp x9,0xc60000
00a73c78	add x9,x9,#0xcc8
00a73c7c	lsl x8,x8,#0x4
00a73c80	ldr x8,[x9, x8#0x0]
00a73c84	mov x0,x8
00a73c88	ret
