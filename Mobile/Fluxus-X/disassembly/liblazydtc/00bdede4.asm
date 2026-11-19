; FUN_00bdede4 @ 00bdede4
00bdede4	paciasp
00bdede8	sub sp,sp,#0x100
00bdedec	stp x29,x30,[sp, #0xa0]
00bdedf0	stp x28,x27,[sp, #0xb0]
00bdedf4	stp x26,x25,[sp, #0xc0]
00bdedf8	stp x24,x23,[sp, #0xd0]
00bdedfc	stp x22,x21,[sp, #0xe0]
00bdee00	stp x20,x19,[sp, #0xf0]
00bdee04	add x29,sp,#0xa0
00bdee08	sub x8,x3,x2
00bdee0c	orr x9,xzr,#-0x5555555555555556
00bdee10	mov x19,x5
00bdee14	asr x8,x8,#0x3
00bdee18	movk x9,#0xaaab
00bdee1c	mov x26,x4
00bdee20	mov x22,x3
00bdee24	mov x23,x2
00bdee28	mov x24,x1
00bdee2c	mul x27,x8,x9
00bdee30	mov x25,x0
00bdee34	str w6,[sp, #0x38]
00bdee38	cmp x27,#0x65
00bdee3c	b.cc 0x00bdee58
00bdee40	mov x0,x27
00bdee44	bl 0x00c308d0
00bdee48	str x0,[sp, #0x20]
00bdee4c	str x0,[sp, #0x10]
00bdee50	cbnz x0,0x00bdee64
00bdee54	bl 0x00c43cc0
00bdee58	add x8,sp,#0x3c
00bdee5c	str xzr,[sp, #0x10]
00bdee60	str x8,[sp, #0x20]
00bdee64	cmp x23,x22
00bdee68	str x19,[sp, #0x8]
00bdee6c	b.eq 0x00bdeebc
00bdee70	ldr x10,[sp, #0x20]
00bdee74	mov x21,xzr
00bdee78	mov w8,#0x1
00bdee7c	mov x9,x23
00bdee80	ldrb w11,[x9]
00bdee84	ldr x12,[x9, #0x8]
00bdee88	add x9,x9,#0x18
00bdee8c	lsr x13,x11,#0x1
00bdee90	tst w11,#0x1
00bdee94	csel x11,x13,x12,eq
00bdee98	cmp x11,#0x0
00bdee9c	cset w11,eq
00bdeea0	cinc w12,w8,eq
00bdeea4	cinc x21,x21,eq
00bdeea8	cmp x9,x22
00bdeeac	sub x27,x27,x11
00bdeeb0	strb w12,[x10], #0x1
00bdeeb4	b.ne 0x00bdee80
00bdeeb8	b 0x00bdeec4
00bdeebc	mov x27,xzr
00bdeec0	mov x21,xzr
00bdeec4	mov x19,xzr
00bdeec8	str x25,[sp, #0x28]
00bdeecc	str x23,[sp, #0x18]
00bdeed0	b 0x00bdeedc
00bdeed4	ldr x25,[sp, #0x28]
00bdeed8	add x19,x19,#0x1
00bdeedc	ldr x0,[x25]
00bdeee0	cbz x0,0x00bdef28
00bdeee4	ldp x8,x9,[x0, #0x18]
00bdeee8	cmp x8,x9
00bdeeec	b.eq 0x00bdeef8
00bdeef0	ldr w0,[x8]
00bdeef4	b 0x00bdef04
00bdeef8	ldr x8,[x0]
00bdeefc	ldr x8,[x8, #0x48]
00bdef00	blr x8
00bdef04	cmn w0,#0x1
00bdef08	b.eq 0x00bdef24
00bdef0c	ldr x8,[x25]
00bdef10	cmp x8,#0x0
00bdef14	cset w20,eq
00bdef18	cbnz x24,0x00bdef30
00bdef1c	mov w8,#0x1
00bdef20	b 0x00bdef60
00bdef24	str xzr,[x25]
00bdef28	mov w20,#0x1
00bdef2c	cbz x24,0x00bdef1c
00bdef30	ldp x8,x9,[x24, #0x18]
00bdef34	cmp x8,x9
00bdef38	b.eq 0x00bdef44
00bdef3c	ldr w0,[x8]
00bdef40	b 0x00bdef54
00bdef44	ldr x8,[x24]
00bdef48	ldr x8,[x8, #0x48]
00bdef4c	mov x0,x24
00bdef50	blr x8
00bdef54	cmn w0,#0x1
00bdef58	cset w8,eq
00bdef5c	csel x24,xzr,x24,eq
00bdef60	ldr x0,[x25]
00bdef64	cmp w20,w8
00bdef68	b.eq 0x00bdf120
00bdef6c	cbz x27,0x00bdf120
00bdef70	ldp x8,x9,[x0, #0x18]
00bdef74	cmp x8,x9
00bdef78	b.eq 0x00bdef8c
00bdef7c	ldr w28,[x8]
00bdef80	ldr w8,[sp, #0x38]
00bdef84	tbz w8,#0x0,0x00bdefa4
00bdef88	b 0x00bdefbc
00bdef8c	ldr x8,[x0]
00bdef90	ldr x8,[x8, #0x48]
00bdef94	blr x8
00bdef98	mov w28,w0
00bdef9c	ldr w8,[sp, #0x38]
00bdefa0	tbnz w8,#0x0,0x00bdefbc
00bdefa4	ldr x8,[x26]
00bdefa8	ldr x8,[x8, #0x38]
00bdefac	mov x0,x26
00bdefb0	mov w1,w28
00bdefb4	blr x8
00bdefb8	mov w28,w0
00bdefbc	cmp x23,x22
00bdefc0	b.eq 0x00bdeed4
00bdefc4	mov x20,x23
00bdefc8	ldr x23,[sp, #0x20]
00bdefcc	str x24,[sp, #0x30]
00bdefd0	mov w25,wzr
00bdefd4	add x24,x19,#0x1
00bdefd8	b 0x00bdeff4
00bdefdc	sub x27,x27,#0x1
00bdefe0	strb wzr,[x23]
00bdefe4	add x20,x20,#0x18
00bdefe8	add x23,x23,#0x1
00bdefec	cmp x20,x22
00bdeff0	b.eq 0x00bdf070
00bdeff4	ldrb w8,[x23]
00bdeff8	cmp w8,#0x1
00bdeffc	b.ne 0x00bdefe4
00bdf000	ldrb w8,[x20]
00bdf004	ldr x9,[x20, #0x10]
00bdf008	add x10,x20,#0x4
00bdf00c	tst w8,#0x1
00bdf010	csel x8,x10,x9,eq
00bdf014	ldr w1,[x8, x19, LSL #0x2]
00bdf018	ldr w8,[sp, #0x38]
00bdf01c	tbnz w8,#0x0,0x00bdf034
00bdf020	ldr x8,[x26]
00bdf024	ldr x8,[x8, #0x38]
00bdf028	mov x0,x26
00bdf02c	blr x8
00bdf030	mov w1,w0
00bdf034	cmp w28,w1
00bdf038	b.ne 0x00bdefdc
00bdf03c	ldrb w8,[x20]
00bdf040	ldr x9,[x20, #0x8]
00bdf044	lsr x10,x8,#0x1
00bdf048	tst w8,#0x1
00bdf04c	csel x8,x10,x9,eq
00bdf050	cmp x8,x24
00bdf054	b.ne 0x00bdf068
00bdf058	mov w8,#0x2
00bdf05c	sub x27,x27,#0x1
00bdf060	add x21,x21,#0x1
00bdf064	strb w8,[x23]
00bdf068	mov w25,#0x1
00bdf06c	b 0x00bdefe4
00bdf070	tbz w25,#0x0,0x00bdf098
00bdf074	ldr x25,[sp, #0x28]
00bdf078	ldr x23,[sp, #0x18]
00bdf07c	ldr x0,[x25]
00bdf080	ldp x8,x9,[x0, #0x18]
00bdf084	cmp x8,x9
00bdf088	b.eq 0x00bdf0a8
00bdf08c	add x8,x8,#0x4
00bdf090	str x8,[x0, #0x18]
00bdf094	b 0x00bdf0b4
00bdf098	ldp x25,x24,[sp, #0x28]
00bdf09c	add x19,x19,#0x1
00bdf0a0	ldr x23,[sp, #0x18]
00bdf0a4	b 0x00bdeedc
00bdf0a8	ldr x8,[x0]
00bdf0ac	ldr x8,[x8, #0x50]
00bdf0b0	blr x8
00bdf0b4	add x8,x21,x27
00bdf0b8	ldr x24,[sp, #0x30]
00bdf0bc	cmp x8,#0x2
00bdf0c0	b.cs 0x00bdf0cc
00bdf0c4	add x19,x19,#0x1
00bdf0c8	b 0x00bdeedc
00bdf0cc	ldr x10,[sp, #0x20]
00bdf0d0	add x8,x19,#0x1
00bdf0d4	mov x9,x23
00bdf0d8	b 0x00bdf0ec
00bdf0dc	add x9,x9,#0x18
00bdf0e0	add x10,x10,#0x1
00bdf0e4	cmp x9,x22
00bdf0e8	b.eq 0x00bdf0c4
00bdf0ec	ldrb w11,[x10]
00bdf0f0	cmp w11,#0x2
00bdf0f4	b.ne 0x00bdf0dc
00bdf0f8	ldrb w11,[x9]
00bdf0fc	ldr x12,[x9, #0x8]
00bdf100	lsr x13,x11,#0x1
00bdf104	tst w11,#0x1
00bdf108	csel x11,x13,x12,eq
00bdf10c	cmp x11,x8
00bdf110	b.eq 0x00bdf0dc
00bdf114	sub x21,x21,#0x1
00bdf118	strb wzr,[x10]
00bdf11c	b 0x00bdf0dc
00bdf120	cbz x0,0x00bdf13c
00bdf124	ldp x8,x9,[x0, #0x18]
00bdf128	ldr x20,[sp, #0x8]
00bdf12c	cmp x8,x9
00bdf130	b.eq 0x00bdf150
00bdf134	ldr w0,[x8]
00bdf138	b 0x00bdf15c
00bdf13c	ldr x20,[sp, #0x8]
00bdf140	mov w19,#0x1
00bdf144	cbnz x24,0x00bdf174
00bdf148	tbnz w19,#0x0,0x00bdf1a8
00bdf14c	b 0x00bdf1b4
00bdf150	ldr x8,[x0]
00bdf154	ldr x8,[x8, #0x48]
00bdf158	blr x8
00bdf15c	cmn w0,#0x1
00bdf160	b.eq 0x00bdf21c
00bdf164	ldr x8,[x25]
00bdf168	cmp x8,#0x0
00bdf16c	cset w19,eq
00bdf170	cbz x24,0x00bdf148
00bdf174	ldp x8,x9,[x24, #0x18]
00bdf178	cmp x8,x9
00bdf17c	b.eq 0x00bdf188
00bdf180	ldr w0,[x8]
00bdf184	b 0x00bdf198
00bdf188	ldr x8,[x24]
00bdf18c	ldr x8,[x8, #0x48]
00bdf190	mov x0,x24
00bdf194	blr x8
00bdf198	cmn w0,#0x1
00bdf19c	cset w8,eq
00bdf1a0	eor w8,w19,w8
00bdf1a4	tbnz w8,#0x0,0x00bdf1b4
00bdf1a8	ldr w8,[x20]
00bdf1ac	orr w8,w8,#0x2
00bdf1b0	str w8,[x20]
00bdf1b4	cmp x23,x22
00bdf1b8	b.eq 0x00bdf1dc
00bdf1bc	ldr x9,[sp, #0x20]
00bdf1c0	ldrb w8,[x9]
00bdf1c4	cmp w8,#0x2
00bdf1c8	b.eq 0x00bdf1e8
00bdf1cc	add x23,x23,#0x18
00bdf1d0	add x9,x9,#0x1
00bdf1d4	cmp x23,x22
00bdf1d8	b.ne 0x00bdf1c0
00bdf1dc	ldr w8,[x20]
00bdf1e0	orr w8,w8,#0x4
00bdf1e4	str w8,[x20]
00bdf1e8	ldr x0,[sp, #0x10]
00bdf1ec	cbz x0,0x00bdf1f4
00bdf1f0	bl 0x00c30960
00bdf1f4	mov x0,x23
00bdf1f8	ldp x20,x19,[sp, #0xf0]
00bdf1fc	ldp x22,x21,[sp, #0xe0]
00bdf200	ldp x24,x23,[sp, #0xd0]
00bdf204	ldp x26,x25,[sp, #0xc0]
00bdf208	ldp x28,x27,[sp, #0xb0]
00bdf20c	ldp x29,x30,[sp, #0xa0]
00bdf210	add sp,sp,#0x100
00bdf214	autiasp
00bdf218	ret
00bdf21c	mov w19,#0x1
00bdf220	str xzr,[x25]
00bdf224	cbnz x24,0x00bdf174
00bdf228	b 0x00bdf148
