; ZSTD_isFrame @ 00bafd74
00bafd74	cmp x1,#0x4
00bafd78	b.cs 0x00bafd84
00bafd7c	mov w0,wzr
00bafd80	ret
00bafd84	ldr w8,[x0]
00bafd88	mov w9,#0xd2a5
00bafd8c	mov w10,#0xb528
00bafd90	movk w9,#0x184, LSL #16
00bafd94	movk w10,#0xfd2f, LSL #16
00bafd98	cmp w9,w8, LSR #0x4
00bafd9c	mov w9,#0x1
00bafda0	cset w11,eq
00bafda4	cmp w8,w10
00bafda8	csel w0,w9,w11,eq
00bafdac	ret
