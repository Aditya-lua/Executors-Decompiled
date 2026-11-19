; FUN_00a4812c @ 00a4812c
00a4812c	sub sp,sp,#0x140
00a48130	stp x28,x27,[sp, #0xe0]
00a48134	stp x26,x25,[sp, #0xf0]
00a48138	stp x24,x23,[sp, #0x100]
00a4813c	stp x22,x21,[sp, #0x110]
00a48140	stp x20,x19,[sp, #0x120]
00a48144	stp x29,x30,[sp, #0x130]
00a48148	str w2,[sp, #0xc]
00a4814c	mov x20,x0
00a48150	ldr x8,[x20, #0x40]!
00a48154	ldp x11,x12,[x0, #0x48]
00a48158	ldp x9,x10,[x0]
00a4815c	ldp x13,x14,[x0, #0x10]
00a48160	orr x23,xzr,#0x1fffffffffffffe
00a48164	ldp x15,x16,[x0, #0x58]
00a48168	add x11,x11,x23
00a4816c	add x12,x12,x23
00a48170	add x8,x8,x23
00a48174	sub x10,x11,x10
00a48178	sub x11,x12,x13
00a4817c	ldp x12,x13,[x0, #0x68]
00a48180	sub x8,x8,x9
00a48184	ldp x9,x17,[x0, #0x20]
00a48188	orr x24,xzr,#0x1fffffffffffffc
00a4818c	add x15,x15,x23
00a48190	sub x14,x15,x14
00a48194	ldr x15,[x0, #0x78]
00a48198	add x16,x16,x24
00a4819c	add x12,x12,x23
00a481a0	sub x9,x16,x9
00a481a4	sub x12,x12,x17
00a481a8	ldp x16,x17,[x0, #0x30]
00a481ac	add x15,x15,x23
00a481b0	add x13,x13,x23
00a481b4	mov x21,x0
00a481b8	sub x15,x15,x17
00a481bc	sub x13,x13,x16
00a481c0	lsr x16,x15,#0x38
00a481c4	and x17,x14,#0xffffffffffffff
00a481c8	and x15,x15,#0xffffffffffffff
00a481cc	add x17,x17,x11, LSR #0x38
00a481d0	and x11,x11,#0xffffffffffffff
00a481d4	add x15,x15,x13, LSR #0x38
00a481d8	and x13,x13,#0xffffffffffffff
00a481dc	add x11,x11,x10, LSR #0x38
00a481e0	and x10,x10,#0xffffffffffffff
00a481e4	add x9,x16,x9
00a481e8	add x13,x13,x12, LSR #0x38
00a481ec	and x12,x12,#0xffffffffffffff
00a481f0	add x10,x10,x8, LSR #0x38
00a481f4	and x8,x8,#0xffffffffffffff
00a481f8	add x12,x12,x9, LSR #0x38
00a481fc	and x9,x9,#0xffffffffffffff
00a48200	add x8,x16,x8
00a48204	add x9,x9,x14, LSR #0x38
00a48208	add x0,sp,#0x90
00a4820c	add x2,sp,#0x50
00a48210	add x29,sp,#0x130
00a48214	mov x22,x1
00a48218	stp x13,x15,[sp, #0x80]
00a4821c	stp x9,x12,[sp, #0x70]
00a48220	stp x11,x17,[sp, #0x60]
00a48224	stp x8,x10,[sp, #0x50]
00a48228	bl 0x00c3a4b0
00a4822c	ldp x9,x10,[x21]
00a48230	ldp x11,x12,[x21, #0x48]
00a48234	ldp x13,x14,[x21, #0x10]
00a48238	ldp x15,x16,[x21, #0x58]
00a4823c	ldr x8,[x20]
00a48240	add x10,x11,x10
00a48244	add x11,x12,x13
00a48248	ldp x12,x13,[x21, #0x30]
00a4824c	add x14,x15,x14
00a48250	ldr x15,[x21, #0x78]
00a48254	ldp x17,x18,[x21, #0x20]
00a48258	add x8,x8,x9
00a4825c	ldp x9,x0,[x21, #0x68]
00a48260	add x13,x15,x13
00a48264	add x16,x16,x17
00a48268	lsr x15,x13,#0x38
00a4826c	add x12,x0,x12
00a48270	and x17,x14,#0xffffffffffffff
00a48274	and x13,x13,#0xffffffffffffff
00a48278	add x9,x9,x18
00a4827c	add x17,x17,x11, LSR #0x38
00a48280	and x11,x11,#0xffffffffffffff
00a48284	add x13,x13,x12, LSR #0x38
00a48288	and x12,x12,#0xffffffffffffff
00a4828c	add x11,x11,x10, LSR #0x38
00a48290	and x10,x10,#0xffffffffffffff
00a48294	add x16,x15,x16
00a48298	add x12,x12,x9, LSR #0x38
00a4829c	and x9,x9,#0xffffffffffffff
00a482a0	add x10,x10,x8, LSR #0x38
00a482a4	and x8,x8,#0xffffffffffffff
00a482a8	stp x12,x13,[sp, #0x80]
00a482ac	add x9,x9,x16, LSR #0x38
00a482b0	and x12,x16,#0xffffffffffffff
00a482b4	add x8,x15,x8
00a482b8	str x9,[sp, #0x78]
00a482bc	add x9,x12,x14, LSR #0x38
00a482c0	add x1,x22,#0x40
00a482c4	add x2,sp,#0x50
00a482c8	mov x0,x20
00a482cc	stp x17,x9,[sp, #0x68]
00a482d0	stp x10,x11,[sp, #0x58]
00a482d4	str x8,[sp, #0x50]
00a482d8	bl 0x00c3a4b0
00a482dc	add x19,x21,#0xc0
00a482e0	add x1,x22,#0x80
00a482e4	mov x0,x21
00a482e8	mov x2,x19
00a482ec	bl 0x00c3a4b0
00a482f0	ldp x9,x12,[sp, #0x90]
00a482f4	ldr x8,[x20]
00a482f8	ldp x11,x10,[x21, #0x48]
00a482fc	ldp x4,x5,[sp, #0xc0]
00a48300	ldp x18,x17,[x21, #0x68]
00a48304	ldr x2,[x21, #0x78]
00a48308	ldp x14,x16,[sp, #0xa0]
00a4830c	ldp x1,x3,[sp, #0xb0]
00a48310	ldp x15,x13,[x21, #0x58]
00a48314	add x6,x8,x9
00a48318	add x7,x11,x12
00a4831c	add x30,x17,x4
00a48320	add x22,x2,x5
00a48324	sub x9,x23,x9
00a48328	sub x12,x23,x12
00a4832c	sub x4,x23,x4
00a48330	sub x5,x23,x5
00a48334	add x25,x10,x14
00a48338	add x27,x13,x1
00a4833c	add x28,x18,x3
00a48340	sub x14,x23,x14
00a48344	sub x1,x24,x1
00a48348	sub x3,x23,x3
00a4834c	add x8,x9,x8
00a48350	lsr x9,x22,#0x38
00a48354	and x22,x22,#0xffffffffffffff
00a48358	add x11,x12,x11
00a4835c	and x12,x30,#0xffffffffffffff
00a48360	add x17,x4,x17
00a48364	and x4,x6,#0xffffffffffffff
00a48368	add x2,x5,x2
00a4836c	add x26,x15,x16
00a48370	sub x16,x23,x16
00a48374	add x10,x14,x10
00a48378	and x14,x28,#0xffffffffffffff
00a4837c	add x13,x1,x13
00a48380	and x1,x25,#0xffffffffffffff
00a48384	add x18,x3,x18
00a48388	add x5,x9,x27
00a4838c	add x22,x22,x30, LSR #0x38
00a48390	add x12,x12,x28, LSR #0x38
00a48394	add x9,x9,x4
00a48398	lsr x4,x2,#0x38
00a4839c	add x15,x16,x15
00a483a0	and x16,x26,#0xffffffffffffff
00a483a4	and x3,x7,#0xffffffffffffff
00a483a8	add x1,x1,x7, LSR #0x38
00a483ac	and x7,x18,#0xffffffffffffff
00a483b0	stp x12,x22,[sp, #0x40]
00a483b4	add x12,x14,x5, LSR #0x38
00a483b8	and x14,x5,#0xffffffffffffff
00a483bc	add x13,x4,x13
00a483c0	add x16,x16,x25, LSR #0x38
00a483c4	add x3,x3,x6, LSR #0x38
00a483c8	and x2,x2,#0xffffffffffffff
00a483cc	and x6,x17,#0xffffffffffffff
00a483d0	and x25,x15,#0xffffffffffffff
00a483d4	and x27,x10,#0xffffffffffffff
00a483d8	and x28,x11,#0xffffffffffffff
00a483dc	and x30,x8,#0xffffffffffffff
00a483e0	str x12,[sp, #0x38]
00a483e4	add x12,x14,x26, LSR #0x38
00a483e8	add x14,x7,x13, LSR #0x38
00a483ec	and x13,x13,#0xffffffffffffff
00a483f0	add x17,x2,x17, LSR #0x38
00a483f4	add x18,x6,x18, LSR #0x38
00a483f8	add x10,x25,x10, LSR #0x38
00a483fc	add x11,x27,x11, LSR #0x38
00a48400	add x8,x28,x8, LSR #0x38
00a48404	add x2,x4,x30
00a48408	str x9,[sp, #0x10]
00a4840c	add x9,x13,x15, LSR #0x38
00a48410	mov x0,x21
00a48414	stp x18,x17,[sp, #0x80]
00a48418	stp x16,x12,[sp, #0x28]
00a4841c	stp x3,x1,[sp, #0x18]
00a48420	stp x9,x14,[sp, #0x70]
00a48424	stp x11,x10,[sp, #0x60]
00a48428	stp x2,x8,[sp, #0x50]
00a4842c	ldr x8,[x0, #0x80]!
00a48430	ldp x11,x12,[x21, #0x88]
00a48434	ldp x15,x16,[x21, #0x98]
00a48438	ldp x1,x2,[x21, #0xa8]
00a4843c	ldr x3,[x21, #0xb8]
00a48440	ldp x13,x14,[x21, #0x10]
00a48444	ldp x4,x5,[x21, #0x30]
00a48448	ldp x9,x10,[x21]
00a4844c	ldp x17,x18,[x21, #0x20]
00a48450	add x6,x8,x23
00a48454	add x7,x11,x23
00a48458	add x22,x12,x23
00a4845c	add x25,x15,x23
00a48460	add x26,x1,x23
00a48464	add x27,x2,x23
00a48468	add x23,x3,x23
00a4846c	add x24,x16,x24
00a48470	add x15,x14,x15
00a48474	add x2,x4,x2
00a48478	add x3,x5,x3
00a4847c	sub x4,x27,x4
00a48480	sub x5,x23,x5
00a48484	add x11,x10,x11
00a48488	add x12,x13,x12
00a4848c	add x16,x17,x16
00a48490	add x1,x18,x1
00a48494	sub x10,x7,x10
00a48498	sub x13,x22,x13
00a4849c	sub x17,x24,x17
00a484a0	sub x18,x26,x18
00a484a4	and x7,x2,#0xffffffffffffff
00a484a8	and x23,x15,#0xffffffffffffff
00a484ac	lsr x27,x5,#0x38
00a484b0	and x5,x5,#0xffffffffffffff
00a484b4	and x28,x4,#0xffffffffffffff
00a484b8	add x8,x9,x8
00a484bc	sub x9,x6,x9
00a484c0	sub x14,x25,x14
00a484c4	lsr x6,x3,#0x38
00a484c8	and x3,x3,#0xffffffffffffff
00a484cc	and x22,x1,#0xffffffffffffff
00a484d0	and x24,x12,#0xffffffffffffff
00a484d4	and x30,x18,#0xffffffffffffff
00a484d8	add x1,x7,x1, LSR #0x38
00a484dc	and x7,x13,#0xffffffffffffff
00a484e0	add x12,x23,x12, LSR #0x38
00a484e4	and x23,x10,#0xffffffffffffff
00a484e8	add x17,x27,x17
00a484ec	add x4,x5,x4, LSR #0x38
00a484f0	add x18,x28,x18, LSR #0x38
00a484f4	and x25,x11,#0xffffffffffffff
00a484f8	add x2,x3,x2, LSR #0x38
00a484fc	and x3,x14,#0xffffffffffffff
00a48500	add x11,x24,x11, LSR #0x38
00a48504	and x24,x9,#0xffffffffffffff
00a48508	add x16,x6,x16
00a4850c	add x10,x7,x10, LSR #0x38
00a48510	add x9,x23,x9, LSR #0x38
00a48514	stp x18,x4,[x21, #0x70]
00a48518	add x4,x30,x17, LSR #0x38
00a4851c	and x17,x17,#0xffffffffffffff
00a48520	and x26,x8,#0xffffffffffffff
00a48524	add x13,x3,x13, LSR #0x38
00a48528	add x3,x27,x24
00a4852c	add x5,x22,x16, LSR #0x38
00a48530	and x16,x16,#0xffffffffffffff
00a48534	stp x9,x10,[x21, #0x48]
00a48538	add x10,x17,x14, LSR #0x38
00a4853c	add x8,x25,x8, LSR #0x38
00a48540	add x6,x6,x26
00a48544	add x9,x16,x15, LSR #0x38
00a48548	str x13,[x21, #0x58]
00a4854c	stp x10,x4,[x21, #0x60]
00a48550	str x3,[x20]
00a48554	stp x1,x2,[sp, #0xc0]
00a48558	add x1,sp,#0x90
00a4855c	mov x2,x20
00a48560	stp x9,x5,[sp, #0xb0]
00a48564	stp x11,x12,[sp, #0xa0]
00a48568	stp x6,x8,[sp, #0x90]
00a4856c	bl 0x00c3a4b0
00a48570	add x2,sp,#0x50
00a48574	mov x0,x21
00a48578	mov x1,x20
00a4857c	bl 0x00c3a4b0
00a48580	add x1,sp,#0x90
00a48584	add x2,sp,#0x10
00a48588	mov x0,x20
00a4858c	bl 0x00c3a4b0
00a48590	ldr w8,[sp, #0xc]
00a48594	cbnz w8,0x00a485a8
00a48598	add x1,sp,#0x50
00a4859c	add x2,sp,#0x10
00a485a0	mov x0,x19
00a485a4	bl 0x00c3a4b0
00a485a8	ldp x29,x30,[sp, #0x130]
00a485ac	ldp x20,x19,[sp, #0x120]
00a485b0	ldp x22,x21,[sp, #0x110]
00a485b4	ldp x24,x23,[sp, #0x100]
00a485b8	ldp x26,x25,[sp, #0xf0]
00a485bc	ldp x28,x27,[sp, #0xe0]
00a485c0	add sp,sp,#0x140
00a485c4	ret
