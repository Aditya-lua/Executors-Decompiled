; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__node_insert_multi @ 008f5060
008f5060	sub sp,sp,#0x80
008f5064	stp x28,x27,[sp, #0x20]
008f5068	stp x26,x25,[sp, #0x30]
008f506c	stp x24,x23,[sp, #0x40]
008f5070	stp x22,x21,[sp, #0x50]
008f5074	stp x20,x19,[sp, #0x60]
008f5078	stp x29,x30,[sp, #0x70]
008f507c	add x29,sp,#0x70
008f5080	mrs x22,tpidr_el0
008f5084	ldr x8,[x22, #0x28]
008f5088	add x12,x1,#0x11
008f508c	mov x19,x1
008f5090	mov x20,x0
008f5094	str x8,[sp, #0x18]
008f5098	ldrb w8,[x1, #0x10]
008f509c	ldp x9,x10,[x1, #0x18]
008f50a0	str x12,[sp, #0x8]
008f50a4	tst w8,#0x1
008f50a8	lsr w11,w8,#0x1
008f50ac	csel x1,x12,x10,eq
008f50b0	csel x2,x11,x9,eq
008f50b4	add x0,sp,#0x10
008f50b8	bl 0x00c30d50
008f50bc	str x0,[x19, #0x8]
008f50c0	ldr x8,[x20, #0x18]
008f50c4	ldr x24,[x20, #0x8]
008f50c8	ldr s0,[x20, #0x20]
008f50cc	mov x21,x0
008f50d0	add x8,x8,#0x1
008f50d4	ucvtf s1,x8
008f50d8	cbz x24,0x008f50ec
008f50dc	ucvtf s2,x24
008f50e0	fmul s2,s0,s2
008f50e4	fcmp s2,s1
008f50e8	b.pl 0x008f5130
008f50ec	cmp x24,#0x3
008f50f0	lsl x8,x24,#0x1
008f50f4	b.cc 0x008f5108
008f50f8	sub x9,x24,#0x1
008f50fc	tst x9,x24
008f5100	cset w9,ne
008f5104	b 0x008f510c
008f5108	mov w9,#0x1
008f510c	fdiv s0,s1,s0
008f5110	orr x8,x9,x8
008f5114	fcvtpu x9,s0
008f5118	cmp x8,x9
008f511c	csel x1,x9,x8,cc
008f5120	mov x0,x20
008f5124	bl 0x00c30d00
008f5128	ldr x24,[x20, #0x8]
008f512c	ldr x21,[x19, #0x8]
008f5130	sub x25,x24,#0x1
008f5134	ands x27,x25,x24
008f5138	b.eq 0x008f5154
008f513c	cmp x21,x24
008f5140	mov x26,x21
008f5144	b.cc 0x008f5158
008f5148	udiv x8,x21,x24
008f514c	msub x26,x8,x24,x21
008f5150	b 0x008f5158
008f5154	and x26,x25,x21
008f5158	ldr x8,[x20]
008f515c	ldr x28,[x8, x26, LSL #0x3]
008f5160	cbz x28,0x008f52c0
008f5164	mov w8,wzr
008f5168	str x22,[sp]
008f516c	b 0x008f527c
008f5170	mov w23,w8
008f5174	ldr x8,[x28, #0x8]
008f5178	cbz x27,0x008f519c
008f517c	cmp x8,x24
008f5180	mov x9,x8
008f5184	b.cc 0x008f51a0
008f5188	udiv x9,x8,x24
008f518c	msub x9,x9,x24,x8
008f5190	cmp x9,x26
008f5194	b.eq 0x008f51a8
008f5198	b 0x008f5288
008f519c	and x9,x8,x25
008f51a0	cmp x9,x26
008f51a4	b.ne 0x008f5288
008f51a8	cmp x8,x21
008f51ac	mov w9,wzr
008f51b0	b.ne 0x008f524c
008f51b4	mov x8,x28
008f51b8	ldrb w10,[x8, #0x10]!
008f51bc	ldrb w12,[x19, #0x10]
008f51c0	ldr x9,[x19, #0x18]
008f51c4	ldr x13,[x8, #0x8]
008f51c8	lsr w11,w10,#0x1
008f51cc	tst w10,#0x1
008f51d0	lsr w14,w12,#0x1
008f51d4	csel x2,x11,x13,eq
008f51d8	tst w12,#0x1
008f51dc	csel x9,x14,x9,eq
008f51e0	cmp x2,x9
008f51e4	mov w9,wzr
008f51e8	b.ne 0x008f524c
008f51ec	ldr x9,[x28, #0x20]
008f51f0	tst w10,#0x1
008f51f4	ldr x13,[x19, #0x20]
008f51f8	csinc x0,x9,x8,ne
008f51fc	ldr x9,[sp, #0x8]
008f5200	tst w12,#0x1
008f5204	csel x1,x9,x13,eq
008f5208	tbnz w10,#0x0,0x008f523c
008f520c	cbz x2,0x008f5260
008f5210	add x8,x8,#0x1
008f5214	neg x9,x11
008f5218	ldrb w10,[x8]
008f521c	ldrb w11,[x1]
008f5220	cmp w10,w11
008f5224	b.ne 0x008f5270
008f5228	add x8,x8,#0x1
008f522c	adds x9,x9,#0x1
008f5230	add x1,x1,#0x1
008f5234	b.ne 0x008f5218
008f5238	b 0x008f5260
008f523c	cbz x2,0x008f5260
008f5240	bl 0x00c300b0
008f5244	cmp w0,#0x0
008f5248	cset w9,eq
008f524c	orr w8,w23,w9
008f5250	tbnz w9,#0x0,0x008f527c
008f5254	eor w9,w23,#0x1
008f5258	tbnz w9,#0x0,0x008f527c
008f525c	b 0x008f5288
008f5260	mov w9,#0x1
008f5264	orr w8,w23,w9
008f5268	tbz w9,#0x0,0x008f5254
008f526c	b 0x008f527c
008f5270	mov w9,wzr
008f5274	orr w8,w23,w9
008f5278	tbz w9,#0x0,0x008f5254
008f527c	mov x22,x28
008f5280	ldr x28,[x28]
008f5284	cbnz x28,0x008f5170
008f5288	str x28,[x19]
008f528c	str x19,[x22]
008f5290	ldr x8,[x19]
008f5294	ldr x22,[sp]
008f5298	cbz x8,0x008f5318
008f529c	ldr x8,[x8, #0x8]
008f52a0	cbz x27,0x008f52fc
008f52a4	cmp x8,x24
008f52a8	b.cc 0x008f52b4
008f52ac	udiv x9,x8,x24
008f52b0	msub x8,x9,x24,x8
008f52b4	cmp x8,x26
008f52b8	b.ne 0x008f5310
008f52bc	b 0x008f5318
008f52c0	mov x8,x20
008f52c4	ldr x9,[x8, #0x10]!
008f52c8	str x9,[x19]
008f52cc	str x19,[x8]
008f52d0	ldr x9,[x20]
008f52d4	str x8,[x9, x26, LSL #0x3]
008f52d8	ldr x8,[x19]
008f52dc	cbz x8,0x008f5318
008f52e0	ldr x8,[x8, #0x8]
008f52e4	cbz x27,0x008f530c
008f52e8	cmp x8,x24
008f52ec	b.cc 0x008f5310
008f52f0	udiv x9,x8,x24
008f52f4	msub x8,x9,x24,x8
008f52f8	b 0x008f5310
008f52fc	and x8,x8,x25
008f5300	cmp x8,x26
008f5304	b.ne 0x008f5310
008f5308	b 0x008f5318
008f530c	and x8,x8,x25
008f5310	ldr x9,[x20]
008f5314	str x19,[x9, x8, LSL #0x3]
008f5318	ldr x8,[x20, #0x18]
008f531c	add x8,x8,#0x1
008f5320	str x8,[x20, #0x18]
008f5324	ldr x8,[x22, #0x28]
008f5328	ldr x9,[sp, #0x18]
008f532c	cmp x8,x9
008f5330	b.ne 0x008f5358
008f5334	mov x0,x19
008f5338	ldp x29,x30,[sp, #0x70]
008f533c	ldp x20,x19,[sp, #0x60]
008f5340	ldp x22,x21,[sp, #0x50]
008f5344	ldp x24,x23,[sp, #0x40]
008f5348	ldp x26,x25,[sp, #0x30]
008f534c	ldp x28,x27,[sp, #0x20]
008f5350	add sp,sp,#0x80
008f5354	ret
008f5358	bl 0x00c2fec0
