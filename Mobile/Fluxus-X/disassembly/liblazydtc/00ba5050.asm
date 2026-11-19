; mbedtls_ripemd160_finish @ 00ba5050
00ba5050	sub sp,sp,#0x70
00ba5054	stp x28,x27,[sp, #0x10]
00ba5058	stp x26,x25,[sp, #0x20]
00ba505c	stp x24,x23,[sp, #0x30]
00ba5060	stp x22,x21,[sp, #0x40]
00ba5064	stp x20,x19,[sp, #0x50]
00ba5068	stp x29,x30,[sp, #0x60]
00ba506c	add x29,sp,#0x60
00ba5070	mrs x25,tpidr_el0
00ba5074	ldr x8,[x25, #0x28]
00ba5078	orr w10,wzr,#0x78
00ba507c	orr w11,wzr,#0x38
00ba5080	mov x20,x1
00ba5084	str x8,[sp, #0x8]
00ba5088	ldp w8,w9,[x0]
00ba508c	mov x19,x0
00ba5090	and w26,w8,#0x3f
00ba5094	cmp w26,#0x38
00ba5098	csel w10,w11,w10,cc
00ba509c	lsl w12,w8,#0x3
00ba50a0	extr w11,w9,w8,#0x1d
00ba50a4	subs w21,w10,w26
00ba50a8	stp w12,w11,[sp]
00ba50ac	b.eq 0x00ba5160
00ba50b0	add w8,w21,w8
00ba50b4	cmp w8,w21
00ba50b8	str w8,[x19]
00ba50bc	b.cs 0x00ba50c8
00ba50c0	add w8,w9,#0x1
00ba50c4	str w8,[x19, #0x4]
00ba50c8	adrp x22,0x787000
00ba50cc	add x22,x22,#0xfa0
00ba50d0	cbz w26,0x00ba5110
00ba50d4	mov w8,#0x40
00ba50d8	sub w23,w8,w26
00ba50dc	cmp w21,w23
00ba50e0	b.cc 0x00ba5110
00ba50e4	add x24,x19,#0x1c
00ba50e8	add x0,x24,x26
00ba50ec	mov x1,x22
00ba50f0	mov x2,x23
00ba50f4	bl 0x00c2ffd0
00ba50f8	mov x0,x19
00ba50fc	mov x1,x24
00ba5100	bl 0x00c433f0
00ba5104	mov w26,wzr
00ba5108	add x22,x22,x23
00ba510c	sub x21,x21,x23
00ba5110	subs x24,x21,#0x40
00ba5114	b.cc 0x00ba5148
00ba5118	and x27,x24,#-0x40
00ba511c	add x28,x27,#0x40
00ba5120	mov x23,x22
00ba5124	mov x0,x19
00ba5128	mov x1,x23
00ba512c	bl 0x00c433f0
00ba5130	sub x21,x21,#0x40
00ba5134	cmp x21,#0x3f
00ba5138	add x23,x23,#0x40
00ba513c	b.hi 0x00ba5124
00ba5140	add x22,x22,x28
00ba5144	sub x21,x24,x27
00ba5148	cbz x21,0x00ba5160
00ba514c	add x8,x19,x26
00ba5150	add x0,x8,#0x1c
00ba5154	mov x1,x22
00ba5158	mov x2,x21
00ba515c	bl 0x00c2ffd0
00ba5160	ldr w9,[x19]
00ba5164	and w8,w9,#0x3f
00ba5168	add w10,w9,#0x8
00ba516c	cmn w9,#0x8
00ba5170	str w10,[x19]
00ba5174	b.cc 0x00ba5184
00ba5178	ldr w9,[x19, #0x4]
00ba517c	add w9,w9,#0x1
00ba5180	str w9,[x19, #0x4]
00ba5184	mov x21,sp
00ba5188	mov w22,#0x8
00ba518c	cbz w8,0x00ba5210
00ba5190	mov w9,#0x40
00ba5194	sub w23,w9,w8
00ba5198	cmp w23,#0x8
00ba519c	b.hi 0x00ba5210
00ba51a0	add x21,x19,#0x1c
00ba51a4	add x0,x21,x8
00ba51a8	mov x1,sp
00ba51ac	mov x2,x23
00ba51b0	mov x26,sp
00ba51b4	bl 0x00c2ffd0
00ba51b8	mov x0,x19
00ba51bc	mov x1,x21
00ba51c0	bl 0x00c433f0
00ba51c4	mov w8,#0x8
00ba51c8	sub x22,x8,x23
00ba51cc	subs x24,x22,#0x40
00ba51d0	add x21,x26,x23
00ba51d4	b.cc 0x00ba5208
00ba51d8	and x26,x24,#-0x40
00ba51dc	add x27,x26,#0x40
00ba51e0	mov x23,x21
00ba51e4	mov x0,x19
00ba51e8	mov x1,x23
00ba51ec	bl 0x00c433f0
00ba51f0	sub x22,x22,#0x40
00ba51f4	cmp x22,#0x3f
00ba51f8	add x23,x23,#0x40
00ba51fc	b.hi 0x00ba51e4
00ba5200	add x21,x21,x27
00ba5204	sub x22,x24,x26
00ba5208	mov w8,wzr
00ba520c	cbz x22,0x00ba5224
00ba5210	add x8,x19,x8
00ba5214	add x0,x8,#0x1c
00ba5218	mov x1,x21
00ba521c	mov x2,x22
00ba5220	bl 0x00c2ffd0
00ba5224	ldr w8,[x19, #0x8]
00ba5228	str w8,[x20]
00ba522c	ldr w8,[x19, #0xc]
00ba5230	str w8,[x20, #0x4]
00ba5234	ldr w8,[x19, #0x10]
00ba5238	str w8,[x20, #0x8]
00ba523c	ldr w8,[x19, #0x14]
00ba5240	str w8,[x20, #0xc]
00ba5244	ldr w8,[x19, #0x18]
00ba5248	str w8,[x20, #0x10]
00ba524c	cbz x19,0x00ba525c
00ba5250	mov w1,#0x5c
00ba5254	mov x0,x19
00ba5258	bl 0x00c42220
00ba525c	ldr x8,[x25, #0x28]
00ba5260	ldr x9,[sp, #0x8]
00ba5264	cmp x8,x9
00ba5268	b.ne 0x00ba5290
00ba526c	ldp x29,x30,[sp, #0x60]
00ba5270	ldp x20,x19,[sp, #0x50]
00ba5274	ldp x22,x21,[sp, #0x40]
00ba5278	ldp x24,x23,[sp, #0x30]
00ba527c	ldp x26,x25,[sp, #0x20]
00ba5280	ldp x28,x27,[sp, #0x10]
00ba5284	mov w0,wzr
00ba5288	add sp,sp,#0x70
00ba528c	ret
00ba5290	bl 0x00c2fec0
