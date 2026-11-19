; FUN_00a68c5c @ 00a68c5c
00a68c5c	stp x24,x23,[sp, #-0x40]!
00a68c60	stp x22,x21,[sp, #0x10]
00a68c64	stp x20,x19,[sp, #0x20]
00a68c68	stp x29,x30,[sp, #0x30]
00a68c6c	ldr x24,[x1, #0x10]
00a68c70	mov x21,x1
00a68c74	adrp x1,0x2b2000
00a68c78	mov x20,x2
00a68c7c	mov w22,w0
00a68c80	add x1,x1,#0x239
00a68c84	mov w0,#0x90
00a68c88	mov w2,#0x31
00a68c8c	add x29,sp,#0x30
00a68c90	bl 0x00c34250
00a68c94	cbz x0,0x00a68ecc
00a68c98	mov x19,x0
00a68c9c	bl 0x00c34d50
00a68ca0	add x23,x19,#0x20
00a68ca4	str x0,[x19, #0x28]
00a68ca8	cbz x0,0x00a68ce8
00a68cac	mov w8,#0x1
00a68cb0	mov x0,x21
00a68cb4	stlr w8,[x23]
00a68cb8	str w22,[x19, #0x8]
00a68cbc	bl 0x00c3b4e0
00a68cc0	str x0,[x19, #0x10]
00a68cc4	cbz x0,0x00a68e24
00a68cc8	ldr x11,[x21, #0x18]
00a68ccc	mov w9,wzr
00a68cd0	mov w8,wzr
00a68cd4	add x10,x24,#0x8
00a68cd8	str x11,[x19, #0x18]
00a68cdc	adrp x11,0x766000
00a68ce0	add x11,x11,#0x488
00a68ce4	b 0x00a68d08
00a68ce8	ldxr w8,[x23]
00a68cec	subs w9,w8,#0x1
00a68cf0	stxr w10,w9,[x23]
00a68cf4	cbnz w10,0x00a68ce8
00a68cf8	b.ne 0x00a68e8c
00a68cfc	dmb ISHLD
00a68d00	b 0x00a68e94
00a68d04	add x10,x10,#0x10
00a68d08	ldur w12,[x10, #-0x8]
00a68d0c	cmp w12,#0xc
00a68d10	b.hi 0x00a68d04
00a68d14	ldrsw x12,[x11, x12, LSL #0x2]
00a68d18	add x12,x12,x11
00a68d1c	br x12
00a68d20	ldr x12,[x19, #0x30]
00a68d24	cbnz x12,0x00a68d04
00a68d28	ldr x12,[x10], #0x10
00a68d2c	add w8,w8,#0x1
00a68d30	str x12,[x19, #0x30]
00a68d34	b 0x00a68d08
00a68d38	ldr x12,[x19, #0x38]
00a68d3c	cbnz x12,0x00a68d04
00a68d40	ldr x12,[x10], #0x10
00a68d44	str x12,[x19, #0x38]
00a68d48	b 0x00a68d08
00a68d4c	ldr x12,[x19, #0x40]
00a68d50	cbnz x12,0x00a68d04
00a68d54	ldr x12,[x10], #0x10
00a68d58	add w8,w8,#0x1
00a68d5c	str x12,[x19, #0x40]
00a68d60	b 0x00a68d08
00a68d64	ldr x12,[x19, #0x48]
00a68d68	cbnz x12,0x00a68d04
00a68d6c	ldr x12,[x10], #0x10
00a68d70	add w9,w9,#0x1
00a68d74	str x12,[x19, #0x48]
00a68d78	b 0x00a68d08
00a68d7c	ldr x12,[x19, #0x50]
00a68d80	cbnz x12,0x00a68d04
00a68d84	ldr x12,[x10], #0x10
00a68d88	add w9,w9,#0x1
00a68d8c	str x12,[x19, #0x50]
00a68d90	b 0x00a68d08
00a68d94	ldr x12,[x19, #0x58]
00a68d98	cbnz x12,0x00a68d04
00a68d9c	ldr x12,[x10], #0x10
00a68da0	add w9,w9,#0x1
00a68da4	str x12,[x19, #0x58]
00a68da8	b 0x00a68d08
00a68dac	ldr x12,[x19, #0x78]
00a68db0	cbnz x12,0x00a68d04
00a68db4	ldr x12,[x10], #0x10
00a68db8	str x12,[x19, #0x78]
00a68dbc	b 0x00a68d08
00a68dc0	ldr x12,[x19, #0x80]
00a68dc4	cbnz x12,0x00a68d04
00a68dc8	ldr x12,[x10], #0x10
00a68dcc	str x12,[x19, #0x80]
00a68dd0	b 0x00a68d08
00a68dd4	ldr x12,[x19, #0x88]
00a68dd8	cbnz x12,0x00a68d04
00a68ddc	ldr x12,[x10]
00a68de0	str x12,[x19, #0x88]
00a68de4	b 0x00a68d04
00a68de8	ldr x12,[x19, #0x60]
00a68dec	cbnz x12,0x00a68d04
00a68df0	ldr x12,[x10], #0x10
00a68df4	str x12,[x19, #0x60]
00a68df8	b 0x00a68d08
00a68dfc	ldr x12,[x19, #0x68]
00a68e00	cbnz x12,0x00a68d04
00a68e04	ldr x12,[x10], #0x10
00a68e08	str x12,[x19, #0x68]
00a68e0c	b 0x00a68d08
00a68e10	ldr x12,[x19, #0x70]
00a68e14	cbnz x12,0x00a68d04
00a68e18	ldr x12,[x10], #0x10
00a68e1c	str x12,[x19, #0x70]
00a68e20	b 0x00a68d08
00a68e24	ldxr w8,[x23]
00a68e28	subs w9,w8,#0x1
00a68e2c	stxr w10,w9,[x23]
00a68e30	cbnz w10,0x00a68e24
00a68e34	b.ne 0x00a68f18
00a68e38	dmb ISHLD
00a68e3c	ldr x0,[x19, #0x10]
00a68e40	b 0x00a68f28
00a68e44	cmp w9,#0x3
00a68e48	b.ne 0x00a68e6c
00a68e4c	cmp w8,#0x2
00a68e50	b.ne 0x00a68e6c
00a68e54	str x20,[x19]
00a68e58	cbz x20,0x00a68e64
00a68e5c	mov x0,x20
00a68e60	bl 0x00c3b6a0
00a68e64	mov x1,x19
00a68e68	b 0x00a68f00
00a68e6c	ldxr w8,[x23]
00a68e70	subs w9,w8,#0x1
00a68e74	stxr w10,w9,[x23]
00a68e78	cbnz w10,0x00a68e6c
00a68e7c	b.ne 0x00a68f60
00a68e80	dmb ISHLD
00a68e84	ldr x0,[x19, #0x10]
00a68e88	b 0x00a68f68
00a68e8c	cmp w8,#0x1
00a68e90	b.gt 0x00a68ecc
00a68e94	ldr x0,[x19, #0x10]
00a68e98	adrp x20,0x2b2000
00a68e9c	add x20,x20,#0x239
00a68ea0	mov w2,#0x27
00a68ea4	mov x1,x20
00a68ea8	bl 0x00c32310
00a68eac	ldr x0,[x19]
00a68eb0	bl 0x00c3b690
00a68eb4	ldr x0,[x19, #0x28]
00a68eb8	bl 0x00c34d40
00a68ebc	mov w2,#0x2a
00a68ec0	mov x0,x19
00a68ec4	mov x1,x20
00a68ec8	bl 0x00c32310
00a68ecc	bl 0x00c342a0
00a68ed0	adrp x0,0x2b2000
00a68ed4	adrp x2,0x2a7000
00a68ed8	add x0,x0,#0x239
00a68edc	add x2,x2,#0xfcf
00a68ee0	mov w1,#0x45
00a68ee4	bl 0x00c342b0
00a68ee8	mov w1,#0x100
00a68eec	orr w0,wzr,#0x6
00a68ef0	movk w1,#0xc, LSL #16
00a68ef4	mov x2,xzr
00a68ef8	bl 0x00c342c0
00a68efc	mov x1,xzr
00a68f00	ldp x29,x30,[sp, #0x30]
00a68f04	ldp x20,x19,[sp, #0x20]
00a68f08	ldp x22,x21,[sp, #0x10]
00a68f0c	mov x0,x1
00a68f10	ldp x24,x23,[sp], #0x40
00a68f14	ret
00a68f18	mov x0,xzr
00a68f1c	cmp w8,#0x1
00a68f20	mov x1,xzr
00a68f24	b.gt 0x00a68f00
00a68f28	adrp x20,0x2b2000
00a68f2c	add x20,x20,#0x239
00a68f30	mov w2,#0x27
00a68f34	mov x1,x20
00a68f38	bl 0x00c32310
00a68f3c	ldr x0,[x19]
00a68f40	bl 0x00c3b690
00a68f44	ldr x0,[x19, #0x28]
00a68f48	bl 0x00c34d40
00a68f4c	mov w2,#0x2a
00a68f50	mov x0,x19
00a68f54	mov x1,x20
00a68f58	bl 0x00c32310
00a68f5c	b 0x00a68efc
00a68f60	cmp w8,#0x1
00a68f64	b.gt 0x00a68f9c
00a68f68	adrp x20,0x2b2000
00a68f6c	add x20,x20,#0x239
00a68f70	mov w2,#0x27
00a68f74	mov x1,x20
00a68f78	bl 0x00c32310
00a68f7c	ldr x0,[x19]
00a68f80	bl 0x00c3b690
00a68f84	ldr x0,[x19, #0x28]
00a68f88	bl 0x00c34d40
00a68f8c	mov w2,#0x2a
00a68f90	mov x0,x19
00a68f94	mov x1,x20
00a68f98	bl 0x00c32310
00a68f9c	bl 0x00c342a0
00a68fa0	adrp x0,0x2b2000
00a68fa4	adrp x2,0x2a7000
00a68fa8	add x0,x0,#0x239
00a68fac	add x2,x2,#0xfcf
00a68fb0	mov w1,#0x9f
00a68fb4	bl 0x00c342b0
00a68fb8	orr w0,wzr,#0x6
00a68fbc	mov w1,#0xc1
00a68fc0	b 0x00a68ef4
