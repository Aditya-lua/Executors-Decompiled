; psa_cipher_set_iv @ 00b8ac90
00b8ac90	str x23,[sp, #-0x40]!
00b8ac94	stp x22,x21,[sp, #0x10]
00b8ac98	stp x20,x19,[sp, #0x20]
00b8ac9c	stp x29,x30,[sp, #0x30]
00b8aca0	add x29,sp,#0x30
00b8aca4	ldr w23,[x0]
00b8aca8	mov x21,x2
00b8acac	mov x19,x0
00b8acb0	mov x22,x1
00b8acb4	cbz w23,0x00b8ace0
00b8acb8	ldrb w8,[x19, #0x4]
00b8acbc	and w8,w8,#0x3
00b8acc0	cmp w8,#0x1
00b8acc4	b.ne 0x00b8acec
00b8acc8	cmp x21,#0x10
00b8accc	b.ls 0x00b8ad38
00b8acd0	mov x20,xzr
00b8acd4	mov w21,#0xffffff79
00b8acd8	cbnz w23,0x00b8acf8
00b8acdc	b 0x00b8ad18
00b8ace0	mov x20,xzr
00b8ace4	mov w21,#0xffffff77
00b8ace8	b 0x00b8ad18
00b8acec	mov x20,xzr
00b8acf0	mov w21,#0xffffff77
00b8acf4	cbz w23,0x00b8ad18
00b8acf8	cmp w23,#0x1
00b8acfc	b.ne 0x00b8ad08
00b8ad00	add x0,x19,#0x8
00b8ad04	bl 0x00c42e70
00b8ad08	ldrb w8,[x19, #0x4]
00b8ad0c	str wzr,[x19]
00b8ad10	and w8,w8,#0xfc
00b8ad14	strb w8,[x19, #0x4]
00b8ad18	mov x0,x20
00b8ad1c	bl 0x00c30960
00b8ad20	mov w0,w21
00b8ad24	ldp x29,x30,[sp, #0x30]
00b8ad28	ldp x20,x19,[sp, #0x20]
00b8ad2c	ldp x22,x21,[sp, #0x10]
00b8ad30	ldr x23,[sp], #0x40
00b8ad34	ret
00b8ad38	cbz x21,0x00b8ad74
00b8ad3c	mov w1,#0x1
00b8ad40	mov x0,x21
00b8ad44	bl 0x00c30a30
00b8ad48	mov x20,x0
00b8ad4c	cbz x0,0x00b8ada4
00b8ad50	mov x0,x20
00b8ad54	mov x1,x22
00b8ad58	mov x2,x21
00b8ad5c	bl 0x00c2ffd0
00b8ad60	cmp w23,#0x1
00b8ad64	b.eq 0x00b8ad80
00b8ad68	mov w21,#0xffffff79
00b8ad6c	cbnz w23,0x00b8acf8
00b8ad70	b 0x00b8ad18
00b8ad74	mov x20,xzr
00b8ad78	cmp w23,#0x1
00b8ad7c	b.ne 0x00b8ad68
00b8ad80	add x0,x19,#0x8
00b8ad84	mov x1,x20
00b8ad88	mov x2,x21
00b8ad8c	bl 0x00c42ed0
00b8ad90	mov w21,w0
00b8ad94	cbz w0,0x00b8adb0
00b8ad98	ldr w23,[x19]
00b8ad9c	cbnz w23,0x00b8acf8
00b8ada0	b 0x00b8ad18
00b8ada4	mov w21,#0xffffff73
00b8ada8	cbnz w23,0x00b8acf8
00b8adac	b 0x00b8ad18
00b8adb0	ldrb w8,[x19, #0x4]
00b8adb4	orr w8,w8,#0x2
00b8adb8	b 0x00b8ad14
