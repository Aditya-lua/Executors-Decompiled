; FUN_00886aac @ 00886aac
00886aac	stp x29,x30,[sp, #-0x20]!
00886ab0	stp x20,x19,[sp, #0x10]
00886ab4	mov x29,sp
00886ab8	mov x20,x1
00886abc	mov x19,x0
00886ac0	bl 0x00886bbc
00886ac4	ldr x8,[x20]
00886ac8	mov x11,#0x2d69
00886acc	movk x11,#0xeb38, LSL #16
00886ad0	lsl w9,w8,#0x3
00886ad4	lsr x10,x8,#0x20
00886ad8	movk x11,#0xea08, LSL #32
00886adc	movk x11,#0x9ddf, LSL #48
00886ae0	add x9,x9,#0x8
00886ae4	eor x9,x9,x10
00886ae8	mul x9,x9,x11
00886aec	eor x10,x10,x9, LSR #0x2f
00886af0	eor x9,x10,x9
00886af4	mov x10,#0x959d
00886af8	mul x9,x9,x11
00886afc	movk x10,#0xb8f4, LSL #16
00886b00	ldr x11,[x19, #0x18]
00886b04	movk x10,#0xd34f, LSL #32
00886b08	movk x10,#0x949d, LSL #48
00886b0c	eor x9,x9,x9, LSR #0x2f
00886b10	mul x9,x9,x10
00886b14	ldrb w10,[x19, #0x30]
00886b18	lsr x9,x9,x10
00886b1c	mov w10,#0x1
00886b20	lsr x12,x9,#0x6
00886b24	lsl x14,x10,x9
00886b28	ldr x10,[x19]
00886b2c	ldr x13,[x11, x12, LSL #0x3]
00886b30	tst x14,x13
00886b34	b.eq 0x00886b74
00886b38	ldr x12,[x19, #0x20]
00886b3c	mov w16,#0x18
00886b40	mov w17,#0x1
00886b44	sub x15,x12,#0x1
00886b48	mul x12,x9,x16
00886b4c	ldr x12,[x10, x12#0x0]
00886b50	cmp x12,x8
00886b54	b.eq 0x00886ba4
00886b58	add x9,x9,#0x1
00886b5c	and x9,x9,x15
00886b60	lsr x12,x9,#0x6
00886b64	lsl x14,x17,x9
00886b68	ldr x13,[x11, x12, LSL #0x3]
00886b6c	tst x13,x14
00886b70	b.ne 0x00886b48
00886b74	mov w15,#0x18
00886b78	orr x13,x13,x14
00886b7c	str x13,[x11, x12, LSL #0x3]
00886b80	nop
00886b84	madd x10,x9,x15,x10
00886b88	str xzr,[x10, #0x8]
00886b8c	str wzr,[x10, #0x10]
00886b90	ldr x11,[x19, #0x28]
00886b94	str x8,[x10]
00886b98	ldr x10,[x19]
00886b9c	add x8,x11,#0x1
00886ba0	str x8,[x19, #0x28]
00886ba4	mov w8,#0x18
00886ba8	madd x8,x9,x8,x10
00886bac	add x0,x8,#0x8
00886bb0	ldp x20,x19,[sp, #0x10]
00886bb4	ldp x29,x30,[sp], #0x20
00886bb8	ret
