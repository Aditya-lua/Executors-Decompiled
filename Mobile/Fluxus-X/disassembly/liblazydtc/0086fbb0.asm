; FUN_0086fbb0 @ 0086fbb0
0086fbb0	sub sp,sp,#0x60
0086fbb4	stp x29,x30,[sp, #0x30]
0086fbb8	str x21,[sp, #0x40]
0086fbbc	stp x20,x19,[sp, #0x50]
0086fbc0	add x29,sp,#0x30
0086fbc4	mrs x21,tpidr_el0
0086fbc8	ldr x8,[x21, #0x28]
0086fbcc	cmp x1,x0
0086fbd0	stur x8,[x29, #-0x8]
0086fbd4	b.eq 0x0086fce4
0086fbd8	mov x20,x0
0086fbdc	ldr x0,[x0, #0x20]
0086fbe0	ldr x8,[x1, #0x20]
0086fbe4	mov x19,x1
0086fbe8	cmp x0,x20
0086fbec	b.eq 0x0086fc04
0086fbf0	cmp x8,x19
0086fbf4	b.eq 0x0086fc38
0086fbf8	str x8,[x20, #0x20]
0086fbfc	str x0,[x19, #0x20]
0086fc00	b 0x0086fce4
0086fc04	cmp x8,x19
0086fc08	b.eq 0x0086fc6c
0086fc0c	ldr x8,[x0]
0086fc10	ldr x8,[x8, #0x18]
0086fc14	mov x1,x19
0086fc18	blr x8
0086fc1c	ldr x0,[x20, #0x20]
0086fc20	ldr x8,[x0]
0086fc24	ldr x8,[x8, #0x20]
0086fc28	blr x8
0086fc2c	ldr x8,[x19, #0x20]
0086fc30	str x8,[x20, #0x20]
0086fc34	b 0x0086fce0
0086fc38	ldr x9,[x8]
0086fc3c	ldr x9,[x9, #0x18]
0086fc40	mov x0,x8
0086fc44	mov x1,x20
0086fc48	blr x9
0086fc4c	ldr x0,[x19, #0x20]
0086fc50	ldr x8,[x0]
0086fc54	ldr x8,[x8, #0x20]
0086fc58	blr x8
0086fc5c	ldr x8,[x20, #0x20]
0086fc60	str x8,[x19, #0x20]
0086fc64	str x20,[x20, #0x20]
0086fc68	b 0x0086fce4
0086fc6c	ldr x8,[x0]
0086fc70	ldr x8,[x8, #0x18]
0086fc74	mov x1,sp
0086fc78	blr x8
0086fc7c	ldr x0,[x20, #0x20]
0086fc80	ldr x8,[x0]
0086fc84	ldr x8,[x8, #0x20]
0086fc88	blr x8
0086fc8c	str xzr,[x20, #0x20]
0086fc90	ldr x0,[x19, #0x20]
0086fc94	ldr x8,[x0]
0086fc98	ldr x8,[x8, #0x18]
0086fc9c	mov x1,x20
0086fca0	blr x8
0086fca4	ldr x0,[x19, #0x20]
0086fca8	ldr x8,[x0]
0086fcac	ldr x8,[x8, #0x20]
0086fcb0	blr x8
0086fcb4	ldr x8,[sp]
0086fcb8	str xzr,[x19, #0x20]
0086fcbc	str x20,[x20, #0x20]
0086fcc0	ldr x8,[x8, #0x18]
0086fcc4	mov x0,sp
0086fcc8	mov x1,x19
0086fccc	blr x8
0086fcd0	ldr x8,[sp]
0086fcd4	mov x0,sp
0086fcd8	ldr x8,[x8, #0x20]
0086fcdc	blr x8
0086fce0	str x19,[x19, #0x20]
0086fce4	ldr x8,[x21, #0x28]
0086fce8	ldur x9,[x29, #-0x8]
0086fcec	cmp x8,x9
0086fcf0	b.ne 0x0086fd08
0086fcf4	ldp x20,x19,[sp, #0x50]
0086fcf8	ldr x21,[sp, #0x40]
0086fcfc	ldp x29,x30,[sp, #0x30]
0086fd00	add sp,sp,#0x60
0086fd04	ret
0086fd08	bl 0x00c2fec0
