; std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*> @ 008e6410
008e6410	cmp x1,x0
008e6414	cset w8,eq
008e6418	strb w8,[x1, #0x18]
008e641c	b.eq 0x008e6480
008e6420	mov w11,#0x1
008e6424	ldr x9,[x1, #0x10]
008e6428	mov x10,x9
008e642c	ldrb w8,[x10, #0x18]!
008e6430	cbnz w8,0x008e6480
008e6434	ldr x8,[x9, #0x10]
008e6438	ldr x12,[x8]
008e643c	cmp x12,x9
008e6440	b.eq 0x008e6454
008e6444	cbz x12,0x008e6484
008e6448	ldrb w13,[x12, #0x18]!
008e644c	cbz w13,0x008e6464
008e6450	b 0x008e6484
008e6454	ldr x12,[x8, #0x8]
008e6458	cbz x12,0x008e651c
008e645c	ldrb w13,[x12, #0x18]!
008e6460	cbnz w13,0x008e651c
008e6464	cmp x8,x0
008e6468	cset w9,eq
008e646c	mov x1,x8
008e6470	strb w11,[x10]
008e6474	strb w9,[x8, #0x18]
008e6478	strb w11,[x12]
008e647c	b.ne 0x008e6424
008e6480	ret
008e6484	ldr x11,[x9]
008e6488	cmp x11,x1
008e648c	b.ne 0x008e64d0
008e6490	ldr x10,[x1, #0x8]
008e6494	str x10,[x9]
008e6498	cbz x10,0x008e64a4
008e649c	str x9,[x10, #0x10]
008e64a0	ldr x8,[x9, #0x10]
008e64a4	str x8,[x1, #0x10]
008e64a8	ldr x8,[x9, #0x10]
008e64ac	mov w11,#0x8
008e64b0	ldr x10,[x8]
008e64b4	cmp x10,x9
008e64b8	csel x10,xzr,x11,eq
008e64bc	str x1,[x8, x10#0x0]
008e64c0	str x9,[x1, #0x8]
008e64c4	str x1,[x9, #0x10]
008e64c8	ldr x8,[x1, #0x10]
008e64cc	add x10,x1,#0x18
008e64d0	mov w9,#0x1
008e64d4	strb w9,[x10]
008e64d8	ldr x9,[x8, #0x8]
008e64dc	strb wzr,[x8, #0x18]
008e64e0	ldr x10,[x9]
008e64e4	str x10,[x8, #0x8]
008e64e8	cbz x10,0x008e64f0
008e64ec	str x8,[x10, #0x10]
008e64f0	ldr x10,[x8, #0x10]
008e64f4	mov w12,#0x8
008e64f8	str x10,[x9, #0x10]
008e64fc	ldr x10,[x8, #0x10]
008e6500	ldr x11,[x10]
008e6504	cmp x11,x8
008e6508	csel x11,xzr,x12,eq
008e650c	str x9,[x10, x11#0x0]
008e6510	str x8,[x9]
008e6514	str x9,[x8, #0x10]
008e6518	ret
008e651c	ldr x11,[x9]
008e6520	cmp x11,x1
008e6524	b.eq 0x008e656c
008e6528	ldr x10,[x9, #0x8]
008e652c	ldr x11,[x10]
008e6530	str x11,[x9, #0x8]
008e6534	cbz x11,0x008e6540
008e6538	str x9,[x11, #0x10]
008e653c	ldr x8,[x9, #0x10]
008e6540	str x8,[x10, #0x10]
008e6544	ldr x8,[x9, #0x10]
008e6548	mov w12,#0x8
008e654c	ldr x11,[x8]
008e6550	cmp x11,x9
008e6554	csel x11,xzr,x12,eq
008e6558	str x10,[x8, x11#0x0]
008e655c	str x9,[x10]
008e6560	str x10,[x9, #0x10]
008e6564	ldr x8,[x10, #0x10]
008e6568	add x10,x10,#0x18
008e656c	mov w9,#0x1
008e6570	strb w9,[x10]
008e6574	ldr x9,[x8]
008e6578	strb wzr,[x8, #0x18]
008e657c	ldr x10,[x9, #0x8]
008e6580	str x10,[x8]
008e6584	cbz x10,0x008e658c
008e6588	str x8,[x10, #0x10]
008e658c	ldr x10,[x8, #0x10]
008e6590	mov w12,#0x8
008e6594	str x10,[x9, #0x10]
008e6598	ldr x10,[x8, #0x10]
008e659c	ldr x11,[x10]
008e65a0	cmp x11,x8
008e65a4	csel x11,xzr,x12,eq
008e65a8	str x9,[x10, x11#0x0]
008e65ac	str x8,[x9, #0x8]
008e65b0	str x9,[x8, #0x10]
008e65b4	ret
