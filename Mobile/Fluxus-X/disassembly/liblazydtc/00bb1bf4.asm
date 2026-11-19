; ZSTD_decompressBegin_usingDDict @ 00bb1bf4
00bb1bf4	stp x29,x30,[sp, #-0x40]!
00bb1bf8	str x23,[sp, #0x10]
00bb1bfc	stp x22,x21,[sp, #0x20]
00bb1c00	stp x20,x19,[sp, #0x30]
00bb1c04	mov x29,sp
00bb1c08	mov w8,#0x7528
00bb1c0c	mov w23,#0x76e0
00bb1c10	mov x19,x1
00bb1c14	mov x20,x0
00bb1c18	movk w23,#0x1, LSL #16
00bb1c1c	add x22,x0,x8
00bb1c20	cbz x1,0x00bb1c4c
00bb1c24	mov x0,x19
00bb1c28	bl 0x00c43570
00bb1c2c	mov x21,x0
00bb1c30	mov x0,x19
00bb1c34	bl 0x00c43580
00bb1c38	ldr x8,[x20, #0x74d8]
00bb1c3c	add x9,x21,x0
00bb1c40	cmp x8,x9
00bb1c44	cset w8,ne
00bb1c48	str w8,[x22, #0xd4]
00bb1c4c	adrp x8,0xcb5000
00bb1c50	ldr x8,[x8, #0xad0]
00bb1c54	cbz x8,0x00bb1c64
00bb1c58	mov x0,x20
00bb1c5c	bl 0x00c43700
00bb1c60	b 0x00bb1c68
00bb1c64	mov x0,xzr
00bb1c68	ldr w8,[x22, #0x70]
00bb1c6c	movi v0.2D,#0x0
00bb1c70	mov w9,#0x5
00bb1c74	mov w10,#0x7518
00bb1c78	str x0,[x20, x23#0x0]
00bb1c7c	cmp w8,#0x0
00bb1c80	str wzr,[x22, #0xd0]
00bb1c84	csinc x8,x9,xzr,eq
00bb1c88	adrp x9,0x29c000
00bb1c8c	str q0,[x20,x10]
00bb1c90	str x8,[x20, #0x74e0]
00bb1c94	mov w8,#0xc
00bb1c98	add x10,x20,#0x20
00bb1c9c	movk w8,#0xc00, LSL #16
00bb1ca0	str q0,[x20, #0x74c0]
00bb1ca4	str q0,[x20, #0x74d0]
00bb1ca8	ldr q0,[x9, #0xf50]
00bb1cac	mov w9,#0x683c
00bb1cb0	str w8,[x20, #0x2838]
00bb1cb4	mov w8,#0x1
00bb1cb8	str w8,[x22, #0xb8]
00bb1cbc	add x8,x20,x9
00bb1cc0	mov x9,#0x1
00bb1cc4	movk x9,#0x4, LSL #32
00bb1cc8	str q0,[x22]
00bb1ccc	str x9,[x8]
00bb1cd0	mov w9,#0x8
00bb1cd4	str w9,[x8, #0x8]
00bb1cd8	mov w8,#0x1830
00bb1cdc	mov w9,#0x1028
00bb1ce0	add x8,x20,x8
00bb1ce4	stp x10,x8,[x20]
00bb1ce8	mov w10,#0x2838
00bb1cec	add x8,x20,x9
00bb1cf0	add x9,x20,x10
00bb1cf4	stp x8,x9,[x20, #0x10]
00bb1cf8	cbz x19,0x00bb1d08
00bb1cfc	mov x0,x20
00bb1d00	mov x1,x19
00bb1d04	bl 0x00c43590
00bb1d08	mov x0,xzr
00bb1d0c	ldp x20,x19,[sp, #0x30]
00bb1d10	ldr x23,[sp, #0x10]
00bb1d14	ldp x22,x21,[sp, #0x20]
00bb1d18	ldp x29,x30,[sp], #0x40
00bb1d1c	ret
