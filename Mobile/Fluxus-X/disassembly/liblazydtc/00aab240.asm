; CRYPTO_gcm128_finish @ 00aab240
00aab240	stp x26,x25,[sp, #-0x50]!
00aab244	stp x24,x23,[sp, #0x10]
00aab248	stp x22,x21,[sp, #0x20]
00aab24c	stp x20,x19,[sp, #0x30]
00aab250	stp x29,x30,[sp, #0x40]
00aab254	ldp x22,x23,[x0, #0x30]
00aab258	ldr w8,[x0, #0x170]
00aab25c	mov x19,x2
00aab260	mov x20,x1
00aab264	mov x21,x0
00aab268	lsl x26,x22,#0x3
00aab26c	lsl x25,x23,#0x3
00aab270	add x29,sp,#0x40
00aab274	cbz w8,0x00aab2b4
00aab278	add w9,w8,#0xf
00aab27c	add x10,x21,x8
00aab280	and w24,w9,#0xfffffff0
00aab284	add x0,x10,#0x188
00aab288	sub w2,w24,w8
00aab28c	mov w1,wzr
00aab290	bl 0x00c301c0
00aab294	cmp w24,#0x30
00aab298	b.ne 0x00aab2cc
00aab29c	add x2,x21,#0x188
00aab2a0	add x0,x21,#0x40
00aab2a4	add x1,x21,#0x60
00aab2a8	orr w3,wzr,#0x30
00aab2ac	bl 0x00aaa048
00aab2b0	b 0x00aab2c8
00aab2b4	ldr w8,[x21, #0x174]
00aab2b8	cbz w8,0x00aab2c8
00aab2bc	add x0,x21,#0x40
00aab2c0	add x1,x21,#0x60
00aab2c4	bl 0x00aa9de0
00aab2c8	mov w24,wzr
00aab2cc	lsr x8,x22,#0x5
00aab2d0	lsr x9,x22,#0x15
00aab2d4	lsr x10,x23,#0x5
00aab2d8	lsr x11,x23,#0x15
00aab2dc	and x12,x8,#0xff000000
00aab2e0	and x9,x9,#0xff0000
00aab2e4	orr x9,x9,x12
00aab2e8	and x12,x10,#0xff000000
00aab2ec	and x11,x11,#0xff0000
00aab2f0	orr x11,x11,x12
00aab2f4	lsl w12,w22,#0xb
00aab2f8	and w12,w12,#0xff0000
00aab2fc	and w8,w8,#0xff00
00aab300	bfm w12,w22,#0x5,#0x4
00aab304	orr w8,w12,w8
00aab308	lsl w12,w23,#0xb
00aab30c	and w12,w12,#0xff0000
00aab310	and w10,w10,#0xff00
00aab314	bfm w12,w23,#0x5,#0x4
00aab318	orr w10,w12,w10
00aab31c	ubfx x12,x22,#0x15,#0x8
00aab320	orr w8,w8,w12
00aab324	ubfx x12,x23,#0x15,#0x8
00aab328	orr w10,w10,w12
00aab32c	orr x8,x9,x8, LSL #0x20
00aab330	orr x9,x11,x10, LSL #0x20
00aab334	bfxil x8,x22,#0x25,#0x10
00aab338	add x2,x21,#0x188
00aab33c	bfxil x8,x22,#0x35,#0x8
00aab340	add x22,x21,#0x40
00aab344	bfxil x9,x23,#0x25,#0x10
00aab348	add w3,w24,#0x10
00aab34c	add x10,x2,w24, UXTW 
00aab350	bfxil x9,x23,#0x35,#0x8
00aab354	add x1,x21,#0x60
00aab358	mov x0,x22
00aab35c	stp x26,x25,[x21, #0x30]
00aab360	stp x8,x9,[x10]
00aab364	bl 0x00aaa048
00aab368	ldr q0,[x21, #0x20]
00aab36c	ldr q1,[x21, #0x40]
00aab370	eor v0.16B,v1.16B,v0.16B
00aab374	str q0,[x21, #0x40]
00aab378	cbz x20,0x00aab3a8
00aab37c	cmp x19,#0x10
00aab380	b.hi 0x00aab3a8
00aab384	mov x0,x22
00aab388	mov x1,x20
00aab38c	mov x2,x19
00aab390	ldp x29,x30,[sp, #0x40]
00aab394	ldp x20,x19,[sp, #0x30]
00aab398	ldp x22,x21,[sp, #0x20]
00aab39c	ldp x24,x23,[sp, #0x10]
00aab3a0	ldp x26,x25,[sp], #0x50
00aab3a4	b 0x00c362f0
00aab3a8	ldp x29,x30,[sp, #0x40]
00aab3ac	ldp x20,x19,[sp, #0x30]
00aab3b0	ldp x22,x21,[sp, #0x20]
00aab3b4	ldp x24,x23,[sp, #0x10]
00aab3b8	mov w0,#0xffffffff
00aab3bc	ldp x26,x25,[sp], #0x50
00aab3c0	ret
