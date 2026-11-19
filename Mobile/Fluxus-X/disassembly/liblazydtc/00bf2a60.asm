; std::__ndk1::__money_put<wchar_t>::__format @ 00bf2a60
00bf2a60	paciasp
00bf2a64	sub sp,sp,#0xc0
00bf2a68	stp x29,x30,[sp, #0x60]
00bf2a6c	stp x28,x27,[sp, #0x70]
00bf2a70	stp x26,x25,[sp, #0x80]
00bf2a74	stp x24,x23,[sp, #0x90]
00bf2a78	stp x22,x21,[sp, #0xa0]
00bf2a7c	stp x20,x19,[sp, #0xb0]
00bf2a80	add x29,sp,#0x60
00bf2a84	ldr w8,[x29, #0x90]
00bf2a88	ldp x10,x9,[x29, #0x80]
00bf2a8c	ldr x19,[x29, #0x78]
00bf2a90	tst w7,#0x1
00bf2a94	mov x23,x6
00bf2a98	stur w8,[x29, #-0x14]
00bf2a9c	ldr w8,[x29, #0x68]
00bf2aa0	mov x24,x5
00bf2aa4	ldr w21,[x29, #0x70]
00bf2aa8	ldr x12,[x29, #0x60]
00bf2aac	mov x25,x4
00bf2ab0	str w8,[sp, #0x14]
00bf2ab4	mov w8,#0x4
00bf2ab8	mov x22,x2
00bf2abc	csel x8,x8,xzr,ne
00bf2ac0	mov x28,x1
00bf2ac4	mov x20,xzr
00bf2ac8	str x8,[sp, #0x28]
00bf2acc	add x8,x19,#0x1
00bf2ad0	mov x26,x0
00bf2ad4	stur x8,[x29, #-0x8]
00bf2ad8	add x8,x10,#0x4
00bf2adc	mov x27,x0
00bf2ae0	stp x0,x8,[sp]
00bf2ae4	add x8,x9,#0x4
00bf2ae8	stur w3,[x29, #-0x24]
00bf2aec	str x0,[x2]
00bf2af0	stur x10,[x29, #-0x20]
00bf2af4	str x9,[sp, #0x30]
00bf2af8	str x8,[sp, #0x20]
00bf2afc	stur x12,[x29, #-0x10]
00bf2b00	str x1,[sp, #0x18]
00bf2b04	b 0x00bf2b1c
00bf2b08	str x26,[x28]
00bf2b0c	mov x27,x26
00bf2b10	add x20,x20,#0x1
00bf2b14	cmp x20,#0x4
00bf2b18	b.eq 0x00bf2e60
00bf2b1c	ldrb w8,[x12, x20]
00bf2b20	cmp w8,#0x1
00bf2b24	b.le 0x00bf2bd4
00bf2b28	cmp w8,#0x2
00bf2b2c	b.eq 0x00bf2c08
00bf2b30	cmp w8,#0x3
00bf2b34	b.eq 0x00bf2c60
00bf2b38	cmp w8,#0x4
00bf2b3c	b.ne 0x00bf2b10
00bf2b40	ldr x8,[sp, #0x28]
00bf2b44	add x25,x25,x8
00bf2b48	cmp x25,x24
00bf2b4c	mov x26,x25
00bf2b50	b.cs 0x00bf2b80
00bf2b54	mov x26,x25
00bf2b58	ldr x8,[x23]
00bf2b5c	ldr w2,[x26]
00bf2b60	mov x0,x23
00bf2b64	mov w1,#0x40
00bf2b68	ldr x8,[x8, #0x18]
00bf2b6c	blr x8
00bf2b70	tbz w0,#0x0,0x00bf2b80
00bf2b74	add x26,x26,#0x4
00bf2b78	cmp x26,x24
00bf2b7c	b.cc 0x00bf2b58
00bf2b80	ldur w8,[x29, #-0x14]
00bf2b84	cmp w8,#0x1
00bf2b88	b.lt 0x00bf2d34
00bf2b8c	cmp x26,x25
00bf2b90	b.ls 0x00bf2c9c
00bf2b94	ldr x8,[x22]
00bf2b98	ldur w28,[x29, #-0x14]
00bf2b9c	sub x9,x26,#0x4
00bf2ba0	cmp x9,x25
00bf2ba4	ldr w11,[x9], #-0x4
00bf2ba8	mov w10,w28
00bf2bac	sub w28,w28,#0x1
00bf2bb0	str w11,[x8], #0x4
00bf2bb4	b.ls 0x00bf2bc0
00bf2bb8	cmp w10,#0x1
00bf2bbc	b.ne 0x00bf2ba0
00bf2bc0	cmp w10,#0x1
00bf2bc4	add x26,x9,#0x4
00bf2bc8	str x8,[x22]
00bf2bcc	b.ne 0x00bf2ca0
00bf2bd0	b 0x00bf2d24
00bf2bd4	cbz w8,0x00bf2b08
00bf2bd8	cmp w8,#0x1
00bf2bdc	b.ne 0x00bf2b10
00bf2be0	ldr x8,[x23]
00bf2be4	str x26,[x28]
00bf2be8	mov x0,x23
00bf2bec	mov w1,#0x20
00bf2bf0	ldr x8,[x8, #0x58]
00bf2bf4	blr x8
00bf2bf8	ldr x26,[x22]
00bf2bfc	ldur x12,[x29, #-0x10]
00bf2c00	str w0,[x26], #0x4
00bf2c04	b 0x00bf2c90
00bf2c08	ldur x9,[x29, #-0x20]
00bf2c0c	ldrb w8,[x9]
00bf2c10	ldr x9,[x9, #0x8]
00bf2c14	lsr x10,x8,#0x1
00bf2c18	tst w8,#0x1
00bf2c1c	csel x9,x10,x9,eq
00bf2c20	ldur w10,[x29, #-0x24]
00bf2c24	tbz w10,#0x9,0x00bf2b10
00bf2c28	cbz x9,0x00bf2b10
00bf2c2c	ldur x10,[x29, #-0x20]
00bf2c30	lsl x27,x9,#0x2
00bf2c34	tst w8,#0x1
00bf2c38	ldr x8,[sp, #0x8]
00bf2c3c	mov x0,x26
00bf2c40	ldr x10,[x10, #0x10]
00bf2c44	mov x2,x27
00bf2c48	csel x1,x8,x10,eq
00bf2c4c	bl 0x00c2ff60
00bf2c50	ldur x12,[x29, #-0x10]
00bf2c54	add x26,x26,x27
00bf2c58	str x26,[x22]
00bf2c5c	b 0x00bf2b0c
00bf2c60	ldr x11,[sp, #0x30]
00bf2c64	ldrb w8,[x11]
00bf2c68	ldr x9,[x11, #0x8]
00bf2c6c	lsr x10,x8,#0x1
00bf2c70	tst w8,#0x1
00bf2c74	csel x8,x10,x9,eq
00bf2c78	cbz x8,0x00bf2b10
00bf2c7c	ldr x8,[x11, #0x10]
00bf2c80	ldr x9,[sp, #0x20]
00bf2c84	csel x8,x9,x8,eq
00bf2c88	ldr w8,[x8]
00bf2c8c	str w8,[x26], #0x4
00bf2c90	mov x27,x26
00bf2c94	str x26,[x22]
00bf2c98	b 0x00bf2b10
00bf2c9c	ldur w28,[x29, #-0x14]
00bf2ca0	ldr x8,[x23]
00bf2ca4	mov x0,x23
00bf2ca8	mov w1,#0x30
00bf2cac	ldr x8,[x8, #0x58]
00bf2cb0	blr x8
00bf2cb4	ldr x8,[x22]
00bf2cb8	cmp w28,#0x1
00bf2cbc	b.lt 0x00bf2d24
00bf2cc0	cmp w28,#0x8
00bf2cc4	b.cs 0x00bf2cd0
00bf2cc8	mov x9,x8
00bf2ccc	b 0x00bf2d0c
00bf2cd0	mov w10,w28
00bf2cd4	dup v0.4S,w0
00bf2cd8	and x11,x10,#0x7ffffff8
00bf2cdc	add x9,x8,x11, LSL #0x2
00bf2ce0	sub w28,w28,w11
00bf2ce4	add x8,x8,#0x10
00bf2ce8	mov x12,x11
00bf2cec	subs x12,x12,#0x8
00bf2cf0	stp q0,q0,[x8, #-0x10]
00bf2cf4	add x8,x8,#0x20
00bf2cf8	b.ne 0x00bf2cec
00bf2cfc	cmp x11,x10
00bf2d00	b.ne 0x00bf2d0c
00bf2d04	mov x8,x9
00bf2d08	b 0x00bf2d24
00bf2d0c	add w10,w28,#0x1
00bf2d10	mov x8,x9
00bf2d14	sub w10,w10,#0x1
00bf2d18	str w0,[x8], #0x4
00bf2d1c	cmp w10,#0x1
00bf2d20	b.hi 0x00bf2d14
00bf2d24	ldr w9,[sp, #0x14]
00bf2d28	ldr x28,[sp, #0x18]
00bf2d2c	str w9,[x8], #0x4
00bf2d30	str x8,[x22]
00bf2d34	cmp x26,x25
00bf2d38	b.eq 0x00bf2d6c
00bf2d3c	ldrb w8,[x19]
00bf2d40	ldr x9,[x19, #0x8]
00bf2d44	lsr x10,x8,#0x1
00bf2d48	tst w8,#0x1
00bf2d4c	csel x9,x10,x9,eq
00bf2d50	cbz x9,0x00bf2d90
00bf2d54	ldr x9,[x19, #0x10]
00bf2d58	tst w8,#0x1
00bf2d5c	ldur x8,[x29, #-0x8]
00bf2d60	csel x8,x8,x9,eq
00bf2d64	ldrb w8,[x8]
00bf2d68	b 0x00bf2d94
00bf2d6c	ldr x8,[x23]
00bf2d70	mov x0,x23
00bf2d74	mov w1,#0x30
00bf2d78	ldr x8,[x8, #0x58]
00bf2d7c	blr x8
00bf2d80	ldr x26,[x22]
00bf2d84	str w0,[x26], #0x4
00bf2d88	str x26,[x22]
00bf2d8c	b 0x00bf2e24
00bf2d90	mov w8,#0xffffffff
00bf2d94	mov w9,wzr
00bf2d98	mov w11,wzr
00bf2d9c	b 0x00bf2dc4
00bf2da0	ldrb w8,[x8, x9]
00bf2da4	mov w11,wzr
00bf2da8	ldr w12,[x26, #-0x4]!
00bf2dac	mov x13,x10
00bf2db0	cmp x26,x25
00bf2db4	add w11,w11,#0x1
00bf2db8	str w12,[x13], #0x4
00bf2dbc	str x13,[x22]
00bf2dc0	b.eq 0x00bf2e20
00bf2dc4	ldr x10,[x22]
00bf2dc8	cmp w11,w8
00bf2dcc	b.ne 0x00bf2da8
00bf2dd0	str w21,[x10], #0x4
00bf2dd4	add w9,w9,#0x1
00bf2dd8	str x10,[x22]
00bf2ddc	ldrb w11,[x19]
00bf2de0	ldr x12,[x19, #0x8]
00bf2de4	lsr x13,x11,#0x1
00bf2de8	tst w11,#0x1
00bf2dec	csel x12,x13,x12,eq
00bf2df0	cmp x12,x9
00bf2df4	b.ls 0x00bf2da4
00bf2df8	ldr x8,[x19, #0x10]
00bf2dfc	tst w11,#0x1
00bf2e00	ldur x11,[x29, #-0x8]
00bf2e04	csel x8,x11,x8,eq
00bf2e08	ldrb w11,[x8, x9]
00bf2e0c	cmp w11,#0xff
00bf2e10	b.ne 0x00bf2da0
00bf2e14	mov w11,wzr
00bf2e18	mov w8,#0xffffffff
00bf2e1c	b 0x00bf2da8
00bf2e20	add x26,x10,#0x4
00bf2e24	ldur x12,[x29, #-0x10]
00bf2e28	cmp x27,x26
00bf2e2c	b.eq 0x00bf2b0c
00bf2e30	sub x8,x26,#0x4
00bf2e34	cmp x27,x8
00bf2e38	b.cs 0x00bf2b0c
00bf2e3c	add x9,x27,#0x4
00bf2e40	ldr w10,[x8]
00bf2e44	ldur w11,[x9, #-0x4]
00bf2e48	stur w10,[x9, #-0x4]
00bf2e4c	str w11,[x8], #-0x4
00bf2e50	cmp x9,x8
00bf2e54	add x9,x9,#0x4
00bf2e58	b.cc 0x00bf2e40
00bf2e5c	b 0x00bf2b0c
00bf2e60	ldr x11,[sp, #0x30]
00bf2e64	ldrb w8,[x11]
00bf2e68	ldr x9,[x11, #0x8]
00bf2e6c	lsr x10,x8,#0x1
00bf2e70	tst w8,#0x1
00bf2e74	csel x9,x10,x9,eq
00bf2e78	cmp x9,#0x1
00bf2e7c	b.ls 0x00bf2ebc
00bf2e80	ldr x10,[x11, #0x10]
00bf2e84	tst w8,#0x1
00bf2e88	lsl x8,x9,#0x2
00bf2e8c	ldr x9,[sp, #0x20]
00bf2e90	csel x9,x9,x10,eq
00bf2e94	cmp x8,#0x4
00bf2e98	add x1,x9,#0x4
00bf2e9c	add x9,x9,x8
00bf2ea0	sub x23,x9,x1
00bf2ea4	b.eq 0x00bf2eb4
00bf2ea8	mov x0,x26
00bf2eac	mov x2,x23
00bf2eb0	bl 0x00c2ff60
00bf2eb4	add x26,x26,x23
00bf2eb8	str x26,[x22]
00bf2ebc	ldur w9,[x29, #-0x24]
00bf2ec0	mov w8,#0xb0
00bf2ec4	and w8,w9,w8
00bf2ec8	cmp w8,#0x10
00bf2ecc	b.eq 0x00bf2ee0
00bf2ed0	cmp w8,#0x20
00bf2ed4	b.eq 0x00bf2edc
00bf2ed8	ldr x26,[sp]
00bf2edc	str x26,[x28]
00bf2ee0	ldp x20,x19,[sp, #0xb0]
00bf2ee4	ldp x22,x21,[sp, #0xa0]
00bf2ee8	ldp x24,x23,[sp, #0x90]
00bf2eec	ldp x26,x25,[sp, #0x80]
00bf2ef0	ldp x28,x27,[sp, #0x70]
00bf2ef4	ldp x29,x30,[sp, #0x60]
00bf2ef8	add sp,sp,#0xc0
00bf2efc	autiasp
00bf2f00	ret
