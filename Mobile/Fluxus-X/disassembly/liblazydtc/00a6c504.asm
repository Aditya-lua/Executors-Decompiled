; EVP_PKEY_parameters_eq @ 00a6c504
00a6c504	ldr x8,[x0, #0x60]
00a6c508	cbnz x8,0x00a6c514
00a6c50c	ldr x8,[x1, #0x60]
00a6c510	cbz x8,0x00a6c51c
00a6c514	mov w2,#0x4
00a6c518	b 0x00a6c90c
00a6c51c	ldr w8,[x0]
00a6c520	ldr w9,[x1]
00a6c524	cmp w8,w9
00a6c528	b.ne 0x00a6c540
00a6c52c	ldr x8,[x0, #0x8]
00a6c530	cbz x8,0x00a6c548
00a6c534	ldr x2,[x8, #0x90]
00a6c538	cbz x2,0x00a6c548
00a6c53c	br x2
00a6c540	mov w0,#0xffffffff
00a6c544	ret
00a6c548	orr w0,wzr,#0xfffffffe
00a6c54c	ret
