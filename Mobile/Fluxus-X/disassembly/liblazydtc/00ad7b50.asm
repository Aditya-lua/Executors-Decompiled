; RSA_generate_key_ex @ 00ad7b50
00ad7b50	ldr x8,[x0, #0x18]
00ad7b54	mov x4,x3
00ad7b58	mov x3,x2
00ad7b5c	ldr x5,[x8, #0x68]
00ad7b60	cbz x5,0x00ad7b70
00ad7b64	mov x2,x3
00ad7b68	mov x3,x4
00ad7b6c	br x5
00ad7b70	mov w2,#0x2
00ad7b74	b 0x00ad7b78
