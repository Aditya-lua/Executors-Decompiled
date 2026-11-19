; BIO_free @ 009fbe48
009fbe48	str x19,[sp, #-0x20]!
009fbe4c	stp x29,x30,[sp, #0x10]
009fbe50	add x29,sp,#0x10
009fbe54	cbz x0,0x009fbf40
009fbe58	mov x19,x0
009fbe5c	add x9,x0,#0x58
009fbe60	ldxr w8,[x9]
009fbe64	subs w10,w8,#0x1
009fbe68	stxr w11,w10,[x9]
009fbe6c	cbnz w11,0x009fbe60
009fbe70	b.ne 0x009fbe84
009fbe74	dmb ISHLD
009fbe78	ldp x9,x8,[x19, #0x10]
009fbe7c	cbnz x9,0x009fbe94
009fbe80	b 0x009fbec0
009fbe84	cmp w8,#0x1
009fbe88	b.gt 0x009fbf34
009fbe8c	ldp x9,x8,[x19, #0x10]
009fbe90	cbz x9,0x009fbec0
009fbe94	cbnz x8,0x009fbec4
009fbe98	mov w1,#0x1
009fbe9c	mov w5,#0x1
009fbea0	mov x0,x19
009fbea4	mov x2,xzr
009fbea8	mov w3,wzr
009fbeac	mov x4,xzr
009fbeb0	blr x9
009fbeb4	cmp w0,#0x1
009fbeb8	b.ge 0x009fbef0
009fbebc	b 0x009fbf3c
009fbec0	cbz x8,0x009fbef0
009fbec4	mov w1,#0x1
009fbec8	mov w6,#0x1
009fbecc	mov x0,x19
009fbed0	mov x2,xzr
009fbed4	mov x3,xzr
009fbed8	mov w4,wzr
009fbedc	mov x5,xzr
009fbee0	mov x7,xzr
009fbee4	blr x8
009fbee8	cmp w0,#0x1
009fbeec	b.lt 0x009fbf3c
009fbef0	ldr x8,[x19, #0x8]
009fbef4	cbz x8,0x009fbf08
009fbef8	ldr x8,[x8, #0x50]
009fbefc	cbz x8,0x009fbf08
009fbf00	mov x0,x19
009fbf04	blr x8
009fbf08	add x2,x19,#0x70
009fbf0c	orr w0,wzr,#0xc
009fbf10	mov x1,x19
009fbf14	bl 0x00c356c0
009fbf18	ldr x0,[x19, #0x80]
009fbf1c	bl 0x00c34d40
009fbf20	adrp x1,0x2b2000
009fbf24	add x1,x1,#0x42
009fbf28	mov w2,#0x9a
009fbf2c	mov x0,x19
009fbf30	bl 0x00c32310
009fbf34	mov w0,#0x1
009fbf38	b 0x009fbf40
009fbf3c	mov w0,wzr
009fbf40	ldp x29,x30,[sp, #0x10]
009fbf44	ldr x19,[sp], #0x20
009fbf48	ret
