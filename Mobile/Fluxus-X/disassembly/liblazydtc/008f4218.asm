; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>> @ 008f4218
008f4218	stp x28,x27,[sp, #-0x60]!
008f421c	stp x26,x25,[sp, #0x10]
008f4220	stp x24,x23,[sp, #0x20]
008f4224	stp x22,x21,[sp, #0x30]
008f4228	stp x20,x19,[sp, #0x40]
008f422c	stp x29,x30,[sp, #0x50]
008f4230	add x29,sp,#0x50
008f4234	ldr x8,[x0, #0x10]
008f4238	mov x20,x2
008f423c	mov x19,x0
008f4240	mov x21,x1
008f4244	cbz x8,0x008f4458
008f4248	mov x24,x19
008f424c	ldr x8,[x19]
008f4250	ldr x9,[x24, #0x8]!
008f4254	str x24,[x19]
008f4258	str xzr,[x9, #0x10]
008f425c	str xzr,[x19, #0x10]
008f4260	str xzr,[x24]
008f4264	ldr x9,[x8, #0x8]
008f4268	cmp x9,#0x0
008f426c	csel x25,x8,x9,eq
008f4270	cbnz x25,0x008f4280
008f4274	b 0x008f4458
008f4278	mov x21,x9
008f427c	cbz x25,0x008f4458
008f4280	cmp x21,x20
008f4284	mov x22,x25
008f4288	b.eq 0x008f44d0
008f428c	cmp x22,x21
008f4290	b.eq 0x008f42dc
008f4294	ldrb w9,[x21, #0x20]
008f4298	ldp x10,x11,[x21, #0x28]
008f429c	add x8,x21,#0x20
008f42a0	add x0,x22,#0x20
008f42a4	tst w9,#0x1
008f42a8	lsr w12,w9,#0x1
008f42ac	csinc x1,x11,x8,ne
008f42b0	csel x2,x12,x10,eq
008f42b4	bl 0x00c31090
008f42b8	ldrb w8,[x21, #0x38]
008f42bc	ldp x9,x10,[x21, #0x40]
008f42c0	add x11,x21,#0x39
008f42c4	add x0,x22,#0x38
008f42c8	tst w8,#0x1
008f42cc	lsr w12,w8,#0x1
008f42d0	csel x1,x11,x10,eq
008f42d4	csel x2,x12,x9,eq
008f42d8	bl 0x00c31090
008f42dc	ldr x25,[x22, #0x10]
008f42e0	cbz x25,0x008f4330
008f42e4	ldr x8,[x25]
008f42e8	cmp x8,x22
008f42ec	b.eq 0x008f4310
008f42f0	str xzr,[x25, #0x8]
008f42f4	cbz x8,0x008f4330
008f42f8	mov x25,x8
008f42fc	ldr x8,[x8]
008f4300	cbnz x8,0x008f42f8
008f4304	ldr x8,[x25, #0x8]
008f4308	cbnz x8,0x008f42f8
008f430c	b 0x008f4330
008f4310	ldr x8,[x25, #0x8]
008f4314	str xzr,[x25]
008f4318	cbz x8,0x008f4330
008f431c	mov x25,x8
008f4320	ldr x8,[x8]
008f4324	cbnz x8,0x008f431c
008f4328	ldr x8,[x25, #0x8]
008f432c	cbnz x8,0x008f431c
008f4330	ldr x26,[x24]
008f4334	cbz x26,0x008f43c0
008f4338	ldrb w8,[x22, #0x20]
008f433c	ldp x10,x11,[x22, #0x28]
008f4340	add x9,x22,#0x20
008f4344	lsr w12,w8,#0x1
008f4348	tst w8,#0x1
008f434c	csel x27,x12,x10,eq
008f4350	csinc x23,x11,x9,ne
008f4354	b 0x008f435c
008f4358	mov x26,x8
008f435c	mov x8,x26
008f4360	ldrb w9,[x8, #0x20]!
008f4364	ldr x10,[x8, #0x8]
008f4368	lsr w11,w9,#0x1
008f436c	tst w9,#0x1
008f4370	csel x28,x11,x10,eq
008f4374	cmp x28,x27
008f4378	csel x2,x28,x27,cc
008f437c	cbz x2,0x008f43a8
008f4380	ldr x10,[x26, #0x30]
008f4384	tst w9,#0x1
008f4388	mov x0,x23
008f438c	csinc x1,x10,x8,ne
008f4390	bl 0x00c300b0
008f4394	cbz w0,0x008f43a8
008f4398	tbnz w0,#0x1f,0x008f43b0
008f439c	ldr x8,[x26, #0x8]
008f43a0	cbnz x8,0x008f4358
008f43a4	b 0x008f43cc
008f43a8	cmp x27,x28
008f43ac	b.cs 0x008f439c
008f43b0	ldr x8,[x26]
008f43b4	cbnz x8,0x008f4358
008f43b8	mov x8,x26
008f43bc	b 0x008f43d0
008f43c0	mov x26,x24
008f43c4	mov x8,x24
008f43c8	b 0x008f43d0
008f43cc	add x8,x26,#0x8
008f43d0	stp xzr,xzr,[x22]
008f43d4	str x26,[x22, #0x10]
008f43d8	str x22,[x8]
008f43dc	ldr x9,[x19]
008f43e0	ldr x9,[x9]
008f43e4	cbz x9,0x008f43f0
008f43e8	str x9,[x19]
008f43ec	ldr x22,[x8]
008f43f0	ldr x0,[x19, #0x8]
008f43f4	mov x1,x22
008f43f8	bl 0x00c30c90
008f43fc	ldr x8,[x19, #0x10]
008f4400	add x8,x8,#0x1
008f4404	str x8,[x19, #0x10]
008f4408	ldr x8,[x21, #0x8]
008f440c	cbz x8,0x008f4420
008f4410	mov x21,x8
008f4414	ldr x8,[x8]
008f4418	cbnz x8,0x008f4410
008f441c	b 0x008f444c
008f4420	mov x8,x21
008f4424	ldr x9,[x8, #0x10]!
008f4428	ldr x10,[x9]
008f442c	cmp x10,x21
008f4430	b.eq 0x008f4278
008f4434	ldr x9,[x8]
008f4438	mov x8,x9
008f443c	ldr x21,[x8, #0x10]!
008f4440	ldr x10,[x21]
008f4444	cmp x10,x9
008f4448	b.ne 0x008f4434
008f444c	cbnz x25,0x008f4280
008f4450	b 0x008f4458
008f4454	mov x21,x9
008f4458	cmp x21,x20
008f445c	b.eq 0x008f44b4
008f4460	add x1,x21,#0x20
008f4464	mov x0,x19
008f4468	bl 0x00c316b0
008f446c	ldr x8,[x21, #0x8]
008f4470	cbz x8,0x008f4484
008f4474	mov x21,x8
008f4478	ldr x8,[x8]
008f447c	cbnz x8,0x008f4474
008f4480	b 0x008f4458
008f4484	mov x8,x21
008f4488	ldr x9,[x8, #0x10]!
008f448c	ldr x10,[x9]
008f4490	cmp x10,x21
008f4494	b.eq 0x008f4454
008f4498	ldr x9,[x8]
008f449c	mov x8,x9
008f44a0	ldr x21,[x8, #0x10]!
008f44a4	ldr x10,[x21]
008f44a8	cmp x10,x9
008f44ac	b.ne 0x008f4498
008f44b0	b 0x008f4458
008f44b4	ldp x29,x30,[sp, #0x50]
008f44b8	ldp x20,x19,[sp, #0x40]
008f44bc	ldp x22,x21,[sp, #0x30]
008f44c0	ldp x24,x23,[sp, #0x20]
008f44c4	ldp x26,x25,[sp, #0x10]
008f44c8	ldp x28,x27,[sp], #0x60
008f44cc	ret
008f44d0	ldr x8,[x22, #0x10]
008f44d4	cbz x8,0x008f44e4
008f44d8	mov x22,x8
008f44dc	ldr x8,[x8, #0x10]
008f44e0	cbnz x8,0x008f44d8
008f44e4	mov x0,x19
008f44e8	mov x1,x22
008f44ec	ldp x29,x30,[sp, #0x50]
008f44f0	ldp x20,x19,[sp, #0x40]
008f44f4	ldp x22,x21,[sp, #0x30]
008f44f8	ldp x24,x23,[sp, #0x20]
008f44fc	ldp x26,x25,[sp, #0x10]
008f4500	ldp x28,x27,[sp], #0x60
008f4504	b 0x008267e4
