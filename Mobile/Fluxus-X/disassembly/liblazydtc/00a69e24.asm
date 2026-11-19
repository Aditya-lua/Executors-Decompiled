; EVP_PBE_get @ 00a69e24
00a69e24	cmp x2,#0x1c
00a69e28	mov w8,wzr
00a69e2c	b.hi 0x00a69e64
00a69e30	cbz x0,0x00a69e48
00a69e34	adrp x9,0xc5e000
00a69e38	lsl x8,x2,#0x5
00a69e3c	add x9,x9,#0x550
00a69e40	ldr w8,[x9, x8#0x0]
00a69e44	str w8,[x0]
00a69e48	cbz x1,0x00a69e60
00a69e4c	adrp x8,0xc5e000
00a69e50	add x8,x8,#0x550
00a69e54	add x8,x8,x2, LSL #0x5
00a69e58	ldr w8,[x8, #0x4]
00a69e5c	str w8,[x1]
00a69e60	mov w8,#0x1
00a69e64	mov w0,w8
00a69e68	ret
