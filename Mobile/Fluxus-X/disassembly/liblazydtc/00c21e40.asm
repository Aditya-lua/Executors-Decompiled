; FUN_00c21e40 @ 00c21e40
00c21e40	paciasp
00c21e44	stp x29,x30,[sp, #-0x30]!
00c21e48	stp x22,x21,[sp, #0x10]
00c21e4c	stp x20,x19,[sp, #0x20]
00c21e50	mov x29,sp
00c21e54	ldp x8,x9,[x0]
00c21e58	mov x19,x0
00c21e5c	subs x10,x9,x8
00c21e60	b.eq 0x00c21ea4
00c21e64	ldrb w11,[x8]
00c21e68	sub w11,w11,#0x3a
00c21e6c	cmn w11,#0xa
00c21e70	b.cs 0x00c21eb8
00c21e74	cmp x10,#0x2
00c21e78	b.cc 0x00c21ea4
00c21e7c	ldrh w10,[x8]
00c21e80	mov w11,#0x6e64
00c21e84	cmp w10,w11
00c21e88	b.eq 0x00c21f68
00c21e8c	ldrh w9,[x8]
00c21e90	mov w10,#0x6e6f
00c21e94	cmp w9,w10
00c21e98	b.ne 0x00c21ea4
00c21e9c	add x8,x8,#0x2
00c21ea0	str x8,[x19]
00c21ea4	mov x0,x19
00c21ea8	mov x1,xzr
00c21eac	bl 0x00c221f4
00c21eb0	cbnz x0,0x00c21ec4
00c21eb4	b 0x00c22008
00c21eb8	mov x0,x19
00c21ebc	bl 0x00c14270
00c21ec0	cbz x0,0x00c22008
00c21ec4	ldp x8,x9,[x19]
00c21ec8	cmp x9,x8
00c21ecc	b.eq 0x00c22008
00c21ed0	ldrb w8,[x8]
00c21ed4	cmp w8,#0x49
00c21ed8	b.ne 0x00c22008
00c21edc	mov x20,x0
00c21ee0	mov x0,x19
00c21ee4	mov w1,wzr
00c21ee8	bl 0x00c14948
00c21eec	cbz x0,0x00c22008
00c21ef0	ldr x21,[x19, #0x1330]
00c21ef4	ldr x8,[x21, #0x8]
00c21ef8	sub x9,x8,#0xfd0
00c21efc	cmn x9,#0xff1
00c21f00	b.hi 0x00c21f28
00c21f04	mov x22,x0
00c21f08	mov w0,#0x1000
00c21f0c	bl 0x00c308d0
00c21f10	cbz x0,0x00c220cc
00c21f14	mov x8,xzr
00c21f18	stp x21,xzr,[x0]
00c21f1c	mov x21,x0
00c21f20	str x0,[x19, #0x1330]
00c21f24	mov x0,x22
00c21f28	add x9,x8,#0x20
00c21f2c	add x8,x21,x8
00c21f30	adrp x10,0xcb3000
00c21f34	add x10,x10,#0x5c0
00c21f38	str x9,[x21, #0x8]
00c21f3c	mov w11,#0x540
00c21f40	str x10,[x8, #0x10]!
00c21f44	ldurh w9,[x8, #0x9]
00c21f48	mov w10,#0x2d
00c21f4c	stp x20,x0,[x8, #0x10]
00c21f50	mov x0,x8
00c21f54	and w9,w9,#0xf000
00c21f58	strb w10,[x8, #0x8]
00c21f5c	orr w9,w9,w11
00c21f60	sturh w9,[x8, #0x9]
00c21f64	b 0x00c22008
00c21f68	add x8,x8,#0x2
00c21f6c	cmp x9,x8
00c21f70	str x8,[x19]
00c21f74	b.eq 0x00c21f88
00c21f78	ldrb w8,[x8]
00c21f7c	sub w8,w8,#0x3a
00c21f80	cmn w8,#0xa
00c21f84	b.cs 0x00c2201c
00c21f88	mov x0,x19
00c21f8c	bl 0x00c21ccc
00c21f90	mov x8,x0
00c21f94	cbz x0,0x00c22008
00c21f98	ldr x20,[x19, #0x1330]
00c21f9c	ldr x9,[x20, #0x8]
00c21fa0	sub x10,x9,#0xfd0
00c21fa4	cmn x10,#0xff1
00c21fa8	b.hi 0x00c21fd0
00c21fac	mov w0,#0x1000
00c21fb0	mov x21,x8
00c21fb4	bl 0x00c308d0
00c21fb8	cbz x0,0x00c220cc
00c21fbc	mov x9,xzr
00c21fc0	stp x20,xzr,[x0]
00c21fc4	mov x20,x0
00c21fc8	mov x8,x21
00c21fcc	str x0,[x19, #0x1330]
00c21fd0	add x10,x9,#0x20
00c21fd4	add x0,x20,x9
00c21fd8	adrp x9,0xcb2000
00c21fdc	add x9,x9,#0xeb8
00c21fe0	str x10,[x20, #0x8]
00c21fe4	mov w11,#0x540
00c21fe8	str x9,[x0, #0x10]!
00c21fec	ldurh w9,[x0, #0x9]
00c21ff0	mov w10,#0x32
00c21ff4	str x8,[x0, #0x10]
00c21ff8	and w9,w9,#0xf000
00c21ffc	strb w10,[x0, #0x8]
00c22000	orr w9,w9,w11
00c22004	sturh w9,[x0, #0x9]
00c22008	ldp x20,x19,[sp, #0x20]
00c2200c	ldp x22,x21,[sp, #0x10]
00c22010	ldp x29,x30,[sp], #0x30
00c22014	autiasp
00c22018	ret
00c2201c	mov x0,x19
00c22020	bl 0x00c14270
00c22024	cbz x0,0x00c22008
00c22028	ldp x9,x10,[x19]
00c2202c	mov x8,x0
00c22030	cmp x10,x9
00c22034	b.eq 0x00c21f98
00c22038	ldrb w9,[x9]
00c2203c	cmp w9,#0x49
00c22040	b.ne 0x00c21f98
00c22044	mov x0,x19
00c22048	mov w1,wzr
00c2204c	mov x20,x8
00c22050	bl 0x00c14948
00c22054	cbz x0,0x00c22008
00c22058	ldr x21,[x19, #0x1330]
00c2205c	ldr x8,[x21, #0x8]
00c22060	sub x9,x8,#0xfd0
00c22064	cmn x9,#0xff1
00c22068	b.hi 0x00c22090
00c2206c	mov x22,x0
00c22070	mov w0,#0x1000
00c22074	bl 0x00c308d0
00c22078	cbz x0,0x00c220cc
00c2207c	mov x8,xzr
00c22080	stp x21,xzr,[x0]
00c22084	mov x21,x0
00c22088	str x0,[x19, #0x1330]
00c2208c	mov x0,x22
00c22090	add x9,x8,#0x20
00c22094	add x8,x21,x8
00c22098	adrp x10,0xcb3000
00c2209c	add x10,x10,#0x5c0
00c220a0	str x9,[x21, #0x8]
00c220a4	mov w11,#0x540
00c220a8	str x10,[x8, #0x10]!
00c220ac	ldurh w9,[x8, #0x9]
00c220b0	mov w10,#0x2d
00c220b4	stp x20,x0,[x8, #0x10]
00c220b8	and w9,w9,#0xf000
00c220bc	strb w10,[x8, #0x8]
00c220c0	orr w9,w9,w11
00c220c4	sturh w9,[x8, #0x9]
00c220c8	b 0x00c21f98
00c220cc	bl 0x00c2fff0
