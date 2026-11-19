; FUN_00b19c68 @ 00b19c68
00b19c68	stp x22,x21,[sp, #-0x30]!
00b19c6c	sub w8,w1,#0x1
00b19c70	cmp w8,#0x9a
00b19c74	stp x20,x19,[sp, #0x10]
00b19c78	stp x29,x30,[sp, #0x20]
00b19c7c	add x29,sp,#0x20
00b19c80	b.hi 0x00b19ca8
00b19c84	adrp x9,0x77b000
00b19c88	add x9,x9,#0x820
00b19c8c	ldrsw x8,[x9, x8, LSL #0x2]
00b19c90	ldr x19,[x0, #0x40]
00b19c94	mov x20,x3
00b19c98	mov x22,x0
00b19c9c	add x8,x8,x9
00b19ca0	mov w21,#0x1
00b19ca4	br x8
00b19ca8	mov x21,xzr
00b19cac	b 0x00b19fac
00b19cb0	mov w8,#0x1
00b19cb4	str w8,[x19]
00b19cb8	ldr w0,[x22, #0x38]
00b19cbc	cmn w0,#0x1
00b19cc0	b.eq 0x00b19cd0
00b19cc4	bl 0x00c38750
00b19cc8	mov w8,#0xffffffff
00b19ccc	str w8,[x22, #0x38]
00b19cd0	ldr x0,[x19, #0x20]
00b19cd4	bl 0x00c384d0
00b19cd8	mov x21,xzr
00b19cdc	str xzr,[x19, #0x20]
00b19ce0	str wzr,[x22, #0x30]
00b19ce4	b 0x00b19fac
00b19ce8	ldr w8,[x22, #0x30]
00b19cec	ubfx w21,w8,#0xb,#0x1
00b19cf0	b 0x00b19fac
00b19cf4	mov w21,#0x1
00b19cf8	cbz x20,0x00b19fac
00b19cfc	cmp x2,#0x3
00b19d00	str w21,[x22, #0x28]
00b19d04	b.hi 0x00b19ca8
00b19d08	adrp x8,0x77b000
00b19d0c	add x8,x8,#0xa8c
00b19d10	ldrsw x9,[x8, x2, LSL #0x2]
00b19d14	add x8,x9,x8
00b19d18	br x8
00b19d1c	ldr x22,[x19, #0x10]!
00b19d20	adrp x1,0x2bc000
00b19d24	add x1,x1,#0x77a
00b19d28	mov w2,#0x1c9
00b19d2c	mov x21,x19
00b19d30	ldr x0,[x21, #-0x8]!
00b19d34	bl 0x00c32310
00b19d38	mov x0,x20
00b19d3c	mov x1,x21
00b19d40	mov x2,x19
00b19d44	mov w3,wzr
00b19d48	str xzr,[x21]
00b19d4c	bl 0x00c385a0
00b19d50	ldr x8,[x19]
00b19d54	sxtw x21,w0
00b19d58	cmp x22,x8
00b19d5c	b.eq 0x00b19fac
00b19d60	adrp x1,0x2bc000
00b19d64	add x1,x1,#0x77a
00b19d68	mov w2,#0x1d0
00b19d6c	mov x0,x22
00b19d70	bl 0x00c32310
00b19d74	b 0x00b19fac
00b19d78	ldr w8,[x19]
00b19d7c	cmp w8,#0x5
00b19d80	b.ne 0x00b19e80
00b19d84	mov w21,#0x1
00b19d88	b 0x00b19fac
00b19d8c	ldr w8,[x19, #0x18]
00b19d90	cbz x2,0x00b19e94
00b19d94	orr w8,w8,#0x8
00b19d98	b 0x00b19e98
00b19d9c	ldr w8,[x22, #0x28]
00b19da0	cbz w8,0x00b19fa8
00b19da4	cbz x20,0x00b19ea4
00b19da8	ldr w8,[x22, #0x38]!
00b19dac	str w8,[x20]
00b19db0	ldrsw x21,[x22]
00b19db4	b 0x00b19fac
00b19db8	ldrsw x21,[x22, #0x2c]
00b19dbc	b 0x00b19fac
00b19dc0	str w2,[x22, #0x2c]
00b19dc4	mov w21,#0x1
00b19dc8	b 0x00b19fac
00b19dcc	ldr x3,[x19, #0x8]
00b19dd0	cbz x3,0x00b19de4
00b19dd4	mov w1,#0x64
00b19dd8	mov x0,x20
00b19ddc	mov x2,xzr
00b19de0	bl 0x00c321a0
00b19de4	ldr x3,[x19, #0x10]
00b19de8	cbz x3,0x00b19dfc
00b19dec	mov w1,#0x64
00b19df0	mov w2,#0x1
00b19df4	mov x0,x20
00b19df8	bl 0x00c321a0
00b19dfc	ldr w3,[x19, #0x4]
00b19e00	mov w1,#0x64
00b19e04	orr w2,wzr,#0x3
00b19e08	mov x0,x20
00b19e0c	bl 0x00c35600
00b19e10	ldrsw x2,[x19, #0x18]
00b19e14	mov w1,#0x9b
00b19e18	mov x0,x20
00b19e1c	mov x3,xzr
00b19e20	bl 0x00c321a0
00b19e24	ldr x2,[x19, #0x30]
00b19e28	orr w1,wzr,#0xe
00b19e2c	mov x0,x20
00b19e30	bl 0x00c38450
00b19e34	mov w21,#0x1
00b19e38	b 0x00b19fac
00b19e3c	ldr x8,[x19, #0x30]
00b19e40	str x8,[x20]
00b19e44	mov w21,#0x1
00b19e48	b 0x00b19fac
00b19e4c	cbz x20,0x00b19ca8
00b19e50	cmp x2,#0x3
00b19e54	b.hi 0x00b19ca8
00b19e58	adrp x8,0x77b000
00b19e5c	add x8,x8,#0xa9c
00b19e60	ldrsw x9,[x8, x2, LSL #0x2]
00b19e64	add x8,x9,x8
00b19e68	br x8
00b19e6c	ldr x8,[x19, #0x8]
00b19e70	b 0x00b19e40
00b19e74	str w2,[x19, #0x18]
00b19e78	mov w21,#0x1
00b19e7c	b 0x00b19fac
00b19e80	mov x0,x22
00b19e84	mov x1,x19
00b19e88	bl 0x00b1a170
00b19e8c	sxtw x21,w0
00b19e90	b 0x00b19fac
00b19e94	and w8,w8,#0xfffffff7
00b19e98	str w8,[x19, #0x18]
00b19e9c	mov w21,#0x1
00b19ea0	b 0x00b19fac
00b19ea4	add x22,x22,#0x38
00b19ea8	ldrsw x21,[x22]
00b19eac	b 0x00b19fac
00b19eb0	ldr x0,[x19, #0x10]
00b19eb4	adrp x21,0x2bc000
00b19eb8	add x21,x21,#0x77a
00b19ebc	mov w2,#0x1d2
00b19ec0	mov x1,x21
00b19ec4	bl 0x00c32310
00b19ec8	mov w2,#0x1d3
00b19ecc	mov x0,x20
00b19ed0	mov x1,x21
00b19ed4	bl 0x00c34600
00b19ed8	cmp x0,#0x0
00b19edc	cset w8,ne
00b19ee0	str x0,[x19, #0x10]
00b19ee4	mov x0,x8
00b19ee8	b 0x00b19fb0
00b19eec	mov w1,#0x1
00b19ef0	mov x0,x20
00b19ef4	bl 0x00c38520
00b19ef8	mov x21,x0
00b19efc	mov w1,#0x1
00b19f00	mov x0,x20
00b19f04	bl 0x00c38550
00b19f08	mov x20,x0
00b19f0c	cbz x21,0x00b19fc0
00b19f10	cbz x20,0x00b19fc0
00b19f14	ldr x0,[x19, #0x8]
00b19f18	adrp x22,0x2bc000
00b19f1c	add x22,x22,#0x77a
00b19f20	mov w2,#0x1dc
00b19f24	mov x1,x22
00b19f28	bl 0x00c32310
00b19f2c	ldr x0,[x19, #0x10]
00b19f30	mov w2,#0x1de
00b19f34	mov x1,x22
00b19f38	str x21,[x19, #0x8]
00b19f3c	bl 0x00c32310
00b19f40	ldr x0,[x19, #0x20]
00b19f44	str x20,[x19, #0x10]
00b19f48	bl 0x00c384d0
00b19f4c	stp xzr,xzr,[x19, #0x20]
00b19f50	mov w21,#0x1
00b19f54	b 0x00b19fac
00b19f58	ldr w8,[x20]
00b19f5c	mov w21,#0x1
00b19f60	str w8,[x19, #0x4]
00b19f64	b 0x00b19fac
00b19f68	ldr x8,[x19, #0x10]
00b19f6c	b 0x00b19e40
00b19f70	ldr x0,[x19, #0x28]
00b19f74	bl 0x00c384b0
00b19f78	str x0,[x20]
00b19f7c	mov w21,#0x1
00b19f80	b 0x00b19fac
00b19f84	ldr x0,[x19, #0x28]
00b19f88	bl 0x00c384c0
00b19f8c	cbz w0,0x00b19fec
00b19f90	cmp w0,#0xa
00b19f94	b.eq 0x00b19ff4
00b19f98	cmp w0,#0x2
00b19f9c	b.ne 0x00b19fa8
00b19fa0	mov w21,#0x4
00b19fa4	b 0x00b19fac
00b19fa8	mov x21,#-0x1
00b19fac	mov x0,x21
00b19fb0	ldp x29,x30,[sp, #0x20]
00b19fb4	ldp x20,x19,[sp, #0x10]
00b19fb8	ldp x22,x21,[sp], #0x30
00b19fbc	ret
00b19fc0	adrp x19,0x2bc000
00b19fc4	add x19,x19,#0x77a
00b19fc8	mov w2,#0x1e4
00b19fcc	mov x0,x21
00b19fd0	mov x1,x19
00b19fd4	bl 0x00c32310
00b19fd8	mov w2,#0x1e5
00b19fdc	mov x0,x20
00b19fe0	mov x1,x19
00b19fe4	bl 0x00c32310
00b19fe8	b 0x00b19ca8
00b19fec	ldrsw x21,[x19, #0x4]
00b19ff0	b 0x00b19fac
00b19ff4	orr w21,wzr,#0x6
00b19ff8	b 0x00b19fac
