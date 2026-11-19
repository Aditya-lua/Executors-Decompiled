; ossl_cipher_hw_tdes_ecb @ 00b2d3a0
00b2d3a0	stp x26,x25,[sp, #-0x50]!
00b2d3a4	subs x25,x3,#0x8
00b2d3a8	stp x24,x23,[sp, #0x10]
00b2d3ac	stp x22,x21,[sp, #0x20]
00b2d3b0	stp x20,x19,[sp, #0x30]
00b2d3b4	stp x29,x30,[sp, #0x40]
00b2d3b8	add x29,sp,#0x40
00b2d3bc	b.cc 0x00b2d408
00b2d3c0	mov x19,x2
00b2d3c4	mov x20,x1
00b2d3c8	mov x21,x0
00b2d3cc	mov x26,xzr
00b2d3d0	add x22,x0,#0xc0
00b2d3d4	add x23,x0,#0x140
00b2d3d8	add x24,x0,#0x1c0
00b2d3dc	ldrb w8,[x21, #0x6c]
00b2d3e0	add x0,x19,x26
00b2d3e4	add x1,x20,x26
00b2d3e8	mov x2,x22
00b2d3ec	ubfx w5,w8,#0x1,#0x1
00b2d3f0	mov x3,x23
00b2d3f4	mov x4,x24
00b2d3f8	bl 0x00c39a30
00b2d3fc	add x26,x26,#0x8
00b2d400	cmp x26,x25
00b2d404	b.ls 0x00b2d3dc
00b2d408	ldp x29,x30,[sp, #0x40]
00b2d40c	ldp x20,x19,[sp, #0x30]
00b2d410	ldp x22,x21,[sp, #0x20]
00b2d414	ldp x24,x23,[sp, #0x10]
00b2d418	mov w0,#0x1
00b2d41c	ldp x26,x25,[sp], #0x50
00b2d420	ret
