; FUN_00b4ab88 @ 00b4ab88
00b4ab88	stp x24,x23,[sp, #-0x40]!
00b4ab8c	stp x22,x21,[sp, #0x10]
00b4ab90	stp x20,x19,[sp, #0x20]
00b4ab94	stp x29,x30,[sp, #0x30]
00b4ab98	mov x19,x0
00b4ab9c	ldr x0,[x0]
00b4aba0	add x29,sp,#0x30
00b4aba4	mov x21,x1
00b4aba8	bl 0x00c41210
00b4abac	cbz x21,0x00b4af3c
00b4abb0	mov x20,x0
00b4abb4	add x0,x19,#0x8
00b4abb8	mov x1,x21
00b4abbc	mov x2,x20
00b4abc0	bl 0x00c41150
00b4abc4	cbz w0,0x00b4af40
00b4abc8	adrp x1,0x2cd000
00b4abcc	add x1,x1,#0x6e9
00b4abd0	mov x0,x21
00b4abd4	bl 0x00c36530
00b4abd8	mov x22,x0
00b4abdc	cbnz x0,0x00b4abf8
00b4abe0	adrp x1,0x2c5000
00b4abe4	add x1,x1,#0x67e
00b4abe8	mov x0,x21
00b4abec	bl 0x00c36530
00b4abf0	mov x22,x0
00b4abf4	cbz x0,0x00b4ac40
00b4abf8	ldr x8,[x22, #0x18]
00b4abfc	cbz x8,0x00b4ac40
00b4ac00	ldr x8,[x22, #0x10]
00b4ac04	cbz x8,0x00b4ac40
00b4ac08	add x23,x19,#0x20
00b4ac0c	ldr x0,[x23]
00b4ac10	adrp x1,0x2ae000
00b4ac14	add x1,x1,#0xb4d
00b4ac18	mov w2,#0x17b
00b4ac1c	add x24,x19,#0x28
00b4ac20	bl 0x00c32310
00b4ac24	mov x0,x22
00b4ac28	mov x1,x23
00b4ac2c	mov x2,xzr
00b4ac30	mov x3,x24
00b4ac34	str xzr,[x23]
00b4ac38	bl 0x00c3ace0
00b4ac3c	cbz w0,0x00b4af40
00b4ac40	adrp x1,0x2aa000
00b4ac44	add x1,x1,#0xf96
00b4ac48	mov x0,x21
00b4ac4c	bl 0x00c36530
00b4ac50	cbz x0,0x00b4aca0
00b4ac54	ldr x8,[x0, #0x18]
00b4ac58	mov x22,x0
00b4ac5c	cbz x8,0x00b4aca0
00b4ac60	ldr x8,[x22, #0x10]
00b4ac64	cbz x8,0x00b4aca0
00b4ac68	add x23,x19,#0x30
00b4ac6c	ldr x0,[x23]
00b4ac70	adrp x1,0x2ae000
00b4ac74	add x1,x1,#0xb4d
00b4ac78	mov w2,#0x17b
00b4ac7c	add x24,x19,#0x38
00b4ac80	bl 0x00c32310
00b4ac84	mov x0,x22
00b4ac88	mov x1,x23
00b4ac8c	mov x2,xzr
00b4ac90	mov x3,x24
00b4ac94	str xzr,[x23]
00b4ac98	bl 0x00c3ace0
00b4ac9c	cbz w0,0x00b4af40
00b4aca0	adrp x1,0x2d6000
00b4aca4	add x1,x1,#0xc38
00b4aca8	mov x0,x21
00b4acac	bl 0x00c36530
00b4acb0	mov x22,x0
00b4acb4	cbnz x0,0x00b4acd0
00b4acb8	adrp x1,0x2bb000
00b4acbc	add x1,x1,#0xce2
00b4acc0	mov x0,x21
00b4acc4	bl 0x00c36530
00b4acc8	mov x22,x0
00b4accc	cbz x0,0x00b4ad18
00b4acd0	ldr x8,[x22, #0x18]
00b4acd4	cbz x8,0x00b4ad18
00b4acd8	ldr x8,[x22, #0x10]
00b4acdc	cbz x8,0x00b4ad18
00b4ace0	add x23,x19,#0x40
00b4ace4	ldr x0,[x23]
00b4ace8	adrp x1,0x2ae000
00b4acec	add x1,x1,#0xb4d
00b4acf0	mov w2,#0x17b
00b4acf4	add x24,x19,#0x60
00b4acf8	bl 0x00c32310
00b4acfc	mov x0,x22
00b4ad00	mov x1,x23
00b4ad04	mov x2,xzr
00b4ad08	mov x3,x24
00b4ad0c	str xzr,[x23]
00b4ad10	bl 0x00c3ace0
00b4ad14	cbz w0,0x00b4af40
00b4ad18	adrp x1,0x2aa000
00b4ad1c	add x1,x1,#0xfa0
00b4ad20	mov x0,x21
00b4ad24	bl 0x00c36530
00b4ad28	cbz x0,0x00b4ad78
00b4ad2c	ldr x8,[x0, #0x18]
00b4ad30	mov x22,x0
00b4ad34	cbz x8,0x00b4ad78
00b4ad38	ldr x8,[x22, #0x10]
00b4ad3c	cbz x8,0x00b4ad78
00b4ad40	add x23,x19,#0x48
00b4ad44	ldr x0,[x23]
00b4ad48	adrp x1,0x2ae000
00b4ad4c	add x1,x1,#0xb4d
00b4ad50	mov w2,#0x17b
00b4ad54	add x24,x19,#0x68
00b4ad58	bl 0x00c32310
00b4ad5c	mov x0,x22
00b4ad60	mov x1,x23
00b4ad64	mov x2,xzr
00b4ad68	mov x3,x24
00b4ad6c	str xzr,[x23]
00b4ad70	bl 0x00c3ace0
00b4ad74	cbz w0,0x00b4af40
00b4ad78	adrp x1,0x2c8000
00b4ad7c	add x1,x1,#0x75c
00b4ad80	mov x0,x21
00b4ad84	bl 0x00c36530
00b4ad88	cbz x0,0x00b4ad98
00b4ad8c	add x1,x19,#0x98
00b4ad90	bl 0x00c36510
00b4ad94	cbz w0,0x00b4af40
00b4ad98	adrp x1,0x2a8000
00b4ad9c	add x1,x1,#0xd19
00b4ada0	mov x0,x21
00b4ada4	bl 0x00c36530
00b4ada8	cbz x0,0x00b4adfc
00b4adac	ldr x8,[x0, #0x18]
00b4adb0	mov x22,x0
00b4adb4	cbz x8,0x00b4adf8
00b4adb8	ldr x8,[x22, #0x10]
00b4adbc	cbz x8,0x00b4adf8
00b4adc0	add x23,x19,#0x50
00b4adc4	ldr x0,[x23]
00b4adc8	adrp x1,0x2ae000
00b4adcc	add x1,x1,#0xb4d
00b4add0	mov w2,#0x17b
00b4add4	add x24,x19,#0x70
00b4add8	bl 0x00c32310
00b4addc	mov x0,x22
00b4ade0	mov x1,x23
00b4ade4	mov x2,xzr
00b4ade8	mov x3,x24
00b4adec	str xzr,[x23]
00b4adf0	bl 0x00c3ace0
00b4adf4	cbz w0,0x00b4af40
00b4adf8	str wzr,[x19, #0x98]
00b4adfc	adrp x1,0x2aa000
00b4ae00	add x1,x1,#0xfac
00b4ae04	mov x0,x21
00b4ae08	bl 0x00c36530
00b4ae0c	cbz x0,0x00b4ae5c
00b4ae10	ldr x8,[x0, #0x18]
00b4ae14	mov x22,x0
00b4ae18	cbz x8,0x00b4ae5c
00b4ae1c	ldr x8,[x22, #0x10]
00b4ae20	cbz x8,0x00b4ae5c
00b4ae24	add x23,x19,#0x58
00b4ae28	ldr x0,[x23]
00b4ae2c	adrp x1,0x2ae000
00b4ae30	add x1,x1,#0xb4d
00b4ae34	mov w2,#0x17b
00b4ae38	add x24,x19,#0x78
00b4ae3c	bl 0x00c32310
00b4ae40	mov x0,x22
00b4ae44	mov x1,x23
00b4ae48	mov x2,xzr
00b4ae4c	mov x3,x24
00b4ae50	str xzr,[x23]
00b4ae54	bl 0x00c3ace0
00b4ae58	cbz w0,0x00b4af40
00b4ae5c	adrp x1,0x2b5000
00b4ae60	add x1,x1,#0xd11
00b4ae64	mov x0,x21
00b4ae68	bl 0x00c36530
00b4ae6c	cbz x0,0x00b4af3c
00b4ae70	ldr w8,[x0, #0x8]
00b4ae74	mov x22,x0
00b4ae78	mov w0,wzr
00b4ae7c	cmp w8,#0x4
00b4ae80	b.ne 0x00b4af40
00b4ae84	adrp x1,0x2d3000
00b4ae88	add x1,x1,#0x7c2
00b4ae8c	mov x0,x21
00b4ae90	bl 0x00c36530
00b4ae94	ldr x1,[x22, #0x10]
00b4ae98	cmp x0,#0x0
00b4ae9c	mov x0,x20
00b4aea0	csel x2,xzr,x1,eq
00b4aea4	bl 0x00c35260
00b4aea8	mov x20,x0
00b4aeac	cbz x0,0x00b4af54
00b4aeb0	adrp x1,0x2d2000
00b4aeb4	add x1,x1,#0x86d
00b4aeb8	mov x0,x20
00b4aebc	bl 0x00c3cf10
00b4aec0	mov x21,xzr
00b4aec4	cbnz w0,0x00b4af18
00b4aec8	adrp x1,0x2c4000
00b4aecc	add x1,x1,#0x716
00b4aed0	mov x0,x20
00b4aed4	bl 0x00c3cf10
00b4aed8	cbz w0,0x00b4aee4
00b4aedc	mov w21,#0x1
00b4aee0	b 0x00b4af18
00b4aee4	adrp x1,0x2bc000
00b4aee8	add x1,x1,#0x9b4
00b4aeec	mov x0,x20
00b4aef0	bl 0x00c3cf10
00b4aef4	cbz w0,0x00b4af00
00b4aef8	mov w21,#0x2
00b4aefc	b 0x00b4af18
00b4af00	adrp x1,0x2a3000
00b4af04	add x1,x1,#0x226
00b4af08	mov x0,x20
00b4af0c	bl 0x00c3cf10
00b4af10	cbz w0,0x00b4af54
00b4af14	orr w21,wzr,#0x3
00b4af18	mov x0,x20
00b4af1c	bl 0x00c357d0
00b4af20	adrp x8,0xc9d000
00b4af24	add x8,x8,#0x8e8
00b4af28	add x8,x8,x21, LSL #0x5
00b4af2c	ldur q0,[x8, #0x8]
00b4af30	ldr x8,[x8, #0x18]
00b4af34	stur q0,[x19, #0x88]
00b4af38	str x8,[x19, #0x80]
00b4af3c	mov w0,#0x1
00b4af40	ldp x29,x30,[sp, #0x30]
00b4af44	ldp x20,x19,[sp, #0x20]
00b4af48	ldp x22,x21,[sp, #0x10]
00b4af4c	ldp x24,x23,[sp], #0x40
00b4af50	ret
00b4af54	bl 0x00c342a0
00b4af58	adrp x0,0x2ae000
00b4af5c	adrp x2,0x2dc000
00b4af60	add x0,x0,#0xb4d
00b4af64	add x2,x2,#0xf85
00b4af68	mov w1,#0x5d
00b4af6c	bl 0x00c342b0
00b4af70	mov w0,#0x39
00b4af74	mov w1,#0x91
00b4af78	mov x2,xzr
00b4af7c	bl 0x00c342c0
00b4af80	mov x0,x20
00b4af84	bl 0x00c357d0
00b4af88	mov w0,wzr
00b4af8c	b 0x00b4af40
