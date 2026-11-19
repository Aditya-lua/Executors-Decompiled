; ZSTD_getcBlockSize @ 00bba280
00bba280	cmp x1,#0x3
00bba284	b.cs 0x00bba290
00bba288	mov x0,#-0x48
00bba28c	ret
00bba290	ldrh w8,[x0]
00bba294	ldrb w9,[x0, #0x2]
00bba298	and w10,w8,#0xfff8
00bba29c	ubfx x0,x8,#0x1,#0x2
00bba2a0	orr w9,w10,w9, LSL #0x10
00bba2a4	and w10,w8,#0x1
00bba2a8	cmp w0,#0x1
00bba2ac	stp w0,w10,[x2]
00bba2b0	lsr w8,w9,#0x3
00bba2b4	str w8,[x2, #0x8]
00bba2b8	b.eq 0x00bba2d0
00bba2bc	cmp w0,#0x3
00bba2c0	b.ne 0x00bba2cc
00bba2c4	mov x0,#-0x14
00bba2c8	ret
00bba2cc	mov x0,x8
00bba2d0	ret
