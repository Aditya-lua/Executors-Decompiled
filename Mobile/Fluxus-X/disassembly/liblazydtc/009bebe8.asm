; SSL_CTX_flush_sessions @ 009bebe8
009bebe8	stp x26,x25,[sp, #-0x50]!
009bebec	stp x24,x23,[sp, #0x10]
009bebf0	stp x22,x21,[sp, #0x20]
009bebf4	stp x20,x19,[sp, #0x30]
009bebf8	stp x29,x30,[sp, #0x40]
009bebfc	mov x19,x0
009bec00	ldr x0,[x0, #0x3c8]
009bec04	add x29,sp,#0x40
009bec08	mov x20,x1
009bec0c	bl 0x00c356a0
009bec10	cbz w0,0x009bed54
009bec14	bl 0x00c34780
009bec18	ldr x8,[x19, #0x30]
009bec1c	mov x21,x0
009bec20	mov x0,x8
009bec24	bl 0x00c36020
009bec28	ldr x8,[x19, #0x30]
009bec2c	mov x22,x0
009bec30	mov x1,xzr
009bec34	mov x0,x8
009bec38	bl 0x00c36030
009bec3c	mov x24,x19
009bec40	ldr x23,[x24, #0x48]!
009bec44	cbz x23,0x009bed1c
009bec48	add x25,x19,#0x40
009bec4c	mov w26,#0x1
009bec50	cbz x20,0x009bec68
009bec54	ldr w8,[x23, #0x2f0]
009bec58	cbnz w8,0x009bed1c
009bec5c	ldr x8,[x23, #0x2e8]
009bec60	cmp x8,x20
009bec64	b.ge 0x009bed1c
009bec68	ldr x0,[x19, #0x30]
009bec6c	mov x1,x23
009bec70	bl 0x00c36010
009bec74	ldr x9,[x23, #0x328]
009bec78	cbz x9,0x009becd4
009bec7c	ldr x10,[x23, #0x320]
009bec80	cbz x10,0x009becd4
009bec84	cmp x9,x24
009bec88	add x8,x23,#0x320
009bec8c	b.eq 0x009beca8
009bec90	cmp x10,x25
009bec94	b.eq 0x009becbc
009bec98	str x10,[x9, #0x320]
009bec9c	ldr x10,[x8]
009beca0	str x9,[x10, #0x328]
009beca4	b 0x009beccc
009beca8	cmp x10,x25
009becac	b.eq 0x009becc8
009becb0	str x10,[x24]
009becb4	str x24,[x10, #0x328]
009becb8	b 0x009beccc
009becbc	str x9,[x25]
009becc0	str x25,[x9, #0x320]
009becc4	b 0x009beccc
009becc8	stp xzr,xzr,[x25]
009beccc	str xzr,[x23, #0x390]
009becd0	stp xzr,xzr,[x8]
009becd4	str w26,[x23, #0x2b0]
009becd8	ldr x8,[x19, #0x68]
009becdc	cbz x8,0x009becec
009bece0	mov x0,x19
009bece4	mov x1,x23
009bece8	blr x8
009becec	cbz x21,0x009bed0c
009becf0	mov x0,x21
009becf4	mov x1,x23
009becf8	bl 0x00c347a0
009becfc	cbz w0,0x009bed0c
009bed00	ldr x23,[x24]
009bed04	cbnz x23,0x009bec50
009bed08	b 0x009bed1c
009bed0c	mov x0,x23
009bed10	bl 0x009bdb1c
009bed14	ldr x23,[x24]
009bed18	cbnz x23,0x009bec50
009bed1c	ldr x0,[x19, #0x30]
009bed20	mov x1,x22
009bed24	bl 0x00c36030
009bed28	ldr x0,[x19, #0x3c8]
009bed2c	bl 0x00c35690
009bed30	adrp x1,0xcb4000
009bed34	ldr x1,[x1, #0xe78]
009bed38	mov x0,x21
009bed3c	ldp x29,x30,[sp, #0x40]
009bed40	ldp x20,x19,[sp, #0x30]
009bed44	ldp x22,x21,[sp, #0x20]
009bed48	ldp x24,x23,[sp, #0x10]
009bed4c	ldp x26,x25,[sp], #0x50
009bed50	b 0x00c32600
009bed54	ldp x29,x30,[sp, #0x40]
009bed58	ldp x20,x19,[sp, #0x30]
009bed5c	ldp x22,x21,[sp, #0x20]
009bed60	ldp x24,x23,[sp, #0x10]
009bed64	ldp x26,x25,[sp], #0x50
009bed68	ret
