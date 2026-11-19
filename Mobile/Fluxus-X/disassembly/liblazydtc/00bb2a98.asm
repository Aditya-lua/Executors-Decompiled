; ZSTD_dParam_getBounds @ 00bb2a98
00bb2a98	sub w8,w0,#0x3e8
00bb2a9c	cmp w8,#0x5
00bb2aa0	b.cs 0x00bb2ab0
00bb2aa4	mov x0,xzr
00bb2aa8	mov x1,#0x100000000
00bb2aac	ret
00bb2ab0	cmp w0,#0x64
00bb2ab4	b.eq 0x00bb2ad0
00bb2ab8	cmp w0,#0x3ed
00bb2abc	b.ne 0x00bb2ae0
00bb2ac0	mov x1,#0x400
00bb2ac4	mov x0,xzr
00bb2ac8	movk x1,#0x2, LSL #48
00bb2acc	ret
00bb2ad0	mov x1,#0xa
00bb2ad4	mov x0,xzr
00bb2ad8	movk x1,#0x1f, LSL #32
00bb2adc	ret
00bb2ae0	mov x1,xzr
00bb2ae4	mov x0,#-0x28
00bb2ae8	ret
