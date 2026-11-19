; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append @ 008e6ed0
008e6ed0	str x27,[sp, #-0x60]!
008e6ed4	stp x26,x25,[sp, #0x10]
008e6ed8	stp x24,x23,[sp, #0x20]
008e6edc	stp x22,x21,[sp, #0x30]
008e6ee0	stp x20,x19,[sp, #0x40]
008e6ee4	stp x29,x30,[sp, #0x50]
008e6ee8	add x29,sp,#0x50
008e6eec	ldrb w8,[x0]
008e6ef0	mov x20,x2
008e6ef4	mov x19,x0
008e6ef8	mov x21,x1
008e6efc	tbnz w8,#0x0,0x008e6f0c
008e6f00	lsr w22,w8,#0x1
008e6f04	mov w26,#0x16
008e6f08	b 0x008e6f18
008e6f0c	ldp x9,x22,[x19]
008e6f10	and x9,x9,#-0x2
008e6f14	sub x26,x9,#0x1
008e6f18	sub x9,x26,x22
008e6f1c	cmp x9,x20
008e6f20	b.cs 0x008e6f48
008e6f24	add x27,x22,x20
008e6f28	mov x9,#-0x12
008e6f2c	sub x10,x27,x26
008e6f30	sub x9,x9,x26
008e6f34	cmp x9,x10
008e6f38	b.cc 0x008e7048
008e6f3c	tbnz w8,#0x0,0x008e6f58
008e6f40	add x23,x19,#0x1
008e6f44	b 0x008e6f5c
008e6f48	cbz x20,0x008e7028
008e6f4c	tbnz w8,#0x0,0x008e6f90
008e6f50	add x23,x19,#0x1
008e6f54	b 0x008e6f94
008e6f58	ldr x23,[x19, #0x10]
008e6f5c	mov x8,#-0x1a
008e6f60	movk x8,#0x7fff, LSL #48
008e6f64	cmp x26,x8
008e6f68	b.hi 0x008e6f88
008e6f6c	lsl x8,x26,#0x1
008e6f70	cmp x27,x8
008e6f74	csel x8,x8,x27,cc
008e6f78	cmp x8,#0x17
008e6f7c	b.cs 0x008e6fcc
008e6f80	mov w24,#0x17
008e6f84	b 0x008e6fd4
008e6f88	orr x24,xzr,#-0x11
008e6f8c	b 0x008e6fd4
008e6f90	ldr x23,[x19, #0x10]
008e6f94	add x0,x23,x22
008e6f98	mov x1,x21
008e6f9c	mov x2,x20
008e6fa0	bl 0x00c2ffd0
008e6fa4	ldrb w9,[x19]
008e6fa8	add x8,x22,x20
008e6fac	tbnz w9,#0x0,0x008e6fc0
008e6fb0	lsl w9,w8,#0x1
008e6fb4	strb w9,[x19]
008e6fb8	add x8,x23,x8
008e6fbc	b 0x008e7024
008e6fc0	str x8,[x19, #0x8]
008e6fc4	add x8,x23,x8
008e6fc8	b 0x008e7024
008e6fcc	add x8,x8,#0x10
008e6fd0	and x24,x8,#-0x10
008e6fd4	mov x0,x24
008e6fd8	bl 0x00c2fed0
008e6fdc	mov x25,x0
008e6fe0	cbz x22,0x008e6ff4
008e6fe4	mov x0,x25
008e6fe8	mov x1,x23
008e6fec	mov x2,x22
008e6ff0	bl 0x00c2ffd0
008e6ff4	add x0,x25,x22
008e6ff8	mov x1,x21
008e6ffc	mov x2,x20
008e7000	bl 0x00c2ffd0
008e7004	cmp x26,#0x16
008e7008	b.eq 0x008e7014
008e700c	mov x0,x23
008e7010	bl 0x00c301d0
008e7014	orr x8,x24,#0x1
008e7018	str x8,[x19]
008e701c	add x8,x25,x27
008e7020	stp x27,x25,[x19, #0x8]
008e7024	strb wzr,[x8]
008e7028	mov x0,x19
008e702c	ldp x29,x30,[sp, #0x50]
008e7030	ldp x20,x19,[sp, #0x40]
008e7034	ldp x22,x21,[sp, #0x30]
008e7038	ldp x24,x23,[sp, #0x20]
008e703c	ldp x26,x25,[sp, #0x10]
008e7040	ldr x27,[sp], #0x60
008e7044	ret
008e7048	mov x0,x19
008e704c	bl 0x00c30ce0
