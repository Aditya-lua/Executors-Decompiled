; mbedtls_camellia_self_test @ 00b72a3c
00b72a3c	stp x28,x27,[sp, #-0x60]!
00b72a40	stp x26,x25,[sp, #0x10]
00b72a44	stp x24,x23,[sp, #0x20]
00b72a48	stp x22,x21,[sp, #0x30]
00b72a4c	stp x20,x19,[sp, #0x40]
00b72a50	stp x29,x30,[sp, #0x50]
00b72a54	add x29,sp,#0x50
00b72a58	sub sp,sp,#0x230
00b72a5c	mrs x8,tpidr_el0
00b72a60	str x8,[sp, #0x38]
00b72a64	ldr x8,[x8, #0x28]
00b72a68	mov w19,w0
00b72a6c	add x0,sp,#0x88
00b72a70	mov w2,#0x114
00b72a74	mov w1,wzr
00b72a78	stur x8,[x29, #-0x60]
00b72a7c	bl 0x00c301c0
00b72a80	adrp x28,0x77d000
00b72a84	adrp x26,0x77d000
00b72a88	adrp x27,0x364000
00b72a8c	adrp x21,0x77c000
00b72a90	mov w25,wzr
00b72a94	add x28,x28,#0xe44
00b72a98	add x26,x26,#0xf04
00b72a9c	add x27,x27,#0xe50
00b72aa0	add x21,x21,#0x87c
00b72aa4	stp xzr,xzr,[x29, #-0x70]
00b72aa8	stp xzr,xzr,[x29, #-0x80]
00b72aac	lsr w24,w25,#0x1
00b72ab0	lsl w8,w24,#0x6
00b72ab4	and w22,w25,#0x1
00b72ab8	add w23,w8,#0x80
00b72abc	cbz w19,0x00b72ae8
00b72ac0	adrp x8,0x2be000
00b72ac4	adrp x9,0x2ca000
00b72ac8	cmp w22,#0x0
00b72acc	add x8,x8,#0xbd0
00b72ad0	add x9,x9,#0x8db
00b72ad4	adrp x0,0x2a8000
00b72ad8	csel x2,x9,x8,eq
00b72adc	add x0,x0,#0xeda
00b72ae0	mov w1,w23
00b72ae4	bl 0x00c41af0
00b72ae8	lsl w8,w24,#0x3
00b72aec	mov w20,w24
00b72af0	add w24,w8,#0x10
00b72af4	add x1,x28,x20, LSL #0x6
00b72af8	sub x0,x29,#0x80
00b72afc	mov x2,x24
00b72b00	bl 0x00c2ffd0
00b72b04	add x0,sp,#0x88
00b72b08	sub x1,x29,#0x80
00b72b0c	mov w2,w23
00b72b10	cbnz w22,0x00b72b28
00b72b14	bl 0x00c41fb0
00b72b18	lsl x8,x20,#0x5
00b72b1c	ldr q0,[x26,x8]
00b72b20	ldr q1,[x27]
00b72b24	b 0x00b72b38
00b72b28	bl 0x00c41fc0
00b72b2c	lsl x8,x20,#0x5
00b72b30	ldr q0,[x27]
00b72b34	ldr q1,[x26,x8]
00b72b38	add x0,sp,#0x88
00b72b3c	add x2,sp,#0x70
00b72b40	sub x3,x29,#0xc0
00b72b44	mov w1,w22
00b72b48	stp q1,q0,[sp, #0x60]
00b72b4c	bl 0x00c41f80
00b72b50	sub x0,x29,#0xc0
00b72b54	add x1,sp,#0x60
00b72b58	mov w2,#0x10
00b72b5c	bl 0x00c300b0
00b72b60	cbnz w0,0x00b7305c
00b72b64	add x8,x28,x20, LSL #0x6
00b72b68	add x1,x8,#0x20
00b72b6c	sub x0,x29,#0x80
00b72b70	mov x2,x24
00b72b74	bl 0x00c2ffd0
00b72b78	add x0,sp,#0x88
00b72b7c	sub x1,x29,#0x80
00b72b80	mov w2,w23
00b72b84	cbnz w22,0x00b72b9c
00b72b88	bl 0x00c41fb0
00b72b8c	add x8,x26,x20, LSL #0x5
00b72b90	ldr q0,[x8, #0x10]
00b72b94	ldr q1,[x27, #0x10]
00b72b98	b 0x00b72bac
00b72b9c	bl 0x00c41fc0
00b72ba0	add x8,x26,x20, LSL #0x5
00b72ba4	ldr q0,[x27, #0x10]
00b72ba8	ldr q1,[x8, #0x10]
00b72bac	add x0,sp,#0x88
00b72bb0	add x2,sp,#0x70
00b72bb4	sub x3,x29,#0xc0
00b72bb8	mov w1,w22
00b72bbc	stp q1,q0,[sp, #0x60]
00b72bc0	bl 0x00c41f80
00b72bc4	sub x0,x29,#0xc0
00b72bc8	add x1,sp,#0x60
00b72bcc	mov w2,#0x10
00b72bd0	bl 0x00c300b0
00b72bd4	cbnz w0,0x00b7305c
00b72bd8	cbz w19,0x00b72be4
00b72bdc	mov x0,x21
00b72be0	bl 0x00c30760
00b72be4	add w25,w25,#0x1
00b72be8	cmp w25,#0x6
00b72bec	b.cc 0x00b72aac
00b72bf0	cbz w19,0x00b72bfc
00b72bf4	mov w0,#0xa
00b72bf8	bl 0x00c42240
00b72bfc	adrp x8,0x29d000
00b72c00	add x8,x8,#0x1e0
00b72c04	ldr q0,[x8]
00b72c08	adrp x9,0x29c000
00b72c0c	adrp x10,0x29d000
00b72c10	adrp x11,0x29b000
00b72c14	str q0,[sp, #0x50]
00b72c18	ldr q0,[x9, #0x160]
00b72c1c	adrp x28,0x77d000
00b72c20	adrp x20,0x77d000
00b72c24	adrp x21,0x77e000
00b72c28	str q0,[sp]
00b72c2c	ldr q0,[x10, #0x200]
00b72c30	mov w24,wzr
00b72c34	add x28,x28,#0xf64
00b72c38	orr w25,wzr,#0x30
00b72c3c	str q0,[sp, #0x10]
00b72c40	ldr q0,[x11, #0xfe0]
00b72c44	add x20,x20,#0xfc4
00b72c48	add x21,x21,#0x54
00b72c4c	str q0,[sp, #0x20]
00b72c50	lsr w27,w24,#0x1
00b72c54	lsl w8,w27,#0x6
00b72c58	and w22,w24,#0x1
00b72c5c	add w23,w8,#0x80
00b72c60	cbz w19,0x00b72c8c
00b72c64	adrp x8,0x2be000
00b72c68	adrp x9,0x2ca000
00b72c6c	cmp w22,#0x0
00b72c70	add x8,x8,#0xbd0
00b72c74	add x9,x9,#0x8db
00b72c78	adrp x0,0x2be000
00b72c7c	csel x2,x9,x8,eq
00b72c80	add x0,x0,#0xbd4
00b72c84	mov w1,w23
00b72c88	bl 0x00c41af0
00b72c8c	ldr q0,[sp, #0x50]
00b72c90	mov w26,w27
00b72c94	lsl w8,w27,#0x3
00b72c98	add x1,x28,x26, LSL #0x5
00b72c9c	add w2,w8,#0x10
00b72ca0	sub x0,x29,#0x80
00b72ca4	stp q0,q0,[sp, #0x60]
00b72ca8	bl 0x00c2ffd0
00b72cac	add x0,sp,#0x88
00b72cb0	sub x1,x29,#0x80
00b72cb4	mov w2,w23
00b72cb8	cbnz w22,0x00b72d00
00b72cbc	bl 0x00c41fb0
00b72cc0	mul x8,x26,x25
00b72cc4	ldr q0,[x20,x8]
00b72cc8	ldr q1,[x21]
00b72ccc	ldr q2,[sp, #0x70]
00b72cd0	add x0,sp,#0x88
00b72cd4	add x2,sp,#0x70
00b72cd8	sub x3,x29,#0xc0
00b72cdc	mov w1,wzr
00b72ce0	str q2,[sp, #0x40]
00b72ce4	stp q1,q0,[sp, #0x60]
00b72ce8	bl 0x00c41f80
00b72cec	ldur q0,[x29, #-0xc0]
00b72cf0	ldr q1,[sp, #0x40]
00b72cf4	eor v0.16B,v0.16B,v1.16B
00b72cf8	stur q0,[x29, #-0xc0]
00b72cfc	b 0x00b72d30
00b72d00	bl 0x00c41fc0
00b72d04	mul x8,x26,x25
00b72d08	ldr q0,[x21]
00b72d0c	ldr q1,[x20,x8]
00b72d10	add x0,sp,#0x88
00b72d14	sub x2,x29,#0xc0
00b72d18	sub x3,x29,#0xc0
00b72d1c	stp q1,q0,[sp, #0x60]
00b72d20	ldr q0,[sp, #0x20]
00b72d24	mov w1,w22
00b72d28	stur q0,[x29, #-0xc0]
00b72d2c	bl 0x00c41f80
00b72d30	sub x0,x29,#0xc0
00b72d34	add x1,sp,#0x60
00b72d38	mov w2,#0x10
00b72d3c	bl 0x00c300b0
00b72d40	cbnz w0,0x00b7305c
00b72d44	cbnz w22,0x00b72d88
00b72d48	madd x8,x26,x25,x20
00b72d4c	ldr q0,[x8, #0x10]
00b72d50	ldr q1,[x21, #0x10]
00b72d54	ldr q2,[sp, #0x70]
00b72d58	add x0,sp,#0x88
00b72d5c	add x2,sp,#0x70
00b72d60	sub x3,x29,#0xc0
00b72d64	mov w1,wzr
00b72d68	str q2,[sp, #0x40]
00b72d6c	stp q1,q0,[sp, #0x60]
00b72d70	bl 0x00c41f80
00b72d74	ldur q0,[x29, #-0xc0]
00b72d78	ldr q1,[sp, #0x40]
00b72d7c	eor v0.16B,v0.16B,v1.16B
00b72d80	stur q0,[x29, #-0xc0]
00b72d84	b 0x00b72dbc
00b72d88	madd x8,x26,x25,x20
00b72d8c	ldr q1,[x21, #0x10]
00b72d90	ldr q2,[x8, #0x10]
00b72d94	ldr q0,[sp, #0x60]
00b72d98	add x0,sp,#0x88
00b72d9c	sub x2,x29,#0xc0
00b72da0	stp q2,q1,[sp, #0x60]
00b72da4	ldr q1,[sp, #0x10]
00b72da8	sub x3,x29,#0xc0
00b72dac	mov w1,w22
00b72db0	eor v0.16B,v0.16B,v1.16B
00b72db4	stur q0,[x29, #-0xc0]
00b72db8	bl 0x00c41f80
00b72dbc	sub x0,x29,#0xc0
00b72dc0	add x1,sp,#0x60
00b72dc4	mov w2,#0x10
00b72dc8	bl 0x00c300b0
00b72dcc	cbnz w0,0x00b7305c
00b72dd0	cbnz w22,0x00b72e14
00b72dd4	madd x8,x26,x25,x20
00b72dd8	ldr q0,[x8, #0x20]
00b72ddc	ldr q1,[x21, #0x20]
00b72de0	ldr q2,[sp, #0x70]
00b72de4	add x0,sp,#0x88
00b72de8	add x2,sp,#0x70
00b72dec	sub x3,x29,#0xc0
00b72df0	mov w1,wzr
00b72df4	str q2,[sp, #0x40]
00b72df8	stp q1,q0,[sp, #0x60]
00b72dfc	bl 0x00c41f80
00b72e00	ldur q0,[x29, #-0xc0]
00b72e04	ldr q1,[sp, #0x40]
00b72e08	eor v0.16B,v0.16B,v1.16B
00b72e0c	stur q0,[x29, #-0xc0]
00b72e10	b 0x00b72e48
00b72e14	madd x8,x26,x25,x20
00b72e18	ldr q1,[x21, #0x20]
00b72e1c	ldr q2,[x8, #0x20]
00b72e20	ldr q0,[sp, #0x60]
00b72e24	add x0,sp,#0x88
00b72e28	sub x2,x29,#0xc0
00b72e2c	stp q2,q1,[sp, #0x60]
00b72e30	ldr q1,[sp]
00b72e34	sub x3,x29,#0xc0
00b72e38	mov w1,w22
00b72e3c	eor v0.16B,v0.16B,v1.16B
00b72e40	stur q0,[x29, #-0xc0]
00b72e44	bl 0x00c41f80
00b72e48	sub x0,x29,#0xc0
00b72e4c	add x1,sp,#0x60
00b72e50	mov w2,#0x10
00b72e54	bl 0x00c300b0
00b72e58	cbnz w0,0x00b7305c
00b72e5c	cbz w19,0x00b72e6c
00b72e60	adrp x0,0x77c000
00b72e64	add x0,x0,#0x87c
00b72e68	bl 0x00c30760
00b72e6c	add w24,w24,#0x1
00b72e70	cmp w24,#0x6
00b72e74	b.cc 0x00b72c50
00b72e78	cbz w19,0x00b72e84
00b72e7c	mov w0,#0xa
00b72e80	bl 0x00c42240
00b72e84	mov w23,wzr
00b72e88	orr w20,wzr,#0x30
00b72e8c	sub x24,x29,#0xd0
00b72e90	sub x25,x29,#0xe0
00b72e94	lsr w21,w23,#0x1
00b72e98	cbz w19,0x00b72ec0
00b72e9c	adrp x8,0x2be000
00b72ea0	adrp x9,0x2ca000
00b72ea4	tst w23,#0x1
00b72ea8	add x8,x8,#0xbd0
00b72eac	add x9,x9,#0x8db
00b72eb0	adrp x0,0x29f000
00b72eb4	csel x1,x9,x8,eq
00b72eb8	add x0,x0,#0x2f
00b72ebc	bl 0x00c41af0
00b72ec0	mov w26,w21
00b72ec4	adrp x9,0x77e000
00b72ec8	lsl x8,x26,#0x4
00b72ecc	add x9,x9,#0x84
00b72ed0	ldr q0,[x9,x8]
00b72ed4	adrp x9,0x77e000
00b72ed8	add x9,x9,#0xb4
00b72edc	ldr q1,[x9,x8]
00b72ee0	add x0,sp,#0x88
00b72ee4	sub x1,x29,#0x80
00b72ee8	mov w2,#0x80
00b72eec	stur q0,[x29, #-0xd0]
00b72ef0	stur q1,[x29, #-0x80]
00b72ef4	bl 0x00c41fc0
00b72ef8	adrp x8,0x77e000
00b72efc	add x8,x8,#0xe4
00b72f00	ldrsw x21,[x8, w21, UXTW #0x2]
00b72f04	sub x27,x29,#0xc0
00b72f08	tbnz w23,#0x0,0x00b72f94
00b72f0c	adrp x8,0x77e000
00b72f10	add x8,x8,#0xf0
00b72f14	madd x1,x26,x20,x8
00b72f18	sub x0,x29,#0xc0
00b72f1c	mov x2,x21
00b72f20	bl 0x00c2ffd0
00b72f24	mov x28,xzr
00b72f28	mov x22,x21
00b72f2c	sub x22,x22,#0x1
00b72f30	cbnz x28,0x00b72f6c
00b72f34	add x0,sp,#0x88
00b72f38	mov w1,#0x1
00b72f3c	sub x2,x29,#0xd0
00b72f40	sub x3,x29,#0xe0
00b72f44	bl 0x00c41f80
00b72f48	orr w8,wzr,#0xf
00b72f4c	cmn x8,#0x1
00b72f50	b.eq 0x00b72f6c
00b72f54	ldrb w9,[x24, x8]
00b72f58	add w9,w9,#0x1
00b72f5c	and w10,w9,#0xff
00b72f60	strb w9,[x24, x8]
00b72f64	sub x8,x8,#0x1
00b72f68	cbz w10,0x00b72f4c
00b72f6c	ldrb w8,[x27]
00b72f70	ldrb w9,[x25, x28]
00b72f74	add w10,w28,#0x1
00b72f78	and x28,x10,#0xf
00b72f7c	eor w8,w9,w8
00b72f80	strb w8,[x27], #0x1
00b72f84	cbnz x22,0x00b72f2c
00b72f88	adrp x8,0x77e000
00b72f8c	add x8,x8,#0x180
00b72f90	b 0x00b73018
00b72f94	adrp x8,0x77e000
00b72f98	add x8,x8,#0x180
00b72f9c	madd x1,x26,x20,x8
00b72fa0	sub x0,x29,#0xc0
00b72fa4	mov x2,x21
00b72fa8	bl 0x00c2ffd0
00b72fac	mov x28,xzr
00b72fb0	mov x22,x21
00b72fb4	sub x22,x22,#0x1
00b72fb8	cbnz x28,0x00b72ff4
00b72fbc	add x0,sp,#0x88
00b72fc0	mov w1,#0x1
00b72fc4	sub x2,x29,#0xd0
00b72fc8	sub x3,x29,#0xe0
00b72fcc	bl 0x00c41f80
00b72fd0	orr w8,wzr,#0xf
00b72fd4	cmn x8,#0x1
00b72fd8	b.eq 0x00b72ff4
00b72fdc	ldrb w9,[x24, x8]
00b72fe0	add w9,w9,#0x1
00b72fe4	and w10,w9,#0xff
00b72fe8	strb w9,[x24, x8]
00b72fec	sub x8,x8,#0x1
00b72ff0	cbz w10,0x00b72fd4
00b72ff4	ldrb w8,[x27]
00b72ff8	ldrb w9,[x25, x28]
00b72ffc	add w10,w28,#0x1
00b73000	and x28,x10,#0xf
00b73004	eor w8,w9,w8
00b73008	strb w8,[x27], #0x1
00b7300c	cbnz x22,0x00b72fb4
00b73010	adrp x8,0x77e000
00b73014	add x8,x8,#0xf0
00b73018	madd x1,x26,x20,x8
00b7301c	sub x0,x29,#0xc0
00b73020	mov x2,x21
00b73024	bl 0x00c300b0
00b73028	cbnz w0,0x00b7305c
00b7302c	cbz w19,0x00b7303c
00b73030	adrp x0,0x77c000
00b73034	add x0,x0,#0x87c
00b73038	bl 0x00c30760
00b7303c	add w23,w23,#0x1
00b73040	cmp w23,#0x6
00b73044	b.cc 0x00b72e94
00b73048	cbz w19,0x00b73070
00b7304c	mov w0,#0xa
00b73050	bl 0x00c42240
00b73054	mov w19,wzr
00b73058	b 0x00b73070
00b7305c	cbz w19,0x00b7306c
00b73060	adrp x0,0x77c000
00b73064	add x0,x0,#0x854
00b73068	bl 0x00c30760
00b7306c	mov w19,#0x1
00b73070	ldr x20,[sp, #0x38]
00b73074	add x0,sp,#0x88
00b73078	mov w1,#0x114
00b7307c	bl 0x00c42220
00b73080	ldr x8,[x20, #0x28]
00b73084	ldur x9,[x29, #-0x60]
00b73088	cmp x8,x9
00b7308c	b.ne 0x00b730b4
00b73090	mov w0,w19
00b73094	add sp,sp,#0x230
00b73098	ldp x29,x30,[sp, #0x50]
00b7309c	ldp x20,x19,[sp, #0x40]
00b730a0	ldp x22,x21,[sp, #0x30]
00b730a4	ldp x24,x23,[sp, #0x20]
00b730a8	ldp x26,x25,[sp, #0x10]
00b730ac	ldp x28,x27,[sp], #0x60
00b730b0	ret
00b730b4	bl 0x00c2fec0
