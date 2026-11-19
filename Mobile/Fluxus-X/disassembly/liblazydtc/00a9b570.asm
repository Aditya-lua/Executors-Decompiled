; OPENSSL_strnlen @ 00a9b570
00a9b570	mov x8,x0
00a9b574	cbz x1,0x00a9b590
00a9b578	mov x8,x0
00a9b57c	ldrb w9,[x8]
00a9b580	cbz w9,0x00a9b590
00a9b584	sub x1,x1,#0x1
00a9b588	add x8,x8,#0x1
00a9b58c	cbnz x1,0x00a9b57c
00a9b590	sub x0,x8,x0
00a9b594	ret
