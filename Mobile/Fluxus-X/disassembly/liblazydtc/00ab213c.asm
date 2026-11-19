; a2i_ASN1_INTEGER @ 00ab213c
00ab213c	sub sp,sp,#0x80
00ab2140	mov w8,#0x2
00ab2144	stp x28,x27,[sp, #0x20]
00ab2148	stp x26,x25,[sp, #0x30]
00ab214c	stp x24,x23,[sp, #0x40]
00ab2150	stp x22,x21,[sp, #0x50]
00ab2154	stp x20,x19,[sp, #0x60]
00ab2158	stp x29,x30,[sp, #0x70]
00ab215c	mov x22,x2
00ab2160	mov x19,x1
00ab2164	str w8,[x1, #0x4]
00ab2168	mov x1,x2
00ab216c	mov w2,w3
00ab2170	add x29,sp,#0x70
00ab2174	str x0,[sp, #0x10]
00ab2178	str w3,[sp, #0x1c]
00ab217c	bl 0x00c38470
00ab2180	cmp w0,#0x1
00ab2184	b.lt 0x00ab2374
00ab2188	str x19,[sp]
00ab218c	mov w25,wzr
00ab2190	mov w26,wzr
00ab2194	mov x19,xzr
00ab2198	add x8,x22,#0x2
00ab219c	mov w24,#0x1
00ab21a0	str x8,[sp, #0x8]
00ab21a4	sxtw x11,w0
00ab21a8	sub x9,x11,#0x1
00ab21ac	add x8,x22,x9
00ab21b0	ldrb w10,[x8]
00ab21b4	cmp w10,#0xa
00ab21b8	b.ne 0x00ab21e0
00ab21bc	strb wzr,[x8]
00ab21c0	cbz w9,0x00ab2378
00ab21c4	sub x27,x11,#0x2
00ab21c8	add x8,x22,x27
00ab21cc	ldrb w10,[x8]
00ab21d0	cmp w10,#0xd
00ab21d4	b.eq 0x00ab21f0
00ab21d8	mov w27,w9
00ab21dc	b 0x00ab2200
00ab21e0	mov w27,w9
00ab21e4	mov w9,w0
00ab21e8	cmp w10,#0xd
00ab21ec	b.ne 0x00ab21d8
00ab21f0	strb wzr,[x8]
00ab21f4	cbz w27,0x00ab2378
00ab21f8	sub w8,w27,#0x1
00ab21fc	add x8,x22,w8, SXTW 
00ab2200	ldrb w28,[x8]
00ab2204	mov x21,xzr
00ab2208	sxtw x23,w27
00ab220c	cmp w28,#0x5c
00ab2210	cset w20,eq
00ab2214	ldrb w0,[x22, x21]
00ab2218	mov w1,#0x10
00ab221c	bl 0x00c377c0
00ab2220	cbz w0,0x00ab2234
00ab2224	add x21,x21,#0x1
00ab2228	cmp x21,x23
00ab222c	b.lt 0x00ab2214
00ab2230	b 0x00ab2238
00ab2234	mov w27,w21
00ab2238	subs w8,w27,#0x2
00ab223c	strb wzr,[x22, w27, SXTW ]
00ab2240	b.lt 0x00ab2378
00ab2244	cbz w24,0x00ab2274
00ab2248	ldrb w9,[x22]
00ab224c	cmp w9,#0x30
00ab2250	b.ne 0x00ab2274
00ab2254	ldrb w9,[x22, #0x1]
00ab2258	cmp w9,#0x30
00ab225c	csel w27,w8,w27,eq
00ab2260	ldr x8,[sp, #0x8]
00ab2264	csel x24,x8,x22,eq
00ab2268	sub w20,w27,w20
00ab226c	tbz w20,#0x0,0x00ab2280
00ab2270	b 0x00ab23dc
00ab2274	mov x24,x22
00ab2278	sub w20,w27,w20
00ab227c	tbnz w20,#0x0,0x00ab23dc
00ab2280	cmp w20,#0x0
00ab2284	cinc w8,w20,lt
00ab2288	asr w21,w8,#0x1
00ab228c	add w27,w21,w26
00ab2290	cmp w27,w25
00ab2294	b.le 0x00ab22c0
00ab2298	sxtw x1,w25
00ab229c	add w25,w26,w21, LSL #0x1
00ab22a0	adrp x3,0x2b4000
00ab22a4	sxtw x2,w25
00ab22a8	mov w4,#0x6d
00ab22ac	mov x0,x19
00ab22b0	add x3,x3,#0x7f9
00ab22b4	bl 0x00c38050
00ab22b8	cbz x0,0x00ab2428
00ab22bc	mov x19,x0
00ab22c0	cmp w20,#0x2
00ab22c4	b.lt 0x00ab2318
00ab22c8	mov x20,xzr
00ab22cc	sxtw x21,w21
00ab22d0	add x24,x24,#0x1
00ab22d4	add x26,x19,w26, SXTW 
00ab22d8	ldurb w0,[x24, #-0x1]
00ab22dc	bl 0x00c3e840
00ab22e0	tbnz w0,#0x1f,0x00ab2344
00ab22e4	ldrb w8,[x26, x20]
00ab22e8	orr w8,w0,w8, LSL #0x4
00ab22ec	strb w8,[x26, x20]
00ab22f0	ldrb w0,[x24]
00ab22f4	bl 0x00c3e840
00ab22f8	tbnz w0,#0x1f,0x00ab2344
00ab22fc	ldrb w8,[x26, x20]
00ab2300	add x24,x24,#0x2
00ab2304	orr w8,w0,w8, LSL #0x4
00ab2308	strb w8,[x26, x20]
00ab230c	add x20,x20,#0x1
00ab2310	cmp x20,x21
00ab2314	b.lt 0x00ab22d8
00ab2318	cmp w28,#0x5c
00ab231c	b.ne 0x00ab2414
00ab2320	ldr x0,[sp, #0x10]
00ab2324	ldr w2,[sp, #0x1c]
00ab2328	mov x1,x22
00ab232c	bl 0x00c38470
00ab2330	mov w24,wzr
00ab2334	cmp w0,#0x1
00ab2338	mov w26,w27
00ab233c	b.ge 0x00ab21a4
00ab2340	b 0x00ab2378
00ab2344	bl 0x00c342a0
00ab2348	adrp x0,0x2b4000
00ab234c	adrp x2,0x2b6000
00ab2350	add x0,x0,#0x7f9
00ab2354	add x2,x2,#0x2e2
00ab2358	mov w1,#0x7a
00ab235c	bl 0x00c342b0
00ab2360	mov w0,#0xd
00ab2364	mov w1,#0x8d
00ab2368	mov x2,xzr
00ab236c	bl 0x00c342c0
00ab2370	b 0x00ab2378
00ab2374	mov x19,xzr
00ab2378	bl 0x00c342a0
00ab237c	adrp x20,0x2b4000
00ab2380	add x20,x20,#0x7f9
00ab2384	adrp x2,0x2b6000
00ab2388	add x2,x2,#0x2e2
00ab238c	mov w1,#0x8b
00ab2390	mov x0,x20
00ab2394	bl 0x00c342b0
00ab2398	mov w0,#0xd
00ab239c	mov w1,#0x96
00ab23a0	mov x2,xzr
00ab23a4	bl 0x00c342c0
00ab23a8	mov w2,#0x8c
00ab23ac	mov x0,x19
00ab23b0	mov x1,x20
00ab23b4	bl 0x00c32310
00ab23b8	mov w0,wzr
00ab23bc	ldp x29,x30,[sp, #0x70]
00ab23c0	ldp x20,x19,[sp, #0x60]
00ab23c4	ldp x22,x21,[sp, #0x50]
00ab23c8	ldp x24,x23,[sp, #0x40]
00ab23cc	ldp x26,x25,[sp, #0x30]
00ab23d0	ldp x28,x27,[sp, #0x20]
00ab23d4	add sp,sp,#0x80
00ab23d8	ret
00ab23dc	bl 0x00c342a0
00ab23e0	adrp x20,0x2b4000
00ab23e4	add x20,x20,#0x7f9
00ab23e8	adrp x2,0x2b6000
00ab23ec	add x2,x2,#0x2e2
00ab23f0	mov w1,#0x67
00ab23f4	mov x0,x20
00ab23f8	bl 0x00c342b0
00ab23fc	mov w0,#0xd
00ab2400	mov w1,#0x91
00ab2404	mov x2,xzr
00ab2408	bl 0x00c342c0
00ab240c	mov w2,#0x68
00ab2410	b 0x00ab23ac
00ab2414	ldr x8,[sp]
00ab2418	mov w0,#0x1
00ab241c	str w27,[x8]
00ab2420	str x19,[x8, #0x8]
00ab2424	b 0x00ab23bc
00ab2428	bl 0x00c342a0
00ab242c	adrp x20,0x2b4000
00ab2430	add x20,x20,#0x7f9
00ab2434	adrp x2,0x2b6000
00ab2438	add x2,x2,#0x2e2
00ab243c	mov w1,#0x6f
00ab2440	mov x0,x20
00ab2444	bl 0x00c342b0
00ab2448	mov w1,#0x100
00ab244c	mov w0,#0xd
00ab2450	movk w1,#0xc, LSL #16
00ab2454	mov x2,xzr
00ab2458	bl 0x00c342c0
00ab245c	orr w2,wzr,#0x70
00ab2460	b 0x00ab23ac
