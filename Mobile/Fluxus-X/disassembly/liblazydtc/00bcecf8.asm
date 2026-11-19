; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry @ 00bcecf8
00bcecf8	paciasp
00bcecfc	sub sp,sp,#0x40
00bced00	stp x29,x30,[sp, #0x10]
00bced04	stp x22,x21,[sp, #0x20]
00bced08	stp x20,x19,[sp, #0x30]
00bced0c	add x29,sp,#0x10
00bced10	ldr x8,[x1]
00bced14	strb wzr,[x0]
00bced18	mov x19,x0
00bced1c	ldur x9,[x8, #-0x18]
00bced20	add x0,x1,x9
00bced24	ldr w9,[x0, #0x20]
00bced28	cbz w9,0x00bced48
00bced2c	orr w1,w9,#0x4
00bced30	ldp x20,x19,[sp, #0x30]
00bced34	ldp x22,x21,[sp, #0x20]
00bced38	ldp x29,x30,[sp, #0x10]
00bced3c	add sp,sp,#0x40
00bced40	autiasp
00bced44	b 0x00c30130
00bced48	ldr x0,[x0, #0x88]
00bced4c	mov x20,x1
00bced50	cbz x0,0x00bced64
00bced54	mov w21,w2
00bced58	bl 0x00c30e50
00bced5c	ldr x8,[x20]
00bced60	mov w2,w21
00bced64	tbnz w2,#0x0,0x00bcee64
00bced68	ldur x9,[x8, #-0x18]
00bced6c	add x0,x20,x9
00bced70	ldrb w9,[x0, #0x9]
00bced74	tbz w9,#0x4,0x00bcee64
00bced78	add x8,sp,#0x8
00bced7c	bl 0x00c30070
00bced80	adrp x1,0xcb4000
00bced84	add x0,sp,#0x8
00bced88	ldr x1,[x1, #0x998]
00bced8c	bl 0x00c30080
00bced90	mov x21,x0
00bced94	add x0,sp,#0x8
00bced98	bl 0x00c30090
00bced9c	ldr x8,[x20]
00bceda0	ldur x8,[x8, #-0x18]
00bceda4	add x8,x20,x8
00bceda8	ldr x22,[x8, #0x28]
00bcedac	cbnz x22,0x00bcedd4
00bcedb0	ldr x8,[x20]
00bcedb4	ldur x8,[x8, #-0x18]
00bcedb8	add x0,x20,x8
00bcedbc	ldr w8,[x0, #0x20]
00bcedc0	orr w1,w8,#0x6
00bcedc4	bl 0x00c30130
00bcedc8	b 0x00bcee60
00bcedcc	add x8,x8,#0x1
00bcedd0	str x8,[x22, #0x18]
00bcedd4	ldp x8,x9,[x22, #0x18]
00bcedd8	cmp x8,x9
00bceddc	b.ne 0x00bcedf8
00bcede0	ldr x8,[x22]
00bcede4	mov x0,x22
00bcede8	ldr x8,[x8, #0x48]
00bcedec	blr x8
00bcedf0	cmn w0,#0x1
00bcedf4	b.eq 0x00bcedb0
00bcedf8	ldp x8,x9,[x22, #0x18]
00bcedfc	cmp x8,x9
00bcee00	b.eq 0x00bcee10
00bcee04	ldrb w8,[x8]
00bcee08	tbz w8,#0x7,0x00bcee28
00bcee0c	b 0x00bcee54
00bcee10	ldr x8,[x22]
00bcee14	mov x0,x22
00bcee18	ldr x8,[x8, #0x48]
00bcee1c	blr x8
00bcee20	and x8,x0,#0xff
00bcee24	tbnz w8,#0x7,0x00bcee54
00bcee28	ldr x9,[x21, #0x10]
00bcee2c	ldr x8,[x9, x8, LSL #0x3]
00bcee30	tbz w8,#0x0,0x00bcee54
00bcee34	ldp x8,x9,[x22, #0x18]
00bcee38	cmp x8,x9
00bcee3c	b.ne 0x00bcedcc
00bcee40	ldr x8,[x22]
00bcee44	mov x0,x22
00bcee48	ldr x8,[x8, #0x50]
00bcee4c	blr x8
00bcee50	b 0x00bcedd4
00bcee54	ldp x8,x9,[x22, #0x18]
00bcee58	cmp x8,x9
00bcee5c	b.eq 0x00bcee94
00bcee60	ldr x8,[x20]
00bcee64	ldur x8,[x8, #-0x18]
00bcee68	add x8,x20,x8
00bcee6c	ldr w8,[x8, #0x20]
00bcee70	cmp w8,#0x0
00bcee74	cset w8,eq
00bcee78	strb w8,[x19]
00bcee7c	ldp x20,x19,[sp, #0x30]
00bcee80	ldp x22,x21,[sp, #0x20]
00bcee84	ldp x29,x30,[sp, #0x10]
00bcee88	add sp,sp,#0x40
00bcee8c	autiasp
00bcee90	ret
00bcee94	ldr x8,[x22]
00bcee98	mov x0,x22
00bcee9c	ldr x8,[x8, #0x48]
00bceea0	blr x8
00bceea4	ldr x8,[x20]
00bceea8	cmn w0,#0x1
00bceeac	b.ne 0x00bcee64
00bceeb0	b 0x00bcedb4
