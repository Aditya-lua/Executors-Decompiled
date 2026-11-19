; ossl_prov_drbg_instantiate @ 00b58a14
00b58a14	sub sp,sp,#0x90
00b58a18	stp x28,x27,[sp, #0x30]
00b58a1c	stp x26,x25,[sp, #0x40]
00b58a20	stp x24,x23,[sp, #0x50]
00b58a24	stp x22,x21,[sp, #0x60]
00b58a28	stp x20,x19,[sp, #0x70]
00b58a2c	stp x29,x30,[sp, #0x80]
00b58a30	stp xzr,xzr,[sp, #0x10]
00b58a34	ldr w24,[x0, #0x80]
00b58a38	mov x19,x0
00b58a3c	add x29,sp,#0x80
00b58a40	cmp w24,w1
00b58a44	b.cs 0x00b58a70
00b58a48	bl 0x00c342a0
00b58a4c	adrp x0,0x2be000
00b58a50	adrp x2,0x2b3000
00b58a54	add x0,x0,#0xab1
00b58a58	add x2,x2,#0xb5
00b58a5c	mov w1,#0x172
00b58a60	bl 0x00c342b0
00b58a64	mov w0,#0x39
00b58a68	mov w1,#0xb5
00b58a6c	b 0x00b58b9c
00b58a70	ldr x9,[x19, #0xb0]
00b58a74	cmp x3,#0x0
00b58a78	mov w8,#0x1d
00b58a7c	csel x21,x8,x4,eq
00b58a80	adrp x8,0x77c000
00b58a84	add x8,x8,#0x265
00b58a88	csel x22,x8,x3,eq
00b58a8c	cmp x21,x9
00b58a90	b.ls 0x00b58abc
00b58a94	bl 0x00c342a0
00b58a98	adrp x0,0x2be000
00b58a9c	adrp x2,0x2b3000
00b58aa0	add x0,x0,#0xab1
00b58aa4	add x2,x2,#0xb5
00b58aa8	mov w1,#0x17e
00b58aac	bl 0x00c342b0
00b58ab0	mov w0,#0x39
00b58ab4	mov w1,#0xc3
00b58ab8	b 0x00b58b9c
00b58abc	ldr w20,[x19, #0xf0]
00b58ac0	cbz w20,0x00b58af4
00b58ac4	bl 0x00c342a0
00b58ac8	adrp x0,0x2be000
00b58acc	adrp x2,0x2b3000
00b58ad0	add x0,x0,#0xab1
00b58ad4	add x2,x2,#0xb5
00b58ad8	cmp w20,#0x2
00b58adc	b.ne 0x00b58b8c
00b58ae0	mov w1,#0x184
00b58ae4	bl 0x00c342b0
00b58ae8	mov w0,#0x39
00b58aec	orr w1,wzr,#0xc0
00b58af0	b 0x00b58b9c
00b58af4	ldp x25,x27,[x19, #0x98]
00b58af8	ldr x26,[x19, #0x90]
00b58afc	mov w23,w2
00b58b00	mov w8,#0x2
00b58b04	str w8,[x19, #0xf0]
00b58b08	cbz x27,0x00b58be8
00b58b0c	ldr x8,[x19, #0x58]
00b58b10	ldr x0,[x19, #0x30]
00b58b14	cbz x8,0x00b58bf8
00b58b18	ldr x4,[x19, #0xa8]
00b58b1c	mov x1,xzr
00b58b20	mov w2,w24
00b58b24	mov x3,x27
00b58b28	blr x8
00b58b2c	mov x20,x0
00b58b30	cbz x0,0x00b58d00
00b58b34	adrp x1,0x2be000
00b58b38	add x1,x1,#0xab1
00b58b3c	mov w2,#0x195
00b58b40	mov x0,x20
00b58b44	bl 0x00c32320
00b58b48	str x0,[sp, #0x18]
00b58b4c	cbz x0,0x00b58d5c
00b58b50	mov x1,x0
00b58b54	ldr x8,[x19, #0x58]
00b58b58	ldr x0,[x19, #0x30]
00b58b5c	ldr w2,[x19, #0x80]
00b58b60	ldp x3,x4,[x19, #0xa0]
00b58b64	blr x8
00b58b68	cmp x20,x0
00b58b6c	b.eq 0x00b58c10
00b58b70	bl 0x00c342a0
00b58b74	adrp x0,0x2be000
00b58b78	adrp x2,0x2b3000
00b58b7c	add x0,x0,#0xab1
00b58b80	add x2,x2,#0xb5
00b58b84	mov w1,#0x19e
00b58b88	b 0x00b58ef0
00b58b8c	mov w1,#0x186
00b58b90	bl 0x00c342b0
00b58b94	mov w0,#0x39
00b58b98	mov w1,#0xb9
00b58b9c	mov x2,xzr
00b58ba0	bl 0x00c342c0
00b58ba4	mov x20,xzr
00b58ba8	ldr x1,[sp, #0x18]
00b58bac	cbz x1,0x00b58bbc
00b58bb0	ldr x0,[x19, #0x8]
00b58bb4	mov x2,x20
00b58bb8	bl 0x00c41090
00b58bbc	ldr w8,[x19, #0xf0]
00b58bc0	ldp x29,x30,[sp, #0x80]
00b58bc4	ldp x20,x19,[sp, #0x70]
00b58bc8	ldp x22,x21,[sp, #0x60]
00b58bcc	ldp x24,x23,[sp, #0x50]
00b58bd0	ldp x26,x25,[sp, #0x40]
00b58bd4	ldp x28,x27,[sp, #0x30]
00b58bd8	cmp w8,#0x1
00b58bdc	cset w0,eq
00b58be0	add sp,sp,#0x90
00b58be4	ret
00b58be8	mov x20,xzr
00b58bec	ldr w8,[x19, #0xd8]
00b58bf0	cbnz w8,0x00b58c18
00b58bf4	b 0x00b58c24
00b58bf8	cbz x0,0x00b58d78
00b58bfc	ldr x8,[x19, #0xa8]
00b58c00	mov x20,xzr
00b58c04	add w24,w24,w24, LSR #0x1
00b58c08	add x26,x27,x26
00b58c0c	add x25,x8,x25
00b58c10	ldr w8,[x19, #0xd8]
00b58c14	cbz w8,0x00b58c24
00b58c18	cmn w8,#0x1
00b58c1c	mov w9,#0x1
00b58c20	csinc w8,w9,w8,eq
00b58c24	add x1,sp,#0x10
00b58c28	mov x0,x19
00b58c2c	mov w2,w24
00b58c30	mov x3,x26
00b58c34	mov x4,x25
00b58c38	mov w5,w23
00b58c3c	str w8,[x19, #0xdc]
00b58c40	bl 0x00b58f10
00b58c44	cmp x0,x26
00b58c48	b.cc 0x00b58cd8
00b58c4c	mov x23,x0
00b58c50	cmp x0,x25
00b58c54	b.hi 0x00b58cd8
00b58c58	ldr x8,[x19, #0x10]
00b58c5c	ldp x1,x3,[sp, #0x10]
00b58c60	mov x0,x19
00b58c64	mov x2,x23
00b58c68	mov x4,x20
00b58c6c	mov x5,x22
00b58c70	mov x6,x21
00b58c74	blr x8
00b58c78	ldr x8,[x19, #0x30]
00b58c7c	ldr x22,[sp, #0x10]
00b58c80	mov w21,w0
00b58c84	cbz x8,0x00b58d1c
00b58c88	ldr x9,[x19, #0x68]
00b58c8c	cbz x9,0x00b58d2c
00b58c90	ldr x10,[x19, #0x40]
00b58c94	cbz x10,0x00b58cac
00b58c98	mov x0,x8
00b58c9c	blr x10
00b58ca0	cbz w0,0x00b58e18
00b58ca4	ldr x9,[x19, #0x68]
00b58ca8	ldr x8,[x19, #0x30]
00b58cac	mov x0,x8
00b58cb0	mov x1,x22
00b58cb4	mov x2,x23
00b58cb8	blr x9
00b58cbc	ldr x0,[x19, #0x30]
00b58cc0	cbz x0,0x00b58d2c
00b58cc4	ldr x8,[x19, #0x48]
00b58cc8	cbz x8,0x00b58d2c
00b58ccc	blr x8
00b58cd0	cbnz w21,0x00b58d30
00b58cd4	b 0x00b58e48
00b58cd8	bl 0x00c342a0
00b58cdc	adrp x0,0x2be000
00b58ce0	adrp x2,0x2b3000
00b58ce4	add x0,x0,#0xab1
00b58ce8	add x2,x2,#0xb5
00b58cec	mov w1,#0x1c8
00b58cf0	bl 0x00c342b0
00b58cf4	mov w0,#0x39
00b58cf8	mov w1,#0xbd
00b58cfc	b 0x00b58efc
00b58d00	bl 0x00c342a0
00b58d04	adrp x0,0x2be000
00b58d08	adrp x2,0x2b3000
00b58d0c	add x0,x0,#0xab1
00b58d10	add x2,x2,#0xb5
00b58d14	mov w1,#0x192
00b58d18	b 0x00b58ef0
00b58d1c	ldr x0,[x19, #0x8]
00b58d20	mov x1,x22
00b58d24	mov x2,x23
00b58d28	bl 0x00c41080
00b58d2c	cbz w21,0x00b58e48
00b58d30	mov w8,#0x1
00b58d34	mov x0,xzr
00b58d38	str w8,[x19, #0xf0]
00b58d3c	str w8,[x19, #0xc0]
00b58d40	bl 0x00c30970
00b58d44	ldr w8,[x19, #0xdc]
00b58d48	str x0,[x19, #0xc8]
00b58d4c	str w8,[x19, #0xd8]
00b58d50	ldr x1,[sp, #0x18]
00b58d54	cbnz x1,0x00b58bb0
00b58d58	b 0x00b58bbc
00b58d5c	bl 0x00c342a0
00b58d60	adrp x0,0x2be000
00b58d64	adrp x2,0x2b3000
00b58d68	add x0,x0,#0xab1
00b58d6c	add x2,x2,#0xb5
00b58d70	mov w1,#0x197
00b58d74	b 0x00b58ef0
00b58d78	ldr x0,[x19, #0x8]
00b58d7c	ldr x20,[x19, #0xa8]
00b58d80	bl 0x00c41210
00b58d84	adrp x2,0xca4000
00b58d88	add x2,x2,#0x288
00b58d8c	orr w1,wzr,#0x6
00b58d90	bl 0x00c3b520
00b58d94	cbz x0,0x00b58e10
00b58d98	mov x28,x0
00b58d9c	ldr x0,[x19, #0x30]
00b58da0	str x20,[sp, #0x8]
00b58da4	cbz x0,0x00b58e84
00b58da8	ldr x8,[x19, #0x58]
00b58dac	cbz x8,0x00b58e84
00b58db0	ldp x3,x4,[x19, #0xa0]
00b58db4	mov x1,xzr
00b58db8	mov w2,wzr
00b58dbc	blr x8
00b58dc0	cbz x0,0x00b58e84
00b58dc4	adrp x1,0x2be000
00b58dc8	add x1,x1,#0xab1
00b58dcc	mov w2,#0x14c
00b58dd0	mov x20,x0
00b58dd4	bl 0x00c32320
00b58dd8	cbz x0,0x00b58e84
00b58ddc	mov x9,x0
00b58de0	ldr x8,[x19, #0x58]
00b58de4	ldr x0,[x19, #0x30]
00b58de8	ldp x3,x4,[x19, #0xa0]
00b58dec	mov x1,x9
00b58df0	mov w2,wzr
00b58df4	str x9,[sp]
00b58df8	blr x8
00b58dfc	cmp x0,x20
00b58e00	b.ne 0x00b58e70
00b58e04	ldr x8,[sp]
00b58e08	str x8,[sp, #0x18]
00b58e0c	b 0x00b58ec0
00b58e10	mov x20,xzr
00b58e14	b 0x00b58ec0
00b58e18	bl 0x00c342a0
00b58e1c	adrp x0,0x2be000
00b58e20	adrp x2,0x2be000
00b58e24	add x0,x0,#0xab1
00b58e28	add x2,x2,#0xad8
00b58e2c	mov w1,#0x46
00b58e30	bl 0x00c342b0
00b58e34	mov w0,#0x39
00b58e38	mov w1,#0xb6
00b58e3c	mov x2,xzr
00b58e40	bl 0x00c342c0
00b58e44	cbnz w21,0x00b58d30
00b58e48	bl 0x00c342a0
00b58e4c	adrp x0,0x2be000
00b58e50	adrp x2,0x2b3000
00b58e54	add x0,x0,#0xab1
00b58e58	add x2,x2,#0xb5
00b58e5c	mov w1,#0x1cf
00b58e60	bl 0x00c342b0
00b58e64	mov w0,#0x39
00b58e68	mov w1,#0xbc
00b58e6c	b 0x00b58efc
00b58e70	ldr x0,[sp]
00b58e74	adrp x1,0x2be000
00b58e78	add x1,x1,#0xab1
00b58e7c	mov w2,#0x153
00b58e80	bl 0x00c32310
00b58e84	stp x19,xzr,[sp, #0x20]
00b58e88	ldr x3,[x28], #0x8
00b58e8c	add x8,sp,#0x20
00b58e90	add x2,x8,#0x8
00b58e94	mov w1,#0x1
00b58e98	mov x0,x28
00b58e9c	bl 0x00c3ecc0
00b58ea0	ldr x0,[x19, #0x8]
00b58ea4	ldr x3,[sp, #0x8]
00b58ea8	add x1,sp,#0x18
00b58eac	add x4,sp,#0x20
00b58eb0	mov w5,#0x10
00b58eb4	mov x2,x27
00b58eb8	bl 0x00c410b0
00b58ebc	mov x20,x0
00b58ec0	ldr x8,[x19, #0xa0]
00b58ec4	cmp x20,x8
00b58ec8	b.cc 0x00b58ed8
00b58ecc	ldr x8,[x19, #0xa8]
00b58ed0	cmp x20,x8
00b58ed4	b.ls 0x00b58c10
00b58ed8	bl 0x00c342a0
00b58edc	adrp x0,0x2be000
00b58ee0	adrp x2,0x2b3000
00b58ee4	add x0,x0,#0xab1
00b58ee8	add x2,x2,#0xb5
00b58eec	mov w1,#0x1b5
00b58ef0	bl 0x00c342b0
00b58ef4	mov w0,#0x39
00b58ef8	mov w1,#0xbe
00b58efc	mov x2,xzr
00b58f00	bl 0x00c342c0
00b58f04	ldr x1,[sp, #0x18]
00b58f08	cbnz x1,0x00b58bb0
00b58f0c	b 0x00b58bbc
