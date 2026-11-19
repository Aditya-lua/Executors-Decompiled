; ZSTD_resetDStream @ 00bb2a30
00bb2a30	add x9,x0,#0x7, LSL #12
00bb2a34	mov w8,#0x5
00bb2a38	ldr w10,[x9, #0x598]
00bb2a3c	str wzr,[x9, #0x61c]
00bb2a40	str wzr,[x9, #0x66c]
00bb2a44	cmp w10,#0x0
00bb2a48	csinc x0,x8,xzr,eq
00bb2a4c	mov w8,#0x1
00bb2a50	str w8,[x9, #0x5e0]
00bb2a54	ret
