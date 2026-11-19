; FUN_00b8df88 @ 00b8df88
00b8df88	sub sp,sp,#0x140
00b8df8c	stp x28,x25,[sp, #0xf0]
00b8df90	stp x24,x23,[sp, #0x100]
00b8df94	stp x22,x21,[sp, #0x110]
00b8df98	stp x20,x19,[sp, #0x120]
00b8df9c	stp x29,x30,[sp, #0x130]
00b8dfa0	add x29,sp,#0x130
00b8dfa4	mrs x23,tpidr_el0
00b8dfa8	ldr x8,[x23, #0x28]
00b8dfac	mov w20,w1
00b8dfb0	mov x19,x0
00b8dfb4	add x0,x0,#0x10
00b8dfb8	mov w2,#0x228
00b8dfbc	mov w1,wzr
00b8dfc0	stur x8,[x29, #-0x48]
00b8dfc4	bl 0x00c301c0
00b8dfc8	mov w9,#0xff00
00b8dfcc	mov w8,#0x609
00b8dfd0	movk w9,#0xf7ff, LSL #16
00b8dfd4	movk w8,#0x800, LSL #16
00b8dfd8	cmp w20,w8
00b8dfdc	add w24,w20,w9
00b8dfe0	b.eq 0x00b8dff4
00b8dfe4	cmp w24,#0x4ff
00b8dfe8	b.ls 0x00b8dff4
00b8dfec	mov w20,#0xffffff7a
00b8dff0	b 0x00b8e008
00b8dff4	cmp w20,w8
00b8dff8	b.ne 0x00b8e038
00b8dffc	mov w20,wzr
00b8e000	mov w8,#0x20
00b8e004	str x8,[x19, #0x8]
00b8e008	ldr x8,[x23, #0x28]
00b8e00c	ldur x9,[x29, #-0x48]
00b8e010	cmp x8,x9
00b8e014	b.ne 0x00b8e170
00b8e018	mov w0,w20
00b8e01c	ldp x29,x30,[sp, #0x130]
00b8e020	ldp x20,x19,[sp, #0x120]
00b8e024	ldp x22,x21,[sp, #0x110]
00b8e028	ldp x24,x23,[sp, #0x100]
00b8e02c	ldp x28,x25,[sp, #0xf0]
00b8e030	add sp,sp,#0x140
00b8e034	ret
00b8e038	mov w8,#0x2000000
00b8e03c	bfxil w8,w20,#0x0,#0x8
00b8e040	tst w20,#0xff
00b8e044	csel w21,wzr,w8,eq
00b8e048	sub w25,w21,#0x3
00b8e04c	and w8,w25,#0xff
00b8e050	cmp w8,#0x10
00b8e054	b.hi 0x00b8dfec
00b8e058	mov w9,#0xe7e7
00b8e05c	and x8,x25,#0xff
00b8e060	movk w9,#0x1, LSL #16
00b8e064	lsr w8,w9,w8
00b8e068	tbz w8,#0x0,0x00b8dfec
00b8e06c	mov x0,sp
00b8e070	mov w2,#0xe8
00b8e074	mov w1,wzr
00b8e078	mov x20,sp
00b8e07c	bl 0x00c301c0
00b8e080	tbnz w21,#0x19,0x00b8e08c
00b8e084	mov w20,#0xffffff79
00b8e088	b 0x00b8e008
00b8e08c	add x22,x20,#0x8
00b8e090	orr w2,wzr,#0xe0
00b8e094	mov x0,x22
00b8e098	mov w1,wzr
00b8e09c	bl 0x00c301c0
00b8e0a0	mov x0,x22
00b8e0a4	mov w1,w21
00b8e0a8	bl 0x00c43020
00b8e0ac	mov w20,w0
00b8e0b0	cbz w0,0x00b8e0d8
00b8e0b4	ldr w8,[sp]
00b8e0b8	cbz w8,0x00b8e0d0
00b8e0bc	cmp w8,#0x1
00b8e0c0	b.ne 0x00b8e0cc
00b8e0c4	mov x0,x22
00b8e0c8	bl 0x00c42fe0
00b8e0cc	str wzr,[sp]
00b8e0d0	cbnz w20,0x00b8e008
00b8e0d4	b 0x00b8e0e8
00b8e0d8	mov w8,#0x1
00b8e0dc	mov x0,x22
00b8e0e0	str w8,[sp]
00b8e0e4	bl 0x00c42fe0
00b8e0e8	lsr w8,w24,#0x8
00b8e0ec	cmp w8,#0x4
00b8e0f0	b.hi 0x00b8dfec
00b8e0f4	adrp x10,0x780000
00b8e0f8	add x10,x10,#0x7e0
00b8e0fc	ldrsw x11,[x10, x8, LSL #0x2]
00b8e100	adrp x8,0x780000
00b8e104	sxtb x9,w25
00b8e108	add x8,x8,#0x920
00b8e10c	ldr x8,[x8, x9, LSL #0x3]
00b8e110	add x9,x11,x10
00b8e114	br x9
00b8e118	lsl x9,x8,#0x8
00b8e11c	mov w20,wzr
00b8e120	sub x8,x9,x8
00b8e124	b 0x00b8e004
00b8e128	mov w8,#0xfff7
00b8e12c	movk w8,#0xfdff, LSL #16
00b8e130	add w8,w21,w8
00b8e134	cmp w8,#0x1
00b8e138	b.hi 0x00b8dfec
00b8e13c	mov w20,wzr
00b8e140	mov x8,#-0x1
00b8e144	b 0x00b8e004
00b8e148	mov w8,#0xfff7
00b8e14c	movk w8,#0xfdff, LSL #16
00b8e150	add w8,w21,w8
00b8e154	cmp w8,#0x1
00b8e158	b.hi 0x00b8dfec
00b8e15c	mov w20,wzr
00b8e160	orr w8,wzr,#0x30
00b8e164	b 0x00b8e004
00b8e168	mov w20,wzr
00b8e16c	b 0x00b8e004
00b8e170	bl 0x00c2fec0
