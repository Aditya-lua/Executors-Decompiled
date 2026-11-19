; FUN_00bd9300 @ 00bd9300
00bd9300	paciasp
00bd9304	sub sp,sp,#0x60
00bd9308	stp x29,x30,[sp, #0x20]
00bd930c	stp x24,x23,[sp, #0x30]
00bd9310	stp x22,x21,[sp, #0x40]
00bd9314	stp x20,x19,[sp, #0x50]
00bd9318	add x29,sp,#0x20
00bd931c	ldrb w8,[x0, #0x60]
00bd9320	mov x19,x0
00bd9324	cmp w8,#0x1
00bd9328	b.ne 0x00bd9344
00bd932c	ldr w0,[x19, #0x5c]
00bd9330	tbz w1,#0x0,0x00bd948c
00bd9334	mov w8,#0xffffffff
00bd9338	strb wzr,[x19, #0x60]
00bd933c	str w8,[x19, #0x5c]
00bd9340	b 0x00bd948c
00bd9344	ldrb w8,[x19, #0x61]
00bd9348	mov w20,w1
00bd934c	cmp w8,#0x1
00bd9350	b.ne 0x00bd9374
00bd9354	ldr x0,[x19, #0x40]
00bd9358	bl 0x00c30c20
00bd935c	cmn w0,#0x1
00bd9360	b.eq 0x00bd948c
00bd9364	and w0,w0,#0xff
00bd9368	tbz w20,#0x0,0x00bd9410
00bd936c	str w0,[x19, #0x5c]
00bd9370	b 0x00bd948c
00bd9374	ldr w8,[x19, #0x58]
00bd9378	mov x22,xzr
00bd937c	sub x23,x29,#0x8
00bd9380	cmp w8,#0x1
00bd9384	csinc w21,w8,wzr,gt
00bd9388	ldr x0,[x19, #0x40]
00bd938c	bl 0x00c30c20
00bd9390	cmn w0,#0x1
00bd9394	b.eq 0x00bd948c
00bd9398	strb w0,[x23, x22]
00bd939c	add x22,x22,#0x1
00bd93a0	cmp x21,x22
00bd93a4	b.ne 0x00bd9388
00bd93a8	sub x22,x29,#0xc
00bd93ac	sub x23,x29,#0x8
00bd93b0	ldp x0,x1,[x19, #0x48]
00bd93b4	sub x2,x29,#0x8
00bd93b8	add x3,x23,x21
00bd93bc	add x4,sp,#0x8
00bd93c0	sub x5,x29,#0xc
00bd93c4	orr x6,x22,#0x1
00bd93c8	mov x7,sp
00bd93cc	ldr x8,[x0]
00bd93d0	ldr x24,[x1]
00bd93d4	ldr x8,[x8, #0x20]
00bd93d8	blr x8
00bd93dc	cmp w0,#0x1
00bd93e0	b.ne 0x00bd9428
00bd93e4	ldr x8,[x19, #0x50]
00bd93e8	cmp x21,#0x8
00bd93ec	str x24,[x8]
00bd93f0	b.eq 0x00bd9450
00bd93f4	ldr x0,[x19, #0x40]
00bd93f8	bl 0x00c30c20
00bd93fc	cmn w0,#0x1
00bd9400	b.eq 0x00bd948c
00bd9404	strb w0,[x23, x21]
00bd9408	add x21,x21,#0x1
00bd940c	b 0x00bd93b0
00bd9410	ldr x1,[x19, #0x40]
00bd9414	mov w19,w0
00bd9418	bl 0x00c43910
00bd941c	cmn w0,#0x1
00bd9420	csinv w0,w19,wzr,ne
00bd9424	b 0x00bd948c
00bd9428	cmp w0,#0x2
00bd942c	b.eq 0x00bd9450
00bd9430	cmp w0,#0x3
00bd9434	b.ne 0x00bd9440
00bd9438	ldurb w8,[x29, #-0x8]
00bd943c	sturb w8,[x29, #-0xc]
00bd9440	tbz w20,#0x0,0x00bd9458
00bd9444	ldurb w0,[x29, #-0xc]
00bd9448	str w0,[x19, #0x5c]
00bd944c	b 0x00bd948c
00bd9450	mov w0,#0xffffffff
00bd9454	b 0x00bd948c
00bd9458	sub x9,x29,#0x8
00bd945c	mov w8,w21
00bd9460	sub x20,x9,#0x1
00bd9464	subs x21,x8,#0x1
00bd9468	b.lt 0x00bd9488
00bd946c	ldrb w0,[x20, x8]
00bd9470	ldr x1,[x19, #0x40]
00bd9474	bl 0x00c43910
00bd9478	cmn w0,#0x1
00bd947c	mov x8,x21
00bd9480	b.ne 0x00bd9464
00bd9484	b 0x00bd948c
00bd9488	ldurb w0,[x29, #-0xc]
00bd948c	ldp x20,x19,[sp, #0x50]
00bd9490	ldp x22,x21,[sp, #0x40]
00bd9494	ldp x24,x23,[sp, #0x30]
00bd9498	ldp x29,x30,[sp, #0x20]
00bd949c	add sp,sp,#0x60
00bd94a0	autiasp
00bd94a4	ret
