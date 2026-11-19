; FUN_00ac2084 @ 00ac2084
00ac2084	stp x24,x23,[sp, #-0x40]!
00ac2088	stp x22,x21,[sp, #0x10]
00ac208c	stp x20,x19,[sp, #0x20]
00ac2090	stp x29,x30,[sp, #0x30]
00ac2094	add x29,sp,#0x30
00ac2098	mov x19,x3
00ac209c	mov x21,x2
00ac20a0	mov w24,w1
00ac20a4	mov x20,x0
00ac20a8	bl 0x00c321b0
00ac20ac	mov x22,x0
00ac20b0	mov x0,x20
00ac20b4	bl 0x00c35620
00ac20b8	sub w8,w24,#0x65
00ac20bc	cmp w8,#0x2f
00ac20c0	mov x23,x0
00ac20c4	b.hi 0x00ac210c
00ac20c8	adrp x9,0x774000
00ac20cc	add x9,x9,#0x594
00ac20d0	ldrsw x8,[x9, x8, LSL #0x2]
00ac20d4	add x8,x8,x9
00ac20d8	br x8
00ac20dc	orr w1,wzr,#0xf
00ac20e0	mov x0,x20
00ac20e4	bl 0x00c32190
00ac20e8	mov w1,#0x65
00ac20ec	mov x0,x23
00ac20f0	mov x2,x21
00ac20f4	mov x3,x19
00ac20f8	bl 0x00c321a0
00ac20fc	mov x19,x0
00ac2100	mov x0,x20
00ac2104	bl 0x00c38460
00ac2108	b 0x00ac220c
00ac210c	cmp w24,#0xc
00ac2110	b.eq 0x00ac21e0
00ac2114	cmp w24,#0x1
00ac2118	b.ne 0x00ac2154
00ac211c	mov x0,x20
00ac2120	bl 0x00c38620
00ac2124	cbz w0,0x00ac2208
00ac2128	mov x0,x22
00ac212c	bl 0x00c34c00
00ac2130	mov x1,x0
00ac2134	mov x0,x22
00ac2138	mov x2,xzr
00ac213c	bl 0x00c31f70
00ac2140	cmp w0,#0x1
00ac2144	b.lt 0x00ac2224
00ac2148	mov w1,#0x1
00ac214c	mov x0,x23
00ac2150	b 0x00ac215c
00ac2154	mov x0,x23
00ac2158	mov w1,w24
00ac215c	mov x2,x21
00ac2160	mov x3,x19
00ac2164	ldp x29,x30,[sp, #0x30]
00ac2168	ldp x20,x19,[sp, #0x20]
00ac216c	ldp x22,x21,[sp, #0x10]
00ac2170	ldp x24,x23,[sp], #0x40
00ac2174	b 0x00c321a0
00ac2178	mov x0,x22
00ac217c	mov x1,x19
00ac2180	mov x2,xzr
00ac2184	bl 0x00c31f70
00ac2188	cmp w0,#0x1
00ac218c	sxtw x19,w0
00ac2190	b.lt 0x00ac220c
00ac2194	mov w1,#0x1
00ac2198	b 0x00ac21fc
00ac219c	mov x0,x20
00ac21a0	bl 0x00c38620
00ac21a4	cbz w0,0x00ac2208
00ac21a8	mov x0,x22
00ac21ac	bl 0x00c34c00
00ac21b0	str x0,[x19]
00ac21b4	b 0x00ac21d8
00ac21b8	str x22,[x19]
00ac21bc	b 0x00ac21f4
00ac21c0	mov x0,x20
00ac21c4	bl 0x00c38620
00ac21c8	cbz w0,0x00ac2208
00ac21cc	mov x0,x20
00ac21d0	mov x1,x19
00ac21d4	bl 0x00c32290
00ac21d8	mov w19,#0x1
00ac21dc	b 0x00ac220c
00ac21e0	mov x0,x19
00ac21e4	bl 0x00c321b0
00ac21e8	mov x1,x22
00ac21ec	bl 0x00c34bf0
00ac21f0	cbz w0,0x00ac2208
00ac21f4	mov w1,#0x1
00ac21f8	mov w19,#0x1
00ac21fc	mov x0,x20
00ac2200	bl 0x00c322b0
00ac2204	b 0x00ac220c
00ac2208	mov x19,xzr
00ac220c	mov x0,x19
00ac2210	ldp x29,x30,[sp, #0x30]
00ac2214	ldp x20,x19,[sp, #0x20]
00ac2218	ldp x22,x21,[sp, #0x10]
00ac221c	ldp x24,x23,[sp], #0x40
00ac2220	ret
00ac2224	sxtw x19,w0
00ac2228	b 0x00ac220c
