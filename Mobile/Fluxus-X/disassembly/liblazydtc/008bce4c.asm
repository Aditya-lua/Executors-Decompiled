; FUN_008bce4c @ 008bce4c
008bce4c	sub sp,sp,#0x60
008bce50	stp x29,x30,[sp, #0x30]
008bce54	stp x22,x21,[sp, #0x40]
008bce58	stp x20,x19,[sp, #0x50]
008bce5c	add x29,sp,#0x30
008bce60	mrs x22,tpidr_el0
008bce64	mov x21,x1
008bce68	mov x20,x0
008bce6c	ldr x8,[x22, #0x28]
008bce70	mov x0,x1
008bce74	mov x1,x2
008bce78	mov x19,x2
008bce7c	stur x8,[x29, #-0x8]
008bce80	bl 0x008bb440
008bce84	strb wzr,[x21, #0x6]
008bce88	adrp x8,0xd1f000
008bce8c	add x8,x8,#0x1e0
008bce90	ldarb w8,[x8]
008bce94	mov x1,x21
008bce98	adrp x21,0xd1f000
008bce9c	tbz w8,#0x0,0x008bcef4
008bcea0	ldr x8,[x21, #0x1d8]
008bcea4	add x8,x8,#0x7f2, LSL #12
008bcea8	add x8,x8,#0xef0
008bceac	cmp x0,x8
008bceb0	b.ne 0x008bced0
008bceb4	mov w8,#0x5
008bceb8	add x2,sp,#0x18
008bcebc	mov x0,x20
008bcec0	mov x3,x19
008bcec4	str x19,[sp, #0x18]
008bcec8	str w8,[sp, #0x24]
008bcecc	bl 0x008bc8d0
008bced0	ldr x8,[x22, #0x28]
008bced4	ldur x9,[x29, #-0x8]
008bced8	cmp x8,x9
008bcedc	b.ne 0x008bcf60
008bcee0	ldp x20,x19,[sp, #0x50]
008bcee4	ldp x22,x21,[sp, #0x40]
008bcee8	ldp x29,x30,[sp, #0x30]
008bceec	add sp,sp,#0x60
008bcef0	ret
008bcef4	adrp x8,0xd1f000
008bcef8	add x8,x8,#0x1e0
008bcefc	stp x1,x0,[sp, #0x8]
008bcf00	mov x0,x8
008bcf04	bl 0x00c2fe90
008bcf08	mov w8,w0
008bcf0c	ldp x1,x0,[sp, #0x8]
008bcf10	cbz w8,0x008bcea0
008bcf14	adrp x8,0xcca000
008bcf18	ldr x0,[x8, #0x8c8]
008bcf1c	bl 0x007fe1ec
008bcf20	str x0,[x21, #0x1d8]
008bcf24	adrp x0,0xd1f000
008bcf28	add x0,x0,#0x1e0
008bcf2c	bl 0x00c2fea0
008bcf30	ldp x1,x0,[sp, #0x8]
008bcf34	b 0x008bcea0
008bcf60	bl 0x00c2fec0
