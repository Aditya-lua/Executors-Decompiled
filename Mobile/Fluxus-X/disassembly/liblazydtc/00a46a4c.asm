; FUN_00a46a4c @ 00a46a4c
00a46a4c	sub sp,sp,#0x110
00a46a50	stp x28,x27,[sp, #0xb0]
00a46a54	stp x26,x25,[sp, #0xc0]
00a46a58	stp x24,x23,[sp, #0xd0]
00a46a5c	stp x22,x21,[sp, #0xe0]
00a46a60	stp x20,x19,[sp, #0xf0]
00a46a64	stp x29,x30,[sp, #0x100]
00a46a68	str x0,[sp, #0xa8]
00a46a6c	ldp x9,x11,[x2]
00a46a70	ldp x15,x10,[x1]
00a46a74	ldp x12,x13,[x2, #0x10]
00a46a78	ldp x16,x17,[x1, #0x10]
00a46a7c	ldr x14,[x2, #0x20]
00a46a80	umulh x8,x9,x15
00a46a84	str x8,[sp, #0x80]
00a46a88	mul x8,x9,x15
00a46a8c	str x8,[sp, #0x58]
00a46a90	umulh x8,x11,x15
00a46a94	str x8,[sp, #0x78]
00a46a98	mul x8,x11,x15
00a46a9c	str x8,[sp, #0x50]
00a46aa0	umulh x8,x12,x15
00a46aa4	str x8,[sp, #0x70]
00a46aa8	mul x8,x12,x15
00a46aac	str x8,[sp, #0x48]
00a46ab0	umulh x8,x13,x15
00a46ab4	str x8,[sp, #0x68]
00a46ab8	mul x8,x13,x15
00a46abc	str x8,[sp, #0x40]
00a46ac0	umulh x8,x14,x15
00a46ac4	str x8,[sp, #0x60]
00a46ac8	mul x8,x14,x15
00a46acc	umulh x15,x16,x11
00a46ad0	str x15,[sp, #0x30]
00a46ad4	mul x15,x16,x11
00a46ad8	str x15,[sp, #0x20]
00a46adc	umulh x15,x16,x12
00a46ae0	ldr x18,[x1, #0x20]
00a46ae4	str x15,[sp, #0x28]
00a46ae8	mul x15,x16,x12
00a46aec	str x8,[sp, #0x38]
00a46af0	mov w8,#0x13
00a46af4	str x15,[sp, #0x18]
00a46af8	umulh x15,x17,x11
00a46afc	mul x14,x14,x8
00a46b00	umulh x30,x10,x11
00a46b04	mul x25,x10,x11
00a46b08	umulh x28,x10,x12
00a46b0c	mul x27,x10,x12
00a46b10	umulh x29,x10,x13
00a46b14	mul x26,x10,x13
00a46b18	mul x13,x13,x8
00a46b1c	mul x12,x12,x8
00a46b20	str x15,[sp, #0xa0]
00a46b24	mul x15,x17,x11
00a46b28	mul x11,x11,x8
00a46b2c	umulh x8,x17,x9
00a46b30	str x8,[sp, #0x10]
00a46b34	mul x8,x17,x9
00a46b38	str x8,[sp, #0x8]
00a46b3c	umulh x8,x18,x9
00a46b40	stp x15,x8,[sp, #0x90]
00a46b44	mul x8,x18,x9
00a46b48	umulh x19,x10,x9
00a46b4c	mul x7,x10,x9
00a46b50	umulh x24,x16,x9
00a46b54	mul x23,x16,x9
00a46b58	str x8,[sp, #0x88]
00a46b5c	umulh x8,x10,x14
00a46b60	mul x10,x10,x14
00a46b64	umulh x15,x16,x13
00a46b68	mul x9,x16,x13
00a46b6c	umulh x0,x16,x14
00a46b70	mul x16,x16,x14
00a46b74	umulh x4,x17,x12
00a46b78	mul x1,x17,x12
00a46b7c	umulh x3,x17,x13
00a46b80	mul x2,x17,x13
00a46b84	umulh x5,x17,x14
00a46b88	mul x17,x17,x14
00a46b8c	umulh x6,x18,x11
00a46b90	mul x11,x18,x11
00a46b94	umulh x20,x18,x12
00a46b98	mul x12,x18,x12
00a46b9c	umulh x21,x18,x13
00a46ba0	mul x13,x18,x13
00a46ba4	umulh x22,x18,x14
00a46ba8	mul x14,x18,x14
00a46bac	ldr x18,[sp, #0x58]
00a46bb0	adds x10,x10,x18
00a46bb4	ldr x18,[sp, #0x80]
00a46bb8	adcs x8,x8,x18
00a46bbc	ldr x18,[sp, #0x50]
00a46bc0	adds x18,x7,x18
00a46bc4	ldr x7,[sp, #0x78]
00a46bc8	adcs x7,x19,x7
00a46bcc	ldr x19,[sp, #0x48]
00a46bd0	adds x19,x25,x19
00a46bd4	ldr x25,[sp, #0x70]
00a46bd8	adcs x25,x30,x25
00a46bdc	ldr x30,[sp, #0x40]
00a46be0	adds x27,x27,x30
00a46be4	ldr x30,[sp, #0x68]
00a46be8	adcs x28,x28,x30
00a46bec	ldr x30,[sp, #0x38]
00a46bf0	adds x26,x26,x30
00a46bf4	ldr x30,[sp, #0x60]
00a46bf8	adcs x29,x29,x30
00a46bfc	adds x9,x10,x9
00a46c00	adcs x8,x8,x15
00a46c04	adds x10,x18,x16
00a46c08	adcs x15,x7,x0
00a46c0c	adds x16,x19,x23
00a46c10	ldp x19,x0,[sp, #0x18]
00a46c14	ldp x23,x7,[sp, #0x28]
00a46c18	adcs x18,x25,x24
00a46c1c	adds x0,x27,x0
00a46c20	adcs x7,x28,x7
00a46c24	adds x19,x26,x19
00a46c28	adcs x23,x29,x23
00a46c2c	adds x9,x9,x1
00a46c30	adcs x8,x8,x4
00a46c34	adds x10,x10,x2
00a46c38	adcs x15,x15,x3
00a46c3c	adds x16,x16,x17
00a46c40	adcs x17,x18,x5
00a46c44	ldr x18,[sp, #0x8]
00a46c48	ldr x1,[sp, #0x90]
00a46c4c	ldr x2,[sp, #0xa0]
00a46c50	adds x18,x0,x18
00a46c54	ldr x0,[sp, #0x10]
00a46c58	adcs x0,x7,x0
00a46c5c	adds x1,x19,x1
00a46c60	adcs x2,x23,x2
00a46c64	adds x9,x9,x11
00a46c68	adcs x8,x8,x6
00a46c6c	adds x10,x10,x12
00a46c70	and x11,x9,#0x7ffffffffffff
00a46c74	extr x8,x8,x9,#0x33
00a46c78	adcs x9,x15,x20
00a46c7c	adds x12,x16,x13
00a46c80	ldr x16,[sp, #0x88]
00a46c84	adcs x13,x17,x21
00a46c88	ldr x17,[sp, #0x98]
00a46c8c	adds x14,x18,x14
00a46c90	and x15,x12,#0x7ffffffffffff
00a46c94	extr x12,x13,x12,#0x33
00a46c98	adcs x13,x0,x22
00a46c9c	adds x16,x1,x16
00a46ca0	adcs x17,x2,x17
00a46ca4	adds x12,x14,x12
00a46ca8	adcs x13,x13,xzr
00a46cac	adds x8,x10,x8
00a46cb0	extr x10,x13,x12,#0x33
00a46cb4	adcs x9,x9,xzr
00a46cb8	and x14,x12,#0x7ffffffffffff
00a46cbc	and x12,x8,#0x7ffffffffffff
00a46cc0	adds x10,x16,x10
00a46cc4	extr x8,x9,x8,#0x33
00a46cc8	adcs x9,x17,xzr
00a46ccc	add x8,x15,x8
00a46cd0	and x13,x10,#0x7ffffffffffff
00a46cd4	extr x9,x9,x10,#0x33
00a46cd8	add x10,x14,x8, LSR #0x33
00a46cdc	mov w14,#0x13
00a46ce0	madd x9,x9,x14,x11
00a46ce4	ldr x11,[sp, #0xa8]
00a46ce8	and x8,x8,#0x7ffffffffffff
00a46cec	stp x8,x10,[x11, #0x10]
00a46cf0	add x8,x12,x9, LSR #0x33
00a46cf4	and x9,x9,#0x7ffffffffffff
00a46cf8	stp x9,x8,[x11]
00a46cfc	str x13,[x11, #0x20]
00a46d00	ldp x29,x30,[sp, #0x100]
00a46d04	ldp x20,x19,[sp, #0xf0]
00a46d08	ldp x22,x21,[sp, #0xe0]
00a46d0c	ldp x24,x23,[sp, #0xd0]
00a46d10	ldp x26,x25,[sp, #0xc0]
00a46d14	ldp x28,x27,[sp, #0xb0]
00a46d18	add sp,sp,#0x110
00a46d1c	ret
