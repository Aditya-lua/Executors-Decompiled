; FUN_0087bdcc @ 0087bdcc
0087bdcc	stp x29,x30,[sp, #-0x60]!
0087bdd0	stp x28,x27,[sp, #0x10]
0087bdd4	stp x26,x25,[sp, #0x20]
0087bdd8	stp x24,x23,[sp, #0x30]
0087bddc	stp x22,x21,[sp, #0x40]
0087bde0	stp x20,x19,[sp, #0x50]
0087bde4	mov x29,sp
0087bde8	mov x20,x1
0087bdec	mov x19,x0
0087bdf0	ldr x26,[x0, #0x20]
0087bdf4	ldp x0,x1,[x1]
0087bdf8	bl 0x008aa250
0087bdfc	mov x8,#0x7c15
0087be00	ldrb w9,[x19, #0x30]
0087be04	ldr x25,[x19, #0x18]
0087be08	movk x8,#0x7f4a, LSL #16
0087be0c	mov w10,#0x1
0087be10	ldr x24,[x19]
0087be14	movk x8,#0x79b9, LSL #32
0087be18	movk x8,#0x9e37, LSL #48
0087be1c	mul x8,x0,x8
0087be20	lsr x23,x8,x9
0087be24	lsr x8,x23,#0x6
0087be28	lsl x10,x10,x23
0087be2c	ldr x9,[x25, x8, LSL #0x3]
0087be30	tst x10,x9
0087be34	b.eq 0x0087bea4
0087be38	ldp x21,x22,[x20]
0087be3c	sub x26,x26,#0x1
0087be40	mov w27,#0x18
0087be44	mov w28,#0x1
0087be48	b 0x0087be70
0087be4c	cmp x0,x21
0087be50	b.eq 0x0087bed4
0087be54	add x8,x23,#0x1
0087be58	and x23,x8,x26
0087be5c	lsr x8,x23,#0x6
0087be60	lsl x10,x28,x23
0087be64	ldr x9,[x25, x8, LSL #0x3]
0087be68	tst x9,x10
0087be6c	b.eq 0x0087bea4
0087be70	madd x8,x23,x27,x24
0087be74	ldr x0,[x8]
0087be78	cmp x0,#0x0
0087be7c	ccmp x21,#0x0,#0x4,ne
0087be80	b.eq 0x0087be4c
0087be84	ldr x8,[x8, #0x8]
0087be88	cmp x8,x22
0087be8c	b.ne 0x0087be54
0087be90	mov x1,x21
0087be94	mov x2,x22
0087be98	bl 0x00c300b0
0087be9c	cbnz w0,0x0087be54
0087bea0	b 0x0087bed4
0087bea4	mov w11,#0x18
0087bea8	orr x9,x9,x10
0087beac	str x9,[x25, x8, LSL #0x3]
0087beb0	nop
0087beb4	madd x11,x23,x11,x24
0087beb8	ldr q0,[x20]
0087bebc	str q0,[x11]
0087bec0	ldr x8,[x19, #0x28]
0087bec4	ldr x24,[x19]
0087bec8	str wzr,[x11, #0x10]
0087becc	add x8,x8,#0x1
0087bed0	str x8,[x19, #0x28]
0087bed4	mov w8,#0x18
0087bed8	madd x0,x23,x8,x24
0087bedc	ldp x20,x19,[sp, #0x50]
0087bee0	ldp x22,x21,[sp, #0x40]
0087bee4	ldp x24,x23,[sp, #0x30]
0087bee8	ldp x26,x25,[sp, #0x20]
0087beec	ldp x28,x27,[sp, #0x10]
0087bef0	ldp x29,x30,[sp], #0x60
0087bef4	ret
