; EC_KEY_key2buf @ 00a2f798
00a2f798	cbz x0,0x00a2f7bc
00a2f79c	mov x4,x3
00a2f7a0	mov x3,x2
00a2f7a4	mov w2,w1
00a2f7a8	ldr x1,[x0, #0x20]
00a2f7ac	cbz x1,0x00a2f7bc
00a2f7b0	ldr x0,[x0, #0x18]
00a2f7b4	cbz x0,0x00a2f7bc
00a2f7b8	b 0x00c3a8a0
00a2f7bc	mov x0,xzr
00a2f7c0	ret
