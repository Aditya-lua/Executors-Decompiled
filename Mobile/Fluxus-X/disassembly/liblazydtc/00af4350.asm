; FUN_00af4350 @ 00af4350
00af4350	stp x24,x23,[sp, #-0x40]!
00af4354	stp x22,x21,[sp, #0x10]
00af4358	stp x20,x19,[sp, #0x20]
00af435c	stp x29,x30,[sp, #0x30]
00af4360	add x29,sp,#0x30
00af4364	cbz w2,0x00af43b8
00af4368	mov x24,x0
00af436c	mov w0,w2
00af4370	mov x22,x4
00af4374	mov w20,w3
00af4378	mov w19,w2
00af437c	mov x23,x1
00af4380	bl 0x00c40790
00af4384	cbz x0,0x00af43e0
00af4388	ldr x8,[x0, #0x48]
00af438c	mov x21,x0
00af4390	cbz x8,0x00af4428
00af4394	ldrb w8,[x22]
00af4398	cmp w8,#0x40
00af439c	b.ne 0x00af444c
00af43a0	add x1,x22,#0x1
00af43a4	mov x0,x24
00af43a8	bl 0x00c394b0
00af43ac	mov x24,x0
00af43b0	cbnz x0,0x00af445c
00af43b4	b 0x00af44d8
00af43b8	bl 0x00c342a0
00af43bc	adrp x0,0x2aa000
00af43c0	adrp x2,0x2da000
00af43c4	add x0,x0,#0x9f7
00af43c8	add x2,x2,#0x654
00af43cc	mov w1,#0x58
00af43d0	bl 0x00c342b0
00af43d4	mov w0,#0x22
00af43d8	mov w1,#0x82
00af43dc	b 0x00af4404
00af43e0	bl 0x00c342a0
00af43e4	adrp x0,0x2aa000
00af43e8	adrp x2,0x2da000
00af43ec	add x0,x0,#0x9f7
00af43f0	add x2,x2,#0x654
00af43f4	mov w1,#0x5c
00af43f8	bl 0x00c342b0
00af43fc	mov w0,#0x22
00af4400	mov w1,#0x81
00af4404	mov x2,xzr
00af4408	bl 0x00c342c0
00af440c	mov x19,xzr
00af4410	mov x0,x19
00af4414	ldp x29,x30,[sp, #0x30]
00af4418	ldp x20,x19,[sp, #0x20]
00af441c	ldp x22,x21,[sp, #0x10]
00af4420	ldp x24,x23,[sp], #0x40
00af4424	ret
00af4428	ldr x8,[x21, #0x38]
00af442c	cbz x8,0x00af453c
00af4430	mov x0,x21
00af4434	mov x1,x23
00af4438	mov x2,x22
00af443c	blr x8
00af4440	mov x22,x0
00af4444	cbnz x0,0x00af44a4
00af4448	b 0x00af440c
00af444c	mov x0,x22
00af4450	bl 0x00c39680
00af4454	mov x24,x0
00af4458	cbz x0,0x00af44d8
00af445c	mov x0,x24
00af4460	bl 0x00c325e0
00af4464	cmp w0,#0x0
00af4468	b.le 0x00af44d8
00af446c	ldr x8,[x21, #0x48]
00af4470	mov x0,x21
00af4474	mov x1,x23
00af4478	mov x2,x24
00af447c	blr x8
00af4480	ldrb w8,[x22]
00af4484	mov x22,x0
00af4488	cmp w8,#0x40
00af448c	b.eq 0x00af44a0
00af4490	adrp x1,0xcb5000
00af4494	ldr x1,[x1, #0x4b0]
00af4498	mov x0,x24
00af449c	bl 0x00c32600
00af44a0	cbz x22,0x00af440c
00af44a4	mov x0,x21
00af44a8	mov w1,w19
00af44ac	mov w2,w20
00af44b0	mov x3,x22
00af44b4	bl 0x00af464c
00af44b8	ldr x8,[x21, #0x8]
00af44bc	mov x19,x0
00af44c0	cbz x8,0x00af457c
00af44c4	blr x8
00af44c8	mov x1,x0
00af44cc	mov x0,x22
00af44d0	bl 0x00c36160
00af44d4	b 0x00af4410
00af44d8	bl 0x00c342a0
00af44dc	adrp x0,0x2aa000
00af44e0	adrp x2,0x2da000
00af44e4	add x0,x0,#0x9f7
00af44e8	add x2,x2,#0x654
00af44ec	mov w1,#0x66
00af44f0	bl 0x00c342b0
00af44f4	mov w0,w19
00af44f8	bl 0x00c324f0
00af44fc	adrp x2,0x2cc000
00af4500	mov x3,x0
00af4504	add x2,x2,#0x13c
00af4508	mov w0,#0x22
00af450c	mov w1,#0x69
00af4510	mov x4,x22
00af4514	bl 0x00c342c0
00af4518	ldrb w8,[x22]
00af451c	mov x19,xzr
00af4520	cmp w8,#0x40
00af4524	b.eq 0x00af4410
00af4528	adrp x1,0xcb5000
00af452c	ldr x1,[x1, #0x4b0]
00af4530	mov x0,x24
00af4534	bl 0x00c32600
00af4538	b 0x00af440c
00af453c	ldr x8,[x21, #0x58]
00af4540	cbz x8,0x00af458c
00af4544	ldr x9,[x23, #0x30]
00af4548	cbz x9,0x00af4554
00af454c	ldr x9,[x23, #0x28]
00af4550	cbnz x9,0x00af4430
00af4554	bl 0x00c342a0
00af4558	adrp x0,0x2aa000
00af455c	adrp x2,0x2da000
00af4560	add x0,x0,#0x9f7
00af4564	add x2,x2,#0x654
00af4568	mov w1,#0x76
00af456c	bl 0x00c342b0
00af4570	mov w0,#0x22
00af4574	mov w1,#0x88
00af4578	b 0x00af4404
00af457c	ldr x8,[x21, #0x18]
00af4580	mov x0,x22
00af4584	blr x8
00af4588	b 0x00af4410
00af458c	bl 0x00c342a0
00af4590	adrp x0,0x2aa000
00af4594	adrp x2,0x2da000
00af4598	add x0,x0,#0x9f7
00af459c	add x2,x2,#0x654
00af45a0	orr w1,wzr,#0x7c
00af45a4	bl 0x00c342b0
00af45a8	mov w0,w19
00af45ac	bl 0x00c324f0
00af45b0	adrp x2,0x2ad000
00af45b4	mov x3,x0
00af45b8	add x2,x2,#0x7ba
00af45bc	mov w0,#0x22
00af45c0	mov w1,#0x67
00af45c4	bl 0x00c342c0
00af45c8	b 0x00af440c
