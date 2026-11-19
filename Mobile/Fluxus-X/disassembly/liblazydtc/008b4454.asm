; FUN_008b4454 @ 008b4454
008b4454	stp x29,x30,[sp, #-0x50]!
008b4458	stp x26,x25,[sp, #0x10]
008b445c	stp x24,x23,[sp, #0x20]
008b4460	stp x22,x21,[sp, #0x30]
008b4464	stp x20,x19,[sp, #0x40]
008b4468	mov x29,sp
008b446c	ldrh w8,[x0, #0x28]
008b4470	mov w22,w3
008b4474	mov w20,w2
008b4478	mov x21,x1
008b447c	mov x19,x0
008b4480	add w8,w8,#0x1
008b4484	and w9,w8,#0xffff
008b4488	strh w8,[x0, #0x28]
008b448c	cmp w9,#0xc8
008b4490	b.cc 0x008b44a4
008b4494	b.eq 0x008b4640
008b4498	and w8,w8,#0xffff
008b449c	cmp w8,#0xe1
008b44a0	b.cs 0x008b4650
008b44a4	ldr x8,[x19, #0x50]
008b44a8	ldr x9,[x19, #0x20]
008b44ac	subs x23,x8,x9
008b44b0	b.eq 0x008b44e0
008b44b4	ldr x8,[x8, #0x8]
008b44b8	ldr x8,[x8]
008b44bc	ldrb w9,[x8, #0x6]
008b44c0	cbz w9,0x008b44e0
008b44c4	ldr x8,[x8, #0x20]
008b44c8	cbz x8,0x008b44e0
008b44cc	ldrh w8,[x19, #0x2a]
008b44d0	mov w24,#0x1
008b44d4	add w8,w8,#0x1
008b44d8	strh w8,[x19, #0x2a]
008b44dc	b 0x008b44e4
008b44e0	mov w24,wzr
008b44e4	ldr x25,[x19, #0x58]
008b44e8	mov x0,x19
008b44ec	mov x1,x21
008b44f0	mov w2,w20
008b44f4	bl 0x008c8994
008b44f8	cbnz w0,0x008b4570
008b44fc	ldr x8,[x19, #0x50]
008b4500	ldrb w26,[x19, #0x6]
008b4504	ldr w9,[x8, #0x2c]
008b4508	orr w9,w9,#0x1
008b450c	str w9,[x8, #0x2c]
008b4510	mov w9,#0x1
008b4514	ldrb w8,[x19, #0x2]
008b4518	strb w9,[x19, #0x6]
008b451c	tbz w8,#0x2,0x008b4530
008b4520	add x2,x19,#0x38
008b4524	mov x0,x19
008b4528	mov x1,x19
008b452c	bl 0x008b63a4
008b4530	tbz w22,#0x0,0x008b4544
008b4534	mov w8,#0x7f
008b4538	strb w8,[x19, #0x3]
008b453c	tbz w26,#0x0,0x008b456c
008b4540	b 0x008b4570
008b4544	ldr x8,[x19, #0x50]
008b4548	ldr x9,[x19, #0x20]
008b454c	mov x0,x19
008b4550	sub x8,x8,x9
008b4554	sub x22,x8,#0x30
008b4558	bl 0x008be71c
008b455c	mov x0,x19
008b4560	mov x1,x22
008b4564	bl 0x008b4b80
008b4568	tbnz w26,#0x0,0x008b4570
008b456c	strb wzr,[x19, #0x6]
008b4570	ldrb w9,[x19, #0x3]
008b4574	sub x8,x21,x25
008b4578	cmp w9,#0x1
008b457c	b.eq 0x008b4590
008b4580	cmp w9,#0x7f
008b4584	b.eq 0x008b4590
008b4588	cmp w9,#0x6
008b458c	b.ne 0x008b45c4
008b4590	tbz w24,#0x0,0x008b45ec
008b4594	ldr x9,[x19, #0x58]
008b4598	cmn w20,#0x1
008b459c	ldrh w10,[x19, #0x2a]
008b45a0	ldr x11,[x19, #0x20]
008b45a4	add x8,x9,x8
008b45a8	csel w9,wzr,w20,eq
008b45ac	sub w10,w10,#0x1
008b45b0	add x8,x8,w9, SXTW  #0x4
008b45b4	add x9,x11,x23
008b45b8	strh w10,[x19, #0x2a]
008b45bc	str x8,[x9, #0x18]
008b45c0	b 0x008b45ec
008b45c4	cbz w24,0x008b45d4
008b45c8	ldrh w9,[x19, #0x2a]
008b45cc	sub w9,w9,#0x1
008b45d0	strh w9,[x19, #0x2a]
008b45d4	cmn w20,#0x1
008b45d8	b.eq 0x008b45ec
008b45dc	ldr x9,[x19, #0x58]
008b45e0	add x8,x9,x8
008b45e4	add x8,x8,w20, SXTW  #0x4
008b45e8	str x8,[x19, #0x68]
008b45ec	ldr x8,[x19, #0x60]
008b45f0	ldrh w9,[x19, #0x28]
008b45f4	ldp x8,x10,[x8, #0x8]
008b45f8	sub w9,w9,#0x1
008b45fc	strh w9,[x19, #0x28]
008b4600	cmp x10,x8
008b4604	b.cs 0x008b4620
008b4608	ldp x20,x19,[sp, #0x40]
008b460c	ldp x22,x21,[sp, #0x30]
008b4610	ldp x24,x23,[sp, #0x20]
008b4614	ldp x26,x25,[sp, #0x10]
008b4618	ldp x29,x30,[sp], #0x50
008b461c	ret
008b4620	mov x0,x19
008b4624	mov w1,#0x1
008b4628	ldp x20,x19,[sp, #0x40]
008b462c	ldp x22,x21,[sp, #0x30]
008b4630	ldp x24,x23,[sp, #0x20]
008b4634	ldp x26,x25,[sp, #0x10]
008b4638	ldp x29,x30,[sp], #0x50
008b463c	b 0x008b52c4
008b4640	adrp x1,0x2a7000
008b4644	add x1,x1,#0x1c7
008b4648	mov x0,x19
008b464c	bl 0x008b39cc
008b4650	mov x0,x19
008b4654	mov w1,#0x5
008b4658	bl 0x008b3f9c
