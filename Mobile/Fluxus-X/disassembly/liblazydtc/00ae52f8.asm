; ossl_sm4_set_key @ 00ae52f8
00ae52f8	ldr w9,[x0]
00ae52fc	mov w10,#0xbac6
00ae5300	movk w10,#0xa3b1, LSL #16
00ae5304	mov x8,xzr
00ae5308	rev w9,w9
00ae530c	eor w9,w9,w10
00ae5310	str w9,[sp, #-0x10]!
00ae5314	ldr w9,[x0, #0x4]
00ae5318	mov w10,#0x3350
00ae531c	movk w10,#0x56aa, LSL #16
00ae5320	mov w11,#0x22dc
00ae5324	rev w9,w9
00ae5328	eor w9,w9,w10
00ae532c	str w9,[sp, #0x4]
00ae5330	ldr w9,[x0, #0x8]
00ae5334	mov w10,#0x9197
00ae5338	movk w10,#0x677d, LSL #16
00ae533c	movk w11,#0xb270, LSL #16
00ae5340	rev w9,w9
00ae5344	eor w9,w9,w10
00ae5348	str w9,[sp, #0x8]
00ae534c	ldr w10,[x0, #0xc]
00ae5350	mov x9,sp
00ae5354	rev w10,w10
00ae5358	eor w11,w10,w11
00ae535c	adrp x10,0x775000
00ae5360	str w11,[sp, #0xc]
00ae5364	adrp x11,0x775000
00ae5368	add x10,x10,#0xf50
00ae536c	add x11,x11,#0xfd0
00ae5370	add w12,w8,#0x2
00ae5374	sub w13,w8,#0x1
00ae5378	lsl x14,x8,#0x2
00ae537c	and x15,x8,#0x3
00ae5380	add x8,x8,#0x1
00ae5384	and x16,x8,#0x3
00ae5388	and x12,x12,#0x3
00ae538c	and x13,x13,#0x3
00ae5390	ldr w16,[x9, x16, LSL #0x2]
00ae5394	ldr w12,[x9, x12, LSL #0x2]
00ae5398	ldr w13,[x9, x13, LSL #0x2]
00ae539c	ldr w17,[x10, x14#0x0]
00ae53a0	lsl x15,x15,#0x2
00ae53a4	eor w12,w12,w16
00ae53a8	eor w12,w12,w13
00ae53ac	eor w12,w12,w17
00ae53b0	lsr w13,w12,#0x18
00ae53b4	ubfx w16,w12,#0x10,#0x8
00ae53b8	ldrb w13,[x11, w13, UXTW ]
00ae53bc	ldrb w16,[x11, w16, UXTW ]
00ae53c0	ubfx w17,w12,#0x8,#0x8
00ae53c4	ldrb w17,[x11, w17, UXTW ]
00ae53c8	lsl w13,w13,#0x18
00ae53cc	and w12,w12,#0xff
00ae53d0	bfm w13,w16,#0x10,#0x7
00ae53d4	ldrb w12,[x11, w12, UXTW ]
00ae53d8	mov w16,w13
00ae53dc	bfm w16,w17,#0x18,#0x7
00ae53e0	ldr w17,[x9, x15#0x0]
00ae53e4	orr w12,w16,w12
00ae53e8	extr w13,w12,w13,#0x13
00ae53ec	extr w16,w12,w16,#0x9
00ae53f0	eor w12,w12,w17
00ae53f4	eor w12,w12,w13
00ae53f8	cmp x8,#0x20
00ae53fc	eor w12,w12,w16
00ae5400	str w12,[x9, x15#0x0]
00ae5404	str w12,[x1, x14#0x0]
00ae5408	b.ne 0x00ae5370
00ae540c	mov w0,#0x1
00ae5410	add sp,sp,#0x10
00ae5414	ret
