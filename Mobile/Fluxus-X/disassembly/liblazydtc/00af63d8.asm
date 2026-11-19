; FUN_00af63d8 @ 00af63d8
00af63d8	str x25,[sp, #-0x50]!
00af63dc	stp x22,x21,[sp, #0x20]
00af63e0	mov w21,w3
00af63e4	sxtw x22,w21
00af63e8	stp x24,x23,[sp, #0x10]
00af63ec	stp x20,x19,[sp, #0x30]
00af63f0	mov x20,x2
00af63f4	mov x23,x1
00af63f8	mov x19,x0
00af63fc	mov x0,x1
00af6400	mov x1,x2
00af6404	mov x2,x22
00af6408	stp x29,x30,[sp, #0x40]
00af640c	add x29,sp,#0x40
00af6410	bl 0x00c300b0
00af6414	cmp w0,#0x0
00af6418	mov w0,wzr
00af641c	b.le 0x00af6438
00af6420	ldp x29,x30,[sp, #0x40]
00af6424	ldp x20,x19,[sp, #0x30]
00af6428	ldp x22,x21,[sp, #0x20]
00af642c	ldp x24,x23,[sp, #0x10]
00af6430	ldr x25,[sp], #0x50
00af6434	ret
00af6438	mov x0,x23
00af643c	mov x1,x20
00af6440	mov w2,w21
00af6444	bl 0x00af6c48
00af6448	tbnz w0,#0x1f,0x00af6474
00af644c	mov w2,w0
00af6450	mov x0,x19
00af6454	mov x1,x23
00af6458	mov w3,w21
00af645c	ldp x29,x30,[sp, #0x40]
00af6460	ldp x20,x19,[sp, #0x30]
00af6464	ldp x22,x21,[sp, #0x20]
00af6468	ldp x24,x23,[sp, #0x10]
00af646c	ldr x25,[sp], #0x50
00af6470	b 0x00af6210
00af6474	adrp x0,0xc7e000
00af6478	add x0,x0,#0x788
00af647c	bl 0x00c372e0
00af6480	cbz x0,0x00af6420
00af6484	mov w8,#0x1
00af6488	mov x21,x0
00af648c	str w8,[x0]
00af6490	adrp x0,0xc7e000
00af6494	add x0,x0,#0x750
00af6498	bl 0x00c372e0
00af649c	str x0,[x21, #0x8]
00af64a0	cbz x0,0x00af664c
00af64a4	ldr x8,[x0]
00af64a8	cbnz x8,0x00af64c0
00af64ac	bl 0x00c38040
00af64b0	ldr x8,[x21, #0x8]
00af64b4	str x0,[x8]
00af64b8	cbz x0,0x00af664c
00af64bc	ldr x0,[x21, #0x8]
00af64c0	ldr x8,[x0, #0x8]
00af64c4	cbnz x8,0x00af64d8
00af64c8	bl 0x00c38040
00af64cc	ldr x8,[x21, #0x8]
00af64d0	str x0,[x8, #0x8]
00af64d4	cbz x0,0x00af664c
00af64d8	orr x8,xzr,#-0x100000000
00af64dc	add x10,x8,x22, LSL #0x20
00af64e0	mov x9,x22
00af64e4	mov x2,x9
00af64e8	subs x9,x9,#0x1
00af64ec	mov x24,x10
00af64f0	b.lt 0x00af650c
00af64f4	add x10,x23,x2
00af64f8	ldurb w11,[x10, #-0x1]
00af64fc	add x10,x24,x8
00af6500	cbz w11,0x00af64e4
00af6504	mov w25,#0x1
00af6508	b 0x00af6510
00af650c	mov w25,wzr
00af6510	ldr x8,[x21, #0x8]
00af6514	mov x1,x23
00af6518	ldr x0,[x8]
00af651c	bl 0x00c373c0
00af6520	cbz w0,0x00af664c
00af6524	ldr x8,[x21, #0x8]
00af6528	ldr x8,[x8]
00af652c	ldr x9,[x8, #0x10]
00af6530	and x9,x9,#-0x8
00af6534	str x9,[x8, #0x10]
00af6538	ldr x8,[x21, #0x8]
00af653c	ldr x8,[x8]
00af6540	ldr x9,[x8, #0x10]
00af6544	orr x9,x9,#0x8
00af6548	str x9,[x8, #0x10]
00af654c	cbz w25,0x00af658c
00af6550	asr x8,x24,#0x20
00af6554	ldrb w9,[x23, x8]
00af6558	orr x8,xzr,#-0x8
00af655c	orr w10,wzr,#0xff
00af6560	add w11,w8,#0x9
00af6564	lsr w11,w10,w11
00af6568	tst w11,w9
00af656c	add x8,x8,#0x1
00af6570	b.ne 0x00af6560
00af6574	ldr x9,[x21, #0x8]
00af6578	neg x8,x8
00af657c	ldr x9,[x9]
00af6580	ldr x10,[x9, #0x10]
00af6584	orr x8,x10,x8
00af6588	str x8,[x9, #0x10]
00af658c	orr x8,xzr,#-0x100000000
00af6590	add x9,x8,x22, LSL #0x20
00af6594	mov x2,x22
00af6598	subs x22,x22,#0x1
00af659c	mov x23,x9
00af65a0	b.lt 0x00af65c0
00af65a4	add x9,x20,x2
00af65a8	ldurb w9,[x9, #-0x1]
00af65ac	cmp w9,#0xff
00af65b0	add x9,x23,x8
00af65b4	b.eq 0x00af6594
00af65b8	mov w22,#0x1
00af65bc	b 0x00af65c4
00af65c0	mov w22,wzr
00af65c4	ldr x8,[x21, #0x8]
00af65c8	mov x1,x20
00af65cc	ldr x0,[x8, #0x8]
00af65d0	bl 0x00c373c0
00af65d4	cbz w0,0x00af664c
00af65d8	ldr x8,[x21, #0x8]
00af65dc	ldr x8,[x8, #0x8]
00af65e0	ldr x9,[x8, #0x10]
00af65e4	and x9,x9,#-0x8
00af65e8	str x9,[x8, #0x10]
00af65ec	ldr x8,[x21, #0x8]
00af65f0	ldr x8,[x8, #0x8]
00af65f4	ldr x9,[x8, #0x10]
00af65f8	orr x9,x9,#0x8
00af65fc	str x9,[x8, #0x10]
00af6600	cbz w22,0x00af6640
00af6604	asr x8,x23,#0x20
00af6608	ldrb w9,[x20, x8]
00af660c	orr x8,xzr,#-0x8
00af6610	orr w10,wzr,#0xff
00af6614	add w11,w8,#0x9
00af6618	lsr w11,w10,w11
00af661c	bics wzr,w11,w9
00af6620	add x8,x8,#0x1
00af6624	b.ne 0x00af6614
00af6628	ldr x9,[x21, #0x8]
00af662c	neg x8,x8
00af6630	ldr x9,[x9, #0x8]
00af6634	ldr x10,[x9, #0x10]
00af6638	orr x8,x10,x8
00af663c	str x8,[x9, #0x10]
00af6640	str x21,[x19]
00af6644	mov w0,#0x1
00af6648	b 0x00af6420
00af664c	adrp x1,0xc7e000
00af6650	add x1,x1,#0x788
00af6654	mov x0,x21
00af6658	bl 0x00c36160
00af665c	mov w0,wzr
00af6660	b 0x00af6420
