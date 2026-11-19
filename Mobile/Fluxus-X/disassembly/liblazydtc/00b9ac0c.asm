; mbedtls_psa_key_agreement_ecdh @ 00b9ac0c
00b9ac0c	sub sp,sp,#0x1c0
00b9ac10	stp x28,x25,[sp, #0x170]
00b9ac14	stp x24,x23,[sp, #0x180]
00b9ac18	stp x22,x21,[sp, #0x190]
00b9ac1c	stp x20,x19,[sp, #0x1a0]
00b9ac20	stp x29,x30,[sp, #0x1b0]
00b9ac24	add x29,sp,#0x1b0
00b9ac28	mrs x25,tpidr_el0
00b9ac2c	ldr x10,[x25, #0x28]
00b9ac30	mov x8,x0
00b9ac34	mov x19,x7
00b9ac38	mov x20,x6
00b9ac3c	stur x10,[x29, #-0x48]
00b9ac40	ldrh w0,[x0]
00b9ac44	mov x22,x5
00b9ac48	mov x24,x4
00b9ac4c	mov x9,x2
00b9ac50	lsr w10,w0,#0x8
00b9ac54	cmp w10,#0x71
00b9ac58	mov x2,x1
00b9ac5c	b.ne 0x00b9ad9c
00b9ac60	and w10,w3,#0xffff0000
00b9ac64	mov w11,#0x9000000
00b9ac68	orr w10,w10,w11
00b9ac6c	add w11,w11,#0x20, LSL #12
00b9ac70	cmp w10,w11
00b9ac74	b.ne 0x00b9ad9c
00b9ac78	stur xzr,[x29, #-0x50]
00b9ac7c	ldrh w1,[x8, #0x2]
00b9ac80	sub x4,x29,#0x50
00b9ac84	mov x3,x9
00b9ac88	bl 0x00c42f80
00b9ac8c	mov w23,w0
00b9ac90	cbnz w0,0x00b9ada0
00b9ac94	ldur x21,[x29, #-0x50]
00b9ac98	stur xzr,[x29, #-0x58]
00b9ac9c	str xzr,[sp]
00b9aca0	mov x1,sp
00b9aca4	ldr w0,[x21]
00b9aca8	bl 0x00c432b0
00b9acac	mov w23,w0
00b9acb0	add x0,sp,#0x8
00b9acb4	bl 0x00c424f0
00b9acb8	ldr x1,[sp]
00b9acbc	mov w0,#0x4100
00b9acc0	bfxil w0,w23,#0x0,#0x8
00b9acc4	sub x4,x29,#0x58
00b9acc8	mov x2,x24
00b9accc	mov x3,x22
00b9acd0	bl 0x00c42f80
00b9acd4	ldur x22,[x29, #-0x58]
00b9acd8	mov w23,w0
00b9acdc	cbnz w0,0x00b9ad64
00b9ace0	add x0,sp,#0x8
00b9ace4	mov w2,#0x1
00b9ace8	mov x1,x22
00b9acec	bl 0x00c424e0
00b9acf0	bl 0x00c42bf0
00b9acf4	mov w23,w0
00b9acf8	cbnz w0,0x00b9ad64
00b9acfc	add x0,sp,#0x8
00b9ad00	mov x1,x21
00b9ad04	mov w2,wzr
00b9ad08	bl 0x00c424e0
00b9ad0c	bl 0x00c42bf0
00b9ad10	mov w23,w0
00b9ad14	cbnz w0,0x00b9ad64
00b9ad18	ldr x24,[x29, #0x10]
00b9ad1c	adrp x4,0xcb5000
00b9ad20	ldr x4,[x4, #0xac0]
00b9ad24	add x0,sp,#0x8
00b9ad28	mov x1,x24
00b9ad2c	mov x2,x20
00b9ad30	mov x3,x19
00b9ad34	mov x5,xzr
00b9ad38	bl 0x00c424c0
00b9ad3c	bl 0x00c42bf0
00b9ad40	mov w23,w0
00b9ad44	cbnz w0,0x00b9ad64
00b9ad48	ldr x8,[sp]
00b9ad4c	ldr x9,[x24]
00b9ad50	add x8,x8,#0x7
00b9ad54	lsr x8,x8,#0x3
00b9ad58	cmp x8,x9
00b9ad5c	b.eq 0x00b9ad70
00b9ad60	mov w23,#0xffffff69
00b9ad64	mov x0,x20
00b9ad68	mov x1,x19
00b9ad6c	bl 0x00c42220
00b9ad70	add x0,sp,#0x8
00b9ad74	bl 0x00c424d0
00b9ad78	mov x0,x22
00b9ad7c	bl 0x00c426e0
00b9ad80	mov x0,x22
00b9ad84	bl 0x00c30960
00b9ad88	mov x0,x21
00b9ad8c	bl 0x00c426e0
00b9ad90	mov x0,x21
00b9ad94	bl 0x00c30960
00b9ad98	b 0x00b9ada0
00b9ad9c	mov w23,#0xffffff79
00b9ada0	ldr x8,[x25, #0x28]
00b9ada4	ldur x9,[x29, #-0x48]
00b9ada8	cmp x8,x9
00b9adac	b.ne 0x00b9add0
00b9adb0	mov w0,w23
00b9adb4	ldp x29,x30,[sp, #0x1b0]
00b9adb8	ldp x20,x19,[sp, #0x1a0]
00b9adbc	ldp x22,x21,[sp, #0x190]
00b9adc0	ldp x24,x23,[sp, #0x180]
00b9adc4	ldp x28,x25,[sp, #0x170]
00b9adc8	add sp,sp,#0x1c0
00b9adcc	ret
00b9add0	bl 0x00c2fec0
