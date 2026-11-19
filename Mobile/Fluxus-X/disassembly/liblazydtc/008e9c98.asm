; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str @ 008e9c98
008e9c98	str x23,[sp, #-0x40]!
008e9c9c	stp x22,x21,[sp, #0x10]
008e9ca0	stp x20,x19,[sp, #0x20]
008e9ca4	stp x29,x30,[sp, #0x30]
008e9ca8	add x29,sp,#0x30
008e9cac	ldr w9,[x0, #0x60]
008e9cb0	mov x19,x8
008e9cb4	tbnz w9,#0x4,0x008e9cc8
008e9cb8	tbnz w9,#0x3,0x008e9d20
008e9cbc	stp xzr,xzr,[x19]
008e9cc0	str xzr,[x19, #0x10]
008e9cc4	b 0x008e9e90
008e9cc8	ldr x21,[x0, #0x58]
008e9ccc	ldr x8,[x0, #0x30]
008e9cd0	cmp x21,x8
008e9cd4	b.cs 0x008e9ce0
008e9cd8	mov x21,x8
008e9cdc	str x8,[x0, #0x58]
008e9ce0	ldr x23,[x0, #0x28]
008e9ce4	stp xzr,xzr,[x19]
008e9ce8	str xzr,[x19, #0x10]
008e9cec	sub x22,x21,x23
008e9cf0	cmn x22,#0x10
008e9cf4	b.cs 0x008e9ea4
008e9cf8	cmp x22,#0x16
008e9cfc	b.hi 0x008e9d64
008e9d00	lsl w8,w22,#0x1
008e9d04	strb w8,[x19], #0x1
008e9d08	cmp x23,x21
008e9d0c	b.eq 0x008e9e8c
008e9d10	cmp x22,#0x20
008e9d14	b.cs 0x008e9d90
008e9d18	mov x8,x19
008e9d1c	b 0x008e9de4
008e9d20	ldr x23,[x0, #0x10]
008e9d24	ldr x21,[x0, #0x20]
008e9d28	stp xzr,xzr,[x19]
008e9d2c	str xzr,[x19, #0x10]
008e9d30	sub x22,x21,x23
008e9d34	cmn x22,#0x10
008e9d38	b.cs 0x008e9ea4
008e9d3c	cmp x22,#0x16
008e9d40	b.hi 0x008e9df8
008e9d44	lsl w8,w22,#0x1
008e9d48	strb w8,[x19], #0x1
008e9d4c	cmp x23,x21
008e9d50	b.eq 0x008e9e8c
008e9d54	cmp x22,#0x20
008e9d58	b.cs 0x008e9e24
008e9d5c	mov x8,x19
008e9d60	b 0x008e9e78
008e9d64	add x8,x22,#0x10
008e9d68	and x20,x8,#-0x10
008e9d6c	mov x0,x20
008e9d70	bl 0x00c2fed0
008e9d74	orr x8,x20,#0x1
008e9d78	stp x22,x0,[x19, #0x8]
008e9d7c	str x8,[x19]
008e9d80	mov x19,x0
008e9d84	cmp x23,x21
008e9d88	b.ne 0x008e9d10
008e9d8c	b 0x008e9e8c
008e9d90	cmp x19,x21
008e9d94	b.cs 0x008e9da8
008e9d98	add x8,x19,x22
008e9d9c	cmp x23,x8
008e9da0	mov x8,x19
008e9da4	b.cc 0x008e9de4
008e9da8	and x9,x22,#-0x20
008e9dac	add x11,x19,#0x10
008e9db0	add x10,x23,x9
008e9db4	add x8,x19,x9
008e9db8	add x12,x23,#0x10
008e9dbc	mov x13,x9
008e9dc0	ldp q0,q1,[x12, #-0x10]
008e9dc4	subs x13,x13,#0x20
008e9dc8	add x12,x12,#0x20
008e9dcc	stp q0,q1,[x11, #-0x10]
008e9dd0	add x11,x11,#0x20
008e9dd4	b.ne 0x008e9dc0
008e9dd8	cmp x9,x22
008e9ddc	mov x23,x10
008e9de0	b.eq 0x008e9e88
008e9de4	ldrb w9,[x23], #0x1
008e9de8	cmp x21,x23
008e9dec	strb w9,[x8], #0x1
008e9df0	b.ne 0x008e9de4
008e9df4	b 0x008e9e88
008e9df8	add x8,x22,#0x10
008e9dfc	and x20,x8,#-0x10
008e9e00	mov x0,x20
008e9e04	bl 0x00c2fed0
008e9e08	orr x8,x20,#0x1
008e9e0c	stp x22,x0,[x19, #0x8]
008e9e10	str x8,[x19]
008e9e14	mov x19,x0
008e9e18	cmp x23,x21
008e9e1c	b.ne 0x008e9d54
008e9e20	b 0x008e9e8c
008e9e24	cmp x19,x21
008e9e28	b.cs 0x008e9e3c
008e9e2c	add x8,x19,x22
008e9e30	cmp x23,x8
008e9e34	mov x8,x19
008e9e38	b.cc 0x008e9e78
008e9e3c	and x9,x22,#-0x20
008e9e40	add x11,x19,#0x10
008e9e44	add x10,x23,x9
008e9e48	add x8,x19,x9
008e9e4c	add x12,x23,#0x10
008e9e50	mov x13,x9
008e9e54	ldp q0,q1,[x12, #-0x10]
008e9e58	subs x13,x13,#0x20
008e9e5c	add x12,x12,#0x20
008e9e60	stp q0,q1,[x11, #-0x10]
008e9e64	add x11,x11,#0x20
008e9e68	b.ne 0x008e9e54
008e9e6c	cmp x22,x9
008e9e70	mov x23,x10
008e9e74	b.eq 0x008e9e88
008e9e78	ldrb w9,[x23], #0x1
008e9e7c	cmp x21,x23
008e9e80	strb w9,[x8], #0x1
008e9e84	b.ne 0x008e9e78
008e9e88	add x19,x19,x22
008e9e8c	strb wzr,[x19]
008e9e90	ldp x29,x30,[sp, #0x30]
008e9e94	ldp x20,x19,[sp, #0x20]
008e9e98	ldp x22,x21,[sp, #0x10]
008e9e9c	ldr x23,[sp], #0x40
008e9ea0	ret
008e9ea4	mov x0,x19
008e9ea8	bl 0x00c30ce0
