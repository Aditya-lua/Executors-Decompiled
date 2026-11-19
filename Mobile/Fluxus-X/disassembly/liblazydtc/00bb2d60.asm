; ZSTD_decodingBufferSize_min @ 00bb2d60
00bb2d60	mov w8,#0x20000
00bb2d64	cmp x0,#0x20, LSL #12
00bb2d68	csel x8,x0,x8,cc
00bb2d6c	add x8,x0,x8, LSL #0x1
00bb2d70	add x8,x8,#0x40
00bb2d74	cmp x1,x8
00bb2d78	csel x0,x1,x8,cc
00bb2d7c	ret
