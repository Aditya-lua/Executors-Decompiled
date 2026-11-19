; std::__ndk1::__num_put<char>::__widen_and_group_int @ 00be6de8
00be6de8	paciasp
00be6dec	sub sp,sp,#0xb0
00be6df0	stp x29,x30,[sp, #0x50]
00be6df4	stp x28,x27,[sp, #0x60]
00be6df8	stp x26,x25,[sp, #0x70]
00be6dfc	stp x24,x23,[sp, #0x80]
00be6e00	stp x22,x21,[sp, #0x90]
00be6e04	stp x20,x19,[sp, #0xa0]
00be6e08	add x29,sp,#0x50
00be6e0c	adrp x22,0xcb4000
00be6e10	mov x26,x6
00be6e14	mov x23,x5
00be6e18	ldr x22,[x22, #0x998]
00be6e1c	ldr x19,[x6]
00be6e20	mov x24,x4
00be6e24	mov x27,x3
00be6e28	mov x20,x2
00be6e2c	mov x21,x1
00be6e30	stur x22,[x29, #-0x10]
00be6e34	mov x28,x0
00be6e38	ldar x8,[x22]
00be6e3c	cmn x8,#0x1
00be6e40	b.eq 0x00be6e6c
00be6e44	sub x8,x29,#0x10
00be6e48	add x9,sp,#0x28
00be6e4c	adrp x0,0xcb4000
00be6e50	str x8,[sp, #0x28]
00be6e54	nop
00be6e58	adr x2,0xc0bab0
00be6e5c	stur x9,[x29, #-0x8]
00be6e60	sub x1,x29,#0x8
00be6e64	ldr x0,[x0, #0x998]
00be6e68	bl 0x00c305d0
00be6e6c	ldp x8,x10,[x19, #0x10]
00be6e70	ldrsw x9,[x22, #0x8]
00be6e74	sub x9,x9,#0x1
00be6e78	sub x10,x10,x8
00be6e7c	cmp x9,x10, ASR #0x3
00be6e80	b.cs 0x00be7460
00be6e84	ldr x25,[x8, x9, LSL #0x3]
00be6e88	cbz x25,0x00be7460
00be6e8c	adrp x22,0xcb5000
00be6e90	ldr x22,[x22, #0xc00]
00be6e94	ldr x19,[x26]
00be6e98	stur x22,[x29, #-0x10]
00be6e9c	ldar x8,[x22]
00be6ea0	cmn x8,#0x1
00be6ea4	b.eq 0x00be6ed0
00be6ea8	sub x8,x29,#0x10
00be6eac	add x9,sp,#0x28
00be6eb0	adrp x0,0xcb5000
00be6eb4	str x8,[sp, #0x28]
00be6eb8	nop
00be6ebc	adr x2,0xc0bab0
00be6ec0	stur x9,[x29, #-0x8]
00be6ec4	sub x1,x29,#0x8
00be6ec8	ldr x0,[x0, #0xc00]
00be6ecc	bl 0x00c305d0
00be6ed0	ldp x8,x10,[x19, #0x10]
00be6ed4	ldrsw x9,[x22, #0x8]
00be6ed8	sub x9,x9,#0x1
00be6edc	sub x10,x10,x8
00be6ee0	cmp x9,x10, ASR #0x3
00be6ee4	b.cs 0x00be7460
00be6ee8	ldr x26,[x8, x9, LSL #0x3]
00be6eec	cbz x26,0x00be7460
00be6ef0	ldr x8,[x26]
00be6ef4	mov x0,x26
00be6ef8	ldr x9,[x8, #0x28]
00be6efc	add x8,sp,#0x28
00be6f00	blr x9
00be6f04	ldrb w8,[sp, #0x28]
00be6f08	ldr x9,[sp, #0x30]
00be6f0c	lsr x10,x8,#0x1
00be6f10	tst w8,#0x1
00be6f14	csel x8,x10,x9,eq
00be6f18	cbz x8,0x00be702c
00be6f1c	str x27,[x23]
00be6f20	ldrb w1,[x28]
00be6f24	str x28,[sp, #0x20]
00be6f28	cmp w1,#0x2d
00be6f2c	b.eq 0x00be6f3c
00be6f30	ldr x28,[sp, #0x20]
00be6f34	cmp w1,#0x2b
00be6f38	b.ne 0x00be6f64
00be6f3c	ldr x8,[x25]
00be6f40	ldr x8,[x8, #0x38]
00be6f44	mov x0,x25
00be6f48	blr x8
00be6f4c	ldr x8,[x23]
00be6f50	add x9,x8,#0x1
00be6f54	str x9,[x23]
00be6f58	ldr x9,[sp, #0x20]
00be6f5c	strb w0,[x8]
00be6f60	add x28,x9,#0x1
00be6f64	sub x8,x20,x28
00be6f68	cmp x8,#0x2
00be6f6c	b.lt 0x00be6fd8
00be6f70	ldrb w8,[x28]
00be6f74	cmp w8,#0x30
00be6f78	b.ne 0x00be6fd8
00be6f7c	ldrb w8,[x28, #0x1]
00be6f80	orr w8,w8,#0x20
00be6f84	cmp w8,#0x78
00be6f88	b.ne 0x00be6fd8
00be6f8c	ldr x8,[x25]
00be6f90	ldr x8,[x8, #0x38]
00be6f94	mov x0,x25
00be6f98	mov w1,#0x30
00be6f9c	blr x8
00be6fa0	ldr x8,[x23]
00be6fa4	add x9,x8,#0x1
00be6fa8	str x9,[x23]
00be6fac	strb w0,[x8]
00be6fb0	ldr x8,[x25]
00be6fb4	ldrb w1,[x28, #0x1]
00be6fb8	ldr x8,[x8, #0x38]
00be6fbc	mov x0,x25
00be6fc0	blr x8
00be6fc4	ldr x8,[x23]
00be6fc8	add x28,x28,#0x2
00be6fcc	add x9,x8,#0x1
00be6fd0	str x9,[x23]
00be6fd4	strb w0,[x8]
00be6fd8	cmp x28,x20
00be6fdc	stp x27,x28,[sp, #0x10]
00be6fe0	b.eq 0x00be7174
00be6fe4	sub x8,x20,#0x1
00be6fe8	cmp x28,x8
00be6fec	b.cs 0x00be7174
00be6ff0	sub x11,x20,#0x2
00be6ff4	add x10,x28,#0x1
00be6ff8	mvn x12,x28
00be6ffc	cmp x11,x10
00be7000	csinc x9,x11,x28,hi
00be7004	adds x9,x9,x12
00be7008	cset w13,ne
00be700c	sub x9,x9,x13
00be7010	lsr x9,x9,#0x1
00be7014	cinc x9,x9,ne
00be7018	add x9,x9,#0x1
00be701c	cmp x9,#0x8
00be7020	b.cs 0x00be7058
00be7024	mov x11,x28
00be7028	b 0x00be7154
00be702c	ldr x8,[x25]
00be7030	ldr x8,[x8, #0x40]
00be7034	mov x0,x25
00be7038	mov x1,x28
00be703c	mov x2,x20
00be7040	mov x3,x27
00be7044	blr x8
00be7048	sub x8,x20,x28
00be704c	add x10,x27,x8
00be7050	str x10,[x23]
00be7054	b 0x00be7410
00be7058	cmp x11,x10
00be705c	csinc x11,x11,x28,hi
00be7060	adds x11,x11,x12
00be7064	cset w12,ne
00be7068	sub x11,x11,x12
00be706c	lsr x11,x11,#0x1
00be7070	cinc x11,x11,ne
00be7074	cmp x28,x20
00be7078	b.cs 0x00be7094
00be707c	mvn x12,x11
00be7080	add x10,x10,x11
00be7084	add x11,x20,x12
00be7088	cmp x11,x10
00be708c	mov x11,x28
00be7090	b.cc 0x00be7154
00be7094	cmp x9,#0x20
00be7098	b.cs 0x00be70a4
00be709c	mov x10,xzr
00be70a0	b 0x00be7104
00be70a4	and x10,x9,#-0x20
00be70a8	add x11,x28,#0x10
00be70ac	sub x12,x20,#0x10
00be70b0	mov x13,x10
00be70b4	ldp q1,q0,[x12, #-0x10]
00be70b8	sub x13,x13,#0x20
00be70bc	ldp q2,q3,[x11, #-0x10]
00be70c0	rev64 v0.16B,v0.16B
00be70c4	rev64 v1.16B,v1.16B
00be70c8	rev64 v2.16B,v2.16B
00be70cc	rev64 v3.16B,v3.16B
00be70d0	ext v0.16B,v0.16B,v0.16B,0x8
00be70d4	ext v1.16B,v1.16B,v1.16B,0x8
00be70d8	ext v2.16B,v2.16B,v2.16B,0x8
00be70dc	ext v3.16B,v3.16B,v3.16B,0x8
00be70e0	stp q0,q1,[x11, #-0x10]
00be70e4	add x11,x11,#0x20
00be70e8	stp q3,q2,[x12, #-0x10]
00be70ec	sub x12,x12,#0x20
00be70f0	cbnz x13,0x00be70b4
00be70f4	cmp x9,x10
00be70f8	b.eq 0x00be7174
00be70fc	tst x9,#0x18
00be7100	b.eq 0x00be714c
00be7104	and x12,x9,#-0x8
00be7108	sub x14,x20,x10
00be710c	add x13,x28,x10
00be7110	sub x8,x8,x12
00be7114	add x11,x28,x12
00be7118	sub x10,x10,x12
00be711c	sub x14,x14,#0x8
00be7120	ldr d0,[x14]
00be7124	ldr d1,[x13]
00be7128	adds x10,x10,#0x8
00be712c	rev64 v0.8B,v0.8B
00be7130	rev64 v1.8B,v1.8B
00be7134	str d0,[x13], #0x8
00be7138	str d1,[x14], #-0x8
00be713c	b.ne 0x00be7120
00be7140	cmp x9,x12
00be7144	b.ne 0x00be7154
00be7148	b 0x00be7174
00be714c	sub x8,x8,x10
00be7150	add x11,x28,x10
00be7154	add x9,x11,#0x1
00be7158	ldrb w10,[x8]
00be715c	ldurb w11,[x9, #-0x1]
00be7160	sturb w10,[x9, #-0x1]
00be7164	strb w11,[x8], #-0x1
00be7168	cmp x9,x8
00be716c	add x9,x9,#0x1
00be7170	b.cc 0x00be7158
00be7174	ldr x8,[x26]
00be7178	str x21,[sp, #0x8]
00be717c	mov x21,x24
00be7180	ldr x8,[x8, #0x20]
00be7184	mov x0,x26
00be7188	blr x8
00be718c	cmp x28,x20
00be7190	b.cs 0x00be724c
00be7194	add x8,sp,#0x28
00be7198	mov w26,w0
00be719c	mov w19,wzr
00be71a0	orr x27,x8,#0x1
00be71a4	ldr x8,[sp, #0x18]
00be71a8	mov w22,wzr
00be71ac	sub x24,x20,x8
00be71b0	ldrb w8,[sp, #0x28]
00be71b4	ldr x9,[sp, #0x38]
00be71b8	tst w8,#0x1
00be71bc	mov w8,w19
00be71c0	csel x10,x27,x9,eq
00be71c4	ldrb w10,[x10, x8]
00be71c8	cbz w10,0x00be7218
00be71cc	ldrb w10,[sp, #0x28]
00be71d0	tst w10,#0x1
00be71d4	csel x9,x27,x9,eq
00be71d8	ldrb w9,[x9, x8]
00be71dc	cmp w22,w9
00be71e0	b.ne 0x00be7218
00be71e4	ldr x9,[x23]
00be71e8	mov w22,wzr
00be71ec	add x10,x9,#0x1
00be71f0	str x10,[x23]
00be71f4	strb w26,[x9]
00be71f8	ldrb w9,[sp, #0x28]
00be71fc	ldr x10,[sp, #0x30]
00be7200	lsr x11,x9,#0x1
00be7204	tst w9,#0x1
00be7208	csel x9,x11,x10,eq
00be720c	sub x9,x9,#0x1
00be7210	cmp x9,x8
00be7214	cinc w19,w19,hi
00be7218	ldr x8,[x25]
00be721c	ldrb w1,[x28]
00be7220	ldr x8,[x8, #0x38]
00be7224	mov x0,x25
00be7228	blr x8
00be722c	ldr x8,[x23]
00be7230	subs x24,x24,#0x1
00be7234	add w22,w22,#0x1
00be7238	add x28,x28,#0x1
00be723c	add x9,x8,#0x1
00be7240	str x9,[x23]
00be7244	strb w0,[x8]
00be7248	b.ne 0x00be71b0
00be724c	ldp x0,x28,[sp, #0x18]
00be7250	ldr x27,[sp, #0x10]
00be7254	ldr x10,[x23]
00be7258	sub x13,x0,x28
00be725c	add x9,x27,x13
00be7260	cmp x9,x10
00be7264	b.eq 0x00be7324
00be7268	sub x8,x10,#0x1
00be726c	mov x24,x21
00be7270	ldr x21,[sp, #0x8]
00be7274	cmp x9,x8
00be7278	b.cs 0x00be7410
00be727c	add x11,x0,x27
00be7280	sub x15,x10,#0x2
00be7284	sub x12,x11,x28
00be7288	mvn x11,x0
00be728c	add x14,x12,#0x1
00be7290	add x16,x28,x11
00be7294	cmp x14,x15
00be7298	csinc x17,x15,x12,ls
00be729c	add x11,x17,x16
00be72a0	cmp x11,x27
00be72a4	cinc x17,x27,ne
00be72a8	cmp x11,x27
00be72ac	sub x17,x11,x17
00be72b0	lsr x17,x17,#0x1
00be72b4	cinc x11,x17,ne
00be72b8	add x11,x11,#0x1
00be72bc	cmp x11,#0x8
00be72c0	b.cc 0x00be73ec
00be72c4	cmp x14,x15
00be72c8	csinc x12,x15,x12,ls
00be72cc	add x12,x12,x16
00be72d0	cmp x12,x27
00be72d4	cinc x14,x27,ne
00be72d8	cmp x12,x27
00be72dc	sub x12,x12,x14
00be72e0	cinc x15,x0,ne
00be72e4	lsr x14,x12,#0x1
00be72e8	cinc x12,x14,ne
00be72ec	cmp x9,x10
00be72f0	b.cs 0x00be7314
00be72f4	add x14,x15,x14
00be72f8	mvn x12,x12
00be72fc	sub x14,x14,x28
00be7300	add x12,x10,x12
00be7304	add x14,x14,x27
00be7308	add x14,x14,#0x1
00be730c	cmp x12,x14
00be7310	b.cc 0x00be73ec
00be7314	cmp x11,#0x20
00be7318	b.cs 0x00be7330
00be731c	mov x12,xzr
00be7320	b 0x00be7394
00be7324	mov x24,x21
00be7328	ldr x21,[sp, #0x8]
00be732c	b 0x00be7410
00be7330	and x12,x11,#-0x20
00be7334	add x14,x13,x27
00be7338	sub x13,x10,#0x10
00be733c	add x14,x14,#0x10
00be7340	mov x15,x12
00be7344	ldp q1,q0,[x13, #-0x10]
00be7348	subs x15,x15,#0x20
00be734c	ldp q2,q3,[x14, #-0x10]
00be7350	rev64 v0.16B,v0.16B
00be7354	rev64 v1.16B,v1.16B
00be7358	rev64 v2.16B,v2.16B
00be735c	rev64 v3.16B,v3.16B
00be7360	ext v0.16B,v0.16B,v0.16B,0x8
00be7364	ext v1.16B,v1.16B,v1.16B,0x8
00be7368	ext v2.16B,v2.16B,v2.16B,0x8
00be736c	ext v3.16B,v3.16B,v3.16B,0x8
00be7370	stp q0,q1,[x14, #-0x10]
00be7374	add x14,x14,#0x20
00be7378	stp q3,q2,[x13, #-0x10]
00be737c	sub x13,x13,#0x20
00be7380	b.ne 0x00be7344
00be7384	cmp x11,x12
00be7388	b.eq 0x00be740c
00be738c	tst x11,#0x18
00be7390	b.eq 0x00be73e4
00be7394	add x14,x0,x12
00be7398	and x13,x11,#-0x8
00be739c	sub x15,x10,x12
00be73a0	sub x14,x14,x28
00be73a4	sub x8,x8,x13
00be73a8	add x9,x9,x13
00be73ac	add x10,x27,x14
00be73b0	sub x12,x12,x13
00be73b4	sub x14,x15,#0x8
00be73b8	ldr d0,[x14]
00be73bc	ldr d1,[x10]
00be73c0	adds x12,x12,#0x8
00be73c4	rev64 v0.8B,v0.8B
00be73c8	rev64 v1.8B,v1.8B
00be73cc	str d0,[x10], #0x8
00be73d0	str d1,[x14], #-0x8
00be73d4	b.ne 0x00be73b8
00be73d8	cmp x11,x13
00be73dc	b.ne 0x00be73ec
00be73e0	b 0x00be740c
00be73e4	sub x8,x8,x12
00be73e8	add x9,x9,x12
00be73ec	add x9,x9,#0x1
00be73f0	ldrb w10,[x8]
00be73f4	ldurb w11,[x9, #-0x1]
00be73f8	sturb w10,[x9, #-0x1]
00be73fc	strb w11,[x8], #-0x1
00be7400	cmp x9,x8
00be7404	add x9,x9,#0x1
00be7408	b.cc 0x00be73f0
00be740c	ldr x10,[x23]
00be7410	sub x8,x21,x28
00be7414	cmp x21,x20
00be7418	ldrb w9,[sp, #0x28]
00be741c	add x8,x27,x8
00be7420	csel x8,x10,x8,eq
00be7424	str x8,[x24]
00be7428	tbz w9,#0x0,0x00be743c
00be742c	ldr x8,[sp, #0x28]
00be7430	ldr x0,[sp, #0x38]
00be7434	and x1,x8,#-0x2
00be7438	bl 0x00c2fe80
00be743c	ldp x20,x19,[sp, #0xa0]
00be7440	ldp x22,x21,[sp, #0x90]
00be7444	ldp x24,x23,[sp, #0x80]
00be7448	ldp x26,x25,[sp, #0x70]
00be744c	ldp x28,x27,[sp, #0x60]
00be7450	ldp x29,x30,[sp, #0x50]
00be7454	add sp,sp,#0xb0
00be7458	autiasp
00be745c	ret
00be7460	bl 0x00bd8968
