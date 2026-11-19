; EVP_CIPHER_is_a @ 00a5eb24
00a5eb24	str x19,[sp, #-0x20]!
00a5eb28	stp x29,x30,[sp, #0x10]
00a5eb2c	add x29,sp,#0x10
00a5eb30	cbz x0,0x00a5eb50
00a5eb34	ldr x8,[x0, #0x78]
00a5eb38	mov x19,x1
00a5eb3c	cbz x8,0x00a5eb5c
00a5eb40	ldr w1,[x0, #0x60]
00a5eb44	mov x0,x8
00a5eb48	mov x2,xzr
00a5eb4c	b 0x00a5eb78
00a5eb50	ldp x29,x30,[sp, #0x10]
00a5eb54	ldr x19,[sp], #0x20
00a5eb58	ret
00a5eb5c	ldr x2,[x0, #0x68]
00a5eb60	cbnz x2,0x00a5eb70
00a5eb64	ldr w0,[x0]
00a5eb68	bl 0x00c324f0
00a5eb6c	mov x2,x0
00a5eb70	mov x0,xzr
00a5eb74	mov w1,wzr
00a5eb78	ldp x29,x30,[sp, #0x10]
00a5eb7c	mov x3,x19
00a5eb80	ldr x19,[sp], #0x20
00a5eb84	b 0x00c3bf70
