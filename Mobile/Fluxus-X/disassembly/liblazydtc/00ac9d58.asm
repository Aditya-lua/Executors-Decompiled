; EVP_RAND_uninstantiate @ 00ac9d58
00ac9d58	stp x20,x19,[sp, #-0x20]!
00ac9d5c	stp x29,x30,[sp, #0x10]
00ac9d60	ldr x8,[x0]
00ac9d64	mov x19,x0
00ac9d68	add x29,sp,#0x10
00ac9d6c	ldr x9,[x8, #0x78]
00ac9d70	cbz x9,0x00ac9d84
00ac9d74	ldr x0,[x19, #0x8]
00ac9d78	blr x9
00ac9d7c	cbz w0,0x00ac9dac
00ac9d80	ldr x8,[x19]
00ac9d84	ldr x8,[x8, #0x50]
00ac9d88	ldr x0,[x19, #0x8]
00ac9d8c	blr x8
00ac9d90	ldr x8,[x19]
00ac9d94	mov w20,w0
00ac9d98	ldr x8,[x8, #0x80]
00ac9d9c	cbz x8,0x00ac9db0
00ac9da0	ldr x0,[x19, #0x8]
00ac9da4	blr x8
00ac9da8	b 0x00ac9db0
00ac9dac	mov w20,wzr
00ac9db0	ldp x29,x30,[sp, #0x10]
00ac9db4	mov w0,w20
00ac9db8	ldp x20,x19,[sp], #0x20
00ac9dbc	ret
