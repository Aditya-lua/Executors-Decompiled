; ossl_ec_wNAF_mul @ 00a338a8
00a338a8	sub sp,sp,#0xf0
00a338ac	stp x28,x27,[sp, #0x90]
00a338b0	stp x26,x25,[sp, #0xa0]
00a338b4	stp x24,x23,[sp, #0xb0]
00a338b8	stp x22,x21,[sp, #0xc0]
00a338bc	stp x20,x19,[sp, #0xd0]
00a338c0	stp x29,x30,[sp, #0xe0]
00a338c4	mov x19,x0
00a338c8	ldr x0,[x0, #0x10]
00a338cc	add x29,sp,#0xe0
00a338d0	mov x21,x6
00a338d4	mov x26,x5
00a338d8	mov x20,x4
00a338dc	mov x28,x3
00a338e0	mov x23,x2
00a338e4	mov x24,x1
00a338e8	bl 0x00c369b0
00a338ec	cbnz w0,0x00a338fc
00a338f0	ldr x0,[x19, #0x18]
00a338f4	bl 0x00c369b0
00a338f8	cbz w0,0x00a339a4
00a338fc	cbz x23,0x00a33a14
00a33900	mov x0,x19
00a33904	bl 0x00c3aa30
00a33908	mov x22,x0
00a3390c	cbz x0,0x00a3395c
00a33910	ldr x25,[x19, #0xa0]
00a33914	str x19,[sp, #0x60]
00a33918	stp x22,x20,[sp, #0x28]
00a3391c	cbz x25,0x00a33944
00a33920	ldr x8,[x25, #0x10]
00a33924	cbz x8,0x00a33944
00a33928	ldr x8,[x25, #0x20]
00a3392c	mov x0,x19
00a33930	mov x1,x22
00a33934	mov x3,x21
00a33938	ldr x2,[x8]
00a3393c	bl 0x00c3a890
00a33940	cbz w0,0x00a33d28
00a33944	mov w8,#0x1
00a33948	stp xzr,xzr,[sp, #0x40]
00a3394c	str xzr,[sp, #0x20]
00a33950	mov w10,#0x1
00a33954	str x8,[sp, #0x58]
00a33958	b 0x00a33a28
00a3395c	bl 0x00c342a0
00a33960	adrp x0,0x2c1000
00a33964	adrp x2,0x2c5000
00a33968	add x0,x0,#0xb11
00a3396c	add x2,x2,#0x958
00a33970	mov w1,#0x1d7
00a33974	bl 0x00c342b0
00a33978	mov w0,#0x10
00a3397c	mov w1,#0x71
00a33980	mov x2,xzr
00a33984	bl 0x00c342c0
00a33988	mov x23,xzr
00a3398c	stp xzr,xzr,[x29, #-0x68]
00a33990	mov x27,xzr
00a33994	mov x26,xzr
00a33998	mov x21,xzr
00a3399c	mov x25,xzr
00a339a0	b 0x00a33bfc
00a339a4	ldr x8,[x19, #0x10]
00a339a8	cbnz x28,0x00a339cc
00a339ac	cbz x23,0x00a339cc
00a339b0	cmp x8,x23
00a339b4	b.eq 0x00a339cc
00a339b8	mov x0,x19
00a339bc	mov x1,x24
00a339c0	mov x2,x23
00a339c4	mov x3,xzr
00a339c8	b 0x00a339f0
00a339cc	cbnz x23,0x00a338fc
00a339d0	cmp x28,#0x1
00a339d4	b.ne 0x00a338fc
00a339d8	ldr x2,[x26]
00a339dc	cmp x2,x8
00a339e0	b.eq 0x00a33a14
00a339e4	ldr x3,[x20]
00a339e8	mov x0,x19
00a339ec	mov x1,x24
00a339f0	mov x4,x21
00a339f4	ldp x29,x30,[sp, #0xe0]
00a339f8	ldp x20,x19,[sp, #0xd0]
00a339fc	ldp x22,x21,[sp, #0xc0]
00a33a00	ldp x24,x23,[sp, #0xb0]
00a33a04	ldp x26,x25,[sp, #0xa0]
00a33a08	ldp x28,x27,[sp, #0x90]
00a33a0c	add sp,sp,#0xf0
00a33a10	b 0x00a330e0
00a33a14	stp xzr,x20,[sp, #0x28]
00a33a18	stp xzr,x19,[sp, #0x58]
00a33a1c	stp xzr,xzr,[sp, #0x40]
00a33a20	mov x10,xzr
00a33a24	str xzr,[sp, #0x20]
00a33a28	add x8,x10,x28
00a33a2c	adrp x27,0x2c1000
00a33a30	lsl x19,x8,#0x3
00a33a34	add x27,x27,#0xb11
00a33a38	mov w2,#0x201
00a33a3c	mov x0,x19
00a33a40	mov x1,x27
00a33a44	str x10,[sp, #0x50]
00a33a48	str x8,[sp, #0x38]
00a33a4c	bl 0x00c32320
00a33a50	stur x0,[x29, #-0x68]
00a33a54	mov w2,#0x202
00a33a58	mov x0,x19
00a33a5c	mov x1,x27
00a33a60	bl 0x00c32320
00a33a64	mov x22,x0
00a33a68	add x0,x19,#0x8
00a33a6c	mov w2,#0x204
00a33a70	mov x1,x27
00a33a74	bl 0x00c32320
00a33a78	mov x20,x0
00a33a7c	mov w2,#0x205
00a33a80	mov x0,x19
00a33a84	mov x1,x27
00a33a88	mov x27,x22
00a33a8c	bl 0x00c32320
00a33a90	mov x25,x0
00a33a94	stur x20,[x29, #-0x60]
00a33a98	cbz x20,0x00a33bb8
00a33a9c	ldur x8,[x29, #-0x60]
00a33aa0	str xzr,[x8]
00a33aa4	ldur x8,[x29, #-0x68]
00a33aa8	cbz x8,0x00a33bb8
00a33aac	cbz x27,0x00a33bb8
00a33ab0	cbz x25,0x00a33bb8
00a33ab4	ldr x8,[sp, #0x58]
00a33ab8	stp x24,x21,[sp, #0x8]
00a33abc	str x25,[sp, #0x18]
00a33ac0	adds x8,x8,x28
00a33ac4	stp x8,x27,[sp, #0x68]
00a33ac8	b.eq 0x00a33cd8
00a33acc	ldr x27,[sp, #0x70]
00a33ad0	mov x25,xzr
00a33ad4	mov x22,xzr
00a33ad8	mov x24,xzr
00a33adc	mov x20,xzr
00a33ae0	mov w21,#0x1
00a33ae4	cmp x20,x28
00a33ae8	mov x0,x23
00a33aec	b.cs 0x00a33af4
00a33af0	ldr x0,[x26, x20, LSL #0x3]
00a33af4	bl 0x00c322f0
00a33af8	cmp w0,#0x7cf
00a33afc	b.ls 0x00a33b08
00a33b00	orr w19,wzr,#0x6
00a33b04	b 0x00a33b40
00a33b08	cmp w0,#0x31f
00a33b0c	b.ls 0x00a33b18
00a33b10	mov w19,#0x5
00a33b14	b 0x00a33b40
00a33b18	cmp w0,#0x12b
00a33b1c	b.ls 0x00a33b28
00a33b20	mov w19,#0x4
00a33b24	b 0x00a33b40
00a33b28	cmp w0,#0x45
00a33b2c	b.ls 0x00a33b38
00a33b30	orr w19,wzr,#0x3
00a33b34	b 0x00a33b40
00a33b38	cmp w0,#0x13
00a33b3c	cinc x19,x21,hi
00a33b40	ldur x9,[x29, #-0x68]
00a33b44	lsl x8,x20,#0x3
00a33b48	cmp x20,x28
00a33b4c	mov x0,x23
00a33b50	str x19,[x9, x8#0x0]
00a33b54	ldur x9,[x29, #-0x60]
00a33b58	add x8,x9,x8
00a33b5c	str xzr,[x8, #0x8]
00a33b60	b.cs 0x00a33b68
00a33b64	ldr x0,[x26, x20, LSL #0x3]
00a33b68	add x2,x27,x25
00a33b6c	mov w1,w19
00a33b70	bl 0x00c38bd0
00a33b74	ldur x8,[x29, #-0x60]
00a33b78	str x0,[x8, x25#0x0]
00a33b7c	cbz x0,0x00a33d1c
00a33b80	sub x8,x19,#0x1
00a33b84	ldr x9,[x27, x20, LSL #0x3]
00a33b88	lsl x8,x21,x8
00a33b8c	add x22,x8,x22
00a33b90	ldr x8,[sp, #0x68]
00a33b94	add x20,x20,#0x1
00a33b98	cmp x9,x24
00a33b9c	csel x24,x9,x24,hi
00a33ba0	cmp x20,x8
00a33ba4	add x25,x25,#0x8
00a33ba8	b.cc 0x00a33ae4
00a33bac	ldr x8,[sp, #0x50]
00a33bb0	cbnz x8,0x00a33ce8
00a33bb4	b 0x00a33fec
00a33bb8	bl 0x00c342a0
00a33bbc	adrp x0,0x2c1000
00a33bc0	adrp x2,0x2c5000
00a33bc4	add x0,x0,#0xb11
00a33bc8	add x2,x2,#0x958
00a33bcc	mov w1,#0x20c
00a33bd0	bl 0x00c342b0
00a33bd4	mov w8,#0x103
00a33bd8	movk w8,#0xc, LSL #16
00a33bdc	sub w1,w8,#0x3
00a33be0	mov w0,#0x10
00a33be4	mov x2,xzr
00a33be8	bl 0x00c342c0
00a33bec	ldur x22,[x29, #-0x60]
00a33bf0	mov x23,xzr
00a33bf4	mov x26,xzr
00a33bf8	mov x21,xzr
00a33bfc	mov w24,wzr
00a33c00	mov x0,x23
00a33c04	bl 0x00c3ab60
00a33c08	ldur x0,[x29, #-0x68]
00a33c0c	adrp x19,0x2c1000
00a33c10	add x19,x19,#0xb11
00a33c14	mov w2,#0x316
00a33c18	mov x1,x19
00a33c1c	bl 0x00c32310
00a33c20	mov w2,#0x317
00a33c24	mov x0,x27
00a33c28	mov x1,x19
00a33c2c	bl 0x00c32310
00a33c30	cbz x22,0x00a33c70
00a33c34	ldr x0,[x22]
00a33c38	cbz x0,0x00a33c5c
00a33c3c	adrp x19,0x2c1000
00a33c40	add x20,x22,#0x8
00a33c44	add x19,x19,#0xb11
00a33c48	mov w2,#0x31c
00a33c4c	mov x1,x19
00a33c50	bl 0x00c32310
00a33c54	ldr x0,[x20], #0x8
00a33c58	cbnz x0,0x00a33c48
00a33c5c	ldur x0,[x29, #-0x60]
00a33c60	adrp x1,0x2c1000
00a33c64	add x1,x1,#0xb11
00a33c68	mov w2,#0x31e
00a33c6c	bl 0x00c32310
00a33c70	cbz x21,0x00a33ca0
00a33c74	ldr x0,[x21]
00a33c78	cbz x0,0x00a33c8c
00a33c7c	add x19,x21,#0x8
00a33c80	bl 0x00c3ab50
00a33c84	ldr x0,[x19], #0x8
00a33c88	cbnz x0,0x00a33c80
00a33c8c	adrp x1,0x2c1000
00a33c90	add x1,x1,#0xb11
00a33c94	mov w2,#0x324
00a33c98	mov x0,x26
00a33c9c	bl 0x00c32310
00a33ca0	adrp x1,0x2c1000
00a33ca4	add x1,x1,#0xb11
00a33ca8	mov w2,#0x326
00a33cac	mov x0,x25
00a33cb0	bl 0x00c32310
00a33cb4	mov w0,w24
00a33cb8	ldp x29,x30,[sp, #0xe0]
00a33cbc	ldp x20,x19,[sp, #0xd0]
00a33cc0	ldp x22,x21,[sp, #0xc0]
00a33cc4	ldp x24,x23,[sp, #0xb0]
00a33cc8	ldp x26,x25,[sp, #0xa0]
00a33ccc	ldp x28,x27,[sp, #0x90]
00a33cd0	add sp,sp,#0xf0
00a33cd4	ret
00a33cd8	mov x24,xzr
00a33cdc	mov x22,xzr
00a33ce0	ldr x8,[sp, #0x50]
00a33ce4	cbz x8,0x00a33fec
00a33ce8	ldr x25,[sp, #0x18]
00a33cec	ldr x8,[sp, #0x48]
00a33cf0	cbz x8,0x00a33d7c
00a33cf4	ldr x8,[sp, #0x58]
00a33cf8	stur xzr,[x29, #-0x58]
00a33cfc	cbz w8,0x00a33e04
00a33d00	bl 0x00c342a0
00a33d04	adrp x0,0x2c1000
00a33d08	adrp x2,0x2c5000
00a33d0c	add x0,x0,#0xb11
00a33d10	add x2,x2,#0x958
00a33d14	mov w1,#0x233
00a33d18	b 0x00a33d9c
00a33d1c	ldur x22,[x29, #-0x60]
00a33d20	ldr x25,[sp, #0x18]
00a33d24	b 0x00a33bf0
00a33d28	mov x27,x25
00a33d2c	ldr x25,[x25, #0x8]
00a33d30	mov x0,x23
00a33d34	bl 0x00c322f0
00a33d38	ldp x9,x10,[x27, #0x10]
00a33d3c	sxtw x8,w0
00a33d40	stp x25,x27,[sp, #0x40]
00a33d44	ldr x11,[x27, #0x28]
00a33d48	udiv x12,x8,x25
00a33d4c	add x8,x12,#0x1
00a33d50	cmp x8,x9
00a33d54	sub x8,x10,#0x1
00a33d58	csinc x10,x9,x12,hi
00a33d5c	lsl x9,x9,x8
00a33d60	cmp x11,x9
00a33d64	b.ne 0x00a33dc4
00a33d68	mov w9,#0x1
00a33d6c	lsl x8,x9,x8
00a33d70	str xzr,[sp, #0x58]
00a33d74	str x8,[sp, #0x20]
00a33d78	b 0x00a33a28
00a33d7c	ldr x8,[sp, #0x58]
00a33d80	cbnz w8,0x00a33ff0
00a33d84	bl 0x00c342a0
00a33d88	adrp x0,0x2c1000
00a33d8c	adrp x2,0x2c5000
00a33d90	add x0,x0,#0xb11
00a33d94	add x2,x2,#0x958
00a33d98	mov w1,#0x22a
00a33d9c	bl 0x00c342b0
00a33da0	mov w1,#0x103
00a33da4	mov w0,#0x10
00a33da8	movk w1,#0xc, LSL #16
00a33dac	mov x2,xzr
00a33db0	bl 0x00c342c0
00a33db4	mov x23,xzr
00a33db8	mov x26,xzr
00a33dbc	mov x21,xzr
00a33dc0	b 0x00a340b4
00a33dc4	bl 0x00c342a0
00a33dc8	adrp x0,0x2c1000
00a33dcc	adrp x2,0x2c5000
00a33dd0	add x0,x0,#0xb11
00a33dd4	add x2,x2,#0x958
00a33dd8	mov w1,#0x1f3
00a33ddc	bl 0x00c342b0
00a33de0	mov w1,#0x103
00a33de4	mov w0,#0x10
00a33de8	movk w1,#0xc, LSL #16
00a33dec	mov x2,xzr
00a33df0	bl 0x00c342c0
00a33df4	mov x23,xzr
00a33df8	stp xzr,xzr,[x29, #-0x68]
00a33dfc	mov x22,xzr
00a33e00	b 0x00a33990
00a33e04	ldr x8,[sp, #0x48]
00a33e08	sub x2,x29,#0x58
00a33e0c	mov x0,x23
00a33e10	ldr x1,[x8, #0x18]
00a33e14	ldur x8,[x29, #-0x68]
00a33e18	str x1,[x8, x28, LSL #0x3]
00a33e1c	bl 0x00c38bd0
00a33e20	cbz x0,0x00a33db4
00a33e24	ldur x8,[x29, #-0x58]
00a33e28	mov x26,x0
00a33e2c	cmp x8,x24
00a33e30	b.ls 0x00a33eac
00a33e34	ldr x9,[sp, #0x40]
00a33e38	ldr x10,[sp, #0x50]
00a33e3c	mul x9,x10,x9
00a33e40	cmp x8,x9
00a33e44	b.cs 0x00a33ee4
00a33e48	ldp x10,x9,[sp, #0x40]
00a33e4c	ldr x9,[x9, #0x10]
00a33e50	add x8,x10,x8
00a33e54	sub x8,x8,#0x1
00a33e58	udiv x8,x8,x10
00a33e5c	cmp x8,x9
00a33e60	b.ls 0x00a33edc
00a33e64	bl 0x00c342a0
00a33e68	adrp x19,0x2c1000
00a33e6c	add x19,x19,#0xb11
00a33e70	adrp x2,0x2c5000
00a33e74	add x2,x2,#0x958
00a33e78	mov w1,#0x25e
00a33e7c	mov x0,x19
00a33e80	bl 0x00c342b0
00a33e84	mov w1,#0x103
00a33e88	mov w0,#0x10
00a33e8c	movk w1,#0xc, LSL #16
00a33e90	mov x2,xzr
00a33e94	bl 0x00c342c0
00a33e98	mov w2,#0x25f
00a33e9c	mov x0,x26
00a33ea0	mov x1,x19
00a33ea4	bl 0x00c32310
00a33ea8	b 0x00a33db4
00a33eac	ldur x10,[x29, #-0x60]
00a33eb0	add x11,x28,#0x1
00a33eb4	lsl x9,x28,#0x3
00a33eb8	str x11,[sp, #0x38]
00a33ebc	str x26,[x10, x9#0x0]
00a33ec0	str xzr,[x10, x11, LSL #0x3]
00a33ec4	ldr x10,[sp, #0x70]
00a33ec8	str x8,[x10, x9#0x0]
00a33ecc	ldr x8,[sp, #0x48]
00a33ed0	ldr x8,[x8, #0x20]
00a33ed4	str x8,[x25, x9#0x0]
00a33ed8	b 0x00a33ff0
00a33edc	add x8,x8,x28
00a33ee0	str x8,[sp, #0x38]
00a33ee4	ldr x8,[sp, #0x38]
00a33ee8	cmp x8,x28
00a33eec	b.ls 0x00a33fd8
00a33ef0	ldr x9,[sp, #0x48]
00a33ef4	sub x8,x8,#0x1
00a33ef8	str x8,[sp, #0x58]
00a33efc	ldr x8,[sp, #0x20]
00a33f00	ldr x19,[x9, #0x20]
00a33f04	ldr x9,[sp, #0x70]
00a33f08	mov x23,x26
00a33f0c	lsl x8,x8,#0x3
00a33f10	str x8,[sp, #0x50]
00a33f14	lsl x8,x28,#0x3
00a33f18	add x27,x9,x8
00a33f1c	ldur x9,[x29, #-0x60]
00a33f20	mov x21,x28
00a33f24	add x8,x9,x8
00a33f28	add x25,x8,#0x8
00a33f2c	ldr x8,[sp, #0x58]
00a33f30	cmp x21,x8
00a33f34	b.cs 0x00a33f5c
00a33f38	ldr x9,[sp, #0x40]
00a33f3c	str x9,[x27]
00a33f40	ldur x8,[x29, #-0x58]
00a33f44	subs x8,x8,x9
00a33f48	b.cc 0x00a343dc
00a33f4c	stur x8,[x29, #-0x58]
00a33f50	ldr x0,[x27]
00a33f54	mov x20,x27
00a33f58	b 0x00a33f6c
00a33f5c	ldr x8,[sp, #0x70]
00a33f60	ldur x0,[x29, #-0x58]
00a33f64	add x20,x8,x21, LSL #0x3
00a33f68	str x0,[x27]
00a33f6c	adrp x1,0x2c1000
00a33f70	mov w2,#0x27a
00a33f74	add x1,x1,#0xb11
00a33f78	str xzr,[x25]
00a33f7c	bl 0x00c32320
00a33f80	stur x0,[x25, #-0x8]
00a33f84	cbz x0,0x00a34360
00a33f88	ldr x2,[x20]
00a33f8c	mov x1,x23
00a33f90	bl 0x00c2ffd0
00a33f94	ldr x8,[x19]
00a33f98	cbz x8,0x00a343a0
00a33f9c	ldr x9,[sp, #0x18]
00a33fa0	ldr x8,[x20]
00a33fa4	add x27,x27,#0x8
00a33fa8	add x25,x25,#0x8
00a33fac	str x19,[x9, x21, LSL #0x3]
00a33fb0	ldr x9,[sp, #0x40]
00a33fb4	cmp x8,x24
00a33fb8	csel x24,x8,x24,hi
00a33fbc	ldr x8,[sp, #0x38]
00a33fc0	add x23,x23,x9
00a33fc4	ldr x9,[sp, #0x50]
00a33fc8	add x21,x21,#0x1
00a33fcc	cmp x21,x8
00a33fd0	add x19,x19,x9
00a33fd4	b.cc 0x00a33f2c
00a33fd8	adrp x1,0x2c1000
00a33fdc	add x1,x1,#0xb11
00a33fe0	mov w2,#0x28d
00a33fe4	mov x0,x26
00a33fe8	bl 0x00c32310
00a33fec	ldr x25,[sp, #0x18]
00a33ff0	lsl x8,x22,#0x3
00a33ff4	adrp x1,0x2c1000
00a33ff8	add x0,x8,#0x8
00a33ffc	add x1,x1,#0xb11
00a34000	mov w2,#0x297
00a34004	bl 0x00c32320
00a34008	mov x26,x0
00a3400c	cbz x0,0x00a34078
00a34010	ldr x8,[sp, #0x68]
00a34014	add x19,x26,x22, LSL #0x3
00a34018	str xzr,[x19]
00a3401c	cbz x8,0x00a340c0
00a34020	mov x20,xzr
00a34024	mov w27,#0x1
00a34028	mov x21,x26
00a3402c	mov x23,xzr
00a34030	str x21,[x25, x20, LSL #0x3]
00a34034	ldr x0,[sp, #0x60]
00a34038	bl 0x00c3ab70
00a3403c	str x0,[x21]
00a34040	cbz x0,0x00a340fc
00a34044	ldur x8,[x29, #-0x68]
00a34048	add x23,x23,#0x1
00a3404c	add x21,x21,#0x8
00a34050	ldr x8,[x8, x20, LSL #0x3]
00a34054	sub x8,x8,#0x1
00a34058	lsl x8,x27,x8
00a3405c	cmp x23,x8
00a34060	b.cc 0x00a34034
00a34064	ldr x8,[sp, #0x68]
00a34068	add x20,x20,#0x1
00a3406c	cmp x20,x8
00a34070	b.cc 0x00a3402c
00a34074	b 0x00a340c4
00a34078	mov x21,x26
00a3407c	bl 0x00c342a0
00a34080	adrp x0,0x2c1000
00a34084	adrp x2,0x2c5000
00a34088	add x0,x0,#0xb11
00a3408c	add x2,x2,#0x958
00a34090	mov w1,#0x299
00a34094	bl 0x00c342b0
00a34098	mov w8,#0x103
00a3409c	movk w8,#0xc, LSL #16
00a340a0	sub w1,w8,#0x3
00a340a4	mov w0,#0x10
00a340a8	mov x2,xzr
00a340ac	bl 0x00c342c0
00a340b0	mov x23,xzr
00a340b4	ldur x22,[x29, #-0x60]
00a340b8	ldr x27,[sp, #0x70]
00a340bc	b 0x00a33bfc
00a340c0	mov x21,x26
00a340c4	cmp x21,x19
00a340c8	b.eq 0x00a34114
00a340cc	bl 0x00c342a0
00a340d0	adrp x0,0x2c1000
00a340d4	adrp x2,0x2c5000
00a340d8	add x0,x0,#0xb11
00a340dc	add x2,x2,#0x958
00a340e0	mov w1,#0x2aa
00a340e4	bl 0x00c342b0
00a340e8	mov w1,#0x103
00a340ec	mov w0,#0x10
00a340f0	movk w1,#0xc, LSL #16
00a340f4	mov x2,xzr
00a340f8	bl 0x00c342c0
00a340fc	mov x23,xzr
00a34100	ldur x22,[x29, #-0x60]
00a34104	ldr x27,[sp, #0x70]
00a34108	mov w24,wzr
00a3410c	mov x21,x26
00a34110	b 0x00a33c00
00a34114	ldr x27,[sp, #0x60]
00a34118	mov x0,x27
00a3411c	bl 0x00c3ab70
00a34120	mov x23,x0
00a34124	cbz x0,0x00a34100
00a34128	ldr x8,[sp, #0x68]
00a3412c	cbz x8,0x00a341f8
00a34130	mov x19,xzr
00a34134	mov w20,#0x1
00a34138	ldr x8,[x25, x19, LSL #0x3]
00a3413c	cmp x19,x28
00a34140	ldr x0,[x8]
00a34144	b.cs 0x00a3415c
00a34148	ldr x8,[sp, #0x30]
00a3414c	ldr x1,[x8, x19, LSL #0x3]
00a34150	bl 0x00c3acc0
00a34154	cbnz w0,0x00a34168
00a34158	b 0x00a34100
00a3415c	ldr x1,[sp, #0x28]
00a34160	bl 0x00c3acc0
00a34164	cbz w0,0x00a34100
00a34168	ldur x8,[x29, #-0x68]
00a3416c	ldr x8,[x8, x19, LSL #0x3]
00a34170	cmp x8,#0x2
00a34174	b.cc 0x00a341e8
00a34178	ldr x8,[x25, x19, LSL #0x3]
00a3417c	ldr x3,[sp, #0x10]
00a34180	mov x0,x27
00a34184	mov x1,x23
00a34188	ldr x2,[x8]
00a3418c	bl 0x00c3b060
00a34190	cbz w0,0x00a34100
00a34194	ldur x8,[x29, #-0x68]
00a34198	ldr x8,[x8, x19, LSL #0x3]
00a3419c	cmp x8,#0x1
00a341a0	b.eq 0x00a341e8
00a341a4	mov x21,xzr
00a341a8	ldr x8,[x25, x19, LSL #0x3]
00a341ac	ldr x4,[sp, #0x10]
00a341b0	mov x0,x27
00a341b4	mov x3,x23
00a341b8	add x8,x8,x21, LSL #0x3
00a341bc	ldp x2,x1,[x8]
00a341c0	bl 0x00c3aef0
00a341c4	cbz w0,0x00a34100
00a341c8	ldur x8,[x29, #-0x68]
00a341cc	add x9,x21,#0x2
00a341d0	add x21,x21,#0x1
00a341d4	ldr x8,[x8, x19, LSL #0x3]
00a341d8	sub x8,x8,#0x1
00a341dc	lsl x8,x20,x8
00a341e0	cmp x9,x8
00a341e4	b.cc 0x00a341a8
00a341e8	ldr x8,[sp, #0x68]
00a341ec	add x19,x19,#0x1
00a341f0	cmp x19,x8
00a341f4	b.cc 0x00a34138
00a341f8	ldr x8,[x27]
00a341fc	ldr x8,[x8, #0xd8]
00a34200	cbz x8,0x00a34100
00a34204	ldr x3,[sp, #0x10]
00a34208	mov x0,x27
00a3420c	mov x1,x22
00a34210	mov x2,x26
00a34214	blr x8
00a34218	cbz w0,0x00a34100
00a3421c	subs w19,w24,#0x1
00a34220	b.mi 0x00a34344
00a34224	mov x28,x27
00a34228	ldr x27,[sp, #0x70]
00a3422c	ldr x9,[sp, #0x38]
00a34230	mov w21,wzr
00a34234	sxtw x22,w19
00a34238	mov w8,#0x1
00a3423c	mov w24,#0x1
00a34240	tbnz w8,#0x0,0x00a3425c
00a34244	ldp x1,x3,[sp, #0x8]
00a34248	mov x0,x28
00a3424c	mov x2,x1
00a34250	bl 0x00c3b060
00a34254	ldr x9,[sp, #0x38]
00a34258	cbz w0,0x00a34460
00a3425c	cbz x9,0x00a34328
00a34260	mov x20,xzr
00a34264	ldr x8,[x27, x20, LSL #0x3]
00a34268	cmp x8,x22
00a3426c	b.ls 0x00a3431c
00a34270	ldur x8,[x29, #-0x60]
00a34274	ldr x8,[x8, x20, LSL #0x3]
00a34278	ldrsb w8,[x8, x22]
00a3427c	cbz w8,0x00a3431c
00a34280	cmp w8,#0x0
00a34284	and w9,w8,#0x80
00a34288	cneg w25,w8,mi
00a3428c	cmp w21,w9, LSR #0x7
00a34290	b.eq 0x00a342b0
00a34294	cbnz w24,0x00a342a8
00a34298	ldp x1,x2,[sp, #0x8]
00a3429c	mov x0,x28
00a342a0	bl 0x00c3af00
00a342a4	cbz w0,0x00a34428
00a342a8	cmp w21,#0x0
00a342ac	cset w21,eq
00a342b0	ldr x8,[sp, #0x18]
00a342b4	asr w9,w25,#0x1
00a342b8	ldr x8,[x8, x20, LSL #0x3]
00a342bc	ldr x3,[x8, w9, SXTW #0x3]
00a342c0	cbz w24,0x00a342fc
00a342c4	ldr x24,[sp, #0x8]
00a342c8	mov x1,x3
00a342cc	mov x0,x24
00a342d0	bl 0x00c3acc0
00a342d4	cbz w0,0x00a34428
00a342d8	ldr x2,[sp, #0x10]
00a342dc	mov x0,x28
00a342e0	mov x1,x24
00a342e4	bl 0x00c3b100
00a342e8	ldr x25,[sp, #0x18]
00a342ec	ldr x9,[sp, #0x38]
00a342f0	mov w24,wzr
00a342f4	cbnz w0,0x00a3431c
00a342f8	b 0x00a34434
00a342fc	ldp x1,x4,[sp, #0x8]
00a34300	mov x0,x28
00a34304	mov x2,x1
00a34308	bl 0x00c3aef0
00a3430c	cbz w0,0x00a34428
00a34310	ldr x25,[sp, #0x18]
00a34314	ldr x9,[sp, #0x38]
00a34318	mov w24,wzr
00a3431c	add x20,x20,#0x1
00a34320	cmp x20,x9
00a34324	b.cc 0x00a34264
00a34328	cmp w24,#0x0
00a3432c	sub w19,w19,#0x1
00a34330	cset w8,ne
00a34334	sub x22,x22,#0x1
00a34338	tbz w19,#0x1f,0x00a34240
00a3433c	mov x27,x28
00a34340	cbz w24,0x00a34470
00a34344	ldr x1,[sp, #0x8]
00a34348	mov x0,x27
00a3434c	bl 0x00c3af10
00a34350	ldr x27,[sp, #0x70]
00a34354	cbz w0,0x00a34460
00a34358	mov w24,#0x1
00a3435c	b 0x00a34464
00a34360	bl 0x00c342a0
00a34364	adrp x19,0x2c1000
00a34368	add x19,x19,#0xb11
00a3436c	adrp x2,0x2c5000
00a34370	add x2,x2,#0x958
00a34374	mov w1,#0x27c
00a34378	mov x0,x19
00a3437c	bl 0x00c342b0
00a34380	mov w8,#0x103
00a34384	movk w8,#0xc, LSL #16
00a34388	sub w1,w8,#0x3
00a3438c	mov w0,#0x10
00a34390	mov x2,xzr
00a34394	bl 0x00c342c0
00a34398	mov w2,#0x27d
00a3439c	b 0x00a34414
00a343a0	bl 0x00c342a0
00a343a4	adrp x19,0x2c1000
00a343a8	add x19,x19,#0xb11
00a343ac	adrp x2,0x2c5000
00a343b0	add x2,x2,#0x958
00a343b4	mov w1,#0x285
00a343b8	mov x0,x19
00a343bc	bl 0x00c342b0
00a343c0	mov w1,#0x103
00a343c4	mov w0,#0x10
00a343c8	movk w1,#0xc, LSL #16
00a343cc	mov x2,xzr
00a343d0	bl 0x00c342c0
00a343d4	mov w2,#0x286
00a343d8	b 0x00a34414
00a343dc	bl 0x00c342a0
00a343e0	adrp x19,0x2c1000
00a343e4	add x19,x19,#0xb11
00a343e8	adrp x2,0x2c5000
00a343ec	add x2,x2,#0x958
00a343f0	mov w1,#0x26d
00a343f4	mov x0,x19
00a343f8	bl 0x00c342b0
00a343fc	mov w1,#0x103
00a34400	mov w0,#0x10
00a34404	movk w1,#0xc, LSL #16
00a34408	mov x2,xzr
00a3440c	bl 0x00c342c0
00a34410	mov w2,#0x26e
00a34414	mov x0,x26
00a34418	mov x1,x19
00a3441c	bl 0x00c32310
00a34420	ldr x25,[sp, #0x18]
00a34424	b 0x00a33db4
00a34428	ldur x22,[x29, #-0x60]
00a3442c	ldr x25,[sp, #0x18]
00a34430	b 0x00a34108
00a34434	bl 0x00c342a0
00a34438	adrp x0,0x2c1000
00a3443c	adrp x2,0x2c5000
00a34440	add x0,x0,#0xb11
00a34444	add x2,x2,#0x958
00a34448	mov w1,#0x2fa
00a3444c	bl 0x00c342b0
00a34450	mov w0,#0x10
00a34454	mov w1,#0xa3
00a34458	mov x2,xzr
00a3445c	bl 0x00c342c0
00a34460	mov w24,wzr
00a34464	ldur x22,[x29, #-0x60]
00a34468	mov x21,x26
00a3446c	b 0x00a33c00
00a34470	ldr x27,[sp, #0x70]
00a34474	cbz w21,0x00a34358
00a34478	ldp x1,x2,[sp, #0x8]
00a3447c	mov x0,x28
00a34480	bl 0x00c3af00
00a34484	cbnz w0,0x00a34358
00a34488	b 0x00a34460
