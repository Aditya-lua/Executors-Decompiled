; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__assign_multi<std::__ndk1::__hash_const_iterator<std::__ndk1::__hash_node<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,void*>*>> @ 008f4eb0
008f4eb0	sub sp,sp,#0x60
008f4eb4	stp x24,x23,[sp, #0x20]
008f4eb8	stp x22,x21,[sp, #0x30]
008f4ebc	stp x20,x19,[sp, #0x40]
008f4ec0	stp x29,x30,[sp, #0x50]
008f4ec4	add x29,sp,#0x50
008f4ec8	mrs x23,tpidr_el0
008f4ecc	ldr x8,[x23, #0x28]
008f4ed0	mov x19,x2
008f4ed4	mov x20,x0
008f4ed8	mov x21,x1
008f4edc	str x8,[sp, #0x18]
008f4ee0	ldr x8,[x0, #0x8]
008f4ee4	cbz x8,0x008f4f8c
008f4ee8	mov x9,xzr
008f4eec	ldr x10,[x20]
008f4ef0	str xzr,[x10, x9, LSL #0x3]
008f4ef4	add x9,x9,#0x1
008f4ef8	cmp x8,x9
008f4efc	b.ne 0x008f4eec
008f4f00	ldr x22,[x20, #0x10]
008f4f04	stp xzr,xzr,[x20, #0x10]
008f4f08	cbz x22,0x008f4f8c
008f4f0c	cmp x21,x19
008f4f10	b.eq 0x008f4f60
008f4f14	cmp x21,x22
008f4f18	b.eq 0x008f4f40
008f4f1c	ldrb w9,[x21, #0x10]
008f4f20	ldp x10,x11,[x21, #0x18]
008f4f24	add x8,x21,#0x10
008f4f28	add x0,x22,#0x10
008f4f2c	tst w9,#0x1
008f4f30	lsr w12,w9,#0x1
008f4f34	csinc x1,x11,x8,ne
008f4f38	csel x2,x12,x10,eq
008f4f3c	bl 0x00c31090
008f4f40	ldr x24,[x22]
008f4f44	mov x0,x20
008f4f48	mov x1,x22
008f4f4c	bl 0x00c314a0
008f4f50	ldr x21,[x21]
008f4f54	mov x22,x24
008f4f58	cbnz x24,0x008f4f0c
008f4f5c	b 0x008f4f8c
008f4f60	ldrb w8,[x22, #0x10]
008f4f64	ldr x24,[x22]
008f4f68	tbz w8,#0x0,0x008f4f74
008f4f6c	ldr x0,[x22, #0x20]
008f4f70	bl 0x00c301d0
008f4f74	mov x0,x22
008f4f78	bl 0x00c301d0
008f4f7c	mov x22,x24
008f4f80	cbnz x24,0x008f4f60
008f4f84	b 0x008f4f8c
008f4f88	ldr x21,[x21]
008f4f8c	cmp x21,x19
008f4f90	b.eq 0x008f4fb4
008f4f94	add x1,x21,#0x10
008f4f98	mov x8,sp
008f4f9c	mov x0,x20
008f4fa0	bl 0x00c31490
008f4fa4	ldr x1,[sp]
008f4fa8	mov x0,x20
008f4fac	bl 0x00c314a0
008f4fb0	b 0x008f4f88
008f4fb4	ldr x8,[x23, #0x28]
008f4fb8	ldr x9,[sp, #0x18]
008f4fbc	cmp x8,x9
008f4fc0	b.ne 0x008f4fdc
008f4fc4	ldp x29,x30,[sp, #0x50]
008f4fc8	ldp x20,x19,[sp, #0x40]
008f4fcc	ldp x22,x21,[sp, #0x30]
008f4fd0	ldp x24,x23,[sp, #0x20]
008f4fd4	add sp,sp,#0x60
008f4fd8	ret
008f4fdc	bl 0x00c2fec0
