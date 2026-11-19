; ZSTD_getDictID_fromDict @ 00bb1d20
00bb1d20	cmp x1,#0x8
00bb1d24	b.cc 0x00bb1d44
00bb1d28	ldr w8,[x0]
00bb1d2c	mov w9,#0xa437
00bb1d30	movk w9,#0xec30, LSL #16
00bb1d34	cmp w8,w9
00bb1d38	b.ne 0x00bb1d44
00bb1d3c	ldr w0,[x0, #0x4]
00bb1d40	ret
00bb1d44	mov w0,wzr
00bb1d48	ret
