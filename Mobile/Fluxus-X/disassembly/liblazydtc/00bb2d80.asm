; ZSTD_estimateDStreamSize @ 00bb2d80
00bb2d80	mov w8,#0x20000
00bb2d84	cmp x0,#0x20, LSL #12
00bb2d88	csel x8,x0,x8,cc
00bb2d8c	add x9,x0,x8
00bb2d90	add x8,x9,x8, LSL #0x1
00bb2d94	add x8,x8,#0x17, LSL #12
00bb2d98	add x0,x8,#0x728
00bb2d9c	ret
