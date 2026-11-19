; FUN_00ab7f64 @ 00ab7f64
00ab7f64	stp x28,x27,[sp, #-0x60]!
00ab7f68	stp x26,x25,[sp, #0x10]
00ab7f6c	stp x24,x23,[sp, #0x20]
00ab7f70	stp x22,x21,[sp, #0x30]
00ab7f74	stp x20,x19,[sp, #0x40]
00ab7f78	stp x29,x30,[sp, #0x50]
00ab7f7c	add x29,sp,#0x50
00ab7f80	sub sp,sp,#0x460
00ab7f84	mov x26,x3
00ab7f88	mov x27,x2
00ab7f8c	mov x20,x1
00ab7f90	movi v0.2D,#0x0
00ab7f94	mov w1,#0x85
00ab7f98	mov x2,xzr
00ab7f9c	mov x3,xzr
00ab7fa0	mov w23,w6
00ab7fa4	mov x21,x5
00ab7fa8	mov x22,x4
00ab7fac	mov x24,x0
00ab7fb0	stur q0,[sp, #0x28]
00ab7fb4	stur q0,[sp, #0x18]
00ab7fb8	stur q0,[sp, #0x8]
00ab7fbc	bl 0x00c321a0
00ab7fc0	mov x25,x0
00ab7fc4	tbnz w25,#0x1f,0x00ab7fd0
00ab7fc8	mov x19,xzr
00ab7fcc	b 0x00ab8000
00ab7fd0	bl 0x00c384a0
00ab7fd4	bl 0x00c32240
00ab7fd8	cbz x0,0x00ab80f0
00ab7fdc	mov x1,x24
00ab7fe0	mov x19,x0
00ab7fe4	bl 0x00c35640
00ab7fe8	mov w1,#0x85
00ab7fec	mov x2,xzr
00ab7ff0	mov x3,xzr
00ab7ff4	mov x24,x0
00ab7ff8	bl 0x00c321a0
00ab7ffc	mov x25,x0
00ab8000	adrp x8,0xcb5000
00ab8004	ldr x8,[x8, #0x750]
00ab8008	cmp x27,#0x0
00ab800c	add x0,sp,#0x8
00ab8010	mov x2,x26
00ab8014	csel x1,x8,x27,eq
00ab8018	bl 0x00c3b790
00ab801c	cbz w0,0x00ab80e8
00ab8020	add x0,sp,#0x8
00ab8024	bl 0x00c3b4b0
00ab8028	cbz w0,0x00ab80e8
00ab802c	bl 0x00c35250
00ab8030	mov w1,#0x85
00ab8034	mov x0,x24
00ab8038	mov x2,xzr
00ab803c	mov x3,xzr
00ab8040	str xzr,[sp, #0x38]
00ab8044	bl 0x00c321a0
00ab8048	mov x27,x0
00ab804c	tbnz w27,#0x1f,0x00ab81dc
00ab8050	adrp x1,0x2b9000
00ab8054	add x1,x1,#0x56f
00ab8058	add x0,sp,#0x38
00ab805c	mov x2,xzr
00ab8060	mov x3,xzr
00ab8064	mov w4,w23
00ab8068	mov x5,x22
00ab806c	mov x6,x21
00ab8070	bl 0x00c35f10
00ab8074	cbz x0,0x00ab81dc
00ab8078	adrp x1,0xcb5000
00ab807c	ldr x1,[x1, #0x698]
00ab8080	add x2,sp,#0x8
00ab8084	mov x26,x0
00ab8088	bl 0x00c3b710
00ab808c	cbz w0,0x00ab81cc
00ab8090	str x20,[sp]
00ab8094	bl 0x00c35250
00ab8098	mov x0,x26
00ab809c	mov x1,x24
00ab80a0	bl 0x00c35f20
00ab80a4	cbz w0,0x00ab80f8
00ab80a8	ldr x8,[sp, #0x38]
00ab80ac	cbz x8,0x00ab80f8
00ab80b0	bl 0x00c35240
00ab80b4	ldr x0,[sp, #0x38]
00ab80b8	and w8,w23,#0xfffffffd
00ab80bc	tst w23,#0x1
00ab80c0	csel w1,w23,w8,eq
00ab80c4	bl 0x00c37d30
00ab80c8	cbz w0,0x00ab8190
00ab80cc	ldr x20,[sp]
00ab80d0	cbz x20,0x00ab81cc
00ab80d4	ldr x0,[x20]
00ab80d8	bl 0x00c32450
00ab80dc	ldr x8,[sp, #0x38]
00ab80e0	str x8,[x20]
00ab80e4	b 0x00ab81cc
00ab80e8	mov x26,xzr
00ab80ec	b 0x00ab84d4
00ab80f0	mov x26,xzr
00ab80f4	b 0x00ab84f0
00ab80f8	mov w8,#0xd
00ab80fc	movk w8,#0x8, LSL #16
00ab8100	add w20,w8,#0xff
00ab8104	mov w1,#0x2
00ab8108	mov x0,x24
00ab810c	mov x2,xzr
00ab8110	mov x3,xzr
00ab8114	bl 0x00c321a0
00ab8118	cbnz w0,0x00ab8188
00ab811c	mov w1,#0x85
00ab8120	mov x0,x24
00ab8124	mov x2,xzr
00ab8128	mov x3,xzr
00ab812c	bl 0x00c321a0
00ab8130	mov x28,x0
00ab8134	tbnz w28,#0x1f,0x00ab8188
00ab8138	cmp w27,w28
00ab813c	b.ge 0x00ab8188
00ab8140	bl 0x00c32410
00ab8144	asr w8,w0,#0x1f
00ab8148	and w8,w8,#0x7f800000
00ab814c	orr w8,w8,#0x7fffff
00ab8150	and w8,w8,w0
00ab8154	cmp w8,w20
00ab8158	b.ne 0x00ab8188
00ab815c	bl 0x00c35240
00ab8160	bl 0x00c35250
00ab8164	mov x0,x26
00ab8168	mov x1,x24
00ab816c	bl 0x00c35f20
00ab8170	mov w27,w28
00ab8174	cbz w0,0x00ab8104
00ab8178	ldr x8,[sp, #0x38]
00ab817c	mov w27,w28
00ab8180	cbz x8,0x00ab8104
00ab8184	b 0x00ab80b0
00ab8188	bl 0x00c35ed0
00ab818c	b 0x00ab81c8
00ab8190	ldr x0,[sp, #0x38]
00ab8194	bl 0x00c32450
00ab8198	str xzr,[sp, #0x38]
00ab819c	bl 0x00c342a0
00ab81a0	adrp x0,0x2d6000
00ab81a4	adrp x2,0x2ca000
00ab81a8	add x0,x0,#0x444
00ab81ac	add x2,x2,#0x228
00ab81b0	mov w1,#0x55
00ab81b4	bl 0x00c342b0
00ab81b8	mov w0,#0x9
00ab81bc	orr w1,wzr,#0x7e
00ab81c0	mov x2,xzr
00ab81c4	bl 0x00c342c0
00ab81c8	ldr x20,[sp]
00ab81cc	mov x0,x26
00ab81d0	bl 0x00c35f00
00ab81d4	ldr x26,[sp, #0x38]
00ab81d8	cbnz x26,0x00ab84d0
00ab81dc	sxtw x2,w25
00ab81e0	mov w1,#0x80
00ab81e4	mov x0,x24
00ab81e8	mov x3,xzr
00ab81ec	bl 0x00c321a0
00ab81f0	tbnz w0,#0x1f,0x00ab8304
00ab81f4	stp xzr,xzr,[x29, #-0x68]
00ab81f8	stur xzr,[x29, #-0x70]
00ab81fc	bl 0x00c35250
00ab8200	tbnz w23,#0x0,0x00ab82cc
00ab8204	adrp x5,0xcb5000
00ab8208	ldr x5,[x5, #0x698]
00ab820c	adrp x8,0x2da000
00ab8210	adrp x9,0x2b8000
00ab8214	add x8,x8,#0x514
00ab8218	add x9,x9,#0x4e1
00ab821c	tst w23,#0x2
00ab8220	csel x3,x9,x8,eq
00ab8224	sub x0,x29,#0x70
00ab8228	sub x1,x29,#0x78
00ab822c	sub x2,x29,#0x60
00ab8230	add x6,sp,#0x8
00ab8234	mov x4,x24
00ab8238	bl 0x00c3f200
00ab823c	cbz w0,0x00ab82f8
00ab8240	bl 0x00c35ed0
00ab8244	ldur x24,[x29, #-0x60]
00ab8248	ldur x8,[x29, #-0x70]
00ab824c	adrp x1,0x2a2000
00ab8250	add x1,x1,#0xb4c
00ab8254	mov x0,x24
00ab8258	stur x8,[x29, #-0x68]
00ab825c	bl 0x00c301f0
00ab8260	cbz w0,0x00ab8310
00ab8264	adrp x1,0x2c6000
00ab8268	add x1,x1,#0xd0
00ab826c	mov x0,x24
00ab8270	bl 0x00c301f0
00ab8274	cbz w0,0x00ab8358
00ab8278	adrp x1,0x2a2000
00ab827c	add x1,x1,#0xb4c
00ab8280	mov x0,x24
00ab8284	bl 0x00c3f270
00ab8288	cmp w0,#0x1
00ab828c	b.lt 0x00ab83ec
00ab8290	ldur x1,[x29, #-0x60]
00ab8294	mov w2,w0
00ab8298	mov x0,xzr
00ab829c	bl 0x00c352c0
00ab82a0	cbz x0,0x00ab842c
00ab82a4	ldr x8,[x0, #0xb8]
00ab82a8	cbz x8,0x00ab842c
00ab82ac	ldr w0,[x0]
00ab82b0	ldur x3,[x29, #-0x78]
00ab82b4	sub x2,x29,#0x68
00ab82b8	mov x1,x20
00ab82bc	mov x4,x22
00ab82c0	mov x5,x21
00ab82c4	bl 0x00c37d60
00ab82c8	b 0x00ab8408
00ab82cc	adrp x5,0xcb5000
00ab82d0	ldr x5,[x5, #0x698]
00ab82d4	adrp x3,0x2b2000
00ab82d8	add x3,x3,#0x972
00ab82dc	sub x0,x29,#0x70
00ab82e0	sub x1,x29,#0x78
00ab82e4	sub x2,x29,#0x60
00ab82e8	add x6,sp,#0x8
00ab82ec	mov x4,x24
00ab82f0	bl 0x00c3f250
00ab82f4	cbnz w0,0x00ab8240
00ab82f8	bl 0x00c35240
00ab82fc	mov x26,xzr
00ab8300	cbnz x26,0x00ab84d0
00ab8304	bl 0x00c35ed0
00ab8308	mov x26,xzr
00ab830c	b 0x00ab84d4
00ab8310	ldur x2,[x29, #-0x78]
00ab8314	sub x1,x29,#0x68
00ab8318	mov x0,xzr
00ab831c	bl 0x00c37d20
00ab8320	cbz x0,0x00ab842c
00ab8324	mov x1,x22
00ab8328	mov x2,x21
00ab832c	mov x23,x0
00ab8330	bl 0x00c37d40
00ab8334	mov x26,x0
00ab8338	cbz x20,0x00ab8348
00ab833c	ldr x0,[x20]
00ab8340	bl 0x00c32450
00ab8344	str x26,[x20]
00ab8348	mov x0,x23
00ab834c	bl 0x00c37d00
00ab8350	cbnz x26,0x00ab84a4
00ab8354	b 0x00ab842c
00ab8358	ldur x2,[x29, #-0x78]
00ab835c	sub x1,x29,#0x68
00ab8360	mov x0,xzr
00ab8364	bl 0x00c38320
00ab8368	cbz x0,0x00ab8414
00ab836c	mov x23,x0
00ab8370	add x0,sp,#0x38
00ab8374	mov w1,#0x400
00ab8378	add x3,sp,#0x8
00ab837c	mov w2,wzr
00ab8380	bl 0x00c3ea30
00ab8384	mov w25,w0
00ab8388	tbnz w0,#0x1f,0x00ab846c
00ab838c	add x1,sp,#0x38
00ab8390	mov x0,x23
00ab8394	mov w2,w25
00ab8398	bl 0x00c3f2b0
00ab839c	mov x24,x0
00ab83a0	mov x0,x23
00ab83a4	bl 0x00c382f0
00ab83a8	sxtw x1,w25
00ab83ac	add x0,sp,#0x38
00ab83b0	bl 0x00c34750
00ab83b4	cbz x24,0x00ab8414
00ab83b8	mov x0,x24
00ab83bc	mov x1,x22
00ab83c0	mov x2,x21
00ab83c4	bl 0x00c37d40
00ab83c8	mov x26,x0
00ab83cc	cbz x20,0x00ab83dc
00ab83d0	ldr x0,[x20]
00ab83d4	bl 0x00c32450
00ab83d8	str x26,[x20]
00ab83dc	mov x0,x24
00ab83e0	bl 0x00c37d00
00ab83e4	cbnz x26,0x00ab84a4
00ab83e8	b 0x00ab842c
00ab83ec	and w8,w23,#0x3
00ab83f0	cmp w8,#0x2
00ab83f4	b.ne 0x00ab8420
00ab83f8	ldur x2,[x29, #-0x78]
00ab83fc	sub x1,x29,#0x68
00ab8400	mov x0,x20
00ab8404	bl 0x00c3f2c0
00ab8408	mov x26,x0
00ab840c	cbnz x26,0x00ab84a4
00ab8410	b 0x00ab842c
00ab8414	mov x26,xzr
00ab8418	cbnz x26,0x00ab84a4
00ab841c	b 0x00ab842c
00ab8420	mov w8,#0x87
00ab8424	tst w23,w8
00ab8428	b.eq 0x00ab8514
00ab842c	bl 0x00c32420
00ab8430	mov x26,xzr
00ab8434	cbnz x0,0x00ab84a4
00ab8438	bl 0x00c342a0
00ab843c	adrp x0,0x2d6000
00ab8440	adrp x2,0x29e000
00ab8444	add x0,x0,#0x444
00ab8448	add x2,x2,#0x8c8
00ab844c	mov w1,#0xcf
00ab8450	bl 0x00c342b0
00ab8454	mov w1,#0xd
00ab8458	mov w0,#0x9
00ab845c	movk w1,#0x8, LSL #16
00ab8460	mov x2,xzr
00ab8464	bl 0x00c342c0
00ab8468	b 0x00ab84a0
00ab846c	bl 0x00c342a0
00ab8470	adrp x0,0x2d6000
00ab8474	adrp x2,0x29e000
00ab8478	add x0,x0,#0x444
00ab847c	add x2,x2,#0x8c8
00ab8480	mov w1,#0x9f
00ab8484	bl 0x00c342b0
00ab8488	mov w0,#0x9
00ab848c	mov w1,#0x68
00ab8490	mov x2,xzr
00ab8494	bl 0x00c342c0
00ab8498	mov x0,x23
00ab849c	bl 0x00c382f0
00ab84a0	mov x26,xzr
00ab84a4	ldur x0,[x29, #-0x60]
00ab84a8	adrp x20,0x2d6000
00ab84ac	add x20,x20,#0x444
00ab84b0	mov w2,#0xd1
00ab84b4	mov x1,x20
00ab84b8	bl 0x00c35700
00ab84bc	ldp x1,x0,[x29, #-0x78]
00ab84c0	mov w3,#0xd2
00ab84c4	mov x2,x20
00ab84c8	bl 0x00c38e10
00ab84cc	cbz x26,0x00ab8304
00ab84d0	bl 0x00c35240
00ab84d4	add x0,sp,#0x8
00ab84d8	bl 0x00c3b6b0
00ab84dc	cbz x19,0x00ab84f0
00ab84e0	mov x0,x19
00ab84e4	bl 0x00c35630
00ab84e8	mov x0,x19
00ab84ec	bl 0x00c31a40
00ab84f0	mov x0,x26
00ab84f4	add sp,sp,#0x460
00ab84f8	ldp x29,x30,[sp, #0x50]
00ab84fc	ldp x20,x19,[sp, #0x40]
00ab8500	ldp x22,x21,[sp, #0x30]
00ab8504	ldp x24,x23,[sp, #0x20]
00ab8508	ldp x26,x25,[sp, #0x10]
00ab850c	ldp x28,x27,[sp], #0x60
00ab8510	ret
00ab8514	ldur x0,[x29, #-0x60]
00ab8518	adrp x1,0x2b8000
00ab851c	add x1,x1,#0x4e1
00ab8520	bl 0x00c3f270
00ab8524	cmp w0,#0x1
00ab8528	b.lt 0x00ab842c
00ab852c	mov w21,w0
00ab8530	bl 0x00c36450
00ab8534	mov x26,x0
00ab8538	cbz x0,0x00ab84a4
00ab853c	ldur x1,[x29, #-0x60]
00ab8540	mov x0,x26
00ab8544	mov w2,w21
00ab8548	bl 0x00c3d980
00ab854c	cbz w0,0x00ab8584
00ab8550	ldr x8,[x26, #0x8]
00ab8554	ldr x8,[x8, #0x70]
00ab8558	cbz x8,0x00ab8584
00ab855c	ldur w2,[x29, #-0x78]
00ab8560	sub x1,x29,#0x68
00ab8564	mov x0,x26
00ab8568	blr x8
00ab856c	cbz w0,0x00ab8584
00ab8570	cbz x20,0x00ab84a4
00ab8574	ldr x0,[x20]
00ab8578	bl 0x00c32450
00ab857c	str x26,[x20]
00ab8580	b 0x00ab84a4
00ab8584	mov x0,x26
00ab8588	bl 0x00c32450
00ab858c	b 0x00ab84a0
