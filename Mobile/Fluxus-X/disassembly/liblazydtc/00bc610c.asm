; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::append @ 00bc610c
00bc610c	paciasp
00bc6110	stp x29,x30,[sp, #-0x30]!
00bc6114	stp x22,x21,[sp, #0x10]
00bc6118	stp x20,x19,[sp, #0x20]
00bc611c	mov x29,sp
00bc6120	ldp x9,x11,[x0]
00bc6124	mov w8,#0x4
00bc6128	ldrb w10,[x0]
00bc612c	mov x20,x2
00bc6130	mov x19,x0
00bc6134	mov x7,x1
00bc6138	and x12,x9,#-0x2
00bc613c	tst w10,#0x1
00bc6140	ubfx x10,x9,#0x1,#0x7
00bc6144	sub x12,x12,#0x1
00bc6148	csel x8,x8,x12,eq
00bc614c	tst x9,#0x1
00bc6150	csel x21,x10,x11,eq
00bc6154	sub x10,x8,x21
00bc6158	cmp x10,x2
00bc615c	b.cs 0x00bc6188
00bc6160	sub x9,x20,x8
00bc6164	mov x0,x19
00bc6168	mov x1,x8
00bc616c	add x2,x9,x21
00bc6170	mov x3,x21
00bc6174	mov x4,x21
00bc6178	mov x5,xzr
00bc617c	mov x6,x20
00bc6180	bl 0x00c43d40
00bc6184	b 0x00bc61cc
00bc6188	cbz x20,0x00bc61cc
00bc618c	ldr x8,[x19, #0x10]
00bc6190	add x10,x19,#0x4
00bc6194	tst x9,#0x1
00bc6198	lsl x2,x20,#0x2
00bc619c	mov x1,x7
00bc61a0	csel x22,x10,x8,eq
00bc61a4	add x0,x22,x21, LSL #0x2
00bc61a8	bl 0x00c2ff60
00bc61ac	ldrb w9,[x19]
00bc61b0	add x8,x21,x20
00bc61b4	tbnz w9,#0x0,0x00bc61c4
00bc61b8	lsl w9,w8,#0x1
00bc61bc	strb w9,[x19]
00bc61c0	b 0x00bc61c8
00bc61c4	str x8,[x19, #0x8]
00bc61c8	str wzr,[x22, x8, LSL #0x2]
00bc61cc	mov x0,x19
00bc61d0	ldp x20,x19,[sp, #0x20]
00bc61d4	ldp x22,x21,[sp, #0x10]
00bc61d8	ldp x29,x30,[sp], #0x30
00bc61dc	autiasp
00bc61e0	ret
