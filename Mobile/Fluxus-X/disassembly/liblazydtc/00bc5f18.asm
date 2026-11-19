; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::reserve @ 00bc5f18
00bc5f18	bti c
00bc5f1c	orr x8,xzr,#0x3ffffffffffffff8
00bc5f20	cmp x1,x8
00bc5f24	b.cs 0x00bc5f70
00bc5f28	ldr x8,[x0]
00bc5f2c	ldrb w9,[x0]
00bc5f30	and x8,x8,#-0x2
00bc5f34	tst w9,#0x1
00bc5f38	mov w9,#0x4
00bc5f3c	sub x8,x8,#0x1
00bc5f40	csel x8,x9,x8,eq
00bc5f44	cmp x1,x8
00bc5f48	b.ls 0x00bc5f6c
00bc5f4c	orr x8,x1,#0x1
00bc5f50	mov w9,#0x7
00bc5f54	cmp x8,#0x5
00bc5f58	csel x8,x9,x8,eq
00bc5f5c	cmp x1,#0x4
00bc5f60	mov w9,#0x4
00bc5f64	csel x1,x8,x9,hi
00bc5f68	b 0x00bc5f80
00bc5f6c	ret
00bc5f70	paciasp
00bc5f74	stp x29,x30,[sp, #-0x10]!
00bc5f78	mov x29,sp
00bc5f7c	bl 0x00bc5610
00bc5f80	paciasp
00bc5f84	stp x29,x30,[sp, #-0x50]!
00bc5f88	stp x26,x25,[sp, #0x10]
00bc5f8c	stp x24,x23,[sp, #0x20]
00bc5f90	stp x22,x21,[sp, #0x30]
00bc5f94	stp x20,x19,[sp, #0x40]
00bc5f98	mov x29,sp
00bc5f9c	ldp x8,x11,[x0]
00bc5fa0	mov w9,#0x4
00bc5fa4	ldrb w10,[x0]
00bc5fa8	mov x20,x1
00bc5fac	mov x19,x0
00bc5fb0	and x12,x8,#-0x2
00bc5fb4	tst w10,#0x1
00bc5fb8	ubfx x10,x8,#0x1,#0x7
00bc5fbc	sub x26,x12,#0x1
00bc5fc0	csel x24,x9,x26,eq
00bc5fc4	tst w8,#0x1
00bc5fc8	csel x23,x10,x11,eq
00bc5fcc	cmp x1,#0x4
00bc5fd0	b.ls 0x00bc5ffc
00bc5fd4	and w25,w8,#0xff
00bc5fd8	add x8,x20,#0x1
00bc5fdc	cmp x20,x24
00bc5fe0	lsr x9,x8,#0x3e
00bc5fe4	b.ls 0x00bc607c
00bc5fe8	cbnz x9,0x00bc60e4
00bc5fec	lsl x0,x8,#0x2
00bc5ff0	bl 0x00c2fed0
00bc5ff4	mov x21,x0
00bc5ff8	b 0x00bc60c8
00bc5ffc	ldr x22,[x19, #0x10]
00bc6000	add x21,x19,#0x4
00bc6004	mov w25,#0x1
00bc6008	adds x8,x23,#0x1
00bc600c	b.cs 0x00bc6020
00bc6010	lsl x2,x8,#0x2
00bc6014	mov x0,x21
00bc6018	mov x1,x22
00bc601c	bl 0x00c2ff60
00bc6020	tbnz w25,#0x0,0x00bc6040
00bc6024	cmp x20,#0x5
00bc6028	b.cc 0x00bc6058
00bc602c	add x8,x20,#0x1
00bc6030	str x21,[x19, #0x10]
00bc6034	orr x8,x8,#0x1
00bc6038	stp x8,x23,[x19]
00bc603c	b 0x00bc6060
00bc6040	lsl x8,x24,#0x2
00bc6044	mov x0,x22
00bc6048	add x1,x8,#0x4
00bc604c	bl 0x00c2fe80
00bc6050	cmp x20,#0x5
00bc6054	b.cs 0x00bc602c
00bc6058	lsl w8,w23,#0x1
00bc605c	strb w8,[x19]
00bc6060	ldp x20,x19,[sp, #0x40]
00bc6064	ldp x22,x21,[sp, #0x30]
00bc6068	ldp x24,x23,[sp, #0x20]
00bc606c	ldp x26,x25,[sp, #0x10]
00bc6070	ldp x29,x30,[sp], #0x50
00bc6074	autiasp
00bc6078	ret
00bc607c	cbnz x9,0x00bc60e8
00bc6080	lsl x22,x8,#0x2
00bc6084	mov x0,x22
00bc6088	bl 0x00c2fed0
00bc608c	tst w25,#0x1
00bc6090	mov w8,#0x4
00bc6094	mov x21,x0
00bc6098	csel x8,x8,x26,eq
00bc609c	cmp x20,x8
00bc60a0	b.ls 0x00bc60c8
00bc60a4	mov x0,x21
00bc60a8	mov x1,x22
00bc60ac	ldp x20,x19,[sp, #0x40]
00bc60b0	ldp x22,x21,[sp, #0x30]
00bc60b4	ldp x24,x23,[sp, #0x20]
00bc60b8	ldp x26,x25,[sp, #0x10]
00bc60bc	ldp x29,x30,[sp], #0x50
00bc60c0	autiasp
00bc60c4	b 0x00c2fe80
00bc60c8	ldr x8,[x19, #0x10]
00bc60cc	ands w25,w25,#0x1
00bc60d0	add x9,x19,#0x4
00bc60d4	csel x22,x9,x8,eq
00bc60d8	adds x8,x23,#0x1
00bc60dc	b.cc 0x00bc6010
00bc60e0	b 0x00bc6020
00bc60e4	bl 0x007fe1b8
00bc60e8	bl 0x007fe1b8
