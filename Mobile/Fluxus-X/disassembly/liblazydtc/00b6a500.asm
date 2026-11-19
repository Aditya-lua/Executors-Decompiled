; mbedtls_cipher_set_padding_mode @ 00b6a500
00b6a500	ldr x9,[x0]
00b6a504	mov x8,x0
00b6a508	cbz x9,0x00b6a558
00b6a50c	ldr w9,[x9, #0x8]
00b6a510	and w9,w9,#0xf000
00b6a514	cmp w9,#0x2, LSL #12
00b6a518	b.ne 0x00b6a560
00b6a51c	cmp w1,#0x4
00b6a520	b.hi 0x00b6a568
00b6a524	adrp x10,0x77c000
00b6a528	mov w9,w1
00b6a52c	add x10,x10,#0x8c0
00b6a530	ldrsw x9,[x10, x9, LSL #0x2]
00b6a534	add x9,x9,x10
00b6a538	br x9
00b6a53c	adrp x9,0xb6a000
00b6a540	adrp x10,0xb6a000
00b6a544	mov w0,wzr
00b6a548	add x9,x9,#0x5d8
00b6a54c	add x10,x10,#0x664
00b6a550	stp x9,x10,[x8, #0x10]
00b6a554	ret
00b6a558	mov w0,#0xffff9f00
00b6a55c	ret
00b6a560	mov w0,#0xffff9f00
00b6a564	ret
00b6a568	mov w0,#0xffff9f80
00b6a56c	ret
00b6a570	adrp x9,0xb6a000
00b6a574	adrp x10,0xb6a000
00b6a578	mov w0,wzr
00b6a57c	add x9,x9,#0x740
00b6a580	add x10,x10,#0x7f8
00b6a584	stp x9,x10,[x8, #0x10]
00b6a588	ret
00b6a58c	adrp x9,0xb6a000
00b6a590	adrp x10,0xb6a000
00b6a594	mov w0,wzr
00b6a598	add x9,x9,#0x8a8
00b6a59c	add x10,x10,#0x964
00b6a5a0	stp x9,x10,[x8, #0x10]
00b6a5a4	ret
00b6a5a8	adrp x9,0xb6a000
00b6a5ac	adrp x10,0xb6a000
00b6a5b0	mov w0,wzr
00b6a5b4	add x9,x9,#0xa0c
00b6a5b8	add x10,x10,#0xa1c
00b6a5bc	stp x9,x10,[x8, #0x10]
00b6a5c0	ret
00b6a5c4	adrp x9,0xb6a000
00b6a5c8	mov w0,wzr
00b6a5cc	add x9,x9,#0xa8c
00b6a5d0	stp xzr,x9,[x8, #0x10]
00b6a5d4	ret
