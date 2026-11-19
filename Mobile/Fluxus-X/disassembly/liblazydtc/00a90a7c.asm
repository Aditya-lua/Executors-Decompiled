; CAST_cbc_encrypt @ 00a90a7c
00a90a7c	sub sp,sp,#0x90
00a90a80	stp x28,x27,[sp, #0x30]
00a90a84	stp x26,x25,[sp, #0x40]
00a90a88	stp x24,x23,[sp, #0x50]
00a90a8c	stp x22,x21,[sp, #0x60]
00a90a90	stp x20,x19,[sp, #0x70]
00a90a94	stp x29,x30,[sp, #0x80]
00a90a98	ldp w8,w9,[x4]
00a90a9c	mov x19,x4
00a90aa0	mov x21,x3
00a90aa4	mov x23,x2
00a90aa8	mov x28,x1
00a90aac	mov x22,x0
00a90ab0	rev w26,w8
00a90ab4	rev w24,w9
00a90ab8	subs x8,x2,#0x8
00a90abc	add x29,sp,#0x80
00a90ac0	cbz w5,0x00a90c38
00a90ac4	b.lt 0x00a90b78
00a90ac8	str x8,[sp, #0x18]
00a90acc	mvn x8,x23
00a90ad0	orr x9,xzr,#-0x10
00a90ad4	cmn x8,#0x10
00a90ad8	csinv x8,x9,x23,le
00a90adc	add x8,x8,x23
00a90ae0	add x8,x8,#0x8
00a90ae4	and x27,x8,#-0x8
00a90ae8	add x25,x27,#0x8
00a90aec	add x8,x22,x25
00a90af0	add x23,x23,#0x8
00a90af4	mov x20,x28
00a90af8	str x8,[sp, #0x20]
00a90afc	ldp w8,w9,[x22], #0x8
00a90b00	add x0,sp,#0x28
00a90b04	mov x1,x21
00a90b08	rev w8,w8
00a90b0c	rev w9,w9
00a90b10	eor w8,w8,w26
00a90b14	eor w9,w9,w24
00a90b18	stp w8,w9,[sp, #0x28]
00a90b1c	bl 0x00a9016c
00a90b20	ldp w26,w24,[sp, #0x28]
00a90b24	sub x23,x23,#0x8
00a90b28	cmp x23,#0xf
00a90b2c	lsr w8,w26,#0x18
00a90b30	strb w8,[x20]
00a90b34	lsr w8,w26,#0x10
00a90b38	strb w8,[x20, #0x1]
00a90b3c	lsr w8,w26,#0x8
00a90b40	strb w8,[x20, #0x2]
00a90b44	lsr w8,w24,#0x18
00a90b48	strb w8,[x20, #0x4]
00a90b4c	lsr w8,w24,#0x10
00a90b50	strb w8,[x20, #0x5]
00a90b54	lsr w8,w24,#0x8
00a90b58	strb w26,[x20, #0x3]
00a90b5c	strb w24,[x20, #0x7]
00a90b60	strb w8,[x20, #0x6]
00a90b64	add x20,x20,#0x8
00a90b68	b.gt 0x00a90afc
00a90b6c	ldp x8,x22,[sp, #0x18]
00a90b70	add x28,x28,x25
00a90b74	sub x23,x8,x27
00a90b78	cbz x23,0x00a90d8c
00a90b7c	sub x9,x23,#0x1
00a90b80	cmp x9,#0x6
00a90b84	mov w8,wzr
00a90b88	b.hi 0x00a90dec
00a90b8c	adrp x10,0x76c000
00a90b90	add x10,x10,#0x5a0
00a90b94	ldrsw x9,[x10, x9, LSL #0x2]
00a90b98	add x11,x9,x10
00a90b9c	add x9,x22,x23
00a90ba0	mov w10,w8
00a90ba4	br x11
00a90ba8	ldrb w8,[x9, #-0x1]!
00a90bac	lsl w8,w8,#0x8
00a90bb0	ldrb w10,[x9, #-0x1]!
00a90bb4	bfm w8,w10,#0x10,#0x7
00a90bb8	ldrb w10,[x9, #-0x1]!
00a90bbc	orr w8,w8,w10, LSL #0x18
00a90bc0	mov w10,w8
00a90bc4	ldrb w8,[x9, #-0x1]!
00a90bc8	ldrb w11,[x9, #-0x1]!
00a90bcc	bfm w8,w11,#0x18,#0x7
00a90bd0	ldrb w11,[x9, #-0x1]!
00a90bd4	bfm w8,w11,#0x10,#0x7
00a90bd8	ldurb w9,[x9, #-0x1]
00a90bdc	orr w8,w8,w9, LSL #0x18
00a90be0	eor w8,w8,w26
00a90be4	eor w9,w10,w24
00a90be8	add x0,sp,#0x28
00a90bec	mov x1,x21
00a90bf0	stp w8,w9,[sp, #0x28]
00a90bf4	bl 0x00a9016c
00a90bf8	ldp w20,w22,[sp, #0x28]
00a90bfc	lsr w8,w20,#0x18
00a90c00	strb w8,[x28]
00a90c04	lsr w8,w20,#0x10
00a90c08	strb w8,[x28, #0x1]
00a90c0c	lsr w8,w20,#0x8
00a90c10	strb w8,[x28, #0x2]
00a90c14	lsr w8,w22,#0x18
00a90c18	strb w8,[x28, #0x4]
00a90c1c	lsr w8,w22,#0x10
00a90c20	strb w8,[x28, #0x5]
00a90c24	lsr w8,w22,#0x8
00a90c28	strb w20,[x28, #0x3]
00a90c2c	strb w8,[x28, #0x6]
00a90c30	strb w22,[x28, #0x7]
00a90c34	b 0x00a90d94
00a90c38	b.lt 0x00a90d04
00a90c3c	str x8,[sp, #0x18]
00a90c40	mvn x8,x23
00a90c44	orr x9,xzr,#-0x10
00a90c48	cmn x8,#0x10
00a90c4c	csinv x8,x9,x23,le
00a90c50	add x8,x8,x23
00a90c54	add x8,x8,#0x8
00a90c58	and x8,x8,#-0x8
00a90c5c	str x8,[sp, #0x10]
00a90c60	add x8,x8,#0x8
00a90c64	str x8,[sp, #0x8]
00a90c68	add x8,x22,x8
00a90c6c	add x23,x23,#0x8
00a90c70	mov x27,x28
00a90c74	str x8,[sp, #0x20]
00a90c78	ldp w8,w9,[x22], #0x8
00a90c7c	mov w25,w26
00a90c80	mov w20,w24
00a90c84	add x0,sp,#0x28
00a90c88	rev w26,w8
00a90c8c	rev w24,w9
00a90c90	mov x1,x21
00a90c94	stp w26,w24,[sp, #0x28]
00a90c98	bl 0x00a905e8
00a90c9c	ldp w8,w9,[sp, #0x28]
00a90ca0	sub x23,x23,#0x8
00a90ca4	cmp x23,#0xf
00a90ca8	eor w8,w8,w25
00a90cac	lsr w10,w8,#0x18
00a90cb0	eor w9,w9,w20
00a90cb4	strb w10,[x27]
00a90cb8	lsr w10,w8,#0x10
00a90cbc	strb w8,[x27, #0x3]
00a90cc0	lsr w8,w8,#0x8
00a90cc4	strb w10,[x27, #0x1]
00a90cc8	lsr w10,w9,#0x18
00a90ccc	strb w8,[x27, #0x2]
00a90cd0	lsr w8,w9,#0x10
00a90cd4	strb w9,[x27, #0x7]
00a90cd8	lsr w9,w9,#0x8
00a90cdc	strb w10,[x27, #0x4]
00a90ce0	strb w8,[x27, #0x5]
00a90ce4	strb w9,[x27, #0x6]
00a90ce8	add x27,x27,#0x8
00a90cec	b.gt 0x00a90c78
00a90cf0	ldp x9,x8,[sp, #0x10]
00a90cf4	ldr x22,[sp, #0x20]
00a90cf8	sub x23,x8,x9
00a90cfc	ldr x8,[sp, #0x8]
00a90d00	add x28,x28,x8
00a90d04	cbz x23,0x00a90d8c
00a90d08	ldp w8,w9,[x22]
00a90d0c	add x0,sp,#0x28
00a90d10	mov x1,x21
00a90d14	rev w20,w8
00a90d18	rev w22,w9
00a90d1c	stp w20,w22,[sp, #0x28]
00a90d20	bl 0x00a905e8
00a90d24	sub x8,x23,#0x1
00a90d28	cmp x8,#0x6
00a90d2c	b.hi 0x00a90d94
00a90d30	adrp x11,0x76c000
00a90d34	add x11,x11,#0x5bc
00a90d38	ldrsw x12,[x11, x8, LSL #0x2]
00a90d3c	ldp w9,w10,[sp, #0x28]
00a90d40	add x11,x12,x11
00a90d44	eor w8,w9,w26
00a90d48	eor w10,w10,w24
00a90d4c	add x9,x28,x23
00a90d50	br x11
00a90d54	lsr w11,w10,#0x8
00a90d58	strb w11,[x9, #-0x1]!
00a90d5c	lsr w11,w10,#0x10
00a90d60	strb w11,[x9, #-0x1]!
00a90d64	lsr w10,w10,#0x18
00a90d68	strb w10,[x9, #-0x1]!
00a90d6c	strb w8,[x9, #-0x1]!
00a90d70	lsr w10,w8,#0x8
00a90d74	strb w10,[x9, #-0x1]!
00a90d78	lsr w10,w8,#0x10
00a90d7c	strb w10,[x9, #-0x1]!
00a90d80	lsr w8,w8,#0x18
00a90d84	sturb w8,[x9, #-0x1]
00a90d88	b 0x00a90d94
00a90d8c	mov w20,w26
00a90d90	mov w22,w24
00a90d94	lsr w8,w20,#0x18
00a90d98	lsr w9,w20,#0x10
00a90d9c	lsr w10,w20,#0x8
00a90da0	lsr w11,w22,#0x18
00a90da4	lsr w12,w22,#0x10
00a90da8	lsr w13,w22,#0x8
00a90dac	strb w20,[x19, #0x3]
00a90db0	strb w8,[x19]
00a90db4	strb w9,[x19, #0x1]
00a90db8	strb w10,[x19, #0x2]
00a90dbc	strb w11,[x19, #0x4]
00a90dc0	strb w12,[x19, #0x5]
00a90dc4	strb w13,[x19, #0x6]
00a90dc8	strb w22,[x19, #0x7]
00a90dcc	ldp x29,x30,[sp, #0x80]
00a90dd0	ldp x20,x19,[sp, #0x70]
00a90dd4	ldp x22,x21,[sp, #0x60]
00a90dd8	ldp x24,x23,[sp, #0x50]
00a90ddc	ldp x26,x25,[sp, #0x40]
00a90de0	ldp x28,x27,[sp, #0x30]
00a90de4	add sp,sp,#0x90
00a90de8	ret
00a90dec	mov w10,w8
00a90df0	b 0x00a90be0
