; _INIT_178 @ 008e7050
008e7050	sub sp,sp,#0x130
008e7054	stp x28,x25,[sp, #0xe0]
008e7058	stp x24,x23,[sp, #0xf0]
008e705c	stp x22,x21,[sp, #0x100]
008e7060	stp x20,x19,[sp, #0x110]
008e7064	stp x29,x30,[sp, #0x120]
008e7068	add x29,sp,#0x120
008e706c	mrs x22,tpidr_el0
008e7070	ldr x8,[x22, #0x28]
008e7074	mov x10,#0x6469
008e7078	movk x10,#0x6e65, LSL #16
008e707c	movk x10,#0x6974, LSL #32
008e7080	movk x10,#0x7974, LSL #48
008e7084	str x8,[sp, #0x8]
008e7088	mov w8,#0x1
008e708c	stp xzr,xzr,[sp, #0x40]
008e7090	stur x10,[sp, #0x41]
008e7094	orr w10,wzr,#0xe
008e7098	str w8,[sp, #0x58]
008e709c	mov w8,#0x65
008e70a0	stp xzr,xzr,[sp, #0x60]
008e70a4	strb w10,[sp, #0x60]
008e70a8	mov w10,#0x7461
008e70ac	strb w8,[sp, #0x67]
008e70b0	mov w8,#0x6564
008e70b4	movk w8,#0x6c66, LSL #16
008e70b8	sturh w10,[sp, #0x65]
008e70bc	mov w10,#0x2
008e70c0	stur w8,[sp, #0x61]
008e70c4	mov w8,#0x8
008e70c8	str w10,[sp, #0x78]
008e70cc	mov w10,#0x6c7a
008e70d0	movk w10,#0x6269, LSL #16
008e70d4	stp xzr,xzr,[sp, #0x80]
008e70d8	strb w8,[sp, #0x80]
008e70dc	stp xzr,xzr,[sp, #0xa0]
008e70e0	strb w8,[sp, #0xa0]
008e70e4	mov w8,#0x7a67
008e70e8	mov w9,#0x10
008e70ec	stur w10,[sp, #0x81]
008e70f0	orr w10,wzr,#0x3
008e70f4	add x24,sp,#0x38
008e70f8	movk w8,#0x7069, LSL #16
008e70fc	str wzr,[sp, #0x38]
008e7100	str xzr,[sp, #0x50]
008e7104	strb w9,[sp, #0x40]
008e7108	strb wzr,[sp, #0x49]
008e710c	str xzr,[sp, #0x70]
008e7110	strb wzr,[sp, #0x68]
008e7114	str xzr,[sp, #0x90]
008e7118	strb wzr,[sp, #0x85]
008e711c	str w10,[sp, #0x98]
008e7120	str xzr,[sp, #0xb0]
008e7124	stur w8,[x24, #0x69]
008e7128	mov w8,#0x4
008e712c	str w8,[sp, #0xb8]
008e7130	mov x8,#0x6964
008e7134	movk x8,#0x6173, LSL #16
008e7138	movk x8,#0x6c62, LSL #32
008e713c	adrp x19,0xd1f000
008e7140	movk x8,#0x6465, LSL #48
008e7144	add x19,x19,#0xef8
008e7148	strb wzr,[sp, #0xa5]
008e714c	stp xzr,xzr,[sp, #0xc0]
008e7150	strb w9,[sp, #0xc0]
008e7154	str xzr,[sp, #0xd0]
008e7158	stur x8,[x24, #0x89]
008e715c	mov x8,x19
008e7160	mov x23,xzr
008e7164	str xzr,[x8, #0x8]!
008e7168	adrp x25,0xd1f000
008e716c	strb wzr,[sp, #0xc9]
008e7170	str xzr,[x19, #0x10]
008e7174	str x8,[x19]
008e7178	add x21,x24,x23
008e717c	add x1,x19,#0x8
008e7180	add x2,sp,#0x18
008e7184	add x3,sp,#0x10
008e7188	mov x0,x19
008e718c	mov x4,x21
008e7190	bl 0x00828d84
008e7194	ldr x8,[x0]
008e7198	mov x20,x0
008e719c	cbnz x8,0x008e71e8
008e71a0	add x8,sp,#0x20
008e71a4	mov x0,x19
008e71a8	mov x1,x21
008e71ac	bl 0x00c30d60
008e71b0	ldp x8,x1,[sp, #0x18]
008e71b4	stp xzr,xzr,[x1]
008e71b8	str x8,[x1, #0x10]
008e71bc	str x1,[x20]
008e71c0	ldr x8,[x25, #0xef8]
008e71c4	ldr x8,[x8]
008e71c8	cbz x8,0x008e71d4
008e71cc	str x8,[x25, #0xef8]
008e71d0	ldr x1,[x20]
008e71d4	ldr x0,[x19, #0x8]
008e71d8	bl 0x00c30c90
008e71dc	ldr x8,[x19, #0x10]
008e71e0	add x8,x8,#0x1
008e71e4	str x8,[x19, #0x10]
008e71e8	add x23,x23,#0x20
008e71ec	cmp x23,#0xa0
008e71f0	b.ne 0x008e7178
008e71f4	ldrb w8,[sp, #0xc0]
008e71f8	tbnz w8,#0x0,0x008e726c
008e71fc	ldrb w8,[sp, #0xa0]
008e7200	tbnz w8,#0x0,0x008e727c
008e7204	ldrb w8,[sp, #0x80]
008e7208	tbnz w8,#0x0,0x008e728c
008e720c	ldrb w8,[sp, #0x60]
008e7210	tbnz w8,#0x0,0x008e729c
008e7214	ldrb w8,[sp, #0x40]
008e7218	tbz w8,#0x0,0x008e7224
008e721c	ldr x0,[sp, #0x50]
008e7220	bl 0x00c301d0
008e7224	adrp x0,0xcb4000
008e7228	ldr x0,[x0, #0xc60]
008e722c	adrp x1,0xd1f000
008e7230	adrp x2,0xc48000
008e7234	add x1,x1,#0xef8
008e7238	add x2,x2,#0x880
008e723c	bl 0x00c2fe70
008e7240	ldr x8,[x22, #0x28]
008e7244	ldr x9,[sp, #0x8]
008e7248	cmp x8,x9
008e724c	b.ne 0x008e72b0
008e7250	ldp x29,x30,[sp, #0x120]
008e7254	ldp x20,x19,[sp, #0x110]
008e7258	ldp x22,x21,[sp, #0x100]
008e725c	ldp x24,x23,[sp, #0xf0]
008e7260	ldp x28,x25,[sp, #0xe0]
008e7264	add sp,sp,#0x130
008e7268	ret
008e726c	ldr x0,[sp, #0xd0]
008e7270	bl 0x00c301d0
008e7274	ldrb w8,[sp, #0xa0]
008e7278	tbz w8,#0x0,0x008e7204
008e727c	ldr x0,[sp, #0xb0]
008e7280	bl 0x00c301d0
008e7284	ldrb w8,[sp, #0x80]
008e7288	tbz w8,#0x0,0x008e720c
008e728c	ldr x0,[sp, #0x90]
008e7290	bl 0x00c301d0
008e7294	ldrb w8,[sp, #0x60]
008e7298	tbz w8,#0x0,0x008e7214
008e729c	ldr x0,[sp, #0x70]
008e72a0	bl 0x00c301d0
008e72a4	ldrb w8,[sp, #0x40]
008e72a8	tbnz w8,#0x0,0x008e721c
008e72ac	b 0x008e7224
008e72b0	bl 0x00c2fec0
