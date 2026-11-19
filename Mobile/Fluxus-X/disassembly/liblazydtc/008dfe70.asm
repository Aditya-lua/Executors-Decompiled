; FUN_008dfe70 @ 008dfe70
008dfe70	sub sp,sp,#0x1c0
008dfe74	stp x29,x30,[sp, #0x160]
008dfe78	stp x28,x27,[sp, #0x170]
008dfe7c	stp x26,x25,[sp, #0x180]
008dfe80	stp x24,x23,[sp, #0x190]
008dfe84	stp x22,x21,[sp, #0x1a0]
008dfe88	stp x20,x19,[sp, #0x1b0]
008dfe8c	add x29,sp,#0x160
008dfe90	mrs x28,tpidr_el0
008dfe94	mov w20,w6
008dfe98	mov x19,x5
008dfe9c	ldr x8,[x28, #0x28]
008dfea0	mov w21,w4
008dfea4	mov x24,x3
008dfea8	mov x22,x2
008dfeac	mov x25,x1
008dfeb0	mov x23,x0
008dfeb4	stur x8,[x29, #-0x18]
008dfeb8	bl 0x00c30aa0
008dfebc	cmp x25,x0, LSL #0xa
008dfec0	b.ls 0x008dff74
008dfec4	sub x8,x25,#0x1
008dfec8	str x28,[sp, #0x18]
008dfecc	mov w9,#0x400
008dfed0	lsr x8,x8,#0xa
008dfed4	orr x8,x8,#0x1
008dfed8	clz x28,x8
008dfedc	eor x8,x28,#0x3f
008dfee0	lsl x26,x9,x8
008dfee4	add x27,x24,x26, LSR #0xa
008dfee8	sub x25,x25,x26
008dfeec	bl 0x00c30aa0
008dfef0	mov w8,#0x3f
008dfef4	cmp x0,#0x1
008dfef8	lsl x9,x0,#0x5
008dfefc	ccmp x28,x8,#0x4,eq
008dff00	mov w8,#0x40
008dff04	add x5,sp,#0x20
008dff08	and w6,w20,#0x1
008dff0c	mov x0,x23
008dff10	mov x1,x26
008dff14	mov x2,x22
008dff18	mov x3,x24
008dff1c	mov w4,w21
008dff20	csel x28,x8,x9,ne
008dff24	bl 0x008dfe70
008dff28	add x8,sp,#0x20
008dff2c	mov x24,x0
008dff30	add x0,x23,x26
008dff34	add x5,x8,x28
008dff38	and w6,w20,#0x1
008dff3c	mov x1,x25
008dff40	mov x2,x22
008dff44	mov x3,x27
008dff48	mov w4,w21
008dff4c	bl 0x008dfe70
008dff50	cmp x24,#0x1
008dff54	b.ne 0x008dff98
008dff58	ldp q0,q1,[sp, #0x20]
008dff5c	mov w20,#0x2
008dff60	ldr x28,[sp, #0x18]
008dff64	stp q0,q1,[x19]
008dff68	ldp q0,q2,[sp, #0x40]
008dff6c	stp q0,q2,[x19, #0x20]
008dff70	b 0x008e022c
008dff74	subs x8,x25,#0x400
008dff78	b.cc 0x008dffc0
008dff7c	lsr x9,x8,#0xa
008dff80	and x8,x8,#-0x400
008dff84	and x26,x25,#0x3ff
008dff88	add x27,x8,#0x400
008dff8c	add x8,x23,x8
008dff90	add x20,x9,#0x1
008dff94	b 0x008dffcc
008dff98	add x23,x0,x24
008dff9c	subs x8,x23,#0x2
008dffa0	b.cc 0x008e009c
008dffa4	lsr x9,x8,#0x1
008dffa8	cmp x8,#0x6
008dffac	add x20,x9,#0x1
008dffb0	b.cs 0x008e0160
008dffb4	ldr x28,[sp, #0x18]
008dffb8	mov x8,xzr
008dffbc	b 0x008e01bc
008dffc0	mov x27,xzr
008dffc4	mov x20,xzr
008dffc8	mov x26,x25
008dffcc	stur x8,[x29, #-0x48]
008dffd0	mov w8,#0x2
008dffd4	sub x0,x29,#0x48
008dffd8	mov x1,x20
008dffdc	mov w2,#0x10
008dffe0	mov x3,x22
008dffe4	mov x4,x24
008dffe8	mov w5,#0x1
008dffec	mov w6,w21
008dfff0	mov w7,#0x1
008dfff4	str x19,[sp, #0x8]
008dfff8	strb w8,[sp]
008dfffc	bl 0x00c30ab0
008e0000	cmp x25,x27
008e0004	b.ls 0x008e022c
008e0008	movi v0.2D,#0x0
008e000c	ldp q1,q2,[x22]
008e0010	add x8,sp,#0x20
008e0014	add x25,sp,#0xa0
008e0018	add x22,x20,x24
008e001c	strb w21,[sp, #0x8a]
008e0020	cmp x26,#0x41
008e0024	add x24,x8,#0x28
008e0028	add x21,x23,x27
008e002c	stp q1,q2,[sp, #0x20]
008e0030	stur q0,[sp, #0x48]
008e0034	stur q0,[sp, #0x58]
008e0038	stur q0,[sp, #0x68]
008e003c	stur q0,[sp, #0x78]
008e0040	strh wzr,[sp, #0x88]
008e0044	str x22,[sp, #0x40]
008e0048	b.cc 0x008e00ac
008e004c	mov w8,wzr
008e0050	ldrb w9,[sp, #0x8a]
008e0054	tst w8,#0xff
008e0058	ldr x3,[sp, #0x40]
008e005c	cset w8,eq
008e0060	add x0,sp,#0x20
008e0064	mov x1,x21
008e0068	orr w4,w9,w8
008e006c	mov w2,#0x40
008e0070	bl 0x00c30ac0
008e0074	ldrb w8,[sp, #0x89]
008e0078	sub x26,x26,#0x40
008e007c	add x21,x21,#0x40
008e0080	cmp x26,#0x40
008e0084	add w8,w8,#0x1
008e0088	strb w8,[sp, #0x89]
008e008c	b.hi 0x008e0050
008e0090	ldrb w8,[sp, #0x88]
008e0094	ldr x22,[sp, #0x40]
008e0098	b 0x008e00b0
008e009c	ldr x28,[sp, #0x18]
008e00a0	mov x20,xzr
008e00a4	mov x24,xzr
008e00a8	b 0x008e01e0
008e00ac	mov x8,xzr
008e00b0	mov w9,#0x40
008e00b4	add x0,x24,x8
008e00b8	mov x1,x21
008e00bc	sub x9,x9,x8
008e00c0	cmp x9,x26
008e00c4	csel x23,x9,x26,cc
008e00c8	mov x2,x23
008e00cc	bl 0x00c2ffd0
008e00d0	ldp q0,q1,[sp, #0x20]
008e00d4	sub x0,x29,#0x40
008e00d8	ldrb w8,[sp, #0x88]
008e00dc	ldrb w9,[sp, #0x89]
008e00e0	mov x3,x22
008e00e4	ldp q3,q4,[sp, #0x20]
008e00e8	add x19,x19,x20, LSL #0x5
008e00ec	stp q0,q1,[sp, #0xa0]
008e00f0	ldp q2,q0,[x24]
008e00f4	add w2,w8,w23
008e00f8	cmp w9,#0x0
008e00fc	ldrb w8,[sp, #0x8a]
008e0100	cset w9,eq
008e0104	strb w2,[sp, #0x88]
008e0108	stur q0,[x25, #0x38]
008e010c	ldp q1,q0,[x24, #0x20]
008e0110	orr w8,w8,w9
008e0114	stur q2,[x25, #0x28]
008e0118	orr w4,w8,#0x2
008e011c	add x8,sp,#0xa0
008e0120	strb w2,[sp, #0x108]
008e0124	add x1,x8,#0x28
008e0128	stur q1,[x25, #0x48]
008e012c	stur q0,[x25, #0x58]
008e0130	str x22,[sp, #0xc0]
008e0134	strb w4,[sp, #0x109]
008e0138	stp q3,q4,[x29, #-0x40]
008e013c	bl 0x00c30ac0
008e0140	ldp w8,w9,[x29, #-0x40]
008e0144	ldur q0,[x25, #0x88]
008e0148	add x20,x20,#0x1
008e014c	stp w8,w9,[x19]
008e0150	ldp w8,w9,[x29, #-0x28]
008e0154	stur q0,[x19, #0x8]
008e0158	stp w8,w9,[x19, #0x18]
008e015c	b 0x008e022c
008e0160	mov w8,#0x80
008e0164	add x10,sp,#0x20
008e0168	mov w11,#0x4
008e016c	adrp x9,0x29c000
008e0170	dup v0.2D,x8
008e0174	dup v1.2D,x10
008e0178	dup v2.2D,x11
008e017c	and x8,x20,#-0x4
008e0180	ldr q3,[x9, #0x550]
008e0184	add x9,sp,#0xa0
008e0188	mov x10,x8
008e018c	add x9,x9,#0x10
008e0190	shl v4.2D,v3.2D,0x6
008e0194	add v3.2D,v3.2D,v2.2D
008e0198	subs x10,x10,#0x4
008e019c	add v4.2D,v1.2D,v4.2D
008e01a0	add v5.2D,v4.2D,v0.2D
008e01a4	stp q4,q5,[x9, #-0x10]
008e01a8	add x9,x9,#0x20
008e01ac	b.ne 0x008e0190
008e01b0	ldr x28,[sp, #0x18]
008e01b4	cmp x20,x8
008e01b8	b.eq 0x008e01dc
008e01bc	add x9,sp,#0x20
008e01c0	add x10,sp,#0xa0
008e01c4	add x9,x9,x8, LSL #0x6
008e01c8	str x9,[x10, x8, LSL #0x3]
008e01cc	add x8,x8,#0x1
008e01d0	add x9,x9,#0x40
008e01d4	cmp x20,x8
008e01d8	b.ne 0x008e01c8
008e01dc	lsl x24,x8,#0x1
008e01e0	mov x4,xzr
008e01e4	mov w5,wzr
008e01e8	mov w7,wzr
008e01ec	add x0,sp,#0xa0
008e01f0	orr w6,w21,#0x4
008e01f4	mov x1,x20
008e01f8	mov w2,#0x1
008e01fc	mov x3,x22
008e0200	str x19,[sp, #0x8]
008e0204	strb wzr,[sp]
008e0208	bl 0x00c30ab0
008e020c	cmp x23,x24
008e0210	b.ls 0x008e022c
008e0214	add x8,sp,#0x20
008e0218	add x9,x19,x20, LSL #0x5
008e021c	add x8,x8,x20, LSL #0x6
008e0220	add x20,x20,#0x1
008e0224	ldp q0,q1,[x8]
008e0228	stp q0,q1,[x9]
008e022c	ldr x8,[x28, #0x28]
008e0230	ldur x9,[x29, #-0x18]
008e0234	cmp x8,x9
008e0238	b.ne 0x008e0260
008e023c	mov x0,x20
008e0240	ldp x20,x19,[sp, #0x1b0]
008e0244	ldp x22,x21,[sp, #0x1a0]
008e0248	ldp x24,x23,[sp, #0x190]
008e024c	ldp x26,x25,[sp, #0x180]
008e0250	ldp x28,x27,[sp, #0x170]
008e0254	ldp x29,x30,[sp, #0x160]
008e0258	add sp,sp,#0x1c0
008e025c	ret
008e0260	bl 0x00c2fec0
