; std::__ndk1::money_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00bf1f80
00bf1f80	paciasp
00bf1f84	sub sp,sp,#0x180
00bf1f88	stp x29,x30,[sp, #0x120]
00bf1f8c	stp x28,x27,[sp, #0x130]
00bf1f90	stp x26,x25,[sp, #0x140]
00bf1f94	stp x24,x23,[sp, #0x150]
00bf1f98	stp x22,x21,[sp, #0x160]
00bf1f9c	stp x20,x19,[sp, #0x170]
00bf1fa0	add x29,sp,#0x120
00bf1fa4	sub x8,x29,#0x10
00bf1fa8	mov x0,x3
00bf1fac	mov x22,x5
00bf1fb0	mov w26,w4
00bf1fb4	mov x20,x3
00bf1fb8	mov w25,w2
00bf1fbc	mov x21,x1
00bf1fc0	bl 0x00c30070
00bf1fc4	adrp x23,0xcb4000
00bf1fc8	ldr x23,[x23, #0x998]
00bf1fcc	ldur x19,[x29, #-0x10]
00bf1fd0	stur x23,[x29, #-0x50]
00bf1fd4	ldar x8,[x23]
00bf1fd8	cmn x8,#0x1
00bf1fdc	b.eq 0x00bf2008
00bf1fe0	sub x8,x29,#0x50
00bf1fe4	add x9,sp,#0x50
00bf1fe8	str x8,[sp, #0x50]
00bf1fec	stur x9,[x29, #-0x38]
00bf1ff0	adrp x0,0xcb4000
00bf1ff4	nop
00bf1ff8	adr x2,0xc0bab0
00bf1ffc	ldr x0,[x0, #0x998]
00bf2000	sub x1,x29,#0x38
00bf2004	bl 0x00c305d0
00bf2008	ldp x8,x10,[x19, #0x10]
00bf200c	ldrsw x9,[x23, #0x8]
00bf2010	sub x9,x9,#0x1
00bf2014	sub x10,x10,x8
00bf2018	cmp x9,x10, ASR #0x3
00bf201c	b.cs 0x00bf228c
00bf2020	ldr x23,[x8, x9, LSL #0x3]
00bf2024	cbz x23,0x00bf228c
00bf2028	ldrb w8,[x22]
00bf202c	ldr x9,[x22, #0x8]
00bf2030	lsr x10,x8,#0x1
00bf2034	tst w8,#0x1
00bf2038	csel x9,x10,x9,eq
00bf203c	cbz x9,0x00bf2070
00bf2040	ldr x9,[x22, #0x10]
00bf2044	tst w8,#0x1
00bf2048	ldr x8,[x23]
00bf204c	csinc x9,x9,x22,ne
00bf2050	ldr x8,[x8, #0x38]
00bf2054	ldrb w19,[x9]
00bf2058	mov x0,x23
00bf205c	mov w1,#0x2d
00bf2060	blr x8
00bf2064	cmp w19,w0, UXTB 
00bf2068	cset w24,eq
00bf206c	b 0x00bf2074
00bf2070	mov w24,wzr
00bf2074	stp xzr,xzr,[x29, #-0x38]
00bf2078	stur xzr,[x29, #-0x28]
00bf207c	stp xzr,xzr,[x29, #-0x50]
00bf2080	stur xzr,[x29, #-0x40]
00bf2084	stp xzr,xzr,[x29, #-0x68]
00bf2088	stur xzr,[x29, #-0x58]
00bf208c	sub x8,x29,#0x6c
00bf2090	sub x9,x29,#0x68
00bf2094	and w0,w25,#0x1
00bf2098	sub x2,x29,#0x10
00bf209c	sub x3,x29,#0x14
00bf20a0	sub x4,x29,#0x18
00bf20a4	sub x5,x29,#0x1c
00bf20a8	sub x6,x29,#0x38
00bf20ac	sub x7,x29,#0x50
00bf20b0	mov w1,w24
00bf20b4	stp x9,x8,[sp]
00bf20b8	bl 0x00c44240
00bf20bc	ldrb w19,[x22]
00bf20c0	ldr x8,[x22, #0x8]
00bf20c4	ldursw x28,[x29, #-0x6c]
00bf20c8	str x21,[sp, #0x38]
00bf20cc	lsr x9,x19,#0x1
00bf20d0	tst w19,#0x1
00bf20d4	csel x27,x9,x8,eq
00bf20d8	cmp w28,w27
00bf20dc	b.ge 0x00bf2120
00bf20e0	ldurb w8,[x29, #-0x68]
00bf20e4	ldurb w9,[x29, #-0x50]
00bf20e8	ldur x10,[x29, #-0x60]
00bf20ec	lsr x11,x8,#0x1
00bf20f0	tst w8,#0x1
00bf20f4	ldur x8,[x29, #-0x48]
00bf20f8	lsr x12,x9,#0x1
00bf20fc	csel x10,x11,x10,eq
00bf2100	sub x11,x27,x28
00bf2104	tst w9,#0x1
00bf2108	csel x8,x12,x8,eq
00bf210c	add x9,x28,x11, LSL #0x1
00bf2110	add x8,x10,x8
00bf2114	add x8,x9,x8
00bf2118	add x0,x8,#0x1
00bf211c	b 0x00bf2154
00bf2120	ldurb w8,[x29, #-0x68]
00bf2124	ldurb w9,[x29, #-0x50]
00bf2128	ldur x10,[x29, #-0x60]
00bf212c	lsr x11,x8,#0x1
00bf2130	tst w8,#0x1
00bf2134	ldur x8,[x29, #-0x48]
00bf2138	lsr x12,x9,#0x1
00bf213c	csel x10,x11,x10,eq
00bf2140	tst w9,#0x1
00bf2144	csel x8,x12,x8,eq
00bf2148	add x9,x28,x10
00bf214c	add x8,x9,x8
00bf2150	add x0,x8,#0x2
00bf2154	mov w21,w26
00bf2158	cmp x0,#0x65
00bf215c	b.cc 0x00bf2174
00bf2160	bl 0x00c308d0
00bf2164	mov x25,x0
00bf2168	mov x26,x0
00bf216c	cbnz x0,0x00bf217c
00bf2170	bl 0x00c43cc0
00bf2174	mov x25,xzr
00bf2178	add x26,sp,#0x50
00bf217c	ldr x8,[x22, #0x10]
00bf2180	ldr w3,[x20, #0x8]
00bf2184	tst w19,#0x1
00bf2188	ldurb w9,[x29, #-0x18]
00bf218c	ldurb w10,[x29, #-0x1c]
00bf2190	csinc x4,x8,x22,ne
00bf2194	sub x8,x29,#0x68
00bf2198	sub x11,x29,#0x50
00bf219c	add x1,sp,#0x48
00bf21a0	stp x11,x8,[sp, #0x20]
00bf21a4	sub x8,x29,#0x38
00bf21a8	sub x11,x29,#0x14
00bf21ac	add x2,sp,#0x40
00bf21b0	add x5,x4,x27
00bf21b4	mov x0,x26
00bf21b8	mov x6,x23
00bf21bc	mov w7,w24
00bf21c0	str w28,[sp, #0x30]
00bf21c4	str x8,[sp, #0x18]
00bf21c8	strb w10,[sp, #0x10]
00bf21cc	strb w9,[sp, #0x8]
00bf21d0	str x11,[sp]
00bf21d4	bl 0x00c44250
00bf21d8	ldp x3,x2,[sp, #0x40]
00bf21dc	ldr x0,[sp, #0x38]
00bf21e0	mov x1,x26
00bf21e4	mov x4,x20
00bf21e8	mov w5,w21
00bf21ec	bl 0x00be5420
00bf21f0	mov x19,x0
00bf21f4	cbz x25,0x00bf2200
00bf21f8	mov x0,x25
00bf21fc	bl 0x00c30960
00bf2200	ldurb w8,[x29, #-0x68]
00bf2204	tbnz w8,#0x0,0x00bf2258
00bf2208	ldurb w8,[x29, #-0x50]
00bf220c	tbnz w8,#0x0,0x00bf2270
00bf2210	ldurb w8,[x29, #-0x38]
00bf2214	tbz w8,#0x0,0x00bf2228
00bf2218	ldur x8,[x29, #-0x38]
00bf221c	ldur x0,[x29, #-0x28]
00bf2220	and x1,x8,#-0x2
00bf2224	bl 0x00c2fe80
00bf2228	sub x0,x29,#0x10
00bf222c	bl 0x00c30090
00bf2230	mov x0,x19
00bf2234	ldp x20,x19,[sp, #0x170]
00bf2238	ldp x22,x21,[sp, #0x160]
00bf223c	ldp x24,x23,[sp, #0x150]
00bf2240	ldp x26,x25,[sp, #0x140]
00bf2244	ldp x28,x27,[sp, #0x130]
00bf2248	ldp x29,x30,[sp, #0x120]
00bf224c	add sp,sp,#0x180
00bf2250	autiasp
00bf2254	ret
00bf2258	ldur x8,[x29, #-0x68]
00bf225c	ldur x0,[x29, #-0x58]
00bf2260	and x1,x8,#-0x2
00bf2264	bl 0x00c2fe80
00bf2268	ldurb w8,[x29, #-0x50]
00bf226c	tbz w8,#0x0,0x00bf2210
00bf2270	ldur x8,[x29, #-0x50]
00bf2274	ldur x0,[x29, #-0x40]
00bf2278	and x1,x8,#-0x2
00bf227c	bl 0x00c2fe80
00bf2280	ldurb w8,[x29, #-0x38]
00bf2284	tbnz w8,#0x0,0x00bf2218
00bf2288	b 0x00bf2228
00bf228c	bl 0x00bd8968
