; ossl_sm3_final @ 00ae50d4
00ae50d4	str x21,[sp, #-0x30]!
00ae50d8	stp x20,x19,[sp, #0x10]
00ae50dc	stp x29,x30,[sp, #0x20]
00ae50e0	ldr w8,[x1, #0x68]
00ae50e4	add x21,x1,#0x28
00ae50e8	mov w9,#0x80
00ae50ec	mov x20,x1
00ae50f0	mov x19,x0
00ae50f4	strb w9,[x21, x8]
00ae50f8	cmp w8,#0x38
00ae50fc	add x9,x8,#0x1
00ae5100	add x29,sp,#0x20
00ae5104	b.cc 0x00ae5130
00ae5108	add x0,x21,x9
00ae510c	orr w9,wzr,#0x3f
00ae5110	sub x2,x9,x8
00ae5114	mov w1,wzr
00ae5118	bl 0x00c301c0
00ae511c	mov w2,#0x1
00ae5120	mov x0,x20
00ae5124	mov x1,x21
00ae5128	bl 0x00ae2c54
00ae512c	mov x9,xzr
00ae5130	orr w8,wzr,#0x38
00ae5134	add x0,x21,x9
00ae5138	sub x2,x8,x9
00ae513c	mov w1,wzr
00ae5140	bl 0x00c301c0
00ae5144	ldp w9,w8,[x20, #0x20]
00ae5148	mov w2,#0x1
00ae514c	mov x0,x20
00ae5150	mov x1,x21
00ae5154	lsr w10,w8,#0x18
00ae5158	strb w10,[x20, #0x60]
00ae515c	lsr w10,w8,#0x10
00ae5160	strb w8,[x20, #0x63]
00ae5164	lsr w8,w8,#0x8
00ae5168	strb w8,[x20, #0x62]
00ae516c	lsr w8,w9,#0x18
00ae5170	strb w8,[x20, #0x64]
00ae5174	lsr w8,w9,#0x10
00ae5178	strb w8,[x20, #0x65]
00ae517c	lsr w8,w9,#0x8
00ae5180	strb w10,[x20, #0x61]
00ae5184	strb w8,[x20, #0x66]
00ae5188	strb w9,[x20, #0x67]
00ae518c	bl 0x00ae2c54
00ae5190	mov w1,#0x40
00ae5194	mov x0,x21
00ae5198	str wzr,[x20, #0x68]
00ae519c	bl 0x00c34750
00ae51a0	ldr w8,[x20]
00ae51a4	mov w0,#0x1
00ae51a8	lsr w9,w8,#0x18
00ae51ac	strb w9,[x19]
00ae51b0	lsr w9,w8,#0x10
00ae51b4	strb w8,[x19, #0x3]
00ae51b8	lsr w8,w8,#0x8
00ae51bc	strb w9,[x19, #0x1]
00ae51c0	strb w8,[x19, #0x2]
00ae51c4	ldr w8,[x20, #0x4]
00ae51c8	lsr w9,w8,#0x18
00ae51cc	strb w9,[x19, #0x4]
00ae51d0	lsr w9,w8,#0x10
00ae51d4	strb w8,[x19, #0x7]
00ae51d8	lsr w8,w8,#0x8
00ae51dc	strb w9,[x19, #0x5]
00ae51e0	strb w8,[x19, #0x6]
00ae51e4	ldr w8,[x20, #0x8]
00ae51e8	lsr w9,w8,#0x18
00ae51ec	strb w9,[x19, #0x8]
00ae51f0	lsr w9,w8,#0x10
00ae51f4	strb w8,[x19, #0xb]
00ae51f8	lsr w8,w8,#0x8
00ae51fc	strb w9,[x19, #0x9]
00ae5200	strb w8,[x19, #0xa]
00ae5204	ldr w8,[x20, #0xc]
00ae5208	lsr w9,w8,#0x18
00ae520c	strb w9,[x19, #0xc]
00ae5210	lsr w9,w8,#0x10
00ae5214	strb w8,[x19, #0xf]
00ae5218	lsr w8,w8,#0x8
00ae521c	strb w9,[x19, #0xd]
00ae5220	strb w8,[x19, #0xe]
00ae5224	ldr w8,[x20, #0x10]
00ae5228	lsr w9,w8,#0x18
00ae522c	strb w9,[x19, #0x10]
00ae5230	lsr w9,w8,#0x10
00ae5234	strb w8,[x19, #0x13]
00ae5238	lsr w8,w8,#0x8
00ae523c	strb w9,[x19, #0x11]
00ae5240	strb w8,[x19, #0x12]
00ae5244	ldr w8,[x20, #0x14]
00ae5248	lsr w9,w8,#0x18
00ae524c	strb w9,[x19, #0x14]
00ae5250	lsr w9,w8,#0x10
00ae5254	strb w8,[x19, #0x17]
00ae5258	lsr w8,w8,#0x8
00ae525c	strb w9,[x19, #0x15]
00ae5260	strb w8,[x19, #0x16]
00ae5264	ldr w8,[x20, #0x18]
00ae5268	lsr w9,w8,#0x18
00ae526c	strb w9,[x19, #0x18]
00ae5270	lsr w9,w8,#0x10
00ae5274	strb w8,[x19, #0x1b]
00ae5278	lsr w8,w8,#0x8
00ae527c	strb w9,[x19, #0x19]
00ae5280	strb w8,[x19, #0x1a]
00ae5284	ldr w8,[x20, #0x1c]
00ae5288	lsr w9,w8,#0x18
00ae528c	strb w9,[x19, #0x1c]
00ae5290	lsr w9,w8,#0x10
00ae5294	strb w9,[x19, #0x1d]
00ae5298	lsr w9,w8,#0x8
00ae529c	strb w9,[x19, #0x1e]
00ae52a0	strb w8,[x19, #0x1f]
00ae52a4	ldp x29,x30,[sp, #0x20]
00ae52a8	ldp x20,x19,[sp, #0x10]
00ae52ac	ldr x21,[sp], #0x30
00ae52b0	ret
