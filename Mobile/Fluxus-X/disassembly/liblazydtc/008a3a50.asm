; FUN_008a3a50 @ 008a3a50
008a3a50	cbz x1,0x008a3c18
008a3a54	adrp x8,0xd1b000
008a3a58	ldr w9,[x1, #0x8]
008a3a5c	ldr w8,[x8, #0x10]
008a3a60	cmp w9,w8
008a3a64	b.ne 0x008a3c18
008a3a68	ldr x8,[x0, #0x38]
008a3a6c	cbz x8,0x008a3c18
008a3a70	stp x29,x30,[sp, #-0x20]!
008a3a74	stp x20,x19,[sp, #0x10]
008a3a78	mov x29,sp
008a3a7c	ldr x8,[x1, #0x20]
008a3a80	ldrb w13,[x0, #0x40]
008a3a84	lsl w10,w8,#0x3
008a3a88	lsr x11,x8,#0x20
008a3a8c	add x12,x10,#0x8
008a3a90	mov x10,#0x2d69
008a3a94	movk x10,#0xeb38, LSL #16
008a3a98	eor x12,x12,x11
008a3a9c	movk x10,#0xea08, LSL #32
008a3aa0	movk x10,#0x9ddf, LSL #48
008a3aa4	mul x12,x12,x10
008a3aa8	eor x11,x11,x12, LSR #0x2f
008a3aac	eor x11,x11,x12
008a3ab0	mul x11,x11,x10
008a3ab4	eor x12,x11,x11, LSR #0x2f
008a3ab8	mov x11,#0x959d
008a3abc	movk x11,#0xb8f4, LSL #16
008a3ac0	movk x11,#0xd34f, LSL #32
008a3ac4	movk x11,#0x949d, LSL #48
008a3ac8	mul x12,x12,x11
008a3acc	lsr x12,x12,x13
008a3ad0	ldr x13,[x0, #0x28]
008a3ad4	lsr x14,x12,#0x6
008a3ad8	ldr x14,[x13, x14, LSL #0x3]
008a3adc	lsr x14,x14,x12
008a3ae0	tbz w14,#0x0,0x008a3c10
008a3ae4	ldr x15,[x0, #0x30]
008a3ae8	ldr x14,[x0, #0x10]
008a3aec	sub x15,x15,#0x1
008a3af0	lsl x16,x12,#0x4
008a3af4	ldr x16,[x14, x16#0x0]
008a3af8	cmp x16,x8
008a3afc	b.eq 0x008a3b1c
008a3b00	add x12,x12,#0x1
008a3b04	and x12,x12,x15
008a3b08	lsr x16,x12,#0x6
008a3b0c	ldr x16,[x13, x16, LSL #0x3]
008a3b10	lsr x16,x16,x12
008a3b14	tbnz w16,#0x0,0x008a3af0
008a3b18	b 0x008a3c10
008a3b1c	add x8,x14,x12, LSL #0x4
008a3b20	ldr w12,[x2, #0x8]
008a3b24	cbz x2,0x008a3b68
008a3b28	adrp x13,0xd1a000
008a3b2c	ldr w13,[x13, #0xff0]
008a3b30	cmp w12,w13
008a3b34	b.ne 0x008a3b68
008a3b38	ldr x0,[x0, #0x8]
008a3b3c	add x1,x8,#0x8
008a3b40	mov x19,x2
008a3b44	bl 0x00891928
008a3b48	ldr w8,[x0]
008a3b4c	ldr d1,[x19, #0x20]
008a3b50	add w8,w8,#0x1
008a3b54	ucvtf d0,w8
008a3b58	fcmp d1,d0
008a3b5c	b.ne 0x008a3c10
008a3b60	str w8,[x0]
008a3b64	b 0x008a3c10
008a3b68	cbz x2,0x008a3c10
008a3b6c	cmp w12,w9
008a3b70	b.ne 0x008a3c10
008a3b74	ldr x9,[x0, #0xa8]
008a3b78	cbz x9,0x008a3c10
008a3b7c	ldr x9,[x2, #0x20]
008a3b80	lsl w12,w9,#0x3
008a3b84	lsr x13,x9,#0x20
008a3b88	add x12,x12,#0x8
008a3b8c	eor x12,x12,x13
008a3b90	mul x12,x12,x10
008a3b94	eor x13,x13,x12, LSR #0x2f
008a3b98	eor x12,x13,x12
008a3b9c	mul x10,x12,x10
008a3ba0	eor x10,x10,x10, LSR #0x2f
008a3ba4	mul x10,x10,x11
008a3ba8	ldrb w11,[x0, #0xb0]
008a3bac	lsr x19,x10,x11
008a3bb0	ldr x10,[x0, #0x98]
008a3bb4	lsr x11,x19,#0x6
008a3bb8	ldr x11,[x10, x11, LSL #0x3]
008a3bbc	lsr x11,x11,x19
008a3bc0	tbz w11,#0x0,0x008a3c10
008a3bc4	ldr x11,[x0, #0xa0]
008a3bc8	ldr x20,[x0, #0x80]
008a3bcc	sub x11,x11,#0x1
008a3bd0	lsl x12,x19,#0x4
008a3bd4	ldr x12,[x20, x12#0x0]
008a3bd8	cmp x12,x9
008a3bdc	b.eq 0x008a3bfc
008a3be0	add x12,x19,#0x1
008a3be4	and x19,x12,x11
008a3be8	lsr x12,x19,#0x6
008a3bec	ldr x12,[x10, x12, LSL #0x3]
008a3bf0	lsr x12,x12,x19
008a3bf4	tbnz w12,#0x0,0x008a3bd0
008a3bf8	b 0x008a3c10
008a3bfc	ldr x0,[x0, #0x8]
008a3c00	add x1,x8,#0x8
008a3c04	bl 0x00891928
008a3c08	ldr w8,[x0]
008a3c0c	cbz w8,0x008a3c1c
008a3c10	ldp x20,x19,[sp, #0x10]
008a3c14	ldp x29,x30,[sp], #0x20
008a3c18	ret
008a3c1c	add x8,x20,x19, LSL #0x4
008a3c20	ldr w8,[x8, #0x8]
008a3c24	b 0x008a3b60
