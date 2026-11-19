; FUN_00a44e38 @ 00a44e38
00a44e38	str x28,[sp, #-0x60]!
00a44e3c	stp x27,x26,[sp, #0x10]
00a44e40	stp x25,x24,[sp, #0x20]
00a44e44	stp x23,x22,[sp, #0x30]
00a44e48	stp x21,x20,[sp, #0x40]
00a44e4c	stp x19,x29,[sp, #0x50]
00a44e50	ldpsw x8,x12,[x1]
00a44e54	ldpsw x10,x15,[x1, #0x8]
00a44e58	ldpsw x11,x18,[x1, #0x10]
00a44e5c	ldpsw x13,x4,[x1, #0x18]
00a44e60	ldpsw x14,x6,[x1, #0x20]
00a44e64	ldpsw x20,x7,[x2]
00a44e68	lsl x16,x12,#0x1
00a44e6c	lsl x1,x15,#0x1
00a44e70	lsl x17,x6,#0x1
00a44e74	lsl x5,x18,#0x1
00a44e78	lsl x3,x4,#0x1
00a44e7c	mul x22,x20,x12
00a44e80	mul x25,x20,x10
00a44e84	mul x28,x20,x15
00a44e88	mul x23,x20,x11
00a44e8c	mul x27,x20,x18
00a44e90	mul x29,x20,x13
00a44e94	mul x26,x20,x4
00a44e98	mul x24,x20,x14
00a44e9c	mul x21,x20,x6
00a44ea0	mov w9,#0x13
00a44ea4	mul x19,x20,x8
00a44ea8	madd x20,x7,x8,x22
00a44eac	madd x22,x7,x1,x23
00a44eb0	madd x23,x7,x11,x27
00a44eb4	madd x25,x7,x16,x25
00a44eb8	madd x27,x7,x5,x29
00a44ebc	madd x28,x7,x10,x28
00a44ec0	madd x26,x7,x13,x26
00a44ec4	madd x24,x7,x3,x24
00a44ec8	madd x21,x7,x14,x21
00a44ecc	mul x7,x7,x17
00a44ed0	madd x7,x7,x9,x19
00a44ed4	ldpsw x29,x19,[x2, #0x8]
00a44ed8	nop
00a44edc	madd x22,x29,x10,x22
00a44ee0	madd x23,x29,x15,x23
00a44ee4	madd x25,x29,x8,x25
00a44ee8	madd x27,x29,x11,x27
00a44eec	madd x28,x29,x12,x28
00a44ef0	madd x26,x29,x18,x26
00a44ef4	madd x24,x29,x13,x24
00a44ef8	madd x21,x29,x4,x21
00a44efc	mul x29,x29,x9
00a44f00	madd x20,x29,x6,x20
00a44f04	madd x7,x29,x14,x7
00a44f08	mul x29,x19,x9
00a44f0c	madd x22,x19,x16,x22
00a44f10	madd x20,x29,x14,x20
00a44f14	madd x23,x19,x10,x23
00a44f18	madd x27,x19,x1,x27
00a44f1c	madd x28,x19,x8,x28
00a44f20	madd x26,x19,x11,x26
00a44f24	madd x24,x19,x5,x24
00a44f28	madd x19,x19,x13,x21
00a44f2c	madd x25,x29,x17,x25
00a44f30	madd x7,x29,x3,x7
00a44f34	ldpsw x21,x29,[x2, #0x10]
00a44f38	nop
00a44f3c	madd x22,x21,x8,x22
00a44f40	madd x23,x21,x12,x23
00a44f44	madd x27,x21,x10,x27
00a44f48	madd x26,x21,x15,x26
00a44f4c	madd x24,x21,x11,x24
00a44f50	madd x19,x21,x18,x19
00a44f54	mul x21,x21,x9
00a44f58	madd x20,x21,x4,x20
00a44f5c	madd x25,x21,x14,x25
00a44f60	madd x28,x21,x6,x28
00a44f64	madd x7,x21,x13,x7
00a44f68	mul x21,x29,x9
00a44f6c	madd x22,x21,x17,x22
00a44f70	madd x20,x21,x13,x20
00a44f74	madd x23,x29,x8,x23
00a44f78	madd x25,x21,x3,x25
00a44f7c	madd x27,x29,x16,x27
00a44f80	madd x26,x29,x10,x26
00a44f84	madd x24,x29,x1,x24
00a44f88	madd x19,x29,x11,x19
00a44f8c	madd x28,x21,x14,x28
00a44f90	madd x7,x21,x5,x7
00a44f94	ldpsw x29,x21,[x2, #0x18]
00a44f98	nop
00a44f9c	madd x27,x29,x8,x27
00a44fa0	madd x26,x29,x12,x26
00a44fa4	madd x24,x29,x10,x24
00a44fa8	madd x19,x29,x15,x19
00a44fac	mul x29,x29,x9
00a44fb0	madd x22,x29,x14,x22
00a44fb4	madd x20,x29,x18,x20
00a44fb8	madd x23,x29,x6,x23
00a44fbc	madd x25,x29,x13,x25
00a44fc0	madd x28,x29,x4,x28
00a44fc4	madd x7,x29,x11,x7
00a44fc8	ldpsw x29,x2,[x2, #0x20]
00a44fcc	nop
00a44fd0	madd x26,x21,x8,x26
00a44fd4	madd x24,x21,x16,x24
00a44fd8	madd x19,x21,x10,x19
00a44fdc	mul x21,x21,x9
00a44fe0	madd x22,x21,x3,x22
00a44fe4	madd x20,x21,x11,x20
00a44fe8	madd x23,x21,x14,x23
00a44fec	madd x25,x21,x5,x25
00a44ff0	madd x27,x21,x17,x27
00a44ff4	madd x28,x21,x13,x28
00a44ff8	madd x7,x21,x1,x7
00a44ffc	mul x21,x29,x9
00a45000	madd x15,x21,x15,x20
00a45004	madd x4,x21,x4,x23
00a45008	madd x18,x21,x18,x28
00a4500c	madd x6,x21,x6,x26
00a45010	madd x20,x21,x13,x22
00a45014	madd x22,x21,x11,x25
00a45018	madd x23,x21,x14,x27
00a4501c	madd x7,x21,x10,x7
00a45020	mul x21,x2,x9
00a45024	madd x12,x29,x12,x19
00a45028	madd x5,x21,x5,x20
00a4502c	madd x10,x21,x10,x15
00a45030	mov w15,#0x2000000
00a45034	madd x19,x29,x8,x24
00a45038	madd x13,x21,x13,x4
00a4503c	madd x8,x2,x8,x12
00a45040	madd x12,x21,x16,x7
00a45044	add x16,x5,x15
00a45048	mov w4,#0x1000000
00a4504c	madd x11,x21,x11,x18
00a45050	add x18,x12,x15
00a45054	add x13,x13,x16, ASR #0x1a
00a45058	madd x3,x21,x3,x23
00a4505c	madd x14,x21,x14,x6
00a45060	and x2,x18,#-0x4000000
00a45064	add x6,x13,x4
00a45068	sub x12,x12,x2
00a4506c	add x2,x3,x6, ASR #0x19
00a45070	add x3,x2,x15
00a45074	add x14,x14,x3, ASR #0x1a
00a45078	madd x17,x21,x17,x19
00a4507c	add x7,x14,x4
00a45080	add x17,x17,x7, ASR #0x19
00a45084	add x19,x17,x15
00a45088	add x8,x8,x19, ASR #0x1a
00a4508c	add x20,x8,x4
00a45090	madd x1,x21,x1,x22
00a45094	asr x21,x20,#0x19
00a45098	madd x9,x21,x9,x12
00a4509c	add x10,x10,x18, ASR #0x1a
00a450a0	and x12,x16,#-0x4000000
00a450a4	and w16,w6,#0xfe000000
00a450a8	sub w13,w13,w16
00a450ac	add x16,x10,x4
00a450b0	add x18,x1,x16, ASR #0x19
00a450b4	add x1,x18,x15
00a450b8	add x11,x11,x1, ASR #0x1a
00a450bc	and w1,w1,#0xfc000000
00a450c0	and w16,w16,#0xfe000000
00a450c4	sub w18,w18,w1
00a450c8	and w1,w7,#0xfe000000
00a450cc	sub x12,x5,x12
00a450d0	sub w10,w10,w16
00a450d4	and w16,w3,#0xfc000000
00a450d8	sub w14,w14,w1
00a450dc	add x1,x11,x4
00a450e0	sub w16,w2,w16
00a450e4	add x12,x12,x1, ASR #0x19
00a450e8	and w1,w1,#0xfe000000
00a450ec	sub w11,w11,w1
00a450f0	stp w16,w14,[x0, #0x18]
00a450f4	add x16,x12,x15
00a450f8	stp w18,w11,[x0, #0x8]
00a450fc	lsr x11,x16,#0x1a
00a45100	add w11,w13,w11
00a45104	and w13,w16,#0xfc000000
00a45108	sub w12,w12,w13
00a4510c	stp w12,w11,[x0, #0x10]
00a45110	add x11,x9,x15
00a45114	and w14,w19,#0xfc000000
00a45118	and w13,w20,#0xfe000000
00a4511c	lsr x12,x11,#0x1a
00a45120	and w11,w11,#0xfc000000
00a45124	sub w14,w17,w14
00a45128	sub w8,w8,w13
00a4512c	add w10,w10,w12
00a45130	sub w9,w9,w11
00a45134	stp w9,w10,[x0]
00a45138	stp w14,w8,[x0, #0x20]
00a4513c	ldp x19,x29,[sp, #0x50]
00a45140	ldp x21,x20,[sp, #0x40]
00a45144	ldp x23,x22,[sp, #0x30]
00a45148	ldp x25,x24,[sp, #0x20]
00a4514c	ldp x27,x26,[sp, #0x10]
00a45150	ldr x28,[sp], #0x60
00a45154	ret
