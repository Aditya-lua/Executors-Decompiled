; FUN_00ac9190 @ 00ac9190
00ac9190	stp x24,x23,[sp, #-0x40]!
00ac9194	stp x22,x21,[sp, #0x10]
00ac9198	stp x20,x19,[sp, #0x20]
00ac919c	stp x29,x30,[sp, #0x30]
00ac91a0	ldr x24,[x1, #0x10]
00ac91a4	mov x21,x1
00ac91a8	adrp x1,0x2ce000
00ac91ac	mov x20,x2
00ac91b0	mov w22,w0
00ac91b4	add x1,x1,#0x291
00ac91b8	orr w0,wzr,#0xc0
00ac91bc	mov w2,#0x50
00ac91c0	add x29,sp,#0x30
00ac91c4	bl 0x00c34250
00ac91c8	mov x19,x0
00ac91cc	cbz x0,0x00ac93dc
00ac91d0	bl 0x00c34d50
00ac91d4	str x0,[x19, #0x28]
00ac91d8	cbz x0,0x00ac93dc
00ac91dc	add x23,x19,#0x20
00ac91e0	mov w8,#0x1
00ac91e4	mov x0,x21
00ac91e8	stlr w8,[x23]
00ac91ec	str w22,[x19, #0x8]
00ac91f0	bl 0x00c3b4e0
00ac91f4	str x0,[x19, #0x10]
00ac91f8	cbz x0,0x00ac93bc
00ac91fc	ldr x13,[x21, #0x18]
00ac9200	mov w10,wzr
00ac9204	mov w9,wzr
00ac9208	mov w11,wzr
00ac920c	str x13,[x19, #0x18]
00ac9210	adrp x13,0x774000
00ac9214	mov w8,wzr
00ac9218	add x12,x24,#0x8
00ac921c	add x13,x13,#0x72c
00ac9220	str x24,[x19, #0x30]
00ac9224	b 0x00ac922c
00ac9228	add x12,x12,#0x10
00ac922c	ldur w14,[x12, #-0x8]
00ac9230	cmp w14,#0x11
00ac9234	b.hi 0x00ac9228
00ac9238	ldrsw x14,[x13, x14, LSL #0x2]
00ac923c	add x14,x14,x13
00ac9240	br x14
00ac9244	ldr x14,[x19, #0x38]
00ac9248	cbnz x14,0x00ac9228
00ac924c	ldr x14,[x12], #0x10
00ac9250	add w9,w9,#0x1
00ac9254	str x14,[x19, #0x38]
00ac9258	b 0x00ac922c
00ac925c	ldr x14,[x19, #0x40]
00ac9260	cbnz x14,0x00ac9228
00ac9264	ldr x14,[x12], #0x10
00ac9268	add w9,w9,#0x1
00ac926c	str x14,[x19, #0x40]
00ac9270	b 0x00ac922c
00ac9274	ldr x14,[x19, #0x48]
00ac9278	cbnz x14,0x00ac9228
00ac927c	ldr x14,[x12], #0x10
00ac9280	add w10,w10,#0x1
00ac9284	str x14,[x19, #0x48]
00ac9288	b 0x00ac922c
00ac928c	ldr x14,[x19, #0x50]
00ac9290	cbnz x14,0x00ac9228
00ac9294	ldr x14,[x12], #0x10
00ac9298	add w10,w10,#0x1
00ac929c	str x14,[x19, #0x50]
00ac92a0	b 0x00ac922c
00ac92a4	ldr x14,[x19, #0x58]
00ac92a8	cbnz x14,0x00ac9228
00ac92ac	ldr x14,[x12], #0x10
00ac92b0	add w10,w10,#0x1
00ac92b4	str x14,[x19, #0x58]
00ac92b8	b 0x00ac922c
00ac92bc	ldr x14,[x19, #0x60]
00ac92c0	cbnz x14,0x00ac9228
00ac92c4	ldr x14,[x12], #0x10
00ac92c8	str x14,[x19, #0x60]
00ac92cc	b 0x00ac922c
00ac92d0	ldr x14,[x19, #0x68]
00ac92d4	cbnz x14,0x00ac9228
00ac92d8	ldr x14,[x12], #0x10
00ac92dc	str x14,[x19, #0x68]
00ac92e0	b 0x00ac922c
00ac92e4	ldr x14,[x19, #0x70]
00ac92e8	cbnz x14,0x00ac9228
00ac92ec	ldr x14,[x12], #0x10
00ac92f0	add w8,w8,#0x1
00ac92f4	str x14,[x19, #0x70]
00ac92f8	b 0x00ac922c
00ac92fc	ldr x14,[x19, #0x78]
00ac9300	cbnz x14,0x00ac9228
00ac9304	ldr x14,[x12], #0x10
00ac9308	add w11,w11,#0x1
00ac930c	str x14,[x19, #0x78]
00ac9310	b 0x00ac922c
00ac9314	ldr x14,[x19, #0x80]
00ac9318	cbnz x14,0x00ac9228
00ac931c	ldr x14,[x12], #0x10
00ac9320	add w11,w11,#0x1
00ac9324	str x14,[x19, #0x80]
00ac9328	b 0x00ac922c
00ac932c	ldr x14,[x19, #0x88]
00ac9330	cbnz x14,0x00ac9228
00ac9334	ldr x14,[x12], #0x10
00ac9338	str x14,[x19, #0x88]
00ac933c	b 0x00ac922c
00ac9340	ldr x14,[x19, #0x90]
00ac9344	cbnz x14,0x00ac9228
00ac9348	ldr x14,[x12], #0x10
00ac934c	str x14,[x19, #0x90]
00ac9350	b 0x00ac922c
00ac9354	ldr x14,[x19, #0x98]
00ac9358	cbnz x14,0x00ac9228
00ac935c	ldr x14,[x12], #0x10
00ac9360	str x14,[x19, #0x98]
00ac9364	b 0x00ac922c
00ac9368	ldr x14,[x19, #0xa0]
00ac936c	cbnz x14,0x00ac9228
00ac9370	ldr x14,[x12], #0x10
00ac9374	str x14,[x19, #0xa0]
00ac9378	b 0x00ac922c
00ac937c	ldr x14,[x19, #0xa8]
00ac9380	cbnz x14,0x00ac9228
00ac9384	ldr x14,[x12], #0x10
00ac9388	add w9,w9,#0x1
00ac938c	str x14,[x19, #0xa8]
00ac9390	b 0x00ac922c
00ac9394	ldr x14,[x19, #0xb0]
00ac9398	cbnz x14,0x00ac9228
00ac939c	ldr x14,[x12], #0x10
00ac93a0	str x14,[x19, #0xb0]
00ac93a4	b 0x00ac922c
00ac93a8	ldr x14,[x19, #0xb8]
00ac93ac	cbnz x14,0x00ac9228
00ac93b0	ldr x14,[x12]
00ac93b4	str x14,[x19, #0xb8]
00ac93b8	b 0x00ac9228
00ac93bc	ldxr w8,[x23]
00ac93c0	subs w9,w8,#0x1
00ac93c4	stxr w10,w9,[x23]
00ac93c8	cbnz w10,0x00ac93bc
00ac93cc	b.ne 0x00ac94b8
00ac93d0	dmb ISHLD
00ac93d4	ldr x0,[x19, #0x10]
00ac93d8	b 0x00ac94c8
00ac93dc	adrp x20,0x2ce000
00ac93e0	add x20,x20,#0x291
00ac93e4	mov w2,#0x54
00ac93e8	mov x0,x19
00ac93ec	mov x1,x20
00ac93f0	bl 0x00c32310
00ac93f4	bl 0x00c342a0
00ac93f8	adrp x2,0x2ca000
00ac93fc	add x2,x2,#0x337
00ac9400	orr w1,wzr,#0x7f
00ac9404	mov x0,x20
00ac9408	bl 0x00c342b0
00ac940c	mov w1,#0x100
00ac9410	orr w0,wzr,#0x6
00ac9414	movk w1,#0xc, LSL #16
00ac9418	mov x2,xzr
00ac941c	bl 0x00c342c0
00ac9420	mov x1,xzr
00ac9424	ldp x29,x30,[sp, #0x30]
00ac9428	ldp x20,x19,[sp, #0x20]
00ac942c	ldp x22,x21,[sp, #0x10]
00ac9430	mov x0,x1
00ac9434	ldp x24,x23,[sp], #0x40
00ac9438	ret
00ac943c	orr w11,w11,#0x2
00ac9440	cmp w11,#0x2
00ac9444	b.ne 0x00ac947c
00ac9448	cmp w10,#0x3
00ac944c	b.ne 0x00ac947c
00ac9450	cmp w9,#0x3
00ac9454	b.ne 0x00ac947c
00ac9458	cmp w8,#0x2
00ac945c	b.cs 0x00ac947c
00ac9460	cbz x20,0x00ac9470
00ac9464	mov x0,x20
00ac9468	bl 0x00c3b6a0
00ac946c	cbz w0,0x00ac949c
00ac9470	mov x1,x19
00ac9474	str x20,[x19]
00ac9478	b 0x00ac9424
00ac947c	ldxr w8,[x23]
00ac9480	subs w9,w8,#0x1
00ac9484	stxr w10,w9,[x23]
00ac9488	cbnz w10,0x00ac947c
00ac948c	b.ne 0x00ac9500
00ac9490	dmb ISHLD
00ac9494	ldr x0,[x19, #0x10]
00ac9498	b 0x00ac9508
00ac949c	ldxr w8,[x23]
00ac94a0	subs w9,w8,#0x1
00ac94a4	stxr w10,w9,[x23]
00ac94a8	cbnz w10,0x00ac949c
00ac94ac	b.ne 0x00ac9564
00ac94b0	dmb ISHLD
00ac94b4	b 0x00ac956c
00ac94b8	mov x0,xzr
00ac94bc	cmp w8,#0x1
00ac94c0	mov x1,xzr
00ac94c4	b.gt 0x00ac9424
00ac94c8	adrp x20,0x2ce000
00ac94cc	add x20,x20,#0x291
00ac94d0	mov w2,#0x48
00ac94d4	mov x1,x20
00ac94d8	bl 0x00c32310
00ac94dc	ldr x0,[x19]
00ac94e0	bl 0x00c3b690
00ac94e4	ldr x0,[x19, #0x28]
00ac94e8	bl 0x00c34d40
00ac94ec	mov w2,#0x4b
00ac94f0	mov x0,x19
00ac94f4	mov x1,x20
00ac94f8	bl 0x00c32310
00ac94fc	b 0x00ac9420
00ac9500	cmp w8,#0x1
00ac9504	b.gt 0x00ac953c
00ac9508	adrp x20,0x2ce000
00ac950c	add x20,x20,#0x291
00ac9510	mov w2,#0x48
00ac9514	mov x1,x20
00ac9518	bl 0x00c32310
00ac951c	ldr x0,[x19]
00ac9520	bl 0x00c3b690
00ac9524	ldr x0,[x19, #0x28]
00ac9528	bl 0x00c34d40
00ac952c	mov w2,#0x4b
00ac9530	mov x0,x19
00ac9534	mov x1,x20
00ac9538	bl 0x00c32310
00ac953c	bl 0x00c342a0
00ac9540	adrp x0,0x2ce000
00ac9544	adrp x2,0x2ca000
00ac9548	add x0,x0,#0x291
00ac954c	add x2,x2,#0x337
00ac9550	mov w1,#0x103
00ac9554	bl 0x00c342b0
00ac9558	orr w0,wzr,#0x6
00ac955c	mov w1,#0xc1
00ac9560	b 0x00ac9418
00ac9564	cmp w8,#0x1
00ac9568	b.gt 0x00ac95a4
00ac956c	ldr x0,[x19, #0x10]
00ac9570	adrp x20,0x2ce000
00ac9574	add x20,x20,#0x291
00ac9578	mov w2,#0x48
00ac957c	mov x1,x20
00ac9580	bl 0x00c32310
00ac9584	ldr x0,[x19]
00ac9588	bl 0x00c3b690
00ac958c	ldr x0,[x19, #0x28]
00ac9590	bl 0x00c34d40
00ac9594	mov w2,#0x4b
00ac9598	mov x0,x19
00ac959c	mov x1,x20
00ac95a0	bl 0x00c32310
00ac95a4	bl 0x00c342a0
00ac95a8	adrp x0,0x2ce000
00ac95ac	adrp x2,0x2ca000
00ac95b0	add x0,x0,#0x291
00ac95b4	add x2,x2,#0x337
00ac95b8	mov w1,#0x109
00ac95bc	bl 0x00c342b0
00ac95c0	mov w8,#0x100
00ac95c4	movk w8,#0xc, LSL #16
00ac95c8	add w1,w8,#0x3
00ac95cc	orr w0,wzr,#0x6
00ac95d0	b 0x00ac9418
