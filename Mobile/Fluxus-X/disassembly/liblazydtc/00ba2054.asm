; FUN_00ba2054 @ 00ba2054
00ba2054	stp x28,x27,[sp, #-0x60]!
00ba2058	stp x26,x25,[sp, #0x10]
00ba205c	stp x24,x23,[sp, #0x20]
00ba2060	stp x22,x21,[sp, #0x30]
00ba2064	stp x20,x19,[sp, #0x40]
00ba2068	stp x29,x30,[sp, #0x50]
00ba206c	add x29,sp,#0x50
00ba2070	sub sp,sp,#0x210
00ba2074	mrs x8,tpidr_el0
00ba2078	str x8,[sp, #0x10]
00ba207c	ldr x8,[x8, #0x28]
00ba2080	mov w23,w0
00ba2084	mov x0,x6
00ba2088	mov x21,x7
00ba208c	mov x22,x6
00ba2090	mov x20,x5
00ba2094	mov x26,x4
00ba2098	mov x27,x3
00ba209c	mov w25,w2
00ba20a0	mov x28,x1
00ba20a4	stur x8,[x29, #-0x60]
00ba20a8	add x19,sp,#0x58
00ba20ac	bl 0x00c2ff50
00ba20b0	mov x24,x0
00ba20b4	add x4,x19,#0x4
00ba20b8	add x3,sp,#0x18
00ba20bc	mov w5,#0x1a1
00ba20c0	mov x0,x28
00ba20c4	mov x1,x27
00ba20c8	mov w2,w25
00ba20cc	bl 0x00c42780
00ba20d0	cbz w0,0x00ba2108
00ba20d4	ldr x24,[sp, #0x10]
00ba20d8	ldr x8,[x24, #0x28]
00ba20dc	ldur x9,[x29, #-0x60]
00ba20e0	cmp x8,x9
00ba20e4	b.ne 0x00ba2268
00ba20e8	add sp,sp,#0x210
00ba20ec	ldp x29,x30,[sp, #0x50]
00ba20f0	ldp x20,x19,[sp, #0x40]
00ba20f4	ldp x22,x21,[sp, #0x30]
00ba20f8	ldp x24,x23,[sp, #0x20]
00ba20fc	ldp x26,x25,[sp, #0x10]
00ba2100	ldp x28,x27,[sp], #0x60
00ba2104	ret
00ba2108	ldr x9,[sp, #0x18]
00ba210c	mov w0,#0xffffb100
00ba2110	stp x21,x20,[sp]
00ba2114	add x8,x9,#0x4
00ba2118	rev w10,w9
00ba211c	cmp x8,#0x1a5
00ba2120	str w10,[sp, #0x58]
00ba2124	b.gt 0x00ba20d4
00ba2128	mov w10,#0x1a1
00ba212c	sub x9,x10,x9
00ba2130	cmp x9,#0x5
00ba2134	b.lt 0x00ba20d4
00ba2138	add x27,x19,#0x1a5
00ba213c	add x19,x19,x8
00ba2140	add x4,x19,#0x4
00ba2144	sub x5,x27,x4
00ba2148	add x3,sp,#0x18
00ba214c	mov x0,x28
00ba2150	mov x1,x26
00ba2154	mov w2,w25
00ba2158	bl 0x00c42780
00ba215c	cbnz w0,0x00ba20d4
00ba2160	ldr x8,[sp, #0x18]
00ba2164	add x9,x19,x8
00ba2168	add x26,x9,#0x4
00ba216c	rev w8,w8
00ba2170	cmp x26,x27
00ba2174	str w8,[x19]
00ba2178	b.hi 0x00ba2188
00ba217c	sub x8,x27,x26
00ba2180	cmp x8,#0x5
00ba2184	b.ge 0x00ba2194
00ba2188	ldr x24,[sp, #0x10]
00ba218c	mov w0,#0xffffb100
00ba2190	b 0x00ba20d8
00ba2194	ldr x1,[sp, #0x8]
00ba2198	add x4,x26,#0x4
00ba219c	sub x5,x27,x4
00ba21a0	add x3,sp,#0x18
00ba21a4	mov x0,x28
00ba21a8	mov w2,w25
00ba21ac	bl 0x00c42780
00ba21b0	cbnz w0,0x00ba20d4
00ba21b4	ldr x8,[sp, #0x18]
00ba21b8	add x9,x26,x8
00ba21bc	add x21,x9,#0x4
00ba21c0	sub x9,x27,x21
00ba21c4	rev w8,w8
00ba21c8	cmp x9,#0x4
00ba21cc	str w8,[x26]
00ba21d0	b.lt 0x00ba2188
00ba21d4	mov x19,x24
00ba21d8	rev w8,w19
00ba21dc	str w8,[x21], #0x4
00ba21e0	subs x8,x27,x21
00ba21e4	b.cc 0x00ba2188
00ba21e8	ldr x24,[sp, #0x10]
00ba21ec	cmp x8,x19
00ba21f0	b.cs 0x00ba21fc
00ba21f4	mov w0,#0xffffb100
00ba21f8	b 0x00ba20d8
00ba21fc	mov x0,x21
00ba2200	mov x1,x22
00ba2204	mov x2,x19
00ba2208	bl 0x00c2ffd0
00ba220c	add x8,x21,x19
00ba2210	add x9,sp,#0x58
00ba2214	mov w0,w23
00ba2218	sub x22,x8,x9
00ba221c	bl 0x00c30210
00ba2220	add x1,sp,#0x58
00ba2224	add x3,sp,#0x18
00ba2228	mov x2,x22
00ba222c	bl 0x00c30220
00ba2230	cbnz w0,0x00ba20d8
00ba2234	mov w0,w23
00ba2238	bl 0x00c30210
00ba223c	bl 0x00c302d0
00ba2240	and x2,x0,#0xff
00ba2244	ldr x0,[sp]
00ba2248	add x1,sp,#0x18
00ba224c	bl 0x00c41ca0
00ba2250	cbnz w0,0x00ba20d8
00ba2254	ldr x0,[sp]
00ba2258	add x2,x28,#0x68
00ba225c	mov x1,x0
00ba2260	bl 0x00c41c60
00ba2264	b 0x00ba20d8
00ba2268	bl 0x00c2fec0
