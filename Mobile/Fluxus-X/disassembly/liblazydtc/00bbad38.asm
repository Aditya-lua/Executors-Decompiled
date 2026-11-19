; FUN_00bbad38 @ 00bbad38
00bbad38	sub sp,sp,#0xd0
00bbad3c	stp x29,x30,[sp, #0x90]
00bbad40	stp x24,x23,[sp, #0xa0]
00bbad44	stp x22,x21,[sp, #0xb0]
00bbad48	stp x20,x19,[sp, #0xc0]
00bbad4c	add x29,sp,#0x90
00bbad50	mrs x22,tpidr_el0
00bbad54	ldr x19,[x29, #0x40]
00bbad58	ldr x8,[x22, #0x28]
00bbad5c	cmp w2,#0x1
00bbad60	stur x8,[x29, #-0x8]
00bbad64	str w3,[sp, #0x18]
00bbad68	b.gt 0x00bbad7c
00bbad6c	cbnz w2,0x00bbadec
00bbad70	ldr x8,[x29, #0x48]
00bbad74	mov x0,xzr
00bbad78	b 0x00bbae20
00bbad7c	cmp w2,#0x2
00bbad80	b.ne 0x00bbae28
00bbad84	mov w24,w4
00bbad88	mov x21,x0
00bbad8c	mov x23,x1
00bbad90	add x0,sp,#0x1e
00bbad94	add x1,sp,#0x18
00bbad98	add x2,sp,#0x14
00bbad9c	mov x3,x5
00bbada0	mov x4,x6
00bbada4	mov x20,x7
00bbada8	bl 0x00c436e0
00bbadac	cmn x0,#0x78
00bbadb0	b.hi 0x00bbae74
00bbadb4	ldr w5,[sp, #0x14]
00bbadb8	cmp w5,w24
00bbadbc	b.hi 0x00bbae74
00bbadc0	ldr x6,[x29, #0x68]
00bbadc4	ldr w2,[sp, #0x18]
00bbadc8	add x1,sp,#0x1e
00bbadcc	mov x24,x0
00bbadd0	mov x0,x21
00bbadd4	mov x3,x20
00bbadd8	mov x4,x19
00bbaddc	bl 0x00c436f0
00bbade0	mov x0,x24
00bbade4	str x21,[x23]
00bbade8	b 0x00bbae80
00bbadec	cbz x6,0x00bbae7c
00bbadf0	ldrb w8,[x5]
00bbadf4	cmp w3,w8
00bbadf8	b.cc 0x00bbae74
00bbadfc	ldr w9,[x7, w8, UXTW #0x2]
00bbae00	ldrb w8,[x19, w8, UXTW ]
00bbae04	str xzr,[x0]
00bbae08	strb wzr,[x0, #0xb]
00bbae0c	strb w8,[x0, #0xa]
00bbae10	mov x8,x0
00bbae14	strh wzr,[x0, #0x8]
00bbae18	str w9,[x0, #0xc]
00bbae1c	mov w0,#0x1
00bbae20	str x8,[x1]
00bbae24	b 0x00bbae80
00bbae28	ldr w8,[x29, #0x50]
00bbae2c	cbz w8,0x00bbae74
00bbae30	ldr w8,[x29, #0x58]
00bbae34	mov x0,xzr
00bbae38	cbz w8,0x00bbae80
00bbae3c	ldr w8,[x29, #0x60]
00bbae40	cmp w8,#0x19
00bbae44	b.cc 0x00bbae80
00bbae48	mov w9,#0x8
00bbae4c	mov x8,xzr
00bbae50	lsl w10,w9,w4
00bbae54	ldr x9,[x1]
00bbae58	orr w10,w10,#0x8
00bbae5c	prfm PLDL2KEEP,[x9, x8#0x0]
00bbae60	add x8,x8,#0x40
00bbae64	cmp x8,x10
00bbae68	b.cc 0x00bbae5c
00bbae6c	mov x0,xzr
00bbae70	b 0x00bbae80
00bbae74	mov x0,#-0x14
00bbae78	b 0x00bbae80
00bbae7c	mov x0,#-0x48
00bbae80	ldr x8,[x22, #0x28]
00bbae84	ldur x9,[x29, #-0x8]
00bbae88	cmp x8,x9
00bbae8c	b.ne 0x00bbaea8
00bbae90	ldp x20,x19,[sp, #0xc0]
00bbae94	ldp x22,x21,[sp, #0xb0]
00bbae98	ldp x24,x23,[sp, #0xa0]
00bbae9c	ldp x29,x30,[sp, #0x90]
00bbaea0	add sp,sp,#0xd0
00bbaea4	ret
00bbaea8	bl 0x00c2fec0
