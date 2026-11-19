; HMAC_Update @ 00a7f928
00a7f928	ldr x8,[x0]
00a7f92c	cbz x8,0x00a7f938
00a7f930	ldr x0,[x0, #0x8]
00a7f934	b 0x00c31f80
00a7f938	mov w0,wzr
00a7f93c	ret
