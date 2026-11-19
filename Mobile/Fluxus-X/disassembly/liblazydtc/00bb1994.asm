; ZSTD_decompressBegin @ 00bb1994
00bb1994	stp x29,x30,[sp, #-0x30]!
00bb1998	str x21,[sp, #0x10]
00bb199c	stp x20,x19,[sp, #0x20]
00bb19a0	mov x29,sp
00bb19a4	adrp x8,0xcb5000
00bb19a8	mov w9,#0x7528
00bb19ac	mov w21,#0x76e0
00bb19b0	ldr x8,[x8, #0xad0]
00bb19b4	mov x19,x0
00bb19b8	movk w21,#0x1, LSL #16
00bb19bc	add x20,x0,x9
00bb19c0	cbz x8,0x00bb19d0
00bb19c4	mov x0,x19
00bb19c8	bl 0x00c43700
00bb19cc	mov x8,x0
00bb19d0	ldr w9,[x20, #0x70]
00bb19d4	movi v0.2D,#0x0
00bb19d8	str x8,[x19, x21#0x0]
00bb19dc	mov w8,#0x5
00bb19e0	add x10,x19,#0x20
00bb19e4	mov x0,xzr
00bb19e8	cmp w9,#0x0
00bb19ec	mov w9,#0x7518
00bb19f0	str wzr,[x20, #0xd0]
00bb19f4	csinc x8,x8,xzr,eq
00bb19f8	str q0,[x19,x9]
00bb19fc	adrp x9,0x29c000
00bb1a00	str x8,[x19, #0x74e0]
00bb1a04	mov w8,#0xc
00bb1a08	movk w8,#0xc00, LSL #16
00bb1a0c	str q0,[x19, #0x74c0]
00bb1a10	str q0,[x19, #0x74d0]
00bb1a14	ldr q0,[x9, #0xf50]
00bb1a18	mov w9,#0x683c
00bb1a1c	str w8,[x19, #0x2838]
00bb1a20	mov w8,#0x1
00bb1a24	str w8,[x20, #0xb8]
00bb1a28	add x8,x19,x9
00bb1a2c	mov x9,#0x1
00bb1a30	movk x9,#0x4, LSL #32
00bb1a34	str q0,[x20]
00bb1a38	str x9,[x8]
00bb1a3c	mov w9,#0x8
00bb1a40	str w9,[x8, #0x8]
00bb1a44	mov w8,#0x1830
00bb1a48	mov w9,#0x1028
00bb1a4c	add x8,x19,x8
00bb1a50	stp x10,x8,[x19]
00bb1a54	mov w10,#0x2838
00bb1a58	add x8,x19,x9
00bb1a5c	add x9,x19,x10
00bb1a60	stp x8,x9,[x19, #0x10]
00bb1a64	ldp x20,x19,[sp, #0x20]
00bb1a68	ldr x21,[sp, #0x10]
00bb1a6c	ldp x29,x30,[sp], #0x30
00bb1a70	ret
