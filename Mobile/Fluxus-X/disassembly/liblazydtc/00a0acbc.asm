; bn_lshift_fixed_top @ 00a0acbc
00a0acbc	str x23,[sp, #-0x40]!
00a0acc0	stp x22,x21,[sp, #0x10]
00a0acc4	stp x20,x19,[sp, #0x20]
00a0acc8	stp x29,x30,[sp, #0x30]
00a0accc	add w8,w2,#0x3f
00a0acd0	cmp w2,#0x0
00a0acd4	ldr w9,[x1, #0x8]
00a0acd8	csel w8,w8,w2,lt
00a0acdc	asr w23,w8,#0x6
00a0ace0	add w22,w23,#0x1
00a0ace4	mov x20,x1
00a0ace8	add w1,w22,w9
00a0acec	add x29,sp,#0x30
00a0acf0	mov w21,w2
00a0acf4	mov x19,x0
00a0acf8	bl 0x00c38e80
00a0acfc	cbz x0,0x00a0adbc
00a0ad00	ldr w8,[x20, #0x8]
00a0ad04	cbz w8,0x00a0ad84
00a0ad08	ldr x11,[x20]
00a0ad0c	sub w14,w8,#0x1
00a0ad10	neg w12,w21
00a0ad14	ldr x0,[x19]
00a0ad18	ldr x14,[x11, w14, SXTW #0x3]
00a0ad1c	and w13,w12,#0x3f
00a0ad20	neg x12,x13
00a0ad24	and w9,w21,#0x3f
00a0ad28	orr x15,x12,x12, LSR #0x8
00a0ad2c	lsr x16,x14,x13
00a0ad30	sxtw x10,w8
00a0ad34	cmp w8,#0x2
00a0ad38	add x12,x0,w23, SXTW  #0x3
00a0ad3c	and x16,x16,x15
00a0ad40	lsl x14,x14,x9
00a0ad44	str x16,[x12, x10, LSL #0x3]
00a0ad48	b.lt 0x00a0ad7c
00a0ad4c	lsl x16,x10,#0x3
00a0ad50	add x17,x11,x16
00a0ad54	ldur x17,[x17, #-0x10]
00a0ad58	add x16,x12,x16
00a0ad5c	cmp x10,#0x2
00a0ad60	sub x10,x10,#0x1
00a0ad64	lsr x18,x17,x13
00a0ad68	and x18,x18,x15
00a0ad6c	orr x14,x18,x14
00a0ad70	stur x14,[x16, #-0x8]
00a0ad74	lsl x14,x17,x9
00a0ad78	b.gt 0x00a0ad4c
00a0ad7c	str x14,[x12]
00a0ad80	b 0x00a0ad8c
00a0ad84	ldr x0,[x19]
00a0ad88	str xzr,[x0, w23, SXTW #0x3]
00a0ad8c	add w9,w21,#0x3f
00a0ad90	cmp w9,#0x7f
00a0ad94	b.cc 0x00a0ada8
00a0ad98	sbfiz x2,x23,#0x3,#0x20
00a0ad9c	mov w1,wzr
00a0ada0	bl 0x00c301c0
00a0ada4	ldr w8,[x20, #0x8]
00a0ada8	ldr w9,[x20, #0x10]
00a0adac	add w8,w22,w8
00a0adb0	mov w0,#0x1
00a0adb4	str w8,[x19, #0x8]
00a0adb8	str w9,[x19, #0x10]
00a0adbc	ldp x29,x30,[sp, #0x30]
00a0adc0	ldp x20,x19,[sp, #0x20]
00a0adc4	ldp x22,x21,[sp, #0x10]
00a0adc8	ldr x23,[sp], #0x40
00a0adcc	ret
