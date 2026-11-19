; FUN_00be1e48 @ 00be1e48
00be1e48	paciasp
00be1e4c	stp x29,x30,[sp, #-0x60]!
00be1e50	stp x28,x27,[sp, #0x10]
00be1e54	stp x26,x25,[sp, #0x20]
00be1e58	stp x24,x23,[sp, #0x30]
00be1e5c	stp x22,x21,[sp, #0x40]
00be1e60	stp x20,x19,[sp, #0x50]
00be1e64	mov x29,sp
00be1e68	sub sp,sp,#0x1a0
00be1e6c	mov x0,x3
00be1e70	mov x20,x2
00be1e74	mov x21,x1
00be1e78	sub x8,x29,#0x98
00be1e7c	sub x1,x29,#0x78
00be1e80	sub x2,x29,#0x7c
00be1e84	sub x3,x29,#0x80
00be1e88	stp x5,x4,[sp, #0x20]
00be1e8c	sub x25,x29,#0xb8
00be1e90	bl 0x00c44130
00be1e94	stp xzr,xzr,[x25, #0x8]
00be1e98	str xzr,[x25, #0x18]
00be1e9c	sub x0,x29,#0xb0
00be1ea0	mov w1,#0x16
00be1ea4	mov w2,wzr
00be1ea8	sub x19,x29,#0xb0
00be1eac	bl 0x00c30250
00be1eb0	ldurb w8,[x29, #-0xb0]
00be1eb4	ldr x9,[x25, #0x18]
00be1eb8	mov w26,wzr
00be1ebc	add x27,sp,#0x48
00be1ec0	mov w10,#0x1
00be1ec4	orr x28,x19,#0x1
00be1ec8	tst w8,#0x1
00be1ecc	mov w8,#0x45
00be1ed0	add x22,sp,#0x3c
00be1ed4	csinc x23,x9,x19,ne
00be1ed8	add x19,sp,#0x40
00be1edc	str wzr,[sp, #0x3c]
00be1ee0	str x27,[sp, #0x40]
00be1ee4	strb w10,[sp, #0x38]
00be1ee8	strb w8,[sp, #0x34]
00be1eec	str x23,[x25]
00be1ef0	b 0x00be1efc
00be1ef4	add x8,x8,#0x4
00be1ef8	str x8,[x21, #0x18]
00be1efc	cbz x21,0x00be1f14
00be1f00	ldp x8,x9,[x21, #0x18]
00be1f04	cmp x8,x9
00be1f08	b.eq 0x00be1f24
00be1f0c	ldr w0,[x8]
00be1f10	b 0x00be1f34
00be1f14	mov w24,#0x1
00be1f18	cbnz x20,0x00be1f44
00be1f1c	tbz w24,#0x0,0x00be1f7c
00be1f20	b 0x00be214c
00be1f24	ldr x8,[x21]
00be1f28	ldr x8,[x8, #0x48]
00be1f2c	mov x0,x21
00be1f30	blr x8
00be1f34	cmn w0,#0x1
00be1f38	cset w24,eq
00be1f3c	csel x21,xzr,x21,eq
00be1f40	cbz x20,0x00be1f1c
00be1f44	ldp x8,x9,[x20, #0x18]
00be1f48	cmp x8,x9
00be1f4c	b.eq 0x00be1f58
00be1f50	ldr w0,[x8]
00be1f54	b 0x00be1f68
00be1f58	ldr x8,[x20]
00be1f5c	ldr x8,[x8, #0x48]
00be1f60	mov x0,x20
00be1f64	blr x8
00be1f68	cmn w0,#0x1
00be1f6c	cset w8,eq
00be1f70	csel x20,xzr,x20,eq
00be1f74	cmp w24,w8
00be1f78	b.eq 0x00be214c
00be1f7c	ldurb w8,[x29, #-0xb0]
00be1f80	ldr x9,[x25, #0x10]
00be1f84	ldr x11,[x25]
00be1f88	lsr x10,x8,#0x1
00be1f8c	tst w8,#0x1
00be1f90	csel x24,x10,x9,eq
00be1f94	add x9,x23,x24
00be1f98	cmp x11,x9
00be1f9c	b.ne 0x00be2058
00be1fa0	cmp x24,#0x1
00be1fa4	b.lt 0x00be1fbc
00be1fa8	sub x0,x29,#0xb0
00be1fac	mov x1,x24
00be1fb0	mov w2,wzr
00be1fb4	bl 0x00c30250
00be1fb8	b 0x00be1fe0
00be1fbc	lsl x9,x24,#0x1
00be1fc0	tbnz w8,#0x0,0x00be1fd4
00be1fc4	lsl w8,w9,#0x1
00be1fc8	sturb w8,[x29, #-0xb0]
00be1fcc	mov x8,x28
00be1fd0	b 0x00be1fdc
00be1fd4	ldr x8,[x25, #0x18]
00be1fd8	str x9,[x25, #0x10]
00be1fdc	strb wzr,[x8, x9]
00be1fe0	ldp x9,x10,[x25, #0x8]
00be1fe4	ldurb w8,[x29, #-0xb0]
00be1fe8	tst w8,#0x1
00be1fec	mov w8,#0x16
00be1ff0	and x11,x9,#-0x2
00be1ff4	ubfx x12,x9,#0x1,#0x7
00be1ff8	sub x11,x11,#0x1
00be1ffc	csel x8,x8,x11,eq
00be2000	tst x9,#0x1
00be2004	csel x10,x12,x10,eq
00be2008	subs x1,x8,x10
00be200c	b.ls 0x00be2020
00be2010	sub x0,x29,#0xb0
00be2014	mov w2,wzr
00be2018	bl 0x00c30250
00be201c	b 0x00be2040
00be2020	tbnz w9,#0x0,0x00be2034
00be2024	lsl w9,w8,#0x1
00be2028	sturb w9,[x29, #-0xb0]
00be202c	mov x9,x28
00be2030	b 0x00be203c
00be2034	ldr x9,[x25, #0x18]
00be2038	str x8,[x25, #0x10]
00be203c	strb wzr,[x9, x8]
00be2040	ldurb w8,[x29, #-0xb0]
00be2044	ldr x9,[x25, #0x18]
00be2048	tst w8,#0x1
00be204c	csel x23,x28,x9,eq
00be2050	add x8,x23,x24
00be2054	str x8,[x25]
00be2058	ldp x8,x9,[x21, #0x18]
00be205c	cmp x8,x9
00be2060	b.eq 0x00be206c
00be2064	ldr w0,[x8]
00be2068	b 0x00be207c
00be206c	ldr x8,[x21]
00be2070	ldr x8,[x8, #0x48]
00be2074	mov x0,x21
00be2078	blr x8
00be207c	ldp w6,w5,[x29, #-0x80]
00be2080	add x1,sp,#0x38
00be2084	sub x8,x29,#0x78
00be2088	add x2,sp,#0x34
00be208c	sub x4,x29,#0xb8
00be2090	sub x7,x29,#0x98
00be2094	mov x3,x23
00be2098	stp x22,x8,[sp, #0x10]
00be209c	stp x27,x19,[sp]
00be20a0	bl 0x00c44140
00be20a4	cbnz w0,0x00be214c
00be20a8	tbz w26,#0x0,0x00be20b4
00be20ac	mov w26,#0x1
00be20b0	b 0x00be2114
00be20b4	ldr x8,[x25]
00be20b8	sub x9,x8,x23
00be20bc	cmp x9,#0x1
00be20c0	b.lt 0x00be2110
00be20c4	ldrb w8,[x23]
00be20c8	cmp w8,#0x2b
00be20cc	b.eq 0x00be20d8
00be20d0	cmp w8,#0x2d
00be20d4	b.ne 0x00be2134
00be20d8	cmp x9,#0x1
00be20dc	b.eq 0x00be2110
00be20e0	cmp w8,#0x2d
00be20e4	b.eq 0x00be20f0
00be20e8	cmp w8,#0x2b
00be20ec	b.ne 0x00be2110
00be20f0	ldrb w8,[x23, #0x1]
00be20f4	mov w26,#0x1
00be20f8	cmp w8,#0x2e
00be20fc	b.eq 0x00be2114
00be2100	sub w8,w8,#0x30
00be2104	cmp w8,#0x9
00be2108	b.ls 0x00be2114
00be210c	b 0x00be214c
00be2110	mov w26,wzr
00be2114	ldp x8,x9,[x21, #0x18]
00be2118	cmp x8,x9
00be211c	b.ne 0x00be1ef4
00be2120	ldr x8,[x21]
00be2124	ldr x8,[x8, #0x50]
00be2128	mov x0,x21
00be212c	blr x8
00be2130	b 0x00be1efc
00be2134	cmp w8,#0x2e
00be2138	mov w26,#0x1
00be213c	b.eq 0x00be2114
00be2140	sub w8,w8,#0x30
00be2144	cmp w8,#0xa
00be2148	b.cc 0x00be2114
00be214c	ldurb w8,[x29, #-0x98]
00be2150	ldr x9,[x25, #0x28]
00be2154	ldr x22,[sp, #0x28]
00be2158	lsr x10,x8,#0x1
00be215c	tst w8,#0x1
00be2160	csel x8,x10,x9,eq
00be2164	cbz x8,0x00be2194
00be2168	ldrb w8,[sp, #0x38]
00be216c	cmp w8,#0x1
00be2170	b.ne 0x00be2194
00be2174	ldr x8,[sp, #0x40]
00be2178	add x9,sp,#0x48
00be217c	sub x9,x8,x9
00be2180	cmp x9,#0x9f
00be2184	b.gt 0x00be2194
00be2188	ldr w9,[sp, #0x3c]
00be218c	str w9,[x8], #0x4
00be2190	str x8,[sp, #0x40]
00be2194	ldr x1,[x25]
00be2198	mov x0,x23
00be219c	mov x2,x22
00be21a0	bl 0x00c0c854
00be21a4	ldurb w10,[x29, #-0x98]
00be21a8	ldr x12,[sp, #0x40]
00be21ac	add x11,sp,#0x48
00be21b0	ldr x8,[x25, #0x28]
00be21b4	lsr x9,x10,#0x1
00be21b8	ands w13,w10,#0x1
00be21bc	sub x11,x12,x11
00be21c0	csel x8,x9,x8,eq
00be21c4	ldr x9,[sp, #0x20]
00be21c8	cmp x11,#0x5
00be21cc	str d0,[x9]
00be21d0	b.lt 0x00be2330
00be21d4	cbz x8,0x00be2330
00be21d8	sub x8,x12,#0x4
00be21dc	add x9,sp,#0x48
00be21e0	cmp x9,x8
00be21e4	cset w11,cc
00be21e8	cmp x9,x12
00be21ec	b.eq 0x00be229c
00be21f0	cbz w11,0x00be229c
00be21f4	add x10,sp,#0x48
00be21f8	sub x14,x12,#0x8
00be21fc	add x11,x10,#0x4
00be2200	cmp x14,x11
00be2204	csel x13,x14,x11,hi
00be2208	sub x13,x13,#0x4
00be220c	cmp x13,x10
00be2210	cinc x15,x10,ne
00be2214	cmp x13,x10
00be2218	sub x15,x13,x15
00be221c	lsr x15,x15,#0x3
00be2220	cinc x13,x15,ne
00be2224	cmp x13,#0x13
00be2228	b.cc 0x00be2270
00be222c	cmp x14,x11
00be2230	csel x14,x14,x11,hi
00be2234	sub x14,x14,#0x4
00be2238	cmp x14,x10
00be223c	cinc x15,x10,ne
00be2240	cmp x14,x10
00be2244	sub x15,x14,x15
00be2248	lsr x15,x15,#0x3
00be224c	cinc x14,x15,ne
00be2250	cmp x10,x12
00be2254	b.cs 0x00be2410
00be2258	lsl x14,x14,#0x2
00be225c	sub x15,x12,x14
00be2260	add x11,x11,x14
00be2264	sub x14,x15,#0x4
00be2268	cmp x14,x11
00be226c	b.cs 0x00be2410
00be2270	mov x11,x8
00be2274	add x10,x10,#0x4
00be2278	ldr w12,[x11]
00be227c	ldur w13,[x10, #-0x4]
00be2280	stur w12,[x10, #-0x4]
00be2284	str w13,[x11], #-0x4
00be2288	cmp x10,x11
00be228c	add x10,x10,#0x4
00be2290	b.cc 0x00be2278
00be2294	ldurb w10,[x29, #-0x98]
00be2298	and w13,w10,#0x1
00be229c	ldr x11,[x25, #0x30]
00be22a0	cmp w13,#0x0
00be22a4	sub x12,x29,#0x98
00be22a8	csinc x11,x11,x12,ne
00be22ac	cmp x9,x8
00be22b0	b.cs 0x00be2308
00be22b4	lsr w9,w10,#0x1
00be22b8	ldr x10,[x25, #0x28]
00be22bc	cmp w13,#0x0
00be22c0	csel x9,x9,x10,eq
00be22c4	add x10,sp,#0x48
00be22c8	add x9,x11,x9
00be22cc	b 0x00be22e8
00be22d0	sub x12,x9,x11
00be22d4	add x10,x10,#0x4
00be22d8	cmp x12,#0x1
00be22dc	cinc x11,x11,gt
00be22e0	cmp x10,x8
00be22e4	b.cs 0x00be2308
00be22e8	ldrb w12,[x11]
00be22ec	cbz w12,0x00be22d0
00be22f0	cmp w12,#0xff
00be22f4	b.eq 0x00be22d0
00be22f8	ldr w13,[x10]
00be22fc	cmp w13,w12
00be2300	b.eq 0x00be22d0
00be2304	b 0x00be2328
00be2308	ldrb w9,[x11]
00be230c	cbz w9,0x00be2330
00be2310	cmp w9,#0xff
00be2314	b.eq 0x00be2330
00be2318	ldr w8,[x8]
00be231c	sub w8,w8,#0x1
00be2320	cmp w8,w9
00be2324	b.cc 0x00be2330
00be2328	mov w8,#0x4
00be232c	str w8,[x22]
00be2330	cbz x21,0x00be2348
00be2334	ldp x8,x9,[x21, #0x18]
00be2338	cmp x8,x9
00be233c	b.eq 0x00be2358
00be2340	ldr w0,[x8]
00be2344	b 0x00be2368
00be2348	mov w19,#0x1
00be234c	cbnz x20,0x00be2378
00be2350	tbnz w19,#0x0,0x00be23ac
00be2354	b 0x00be23b8
00be2358	ldr x8,[x21]
00be235c	ldr x8,[x8, #0x48]
00be2360	mov x0,x21
00be2364	blr x8
00be2368	cmn w0,#0x1
00be236c	cset w19,eq
00be2370	csel x21,xzr,x21,eq
00be2374	cbz x20,0x00be2350
00be2378	ldp x8,x9,[x20, #0x18]
00be237c	cmp x8,x9
00be2380	b.eq 0x00be238c
00be2384	ldr w0,[x8]
00be2388	b 0x00be239c
00be238c	ldr x8,[x20]
00be2390	ldr x8,[x8, #0x48]
00be2394	mov x0,x20
00be2398	blr x8
00be239c	cmn w0,#0x1
00be23a0	cset w8,eq
00be23a4	eor w8,w19,w8
00be23a8	tbnz w8,#0x0,0x00be23b8
00be23ac	ldr w8,[x22]
00be23b0	orr w8,w8,#0x2
00be23b4	str w8,[x22]
00be23b8	ldurb w8,[x29, #-0xb0]
00be23bc	tbz w8,#0x0,0x00be23d0
00be23c0	ldr x8,[x25, #0x8]
00be23c4	ldr x0,[x25, #0x18]
00be23c8	and x1,x8,#-0x2
00be23cc	bl 0x00c2fe80
00be23d0	ldurb w8,[x29, #-0x98]
00be23d4	tbz w8,#0x0,0x00be23e8
00be23d8	ldr x8,[x25, #0x20]
00be23dc	ldr x0,[x25, #0x30]
00be23e0	and x1,x8,#-0x2
00be23e4	bl 0x00c2fe80
00be23e8	mov x0,x21
00be23ec	add sp,sp,#0x1a0
00be23f0	ldp x20,x19,[sp, #0x50]
00be23f4	ldp x22,x21,[sp, #0x40]
00be23f8	ldp x24,x23,[sp, #0x30]
00be23fc	ldp x26,x25,[sp, #0x20]
00be2400	ldp x28,x27,[sp, #0x10]
00be2404	ldp x29,x30,[sp], #0x60
00be2408	autiasp
00be240c	ret
00be2410	add x13,x13,#0x1
00be2414	add x15,sp,#0x48
00be2418	sub x12,x12,#0x10
00be241c	and x14,x13,#0x7ffffffffffffff8
00be2420	lsl x10,x14,#0x2
00be2424	mov x16,x14
00be2428	sub x11,x8,x10
00be242c	add x10,x15,x10
00be2430	add x15,x15,#0x10
00be2434	ldp q1,q0,[x12, #-0x10]
00be2438	sub x16,x16,#0x8
00be243c	ldp q2,q3,[x15, #-0x10]
00be2440	rev64 v0.4S,v0.4S
00be2444	rev64 v1.4S,v1.4S
00be2448	rev64 v2.4S,v2.4S
00be244c	rev64 v3.4S,v3.4S
00be2450	ext v0.16B,v0.16B,v0.16B,0x8
00be2454	ext v1.16B,v1.16B,v1.16B,0x8
00be2458	ext v2.16B,v2.16B,v2.16B,0x8
00be245c	ext v3.16B,v3.16B,v3.16B,0x8
00be2460	stp q0,q1,[x15, #-0x10]
00be2464	add x15,x15,#0x20
00be2468	stp q3,q2,[x12, #-0x10]
00be246c	sub x12,x12,#0x20
00be2470	cbnz x16,0x00be2434
00be2474	cmp x13,x14
00be2478	b.eq 0x00be2294
00be247c	b 0x00be2274
