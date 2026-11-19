; PKCS5_PBE_keyivgen_ex @ 00a6aad4
00a6aad4	sub sp,sp,#0x1f0
00a6aad8	stp x22,x21,[sp, #0x1c0]
00a6aadc	mov x22,x0
00a6aae0	mov x0,x5
00a6aae4	stp x28,x27,[sp, #0x190]
00a6aae8	stp x26,x25,[sp, #0x1a0]
00a6aaec	stp x24,x23,[sp, #0x1b0]
00a6aaf0	stp x20,x19,[sp, #0x1d0]
00a6aaf4	stp x29,x30,[sp, #0x1e0]
00a6aaf8	add x29,sp,#0x1e0
00a6aafc	mov x24,x7
00a6ab00	mov w20,w6
00a6ab04	mov x26,x5
00a6ab08	mov x21,x4
00a6ab0c	mov x19,x3
00a6ab10	mov w28,w2
00a6ab14	mov x27,x1
00a6ab18	bl 0x00c36230
00a6ab1c	cbz x19,0x00a6ab88
00a6ab20	ldr w8,[x19]
00a6ab24	cmp w8,#0x10
00a6ab28	b.ne 0x00a6ab88
00a6ab2c	ldr x8,[x19, #0x8]
00a6ab30	cbz x8,0x00a6ab88
00a6ab34	mov x25,x0
00a6ab38	bl 0x00c37e00
00a6ab3c	mov x1,x19
00a6ab40	bl 0x00c37a80
00a6ab44	cbz x0,0x00a6abdc
00a6ab48	mov x19,x0
00a6ab4c	mov x0,x21
00a6ab50	bl 0x00c34bc0
00a6ab54	mov w23,w0
00a6ab58	cmp w0,#0x11
00a6ab5c	b.cc 0x00a6abf8
00a6ab60	bl 0x00c342a0
00a6ab64	adrp x0,0x2c1000
00a6ab68	adrp x2,0x2c3000
00a6ab6c	add x0,x0,#0xce4
00a6ab70	add x2,x2,#0xa54
00a6ab74	mov w1,#0x3b
00a6ab78	bl 0x00c342b0
00a6ab7c	orr w0,wzr,#0x6
00a6ab80	mov w1,#0xc2
00a6ab84	b 0x00a6ac30
00a6ab88	bl 0x00c342a0
00a6ab8c	adrp x0,0x2c1000
00a6ab90	adrp x2,0x2c3000
00a6ab94	add x0,x0,#0xce4
00a6ab98	add x2,x2,#0xa54
00a6ab9c	mov w1,#0x2f
00a6aba0	bl 0x00c342b0
00a6aba4	orr w0,wzr,#0x6
00a6aba8	mov w1,#0x72
00a6abac	mov x2,xzr
00a6abb0	bl 0x00c342c0
00a6abb4	mov w20,wzr
00a6abb8	mov w0,w20
00a6abbc	ldp x29,x30,[sp, #0x1e0]
00a6abc0	ldp x20,x19,[sp, #0x1d0]
00a6abc4	ldp x22,x21,[sp, #0x1c0]
00a6abc8	ldp x24,x23,[sp, #0x1b0]
00a6abcc	ldp x26,x25,[sp, #0x1a0]
00a6abd0	ldp x28,x27,[sp, #0x190]
00a6abd4	add sp,sp,#0x1f0
00a6abd8	ret
00a6abdc	bl 0x00c342a0
00a6abe0	adrp x0,0x2c1000
00a6abe4	adrp x2,0x2c3000
00a6abe8	add x0,x0,#0xce4
00a6abec	add x2,x2,#0xa54
00a6abf0	mov w1,#0x35
00a6abf4	b 0x00a6aba0
00a6abf8	mov x0,x21
00a6abfc	bl 0x00c34bd0
00a6ac00	mov w8,w0
00a6ac04	cmp w0,#0x41
00a6ac08	b.cc 0x00a6ac54
00a6ac0c	bl 0x00c342a0
00a6ac10	adrp x0,0x2c1000
00a6ac14	adrp x2,0x2c3000
00a6ac18	add x0,x0,#0xce4
00a6ac1c	add x2,x2,#0xa54
00a6ac20	mov w1,#0x40
00a6ac24	bl 0x00c342b0
00a6ac28	orr w0,wzr,#0x6
00a6ac2c	mov w1,#0x82
00a6ac30	mov x2,xzr
00a6ac34	bl 0x00c342c0
00a6ac38	mov w20,wzr
00a6ac3c	mov x24,xzr
00a6ac40	mov x0,x24
00a6ac44	bl 0x00c361e0
00a6ac48	mov x0,x19
00a6ac4c	bl 0x00c37df0
00a6ac50	b 0x00a6abb8
00a6ac54	ldr x0,[x19, #0x8]
00a6ac58	str x8,[sp, #0x8]
00a6ac5c	cbz x0,0x00a6ac68
00a6ac60	bl 0x00c37580
00a6ac64	b 0x00a6ac6c
00a6ac68	mov w0,#0x1
00a6ac6c	stur w0,[x29, #-0xec]
00a6ac70	ldr x8,[x19]
00a6ac74	ldr x9,[x8, #0x8]
00a6ac78	ldrsw x8,[x8]
00a6ac7c	stp x8,x9,[sp, #0x10]
00a6ac80	cbz x27,0x00a6ac9c
00a6ac84	cmn w28,#0x1
00a6ac88	b.ne 0x00a6aca0
00a6ac8c	mov x0,x27
00a6ac90	bl 0x00c2ff50
00a6ac94	mov x28,x0
00a6ac98	b 0x00a6aca0
00a6ac9c	mov w28,wzr
00a6aca0	mov x0,x26
00a6aca4	bl 0x00c34c20
00a6aca8	tbnz w0,#0x1f,0x00a6ac38
00a6acac	ldr x2,[x29, #0x10]
00a6acb0	adrp x1,0x2b9000
00a6acb4	str x0,[sp]
00a6acb8	add x1,x1,#0xe5f
00a6acbc	mov x0,x24
00a6acc0	bl 0x00c36210
00a6acc4	mov x26,x0
00a6acc8	bl 0x00c361f0
00a6accc	mov x24,x0
00a6acd0	mov x0,x26
00a6acd4	bl 0x00c36220
00a6acd8	cbz x24,0x00a6ae44
00a6acdc	adrp x0,0x2c3000
00a6ace0	sxtw x2,w28
00a6ace4	add x0,x0,#0xa6a
00a6ace8	sub x8,x29,#0x98
00a6acec	mov x1,x27
00a6acf0	bl 0x00c34c50
00a6acf4	ldur x8,[x29, #-0x78]
00a6acf8	ldur q0,[x29, #-0x88]
00a6acfc	ldur q1,[x29, #-0x98]
00a6ad00	ldp x2,x1,[sp, #0x10]
00a6ad04	adrp x0,0x2a7000
00a6ad08	str x8,[sp, #0x40]
00a6ad0c	add x0,x0,#0xb6c
00a6ad10	sub x8,x29,#0x98
00a6ad14	stp q1,q0,[sp, #0x20]
00a6ad18	bl 0x00c34c50
00a6ad1c	ldur x8,[x29, #-0x78]
00a6ad20	ldur q0,[x29, #-0x88]
00a6ad24	ldur q1,[x29, #-0x98]
00a6ad28	adrp x0,0x2ac000
00a6ad2c	str x8,[sp, #0x68]
00a6ad30	add x0,x0,#0x172
00a6ad34	sub x8,x29,#0x98
00a6ad38	sub x1,x29,#0xec
00a6ad3c	stur q0,[sp, #0x58]
00a6ad40	stur q1,[sp, #0x48]
00a6ad44	bl 0x00c36260
00a6ad48	ldur x8,[x29, #-0x78]
00a6ad4c	ldur q0,[x29, #-0x88]
00a6ad50	ldur q1,[x29, #-0x98]
00a6ad54	adrp x0,0x29d000
00a6ad58	str x8,[sp, #0x90]
00a6ad5c	add x0,x0,#0xe2e
00a6ad60	sub x8,x29,#0x98
00a6ad64	mov x1,x25
00a6ad68	mov x2,xzr
00a6ad6c	stp q1,q0,[sp, #0x70]
00a6ad70	bl 0x00c36280
00a6ad74	ldur x8,[x29, #-0x78]
00a6ad78	ldur q0,[x29, #-0x88]
00a6ad7c	ldur q1,[x29, #-0x98]
00a6ad80	str x8,[sp, #0xb8]
00a6ad84	sub x8,x29,#0x98
00a6ad88	stur q0,[sp, #0xa8]
00a6ad8c	stur q1,[sp, #0x98]
00a6ad90	bl 0x00c34c40
00a6ad94	ldur x8,[x29, #-0x78]
00a6ad98	ldur q0,[x29, #-0x88]
00a6ad9c	ldur q1,[x29, #-0x98]
00a6ada0	sub x1,x29,#0x98
00a6ada4	str x8,[sp, #0xe0]
00a6ada8	ldr x8,[sp]
00a6adac	add x3,sp,#0x20
00a6adb0	mov x0,x24
00a6adb4	stp q1,q0,[sp, #0xc0]
00a6adb8	sxtw x2,w8
00a6adbc	sub x25,x29,#0x98
00a6adc0	bl 0x00c36200
00a6adc4	cmp w0,#0x1
00a6adc8	b.ne 0x00a6ae44
00a6adcc	ldr x8,[sp, #0x8]
00a6add0	sub x0,x29,#0xd8
00a6add4	sub x1,x29,#0x98
00a6add8	sxtw x2,w8
00a6addc	bl 0x00c2ffd0
00a6ade0	sxtw x2,w23
00a6ade4	mov w8,#0x10
00a6ade8	sub x8,x8,x2
00a6adec	add x1,x25,x8
00a6adf0	sub x0,x29,#0xe8
00a6adf4	bl 0x00c2ffd0
00a6adf8	sub x3,x29,#0xd8
00a6adfc	sub x4,x29,#0xe8
00a6ae00	mov x0,x22
00a6ae04	mov x1,x21
00a6ae08	mov x2,xzr
00a6ae0c	mov w5,w20
00a6ae10	bl 0x00c34be0
00a6ae14	cbz w0,0x00a6ae44
00a6ae18	sub x0,x29,#0x98
00a6ae1c	mov w1,#0x40
00a6ae20	bl 0x00c34750
00a6ae24	sub x0,x29,#0xd8
00a6ae28	mov w1,#0x40
00a6ae2c	bl 0x00c34750
00a6ae30	sub x0,x29,#0xe8
00a6ae34	mov w1,#0x10
00a6ae38	bl 0x00c34750
00a6ae3c	mov w20,#0x1
00a6ae40	b 0x00a6ac40
00a6ae44	mov w20,wzr
00a6ae48	b 0x00a6ac40
