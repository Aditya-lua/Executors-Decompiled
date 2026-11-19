; ssl3_cbc_digest_record @ 00b63ad0
00b63ad0	stp x28,x27,[sp, #-0x60]!
00b63ad4	stp x26,x25,[sp, #0x10]
00b63ad8	stp x24,x23,[sp, #0x20]
00b63adc	stp x22,x21,[sp, #0x30]
00b63ae0	stp x20,x19,[sp, #0x40]
00b63ae4	stp x29,x30,[sp, #0x50]
00b63ae8	add x29,sp,#0x50
00b63aec	sub sp,sp,#0x360
00b63af0	lsr x8,x6,#0x14
00b63af4	mov w21,wzr
00b63af8	cbnz x8,0x00b64380
00b63afc	stp x1,x2,[sp, #0x10]
00b63b00	adrp x1,0x2d5000
00b63b04	add x1,x1,#0x3fd
00b63b08	mov x20,x6
00b63b0c	mov x19,x5
00b63b10	mov x24,x3
00b63b14	str x4,[sp, #0x90]
00b63b18	str x7,[sp, #0x30]
00b63b1c	mov x21,x0
00b63b20	bl 0x00c34610
00b63b24	str x21,[sp, #0x28]
00b63b28	cbz w0,0x00b63b6c
00b63b2c	add x0,sp,#0x278
00b63b30	bl 0x00c32010
00b63b34	cmp w0,#0x1
00b63b38	b.lt 0x00b6437c
00b63b3c	adrp x8,0xb64000
00b63b40	add x8,x8,#0x3a4
00b63b44	str x8,[sp, #0x78]
00b63b48	adrp x8,0xcb5000
00b63b4c	ldr x8,[x8, #0x6b0]
00b63b50	mov w23,wzr
00b63b54	mov w12,#0x10
00b63b58	mov w26,#0x40
00b63b5c	mov w14,#0x8
00b63b60	orr w11,wzr,#0x30
00b63b64	str x8,[sp, #0x88]
00b63b68	b 0x00b63c44
00b63b6c	adrp x1,0x2d1000
00b63b70	add x1,x1,#0x42e
00b63b74	mov x0,x21
00b63b78	bl 0x00c34610
00b63b7c	cbz w0,0x00b63bb0
00b63b80	add x0,sp,#0x278
00b63b84	bl 0x00c3d580
00b63b88	cmp w0,#0x1
00b63b8c	b.lt 0x00b6437c
00b63b90	adrp x8,0xb64000
00b63b94	add x8,x8,#0x438
00b63b98	str x8,[sp, #0x78]
00b63b9c	adrp x8,0xcb5000
00b63ba0	ldr x8,[x8, #0x7c0]
00b63ba4	mov w23,#0x1
00b63ba8	mov w12,#0x14
00b63bac	b 0x00b63c34
00b63bb0	adrp x1,0x2a0000
00b63bb4	add x1,x1,#0xbe3
00b63bb8	mov x0,x21
00b63bbc	bl 0x00c34610
00b63bc0	cbz w0,0x00b63bf4
00b63bc4	add x0,sp,#0x278
00b63bc8	bl 0x00c3d5b0
00b63bcc	cmp w0,#0x1
00b63bd0	b.lt 0x00b6437c
00b63bd4	adrp x8,0xb64000
00b63bd8	add x8,x8,#0x4f0
00b63bdc	str x8,[sp, #0x78]
00b63be0	adrp x8,0xcb5000
00b63be4	ldr x8,[x8, #0x7c8]
00b63be8	mov w23,#0x1
00b63bec	orr w12,wzr,#0x1c
00b63bf0	b 0x00b63c34
00b63bf4	adrp x1,0x2a9000
00b63bf8	add x1,x1,#0xb18
00b63bfc	mov x0,x21
00b63c00	bl 0x00c34610
00b63c04	cbz w0,0x00b642d4
00b63c08	add x0,sp,#0x278
00b63c0c	bl 0x00c3d5e0
00b63c10	cmp w0,#0x1
00b63c14	b.lt 0x00b6437c
00b63c18	adrp x8,0xb64000
00b63c1c	add x8,x8,#0x4f0
00b63c20	str x8,[sp, #0x78]
00b63c24	adrp x8,0xcb5000
00b63c28	ldr x8,[x8, #0x7c8]
00b63c2c	mov w23,#0x1
00b63c30	mov w12,#0x20
00b63c34	str x8,[sp, #0x88]
00b63c38	mov w26,#0x40
00b63c3c	mov w14,#0x8
00b63c40	mov w11,#0x28
00b63c44	ldr x21,[x29, #0x10]
00b63c48	ldrb w13,[x29, #0x18]
00b63c4c	mov w10,#0xd
00b63c50	str x11,[sp, #0x8]
00b63c54	add x9,x21,x11
00b63c58	tst w13,#0xff
00b63c5c	add x9,x9,#0xb
00b63c60	and w8,w13,#0xff
00b63c64	csel x27,x9,x10,ne
00b63c68	cbz w8,0x00b63c74
00b63c6c	mov w11,#0x2
00b63c70	b 0x00b63c88
00b63c74	orr x9,x12,#0x100
00b63c78	add x9,x26,x9
00b63c7c	sub x9,x9,#0x1
00b63c80	udiv x9,x9,x26
00b63c84	add x11,x9,#0x1
00b63c88	add x20,x27,x20
00b63c8c	sub x28,x14,#0x1
00b63c90	add x9,x28,x20
00b63c94	add x9,x9,x26
00b63c98	sub x9,x9,x12
00b63c9c	tst w13,#0xff
00b63ca0	udiv x9,x9,x26
00b63ca4	cinc x10,x11,ne
00b63ca8	str x11,[sp, #0x70]
00b63cac	sub x11,x9,x11
00b63cb0	str x14,[sp, #0x98]
00b63cb4	add x14,x27,x19
00b63cb8	cmp x9,x10
00b63cbc	mul x9,x11,x26
00b63cc0	csel x10,x11,xzr,hi
00b63cc4	csel x25,x9,xzr,hi
00b63cc8	lsl x22,x14,#0x3
00b63ccc	str w13,[sp, #0x24]
00b63cd0	str x10,[sp, #0xa0]
00b63cd4	str x14,[sp, #0x58]
00b63cd8	str x12,[sp, #0x80]
00b63cdc	cbz w8,0x00b63d24
00b63ce0	str x21,[sp]
00b63ce4	cbz w23,0x00b63da0
00b63ce8	ldr x23,[sp, #0x98]
00b63cec	add x0,sp,#0x268
00b63cf0	mov w1,wzr
00b63cf4	add x21,sp,#0x268
00b63cf8	sub x19,x23,#0x4
00b63cfc	mov x2,x19
00b63d00	bl 0x00c301c0
00b63d04	lsr x8,x22,#0x18
00b63d08	lsr x9,x22,#0x10
00b63d0c	add x10,x21,x23
00b63d10	lsr x11,x22,#0x8
00b63d14	strb w8,[x21, x19]
00b63d18	sturb w9,[x10, #-0x3]
00b63d1c	sturb w11,[x10, #-0x2]
00b63d20	b 0x00b63dd8
00b63d24	add x0,sp,#0x1e8
00b63d28	mov w1,wzr
00b63d2c	mov x2,x26
00b63d30	add x19,sp,#0x1e8
00b63d34	bl 0x00c301c0
00b63d38	ldr x1,[sp, #0x30]
00b63d3c	mov x8,x21
00b63d40	cmp x21,#0x80
00b63d44	mov w21,wzr
00b63d48	b.hi 0x00b64380
00b63d4c	add x0,sp,#0x1e8
00b63d50	mov x2,x8
00b63d54	add x22,x22,x26, LSL #0x3
00b63d58	mov x21,x8
00b63d5c	bl 0x00c2ffd0
00b63d60	add x8,x19,#0x10
00b63d64	movi v0.16B,#0x36
00b63d68	mov x9,x26
00b63d6c	ldp q1,q2,[x8, #-0x10]
00b63d70	subs x9,x9,#0x20
00b63d74	eor v1.16B,v1.16B,v0.16B
00b63d78	eor v2.16B,v2.16B,v0.16B
00b63d7c	stp q1,q2,[x8, #-0x10]
00b63d80	add x8,x8,#0x20
00b63d84	b.ne 0x00b63d6c
00b63d88	ldr x8,[sp, #0x88]
00b63d8c	add x0,sp,#0x278
00b63d90	add x1,sp,#0x1e8
00b63d94	blr x8
00b63d98	str x21,[sp]
00b63d9c	cbnz w23,0x00b63ce8
00b63da0	ldr x21,[sp, #0x98]
00b63da4	add x0,sp,#0x268
00b63da8	mov w1,wzr
00b63dac	add x19,sp,#0x268
00b63db0	mov x2,x21
00b63db4	bl 0x00c301c0
00b63db8	lsr x8,x22,#0x18
00b63dbc	add x9,x19,x21
00b63dc0	lsr x10,x22,#0x10
00b63dc4	lsr x11,x22,#0x8
00b63dc8	sub x28,x21,#0x8
00b63dcc	sturb w8,[x9, #-0x5]
00b63dd0	sturb w10,[x9, #-0x6]
00b63dd4	sturb w11,[x9, #-0x7]
00b63dd8	ldr x23,[sp, #0x88]
00b63ddc	add x8,sp,#0x268
00b63de0	strb w22,[x8, x28]
00b63de4	cbz x25,0x00b63ef4
00b63de8	ldr w8,[sp, #0x24]
00b63dec	tst w8,#0xff
00b63df0	b.eq 0x00b63e88
00b63df4	ldr x22,[sp, #0x90]
00b63df8	subs x19,x27,x26
00b63dfc	mov w21,wzr
00b63e00	b.ls 0x00b64380
00b63e04	ldr x23,[sp, #0x88]
00b63e08	add x0,sp,#0x278
00b63e0c	mov x1,x24
00b63e10	blr x23
00b63e14	add x1,x24,x26
00b63e18	add x0,sp,#0x168
00b63e1c	mov x2,x19
00b63e20	add x21,sp,#0x168
00b63e24	bl 0x00c2ffd0
00b63e28	add x0,x21,x19
00b63e2c	sub x2,x26,x19
00b63e30	mov x1,x22
00b63e34	bl 0x00c2ffd0
00b63e38	add x0,sp,#0x278
00b63e3c	add x1,sp,#0x168
00b63e40	blr x23
00b63e44	udiv x8,x25,x26
00b63e48	sub x21,x8,#0x1
00b63e4c	cmp x21,#0x2
00b63e50	b.cc 0x00b63ef4
00b63e54	ldr x9,[sp, #0x90]
00b63e58	lsl x8,x26,#0x1
00b63e5c	sub x8,x8,x27
00b63e60	mov w22,#0x1
00b63e64	add x19,x9,x8
00b63e68	add x0,sp,#0x278
00b63e6c	mov x1,x19
00b63e70	blr x23
00b63e74	add x22,x22,#0x1
00b63e78	cmp x22,x21
00b63e7c	add x19,x19,x26
00b63e80	b.cc 0x00b63e68
00b63e84	b 0x00b63ef4
00b63e88	ldur x8,[x24, #0x5]
00b63e8c	add x9,sp,#0x6e
00b63e90	ldr x1,[sp, #0x90]
00b63e94	sub x2,x26,#0xd
00b63e98	stur x8,[x9, #0xff]
00b63e9c	ldr x8,[x24]
00b63ea0	add x9,sp,#0x168
00b63ea4	add x0,x9,#0xd
00b63ea8	str x8,[sp, #0x168]
00b63eac	bl 0x00c2ffd0
00b63eb0	add x0,sp,#0x278
00b63eb4	add x1,sp,#0x168
00b63eb8	blr x23
00b63ebc	udiv x21,x25,x26
00b63ec0	cmp x21,#0x2
00b63ec4	b.cc 0x00b63ef4
00b63ec8	ldr x8,[sp, #0x90]
00b63ecc	mov w22,#0x1
00b63ed0	add x8,x8,x26
00b63ed4	sub x19,x8,#0xd
00b63ed8	add x0,sp,#0x278
00b63edc	mov x1,x19
00b63ee0	blr x23
00b63ee4	add x22,x22,#0x1
00b63ee8	cmp x22,x21
00b63eec	add x19,x19,x26
00b63ef0	b.cc 0x00b63ed8
00b63ef4	ldr x10,[sp, #0xa0]
00b63ef8	ldr x8,[sp, #0x70]
00b63efc	movi v0.2D,#0x0
00b63f00	ldr x0,[sp, #0x90]
00b63f04	adds x8,x10,x8
00b63f08	str x8,[sp, #0x70]
00b63f0c	add x8,sp,#0x59
00b63f10	stur q0,[x8, #0xff]
00b63f14	add x8,sp,#0x49
00b63f18	stur q0,[x8, #0xff]
00b63f1c	add x8,sp,#0x39
00b63f20	stur q0,[x8, #0xff]
00b63f24	add x8,sp,#0x29
00b63f28	stur q0,[x8, #0xff]
00b63f2c	b.cs 0x00b641cc
00b63f30	ldr x12,[sp, #0x58]
00b63f34	ldr x9,[sp, #0x98]
00b63f38	mov x17,x25
00b63f3c	add x21,sp,#0xa8
00b63f40	udiv x11,x12,x26
00b63f44	add x8,x12,x9
00b63f48	sub x25,x26,x9
00b63f4c	ldr x9,[sp, #0x80]
00b63f50	udiv x8,x8,x26
00b63f54	str x8,[sp, #0x58]
00b63f58	neg x8,x25
00b63f5c	and x9,x9,#0x60
00b63f60	stp x9,x11,[sp, #0x60]
00b63f64	add x9,sp,#0x128
00b63f68	str x8,[sp, #0x38]
00b63f6c	add x8,x21,#0x10
00b63f70	msub x19,x11,x26,x12
00b63f74	str x8,[sp, #0x48]
00b63f78	add x8,x9,#0x10
00b63f7c	str x8,[sp, #0x40]
00b63f80	neg x8,x19
00b63f84	asr x8,x8,#0x3f
00b63f88	add x23,x19,#0x1
00b63f8c	mvn w8,w8
00b63f90	add x28,sp,#0x268
00b63f94	str w8,[sp, #0x54]
00b63f98	ldr x8,[sp, #0x68]
00b63f9c	ldr x9,[sp, #0x58]
00b63fa0	str x10,[sp, #0xa0]
00b63fa4	subs x11,x17,x27
00b63fa8	eor x8,x10,x8
00b63fac	eor x9,x10,x9
00b63fb0	eor x10,x8,#-0x8000000000000000
00b63fb4	sub x8,x8,#0x1
00b63fb8	eor x12,x9,#-0x8000000000000000
00b63fbc	sub x9,x9,#0x1
00b63fc0	and x8,x8,x10
00b63fc4	and x9,x9,x12
00b63fc8	asr x8,x8,#0x3f
00b63fcc	asr x22,x9,#0x3f
00b63fd0	orn w9,w8,w22
00b63fd4	and w10,w22,#0xff
00b63fd8	b.cs 0x00b63fe4
00b63fdc	add x11,x24,x17
00b63fe0	b 0x00b63ff4
00b63fe4	cmp x17,x20
00b63fe8	mov w13,wzr
00b63fec	b.cs 0x00b63ff8
00b63ff0	add x11,x0,x11
00b63ff4	ldrb w13,[x11]
00b63ff8	ldr w11,[sp, #0x54]
00b63ffc	orr x12,x17,#0x1
00b64000	and w11,w11,w8
00b64004	and w11,w11,#0xff
00b64008	stur w11,[x29, #-0x5c]
00b6400c	mvn w11,w11
00b64010	ldur w14,[x29, #-0x5c]
00b64014	stur w11,[x29, #-0x5c]
00b64018	ldur w15,[x29, #-0x5c]
00b6401c	mvn w11,w10
00b64020	and w14,w14,#0x80
00b64024	and w13,w15,w13
00b64028	orr w13,w13,w14
00b6402c	and w14,w9,w13
00b64030	cbnz x25,0x00b64058
00b64034	ldr x13,[sp, #0x38]
00b64038	ldrb w13,[x28, x13]
00b6403c	stur w10,[x29, #-0x5c]
00b64040	ldur w15,[x29, #-0x5c]
00b64044	stur w11,[x29, #-0x5c]
00b64048	ldur w16,[x29, #-0x5c]
00b6404c	and w13,w15,w13
00b64050	and w14,w16,w14
00b64054	orr w14,w14,w13
00b64058	mvn w13,w8
00b6405c	strb w14,[sp, #0xa8]
00b64060	mov w14,#0x1
00b64064	str x17,[sp, #0x98]
00b64068	subs x16,x12,x27
00b6406c	b.cs 0x00b64078
00b64070	add x15,x24,x12
00b64074	b 0x00b64088
00b64078	cmp x12,x20
00b6407c	mov w15,wzr
00b64080	b.cs 0x00b6408c
00b64084	add x15,x0,x16
00b64088	ldrb w15,[x15]
00b6408c	sub x16,x14,x19
00b64090	asr x16,x16,#0x3f
00b64094	bic w16,w8,w16
00b64098	and w16,w16,#0xff
00b6409c	stur w16,[x29, #-0x5c]
00b640a0	mvn w16,w16
00b640a4	ldur w18,[x29, #-0x5c]
00b640a8	stur w16,[x29, #-0x5c]
00b640ac	ldur w16,[x29, #-0x5c]
00b640b0	sub x17,x14,x23
00b640b4	asr x17,x17,#0x3f
00b640b8	orr w17,w17,w13
00b640bc	and w18,w18,#0x80
00b640c0	and w15,w16,w15
00b640c4	and w17,w17,w9
00b640c8	orr w15,w15,w18
00b640cc	add x12,x12,#0x1
00b640d0	subs x16,x14,x25
00b640d4	and w15,w17,w15
00b640d8	b.cc 0x00b640fc
00b640dc	ldrb w16,[x28, x16]
00b640e0	stur w10,[x29, #-0x5c]
00b640e4	ldur w17,[x29, #-0x5c]
00b640e8	stur w11,[x29, #-0x5c]
00b640ec	ldur w18,[x29, #-0x5c]
00b640f0	and w16,w17,w16
00b640f4	and w15,w18,w15
00b640f8	orr w15,w15,w16
00b640fc	strb w15,[x21, x14]
00b64100	add x14,x14,#0x1
00b64104	cmp x14,x26
00b64108	b.ne 0x00b64068
00b6410c	ldr x8,[sp, #0x88]
00b64110	add x0,sp,#0x278
00b64114	add x1,sp,#0xa8
00b64118	blr x8
00b6411c	ldr x8,[sp, #0x78]
00b64120	add x0,sp,#0x278
00b64124	add x1,sp,#0xa8
00b64128	blr x8
00b6412c	ldr x11,[sp, #0x80]
00b64130	ldr x17,[sp, #0x98]
00b64134	mov x10,xzr
00b64138	cmp x11,#0x20
00b6413c	b.cc 0x00b64184
00b64140	ldr x8,[sp, #0x60]
00b64144	ldp x9,x10,[sp, #0x40]
00b64148	dup v0.16B,w22
00b6414c	ldp q1,q2,[x10, #-0x10]
00b64150	ldp q3,q4,[x9, #-0x10]
00b64154	add x10,x10,#0x20
00b64158	subs x8,x8,#0x20
00b6415c	and v1.16B,v1.16B,v0.16B
00b64160	and v2.16B,v2.16B,v0.16B
00b64164	orr v1.16B,v3.16B,v1.16B
00b64168	orr v2.16B,v4.16B,v2.16B
00b6416c	stp q1,q2,[x9, #-0x10]
00b64170	add x9,x9,#0x20
00b64174	b.ne 0x00b6414c
00b64178	ldr x10,[sp, #0x60]
00b6417c	cmp x11,x10
00b64180	b.eq 0x00b641b0
00b64184	add x9,sp,#0x128
00b64188	add x8,x21,x10
00b6418c	add x9,x9,x10
00b64190	sub x10,x11,x10
00b64194	ldrb w11,[x8], #0x1
00b64198	ldrb w12,[x9]
00b6419c	subs x10,x10,#0x1
00b641a0	and w11,w11,w22
00b641a4	orr w11,w12,w11
00b641a8	strb w11,[x9], #0x1
00b641ac	b.ne 0x00b64194
00b641b0	ldr x10,[sp, #0xa0]
00b641b4	ldr x8,[sp, #0x70]
00b641b8	ldr x0,[sp, #0x90]
00b641bc	add x17,x26,x17
00b641c0	add x10,x10,#0x1
00b641c4	cmp x10,x8
00b641c8	b.ls 0x00b63f98
00b641cc	bl 0x00c31fa0
00b641d0	mov x19,x0
00b641d4	cbz x0,0x00b642c4
00b641d8	ldr x1,[sp, #0x28]
00b641dc	mov x0,x19
00b641e0	mov x2,xzr
00b641e4	bl 0x00c31f70
00b641e8	cmp w0,#0x1
00b641ec	b.lt 0x00b642c4
00b641f0	ldr w8,[sp, #0x24]
00b641f4	tst w8,#0xff
00b641f8	b.eq 0x00b64238
00b641fc	ldr x20,[sp, #0x8]
00b64200	add x0,sp,#0x1e8
00b64204	mov w1,#0x5c
00b64208	mov x2,x20
00b6420c	bl 0x00c301c0
00b64210	ldr x1,[sp, #0x30]
00b64214	ldr x2,[sp]
00b64218	mov x0,x19
00b6421c	bl 0x00c31f80
00b64220	cmp w0,#0x1
00b64224	b.lt 0x00b642c4
00b64228	add x1,sp,#0x1e8
00b6422c	mov x0,x19
00b64230	mov x2,x20
00b64234	b 0x00b64270
00b64238	mov x8,xzr
00b6423c	add x9,sp,#0x1e8
00b64240	movi v0.16B,#0x6a
00b64244	add x10,x9,x8
00b64248	ldp q1,q2,[x10]
00b6424c	add x8,x8,#0x20
00b64250	cmp x26,x8
00b64254	eor v1.16B,v1.16B,v0.16B
00b64258	eor v2.16B,v2.16B,v0.16B
00b6425c	stp q1,q2,[x10]
00b64260	b.ne 0x00b64244
00b64264	add x1,sp,#0x1e8
00b64268	mov x0,x19
00b6426c	mov x2,x26
00b64270	bl 0x00c31f80
00b64274	cmp w0,#0x1
00b64278	b.lt 0x00b642c4
00b6427c	ldr x2,[sp, #0x80]
00b64280	add x1,sp,#0x128
00b64284	mov x0,x19
00b64288	bl 0x00c31f80
00b6428c	cmp w0,#0x1
00b64290	b.lt 0x00b642c4
00b64294	ldr x1,[sp, #0x10]
00b64298	add x2,sp,#0xa8
00b6429c	mov x0,x19
00b642a0	bl 0x00c3c150
00b642a4	ldr x9,[sp, #0x18]
00b642a8	mov w21,#0x1
00b642ac	cbz x9,0x00b642c8
00b642b0	cbz w0,0x00b642c8
00b642b4	ldr w8,[sp, #0xa8]
00b642b8	mov w21,#0x1
00b642bc	str x8,[x9]
00b642c0	b 0x00b642c8
00b642c4	mov w21,wzr
00b642c8	mov x0,x19
00b642cc	bl 0x00c31f90
00b642d0	b 0x00b64380
00b642d4	adrp x1,0x2b2000
00b642d8	add x1,x1,#0xb64
00b642dc	mov x0,x21
00b642e0	bl 0x00c34610
00b642e4	cbz w0,0x00b64318
00b642e8	add x0,sp,#0x278
00b642ec	bl 0x00c3d610
00b642f0	cmp w0,#0x1
00b642f4	b.lt 0x00b6437c
00b642f8	adrp x8,0xb64000
00b642fc	add x8,x8,#0x614
00b64300	str x8,[sp, #0x78]
00b64304	adrp x8,0xcb5000
00b64308	ldr x8,[x8, #0x7d0]
00b6430c	mov w23,#0x1
00b64310	orr w12,wzr,#0x30
00b64314	b 0x00b64358
00b64318	adrp x1,0x2b6000
00b6431c	add x1,x1,#0x439
00b64320	mov x0,x21
00b64324	bl 0x00c34610
00b64328	cbz w0,0x00b64368
00b6432c	add x0,sp,#0x278
00b64330	bl 0x00c3d640
00b64334	cmp w0,#0x1
00b64338	b.lt 0x00b6437c
00b6433c	adrp x8,0xb64000
00b64340	add x8,x8,#0x614
00b64344	str x8,[sp, #0x78]
00b64348	adrp x8,0xcb5000
00b6434c	ldr x8,[x8, #0x7d0]
00b64350	mov w23,#0x1
00b64354	mov w12,#0x40
00b64358	str x8,[sp, #0x88]
00b6435c	mov w26,#0x80
00b64360	mov w14,#0x10
00b64364	b 0x00b63c40
00b64368	ldr x8,[sp, #0x18]
00b6436c	cbz x8,0x00b6437c
00b64370	mov w21,wzr
00b64374	str xzr,[x8]
00b64378	b 0x00b64380
00b6437c	mov w21,wzr
00b64380	mov w0,w21
00b64384	add sp,sp,#0x360
00b64388	ldp x29,x30,[sp, #0x50]
00b6438c	ldp x20,x19,[sp, #0x40]
00b64390	ldp x22,x21,[sp, #0x30]
00b64394	ldp x24,x23,[sp, #0x20]
00b64398	ldp x26,x25,[sp, #0x10]
00b6439c	ldp x28,x27,[sp], #0x60
00b643a0	ret
