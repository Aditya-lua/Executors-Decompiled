; FUN_0086ab5c @ 0086ab5c
0086ab5c	sub sp,sp,#0xb0
0086ab60	stp x29,x30,[sp, #0x50]
0086ab64	stp x28,x27,[sp, #0x60]
0086ab68	stp x26,x25,[sp, #0x70]
0086ab6c	stp x24,x23,[sp, #0x80]
0086ab70	stp x22,x21,[sp, #0x90]
0086ab74	stp x20,x19,[sp, #0xa0]
0086ab78	add x29,sp,#0x50
0086ab7c	mrs x27,tpidr_el0
0086ab80	mov x19,x0
0086ab84	ldr x8,[x27, #0x28]
0086ab88	stur x8,[x29, #-0x8]
0086ab8c	ldr w8,[x0, #0x90]
0086ab90	ldr x9,[x0, #0x380]
0086ab94	ldr x24,[x0, #0x378]
0086ab98	cmp w8,#0x3c
0086ab9c	sub x28,x9,x24
0086aba0	b.ne 0x0086aeb8
0086aba4	mov x24,x19
0086aba8	mov x22,x3
0086abac	mov x23,x2
0086abb0	ldr x26,[x24, #0x94]!
0086abb4	cbz x1,0x0086abbc
0086abb8	str x26,[x1]
0086abbc	mov x0,x19
0086abc0	bl 0x00858f2c
0086abc4	mov x20,xzr
0086abc8	add x21,x19,#0x378
0086abcc	b 0x0086abd8
0086abd0	mov x0,x19
0086abd4	bl 0x00858f2c
0086abd8	ldr w8,[x19, #0x90]
0086abdc	cmp w8,#0x106
0086abe0	b.ne 0x0086ac00
0086abe4	mov x0,x19
0086abe8	bl 0x00866418
0086abec	stp xzr,x0,[sp, #0x20]
0086abf0	add x1,sp,#0x20
0086abf4	mov x0,x21
0086abf8	bl 0x00872850
0086abfc	b 0x0086ae1c
0086ac00	cmp w8,#0x119
0086ac04	b.ne 0x0086ac24
0086ac08	add x8,sp,#0x20
0086ac0c	add x0,x19,#0x70
0086ac10	bl 0x00853d20
0086ac14	ldr w8,[sp, #0x20]
0086ac18	cmp w8,#0x106
0086ac1c	b.eq 0x0086abe4
0086ac20	ldr w8,[x19, #0x90]
0086ac24	cmp w8,#0x3e
0086ac28	b.eq 0x0086ad78
0086ac2c	cmp w8,#0x28
0086ac30	b.ne 0x0086ad8c
0086ac34	ldr q0,[x24]
0086ac38	str q0,[sp, #0x20]
0086ac3c	mov x0,x19
0086ac40	mov w1,#0x1
0086ac44	mov w2,wzr
0086ac48	bl 0x008695d4
0086ac4c	cbz x1,0x0086adfc
0086ac50	adrp x9,0xd1b000
0086ac54	ldr w8,[x1, #0x8]
0086ac58	ldr w9,[x9, #0x310]
0086ac5c	cmp w8,w9
0086ac60	b.ne 0x0086ade8
0086ac64	ldr x8,[x1, #0x30]
0086ac68	cbnz x8,0x0086ade8
0086ac6c	ldr x8,[x1, #0x28]
0086ac70	cmp x8,#0x1
0086ac74	b.ne 0x0086ade8
0086ac78	ldr w8,[x19, #0x90]
0086ac7c	cmp w8,#0x26
0086ac80	b.eq 0x0086ac94
0086ac84	cmp w8,#0x7c
0086ac88	b.eq 0x0086ac94
0086ac8c	cmp w8,#0x3f
0086ac90	b.ne 0x0086ade8
0086ac94	ldr x8,[x1, #0x20]
0086ac98	str x26,[sp]
0086ac9c	mov x25,x1
0086aca0	ldr x0,[x19, #0xe8]
0086aca4	ldr x26,[x8]
0086aca8	mov w1,#0x28
0086acac	bl 0x0084e938
0086acb0	add x1,x26,#0xc
0086acb4	mov x2,x26
0086acb8	str x0,[sp, #0x8]
0086acbc	bl 0x008510d0
0086acc0	ldr x1,[sp, #0x8]
0086acc4	ldrb w8,[x19, #0x68]
0086acc8	ldr x26,[sp]
0086accc	cmp w8,#0x1
0086acd0	b.ne 0x0086ae98
0086acd4	ldr x9,[x19, #0x4d8]
0086acd8	cbz x9,0x0086ae98
0086acdc	lsl w9,w25,#0x3
0086ace0	mov x11,#0x2d69
0086ace4	lsr x10,x25,#0x20
0086ace8	movk x11,#0xeb38, LSL #16
0086acec	add x9,x9,#0x8
0086acf0	movk x11,#0xea08, LSL #32
0086acf4	eor x9,x9,x10
0086acf8	movk x11,#0x9ddf, LSL #48
0086acfc	mul x9,x9,x11
0086ad00	eor x10,x10,x9, LSR #0x2f
0086ad04	eor x9,x10,x9
0086ad08	mov x10,#0x959d
0086ad0c	mul x9,x9,x11
0086ad10	movk x10,#0xb8f4, LSL #16
0086ad14	movk x10,#0xd34f, LSL #32
0086ad18	movk x10,#0x949d, LSL #48
0086ad1c	eor x9,x9,x9, LSR #0x2f
0086ad20	mul x9,x9,x10
0086ad24	ldrb w10,[x19, #0x4e0]
0086ad28	lsr x9,x9,x10
0086ad2c	ldr x10,[x19, #0x4c8]
0086ad30	lsr x11,x9,#0x6
0086ad34	ldr x11,[x10, x11, LSL #0x3]
0086ad38	lsr x11,x11,x9
0086ad3c	tbz w11,#0x0,0x0086ae98
0086ad40	ldr x12,[x19, #0x4d0]
0086ad44	ldr x11,[x19, #0x4b0]
0086ad48	sub x12,x12,#0x1
0086ad4c	lsl x13,x9,#0x4
0086ad50	ldr x13,[x11, x13#0x0]
0086ad54	cmp x13,x25
0086ad58	b.eq 0x0086ae4c
0086ad5c	add x9,x9,#0x1
0086ad60	and x9,x9,x12
0086ad64	lsr x13,x9,#0x6
0086ad68	ldr x13,[x10, x13, LSL #0x3]
0086ad6c	lsr x13,x13,x9
0086ad70	tbnz w13,#0x0,0x0086ad4c
0086ad74	b 0x0086ae98
0086ad78	cbz x20,0x0086aed4
0086ad7c	ldr q0,[x24]
0086ad80	ldr w25,[x19, #0x124]
0086ad84	str q0,[sp, #0x20]
0086ad88	b 0x0086adac
0086ad8c	ldr q0,[x24]
0086ad90	ldr w25,[x19, #0x124]
0086ad94	mov x1,xzr
0086ad98	cmp w8,#0x26
0086ad9c	str q0,[sp, #0x20]
0086ada0	b.eq 0x0086adc4
0086ada4	cmp w8,#0x7c
0086ada8	b.eq 0x0086adc4
0086adac	mov x0,x19
0086adb0	mov w1,wzr
0086adb4	mov w2,wzr
0086adb8	bl 0x008695d4
0086adbc	mov x1,x0
0086adc0	str w25,[x19, #0x124]
0086adc4	add x2,sp,#0x20
0086adc8	mov x0,x19
0086adcc	bl 0x00867310
0086add0	str w25,[x19, #0x124]
0086add4	stp x0,xzr,[sp, #0x10]
0086add8	add x1,sp,#0x10
0086addc	mov x0,x21
0086ade0	bl 0x00872850
0086ade4	b 0x0086ae1c
0086ade8	stp xzr,x1,[sp, #0x10]
0086adec	add x1,sp,#0x10
0086adf0	mov x0,x21
0086adf4	bl 0x00872850
0086adf8	b 0x0086ae1c
0086adfc	add x2,sp,#0x20
0086ae00	mov x1,x0
0086ae04	mov x0,x19
0086ae08	bl 0x00867310
0086ae0c	stp x0,xzr,[sp, #0x10]
0086ae10	add x1,sp,#0x10
0086ae14	mov x0,x21
0086ae18	bl 0x00872850
0086ae1c	ldr w8,[x19, #0x90]
0086ae20	add x20,x20,#0x1
0086ae24	cmp w8,#0x2c
0086ae28	b.ne 0x0086aec0
0086ae2c	cbz x23,0x0086abd0
0086ae30	ldr x0,[x23]
0086ae34	mov x1,x24
0086ae38	bl 0x00870ce4
0086ae3c	ldr x8,[x23, #0x10]
0086ae40	add x8,x8,#0x1
0086ae44	str x8,[x23, #0x10]
0086ae48	b 0x0086abd0
0086ae4c	add x8,x11,x9, LSL #0x4
0086ae50	ldr x8,[x8, #0x8]
0086ae54	cbz x8,0x0086ae98
0086ae58	adrp x10,0xd1e000
0086ae5c	ldr w9,[x8]
0086ae60	ldr w10,[x10, #0xb80]
0086ae64	cmp w9,w10
0086ae68	b.ne 0x0086ae98
0086ae6c	ldr x0,[x19, #0xe8]
0086ae70	add x1,x8,#0xc
0086ae74	bl 0x0086e158
0086ae78	ldr x8,[sp, #0x8]
0086ae7c	mov x26,x0
0086ae80	str x8,[sp, #0x10]
0086ae84	add x0,x19,#0x4b0
0086ae88	add x1,sp,#0x10
0086ae8c	bl 0x00860fa0
0086ae90	str x26,[x0]
0086ae94	ldp x26,x1,[sp]
0086ae98	add x2,sp,#0x20
0086ae9c	mov x0,x19
0086aea0	bl 0x00867310
0086aea4	stp x0,xzr,[sp, #0x10]
0086aea8	add x1,sp,#0x10
0086aeac	mov x0,x21
0086aeb0	bl 0x00872850
0086aeb4	b 0x0086ae1c
0086aeb8	mov x20,xzr
0086aebc	b 0x0086af50
0086aec0	mov w9,#0x3c
0086aec4	cmp w8,#0x3e
0086aec8	stur x26,[sp, #0x24]
0086aecc	str w9,[sp, #0x20]
0086aed0	b.ne 0x0086aee4
0086aed4	mov x0,x19
0086aed8	bl 0x00858f2c
0086aedc	mov w0,#0x1
0086aee0	b 0x0086af08
0086aee4	add x2,sp,#0x20
0086aee8	mov x0,x19
0086aeec	mov w1,#0x3e
0086aef0	mov x3,xzr
0086aef4	bl 0x0086b5f8
0086aef8	mov x0,x19
0086aefc	mov w1,#0x3e
0086af00	mov w3,wzr
0086af04	bl 0x0086e434
0086af08	cbz x22,0x0086af18
0086af0c	tbz w0,#0x0,0x0086af18
0086af10	ldr x8,[x19, #0xb0]
0086af14	str x8,[x22]
0086af18	ldr x24,[x21]
0086af1c	cbz x20,0x0086af50
0086af20	ldr x0,[x19, #0xe8]
0086af24	lsl x1,x20,#0x4
0086af28	bl 0x0084e938
0086af2c	add x8,x24,x28
0086af30	mov x9,x0
0086af34	mov x10,x20
0086af38	ldr q0,[x8], #0x10
0086af3c	subs x10,x10,#0x1
0086af40	str q0,[x9], #0x10
0086af44	b.ne 0x0086af38
0086af48	ldr x24,[x21]
0086af4c	b 0x0086af54
0086af50	mov x0,xzr
0086af54	ldr x8,[x19, #0x380]
0086af58	add x21,x28,x24
0086af5c	cmp x21,x8
0086af60	b.eq 0x0086af90
0086af64	sub x9,x8,x21
0086af68	add x1,x21,x9
0086af6c	subs x22,x8,x1
0086af70	b.eq 0x0086af88
0086af74	mov x23,x0
0086af78	mov x0,x21
0086af7c	mov x2,x22
0086af80	bl 0x00c2ff60
0086af84	mov x0,x23
0086af88	add x8,x21,x22
0086af8c	str x8,[x19, #0x380]
0086af90	ldr x8,[x27, #0x28]
0086af94	ldur x9,[x29, #-0x8]
0086af98	cmp x8,x9
0086af9c	b.ne 0x0086b04c
0086afa0	mov x1,x20
0086afa4	ldp x20,x19,[sp, #0xa0]
0086afa8	ldp x22,x21,[sp, #0x90]
0086afac	ldp x24,x23,[sp, #0x80]
0086afb0	ldp x26,x25,[sp, #0x70]
0086afb4	ldp x28,x27,[sp, #0x60]
0086afb8	ldp x29,x30,[sp, #0x50]
0086afbc	add sp,sp,#0xb0
0086afc0	ret
0086b04c	bl 0x00c2fec0
