; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::append @ 00bc71f4
00bc71f4	paciasp
00bc71f8	stp x29,x30,[sp, #-0x40]!
00bc71fc	str x23,[sp, #0x10]
00bc7200	stp x22,x21,[sp, #0x20]
00bc7204	stp x20,x19,[sp, #0x30]
00bc7208	mov x29,sp
00bc720c	mov x19,x0
00bc7210	mov x0,x1
00bc7214	mov x20,x1
00bc7218	bl 0x00c437b0
00bc721c	ldp x8,x10,[x19]
00bc7220	mov x21,x0
00bc7224	ldrb w9,[x19]
00bc7228	and x11,x8,#-0x2
00bc722c	tst w9,#0x1
00bc7230	mov w9,#0x4
00bc7234	sub x11,x11,#0x1
00bc7238	ubfx x12,x8,#0x1,#0x7
00bc723c	csel x1,x9,x11,eq
00bc7240	tst x8,#0x1
00bc7244	csel x22,x12,x10,eq
00bc7248	sub x9,x1,x22
00bc724c	cmp x9,x0
00bc7250	b.cs 0x00bc727c
00bc7254	sub x8,x21,x1
00bc7258	mov x0,x19
00bc725c	mov x3,x22
00bc7260	add x2,x8,x22
00bc7264	mov x4,x22
00bc7268	mov x5,xzr
00bc726c	mov x6,x21
00bc7270	mov x7,x20
00bc7274	bl 0x00c43d40
00bc7278	b 0x00bc72c0
00bc727c	cbz x21,0x00bc72c0
00bc7280	ldr x9,[x19, #0x10]
00bc7284	add x10,x19,#0x4
00bc7288	tst x8,#0x1
00bc728c	lsl x2,x21,#0x2
00bc7290	mov x1,x20
00bc7294	csel x23,x10,x9,eq
00bc7298	add x0,x23,x22, LSL #0x2
00bc729c	bl 0x00c2ff60
00bc72a0	ldrb w9,[x19]
00bc72a4	add x8,x22,x21
00bc72a8	tbnz w9,#0x0,0x00bc72b8
00bc72ac	lsl w9,w8,#0x1
00bc72b0	strb w9,[x19]
00bc72b4	b 0x00bc72bc
00bc72b8	str x8,[x19, #0x8]
00bc72bc	str wzr,[x23, x8, LSL #0x2]
00bc72c0	mov x0,x19
00bc72c4	ldp x20,x19,[sp, #0x30]
00bc72c8	ldr x23,[sp, #0x10]
00bc72cc	ldp x22,x21,[sp, #0x20]
00bc72d0	ldp x29,x30,[sp], #0x40
00bc72d4	autiasp
00bc72d8	ret
