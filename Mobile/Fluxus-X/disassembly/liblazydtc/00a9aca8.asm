; CRYPTO_secure_clear_free @ 00a9aca8
00a9aca8	stp x22,x21,[sp, #-0x30]!
00a9acac	stp x20,x19,[sp, #0x10]
00a9acb0	stp x29,x30,[sp, #0x20]
00a9acb4	add x29,sp,#0x20
00a9acb8	cbz x0,0x00a9ad6c
00a9acbc	adrp x8,0xd22000
00a9acc0	ldrb w8,[x8, #0xf0]
00a9acc4	mov w20,w3
00a9acc8	mov x21,x2
00a9accc	mov x19,x0
00a9acd0	cmp w8,#0x1
00a9acd4	b.ne 0x00a9ad48
00a9acd8	adrp x22,0xd22000
00a9acdc	add x22,x22,#0x108
00a9ace0	ldr x8,[x22, #0x10]
00a9ace4	cmp x8,x19
00a9ace8	b.hi 0x00a9ad48
00a9acec	ldr x9,[x22, #0x18]
00a9acf0	add x8,x8,x9
00a9acf4	cmp x8,x19
00a9acf8	b.ls 0x00a9ad48
00a9acfc	adrp x21,0xd22000
00a9ad00	ldr x0,[x21, #0xf8]
00a9ad04	bl 0x00c356a0
00a9ad08	cbz w0,0x00a9ad6c
00a9ad0c	ldr x8,[x22, #0x10]
00a9ad10	cmp x8,x19
00a9ad14	b.hi 0x00a9ae1c
00a9ad18	ldr x9,[x22, #0x18]
00a9ad1c	add x10,x8,x9
00a9ad20	cmp x10,x19
00a9ad24	b.ls 0x00a9ae1c
00a9ad28	ldp x11,x10,[x22, #0x28]
00a9ad2c	add x9,x19,x9
00a9ad30	sub x8,x9,x8
00a9ad34	cmp x10,x8
00a9ad38	sub x20,x11,#0x1
00a9ad3c	b.ls 0x00a9ad7c
00a9ad40	ldr x2,[x22, #0x38]
00a9ad44	b 0x00a9adb0
00a9ad48	mov x0,x19
00a9ad4c	bl 0x00c34750
00a9ad50	mov x0,x19
00a9ad54	mov w2,w20
00a9ad58	ldp x29,x30,[sp, #0x20]
00a9ad5c	ldp x20,x19,[sp, #0x10]
00a9ad60	mov x1,x21
00a9ad64	ldp x22,x21,[sp], #0x30
00a9ad68	b 0x00c32310
00a9ad6c	ldp x29,x30,[sp, #0x20]
00a9ad70	ldp x20,x19,[sp, #0x10]
00a9ad74	ldp x22,x21,[sp], #0x30
00a9ad78	ret
00a9ad7c	ldr x2,[x22, #0x38]
00a9ad80	udiv x8,x8,x10
00a9ad84	mov w9,#0x1
00a9ad88	lsr x10,x8,#0x3
00a9ad8c	ldrb w10,[x2, x10]
00a9ad90	and x11,x8,#0x7
00a9ad94	lsl x11,x9,x11
00a9ad98	tst x11,x10
00a9ad9c	b.ne 0x00a9adb0
00a9ada0	tbnz w8,#0x0,0x00a9ae04
00a9ada4	lsr x8,x8,#0x1
00a9ada8	sub x20,x20,#0x1
00a9adac	cbnz x8,0x00a9ad88
00a9adb0	mov x0,x19
00a9adb4	mov w1,w20
00a9adb8	bl 0x00a9b18c
00a9adbc	cbz w0,0x00a9ae34
00a9adc0	ldr x8,[x22, #0x18]
00a9adc4	and x9,x20,#0xffffffff
00a9adc8	mov x0,x19
00a9adcc	lsr x20,x8,x9
00a9add0	mov x1,x20
00a9add4	bl 0x00c34750
00a9add8	adrp x8,0xd22000
00a9addc	ldr x9,[x8, #0x100]
00a9ade0	mov x0,x19
00a9ade4	sub x9,x9,x20
00a9ade8	str x9,[x8, #0x100]
00a9adec	bl 0x00a9a8b4
00a9adf0	ldr x0,[x21, #0xf8]
00a9adf4	ldp x29,x30,[sp, #0x20]
00a9adf8	ldp x20,x19,[sp, #0x10]
00a9adfc	ldp x22,x21,[sp], #0x30
00a9ae00	b 0x00c35690
00a9ae04	adrp x0,0x2a4000
00a9ae08	adrp x1,0x2d6000
00a9ae0c	add x0,x0,#0x3f8
00a9ae10	add x1,x1,#0xc
00a9ae14	mov w2,#0x14c
00a9ae18	bl 0x00c3c240
00a9ae1c	adrp x0,0x29e000
00a9ae20	adrp x1,0x2d6000
00a9ae24	add x0,x0,#0x41c
00a9ae28	add x1,x1,#0xc
00a9ae2c	mov w2,#0x2d2
00a9ae30	bl 0x00c3c240
00a9ae34	adrp x0,0x2ac000
00a9ae38	adrp x1,0x2d6000
00a9ae3c	add x0,x0,#0x398
00a9ae40	add x1,x1,#0xc
00a9ae44	mov w2,#0x2d6
00a9ae48	bl 0x00c3c240
