; ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex @ 00ad4e94
00ad4e94	sub sp,sp,#0xc0
00ad4e98	stp x29,x30,[sp, #0xb0]
00ad4e9c	add x29,sp,#0xb0
00ad4ea0	stp x20,x19,[sp, #0xa0]
00ad4ea4	ldr x19,[x29, #0x10]
00ad4ea8	stp x28,x27,[sp, #0x60]
00ad4eac	stp x26,x25,[sp, #0x70]
00ad4eb0	stp x24,x23,[sp, #0x80]
00ad4eb4	stp x22,x21,[sp, #0x90]
00ad4eb8	mov x28,x7
00ad4ebc	mov w23,w6
00ad4ec0	mov x24,x5
00ad4ec4	mov w26,w4
00ad4ec8	mov x25,x3
00ad4ecc	mov w27,w2
00ad4ed0	mov x22,x1
00ad4ed4	mov x20,x0
00ad4ed8	cbnz x7,0x00ad4ee4
00ad4edc	bl 0x00c324d0
00ad4ee0	mov x28,x0
00ad4ee4	cmp x19,#0x0
00ad4ee8	mov x0,x28
00ad4eec	csel x19,x28,x19,eq
00ad4ef0	bl 0x00c34c20
00ad4ef4	mov w21,w0
00ad4ef8	cmp w0,#0x0
00ad4efc	b.le 0x00ad5158
00ad4f00	stp x19,x22,[sp, #0x10]
00ad4f04	sub w19,w27,#0x1
00ad4f08	lsl w22,w21,#0x1
00ad4f0c	sub w8,w19,w22
00ad4f10	cmp w8,w26
00ad4f14	b.le 0x00ad5180
00ad4f18	orr w8,w22,#0x1
00ad4f1c	cmp w8,w27
00ad4f20	b.ge 0x00ad51a8
00ad4f24	ldr x8,[sp, #0x18]
00ad4f28	sxtw x27,w21
00ad4f2c	sxtw x1,w23
00ad4f30	mov x0,x24
00ad4f34	mov x9,x8
00ad4f38	add x8,x8,x27
00ad4f3c	add x8,x8,#0x1
00ad4f40	strb wzr,[x9], #0x1
00ad4f44	mov x2,x8
00ad4f48	mov x3,xzr
00ad4f4c	mov x4,x28
00ad4f50	mov x5,xzr
00ad4f54	str x9,[sp, #0x8]
00ad4f58	mov x24,x8
00ad4f5c	bl 0x00c370c0
00ad4f60	cbz w0,0x00ad51fc
00ad4f64	sub w8,w19,w26
00ad4f68	sub w23,w8,#0x1
00ad4f6c	sub w8,w23,w22
00ad4f70	add x0,x24,x27
00ad4f74	sxtw x2,w8
00ad4f78	mov w1,wzr
00ad4f7c	bl 0x00c301c0
00ad4f80	sub w8,w23,w21
00ad4f84	mov w9,#0x1
00ad4f88	add x10,x24,w19, SXTW 
00ad4f8c	strb w9,[x24, w8, SXTW ]
00ad4f90	sub x8,x10,w26, SXTW 
00ad4f94	sub x0,x8,x27
00ad4f98	mov w2,w26
00ad4f9c	mov x1,x25
00ad4fa0	bl 0x00c2ffd0
00ad4fa4	ldr x26,[sp, #0x8]
00ad4fa8	mov x0,x20
00ad4fac	mov x2,x27
00ad4fb0	mov w3,wzr
00ad4fb4	mov x1,x26
00ad4fb8	bl 0x00c347b0
00ad4fbc	cmp w0,#0x1
00ad4fc0	b.lt 0x00ad51fc
00ad4fc4	sub w23,w19,w21
00ad4fc8	sxtw x25,w23
00ad4fcc	adrp x1,0x2c0000
00ad4fd0	add x1,x1,#0x4f9
00ad4fd4	mov w2,#0x72
00ad4fd8	mov x0,x25
00ad4fdc	bl 0x00c32320
00ad4fe0	mov x20,x0
00ad4fe4	cbz x0,0x00ad520c
00ad4fe8	ldr x4,[sp, #0x10]
00ad4fec	mov x0,x20
00ad4ff0	mov x1,x25
00ad4ff4	mov x2,x26
00ad4ff8	mov x3,x27
00ad4ffc	bl 0x00ad5268
00ad5000	tbnz w0,#0x1f,0x00ad523c
00ad5004	ldr x19,[sp, #0x18]
00ad5008	cmp w23,#0x1
00ad500c	b.lt 0x00ad50b0
00ad5010	mov x9,xzr
00ad5014	cmp w23,#0x20
00ad5018	mov w8,w23
00ad501c	b.cc 0x00ad5084
00ad5020	add x9,x20,x8
00ad5024	cmp x24,x9
00ad5028	b.cs 0x00ad5044
00ad502c	add x9,x27,x8
00ad5030	add x9,x19,x9
00ad5034	add x9,x9,#0x1
00ad5038	cmp x20,x9
00ad503c	mov x9,xzr
00ad5040	b.cc 0x00ad5084
00ad5044	and x9,x8,#0xffffffe0
00ad5048	add x11,x19,x27
00ad504c	add x10,x20,#0x10
00ad5050	add x11,x11,#0x11
00ad5054	mov x12,x9
00ad5058	ldp q0,q1,[x10, #-0x10]
00ad505c	ldp q2,q3,[x11, #-0x10]
00ad5060	add x10,x10,#0x20
00ad5064	subs x12,x12,#0x20
00ad5068	eor v0.16B,v2.16B,v0.16B
00ad506c	eor v1.16B,v3.16B,v1.16B
00ad5070	stp q0,q1,[x11, #-0x10]
00ad5074	add x11,x11,#0x20
00ad5078	b.ne 0x00ad5058
00ad507c	cmp x9,x8
00ad5080	b.eq 0x00ad50b0
00ad5084	add x11,x9,x27
00ad5088	add x11,x19,x11
00ad508c	add x10,x20,x9
00ad5090	add x11,x11,#0x1
00ad5094	sub x8,x8,x9
00ad5098	ldrb w9,[x10], #0x1
00ad509c	ldrb w12,[x11]
00ad50a0	subs x8,x8,#0x1
00ad50a4	eor w9,w12,w9
00ad50a8	strb w9,[x11], #0x1
00ad50ac	b.ne 0x00ad5098
00ad50b0	ldr x4,[sp, #0x10]
00ad50b4	add x0,sp,#0x20
00ad50b8	mov x1,x27
00ad50bc	mov x2,x24
00ad50c0	mov x3,x25
00ad50c4	bl 0x00ad5268
00ad50c8	tbnz w0,#0x1f,0x00ad523c
00ad50cc	cmp w21,#0x1
00ad50d0	b.lt 0x00ad5150
00ad50d4	mov x8,xzr
00ad50d8	cmp w21,#0x20
00ad50dc	mov w9,w21
00ad50e0	b.cc 0x00ad5124
00ad50e4	and x8,x9,#0xffffffe0
00ad50e8	add x10,sp,#0x20
00ad50ec	add x10,x10,#0x10
00ad50f0	add x11,x19,#0x11
00ad50f4	mov x12,x8
00ad50f8	ldp q0,q1,[x10, #-0x10]
00ad50fc	ldp q2,q3,[x11, #-0x10]
00ad5100	add x10,x10,#0x20
00ad5104	subs x12,x12,#0x20
00ad5108	eor v0.16B,v2.16B,v0.16B
00ad510c	eor v1.16B,v3.16B,v1.16B
00ad5110	stp q0,q1,[x11, #-0x10]
00ad5114	add x11,x11,#0x20
00ad5118	b.ne 0x00ad50f8
00ad511c	cmp x8,x9
00ad5120	b.eq 0x00ad5150
00ad5124	add x10,x19,x8
00ad5128	add x11,sp,#0x20
00ad512c	add x10,x10,#0x1
00ad5130	add x11,x11,x8
00ad5134	sub x8,x9,x8
00ad5138	ldrb w9,[x11], #0x1
00ad513c	ldrb w12,[x10]
00ad5140	subs x8,x8,#0x1
00ad5144	eor w9,w12,w9
00ad5148	strb w9,[x10], #0x1
00ad514c	b.ne 0x00ad5138
00ad5150	mov w19,#0x1
00ad5154	b 0x00ad5240
00ad5158	bl 0x00c342a0
00ad515c	adrp x0,0x2c0000
00ad5160	adrp x2,0x2b4000
00ad5164	add x0,x0,#0x4f9
00ad5168	add x2,x2,#0x920
00ad516c	mov w1,#0x51
00ad5170	bl 0x00c342b0
00ad5174	mov w0,#0x4
00ad5178	mov w1,#0xb5
00ad517c	b 0x00ad51cc
00ad5180	bl 0x00c342a0
00ad5184	adrp x0,0x2c0000
00ad5188	adrp x2,0x2b4000
00ad518c	add x0,x0,#0x4f9
00ad5190	add x2,x2,#0x920
00ad5194	mov w1,#0x57
00ad5198	bl 0x00c342b0
00ad519c	mov w0,#0x4
00ad51a0	mov w1,#0x6e
00ad51a4	b 0x00ad51cc
00ad51a8	bl 0x00c342a0
00ad51ac	adrp x0,0x2c0000
00ad51b0	adrp x2,0x2b4000
00ad51b4	add x0,x0,#0x4f9
00ad51b8	add x2,x2,#0x920
00ad51bc	mov w1,#0x5c
00ad51c0	bl 0x00c342b0
00ad51c4	mov w0,#0x4
00ad51c8	orr w1,wzr,#0x78
00ad51cc	mov x2,xzr
00ad51d0	bl 0x00c342c0
00ad51d4	mov w19,wzr
00ad51d8	mov w0,w19
00ad51dc	ldp x29,x30,[sp, #0xb0]
00ad51e0	ldp x20,x19,[sp, #0xa0]
00ad51e4	ldp x22,x21,[sp, #0x90]
00ad51e8	ldp x24,x23,[sp, #0x80]
00ad51ec	ldp x26,x25,[sp, #0x70]
00ad51f0	ldp x28,x27,[sp, #0x60]
00ad51f4	add sp,sp,#0xc0
00ad51f8	ret
00ad51fc	mov w19,wzr
00ad5200	mov x20,xzr
00ad5204	mov w23,wzr
00ad5208	b 0x00ad5240
00ad520c	bl 0x00c342a0
00ad5210	adrp x0,0x2c0000
00ad5214	adrp x2,0x2b4000
00ad5218	add x0,x0,#0x4f9
00ad521c	add x2,x2,#0x920
00ad5220	mov w1,#0x74
00ad5224	bl 0x00c342b0
00ad5228	mov w1,#0x100
00ad522c	mov w0,#0x4
00ad5230	movk w1,#0xc, LSL #16
00ad5234	mov x2,xzr
00ad5238	bl 0x00c342c0
00ad523c	mov w19,wzr
00ad5240	add x0,sp,#0x20
00ad5244	mov w1,#0x40
00ad5248	bl 0x00c34750
00ad524c	adrp x2,0x2c0000
00ad5250	sxtw x1,w23
00ad5254	add x2,x2,#0x4f9
00ad5258	mov w3,#0x89
00ad525c	mov x0,x20
00ad5260	bl 0x00c345e0
00ad5264	b 0x00ad51d8
