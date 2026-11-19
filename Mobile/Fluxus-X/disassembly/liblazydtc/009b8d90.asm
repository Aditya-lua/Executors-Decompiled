; ssl_cache_cipherlist @ 009b8d90
009b8d90	str x23,[sp, #-0x40]!
009b8d94	stp x22,x21,[sp, #0x10]
009b8d98	stp x20,x19,[sp, #0x20]
009b8d9c	stp x29,x30,[sp, #0x30]
009b8da0	ldr x8,[x1, #0x8]
009b8da4	mov x19,x0
009b8da8	add x29,sp,#0x30
009b8dac	cbz x8,0x009b8df4
009b8db0	cmp w2,#0x0
009b8db4	mov w9,#0x2
009b8db8	cinc x23,x9,ne
009b8dbc	udiv x9,x8,x23
009b8dc0	mov w21,w2
009b8dc4	msub x8,x9,x23,x8
009b8dc8	cbz x8,0x009b8e40
009b8dcc	bl 0x00c342a0
009b8dd0	adrp x0,0x2c5000
009b8dd4	adrp x2,0x2a7000
009b8dd8	add x0,x0,#0x652
009b8ddc	add x2,x2,#0xaf5
009b8de0	mov w1,#0x15f1
009b8de4	bl 0x00c342b0
009b8de8	mov w1,#0x32
009b8dec	mov w2,#0x97
009b8df0	b 0x009b8e18
009b8df4	bl 0x00c342a0
009b8df8	adrp x0,0x2c5000
009b8dfc	adrp x2,0x2a7000
009b8e00	add x0,x0,#0x652
009b8e04	add x2,x2,#0xaf5
009b8e08	mov w1,#0x15ec
009b8e0c	bl 0x00c342b0
009b8e10	mov w1,#0x2f
009b8e14	mov w2,#0xb7
009b8e18	mov x0,x19
009b8e1c	mov x3,xzr
009b8e20	bl 0x00c34410
009b8e24	mov w8,wzr
009b8e28	ldp x29,x30,[sp, #0x30]
009b8e2c	ldp x20,x19,[sp, #0x20]
009b8e30	ldp x22,x21,[sp, #0x10]
009b8e34	mov w0,w8
009b8e38	ldr x23,[sp], #0x40
009b8e3c	ret
009b8e40	ldr x0,[x19, #0x350]
009b8e44	mov x20,x1
009b8e48	adrp x1,0x2c5000
009b8e4c	add x1,x1,#0x652
009b8e50	mov w2,#0x15f5
009b8e54	add x22,x19,#0x350
009b8e58	bl 0x00c32310
009b8e5c	str xzr,[x19, #0x358]
009b8e60	str xzr,[x19, #0x350]
009b8e64	cbz w21,0x009b8ee8
009b8e68	ldp x20,x21,[x20]
009b8e6c	adrp x1,0x2c5000
009b8e70	add x1,x1,#0x652
009b8e74	mov w2,#0x1606
009b8e78	udiv x8,x21,x23
009b8e7c	lsl x0,x8,#0x1
009b8e80	bl 0x00c32320
009b8e84	str x0,[x22]
009b8e88	cbz x0,0x009b8f3c
009b8e8c	str xzr,[x19, #0x358]
009b8e90	cbz x21,0x009b8f34
009b8e94	add x9,x20,#0x1
009b8e98	sub x10,x21,#0x1
009b8e9c	ldurb w8,[x9, #-0x1]
009b8ea0	cbz w8,0x009b8eb0
009b8ea4	cmp x10,#0x1
009b8ea8	b.hi 0x009b8ecc
009b8eac	b 0x009b8f68
009b8eb0	cmp x10,#0x2
009b8eb4	b.cc 0x009b8f68
009b8eb8	ldrh w8,[x9]
009b8ebc	strh w8,[x0]
009b8ec0	ldr x8,[x19, #0x358]
009b8ec4	add x8,x8,#0x2
009b8ec8	str x8,[x19, #0x358]
009b8ecc	sub x10,x10,#0x3
009b8ed0	add x0,x0,#0x2
009b8ed4	add x9,x9,#0x3
009b8ed8	cmn x10,#0x1
009b8edc	mov w8,#0x1
009b8ee0	b.ne 0x009b8e9c
009b8ee4	b 0x009b8e28
009b8ee8	adrp x1,0x2d1000
009b8eec	add x1,x1,#0x573
009b8ef0	mov w2,#0x1c6
009b8ef4	mov x0,xzr
009b8ef8	bl 0x00c32310
009b8efc	stp xzr,xzr,[x22]
009b8f00	ldr x21,[x20, #0x8]
009b8f04	cbz x21,0x009b8f34
009b8f08	ldr x0,[x20]
009b8f0c	adrp x2,0x2d1000
009b8f10	add x2,x2,#0x573
009b8f14	mov w3,#0x1cf
009b8f18	mov x1,x21
009b8f1c	bl 0x00c345f0
009b8f20	str x0,[x22]
009b8f24	cbz x0,0x009b8fb8
009b8f28	str x21,[x19, #0x358]
009b8f2c	mov w8,#0x1
009b8f30	b 0x009b8e28
009b8f34	mov w8,#0x1
009b8f38	b 0x009b8e28
009b8f3c	bl 0x00c342a0
009b8f40	adrp x0,0x2c5000
009b8f44	adrp x2,0x2a7000
009b8f48	add x0,x0,#0x652
009b8f4c	add x2,x2,#0xaf5
009b8f50	mov w1,#0x1609
009b8f54	bl 0x00c342b0
009b8f58	mov w2,#0x100
009b8f5c	mov w1,#0x50
009b8f60	movk w2,#0xc, LSL #16
009b8f64	b 0x009b8e18
009b8f68	bl 0x00c342a0
009b8f6c	adrp x20,0x2c5000
009b8f70	add x20,x20,#0x652
009b8f74	adrp x2,0x2a7000
009b8f78	add x2,x2,#0xaf5
009b8f7c	mov w1,#0x1615
009b8f80	mov x0,x20
009b8f84	bl 0x00c342b0
009b8f88	mov w1,#0x32
009b8f8c	orr w2,wzr,#0xf0
009b8f90	mov x0,x19
009b8f94	mov x3,xzr
009b8f98	bl 0x00c34410
009b8f9c	ldr x0,[x19, #0x350]
009b8fa0	mov w2,#0x1616
009b8fa4	mov x1,x20
009b8fa8	bl 0x00c32310
009b8fac	mov w8,wzr
009b8fb0	stp xzr,xzr,[x22]
009b8fb4	b 0x009b8e28
009b8fb8	bl 0x00c342a0
009b8fbc	adrp x0,0x2c5000
009b8fc0	adrp x2,0x2a7000
009b8fc4	add x0,x0,#0x652
009b8fc8	add x2,x2,#0xaf5
009b8fcc	mov w1,#0x1620
009b8fd0	bl 0x00c342b0
009b8fd4	mov w8,#0x100
009b8fd8	movk w8,#0xc, LSL #16
009b8fdc	add w2,w8,#0x3
009b8fe0	mov w1,#0x50
009b8fe4	b 0x009b8e18
