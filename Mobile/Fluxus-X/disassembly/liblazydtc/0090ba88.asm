; FUN_0090ba88 @ 0090ba88
0090ba88	sub sp,sp,#0x60
0090ba8c	stp x26,x25,[sp, #0x10]
0090ba90	stp x24,x23,[sp, #0x20]
0090ba94	stp x22,x21,[sp, #0x30]
0090ba98	stp x20,x19,[sp, #0x40]
0090ba9c	stp x29,x30,[sp, #0x50]
0090baa0	add x29,sp,#0x50
0090baa4	mrs x25,tpidr_el0
0090baa8	ldr x8,[x25, #0x28]
0090baac	mov x22,x3
0090bab0	mov w19,w2
0090bab4	mov x20,x1
0090bab8	str x8,[sp, #0x8]
0090babc	ldrb w8,[x1, #0x3a3]
0090bac0	mov x21,x0
0090bac4	mov w23,wzr
0090bac8	tbz w8,#0x0,0x0090bc58
0090bacc	mov w8,#0x1318
0090bad0	ldrb w8,[x21, x8]
0090bad4	cmp w8,#0x1f
0090bad8	b.ne 0x0090bafc
0090badc	mov x0,x21
0090bae0	mov x1,x20
0090bae4	bl 0x00971a84
0090bae8	mov w23,w0
0090baec	cbnz w0,0x0090bc58
0090baf0	mov w26,wzr
0090baf4	mov w23,#0x1
0090baf8	b 0x0090bb24
0090bafc	cmp w8,#0x1e
0090bb00	b.cc 0x0090bb1c
0090bb04	mov x0,x21
0090bb08	mov x1,x20
0090bb0c	bl 0x00971a84
0090bb10	cmp w0,#0x0
0090bb14	cset w23,eq
0090bb18	b 0x0090bb20
0090bb1c	mov w23,wzr
0090bb20	mov w26,#0x1
0090bb24	adrp x8,0xcc4000
0090bb28	add x8,x8,#0x690
0090bb2c	mov w0,#0x1
0090bb30	mov w1,#0x90
0090bb34	str xzr,[sp]
0090bb38	ldr x8,[x8]
0090bb3c	blr x8
0090bb40	mov x24,x0
0090bb44	cbz x0,0x0090bb90
0090bb48	ldrb w8,[x24, #0x54]
0090bb4c	ldrb w9,[x24, #0x84]
0090bb50	adrp x1,0xcc4000
0090bb54	add x1,x1,#0x8a8
0090bb58	and w8,w8,#0xfe
0090bb5c	and w9,w9,#0xfe
0090bb60	orr w8,w8,w23
0090bb64	orr w9,w9,w26
0090bb68	mov x0,sp
0090bb6c	mov x2,x24
0090bb70	str x22,[x24, #0x8]
0090bb74	strb w8,[x24, #0x54]
0090bb78	strb w9,[x24, #0x84]
0090bb7c	bl 0x00907328
0090bb80	mov w23,w0
0090bb84	cbz w0,0x0090bb9c
0090bb88	mov x22,xzr
0090bb8c	b 0x0090bc2c
0090bb90	mov x22,xzr
0090bb94	mov w23,#0x1b
0090bb98	b 0x0090bc2c
0090bb9c	ldr x22,[sp]
0090bba0	ldr x24,[x22, #0x10]
0090bba4	cbz x24,0x0090bc28
0090bba8	mov x22,x24
0090bbac	ldr x0,[x22, #0x30]!
0090bbb0	cbz x0,0x0090bbcc
0090bbb4	mov x1,x21
0090bbb8	bl 0x009074b4
0090bbbc	mov x0,x22
0090bbc0	mov x1,x21
0090bbc4	bl 0x00906ef0
0090bbc8	str xzr,[x22]
0090bbcc	mov x22,x24
0090bbd0	ldr x0,[x22, #0x60]!
0090bbd4	mov w26,#0xffffffff
0090bbd8	stur wzr,[x22, #-0x28]
0090bbdc	stur w26,[x22, #-0x10]
0090bbe0	cbz x0,0x0090bbfc
0090bbe4	mov x1,x21
0090bbe8	bl 0x009074b4
0090bbec	mov x0,x22
0090bbf0	mov x1,x21
0090bbf4	bl 0x00906ef0
0090bbf8	str xzr,[x22]
0090bbfc	str wzr,[x24, #0x68]
0090bc00	str w26,[x24, #0x80]
0090bc04	str wzr,[x24]
0090bc08	str wzr,[x24, #0x20]
0090bc0c	ldr w8,[x21, #0x2e8]
0090bc10	mov w23,wzr
0090bc14	lsr w9,w8,#0x1
0090bc18	stp w9,w8,[x24, #0x88]
0090bc1c	ldr x22,[sp]
0090bc20	mov x24,xzr
0090bc24	b 0x0090bc2c
0090bc28	mov w23,wzr
0090bc2c	adrp x8,0xcc4000
0090bc30	add x8,x8,#0x678
0090bc34	mov x0,x24
0090bc38	ldr x8,[x8]
0090bc3c	blr x8
0090bc40	cbnz w23,0x0090bc58
0090bc44	mov x0,x21
0090bc48	mov x1,x20
0090bc4c	mov w2,w19
0090bc50	mov x3,x22
0090bc54	bl 0x0090738c
0090bc58	ldr x8,[x25, #0x28]
0090bc5c	ldr x9,[sp, #0x8]
0090bc60	cmp x8,x9
0090bc64	b.ne 0x0090bc88
0090bc68	mov w0,w23
0090bc6c	ldp x29,x30,[sp, #0x50]
0090bc70	ldp x20,x19,[sp, #0x40]
0090bc74	ldp x22,x21,[sp, #0x30]
0090bc78	ldp x24,x23,[sp, #0x20]
0090bc7c	ldp x26,x25,[sp, #0x10]
0090bc80	add sp,sp,#0x60
0090bc84	ret
0090bc88	bl 0x00c2fec0
