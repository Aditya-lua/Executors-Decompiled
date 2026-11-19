; FUN_00c18d08 @ 00c18d08
00c18d08	paciasp
00c18d0c	sub sp,sp,#0x80
00c18d10	stp x29,x30,[sp, #0x20]
00c18d14	stp x28,x27,[sp, #0x30]
00c18d18	stp x26,x25,[sp, #0x40]
00c18d1c	stp x24,x23,[sp, #0x50]
00c18d20	stp x22,x21,[sp, #0x60]
00c18d24	stp x20,x19,[sp, #0x70]
00c18d28	add x29,sp,#0x20
00c18d2c	ldp x8,x9,[x0]
00c18d30	sub x10,x9,x8
00c18d34	cmp x10,#0x2
00c18d38	b.cc 0x00c18d60
00c18d3c	ldrh w10,[x8]
00c18d40	mov w11,#0x5172
00c18d44	mov x19,x0
00c18d48	cmp w10,w11
00c18d4c	b.eq 0x00c18d88
00c18d50	ldrh w10,[x8]
00c18d54	mov w11,#0x7172
00c18d58	cmp w10,w11
00c18d5c	b.eq 0x00c18e48
00c18d60	mov x0,xzr
00c18d64	ldp x20,x19,[sp, #0x70]
00c18d68	ldp x22,x21,[sp, #0x60]
00c18d6c	ldp x24,x23,[sp, #0x50]
00c18d70	ldp x26,x25,[sp, #0x40]
00c18d74	ldp x28,x27,[sp, #0x30]
00c18d78	ldp x29,x30,[sp, #0x20]
00c18d7c	add sp,sp,#0x80
00c18d80	autiasp
00c18d84	ret
00c18d88	ldp x11,x10,[x19, #0x10]
00c18d8c	add x8,x8,#0x2
00c18d90	add x24,x19,#0x28
00c18d94	str x8,[x19]
00c18d98	sub x10,x10,x11
00c18d9c	asr x20,x10,#0x3
00c18da0	b 0x00c18dd4
00c18da4	mov x0,x22
00c18da8	bl 0x00c30950
00c18dac	str x0,[x19, #0x10]
00c18db0	cbz x0,0x00c191c4
00c18db4	asr x8,x21,#0x2
00c18db8	add x23,x0,x21
00c18dbc	add x8,x0,x8, LSL #0x3
00c18dc0	mov x0,x25
00c18dc4	str x8,[x19, #0x20]
00c18dc8	ldp x8,x9,[x19]
00c18dcc	str x0,[x23], #0x8
00c18dd0	str x23,[x19, #0x18]
00c18dd4	cmp x8,x9
00c18dd8	b.eq 0x00c18de8
00c18ddc	ldrb w9,[x8]
00c18de0	cmp w9,#0x5f
00c18de4	b.eq 0x00c18e64
00c18de8	mov x0,x19
00c18dec	bl 0x00c10bfc
00c18df0	cbz x0,0x00c18d64
00c18df4	ldp x23,x8,[x19, #0x18]
00c18df8	cmp x23,x8
00c18dfc	b.ne 0x00c18dc8
00c18e00	ldr x22,[x19, #0x10]
00c18e04	mov x25,x0
00c18e08	sub x21,x23,x22
00c18e0c	cmp x22,x24
00c18e10	lsl x1,x21,#0x1
00c18e14	b.ne 0x00c18da4
00c18e18	mov x0,x1
00c18e1c	bl 0x00c308d0
00c18e20	cbz x0,0x00c191cc
00c18e24	cmp x23,x24
00c18e28	b.eq 0x00c18e40
00c18e2c	mov x1,x22
00c18e30	mov x2,x21
00c18e34	mov x23,x0
00c18e38	bl 0x00c2ff60
00c18e3c	mov x0,x23
00c18e40	str x0,[x19, #0x10]
00c18e44	b 0x00c18db4
00c18e48	mov x1,xzr
00c18e4c	mov x0,xzr
00c18e50	add x8,x8,#0x2
00c18e54	str x8,[x19]
00c18e58	cmp x8,x9
00c18e5c	b.ne 0x00c18e84
00c18e60	b 0x00c18d60
00c18e64	add x8,x8,#0x1
00c18e68	mov x0,x19
00c18e6c	mov x1,x20
00c18e70	str x8,[x19]
00c18e74	bl 0x00c13140
00c18e78	ldp x8,x9,[x19]
00c18e7c	cmp x8,x9
00c18e80	b.eq 0x00c18d60
00c18e84	ldp x10,x9,[x19, #0x10]
00c18e88	add x26,x19,#0x28
00c18e8c	adrp x27,0xcb2000
00c18e90	add x27,x27,#0xa80
00c18e94	mov w28,#0x54
00c18e98	mov w22,#0x540
00c18e9c	stp x1,x0,[sp, #0x8]
00c18ea0	sub x9,x9,x10
00c18ea4	asr x9,x9,#0x3
00c18ea8	stur x9,[x29, #-0x8]
00c18eac	b 0x00c18eb8
00c18eb0	cmp x8,x9
00c18eb4	b.eq 0x00c18d60
00c18eb8	ldrb w9,[x8]
00c18ebc	cmp w9,#0x58
00c18ec0	b.ne 0x00c18f0c
00c18ec4	add x8,x8,#0x1
00c18ec8	mov x0,x19
00c18ecc	str x8,[x19]
00c18ed0	bl 0x00c16098
00c18ed4	cbz x0,0x00c18d64
00c18ed8	ldp x8,x9,[x19]
00c18edc	mov x23,x0
00c18ee0	cmp x8,x9
00c18ee4	b.eq 0x00c18f7c
00c18ee8	ldrb w10,[x8]
00c18eec	cmp w10,#0x4e
00c18ef0	b.ne 0x00c18f7c
00c18ef4	add x8,x8,#0x1
00c18ef8	mov w25,#0x1
00c18efc	str x8,[x19]
00c18f00	cmp x8,x9
00c18f04	b.ne 0x00c18f88
00c18f08	b 0x00c18fb4
00c18f0c	ldrb w9,[x8]
00c18f10	cmp w9,#0x54
00c18f14	b.ne 0x00c1901c
00c18f18	add x8,x8,#0x1
00c18f1c	mov x0,x19
00c18f20	str x8,[x19]
00c18f24	bl 0x00c10bfc
00c18f28	cbz x0,0x00c18d64
00c18f2c	ldr x21,[x19, #0x1330]
00c18f30	mov x23,x0
00c18f34	ldr x8,[x21, #0x8]
00c18f38	sub x9,x8,#0xfd0
00c18f3c	cmn x9,#0xff1
00c18f40	b.hi 0x00c18f60
00c18f44	mov w0,#0x1000
00c18f48	bl 0x00c308d0
00c18f4c	cbz x0,0x00c191c8
00c18f50	mov x8,xzr
00c18f54	stp x21,xzr,[x0]
00c18f58	mov x21,x0
00c18f5c	str x0,[x19, #0x1330]
00c18f60	add x9,x8,#0x20
00c18f64	add x20,x21,x8
00c18f68	adrp x8,0xcb2000
00c18f6c	add x8,x8,#0xaf8
00c18f70	str x9,[x21, #0x8]
00c18f74	mov w9,#0x55
00c18f78	b 0x00c19088
00c18f7c	mov w25,wzr
00c18f80	cmp x8,x9
00c18f84	b.eq 0x00c18fb4
00c18f88	ldrb w9,[x8]
00c18f8c	cmp w9,#0x52
00c18f90	b.ne 0x00c18fb4
00c18f94	add x8,x8,#0x1
00c18f98	mov x0,x19
00c18f9c	mov x1,xzr
00c18fa0	str x8,[x19]
00c18fa4	bl 0x00c12574
00c18fa8	mov x24,x0
00c18fac	cbnz x0,0x00c18fb8
00c18fb0	b 0x00c18d64
00c18fb4	mov x24,xzr
00c18fb8	ldr x21,[x19, #0x1330]
00c18fbc	ldr x8,[x21, #0x8]
00c18fc0	sub x9,x8,#0xfc0
00c18fc4	cmn x9,#0xff1
00c18fc8	b.hi 0x00c18fe8
00c18fcc	mov w0,#0x1000
00c18fd0	bl 0x00c308d0
00c18fd4	cbz x0,0x00c191c8
00c18fd8	mov x8,xzr
00c18fdc	stp x21,xzr,[x0]
00c18fe0	mov x21,x0
00c18fe4	str x0,[x19, #0x1330]
00c18fe8	add x9,x8,#0x30
00c18fec	add x20,x21,x8
00c18ff0	str x9,[x21, #0x8]
00c18ff4	str x27,[x20, #0x10]!
00c18ff8	ldurh w8,[x20, #0x9]
00c18ffc	strb w28,[x20, #0x8]
00c19000	and w8,w8,#0xf000
00c19004	str x23,[x20, #0x10]
00c19008	orr w8,w8,w22
00c1900c	strb w25,[x20, #0x18]
00c19010	sturh w8,[x20, #0x9]
00c19014	str x24,[x20, #0x20]
00c19018	b 0x00c190a4
00c1901c	ldrb w9,[x8]
00c19020	cmp w9,#0x51
00c19024	b.ne 0x00c18d60
00c19028	add x8,x8,#0x1
00c1902c	mov x0,x19
00c19030	str x8,[x19]
00c19034	bl 0x00c16098
00c19038	cbz x0,0x00c18d64
00c1903c	ldr x21,[x19, #0x1330]
00c19040	mov x23,x0
00c19044	ldr x8,[x21, #0x8]
00c19048	sub x9,x8,#0xfd0
00c1904c	cmn x9,#0xff1
00c19050	b.hi 0x00c19070
00c19054	mov w0,#0x1000
00c19058	bl 0x00c308d0
00c1905c	cbz x0,0x00c191c8
00c19060	mov x8,xzr
00c19064	stp x21,xzr,[x0]
00c19068	mov x21,x0
00c1906c	str x0,[x19, #0x1330]
00c19070	add x9,x8,#0x20
00c19074	add x20,x21,x8
00c19078	adrp x8,0xcb2000
00c1907c	add x8,x8,#0xb70
00c19080	str x9,[x21, #0x8]
00c19084	mov w9,#0x56
00c19088	str x8,[x20, #0x10]!
00c1908c	ldurh w8,[x20, #0x9]
00c19090	and w8,w8,#0xf000
00c19094	orr w8,w8,w22
00c19098	strb w9,[x20, #0x8]
00c1909c	sturh w8,[x20, #0x9]
00c190a0	str x23,[x20, #0x10]
00c190a4	ldp x25,x8,[x19, #0x18]
00c190a8	cmp x25,x8
00c190ac	b.ne 0x00c19114
00c190b0	ldr x24,[x19, #0x10]
00c190b4	sub x23,x25,x24
00c190b8	cmp x24,x26
00c190bc	lsl x1,x23,#0x1
00c190c0	b.eq 0x00c190d8
00c190c4	mov x0,x24
00c190c8	bl 0x00c30950
00c190cc	str x0,[x19, #0x10]
00c190d0	cbnz x0,0x00c19104
00c190d4	b 0x00c191d0
00c190d8	mov x0,x1
00c190dc	bl 0x00c308d0
00c190e0	cbz x0,0x00c191d4
00c190e4	cmp x25,x26
00c190e8	b.eq 0x00c19100
00c190ec	mov x1,x24
00c190f0	mov x2,x23
00c190f4	mov x25,x0
00c190f8	bl 0x00c2ff60
00c190fc	mov x0,x25
00c19100	str x0,[x19, #0x10]
00c19104	asr x8,x23,#0x2
00c19108	add x25,x0,x23
00c1910c	add x8,x0,x8, LSL #0x3
00c19110	str x8,[x19, #0x20]
00c19114	ldp x8,x9,[x19]
00c19118	str x20,[x25], #0x8
00c1911c	str x25,[x19, #0x18]
00c19120	cmp x8,x9
00c19124	b.eq 0x00c18eb0
00c19128	ldrb w10,[x8]
00c1912c	cmp w10,#0x45
00c19130	b.ne 0x00c18eb0
00c19134	ldur x1,[x29, #-0x8]
00c19138	add x8,x8,#0x1
00c1913c	mov x0,x19
00c19140	str x8,[x19]
00c19144	bl 0x00c13140
00c19148	ldr x20,[x19, #0x1330]
00c1914c	mov x22,x0
00c19150	mov x23,x1
00c19154	ldr x8,[x20, #0x8]
00c19158	sub x9,x8,#0xfc0
00c1915c	cmn x9,#0xff1
00c19160	b.hi 0x00c19180
00c19164	mov w0,#0x1000
00c19168	bl 0x00c308d0
00c1916c	cbz x0,0x00c191c8
00c19170	mov x8,xzr
00c19174	stp x20,xzr,[x0]
00c19178	mov x20,x0
00c1917c	str x0,[x19, #0x1330]
00c19180	add x9,x8,#0x30
00c19184	add x0,x20,x8
00c19188	adrp x8,0xcb2000
00c1918c	add x8,x8,#0xbe8
00c19190	str x9,[x20, #0x8]
00c19194	mov w9,#0x53
00c19198	str x8,[x0, #0x10]!
00c1919c	ldurh w8,[x0, #0x9]
00c191a0	ldp x10,x11,[sp, #0x8]
00c191a4	strb w9,[x0, #0x8]
00c191a8	mov w9,#0x540
00c191ac	and w8,w8,#0xf000
00c191b0	stp x22,x23,[x0, #0x20]
00c191b4	orr w8,w8,w9
00c191b8	stp x11,x10,[x0, #0x10]
00c191bc	sturh w8,[x0, #0x9]
00c191c0	b 0x00c18d64
00c191c4	bl 0x00c30b40
00c191c8	bl 0x00c2fff0
00c191cc	bl 0x00c30b40
00c191d0	bl 0x00c30b40
00c191d4	bl 0x00c30b40
