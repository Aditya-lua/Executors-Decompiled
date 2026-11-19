; OSSL_HTTP_parse_url @ 00b1ac1c
00b1ac1c	sub sp,sp,#0x80
00b1ac20	stp x29,x30,[sp, #0x70]
00b1ac24	add x29,sp,#0x70
00b1ac28	stp x28,x27,[sp, #0x20]
00b1ac2c	ldr x27,[x29, #0x10]
00b1ac30	stp x26,x25,[sp, #0x30]
00b1ac34	stp x24,x23,[sp, #0x40]
00b1ac38	stp x22,x21,[sp, #0x50]
00b1ac3c	stp x20,x19,[sp, #0x60]
00b1ac40	mov x19,x7
00b1ac44	mov x20,x6
00b1ac48	mov x24,x5
00b1ac4c	mov x23,x4
00b1ac50	mov x21,x3
00b1ac54	mov x22,x2
00b1ac58	mov x26,x1
00b1ac5c	cbz x4,0x00b1ac64
00b1ac60	str xzr,[x23]
00b1ac64	cbz x26,0x00b1ac6c
00b1ac68	str wzr,[x26]
00b1ac6c	add x1,sp,#0x18
00b1ac70	add x4,sp,#0x10
00b1ac74	mov x2,x22
00b1ac78	mov x3,x21
00b1ac7c	mov x5,x24
00b1ac80	mov x6,x20
00b1ac84	mov x7,x19
00b1ac88	str x27,[sp]
00b1ac8c	bl 0x00b1a64c
00b1ac90	cbz w0,0x00b1ae94
00b1ac94	ldr x25,[sp, #0x18]
00b1ac98	adrp x1,0x2d9000
00b1ac9c	add x1,x1,#0x95
00b1aca0	mov x0,x25
00b1aca4	bl 0x00c301f0
00b1aca8	cbz w0,0x00b1ad28
00b1acac	ldrb w8,[x25]
00b1acb0	cbz w8,0x00b1ad20
00b1acb4	adrp x1,0x2b3000
00b1acb8	add x1,x1,#0x577
00b1acbc	mov x0,x25
00b1acc0	bl 0x00c301f0
00b1acc4	cbz w0,0x00b1ad20
00b1acc8	bl 0x00c342a0
00b1accc	adrp x23,0x2aa000
00b1acd0	add x23,x23,#0xc80
00b1acd4	adrp x2,0x2a2000
00b1acd8	add x2,x2,#0xeeb
00b1acdc	mov w1,#0xd4
00b1ace0	mov x0,x23
00b1ace4	bl 0x00c342b0
00b1ace8	mov w0,#0x3d
00b1acec	orr w1,wzr,#0x7c
00b1acf0	mov x2,xzr
00b1acf4	bl 0x00c342c0
00b1acf8	ldr x0,[sp, #0x18]
00b1acfc	mov w2,#0xd5
00b1ad00	mov x1,x23
00b1ad04	bl 0x00c32310
00b1ad08	ldr x0,[sp, #0x10]
00b1ad0c	mov w2,#0xd6
00b1ad10	mov x1,x23
00b1ad14	bl 0x00c32310
00b1ad18	cbnz x22,0x00b1ade4
00b1ad1c	b 0x00b1adfc
00b1ad20	mov w28,wzr
00b1ad24	b 0x00b1ad34
00b1ad28	mov w28,#0x1
00b1ad2c	cbz x26,0x00b1ad34
00b1ad30	str w28,[x26]
00b1ad34	adrp x1,0x2aa000
00b1ad38	add x1,x1,#0xc80
00b1ad3c	mov w2,#0xd9
00b1ad40	mov x0,x25
00b1ad44	bl 0x00c32310
00b1ad48	ldr x25,[sp, #0x10]
00b1ad4c	adrp x1,0x2cb000
00b1ad50	add x1,x1,#0x723
00b1ad54	mov x0,x25
00b1ad58	bl 0x00c301f0
00b1ad5c	cbz w0,0x00b1ad6c
00b1ad60	cbz x23,0x00b1ae74
00b1ad64	str x25,[x23]
00b1ad68	b 0x00b1ae88
00b1ad6c	adrp x1,0x2aa000
00b1ad70	add x1,x1,#0xc80
00b1ad74	mov w2,#0xdd
00b1ad78	mov x0,x25
00b1ad7c	bl 0x00c32310
00b1ad80	adrp x8,0x2ba000
00b1ad84	adrp x9,0x2b4000
00b1ad88	add x8,x8,#0x984
00b1ad8c	add x9,x9,#0xc07
00b1ad90	cmp w28,#0x0
00b1ad94	adrp x1,0x2c6000
00b1ad98	csel x0,x9,x8,eq
00b1ad9c	add x1,x1,#0xd41
00b1ada0	add x2,sp,#0xc
00b1ada4	str x0,[sp, #0x10]
00b1ada8	bl 0x00c30c30
00b1adac	cmp w0,#0x1
00b1adb0	b.ne 0x00b1ade0
00b1adb4	cbz x24,0x00b1adc0
00b1adb8	ldr w8,[sp, #0xc]
00b1adbc	str w8,[x24]
00b1adc0	cbz x23,0x00b1ae88
00b1adc4	ldr x0,[sp, #0x10]
00b1adc8	adrp x1,0x2aa000
00b1adcc	add x1,x1,#0xc80
00b1add0	mov w2,#0xe4
00b1add4	bl 0x00c34600
00b1add8	str x0,[x23]
00b1addc	cbnz x0,0x00b1ae88
00b1ade0	cbz x22,0x00b1adfc
00b1ade4	ldr x0,[x22]
00b1ade8	adrp x1,0x2aa000
00b1adec	add x1,x1,#0xc80
00b1adf0	mov w2,#0x29
00b1adf4	bl 0x00c32310
00b1adf8	str xzr,[x22]
00b1adfc	cbz x21,0x00b1ae18
00b1ae00	ldr x0,[x21]
00b1ae04	adrp x1,0x2aa000
00b1ae08	add x1,x1,#0xc80
00b1ae0c	mov w2,#0x29
00b1ae10	bl 0x00c32310
00b1ae14	str xzr,[x21]
00b1ae18	cbz x20,0x00b1ae34
00b1ae1c	ldr x0,[x20]
00b1ae20	adrp x1,0x2aa000
00b1ae24	add x1,x1,#0xc80
00b1ae28	mov w2,#0x29
00b1ae2c	bl 0x00c32310
00b1ae30	str xzr,[x20]
00b1ae34	cbz x19,0x00b1ae50
00b1ae38	ldr x0,[x19]
00b1ae3c	adrp x1,0x2aa000
00b1ae40	add x1,x1,#0xc80
00b1ae44	mov w2,#0x29
00b1ae48	bl 0x00c32310
00b1ae4c	str xzr,[x19]
00b1ae50	cbz x27,0x00b1ae90
00b1ae54	ldr x0,[x27]
00b1ae58	adrp x1,0x2aa000
00b1ae5c	add x1,x1,#0xc80
00b1ae60	mov w2,#0x29
00b1ae64	bl 0x00c32310
00b1ae68	mov w0,wzr
00b1ae6c	str xzr,[x27]
00b1ae70	b 0x00b1ae94
00b1ae74	adrp x1,0x2aa000
00b1ae78	add x1,x1,#0xc80
00b1ae7c	mov w2,#0xec
00b1ae80	mov x0,x25
00b1ae84	bl 0x00c32310
00b1ae88	mov w0,#0x1
00b1ae8c	b 0x00b1ae94
00b1ae90	mov w0,wzr
00b1ae94	ldp x29,x30,[sp, #0x70]
00b1ae98	ldp x20,x19,[sp, #0x60]
00b1ae9c	ldp x22,x21,[sp, #0x50]
00b1aea0	ldp x24,x23,[sp, #0x40]
00b1aea4	ldp x26,x25,[sp, #0x30]
00b1aea8	ldp x28,x27,[sp, #0x20]
00b1aeac	add sp,sp,#0x80
00b1aeb0	ret
