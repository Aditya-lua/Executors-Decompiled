; FUN_0089acdc @ 0089acdc
0089acdc	stp x29,x30,[sp, #-0x30]!
0089ace0	stp x22,x21,[sp, #0x10]
0089ace4	stp x20,x19,[sp, #0x20]
0089ace8	mov x29,sp
0089acec	adrp x8,0xd1b000
0089acf0	ldr w21,[x1, #0x8]
0089acf4	mov x20,x1
0089acf8	ldr w8,[x8, #0xf0]
0089acfc	mov x19,x0
0089ad00	cmp w21,w8
0089ad04	ccmp x1,#0x0,#0x4,eq
0089ad08	b.ne 0x0089adfc
0089ad0c	adrp x8,0xd1b000
0089ad10	mov w0,#0x1
0089ad14	ldr w8,[x8, #0x150]
0089ad18	cmp w21,w8
0089ad1c	b.eq 0x0089aea4
0089ad20	adrp x8,0xd1b000
0089ad24	ldr w8,[x8, #0x130]
0089ad28	cmp w21,w8
0089ad2c	b.eq 0x0089aea4
0089ad30	adrp x8,0xd1b000
0089ad34	ldr w8,[x8, #0x140]
0089ad38	cmp w21,w8
0089ad3c	b.eq 0x0089aea4
0089ad40	adrp x8,0xd1b000
0089ad44	ldr w22,[x8, #0x100]
0089ad48	cmp w21,w22
0089ad4c	b.ne 0x0089ae98
0089ad50	ldr x8,[x19, #0x28]
0089ad54	ldr x1,[x20, #0x20]
0089ad58	cbz x8,0x0089ae44
0089ad5c	lsl w8,w1,#0x3
0089ad60	mov x10,#0x2d69
0089ad64	lsr x9,x1,#0x20
0089ad68	movk x10,#0xeb38, LSL #16
0089ad6c	add x8,x8,#0x8
0089ad70	movk x10,#0xea08, LSL #32
0089ad74	eor x8,x8,x9
0089ad78	movk x10,#0x9ddf, LSL #48
0089ad7c	mul x8,x8,x10
0089ad80	eor x9,x9,x8, LSR #0x2f
0089ad84	eor x8,x9,x8
0089ad88	mov x9,#0x959d
0089ad8c	mul x8,x8,x10
0089ad90	movk x9,#0xb8f4, LSL #16
0089ad94	movk x9,#0xd34f, LSL #32
0089ad98	movk x9,#0x949d, LSL #48
0089ad9c	eor x8,x8,x8, LSR #0x2f
0089ada0	mul x8,x8,x9
0089ada4	ldrb w9,[x19, #0x30]
0089ada8	lsr x9,x8,x9
0089adac	ldr x8,[x19, #0x18]
0089adb0	lsr x10,x9,#0x6
0089adb4	ldr x10,[x8, x10, LSL #0x3]
0089adb8	lsr x10,x10,x9
0089adbc	tbz w10,#0x0,0x0089ae44
0089adc0	ldr x11,[x19, #0x20]
0089adc4	ldr x10,[x19]
0089adc8	mov w12,#0x30
0089adcc	sub x11,x11,#0x1
0089add0	madd x13,x9,x12,x10
0089add4	ldr x14,[x13]
0089add8	cmp x14,x1
0089addc	b.eq 0x0089ae38
0089ade0	add x9,x9,#0x1
0089ade4	and x9,x9,x11
0089ade8	lsr x13,x9,#0x6
0089adec	ldr x13,[x8, x13, LSL #0x3]
0089adf0	lsr x13,x13,x9
0089adf4	tbnz w13,#0x0,0x0089add0
0089adf8	b 0x0089ae44
0089adfc	ldr x8,[x20, #0x28]
0089ae00	cbz x8,0x0089ae30
0089ae04	mov x21,xzr
0089ae08	ldr x8,[x20, #0x20]
0089ae0c	mov x0,x19
0089ae10	ldr x1,[x8, x21, LSL #0x3]
0089ae14	bl 0x0089acdc
0089ae18	tbnz w0,#0x0,0x0089aea4
0089ae1c	ldr x8,[x20, #0x28]
0089ae20	add x21,x21,#0x1
0089ae24	cmp x21,x8
0089ae28	b.cc 0x0089ae08
0089ae2c	b 0x0089aea4
0089ae30	mov w0,wzr
0089ae34	b 0x0089aea4
0089ae38	ldr w8,[x13, #0x8]
0089ae3c	cmp w8,#0x2
0089ae40	b.cs 0x0089ae80
0089ae44	mov x0,x19
0089ae48	bl 0x0088d0f4
0089ae4c	ldr x1,[x20, #0x30]
0089ae50	tbz w0,#0x0,0x0089ae5c
0089ae54	cbnz x1,0x0089ae90
0089ae58	b 0x0089ae78
0089ae5c	cbz x1,0x0089ae78
0089ae60	ldr x1,[x20, #0x28]
0089ae64	mov x0,x19
0089ae68	bl 0x0089acdc
0089ae6c	tbz w0,#0x0,0x0089ae78
0089ae70	ldr x1,[x20, #0x30]
0089ae74	b 0x0089ae90
0089ae78	mov w0,wzr
0089ae7c	b 0x0089ae98
0089ae80	b.ne 0x0089ae8c
0089ae84	ldrb w8,[x13, #0x10]
0089ae88	cbz w8,0x0089ae44
0089ae8c	ldr x1,[x20, #0x28]
0089ae90	mov x0,x19
0089ae94	bl 0x0089acdc
0089ae98	cmp w21,w22
0089ae9c	cset w8,eq
0089aea0	and w0,w8,w0
0089aea4	and w0,w0,#0x1
0089aea8	ldp x20,x19,[sp, #0x20]
0089aeac	ldp x22,x21,[sp, #0x10]
0089aeb0	ldp x29,x30,[sp], #0x30
0089aeb4	ret
