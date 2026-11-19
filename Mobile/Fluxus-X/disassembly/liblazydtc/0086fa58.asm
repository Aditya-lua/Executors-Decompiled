; FUN_0086fa58 @ 0086fa58
0086fa58	sub sp,sp,#0x60
0086fa5c	stp x29,x30,[sp, #0x40]
0086fa60	stp x20,x19,[sp, #0x50]
0086fa64	add x29,sp,#0x40
0086fa68	mrs x20,tpidr_el0
0086fa6c	mov x19,x0
0086fa70	ldr x8,[x20, #0x28]
0086fa74	stur x8,[x29, #-0x8]
0086fa78	ldrb w8,[x0, #0x30]
0086fa7c	ldrb w9,[x1, #0x30]
0086fa80	cmp w8,w9
0086fa84	b.ne 0x0086fab0
0086fa88	cbz w8,0x0086fb8c
0086fa8c	ldr x0,[x1, #0x20]
0086fa90	cbz x0,0x0086faf0
0086fa94	cmp x0,x1
0086fa98	b.eq 0x0086fb18
0086fa9c	ldr x8,[x0]
0086faa0	ldr x8,[x8, #0x10]
0086faa4	blr x8
0086faa8	str x0,[sp, #0x20]
0086faac	b 0x0086fb30
0086fab0	cbz w8,0x0086facc
0086fab4	ldr x0,[x19, #0x20]
0086fab8	cmp x0,x19
0086fabc	b.eq 0x0086faf8
0086fac0	cbz x0,0x0086fb08
0086fac4	mov w8,#0x28
0086fac8	b 0x0086fafc
0086facc	ldr x0,[x1, #0x20]
0086fad0	cbz x0,0x0086fb10
0086fad4	cmp x0,x1
0086fad8	b.eq 0x0086fb6c
0086fadc	ldr x8,[x0]
0086fae0	ldr x8,[x8, #0x10]
0086fae4	blr x8
0086fae8	str x0,[x19, #0x20]
0086faec	b 0x0086fb84
0086faf0	str xzr,[sp, #0x20]
0086faf4	b 0x0086fb30
0086faf8	mov w8,#0x20
0086fafc	ldr x9,[x0]
0086fb00	ldr x8,[x9, x8#0x0]
0086fb04	blr x8
0086fb08	strb wzr,[x19, #0x30]
0086fb0c	b 0x0086fb8c
0086fb10	str xzr,[x19, #0x20]
0086fb14	b 0x0086fb84
0086fb18	mov x8,sp
0086fb1c	ldr x9,[x0]
0086fb20	mov x1,sp
0086fb24	str x8,[sp, #0x20]
0086fb28	ldr x8,[x9, #0x18]
0086fb2c	blr x8
0086fb30	mov x0,sp
0086fb34	mov x1,x19
0086fb38	mov x19,sp
0086fb3c	bl 0x0086fbb0
0086fb40	ldr x0,[sp, #0x20]
0086fb44	cmp x0,x19
0086fb48	b.eq 0x0086fb58
0086fb4c	cbz x0,0x0086fb8c
0086fb50	mov w8,#0x28
0086fb54	b 0x0086fb5c
0086fb58	mov w8,#0x20
0086fb5c	ldr x9,[x0]
0086fb60	ldr x8,[x9, x8#0x0]
0086fb64	blr x8
0086fb68	b 0x0086fb8c
0086fb6c	str x19,[x19, #0x20]
0086fb70	ldr x0,[x1, #0x20]
0086fb74	mov x1,x19
0086fb78	ldr x8,[x0]
0086fb7c	ldr x8,[x8, #0x18]
0086fb80	blr x8
0086fb84	mov w8,#0x1
0086fb88	strb w8,[x19, #0x30]
0086fb8c	ldr x8,[x20, #0x28]
0086fb90	ldur x9,[x29, #-0x8]
0086fb94	cmp x8,x9
0086fb98	b.ne 0x0086fbac
0086fb9c	ldp x20,x19,[sp, #0x50]
0086fba0	ldp x29,x30,[sp, #0x40]
0086fba4	add sp,sp,#0x60
0086fba8	ret
0086fbac	bl 0x00c2fec0
