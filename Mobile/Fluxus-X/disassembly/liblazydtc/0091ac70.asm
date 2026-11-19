; FUN_0091ac70 @ 0091ac70
0091ac70	sub sp,sp,#0xa0
0091ac74	stp x28,x27,[sp, #0x40]
0091ac78	stp x26,x25,[sp, #0x50]
0091ac7c	stp x24,x23,[sp, #0x60]
0091ac80	stp x22,x21,[sp, #0x70]
0091ac84	stp x20,x19,[sp, #0x80]
0091ac88	stp x29,x30,[sp, #0x90]
0091ac8c	add x29,sp,#0x90
0091ac90	mrs x8,tpidr_el0
0091ac94	stp x8,x2,[sp, #0x8]
0091ac98	ldr x8,[x8, #0x28]
0091ac9c	mov x20,x0
0091aca0	str x8,[sp, #0x38]
0091aca4	ldr x8,[x0, #0x20]
0091aca8	str x8,[sp, #0x18]
0091acac	tbz w1,#0x0,0x0091acc0
0091acb0	ldrb w8,[x20, #0xa82]
0091acb4	tbnz w8,#0x3,0x0091acf4
0091acb8	ldr x8,[x20, #0x340]
0091acbc	b 0x0091acf8
0091acc0	ldr x8,[x8, #0x3a0]
0091acc4	ldr x9,[x20, #0x340]
0091acc8	mov w10,#0x9
0091accc	and x8,x8,x10
0091acd0	cmp x8,#0x1
0091acd4	str x9,[sp, #0x28]
0091acd8	b.ne 0x0091acfc
0091acdc	ldrb w8,[x20, #0xa82]
0091ace0	tbz w8,#0x3,0x0091acfc
0091ace4	ldr x8,[x20, #0x6c0]
0091ace8	str x8,[sp, #0x30]
0091acec	mov w8,#0x2
0091acf0	b 0x0091ad00
0091acf4	ldr x8,[x20, #0x6c0]
0091acf8	str x8,[sp, #0x28]
0091acfc	mov w8,#0x1
0091ad00	str x8,[sp, #0x20]
0091ad04	adrp x26,0xcc4000
0091ad08	add x26,x26,#0x678
0091ad0c	mov w8,#0x131a
0091ad10	adrp x28,0x2bc000
0091ad14	mov x27,xzr
0091ad18	add x23,x20,#0x1b1
0091ad1c	add x19,x20,x8
0091ad20	add x28,x28,#0xe63
0091ad24	add x8,sp,#0x28
0091ad28	ldr x21,[x8, x27, LSL #0x3]
0091ad2c	cbnz x21,0x0091ad40
0091ad30	b 0x0091af84
0091ad34	mov x24,xzr
0091ad38	cbnz x0,0x0091ad58
0091ad3c	b 0x0091af7c
0091ad40	ldr x25,[x21]
0091ad44	mov w1,#0x3a
0091ad48	mov x0,x25
0091ad4c	bl 0x00c30890
0091ad50	cbz x0,0x0091aef4
0091ad54	mov x24,xzr
0091ad58	cmp x0,x25
0091ad5c	b.eq 0x0091af7c
0091ad60	add x8,x0,#0x1
0091ad64	b 0x0091ad6c
0091ad68	add x8,x8,#0x1
0091ad6c	ldrb w9,[x8]
0091ad70	cmp w9,#0x9
0091ad74	b.eq 0x0091ad68
0091ad78	cmp w9,#0x20
0091ad7c	b.eq 0x0091ad68
0091ad80	cbz w9,0x0091ad90
0091ad84	sub w10,w9,#0xa
0091ad88	cmp w10,#0x4
0091ad8c	b.cc 0x0091ad68
0091ad90	cbnz x24,0x0091ad98
0091ad94	cbz w9,0x0091af7c
0091ad98	ldr x8,[x20, #0x12d0]
0091ad9c	cmp x24,#0x0
0091ada0	csel x25,x24,x25,ne
0091ada4	cbz x8,0x0091adc0
0091ada8	mov w2,#0x5
0091adac	mov x0,x25
0091adb0	mov x1,x28
0091adb4	bl 0x00c31b50
0091adb8	mov w22,wzr
0091adbc	cbnz w0,0x0091aedc
0091adc0	ldrb w8,[x19]
0091adc4	cmp w8,#0x2
0091adc8	b.ne 0x0091adec
0091adcc	adrp x1,0x2d2000
0091add0	mov w2,#0xd
0091add4	mov x0,x25
0091add8	add x1,x1,#0xeee
0091addc	bl 0x00c31b50
0091ade0	mov w22,wzr
0091ade4	cbnz w0,0x0091aedc
0091ade8	ldrb w8,[x19]
0091adec	cmp w8,#0x3
0091adf0	b.ne 0x0091ae10
0091adf4	adrp x1,0x2d2000
0091adf8	mov w2,#0xd
0091adfc	mov x0,x25
0091ae00	add x1,x1,#0xeee
0091ae04	bl 0x00c31b50
0091ae08	mov w22,wzr
0091ae0c	cbnz w0,0x0091aedc
0091ae10	ldrb w8,[x23, #0x2]
0091ae14	tbz w8,#0x0,0x0091ae34
0091ae18	adrp x1,0x29d000
0091ae1c	orr w2,wzr,#0xf
0091ae20	mov x0,x25
0091ae24	add x1,x1,#0x650
0091ae28	bl 0x00c31b50
0091ae2c	mov w22,wzr
0091ae30	cbnz w0,0x0091aedc
0091ae34	ldr x8,[x20, #0x12e8]
0091ae38	cbz x8,0x0091ae58
0091ae3c	adrp x1,0x2b9000
0091ae40	mov w2,#0xb
0091ae44	mov x0,x25
0091ae48	add x1,x1,#0xa0
0091ae4c	bl 0x00c31b50
0091ae50	mov w22,wzr
0091ae54	cbnz w0,0x0091aedc
0091ae58	ldr x8,[sp, #0x18]
0091ae5c	ldrb w8,[x8, #0x574]
0091ae60	cmp w8,#0x14
0091ae64	b.cc 0x0091ae84
0091ae68	adrp x1,0x2a7000
0091ae6c	mov w2,#0x12
0091ae70	mov x0,x25
0091ae74	add x1,x1,#0x25c
0091ae78	bl 0x00c31b50
0091ae7c	mov w22,wzr
0091ae80	cbnz w0,0x0091aedc
0091ae84	adrp x1,0x29f000
0091ae88	orr w2,wzr,#0xe
0091ae8c	mov x0,x25
0091ae90	add x1,x1,#0x496
0091ae94	bl 0x00c31b50
0091ae98	cbnz w0,0x0091aeb4
0091ae9c	adrp x1,0x2c4000
0091aea0	orr w2,wzr,#0x7
0091aea4	mov x0,x25
0091aea8	add x1,x1,#0xf28
0091aeac	bl 0x00c31b50
0091aeb0	cbz w0,0x0091aec4
0091aeb4	mov x0,x20
0091aeb8	bl 0x0096795c
0091aebc	mov w22,wzr
0091aec0	tbz w0,#0x0,0x0091aedc
0091aec4	ldr x0,[sp, #0x10]
0091aec8	adrp x1,0x2d0000
0091aecc	add x1,x1,#0xdf4
0091aed0	mov x2,x25
0091aed4	bl 0x009048cc
0091aed8	mov w22,w0
0091aedc	cbz x24,0x0091aeec
0091aee0	ldr x8,[x26]
0091aee4	mov x0,x24
0091aee8	blr x8
0091aeec	cbz w22,0x0091af7c
0091aef0	b 0x0091afa8
0091aef4	mov w1,#0x3b
0091aef8	mov x0,x25
0091aefc	bl 0x00c30890
0091af00	cbz x0,0x0091af7c
0091af04	mov x8,x0
0091af08	mov x22,x8
0091af0c	ldrb w9,[x8, #0x1]!
0091af10	cmp w9,#0x9
0091af14	b.eq 0x0091af08
0091af18	cmp w9,#0x20
0091af1c	b.eq 0x0091af08
0091af20	cbz w9,0x0091af34
0091af24	sub w10,w9,#0xa
0091af28	cmp w10,#0x4
0091af2c	b.cc 0x0091af08
0091af30	cbnz w9,0x0091af7c
0091af34	ldrb w8,[x22]
0091af38	cmp w8,#0x3b
0091af3c	b.ne 0x0091ad34
0091af40	adrp x8,0xcc4000
0091af44	add x8,x8,#0x688
0091af48	mov x0,x25
0091af4c	ldr x8,[x8]
0091af50	blr x8
0091af54	mov x24,x0
0091af58	cbz x0,0x0091af9c
0091af5c	ldr x8,[x21]
0091af60	mov w9,#0x3a
0091af64	sub x8,x22,x8
0091af68	strb w9,[x24, x8]
0091af6c	ldr x25,[x21]
0091af70	sub x8,x22,x25
0091af74	add x0,x24,x8
0091af78	cbnz x0,0x0091ad58
0091af7c	ldr x21,[x21, #0x8]
0091af80	cbnz x21,0x0091ad40
0091af84	ldr x8,[sp, #0x20]
0091af88	add x27,x27,#0x1
0091af8c	cmp x27,x8
0091af90	b.cc 0x0091ad24
0091af94	mov w22,wzr
0091af98	b 0x0091afa8
0091af9c	ldr x0,[sp, #0x10]
0091afa0	bl 0x00904534
0091afa4	mov w22,#0x1b
0091afa8	ldr x8,[sp, #0x8]
0091afac	ldr x8,[x8, #0x28]
0091afb0	ldr x9,[sp, #0x38]
0091afb4	cmp x8,x9
0091afb8	b.ne 0x0091afe0
0091afbc	mov w0,w22
0091afc0	ldp x29,x30,[sp, #0x90]
0091afc4	ldp x20,x19,[sp, #0x80]
0091afc8	ldp x22,x21,[sp, #0x70]
0091afcc	ldp x24,x23,[sp, #0x60]
0091afd0	ldp x26,x25,[sp, #0x50]
0091afd4	ldp x28,x27,[sp, #0x40]
0091afd8	add sp,sp,#0xa0
0091afdc	ret
0091afe0	bl 0x00c2fec0
