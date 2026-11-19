; ZSTD_isSkippableFrame @ 00bafdb0
00bafdb0	cmp x1,#0x4
00bafdb4	b.cs 0x00bafdc0
00bafdb8	mov w0,wzr
00bafdbc	ret
00bafdc0	ldr w8,[x0]
00bafdc4	mov w9,#0xd2a5
00bafdc8	movk w9,#0x184, LSL #16
00bafdcc	cmp w9,w8, LSR #0x4
00bafdd0	cset w0,eq
00bafdd4	ret
