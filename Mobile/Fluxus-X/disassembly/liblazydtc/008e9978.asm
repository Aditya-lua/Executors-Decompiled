; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append @ 008e9978
008e9978	stp x26,x25,[sp, #-0x50]!
008e997c	stp x24,x23,[sp, #0x10]
008e9980	stp x22,x21,[sp, #0x20]
008e9984	stp x20,x19,[sp, #0x30]
008e9988	stp x29,x30,[sp, #0x40]
008e998c	add x29,sp,#0x40
008e9990	mov w21,w2
008e9994	mov x20,x1
008e9998	mov x19,x0
008e999c	cbz x1,0x008e9ab0
008e99a0	ldrb w8,[x19]
008e99a4	tbnz w8,#0x0,0x008e99b8
008e99a8	lsr w22,w8,#0x1
008e99ac	mov w26,#0x16
008e99b0	mov w9,w8
008e99b4	b 0x008e99c4
008e99b8	ldp x9,x22,[x19]
008e99bc	and x10,x9,#-0x2
008e99c0	sub x26,x10,#0x1
008e99c4	sub x10,x26,x22
008e99c8	cmp x10,x20
008e99cc	b.cs 0x008e9a70
008e99d0	add x9,x22,x20
008e99d4	orr x10,xzr,#-0x11
008e99d8	sub x11,x9,x26
008e99dc	sub x10,x10,x26
008e99e0	cmp x10,x11
008e99e4	b.cc 0x008e9acc
008e99e8	tbnz w8,#0x0,0x008e99f4
008e99ec	add x23,x19,#0x1
008e99f0	b 0x008e99f8
008e99f4	ldr x23,[x19, #0x10]
008e99f8	mov x8,#-0x1a
008e99fc	movk x8,#0x7fff, LSL #48
008e9a00	cmp x26,x8
008e9a04	b.hi 0x008e9a24
008e9a08	lsl x8,x26,#0x1
008e9a0c	cmp x9,x8
008e9a10	csel x8,x8,x9,cc
008e9a14	cmp x8,#0x17
008e9a18	b.cs 0x008e9a2c
008e9a1c	mov w24,#0x17
008e9a20	b 0x008e9a34
008e9a24	orr x24,xzr,#-0x11
008e9a28	b 0x008e9a34
008e9a2c	add x8,x8,#0x10
008e9a30	and x24,x8,#-0x10
008e9a34	mov x0,x24
008e9a38	bl 0x00c2fed0
008e9a3c	mov x25,x0
008e9a40	cbz x22,0x008e9a54
008e9a44	mov x0,x25
008e9a48	mov x1,x23
008e9a4c	mov x2,x22
008e9a50	bl 0x00c2ffd0
008e9a54	cmp x26,#0x16
008e9a58	b.eq 0x008e9a64
008e9a5c	mov x0,x23
008e9a60	bl 0x00c301d0
008e9a64	orr x9,x24,#0x1
008e9a68	str x25,[x19, #0x10]
008e9a6c	str x9,[x19]
008e9a70	tbnz w9,#0x0,0x008e9a7c
008e9a74	add x23,x19,#0x1
008e9a78	b 0x008e9a80
008e9a7c	ldr x23,[x19, #0x10]
008e9a80	add x0,x23,x22
008e9a84	mov w1,w21
008e9a88	mov x2,x20
008e9a8c	bl 0x00c301c0
008e9a90	ldrb w9,[x19]
008e9a94	add x8,x22,x20
008e9a98	tbnz w9,#0x0,0x008e9aa8
008e9a9c	lsl w9,w8,#0x1
008e9aa0	strb w9,[x19]
008e9aa4	b 0x008e9aac
008e9aa8	str x8,[x19, #0x8]
008e9aac	strb wzr,[x23, x8]
008e9ab0	mov x0,x19
008e9ab4	ldp x29,x30,[sp, #0x40]
008e9ab8	ldp x20,x19,[sp, #0x30]
008e9abc	ldp x22,x21,[sp, #0x20]
008e9ac0	ldp x24,x23,[sp, #0x10]
008e9ac4	ldp x26,x25,[sp], #0x50
008e9ac8	ret
008e9acc	mov x0,x19
008e9ad0	bl 0x00c30ce0
