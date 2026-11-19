; ZSTD_decompressBegin_usingDict @ 00bb1a74
00bb1a74	stp x29,x30,[sp, #-0x40]!
00bb1a78	str x23,[sp, #0x10]
00bb1a7c	stp x22,x21,[sp, #0x20]
00bb1a80	stp x20,x19,[sp, #0x30]
00bb1a84	mov x29,sp
00bb1a88	adrp x8,0xcb5000
00bb1a8c	mov w9,#0x7528
00bb1a90	mov w23,#0x76e0
00bb1a94	ldr x8,[x8, #0xad0]
00bb1a98	mov x20,x2
00bb1a9c	mov x21,x1
00bb1aa0	mov x19,x0
00bb1aa4	movk w23,#0x1, LSL #16
00bb1aa8	add x22,x0,x9
00bb1aac	cbz x8,0x00bb1abc
00bb1ab0	mov x0,x19
00bb1ab4	bl 0x00c43700
00bb1ab8	mov x8,x0
00bb1abc	ldr w9,[x22, #0x70]
00bb1ac0	str x8,[x19, x23#0x0]
00bb1ac4	mov w8,#0x5
00bb1ac8	movi v0.2D,#0x0
00bb1acc	mov w10,#0x7518
00bb1ad0	mov x0,xzr
00bb1ad4	cmp w9,#0x0
00bb1ad8	str wzr,[x22, #0xd0]
00bb1adc	csinc x8,x8,xzr,eq
00bb1ae0	str x8,[x19, #0x74e0]
00bb1ae4	mov w8,#0xc
00bb1ae8	movk w8,#0xc00, LSL #16
00bb1aec	str q0,[x19,x10]
00bb1af0	mov w10,#0x8
00bb1af4	str w8,[x19, #0x2838]
00bb1af8	mov w8,#0x683c
00bb1afc	add x9,x19,x8
00bb1b00	mov x8,#0x1
00bb1b04	str q0,[x19, #0x74c0]
00bb1b08	movk x8,#0x4, LSL #32
00bb1b0c	str w10,[x9, #0x8]
00bb1b10	adrp x10,0x29c000
00bb1b14	str x8,[x9]
00bb1b18	mov w9,#0x1
00bb1b1c	add x8,x19,#0x20
00bb1b20	str w9,[x22, #0xb8]
00bb1b24	mov w9,#0x1830
00bb1b28	add x9,x19,x9
00bb1b2c	str q0,[x19, #0x74d0]
00bb1b30	ldr q0,[x10, #0xf50]
00bb1b34	stp x8,x9,[x19]
00bb1b38	mov w9,#0x1028
00bb1b3c	mov w10,#0x2838
00bb1b40	add x9,x19,x9
00bb1b44	add x10,x19,x10
00bb1b48	str q0,[x22]
00bb1b4c	stp x9,x10,[x19, #0x10]
00bb1b50	cbz x21,0x00bb1bd8
00bb1b54	cbz x20,0x00bb1bd8
00bb1b58	cmp x20,#0x8
00bb1b5c	b.cc 0x00bb1bac
00bb1b60	ldr w9,[x21]
00bb1b64	mov w10,#0xa437
00bb1b68	movk w10,#0xec30, LSL #16
00bb1b6c	cmp w9,w10
00bb1b70	b.ne 0x00bb1bac
00bb1b74	ldr w9,[x21, #0x4]
00bb1b78	mov x0,x8
00bb1b7c	mov x1,x21
00bb1b80	mov x2,x20
00bb1b84	str w9,[x22, #0xd0]
00bb1b88	bl 0x00c436d0
00bb1b8c	cmn x0,#0x78
00bb1b90	b.hi 0x00bb1bec
00bb1b94	movi v0.2S,#0x1
00bb1b98	ldr x9,[x19, #0x74c0]
00bb1b9c	ldr x8,[x19, #0x74c8]
00bb1ba0	add x10,x21,x0
00bb1ba4	str d0,[x19, #0x7530]
00bb1ba8	b 0x00bb1bb8
00bb1bac	mov x8,xzr
00bb1bb0	mov x9,xzr
00bb1bb4	mov x10,x21
00bb1bb8	sub x8,x8,x9
00bb1bbc	mov x0,xzr
00bb1bc0	str x9,[x19, #0x74d8]
00bb1bc4	add x8,x10,x8
00bb1bc8	add x9,x21,x20
00bb1bcc	str x10,[x19, #0x74c8]
00bb1bd0	str x8,[x19, #0x74d0]
00bb1bd4	str x9,[x19, #0x74c0]
00bb1bd8	ldp x20,x19,[sp, #0x30]
00bb1bdc	ldr x23,[sp, #0x10]
00bb1be0	ldp x22,x21,[sp, #0x20]
00bb1be4	ldp x29,x30,[sp], #0x40
00bb1be8	ret
00bb1bec	mov x0,#-0x1e
00bb1bf0	b 0x00bb1bd8
