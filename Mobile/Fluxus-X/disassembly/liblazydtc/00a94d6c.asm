; DES_ede3_cfb_encrypt @ 00a94d6c
00a94d6c	cmp w2,#0x40
00a94d70	b.gt 0x00a9540c
00a94d74	sub sp,sp,#0xc0
00a94d78	stp x28,x27,[sp, #0x60]
00a94d7c	stp x26,x25,[sp, #0x70]
00a94d80	stp x24,x23,[sp, #0x80]
00a94d84	stp x22,x21,[sp, #0x90]
00a94d88	stp x20,x19,[sp, #0xa0]
00a94d8c	stp x29,x30,[sp, #0xb0]
00a94d90	add x29,sp,#0xb0
00a94d94	ldr w8,[x29, #0x10]
00a94d98	ldp w22,w27,[x7]
00a94d9c	add w9,w2,#0x7
00a94da0	lsr w26,w9,#0x3
00a94da4	mov x23,x3
00a94da8	mov x25,x1
00a94dac	mov x28,x0
00a94db0	cmp x26,x3
00a94db4	str w2,[sp, #0x44]
00a94db8	stp x5,x6,[sp, #0x30]
00a94dbc	str x4,[sp, #0x28]
00a94dc0	str x7,[sp, #0x8]
00a94dc4	cbz w8,0x00a950a8
00a94dc8	b.hi 0x00a950ac
00a94dcc	ldr w12,[sp, #0x44]
00a94dd0	add x9,sp,#0x48
00a94dd4	mov w10,#0x8
00a94dd8	adrp x24,0x76e000
00a94ddc	add w8,w12,#0x7
00a94de0	cmp w12,#0x0
00a94de4	csel w8,w8,w12,lt
00a94de8	and w11,w8,#0xfffffff8
00a94dec	asr w8,w8,#0x3
00a94df0	add x8,x9,w8, SXTW 
00a94df4	subs w19,w12,w11
00a94df8	sub w20,w26,#0x1
00a94dfc	add x24,x24,#0x790
00a94e00	str x8,[sp, #0x20]
00a94e04	cinc x8,x10,ne
00a94e08	sub w21,w10,w19
00a94e0c	str x8,[sp, #0x18]
00a94e10	b 0x00a94e1c
00a94e14	mov w10,w8
00a94e18	b 0x00a94ea0
00a94e1c	ldp x1,x2,[sp, #0x28]
00a94e20	ldr x3,[sp, #0x38]
00a94e24	add x0,sp,#0x58
00a94e28	stp w22,w27,[sp, #0x58]
00a94e2c	bl 0x00c39a10
00a94e30	mov w8,wzr
00a94e34	cmp w20,#0x7
00a94e38	add x9,x28,x26
00a94e3c	b.hi 0x00a94e14
00a94e40	adrp x10,0x76e000
00a94e44	add x10,x10,#0x770
00a94e48	mov x11,x10
00a94e4c	ldrsw x10,[x10, x20, LSL #0x2]
00a94e50	add x11,x10,x11
00a94e54	mov w10,w8
00a94e58	br x11
00a94e5c	ldrb w8,[x9, #-0x1]!
00a94e60	lsl w8,w8,#0x18
00a94e64	ldrb w10,[x9, #-0x1]!
00a94e68	orr w8,w8,w10, LSL #0x10
00a94e6c	ldrb w10,[x9, #-0x1]!
00a94e70	orr w8,w8,w10, LSL #0x8
00a94e74	ldrb w10,[x9, #-0x1]!
00a94e78	orr w8,w8,w10
00a94e7c	ldrb w11,[x9, #-0x1]!
00a94e80	mov w10,w8
00a94e84	lsl w8,w11,#0x18
00a94e88	ldrb w11,[x9, #-0x1]!
00a94e8c	orr w8,w8,w11, LSL #0x10
00a94e90	ldrb w11,[x9, #-0x1]!
00a94e94	orr w8,w8,w11, LSL #0x8
00a94e98	ldrb w11,[x9, #-0x1]!
00a94e9c	orr w8,w8,w11
00a94ea0	ldp w11,w12,[sp, #0x58]
00a94ea4	cmp w20,#0x7
00a94ea8	eor w8,w11,w8
00a94eac	eor w10,w12,w10
00a94eb0	add x11,x25,x26
00a94eb4	b.hi 0x00a94efc
00a94eb8	ldrsw x12,[x24, x20, LSL #0x2]
00a94ebc	add x12,x12,x24
00a94ec0	br x12
00a94ec4	lsr w12,w10,#0x18
00a94ec8	strb w12,[x11, #-0x1]!
00a94ecc	lsr w12,w10,#0x10
00a94ed0	strb w12,[x11, #-0x1]!
00a94ed4	lsr w12,w10,#0x8
00a94ed8	strb w12,[x11, #-0x1]!
00a94edc	strb w10,[x11, #-0x1]!
00a94ee0	lsr w12,w8,#0x18
00a94ee4	strb w12,[x11, #-0x1]!
00a94ee8	lsr w12,w8,#0x10
00a94eec	strb w12,[x11, #-0x1]!
00a94ef0	lsr w12,w8,#0x8
00a94ef4	strb w12,[x11, #-0x1]!
00a94ef8	strb w8,[x11, #-0x1]!
00a94efc	add x28,x9,x26
00a94f00	ldr w9,[sp, #0x44]
00a94f04	sub x23,x23,x26
00a94f08	add x25,x11,x26
00a94f0c	cmp w9,#0x20
00a94f10	b.eq 0x00a95094
00a94f14	cmp w9,#0x40
00a94f18	b.ne 0x00a94f28
00a94f1c	mov w27,w8
00a94f20	mov w8,w10
00a94f24	b 0x00a95094
00a94f28	lsr w9,w22,#0x8
00a94f2c	strb w9,[sp, #0x49]
00a94f30	lsr w9,w22,#0x10
00a94f34	lsr w11,w22,#0x18
00a94f38	ldp x2,x1,[sp, #0x18]
00a94f3c	strb w9,[sp, #0x4a]
00a94f40	lsr w9,w27,#0x8
00a94f44	strb w11,[sp, #0x4b]
00a94f48	lsr w11,w27,#0x10
00a94f4c	lsr w12,w27,#0x18
00a94f50	strb w9,[sp, #0x4d]
00a94f54	lsr w9,w8,#0x8
00a94f58	strb w11,[sp, #0x4e]
00a94f5c	lsr w11,w8,#0x10
00a94f60	strb w12,[sp, #0x4f]
00a94f64	lsr w12,w8,#0x18
00a94f68	strb w8,[sp, #0x50]
00a94f6c	lsr w8,w10,#0x8
00a94f70	strb w9,[sp, #0x51]
00a94f74	lsr w9,w10,#0x10
00a94f78	strb w11,[sp, #0x52]
00a94f7c	lsr w11,w10,#0x18
00a94f80	add x0,sp,#0x48
00a94f84	strb w22,[sp, #0x48]
00a94f88	strb w27,[sp, #0x4c]
00a94f8c	strb w12,[sp, #0x53]
00a94f90	strb w10,[sp, #0x54]
00a94f94	strb w8,[sp, #0x55]
00a94f98	strb w9,[sp, #0x56]
00a94f9c	strb w11,[sp, #0x57]
00a94fa0	bl 0x00c2ff60
00a94fa4	ldrb w27,[sp, #0x48]
00a94fa8	cbz w19,0x00a95050
00a94fac	ldrb w8,[sp, #0x49]
00a94fb0	lsl w9,w27,w19
00a94fb4	ldrb w12,[sp, #0x4c]
00a94fb8	ldrb w13,[sp, #0x4d]
00a94fbc	lsr w10,w8,w21
00a94fc0	orr w27,w10,w9
00a94fc4	ldrb w10,[sp, #0x4a]
00a94fc8	lsl w8,w8,w19
00a94fcc	ldrb w14,[sp, #0x4e]
00a94fd0	ldrb w15,[sp, #0x4f]
00a94fd4	lsr w9,w10,w21
00a94fd8	orr w9,w9,w8
00a94fdc	ldrb w8,[sp, #0x4b]
00a94fe0	lsl w10,w10,w19
00a94fe4	strb w27,[sp, #0x48]
00a94fe8	strb w9,[sp, #0x49]
00a94fec	lsr w11,w8,w21
00a94ff0	orr w11,w11,w10
00a94ff4	lsl w8,w8,w19
00a94ff8	lsr w10,w12,w21
00a94ffc	orr w10,w10,w8
00a95000	lsl w8,w12,w19
00a95004	lsr w12,w13,w21
00a95008	orr w8,w12,w8
00a9500c	lsl w12,w13,w19
00a95010	lsr w13,w14,w21
00a95014	orr w12,w13,w12
00a95018	lsl w13,w14,w19
00a9501c	lsr w14,w15,w21
00a95020	orr w13,w14,w13
00a95024	ldrb w14,[sp, #0x50]
00a95028	lsl w15,w15,w19
00a9502c	strb w11,[sp, #0x4a]
00a95030	strb w10,[sp, #0x4b]
00a95034	lsr w14,w14,w21
00a95038	orr w14,w14,w15
00a9503c	strb w8,[sp, #0x4c]
00a95040	strb w12,[sp, #0x4d]
00a95044	strb w13,[sp, #0x4e]
00a95048	strb w14,[sp, #0x4f]
00a9504c	b 0x00a9506c
00a95050	ldrb w9,[sp, #0x49]
00a95054	ldrb w11,[sp, #0x4a]
00a95058	ldrb w10,[sp, #0x4b]
00a9505c	ldrb w8,[sp, #0x4c]
00a95060	ldrb w12,[sp, #0x4d]
00a95064	ldrb w13,[sp, #0x4e]
00a95068	ldrb w14,[sp, #0x4f]
00a9506c	and w9,w9,#0xff
00a95070	and w12,w12,#0xff
00a95074	and w11,w11,#0xff
00a95078	and w13,w13,#0xff
00a9507c	bfm w27,w9,#0x18,#0x7
00a95080	bfm w8,w12,#0x18,#0x7
00a95084	bfm w27,w11,#0x10,#0x7
00a95088	bfm w8,w13,#0x10,#0x7
00a9508c	bfm w27,w10,#0x8,#0x7
00a95090	bfm w8,w14,#0x8,#0x7
00a95094	cmp x23,x26
00a95098	mov w22,w27
00a9509c	mov w27,w8
00a950a0	b.cs 0x00a94e1c
00a950a4	b 0x00a953b0
00a950a8	b.ls 0x00a950b4
00a950ac	mov w8,w27
00a950b0	b 0x00a953b0
00a950b4	ldr w12,[sp, #0x44]
00a950b8	add x9,sp,#0x48
00a950bc	mov w10,#0x8
00a950c0	sub w20,w26,#0x1
00a950c4	add w8,w12,#0x7
00a950c8	cmp w12,#0x0
00a950cc	csel w8,w8,w12,lt
00a950d0	asr w11,w8,#0x3
00a950d4	and w8,w8,#0xfffffff8
00a950d8	add x9,x9,w11, SXTW 
00a950dc	subs w8,w12,w8
00a950e0	str x9,[sp, #0x20]
00a950e4	cinc x9,x10,ne
00a950e8	str w8,[sp, #0x18]
00a950ec	sub w8,w10,w8
00a950f0	mov w24,w22
00a950f4	str x9,[sp, #0x10]
00a950f8	str w8,[sp, #0x4]
00a950fc	b 0x00a95108
00a95100	mov w21,w19
00a95104	b 0x00a9518c
00a95108	ldp x1,x2,[sp, #0x28]
00a9510c	ldr x3,[sp, #0x38]
00a95110	add x0,sp,#0x58
00a95114	stp w24,w27,[sp, #0x58]
00a95118	bl 0x00c39a10
00a9511c	mov w19,wzr
00a95120	cmp w20,#0x7
00a95124	add x28,x28,x26
00a95128	b.hi 0x00a95100
00a9512c	adrp x8,0x76e000
00a95130	add x8,x8,#0x7b0
00a95134	mov x9,x8
00a95138	ldrsw x8,[x8, x20, LSL #0x2]
00a9513c	mov w21,w19
00a95140	add x8,x8,x9
00a95144	br x8
00a95148	ldrb w8,[x28, #-0x1]!
00a9514c	lsl w19,w8,#0x18
00a95150	ldrb w8,[x28, #-0x1]!
00a95154	orr w19,w19,w8, LSL #0x10
00a95158	ldrb w8,[x28, #-0x1]!
00a9515c	orr w19,w19,w8, LSL #0x8
00a95160	ldrb w8,[x28, #-0x1]!
00a95164	orr w19,w19,w8
00a95168	ldrb w8,[x28, #-0x1]!
00a9516c	mov w21,w19
00a95170	lsl w19,w8,#0x18
00a95174	ldrb w8,[x28, #-0x1]!
00a95178	orr w19,w19,w8, LSL #0x10
00a9517c	ldrb w8,[x28, #-0x1]!
00a95180	orr w19,w19,w8, LSL #0x8
00a95184	ldrb w8,[x28, #-0x1]!
00a95188	orr w19,w19,w8
00a9518c	ldr w8,[sp, #0x44]
00a95190	cmp w8,#0x20
00a95194	b.eq 0x00a952dc
00a95198	cmp w8,#0x40
00a9519c	mov w22,w19
00a951a0	mov w8,w21
00a951a4	b.eq 0x00a9532c
00a951a8	lsr w8,w24,#0x8
00a951ac	strb w8,[sp, #0x49]
00a951b0	lsr w8,w24,#0x10
00a951b4	lsr w9,w24,#0x18
00a951b8	ldr x1,[sp, #0x20]
00a951bc	ldr x2,[sp, #0x10]
00a951c0	strb w8,[sp, #0x4a]
00a951c4	lsr w8,w27,#0x8
00a951c8	strb w9,[sp, #0x4b]
00a951cc	lsr w9,w27,#0x10
00a951d0	lsr w10,w27,#0x18
00a951d4	strb w8,[sp, #0x4d]
00a951d8	lsr w8,w19,#0x8
00a951dc	strb w9,[sp, #0x4e]
00a951e0	lsr w9,w19,#0x10
00a951e4	strb w10,[sp, #0x4f]
00a951e8	lsr w10,w19,#0x18
00a951ec	strb w8,[sp, #0x51]
00a951f0	lsr w8,w21,#0x8
00a951f4	strb w9,[sp, #0x52]
00a951f8	lsr w9,w21,#0x10
00a951fc	strb w10,[sp, #0x53]
00a95200	lsr w10,w21,#0x18
00a95204	add x0,sp,#0x48
00a95208	strb w24,[sp, #0x48]
00a9520c	strb w27,[sp, #0x4c]
00a95210	strb w19,[sp, #0x50]
00a95214	strb w21,[sp, #0x54]
00a95218	strb w8,[sp, #0x55]
00a9521c	strb w9,[sp, #0x56]
00a95220	strb w10,[sp, #0x57]
00a95224	bl 0x00c2ff60
00a95228	ldrb w22,[sp, #0x48]
00a9522c	ldr w16,[sp, #0x18]
00a95230	cbz w16,0x00a952e8
00a95234	ldrb w8,[sp, #0x49]
00a95238	ldr w17,[sp, #0x4]
00a9523c	lsl w9,w22,w16
00a95240	ldrb w12,[sp, #0x4c]
00a95244	ldrb w13,[sp, #0x4d]
00a95248	lsr w10,w8,w17
00a9524c	orr w22,w10,w9
00a95250	ldrb w10,[sp, #0x4a]
00a95254	lsl w8,w8,w16
00a95258	ldrb w14,[sp, #0x4e]
00a9525c	ldrb w15,[sp, #0x4f]
00a95260	lsr w9,w10,w17
00a95264	orr w9,w9,w8
00a95268	ldrb w8,[sp, #0x4b]
00a9526c	lsl w10,w10,w16
00a95270	strb w22,[sp, #0x48]
00a95274	strb w9,[sp, #0x49]
00a95278	lsr w11,w8,w17
00a9527c	orr w11,w11,w10
00a95280	lsl w8,w8,w16
00a95284	lsr w10,w12,w17
00a95288	orr w10,w10,w8
00a9528c	lsl w8,w12,w16
00a95290	lsr w12,w13,w17
00a95294	orr w8,w12,w8
00a95298	lsl w12,w13,w16
00a9529c	lsr w13,w14,w17
00a952a0	orr w12,w13,w12
00a952a4	lsl w13,w14,w16
00a952a8	lsr w14,w15,w17
00a952ac	orr w13,w14,w13
00a952b0	ldrb w14,[sp, #0x50]
00a952b4	lsl w15,w15,w16
00a952b8	strb w11,[sp, #0x4a]
00a952bc	strb w10,[sp, #0x4b]
00a952c0	lsr w14,w14,w17
00a952c4	orr w14,w14,w15
00a952c8	strb w8,[sp, #0x4c]
00a952cc	strb w12,[sp, #0x4d]
00a952d0	strb w13,[sp, #0x4e]
00a952d4	strb w14,[sp, #0x4f]
00a952d8	b 0x00a95304
00a952dc	mov w22,w27
00a952e0	mov w8,w19
00a952e4	b 0x00a9532c
00a952e8	ldrb w9,[sp, #0x49]
00a952ec	ldrb w11,[sp, #0x4a]
00a952f0	ldrb w10,[sp, #0x4b]
00a952f4	ldrb w8,[sp, #0x4c]
00a952f8	ldrb w12,[sp, #0x4d]
00a952fc	ldrb w13,[sp, #0x4e]
00a95300	ldrb w14,[sp, #0x4f]
00a95304	and w9,w9,#0xff
00a95308	and w12,w12,#0xff
00a9530c	and w11,w11,#0xff
00a95310	and w13,w13,#0xff
00a95314	bfm w22,w9,#0x18,#0x7
00a95318	bfm w8,w12,#0x18,#0x7
00a9531c	bfm w22,w11,#0x10,#0x7
00a95320	bfm w8,w13,#0x10,#0x7
00a95324	bfm w22,w10,#0x8,#0x7
00a95328	bfm w8,w14,#0x8,#0x7
00a9532c	sub x23,x23,x26
00a95330	add x28,x28,x26
00a95334	cmp w20,#0x7
00a95338	add x9,x25,x26
00a9533c	b.hi 0x00a9539c
00a95340	adrp x11,0x76e000
00a95344	add x11,x11,#0x7d0
00a95348	mov x13,x11
00a9534c	ldrsw x11,[x11, x20, LSL #0x2]
00a95350	ldp w10,w12,[sp, #0x58]
00a95354	add x13,x11,x13
00a95358	eor w10,w10,w19
00a9535c	eor w11,w12,w21
00a95360	br x13
00a95364	lsr w12,w11,#0x18
00a95368	strb w12,[x9, #-0x1]!
00a9536c	lsr w12,w11,#0x10
00a95370	strb w12,[x9, #-0x1]!
00a95374	lsr w12,w11,#0x8
00a95378	strb w12,[x9, #-0x1]!
00a9537c	strb w11,[x9, #-0x1]!
00a95380	lsr w11,w10,#0x18
00a95384	strb w11,[x9, #-0x1]!
00a95388	lsr w11,w10,#0x10
00a9538c	strb w11,[x9, #-0x1]!
00a95390	lsr w11,w10,#0x8
00a95394	strb w11,[x9, #-0x1]!
00a95398	strb w10,[x9, #-0x1]!
00a9539c	cmp x23,x26
00a953a0	add x25,x9,x26
00a953a4	mov w27,w8
00a953a8	mov w24,w22
00a953ac	b.cs 0x00a95108
00a953b0	ldr x11,[sp, #0x8]
00a953b4	lsr w9,w22,#0x8
00a953b8	lsr w10,w22,#0x18
00a953bc	strb w9,[x11, #0x1]
00a953c0	lsr w9,w22,#0x10
00a953c4	strb w8,[x11, #0x4]
00a953c8	strb w9,[x11, #0x2]
00a953cc	lsr w9,w8,#0x8
00a953d0	strb w10,[x11, #0x3]
00a953d4	lsr w10,w8,#0x10
00a953d8	lsr w8,w8,#0x18
00a953dc	strb w22,[x11]
00a953e0	strb w9,[x11, #0x5]
00a953e4	strb w10,[x11, #0x6]
00a953e8	strb w8,[x11, #0x7]
00a953ec	ldp x29,x30,[sp, #0xb0]
00a953f0	ldp x20,x19,[sp, #0xa0]
00a953f4	ldp x22,x21,[sp, #0x90]
00a953f8	ldp x24,x23,[sp, #0x80]
00a953fc	ldp x26,x25,[sp, #0x70]
00a95400	ldp x28,x27,[sp, #0x60]
00a95404	str xzr,[sp, #0x58]
00a95408	add sp,sp,#0xc0
00a9540c	ret
