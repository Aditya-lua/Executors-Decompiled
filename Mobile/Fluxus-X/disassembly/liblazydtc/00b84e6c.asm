; FUN_00b84e6c @ 00b84e6c
00b84e6c	sub sp,sp,#0xb0
00b84e70	stp x28,x27,[sp, #0x50]
00b84e74	stp x26,x25,[sp, #0x60]
00b84e78	stp x24,x23,[sp, #0x70]
00b84e7c	stp x22,x21,[sp, #0x80]
00b84e80	stp x20,x19,[sp, #0x90]
00b84e84	stp x29,x30,[sp, #0xa0]
00b84e88	add x29,sp,#0xa0
00b84e8c	ldr x8,[x29, #0x10]
00b84e90	mov x25,x5
00b84e94	mov x21,x3
00b84e98	mov x19,x2
00b84e9c	str x8,[sp, #0x20]
00b84ea0	mov w8,#0x2a2a
00b84ea4	movk w8,#0x2a2a, LSL #16
00b84ea8	cmp w6,w8
00b84eac	mov x24,x0
00b84eb0	str x4,[sp, #0x30]
00b84eb4	str w6,[sp, #0x1c]
00b84eb8	str x1,[sp, #0x10]
00b84ebc	str x7,[sp, #0x40]
00b84ec0	b.ne 0x00b84f10
00b84ec4	sxtw x9,w25
00b84ec8	orr x8,xzr,#-0x40
00b84ecc	sub x8,x8,x9, LSL #0x6
00b84ed0	subs x10,x9,#0x1
00b84ed4	b.lt 0x00b84f00
00b84ed8	ldr x11,[sp, #0x30]
00b84edc	add x8,x8,#0x40
00b84ee0	add x9,x11,x9, LSL #0x3
00b84ee4	ldur x11,[x9, #-0x8]
00b84ee8	mov x9,x10
00b84eec	cbz x11,0x00b84ed0
00b84ef0	clz x9,x11
00b84ef4	neg x9,x9
00b84ef8	subs x8,x9,x8
00b84efc	b.ne 0x00b84f04
00b84f00	mov w8,#0x1
00b84f04	lsr x25,x8,#0x6
00b84f08	and x22,x8,#0x3f
00b84f0c	b 0x00b84f14
00b84f10	mov x22,xzr
00b84f14	lsl x10,x25,#0x6
00b84f18	ldr x9,[x19]
00b84f1c	ldr x20,[sp, #0x20]
00b84f20	orr w8,wzr,#0x3
00b84f24	cmp x10,#0x4f
00b84f28	mov w11,#0x1
00b84f2c	csinc x8,x8,xzr,hi
00b84f30	lsl x28,x11,x8
00b84f34	str x8,[sp, #0x28]
00b84f38	lsl x8,x21,x8
00b84f3c	add x27,x20,x8, LSL #0x3
00b84f40	lsl w8,w9,#0x1
00b84f44	lsl x26,x21,#0x3
00b84f48	add w8,w8,#0x4
00b84f4c	str x10,[sp, #0x8]
00b84f50	add x10,x27,x26
00b84f54	and x8,x8,#0x8
00b84f58	str x10,[sp, #0x48]
00b84f5c	add x8,x8,x9
00b84f60	mov w10,#0x2
00b84f64	msub x11,x8,x9,x10
00b84f68	mul x8,x11,x8
00b84f6c	msub x11,x8,x9,x10
00b84f70	mul x8,x11,x8
00b84f74	msub x11,x8,x9,x10
00b84f78	mul x8,x11,x8
00b84f7c	msub x9,x8,x9,x10
00b84f80	mov x0,x20
00b84f84	mov w1,wzr
00b84f88	mov x2,x26
00b84f8c	mneg x23,x8,x9
00b84f90	bl 0x00c301c0
00b84f94	mov w8,#0x1
00b84f98	str x8,[x20]
00b84f9c	ldp x2,x7,[sp, #0x40]
00b84fa0	mov x0,x20
00b84fa4	mov x1,x20
00b84fa8	mov x3,x21
00b84fac	mov x4,x19
00b84fb0	mov x5,x21
00b84fb4	mov x6,x23
00b84fb8	str x23,[sp, #0x40]
00b84fbc	bl 0x00c41e80
00b84fc0	ldr x1,[sp, #0x10]
00b84fc4	add x0,x20,x26
00b84fc8	mov x2,x26
00b84fcc	str x0,[sp, #0x38]
00b84fd0	bl 0x00c2ffd0
00b84fd4	ldr x8,[sp, #0x8]
00b84fd8	cmp x8,#0x50
00b84fdc	b.cc 0x00b85024
00b84fe0	lsl x8,x21,#0x4
00b84fe4	str x8,[sp, #0x10]
00b84fe8	ldr x8,[sp, #0x20]
00b84fec	sub x23,x28,#0x2
00b84ff0	ldr x9,[sp, #0x10]
00b84ff4	ldp x2,x6,[sp, #0x38]
00b84ff8	ldr x7,[sp, #0x48]
00b84ffc	add x20,x8,x26
00b85000	add x0,x8,x9
00b85004	mov x1,x20
00b85008	mov x3,x21
00b8500c	mov x4,x19
00b85010	mov x5,x21
00b85014	bl 0x00c41e80
00b85018	subs x23,x23,#0x1
00b8501c	mov x8,x20
00b85020	b.ne 0x00b84ff0
00b85024	ldr x1,[sp, #0x20]
00b85028	mov x0,x24
00b8502c	mov x2,x26
00b85030	str x19,[sp, #0x38]
00b85034	bl 0x00c2ffd0
00b85038	mov x20,xzr
00b8503c	mov x19,xzr
00b85040	ldp x4,x6,[sp, #0x38]
00b85044	ldr x7,[sp, #0x48]
00b85048	mov x0,x24
00b8504c	mov x1,x24
00b85050	mov x2,x24
00b85054	mov x3,x21
00b85058	mov x5,x21
00b8505c	bl 0x00c41e80
00b85060	cmp x22,#0x0
00b85064	cset w9,eq
00b85068	sub x25,x25,x9
00b8506c	ldr x9,[sp, #0x30]
00b85070	sub x8,x22,#0x1
00b85074	orr w10,wzr,#0x3f
00b85078	csel x22,x10,x8,eq
00b8507c	ldr x9,[x9, x25, LSL #0x3]
00b85080	ldr x8,[sp, #0x28]
00b85084	add x20,x20,#0x1
00b85088	orr x23,x25,x22
00b8508c	cmp x20,x8
00b85090	lsr x8,x9,x22
00b85094	bfm x8,x19,#0x3f,#0x3e
00b85098	b.eq 0x00b850ac
00b8509c	cbz x23,0x00b850ac
00b850a0	mov x19,x8
00b850a4	cbnz x23,0x00b85040
00b850a8	b 0x00b85184
00b850ac	ldr w9,[sp, #0x1c]
00b850b0	mov w10,#0x2a2a
00b850b4	movk w10,#0x2a2a, LSL #16
00b850b8	cmp w9,w10
00b850bc	b.ne 0x00b850e0
00b850c0	ldr x9,[sp, #0x20]
00b850c4	mul x8,x8,x21
00b850c8	mov x0,x27
00b850cc	mov x2,x26
00b850d0	add x1,x9,x8, LSL #0x3
00b850d4	bl 0x00c2ffd0
00b850d8	ldp x6,x7,[sp, #0x40]
00b850dc	b 0x00b85158
00b850e0	ldr x10,[sp, #0x20]
00b850e4	ldp x6,x7,[sp, #0x40]
00b850e8	mov x9,xzr
00b850ec	mov x11,x9
00b850f0	mov x12,x8
00b850f4	eor x12,x12,x11
00b850f8	neg x11,x12
00b850fc	orr x12,x11,x12
00b85100	asr x12,x12,#0x3f
00b85104	cbz x21,0x00b85148
00b85108	cmp x10,x27
00b8510c	b.eq 0x00b85148
00b85110	mov x11,xzr
00b85114	mvn x12,x12
00b85118	lsl x13,x11,#0x3
00b8511c	ldr x14,[x10, x13#0x0]
00b85120	ldr x15,[x27, x13#0x0]
00b85124	mov x16,x12
00b85128	add x11,x11,#0x1
00b8512c	cmp x21,x11
00b85130	and x14,x14,x16
00b85134	mvn x16,x16
00b85138	and x16,x16,x15
00b8513c	orr x16,x14,x16
00b85140	str x16,[x27, x13#0x0]
00b85144	b.ne 0x00b85118
00b85148	add x9,x9,#0x1
00b8514c	cmp x9,x28
00b85150	add x10,x10,x26
00b85154	b.ne 0x00b850ec
00b85158	ldr x4,[sp, #0x38]
00b8515c	mov x0,x24
00b85160	mov x1,x24
00b85164	mov x2,x27
00b85168	mov x3,x21
00b8516c	mov x5,x21
00b85170	bl 0x00c41e80
00b85174	mov x20,xzr
00b85178	mov x8,xzr
00b8517c	mov x19,x8
00b85180	cbnz x23,0x00b85040
00b85184	ldp x29,x30,[sp, #0xa0]
00b85188	ldp x20,x19,[sp, #0x90]
00b8518c	ldp x22,x21,[sp, #0x80]
00b85190	ldp x24,x23,[sp, #0x70]
00b85194	ldp x26,x25,[sp, #0x60]
00b85198	ldp x28,x27,[sp, #0x50]
00b8519c	add sp,sp,#0xb0
00b851a0	ret
