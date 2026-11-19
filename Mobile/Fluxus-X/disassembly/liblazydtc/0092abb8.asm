; curl_multi_add_handle @ 0092abb8
0092abb8	stp x20,x19,[sp, #-0x20]!
0092abbc	stp x29,x30,[sp, #0x10]
0092abc0	add x29,sp,#0x10
0092abc4	mov x19,x1
0092abc8	mov x20,x0
0092abcc	cbz x0,0x0092ac0c
0092abd0	ldr w8,[x20]
0092abd4	mov w9,#0xab1e
0092abd8	movk w9,#0xb, LSL #16
0092abdc	cmp w8,w9
0092abe0	b.ne 0x0092ac0c
0092abe4	cbz x19,0x0092ac14
0092abe8	ldr w8,[x19]
0092abec	mov w9,#0xdbad
0092abf0	movk w9,#0xc0de, LSL #16
0092abf4	cmp w8,w9
0092abf8	b.ne 0x0092ac14
0092abfc	ldr x8,[x19, #0xc0]
0092ac00	cbz x8,0x0092ac24
0092ac04	orr w0,wzr,#0x7
0092ac08	b 0x0092ac18
0092ac0c	mov w0,#0x1
0092ac10	b 0x0092ac18
0092ac14	mov w0,#0x2
0092ac18	ldp x29,x30,[sp, #0x10]
0092ac1c	ldp x20,x19,[sp], #0x20
0092ac20	ret
0092ac24	ldrb w8,[x20, #0x231]
0092ac28	tbnz w8,#0x2,0x0092ac40
0092ac2c	tbz w8,#0x4,0x0092ac50
0092ac30	ldr w9,[x20, #0x1c]
0092ac34	cbz w9,0x0092ac48
0092ac38	mov w0,#0xb
0092ac3c	b 0x0092ac18
0092ac40	mov w0,#0x8
0092ac44	b 0x0092ac18
0092ac48	and w8,w8,#0xffffffef
0092ac4c	strb w8,[x20, #0x231]
0092ac50	ldr x0,[x19, #0xc8]
0092ac54	cbz x0,0x0092ac60
0092ac58	bl 0x00c31ac0
0092ac5c	str xzr,[x19, #0xc8]
0092ac60	add x0,x19,#0xe10
0092ac64	mov x1,xzr
0092ac68	bl 0x00925c98
0092ac6c	ldr x8,[x19, #0x1c8]
0092ac70	cbz x8,0x0092ac78
0092ac74	strb wzr,[x8]
0092ac78	mov w2,#0x8
0092ac7c	mov x0,x19
0092ac80	mov x1,xzr
0092ac84	str wzr,[x19, #0xcb8]
0092ac88	str x20,[x19, #0xc0]
0092ac8c	bl 0x0092aff8
0092ac90	movi v0.2D,#0x0
0092ac94	mov x0,x20
0092ac98	str q0,[x20, #0x210]
0092ac9c	bl 0x0092b1f4
0092aca0	cbnz w0,0x0092ac18
0092aca4	ldr w8,[x19, #0x58]
0092aca8	cbz w8,0x0092acb0
0092acac	str wzr,[x19, #0x58]
0092acb0	ldr x8,[x19, #0xb0]
0092acb4	cbz x8,0x0092acc0
0092acb8	ldr w8,[x19, #0xb8]
0092acbc	cbnz w8,0x0092acd0
0092acc0	add x8,x20,#0xa0
0092acc4	mov w9,#0x1
0092acc8	str x8,[x19, #0xb0]
0092accc	str w9,[x19, #0xb8]
0092acd0	ldr x8,[x19, #0xd0]
0092acd4	cbz x8,0x0092ace0
0092acd8	ldrb w9,[x8, #0x4]
0092acdc	tbnz w9,#0x5,0x0092ace8
0092ace0	add x9,x20,#0x158
0092ace4	b 0x0092acec
0092ace8	add x9,x8,#0x28
0092acec	mov x10,#-0x1
0092acf0	str x9,[x19, #0xc38]
0092acf4	str x10,[x19, #0xc50]
0092acf8	str xzr,[x19, #0x10]
0092acfc	ldr x10,[x20, #0x8]
0092ad00	cbz x10,0x0092ad14
0092ad04	ldr x10,[x20, #0x10]
0092ad08	str x19,[x10, #0x10]
0092ad0c	str x10,[x19, #0x18]
0092ad10	b 0x0092ad1c
0092ad14	str xzr,[x19, #0x18]
0092ad18	str x19,[x20, #0x8]
0092ad1c	ldr d0,[x20, #0x18]
0092ad20	movi v1.2S,#0x1
0092ad24	str x19,[x20, #0x10]
0092ad28	add v0.2S,v0.2S,v1.2S
0092ad2c	str d0,[x20, #0x18]
0092ad30	cbz x8,0x0092ad48
0092ad34	mov w1,#0x5
0092ad38	mov w2,#0x2
0092ad3c	mov x0,x19
0092ad40	bl 0x0093f628
0092ad44	ldr x9,[x19, #0xc38]
0092ad48	ldr w8,[x19, #0x2e0]
0092ad4c	ldr x9,[x9, #0x80]
0092ad50	add x10,x19,#0xa82
0092ad54	str w8,[x9, #0x2e0]
0092ad58	ldr w8,[x19, #0x2ec]
0092ad5c	str w8,[x9, #0x2ec]
0092ad60	add x8,x9,#0xa82
0092ad64	ldr x9,[x10]
0092ad68	ldr x10,[x8]
0092ad6c	lsr x9,x9,#0x1f
0092ad70	bfm x10,x9,#0x21,#0x0
0092ad74	str x10,[x8]
0092ad78	ldr x8,[x19, #0xc38]
0092ad7c	ldr x9,[x8, #0x40]
0092ad80	add x10,x9,#0x1
0092ad84	str x10,[x8, #0x40]
0092ad88	str x9,[x19, #0x8]
0092ad8c	tbz x9,#0x3f,0x0092ad94
0092ad90	str xzr,[x8, #0x40]
0092ad94	ldr x8,[x19, #0xd0]
0092ad98	cbz x8,0x0092ada8
0092ad9c	mov w1,#0x5
0092ada0	mov x0,x19
0092ada4	bl 0x0093f680
0092ada8	mov w0,wzr
0092adac	b 0x0092ac18
