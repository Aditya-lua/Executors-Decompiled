; EVP_CIPHER_CTX_gettable_params @ 00a5c938
00a5c938	str x19,[sp, #-0x20]!
00a5c93c	stp x29,x30,[sp, #0x10]
00a5c940	add x29,sp,#0x10
00a5c944	cbz x0,0x00a5c980
00a5c948	mov x19,x0
00a5c94c	ldr x0,[x0]
00a5c950	ldr x8,[x0, #0xf0]
00a5c954	cbz x8,0x00a5c980
00a5c958	bl 0x00c34bb0
00a5c95c	bl 0x00c3b680
00a5c960	ldr x8,[x19]
00a5c964	ldp x29,x30,[sp, #0x10]
00a5c968	mov x1,x0
00a5c96c	ldr x2,[x8, #0xf0]
00a5c970	ldr x8,[x19, #0xa8]
00a5c974	mov x0,x8
00a5c978	ldr x19,[sp], #0x20
00a5c97c	br x2
00a5c980	ldp x29,x30,[sp, #0x10]
00a5c984	mov x0,xzr
00a5c988	ldr x19,[sp], #0x20
00a5c98c	ret
