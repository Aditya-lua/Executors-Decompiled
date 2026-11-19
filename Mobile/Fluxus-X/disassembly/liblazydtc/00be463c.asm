; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be463c
00be463c	bti c
00be4640	adrp x5,0x2b5000
00be4644	add x5,x5,#0x54
00be4648	b 0x00be464c
00be464c	paciasp
00be4650	sub sp,sp,#0xa0
00be4654	stp x29,x30,[sp, #0x60]
00be4658	str x23,[sp, #0x70]
00be465c	stp x22,x21,[sp, #0x80]
00be4660	stp x20,x19,[sp, #0x90]
00be4664	add x29,sp,#0x60
00be4668	ldr w9,[x2, #0x8]
00be466c	mov w8,#0x25
00be4670	mov x22,x4
00be4674	mov w19,w3
00be4678	mov x20,x2
00be467c	mov x21,x1
00be4680	str x8,[x29, #0x18]
00be4684	add x8,x29,#0x18
00be4688	tbnz w9,#0x9,0x00be469c
00be468c	orr x8,x8,#0x1
00be4690	ldrb w10,[x5]
00be4694	cbnz w10,0x00be46b0
00be4698	b 0x00be46c0
00be469c	mov w10,#0x23
00be46a0	orr x8,x8,#0x2
00be46a4	strb w10,[x29, #0x19]
00be46a8	ldrb w10,[x5]
00be46ac	cbz w10,0x00be46c0
00be46b0	add x11,x5,#0x1
00be46b4	strb w10,[x8], #0x1
00be46b8	ldrb w10,[x11], #0x1
00be46bc	cbnz w10,0x00be46b4
00be46c0	mov w10,#0x4a
00be46c4	and w10,w9,w10
00be46c8	cmp w10,#0x40
00be46cc	b.eq 0x00be46ec
00be46d0	cmp w10,#0x8
00be46d4	b.ne 0x00be46f4
00be46d8	tst w9,#0x4000
00be46dc	mov w9,#0x58
00be46e0	mov w10,#0x78
00be46e4	csel w9,w10,w9,eq
00be46e8	b 0x00be46f8
00be46ec	mov w9,#0x6f
00be46f0	b 0x00be46f8
00be46f4	mov w9,#0x75
00be46f8	strb w9,[x8]
00be46fc	adrp x8,0xd27000
00be4700	add x8,x8,#0xf8
00be4704	ldarb w8,[x8]
00be4708	adrp x23,0xd27000
00be470c	tbz w8,#0x0,0x00be4808
00be4710	ldr x2,[x23, #0xf0]
00be4714	sub x0,x29,#0x18
00be4718	add x3,x29,#0x18
00be471c	mov w1,#0x18
00be4720	mov x4,x22
00be4724	sub x22,x29,#0x18
00be4728	bl 0x00c0cd14
00be472c	ldr w8,[x20, #0x8]
00be4730	mov w9,#0xb0
00be4734	add x22,x22,w0, SXTW 
00be4738	and w8,w8,w9
00be473c	mov x23,x22
00be4740	cmp w8,#0x20
00be4744	b.eq 0x00be47a0
00be4748	cmp w8,#0x10
00be474c	b.ne 0x00be479c
00be4750	ldurb w8,[x29, #-0x18]
00be4754	cmp w8,#0x2d
00be4758	b.eq 0x00be4764
00be475c	cmp w8,#0x2b
00be4760	b.ne 0x00be4770
00be4764	sub x8,x29,#0x18
00be4768	orr x23,x8,#0x1
00be476c	b 0x00be47a0
00be4770	cmp w0,#0x2
00be4774	b.lt 0x00be479c
00be4778	cmp w8,#0x30
00be477c	b.ne 0x00be479c
00be4780	ldurb w8,[x29, #-0x17]
00be4784	orr w8,w8,#0x20
00be4788	cmp w8,#0x78
00be478c	b.ne 0x00be479c
00be4790	sub x8,x29,#0x18
00be4794	orr x23,x8,#0x2
00be4798	b 0x00be47a0
00be479c	sub x23,x29,#0x18
00be47a0	mov x8,sp
00be47a4	mov x0,x20
00be47a8	bl 0x00c30070
00be47ac	sub x0,x29,#0x18
00be47b0	add x3,sp,#0x1b
00be47b4	add x4,sp,#0x10
00be47b8	add x5,sp,#0x8
00be47bc	mov x6,sp
00be47c0	mov x1,x23
00be47c4	mov x2,x22
00be47c8	bl 0x00c44150
00be47cc	mov x0,sp
00be47d0	bl 0x00c30090
00be47d4	ldp x3,x2,[sp, #0x8]
00be47d8	add x1,sp,#0x1b
00be47dc	mov x0,x21
00be47e0	mov x4,x20
00be47e4	mov w5,w19
00be47e8	bl 0x00be5420
00be47ec	ldp x20,x19,[sp, #0x90]
00be47f0	ldr x23,[sp, #0x70]
00be47f4	ldp x22,x21,[sp, #0x80]
00be47f8	ldp x29,x30,[sp, #0x60]
00be47fc	add sp,sp,#0xa0
00be4800	autiasp
00be4804	ret
00be4808	adrp x0,0xd27000
00be480c	add x0,x0,#0xf8
00be4810	bl 0x00c2fe90
00be4814	cbz w0,0x00be4710
00be4818	adrp x1,0x2c6000
00be481c	add x1,x1,#0xbfc
00be4820	mov w0,#0x1fbf
00be4824	mov x2,xzr
00be4828	bl 0x00c43890
00be482c	str x0,[x23, #0xf0]
00be4830	adrp x0,0xd27000
00be4834	add x0,x0,#0xf8
00be4838	bl 0x00c2fea0
00be483c	b 0x00be4710
