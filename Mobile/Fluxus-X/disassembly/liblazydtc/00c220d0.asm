; FUN_00c220d0 @ 00c220d0
00c220d0	paciasp
00c220d4	stp x29,x30,[sp, #-0x30]!
00c220d8	str x21,[sp, #0x10]
00c220dc	stp x20,x19,[sp, #0x20]
00c220e0	mov x29,sp
00c220e4	ldr x21,[x0, #0x10]
00c220e8	mov x20,x0
00c220ec	mov x19,x1
00c220f0	ldr x8,[x21]
00c220f4	mov x0,x21
00c220f8	ldr x8,[x8, #0x20]
00c220fc	blr x8
00c22100	ldurh w8,[x21, #0x9]
00c22104	and w8,w8,#0xc0
00c22108	cmp w8,#0x40
00c2210c	b.eq 0x00c22124
00c22110	ldr x8,[x21]
00c22114	mov x0,x21
00c22118	mov x1,x19
00c2211c	ldr x8,[x8, #0x28]
00c22120	blr x8
00c22124	ldp x8,x9,[x19, #0x8]
00c22128	ldr x0,[x19]
00c2212c	add x10,x8,#0x2
00c22130	cmp x10,x9
00c22134	b.ls 0x00c2215c
00c22138	lsl x9,x9,#0x1
00c2213c	add x8,x8,#0x3e2
00c22140	cmp x9,x8
00c22144	csel x1,x9,x8,hi
00c22148	str x1,[x19, #0x10]
00c2214c	bl 0x00c30950
00c22150	str x0,[x19]
00c22154	cbz x0,0x00c221d0
00c22158	ldr x8,[x19, #0x8]
00c2215c	mov w9,#0x3a3a
00c22160	strh w9,[x0, x8#0x0]
00c22164	mov x1,x19
00c22168	ldr x8,[x19, #0x8]
00c2216c	ldr x20,[x20, #0x18]
00c22170	add x8,x8,#0x2
00c22174	ldr x9,[x20]
00c22178	mov x0,x20
00c2217c	str x8,[x19, #0x8]
00c22180	ldr x8,[x9, #0x20]
00c22184	blr x8
00c22188	ldurh w8,[x20, #0x9]
00c2218c	and w8,w8,#0xc0
00c22190	cmp w8,#0x40
00c22194	b.ne 0x00c221ac
00c22198	ldp x20,x19,[sp, #0x20]
00c2219c	ldr x21,[sp, #0x10]
00c221a0	ldp x29,x30,[sp], #0x30
00c221a4	autiasp
00c221a8	ret
00c221ac	ldr x8,[x20]
00c221b0	mov x0,x20
00c221b4	ldr x16,[x8, #0x28]
00c221b8	mov x1,x19
00c221bc	ldp x20,x19,[sp, #0x20]
00c221c0	ldr x21,[sp, #0x10]
00c221c4	ldp x29,x30,[sp], #0x30
00c221c8	autiasp
00c221cc	br x16
00c221d0	bl 0x00c30b40
