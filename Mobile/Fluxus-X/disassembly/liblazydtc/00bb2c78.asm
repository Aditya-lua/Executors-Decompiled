; ZSTD_DCtx_getParameter @ 00bb2c78
00bb2c78	mov x8,x0
00bb2c7c	cmp w1,#0x3e9
00bb2c80	add x9,x0,#0x7, LSL #12
00bb2c84	mov x0,#-0x28
00bb2c88	b.le 0x00bb2cac
00bb2c8c	cmp w1,#0x3eb
00bb2c90	b.gt 0x00bb2ccc
00bb2c94	cmp w1,#0x3ea
00bb2c98	b.eq 0x00bb2cfc
00bb2c9c	cmp w1,#0x3eb
00bb2ca0	b.ne 0x00bb2d18
00bb2ca4	ldr w8,[x9, #0x610]
00bb2ca8	b 0x00bb2d10
00bb2cac	cmp w1,#0x64
00bb2cb0	b.eq 0x00bb2ce4
00bb2cb4	cmp w1,#0x3e8
00bb2cb8	b.eq 0x00bb2d0c
00bb2cbc	cmp w1,#0x3e9
00bb2cc0	b.ne 0x00bb2d18
00bb2cc4	ldr w8,[x9, #0x670]
00bb2cc8	b 0x00bb2d10
00bb2ccc	cmp w1,#0x3ec
00bb2cd0	b.eq 0x00bb2d04
00bb2cd4	cmp w1,#0x3ed
00bb2cd8	b.ne 0x00bb2d18
00bb2cdc	ldr w8,[x9, #0x618]
00bb2ce0	b 0x00bb2d10
00bb2ce4	mov w9,#0x7638
00bb2ce8	ldr w8,[x8, x9#0x0]
00bb2cec	mov w9,#0x1f
00bb2cf0	clz w8,w8
00bb2cf4	sub w8,w9,w8
00bb2cf8	b 0x00bb2d10
00bb2cfc	ldr w8,[x9, #0x59c]
00bb2d00	b 0x00bb2d10
00bb2d04	ldr w8,[x9, #0x614]
00bb2d08	b 0x00bb2d10
00bb2d0c	ldr w8,[x9, #0x598]
00bb2d10	mov x0,xzr
00bb2d14	str w8,[x2]
00bb2d18	ret
