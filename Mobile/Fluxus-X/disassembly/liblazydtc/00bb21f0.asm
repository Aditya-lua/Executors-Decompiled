; ZSTD_DCtx_loadDictionary @ 00bb21f0
00bb21f0	sub sp,sp,#0x60
00bb21f4	stp x29,x30,[sp, #0x20]
00bb21f8	str x23,[sp, #0x30]
00bb21fc	stp x22,x21,[sp, #0x40]
00bb2200	stp x20,x19,[sp, #0x50]
00bb2204	add x29,sp,#0x20
00bb2208	mrs x21,tpidr_el0
00bb220c	add x22,x0,#0x7, LSL #12
00bb2210	ldr x8,[x21, #0x28]
00bb2214	stur x8,[x29, #-0x8]
00bb2218	ldr w8,[x22, #0x61c]
00bb221c	cbz w8,0x00bb224c
00bb2220	mov x0,#-0x3c
00bb2224	ldr x8,[x21, #0x28]
00bb2228	ldur x9,[x29, #-0x8]
00bb222c	cmp x8,x9
00bb2230	b.ne 0x00bb22cc
00bb2234	ldp x20,x19,[sp, #0x50]
00bb2238	ldr x23,[sp, #0x30]
00bb223c	ldp x22,x21,[sp, #0x40]
00bb2240	ldp x29,x30,[sp, #0x20]
00bb2244	add sp,sp,#0x60
00bb2248	ret
00bb224c	mov x19,x0
00bb2250	ldr x0,[x0, #0x75e8]
00bb2254	mov x20,x1
00bb2258	mov x23,x2
00bb225c	bl 0x00c435b0
00bb2260	movi v0.2D,#0x0
00bb2264	mov x0,xzr
00bb2268	mov w8,#0x75e8
00bb226c	str wzr,[x22, #0x600]
00bb2270	str q0,[x19,x8]
00bb2274	cbz x20,0x00bb2224
00bb2278	cbz x23,0x00bb2224
00bb227c	ldr q0,[x19, #0x75b0]
00bb2280	ldr x8,[x19, #0x75c0]
00bb2284	mov x1,x23
00bb2288	mov x4,sp
00bb228c	mov x0,x20
00bb2290	mov w2,wzr
00bb2294	mov w3,wzr
00bb2298	str q0,[sp]
00bb229c	str x8,[sp, #0x10]
00bb22a0	bl 0x00c435a0
00bb22a4	str x0,[x19, #0x75e8]
00bb22a8	cbz x0,0x00bb22c4
00bb22ac	mov x8,x0
00bb22b0	mov x0,xzr
00bb22b4	str x8,[x19, #0x75f0]
00bb22b8	mov w8,#0xffffffff
00bb22bc	str w8,[x22, #0x600]
00bb22c0	b 0x00bb2224
00bb22c4	mov x0,#-0x40
00bb22c8	b 0x00bb2224
00bb22cc	bl 0x00c2fec0
