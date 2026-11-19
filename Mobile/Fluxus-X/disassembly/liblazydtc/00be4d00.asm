; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be4d00
00be4d00	bti c
00be4d04	adrp x4,0x2b8000
00be4d08	add x4,x4,#0x7c
00be4d0c	b 0x00be4d10
00be4d10	paciasp
00be4d14	sub sp,sp,#0xf0
00be4d18	stp x29,x30,[sp, #0x90]
00be4d1c	str x27,[sp, #0xa0]
00be4d20	stp x26,x25,[sp, #0xb0]
00be4d24	stp x24,x23,[sp, #0xc0]
00be4d28	stp x22,x21,[sp, #0xd0]
00be4d2c	stp x20,x19,[sp, #0xe0]
00be4d30	add x29,sp,#0x90
00be4d34	ldr w9,[x2, #0x8]
00be4d38	mov w8,#0x25
00be4d3c	mov w19,w3
00be4d40	mov x20,x2
00be4d44	mov x21,x1
00be4d48	str x8,[x29, #0x18]
00be4d4c	add x8,x29,#0x18
00be4d50	str q0,[sp]
00be4d54	tbnz w9,#0xb,0x00be4d64
00be4d58	orr x8,x8,#0x1
00be4d5c	tbnz w9,#0xa,0x00be4d74
00be4d60	b 0x00be4d7c
00be4d64	mov w10,#0x2b
00be4d68	orr x8,x8,#0x2
00be4d6c	strb w10,[x29, #0x19]
00be4d70	tbz w9,#0xa,0x00be4d7c
00be4d74	mov w10,#0x23
00be4d78	strb w10,[x8], #0x1
00be4d7c	mov w10,#0x104
00be4d80	and w22,w9,w10
00be4d84	cmp w22,#0x104
00be4d88	b.eq 0x00be4d94
00be4d8c	mov w10,#0x2a2e
00be4d90	strh w10,[x8], #0x2
00be4d94	ldrb w10,[x4]
00be4d98	cbz w10,0x00be4dac
00be4d9c	add x11,x4,#0x1
00be4da0	strb w10,[x8], #0x1
00be4da4	ldrb w10,[x11], #0x1
00be4da8	cbnz w10,0x00be4da0
00be4dac	cmp w22,#0x100
00be4db0	b.eq 0x00be4dcc
00be4db4	cmp w22,#0x4
00be4db8	b.ne 0x00be4ddc
00be4dbc	tst w9,#0x4000
00be4dc0	mov w9,#0x46
00be4dc4	mov w10,#0x66
00be4dc8	b 0x00be4e44
00be4dcc	tst w9,#0x4000
00be4dd0	mov w9,#0x45
00be4dd4	mov w10,#0x65
00be4dd8	b 0x00be4e44
00be4ddc	cmp w22,#0x104
00be4de0	b.ne 0x00be4e38
00be4de4	tst w9,#0x4000
00be4de8	mov w9,#0x41
00be4dec	mov w10,#0x61
00be4df0	csel w9,w10,w9,eq
00be4df4	sub x10,x29,#0x1e
00be4df8	adrp x22,0xd27000
00be4dfc	strb w9,[x8]
00be4e00	adrp x8,0xd27000
00be4e04	add x8,x8,#0xf8
00be4e08	stur x10,[x29, #-0x28]
00be4e0c	ldarb w8,[x8]
00be4e10	tbz w8,#0x0,0x00be50d8
00be4e14	ldr x2,[x22, #0xf0]
00be4e18	ldr q0,[sp]
00be4e1c	sub x0,x29,#0x1e
00be4e20	add x3,x29,#0x18
00be4e24	mov w1,#0x1e
00be4e28	bl 0x00c0cd14
00be4e2c	cmp w0,#0x1d
00be4e30	b.gt 0x00be4e94
00be4e34	b 0x00be4ec0
00be4e38	tst w9,#0x4000
00be4e3c	mov w9,#0x47
00be4e40	mov w10,#0x67
00be4e44	csel w9,w10,w9,eq
00be4e48	adrp x23,0xd27000
00be4e4c	add x23,x23,#0xf8
00be4e50	strb w9,[x8]
00be4e54	sub x8,x29,#0x1e
00be4e58	stur x8,[x29, #-0x28]
00be4e5c	ldarb w8,[x23]
00be4e60	tbz w8,#0x0,0x00be5024
00be4e64	adrp x24,0xd27000
00be4e68	ldr w4,[x20, #0x10]
00be4e6c	ldr q0,[sp]
00be4e70	ldr x2,[x24, #0xf0]
00be4e74	sub x0,x29,#0x1e
00be4e78	add x3,x29,#0x18
00be4e7c	mov w1,#0x1e
00be4e80	bl 0x00c0cd14
00be4e84	cmp w0,#0x1d
00be4e88	b.le 0x00be4ec0
00be4e8c	cmp w22,#0x104
00be4e90	b.ne 0x00be4ec8
00be4e94	adrp x8,0xd27000
00be4e98	add x8,x8,#0xf8
00be4e9c	ldarb w8,[x8]
00be4ea0	tbz w8,#0x0,0x00be5064
00be4ea4	adrp x8,0xd27000
00be4ea8	ldr x1,[x8, #0xf0]
00be4eac	ldr q0,[sp]
00be4eb0	sub x0,x29,#0x28
00be4eb4	add x2,x29,#0x18
00be4eb8	bl 0x00c0cdd4
00be4ebc	b 0x00be4ee8
00be4ec0	mov x22,xzr
00be4ec4	b 0x00be4ef4
00be4ec8	ldarb w8,[x23]
00be4ecc	tbz w8,#0x0,0x00be50a0
00be4ed0	ldr x1,[x24, #0xf0]
00be4ed4	ldr w3,[x20, #0x10]
00be4ed8	ldr q0,[sp]
00be4edc	sub x0,x29,#0x28
00be4ee0	add x2,x29,#0x18
00be4ee4	bl 0x00c0cdd4
00be4ee8	cmn w0,#0x1
00be4eec	b.eq 0x00be5060
00be4ef0	ldur x22,[x29, #-0x28]
00be4ef4	ldr w9,[x20, #0x8]
00be4ef8	ldur x23,[x29, #-0x28]
00be4efc	sxtw x8,w0
00be4f00	mov w10,#0xb0
00be4f04	and w9,w9,w10
00be4f08	add x25,x23,x8
00be4f0c	cmp w9,#0x20
00be4f10	mov x26,x25
00be4f14	b.eq 0x00be4f68
00be4f18	cmp w9,#0x10
00be4f1c	b.ne 0x00be4f64
00be4f20	ldrb w9,[x23]
00be4f24	cmp w9,#0x2d
00be4f28	b.eq 0x00be4f34
00be4f2c	cmp w9,#0x2b
00be4f30	b.ne 0x00be4f3c
00be4f34	add x26,x23,#0x1
00be4f38	b 0x00be4f68
00be4f3c	cmp w8,#0x2
00be4f40	b.lt 0x00be4f64
00be4f44	cmp w9,#0x30
00be4f48	b.ne 0x00be4f64
00be4f4c	ldrb w9,[x23, #0x1]
00be4f50	orr w9,w9,#0x20
00be4f54	cmp w9,#0x78
00be4f58	b.ne 0x00be4f64
00be4f5c	add x26,x23,#0x2
00be4f60	b 0x00be4f68
00be4f64	mov x26,x23
00be4f68	sub x9,x29,#0x1e
00be4f6c	cmp x23,x9
00be4f70	b.eq 0x00be4f8c
00be4f74	lsl x0,x8,#0x1
00be4f78	bl 0x00c308d0
00be4f7c	mov x24,x0
00be4f80	mov x27,x0
00be4f84	cbnz x0,0x00be4f94
00be4f88	bl 0x00c43cc0
00be4f8c	mov x24,xzr
00be4f90	add x27,sp,#0x2f
00be4f94	add x8,sp,#0x10
00be4f98	mov x0,x20
00be4f9c	bl 0x00c30070
00be4fa0	add x4,sp,#0x20
00be4fa4	add x5,sp,#0x18
00be4fa8	add x6,sp,#0x10
00be4fac	mov x0,x23
00be4fb0	mov x1,x26
00be4fb4	mov x2,x25
00be4fb8	mov x3,x27
00be4fbc	bl 0x00c44160
00be4fc0	add x0,sp,#0x10
00be4fc4	bl 0x00c30090
00be4fc8	ldp x3,x2,[sp, #0x18]
00be4fcc	mov x0,x21
00be4fd0	mov x1,x27
00be4fd4	mov x4,x20
00be4fd8	mov w5,w19
00be4fdc	bl 0x00be5420
00be4fe0	mov x19,x0
00be4fe4	cbz x24,0x00be4ff0
00be4fe8	mov x0,x24
00be4fec	bl 0x00c30960
00be4ff0	cbz x22,0x00be4ffc
00be4ff4	mov x0,x22
00be4ff8	bl 0x00c30960
00be4ffc	mov x0,x19
00be5000	ldp x20,x19,[sp, #0xe0]
00be5004	ldr x27,[sp, #0xa0]
00be5008	ldp x22,x21,[sp, #0xd0]
00be500c	ldp x24,x23,[sp, #0xc0]
00be5010	ldp x26,x25,[sp, #0xb0]
00be5014	ldp x29,x30,[sp, #0x90]
00be5018	add sp,sp,#0xf0
00be501c	autiasp
00be5020	ret
00be5024	adrp x0,0xd27000
00be5028	add x0,x0,#0xf8
00be502c	bl 0x00c2fe90
00be5030	cbz w0,0x00be4e64
00be5034	adrp x1,0x2c6000
00be5038	add x1,x1,#0xbfc
00be503c	mov w0,#0x1fbf
00be5040	mov x2,xzr
00be5044	bl 0x00c43890
00be5048	adrp x8,0xd27000
00be504c	str x0,[x8, #0xf0]
00be5050	adrp x0,0xd27000
00be5054	add x0,x0,#0xf8
00be5058	bl 0x00c2fea0
00be505c	b 0x00be4e64
00be5060	bl 0x00c43cc0
00be5064	adrp x0,0xd27000
00be5068	add x0,x0,#0xf8
00be506c	bl 0x00c2fe90
00be5070	cbz w0,0x00be4ea4
00be5074	adrp x1,0x2c6000
00be5078	add x1,x1,#0xbfc
00be507c	mov w0,#0x1fbf
00be5080	mov x2,xzr
00be5084	bl 0x00c43890
00be5088	adrp x8,0xd27000
00be508c	str x0,[x8, #0xf0]
00be5090	adrp x0,0xd27000
00be5094	add x0,x0,#0xf8
00be5098	bl 0x00c2fea0
00be509c	b 0x00be4ea4
00be50a0	adrp x0,0xd27000
00be50a4	add x0,x0,#0xf8
00be50a8	bl 0x00c2fe90
00be50ac	cbz w0,0x00be4ed0
00be50b0	adrp x1,0x2c6000
00be50b4	add x1,x1,#0xbfc
00be50b8	mov w0,#0x1fbf
00be50bc	mov x2,xzr
00be50c0	bl 0x00c43890
00be50c4	str x0,[x24, #0xf0]
00be50c8	adrp x0,0xd27000
00be50cc	add x0,x0,#0xf8
00be50d0	bl 0x00c2fea0
00be50d4	b 0x00be4ed0
00be50d8	adrp x0,0xd27000
00be50dc	add x0,x0,#0xf8
00be50e0	bl 0x00c2fe90
00be50e4	cbz w0,0x00be4e14
00be50e8	adrp x1,0x2c6000
00be50ec	add x1,x1,#0xbfc
00be50f0	mov w0,#0x1fbf
00be50f4	mov x2,xzr
00be50f8	bl 0x00c43890
00be50fc	str x0,[x22, #0xf0]
00be5100	adrp x0,0xd27000
00be5104	add x0,x0,#0xf8
00be5108	bl 0x00c2fea0
00be510c	b 0x00be4e14
