; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be440c
00be440c	bti c
00be4410	adrp x5,0x2b5000
00be4414	add x5,x5,#0x52
00be4418	b 0x00be441c
00be441c	paciasp
00be4420	sub sp,sp,#0xa0
00be4424	stp x29,x30,[sp, #0x60]
00be4428	str x23,[sp, #0x70]
00be442c	stp x22,x21,[sp, #0x80]
00be4430	stp x20,x19,[sp, #0x90]
00be4434	add x29,sp,#0x60
00be4438	ldr w9,[x2, #0x8]
00be443c	mov w8,#0x25
00be4440	mov x22,x4
00be4444	mov w19,w3
00be4448	mov x20,x2
00be444c	mov x21,x1
00be4450	str x8,[x29, #0x18]
00be4454	add x8,x29,#0x18
00be4458	tbnz w9,#0x9,0x00be446c
00be445c	orr x8,x8,#0x1
00be4460	ldrb w10,[x5]
00be4464	cbnz w10,0x00be4480
00be4468	b 0x00be4490
00be446c	mov w10,#0x23
00be4470	orr x8,x8,#0x2
00be4474	strb w10,[x29, #0x19]
00be4478	ldrb w10,[x5]
00be447c	cbz w10,0x00be4490
00be4480	add x11,x5,#0x1
00be4484	strb w10,[x8], #0x1
00be4488	ldrb w10,[x11], #0x1
00be448c	cbnz w10,0x00be4484
00be4490	mov w10,#0x4a
00be4494	and w10,w9,w10
00be4498	cmp w10,#0x40
00be449c	b.eq 0x00be44bc
00be44a0	cmp w10,#0x8
00be44a4	b.ne 0x00be44c4
00be44a8	tst w9,#0x4000
00be44ac	mov w9,#0x58
00be44b0	mov w10,#0x78
00be44b4	csel w9,w10,w9,eq
00be44b8	b 0x00be44c8
00be44bc	mov w9,#0x6f
00be44c0	b 0x00be44c8
00be44c4	mov w9,#0x75
00be44c8	strb w9,[x8]
00be44cc	adrp x8,0xd27000
00be44d0	add x8,x8,#0xf8
00be44d4	ldarb w8,[x8]
00be44d8	adrp x23,0xd27000
00be44dc	tbz w8,#0x0,0x00be45d8
00be44e0	ldr x2,[x23, #0xf0]
00be44e4	sub x0,x29,#0x18
00be44e8	add x3,x29,#0x18
00be44ec	mov w1,#0x18
00be44f0	mov x4,x22
00be44f4	sub x22,x29,#0x18
00be44f8	bl 0x00c0cd14
00be44fc	ldr w8,[x20, #0x8]
00be4500	mov w9,#0xb0
00be4504	add x22,x22,w0, SXTW 
00be4508	and w8,w8,w9
00be450c	mov x23,x22
00be4510	cmp w8,#0x20
00be4514	b.eq 0x00be4570
00be4518	cmp w8,#0x10
00be451c	b.ne 0x00be456c
00be4520	ldurb w8,[x29, #-0x18]
00be4524	cmp w8,#0x2d
00be4528	b.eq 0x00be4534
00be452c	cmp w8,#0x2b
00be4530	b.ne 0x00be4540
00be4534	sub x8,x29,#0x18
00be4538	orr x23,x8,#0x1
00be453c	b 0x00be4570
00be4540	cmp w0,#0x2
00be4544	b.lt 0x00be456c
00be4548	cmp w8,#0x30
00be454c	b.ne 0x00be456c
00be4550	ldurb w8,[x29, #-0x17]
00be4554	orr w8,w8,#0x20
00be4558	cmp w8,#0x78
00be455c	b.ne 0x00be456c
00be4560	sub x8,x29,#0x18
00be4564	orr x23,x8,#0x2
00be4568	b 0x00be4570
00be456c	sub x23,x29,#0x18
00be4570	mov x8,sp
00be4574	mov x0,x20
00be4578	bl 0x00c30070
00be457c	sub x0,x29,#0x18
00be4580	add x3,sp,#0x1b
00be4584	add x4,sp,#0x10
00be4588	add x5,sp,#0x8
00be458c	mov x6,sp
00be4590	mov x1,x23
00be4594	mov x2,x22
00be4598	bl 0x00c44150
00be459c	mov x0,sp
00be45a0	bl 0x00c30090
00be45a4	ldp x3,x2,[sp, #0x8]
00be45a8	add x1,sp,#0x1b
00be45ac	mov x0,x21
00be45b0	mov x4,x20
00be45b4	mov w5,w19
00be45b8	bl 0x00be5420
00be45bc	ldp x20,x19,[sp, #0x90]
00be45c0	ldr x23,[sp, #0x70]
00be45c4	ldp x22,x21,[sp, #0x80]
00be45c8	ldp x29,x30,[sp, #0x60]
00be45cc	add sp,sp,#0xa0
00be45d0	autiasp
00be45d4	ret
00be45d8	adrp x0,0xd27000
00be45dc	add x0,x0,#0xf8
00be45e0	bl 0x00c2fe90
00be45e4	cbz w0,0x00be44e0
00be45e8	adrp x1,0x2c6000
00be45ec	add x1,x1,#0xbfc
00be45f0	mov w0,#0x1fbf
00be45f4	mov x2,xzr
00be45f8	bl 0x00c43890
00be45fc	str x0,[x23, #0xf0]
00be4600	adrp x0,0xd27000
00be4604	add x0,x0,#0xf8
00be4608	bl 0x00c2fea0
00be460c	b 0x00be44e0
