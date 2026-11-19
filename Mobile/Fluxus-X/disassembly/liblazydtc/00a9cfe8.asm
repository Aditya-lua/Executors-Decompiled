; WPACKET_get_total_written @ 00a9cfe8
00a9cfe8	cbz x1,0x00a9cffc
00a9cfec	ldr x8,[x0, #0x18]
00a9cff0	mov w0,#0x1
00a9cff4	str x8,[x1]
00a9cff8	ret
00a9cffc	mov w0,wzr
00a9d000	ret
