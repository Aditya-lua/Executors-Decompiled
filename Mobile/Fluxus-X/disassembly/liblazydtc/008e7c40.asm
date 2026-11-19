; cpr::Cookie::GetPath @ 008e7c40
008e7c40	stp x22,x21,[sp, #-0x30]!
008e7c44	stp x20,x19,[sp, #0x10]
008e7c48	stp x29,x30,[sp, #0x20]
008e7c4c	add x29,sp,#0x20
008e7c50	mov x19,x8
008e7c54	stp xzr,xzr,[x8, #0x8]
008e7c58	str xzr,[x8]
008e7c5c	mov x8,x0
008e7c60	ldrb w9,[x8, #0x50]!
008e7c64	tbnz w9,#0x0,0x008e7c7c
008e7c68	ldr x9,[x8, #0x10]
008e7c6c	str x9,[x19, #0x10]
008e7c70	ldr q0,[x8]
008e7c74	str q0,[x19]
008e7c78	b 0x008e7cd8
008e7c7c	ldr x20,[x0, #0x58]
008e7c80	cmn x20,#0x10
008e7c84	b.cs 0x008e7ce8
008e7c88	ldr x21,[x0, #0x60]
008e7c8c	cmp x20,#0x17
008e7c90	b.cs 0x008e7ca4
008e7c94	lsl w8,w20,#0x1
008e7c98	strb w8,[x19], #0x1
008e7c9c	cbnz x20,0x008e7cc4
008e7ca0	b 0x008e7cd4
008e7ca4	add x8,x20,#0x10
008e7ca8	and x22,x8,#-0x10
008e7cac	mov x0,x22
008e7cb0	bl 0x00c2fed0
008e7cb4	orr x8,x22,#0x1
008e7cb8	stp x20,x0,[x19, #0x8]
008e7cbc	str x8,[x19]
008e7cc0	mov x19,x0
008e7cc4	mov x0,x19
008e7cc8	mov x1,x21
008e7ccc	mov x2,x20
008e7cd0	bl 0x00c2ffd0
008e7cd4	strb wzr,[x19, x20]
008e7cd8	ldp x29,x30,[sp, #0x20]
008e7cdc	ldp x20,x19,[sp, #0x10]
008e7ce0	ldp x22,x21,[sp], #0x30
008e7ce4	ret
008e7ce8	mov x0,x19
008e7cec	bl 0x00c30ce0
