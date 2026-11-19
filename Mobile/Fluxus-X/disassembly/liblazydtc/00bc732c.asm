; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::insert @ 00bc732c
00bc732c	paciasp
00bc7330	stp x29,x30,[sp, #-0x40]!
00bc7334	stp x24,x23,[sp, #0x10]
00bc7338	stp x22,x21,[sp, #0x20]
00bc733c	stp x20,x19,[sp, #0x30]
00bc7340	mov x29,sp
00bc7344	ldrb w11,[x0]
00bc7348	ldp x9,x12,[x0]
00bc734c	ldr x8,[x0, #0x10]
00bc7350	add x22,x0,#0x4
00bc7354	mov w10,#0x4
00bc7358	tst w11,#0x1
00bc735c	lsr x11,x11,#0x1
00bc7360	mov x19,x0
00bc7364	and x13,x9,#-0x2
00bc7368	csel x14,x22,x8,eq
00bc736c	mov w21,w2
00bc7370	sub x13,x13,#0x1
00bc7374	sub x23,x1,x14
00bc7378	csel x20,x11,x12,eq
00bc737c	csel x10,x10,x13,eq
00bc7380	asr x4,x23,#0x2
00bc7384	cmp x10,x20
00bc7388	b.ne 0x00bc73b8
00bc738c	mov x0,x19
00bc7390	mov x1,x20
00bc7394	mov w2,#0x1
00bc7398	mov x3,x20
00bc739c	mov x5,xzr
00bc73a0	mov w6,#0x1
00bc73a4	bl 0x00c43d70
00bc73a8	add x8,x20,#0x1
00bc73ac	ldr x24,[x19, #0x10]
00bc73b0	str x8,[x19, #0x8]
00bc73b4	b 0x00bc73d8
00bc73b8	tst x9,#0x1
00bc73bc	csel x24,x22,x8,eq
00bc73c0	subs x8,x20,x4
00bc73c4	b.eq 0x00bc73d8
00bc73c8	lsl x2,x8,#0x2
00bc73cc	add x1,x24,x23
00bc73d0	add x0,x1,#0x4
00bc73d4	bl 0x00c2ff60
00bc73d8	add x9,x20,#0x1
00bc73dc	str w21,[x24, x23#0x0]
00bc73e0	str wzr,[x24, x9, LSL #0x2]
00bc73e4	ldrb w8,[x19]
00bc73e8	tbnz w8,#0x0,0x00bc73f8
00bc73ec	lsl w9,w9,#0x1
00bc73f0	strb w9,[x19]
00bc73f4	b 0x00bc73fc
00bc73f8	str x9,[x19, #0x8]
00bc73fc	ldr x9,[x19, #0x10]
00bc7400	tst w8,#0x1
00bc7404	csel x8,x22,x9,eq
00bc7408	add x0,x23,x8
00bc740c	ldp x20,x19,[sp, #0x30]
00bc7410	ldp x22,x21,[sp, #0x20]
00bc7414	ldp x24,x23,[sp, #0x10]
00bc7418	ldp x29,x30,[sp], #0x40
00bc741c	autiasp
00bc7420	ret
