; CRYPTO_ctr128_encrypt @ 00aa91d4
00aa91d4	sub sp,sp,#0x80
00aa91d8	stp x28,x27,[sp, #0x20]
00aa91dc	stp x26,x25,[sp, #0x30]
00aa91e0	stp x24,x23,[sp, #0x40]
00aa91e4	stp x22,x21,[sp, #0x50]
00aa91e8	stp x20,x19,[sp, #0x60]
00aa91ec	stp x29,x30,[sp, #0x70]
00aa91f0	ldr w28,[x6]
00aa91f4	mov x24,x7
00aa91f8	mov x20,x5
00aa91fc	mov x23,x4
00aa9200	mov x25,x3
00aa9204	mov x21,x2
00aa9208	mov x26,x1
00aa920c	mov x22,x0
00aa9210	add x29,sp,#0x70
00aa9214	str x6,[sp, #0x18]
00aa9218	cbz x2,0x00aa9244
00aa921c	cbz w28,0x00aa9244
00aa9220	ldrb w8,[x22], #0x1
00aa9224	ldrb w9,[x20, w28, UXTW ]
00aa9228	add w10,w28,#0x1
00aa922c	subs x21,x21,#0x1
00aa9230	and w28,w10,#0xf
00aa9234	eor w8,w9,w8
00aa9238	strb w8,[x26], #0x1
00aa923c	b.eq 0x00aa9244
00aa9240	cbnz w28,0x00aa9220
00aa9244	subs x19,x21,#0x10
00aa9248	b.cc 0x00aa9384
00aa924c	and x8,x19,#-0x10
00aa9250	str x8,[sp, #0x8]
00aa9254	add x8,x8,#0x10
00aa9258	add x27,x26,x8
00aa925c	mov x28,x22
00aa9260	str x8,[sp, #0x10]
00aa9264	mov x0,x23
00aa9268	mov x1,x20
00aa926c	mov x2,x25
00aa9270	blr x24
00aa9274	ldrb w8,[x23, #0xf]
00aa9278	ldrb w9,[x23, #0xe]
00aa927c	ldrb w10,[x23, #0xd]
00aa9280	sub x21,x21,#0x10
00aa9284	add w8,w8,#0x1
00aa9288	strb w8,[x23, #0xf]
00aa928c	add w8,w9,w8, LSR #0x8
00aa9290	ldrb w9,[x23, #0xc]
00aa9294	strb w8,[x23, #0xe]
00aa9298	add w8,w10,w8, LSR #0x8
00aa929c	ldrb w10,[x23, #0xb]
00aa92a0	strb w8,[x23, #0xd]
00aa92a4	add w8,w9,w8, LSR #0x8
00aa92a8	ldrb w9,[x23, #0xa]
00aa92ac	strb w8,[x23, #0xc]
00aa92b0	add w8,w10,w8, LSR #0x8
00aa92b4	ldrb w10,[x23, #0x9]
00aa92b8	strb w8,[x23, #0xb]
00aa92bc	add w8,w9,w8, LSR #0x8
00aa92c0	ldrb w9,[x23, #0x8]
00aa92c4	strb w8,[x23, #0xa]
00aa92c8	add w8,w10,w8, LSR #0x8
00aa92cc	ldrb w10,[x23, #0x7]
00aa92d0	strb w8,[x23, #0x9]
00aa92d4	add w8,w9,w8, LSR #0x8
00aa92d8	ldrb w9,[x23, #0x6]
00aa92dc	strb w8,[x23, #0x8]
00aa92e0	add w8,w10,w8, LSR #0x8
00aa92e4	ldrb w10,[x23, #0x5]
00aa92e8	strb w8,[x23, #0x7]
00aa92ec	add w8,w9,w8, LSR #0x8
00aa92f0	ldrb w9,[x23, #0x4]
00aa92f4	strb w8,[x23, #0x6]
00aa92f8	add w8,w10,w8, LSR #0x8
00aa92fc	ldrb w10,[x23, #0x3]
00aa9300	strb w8,[x23, #0x5]
00aa9304	add w8,w9,w8, LSR #0x8
00aa9308	ldrb w9,[x23, #0x2]
00aa930c	strb w8,[x23, #0x4]
00aa9310	add w8,w10,w8, LSR #0x8
00aa9314	ldrb w10,[x23, #0x1]
00aa9318	strb w8,[x23, #0x3]
00aa931c	add w8,w9,w8, LSR #0x8
00aa9320	ldrb w9,[x23]
00aa9324	strb w8,[x23, #0x2]
00aa9328	add w8,w10,w8, LSR #0x8
00aa932c	strb w8,[x23, #0x1]
00aa9330	add w8,w9,w8, LSR #0x8
00aa9334	strb w8,[x23]
00aa9338	ldr x8,[x28]
00aa933c	ldr x9,[x20]
00aa9340	cmp x21,#0xf
00aa9344	eor x8,x9,x8
00aa9348	str x8,[x26]
00aa934c	ldr x8,[x28, #0x8]
00aa9350	ldr x9,[x20, #0x8]
00aa9354	add x28,x28,#0x10
00aa9358	eor x8,x9,x8
00aa935c	str x8,[x26, #0x8]
00aa9360	add x26,x26,#0x10
00aa9364	b.hi 0x00aa9264
00aa9368	ldr x8,[sp, #0x8]
00aa936c	mov w28,wzr
00aa9370	sub x21,x19,x8
00aa9374	ldr x8,[sp, #0x10]
00aa9378	add x22,x22,x8
00aa937c	cbnz x21,0x00aa938c
00aa9380	b 0x00aa9544
00aa9384	mov x27,x26
00aa9388	cbz x21,0x00aa9544
00aa938c	mov x0,x23
00aa9390	mov x1,x20
00aa9394	mov x2,x25
00aa9398	blr x24
00aa939c	ldrb w8,[x23, #0xf]
00aa93a0	ldrb w9,[x23, #0xe]
00aa93a4	ldrb w10,[x23, #0xd]
00aa93a8	cmp x21,#0x20
00aa93ac	add w8,w8,#0x1
00aa93b0	strb w8,[x23, #0xf]
00aa93b4	add w8,w9,w8, LSR #0x8
00aa93b8	ldrb w9,[x23, #0xc]
00aa93bc	strb w8,[x23, #0xe]
00aa93c0	add w8,w10,w8, LSR #0x8
00aa93c4	ldrb w10,[x23, #0xb]
00aa93c8	strb w8,[x23, #0xd]
00aa93cc	add w8,w9,w8, LSR #0x8
00aa93d0	ldrb w9,[x23, #0xa]
00aa93d4	strb w8,[x23, #0xc]
00aa93d8	add w8,w10,w8, LSR #0x8
00aa93dc	ldrb w10,[x23, #0x9]
00aa93e0	strb w8,[x23, #0xb]
00aa93e4	add w8,w9,w8, LSR #0x8
00aa93e8	ldrb w9,[x23, #0x8]
00aa93ec	strb w8,[x23, #0xa]
00aa93f0	add w8,w10,w8, LSR #0x8
00aa93f4	ldrb w10,[x23, #0x7]
00aa93f8	strb w8,[x23, #0x9]
00aa93fc	add w8,w9,w8, LSR #0x8
00aa9400	ldrb w9,[x23, #0x6]
00aa9404	strb w8,[x23, #0x8]
00aa9408	add w8,w10,w8, LSR #0x8
00aa940c	ldrb w10,[x23, #0x5]
00aa9410	strb w8,[x23, #0x7]
00aa9414	add w8,w9,w8, LSR #0x8
00aa9418	ldrb w9,[x23, #0x4]
00aa941c	strb w8,[x23, #0x6]
00aa9420	add w8,w10,w8, LSR #0x8
00aa9424	ldrb w10,[x23, #0x3]
00aa9428	strb w8,[x23, #0x5]
00aa942c	add w8,w9,w8, LSR #0x8
00aa9430	ldrb w9,[x23, #0x2]
00aa9434	strb w8,[x23, #0x4]
00aa9438	add w8,w10,w8, LSR #0x8
00aa943c	ldrb w10,[x23, #0x1]
00aa9440	strb w8,[x23, #0x3]
00aa9444	add w8,w9,w8, LSR #0x8
00aa9448	ldrb w9,[x23]
00aa944c	strb w8,[x23, #0x2]
00aa9450	add w8,w10,w8, LSR #0x8
00aa9454	strb w8,[x23, #0x1]
00aa9458	add w8,w9,w8, LSR #0x8
00aa945c	strb w8,[x23]
00aa9460	b.cc 0x00aa9518
00aa9464	sub x8,x21,#0x1
00aa9468	cmn w28,w8
00aa946c	b.cs 0x00aa9518
00aa9470	lsr x8,x8,#0x20
00aa9474	cbnz x8,0x00aa9518
00aa9478	mov w8,w28
00aa947c	add x10,x21,x8
00aa9480	add x9,x27,x8
00aa9484	add x11,x22,x8
00aa9488	add x12,x20,x8
00aa948c	add x8,x22,x10
00aa9490	add x13,x27,x10
00aa9494	cmp x9,x8
00aa9498	add x10,x20,x10
00aa949c	cset w8,cc
00aa94a0	cmp x11,x13
00aa94a4	cset w11,cc
00aa94a8	cmp x9,x10
00aa94ac	and w10,w8,w11
00aa94b0	cset w8,cc
00aa94b4	cmp x12,x13
00aa94b8	cset w9,cc
00aa94bc	tbnz w10,#0x0,0x00aa9518
00aa94c0	and w8,w8,w9
00aa94c4	tbnz w8,#0x0,0x00aa9518
00aa94c8	and x10,x21,#-0x20
00aa94cc	add w8,w28,w10
00aa94d0	sub x9,x21,x10
00aa94d4	mov x11,x10
00aa94d8	mov w12,w28
00aa94dc	mov w13,w12
00aa94e0	add x14,x22,x13
00aa94e4	add x15,x20,x13
00aa94e8	ldp q0,q1,[x14]
00aa94ec	ldp q2,q3,[x15]
00aa94f0	subs x11,x11,#0x20
00aa94f4	add x13,x27,x13
00aa94f8	add w12,w12,#0x20
00aa94fc	eor v0.16B,v2.16B,v0.16B
00aa9500	eor v1.16B,v3.16B,v1.16B
00aa9504	stp q0,q1,[x13]
00aa9508	b.ne 0x00aa94dc
00aa950c	cmp x21,x10
00aa9510	b.ne 0x00aa9520
00aa9514	b 0x00aa9540
00aa9518	mov w8,w28
00aa951c	mov x9,x21
00aa9520	mov w10,w8
00aa9524	ldrb w11,[x22, x10]
00aa9528	ldrb w12,[x20, x10]
00aa952c	subs x9,x9,#0x1
00aa9530	add w8,w8,#0x1
00aa9534	eor w11,w12,w11
00aa9538	strb w11,[x27, x10]
00aa953c	b.ne 0x00aa9520
00aa9540	add w28,w28,w21
00aa9544	ldr x8,[sp, #0x18]
00aa9548	str w28,[x8]
00aa954c	ldp x29,x30,[sp, #0x70]
00aa9550	ldp x20,x19,[sp, #0x60]
00aa9554	ldp x22,x21,[sp, #0x50]
00aa9558	ldp x24,x23,[sp, #0x40]
00aa955c	ldp x26,x25,[sp, #0x30]
00aa9560	ldp x28,x27,[sp, #0x20]
00aa9564	add sp,sp,#0x80
00aa9568	ret
