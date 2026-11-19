; std::__ndk1::__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>>::push_front @ 008f6310
008f6310	str x25,[sp, #-0x50]!
008f6314	stp x24,x23,[sp, #0x10]
008f6318	stp x22,x21,[sp, #0x20]
008f631c	stp x20,x19,[sp, #0x30]
008f6320	stp x29,x30,[sp, #0x40]
008f6324	add x29,sp,#0x40
008f6328	ldp x8,x24,[x0]
008f632c	mov x20,x1
008f6330	mov x19,x0
008f6334	cmp x24,x8
008f6338	mov x21,x24
008f633c	b.eq 0x008f6348
008f6340	mov x22,x21
008f6344	b 0x008f64a8
008f6348	ldp x23,x9,[x19, #0x10]
008f634c	cmp x23,x9
008f6350	b.cs 0x008f6398
008f6354	sub x8,x9,x23
008f6358	asr x8,x8,#0x3
008f635c	add x9,x8,#0x1
008f6360	add x10,x8,#0x2
008f6364	cmp x9,#0x0
008f6368	csinc x8,x10,x8,lt
008f636c	asr x25,x8,#0x1
008f6370	subs x2,x23,x24
008f6374	add x8,x23,x25, LSL #0x3
008f6378	b.eq 0x008f63bc
008f637c	sub x22,x8,x2
008f6380	mov x0,x22
008f6384	mov x1,x21
008f6388	bl 0x00c2ff60
008f638c	ldr x8,[x19, #0x10]
008f6390	add x8,x8,x25, LSL #0x3
008f6394	b 0x008f63c0
008f6398	subs x8,x9,x8
008f639c	asr x8,x8,#0x2
008f63a0	csinc x25,x8,xzr,ne
008f63a4	cbz x25,0x008f63c8
008f63a8	lsr x8,x25,#0x3d
008f63ac	cbnz x8,0x008f64d4
008f63b0	lsl x0,x25,#0x3
008f63b4	bl 0x00c2fed0
008f63b8	b 0x008f63cc
008f63bc	mov x22,x8
008f63c0	stp x22,x8,[x19, #0x8]
008f63c4	b 0x008f64a8
008f63c8	mov x0,xzr
008f63cc	add x8,x25,#0x3
008f63d0	lsr x13,x8,#0x2
008f63d4	cmp x24,x23
008f63d8	add x22,x0,x13, LSL #0x3
008f63dc	add x8,x0,x25, LSL #0x3
008f63e0	b.eq 0x008f640c
008f63e4	sub x9,x23,#0x8
008f63e8	sub x9,x9,x24
008f63ec	lsr x12,x9,#0x3
008f63f0	add x10,x12,x13
008f63f4	add x11,x12,#0x1
008f63f8	cmp x11,#0x4
008f63fc	add x9,x10,#0x1
008f6400	b.cs 0x008f6414
008f6404	mov x10,x22
008f6408	b 0x008f6478
008f640c	mov x9,x22
008f6410	b 0x008f6490
008f6414	add x12,x24,x12, LSL #0x3
008f6418	add x12,x12,#0x8
008f641c	cmp x22,x12
008f6420	b.cs 0x008f6438
008f6424	add x10,x0,x10, LSL #0x3
008f6428	add x10,x10,#0x8
008f642c	cmp x24,x10
008f6430	mov x10,x22
008f6434	b.cc 0x008f6478
008f6438	and x12,x11,#0x3ffffffffffffffc
008f643c	add x13,x0,x13, LSL #0x3
008f6440	lsl x15,x12,#0x3
008f6444	add x14,x24,#0x10
008f6448	add x10,x22,x15
008f644c	add x21,x24,x15
008f6450	add x13,x13,#0x10
008f6454	mov x15,x12
008f6458	ldp q0,q1,[x14, #-0x10]
008f645c	add x14,x14,#0x20
008f6460	subs x15,x15,#0x4
008f6464	stp q0,q1,[x13, #-0x10]
008f6468	add x13,x13,#0x20
008f646c	b.ne 0x008f6458
008f6470	cmp x11,x12
008f6474	b.eq 0x008f6488
008f6478	ldr x11,[x21], #0x8
008f647c	cmp x23,x21
008f6480	str x11,[x10], #0x8
008f6484	b.ne 0x008f6478
008f6488	ldr x21,[x19]
008f648c	add x9,x0,x9, LSL #0x3
008f6490	stp x0,x22,[x19]
008f6494	stp x9,x8,[x19, #0x10]
008f6498	cbz x21,0x008f64a8
008f649c	mov x0,x21
008f64a0	bl 0x00c301d0
008f64a4	ldr x22,[x19, #0x8]
008f64a8	ldr x8,[x20]
008f64ac	stur x8,[x22, #-0x8]
008f64b0	ldr x8,[x19, #0x8]
008f64b4	sub x8,x8,#0x8
008f64b8	str x8,[x19, #0x8]
008f64bc	ldp x29,x30,[sp, #0x40]
008f64c0	ldp x20,x19,[sp, #0x30]
008f64c4	ldp x22,x21,[sp, #0x20]
008f64c8	ldp x24,x23,[sp, #0x10]
008f64cc	ldr x25,[sp], #0x50
008f64d0	ret
008f64d4	mov w0,#0x10
008f64d8	bl 0x00c30000
008f64dc	mov x19,x0
008f64e0	adrp x1,0x2ad000
008f64e4	add x1,x1,#0x51
008f64e8	bl 0x00c30040
008f64ec	adrp x8,0xcb4000
008f64f0	ldr x8,[x8, #0x980]
008f64f4	adrp x1,0xcb4000
008f64f8	adrp x2,0xcb4000
008f64fc	mov x0,x19
008f6500	add x8,x8,#0x10
008f6504	str x8,[x19]
008f6508	ldr x1,[x1, #0x970]
008f650c	ldr x2,[x2, #0x978]
008f6510	bl 0x00c30020
