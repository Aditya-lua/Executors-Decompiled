; X509v3_asid_add_id_or_range @ 00af927c
00af927c	stp x22,x21,[sp, #-0x30]!
00af9280	stp x20,x19,[sp, #0x10]
00af9284	stp x29,x30,[sp, #0x20]
00af9288	add x29,sp,#0x20
00af928c	cbz x0,0x00af93d0
00af9290	mov x20,x3
00af9294	mov x21,x2
00af9298	mov x19,x0
00af929c	cmp w1,#0x1
00af92a0	b.eq 0x00af92c8
00af92a4	mov w0,wzr
00af92a8	cbnz w1,0x00af93d0
00af92ac	ldr x8,[x19]
00af92b0	cbz x8,0x00af92d4
00af92b4	ldr w8,[x8]
00af92b8	mov w0,wzr
00af92bc	cmp w8,#0x1
00af92c0	b.eq 0x00af9310
00af92c4	b 0x00af93d0
00af92c8	add x19,x19,#0x8
00af92cc	ldr x8,[x19]
00af92d0	cbnz x8,0x00af92b4
00af92d4	adrp x0,0xc7e000
00af92d8	add x0,x0,#0xbc0
00af92dc	bl 0x00c372e0
00af92e0	str x0,[x19]
00af92e4	cbz x0,0x00af93d0
00af92e8	adrp x0,0xaf9000
00af92ec	add x0,x0,#0x3e0
00af92f0	bl 0x00c35340
00af92f4	ldr x8,[x19]
00af92f8	str x0,[x8, #0x8]
00af92fc	ldr x0,[x19]
00af9300	ldr x8,[x0, #0x8]
00af9304	cbz x8,0x00af9380
00af9308	mov w8,#0x1
00af930c	str w8,[x0]
00af9310	adrp x0,0xc7e000
00af9314	add x0,x0,#0xb88
00af9318	bl 0x00c372e0
00af931c	cbz x0,0x00af93d0
00af9320	ldr x8,[x19]
00af9324	mov x22,x0
00af9328	mov w1,#0x1
00af932c	ldr x0,[x8, #0x8]
00af9330	bl 0x00c40240
00af9334	cbz w0,0x00af93bc
00af9338	cbz x20,0x00af9398
00af933c	adrp x0,0xc7e000
00af9340	mov w8,#0x1
00af9344	add x0,x0,#0xb50
00af9348	str w8,[x22]
00af934c	bl 0x00c372e0
00af9350	str x0,[x22, #0x8]
00af9354	cbz x0,0x00af93bc
00af9358	ldr x0,[x0]
00af935c	bl 0x00c37c30
00af9360	ldr x8,[x22, #0x8]
00af9364	str x21,[x8]
00af9368	ldr x8,[x22, #0x8]
00af936c	ldr x0,[x8, #0x8]
00af9370	bl 0x00c37c30
00af9374	ldr x8,[x22, #0x8]
00af9378	str x20,[x8, #0x8]
00af937c	b 0x00af93a0
00af9380	adrp x1,0xc7e000
00af9384	add x1,x1,#0xbc0
00af9388	bl 0x00c36160
00af938c	mov w0,wzr
00af9390	str xzr,[x19]
00af9394	b 0x00af93d0
00af9398	str wzr,[x22]
00af939c	str x21,[x22, #0x8]
00af93a0	ldr x8,[x19]
00af93a4	mov x1,x22
00af93a8	ldr x0,[x8, #0x8]
00af93ac	bl 0x00c347a0
00af93b0	cbz w0,0x00af93bc
00af93b4	mov w0,#0x1
00af93b8	b 0x00af93d0
00af93bc	adrp x1,0xc7e000
00af93c0	add x1,x1,#0xb88
00af93c4	mov x0,x22
00af93c8	bl 0x00c36160
00af93cc	mov w0,wzr
00af93d0	ldp x29,x30,[sp, #0x20]
00af93d4	ldp x20,x19,[sp, #0x10]
00af93d8	ldp x22,x21,[sp], #0x30
00af93dc	ret
