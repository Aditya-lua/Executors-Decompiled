; ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>,std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>> @ 009a2b18
009a2b18	stp x24,x23,[sp, #-0x40]!
009a2b1c	stp x22,x21,[sp, #0x10]
009a2b20	stp x20,x19,[sp, #0x20]
009a2b24	stp x29,x30,[sp, #0x30]
009a2b28	add x29,sp,#0x30
009a2b2c	ldr x20,[x2]
009a2b30	mov x19,x2
009a2b34	mov x21,x0
009a2b38	str x20,[x2, #0x8]
009a2b3c	ldp x8,x9,[x1]
009a2b40	cmp x8,x9
009a2b44	b.eq 0x009a2c44
009a2b48	mov w10,#0x4008
009a2b4c	mov w12,#0x4028
009a2b50	sub w9,w9,w8
009a2b54	mov w11,#0x4010
009a2b58	add x20,x21,#0x4
009a2b5c	add x22,x21,x10
009a2b60	add x23,x21,x12
009a2b64	mov w24,#0x4000
009a2b68	str w9,[x21, x11#0x0]
009a2b6c	str x8,[x21, #0x4008]
009a2b70	str w24,[x23]
009a2b74	ldr w1,[x21]
009a2b78	mov x0,x22
009a2b7c	str x20,[x21, #0x4020]
009a2b80	bl 0x00c33270
009a2b84	ldr w8,[x23]
009a2b88	ldr x1,[x19, #0x8]
009a2b8c	mov x0,x19
009a2b90	mov x2,x20
009a2b94	sub x8,x24,x8
009a2b98	add x8,x21,x8
009a2b9c	add x3,x8,#0x4
009a2ba0	bl 0x00c335c0
009a2ba4	ldr w8,[x23]
009a2ba8	cbz w8,0x009a2b70
009a2bac	adrp x10,0xd21000
009a2bb0	add x10,x10,#0x850
009a2bb4	ldrb w11,[x10]
009a2bb8	ldr x8,[x10, #0x8]
009a2bbc	ldp x9,x12,[x19]
009a2bc0	lsr w13,w11,#0x1
009a2bc4	tst w11,#0x1
009a2bc8	csel x13,x13,x8,eq
009a2bcc	sub x8,x12,x9
009a2bd0	cmp x13,x8
009a2bd4	b.hi 0x009a2d80
009a2bd8	ldr x13,[x10, #0x10]
009a2bdc	tst w11,#0x1
009a2be0	add x12,x9,x8
009a2be4	ldurb w14,[x12, #-0x1]
009a2be8	csinc x10,x13,x10,ne
009a2bec	ldrb w11,[x10, #0x3]
009a2bf0	cmp w14,w11
009a2bf4	b.ne 0x009a2d80
009a2bf8	ldurb w11,[x12, #-0x2]
009a2bfc	ldrb w12,[x10, #0x2]
009a2c00	cmp w11,w12
009a2c04	b.ne 0x009a2d80
009a2c08	add x9,x9,x8
009a2c0c	ldurb w11,[x9, #-0x3]
009a2c10	ldrb w12,[x10, #0x1]
009a2c14	cmp w11,w12
009a2c18	b.ne 0x009a2d80
009a2c1c	ldrb w11,[x9, #-0x4]!
009a2c20	ldrb w10,[x10]
009a2c24	cmp w11,w10
009a2c28	b.ne 0x009a2d80
009a2c2c	cmp x8,#0x3
009a2c30	b.hi 0x009a2d98
009a2c34	orr x1,xzr,#-0x4
009a2c38	mov x0,x19
009a2c3c	bl 0x00c33330
009a2c40	b 0x009a2d80
009a2c44	ldr x8,[x19, #0x10]
009a2c48	subs x21,x8,x20
009a2c4c	b.eq 0x009a2c68
009a2c50	mov w8,#0x2
009a2c54	strb w8,[x20]
009a2c58	ldr x8,[x19, #0x8]
009a2c5c	add x24,x8,#0x1
009a2c60	str x24,[x19, #0x8]
009a2c64	b 0x009a2ce4
009a2c68	adds x8,x21,#0x1
009a2c6c	b.mi 0x009a2da0
009a2c70	orr x9,xzr,#0x3ffffffffffffffe
009a2c74	cmp x21,x9
009a2c78	b.hi 0x009a2c94
009a2c7c	lsl x9,x21,#0x1
009a2c80	cmp x9,x8
009a2c84	csel x23,x8,x9,cc
009a2c88	cbnz x23,0x009a2c98
009a2c8c	mov x22,xzr
009a2c90	b 0x009a2ca4
009a2c94	orr x23,xzr,#0x7fffffffffffffff
009a2c98	mov x0,x23
009a2c9c	bl 0x00c2fed0
009a2ca0	mov x22,x0
009a2ca4	add x24,x22,x21
009a2ca8	mov w8,#0x2
009a2cac	add x23,x22,x23
009a2cb0	cmp x21,#0x1
009a2cb4	strb w8,[x24], #0x1
009a2cb8	b.lt 0x009a2ccc
009a2cbc	mov x0,x22
009a2cc0	mov x1,x20
009a2cc4	mov x2,x21
009a2cc8	bl 0x00c2ffd0
009a2ccc	stp x22,x24,[x19]
009a2cd0	str x23,[x19, #0x10]
009a2cd4	cbz x20,0x009a2ce4
009a2cd8	mov x0,x20
009a2cdc	bl 0x00c301d0
009a2ce0	ldr x24,[x19, #0x8]
009a2ce4	ldr x8,[x19, #0x10]
009a2ce8	cmp x24,x8
009a2cec	b.eq 0x009a2d04
009a2cf0	strb wzr,[x24]
009a2cf4	ldr x8,[x19, #0x8]
009a2cf8	add x8,x8,#0x1
009a2cfc	str x8,[x19, #0x8]
009a2d00	b 0x009a2d80
009a2d04	ldr x20,[x19]
009a2d08	sub x21,x8,x20
009a2d0c	adds x8,x21,#0x1
009a2d10	b.mi 0x009a2da0
009a2d14	orr x9,xzr,#0x3ffffffffffffffe
009a2d18	cmp x21,x9
009a2d1c	b.hi 0x009a2d38
009a2d20	lsl x9,x21,#0x1
009a2d24	cmp x9,x8
009a2d28	csel x23,x8,x9,cc
009a2d2c	cbnz x23,0x009a2d3c
009a2d30	mov x22,xzr
009a2d34	b 0x009a2d48
009a2d38	orr x23,xzr,#0x7fffffffffffffff
009a2d3c	mov x0,x23
009a2d40	bl 0x00c2fed0
009a2d44	mov x22,x0
009a2d48	add x24,x22,x21
009a2d4c	add x23,x22,x23
009a2d50	cmp x21,#0x1
009a2d54	strb wzr,[x24], #0x1
009a2d58	b.lt 0x009a2d6c
009a2d5c	mov x0,x22
009a2d60	mov x1,x20
009a2d64	mov x2,x21
009a2d68	bl 0x00c2ffd0
009a2d6c	stp x22,x24,[x19]
009a2d70	str x23,[x19, #0x10]
009a2d74	cbz x20,0x009a2d80
009a2d78	mov x0,x20
009a2d7c	bl 0x00c301d0
009a2d80	ldp x29,x30,[sp, #0x30]
009a2d84	ldp x20,x19,[sp, #0x20]
009a2d88	ldp x22,x21,[sp, #0x10]
009a2d8c	mov w0,#0x1
009a2d90	ldp x24,x23,[sp], #0x40
009a2d94	ret
009a2d98	str x9,[x19, #0x8]
009a2d9c	b 0x009a2d80
009a2da0	mov x0,x19
009a2da4	bl 0x00c30bd0
