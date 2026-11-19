; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__move_assign @ 008f54b0
008f54b0	stp x22,x21,[sp, #-0x30]!
008f54b4	stp x20,x19,[sp, #0x10]
008f54b8	stp x29,x30,[sp, #0x20]
008f54bc	add x29,sp,#0x20
008f54c0	ldr x8,[x0, #0x18]
008f54c4	mov x20,x0
008f54c8	mov x19,x1
008f54cc	cbz x8,0x008f5524
008f54d0	ldr x21,[x20, #0x10]
008f54d4	cbz x21,0x008f54fc
008f54d8	ldrb w8,[x21, #0x10]
008f54dc	ldr x22,[x21]
008f54e0	tbz w8,#0x0,0x008f54ec
008f54e4	ldr x0,[x21, #0x20]
008f54e8	bl 0x00c301d0
008f54ec	mov x0,x21
008f54f0	bl 0x00c301d0
008f54f4	mov x21,x22
008f54f8	cbnz x22,0x008f54d8
008f54fc	ldr x8,[x20, #0x8]
008f5500	str xzr,[x20, #0x10]
008f5504	cbz x8,0x008f5520
008f5508	mov x9,xzr
008f550c	ldr x10,[x20]
008f5510	str xzr,[x10, x9, LSL #0x3]
008f5514	add x9,x9,#0x1
008f5518	cmp x8,x9
008f551c	b.ne 0x008f550c
008f5520	str xzr,[x20, #0x18]
008f5524	ldr x8,[x19]
008f5528	str xzr,[x19]
008f552c	ldr x0,[x20]
008f5530	str x8,[x20]
008f5534	cbz x0,0x008f553c
008f5538	bl 0x00c301d0
008f553c	ldr x8,[x19, #0x8]
008f5540	str x8,[x20, #0x8]
008f5544	ldr x9,[x19, #0x18]
008f5548	str xzr,[x19, #0x8]
008f554c	str x9,[x20, #0x18]
008f5550	ldr w8,[x19, #0x20]
008f5554	str w8,[x20, #0x20]
008f5558	ldr x8,[x19, #0x10]!
008f555c	str x8,[x20, #0x10]
008f5560	cbz x9,0x008f55a0
008f5564	ldr x10,[x20, #0x8]
008f5568	ldr x8,[x8, #0x8]
008f556c	add x9,x20,#0x10
008f5570	sub x11,x10,#0x1
008f5574	tst x11,x10
008f5578	b.eq 0x008f5590
008f557c	cmp x8,x10
008f5580	b.cc 0x008f5594
008f5584	udiv x11,x8,x10
008f5588	msub x8,x11,x10,x8
008f558c	b 0x008f5594
008f5590	and x8,x11,x8
008f5594	ldr x10,[x20]
008f5598	str x9,[x10, x8, LSL #0x3]
008f559c	stp xzr,xzr,[x19]
008f55a0	ldp x29,x30,[sp, #0x20]
008f55a4	ldp x20,x19,[sp, #0x10]
008f55a8	ldp x22,x21,[sp], #0x30
008f55ac	ret
