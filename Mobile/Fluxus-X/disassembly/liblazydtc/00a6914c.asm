; EVP_MAC_gettable_ctx_params @ 00a6914c
00a6914c	ldr x8,[x0, #0x68]
00a69150	cbz x8,0x00a69184
00a69154	str x19,[sp, #-0x20]!
00a69158	stp x29,x30,[sp, #0x10]
00a6915c	mov x19,x0
00a69160	ldr x0,[x0]
00a69164	add x29,sp,#0x10
00a69168	bl 0x00c3b680
00a6916c	ldr x2,[x19, #0x68]
00a69170	ldp x29,x30,[sp, #0x10]
00a69174	mov x1,x0
00a69178	mov x0,xzr
00a6917c	ldr x19,[sp], #0x20
00a69180	br x2
00a69184	mov x0,xzr
00a69188	ret
