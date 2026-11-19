; FUN_00b06b10 @ 00b06b10
00b06b10	sub sp,sp,#0x80
00b06b14	stp x26,x25,[sp, #0x30]
00b06b18	stp x22,x21,[sp, #0x50]
00b06b1c	stp x20,x19,[sp, #0x60]
00b06b20	mov w26,w4
00b06b24	mov x21,x2
00b06b28	mov x20,x1
00b06b2c	mov x25,x0
00b06b30	cmp w4,#0x1
00b06b34	and w22,w3,#0xffff7fff
00b06b38	stp x28,x27,[sp, #0x20]
00b06b3c	stp x24,x23,[sp, #0x40]
00b06b40	stp x29,x30,[sp, #0x70]
00b06b44	add x29,sp,#0x70
00b06b48	b.ne 0x00b06cfc
00b06b4c	adrp x23,0xb07000
00b06b50	mov w8,#0x16
00b06b54	add x23,x23,#0x3d0
00b06b58	str w8,[sp, #0x14]
00b06b5c	orr w27,wzr,#0x30
00b06b60	str x5,[sp, #0x18]
00b06b64	cbnz x21,0x00b06b74
00b06b68	mov x0,x20
00b06b6c	bl 0x00c2ff50
00b06b70	mov x21,x0
00b06b74	mov w1,#0x55
00b06b78	mov x0,x25
00b06b7c	mov x2,xzr
00b06b80	mov x3,xzr
00b06b84	bl 0x00c32ce0
00b06b88	cbz x0,0x00b06c8c
00b06b8c	mov x28,x0
00b06b90	bl 0x00c325e0
00b06b94	cmp w0,#0x1
00b06b98	mov w19,wzr
00b06b9c	str w27,[sp, #0x10]
00b06ba0	str x25,[sp, #0x8]
00b06ba4	b.lt 0x00b06c70
00b06ba8	mov w25,wzr
00b06bac	mov x0,x28
00b06bb0	mov w1,w25
00b06bb4	bl 0x00c32610
00b06bb8	ldr w8,[x0]
00b06bbc	mov x27,x0
00b06bc0	cmp w26,#0x1
00b06bc4	b.ne 0x00b06c20
00b06bc8	cbnz w8,0x00b06c20
00b06bcc	ldr x8,[x27, #0x8]!
00b06bd0	ldr x0,[x8]
00b06bd4	bl 0x00c37750
00b06bd8	cmp w0,#0x4b8
00b06bdc	b.ne 0x00b06c5c
00b06be0	ldr x8,[x27]
00b06be4	ldr x8,[x8, #0x8]
00b06be8	ldr w9,[x8]
00b06bec	cmp w9,#0xc
00b06bf0	b.ne 0x00b06c30
00b06bf4	ldr x19,[sp, #0x18]
00b06bf8	ldr x0,[x8, #0x8]
00b06bfc	mov w1,wzr
00b06c00	mov x2,x23
00b06c04	mov w3,w22
00b06c08	mov x4,x20
00b06c0c	mov x5,x21
00b06c10	mov x6,x19
00b06c14	bl 0x00b07a70
00b06c18	cbz w0,0x00b06c34
00b06c1c	b 0x00b06d74
00b06c20	cmp w8,w26
00b06c24	b.eq 0x00b06c2c
00b06c28	cbnz w8,0x00b06c5c
00b06c2c	add x27,x27,#0x8
00b06c30	ldr x19,[sp, #0x18]
00b06c34	ldr x0,[x27]
00b06c38	ldr w1,[sp, #0x14]
00b06c3c	mov x2,x23
00b06c40	mov w3,w22
00b06c44	mov x4,x20
00b06c48	mov x5,x21
00b06c4c	mov x6,x19
00b06c50	bl 0x00b07a70
00b06c54	cbnz w0,0x00b06d74
00b06c58	mov w19,#0x1
00b06c5c	mov x0,x28
00b06c60	add w25,w25,#0x1
00b06c64	bl 0x00c325e0
00b06c68	cmp w25,w0
00b06c6c	b.lt 0x00b06bac
00b06c70	mov x0,x28
00b06c74	bl 0x00c324e0
00b06c78	ldr w27,[sp, #0x10]
00b06c7c	ldr x25,[sp, #0x8]
00b06c80	tbnz w22,#0x0,0x00b06c8c
00b06c84	mov w24,wzr
00b06c88	cbnz w19,0x00b06d80
00b06c8c	cbz w27,0x00b06d4c
00b06c90	mov w24,wzr
00b06c94	tbnz w22,#0x5,0x00b06d80
00b06c98	mov x0,x25
00b06c9c	bl 0x00c32d20
00b06ca0	ldr x19,[sp, #0x18]
00b06ca4	mov x25,x0
00b06ca8	mov w26,#0xffffffff
00b06cac	mov x0,x25
00b06cb0	mov w1,w27
00b06cb4	mov w2,w26
00b06cb8	bl 0x00c32bc0
00b06cbc	tbnz w0,#0x1f,0x00b06d4c
00b06cc0	mov w26,w0
00b06cc4	mov x0,x25
00b06cc8	mov w1,w26
00b06ccc	bl 0x00c32bb0
00b06cd0	bl 0x00c32ba0
00b06cd4	mov w1,#0xffffffff
00b06cd8	mov x2,x23
00b06cdc	mov w3,w22
00b06ce0	mov x4,x20
00b06ce4	mov x5,x21
00b06ce8	mov x6,x19
00b06cec	bl 0x00b07a70
00b06cf0	cbz w0,0x00b06cac
00b06cf4	mov w24,w0
00b06cf8	b 0x00b06d80
00b06cfc	cmp w26,#0x2
00b06d00	b.ne 0x00b06d54
00b06d04	cmp x21,#0x2
00b06d08	b.cc 0x00b06d1c
00b06d0c	ldrb w8,[x20]
00b06d10	orr w9,w3,#0x8000
00b06d14	cmp w8,#0x2e
00b06d18	csel w22,w9,w22,eq
00b06d1c	adrp x8,0xb07000
00b06d20	adrp x9,0xb07000
00b06d24	add x8,x8,#0x4d0
00b06d28	add x9,x9,#0x594
00b06d2c	tst w22,#0x2
00b06d30	mov w10,#0x16
00b06d34	csel x23,x9,x8,eq
00b06d38	mov w27,#0xd
00b06d3c	str w10,[sp, #0x14]
00b06d40	str x5,[sp, #0x18]
00b06d44	cbnz x21,0x00b06b74
00b06d48	b 0x00b06b68
00b06d4c	mov w24,wzr
00b06d50	b 0x00b06d80
00b06d54	adrp x23,0xb07000
00b06d58	mov w8,#0x4
00b06d5c	mov w27,wzr
00b06d60	add x23,x23,#0x9e0
00b06d64	str w8,[sp, #0x14]
00b06d68	str x5,[sp, #0x18]
00b06d6c	cbnz x21,0x00b06b74
00b06d70	b 0x00b06b68
00b06d74	mov w24,w0
00b06d78	mov x0,x28
00b06d7c	bl 0x00c324e0
00b06d80	mov w0,w24
00b06d84	ldp x29,x30,[sp, #0x70]
00b06d88	ldp x20,x19,[sp, #0x60]
00b06d8c	ldp x22,x21,[sp, #0x50]
00b06d90	ldp x24,x23,[sp, #0x40]
00b06d94	ldp x26,x25,[sp, #0x30]
00b06d98	ldp x28,x27,[sp, #0x20]
00b06d9c	add sp,sp,#0x80
00b06da0	ret
