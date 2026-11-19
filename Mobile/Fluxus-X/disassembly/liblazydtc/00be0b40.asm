; FUN_00be0b40 @ 00be0b40
00be0b40	paciasp
00be0b44	sub sp,sp,#0x1e0
00be0b48	stp x29,x30,[sp, #0x180]
00be0b4c	stp x28,x27,[sp, #0x190]
00be0b50	stp x26,x25,[sp, #0x1a0]
00be0b54	stp x24,x23,[sp, #0x1b0]
00be0b58	stp x22,x21,[sp, #0x1c0]
00be0b5c	stp x20,x19,[sp, #0x1d0]
00be0b60	add x29,sp,#0x180
00be0b64	ldr w8,[x3, #0x8]
00be0b68	mov w9,#0x4a
00be0b6c	mov x25,x3
00be0b70	mov x20,x2
00be0b74	mov x21,x1
00be0b78	sub x27,x29,#0xb0
00be0b7c	ands w8,w8,w9
00be0b80	stp x5,x4,[sp, #0x10]
00be0b84	b.eq 0x00be0ba8
00be0b88	cmp w8,#0x40
00be0b8c	b.eq 0x00be0ba0
00be0b90	cmp w8,#0x8
00be0b94	b.ne 0x00be0bb0
00be0b98	mov w23,#0x10
00be0b9c	b 0x00be0bb4
00be0ba0	mov w23,#0x8
00be0ba4	b 0x00be0bb4
00be0ba8	mov w23,wzr
00be0bac	b 0x00be0bb4
00be0bb0	mov w23,#0xa
00be0bb4	sub x2,x29,#0x74
00be0bb8	mov x1,x25
00be0bbc	bl 0x00c0cb44
00be0bc0	mov x24,x0
00be0bc4	sub x8,x29,#0x90
00be0bc8	sub x1,x29,#0xc
00be0bcc	mov x0,x25
00be0bd0	bl 0x00c0cc28
00be0bd4	stp xzr,xzr,[x27, #0x8]
00be0bd8	str xzr,[x27, #0x18]
00be0bdc	sub x0,x29,#0xa8
00be0be0	mov w1,#0x16
00be0be4	mov w2,wzr
00be0be8	sub x19,x29,#0xa8
00be0bec	bl 0x00c30250
00be0bf0	ldurb w8,[x29, #-0xa8]
00be0bf4	ldr x9,[x27, #0x18]
00be0bf8	add x10,sp,#0x30
00be0bfc	orr x28,x19,#0x1
00be0c00	add x22,sp,#0x28
00be0c04	str x10,[sp, #0x28]
00be0c08	tst w8,#0x1
00be0c0c	str wzr,[sp, #0x24]
00be0c10	csinc x25,x9,x19,ne
00be0c14	mov w19,#0x16
00be0c18	str x25,[x27]
00be0c1c	b 0x00be0c28
00be0c20	add x8,x8,#0x4
00be0c24	str x8,[x21, #0x18]
00be0c28	cbz x21,0x00be0c40
00be0c2c	ldp x8,x9,[x21, #0x18]
00be0c30	cmp x8,x9
00be0c34	b.eq 0x00be0c50
00be0c38	ldr w0,[x8]
00be0c3c	b 0x00be0c60
00be0c40	mov w26,#0x1
00be0c44	cbnz x20,0x00be0c70
00be0c48	tbz w26,#0x0,0x00be0ca8
00be0c4c	b 0x00be0dec
00be0c50	ldr x8,[x21]
00be0c54	ldr x8,[x8, #0x48]
00be0c58	mov x0,x21
00be0c5c	blr x8
00be0c60	cmn w0,#0x1
00be0c64	cset w26,eq
00be0c68	csel x21,xzr,x21,eq
00be0c6c	cbz x20,0x00be0c48
00be0c70	ldp x8,x9,[x20, #0x18]
00be0c74	cmp x8,x9
00be0c78	b.eq 0x00be0c84
00be0c7c	ldr w0,[x8]
00be0c80	b 0x00be0c94
00be0c84	ldr x8,[x20]
00be0c88	ldr x8,[x8, #0x48]
00be0c8c	mov x0,x20
00be0c90	blr x8
00be0c94	cmn w0,#0x1
00be0c98	cset w8,eq
00be0c9c	csel x20,xzr,x20,eq
00be0ca0	cmp w26,w8
00be0ca4	b.eq 0x00be0dec
00be0ca8	ldurb w8,[x29, #-0xa8]
00be0cac	ldr x9,[x27, #0x10]
00be0cb0	ldr x11,[x27]
00be0cb4	lsr x10,x8,#0x1
00be0cb8	tst w8,#0x1
00be0cbc	csel x26,x10,x9,eq
00be0cc0	add x9,x25,x26
00be0cc4	cmp x11,x9
00be0cc8	b.ne 0x00be0d80
00be0ccc	cmp x26,#0x1
00be0cd0	b.lt 0x00be0ce8
00be0cd4	sub x0,x29,#0xa8
00be0cd8	mov x1,x26
00be0cdc	mov w2,wzr
00be0ce0	bl 0x00c30250
00be0ce4	b 0x00be0d0c
00be0ce8	lsl x9,x26,#0x1
00be0cec	tbnz w8,#0x0,0x00be0d00
00be0cf0	lsl w8,w9,#0x1
00be0cf4	sturb w8,[x29, #-0xa8]
00be0cf8	mov x8,x28
00be0cfc	b 0x00be0d08
00be0d00	ldr x8,[x27, #0x18]
00be0d04	str x9,[x27, #0x10]
00be0d08	strb wzr,[x8, x9]
00be0d0c	ldp x9,x10,[x27, #0x8]
00be0d10	ldurb w8,[x29, #-0xa8]
00be0d14	tst w8,#0x1
00be0d18	and x11,x9,#-0x2
00be0d1c	ubfx x12,x9,#0x1,#0x7
00be0d20	sub x11,x11,#0x1
00be0d24	csel x8,x19,x11,eq
00be0d28	tst x9,#0x1
00be0d2c	csel x10,x12,x10,eq
00be0d30	subs x1,x8,x10
00be0d34	b.ls 0x00be0d48
00be0d38	sub x0,x29,#0xa8
00be0d3c	mov w2,wzr
00be0d40	bl 0x00c30250
00be0d44	b 0x00be0d68
00be0d48	tbnz w9,#0x0,0x00be0d5c
00be0d4c	lsl w9,w8,#0x1
00be0d50	sturb w9,[x29, #-0xa8]
00be0d54	mov x9,x28
00be0d58	b 0x00be0d64
00be0d5c	ldr x9,[x27, #0x18]
00be0d60	str x8,[x27, #0x10]
00be0d64	strb wzr,[x9, x8]
00be0d68	ldurb w8,[x29, #-0xa8]
00be0d6c	ldr x9,[x27, #0x18]
00be0d70	tst w8,#0x1
00be0d74	csel x25,x28,x9,eq
00be0d78	add x8,x25,x26
00be0d7c	str x8,[x27]
00be0d80	ldp x8,x9,[x21, #0x18]
00be0d84	cmp x8,x9
00be0d88	b.eq 0x00be0d94
00be0d8c	ldr w0,[x8]
00be0d90	b 0x00be0da4
00be0d94	ldr x8,[x21]
00be0d98	ldr x8,[x8, #0x48]
00be0d9c	mov x0,x21
00be0da0	blr x8
00be0da4	ldur w5,[x29, #-0xc]
00be0da8	sub x3,x29,#0xb0
00be0dac	add x4,sp,#0x24
00be0db0	sub x6,x29,#0x90
00be0db4	add x7,sp,#0x30
00be0db8	mov w1,w23
00be0dbc	mov x2,x25
00be0dc0	stp x22,x24,[sp]
00be0dc4	bl 0x00c44120
00be0dc8	cbnz w0,0x00be0dec
00be0dcc	ldp x8,x9,[x21, #0x18]
00be0dd0	cmp x8,x9
00be0dd4	b.ne 0x00be0c20
00be0dd8	ldr x8,[x21]
00be0ddc	ldr x8,[x8, #0x50]
00be0de0	mov x0,x21
00be0de4	blr x8
00be0de8	b 0x00be0c28
00be0dec	ldurb w8,[x29, #-0x90]
00be0df0	ldr x9,[x27, #0x28]
00be0df4	ldr x22,[sp, #0x18]
00be0df8	lsr x10,x8,#0x1
00be0dfc	tst w8,#0x1
00be0e00	csel x8,x10,x9,eq
00be0e04	cbz x8,0x00be0e28
00be0e08	ldr x8,[sp, #0x28]
00be0e0c	add x9,sp,#0x30
00be0e10	sub x9,x8,x9
00be0e14	cmp x9,#0x9f
00be0e18	b.gt 0x00be0e28
00be0e1c	ldr w9,[sp, #0x24]
00be0e20	str w9,[x8], #0x4
00be0e24	str x8,[sp, #0x28]
00be0e28	ldr x1,[x27]
00be0e2c	mov x0,x25
00be0e30	mov x2,x22
00be0e34	mov w3,w23
00be0e38	bl 0x00c0c4ac
00be0e3c	ldurb w10,[x29, #-0x90]
00be0e40	ldr x12,[sp, #0x28]
00be0e44	add x11,sp,#0x30
00be0e48	ldr x8,[x27, #0x28]
00be0e4c	lsr x9,x10,#0x1
00be0e50	ands w13,w10,#0x1
00be0e54	sub x11,x12,x11
00be0e58	csel x8,x9,x8,eq
00be0e5c	ldr x9,[sp, #0x10]
00be0e60	cmp x11,#0x5
00be0e64	str x0,[x9]
00be0e68	b.lt 0x00be0fc8
00be0e6c	cbz x8,0x00be0fc8
00be0e70	sub x8,x12,#0x4
00be0e74	add x9,sp,#0x30
00be0e78	cmp x9,x8
00be0e7c	cset w11,cc
00be0e80	cmp x9,x12
00be0e84	b.eq 0x00be0f34
00be0e88	cbz w11,0x00be0f34
00be0e8c	add x10,sp,#0x30
00be0e90	sub x14,x12,#0x8
00be0e94	add x11,x10,#0x4
00be0e98	cmp x14,x11
00be0e9c	csel x13,x14,x11,hi
00be0ea0	sub x13,x13,#0x4
00be0ea4	cmp x13,x10
00be0ea8	cinc x15,x10,ne
00be0eac	cmp x13,x10
00be0eb0	sub x15,x13,x15
00be0eb4	lsr x15,x15,#0x3
00be0eb8	cinc x13,x15,ne
00be0ebc	cmp x13,#0x13
00be0ec0	b.cc 0x00be0f08
00be0ec4	cmp x14,x11
00be0ec8	csel x14,x14,x11,hi
00be0ecc	sub x14,x14,#0x4
00be0ed0	cmp x14,x10
00be0ed4	cinc x15,x10,ne
00be0ed8	cmp x14,x10
00be0edc	sub x15,x14,x15
00be0ee0	lsr x15,x15,#0x3
00be0ee4	cinc x14,x15,ne
00be0ee8	cmp x10,x12
00be0eec	b.cs 0x00be10a8
00be0ef0	lsl x14,x14,#0x2
00be0ef4	sub x15,x12,x14
00be0ef8	add x11,x11,x14
00be0efc	sub x14,x15,#0x4
00be0f00	cmp x14,x11
00be0f04	b.cs 0x00be10a8
00be0f08	mov x11,x8
00be0f0c	add x10,x10,#0x4
00be0f10	ldr w12,[x11]
00be0f14	ldur w13,[x10, #-0x4]
00be0f18	stur w12,[x10, #-0x4]
00be0f1c	str w13,[x11], #-0x4
00be0f20	cmp x10,x11
00be0f24	add x10,x10,#0x4
00be0f28	b.cc 0x00be0f10
00be0f2c	ldurb w10,[x29, #-0x90]
00be0f30	and w13,w10,#0x1
00be0f34	ldr x11,[x27, #0x30]
00be0f38	cmp w13,#0x0
00be0f3c	sub x12,x29,#0x90
00be0f40	csinc x11,x11,x12,ne
00be0f44	cmp x9,x8
00be0f48	b.cs 0x00be0fa0
00be0f4c	lsr w9,w10,#0x1
00be0f50	ldr x10,[x27, #0x28]
00be0f54	cmp w13,#0x0
00be0f58	csel x9,x9,x10,eq
00be0f5c	add x10,sp,#0x30
00be0f60	add x9,x11,x9
00be0f64	b 0x00be0f80
00be0f68	sub x12,x9,x11
00be0f6c	add x10,x10,#0x4
00be0f70	cmp x12,#0x1
00be0f74	cinc x11,x11,gt
00be0f78	cmp x10,x8
00be0f7c	b.cs 0x00be0fa0
00be0f80	ldrb w12,[x11]
00be0f84	cbz w12,0x00be0f68
00be0f88	cmp w12,#0xff
00be0f8c	b.eq 0x00be0f68
00be0f90	ldr w13,[x10]
00be0f94	cmp w13,w12
00be0f98	b.eq 0x00be0f68
00be0f9c	b 0x00be0fc0
00be0fa0	ldrb w9,[x11]
00be0fa4	cbz w9,0x00be0fc8
00be0fa8	cmp w9,#0xff
00be0fac	b.eq 0x00be0fc8
00be0fb0	ldr w8,[x8]
00be0fb4	sub w8,w8,#0x1
00be0fb8	cmp w8,w9
00be0fbc	b.cc 0x00be0fc8
00be0fc0	mov w8,#0x4
00be0fc4	str w8,[x22]
00be0fc8	cbz x21,0x00be0fe0
00be0fcc	ldp x8,x9,[x21, #0x18]
00be0fd0	cmp x8,x9
00be0fd4	b.eq 0x00be0ff0
00be0fd8	ldr w0,[x8]
00be0fdc	b 0x00be1000
00be0fe0	mov w19,#0x1
00be0fe4	cbnz x20,0x00be1010
00be0fe8	tbnz w19,#0x0,0x00be1044
00be0fec	b 0x00be1050
00be0ff0	ldr x8,[x21]
00be0ff4	ldr x8,[x8, #0x48]
00be0ff8	mov x0,x21
00be0ffc	blr x8
00be1000	cmn w0,#0x1
00be1004	cset w19,eq
00be1008	csel x21,xzr,x21,eq
00be100c	cbz x20,0x00be0fe8
00be1010	ldp x8,x9,[x20, #0x18]
00be1014	cmp x8,x9
00be1018	b.eq 0x00be1024
00be101c	ldr w0,[x8]
00be1020	b 0x00be1034
00be1024	ldr x8,[x20]
00be1028	ldr x8,[x8, #0x48]
00be102c	mov x0,x20
00be1030	blr x8
00be1034	cmn w0,#0x1
00be1038	cset w8,eq
00be103c	eor w8,w19,w8
00be1040	tbnz w8,#0x0,0x00be1050
00be1044	ldr w8,[x22]
00be1048	orr w8,w8,#0x2
00be104c	str w8,[x22]
00be1050	ldurb w8,[x29, #-0xa8]
00be1054	tbz w8,#0x0,0x00be1068
00be1058	ldr x8,[x27, #0x8]
00be105c	ldr x0,[x27, #0x18]
00be1060	and x1,x8,#-0x2
00be1064	bl 0x00c2fe80
00be1068	ldurb w8,[x29, #-0x90]
00be106c	tbz w8,#0x0,0x00be1080
00be1070	ldr x8,[x27, #0x20]
00be1074	ldr x0,[x27, #0x30]
00be1078	and x1,x8,#-0x2
00be107c	bl 0x00c2fe80
00be1080	mov x0,x21
00be1084	ldp x20,x19,[sp, #0x1d0]
00be1088	ldp x22,x21,[sp, #0x1c0]
00be108c	ldp x24,x23,[sp, #0x1b0]
00be1090	ldp x26,x25,[sp, #0x1a0]
00be1094	ldp x28,x27,[sp, #0x190]
00be1098	ldp x29,x30,[sp, #0x180]
00be109c	add sp,sp,#0x1e0
00be10a0	autiasp
00be10a4	ret
00be10a8	add x13,x13,#0x1
00be10ac	add x15,sp,#0x30
00be10b0	sub x12,x12,#0x10
00be10b4	and x14,x13,#0x7ffffffffffffff8
00be10b8	lsl x10,x14,#0x2
00be10bc	mov x16,x14
00be10c0	sub x11,x8,x10
00be10c4	add x10,x15,x10
00be10c8	add x15,x15,#0x10
00be10cc	ldp q1,q0,[x12, #-0x10]
00be10d0	sub x16,x16,#0x8
00be10d4	ldp q2,q3,[x15, #-0x10]
00be10d8	rev64 v0.4S,v0.4S
00be10dc	rev64 v1.4S,v1.4S
00be10e0	rev64 v2.4S,v2.4S
00be10e4	rev64 v3.4S,v3.4S
00be10e8	ext v0.16B,v0.16B,v0.16B,0x8
00be10ec	ext v1.16B,v1.16B,v1.16B,0x8
00be10f0	ext v2.16B,v2.16B,v2.16B,0x8
00be10f4	ext v3.16B,v3.16B,v3.16B,0x8
00be10f8	stp q0,q1,[x15, #-0x10]
00be10fc	add x15,x15,#0x20
00be1100	stp q3,q2,[x12, #-0x10]
00be1104	sub x12,x12,#0x20
00be1108	cbnz x16,0x00be10cc
00be110c	cmp x13,x14
00be1110	b.eq 0x00be0f2c
00be1114	b 0x00be0f0c
