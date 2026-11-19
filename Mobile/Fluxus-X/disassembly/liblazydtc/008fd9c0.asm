; std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::assign<cpr::File*> @ 008fd9c0
008fd9c0	sub sp,sp,#0x70
008fd9c4	stp x28,x27,[sp, #0x10]
008fd9c8	stp x26,x25,[sp, #0x20]
008fd9cc	stp x24,x23,[sp, #0x30]
008fd9d0	stp x22,x21,[sp, #0x40]
008fd9d4	stp x20,x19,[sp, #0x50]
008fd9d8	stp x29,x30,[sp, #0x60]
008fd9dc	add x29,sp,#0x60
008fd9e0	ldr x8,[x0, #0x10]
008fd9e4	ldr x24,[x0]
008fd9e8	sub x9,x2,x1
008fd9ec	asr x10,x9,#0x4
008fd9f0	orr x9,xzr,#-0x5555555555555556
008fd9f4	movk x9,#0xaaab
008fd9f8	mul x25,x10,x9
008fd9fc	sub x10,x8,x24
008fda00	asr x10,x10,#0x4
008fda04	mul x10,x10,x9
008fda08	mov x20,x2
008fda0c	mov x21,x1
008fda10	mov x19,x0
008fda14	cmp x25,x10
008fda18	b.ls 0x008fda64
008fda1c	cbz x24,0x008fdb8c
008fda20	ldr x22,[x19, #0x8]
008fda24	cmp x22,x24
008fda28	b.eq 0x008fdb74
008fda2c	ldurb w8,[x22, #-0x18]
008fda30	tbz w8,#0x0,0x008fda3c
008fda34	ldur x0,[x22, #-0x8]
008fda38	bl 0x00c301d0
008fda3c	ldurb w8,[x22, #-0x30]
008fda40	sub x23,x22,#0x30
008fda44	tbz w8,#0x0,0x008fda50
008fda48	ldur x0,[x22, #-0x20]
008fda4c	bl 0x00c301d0
008fda50	cmp x24,x23
008fda54	mov x22,x23
008fda58	b.ne 0x008fda2c
008fda5c	ldr x0,[x19]
008fda60	b 0x008fdb78
008fda64	ldr x8,[x19, #0x8]
008fda68	sub x8,x8,x24
008fda6c	asr x10,x8,#0x4
008fda70	mul x9,x10,x9
008fda74	add x22,x21,x8
008fda78	cmp x25,x9
008fda7c	csel x8,x22,x20,hi
008fda80	subs x28,x8,x21
008fda84	b.eq 0x008fdaf8
008fda88	mov x26,xzr
008fda8c	stp x9,x8,[sp]
008fda90	cmp x21,x24
008fda94	b.eq 0x008fdae4
008fda98	add x27,x21,x26
008fda9c	ldrb w8,[x27]
008fdaa0	ldp x9,x10,[x27, #0x8]
008fdaa4	add x23,x24,x26
008fdaa8	mov x0,x23
008fdaac	lsr w11,w8,#0x1
008fdab0	tst w8,#0x1
008fdab4	csinc x1,x10,x27,ne
008fdab8	csel x2,x11,x9,eq
008fdabc	bl 0x00c31090
008fdac0	ldrb w8,[x27, #0x18]
008fdac4	ldp x9,x10,[x27, #0x20]
008fdac8	add x11,x27,#0x19
008fdacc	add x0,x23,#0x18
008fdad0	lsr w12,w8,#0x1
008fdad4	tst w8,#0x1
008fdad8	csel x1,x11,x10,eq
008fdadc	csel x2,x12,x9,eq
008fdae0	bl 0x00c31090
008fdae4	add x26,x26,#0x30
008fdae8	cmp x28,x26
008fdaec	b.ne 0x008fda90
008fdaf0	ldp x9,x8,[sp]
008fdaf4	add x24,x24,x26
008fdaf8	cmp x25,x9
008fdafc	b.ls 0x008fdb30
008fdb00	cmp x8,x20
008fdb04	b.eq 0x008fdc10
008fdb08	ldr x0,[x19, #0x8]
008fdb0c	mov x1,x22
008fdb10	bl 0x00c31060
008fdb14	ldr x8,[x19, #0x8]
008fdb18	add x22,x22,#0x30
008fdb1c	cmp x20,x22
008fdb20	add x0,x8,#0x30
008fdb24	str x0,[x19, #0x8]
008fdb28	b.ne 0x008fdb0c
008fdb2c	b 0x008fdc10
008fdb30	ldr x20,[x19, #0x8]
008fdb34	cmp x20,x24
008fdb38	b.eq 0x008fdb6c
008fdb3c	ldurb w8,[x20, #-0x18]
008fdb40	tbz w8,#0x0,0x008fdb4c
008fdb44	ldur x0,[x20, #-0x8]
008fdb48	bl 0x00c301d0
008fdb4c	ldurb w8,[x20, #-0x30]
008fdb50	sub x21,x20,#0x30
008fdb54	tbz w8,#0x0,0x008fdb60
008fdb58	ldur x0,[x20, #-0x20]
008fdb5c	bl 0x00c301d0
008fdb60	cmp x24,x21
008fdb64	mov x20,x21
008fdb68	b.ne 0x008fdb3c
008fdb6c	str x24,[x19, #0x8]
008fdb70	b 0x008fdc10
008fdb74	mov x0,x24
008fdb78	str x24,[x19, #0x8]
008fdb7c	bl 0x00c301d0
008fdb80	mov x8,xzr
008fdb84	stp xzr,xzr,[x19]
008fdb88	str xzr,[x19, #0x10]
008fdb8c	orr x9,xzr,#0x5555555555555555
008fdb90	movk x9,#0x555, LSL #48
008fdb94	cmp x25,x9
008fdb98	b.hi 0x008fdc30
008fdb9c	orr x10,xzr,#-0x5555555555555556
008fdba0	asr x8,x8,#0x4
008fdba4	movk x10,#0xaaab
008fdba8	mul x8,x8,x10
008fdbac	orr x10,xzr,#-0x5555555555555556
008fdbb0	movk x10,#0xaaa9
008fdbb4	movk x10,#0x2aa, LSL #48
008fdbb8	cmp x8,x10
008fdbbc	b.hi 0x008fdbcc
008fdbc0	lsl x8,x8,#0x1
008fdbc4	cmp x8,x25
008fdbc8	csel x9,x25,x8,cc
008fdbcc	add x8,x9,x9, LSL #0x1
008fdbd0	lsl x22,x8,#0x4
008fdbd4	mov x0,x22
008fdbd8	bl 0x00c2fed0
008fdbdc	add x8,x0,x22
008fdbe0	cmp x21,x20
008fdbe4	stp x0,x0,[x19]
008fdbe8	str x8,[x19, #0x10]
008fdbec	b.eq 0x008fdc10
008fdbf0	mov x1,x21
008fdbf4	bl 0x00c31060
008fdbf8	ldr x8,[x19, #0x8]
008fdbfc	add x21,x21,#0x30
008fdc00	cmp x20,x21
008fdc04	add x0,x8,#0x30
008fdc08	str x0,[x19, #0x8]
008fdc0c	b.ne 0x008fdbf0
008fdc10	ldp x29,x30,[sp, #0x60]
008fdc14	ldp x20,x19,[sp, #0x50]
008fdc18	ldp x22,x21,[sp, #0x40]
008fdc1c	ldp x24,x23,[sp, #0x30]
008fdc20	ldp x26,x25,[sp, #0x20]
008fdc24	ldp x28,x27,[sp, #0x10]
008fdc28	add sp,sp,#0x70
008fdc2c	ret
008fdc30	mov x0,x19
008fdc34	bl 0x00c30bd0
