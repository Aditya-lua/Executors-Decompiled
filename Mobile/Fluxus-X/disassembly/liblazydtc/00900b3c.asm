; cpr::util::debugUserFunction @ 00900b3c
00900b3c	sub sp,sp,#0x70
00900b40	str x25,[sp, #0x20]
00900b44	stp x24,x23,[sp, #0x30]
00900b48	stp x22,x21,[sp, #0x40]
00900b4c	stp x20,x19,[sp, #0x50]
00900b50	stp x29,x30,[sp, #0x60]
00900b54	add x29,sp,#0x60
00900b58	mrs x25,tpidr_el0
00900b5c	ldr x8,[x25, #0x28]
00900b60	mov x19,x4
00900b64	mov x21,x3
00900b68	mov x22,x2
00900b6c	mov w20,w1
00900b70	cmn x3,#0x10
00900b74	str x8,[sp, #0x18]
00900b78	stp xzr,xzr,[sp, #0x8]
00900b7c	str xzr,[sp]
00900b80	b.cs 0x00900c28
00900b84	cmp x21,#0x17
00900b88	b.cs 0x00900ba4
00900b8c	mov x9,sp
00900b90	lsl w8,w21,#0x1
00900b94	orr x23,x9,#0x1
00900b98	strb w8,[sp]
00900b9c	cbnz x21,0x00900bc4
00900ba0	b 0x00900bd4
00900ba4	add x8,x21,#0x10
00900ba8	and x24,x8,#-0x10
00900bac	mov x0,x24
00900bb0	bl 0x00c2fed0
00900bb4	orr x8,x24,#0x1
00900bb8	mov x23,x0
00900bbc	stp x21,x0,[sp, #0x8]
00900bc0	str x8,[sp]
00900bc4	mov x0,x23
00900bc8	mov x1,x22
00900bcc	mov x2,x21
00900bd0	bl 0x00c2ffd0
00900bd4	strb wzr,[x23, x21]
00900bd8	mov x2,sp
00900bdc	mov x0,x19
00900be0	mov w1,w20
00900be4	bl 0x00c319a0
00900be8	ldrb w8,[sp]
00900bec	tbz w8,#0x0,0x00900bf8
00900bf0	ldr x0,[sp, #0x10]
00900bf4	bl 0x00c301d0
00900bf8	ldr x8,[x25, #0x28]
00900bfc	ldr x9,[sp, #0x18]
00900c00	cmp x8,x9
00900c04	b.ne 0x00900c30
00900c08	ldp x29,x30,[sp, #0x60]
00900c0c	ldp x20,x19,[sp, #0x50]
00900c10	ldp x22,x21,[sp, #0x40]
00900c14	ldp x24,x23,[sp, #0x30]
00900c18	ldr x25,[sp, #0x20]
00900c1c	mov w0,wzr
00900c20	add sp,sp,#0x70
00900c24	ret
00900c28	mov x0,sp
00900c2c	bl 0x00c30ce0
00900c30	bl 0x00c2fec0
