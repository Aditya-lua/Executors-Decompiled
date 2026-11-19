; EVP_CIPHER_CTX_rand_key @ 00a5c990
00a5c990	str x21,[sp, #-0x30]!
00a5c994	stp x20,x19,[sp, #0x10]
00a5c998	stp x29,x30,[sp, #0x20]
00a5c99c	mov x20,x0
00a5c9a0	ldr x0,[x0]
00a5c9a4	mov x19,x1
00a5c9a8	add x29,sp,#0x20
00a5c9ac	ldrb w8,[x0, #0x11]
00a5c9b0	tbnz w8,#0x1,0x00a5c9c8
00a5c9b4	cbz x0,0x00a5c9e8
00a5c9b8	bl 0x00c34bb0
00a5c9bc	bl 0x00c3b2f0
00a5c9c0	mov x21,x0
00a5c9c4	b 0x00a5c9ec
00a5c9c8	mov x0,x20
00a5c9cc	mov x3,x19
00a5c9d0	ldp x29,x30,[sp, #0x20]
00a5c9d4	ldp x20,x19,[sp, #0x10]
00a5c9d8	orr w1,wzr,#0x6
00a5c9dc	mov w2,wzr
00a5c9e0	ldr x21,[sp], #0x30
00a5c9e4	b 0x00a5c100
00a5c9e8	mov x21,xzr
00a5c9ec	mov x0,x20
00a5c9f0	bl 0x00c3cca0
00a5c9f4	cmp w0,#0x1
00a5c9f8	b.lt 0x00a5ca1c
00a5c9fc	sxtw x2,w0
00a5ca00	mov x0,x21
00a5ca04	mov x1,x19
00a5ca08	mov w3,wzr
00a5ca0c	bl 0x00c358b0
00a5ca10	cmp w0,#0x0
00a5ca14	cset w0,gt
00a5ca18	b 0x00a5ca20
00a5ca1c	mov w0,wzr
00a5ca20	ldp x29,x30,[sp, #0x20]
00a5ca24	ldp x20,x19,[sp, #0x10]
00a5ca28	ldr x21,[sp], #0x30
00a5ca2c	ret
