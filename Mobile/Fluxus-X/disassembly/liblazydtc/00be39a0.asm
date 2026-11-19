; std::__ndk1::__num_get<wchar_t>::__stage2_float_loop @ 00be39a0
00be39a0	paciasp
00be39a4	stp x29,x30,[sp, #-0x60]!
00be39a8	stp x28,x27,[sp, #0x10]
00be39ac	stp x26,x25,[sp, #0x20]
00be39b0	stp x24,x23,[sp, #0x30]
00be39b4	stp x22,x21,[sp, #0x40]
00be39b8	stp x20,x19,[sp, #0x50]
00be39bc	mov x29,sp
00be39c0	ldp x21,x20,[x29, #0x68]
00be39c4	cmp w0,w5
00be39c8	ldr x22,[x29, #0x60]
00be39cc	b.ne 0x00be3a30
00be39d0	ldrb w8,[x1]
00be39d4	cmp w8,#0x1
00be39d8	b.ne 0x00be3ac8
00be39dc	ldr x8,[x4]
00be39e0	mov w10,#0x2e
00be39e4	strb wzr,[x1]
00be39e8	add x9,x8,#0x1
00be39ec	str x9,[x4]
00be39f0	strb w10,[x8]
00be39f4	ldrb w8,[x7]
00be39f8	ldr x9,[x7, #0x8]
00be39fc	lsr x10,x8,#0x1
00be3a00	tst w8,#0x1
00be3a04	csel x8,x10,x9,eq
00be3a08	cbz x8,0x00be3ad0
00be3a0c	ldr x8,[x21]
00be3a10	sub x9,x8,x22
00be3a14	cmp x9,#0x9f
00be3a18	b.gt 0x00be3ad0
00be3a1c	ldr w9,[x20]
00be3a20	mov w0,wzr
00be3a24	str w9,[x8], #0x4
00be3a28	str x8,[x21]
00be3a2c	b 0x00be3bf4
00be3a30	cmp w0,w6
00be3a34	b.ne 0x00be3a84
00be3a38	ldrb w8,[x7]
00be3a3c	ldr x9,[x7, #0x8]
00be3a40	lsr x10,x8,#0x1
00be3a44	tst w8,#0x1
00be3a48	csel x8,x10,x9,eq
00be3a4c	cbz x8,0x00be3a84
00be3a50	ldrb w8,[x1]
00be3a54	cmp w8,#0x1
00be3a58	b.ne 0x00be3ac8
00be3a5c	ldr x8,[x21]
00be3a60	sub x9,x8,x22
00be3a64	cmp x9,#0x9f
00be3a68	b.gt 0x00be3ad0
00be3a6c	ldr w9,[x20]
00be3a70	mov w0,wzr
00be3a74	str w9,[x8], #0x4
00be3a78	str x8,[x21]
00be3a7c	str wzr,[x20]
00be3a80	b 0x00be3bf4
00be3a84	ldr x19,[x29, #0x78]
00be3a88	mov x24,x1
00be3a8c	mov x25,x2
00be3a90	mov w1,w0
00be3a94	mov w2,#0x1c
00be3a98	mov x26,x3
00be3a9c	mov x0,x19
00be3aa0	mov x23,x7
00be3aa4	mov x27,x4
00be3aa8	add x28,x19,#0x70
00be3aac	bl 0x00c43a60
00be3ab0	cmp x0,#0x0
00be3ab4	csel x8,x28,x0,eq
00be3ab8	sub x8,x8,x19
00be3abc	asr x10,x8,#0x2
00be3ac0	cmp x10,#0x1b
00be3ac4	b.le 0x00be3ad8
00be3ac8	mov w0,#0xffffffff
00be3acc	b 0x00be3bf4
00be3ad0	mov w0,wzr
00be3ad4	b 0x00be3bf4
00be3ad8	adrp x9,0xcb5000
00be3adc	and x11,x8,#-0x5
00be3ae0	ldr x9,[x9, #0xc08]
00be3ae4	cmp x11,#0x58
00be3ae8	ldrb w8,[x9, x10]
00be3aec	mov x9,x27
00be3af0	b.eq 0x00be3b4c
00be3af4	cmp x11,#0x60
00be3af8	b.ne 0x00be3b58
00be3afc	ldr x10,[x9]
00be3b00	cmp x10,x26
00be3b04	b.eq 0x00be3b38
00be3b08	ldurb w11,[x10, #-0x1]
00be3b0c	ldrb w12,[x25]
00be3b10	sub w13,w11,#0x7b
00be3b14	eor w14,w11,#0x20
00be3b18	cmn w13,#0x1a
00be3b1c	sub w13,w12,#0x7b
00be3b20	csel w11,w11,w14,cc
00be3b24	eor w14,w12,#0x20
00be3b28	cmn w13,#0x1a
00be3b2c	csel w12,w12,w14,cc
00be3b30	cmp w11,w12
00be3b34	b.ne 0x00be3ac8
00be3b38	add x11,x10,#0x1
00be3b3c	mov w0,wzr
00be3b40	str x11,[x9]
00be3b44	strb w8,[x10]
00be3b48	b 0x00be3bf4
00be3b4c	mov w11,#0x50
00be3b50	strb w11,[x25]
00be3b54	b 0x00be3bcc
00be3b58	sub w11,w8,#0x7b
00be3b5c	eor w12,w8,#0x20
00be3b60	cmn w11,#0x1a
00be3b64	ldrb w11,[x25]
00be3b68	csel w12,w8,w12,cc
00be3b6c	cmp w12,w11
00be3b70	b.ne 0x00be3bcc
00be3b74	sub w12,w12,#0x5b
00be3b78	orr w13,w11,#0x20
00be3b7c	cmn w12,#0x1a
00be3b80	csel w11,w11,w13,cc
00be3b84	strb w11,[x25]
00be3b88	ldrb w11,[x24]
00be3b8c	cmp w11,#0x1
00be3b90	b.ne 0x00be3bcc
00be3b94	strb wzr,[x24]
00be3b98	ldrb w11,[x23]
00be3b9c	ldr x12,[x23, #0x8]
00be3ba0	lsr x13,x11,#0x1
00be3ba4	tst w11,#0x1
00be3ba8	csel x11,x13,x12,eq
00be3bac	cbz x11,0x00be3bcc
00be3bb0	ldr x11,[x21]
00be3bb4	sub x12,x11,x22
00be3bb8	cmp x12,#0x9f
00be3bbc	b.gt 0x00be3bcc
00be3bc0	ldr w12,[x20]
00be3bc4	str w12,[x11], #0x4
00be3bc8	str x11,[x21]
00be3bcc	ldr x11,[x9]
00be3bd0	cmp x10,#0x15
00be3bd4	mov w0,wzr
00be3bd8	add x12,x11,#0x1
00be3bdc	str x12,[x9]
00be3be0	strb w8,[x11]
00be3be4	b.gt 0x00be3bf4
00be3be8	ldr w8,[x20]
00be3bec	add w8,w8,#0x1
00be3bf0	str w8,[x20]
00be3bf4	ldp x20,x19,[sp, #0x50]
00be3bf8	ldp x22,x21,[sp, #0x40]
00be3bfc	ldp x24,x23,[sp, #0x30]
00be3c00	ldp x26,x25,[sp, #0x20]
00be3c04	ldp x28,x27,[sp, #0x10]
00be3c08	ldp x29,x30,[sp], #0x60
00be3c0c	autiasp
00be3c10	ret
