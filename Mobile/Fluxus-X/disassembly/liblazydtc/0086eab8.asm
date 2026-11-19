; FUN_0086eab8 @ 0086eab8
0086eab8	sub sp,sp,#0x90
0086eabc	stp x29,x30,[sp, #0x50]
0086eac0	stp x24,x23,[sp, #0x60]
0086eac4	stp x22,x21,[sp, #0x70]
0086eac8	stp x20,x19,[sp, #0x80]
0086eacc	add x29,sp,#0x50
0086ead0	mrs x24,tpidr_el0
0086ead4	ldr x8,[x24, #0x28]
0086ead8	stur x8,[x29, #-0x8]
0086eadc	str x0,[sp, #0x18]
0086eae0	strb wzr,[sp, #0x20]
0086eae4	cbz x3,0x0086ebac
0086eae8	orr x8,xzr,#0x6666666666666666
0086eaec	mov x23,x3
0086eaf0	movk x8,#0x6667
0086eaf4	movk x8,#0x666, LSL #48
0086eaf8	cmp x3,x8
0086eafc	b.cs 0x0086ebd4
0086eb00	add x8,x23,x23, LSL #0x2
0086eb04	mov x19,x0
0086eb08	mov x20,x2
0086eb0c	mov x21,x1
0086eb10	lsl x0,x8,#0x3
0086eb14	bl 0x00c2fed0
0086eb18	mov w8,#0x28
0086eb1c	mov x9,x19
0086eb20	mov x22,x0
0086eb24	madd x8,x23,x8,x0
0086eb28	cmp x21,x20
0086eb2c	stp x0,x0,[x19]
0086eb30	stp x0,x0,[sp, #0x8]
0086eb34	strb wzr,[sp, #0x40]
0086eb38	str x8,[x9, #0x10]!
0086eb3c	add x8,sp,#0x8
0086eb40	stp x9,x8,[sp, #0x28]
0086eb44	add x9,sp,#0x10
0086eb48	str x9,[sp, #0x38]
0086eb4c	b.eq 0x0086eba4
0086eb50	mov x8,x22
0086eb54	b 0x0086eb7c
0086eb58	ldr x10,[x9, #0x10]
0086eb5c	ldr q0,[x9]
0086eb60	stur x10,[x8, #0x20]
0086eb64	stur q0,[x8, #0x10]
0086eb68	add x21,x21,#0x28
0086eb6c	add x8,x8,#0x28
0086eb70	cmp x21,x20
0086eb74	str x8,[sp, #0x10]
0086eb78	b.eq 0x0086eba8
0086eb7c	ldr q0,[x21]
0086eb80	mov x9,x21
0086eb84	str q0,[x8]
0086eb88	ldrb w10,[x9, #0x10]!
0086eb8c	tbz w10,#0x0,0x0086eb58
0086eb90	ldp x2,x1,[x21, #0x18]
0086eb94	add x0,x8,#0x10
0086eb98	bl 0x007ff40c
0086eb9c	ldr x8,[sp, #0x10]
0086eba0	b 0x0086eb68
0086eba4	mov x8,x22
0086eba8	str x8,[x19, #0x8]
0086ebac	ldr x8,[x24, #0x28]
0086ebb0	ldur x9,[x29, #-0x8]
0086ebb4	cmp x8,x9
0086ebb8	b.ne 0x0086ec20
0086ebbc	ldp x20,x19,[sp, #0x80]
0086ebc0	ldp x22,x21,[sp, #0x70]
0086ebc4	ldp x24,x23,[sp, #0x60]
0086ebc8	ldp x29,x30,[sp, #0x50]
0086ebcc	add sp,sp,#0x90
0086ebd0	ret
0086ebd4	ldr x8,[x24, #0x28]
0086ebd8	ldur x9,[x29, #-0x8]
0086ebdc	cmp x8,x9
0086ebe0	b.ne 0x0086ec20
0086ebe4	bl 0x0086ecc0
0086ebe8	mov x20,x0
0086ebec	b 0x0086ec00
0086ec00	add x0,sp,#0x18
0086ec04	bl 0x0086ec24
0086ec08	ldr x8,[x24, #0x28]
0086ec0c	ldur x9,[x29, #-0x8]
0086ec10	cmp x8,x9
0086ec14	b.ne 0x0086ec20
0086ec18	mov x0,x20
0086ec1c	bl 0x00c2c090
0086ec20	bl 0x00c2fec0
