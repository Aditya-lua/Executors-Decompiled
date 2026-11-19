; std::__ndk1::vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::vector @ 00901d98
00901d98	str x25,[sp, #-0x50]!
00901d9c	stp x24,x23,[sp, #0x10]
00901da0	stp x22,x21,[sp, #0x20]
00901da4	stp x20,x19,[sp, #0x30]
00901da8	stp x29,x30,[sp, #0x40]
00901dac	add x29,sp,#0x40
00901db0	stp xzr,xzr,[x0, #0x8]
00901db4	str xzr,[x0]
00901db8	ldp x8,x9,[x1]
00901dbc	mov x21,x1
00901dc0	mov x19,x0
00901dc4	subs x0,x9,x8
00901dc8	b.eq 0x00901eac
00901dcc	orr x9,xzr,#-0x5555555555555556
00901dd0	asr x8,x0,#0x3
00901dd4	movk x9,#0xaaab
00901dd8	mul x22,x8,x9
00901ddc	orr x8,xzr,#-0x5555555555555556
00901de0	movk x8,#0xaaab
00901de4	movk x8,#0xaaa, LSL #48
00901de8	cmp x22,x8
00901dec	b.cs 0x00901ecc
00901df0	bl 0x00c2fed0
00901df4	orr w8,wzr,#0x18
00901df8	madd x8,x22,x8,x0
00901dfc	stp x0,x0,[x19]
00901e00	str x8,[x19, #0x10]
00901e04	ldp x24,x25,[x21]
00901e08	mov x20,x0
00901e0c	cmp x24,x25
00901e10	b.eq 0x00901eac
00901e14	stp xzr,xzr,[x20, #0x8]
00901e18	str xzr,[x20]
00901e1c	ldrb w8,[x24]
00901e20	tbnz w8,#0x0,0x00901e38
00901e24	ldr x8,[x24, #0x10]
00901e28	str x8,[x20, #0x10]
00901e2c	ldr q0,[x24]
00901e30	str q0,[x20]
00901e34	b 0x00901e94
00901e38	ldr x21,[x24, #0x8]
00901e3c	cmn x21,#0x10
00901e40	b.cs 0x00901ec4
00901e44	ldr x22,[x24, #0x10]
00901e48	cmp x21,#0x17
00901e4c	b.cs 0x00901e60
00901e50	lsl w8,w21,#0x1
00901e54	strb w8,[x20], #0x1
00901e58	cbnz x21,0x00901e80
00901e5c	b 0x00901e90
00901e60	add x8,x21,#0x10
00901e64	and x23,x8,#-0x10
00901e68	mov x0,x23
00901e6c	bl 0x00c2fed0
00901e70	orr x8,x23,#0x1
00901e74	stp x21,x0,[x20, #0x8]
00901e78	str x8,[x20]
00901e7c	mov x20,x0
00901e80	mov x0,x20
00901e84	mov x1,x22
00901e88	mov x2,x21
00901e8c	bl 0x00c2ffd0
00901e90	strb wzr,[x20, x21]
00901e94	ldr x8,[x19, #0x8]
00901e98	add x24,x24,#0x18
00901e9c	cmp x25,x24
00901ea0	add x20,x8,#0x18
00901ea4	str x20,[x19, #0x8]
00901ea8	b.ne 0x00901e14
00901eac	ldp x29,x30,[sp, #0x40]
00901eb0	ldp x20,x19,[sp, #0x30]
00901eb4	ldp x22,x21,[sp, #0x20]
00901eb8	ldp x24,x23,[sp, #0x10]
00901ebc	ldr x25,[sp], #0x50
00901ec0	ret
00901ec4	mov x0,x20
00901ec8	bl 0x00c30ce0
00901ecc	mov x0,x19
00901ed0	bl 0x00c30bd0
