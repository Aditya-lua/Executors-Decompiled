; OPENSSL_sk_value @ 00ae9290
00ae9290	mov x8,x0
00ae9294	mov x0,xzr
00ae9298	cbz x8,0x00ae92b8
00ae929c	tbnz w1,#0x1f,0x00ae92b8
00ae92a0	ldr w9,[x8]
00ae92a4	mov x0,xzr
00ae92a8	cmp w9,w1
00ae92ac	b.le 0x00ae92b8
00ae92b0	ldr x8,[x8, #0x8]
00ae92b4	ldr x0,[x8, w1, SXTW #0x3]
00ae92b8	ret
