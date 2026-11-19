; WPACKET_close @ 00a9c59c
00a9c59c	ldr x1,[x0, #0x28]
00a9c5a0	cbz x1,0x00a9c5b4
00a9c5a4	ldr x8,[x1]
00a9c5a8	cbz x8,0x00a9c5b4
00a9c5ac	mov w2,#0x1
00a9c5b0	b 0x00a9cab8
00a9c5b4	mov w0,wzr
00a9c5b8	ret
