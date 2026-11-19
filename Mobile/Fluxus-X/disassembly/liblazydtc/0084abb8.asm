; FUN_0084abb8 @ 0084abb8
0084abb8	stp x29,x30,[sp, #-0x50]!
0084abbc	str x25,[sp, #0x10]
0084abc0	stp x24,x23,[sp, #0x20]
0084abc4	stp x22,x21,[sp, #0x30]
0084abc8	stp x20,x19,[sp, #0x40]
0084abcc	mov x29,sp
0084abd0	ldr w9,[x0, #0x1c]
0084abd4	mov w8,#0xffa
0084abd8	mov x20,x3
0084abdc	mov x21,x2
0084abe0	mov x24,x1
0084abe4	mov x22,x0
0084abe8	str x2,[x20, #0x18]!
0084abec	and w8,w4,w8
0084abf0	tst w4,#0x80
0084abf4	str x2,[x3, #0x20]
0084abf8	add w1,w9,#0x1
0084abfc	mov x0,x3
0084ac00	mov x2,x20
0084ac04	mov x19,x3
0084ac08	csel w23,w4,w8,eq
0084ac0c	strb wzr,[x3, #0x28]
0084ac10	bl 0x008442b8
0084ac14	ldr q0,[x20]
0084ac18	ldrb w8,[x19, #0x28]
0084ac1c	stp x24,x24,[x19, #0x30]
0084ac20	strb wzr,[x19, #0x40]
0084ac24	stur q0,[x19, #0x48]
0084ac28	strb w8,[x19, #0x58]
0084ac2c	tbnz w23,#0xb,0x0084ac34
0084ac30	str x24,[x19, #0x68]
0084ac34	mov w8,#0x1
0084ac38	strb w8,[x19, #0x60]
0084ac3c	ldrh w8,[x22, #0x18]
0084ac40	tst w8,#0x1f0
0084ac44	b.eq 0x0084ac78
0084ac48	ldr w8,[x22, #0x1c]
0084ac4c	cbz w8,0x0084aca0
0084ac50	tst w23,#0x800
0084ac54	mov x0,x22
0084ac58	mov x1,x24
0084ac5c	cset w5,eq
0084ac60	mov x2,x21
0084ac64	mov x3,x19
0084ac68	mov w4,w23
0084ac6c	bl 0x0084b7e4
0084ac70	tbz w0,#0x0,0x0084acc4
0084ac74	b 0x0084ae00
0084ac78	tst w23,#0x800
0084ac7c	mov x0,x22
0084ac80	mov x1,x24
0084ac84	cset w5,eq
0084ac88	mov x2,x21
0084ac8c	mov x3,x19
0084ac90	mov w4,w23
0084ac94	bl 0x00843df0
0084ac98	tbz w0,#0x0,0x0084acc4
0084ac9c	b 0x0084ae00
0084aca0	tst w23,#0x800
0084aca4	mov x0,x22
0084aca8	mov x1,x24
0084acac	cset w5,eq
0084acb0	mov x2,x21
0084acb4	mov x3,x19
0084acb8	mov w4,w23
0084acbc	bl 0x0084b038
0084acc0	tbnz w0,#0x0,0x0084ae00
0084acc4	cmp x24,x21
0084acc8	b.eq 0x0084ae64
0084accc	tbnz w23,#0x6,0x0084ae64
0084acd0	add x24,x24,#0x1
0084acd4	cmp x24,x21
0084acd8	b.eq 0x0084ada8
0084acdc	orr x25,xzr,#-0x5555555555555556
0084ace0	movk x25,#0xaaab
0084ace4	b 0x0084ad30
0084ace8	orr w4,w23,#0x80
0084acec	mov x0,x22
0084acf0	mov x1,x24
0084acf4	mov x2,x21
0084acf8	mov x3,x19
0084acfc	mov w5,wzr
0084ad00	bl 0x00843df0
0084ad04	tbnz w0,#0x0,0x0084ae00
0084ad08	ldp x9,x8,[x19]
0084ad0c	mov x0,x19
0084ad10	mov x2,x20
0084ad14	sub x8,x8,x9
0084ad18	asr x8,x8,#0x3
0084ad1c	mul x1,x8,x25
0084ad20	bl 0x008442b8
0084ad24	add x24,x24,#0x1
0084ad28	cmp x24,x21
0084ad2c	b.eq 0x0084ada8
0084ad30	ldp x9,x8,[x19]
0084ad34	mov x0,x19
0084ad38	mov x2,x20
0084ad3c	sub x8,x8,x9
0084ad40	asr x8,x8,#0x3
0084ad44	mul x1,x8,x25
0084ad48	bl 0x008442b8
0084ad4c	ldrh w8,[x22, #0x18]
0084ad50	tst w8,#0x1f0
0084ad54	b.eq 0x0084ace8
0084ad58	ldr w8,[x22, #0x1c]
0084ad5c	cbz w8,0x0084ad84
0084ad60	orr w4,w23,#0x80
0084ad64	mov x0,x22
0084ad68	mov x1,x24
0084ad6c	mov x2,x21
0084ad70	mov x3,x19
0084ad74	mov w5,wzr
0084ad78	bl 0x0084b7e4
0084ad7c	tbz w0,#0x0,0x0084ad08
0084ad80	b 0x0084ae00
0084ad84	orr w4,w23,#0x80
0084ad88	mov x0,x22
0084ad8c	mov x1,x24
0084ad90	mov x2,x21
0084ad94	mov x3,x19
0084ad98	mov w5,wzr
0084ad9c	bl 0x0084b038
0084ada0	tbz w0,#0x0,0x0084ad08
0084ada4	b 0x0084ae00
0084ada8	ldp x9,x8,[x19]
0084adac	mov x0,x19
0084adb0	mov x2,x20
0084adb4	sub x8,x8,x9
0084adb8	orr x9,xzr,#-0x5555555555555556
0084adbc	asr x8,x8,#0x3
0084adc0	movk x9,#0xaaab
0084adc4	mul x1,x8,x9
0084adc8	bl 0x008442b8
0084adcc	ldrh w8,[x22, #0x18]
0084add0	tst w8,#0x1f0
0084add4	b.eq 0x0084ae44
0084add8	ldr w8,[x22, #0x1c]
0084addc	cbz w8,0x0084ae88
0084ade0	orr w4,w23,#0x80
0084ade4	mov x0,x22
0084ade8	mov x1,x24
0084adec	mov x2,x21
0084adf0	mov x3,x19
0084adf4	mov w5,wzr
0084adf8	bl 0x0084b7e4
0084adfc	tbz w0,#0x0,0x0084ae64
0084ae00	ldp x9,x8,[x19]
0084ae04	mov w0,#0x1
0084ae08	ldr x10,[x19, #0x30]
0084ae0c	cmp x8,x9
0084ae10	csel x8,x20,x9,eq
0084ae14	ldr x9,[x8]
0084ae18	str x9,[x19, #0x38]
0084ae1c	cmp x10,x9
0084ae20	ldr x9,[x19, #0x50]
0084ae24	ldr x8,[x8, #0x8]
0084ae28	cset w10,ne
0084ae2c	strb w10,[x19, #0x40]
0084ae30	cmp x8,x9
0084ae34	str x8,[x19, #0x48]
0084ae38	cset w8,ne
0084ae3c	strb w8,[x19, #0x58]
0084ae40	b 0x0084ae70
0084ae44	orr w4,w23,#0x80
0084ae48	mov x0,x22
0084ae4c	mov x1,x24
0084ae50	mov x2,x21
0084ae54	mov x3,x19
0084ae58	mov w5,wzr
0084ae5c	bl 0x00843df0
0084ae60	tbnz w0,#0x0,0x0084ae00
0084ae64	ldr x8,[x19]
0084ae68	mov w0,wzr
0084ae6c	str x8,[x19, #0x8]
0084ae70	ldp x20,x19,[sp, #0x40]
0084ae74	ldr x25,[sp, #0x10]
0084ae78	ldp x22,x21,[sp, #0x30]
0084ae7c	ldp x24,x23,[sp, #0x20]
0084ae80	ldp x29,x30,[sp], #0x50
0084ae84	ret
0084ae88	orr w4,w23,#0x80
0084ae8c	mov x0,x22
0084ae90	mov x1,x24
0084ae94	mov x2,x21
0084ae98	mov x3,x19
0084ae9c	mov w5,wzr
0084aea0	bl 0x0084b038
0084aea4	tbnz w0,#0x0,0x0084ae00
0084aea8	b 0x0084ae64
