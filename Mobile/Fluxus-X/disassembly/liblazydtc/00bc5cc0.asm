; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::replace @ 00bc5cc0
00bc5cc0	paciasp
00bc5cc4	stp x29,x30,[sp, #-0x50]!
00bc5cc8	str x25,[sp, #0x10]
00bc5ccc	stp x24,x23,[sp, #0x20]
00bc5cd0	stp x22,x21,[sp, #0x30]
00bc5cd4	stp x20,x19,[sp, #0x40]
00bc5cd8	mov x29,sp
00bc5cdc	ldrb w9,[x0]
00bc5ce0	ldr x8,[x0, #0x8]
00bc5ce4	lsr x10,x9,#0x1
00bc5ce8	tst w9,#0x1
00bc5cec	csel x20,x10,x8,eq
00bc5cf0	subs x8,x20,x1
00bc5cf4	b.cc 0x00bc5e44
00bc5cf8	ldr x10,[x0]
00bc5cfc	cmp x8,x2
00bc5d00	mov x23,x1
00bc5d04	csel x22,x8,x2,cc
00bc5d08	tst w9,#0x1
00bc5d0c	mov w9,#0x4
00bc5d10	and x11,x10,#-0x2
00bc5d14	mov w21,w4
00bc5d18	mov x19,x3
00bc5d1c	sub x11,x11,#0x1
00bc5d20	csel x1,x9,x11,eq
00bc5d24	sub x9,x22,x20
00bc5d28	add x9,x9,x1
00bc5d2c	cmp x9,x3
00bc5d30	b.cs 0x00bc5d6c
00bc5d34	add x25,x20,x19
00bc5d38	mov x3,x20
00bc5d3c	mov x4,x23
00bc5d40	sub x8,x25,x1
00bc5d44	mov x5,x22
00bc5d48	mov x6,x19
00bc5d4c	sub x2,x8,x22
00bc5d50	mov x24,x0
00bc5d54	bl 0x00c43d70
00bc5d58	mov x0,x24
00bc5d5c	sub x8,x25,x22
00bc5d60	ldr x24,[x24, #0x10]
00bc5d64	str x8,[x0, #0x8]
00bc5d68	b 0x00bc5db4
00bc5d6c	ldr x9,[x0, #0x10]
00bc5d70	add x11,x0,#0x4
00bc5d74	tst x10,#0x1
00bc5d78	csel x24,x11,x9,eq
00bc5d7c	cmp x8,x2
00bc5d80	b.ls 0x00bc5db0
00bc5d84	cmp x19,x22
00bc5d88	b.eq 0x00bc5db0
00bc5d8c	add x9,x24,x23, LSL #0x2
00bc5d90	sub x10,x8,x22
00bc5d94	mov x25,x0
00bc5d98	lsl x2,x10,#0x2
00bc5d9c	add x8,x9,x19, LSL #0x2
00bc5da0	add x1,x9,x22, LSL #0x2
00bc5da4	mov x0,x8
00bc5da8	bl 0x00c2ff60
00bc5dac	mov x0,x25
00bc5db0	cbz x19,0x00bc5e04
00bc5db4	add x11,x24,x23, LSL #0x2
00bc5db8	cmp x19,#0x8
00bc5dbc	mov x9,x19
00bc5dc0	mov x8,x11
00bc5dc4	b.cc 0x00bc5df8
00bc5dc8	and x10,x19,#-0x8
00bc5dcc	dup v0.4S,w21
00bc5dd0	and x9,x19,#0x7
00bc5dd4	add x8,x11,x10, LSL #0x2
00bc5dd8	add x11,x11,#0x10
00bc5ddc	mov x12,x10
00bc5de0	subs x12,x12,#0x8
00bc5de4	stp q0,q0,[x11, #-0x10]
00bc5de8	add x11,x11,#0x20
00bc5dec	b.ne 0x00bc5de0
00bc5df0	cmp x19,x10
00bc5df4	b.eq 0x00bc5e04
00bc5df8	subs x9,x9,#0x1
00bc5dfc	str w21,[x8], #0x4
00bc5e00	b.ne 0x00bc5df8
00bc5e04	ldrb w9,[x0]
00bc5e08	sub x8,x19,x22
00bc5e0c	add x8,x8,x20
00bc5e10	tbnz w9,#0x0,0x00bc5e20
00bc5e14	lsl w9,w8,#0x1
00bc5e18	strb w9,[x0]
00bc5e1c	b 0x00bc5e24
00bc5e20	str x8,[x0, #0x8]
00bc5e24	str wzr,[x24, x8, LSL #0x2]
00bc5e28	ldp x20,x19,[sp, #0x40]
00bc5e2c	ldr x25,[sp, #0x10]
00bc5e30	ldp x22,x21,[sp, #0x30]
00bc5e34	ldp x24,x23,[sp, #0x20]
00bc5e38	ldp x29,x30,[sp], #0x50
00bc5e3c	autiasp
00bc5e40	ret
00bc5e44	bl 0x00bc531c
