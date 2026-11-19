; CRYPTO_get_ex_data @ 00a83b50
00a83b50	stp x20,x19,[sp, #-0x20]!
00a83b54	stp x29,x30,[sp, #0x10]
00a83b58	mov x20,x0
00a83b5c	ldr x0,[x0, #0x8]
00a83b60	add x29,sp,#0x10
00a83b64	cbz x0,0x00a83b8c
00a83b68	mov w19,w1
00a83b6c	bl 0x00c325e0
00a83b70	cmp w0,w19
00a83b74	b.le 0x00a83b8c
00a83b78	ldr x0,[x20, #0x8]
00a83b7c	ldp x29,x30,[sp, #0x10]
00a83b80	mov w1,w19
00a83b84	ldp x20,x19,[sp], #0x20
00a83b88	b 0x00c32610
00a83b8c	ldp x29,x30,[sp, #0x10]
00a83b90	mov x0,xzr
00a83b94	ldp x20,x19,[sp], #0x20
00a83b98	ret
