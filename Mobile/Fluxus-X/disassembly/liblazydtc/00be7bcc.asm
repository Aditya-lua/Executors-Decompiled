; std::__ndk1::__num_put<wchar_t>::__widen_and_group_int @ 00be7bcc
00be7bcc	paciasp
00be7bd0	sub sp,sp,#0xb0
00be7bd4	stp x29,x30,[sp, #0x50]
00be7bd8	stp x28,x27,[sp, #0x60]
00be7bdc	stp x26,x25,[sp, #0x70]
00be7be0	stp x24,x23,[sp, #0x80]
00be7be4	stp x22,x21,[sp, #0x90]
00be7be8	stp x20,x19,[sp, #0xa0]
00be7bec	add x29,sp,#0x50
00be7bf0	adrp x22,0xcb5000
00be7bf4	mov x26,x6
00be7bf8	mov x20,x5
00be7bfc	ldr x22,[x22, #0xb98]
00be7c00	ldr x19,[x6]
00be7c04	mov x23,x4
00be7c08	mov x28,x3
00be7c0c	mov x21,x2
00be7c10	mov x27,x1
00be7c14	stur x22,[x29, #-0x10]
00be7c18	mov x24,x0
00be7c1c	ldar x8,[x22]
00be7c20	cmn x8,#0x1
00be7c24	b.eq 0x00be7c50
00be7c28	sub x8,x29,#0x10
00be7c2c	add x9,sp,#0x28
00be7c30	adrp x0,0xcb5000
00be7c34	str x8,[sp, #0x28]
00be7c38	nop
00be7c3c	adr x2,0xc0bab0
00be7c40	stur x9,[x29, #-0x8]
00be7c44	sub x1,x29,#0x8
00be7c48	ldr x0,[x0, #0xb98]
00be7c4c	bl 0x00c305d0
00be7c50	ldp x8,x10,[x19, #0x10]
00be7c54	ldrsw x9,[x22, #0x8]
00be7c58	sub x9,x9,#0x1
00be7c5c	sub x10,x10,x8
00be7c60	cmp x9,x10, ASR #0x3
00be7c64	b.cs 0x00be81f0
00be7c68	ldr x25,[x8, x9, LSL #0x3]
00be7c6c	cbz x25,0x00be81f0
00be7c70	adrp x22,0xcb5000
00be7c74	ldr x22,[x22, #0xc10]
00be7c78	ldr x19,[x26]
00be7c7c	stur x22,[x29, #-0x10]
00be7c80	ldar x8,[x22]
00be7c84	cmn x8,#0x1
00be7c88	b.eq 0x00be7cb4
00be7c8c	sub x8,x29,#0x10
00be7c90	add x9,sp,#0x28
00be7c94	adrp x0,0xcb5000
00be7c98	str x8,[sp, #0x28]
00be7c9c	nop
00be7ca0	adr x2,0xc0bab0
00be7ca4	stur x9,[x29, #-0x8]
00be7ca8	sub x1,x29,#0x8
00be7cac	ldr x0,[x0, #0xc10]
00be7cb0	bl 0x00c305d0
00be7cb4	ldp x8,x10,[x19, #0x10]
00be7cb8	ldrsw x9,[x22, #0x8]
00be7cbc	sub x9,x9,#0x1
00be7cc0	sub x10,x10,x8
00be7cc4	cmp x9,x10, ASR #0x3
00be7cc8	b.cs 0x00be81f0
00be7ccc	ldr x26,[x8, x9, LSL #0x3]
00be7cd0	cbz x26,0x00be81f0
00be7cd4	ldr x8,[x26]
00be7cd8	mov x0,x26
00be7cdc	ldr x9,[x8, #0x28]
00be7ce0	add x8,sp,#0x28
00be7ce4	blr x9
00be7ce8	ldrb w8,[sp, #0x28]
00be7cec	ldr x9,[sp, #0x30]
00be7cf0	lsr x10,x8,#0x1
00be7cf4	tst w8,#0x1
00be7cf8	csel x8,x10,x9,eq
00be7cfc	cbz x8,0x00be7e10
00be7d00	str x28,[x20]
00be7d04	ldrb w1,[x24]
00be7d08	str x28,[sp, #0x20]
00be7d0c	cmp w1,#0x2d
00be7d10	b.eq 0x00be7d20
00be7d14	cmp w1,#0x2b
00be7d18	mov x28,x24
00be7d1c	b.ne 0x00be7d40
00be7d20	ldr x8,[x25]
00be7d24	ldr x8,[x8, #0x58]
00be7d28	mov x0,x25
00be7d2c	blr x8
00be7d30	ldr x8,[x20]
00be7d34	add x28,x24,#0x1
00be7d38	str w0,[x8], #0x4
00be7d3c	str x8,[x20]
00be7d40	sub x8,x21,x28
00be7d44	cmp x8,#0x2
00be7d48	b.lt 0x00be7dbc
00be7d4c	ldrb w8,[x28]
00be7d50	cmp w8,#0x30
00be7d54	b.ne 0x00be7dbc
00be7d58	ldrb w8,[x28, #0x1]
00be7d5c	orr w8,w8,#0x20
00be7d60	cmp w8,#0x78
00be7d64	b.ne 0x00be7dbc
00be7d68	ldr x8,[x25]
00be7d6c	ldr x8,[x8, #0x58]
00be7d70	mov x0,x25
00be7d74	mov w1,#0x30
00be7d78	blr x8
00be7d7c	ldr x8,[x20]
00be7d80	str w0,[x8], #0x4
00be7d84	str x8,[x20]
00be7d88	ldr x8,[x25]
00be7d8c	ldrb w1,[x28, #0x1]
00be7d90	ldr x8,[x8, #0x58]
00be7d94	mov x0,x25
00be7d98	blr x8
00be7d9c	ldr x8,[x20]
00be7da0	add x19,x28,#0x2
00be7da4	mov x28,x19
00be7da8	str w0,[x8], #0x4
00be7dac	str x8,[x20]
00be7db0	cmp x28,x21
00be7db4	b.ne 0x00be7dc8
00be7db8	b 0x00be7f58
00be7dbc	mov x19,x28
00be7dc0	cmp x28,x21
00be7dc4	b.eq 0x00be7f58
00be7dc8	sub x8,x21,#0x1
00be7dcc	cmp x28,x8
00be7dd0	b.cs 0x00be7f58
00be7dd4	sub x11,x21,#0x2
00be7dd8	add x10,x28,#0x1
00be7ddc	mvn x12,x28
00be7de0	cmp x11,x10
00be7de4	csinc x9,x11,x28,hi
00be7de8	adds x9,x9,x12
00be7dec	cset w13,ne
00be7df0	sub x9,x9,x13
00be7df4	lsr x9,x9,#0x1
00be7df8	cinc x9,x9,ne
00be7dfc	add x9,x9,#0x1
00be7e00	cmp x9,#0x8
00be7e04	b.cs 0x00be7e3c
00be7e08	mov x11,x28
00be7e0c	b 0x00be7f38
00be7e10	ldr x8,[x25]
00be7e14	ldr x8,[x8, #0x60]
00be7e18	mov x0,x25
00be7e1c	mov x1,x24
00be7e20	mov x2,x21
00be7e24	mov x3,x28
00be7e28	blr x8
00be7e2c	sub x8,x21,x24
00be7e30	add x8,x28,x8, LSL #0x2
00be7e34	str x8,[x20]
00be7e38	b 0x00be819c
00be7e3c	cmp x11,x10
00be7e40	csinc x11,x11,x28,hi
00be7e44	adds x11,x11,x12
00be7e48	cset w12,ne
00be7e4c	sub x11,x11,x12
00be7e50	lsr x11,x11,#0x1
00be7e54	cinc x11,x11,ne
00be7e58	cmp x28,x21
00be7e5c	b.cs 0x00be7e78
00be7e60	mvn x12,x11
00be7e64	add x10,x10,x11
00be7e68	add x11,x21,x12
00be7e6c	cmp x11,x10
00be7e70	mov x11,x28
00be7e74	b.cc 0x00be7f38
00be7e78	cmp x9,#0x20
00be7e7c	b.cs 0x00be7e88
00be7e80	mov x10,xzr
00be7e84	b 0x00be7ee8
00be7e88	and x10,x9,#-0x20
00be7e8c	add x11,x28,#0x10
00be7e90	sub x12,x21,#0x10
00be7e94	mov x13,x10
00be7e98	ldp q1,q0,[x12, #-0x10]
00be7e9c	sub x13,x13,#0x20
00be7ea0	ldp q2,q3,[x11, #-0x10]
00be7ea4	rev64 v0.16B,v0.16B
00be7ea8	rev64 v1.16B,v1.16B
00be7eac	rev64 v2.16B,v2.16B
00be7eb0	rev64 v3.16B,v3.16B
00be7eb4	ext v0.16B,v0.16B,v0.16B,0x8
00be7eb8	ext v1.16B,v1.16B,v1.16B,0x8
00be7ebc	ext v2.16B,v2.16B,v2.16B,0x8
00be7ec0	ext v3.16B,v3.16B,v3.16B,0x8
00be7ec4	stp q0,q1,[x11, #-0x10]
00be7ec8	add x11,x11,#0x20
00be7ecc	stp q3,q2,[x12, #-0x10]
00be7ed0	sub x12,x12,#0x20
00be7ed4	cbnz x13,0x00be7e98
00be7ed8	cmp x9,x10
00be7edc	b.eq 0x00be7f58
00be7ee0	tst x9,#0x18
00be7ee4	b.eq 0x00be7f30
00be7ee8	and x12,x9,#-0x8
00be7eec	sub x14,x21,x10
00be7ef0	add x13,x28,x10
00be7ef4	sub x8,x8,x12
00be7ef8	add x11,x28,x12
00be7efc	sub x10,x10,x12
00be7f00	sub x14,x14,#0x8
00be7f04	ldr d0,[x14]
00be7f08	ldr d1,[x13]
00be7f0c	adds x10,x10,#0x8
00be7f10	rev64 v0.8B,v0.8B
00be7f14	rev64 v1.8B,v1.8B
00be7f18	str d0,[x13], #0x8
00be7f1c	str d1,[x14], #-0x8
00be7f20	b.ne 0x00be7f04
00be7f24	cmp x9,x12
00be7f28	b.ne 0x00be7f38
00be7f2c	b 0x00be7f58
00be7f30	sub x8,x8,x10
00be7f34	add x11,x28,x10
00be7f38	add x9,x11,#0x1
00be7f3c	ldrb w10,[x8]
00be7f40	ldurb w11,[x9, #-0x1]
00be7f44	sturb w10,[x9, #-0x1]
00be7f48	strb w11,[x8], #-0x1
00be7f4c	cmp x9,x8
00be7f50	add x9,x9,#0x1
00be7f54	b.cc 0x00be7f3c
00be7f58	ldr x8,[x26]
00be7f5c	ldr x8,[x8, #0x20]
00be7f60	mov x0,x26
00be7f64	blr x8
00be7f68	cmp x28,x21
00be7f6c	b.cs 0x00be803c
00be7f70	mov x9,x19
00be7f74	add x8,sp,#0x28
00be7f78	mov w26,w0
00be7f7c	stp x27,x23,[sp, #0x10]
00be7f80	mov w19,wzr
00be7f84	mov w22,wzr
00be7f88	orr x27,x8,#0x1
00be7f8c	sub x23,x21,x9
00be7f90	str x9,[sp, #0x8]
00be7f94	ldrb w8,[sp, #0x28]
00be7f98	ldr x9,[sp, #0x38]
00be7f9c	tst w8,#0x1
00be7fa0	mov w8,w19
00be7fa4	csel x10,x27,x9,eq
00be7fa8	ldrb w10,[x10, x8]
00be7fac	cbz w10,0x00be7ff8
00be7fb0	ldrb w10,[sp, #0x28]
00be7fb4	tst w10,#0x1
00be7fb8	csel x9,x27,x9,eq
00be7fbc	ldrb w9,[x9, x8]
00be7fc0	cmp w22,w9
00be7fc4	b.ne 0x00be7ff8
00be7fc8	ldr x9,[x20]
00be7fcc	mov w22,wzr
00be7fd0	str w26,[x9], #0x4
00be7fd4	ldrb w10,[sp, #0x28]
00be7fd8	ldr x11,[sp, #0x30]
00be7fdc	str x9,[x20]
00be7fe0	lsr x12,x10,#0x1
00be7fe4	tst w10,#0x1
00be7fe8	csel x10,x12,x11,eq
00be7fec	sub x10,x10,#0x1
00be7ff0	cmp x10,x8
00be7ff4	cinc w19,w19,hi
00be7ff8	ldr x8,[x25]
00be7ffc	ldrb w1,[x28]
00be8000	ldr x8,[x8, #0x58]
00be8004	mov x0,x25
00be8008	blr x8
00be800c	ldr x8,[x20]
00be8010	subs x23,x23,#0x1
00be8014	add w22,w22,#0x1
00be8018	add x28,x28,#0x1
00be801c	mov x9,x8
00be8020	str w0,[x9], #0x4
00be8024	str x9,[x20]
00be8028	b.ne 0x00be7f94
00be802c	ldp x27,x23,[sp, #0x10]
00be8030	add x10,x8,#0x4
00be8034	ldr x19,[sp, #0x8]
00be8038	b 0x00be8040
00be803c	ldr x10,[x20]
00be8040	ldr x28,[sp, #0x20]
00be8044	sub x8,x19,x24
00be8048	add x9,x28,x8, LSL #0x2
00be804c	cmp x9,x10
00be8050	b.eq 0x00be819c
00be8054	sub x8,x10,#0x4
00be8058	cmp x9,x8
00be805c	b.cs 0x00be819c
00be8060	lsl x11,x19,#0x2
00be8064	lsl x12,x24,#0x2
00be8068	sub x15,x10,#0x8
00be806c	add x13,x11,x28
00be8070	sub x13,x13,x12
00be8074	add x14,x13,#0x4
00be8078	cmp x14,x15
00be807c	csel x13,x14,x15,hi
00be8080	add x13,x13,x12
00be8084	sub x13,x13,x28
00be8088	sub x13,x13,#0x4
00be808c	cmp x13,x11
00be8090	cset w16,ne
00be8094	cmp x13,x11
00be8098	bfm x16,x19,#0x3e,#0x3d
00be809c	sub x16,x13,x16
00be80a0	lsr x16,x16,#0x3
00be80a4	cinc x13,x16,ne
00be80a8	cmp x13,#0x1f
00be80ac	b.cc 0x00be817c
00be80b0	cmp x14,x15
00be80b4	csel x14,x14,x15,hi
00be80b8	add x14,x14,x12
00be80bc	sub x14,x14,x28
00be80c0	sub x14,x14,#0x4
00be80c4	cmp x14,x11
00be80c8	cset w15,ne
00be80cc	cmp x14,x11
00be80d0	bfm x15,x19,#0x3e,#0x3d
00be80d4	sub x15,x14,x15
00be80d8	lsr x15,x15,#0x3
00be80dc	cinc x14,x15,ne
00be80e0	cmp x9,x10
00be80e4	b.cs 0x00be810c
00be80e8	lsl x14,x14,#0x2
00be80ec	add x15,x11,x14
00be80f0	sub x14,x10,x14
00be80f4	sub x15,x15,x12
00be80f8	sub x14,x14,#0x4
00be80fc	add x15,x15,x28
00be8100	add x15,x15,#0x4
00be8104	cmp x14,x15
00be8108	b.cc 0x00be817c
00be810c	add x13,x13,#0x1
00be8110	sub x11,x11,x12
00be8114	sub x10,x10,#0x10
00be8118	and x14,x13,#0x7ffffffffffffff8
00be811c	add x11,x11,x28
00be8120	lsl x15,x14,#0x2
00be8124	add x11,x11,#0x10
00be8128	mov x12,x14
00be812c	sub x8,x8,x15
00be8130	add x9,x9,x15
00be8134	ldp q1,q0,[x10, #-0x10]
00be8138	sub x12,x12,#0x8
00be813c	ldp q2,q3,[x11, #-0x10]
00be8140	rev64 v0.4S,v0.4S
00be8144	rev64 v1.4S,v1.4S
00be8148	rev64 v2.4S,v2.4S
00be814c	rev64 v3.4S,v3.4S
00be8150	ext v0.16B,v0.16B,v0.16B,0x8
00be8154	ext v1.16B,v1.16B,v1.16B,0x8
00be8158	ext v2.16B,v2.16B,v2.16B,0x8
00be815c	ext v3.16B,v3.16B,v3.16B,0x8
00be8160	stp q0,q1,[x11, #-0x10]
00be8164	add x11,x11,#0x20
00be8168	stp q3,q2,[x10, #-0x10]
00be816c	sub x10,x10,#0x20
00be8170	cbnz x12,0x00be8134
00be8174	cmp x13,x14
00be8178	b.eq 0x00be819c
00be817c	add x9,x9,#0x4
00be8180	ldr w10,[x8]
00be8184	ldur w11,[x9, #-0x4]
00be8188	stur w10,[x9, #-0x4]
00be818c	str w11,[x8], #-0x4
00be8190	cmp x9,x8
00be8194	add x9,x9,#0x4
00be8198	b.cc 0x00be8180
00be819c	sub x8,x27,x24
00be81a0	ldr x9,[x20]
00be81a4	cmp x27,x21
00be81a8	add x8,x28,x8, LSL #0x2
00be81ac	ldrb w10,[sp, #0x28]
00be81b0	csel x8,x9,x8,eq
00be81b4	str x8,[x23]
00be81b8	tbz w10,#0x0,0x00be81cc
00be81bc	ldr x8,[sp, #0x28]
00be81c0	ldr x0,[sp, #0x38]
00be81c4	and x1,x8,#-0x2
00be81c8	bl 0x00c2fe80
00be81cc	ldp x20,x19,[sp, #0xa0]
00be81d0	ldp x22,x21,[sp, #0x90]
00be81d4	ldp x24,x23,[sp, #0x80]
00be81d8	ldp x26,x25,[sp, #0x70]
00be81dc	ldp x28,x27,[sp, #0x60]
00be81e0	ldp x29,x30,[sp, #0x50]
00be81e4	add sp,sp,#0xb0
00be81e8	autiasp
00be81ec	ret
00be81f0	bl 0x00bd8968
