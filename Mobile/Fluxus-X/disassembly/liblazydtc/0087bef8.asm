; FUN_0087bef8 @ 0087bef8
0087bef8	ldr x8,[x0, #0x28]
0087befc	cbz x8,0x0087bfe8
0087bf00	stp x29,x30,[sp, #-0x50]!
0087bf04	str x25,[sp, #0x10]
0087bf08	stp x24,x23,[sp, #0x20]
0087bf0c	stp x22,x21,[sp, #0x30]
0087bf10	stp x20,x19,[sp, #0x40]
0087bf14	mov x29,sp
0087bf18	mov x19,x0
0087bf1c	mov x20,x1
0087bf20	ldr x24,[x0, #0x20]
0087bf24	ldp x0,x1,[x1]
0087bf28	bl 0x008aa250
0087bf2c	mov x8,#0x7c15
0087bf30	ldrb w9,[x19, #0x30]
0087bf34	ldr x22,[x19, #0x18]
0087bf38	movk x8,#0x7f4a, LSL #16
0087bf3c	movk x8,#0x79b9, LSL #32
0087bf40	movk x8,#0x9e37, LSL #48
0087bf44	mul x8,x0,x8
0087bf48	lsr x21,x8,x9
0087bf4c	lsr x8,x21,#0x6
0087bf50	ldr x8,[x22, x8, LSL #0x3]
0087bf54	lsr x8,x8,x21
0087bf58	tbz w8,#0x0,0x0087bfcc
0087bf5c	ldr x23,[x19]
0087bf60	ldp x19,x20,[x20]
0087bf64	sub x24,x24,#0x1
0087bf68	mov w25,#0x18
0087bf6c	b 0x0087bf90
0087bf70	cmp x0,x19
0087bf74	b.eq 0x0087bfc0
0087bf78	add x8,x21,#0x1
0087bf7c	and x21,x8,x24
0087bf80	lsr x8,x21,#0x6
0087bf84	ldr x8,[x22, x8, LSL #0x3]
0087bf88	lsr x8,x8,x21
0087bf8c	tbz w8,#0x0,0x0087bfcc
0087bf90	madd x8,x21,x25,x23
0087bf94	ldr x0,[x8]
0087bf98	cmp x0,#0x0
0087bf9c	ccmp x19,#0x0,#0x4,ne
0087bfa0	b.eq 0x0087bf70
0087bfa4	ldr x8,[x8, #0x8]
0087bfa8	cmp x8,x20
0087bfac	b.ne 0x0087bf78
0087bfb0	mov x1,x19
0087bfb4	mov x2,x20
0087bfb8	bl 0x00c300b0
0087bfbc	cbnz w0,0x0087bf78
0087bfc0	mov w8,#0x18
0087bfc4	madd x0,x21,x8,x23
0087bfc8	b 0x0087bfd0
0087bfcc	mov x0,xzr
0087bfd0	ldp x20,x19,[sp, #0x40]
0087bfd4	ldr x25,[sp, #0x10]
0087bfd8	ldp x22,x21,[sp, #0x30]
0087bfdc	ldp x24,x23,[sp, #0x20]
0087bfe0	ldp x29,x30,[sp], #0x50
0087bfe4	ret
0087bfe8	mov x0,xzr
0087bfec	ret
