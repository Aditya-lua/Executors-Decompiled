; EC_KEY_can_sign @ 00a2fc0c
00a2fc0c	ldr x8,[x0, #0x18]
00a2fc10	cbz x8,0x00a2fc2c
00a2fc14	ldr x8,[x8]
00a2fc18	cbz x8,0x00a2fc2c
00a2fc1c	ldr w8,[x8]
00a2fc20	mov w9,#0x1
00a2fc24	bic w0,w9,w8, LSR #0x2
00a2fc28	ret
00a2fc2c	mov w0,wzr
00a2fc30	ret
