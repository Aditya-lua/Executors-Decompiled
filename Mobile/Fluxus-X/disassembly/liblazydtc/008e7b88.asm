; cpr::Cookie::GetDomain @ 008e7b88
008e7b88	stp x22,x21,[sp, #-0x30]!
008e7b8c	stp x20,x19,[sp, #0x10]
008e7b90	stp x29,x30,[sp, #0x20]
008e7b94	add x29,sp,#0x20
008e7b98	mov x19,x8
008e7b9c	stp xzr,xzr,[x8, #0x8]
008e7ba0	str xzr,[x8]
008e7ba4	mov x8,x0
008e7ba8	ldrb w9,[x8, #0x30]!
008e7bac	tbnz w9,#0x0,0x008e7bc4
008e7bb0	ldr x9,[x8, #0x10]
008e7bb4	str x9,[x19, #0x10]
008e7bb8	ldr q0,[x8]
008e7bbc	str q0,[x19]
008e7bc0	b 0x008e7c20
008e7bc4	ldr x20,[x0, #0x38]
008e7bc8	cmn x20,#0x10
008e7bcc	b.cs 0x008e7c30
008e7bd0	ldr x21,[x0, #0x40]
008e7bd4	cmp x20,#0x17
008e7bd8	b.cs 0x008e7bec
008e7bdc	lsl w8,w20,#0x1
008e7be0	strb w8,[x19], #0x1
008e7be4	cbnz x20,0x008e7c0c
008e7be8	b 0x008e7c1c
008e7bec	add x8,x20,#0x10
008e7bf0	and x22,x8,#-0x10
008e7bf4	mov x0,x22
008e7bf8	bl 0x00c2fed0
008e7bfc	orr x8,x22,#0x1
008e7c00	stp x20,x0,[x19, #0x8]
008e7c04	str x8,[x19]
008e7c08	mov x19,x0
008e7c0c	mov x0,x19
008e7c10	mov x1,x21
008e7c14	mov x2,x20
008e7c18	bl 0x00c2ffd0
008e7c1c	strb wzr,[x19, x20]
008e7c20	ldp x29,x30,[sp, #0x20]
008e7c24	ldp x20,x19,[sp, #0x10]
008e7c28	ldp x22,x21,[sp], #0x30
008e7c2c	ret
008e7c30	mov x0,x19
008e7c34	bl 0x00c30ce0
