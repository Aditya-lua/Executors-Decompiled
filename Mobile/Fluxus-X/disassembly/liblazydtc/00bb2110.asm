; ZSTD_DCtx_loadDictionary_byReference @ 00bb2110
00bb2110	sub sp,sp,#0x60
00bb2114	stp x29,x30,[sp, #0x20]
00bb2118	str x23,[sp, #0x30]
00bb211c	stp x22,x21,[sp, #0x40]
00bb2120	stp x20,x19,[sp, #0x50]
00bb2124	add x29,sp,#0x20
00bb2128	mrs x21,tpidr_el0
00bb212c	add x22,x0,#0x7, LSL #12
00bb2130	ldr x8,[x21, #0x28]
00bb2134	stur x8,[x29, #-0x8]
00bb2138	ldr w8,[x22, #0x61c]
00bb213c	cbz w8,0x00bb216c
00bb2140	mov x0,#-0x3c
00bb2144	ldr x8,[x21, #0x28]
00bb2148	ldur x9,[x29, #-0x8]
00bb214c	cmp x8,x9
00bb2150	b.ne 0x00bb21ec
00bb2154	ldp x20,x19,[sp, #0x50]
00bb2158	ldr x23,[sp, #0x30]
00bb215c	ldp x22,x21,[sp, #0x40]
00bb2160	ldp x29,x30,[sp, #0x20]
00bb2164	add sp,sp,#0x60
00bb2168	ret
00bb216c	mov x19,x0
00bb2170	ldr x0,[x0, #0x75e8]
00bb2174	mov x20,x1
00bb2178	mov x23,x2
00bb217c	bl 0x00c435b0
00bb2180	movi v0.2D,#0x0
00bb2184	mov x0,xzr
00bb2188	mov w8,#0x75e8
00bb218c	str wzr,[x22, #0x600]
00bb2190	str q0,[x19,x8]
00bb2194	cbz x20,0x00bb2144
00bb2198	cbz x23,0x00bb2144
00bb219c	ldr q0,[x19, #0x75b0]
00bb21a0	ldr x8,[x19, #0x75c0]
00bb21a4	mov x1,x23
00bb21a8	mov x4,sp
00bb21ac	mov x0,x20
00bb21b0	mov w2,#0x1
00bb21b4	mov w3,wzr
00bb21b8	str q0,[sp]
00bb21bc	str x8,[sp, #0x10]
00bb21c0	bl 0x00c435a0
00bb21c4	str x0,[x19, #0x75e8]
00bb21c8	cbz x0,0x00bb21e4
00bb21cc	mov x8,x0
00bb21d0	mov x0,xzr
00bb21d4	str x8,[x19, #0x75f0]
00bb21d8	mov w8,#0xffffffff
00bb21dc	str w8,[x22, #0x600]
00bb21e0	b 0x00bb2144
00bb21e4	mov x0,#-0x40
00bb21e8	b 0x00bb2144
00bb21ec	bl 0x00c2fec0
