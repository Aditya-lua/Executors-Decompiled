; RSA_padding_add_PKCS1_PSS_mgf1 @ 00ad8a34
00ad8a34	sub sp,sp,#0x80
00ad8a38	stp x22,x21,[sp, #0x50]
00ad8a3c	mov x22,x0
00ad8a40	cmp x4,#0x0
00ad8a44	mov x0,x3
00ad8a48	stp x28,x27,[sp, #0x20]
00ad8a4c	stp x26,x25,[sp, #0x30]
00ad8a50	stp x24,x23,[sp, #0x40]
00ad8a54	stp x20,x19,[sp, #0x60]
00ad8a58	stp x29,x30,[sp, #0x70]
00ad8a5c	add x29,sp,#0x70
00ad8a60	mov w19,w5
00ad8a64	mov x27,x3
00ad8a68	mov x26,x2
00ad8a6c	mov x20,x1
00ad8a70	csel x24,x3,x4,eq
00ad8a74	bl 0x00c34c20
00ad8a78	mov w23,w0
00ad8a7c	tbnz w0,#0x1f,0x00ad8ad4
00ad8a80	cmn w19,#0x1
00ad8a84	b.eq 0x00ad8a98
00ad8a88	cmn w19,#0x2
00ad8a8c	b.ne 0x00ad8aa0
00ad8a90	orr w28,wzr,#0xfffffffd
00ad8a94	b 0x00ad8ae8
00ad8a98	mov w28,w23
00ad8a9c	b 0x00ad8ae8
00ad8aa0	cmn w19,#0x4
00ad8aa4	b.gt 0x00ad8ae4
00ad8aa8	bl 0x00c342a0
00ad8aac	adrp x0,0x2ca000
00ad8ab0	adrp x2,0x2be000
00ad8ab4	add x0,x0,#0x383
00ad8ab8	add x2,x2,#0x34b
00ad8abc	mov w1,#0xb6
00ad8ac0	bl 0x00c342b0
00ad8ac4	mov w0,#0x4
00ad8ac8	mov w1,#0x88
00ad8acc	mov x2,xzr
00ad8ad0	bl 0x00c342c0
00ad8ad4	mov w20,wzr
00ad8ad8	mov x21,xzr
00ad8adc	mov x22,xzr
00ad8ae0	b 0x00ad8cd4
00ad8ae4	mov w28,w19
00ad8ae8	ldr x0,[x22, #0x28]
00ad8aec	bl 0x00c322f0
00ad8af0	sub w8,w0,#0x1
00ad8af4	mov x0,x22
00ad8af8	and w21,w8,#0x7
00ad8afc	bl 0x00c3fab0
00ad8b00	mov w25,w0
00ad8b04	cbnz w21,0x00ad8b10
00ad8b08	strb wzr,[x20], #0x1
00ad8b0c	sub w25,w25,#0x1
00ad8b10	add w8,w23,#0x2
00ad8b14	cmp w25,w8
00ad8b18	b.ge 0x00ad8b5c
00ad8b1c	bl 0x00c342a0
00ad8b20	adrp x0,0x2ca000
00ad8b24	adrp x2,0x2be000
00ad8b28	add x0,x0,#0x383
00ad8b2c	add x2,x2,#0x34b
00ad8b30	mov w1,#0xc1
00ad8b34	bl 0x00c342b0
00ad8b38	mov w0,#0x4
00ad8b3c	mov w1,#0x6e
00ad8b40	mov x2,xzr
00ad8b44	bl 0x00c342c0
00ad8b48	mov w20,wzr
00ad8b4c	mov x21,xzr
00ad8b50	mov x22,xzr
00ad8b54	mov w19,w28
00ad8b58	b 0x00ad8cd4
00ad8b5c	sxtw x8,w25
00ad8b60	sub x9,x8,w23, SXTW 
00ad8b64	cmn w28,#0x3
00ad8b68	sub w19,w9,#0x2
00ad8b6c	b.eq 0x00ad8b98
00ad8b70	cmp w28,w19
00ad8b74	b.le 0x00ad8b94
00ad8b78	bl 0x00c342a0
00ad8b7c	adrp x0,0x2ca000
00ad8b80	adrp x2,0x2be000
00ad8b84	add x0,x0,#0x383
00ad8b88	add x2,x2,#0x34b
00ad8b8c	mov w1,#0xc7
00ad8b90	b 0x00ad8b34
00ad8b94	mov w19,w28
00ad8b98	cmp w19,#0x1
00ad8b9c	str w21,[sp, #0x14]
00ad8ba0	str x8,[sp, #0x8]
00ad8ba4	str x9,[sp, #0x18]
00ad8ba8	b.lt 0x00ad8bec
00ad8bac	sxtw x28,w19
00ad8bb0	adrp x1,0x2ca000
00ad8bb4	add x1,x1,#0x383
00ad8bb8	mov w2,#0xcb
00ad8bbc	mov x0,x28
00ad8bc0	bl 0x00c32320
00ad8bc4	mov x21,x0
00ad8bc8	cbz x0,0x00ad8c9c
00ad8bcc	ldr x0,[x22, #0x8]
00ad8bd0	mov x1,x21
00ad8bd4	mov x2,x28
00ad8bd8	mov w3,wzr
00ad8bdc	bl 0x00c347b0
00ad8be0	cmp w0,#0x1
00ad8be4	b.ge 0x00ad8bf0
00ad8be8	b 0x00ad8ccc
00ad8bec	mov x21,xzr
00ad8bf0	bl 0x00c31fa0
00ad8bf4	mov x22,x0
00ad8bf8	cbz x0,0x00ad8c94
00ad8bfc	mov x0,x22
00ad8c00	mov x1,x27
00ad8c04	mov x2,xzr
00ad8c08	bl 0x00c31f70
00ad8c0c	cbz w0,0x00ad8c94
00ad8c10	adrp x1,0x774000
00ad8c14	add x1,x1,#0x914
00ad8c18	mov w2,#0x8
00ad8c1c	mov x0,x22
00ad8c20	bl 0x00c31f80
00ad8c24	cbz w0,0x00ad8c94
00ad8c28	sxtw x27,w23
00ad8c2c	mov x0,x22
00ad8c30	mov x1,x26
00ad8c34	mov x2,x27
00ad8c38	bl 0x00c31f80
00ad8c3c	cbz w0,0x00ad8c94
00ad8c40	cbz w19,0x00ad8c58
00ad8c44	sxtw x2,w19
00ad8c48	mov x0,x22
00ad8c4c	mov x1,x21
00ad8c50	bl 0x00c31f80
00ad8c54	cbz w0,0x00ad8c94
00ad8c58	ldr x8,[sp, #0x18]
00ad8c5c	mov x0,x22
00ad8c60	mov x2,xzr
00ad8c64	sub x28,x8,#0x1
00ad8c68	add x26,x20,x28
00ad8c6c	mov x1,x26
00ad8c70	bl 0x00c31f60
00ad8c74	cbz w0,0x00ad8c94
00ad8c78	mov x0,x20
00ad8c7c	mov x1,x28
00ad8c80	mov x2,x26
00ad8c84	mov x3,x27
00ad8c88	mov x4,x24
00ad8c8c	bl 0x00c3ff10
00ad8c90	cbz w0,0x00ad8d18
00ad8c94	mov w20,wzr
00ad8c98	b 0x00ad8cd4
00ad8c9c	bl 0x00c342a0
00ad8ca0	adrp x0,0x2ca000
00ad8ca4	adrp x2,0x2be000
00ad8ca8	add x0,x0,#0x383
00ad8cac	add x2,x2,#0x34b
00ad8cb0	mov w1,#0xcd
00ad8cb4	bl 0x00c342b0
00ad8cb8	mov w1,#0x100
00ad8cbc	mov w0,#0x4
00ad8cc0	movk w1,#0xc, LSL #16
00ad8cc4	mov x2,xzr
00ad8cc8	bl 0x00c342c0
00ad8ccc	mov w20,wzr
00ad8cd0	mov x22,xzr
00ad8cd4	mov x0,x22
00ad8cd8	bl 0x00c31f90
00ad8cdc	adrp x2,0x2ca000
00ad8ce0	sxtw x1,w19
00ad8ce4	add x2,x2,#0x383
00ad8ce8	orr w3,wzr,#0xfc
00ad8cec	mov x0,x21
00ad8cf0	bl 0x00c345e0
00ad8cf4	mov w0,w20
00ad8cf8	ldp x29,x30,[sp, #0x70]
00ad8cfc	ldp x20,x19,[sp, #0x60]
00ad8d00	ldp x22,x21,[sp, #0x50]
00ad8d04	ldp x24,x23,[sp, #0x40]
00ad8d08	ldp x26,x25,[sp, #0x30]
00ad8d0c	ldp x28,x27,[sp, #0x20]
00ad8d10	add sp,sp,#0x80
00ad8d14	ret
00ad8d18	orr w8,wzr,#0xfffffffe
00ad8d1c	sub w8,w8,w23
00ad8d20	add w8,w8,w25
00ad8d24	sub w8,w8,w19
00ad8d28	sxtw x10,w8
00ad8d2c	add x8,x20,x10
00ad8d30	ldrb w9,[x8]
00ad8d34	cmp w19,#0x1
00ad8d38	eor w9,w9,#0x1
00ad8d3c	strb w9,[x8]
00ad8d40	b.lt 0x00ad8de8
00ad8d44	cmp w19,#0x20
00ad8d48	mov w9,w19
00ad8d4c	b.cs 0x00ad8d58
00ad8d50	mov x10,xzr
00ad8d54	b 0x00ad8dc4
00ad8d58	add x11,x20,x10
00ad8d5c	add x12,x11,#0x1
00ad8d60	add x13,x21,x9
00ad8d64	cmp x12,x13
00ad8d68	b.cs 0x00ad8d84
00ad8d6c	add x10,x10,x9
00ad8d70	add x10,x20,x10
00ad8d74	add x10,x10,#0x1
00ad8d78	cmp x21,x10
00ad8d7c	mov x10,xzr
00ad8d80	b.cc 0x00ad8dc4
00ad8d84	and x10,x9,#0xffffffe0
00ad8d88	add x11,x11,#0x11
00ad8d8c	add x8,x8,x10
00ad8d90	add x12,x21,#0x10
00ad8d94	mov x13,x10
00ad8d98	ldp q0,q1,[x12, #-0x10]
00ad8d9c	ldp q2,q3,[x11, #-0x10]
00ad8da0	subs x13,x13,#0x20
00ad8da4	add x12,x12,#0x20
00ad8da8	eor v0.16B,v2.16B,v0.16B
00ad8dac	eor v1.16B,v3.16B,v1.16B
00ad8db0	stp q0,q1,[x11, #-0x10]
00ad8db4	add x11,x11,#0x20
00ad8db8	b.ne 0x00ad8d98
00ad8dbc	cmp x10,x9
00ad8dc0	b.eq 0x00ad8de8
00ad8dc4	add x11,x21,x10
00ad8dc8	sub x9,x9,x10
00ad8dcc	add x8,x8,#0x1
00ad8dd0	ldrb w10,[x11], #0x1
00ad8dd4	ldrb w12,[x8]
00ad8dd8	subs x9,x9,#0x1
00ad8ddc	eor w10,w12,w10
00ad8de0	strb w10,[x8], #0x1
00ad8de4	b.ne 0x00ad8dd0
00ad8de8	ldr w10,[sp, #0x14]
00ad8dec	cbz w10,0x00ad8e0c
00ad8df0	ldrb w9,[x20]
00ad8df4	mov w8,#0x8
00ad8df8	sub w8,w8,w10
00ad8dfc	orr w10,wzr,#0xff
00ad8e00	lsr w8,w10,w8
00ad8e04	and w8,w9,w8
00ad8e08	strb w8,[x20]
00ad8e0c	ldr x8,[sp, #0x8]
00ad8e10	mov w9,#0xbc
00ad8e14	add x8,x20,x8
00ad8e18	mov w20,#0x1
00ad8e1c	sturb w9,[x8, #-0x1]
00ad8e20	b 0x00ad8cd4
