; mbedtls_rsa_self_test @ 00ba8c80
00ba8c80	str x28,[sp, #-0x60]!
00ba8c84	stp x26,x25,[sp, #0x10]
00ba8c88	stp x24,x23,[sp, #0x20]
00ba8c8c	stp x22,x21,[sp, #0x30]
00ba8c90	stp x20,x19,[sp, #0x40]
00ba8c94	stp x29,x30,[sp, #0x50]
00ba8c98	add x29,sp,#0x50
00ba8c9c	sub sp,sp,#0x1e0
00ba8ca0	mrs x26,tpidr_el0
00ba8ca4	ldr x8,[x26, #0x28]
00ba8ca8	mov w19,w0
00ba8cac	add x0,sp,#0x10
00ba8cb0	stur x8,[x29, #-0x58]
00ba8cb4	bl 0x00c41c00
00ba8cb8	add x0,sp,#0x20
00ba8cbc	mov w2,#0xe8
00ba8cc0	mov w1,wzr
00ba8cc4	add x20,sp,#0x20
00ba8cc8	bl 0x00c301c0
00ba8ccc	adrp x2,0x2cc000
00ba8cd0	add x2,x2,#0x89f
00ba8cd4	add x0,sp,#0x10
00ba8cd8	mov w1,#0x10
00ba8cdc	bl 0x00c41cc0
00ba8ce0	mov w23,w0
00ba8ce4	cbz w0,0x00ba8d2c
00ba8ce8	add x0,sp,#0x10
00ba8cec	bl 0x00c41bb0
00ba8cf0	add x0,sp,#0x20
00ba8cf4	bl 0x00c432d0
00ba8cf8	ldr x8,[x26, #0x28]
00ba8cfc	ldur x9,[x29, #-0x58]
00ba8d00	cmp x8,x9
00ba8d04	b.ne 0x00ba91c8
00ba8d08	mov w0,w23
00ba8d0c	add sp,sp,#0x1e0
00ba8d10	ldp x29,x30,[sp, #0x50]
00ba8d14	ldp x20,x19,[sp, #0x40]
00ba8d18	ldp x22,x21,[sp, #0x30]
00ba8d1c	ldp x24,x23,[sp, #0x20]
00ba8d20	ldp x26,x25,[sp, #0x10]
00ba8d24	ldr x28,[sp], #0x60
00ba8d28	ret
00ba8d2c	add x20,x20,#0x10
00ba8d30	add x1,sp,#0x10
00ba8d34	mov x0,x20
00ba8d38	bl 0x00c41b60
00ba8d3c	cbz w0,0x00ba8d50
00ba8d40	mov w8,#0xffffbf80
00ba8d44	adds w23,w0,w8
00ba8d48	b.ne 0x00ba8ce8
00ba8d4c	b 0x00ba8d5c
00ba8d50	mov x0,x20
00ba8d54	bl 0x00c41d30
00ba8d58	str x0,[sp, #0x28]
00ba8d5c	adrp x2,0x2c0000
00ba8d60	add x2,x2,#0xb02
00ba8d64	add x0,sp,#0x10
00ba8d68	mov w1,#0x10
00ba8d6c	bl 0x00c41cc0
00ba8d70	mov w23,w0
00ba8d74	cbnz w0,0x00ba8ce8
00ba8d78	add x8,sp,#0x20
00ba8d7c	add x21,x8,#0x40
00ba8d80	add x1,sp,#0x10
00ba8d84	mov x0,x21
00ba8d88	bl 0x00c41b60
00ba8d8c	cbz w0,0x00ba8d9c
00ba8d90	mov w8,#0xffffbf80
00ba8d94	adds w23,w0,w8
00ba8d98	b.ne 0x00ba8ce8
00ba8d9c	adrp x2,0x2d4000
00ba8da0	add x2,x2,#0xa53
00ba8da4	add x0,sp,#0x10
00ba8da8	mov w1,#0x10
00ba8dac	bl 0x00c41cc0
00ba8db0	mov w23,w0
00ba8db4	cbnz w0,0x00ba8ce8
00ba8db8	add x8,sp,#0x20
00ba8dbc	add x22,x8,#0x50
00ba8dc0	add x1,sp,#0x10
00ba8dc4	mov x0,x22
00ba8dc8	bl 0x00c41b60
00ba8dcc	cbz w0,0x00ba8ddc
00ba8dd0	mov w8,#0xffffbf80
00ba8dd4	adds w23,w0,w8
00ba8dd8	b.ne 0x00ba8ce8
00ba8ddc	adrp x2,0x2a1000
00ba8de0	add x2,x2,#0x1fa
00ba8de4	add x0,sp,#0x10
00ba8de8	mov w1,#0x10
00ba8dec	bl 0x00c41cc0
00ba8df0	mov w23,w0
00ba8df4	cbnz w0,0x00ba8ce8
00ba8df8	add x8,sp,#0x20
00ba8dfc	add x24,x8,#0x30
00ba8e00	add x1,sp,#0x10
00ba8e04	mov x0,x24
00ba8e08	bl 0x00c41b60
00ba8e0c	cbz w0,0x00ba8e1c
00ba8e10	mov w8,#0xffffbf80
00ba8e14	adds w23,w0,w8
00ba8e18	b.ne 0x00ba8ce8
00ba8e1c	adrp x2,0x2c8000
00ba8e20	add x2,x2,#0x8a1
00ba8e24	add x0,sp,#0x10
00ba8e28	mov w1,#0x10
00ba8e2c	bl 0x00c41cc0
00ba8e30	mov w23,w0
00ba8e34	cbnz w0,0x00ba8ce8
00ba8e38	add x8,sp,#0x20
00ba8e3c	add x25,x8,#0x20
00ba8e40	add x1,sp,#0x10
00ba8e44	mov x0,x25
00ba8e48	bl 0x00c41b60
00ba8e4c	cbz w0,0x00ba8e5c
00ba8e50	mov w8,#0xffffbf80
00ba8e54	adds w23,w0,w8
00ba8e58	b.ne 0x00ba8ce8
00ba8e5c	add x0,sp,#0x20
00ba8e60	bl 0x00c43410
00ba8e64	mov w23,w0
00ba8e68	cbnz w0,0x00ba8ce8
00ba8e6c	cbz w19,0x00ba8e7c
00ba8e70	adrp x0,0x2d2000
00ba8e74	add x0,x0,#0x968
00ba8e78	bl 0x00c41af0
00ba8e7c	add x0,sp,#0x20
00ba8e80	bl 0x00c43400
00ba8e84	cbnz w0,0x00ba8eec
00ba8e88	add x0,sp,#0x20
00ba8e8c	bl 0x00c43400
00ba8e90	cbnz w0,0x00ba8eec
00ba8e94	add x0,sp,#0x20
00ba8e98	mov w1,#0x1
00ba8e9c	bl 0x00ba6554
00ba8ea0	cbnz w0,0x00ba8eec
00ba8ea4	mov x0,x20
00ba8ea8	mov x1,x21
00ba8eac	mov x2,x22
00ba8eb0	mov x3,x24
00ba8eb4	mov x4,x25
00ba8eb8	mov x5,xzr
00ba8ebc	mov x6,xzr
00ba8ec0	bl 0x00c434c0
00ba8ec4	cbnz w0,0x00ba8eec
00ba8ec8	add x8,sp,#0x20
00ba8ecc	add x3,x8,#0x60
00ba8ed0	add x4,x8,#0x70
00ba8ed4	add x5,x8,#0x80
00ba8ed8	mov x0,x21
00ba8edc	mov x1,x22
00ba8ee0	mov x2,x24
00ba8ee4	bl 0x00c434b0
00ba8ee8	cbz w0,0x00ba8f04
00ba8eec	cbz w19,0x00ba8efc
00ba8ef0	adrp x0,0x77c000
00ba8ef4	add x0,x0,#0x854
00ba8ef8	bl 0x00c30760
00ba8efc	mov w23,#0x1
00ba8f00	b 0x00ba8ce8
00ba8f04	cbz w19,0x00ba8f14
00ba8f08	adrp x0,0x2c2000
00ba8f0c	add x0,x0,#0xbe5
00ba8f10	bl 0x00c41af0
00ba8f14	adrp x9,0x788000
00ba8f18	add x9,x9,#0x348
00ba8f1c	ldr w8,[sp, #0x100]
00ba8f20	ldr x10,[x9, #0x10]
00ba8f24	ldr q0,[x9]
00ba8f28	cmp w8,#0x1
00ba8f2c	stur x10,[x29, #-0x60]
00ba8f30	stur q0,[x29, #-0x70]
00ba8f34	b.eq 0x00ba8fb8
00ba8f38	cbnz w8,0x00ba8eec
00ba8f3c	ldr x8,[sp, #0x28]
00ba8f40	cmp x8,#0x23
00ba8f44	b.cc 0x00ba8eec
00ba8f48	sub x20,x8,#0x1b
00ba8f4c	add x8,sp,#0x128
00ba8f50	mov w9,#0x200
00ba8f54	orr x8,x8,#0x2
00ba8f58	strh w9,[sp, #0x128]
00ba8f5c	mov x21,x8
00ba8f60	sub x20,x20,#0x1
00ba8f64	mov w22,#0xffffff9c
00ba8f68	bl 0x00c434d0
00ba8f6c	tst w0,#0xff
00ba8f70	strb w0,[x21]
00ba8f74	b.ne 0x00ba8f84
00ba8f78	adds w22,w22,#0x1
00ba8f7c	b.ne 0x00ba8f68
00ba8f80	b 0x00ba8eec
00ba8f84	add x8,x21,#0x1
00ba8f88	cbnz x20,0x00ba8f5c
00ba8f8c	ldur x8,[x29, #-0x60]
00ba8f90	ldur q0,[x29, #-0x70]
00ba8f94	add x0,sp,#0x20
00ba8f98	add x1,sp,#0x128
00ba8f9c	add x2,sp,#0x128
00ba8fa0	strb wzr,[x21, #0x1]
00ba8fa4	stur x8,[x21, #0x12]
00ba8fa8	stur q0,[x21, #0x2]
00ba8fac	bl 0x00c43470
00ba8fb0	cbnz w0,0x00ba8eec
00ba8fb4	b 0x00ba8fe4
00ba8fb8	nop
00ba8fbc	adr x1,0xba91cc
00ba8fc0	add x0,sp,#0x20
00ba8fc4	orr w5,wzr,#0x18
00ba8fc8	sub x6,x29,#0x70
00ba8fcc	add x7,sp,#0x128
00ba8fd0	mov x2,xzr
00ba8fd4	mov x3,xzr
00ba8fd8	mov x4,xzr
00ba8fdc	bl 0x00c43380
00ba8fe0	cbnz w0,0x00ba8eec
00ba8fe4	cbz w19,0x00ba8ff4
00ba8fe8	adrp x0,0x2ca000
00ba8fec	add x0,x0,#0x943
00ba8ff0	bl 0x00c41af0
00ba8ff4	ldr w8,[sp, #0x100]
00ba8ff8	cmp w8,#0x1
00ba8ffc	b.eq 0x00ba9030
00ba9000	cbnz w8,0x00ba8eec
00ba9004	nop
00ba9008	adr x1,0xba91cc
00ba900c	add x0,sp,#0x20
00ba9010	add x3,sp,#0x108
00ba9014	add x4,sp,#0x128
00ba9018	sub x5,x29,#0x88
00ba901c	orr w6,wzr,#0x18
00ba9020	mov x2,xzr
00ba9024	bl 0x00c43480
00ba9028	cbnz w0,0x00ba8eec
00ba902c	b 0x00ba9064
00ba9030	adrp x1,0xba9000
00ba9034	orr w8,wzr,#0x18
00ba9038	add x1,x1,#0x1cc
00ba903c	add x0,sp,#0x20
00ba9040	add x5,sp,#0x108
00ba9044	add x6,sp,#0x128
00ba9048	sub x7,x29,#0x88
00ba904c	mov x2,xzr
00ba9050	mov x3,xzr
00ba9054	mov x4,xzr
00ba9058	str x8,[sp]
00ba905c	bl 0x00c43370
00ba9060	cbnz w0,0x00ba8eec
00ba9064	ldr x2,[sp, #0x108]
00ba9068	sub x0,x29,#0x88
00ba906c	sub x1,x29,#0x70
00ba9070	bl 0x00c300b0
00ba9074	cbnz w0,0x00ba8eec
00ba9078	cbz w19,0x00ba9094
00ba907c	adrp x0,0x77c000
00ba9080	add x0,x0,#0x87c
00ba9084	bl 0x00c30760
00ba9088	adrp x0,0x2a1000
00ba908c	add x0,x0,#0x2fb
00ba9090	bl 0x00c41af0
00ba9094	mov w0,#0x5
00ba9098	bl 0x00c30210
00ba909c	sub x1,x29,#0x70
00ba90a0	orr w2,wzr,#0x18
00ba90a4	add x3,sp,#0x114
00ba90a8	bl 0x00c30220
00ba90ac	cbz w0,0x00ba90c8
00ba90b0	cbz w19,0x00ba9104
00ba90b4	adrp x0,0x77c000
00ba90b8	add x0,x0,#0x854
00ba90bc	bl 0x00c30760
00ba90c0	mov w23,#0x1
00ba90c4	b 0x00ba8cf8
00ba90c8	ldr w8,[sp, #0x100]
00ba90cc	cmp w8,#0x1
00ba90d0	b.eq 0x00ba910c
00ba90d4	cbnz w8,0x00ba8eec
00ba90d8	nop
00ba90dc	adr x1,0xba91cc
00ba90e0	add x0,sp,#0x20
00ba90e4	mov w3,#0x5
00ba90e8	mov w4,#0x14
00ba90ec	add x5,sp,#0x114
00ba90f0	add x6,sp,#0x128
00ba90f4	mov x2,xzr
00ba90f8	bl 0x00c43490
00ba90fc	cbnz w0,0x00ba8eec
00ba9100	b 0x00ba9138
00ba9104	mov w23,#0x1
00ba9108	b 0x00ba8cf8
00ba910c	nop
00ba9110	adr x1,0xba91cc
00ba9114	add x0,sp,#0x20
00ba9118	mov w3,#0x5
00ba911c	mov w4,#0x14
00ba9120	add x5,sp,#0x114
00ba9124	mov w6,#0xffffffff
00ba9128	add x7,sp,#0x128
00ba912c	mov x2,xzr
00ba9130	bl 0x00ba8060
00ba9134	cbnz w0,0x00ba8eec
00ba9138	cbz w19,0x00ba9148
00ba913c	adrp x0,0x2ab000
00ba9140	add x0,x0,#0x165
00ba9144	bl 0x00c41af0
00ba9148	ldr w8,[sp, #0x100]
00ba914c	cmp w8,#0x1
00ba9150	b.eq 0x00ba9178
00ba9154	cbnz w8,0x00ba8eec
00ba9158	add x0,sp,#0x20
00ba915c	mov w1,#0x5
00ba9160	mov w2,#0x14
00ba9164	add x3,sp,#0x114
00ba9168	add x4,sp,#0x128
00ba916c	bl 0x00c434a0
00ba9170	cbnz w0,0x00ba8eec
00ba9174	b 0x00ba91a8
00ba9178	ldr w8,[sp, #0x104]
00ba917c	mov w9,#0x5
00ba9180	add x0,sp,#0x20
00ba9184	mov w1,#0x5
00ba9188	cmp w8,#0x0
00ba918c	csel w4,w9,w8,eq
00ba9190	mov w2,#0x14
00ba9194	add x3,sp,#0x114
00ba9198	mov w5,#0xffffffff
00ba919c	add x6,sp,#0x128
00ba91a0	bl 0x00c433a0
00ba91a4	cbnz w0,0x00ba8eec
00ba91a8	cbz w19,0x00ba91c0
00ba91ac	adrp x0,0x77c000
00ba91b0	add x0,x0,#0x87c
00ba91b4	bl 0x00c30760
00ba91b8	mov w0,#0xa
00ba91bc	bl 0x00c42240
00ba91c0	mov w23,wzr
00ba91c4	b 0x00ba8ce8
00ba91c8	bl 0x00c2fec0
