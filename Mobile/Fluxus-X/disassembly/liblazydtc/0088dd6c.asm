; FUN_0088dd6c @ 0088dd6c
0088dd6c	sub sp,sp,#0x30
0088dd70	stp x29,x30,[sp, #0x10]
0088dd74	stp x20,x19,[sp, #0x20]
0088dd78	add x29,sp,#0x10
0088dd7c	mrs x20,tpidr_el0
0088dd80	mov x19,x0
0088dd84	ldr x8,[x20, #0x28]
0088dd88	str x8,[sp, #0x8]
0088dd8c	ldr x9,[x0, #0x7a8]
0088dd90	ldr x8,[x0, #0x7a0]
0088dd94	str x1,[sp]
0088dd98	subs x9,x9,x8
0088dd9c	b.eq 0x0088ddd0
0088dda0	asr x9,x9,#0x3
0088dda4	mov x0,xzr
0088dda8	cmp x9,#0x1
0088ddac	csinc x10,x9,xzr,hi
0088ddb0	ldr x11,[x8, x0, LSL #0x3]
0088ddb4	cmp x11,x1
0088ddb8	b.eq 0x0088ded0
0088ddbc	add x0,x0,#0x1
0088ddc0	cmp x10,x0
0088ddc4	b.ne 0x0088ddb0
0088ddc8	cmp x9,#0xc8
0088ddcc	b.cs 0x0088def0
0088ddd0	ldr x8,[x19, #0x138]
0088ddd4	cbz x8,0x0088deb0
0088ddd8	lsl w8,w1,#0x3
0088dddc	mov x10,#0x2d69
0088dde0	lsr x9,x1,#0x20
0088dde4	movk x10,#0xeb38, LSL #16
0088dde8	add x8,x8,#0x8
0088ddec	movk x10,#0xea08, LSL #32
0088ddf0	eor x8,x8,x9
0088ddf4	movk x10,#0x9ddf, LSL #48
0088ddf8	mul x8,x8,x10
0088ddfc	eor x9,x9,x8, LSR #0x2f
0088de00	eor x8,x9,x8
0088de04	mov x9,#0x959d
0088de08	mul x8,x8,x10
0088de0c	movk x9,#0xb8f4, LSL #16
0088de10	movk x9,#0xd34f, LSL #32
0088de14	movk x9,#0x949d, LSL #48
0088de18	eor x8,x8,x8, LSR #0x2f
0088de1c	mul x8,x8,x9
0088de20	ldrb w9,[x19, #0x140]
0088de24	lsr x9,x8,x9
0088de28	ldr x8,[x19, #0x128]
0088de2c	lsr x10,x9,#0x6
0088de30	ldr x10,[x8, x10, LSL #0x3]
0088de34	lsr x10,x10,x9
0088de38	tbz w10,#0x0,0x0088deb0
0088de3c	ldr x11,[x19, #0x130]
0088de40	ldr x10,[x19, #0x110]
0088de44	mov w12,#0x28
0088de48	sub x11,x11,#0x1
0088de4c	madd x13,x9,x12,x10
0088de50	ldr x14,[x13]
0088de54	cmp x14,x1
0088de58	b.eq 0x0088de78
0088de5c	add x9,x9,#0x1
0088de60	and x9,x9,x11
0088de64	lsr x13,x9,#0x6
0088de68	ldr x13,[x8, x13, LSL #0x3]
0088de6c	lsr x13,x13,x9
0088de70	tbnz w13,#0x0,0x0088de4c
0088de74	b 0x0088deb0
0088de78	ldrb w8,[x13, #0x20]
0088de7c	cmp w8,#0x1
0088de80	b.ne 0x0088deb0
0088de84	add x0,x19,#0xa0
0088de88	mov x1,sp
0088de8c	bl 0x00886aac
0088de90	ldrb w9,[x0, #0x1]
0088de94	mov w8,#0x1
0088de98	strb w8,[x0, #0x2]
0088de9c	cmp w9,#0x1
0088dea0	b.ne 0x0088deb0
0088dea4	ldrb w9,[x0]
0088dea8	add x9,x19,x9
0088deac	strb w8,[x9, #0x698]
0088deb0	add x0,x19,#0x7a0
0088deb4	mov x1,sp
0088deb8	bl 0x0086e2d0
0088debc	ldr w8,[x19, #0x7a8]
0088dec0	ldr w9,[x19, #0x7a0]
0088dec4	sub w8,w8,w9
0088dec8	lsr w8,w8,#0x3
0088decc	sub w0,w8,#0x1
0088ded0	ldr x8,[x20, #0x28]
0088ded4	ldr x9,[sp, #0x8]
0088ded8	cmp x8,x9
0088dedc	b.ne 0x0088df1c
0088dee0	ldp x20,x19,[sp, #0x20]
0088dee4	ldp x29,x30,[sp, #0x10]
0088dee8	add sp,sp,#0x30
0088deec	ret
0088def0	ldr x2,[x1], #0x8
0088def4	ldr x8,[x20, #0x28]
0088def8	ldr x9,[sp, #0x8]
0088defc	cmp x8,x9
0088df00	b.ne 0x0088df1c
0088df04	adrp x8,0x2c4000
0088df08	add x8,x8,#0xc91
0088df0c	mov x0,x1
0088df10	mov x1,x8
0088df14	mov w3,#0xc8
0088df18	bl 0x0087fcd8
0088df1c	bl 0x00c2fec0
