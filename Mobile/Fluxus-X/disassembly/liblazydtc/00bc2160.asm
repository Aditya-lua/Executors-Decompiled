; ZSTD_XXH64_digest @ 00bc2160
00bc2160	mov x8,#0xeb4f
00bc2164	mov x9,#0xca87
00bc2168	mov x10,#0x67c5
00bc216c	ldr x11,[x0]
00bc2170	movk x8,#0x27d4, LSL #16
00bc2174	movk x9,#0x85eb, LSL #16
00bc2178	movk x10,#0x1656, LSL #16
00bc217c	movk x8,#0xae3d, LSL #32
00bc2180	movk x9,#0x79b1, LSL #32
00bc2184	movk x10,#0xeb2f, LSL #32
00bc2188	cmp x11,#0x20
00bc218c	movk x8,#0xc2b2, LSL #48
00bc2190	movk x9,#0x9e37, LSL #48
00bc2194	movk x10,#0x27d4, LSL #48
00bc2198	b.cc 0x00bc2224
00bc219c	ldp x12,x13,[x0, #0x8]
00bc21a0	ldp x16,x17,[x0, #0x18]
00bc21a4	mul x14,x12,x8
00bc21a8	ror x12,x12,#0x3f
00bc21ac	ror x1,x16,#0x34
00bc21b0	ror x2,x17,#0x2e
00bc21b4	mul x15,x13,x8
00bc21b8	ror x13,x13,#0x39
00bc21bc	add x12,x13,x12
00bc21c0	add x13,x1,x2
00bc21c4	mul x16,x16,x8
00bc21c8	ror x14,x14,#0x21
00bc21cc	add x12,x12,x13
00bc21d0	mul x14,x14,x9
00bc21d4	ror x15,x15,#0x21
00bc21d8	mul x13,x15,x9
00bc21dc	ror x15,x16,#0x21
00bc21e0	mul x15,x15,x9
00bc21e4	eor x12,x12,x14
00bc21e8	mov x14,#0xae63
00bc21ec	movk x14,#0xc2b2, LSL #16
00bc21f0	movk x14,#0xca77, LSL #32
00bc21f4	movk x14,#0x85eb, LSL #48
00bc21f8	madd x12,x12,x9,x14
00bc21fc	eor x12,x12,x13
00bc2200	mul x13,x17,x8
00bc2204	madd x12,x12,x9,x14
00bc2208	ror x13,x13,#0x21
00bc220c	eor x12,x12,x15
00bc2210	mul x13,x13,x9
00bc2214	madd x12,x12,x9,x14
00bc2218	eor x12,x12,x13
00bc221c	madd x12,x12,x9,x14
00bc2220	b 0x00bc222c
00bc2224	ldr x12,[x0, #0x18]
00bc2228	add x12,x12,x10
00bc222c	and x13,x11,#0x1f
00bc2230	add x12,x12,x11
00bc2234	add x11,x0,#0x28
00bc2238	cmp x13,#0x8
00bc223c	b.cc 0x00bc2278
00bc2240	mov x14,#0xae63
00bc2244	movk x14,#0xc2b2, LSL #16
00bc2248	movk x14,#0xca77, LSL #32
00bc224c	movk x14,#0x85eb, LSL #48
00bc2250	ldr x15,[x11], #0x8
00bc2254	sub x13,x13,#0x8
00bc2258	cmp x13,#0x7
00bc225c	mul x15,x15,x8
00bc2260	ror x15,x15,#0x21
00bc2264	mul x15,x15,x9
00bc2268	eor x12,x15,x12
00bc226c	ror x12,x12,#0x25
00bc2270	madd x12,x12,x9,x14
00bc2274	b.hi 0x00bc2250
00bc2278	mov x14,#0x79f9
00bc227c	subs x15,x13,#0x4
00bc2280	movk x14,#0x9e37, LSL #16
00bc2284	movk x14,#0x67b1, LSL #32
00bc2288	movk x14,#0x1656, LSL #48
00bc228c	b.cc 0x00bc22a8
00bc2290	ldr w13,[x11], #0x4
00bc2294	mul x13,x13,x9
00bc2298	eor x12,x13,x12
00bc229c	mov x13,x15
00bc22a0	ror x12,x12,#0x29
00bc22a4	madd x12,x12,x8,x14
00bc22a8	cbz x13,0x00bc22c8
00bc22ac	ldrb w15,[x11], #0x1
00bc22b0	subs x13,x13,#0x1
00bc22b4	mul x15,x15,x10
00bc22b8	eor x12,x15,x12
00bc22bc	ror x12,x12,#0x35
00bc22c0	mul x12,x12,x9
00bc22c4	b.ne 0x00bc22ac
00bc22c8	eor x9,x12,x12, LSR #0x21
00bc22cc	mul x8,x9,x8
00bc22d0	eor x8,x8,x8, LSR #0x1d
00bc22d4	mul x8,x8,x14
00bc22d8	eor x0,x8,x8, LSR #0x20
00bc22dc	ret
