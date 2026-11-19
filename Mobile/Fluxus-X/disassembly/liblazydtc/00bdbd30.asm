; FUN_00bdbd30 @ 00bdbd30
00bdbd30	paciasp
00bdbd34	sub sp,sp,#0x180
00bdbd38	stp x29,x30,[sp, #0x120]
00bdbd3c	stp x28,x27,[sp, #0x130]
00bdbd40	stp x26,x25,[sp, #0x140]
00bdbd44	stp x24,x23,[sp, #0x150]
00bdbd48	stp x22,x21,[sp, #0x160]
00bdbd4c	stp x20,x19,[sp, #0x170]
00bdbd50	add x29,sp,#0x120
00bdbd54	ldr w8,[x3, #0x8]
00bdbd58	mov w9,#0x4a
00bdbd5c	mov x22,x4
00bdbd60	mov x0,x3
00bdbd64	mov x21,x2
00bdbd68	mov x19,x1
00bdbd6c	ands w8,w8,w9
00bdbd70	sub x26,x29,#0x48
00bdbd74	str x5,[sp, #0x18]
00bdbd78	b.eq 0x00bdbd9c
00bdbd7c	cmp w8,#0x40
00bdbd80	b.eq 0x00bdbd94
00bdbd84	cmp w8,#0x8
00bdbd88	b.ne 0x00bdbda4
00bdbd8c	mov w23,#0x10
00bdbd90	b 0x00bdbda8
00bdbd94	mov w23,#0x8
00bdbd98	b 0x00bdbda8
00bdbd9c	mov w23,wzr
00bdbda0	b 0x00bdbda8
00bdbda4	mov w23,#0xa
00bdbda8	sub x8,x29,#0x28
00bdbdac	sub x1,x29,#0xc
00bdbdb0	bl 0x00c0bec0
00bdbdb4	stp xzr,xzr,[x26, #0x8]
00bdbdb8	str xzr,[x26, #0x18]
00bdbdbc	sub x0,x29,#0x40
00bdbdc0	mov w1,#0x16
00bdbdc4	mov w2,wzr
00bdbdc8	sub x20,x29,#0x40
00bdbdcc	bl 0x00c30250
00bdbdd0	ldurb w8,[x29, #-0x40]
00bdbdd4	add x10,sp,#0x38
00bdbdd8	str x22,[sp, #0x20]
00bdbddc	ldr x9,[x26, #0x18]
00bdbde0	str x10,[sp, #0x30]
00bdbde4	adrp x28,0xcb5000
00bdbde8	tst w8,#0x1
00bdbdec	ldr x28,[x28, #0xc08]
00bdbdf0	orr x27,x20,#0x1
00bdbdf4	csinc x24,x9,x20,ne
00bdbdf8	mov w20,#0x16
00bdbdfc	add x22,sp,#0x30
00bdbe00	str x24,[x26]
00bdbe04	str wzr,[sp, #0x2c]
00bdbe08	b 0x00bdbe14
00bdbe0c	add x8,x8,#0x1
00bdbe10	str x8,[x19, #0x18]
00bdbe14	cbz x19,0x00bdbe40
00bdbe18	ldp x8,x9,[x19, #0x18]
00bdbe1c	cmp x8,x9
00bdbe20	b.eq 0x00bdbe50
00bdbe24	mov w25,wzr
00bdbe28	cbz x21,0x00bdbe48
00bdbe2c	ldp x8,x9,[x21, #0x18]
00bdbe30	cmp x8,x9
00bdbe34	b.eq 0x00bdbe74
00bdbe38	tbnz w25,#0x0,0x00bdbe98
00bdbe3c	b 0x00bdbfdc
00bdbe40	mov w25,#0x1
00bdbe44	cbnz x21,0x00bdbe2c
00bdbe48	tbz w25,#0x0,0x00bdbe98
00bdbe4c	b 0x00bdbfdc
00bdbe50	ldr x8,[x19]
00bdbe54	ldr x8,[x8, #0x48]
00bdbe58	mov x0,x19
00bdbe5c	blr x8
00bdbe60	cmn w0,#0x1
00bdbe64	cset w25,eq
00bdbe68	csel x19,xzr,x19,eq
00bdbe6c	cbnz x21,0x00bdbe2c
00bdbe70	b 0x00bdbe48
00bdbe74	ldr x8,[x21]
00bdbe78	ldr x8,[x8, #0x48]
00bdbe7c	mov x0,x21
00bdbe80	blr x8
00bdbe84	cmn w0,#0x1
00bdbe88	cset w8,eq
00bdbe8c	csel x21,xzr,x21,eq
00bdbe90	cmp w25,w8
00bdbe94	b.eq 0x00bdbfdc
00bdbe98	ldurb w8,[x29, #-0x40]
00bdbe9c	ldr x9,[x26, #0x10]
00bdbea0	ldr x11,[x26]
00bdbea4	lsr x10,x8,#0x1
00bdbea8	tst w8,#0x1
00bdbeac	csel x25,x10,x9,eq
00bdbeb0	add x9,x24,x25
00bdbeb4	cmp x11,x9
00bdbeb8	b.ne 0x00bdbf70
00bdbebc	cmp x25,#0x1
00bdbec0	b.lt 0x00bdbed8
00bdbec4	sub x0,x29,#0x40
00bdbec8	mov x1,x25
00bdbecc	mov w2,wzr
00bdbed0	bl 0x00c30250
00bdbed4	b 0x00bdbefc
00bdbed8	lsl x9,x25,#0x1
00bdbedc	tbnz w8,#0x0,0x00bdbef0
00bdbee0	lsl w8,w9,#0x1
00bdbee4	sturb w8,[x29, #-0x40]
00bdbee8	mov x8,x27
00bdbeec	b 0x00bdbef8
00bdbef0	ldr x8,[x26, #0x18]
00bdbef4	str x9,[x26, #0x10]
00bdbef8	strb wzr,[x8, x9]
00bdbefc	ldp x9,x10,[x26, #0x8]
00bdbf00	ldurb w8,[x29, #-0x40]
00bdbf04	tst w8,#0x1
00bdbf08	and x11,x9,#-0x2
00bdbf0c	ubfx x12,x9,#0x1,#0x7
00bdbf10	sub x11,x11,#0x1
00bdbf14	csel x8,x20,x11,eq
00bdbf18	tst x9,#0x1
00bdbf1c	csel x10,x12,x10,eq
00bdbf20	subs x1,x8,x10
00bdbf24	b.ls 0x00bdbf38
00bdbf28	sub x0,x29,#0x40
00bdbf2c	mov w2,wzr
00bdbf30	bl 0x00c30250
00bdbf34	b 0x00bdbf58
00bdbf38	tbnz w9,#0x0,0x00bdbf4c
00bdbf3c	lsl w9,w8,#0x1
00bdbf40	sturb w9,[x29, #-0x40]
00bdbf44	mov x9,x27
00bdbf48	b 0x00bdbf54
00bdbf4c	ldr x9,[x26, #0x18]
00bdbf50	str x8,[x26, #0x10]
00bdbf54	strb wzr,[x9, x8]
00bdbf58	ldurb w8,[x29, #-0x40]
00bdbf5c	ldr x9,[x26, #0x18]
00bdbf60	tst w8,#0x1
00bdbf64	csel x24,x27,x9,eq
00bdbf68	add x8,x24,x25
00bdbf6c	str x8,[x26]
00bdbf70	ldp x8,x9,[x19, #0x18]
00bdbf74	cmp x8,x9
00bdbf78	b.eq 0x00bdbf84
00bdbf7c	ldrb w0,[x8]
00bdbf80	b 0x00bdbf94
00bdbf84	ldr x8,[x19]
00bdbf88	ldr x8,[x8, #0x48]
00bdbf8c	mov x0,x19
00bdbf90	blr x8
00bdbf94	ldurb w5,[x29, #-0xc]
00bdbf98	sub x3,x29,#0x48
00bdbf9c	add x4,sp,#0x2c
00bdbfa0	sub x6,x29,#0x28
00bdbfa4	add x7,sp,#0x38
00bdbfa8	mov w1,w23
00bdbfac	mov x2,x24
00bdbfb0	stp x22,x28,[sp]
00bdbfb4	bl 0x00c440f0
00bdbfb8	cbnz w0,0x00bdbfdc
00bdbfbc	ldp x8,x9,[x19, #0x18]
00bdbfc0	cmp x8,x9
00bdbfc4	b.ne 0x00bdbe0c
00bdbfc8	ldr x8,[x19]
00bdbfcc	ldr x8,[x8, #0x50]
00bdbfd0	mov x0,x19
00bdbfd4	blr x8
00bdbfd8	b 0x00bdbe14
00bdbfdc	ldurb w8,[x29, #-0x28]
00bdbfe0	ldr x9,[x26, #0x28]
00bdbfe4	ldr x22,[sp, #0x20]
00bdbfe8	lsr x10,x8,#0x1
00bdbfec	tst w8,#0x1
00bdbff0	csel x8,x10,x9,eq
00bdbff4	cbz x8,0x00bdc018
00bdbff8	ldr x8,[sp, #0x30]
00bdbffc	add x9,sp,#0x38
00bdc000	sub x9,x8,x9
00bdc004	cmp x9,#0x9f
00bdc008	b.gt 0x00bdc018
00bdc00c	ldr w9,[sp, #0x2c]
00bdc010	str w9,[x8], #0x4
00bdc014	str x8,[sp, #0x30]
00bdc018	ldr x1,[x26]
00bdc01c	mov x0,x24
00bdc020	mov x2,x22
00bdc024	mov w3,w23
00bdc028	bl 0x00c0c354
00bdc02c	ldurb w10,[x29, #-0x28]
00bdc030	ldr x12,[sp, #0x30]
00bdc034	add x11,sp,#0x38
00bdc038	ldr x8,[x26, #0x28]
00bdc03c	lsr x9,x10,#0x1
00bdc040	ands w13,w10,#0x1
00bdc044	sub x11,x12,x11
00bdc048	csel x8,x9,x8,eq
00bdc04c	ldr x9,[sp, #0x18]
00bdc050	cmp x11,#0x5
00bdc054	str w0,[x9]
00bdc058	b.lt 0x00bdc1b8
00bdc05c	cbz x8,0x00bdc1b8
00bdc060	sub x8,x12,#0x4
00bdc064	add x9,sp,#0x38
00bdc068	cmp x9,x8
00bdc06c	cset w11,cc
00bdc070	cmp x9,x12
00bdc074	b.eq 0x00bdc124
00bdc078	cbz w11,0x00bdc124
00bdc07c	add x10,sp,#0x38
00bdc080	sub x14,x12,#0x8
00bdc084	add x11,x10,#0x4
00bdc088	cmp x14,x11
00bdc08c	csel x13,x14,x11,hi
00bdc090	sub x13,x13,#0x4
00bdc094	cmp x13,x10
00bdc098	cinc x15,x10,ne
00bdc09c	cmp x13,x10
00bdc0a0	sub x15,x13,x15
00bdc0a4	lsr x15,x15,#0x3
00bdc0a8	cinc x13,x15,ne
00bdc0ac	cmp x13,#0x13
00bdc0b0	b.cc 0x00bdc0f8
00bdc0b4	cmp x14,x11
00bdc0b8	csel x14,x14,x11,hi
00bdc0bc	sub x14,x14,#0x4
00bdc0c0	cmp x14,x10
00bdc0c4	cinc x15,x10,ne
00bdc0c8	cmp x14,x10
00bdc0cc	sub x15,x14,x15
00bdc0d0	lsr x15,x15,#0x3
00bdc0d4	cinc x14,x15,ne
00bdc0d8	cmp x10,x12
00bdc0dc	b.cs 0x00bdc29c
00bdc0e0	lsl x14,x14,#0x2
00bdc0e4	sub x15,x12,x14
00bdc0e8	add x11,x11,x14
00bdc0ec	sub x14,x15,#0x4
00bdc0f0	cmp x14,x11
00bdc0f4	b.cs 0x00bdc29c
00bdc0f8	mov x11,x8
00bdc0fc	add x10,x10,#0x4
00bdc100	ldr w12,[x11]
00bdc104	ldur w13,[x10, #-0x4]
00bdc108	stur w12,[x10, #-0x4]
00bdc10c	str w13,[x11], #-0x4
00bdc110	cmp x10,x11
00bdc114	add x10,x10,#0x4
00bdc118	b.cc 0x00bdc100
00bdc11c	ldurb w10,[x29, #-0x28]
00bdc120	and w13,w10,#0x1
00bdc124	ldr x11,[x26, #0x30]
00bdc128	cmp w13,#0x0
00bdc12c	sub x12,x29,#0x28
00bdc130	csinc x11,x11,x12,ne
00bdc134	cmp x9,x8
00bdc138	b.cs 0x00bdc190
00bdc13c	lsr w9,w10,#0x1
00bdc140	ldr x10,[x26, #0x28]
00bdc144	cmp w13,#0x0
00bdc148	csel x9,x9,x10,eq
00bdc14c	add x10,sp,#0x38
00bdc150	add x9,x11,x9
00bdc154	b 0x00bdc170
00bdc158	sub x12,x9,x11
00bdc15c	add x10,x10,#0x4
00bdc160	cmp x12,#0x1
00bdc164	cinc x11,x11,gt
00bdc168	cmp x10,x8
00bdc16c	b.cs 0x00bdc190
00bdc170	ldrb w12,[x11]
00bdc174	cbz w12,0x00bdc158
00bdc178	cmp w12,#0xff
00bdc17c	b.eq 0x00bdc158
00bdc180	ldr w13,[x10]
00bdc184	cmp w13,w12
00bdc188	b.eq 0x00bdc158
00bdc18c	b 0x00bdc1b0
00bdc190	ldrb w9,[x11]
00bdc194	cbz w9,0x00bdc1b8
00bdc198	cmp w9,#0xff
00bdc19c	b.eq 0x00bdc1b8
00bdc1a0	ldr w8,[x8]
00bdc1a4	sub w8,w8,#0x1
00bdc1a8	cmp w8,w9
00bdc1ac	b.cc 0x00bdc1b8
00bdc1b0	mov w8,#0x4
00bdc1b4	str w8,[x22]
00bdc1b8	cbz x19,0x00bdc244
00bdc1bc	ldp x8,x9,[x19, #0x18]
00bdc1c0	cmp x8,x9
00bdc1c4	b.eq 0x00bdc254
00bdc1c8	mov w20,wzr
00bdc1cc	cbz x21,0x00bdc24c
00bdc1d0	ldp x8,x9,[x21, #0x18]
00bdc1d4	cmp x8,x9
00bdc1d8	b.eq 0x00bdc278
00bdc1dc	tbnz w20,#0x0,0x00bdc1ec
00bdc1e0	ldr w8,[x22]
00bdc1e4	orr w8,w8,#0x2
00bdc1e8	str w8,[x22]
00bdc1ec	ldurb w8,[x29, #-0x40]
00bdc1f0	tbz w8,#0x0,0x00bdc204
00bdc1f4	ldr x8,[x26, #0x8]
00bdc1f8	ldr x0,[x26, #0x18]
00bdc1fc	and x1,x8,#-0x2
00bdc200	bl 0x00c2fe80
00bdc204	ldurb w8,[x29, #-0x28]
00bdc208	tbz w8,#0x0,0x00bdc21c
00bdc20c	ldr x8,[x26, #0x20]
00bdc210	ldr x0,[x26, #0x30]
00bdc214	and x1,x8,#-0x2
00bdc218	bl 0x00c2fe80
00bdc21c	mov x0,x19
00bdc220	ldp x20,x19,[sp, #0x170]
00bdc224	ldp x22,x21,[sp, #0x160]
00bdc228	ldp x24,x23,[sp, #0x150]
00bdc22c	ldp x26,x25,[sp, #0x140]
00bdc230	ldp x28,x27,[sp, #0x130]
00bdc234	ldp x29,x30,[sp, #0x120]
00bdc238	add sp,sp,#0x180
00bdc23c	autiasp
00bdc240	ret
00bdc244	mov w20,#0x1
00bdc248	cbnz x21,0x00bdc1d0
00bdc24c	tbnz w20,#0x0,0x00bdc1e0
00bdc250	b 0x00bdc1ec
00bdc254	ldr x8,[x19]
00bdc258	ldr x8,[x8, #0x48]
00bdc25c	mov x0,x19
00bdc260	blr x8
00bdc264	cmn w0,#0x1
00bdc268	cset w20,eq
00bdc26c	csel x19,xzr,x19,eq
00bdc270	cbnz x21,0x00bdc1d0
00bdc274	b 0x00bdc24c
00bdc278	ldr x8,[x21]
00bdc27c	ldr x8,[x8, #0x48]
00bdc280	mov x0,x21
00bdc284	blr x8
00bdc288	cmn w0,#0x1
00bdc28c	cset w8,eq
00bdc290	eor w8,w20,w8
00bdc294	tbz w8,#0x0,0x00bdc1e0
00bdc298	b 0x00bdc1ec
00bdc29c	add x13,x13,#0x1
00bdc2a0	add x15,sp,#0x38
00bdc2a4	sub x12,x12,#0x10
00bdc2a8	and x14,x13,#0x7ffffffffffffff8
00bdc2ac	lsl x10,x14,#0x2
00bdc2b0	mov x16,x14
00bdc2b4	sub x11,x8,x10
00bdc2b8	add x10,x15,x10
00bdc2bc	add x15,x15,#0x10
00bdc2c0	ldp q1,q0,[x12, #-0x10]
00bdc2c4	sub x16,x16,#0x8
00bdc2c8	ldp q2,q3,[x15, #-0x10]
00bdc2cc	rev64 v0.4S,v0.4S
00bdc2d0	rev64 v1.4S,v1.4S
00bdc2d4	rev64 v2.4S,v2.4S
00bdc2d8	rev64 v3.4S,v3.4S
00bdc2dc	ext v0.16B,v0.16B,v0.16B,0x8
00bdc2e0	ext v1.16B,v1.16B,v1.16B,0x8
00bdc2e4	ext v2.16B,v2.16B,v2.16B,0x8
00bdc2e8	ext v3.16B,v3.16B,v3.16B,0x8
00bdc2ec	stp q0,q1,[x15, #-0x10]
00bdc2f0	add x15,x15,#0x20
00bdc2f4	stp q3,q2,[x12, #-0x10]
00bdc2f8	sub x12,x12,#0x20
00bdc2fc	cbnz x16,0x00bdc2c0
00bdc300	cmp x13,x14
00bdc304	b.eq 0x00bdc11c
00bdc308	b 0x00bdc0fc
