; ossl_provider_query_operation @ 00aa4438
00aa4438	ldr x3,[x0, #0x98]
00aa443c	cbz x3,0x00aa4448
00aa4440	ldr x0,[x0, #0xd0]
00aa4444	br x3
00aa4448	mov x0,xzr
00aa444c	ret
