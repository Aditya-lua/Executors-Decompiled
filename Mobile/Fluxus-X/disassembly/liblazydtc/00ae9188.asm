; OPENSSL_sk_pop @ 00ae9188
00ae9188	cbz x0,0x00ae91ac
00ae918c	ldr w8,[x0]
00ae9190	cbz w8,0x00ae91b4
00ae9194	ldr x9,[x0, #0x8]
00ae9198	sub w10,w8,#0x1
00ae919c	ldr x8,[x9, w10, SXTW #0x3]
00ae91a0	str w10,[x0]
00ae91a4	mov x0,x8
00ae91a8	ret
00ae91ac	mov x0,xzr
00ae91b0	ret
00ae91b4	mov x0,xzr
00ae91b8	ret
