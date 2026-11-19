; FUN_0089fc60 @ 0089fc60
0089fc60	cmp x1,x2
0089fc64	b.eq 0x0089fd30
0089fc68	stp x29,x30,[sp, #-0x30]!
0089fc6c	str x21,[sp, #0x10]
0089fc70	stp x20,x19,[sp, #0x20]
0089fc74	mov x29,sp
0089fc78	mov x19,x2
0089fc7c	mov x20,x1
0089fc80	mov w8,#0x40
0089fc84	mov x9,x1
0089fc88	ldr x10,[x9]
0089fc8c	ldur q0,[x9, #0x8]
0089fc90	str x10,[x3]
0089fc94	ldr x10,[x9, #0x18]
0089fc98	stur q0,[x3, #0x8]
0089fc9c	str x10,[x3, #0x18]
0089fca0	ldr q0,[x9, #0x20]
0089fca4	ldrb w10,[x9, #0x30]
0089fca8	stp xzr,xzr,[x9, #0x10]
0089fcac	str xzr,[x9, #0x8]
0089fcb0	str q0,[x3, #0x20]
0089fcb4	strb w10,[x3, #0x30]
0089fcb8	add x3,x3,#0x38
0089fcbc	str xzr,[x9]
0089fcc0	stp xzr,xzr,[x9, #0x20]
0089fcc4	strb w8,[x9, #0x30]
0089fcc8	add x9,x9,#0x38
0089fccc	cmp x9,x19
0089fcd0	b.ne 0x0089fc88
0089fcd4	mov w21,#0x40
0089fcd8	b 0x0089fcf0
0089fcdc	ldr x0,[x20, #0x18]
0089fce0	bl 0x00c301d0
0089fce4	add x20,x20,#0x38
0089fce8	cmp x20,x19
0089fcec	b.eq 0x0089fd24
0089fcf0	ldr x0,[x20]
0089fcf4	cbz x0,0x0089fcdc
0089fcf8	bl 0x00c301d0
0089fcfc	ldr x0,[x20, #0x18]
0089fd00	str xzr,[x20]
0089fd04	bl 0x00c301d0
0089fd08	mov x0,xzr
0089fd0c	stp xzr,xzr,[x20, #0x8]
0089fd10	str xzr,[x20, #0x18]
0089fd14	bl 0x00c301d0
0089fd18	str xzr,[x20, #0x20]
0089fd1c	strb w21,[x20, #0x30]
0089fd20	b 0x0089fcdc
0089fd24	ldp x20,x19,[sp, #0x20]
0089fd28	ldr x21,[sp, #0x10]
0089fd2c	ldp x29,x30,[sp], #0x30
0089fd30	ret
