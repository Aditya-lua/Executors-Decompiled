; EVP_RAND_gettable_ctx_params @ 00ac9b5c
00ac9b5c	ldr x8,[x0, #0x90]
00ac9b60	cbz x8,0x00ac9b94
00ac9b64	str x19,[sp, #-0x20]!
00ac9b68	stp x29,x30,[sp, #0x10]
00ac9b6c	mov x19,x0
00ac9b70	ldr x0,[x0]
00ac9b74	add x29,sp,#0x10
00ac9b78	bl 0x00c3b680
00ac9b7c	ldr x2,[x19, #0x90]
00ac9b80	ldp x29,x30,[sp, #0x10]
00ac9b84	mov x1,x0
00ac9b88	mov x0,xzr
00ac9b8c	ldr x19,[sp], #0x20
00ac9b90	br x2
00ac9b94	mov x0,xzr
00ac9b98	ret
