; RSA_generate_multi_prime_key @ 00ad7b78
00ad7b78	sub sp,sp,#0xc0
00ad7b7c	stp x28,x27,[sp, #0x60]
00ad7b80	stp x26,x25,[sp, #0x70]
00ad7b84	stp x24,x23,[sp, #0x80]
00ad7b88	stp x22,x21,[sp, #0x90]
00ad7b8c	stp x20,x19,[sp, #0xa0]
00ad7b90	stp x29,x30,[sp, #0xb0]
00ad7b94	ldr x8,[x0, #0x18]
00ad7b98	mov x25,x4
00ad7b9c	mov x27,x3
00ad7ba0	mov w19,w2
00ad7ba4	ldr x5,[x8, #0x70]
00ad7ba8	mov x21,x0
00ad7bac	mov w26,w1
00ad7bb0	add x29,sp,#0xb0
00ad7bb4	cbz x5,0x00ad7bec
00ad7bb8	mov x0,x21
00ad7bbc	mov w1,w26
00ad7bc0	mov w2,w19
00ad7bc4	mov x3,x27
00ad7bc8	mov x4,x25
00ad7bcc	ldp x29,x30,[sp, #0xb0]
00ad7bd0	ldp x20,x19,[sp, #0xa0]
00ad7bd4	ldp x22,x21,[sp, #0x90]
00ad7bd8	ldp x24,x23,[sp, #0x80]
00ad7bdc	ldp x26,x25,[sp, #0x70]
00ad7be0	ldp x28,x27,[sp, #0x60]
00ad7be4	add sp,sp,#0xc0
00ad7be8	br x5
00ad7bec	ldr x4,[x8, #0x68]
00ad7bf0	cbz x4,0x00ad7c30
00ad7bf4	cmp w19,#0x2
00ad7bf8	mov w19,wzr
00ad7bfc	b.ne 0x00ad7d20
00ad7c00	mov x0,x21
00ad7c04	mov w1,w26
00ad7c08	mov x2,x27
00ad7c0c	mov x3,x25
00ad7c10	ldp x29,x30,[sp, #0xb0]
00ad7c14	ldp x20,x19,[sp, #0xa0]
00ad7c18	ldp x22,x21,[sp, #0x90]
00ad7c1c	ldp x24,x23,[sp, #0x80]
00ad7c20	ldp x26,x25,[sp, #0x70]
00ad7c24	ldp x28,x27,[sp, #0x60]
00ad7c28	add sp,sp,#0xc0
00ad7c2c	br x4
00ad7c30	cmp w26,#0x800
00ad7c34	b.lt 0x00ad7c84
00ad7c38	cmp w19,#0x2
00ad7c3c	b.ne 0x00ad7c84
00ad7c40	cbz x27,0x00ad7c54
00ad7c44	mov x0,x27
00ad7c48	bl 0x00c322f0
00ad7c4c	cmp w0,#0x10
00ad7c50	b.le 0x00ad7cb8
00ad7c54	mov x0,x21
00ad7c58	mov w1,w26
00ad7c5c	mov x2,x27
00ad7c60	mov x3,x25
00ad7c64	ldp x29,x30,[sp, #0xb0]
00ad7c68	ldp x20,x19,[sp, #0xa0]
00ad7c6c	ldp x22,x21,[sp, #0x90]
00ad7c70	ldp x24,x23,[sp, #0x80]
00ad7c74	ldp x26,x25,[sp, #0x70]
00ad7c78	ldp x28,x27,[sp, #0x60]
00ad7c7c	add sp,sp,#0xc0
00ad7c80	b 0x00c40050
00ad7c84	cmp w26,#0x1ff
00ad7c88	b.gt 0x00ad7cb4
00ad7c8c	bl 0x00c342a0
00ad7c90	adrp x0,0x29e000
00ad7c94	adrp x2,0x2ce000
00ad7c98	add x0,x0,#0x9da
00ad7c9c	add x2,x2,#0x346
00ad7ca0	mov w1,#0x5a
00ad7ca4	bl 0x00c342b0
00ad7ca8	mov w0,#0x4
00ad7cac	orr w1,wzr,#0x78
00ad7cb0	b 0x00ad7d00
00ad7cb4	cbz x27,0x00ad7cc4
00ad7cb8	mov x0,x27
00ad7cbc	bl 0x00c40040
00ad7cc0	cbz w0,0x00ad7d44
00ad7cc4	subs w24,w19,#0x2
00ad7cc8	b.lt 0x00ad7cdc
00ad7ccc	mov w0,w26
00ad7cd0	bl 0x00c3fd60
00ad7cd4	cmp w0,w19
00ad7cd8	b.ge 0x00ad7d78
00ad7cdc	bl 0x00c342a0
00ad7ce0	adrp x0,0x29e000
00ad7ce4	adrp x2,0x2ce000
00ad7ce8	add x0,x0,#0x9da
00ad7cec	add x2,x2,#0x346
00ad7cf0	mov w1,#0x66
00ad7cf4	bl 0x00c342b0
00ad7cf8	mov w0,#0x4
00ad7cfc	mov w1,#0xa5
00ad7d00	mov x2,xzr
00ad7d04	bl 0x00c342c0
00ad7d08	mov x20,xzr
00ad7d0c	mov w19,wzr
00ad7d10	mov x0,x20
00ad7d14	bl 0x00c38a20
00ad7d18	mov x0,x20
00ad7d1c	bl 0x00c38a30
00ad7d20	mov w0,w19
00ad7d24	ldp x29,x30,[sp, #0xb0]
00ad7d28	ldp x20,x19,[sp, #0xa0]
00ad7d2c	ldp x22,x21,[sp, #0x90]
00ad7d30	ldp x24,x23,[sp, #0x80]
00ad7d34	ldp x26,x25,[sp, #0x70]
00ad7d38	ldp x28,x27,[sp, #0x60]
00ad7d3c	add sp,sp,#0xc0
00ad7d40	ret
00ad7d44	bl 0x00c342a0
00ad7d48	adrp x0,0x29e000
00ad7d4c	adrp x2,0x2ce000
00ad7d50	add x0,x0,#0x9da
00ad7d54	add x2,x2,#0x346
00ad7d58	orr w1,wzr,#0x60
00ad7d5c	bl 0x00c342b0
00ad7d60	mov w0,#0x4
00ad7d64	mov w1,#0xb2
00ad7d68	mov x2,xzr
00ad7d6c	bl 0x00c342c0
00ad7d70	mov w19,wzr
00ad7d74	b 0x00ad7d20
00ad7d78	ldr x0,[x21, #0x8]
00ad7d7c	bl 0x00c38a60
00ad7d80	mov x20,x0
00ad7d84	cbz x0,0x00ad850c
00ad7d88	mov x0,x20
00ad7d8c	bl 0x00c38a90
00ad7d90	mov x0,x20
00ad7d94	bl 0x00c38a40
00ad7d98	str x0,[sp, #0x20]
00ad7d9c	mov x0,x20
00ad7da0	bl 0x00c38a40
00ad7da4	str x0,[sp, #0x28]
00ad7da8	mov x0,x20
00ad7dac	bl 0x00c38a40
00ad7db0	str x0,[sp, #0x30]
00ad7db4	cbz x0,0x00ad850c
00ad7db8	udiv w8,w26,w19
00ad7dbc	msub w10,w8,w19,w26
00ad7dc0	mov x9,xzr
00ad7dc4	cmp w19,#0x8
00ad7dc8	sxtw x10,w10
00ad7dcc	mov w11,w19
00ad7dd0	b.cc 0x00ad7e5c
00ad7dd4	adrp x13,0x29c000
00ad7dd8	adrp x14,0x29c000
00ad7ddc	ldr q2,[x13, #0xc40]
00ad7de0	ldr q3,[x14, #0x550]
00ad7de4	mov w13,#0x4
00ad7de8	and x9,x11,#0xfffffff8
00ad7dec	add x12,sp,#0x4c
00ad7df0	dup v4.2D,x13
00ad7df4	mov w13,#0x8
00ad7df8	dup v0.2D,x10
00ad7dfc	dup v1.4S,w8
00ad7e00	add x12,x12,#0x10
00ad7e04	dup v5.2D,x13
00ad7e08	mov x13,x9
00ad7e0c	add v6.2D,v3.2D,v4.2D
00ad7e10	add v7.2D,v2.2D,v4.2D
00ad7e14	cmgt v17.2D,v0.2D,v3.2D
00ad7e18	cmgt v6.2D,v0.2D,v6.2D
00ad7e1c	cmgt v16.2D,v0.2D,v2.2D
00ad7e20	xtn v17.2S,v17.2D
00ad7e24	cmgt v7.2D,v0.2D,v7.2D
00ad7e28	xtn v6.2S,v6.2D
00ad7e2c	xtn2 v17.4S,v16.2D
00ad7e30	xtn2 v6.4S,v7.2D
00ad7e34	sub v7.4S,v1.4S,v17.4S
00ad7e38	sub v6.4S,v1.4S,v6.4S
00ad7e3c	add v2.2D,v2.2D,v5.2D
00ad7e40	add v3.2D,v3.2D,v5.2D
00ad7e44	subs x13,x13,#0x8
00ad7e48	stp q7,q6,[x12, #-0x10]
00ad7e4c	add x12,x12,#0x20
00ad7e50	b.ne 0x00ad7e0c
00ad7e54	cmp x9,x11
00ad7e58	b.eq 0x00ad7e78
00ad7e5c	add x12,sp,#0x4c
00ad7e60	cmp x9,x10
00ad7e64	cinc w13,w8,lt
00ad7e68	str w13,[x12, x9, LSL #0x2]
00ad7e6c	add x9,x9,#0x1
00ad7e70	cmp x11,x9
00ad7e74	b.ne 0x00ad7e60
00ad7e78	ldr w8,[x21, #0xd8]
00ad7e7c	ldr x9,[x21, #0x28]
00ad7e80	add w8,w8,#0x1
00ad7e84	str w8,[x21, #0xd8]
00ad7e88	cbnz x9,0x00ad7e98
00ad7e8c	bl 0x00c37710
00ad7e90	str x0,[x21, #0x28]
00ad7e94	cbz x0,0x00ad850c
00ad7e98	ldr x0,[x21, #0x38]
00ad7e9c	cbnz x0,0x00ad7eac
00ad7ea0	bl 0x00c38d90
00ad7ea4	str x0,[x21, #0x38]
00ad7ea8	cbz x0,0x00ad850c
00ad7eac	mov w1,#0x4
00ad7eb0	bl 0x00c38dc0
00ad7eb4	ldr x8,[x21, #0x30]
00ad7eb8	cbnz x8,0x00ad7ec8
00ad7ebc	bl 0x00c37710
00ad7ec0	str x0,[x21, #0x30]
00ad7ec4	cbz x0,0x00ad850c
00ad7ec8	mov x22,x21
00ad7ecc	ldr x0,[x22, #0x40]!
00ad7ed0	cbnz x0,0x00ad7ee0
00ad7ed4	bl 0x00c38d90
00ad7ed8	str x0,[x22]
00ad7edc	cbz x0,0x00ad850c
00ad7ee0	mov w1,#0x4
00ad7ee4	bl 0x00c38dc0
00ad7ee8	mov x8,x21
00ad7eec	ldr x0,[x8, #0x48]!
00ad7ef0	str x8,[sp, #0x40]
00ad7ef4	cbnz x0,0x00ad7f08
00ad7ef8	bl 0x00c38d90
00ad7efc	ldr x8,[sp, #0x40]
00ad7f00	str x0,[x8]
00ad7f04	cbz x0,0x00ad850c
00ad7f08	mov w1,#0x4
00ad7f0c	bl 0x00c38dc0
00ad7f10	ldr x0,[x21, #0x50]
00ad7f14	cbnz x0,0x00ad7f24
00ad7f18	bl 0x00c38d90
00ad7f1c	str x0,[x21, #0x50]
00ad7f20	cbz x0,0x00ad850c
00ad7f24	mov w1,#0x4
00ad7f28	bl 0x00c38dc0
00ad7f2c	ldr x0,[x21, #0x58]
00ad7f30	cbnz x0,0x00ad7f40
00ad7f34	bl 0x00c38d90
00ad7f38	str x0,[x21, #0x58]
00ad7f3c	cbz x0,0x00ad850c
00ad7f40	mov w1,#0x4
00ad7f44	bl 0x00c38dc0
00ad7f48	ldr x0,[x21, #0x60]
00ad7f4c	cbnz x0,0x00ad7f5c
00ad7f50	bl 0x00c38d90
00ad7f54	str x0,[x21, #0x60]
00ad7f58	cbz x0,0x00ad850c
00ad7f5c	mov w1,#0x4
00ad7f60	bl 0x00c38dc0
00ad7f64	cmp w19,#0x3
00ad7f68	b.lt 0x00ad7fd0
00ad7f6c	mov w8,#0x1
00ad7f70	mov x0,xzr
00ad7f74	mov w1,w24
00ad7f78	str w8,[x21, #0x10]
00ad7f7c	bl 0x00c34790
00ad7f80	str x0,[sp, #0x38]
00ad7f84	cbz x0,0x00ad850c
00ad7f88	ldr x0,[x21, #0x88]
00ad7f8c	cbz x0,0x00ad7f9c
00ad7f90	adrp x1,0xcb5000
00ad7f94	ldr x1,[x1, #0x7a0]
00ad7f98	bl 0x00c32600
00ad7f9c	ldr x8,[sp, #0x38]
00ad7fa0	mov w23,#0x2
00ad7fa4	str x8,[x21, #0x88]
00ad7fa8	bl 0x00c3fee0
00ad7fac	cbz x0,0x00ad850c
00ad7fb0	mov x28,x0
00ad7fb4	ldr x0,[sp, #0x38]
00ad7fb8	mov x1,x28
00ad7fbc	bl 0x00c347a0
00ad7fc0	add w23,w23,#0x1
00ad7fc4	cmp w23,w19
00ad7fc8	b.lt 0x00ad7fa8
00ad7fcc	b 0x00ad7fd8
00ad7fd0	mov x28,xzr
00ad7fd4	str xzr,[sp, #0x38]
00ad7fd8	ldr x0,[x21, #0x30]
00ad7fdc	mov x1,x27
00ad7fe0	bl 0x00c36990
00ad7fe4	cbz x0,0x00ad850c
00ad7fe8	mov w24,wzr
00ad7fec	mov w23,wzr
00ad7ff0	add x26,sp,#0x4c
00ad7ff4	str wzr,[sp, #0x18]
00ad7ff8	cbz w24,0x00ad801c
00ad7ffc	ldr x0,[sp, #0x40]
00ad8000	cmp w24,#0x1
00ad8004	b.eq 0x00ad8020
00ad8008	ldr x0,[sp, #0x38]
00ad800c	sub w1,w24,#0x2
00ad8010	bl 0x00c32610
00ad8014	mov x28,x0
00ad8018	b 0x00ad8020
00ad801c	mov x0,x22
00ad8020	ldr x27,[x0]
00ad8024	mov w1,#0x4
00ad8028	mov x0,x27
00ad802c	bl 0x00c38dc0
00ad8030	ldr w8,[x26, w24, SXTW #0x2]
00ad8034	str wzr,[sp, #0x1c]
00ad8038	add w23,w8,w23
00ad803c	stp wzr,w8,[sp, #0x10]
00ad8040	sub w8,w23,#0x4
00ad8044	stp w23,w8,[sp, #0x8]
00ad8048	ldr w8,[sp, #0x1c]
00ad804c	b 0x00ad805c
00ad8050	add w9,w9,#0x1
00ad8054	str w9,[sp, #0x10]
00ad8058	str w8,[sp, #0x1c]
00ad805c	ldr w9,[sp, #0x14]
00ad8060	mov x0,x27
00ad8064	mov w2,wzr
00ad8068	mov x3,xzr
00ad806c	add w1,w8,w9
00ad8070	mov x4,xzr
00ad8074	mov x5,x25
00ad8078	mov x6,x20
00ad807c	bl 0x00c39120
00ad8080	cbz w0,0x00ad850c
00ad8084	cmp w24,#0x1
00ad8088	b.lt 0x00ad810c
00ad808c	ldr w8,[sp, #0x1c]
00ad8090	ldr w9,[sp, #0x14]
00ad8094	mov w26,wzr
00ad8098	add w23,w8,w9
00ad809c	ands w8,w26,#0x7fffffff
00ad80a0	mov x0,x22
00ad80a4	b.eq 0x00ad80c0
00ad80a8	ldr x0,[sp, #0x40]
00ad80ac	cmp w8,#0x1
00ad80b0	b.eq 0x00ad80c0
00ad80b4	ldr x0,[sp, #0x38]
00ad80b8	sub w1,w26,#0x2
00ad80bc	bl 0x00c32610
00ad80c0	ldr x1,[x0]
00ad80c4	mov x0,x27
00ad80c8	bl 0x00c38cc0
00ad80cc	cbz w0,0x00ad80e0
00ad80d0	add w26,w26,#0x1
00ad80d4	cmp w26,w24
00ad80d8	b.lt 0x00ad809c
00ad80dc	b 0x00ad810c
00ad80e0	mov x0,x27
00ad80e4	mov w1,w23
00ad80e8	mov w2,wzr
00ad80ec	mov x3,xzr
00ad80f0	mov x4,xzr
00ad80f4	mov x5,x25
00ad80f8	mov x6,x20
00ad80fc	bl 0x00c39120
00ad8100	mov w26,wzr
00ad8104	cbnz w0,0x00ad809c
00ad8108	b 0x00ad850c
00ad810c	bl 0x00c38de0
00ad8110	mov x2,x0
00ad8114	ldr x0,[sp, #0x30]
00ad8118	mov x1,x27
00ad811c	bl 0x00c38880
00ad8120	cbz w0,0x00ad850c
00ad8124	bl 0x00c35250
00ad8128	ldr x23,[sp, #0x30]
00ad812c	mov w1,#0x4
00ad8130	mov x0,x23
00ad8134	bl 0x00c38dc0
00ad8138	ldr x2,[x21, #0x30]
00ad813c	ldr x0,[sp, #0x28]
00ad8140	mov x1,x23
00ad8144	mov x3,x20
00ad8148	bl 0x00c38b20
00ad814c	cbz x0,0x00ad820c
00ad8150	cmp w24,#0x1
00ad8154	b.eq 0x00ad816c
00ad8158	cbz w24,0x00ad825c
00ad815c	ldr x1,[x21, #0x28]
00ad8160	ldr x0,[sp, #0x28]
00ad8164	mov x2,x27
00ad8168	b 0x00ad817c
00ad816c	ldr x8,[sp, #0x40]
00ad8170	ldr x1,[x22]
00ad8174	ldr x0,[sp, #0x28]
00ad8178	ldr x2,[x8]
00ad817c	mov x3,x20
00ad8180	bl 0x00c39060
00ad8184	cbz w0,0x00ad850c
00ad8188	ldp x1,x0,[sp, #0x28]
00ad818c	ldr w2,[sp, #0xc]
00ad8190	bl 0x00c39070
00ad8194	cbz w0,0x00ad850c
00ad8198	ldr x0,[sp, #0x30]
00ad819c	bl 0x00c38cf0
00ad81a0	sub x8,x0,#0x9
00ad81a4	cmp x8,#0x7
00ad81a8	b.cc 0x00ad8274
00ad81ac	ldr w2,[sp, #0x18]
00ad81b0	mov x23,x0
00ad81b4	mov w1,#0x2
00ad81b8	mov x0,x25
00ad81bc	bl 0x00c39100
00ad81c0	cbz w0,0x00ad850c
00ad81c4	ldr w8,[sp, #0x18]
00ad81c8	cmp w19,#0x5
00ad81cc	add w8,w8,#0x1
00ad81d0	str w8,[sp, #0x18]
00ad81d4	b.lt 0x00ad81f0
00ad81d8	ldr w8,[sp, #0x1c]
00ad81dc	ldr w9,[sp, #0x10]
00ad81e0	cmp x23,#0x8
00ad81e4	b.hi 0x00ad8204
00ad81e8	add w8,w8,#0x1
00ad81ec	b 0x00ad8050
00ad81f0	ldr w9,[sp, #0x10]
00ad81f4	ldr w8,[sp, #0x1c]
00ad81f8	cmp w9,#0x4
00ad81fc	b.ne 0x00ad8050
00ad8200	b 0x00ad82b4
00ad8204	sub w8,w8,#0x1
00ad8208	b 0x00ad8050
00ad820c	bl 0x00c32420
00ad8210	and x8,x0,#0xff800000
00ad8214	orr w9,wzr,#0x1800000
00ad8218	cmp x8,x9
00ad821c	b.ne 0x00ad850c
00ad8220	asr w8,w0,#0x1f
00ad8224	and w8,w8,#0x7f800000
00ad8228	orr w8,w8,#0x7fffff
00ad822c	and w8,w8,w0
00ad8230	cmp w8,#0x6c
00ad8234	b.ne 0x00ad850c
00ad8238	bl 0x00c35240
00ad823c	ldr w2,[sp, #0x18]
00ad8240	mov w1,#0x2
00ad8244	mov x0,x25
00ad8248	add w23,w2,#0x1
00ad824c	bl 0x00c39100
00ad8250	str w23,[sp, #0x18]
00ad8254	cbnz w0,0x00ad8048
00ad8258	b 0x00ad850c
00ad825c	orr w1,wzr,#0x3
00ad8260	mov x0,x25
00ad8264	mov w2,wzr
00ad8268	bl 0x00c39100
00ad826c	cbnz w0,0x00ad82bc
00ad8270	b 0x00ad850c
00ad8274	cmp w24,#0x2
00ad8278	b.lt 0x00ad828c
00ad827c	ldr x0,[x28, #0x18]
00ad8280	ldr x1,[x21, #0x28]
00ad8284	bl 0x00c36990
00ad8288	cbz x0,0x00ad850c
00ad828c	ldr x0,[x21, #0x28]
00ad8290	ldr x1,[sp, #0x28]
00ad8294	bl 0x00c36990
00ad8298	cbz x0,0x00ad850c
00ad829c	orr w1,wzr,#0x3
00ad82a0	mov x0,x25
00ad82a4	mov w2,w24
00ad82a8	bl 0x00c39100
00ad82ac	cbnz w0,0x00ad82bc
00ad82b0	b 0x00ad850c
00ad82b4	str wzr,[sp, #0x8]
00ad82b8	mov w24,#0xffffffff
00ad82bc	ldr w23,[sp, #0x8]
00ad82c0	add w24,w24,#0x1
00ad82c4	cmp w24,w19
00ad82c8	add x26,sp,#0x4c
00ad82cc	b.lt 0x00ad7ff8
00ad82d0	ldr x8,[sp, #0x40]
00ad82d4	ldr x0,[x22]
00ad82d8	ldr x1,[x8]
00ad82dc	bl 0x00c38cc0
00ad82e0	tbnz w0,#0x1f,0x00ad82ec
00ad82e4	ldr x23,[x22]
00ad82e8	b 0x00ad8300
00ad82ec	ldr x9,[sp, #0x40]
00ad82f0	ldr x8,[x22]
00ad82f4	ldr x23,[x9]
00ad82f8	str x23,[x22]
00ad82fc	str x8,[x9]
00ad8300	bl 0x00c38de0
00ad8304	mov x2,x0
00ad8308	ldr x0,[sp, #0x28]
00ad830c	mov x1,x23
00ad8310	bl 0x00c38880
00ad8314	cbz w0,0x00ad850c
00ad8318	ldr x8,[sp, #0x40]
00ad831c	ldr x23,[x8]
00ad8320	bl 0x00c38de0
00ad8324	mov x2,x0
00ad8328	ldr x0,[sp, #0x30]
00ad832c	mov x1,x23
00ad8330	bl 0x00c38880
00ad8334	cbz w0,0x00ad850c
00ad8338	ldp x0,x1,[sp, #0x20]
00ad833c	ldr x2,[sp, #0x30]
00ad8340	mov x3,x20
00ad8344	bl 0x00c39060
00ad8348	cbz w0,0x00ad850c
00ad834c	cmp w19,#0x3
00ad8350	b.lt 0x00ad83a8
00ad8354	mov w22,#0x2
00ad8358	ldr x0,[sp, #0x38]
00ad835c	sub w1,w22,#0x2
00ad8360	bl 0x00c32610
00ad8364	ldp x24,x25,[x0]
00ad8368	mov x23,x0
00ad836c	bl 0x00c38de0
00ad8370	mov x2,x0
00ad8374	mov x0,x25
00ad8378	mov x1,x24
00ad837c	bl 0x00c38880
00ad8380	cbz w0,0x00ad850c
00ad8384	ldr x0,[sp, #0x20]
00ad8388	ldr x2,[x23, #0x8]
00ad838c	mov x3,x20
00ad8390	mov x1,x0
00ad8394	bl 0x00c39060
00ad8398	cbz w0,0x00ad850c
00ad839c	add w22,w22,#0x1
00ad83a0	cmp w22,w19
00ad83a4	b.lt 0x00ad8358
00ad83a8	bl 0x00c37710
00ad83ac	cbz x0,0x00ad850c
00ad83b0	ldr x1,[sp, #0x20]
00ad83b4	mov w2,#0x4
00ad83b8	mov x23,x0
00ad83bc	bl 0x00c38df0
00ad83c0	ldp x1,x0,[x21, #0x30]
00ad83c4	mov x2,x23
00ad83c8	mov x3,x20
00ad83cc	bl 0x00c38b20
00ad83d0	mov x24,x0
00ad83d4	mov x0,x23
00ad83d8	bl 0x00c36290
00ad83dc	cbz x24,0x00ad850c
00ad83e0	bl 0x00c37710
00ad83e4	cbz x0,0x00ad850c
00ad83e8	ldr x1,[x21, #0x38]
00ad83ec	mov w2,#0x4
00ad83f0	mov x24,x0
00ad83f4	bl 0x00c38df0
00ad83f8	ldr x1,[x21, #0x50]
00ad83fc	ldr x3,[sp, #0x28]
00ad8400	mov x0,xzr
00ad8404	mov x2,x24
00ad8408	mov x4,x20
00ad840c	bl 0x00c38ab0
00ad8410	cbz w0,0x00ad8504
00ad8414	ldr x1,[x21, #0x58]
00ad8418	ldr x3,[sp, #0x30]
00ad841c	mov x0,xzr
00ad8420	mov x2,x24
00ad8424	mov x4,x20
00ad8428	bl 0x00c38ab0
00ad842c	cbz w0,0x00ad8504
00ad8430	cmp w19,#0x3
00ad8434	b.lt 0x00ad8470
00ad8438	mov w22,#0x2
00ad843c	ldr x0,[sp, #0x38]
00ad8440	sub w1,w22,#0x2
00ad8444	bl 0x00c32610
00ad8448	ldr x1,[x0, #0x8]
00ad844c	mov x0,xzr
00ad8450	mov x2,x24
00ad8454	mov x4,x20
00ad8458	mov x3,x1
00ad845c	bl 0x00c38ab0
00ad8460	cbz w0,0x00ad8504
00ad8464	add w22,w22,#0x1
00ad8468	cmp w22,w19
00ad846c	b.lt 0x00ad843c
00ad8470	mov x0,x24
00ad8474	bl 0x00c36290
00ad8478	bl 0x00c37710
00ad847c	cbz x0,0x00ad850c
00ad8480	ldr x1,[x21, #0x40]
00ad8484	mov w2,#0x4
00ad8488	mov x22,x0
00ad848c	bl 0x00c38df0
00ad8490	ldr x0,[x21, #0x60]
00ad8494	ldr x1,[x21, #0x48]
00ad8498	mov x2,x22
00ad849c	mov x3,x20
00ad84a0	bl 0x00c38b20
00ad84a4	cbz x0,0x00ad8540
00ad84a8	cmp w19,#0x3
00ad84ac	b.lt 0x00ad84f4
00ad84b0	mov w23,#0x2
00ad84b4	ldr x0,[sp, #0x38]
00ad84b8	sub w1,w23,#0x2
00ad84bc	bl 0x00c32610
00ad84c0	ldr x1,[x0]
00ad84c4	mov x21,x0
00ad84c8	mov w2,#0x4
00ad84cc	mov x0,x22
00ad84d0	bl 0x00c38df0
00ad84d4	ldp x0,x1,[x21, #0x10]
00ad84d8	mov x2,x22
00ad84dc	mov x3,x20
00ad84e0	bl 0x00c38b20
00ad84e4	cbz x0,0x00ad8540
00ad84e8	add w23,w23,#0x1
00ad84ec	cmp w23,w19
00ad84f0	b.lt 0x00ad84b4
00ad84f4	mov x0,x22
00ad84f8	bl 0x00c36290
00ad84fc	mov w19,#0x1
00ad8500	b 0x00ad7d10
00ad8504	mov x0,x24
00ad8508	bl 0x00c36290
00ad850c	bl 0x00c342a0
00ad8510	adrp x0,0x29e000
00ad8514	adrp x2,0x2ce000
00ad8518	add x0,x0,#0x9da
00ad851c	add x2,x2,#0x346
00ad8520	mov w1,#0x19f
00ad8524	bl 0x00c342b0
00ad8528	mov w1,#0x3
00ad852c	mov w0,#0x4
00ad8530	movk w1,#0x8, LSL #16
00ad8534	mov x2,xzr
00ad8538	bl 0x00c342c0
00ad853c	b 0x00ad7d0c
00ad8540	mov x0,x22
00ad8544	b 0x00ad8508
