; FUN_00c199b8 @ 00c199b8
00c199b8	paciasp
00c199bc	sub sp,sp,#0x70
00c199c0	stp x29,x30,[sp, #0x10]
00c199c4	stp x28,x27,[sp, #0x20]
00c199c8	stp x26,x25,[sp, #0x30]
00c199cc	stp x24,x23,[sp, #0x40]
00c199d0	stp x22,x21,[sp, #0x50]
00c199d4	stp x20,x19,[sp, #0x60]
00c199d8	add x29,sp,#0x10
00c199dc	ldp x8,x9,[x0]
00c199e0	mov x19,x0
00c199e4	mov w20,w1
00c199e8	sub x10,x9,x8
00c199ec	cmp x10,#0x3
00c199f0	b.cs 0x00c19a00
00c199f4	cmp x10,#0x2
00c199f8	b.eq 0x00c19a1c
00c199fc	b 0x00c19a2c
00c19a00	ldrh w10,[x8]
00c19a04	ldrb w11,[x8, #0x2]
00c19a08	mov w12,#0x7273
00c19a0c	cmp w10,w12
00c19a10	mov w10,#0x4e
00c19a14	ccmp w11,w10,#0x0,eq
00c19a18	b.eq 0x00c19b2c
00c19a1c	ldrh w10,[x8]
00c19a20	mov w11,#0x7273
00c19a24	cmp w10,w11
00c19a28	b.eq 0x00c19ab4
00c19a2c	mov x0,x19
00c19a30	bl 0x00c21e40
00c19a34	tbz w20,#0x0,0x00c19fb8
00c19a38	cbz x0,0x00c19fb8
00c19a3c	ldr x20,[x19, #0x1330]
00c19a40	ldr x8,[x20, #0x8]
00c19a44	sub x9,x8,#0xfd0
00c19a48	cmn x9,#0xff1
00c19a4c	b.hi 0x00c19a74
00c19a50	mov x21,x0
00c19a54	mov w0,#0x1000
00c19a58	bl 0x00c308d0
00c19a5c	cbz x0,0x00c19fdc
00c19a60	mov x8,xzr
00c19a64	stp x20,xzr,[x0]
00c19a68	mov x20,x0
00c19a6c	str x0,[x19, #0x1330]
00c19a70	mov x0,x21
00c19a74	add x9,x8,#0x20
00c19a78	add x8,x20,x8
00c19a7c	adrp x10,0xcb3000
00c19a80	add x10,x10,#0x20
00c19a84	str x9,[x20, #0x8]
00c19a88	mov w11,#0x540
00c19a8c	str x10,[x8, #0x10]!
00c19a90	ldurh w9,[x8, #0x9]
00c19a94	mov w10,#0x2e
00c19a98	str x0,[x8, #0x10]
00c19a9c	mov x0,x8
00c19aa0	and w9,w9,#0xf000
00c19aa4	strb w10,[x8, #0x8]
00c19aa8	orr w9,w9,w11
00c19aac	sturh w9,[x8, #0x9]
00c19ab0	b 0x00c19fb8
00c19ab4	add x8,x8,#0x2
00c19ab8	cmp x9,x8
00c19abc	str x8,[x19]
00c19ac0	b.eq 0x00c19ad4
00c19ac4	ldrb w8,[x8]
00c19ac8	sub w8,w8,#0x3a
00c19acc	cmn w8,#0xa
00c19ad0	b.cs 0x00c19d08
00c19ad4	mov x0,x19
00c19ad8	bl 0x00c21ccc
00c19adc	str x0,[sp, #0x8]
00c19ae0	cbz x0,0x00c19fb8
00c19ae4	ldp x8,x9,[x19]
00c19ae8	mov x21,x0
00c19aec	cmp x9,x8
00c19af0	b.eq 0x00c19ecc
00c19af4	ldrb w8,[x8]
00c19af8	cmp w8,#0x49
00c19afc	b.ne 0x00c19ecc
00c19b00	mov x0,x19
00c19b04	mov w1,wzr
00c19b08	bl 0x00c14948
00c19b0c	str x0,[sp]
00c19b10	cbz x0,0x00c19fb8
00c19b14	add x1,sp,#0x8
00c19b18	mov x2,sp
00c19b1c	mov x0,x19
00c19b20	bl 0x00c14e14
00c19b24	mov x21,x0
00c19b28	b 0x00c19ecc
00c19b2c	add x8,x8,#0x3
00c19b30	mov x0,x19
00c19b34	str x8,[x19]
00c19b38	bl 0x00c21ccc
00c19b3c	cbz x0,0x00c19fb8
00c19b40	ldp x8,x9,[x19]
00c19b44	mov x20,x0
00c19b48	adrp x23,0xcb3000
00c19b4c	add x23,x23,#0x5c0
00c19b50	cmp x9,x8
00c19b54	b.eq 0x00c19be0
00c19b58	ldrb w8,[x8]
00c19b5c	cmp w8,#0x49
00c19b60	b.ne 0x00c19be0
00c19b64	mov x0,x19
00c19b68	mov w1,wzr
00c19b6c	bl 0x00c14948
00c19b70	cbz x0,0x00c19fb8
00c19b74	ldr x21,[x19, #0x1330]
00c19b78	ldr x8,[x21, #0x8]
00c19b7c	sub x9,x8,#0xfd0
00c19b80	cmn x9,#0xff1
00c19b84	b.hi 0x00c19bac
00c19b88	mov x22,x0
00c19b8c	mov w0,#0x1000
00c19b90	bl 0x00c308d0
00c19b94	cbz x0,0x00c19fdc
00c19b98	mov x8,xzr
00c19b9c	stp x21,xzr,[x0]
00c19ba0	mov x21,x0
00c19ba4	str x0,[x19, #0x1330]
00c19ba8	mov x0,x22
00c19bac	add x9,x8,#0x20
00c19bb0	add x8,x21,x8
00c19bb4	mov w11,#0x540
00c19bb8	str x9,[x21, #0x8]
00c19bbc	mov w10,#0x2d
00c19bc0	str x23,[x8, #0x10]!
00c19bc4	ldurh w9,[x8, #0x9]
00c19bc8	stp x20,x0,[x8, #0x10]
00c19bcc	mov x20,x8
00c19bd0	and w9,w9,#0xf000
00c19bd4	strb w10,[x8, #0x8]
00c19bd8	orr w9,w9,w11
00c19bdc	sturh w9,[x8, #0x9]
00c19be0	adrp x24,0xcb2000
00c19be4	add x24,x24,#0xe40
00c19be8	mov w25,#0x17
00c19bec	mov w26,#0x540
00c19bf0	mov w27,#0x2d
00c19bf4	b 0x00c19c24
00c19bf8	add x9,x8,#0x20
00c19bfc	add x8,x22,x8
00c19c00	str x9,[x22, #0x8]
00c19c04	str x24,[x8, #0x10]!
00c19c08	ldurh w9,[x8, #0x9]
00c19c0c	strb w25,[x8, #0x8]
00c19c10	and w9,w9,#0xf000
00c19c14	stp x20,x21,[x8, #0x10]
00c19c18	mov x20,x8
00c19c1c	orr w9,w9,w26
00c19c20	sturh w9,[x8, #0x9]
00c19c24	ldp x8,x9,[x19]
00c19c28	cmp x8,x9
00c19c2c	b.eq 0x00c19c3c
00c19c30	ldrb w9,[x8]
00c19c34	cmp w9,#0x45
00c19c38	b.eq 0x00c19f40
00c19c3c	mov x0,x19
00c19c40	bl 0x00c14270
00c19c44	cbz x0,0x00c19fb8
00c19c48	ldp x8,x9,[x19]
00c19c4c	mov x21,x0
00c19c50	cmp x9,x8
00c19c54	b.eq 0x00c19cd4
00c19c58	ldrb w8,[x8]
00c19c5c	cmp w8,#0x49
00c19c60	b.ne 0x00c19cd4
00c19c64	mov x0,x19
00c19c68	mov w1,wzr
00c19c6c	bl 0x00c14948
00c19c70	cbz x0,0x00c19fb8
00c19c74	ldr x28,[x19, #0x1330]
00c19c78	mov x22,x0
00c19c7c	ldr x8,[x28, #0x8]
00c19c80	sub x9,x8,#0xfd0
00c19c84	cmn x9,#0xff1
00c19c88	b.hi 0x00c19ca8
00c19c8c	mov w0,#0x1000
00c19c90	bl 0x00c308d0
00c19c94	cbz x0,0x00c19fdc
00c19c98	mov x8,xzr
00c19c9c	stp x28,xzr,[x0]
00c19ca0	mov x28,x0
00c19ca4	str x0,[x19, #0x1330]
00c19ca8	add x9,x8,#0x20
00c19cac	add x8,x28,x8
00c19cb0	str x9,[x28, #0x8]
00c19cb4	str x23,[x8, #0x10]!
00c19cb8	ldurh w9,[x8, #0x9]
00c19cbc	stp x21,x22,[x8, #0x10]
00c19cc0	mov x21,x8
00c19cc4	and w9,w9,#0xf000
00c19cc8	strb w27,[x8, #0x8]
00c19ccc	orr w9,w9,w26
00c19cd0	sturh w9,[x8, #0x9]
00c19cd4	ldr x22,[x19, #0x1330]
00c19cd8	ldr x8,[x22, #0x8]
00c19cdc	sub x9,x8,#0xfd0
00c19ce0	cmn x9,#0xff1
00c19ce4	b.hi 0x00c19bf8
00c19ce8	mov w0,#0x1000
00c19cec	bl 0x00c308d0
00c19cf0	cbz x0,0x00c19fdc
00c19cf4	mov x8,xzr
00c19cf8	stp x22,xzr,[x0]
00c19cfc	mov x22,x0
00c19d00	str x0,[x19, #0x1330]
00c19d04	b 0x00c19bf8
00c19d08	mov x0,x19
00c19d0c	bl 0x00c14270
00c19d10	cbz x0,0x00c19fb8
00c19d14	mov x22,x0
00c19d18	mov x21,xzr
00c19d1c	mov w26,#0x540
00c19d20	adrp x27,0xcb2000
00c19d24	add x27,x27,#0xe40
00c19d28	mov w28,#0x17
00c19d2c	mov w25,#0x2d
00c19d30	b 0x00c19d48
00c19d34	mov x0,x19
00c19d38	bl 0x00c14270
00c19d3c	mov x22,x0
00c19d40	mov x0,xzr
00c19d44	cbz x22,0x00c19fb8
00c19d48	ldp x8,x9,[x19]
00c19d4c	cmp x9,x8
00c19d50	b.eq 0x00c19dd8
00c19d54	ldrb w8,[x8]
00c19d58	cmp w8,#0x49
00c19d5c	b.ne 0x00c19dd8
00c19d60	mov x0,x19
00c19d64	mov w1,wzr
00c19d68	bl 0x00c14948
00c19d6c	cbz x0,0x00c19fb8
00c19d70	ldr x24,[x19, #0x1330]
00c19d74	mov x23,x0
00c19d78	ldr x8,[x24, #0x8]
00c19d7c	sub x9,x8,#0xfd0
00c19d80	cmn x9,#0xff1
00c19d84	b.hi 0x00c19da4
00c19d88	mov w0,#0x1000
00c19d8c	bl 0x00c308d0
00c19d90	cbz x0,0x00c19fdc
00c19d94	mov x8,xzr
00c19d98	stp x24,xzr,[x0]
00c19d9c	mov x24,x0
00c19da0	str x0,[x19, #0x1330]
00c19da4	add x9,x8,#0x20
00c19da8	add x8,x24,x8
00c19dac	str x9,[x24, #0x8]
00c19db0	adrp x9,0xcb3000
00c19db4	add x9,x9,#0x5c0
00c19db8	str x9,[x8, #0x10]!
00c19dbc	ldurh w9,[x8, #0x9]
00c19dc0	stp x22,x23,[x8, #0x10]
00c19dc4	mov x22,x8
00c19dc8	and w9,w9,#0xf000
00c19dcc	strb w25,[x8, #0x8]
00c19dd0	orr w9,w9,w26
00c19dd4	sturh w9,[x8, #0x9]
00c19dd8	cbz x21,0x00c19e3c
00c19ddc	ldr x23,[x19, #0x1330]
00c19de0	ldr x8,[x23, #0x8]
00c19de4	sub x9,x8,#0xfd0
00c19de8	cmn x9,#0xff1
00c19dec	b.hi 0x00c19e0c
00c19df0	mov w0,#0x1000
00c19df4	bl 0x00c308d0
00c19df8	cbz x0,0x00c19fdc
00c19dfc	mov x8,xzr
00c19e00	stp x23,xzr,[x0]
00c19e04	mov x23,x0
00c19e08	str x0,[x19, #0x1330]
00c19e0c	add x9,x8,#0x20
00c19e10	add x8,x23,x8
00c19e14	str x9,[x23, #0x8]
00c19e18	str x27,[x8, #0x10]!
00c19e1c	ldurh w9,[x8, #0x9]
00c19e20	strb w28,[x8, #0x8]
00c19e24	and w9,w9,#0xf000
00c19e28	stp x21,x22,[x8, #0x10]
00c19e2c	mov x21,x8
00c19e30	orr w9,w9,w26
00c19e34	sturh w9,[x8, #0x9]
00c19e38	b 0x00c19eac
00c19e3c	tbz w20,#0x0,0x00c19ea8
00c19e40	ldr x23,[x19, #0x1330]
00c19e44	ldr x8,[x23, #0x8]
00c19e48	sub x9,x8,#0xfd0
00c19e4c	cmn x9,#0xff1
00c19e50	b.hi 0x00c19e70
00c19e54	mov w0,#0x1000
00c19e58	bl 0x00c308d0
00c19e5c	cbz x0,0x00c19fdc
00c19e60	mov x8,xzr
00c19e64	stp x23,xzr,[x0]
00c19e68	mov x23,x0
00c19e6c	str x0,[x19, #0x1330]
00c19e70	add x9,x8,#0x20
00c19e74	add x21,x23,x8
00c19e78	adrp x8,0xcb3000
00c19e7c	add x8,x8,#0x20
00c19e80	str x9,[x23, #0x8]
00c19e84	mov w9,#0x2e
00c19e88	str x8,[x21, #0x10]!
00c19e8c	ldurh w8,[x21, #0x9]
00c19e90	strb w9,[x21, #0x8]
00c19e94	and w8,w8,#0xf000
00c19e98	str x22,[x21, #0x10]
00c19e9c	orr w8,w8,w26
00c19ea0	sturh w8,[x21, #0x9]
00c19ea4	b 0x00c19eac
00c19ea8	mov x21,x22
00c19eac	ldp x8,x9,[x19]
00c19eb0	cmp x8,x9
00c19eb4	b.eq 0x00c19d34
00c19eb8	ldrb w9,[x8]
00c19ebc	cmp w9,#0x45
00c19ec0	b.ne 0x00c19d34
00c19ec4	add x8,x8,#0x1
00c19ec8	str x8,[x19]
00c19ecc	mov x0,x19
00c19ed0	bl 0x00c21e40
00c19ed4	cbz x0,0x00c19fb8
00c19ed8	ldr x22,[x19, #0x1330]
00c19edc	mov x20,x0
00c19ee0	ldr x8,[x22, #0x8]
00c19ee4	sub x9,x8,#0xfd0
00c19ee8	cmn x9,#0xff1
00c19eec	b.hi 0x00c19f0c
00c19ef0	mov w0,#0x1000
00c19ef4	bl 0x00c308d0
00c19ef8	cbz x0,0x00c19fdc
00c19efc	mov x8,xzr
00c19f00	stp x22,xzr,[x0]
00c19f04	mov x22,x0
00c19f08	str x0,[x19, #0x1330]
00c19f0c	add x9,x8,#0x20
00c19f10	add x0,x22,x8
00c19f14	adrp x8,0xcb2000
00c19f18	add x8,x8,#0xe40
00c19f1c	str x9,[x22, #0x8]
00c19f20	mov w10,#0x540
00c19f24	str x8,[x0, #0x10]!
00c19f28	ldurh w8,[x0, #0x9]
00c19f2c	mov w9,#0x17
00c19f30	stp x21,x20,[x0, #0x10]
00c19f34	and w8,w8,#0xf000
00c19f38	strb w9,[x0, #0x8]
00c19f3c	b 0x00c19fb0
00c19f40	add x8,x8,#0x1
00c19f44	mov x0,x19
00c19f48	str x8,[x19]
00c19f4c	bl 0x00c21e40
00c19f50	cbz x0,0x00c19fb8
00c19f54	ldr x22,[x19, #0x1330]
00c19f58	mov x21,x0
00c19f5c	ldr x8,[x22, #0x8]
00c19f60	sub x9,x8,#0xfd0
00c19f64	cmn x9,#0xff1
00c19f68	b.hi 0x00c19f88
00c19f6c	mov w0,#0x1000
00c19f70	bl 0x00c308d0
00c19f74	cbz x0,0x00c19fdc
00c19f78	mov x8,xzr
00c19f7c	stp x22,xzr,[x0]
00c19f80	mov x22,x0
00c19f84	str x0,[x19, #0x1330]
00c19f88	add x9,x8,#0x20
00c19f8c	add x0,x22,x8
00c19f90	mov w10,#0x540
00c19f94	str x9,[x22, #0x8]
00c19f98	mov w9,#0x17
00c19f9c	str x24,[x0, #0x10]!
00c19fa0	ldurh w8,[x0, #0x9]
00c19fa4	strb w9,[x0, #0x8]
00c19fa8	and w8,w8,#0xf000
00c19fac	stp x20,x21,[x0, #0x10]
00c19fb0	orr w8,w8,w10
00c19fb4	sturh w8,[x0, #0x9]
00c19fb8	ldp x20,x19,[sp, #0x60]
00c19fbc	ldp x22,x21,[sp, #0x50]
00c19fc0	ldp x24,x23,[sp, #0x40]
00c19fc4	ldp x26,x25,[sp, #0x30]
00c19fc8	ldp x28,x27,[sp, #0x20]
00c19fcc	ldp x29,x30,[sp, #0x10]
00c19fd0	add sp,sp,#0x70
00c19fd4	autiasp
00c19fd8	ret
00c19fdc	bl 0x00c2fff0
