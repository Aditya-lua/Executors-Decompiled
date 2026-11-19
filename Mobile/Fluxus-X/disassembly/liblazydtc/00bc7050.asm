; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::operator= @ 00bc7050
00bc7050	bti c
00bc7054	cmp x0,x1
00bc7058	b.eq 0x00bc707c
00bc705c	ldrb w9,[x0]
00bc7060	ldrb w8,[x1]
00bc7064	tbnz w9,#0x0,0x00bc7080
00bc7068	tbnz w8,#0x0,0x00bc709c
00bc706c	ldr x8,[x1, #0x10]
00bc7070	ldr q0,[x1]
00bc7074	str x8,[x0, #0x10]
00bc7078	str q0,[x0]
00bc707c	ret
00bc7080	ldp x10,x9,[x1, #0x8]
00bc7084	lsr x11,x8,#0x1
00bc7088	add x12,x1,#0x4
00bc708c	tst w8,#0x1
00bc7090	csel x1,x12,x9,eq
00bc7094	csel x2,x11,x10,eq
00bc7098	b 0x00bc7168
00bc709c	ldp x2,x8,[x1, #0x8]
00bc70a0	mov x1,x8
00bc70a4	b 0x00bc70a8
00bc70a8	paciasp
00bc70ac	stp x29,x30,[sp, #-0x40]!
00bc70b0	str x23,[sp, #0x10]
00bc70b4	stp x22,x21,[sp, #0x20]
00bc70b8	stp x20,x19,[sp, #0x30]
00bc70bc	mov x29,sp
00bc70c0	mov x19,x2
00bc70c4	cmp x2,#0x4
00bc70c8	mov x20,x0
00bc70cc	b.hi 0x00bc70f0
00bc70d0	lsl w8,w19,#0x1
00bc70d4	mov x21,x20
00bc70d8	strb w8,[x21], #0x4
00bc70dc	cbz x19,0x00bc7144
00bc70e0	lsl x2,x19,#0x2
00bc70e4	mov x0,x21
00bc70e8	bl 0x00c2ff60
00bc70ec	b 0x00bc7144
00bc70f0	mov x8,#0x9
00bc70f4	movk x8,#0xc000, LSL #48
00bc70f8	add x9,x19,x8
00bc70fc	orr x8,x8,#0x4
00bc7100	cmp x9,x8
00bc7104	b.cc 0x00bc7164
00bc7108	cmp x19,#0x8
00bc710c	mov w8,#0x8
00bc7110	mov x22,x1
00bc7114	csel x8,x19,x8,hi
00bc7118	orr x23,x8,#0x1
00bc711c	lsl x8,x23,#0x2
00bc7120	add x0,x8,#0x4
00bc7124	bl 0x00c2fed0
00bc7128	lsl x2,x19,#0x2
00bc712c	mov x1,x22
00bc7130	mov x21,x0
00bc7134	bl 0x00c2ffd0
00bc7138	add x8,x23,#0x2
00bc713c	stp x19,x21,[x20, #0x8]
00bc7140	str x8,[x20]
00bc7144	mov x0,x20
00bc7148	str wzr,[x21, x19, LSL #0x2]
00bc714c	ldp x20,x19,[sp, #0x30]
00bc7150	ldr x23,[sp, #0x10]
00bc7154	ldp x22,x21,[sp, #0x20]
00bc7158	ldp x29,x30,[sp], #0x40
00bc715c	autiasp
00bc7160	ret
00bc7164	bl 0x00bc5610
00bc7168	paciasp
00bc716c	stp x29,x30,[sp, #-0x30]!
00bc7170	str x21,[sp, #0x10]
00bc7174	stp x20,x19,[sp, #0x20]
00bc7178	mov x29,sp
00bc717c	ldr x8,[x0]
00bc7180	mov x20,x2
00bc7184	mov x19,x0
00bc7188	mov x7,x1
00bc718c	and x9,x8,#-0x2
00bc7190	subs x8,x2,x9
00bc7194	b.cs 0x00bc71bc
00bc7198	ldr x21,[x19, #0x10]
00bc719c	str x20,[x19, #0x8]
00bc71a0	cbz x20,0x00bc71b4
00bc71a4	lsl x2,x20,#0x2
00bc71a8	mov x0,x21
00bc71ac	mov x1,x7
00bc71b0	bl 0x00c2ff60
00bc71b4	str wzr,[x21, x20, LSL #0x2]
00bc71b8	b 0x00bc71dc
00bc71bc	ldr x3,[x19, #0x8]
00bc71c0	sub x1,x9,#0x1
00bc71c4	add x2,x8,#0x1
00bc71c8	mov x0,x19
00bc71cc	mov x4,xzr
00bc71d0	mov x6,x20
00bc71d4	mov x5,x3
00bc71d8	bl 0x00c43d40
00bc71dc	mov x0,x19
00bc71e0	ldp x20,x19,[sp, #0x20]
00bc71e4	ldr x21,[sp, #0x10]
00bc71e8	ldp x29,x30,[sp], #0x30
00bc71ec	autiasp
00bc71f0	ret
