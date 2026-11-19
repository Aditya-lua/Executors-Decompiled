; FUN_00b7ac30 @ 00b7ac30
00b7ac30	sub sp,sp,#0xc0
00b7ac34	stp x28,x27,[sp, #0x60]
00b7ac38	stp x26,x25,[sp, #0x70]
00b7ac3c	stp x24,x23,[sp, #0x80]
00b7ac40	stp x22,x21,[sp, #0x90]
00b7ac44	stp x20,x19,[sp, #0xa0]
00b7ac48	stp x29,x30,[sp, #0xb0]
00b7ac4c	add x29,sp,#0xb0
00b7ac50	mrs x25,tpidr_el0
00b7ac54	ldr x8,[x25, #0x28]
00b7ac58	mov x20,x5
00b7ac5c	mov x19,x4
00b7ac60	mov x21,x3
00b7ac64	mov x24,x2
00b7ac68	mov x22,x0
00b7ac6c	cmp x2,#0x3
00b7ac70	str x8,[sp, #0x58]
00b7ac74	str xzr,[x5]
00b7ac78	b.cs 0x00b7ac84
00b7ac7c	mov w24,#0xffff9f00
00b7ac80	b 0x00b7adb4
00b7ac84	ldr x8,[x1], #0x8
00b7ac88	sub x9,x24,#0x1
00b7ac8c	lsl x23,x9,#0x3
00b7ac90	add x10,x9,x9, LSL #0x1
00b7ac94	mov x0,x19
00b7ac98	mov x2,x23
00b7ac9c	lsl x26,x10,#0x1
00b7aca0	str x8,[x21]
00b7aca4	bl 0x00c2ff60
00b7aca8	cbz x26,0x00b7ad80
00b7acac	adrp x9,0x29c000
00b7acb0	adrp x10,0x29c000
00b7acb4	ldr q0,[x9, #0x3c0]
00b7acb8	adrp x11,0x29c000
00b7acbc	ldr q1,[x10, #0x5e0]
00b7acc0	ldr q2,[x11, #0x1f0]
00b7acc4	add x8,x19,x24, LSL #0x3
00b7acc8	neg v0.2D,v0.2D
00b7accc	sub x27,x8,#0x10
00b7acd0	str q0,[sp, #0x20]
00b7acd4	neg v0.2D,v1.2D
00b7acd8	str q0,[sp, #0x10]
00b7acdc	neg v0.2D,v2.2D
00b7ace0	mov x28,x27
00b7ace4	str q0,[sp]
00b7ace8	ldp q3,q2,[sp, #0x10]
00b7acec	ldr q4,[sp]
00b7acf0	dup v0.2D,x26
00b7acf4	lsr x8,x26,#0x8
00b7acf8	ushl v2.2D,v0.2D,v2.2D
00b7acfc	ushl v3.2D,v0.2D,v3.2D
00b7ad00	ushl v0.2D,v0.2D,v4.2D
00b7ad04	fmov d4,x8
00b7ad08	mov v4.D[0x1],x26
00b7ad0c	xtn v0.2S,v0.2D
00b7ad10	xtn v3.2S,v3.2D
00b7ad14	ldr d1,[x21]
00b7ad18	xtn2 v0.4S,v4.2D
00b7ad1c	xtn2 v3.4S,v2.2D
00b7ad20	xtn v2.4H,v3.4S
00b7ad24	xtn2 v2.8H,v0.4S
00b7ad28	xtn v0.8B,v2.8H
00b7ad2c	eor v0.8B,v1.8B,v0.8B
00b7ad30	str d0,[x21]
00b7ad34	str d0,[sp, #0x38]
00b7ad38	ldr x8,[x28]
00b7ad3c	add x1,sp,#0x38
00b7ad40	mov w2,#0x10
00b7ad44	add x3,sp,#0x48
00b7ad48	add x4,sp,#0x30
00b7ad4c	mov x0,x22
00b7ad50	str x8,[sp, #0x40]
00b7ad54	bl 0x00c42180
00b7ad58	mov w24,w0
00b7ad5c	cbnz w0,0x00b7ad8c
00b7ad60	ldr x8,[sp, #0x48]
00b7ad64	cmp x28,x19
00b7ad68	str x8,[x21]
00b7ad6c	ldr x8,[sp, #0x50]
00b7ad70	str x8,[x28], #-0x8
00b7ad74	csel x28,x27,x28,eq
00b7ad78	subs x26,x26,#0x1
00b7ad7c	b.ne 0x00b7ace8
00b7ad80	mov w24,wzr
00b7ad84	str x23,[x20]
00b7ad88	b 0x00b7ad9c
00b7ad8c	mov x0,x19
00b7ad90	mov w1,wzr
00b7ad94	mov x2,x23
00b7ad98	bl 0x00c301c0
00b7ad9c	add x0,sp,#0x38
00b7ada0	mov w1,#0x10
00b7ada4	bl 0x00c42220
00b7ada8	add x0,sp,#0x48
00b7adac	mov w1,#0x10
00b7adb0	bl 0x00c42220
00b7adb4	ldr x8,[x25, #0x28]
00b7adb8	ldr x9,[sp, #0x58]
00b7adbc	cmp x8,x9
00b7adc0	b.ne 0x00b7ade8
00b7adc4	mov w0,w24
00b7adc8	ldp x29,x30,[sp, #0xb0]
00b7adcc	ldp x20,x19,[sp, #0xa0]
00b7add0	ldp x22,x21,[sp, #0x90]
00b7add4	ldp x24,x23,[sp, #0x80]
00b7add8	ldp x26,x25,[sp, #0x70]
00b7addc	ldp x28,x27,[sp, #0x60]
00b7ade0	add sp,sp,#0xc0
00b7ade4	ret
00b7ade8	bl 0x00c2fec0
