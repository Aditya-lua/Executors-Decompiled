; ossl_rsa_set0_all_params @ 00ad2104
00ad2104	sub sp,sp,#0x70
00ad2108	stp x20,x19,[sp, #0x50]
00ad210c	mov x19,x0
00ad2110	mov w0,wzr
00ad2114	stp x28,x27,[sp, #0x10]
00ad2118	stp x26,x25,[sp, #0x20]
00ad211c	stp x24,x23,[sp, #0x30]
00ad2120	stp x22,x21,[sp, #0x40]
00ad2124	stp x29,x30,[sp, #0x60]
00ad2128	add x29,sp,#0x60
00ad212c	cbz x1,0x00ad23b0
00ad2130	mov x22,x2
00ad2134	cbz x2,0x00ad23b0
00ad2138	mov x21,x3
00ad213c	cbz x3,0x00ad23b0
00ad2140	mov x0,x1
00ad2144	mov x23,x1
00ad2148	bl 0x00c325e0
00ad214c	mov w27,w0
00ad2150	cmp w0,#0x2
00ad2154	mov w0,wzr
00ad2158	b.lt 0x00ad23b0
00ad215c	mov x0,x23
00ad2160	mov w1,wzr
00ad2164	bl 0x00c32610
00ad2168	mov x25,x0
00ad216c	mov w1,#0x1
00ad2170	mov x0,x23
00ad2174	bl 0x00c32610
00ad2178	ldr x8,[x19, #0x40]
00ad217c	mov x24,x0
00ad2180	cbnz x25,0x00ad218c
00ad2184	mov w0,wzr
00ad2188	cbz x8,0x00ad23b0
00ad218c	cbnz x24,0x00ad219c
00ad2190	ldr x9,[x19, #0x48]
00ad2194	mov w0,wzr
00ad2198	cbz x9,0x00ad23b0
00ad219c	cbz x25,0x00ad21b8
00ad21a0	mov x0,x8
00ad21a4	bl 0x00c322e0
00ad21a8	mov w1,#0x4
00ad21ac	mov x0,x25
00ad21b0	str x25,[x19, #0x40]
00ad21b4	bl 0x00c38dc0
00ad21b8	cbz x24,0x00ad21d4
00ad21bc	ldr x0,[x19, #0x48]
00ad21c0	bl 0x00c322e0
00ad21c4	mov w1,#0x4
00ad21c8	mov x0,x24
00ad21cc	str x24,[x19, #0x48]
00ad21d0	bl 0x00c38dc0
00ad21d4	ldr w8,[x19, #0xd8]
00ad21d8	mov x0,x22
00ad21dc	add w8,w8,#0x1
00ad21e0	str w8,[x19, #0xd8]
00ad21e4	bl 0x00c325e0
00ad21e8	cmp w27,w0
00ad21ec	b.ne 0x00ad2248
00ad21f0	mov x0,x21
00ad21f4	bl 0x00c325e0
00ad21f8	add w8,w0,#0x1
00ad21fc	cmp w27,w8
00ad2200	b.ne 0x00ad2248
00ad2204	mov x0,x22
00ad2208	mov w1,wzr
00ad220c	bl 0x00c32610
00ad2210	mov x24,x0
00ad2214	mov w1,#0x1
00ad2218	mov x0,x22
00ad221c	bl 0x00c32610
00ad2220	mov x25,x0
00ad2224	mov x0,x21
00ad2228	mov w1,wzr
00ad222c	bl 0x00c32610
00ad2230	mov x3,x0
00ad2234	mov x0,x19
00ad2238	mov x1,x24
00ad223c	mov x2,x25
00ad2240	bl 0x00ad1c4c
00ad2244	cbz w0,0x00ad23b0
00ad2248	ldr x20,[x19, #0x88]
00ad224c	cmp w27,#0x3
00ad2250	b.lt 0x00ad2330
00ad2254	mov x0,xzr
00ad2258	mov w1,w27
00ad225c	bl 0x00c34790
00ad2260	cbz x0,0x00ad23b0
00ad2264	mov w26,#0x2
00ad2268	mov x24,x0
00ad226c	stp x20,x0,[sp]
00ad2270	mov x0,x23
00ad2274	mov w1,w26
00ad2278	mov w20,w27
00ad227c	bl 0x00c32610
00ad2280	mov x28,x0
00ad2284	mov x0,x22
00ad2288	mov w1,w26
00ad228c	bl 0x00c32610
00ad2290	sub w27,w26,#0x1
00ad2294	mov x25,x0
00ad2298	mov x0,x21
00ad229c	mov w1,w27
00ad22a0	bl 0x00c32610
00ad22a4	cbz x28,0x00ad239c
00ad22a8	cbz x25,0x00ad239c
00ad22ac	mov x24,x0
00ad22b0	cbz x0,0x00ad239c
00ad22b4	adrp x1,0x2b0000
00ad22b8	mov w0,#0x28
00ad22bc	mov w2,#0x31a
00ad22c0	add x1,x1,#0x862
00ad22c4	bl 0x00c34250
00ad22c8	cbz x0,0x00ad2364
00ad22cc	mov x26,x0
00ad22d0	stp x28,x25,[x0]
00ad22d4	str x24,[x0, #0x10]
00ad22d8	mov w1,#0x4
00ad22dc	mov x0,x28
00ad22e0	bl 0x00c38dc0
00ad22e4	ldr x0,[x26, #0x8]
00ad22e8	mov w1,#0x4
00ad22ec	bl 0x00c38dc0
00ad22f0	ldr x0,[x26, #0x10]
00ad22f4	mov w1,#0x4
00ad22f8	bl 0x00c38dc0
00ad22fc	ldr x24,[sp, #0x8]
00ad2300	mov x1,x26
00ad2304	mov x0,x24
00ad2308	bl 0x00c347a0
00ad230c	add w26,w27,#0x2
00ad2310	mov w27,w20
00ad2314	cmp w26,w20
00ad2318	b.lt 0x00ad2270
00ad231c	mov x0,x19
00ad2320	str x24,[x19, #0x88]
00ad2324	bl 0x00c3fc60
00ad2328	ldr x20,[sp]
00ad232c	cbz w0,0x00ad2398
00ad2330	cbz x20,0x00ad2344
00ad2334	adrp x1,0xcb5000
00ad2338	ldr x1,[x1, #0x7a0]
00ad233c	mov x0,x20
00ad2340	bl 0x00c32600
00ad2344	ldr w8,[x19, #0xd8]
00ad2348	cmp w27,#0x2
00ad234c	cset w9,gt
00ad2350	mov w0,#0x1
00ad2354	add w8,w8,#0x1
00ad2358	str w9,[x19, #0x10]
00ad235c	str w8,[x19, #0xd8]
00ad2360	b 0x00ad23b0
00ad2364	bl 0x00c342a0
00ad2368	adrp x0,0x2b0000
00ad236c	adrp x2,0x2dc000
00ad2370	add x0,x0,#0x862
00ad2374	add x2,x2,#0x936
00ad2378	mov w1,#0x31b
00ad237c	bl 0x00c342b0
00ad2380	mov w1,#0x100
00ad2384	mov w0,#0x4
00ad2388	movk w1,#0xc, LSL #16
00ad238c	mov x2,xzr
00ad2390	bl 0x00c342c0
00ad2394	b 0x00ad239c
00ad2398	str x20,[x19, #0x88]
00ad239c	adrp x1,0xcb5000
00ad23a0	ldr x1,[x1, #0x7a8]
00ad23a4	ldr x0,[sp, #0x8]
00ad23a8	bl 0x00c32600
00ad23ac	mov w0,wzr
00ad23b0	ldp x29,x30,[sp, #0x60]
00ad23b4	ldp x20,x19,[sp, #0x50]
00ad23b8	ldp x22,x21,[sp, #0x40]
00ad23bc	ldp x24,x23,[sp, #0x30]
00ad23c0	ldp x26,x25,[sp, #0x20]
00ad23c4	ldp x28,x27,[sp, #0x10]
00ad23c8	add sp,sp,#0x70
00ad23cc	ret
