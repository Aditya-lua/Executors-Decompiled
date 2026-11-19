; ossl_gcm_cipher_update @ 00b680e4
00b680e4	stp x29,x30,[sp, #-0x10]!
00b680e8	ldrb w9,[x0, #0x54]
00b680ec	mov x8,x2
00b680f0	add x0,x0,#0xf8
00b680f4	mov x2,x3
00b680f8	mov x3,x8
00b680fc	mov x29,sp
00b68100	tbnz w9,#0x0,0x00b6810c
00b68104	bl 0x00c3e340
00b68108	b 0x00b68110
00b6810c	bl 0x00c3e360
00b68110	mov w8,w0
00b68114	mov w0,wzr
00b68118	cbz w8,0x00b68124
00b6811c	ldp x29,x30,[sp], #0x10
00b68120	ret
00b68124	mov w0,#0x1
00b68128	ldp x29,x30,[sp], #0x10
00b6812c	ret
