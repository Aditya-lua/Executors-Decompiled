; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_am_pm @ 00bebc40
00bebc40	paciasp
00bebc44	stp x29,x30,[sp, #-0x40]!
00bebc48	stp x24,x23,[sp, #0x10]
00bebc4c	stp x22,x21,[sp, #0x20]
00bebc50	stp x20,x19,[sp, #0x30]
00bebc54	mov x29,sp
00bebc58	ldr x8,[x0, #0x10]!
00bebc5c	mov x21,x5
00bebc60	mov x20,x4
00bebc64	mov x22,x3
00bebc68	mov x23,x2
00bebc6c	ldr x8,[x8, #0x10]
00bebc70	mov x19,x1
00bebc74	blr x8
00bebc78	ldrb w8,[x0]
00bebc7c	ldrb w9,[x0, #0x18]
00bebc80	ldr x10,[x0, #0x8]
00bebc84	lsr x11,x8,#0x1
00bebc88	tst w8,#0x1
00bebc8c	ldr x8,[x0, #0x20]
00bebc90	lsr x12,x9,#0x1
00bebc94	csel x10,x11,x10,eq
00bebc98	tst w9,#0x1
00bebc9c	csel x8,x12,x8,eq
00bebca0	cmn x10,x8
00bebca4	b.ne 0x00bebcb8
00bebca8	ldr w8,[x20]
00bebcac	orr w8,w8,#0x4
00bebcb0	str w8,[x20]
00bebcb4	b 0x00bebd10
00bebcb8	mov x24,x0
00bebcbc	add x3,x0,#0x30
00bebcc0	mov x0,x23
00bebcc4	mov x1,x22
00bebcc8	mov x2,x24
00bebccc	mov x4,x21
00bebcd0	mov x5,x20
00bebcd4	mov w6,wzr
00bebcd8	bl 0x00bdede4
00bebcdc	ldr w8,[x19]
00bebce0	subs x9,x0,x24
00bebce4	b.ne 0x00bebcf8
00bebce8	cmp w8,#0xc
00bebcec	b.ne 0x00bebcf8
00bebcf0	str wzr,[x19]
00bebcf4	b 0x00bebd10
00bebcf8	cmp x9,#0x18
00bebcfc	b.ne 0x00bebd10
00bebd00	cmp w8,#0xb
00bebd04	b.gt 0x00bebd10
00bebd08	add w8,w8,#0xc
00bebd0c	str w8,[x19]
00bebd10	ldp x20,x19,[sp, #0x30]
00bebd14	ldp x22,x21,[sp, #0x20]
00bebd18	ldp x24,x23,[sp, #0x10]
00bebd1c	ldp x29,x30,[sp], #0x40
00bebd20	autiasp
00bebd24	ret
