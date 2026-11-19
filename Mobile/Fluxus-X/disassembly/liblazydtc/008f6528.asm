; std::__ndk1::__split_buffer<std::__ndk1::function<void()>*,std::__ndk1::allocator<std::__ndk1::function<void()>*>&>::push_back @ 008f6528
008f6528	stp x24,x23,[sp, #-0x40]!
008f652c	stp x22,x21,[sp, #0x10]
008f6530	stp x20,x19,[sp, #0x20]
008f6534	stp x29,x30,[sp, #0x30]
008f6538	add x29,sp,#0x30
008f653c	ldp x23,x8,[x0, #0x10]
008f6540	mov x19,x0
008f6544	mov x20,x1
008f6548	cmp x23,x8
008f654c	b.ne 0x008f66b0
008f6550	ldp x22,x21,[x19]
008f6554	subs x9,x21,x22
008f6558	b.ls 0x008f65a0
008f655c	asr x8,x9,#0x3
008f6560	add x9,x8,#0x1
008f6564	add x10,x8,#0x2
008f6568	cmp x9,#0x0
008f656c	csinc x8,x10,x8,lt
008f6570	subs x2,x23,x21
008f6574	asr x8,x8,#0x1
008f6578	sub x22,x21,x8, LSL #0x3
008f657c	asr x23,x2,#0x3
008f6580	b.eq 0x008f65c4
008f6584	mov x0,x22
008f6588	mov x1,x21
008f658c	neg x24,x8
008f6590	bl 0x00c2ff60
008f6594	ldr x8,[x19, #0x8]
008f6598	add x8,x8,x24, LSL #0x3
008f659c	b 0x008f65c8
008f65a0	subs x8,x8,x22
008f65a4	asr x8,x8,#0x2
008f65a8	csinc x24,x8,xzr,ne
008f65ac	cbz x24,0x008f65d4
008f65b0	lsr x8,x24,#0x3d
008f65b4	cbnz x8,0x008f66d8
008f65b8	lsl x0,x24,#0x3
008f65bc	bl 0x00c2fed0
008f65c0	b 0x008f65d8
008f65c4	mov x8,x22
008f65c8	add x23,x22,x23, LSL #0x3
008f65cc	stp x8,x23,[x19, #0x8]
008f65d0	b 0x008f66b0
008f65d4	mov x0,xzr
008f65d8	lsr x13,x24,#0x2
008f65dc	cmp x21,x23
008f65e0	add x9,x0,x13, LSL #0x3
008f65e4	add x8,x0,x24, LSL #0x3
008f65e8	b.eq 0x008f6614
008f65ec	sub x10,x23,#0x8
008f65f0	sub x10,x10,x21
008f65f4	lsr x14,x10,#0x3
008f65f8	add x11,x13,x14
008f65fc	add x12,x14,#0x1
008f6600	cmp x12,#0x4
008f6604	add x10,x11,#0x1
008f6608	b.cs 0x008f661c
008f660c	mov x11,x9
008f6610	b 0x008f6680
008f6614	mov x23,x9
008f6618	b 0x008f6698
008f661c	add x14,x21,x14, LSL #0x3
008f6620	add x14,x14,#0x8
008f6624	cmp x9,x14
008f6628	b.cs 0x008f6640
008f662c	add x11,x0,x11, LSL #0x3
008f6630	add x11,x11,#0x8
008f6634	cmp x21,x11
008f6638	mov x11,x9
008f663c	b.cc 0x008f6680
008f6640	and x14,x12,#0x3ffffffffffffffc
008f6644	add x13,x0,x13, LSL #0x3
008f6648	lsl x16,x14,#0x3
008f664c	add x15,x21,#0x10
008f6650	add x11,x9,x16
008f6654	add x21,x21,x16
008f6658	add x13,x13,#0x10
008f665c	mov x16,x14
008f6660	ldp q0,q1,[x15, #-0x10]
008f6664	add x15,x15,#0x20
008f6668	subs x16,x16,#0x4
008f666c	stp q0,q1,[x13, #-0x10]
008f6670	add x13,x13,#0x20
008f6674	b.ne 0x008f6660
008f6678	cmp x12,x14
008f667c	b.eq 0x008f6690
008f6680	ldr x12,[x21], #0x8
008f6684	cmp x23,x21
008f6688	str x12,[x11], #0x8
008f668c	b.ne 0x008f6680
008f6690	ldr x22,[x19]
008f6694	add x23,x0,x10, LSL #0x3
008f6698	stp x0,x9,[x19]
008f669c	stp x23,x8,[x19, #0x10]
008f66a0	cbz x22,0x008f66b0
008f66a4	mov x0,x22
008f66a8	bl 0x00c301d0
008f66ac	ldr x23,[x19, #0x10]
008f66b0	ldr x8,[x20]
008f66b4	str x8,[x23]
008f66b8	ldr x8,[x19, #0x10]
008f66bc	add x8,x8,#0x8
008f66c0	str x8,[x19, #0x10]
008f66c4	ldp x29,x30,[sp, #0x30]
008f66c8	ldp x20,x19,[sp, #0x20]
008f66cc	ldp x22,x21,[sp, #0x10]
008f66d0	ldp x24,x23,[sp], #0x40
008f66d4	ret
008f66d8	mov w0,#0x10
008f66dc	bl 0x00c30000
008f66e0	mov x19,x0
008f66e4	adrp x1,0x2ad000
008f66e8	add x1,x1,#0x51
008f66ec	bl 0x00c30040
008f66f0	adrp x8,0xcb4000
008f66f4	ldr x8,[x8, #0x980]
008f66f8	adrp x1,0xcb4000
008f66fc	adrp x2,0xcb4000
008f6700	mov x0,x19
008f6704	add x8,x8,#0x10
008f6708	str x8,[x19]
008f670c	ldr x1,[x1, #0x970]
008f6710	ldr x2,[x2, #0x978]
008f6714	bl 0x00c30020
