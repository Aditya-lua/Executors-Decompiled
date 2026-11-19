; FUN_009f4a20 @ 009f4a20
009f4a20	sub sp,sp,#0xd0
009f4a24	movi v0.2D,#0x0
009f4a28	stp x26,x25,[sp, #0x80]
009f4a2c	stp x24,x23,[sp, #0x90]
009f4a30	stp x22,x21,[sp, #0xa0]
009f4a34	stp x20,x19,[sp, #0xb0]
009f4a38	stp x29,x30,[sp, #0xc0]
009f4a3c	add x29,sp,#0xc0
009f4a40	strb wzr,[sp, #0x4c]
009f4a44	stp q0,q0,[sp, #0x20]
009f4a48	cbz x0,0x009f4a84
009f4a4c	ldrb w8,[x3]
009f4a50	mov x22,x7
009f4a54	mov w24,w6
009f4a58	mov w25,w5
009f4a5c	mov w26,w4
009f4a60	mov x21,x3
009f4a64	mov x23,x2
009f4a68	mov x19,x1
009f4a6c	mov x20,x0
009f4a70	cmp w8,#0x5
009f4a74	b.ne 0x009f4aac
009f4a78	mov w8,w26
009f4a7c	mov w26,#0xffffffff
009f4a80	b 0x009f4ab0
009f4a84	bl 0x00c342a0
009f4a88	adrp x0,0x2ad000
009f4a8c	adrp x2,0x2c1000
009f4a90	add x0,x0,#0x9c8
009f4a94	add x2,x2,#0xa1d
009f4a98	mov w1,#0x2c8
009f4a9c	bl 0x00c342b0
009f4aa0	mov w0,#0xd
009f4aa4	mov w1,#0x7d
009f4aa8	b 0x009f4ce4
009f4aac	ldr w8,[x21, #0x8]
009f4ab0	cmn w8,#0x4
009f4ab4	stur w8,[x29, #-0x5c]
009f4ab8	b.ne 0x009f4b98
009f4abc	tbnz w26,#0x1f,0x009f4ae8
009f4ac0	bl 0x00c342a0
009f4ac4	adrp x0,0x2ad000
009f4ac8	adrp x2,0x2c1000
009f4acc	add x0,x0,#0x9c8
009f4ad0	add x2,x2,#0xa1d
009f4ad4	mov w1,#0x2d6
009f4ad8	bl 0x00c342b0
009f4adc	mov w0,#0xd
009f4ae0	orr w1,wzr,#0x7f
009f4ae4	b 0x009f4ce4
009f4ae8	tst w24,#0xff
009f4aec	b.eq 0x009f4b18
009f4af0	bl 0x00c342a0
009f4af4	adrp x0,0x2ad000
009f4af8	adrp x2,0x2c1000
009f4afc	add x0,x0,#0x9c8
009f4b00	add x2,x2,#0xa1d
009f4b04	mov w1,#0x2da
009f4b08	bl 0x00c342b0
009f4b0c	mov w0,#0xd
009f4b10	orr w1,wzr,#0x7e
009f4b14	b 0x009f4ce4
009f4b18	ldr x8,[x19]
009f4b1c	sub x1,x29,#0x5c
009f4b20	sub x2,x29,#0x48
009f4b24	add x5,sp,#0x40
009f4b28	mov w7,#0xffffffff
009f4b2c	mov x0,xzr
009f4b30	mov x3,xzr
009f4b34	mov x4,xzr
009f4b38	mov x6,x23
009f4b3c	str x8,[sp, #0x40]
009f4b40	str x22,[sp, #0x10]
009f4b44	strb wzr,[sp, #0x8]
009f4b48	str wzr,[sp]
009f4b4c	bl 0x009f5200
009f4b50	cbz w0,0x009f4b68
009f4b54	ldurb w8,[x29, #-0x48]
009f4b58	cbz w8,0x009f4b94
009f4b5c	orr w8,wzr,#0xfffffffd
009f4b60	stur w8,[x29, #-0x5c]
009f4b64	b 0x009f4b98
009f4b68	bl 0x00c342a0
009f4b6c	adrp x0,0x2ad000
009f4b70	adrp x2,0x2c1000
009f4b74	add x0,x0,#0x9c8
009f4b78	add x2,x2,#0xa1d
009f4b7c	mov w1,#0x2e1
009f4b80	bl 0x00c342b0
009f4b84	mov w1,#0x10a
009f4b88	mov w0,#0xd
009f4b8c	movk w1,#0x8, LSL #16
009f4b90	b 0x009f4ce4
009f4b94	ldur w8,[x29, #-0x5c]
009f4b98	ldr x9,[x19]
009f4b9c	cmn w26,#0x1
009f4ba0	csel w10,wzr,w25,eq
009f4ba4	csel w7,w8,w26,eq
009f4ba8	add x0,sp,#0x58
009f4bac	add x3,sp,#0x50
009f4bb0	add x4,sp,#0x54
009f4bb4	add x5,sp,#0x40
009f4bb8	mov x1,xzr
009f4bbc	mov x2,xzr
009f4bc0	mov x6,x23
009f4bc4	str x9,[sp, #0x40]
009f4bc8	str x22,[sp, #0x10]
009f4bcc	strb w24,[sp, #0x8]
009f4bd0	str w10,[sp]
009f4bd4	bl 0x009f5200
009f4bd8	mov w23,w0
009f4bdc	cmn w0,#0x1
009f4be0	b.eq 0x009f4cf0
009f4be4	cbnz w23,0x009f4c1c
009f4be8	bl 0x00c342a0
009f4bec	adrp x0,0x2ad000
009f4bf0	adrp x2,0x2c1000
009f4bf4	add x0,x0,#0x9c8
009f4bf8	add x2,x2,#0xa1d
009f4bfc	mov w1,#0x2f0
009f4c00	bl 0x00c342b0
009f4c04	mov w1,#0x10a
009f4c08	mov w0,#0xd
009f4c0c	movk w1,#0x8, LSL #16
009f4c10	mov x2,xzr
009f4c14	bl 0x00c342c0
009f4c18	b 0x009f4cf0
009f4c1c	ldur w8,[x29, #-0x5c]
009f4c20	sub w9,w8,#0x10
009f4c24	cmp w9,#0x2
009f4c28	b.cs 0x009f4c5c
009f4c2c	ldrb w8,[sp, #0x54]
009f4c30	cbnz w8,0x009f4c6c
009f4c34	bl 0x00c342a0
009f4c38	adrp x0,0x2ad000
009f4c3c	adrp x2,0x2c1000
009f4c40	add x0,x0,#0x9c8
009f4c44	add x2,x2,#0xa1d
009f4c48	mov w1,#0x301
009f4c4c	bl 0x00c342b0
009f4c50	mov w0,#0xd
009f4c54	mov w1,#0x9c
009f4c58	b 0x009f4ce4
009f4c5c	cmn w8,#0x3
009f4c60	b.ne 0x009f4c9c
009f4c64	cbz x22,0x009f4c6c
009f4c68	strb wzr,[x22]
009f4c6c	ldrb w8,[sp, #0x50]
009f4c70	ldr x22,[x19]
009f4c74	cbz w8,0x009f4d10
009f4c78	ldr x23,[sp, #0x58]
009f4c7c	ldr x25,[sp, #0x40]
009f4c80	sturb w8,[x29, #-0x4c]
009f4c84	cmp x23,#0x1
009f4c88	stur x25,[x29, #-0x58]
009f4c8c	b.lt 0x009f4dd0
009f4c90	mov w24,#0x1
009f4c94	mov x8,x25
009f4c98	b 0x009f4d40
009f4c9c	ldrb w9,[sp, #0x54]
009f4ca0	cbz w9,0x009f4df8
009f4ca4	cmp w8,#0xa
009f4ca8	b.hi 0x009f4f4c
009f4cac	mov w9,#0x1
009f4cb0	lsl w8,w9,w8
009f4cb4	mov w9,#0x466
009f4cb8	tst w8,w9
009f4cbc	b.eq 0x009f4f4c
009f4cc0	bl 0x00c342a0
009f4cc4	adrp x0,0x2ad000
009f4cc8	adrp x2,0x2c1000
009f4ccc	add x0,x0,#0x9c8
009f4cd0	add x2,x2,#0xa1d
009f4cd4	mov w1,#0x313
009f4cd8	bl 0x00c342b0
009f4cdc	mov w0,#0xd
009f4ce0	mov w1,#0xc3
009f4ce4	mov x2,xzr
009f4ce8	bl 0x00c342c0
009f4cec	mov w23,wzr
009f4cf0	mov w0,w23
009f4cf4	ldp x29,x30,[sp, #0xc0]
009f4cf8	ldp x20,x19,[sp, #0xb0]
009f4cfc	ldp x22,x21,[sp, #0xa0]
009f4d00	ldp x24,x23,[sp, #0x90]
009f4d04	ldp x26,x25,[sp, #0x80]
009f4d08	add sp,sp,#0xd0
009f4d0c	ret
009f4d10	ldr x8,[sp, #0x40]
009f4d14	ldr x9,[sp, #0x58]
009f4d18	sub x10,x8,x22
009f4d1c	add x8,x8,x9
009f4d20	add x23,x10,x9
009f4d24	b 0x009f4e04
009f4d28	add x8,x8,#0x2
009f4d2c	subs w24,w24,#0x1
009f4d30	stur x8,[x29, #-0x58]
009f4d34	b.eq 0x009f5180
009f4d38	sub x23,x23,#0x2
009f4d3c	b 0x009f4dc0
009f4d40	cmp x23,#0x1
009f4d44	b.eq 0x009f4d58
009f4d48	ldrb w9,[x8]
009f4d4c	cbnz w9,0x009f4d58
009f4d50	ldrb w9,[x8, #0x1]
009f4d54	cbz w9,0x009f4d28
009f4d58	sub x0,x29,#0x48
009f4d5c	sub x3,x29,#0x4c
009f4d60	sub x5,x29,#0x58
009f4d64	mov w7,#0xffffffff
009f4d68	mov x1,xzr
009f4d6c	mov x2,xzr
009f4d70	mov x4,xzr
009f4d74	mov x6,x23
009f4d78	str xzr,[sp, #0x10]
009f4d7c	strb wzr,[sp, #0x8]
009f4d80	str wzr,[sp]
009f4d84	bl 0x009f5200
009f4d88	cbz w0,0x009f4ef0
009f4d8c	ldurb w8,[x29, #-0x4c]
009f4d90	cbz w8,0x009f4da8
009f4d94	cmn w24,#0x1
009f4d98	b.eq 0x009f4f0c
009f4d9c	ldur x8,[x29, #-0x58]
009f4da0	add w24,w24,#0x1
009f4da4	b 0x009f4db8
009f4da8	ldur x8,[x29, #-0x48]
009f4dac	ldur x9,[x29, #-0x58]
009f4db0	add x8,x9,x8
009f4db4	stur x8,[x29, #-0x58]
009f4db8	add x9,x23,x25
009f4dbc	sub x23,x9,x8
009f4dc0	mov x25,x8
009f4dc4	cmp x23,#0x0
009f4dc8	b.gt 0x009f4d40
009f4dcc	cbz w24,0x009f5184
009f4dd0	bl 0x00c342a0
009f4dd4	adrp x0,0x2ad000
009f4dd8	adrp x2,0x2b7000
009f4ddc	add x0,x0,#0x9c8
009f4de0	add x2,x2,#0x8e5
009f4de4	mov w1,#0x3f9
009f4de8	bl 0x00c342b0
009f4dec	mov w0,#0xd
009f4df0	mov w1,#0x89
009f4df4	b 0x009f4f34
009f4df8	ldr x22,[sp, #0x40]
009f4dfc	ldr x23,[sp, #0x58]
009f4e00	add x8,x22,x23
009f4e04	str x8,[sp, #0x40]
009f4e08	stur x22,[x29, #-0x48]
009f4e0c	ldr x8,[x21, #0x20]
009f4e10	ldur w24,[x29, #-0x5c]
009f4e14	cbz x8,0x009f4e44
009f4e18	ldr x8,[x8, #0x28]
009f4e1c	cbz x8,0x009f4e44
009f4e20	add x4,sp,#0x4c
009f4e24	mov x0,x20
009f4e28	mov x1,x22
009f4e2c	mov w2,w23
009f4e30	mov w3,w24
009f4e34	mov x5,x21
009f4e38	blr x8
009f4e3c	cbnz w0,0x009f5154
009f4e40	b 0x009f4f3c
009f4e44	ldr x8,[x21, #0x8]
009f4e48	cmn x8,#0x4
009f4e4c	b.ne 0x009f4e94
009f4e50	ldr x21,[x20]
009f4e54	cbnz x21,0x009f4e68
009f4e58	bl 0x00c37a40
009f4e5c	cbz x0,0x009f5050
009f4e60	mov x21,x0
009f4e64	str x0,[x20]
009f4e68	ldr w8,[x21]
009f4e6c	cmp w8,w24
009f4e70	b.eq 0x009f4e84
009f4e74	mov x0,x21
009f4e78	mov w1,w24
009f4e7c	mov x2,xzr
009f4e80	bl 0x00c37a60
009f4e84	add x8,x21,#0x8
009f4e88	mov x26,x20
009f4e8c	mov x20,x8
009f4e90	b 0x009f4e9c
009f4e94	mov x21,xzr
009f4e98	mov x26,xzr
009f4e9c	sub w8,w24,#0x1
009f4ea0	cmp w8,#0x1d
009f4ea4	b.hi 0x009f5038
009f4ea8	adrp x9,0x74e000
009f4eac	add x9,x9,#0x44
009f4eb0	ldrsw x8,[x9, x8, LSL #0x2]
009f4eb4	add x8,x8,x9
009f4eb8	br x8
009f4ebc	sxtw x2,w23
009f4ec0	sub x1,x29,#0x48
009f4ec4	mov x0,x20
009f4ec8	bl 0x00c37600
009f4ecc	cbz x0,0x009f51ec
009f4ed0	ldr x8,[x20]
009f4ed4	ldr w9,[x8, #0x4]
009f4ed8	and w9,w9,#0x100
009f4edc	orr w9,w9,w24
009f4ee0	str w9,[x8, #0x4]
009f4ee4	cmp w24,#0x5
009f4ee8	b.eq 0x009f514c
009f4eec	b 0x009f5154
009f4ef0	bl 0x00c342a0
009f4ef4	adrp x0,0x2ad000
009f4ef8	adrp x2,0x2b7000
009f4efc	add x0,x0,#0x9c8
009f4f00	add x2,x2,#0x8e5
009f4f04	mov w1,#0x3ea
009f4f08	b 0x009f4f24
009f4f0c	bl 0x00c342a0
009f4f10	adrp x0,0x2ad000
009f4f14	adrp x2,0x2b7000
009f4f18	add x0,x0,#0x9c8
009f4f1c	add x2,x2,#0x8e5
009f4f20	mov w1,#0x3ef
009f4f24	bl 0x00c342b0
009f4f28	mov w1,#0x10a
009f4f2c	mov w0,#0xd
009f4f30	movk w1,#0x8, LSL #16
009f4f34	mov x2,xzr
009f4f38	bl 0x00c342c0
009f4f3c	mov w23,wzr
009f4f40	ldrb w8,[sp, #0x4c]
009f4f44	cbnz w8,0x009f5168
009f4f48	b 0x009f4cf0
009f4f4c	ldr x2,[sp, #0x58]
009f4f50	ldrb w3,[sp, #0x50]
009f4f54	mov w8,#0x1
009f4f58	add x0,sp,#0x20
009f4f5c	add x1,sp,#0x40
009f4f60	mov w4,wzr
009f4f64	strb w8,[sp, #0x4c]
009f4f68	bl 0x009f5874
009f4f6c	cbz w0,0x009f4f3c
009f4f70	ldr x23,[sp, #0x20]
009f4f74	add x0,sp,#0x20
009f4f78	add x1,x23,#0x1
009f4f7c	bl 0x00c37010
009f4f80	cbz x0,0x009f5190
009f4f84	ldr x8,[sp, #0x28]
009f4f88	strb wzr,[x8, x23]
009f4f8c	ldr x22,[sp, #0x28]
009f4f90	b 0x009f4e08
009f4f94	cmp w23,#0x1
009f4f98	b.ne 0x009f50ec
009f4f9c	ldrb w8,[x22]
009f4fa0	str w8,[x20]
009f4fa4	b 0x009f5154
009f4fa8	sxtw x2,w23
009f4fac	sub x1,x29,#0x48
009f4fb0	mov x0,x20
009f4fb4	bl 0x00c373e0
009f4fb8	cbnz x0,0x009f5154
009f4fbc	b 0x009f51ec
009f4fc0	cbz w23,0x009f513c
009f4fc4	bl 0x00c342a0
009f4fc8	adrp x0,0x2ad000
009f4fcc	adrp x2,0x2a9000
009f4fd0	add x0,x0,#0x9c8
009f4fd4	add x2,x2,#0xf83
009f4fd8	mov w1,#0x363
009f4fdc	bl 0x00c342b0
009f4fe0	mov w0,#0xd
009f4fe4	mov w1,#0x90
009f4fe8	b 0x009f51e4
009f4fec	sxtw x2,w23
009f4ff0	sub x1,x29,#0x48
009f4ff4	mov x0,x20
009f4ff8	bl 0x00c37760
009f4ffc	cbnz x0,0x009f5154
009f5000	b 0x009f51ec
009f5004	tst w23,#0x3
009f5008	b.eq 0x009f5038
009f500c	bl 0x00c342a0
009f5010	adrp x0,0x2ad000
009f5014	adrp x2,0x2a9000
009f5018	add x0,x0,#0x9c8
009f501c	add x2,x2,#0xf83
009f5020	mov w1,#0x399
009f5024	bl 0x00c342b0
009f5028	mov w0,#0xd
009f502c	mov w1,#0xd7
009f5030	b 0x009f51e4
009f5034	tbnz w23,#0x0,0x009f5114
009f5038	ldr x25,[x20]
009f503c	cbz x25,0x009f5058
009f5040	str w24,[x25, #0x4]
009f5044	ldrb w8,[sp, #0x4c]
009f5048	cbnz w8,0x009f5074
009f504c	b 0x009f5098
009f5050	bl 0x00c37cc0
009f5054	b 0x009f4f3c
009f5058	mov w0,w24
009f505c	bl 0x00c378b0
009f5060	cbz x0,0x009f51bc
009f5064	mov x25,x0
009f5068	str x0,[x20]
009f506c	ldrb w8,[sp, #0x4c]
009f5070	cbz w8,0x009f5098
009f5074	ldr x0,[x25, #0x8]
009f5078	adrp x1,0x2ad000
009f507c	add x1,x1,#0x9c8
009f5080	mov w2,#0x3aa
009f5084	bl 0x00c32310
009f5088	str x22,[x25, #0x8]
009f508c	str w23,[x25]
009f5090	strb wzr,[sp, #0x4c]
009f5094	b 0x009f5154
009f5098	mov x0,x25
009f509c	mov x1,x22
009f50a0	mov w2,w23
009f50a4	bl 0x00c378a0
009f50a8	cbnz w0,0x009f5154
009f50ac	bl 0x00c342a0
009f50b0	adrp x0,0x2ad000
009f50b4	adrp x2,0x2a9000
009f50b8	add x0,x0,#0x9c8
009f50bc	add x2,x2,#0xf83
009f50c0	mov w1,#0x3b0
009f50c4	bl 0x00c342b0
009f50c8	mov w1,#0x100
009f50cc	mov w0,#0xd
009f50d0	movk w1,#0xc, LSL #16
009f50d4	mov x2,xzr
009f50d8	bl 0x00c342c0
009f50dc	mov x0,x25
009f50e0	bl 0x00c37890
009f50e4	str xzr,[x20]
009f50e8	b 0x009f51ec
009f50ec	bl 0x00c342a0
009f50f0	adrp x0,0x2ad000
009f50f4	adrp x2,0x2a9000
009f50f8	add x0,x0,#0x9c8
009f50fc	add x2,x2,#0xf83
009f5100	mov w1,#0x36b
009f5104	bl 0x00c342b0
009f5108	mov w0,#0xd
009f510c	mov w1,#0x6a
009f5110	b 0x009f51e4
009f5114	bl 0x00c342a0
009f5118	adrp x0,0x2ad000
009f511c	adrp x2,0x2a9000
009f5120	add x0,x0,#0x9c8
009f5124	add x2,x2,#0xf83
009f5128	mov w1,#0x395
009f512c	bl 0x00c342b0
009f5130	mov w0,#0xd
009f5134	mov w1,#0xd6
009f5138	b 0x009f51e4
009f513c	mov w8,#0x1
009f5140	str x8,[x20]
009f5144	cmp w24,#0x5
009f5148	b.ne 0x009f5154
009f514c	cbz x21,0x009f5154
009f5150	str xzr,[x21, #0x8]
009f5154	ldr x8,[sp, #0x40]
009f5158	mov w23,#0x1
009f515c	str x8,[x19]
009f5160	ldrb w8,[sp, #0x4c]
009f5164	cbz w8,0x009f4cf0
009f5168	ldr x0,[sp, #0x28]
009f516c	adrp x1,0x2ad000
009f5170	add x1,x1,#0x9c8
009f5174	mov w2,#0x339
009f5178	bl 0x00c32310
009f517c	b 0x009f4cf0
009f5180	mov x25,x8
009f5184	str x25,[sp, #0x40]
009f5188	sub x23,x25,x22
009f518c	b 0x009f4e08
009f5190	bl 0x00c342a0
009f5194	adrp x0,0x2ad000
009f5198	adrp x2,0x2c1000
009f519c	add x0,x0,#0x9c8
009f51a0	add x2,x2,#0xa1d
009f51a4	mov w1,#0x325
009f51a8	bl 0x00c342b0
009f51ac	mov w1,#0x100
009f51b0	mov w0,#0xd
009f51b4	movk w1,#0xc, LSL #16
009f51b8	b 0x009f4f34
009f51bc	bl 0x00c342a0
009f51c0	adrp x0,0x2ad000
009f51c4	adrp x2,0x2a9000
009f51c8	add x0,x0,#0x9c8
009f51cc	add x2,x2,#0xf83
009f51d0	mov w1,#0x3a0
009f51d4	bl 0x00c342b0
009f51d8	mov w1,#0x100
009f51dc	mov w0,#0xd
009f51e0	movk w1,#0xc, LSL #16
009f51e4	mov x2,xzr
009f51e8	bl 0x00c342c0
009f51ec	mov x0,x21
009f51f0	bl 0x00c37cc0
009f51f4	cbz x26,0x009f4f3c
009f51f8	str xzr,[x26]
009f51fc	b 0x009f4f3c
