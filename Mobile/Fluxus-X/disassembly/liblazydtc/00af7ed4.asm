; FUN_00af7ed4 @ 00af7ed4
00af7ed4	stp x28,x27,[sp, #-0x60]!
00af7ed8	stp x20,x19,[sp, #0x40]
00af7edc	mov x20,x0
00af7ee0	stp x26,x25,[sp, #0x10]
00af7ee4	stp x24,x23,[sp, #0x20]
00af7ee8	stp x22,x21,[sp, #0x30]
00af7eec	stp x29,x30,[sp, #0x50]
00af7ef0	add x29,sp,#0x50
00af7ef4	cbz x1,0x00af7f38
00af7ef8	mov x0,x1
00af7efc	mov x19,x2
00af7f00	mov x22,x1
00af7f04	bl 0x00c325e0
00af7f08	cmp w0,#0x1
00af7f0c	b.lt 0x00af7f38
00af7f10	cbnz x20,0x00af7f1c
00af7f14	mov w21,wzr
00af7f18	cbz x19,0x00af8308
00af7f1c	cbz x20,0x00af7f28
00af7f20	ldr x8,[x20, #0x38]
00af7f24	cbz x8,0x00af7f3c
00af7f28	cbz x19,0x00af7f54
00af7f2c	mov x21,xzr
00af7f30	mov w23,#0xffffffff
00af7f34	b 0x00af7f70
00af7f38	cbz x20,0x00af7f4c
00af7f3c	mov w8,#0x1
00af7f40	mov w21,wzr
00af7f44	str w8,[x20, #0xb0]
00af7f48	b 0x00af8308
00af7f4c	mov w21,wzr
00af7f50	b 0x00af8308
00af7f54	mov x0,x22
00af7f58	mov w1,wzr
00af7f5c	bl 0x00c32610
00af7f60	ldr x19,[x0, #0x128]
00af7f64	cbz x19,0x00af8328
00af7f68	mov x21,x0
00af7f6c	mov w23,wzr
00af7f70	mov x0,x19
00af7f74	bl 0x00af68c0
00af7f78	cbz w0,0x00af8288
00af7f7c	adrp x1,0xaf6000
00af7f80	add x1,x1,#0xbf8
00af7f84	mov x0,x19
00af7f88	bl 0x00c34df0
00af7f8c	mov x0,x19
00af7f90	bl 0x00c35330
00af7f94	mov x19,x0
00af7f98	cbz x0,0x00af82b8
00af7f9c	mov x0,x22
00af7fa0	add w23,w23,#0x1
00af7fa4	bl 0x00c325e0
00af7fa8	cmp w23,w0
00af7fac	b.ge 0x00af81f4
00af7fb0	adrp x24,0xaf6000
00af7fb4	mov w28,#0x2e
00af7fb8	add x24,x24,#0xbf8
00af7fbc	mov x0,x22
00af7fc0	mov w1,w23
00af7fc4	bl 0x00c32610
00af7fc8	mov x21,x0
00af7fcc	ldr x0,[x0, #0x128]
00af7fd0	bl 0x00af68c0
00af7fd4	cbnz w0,0x00af7ffc
00af7fd8	cbz x20,0x00af82fc
00af7fdc	ldr x8,[x20, #0x38]
00af7fe0	mov w9,#0x29
00af7fe4	mov w0,wzr
00af7fe8	mov x1,x20
00af7fec	stp w23,w9,[x20, #0xac]
00af7ff0	str x21,[x20, #0xb8]
00af7ff4	blr x8
00af7ff8	cbz w0,0x00af82fc
00af7ffc	ldr x0,[x21, #0x128]
00af8000	cbz x0,0x00af8024
00af8004	mov x1,x24
00af8008	bl 0x00c34df0
00af800c	mov x0,x19
00af8010	bl 0x00c325e0
00af8014	cmp w0,#0x1
00af8018	b.lt 0x00af81e0
00af801c	mov w25,wzr
00af8020	b 0x00af808c
00af8024	mov x0,x19
00af8028	bl 0x00c325e0
00af802c	cmp w0,#0x1
00af8030	b.lt 0x00af81e0
00af8034	mov w25,wzr
00af8038	mov x0,x19
00af803c	mov w1,w25
00af8040	bl 0x00c32610
00af8044	ldr x8,[x0]
00af8048	ldr w8,[x8]
00af804c	and w8,w8,#0xfffffffe
00af8050	cmp w8,#0x2
00af8054	b.ne 0x00af82fc
00af8058	ldr x8,[x0, #0x8]
00af805c	ldr w8,[x8]
00af8060	cbnz w8,0x00af81c0
00af8064	mov x0,x19
00af8068	add w25,w25,#0x1
00af806c	bl 0x00c325e0
00af8070	cmp w25,w0
00af8074	b.lt 0x00af8038
00af8078	b 0x00af81e0
00af807c	mov w2,wzr
00af8080	bl 0x00af7d64
00af8084	cbnz w0,0x00af8198
00af8088	b 0x00af8154
00af808c	mov x0,x19
00af8090	mov w1,w25
00af8094	bl 0x00c32610
00af8098	ldr x8,[x21, #0x128]
00af809c	mov x27,x0
00af80a0	mov x1,x27
00af80a4	mov x0,x8
00af80a8	bl 0x00c34760
00af80ac	ldr x8,[x21, #0x128]
00af80b0	mov w1,w0
00af80b4	mov x0,x8
00af80b8	bl 0x00c32610
00af80bc	cbz x0,0x00af8178
00af80c0	ldr x8,[x27]
00af80c4	ldr w9,[x8]
00af80c8	and w10,w9,#0xfffffffe
00af80cc	cmp w10,#0x2
00af80d0	b.ne 0x00af82fc
00af80d4	ldr x10,[x0]
00af80d8	mov x26,x0
00af80dc	ldr w10,[x10]
00af80e0	and w10,w10,#0xfffffffe
00af80e4	cmp w10,#0x2
00af80e8	b.ne 0x00af82fc
00af80ec	ldr x10,[x26, #0x8]
00af80f0	ldr w11,[x10]
00af80f4	cmp w11,#0x1
00af80f8	b.ne 0x00af81a8
00af80fc	ldr x11,[x27, #0x8]
00af8100	ldr w12,[x11]
00af8104	cbz w12,0x00af8198
00af8108	ldr x0,[x10, #0x8]
00af810c	ldr x1,[x11, #0x8]
00af8110	cbz x8,0x00af818c
00af8114	cmp w9,#0x2
00af8118	b.lt 0x00af807c
00af811c	ldr x8,[x8, #0x8]
00af8120	mov w2,wzr
00af8124	cbz x8,0x00af8190
00af8128	ldrb w9,[x8]
00af812c	ldrb w8,[x8, #0x1]
00af8130	bfm w8,w9,#0x18,#0x7
00af8134	cmp w8,#0x1
00af8138	cset w9,eq
00af813c	lsl w9,w9,#0x2
00af8140	cmp w8,#0x2
00af8144	mov w8,#0x10
00af8148	csel w2,w8,w9,eq
00af814c	bl 0x00af7d64
00af8150	cbnz w0,0x00af8198
00af8154	cbz x20,0x00af82fc
00af8158	ldr x8,[x20, #0x38]
00af815c	mov w0,wzr
00af8160	mov x1,x20
00af8164	stp w23,w28,[x20, #0xac]
00af8168	str x21,[x20, #0xb8]
00af816c	blr x8
00af8170	cbnz w0,0x00af81a8
00af8174	b 0x00af82fc
00af8178	ldr x8,[x27, #0x8]
00af817c	ldr w8,[x8]
00af8180	cmp w8,#0x1
00af8184	b.ne 0x00af81a8
00af8188	b 0x00af81c0
00af818c	mov w2,wzr
00af8190	bl 0x00af7d64
00af8194	cbz w0,0x00af8154
00af8198	mov x0,x19
00af819c	mov w1,w25
00af81a0	mov x2,x26
00af81a4	bl 0x00c38080
00af81a8	mov x0,x19
00af81ac	add w25,w25,#0x1
00af81b0	bl 0x00c325e0
00af81b4	cmp w25,w0
00af81b8	b.lt 0x00af808c
00af81bc	b 0x00af81e0
00af81c0	cbz x20,0x00af82fc
00af81c4	ldr x8,[x20, #0x38]
00af81c8	mov w0,wzr
00af81cc	mov x1,x20
00af81d0	stp w23,w28,[x20, #0xac]
00af81d4	str x21,[x20, #0xb8]
00af81d8	blr x8
00af81dc	cbz w0,0x00af82fc
00af81e0	mov x0,x22
00af81e4	add w23,w23,#0x1
00af81e8	bl 0x00c325e0
00af81ec	cmp w23,w0
00af81f0	b.lt 0x00af7fbc
00af81f4	ldr x0,[x21, #0x128]
00af81f8	cbz x0,0x00af8280
00af81fc	bl 0x00c325e0
00af8200	cmp w0,#0x1
00af8204	b.lt 0x00af8280
00af8208	mov w22,wzr
00af820c	mov w24,#0x2e
00af8210	ldr x0,[x21, #0x128]
00af8214	mov w1,w22
00af8218	bl 0x00c32610
00af821c	ldr x8,[x0]
00af8220	ldr w8,[x8]
00af8224	and w8,w8,#0xfffffffe
00af8228	cmp w8,#0x2
00af822c	b.ne 0x00af82fc
00af8230	ldr x8,[x0, #0x8]
00af8234	mov x1,x0
00af8238	ldr w8,[x8]
00af823c	cbnz w8,0x00af826c
00af8240	mov x0,x19
00af8244	bl 0x00c34760
00af8248	tbnz w0,#0x1f,0x00af826c
00af824c	cbz x20,0x00af82fc
00af8250	ldr x8,[x20, #0x38]
00af8254	mov w0,wzr
00af8258	mov x1,x20
00af825c	stp w23,w24,[x20, #0xac]
00af8260	str x21,[x20, #0xb8]
00af8264	blr x8
00af8268	cbz w0,0x00af82fc
00af826c	ldr x0,[x21, #0x128]
00af8270	add w22,w22,#0x1
00af8274	bl 0x00c325e0
00af8278	cmp w22,w0
00af827c	b.lt 0x00af8210
00af8280	mov w21,#0x1
00af8284	b 0x00af8300
00af8288	cbz x20,0x00af82ac
00af828c	ldr x9,[x20, #0x38]
00af8290	mov w8,#0x29
00af8294	mov w0,wzr
00af8298	mov x1,x20
00af829c	stp w23,w8,[x20, #0xac]
00af82a0	str x21,[x20, #0xb8]
00af82a4	blr x9
00af82a8	cbnz w0,0x00af7f7c
00af82ac	mov w21,wzr
00af82b0	mov x19,xzr
00af82b4	b 0x00af8300
00af82b8	bl 0x00c342a0
00af82bc	adrp x0,0x2d2000
00af82c0	adrp x2,0x2bc000
00af82c4	add x0,x0,#0x39d
00af82c8	add x2,x2,#0x5aa
00af82cc	mov w1,#0x4df
00af82d0	bl 0x00c342b0
00af82d4	mov w1,#0x100
00af82d8	mov w0,#0x22
00af82dc	movk w1,#0xc, LSL #16
00af82e0	mov x2,xzr
00af82e4	bl 0x00c342c0
00af82e8	mov w21,wzr
00af82ec	cbz x20,0x00af8300
00af82f0	mov w8,#0x11
00af82f4	str w8,[x20, #0xb0]
00af82f8	b 0x00af8300
00af82fc	mov w21,wzr
00af8300	mov x0,x19
00af8304	bl 0x00c34770
00af8308	mov w0,w21
00af830c	ldp x29,x30,[sp, #0x50]
00af8310	ldp x20,x19,[sp, #0x40]
00af8314	ldp x22,x21,[sp, #0x30]
00af8318	ldp x24,x23,[sp, #0x20]
00af831c	ldp x26,x25,[sp, #0x10]
00af8320	ldp x28,x27,[sp], #0x60
00af8324	ret
00af8328	mov w21,#0x1
00af832c	b 0x00af8308
