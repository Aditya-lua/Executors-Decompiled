; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::resize @ 00bc7424
00bc7424	paciasp
00bc7428	stp x29,x30,[sp, #-0x30]!
00bc742c	stp x22,x21,[sp, #0x10]
00bc7430	stp x20,x19,[sp, #0x20]
00bc7434	mov x29,sp
00bc7438	ldrb w9,[x0]
00bc743c	ldr x8,[x0, #0x8]
00bc7440	lsr x10,x9,#0x1
00bc7444	tst w9,#0x1
00bc7448	csel x10,x10,x8,eq
00bc744c	subs x21,x1,x10
00bc7450	b.ls 0x00bc74e4
00bc7454	ldr x10,[x0]
00bc7458	tst w9,#0x1
00bc745c	mov w9,#0x4
00bc7460	and x11,x10,#-0x2
00bc7464	ubfx x12,x10,#0x1,#0x7
00bc7468	sub x11,x11,#0x1
00bc746c	csel x1,x9,x11,eq
00bc7470	ands w9,w10,#0x1
00bc7474	csel x19,x12,x8,eq
00bc7478	sub x8,x1,x19
00bc747c	cmp x8,x21
00bc7480	b.cs 0x00bc74bc
00bc7484	sub x8,x21,x1
00bc7488	mov w22,w2
00bc748c	mov x3,x19
00bc7490	add x2,x8,x19
00bc7494	mov x4,x19
00bc7498	mov x5,xzr
00bc749c	mov x6,xzr
00bc74a0	mov x20,x0
00bc74a4	bl 0x00c43d70
00bc74a8	ldrb w8,[x20]
00bc74ac	mov w2,w22
00bc74b0	mov x0,x20
00bc74b4	str x19,[x20, #0x8]
00bc74b8	and w9,w8,#0x1
00bc74bc	ldr x8,[x0, #0x10]
00bc74c0	add x10,x0,#0x4
00bc74c4	cmp w9,#0x0
00bc74c8	csel x8,x10,x8,eq
00bc74cc	cmp x21,#0x8
00bc74d0	add x12,x8,x19, LSL #0x2
00bc74d4	b.cs 0x00bc74f8
00bc74d8	mov x9,x12
00bc74dc	mov x10,x21
00bc74e0	b 0x00bc7528
00bc74e4	tbnz w9,#0x0,0x00bc754c
00bc74e8	lsl w8,w1,#0x1
00bc74ec	strb w8,[x0], #0x4
00bc74f0	mov x8,x0
00bc74f4	b 0x00bc7554
00bc74f8	and x11,x21,#-0x8
00bc74fc	dup v0.4S,w2
00bc7500	and x10,x21,#0x7
00bc7504	add x9,x12,x11, LSL #0x2
00bc7508	add x12,x12,#0x10
00bc750c	mov x13,x11
00bc7510	subs x13,x13,#0x8
00bc7514	stp q0,q0,[x12, #-0x10]
00bc7518	add x12,x12,#0x20
00bc751c	b.ne 0x00bc7510
00bc7520	cmp x21,x11
00bc7524	b.eq 0x00bc7534
00bc7528	subs x10,x10,#0x1
00bc752c	str w2,[x9], #0x4
00bc7530	b.ne 0x00bc7528
00bc7534	ldrb w10,[x0]
00bc7538	add x9,x19,x21
00bc753c	tbnz w10,#0x0,0x00bc755c
00bc7540	lsl w10,w9,#0x1
00bc7544	strb w10,[x0]
00bc7548	b 0x00bc7560
00bc754c	ldr x8,[x0, #0x10]
00bc7550	str x1,[x0, #0x8]
00bc7554	str wzr,[x8, x1, LSL #0x2]
00bc7558	b 0x00bc7564
00bc755c	str x9,[x0, #0x8]
00bc7560	str wzr,[x8, x9, LSL #0x2]
00bc7564	ldp x20,x19,[sp, #0x20]
00bc7568	ldp x22,x21,[sp, #0x10]
00bc756c	ldp x29,x30,[sp], #0x30
00bc7570	autiasp
00bc7574	ret
