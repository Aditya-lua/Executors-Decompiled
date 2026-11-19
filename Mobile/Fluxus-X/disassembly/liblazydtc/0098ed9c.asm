; ix::WebSocket::checkConnection @ 0098ed9c
0098ed9c	sub sp,sp,#0x1f0
0098eda0	stp x28,x27,[sp, #0x190]
0098eda4	stp x26,x25,[sp, #0x1a0]
0098eda8	stp x24,x23,[sp, #0x1b0]
0098edac	stp x22,x21,[sp, #0x1c0]
0098edb0	stp x20,x19,[sp, #0x1d0]
0098edb4	stp x29,x30,[sp, #0x1e0]
0098edb8	add x29,sp,#0x1e0
0098edbc	mrs x28,tpidr_el0
0098edc0	ldr x8,[x28, #0x28]
0098edc4	mov w27,w1
0098edc8	mov x21,x0
0098edcc	stur x8,[x29, #-0x60]
0098edd0	str xzr,[sp, #0xb0]
0098edd4	bl 0x00c33990
0098edd8	cmp w0,#0x3
0098eddc	b.ne 0x0098ee10
0098ede0	ldr x8,[x28, #0x28]
0098ede4	ldur x9,[x29, #-0x60]
0098ede8	cmp x8,x9
0098edec	b.ne 0x0098f0fc
0098edf0	ldp x29,x30,[sp, #0x1e0]
0098edf4	ldp x20,x19,[sp, #0x1d0]
0098edf8	ldp x22,x21,[sp, #0x1c0]
0098edfc	ldp x24,x23,[sp, #0x1b0]
0098ee00	ldp x26,x25,[sp, #0x1a0]
0098ee04	ldp x28,x27,[sp, #0x190]
0098ee08	add sp,sp,#0x1f0
0098ee0c	ret
0098ee10	add x8,sp,#0xe0
0098ee14	sub x9,x29,#0xc8
0098ee18	add x10,sp,#0x28
0098ee1c	add x11,sp,#0xb8
0098ee20	add x12,sp,#0x58
0098ee24	add x25,x8,#0x18
0098ee28	add x8,x9,#0x9
0098ee2c	mov w22,wzr
0098ee30	add x23,x21,#0x444
0098ee34	add x24,x21,#0x46c
0098ee38	str x8,[sp, #0x8]
0098ee3c	add x20,x10,#0x8
0098ee40	add x19,x9,#0x20
0098ee44	add x26,x11,#0x8
0098ee48	add x8,x12,#0x18
0098ee4c	str x8,[sp]
0098ee50	mov x0,x21
0098ee54	bl 0x00c33990
0098ee58	cbz w0,0x0098ede0
0098ee5c	add x8,x21,#0x400
0098ee60	ldarb w8,[x8]
0098ee64	tbnz w8,#0x0,0x0098ede0
0098ee68	tbnz w27,#0x0,0x0098ee78
0098ee6c	add x8,x21,#0x438
0098ee70	ldarb w8,[x8]
0098ee74	tbz w8,#0x0,0x0098ede0
0098ee78	ldr d0,[sp, #0xb0]
0098ee7c	fcmp d0,#0.0
0098ee80	b.le 0x0098eeb8
0098ee84	mov w8,#0x1
0098ee88	mov x0,x23
0098ee8c	stur x23,[x29, #-0xc8]
0098ee90	sturb w8,[x29, #-0xc0]
0098ee94	bl 0x00c2ff10
0098ee98	sub x1,x29,#0xc8
0098ee9c	add x2,sp,#0xb0
0098eea0	mov x0,x24
0098eea4	bl 0x0098f2d0
0098eea8	ldurb w8,[x29, #-0xc0]
0098eeac	cbz w8,0x0098eeb8
0098eeb0	ldur x0,[x29, #-0xc8]
0098eeb4	bl 0x00c2ff20
0098eeb8	add x8,x21,#0x400
0098eebc	ldarb w8,[x8]
0098eec0	tbnz w8,#0x0,0x0098ede0
0098eec4	add x8,x21,#0x49c
0098eec8	ldar w1,[x8]
0098eecc	sub x8,x29,#0xc8
0098eed0	mov x0,x21
0098eed4	bl 0x00c33980
0098eed8	ldurb w8,[x29, #-0xc8]
0098eedc	cbnz w8,0x0098f0a8
0098eee0	str wzr,[sp, #0xe0]
0098eee4	str xzr,[sp, #0xe8]
0098eee8	str wzr,[sp, #0xf0]
0098eeec	stp xzr,xzr,[x25]
0098eef0	strb wzr,[x25, #0x18]
0098eef4	str xzr,[x25, #0x10]
0098eef8	add x8,x21,#0x438
0098eefc	ldarb w8,[x8]
0098ef00	tbz w8,#0x0,0x0098ef28
0098ef04	ldr w1,[x21, #0x43c]
0098ef08	ldr w2,[x21, #0x440]
0098ef0c	mov w0,w22
0098ef10	bl 0x00c32ef0
0098ef14	add w22,w22,#0x1
0098ef18	ucvtf d0,w0
0098ef1c	str d0,[sp, #0xb0]
0098ef20	str d0,[sp, #0xe8]
0098ef24	str w22,[sp, #0xe0]
0098ef28	ldurb w8,[x29, #-0xc0]
0098ef2c	ldp x10,x9,[x29, #-0xb8]
0098ef30	lsr w11,w8,#0x1
0098ef34	tst w8,#0x1
0098ef38	ldr x8,[sp, #0x8]
0098ef3c	csel x2,x11,x10,eq
0098ef40	csel x1,x8,x9,eq
0098ef44	mov x0,x25
0098ef48	bl 0x00c31090
0098ef4c	ldur w8,[x29, #-0xc4]
0098ef50	orr w9,wzr,#0x3
0098ef54	stp wzr,w9,[sp, #0xa0]
0098ef58	stp xzr,xzr,[sp, #0x40]
0098ef5c	str xzr,[sp, #0x50]
0098ef60	stp xzr,xzr,[x20]
0098ef64	stp xzr,x20,[sp, #0x20]
0098ef68	stp xzr,xzr,[sp, #0x10]
0098ef6c	str w8,[sp, #0xf0]
0098ef70	add x0,sp,#0x58
0098ef74	add x1,sp,#0x40
0098ef78	add x2,sp,#0x28
0098ef7c	add x3,sp,#0x10
0098ef80	bl 0x00c337d0
0098ef84	strh wzr,[sp, #0xb8]
0098ef88	stp xzr,xzr,[x26]
0098ef8c	strb wzr,[x26, #0x18]
0098ef90	str xzr,[x26, #0x10]
0098ef94	adrp x1,0xd21000
0098ef98	add x8,sp,#0xa8
0098ef9c	add x0,sp,#0xa4
0098efa0	add x2,sp,#0xa0
0098efa4	add x3,sp,#0xe0
0098efa8	add x4,sp,#0x58
0098efac	add x5,sp,#0xb8
0098efb0	add x1,x1,#0x6c0
0098efb4	bl 0x00c337a0
0098efb8	ldr x0,[x21, #0x3f0]
0098efbc	cbz x0,0x0098f100
0098efc0	ldr x8,[x0]
0098efc4	ldr x8,[x8, #0x30]
0098efc8	add x1,sp,#0xa8
0098efcc	blr x8
0098efd0	ldr x27,[sp, #0xa8]
0098efd4	str xzr,[sp, #0xa8]
0098efd8	cbz x27,0x0098f030
0098efdc	ldrb w8,[x27, #0xa0]
0098efe0	tbz w8,#0x0,0x0098efec
0098efe4	ldr x0,[x27, #0xb0]
0098efe8	bl 0x00c301d0
0098efec	ldrb w8,[x27, #0x80]
0098eff0	tbz w8,#0x0,0x0098effc
0098eff4	ldr x0,[x27, #0x90]
0098eff8	bl 0x00c301d0
0098effc	ldr x1,[x27, #0x70]
0098f000	add x0,x27,#0x68
0098f004	bl 0x00c32fc0
0098f008	ldrb w8,[x27, #0x50]
0098f00c	tbz w8,#0x0,0x0098f018
0098f010	ldr x0,[x27, #0x60]
0098f014	bl 0x00c301d0
0098f018	ldrb w8,[x27, #0x30]
0098f01c	tbz w8,#0x0,0x0098f028
0098f020	ldr x0,[x27, #0x40]
0098f024	bl 0x00c301d0
0098f028	mov x0,x27
0098f02c	bl 0x00c301d0
0098f030	ldrb w8,[sp, #0xc0]
0098f034	tbz w8,#0x0,0x0098f040
0098f038	ldr x0,[sp, #0xd0]
0098f03c	bl 0x00c301d0
0098f040	ldrb w8,[sp, #0x88]
0098f044	tbz w8,#0x0,0x0098f050
0098f048	ldr x0,[sp, #0x98]
0098f04c	bl 0x00c301d0
0098f050	ldr x1,[sp, #0x78]
0098f054	ldr x0,[sp]
0098f058	bl 0x00c32fc0
0098f05c	ldrb w8,[sp, #0x58]
0098f060	tbz w8,#0x0,0x0098f06c
0098f064	ldr x0,[sp, #0x68]
0098f068	bl 0x00c301d0
0098f06c	ldrb w8,[sp, #0x10]
0098f070	tbz w8,#0x0,0x0098f07c
0098f074	ldr x0,[sp, #0x20]
0098f078	bl 0x00c301d0
0098f07c	ldr x1,[sp, #0x30]
0098f080	add x0,sp,#0x28
0098f084	bl 0x00c32fc0
0098f088	ldrb w8,[sp, #0x40]
0098f08c	tbz w8,#0x0,0x0098f098
0098f090	ldr x0,[sp, #0x50]
0098f094	bl 0x00c301d0
0098f098	ldrb w8,[sp, #0xf8]
0098f09c	tbz w8,#0x0,0x0098f0a8
0098f0a0	ldr x0,[sp, #0x108]
0098f0a4	bl 0x00c301d0
0098f0a8	ldurb w8,[x29, #-0x78]
0098f0ac	tbz w8,#0x0,0x0098f0b8
0098f0b0	ldur x0,[x29, #-0x68]
0098f0b4	bl 0x00c301d0
0098f0b8	ldurb w8,[x29, #-0x90]
0098f0bc	tbz w8,#0x0,0x0098f0c8
0098f0c0	ldur x0,[x29, #-0x80]
0098f0c4	bl 0x00c301d0
0098f0c8	ldur x1,[x29, #-0xa0]
0098f0cc	mov x0,x19
0098f0d0	bl 0x00c32fc0
0098f0d4	ldurb w8,[x29, #-0xc0]
0098f0d8	tbz w8,#0x0,0x0098f0e4
0098f0dc	ldur x0,[x29, #-0xb0]
0098f0e0	bl 0x00c301d0
0098f0e4	mov x0,x21
0098f0e8	bl 0x00c33990
0098f0ec	cmp w0,#0x3
0098f0f0	mov w27,wzr
0098f0f4	b.ne 0x0098ee50
0098f0f8	b 0x0098ede0
0098f0fc	bl 0x00c2fec0
0098f100	mov w0,#0x8
0098f104	bl 0x00c30000
0098f108	adrp x8,0xcb4000
0098f10c	ldr x8,[x8, #0xb50]
0098f110	add x8,x8,#0x10
0098f114	str x8,[x0]
0098f118	adrp x1,0xcb4000
0098f11c	adrp x2,0xcb4000
0098f120	ldr x1,[x1, #0xb58]
0098f124	ldr x2,[x2, #0xb38]
0098f128	bl 0x00c30020
