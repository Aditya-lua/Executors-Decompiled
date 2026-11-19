; ZSTD_XXH64_update @ 00bc1fb0
00bc1fb0	cbz x1,0x00bc2158
00bc1fb4	stp x29,x30,[sp, #-0x40]!
00bc1fb8	stp x24,x23,[sp, #0x10]
00bc1fbc	stp x22,x21,[sp, #0x20]
00bc1fc0	stp x20,x19,[sp, #0x30]
00bc1fc4	mov x29,sp
00bc1fc8	ldr w8,[x0, #0x48]
00bc1fcc	ldr x9,[x0]
00bc1fd0	mov x19,x0
00bc1fd4	add x10,x2,x8
00bc1fd8	add x9,x9,x2
00bc1fdc	cmp x10,#0x1f
00bc1fe0	str x9,[x0]
00bc1fe4	b.hi 0x00bc2008
00bc1fe8	add x8,x19,x8
00bc1fec	mov x20,x2
00bc1ff0	add x0,x8,#0x28
00bc1ff4	bl 0x00c2ffd0
00bc1ff8	ldr w8,[x19, #0x48]
00bc1ffc	add w8,w8,w20
00bc2000	str w8,[x19, #0x48]
00bc2004	b 0x00bc2148
00bc2008	mov x22,#0xeb4f
00bc200c	mov x23,#0xca87
00bc2010	add x21,x1,x2
00bc2014	movk x22,#0x27d4, LSL #16
00bc2018	movk x23,#0x85eb, LSL #16
00bc201c	movk x22,#0xae3d, LSL #32
00bc2020	movk x23,#0x79b1, LSL #32
00bc2024	movk x22,#0xc2b2, LSL #48
00bc2028	movk x23,#0x9e37, LSL #48
00bc202c	cbz w8,0x00bc20ac
00bc2030	mov w24,#0x20
00bc2034	add x9,x19,#0x28
00bc2038	mov x20,x1
00bc203c	sub w2,w24,w8
00bc2040	add x0,x9,x8
00bc2044	bl 0x00c2ffd0
00bc2048	ldp x8,x11,[x19, #0x28]
00bc204c	ldp x9,x10,[x19, #0x8]
00bc2050	nop
00bc2054	madd x8,x8,x22,x9
00bc2058	ldp x9,x13,[x19, #0x38]
00bc205c	nop
00bc2060	madd x10,x11,x22,x10
00bc2064	ldp x11,x12,[x19, #0x18]
00bc2068	nop
00bc206c	madd x9,x9,x22,x11
00bc2070	ror x8,x8,#0x21
00bc2074	madd x11,x13,x22,x12
00bc2078	ror x10,x10,#0x21
00bc207c	mul x8,x8,x23
00bc2080	ror x9,x9,#0x21
00bc2084	mul x10,x10,x23
00bc2088	ror x11,x11,#0x21
00bc208c	mul x9,x9,x23
00bc2090	mul x11,x11,x23
00bc2094	stp x8,x10,[x19, #0x8]
00bc2098	ldr w8,[x19, #0x48]
00bc209c	str wzr,[x19, #0x48]
00bc20a0	sub w8,w24,w8
00bc20a4	add x1,x20,x8
00bc20a8	stp x9,x11,[x19, #0x18]
00bc20ac	add x8,x1,#0x20
00bc20b0	cmp x8,x21
00bc20b4	b.hi 0x00bc212c
00bc20b8	ldp x8,x9,[x19, #0x8]
00bc20bc	sub x11,x21,#0x20
00bc20c0	ldp x10,x12,[x19, #0x18]
00bc20c4	ldr x13,[x1]
00bc20c8	nop
00bc20cc	madd x8,x13,x22,x8
00bc20d0	ror x8,x8,#0x21
00bc20d4	mul x8,x8,x23
00bc20d8	str x8,[x19, #0x8]
00bc20dc	ldr x13,[x1, #0x8]
00bc20e0	nop
00bc20e4	madd x9,x13,x22,x9
00bc20e8	ror x9,x9,#0x21
00bc20ec	mul x9,x9,x23
00bc20f0	str x9,[x19, #0x10]
00bc20f4	ldr x13,[x1, #0x10]
00bc20f8	nop
00bc20fc	madd x10,x13,x22,x10
00bc2100	ror x10,x10,#0x21
00bc2104	mul x10,x10,x23
00bc2108	str x10,[x19, #0x18]
00bc210c	ldr x13,[x1, #0x18]
00bc2110	add x1,x1,#0x20
00bc2114	cmp x1,x11
00bc2118	madd x12,x13,x22,x12
00bc211c	ror x12,x12,#0x21
00bc2120	mul x12,x12,x23
00bc2124	str x12,[x19, #0x20]
00bc2128	b.ls 0x00bc20c4
00bc212c	cmp x1,x21
00bc2130	b.cs 0x00bc2148
00bc2134	sub x20,x21,x1
00bc2138	add x0,x19,#0x28
00bc213c	mov x2,x20
00bc2140	bl 0x00c2ffd0
00bc2144	str w20,[x19, #0x48]
00bc2148	ldp x20,x19,[sp, #0x30]
00bc214c	ldp x22,x21,[sp, #0x20]
00bc2150	ldp x24,x23,[sp, #0x10]
00bc2154	ldp x29,x30,[sp], #0x40
00bc2158	mov w0,wzr
00bc215c	ret
