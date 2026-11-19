; _INIT_179 @ 008facb4
008facb4	sub sp,sp,#0x130
008facb8	stp x28,x25,[sp, #0xe0]
008facbc	stp x24,x23,[sp, #0xf0]
008facc0	stp x22,x21,[sp, #0x100]
008facc4	stp x20,x19,[sp, #0x110]
008facc8	stp x29,x30,[sp, #0x120]
008faccc	add x29,sp,#0x120
008facd0	mrs x22,tpidr_el0
008facd4	ldr x8,[x22, #0x28]
008facd8	mov x10,#0x6469
008facdc	movk x10,#0x6e65, LSL #16
008face0	movk x10,#0x6974, LSL #32
008face4	movk x10,#0x7974, LSL #48
008face8	str x8,[sp, #0x8]
008facec	mov w8,#0x1
008facf0	stp xzr,xzr,[sp, #0x40]
008facf4	stur x10,[sp, #0x41]
008facf8	orr w10,wzr,#0xe
008facfc	str w8,[sp, #0x58]
008fad00	mov w8,#0x65
008fad04	stp xzr,xzr,[sp, #0x60]
008fad08	strb w10,[sp, #0x60]
008fad0c	mov w10,#0x7461
008fad10	strb w8,[sp, #0x67]
008fad14	mov w8,#0x6564
008fad18	movk w8,#0x6c66, LSL #16
008fad1c	sturh w10,[sp, #0x65]
008fad20	mov w10,#0x2
008fad24	stur w8,[sp, #0x61]
008fad28	mov w8,#0x8
008fad2c	str w10,[sp, #0x78]
008fad30	mov w10,#0x6c7a
008fad34	movk w10,#0x6269, LSL #16
008fad38	stp xzr,xzr,[sp, #0x80]
008fad3c	strb w8,[sp, #0x80]
008fad40	stp xzr,xzr,[sp, #0xa0]
008fad44	strb w8,[sp, #0xa0]
008fad48	mov w8,#0x7a67
008fad4c	mov w9,#0x10
008fad50	stur w10,[sp, #0x81]
008fad54	orr w10,wzr,#0x3
008fad58	add x24,sp,#0x38
008fad5c	movk w8,#0x7069, LSL #16
008fad60	str wzr,[sp, #0x38]
008fad64	str xzr,[sp, #0x50]
008fad68	strb w9,[sp, #0x40]
008fad6c	strb wzr,[sp, #0x49]
008fad70	str xzr,[sp, #0x70]
008fad74	strb wzr,[sp, #0x68]
008fad78	str xzr,[sp, #0x90]
008fad7c	strb wzr,[sp, #0x85]
008fad80	str w10,[sp, #0x98]
008fad84	str xzr,[sp, #0xb0]
008fad88	stur w8,[x24, #0x69]
008fad8c	mov w8,#0x4
008fad90	str w8,[sp, #0xb8]
008fad94	mov x8,#0x6964
008fad98	movk x8,#0x6173, LSL #16
008fad9c	movk x8,#0x6c62, LSL #32
008fada0	adrp x19,0xd1f000
008fada4	movk x8,#0x6465, LSL #48
008fada8	add x19,x19,#0xf40
008fadac	strb wzr,[sp, #0xa5]
008fadb0	stp xzr,xzr,[sp, #0xc0]
008fadb4	strb w9,[sp, #0xc0]
008fadb8	str xzr,[sp, #0xd0]
008fadbc	stur x8,[x24, #0x89]
008fadc0	mov x8,x19
008fadc4	mov x23,xzr
008fadc8	str xzr,[x8, #0x8]!
008fadcc	adrp x25,0xd1f000
008fadd0	strb wzr,[sp, #0xc9]
008fadd4	str xzr,[x19, #0x10]
008fadd8	str x8,[x19]
008faddc	add x21,x24,x23
008fade0	add x1,x19,#0x8
008fade4	add x2,sp,#0x18
008fade8	add x3,sp,#0x10
008fadec	mov x0,x19
008fadf0	mov x4,x21
008fadf4	bl 0x00828d84
008fadf8	ldr x8,[x0]
008fadfc	mov x20,x0
008fae00	cbnz x8,0x008fae4c
008fae04	add x8,sp,#0x20
008fae08	mov x0,x19
008fae0c	mov x1,x21
008fae10	bl 0x00c30d60
008fae14	ldp x8,x1,[sp, #0x18]
008fae18	stp xzr,xzr,[x1]
008fae1c	str x8,[x1, #0x10]
008fae20	str x1,[x20]
008fae24	ldr x8,[x25, #0xf40]
008fae28	ldr x8,[x8]
008fae2c	cbz x8,0x008fae38
008fae30	str x8,[x25, #0xf40]
008fae34	ldr x1,[x20]
008fae38	ldr x0,[x19, #0x8]
008fae3c	bl 0x00c30c90
008fae40	ldr x8,[x19, #0x10]
008fae44	add x8,x8,#0x1
008fae48	str x8,[x19, #0x10]
008fae4c	add x23,x23,#0x20
008fae50	cmp x23,#0xa0
008fae54	b.ne 0x008faddc
008fae58	ldrb w8,[sp, #0xc0]
008fae5c	tbnz w8,#0x0,0x008faed0
008fae60	ldrb w8,[sp, #0xa0]
008fae64	tbnz w8,#0x0,0x008faee0
008fae68	ldrb w8,[sp, #0x80]
008fae6c	tbnz w8,#0x0,0x008faef0
008fae70	ldrb w8,[sp, #0x60]
008fae74	tbnz w8,#0x0,0x008faf00
008fae78	ldrb w8,[sp, #0x40]
008fae7c	tbz w8,#0x0,0x008fae88
008fae80	ldr x0,[sp, #0x50]
008fae84	bl 0x00c301d0
008fae88	adrp x0,0xcb4000
008fae8c	ldr x0,[x0, #0xc60]
008fae90	adrp x1,0xd1f000
008fae94	adrp x2,0xc48000
008fae98	add x1,x1,#0xf40
008fae9c	add x2,x2,#0x880
008faea0	bl 0x00c2fe70
008faea4	ldr x8,[x22, #0x28]
008faea8	ldr x9,[sp, #0x8]
008faeac	cmp x8,x9
008faeb0	b.ne 0x008faf14
008faeb4	ldp x29,x30,[sp, #0x120]
008faeb8	ldp x20,x19,[sp, #0x110]
008faebc	ldp x22,x21,[sp, #0x100]
008faec0	ldp x24,x23,[sp, #0xf0]
008faec4	ldp x28,x25,[sp, #0xe0]
008faec8	add sp,sp,#0x130
008faecc	ret
008faed0	ldr x0,[sp, #0xd0]
008faed4	bl 0x00c301d0
008faed8	ldrb w8,[sp, #0xa0]
008faedc	tbz w8,#0x0,0x008fae68
008faee0	ldr x0,[sp, #0xb0]
008faee4	bl 0x00c301d0
008faee8	ldrb w8,[sp, #0x80]
008faeec	tbz w8,#0x0,0x008fae70
008faef0	ldr x0,[sp, #0x90]
008faef4	bl 0x00c301d0
008faef8	ldrb w8,[sp, #0x60]
008faefc	tbz w8,#0x0,0x008fae78
008faf00	ldr x0,[sp, #0x70]
008faf04	bl 0x00c301d0
008faf08	ldrb w8,[sp, #0x40]
008faf0c	tbnz w8,#0x0,0x008fae80
008faf10	b 0x008fae88
008faf14	bl 0x00c2fec0
