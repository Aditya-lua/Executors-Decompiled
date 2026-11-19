; ossl_method_store_add @ 00ac41d8
00ac41d8	stp x26,x25,[sp, #-0x50]!
00ac41dc	stp x22,x21,[sp, #0x20]
00ac41e0	stp x20,x19,[sp, #0x30]
00ac41e4	mov w21,w2
00ac41e8	mov x20,x0
00ac41ec	mov w0,wzr
00ac41f0	stp x24,x23,[sp, #0x10]
00ac41f4	stp x29,x30,[sp, #0x40]
00ac41f8	add x29,sp,#0x40
00ac41fc	cbz x20,0x00ac449c
00ac4200	cmp w21,#0x1
00ac4204	b.lt 0x00ac449c
00ac4208	mov x25,x4
00ac420c	cbz x4,0x00ac449c
00ac4210	adrp x8,0x2ab000
00ac4214	add x8,x8,#0x32c
00ac4218	cmp x3,#0x0
00ac421c	mov x22,x1
00ac4220	csel x23,x8,x3,eq
00ac4224	cbz x1,0x00ac4498
00ac4228	adrp x1,0x2ca000
00ac422c	add x1,x1,#0x2a4
00ac4230	mov w0,#0x28
00ac4234	mov w2,#0x13c
00ac4238	mov x26,x6
00ac423c	mov x24,x5
00ac4240	bl 0x00c32320
00ac4244	cbz x0,0x00ac449c
00ac4248	mov x19,x0
00ac424c	stp x25,x24,[x0, #0x10]
00ac4250	str x26,[x0, #0x20]
00ac4254	mov x0,x25
00ac4258	blr x24
00ac425c	cbz w0,0x00ac4338
00ac4260	str x22,[x19]
00ac4264	ldr x0,[x20, #0x10]
00ac4268	bl 0x00c356a0
00ac426c	cbz w0,0x00ac4348
00ac4270	ldr x0,[x20, #0x8]
00ac4274	sxtw x24,w21
00ac4278	mov x1,x24
00ac427c	bl 0x00c3ec70
00ac4280	cbz x0,0x00ac42b4
00ac4284	mov x22,x0
00ac4288	ldr x0,[x0, #0x10]
00ac428c	bl 0x00c35880
00ac4290	ldr x8,[x20, #0x20]
00ac4294	adrp x1,0xac4000
00ac4298	add x1,x1,#0xea4
00ac429c	sub x8,x8,x0
00ac42a0	str x8,[x20, #0x20]
00ac42a4	ldr x0,[x22, #0x10]
00ac42a8	bl 0x00c395e0
00ac42ac	ldr x0,[x22, #0x10]
00ac42b0	bl 0x00c3de10
00ac42b4	ldr x0,[x20]
00ac42b8	mov x1,x23
00ac42bc	bl 0x00c3f830
00ac42c0	mov x22,x19
00ac42c4	str x0,[x22, #0x8]!
00ac42c8	cbz x0,0x00ac4358
00ac42cc	ldr x0,[x20, #0x8]
00ac42d0	mov x1,x24
00ac42d4	bl 0x00c3ec70
00ac42d8	mov x23,x0
00ac42dc	cbz x0,0x00ac4390
00ac42e0	ldr x0,[x23, #0x8]
00ac42e4	bl 0x00c325e0
00ac42e8	cmp w0,#0x1
00ac42ec	b.lt 0x00ac4434
00ac42f0	mov w21,wzr
00ac42f4	ldr x0,[x23, #0x8]
00ac42f8	mov w1,w21
00ac42fc	bl 0x00c32610
00ac4300	ldr x8,[x0]
00ac4304	ldr x9,[x19]
00ac4308	cmp x8,x9
00ac430c	b.ne 0x00ac4320
00ac4310	ldr x8,[x0, #0x8]
00ac4314	ldr x9,[x22]
00ac4318	cmp x8,x9
00ac431c	b.eq 0x00ac4438
00ac4320	ldr x0,[x23, #0x8]
00ac4324	add w21,w21,#0x1
00ac4328	bl 0x00c325e0
00ac432c	cmp w21,w0
00ac4330	b.lt 0x00ac42f4
00ac4334	b 0x00ac4438
00ac4338	adrp x1,0x2ca000
00ac433c	add x1,x1,#0x2a4
00ac4340	mov w2,#0x143
00ac4344	b 0x00ac4490
00ac4348	adrp x1,0x2ca000
00ac434c	add x1,x1,#0x2a4
00ac4350	mov w2,#0x14a
00ac4354	b 0x00ac4490
00ac4358	ldr x0,[x20]
00ac435c	mov x1,x23
00ac4360	bl 0x00c3b660
00ac4364	str x0,[x22]
00ac4368	cbz x0,0x00ac4470
00ac436c	ldr x0,[x20]
00ac4370	mov x1,x23
00ac4374	mov x2,x22
00ac4378	bl 0x00c3f840
00ac437c	cbnz w0,0x00ac42cc
00ac4380	ldr x0,[x22]
00ac4384	bl 0x00c3b670
00ac4388	str xzr,[x22]
00ac438c	b 0x00ac4470
00ac4390	adrp x1,0x2ca000
00ac4394	add x1,x1,#0x2a4
00ac4398	orr w0,wzr,#0x18
00ac439c	mov w2,#0x15b
00ac43a0	bl 0x00c34250
00ac43a4	cbz x0,0x00ac4470
00ac43a8	mov x23,x0
00ac43ac	bl 0x00c34780
00ac43b0	str x0,[x23, #0x8]
00ac43b4	cbz x0,0x00ac43ec
00ac43b8	adrp x0,0xac4000
00ac43bc	adrp x1,0xac4000
00ac43c0	add x0,x0,#0x4b4
00ac43c4	add x1,x1,#0x4bc
00ac43c8	bl 0x00c34dd0
00ac43cc	str x0,[x23, #0x10]
00ac43d0	cbz x0,0x00ac43ec
00ac43d4	str w21,[x23]
00ac43d8	ldr x0,[x20, #0x8]
00ac43dc	mov x1,x24
00ac43e0	mov x2,x23
00ac43e4	bl 0x00c3ec90
00ac43e8	cbnz w0,0x00ac42e0
00ac43ec	ldr x0,[x20, #0x10]
00ac43f0	bl 0x00c35690
00ac43f4	ldr x0,[x23, #0x8]
00ac43f8	adrp x1,0xac4000
00ac43fc	add x1,x1,#0x510
00ac4400	bl 0x00c32600
00ac4404	ldr x0,[x23, #0x10]
00ac4408	adrp x1,0xac4000
00ac440c	add x1,x1,#0xea4
00ac4410	bl 0x00c395e0
00ac4414	ldr x0,[x23, #0x10]
00ac4418	bl 0x00c34db0
00ac441c	adrp x1,0x2ca000
00ac4420	add x1,x1,#0x2a4
00ac4424	mov w2,#0xee
00ac4428	mov x0,x23
00ac442c	bl 0x00c32310
00ac4430	b 0x00ac4478
00ac4434	mov w21,wzr
00ac4438	ldr x0,[x23, #0x8]
00ac443c	bl 0x00c325e0
00ac4440	cmp w21,w0
00ac4444	b.ne 0x00ac4470
00ac4448	ldr x0,[x23, #0x8]
00ac444c	mov x1,x19
00ac4450	bl 0x00c347a0
00ac4454	ldr x8,[x20, #0x10]
00ac4458	mov w20,w0
00ac445c	mov x0,x8
00ac4460	bl 0x00c35690
00ac4464	cbz w20,0x00ac4478
00ac4468	mov w0,#0x1
00ac446c	b 0x00ac449c
00ac4470	ldr x0,[x20, #0x10]
00ac4474	bl 0x00c35690
00ac4478	ldr x8,[x19, #0x20]
00ac447c	ldr x0,[x19, #0x10]
00ac4480	blr x8
00ac4484	adrp x1,0x2ca000
00ac4488	add x1,x1,#0x2a4
00ac448c	mov w2,#0xd4
00ac4490	mov x0,x19
00ac4494	bl 0x00c32310
00ac4498	mov w0,wzr
00ac449c	ldp x29,x30,[sp, #0x40]
00ac44a0	ldp x20,x19,[sp, #0x30]
00ac44a4	ldp x22,x21,[sp, #0x20]
00ac44a8	ldp x24,x23,[sp, #0x10]
00ac44ac	ldp x26,x25,[sp], #0x50
00ac44b0	ret
