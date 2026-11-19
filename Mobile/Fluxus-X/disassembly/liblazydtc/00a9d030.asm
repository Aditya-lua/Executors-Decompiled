; WPACKET_is_null_buf @ 00a9d030
00a9d030	ldr x9,[x0]
00a9d034	mov x8,x0
00a9d038	mov w0,wzr
00a9d03c	cbz x9,0x00a9d044
00a9d040	ret
00a9d044	ldr x8,[x8, #0x8]
00a9d048	cmp x8,#0x0
00a9d04c	cset w0,eq
00a9d050	ret
