; BN_dec2bn @ 00aa09d0
00aa09d0	stp x26,x25,[sp, #-0x50]!
00aa09d4	stp x24,x23,[sp, #0x10]
00aa09d8	stp x22,x21,[sp, #0x20]
00aa09dc	stp x20,x19,[sp, #0x30]
00aa09e0	stp x29,x30,[sp, #0x40]
00aa09e4	add x29,sp,#0x40
00aa09e8	cbz x1,0x00aa0a9c
00aa09ec	ldrb w8,[x1]
00aa09f0	mov x20,x1
00aa09f4	cbz w8,0x00aa0a9c
00aa09f8	mov x19,x0
00aa09fc	cmp w8,#0x2d
00aa0a00	b.ne 0x00aa0a10
00aa0a04	add x20,x20,#0x1
00aa0a08	mov w24,#0x1
00aa0a0c	b 0x00aa0a14
00aa0a10	mov w24,wzr
00aa0a14	mov x25,xzr
00aa0a18	orr w23,wzr,#0x3f
00aa0a1c	ldrb w0,[x20, x25]
00aa0a20	bl 0x00c37770
00aa0a24	cbz w0,0x00aa0a40
00aa0a28	add x25,x25,#0x1
00aa0a2c	lsr x8,x25,#0x1d
00aa0a30	add w23,w23,#0x4
00aa0a34	cbz x8,0x00aa0a1c
00aa0a38	mov x22,xzr
00aa0a3c	b 0x00aa0a88
00aa0a40	sub w8,w25,#0x1
00aa0a44	orr w9,wzr,#0x1ffffffe
00aa0a48	cmp w8,w9
00aa0a4c	mov x22,xzr
00aa0a50	b.hi 0x00aa0a88
00aa0a54	add x21,x24,x25
00aa0a58	cbz x19,0x00aa0aa0
00aa0a5c	ldr x22,[x19]
00aa0a60	cbz x22,0x00aa0a70
00aa0a64	mov x0,x22
00aa0a68	bl 0x00c38e00
00aa0a6c	b 0x00aa0a7c
00aa0a70	bl 0x00c37710
00aa0a74	mov x22,x0
00aa0a78	cbz x0,0x00aa0a9c
00aa0a7c	orr w8,wzr,#0x1ffffff0
00aa0a80	cmp w25,w8
00aa0a84	b.ls 0x00aa0abc
00aa0a88	ldr x8,[x19]
00aa0a8c	mov w21,wzr
00aa0a90	cbnz x8,0x00aa0aa0
00aa0a94	mov x0,x22
00aa0a98	bl 0x00c36290
00aa0a9c	mov w21,wzr
00aa0aa0	mov w0,w21
00aa0aa4	ldp x29,x30,[sp, #0x40]
00aa0aa8	ldp x20,x19,[sp, #0x30]
00aa0aac	ldp x22,x21,[sp, #0x20]
00aa0ab0	ldp x24,x23,[sp, #0x10]
00aa0ab4	ldp x26,x25,[sp], #0x50
00aa0ab8	ret
00aa0abc	ldr w8,[x22, #0xc]
00aa0ac0	lsr w1,w23,#0x6
00aa0ac4	cmp w1,w8
00aa0ac8	b.le 0x00aa0ad8
00aa0acc	mov x0,x22
00aa0ad0	bl 0x00c38e60
00aa0ad4	cbz x0,0x00aa0a88
00aa0ad8	mov w8,#0x6bcb
00aa0adc	movk w8,#0xaf28, LSL #16
00aa0ae0	umull x8,w25,w8
00aa0ae4	lsr x8,x8,#0x20
00aa0ae8	sub w10,w25,w8
00aa0aec	add w8,w8,w10, LSR #0x1
00aa0af0	mov w9,#0x13
00aa0af4	lsr w8,w8,#0x4
00aa0af8	mul w8,w8,w9
00aa0afc	subs w8,w8,w25
00aa0b00	add w8,w8,#0x13
00aa0b04	mov x23,xzr
00aa0b08	add x26,x25,#0x1
00aa0b0c	csel w8,wzr,w8,eq
00aa0b10	mov w25,#0xa
00aa0b14	ldrb w9,[x20], #0x1
00aa0b18	add w8,w8,#0x1
00aa0b1c	cmp w8,#0x13
00aa0b20	madd x9,x23,x25,x9
00aa0b24	sub x23,x9,#0x30
00aa0b28	b.ne 0x00aa0b5c
00aa0b2c	mov x1,#0x89e80000
00aa0b30	movk x1,#0x2304, LSL #32
00aa0b34	movk x1,#0x8ac7, LSL #48
00aa0b38	mov x0,x22
00aa0b3c	bl 0x00c37700
00aa0b40	cbz w0,0x00aa0a88
00aa0b44	mov x0,x22
00aa0b48	mov x1,x23
00aa0b4c	bl 0x00c376e0
00aa0b50	cbz w0,0x00aa0a88
00aa0b54	mov x23,xzr
00aa0b58	mov w8,wzr
00aa0b5c	sub w26,w26,#0x1
00aa0b60	cmp w26,#0x1
00aa0b64	b.gt 0x00aa0b14
00aa0b68	mov x0,x22
00aa0b6c	bl 0x00c38e40
00aa0b70	str x22,[x19]
00aa0b74	ldr w8,[x22, #0x8]
00aa0b78	cbz w8,0x00aa0aa0
00aa0b7c	str w24,[x22, #0x10]
00aa0b80	b 0x00aa0aa0
