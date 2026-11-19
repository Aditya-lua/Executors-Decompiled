; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::replace @ 00bc5148
00bc5148	paciasp
00bc514c	stp x29,x30,[sp, #-0x60]!
00bc5150	stp x28,x27,[sp, #0x10]
00bc5154	stp x26,x25,[sp, #0x20]
00bc5158	stp x24,x23,[sp, #0x30]
00bc515c	stp x22,x21,[sp, #0x40]
00bc5160	stp x20,x19,[sp, #0x50]
00bc5164	mov x29,sp
00bc5168	ldrb w9,[x0]
00bc516c	ldr x8,[x0, #0x8]
00bc5170	lsr x10,x9,#0x1
00bc5174	tst w9,#0x1
00bc5178	csel x20,x10,x8,eq
00bc517c	subs x8,x20,x1
00bc5180	b.cc 0x00bc5318
00bc5184	ldr x10,[x0]
00bc5188	cmp x8,x2
00bc518c	mov x23,x1
00bc5190	csel x24,x8,x2,cc
00bc5194	tst w9,#0x1
00bc5198	mov w9,#0x4
00bc519c	and x11,x10,#-0x2
00bc51a0	mov x21,x4
00bc51a4	mov x22,x3
00bc51a8	sub x11,x11,#0x1
00bc51ac	mov x19,x0
00bc51b0	csel x1,x9,x11,eq
00bc51b4	sub x9,x24,x20
00bc51b8	add x9,x9,x1
00bc51bc	cmp x9,x4
00bc51c0	b.cs 0x00bc51f0
00bc51c4	add x8,x20,x21
00bc51c8	mov x0,x19
00bc51cc	mov x3,x20
00bc51d0	sub x8,x8,x1
00bc51d4	mov x4,x23
00bc51d8	mov x5,x24
00bc51dc	sub x2,x8,x24
00bc51e0	mov x6,x21
00bc51e4	mov x7,x22
00bc51e8	bl 0x00c43d40
00bc51ec	b 0x00bc52f4
00bc51f0	ldr x9,[x19, #0x10]
00bc51f4	add x11,x19,#0x4
00bc51f8	tst x10,#0x1
00bc51fc	csel x26,x11,x9,eq
00bc5200	cmp x21,x24
00bc5204	b.ne 0x00bc5210
00bc5208	mov x24,x21
00bc520c	b 0x00bc52c4
00bc5210	cmp x8,x2
00bc5214	b.ls 0x00bc52c4
00bc5218	add x25,x26,x23, LSL #0x2
00bc521c	subs x28,x21,x24
00bc5220	sub x27,x8,x24
00bc5224	b.cs 0x00bc5260
00bc5228	cbz x21,0x00bc523c
00bc522c	lsl x2,x21,#0x2
00bc5230	mov x0,x25
00bc5234	mov x1,x22
00bc5238	bl 0x00c2ff60
00bc523c	add x0,x25,x21, LSL #0x2
00bc5240	add x1,x25,x24, LSL #0x2
00bc5244	lsl x2,x27,#0x2
00bc5248	bl 0x00c2ff60
00bc524c	ldrb w9,[x19]
00bc5250	add x8,x28,x20
00bc5254	tbz w9,#0x0,0x00bc52e8
00bc5258	str x8,[x19, #0x8]
00bc525c	b 0x00bc52f0
00bc5260	add x8,x26,x20, LSL #0x2
00bc5264	cmp x22,x8
00bc5268	b.cs 0x00bc52b0
00bc526c	add x8,x25,#0x4
00bc5270	cmp x22,x8
00bc5274	b.cc 0x00bc52b0
00bc5278	add x8,x25,x24, LSL #0x2
00bc527c	cmp x8,x22
00bc5280	b.ls 0x00bc52ac
00bc5284	cbz x2,0x00bc5298
00bc5288	lsl x2,x24,#0x2
00bc528c	mov x0,x25
00bc5290	mov x1,x22
00bc5294	bl 0x00c2ff60
00bc5298	add x22,x22,x21, LSL #0x2
00bc529c	add x23,x24,x23
00bc52a0	mov x21,x28
00bc52a4	mov x24,xzr
00bc52a8	b 0x00bc52b0
00bc52ac	add x22,x22,x28, LSL #0x2
00bc52b0	add x8,x26,x23, LSL #0x2
00bc52b4	lsl x2,x27,#0x2
00bc52b8	add x0,x8,x21, LSL #0x2
00bc52bc	add x1,x8,x24, LSL #0x2
00bc52c0	bl 0x00c2ff60
00bc52c4	cbz x21,0x00bc52d8
00bc52c8	add x0,x26,x23, LSL #0x2
00bc52cc	lsl x2,x21,#0x2
00bc52d0	mov x1,x22
00bc52d4	bl 0x00c2ff60
00bc52d8	ldrb w9,[x19]
00bc52dc	sub x8,x21,x24
00bc52e0	add x8,x8,x20
00bc52e4	tbnz w9,#0x0,0x00bc5258
00bc52e8	lsl w9,w8,#0x1
00bc52ec	strb w9,[x19]
00bc52f0	str wzr,[x26, x8, LSL #0x2]
00bc52f4	mov x0,x19
00bc52f8	ldp x20,x19,[sp, #0x50]
00bc52fc	ldp x22,x21,[sp, #0x40]
00bc5300	ldp x24,x23,[sp, #0x30]
00bc5304	ldp x26,x25,[sp, #0x20]
00bc5308	ldp x28,x27,[sp, #0x10]
00bc530c	ldp x29,x30,[sp], #0x60
00bc5310	autiasp
00bc5314	ret
00bc5318	bl 0x00bc531c
