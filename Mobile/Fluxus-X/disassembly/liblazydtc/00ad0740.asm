; RSA_size @ 00ad0740
00ad0740	stp x29,x30,[sp, #-0x10]!
00ad0744	ldr x0,[x0, #0x28]
00ad0748	mov x29,sp
00ad074c	bl 0x00c322f0
00ad0750	add w8,w0,#0x7
00ad0754	add w9,w0,#0xe
00ad0758	cmp w8,#0x0
00ad075c	csel w8,w9,w8,lt
00ad0760	asr w0,w8,#0x3
00ad0764	ldp x29,x30,[sp], #0x10
00ad0768	ret
