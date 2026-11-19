; FUN_0086ed2c @ 0086ed2c
0086ed2c	stp x29,x30,[sp, #-0x20]!
0086ed30	stp x20,x19,[sp, #0x10]
0086ed34	mov x29,sp
0086ed38	ldp x20,x8,[x0, #0x8]
0086ed3c	mov x19,x0
0086ed40	cmp x20,x8
0086ed44	b.ne 0x0086ed70
0086ed48	ldr x0,[x19]
0086ed4c	cbz x0,0x0086ed98
0086ed50	ldr x8,[x19, #0x18]
0086ed54	sub x1,x8,x0
0086ed58	ldp x20,x19,[sp, #0x10]
0086ed5c	ldp x29,x30,[sp], #0x20
0086ed60	b 0x00c2fe80
0086ed64	cmp x20,x9
0086ed68	mov x8,x9
0086ed6c	b.eq 0x0086ed48
0086ed70	sub x9,x8,#0x28
0086ed74	str x9,[x19, #0x10]
0086ed78	ldurb w10,[x8, #-0x18]
0086ed7c	tbz w10,#0x0,0x0086ed64
0086ed80	ldur x0,[x8, #-0x8]
0086ed84	ldur x8,[x8, #-0x18]
0086ed88	and x1,x8,#-0x2
0086ed8c	bl 0x00c2fe80
0086ed90	ldr x9,[x19, #0x10]
0086ed94	b 0x0086ed64
0086ed98	ldp x20,x19,[sp, #0x10]
0086ed9c	ldp x29,x30,[sp], #0x20
0086eda0	ret
