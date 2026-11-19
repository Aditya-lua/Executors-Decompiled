; FUN_00af4190 @ 00af4190
00af4190	sub sp,sp,#0x50
00af4194	stp x20,x19,[sp, #0x30]
00af4198	mov x20,x1
00af419c	mov w1,wzr
00af41a0	stp x24,x23,[sp, #0x10]
00af41a4	stp x22,x21,[sp, #0x20]
00af41a8	stp x29,x30,[sp, #0x40]
00af41ac	add x29,sp,#0x40
00af41b0	mov x23,x4
00af41b4	mov w24,w3
00af41b8	mov w21,w2
00af41bc	mov x22,x0
00af41c0	str xzr,[sp]
00af41c4	bl 0x00c39690
00af41c8	mov x19,x0
00af41cc	cbz x0,0x00af4228
00af41d0	cmp w24,#0x2
00af41d4	b.eq 0x00af42a8
00af41d8	cmp w24,#0x1
00af41dc	b.ne 0x00af41f4
00af41e0	mov x1,sp
00af41e4	mov x0,x20
00af41e8	bl 0x00c396a0
00af41ec	mov x22,x0
00af41f0	cbnz x22,0x00af42e4
00af41f4	bl 0x00c342a0
00af41f8	adrp x0,0x2aa000
00af41fc	adrp x2,0x2ce000
00af4200	add x0,x0,#0x9f7
00af4204	add x2,x2,#0x3fe
00af4208	mov w1,#0x100
00af420c	bl 0x00c342b0
00af4210	adrp x2,0x29e000
00af4214	add x2,x2,#0xabc
00af4218	mov w0,#0x22
00af421c	mov w1,#0x74
00af4220	mov x3,x20
00af4224	b 0x00af4258
00af4228	bl 0x00c342a0
00af422c	adrp x0,0x2aa000
00af4230	adrp x2,0x2ce000
00af4234	add x0,x0,#0x9f7
00af4238	add x2,x2,#0x3fe
00af423c	mov w1,#0xf5
00af4240	bl 0x00c342b0
00af4244	adrp x2,0x2ad000
00af4248	add x2,x2,#0x7ba
00af424c	mov w0,#0x22
00af4250	mov w1,#0x73
00af4254	mov x3,x22
00af4258	bl 0x00c342c0
00af425c	mov x22,xzr
00af4260	mov x20,xzr
00af4264	mov x21,xzr
00af4268	mov x0,x19
00af426c	bl 0x00c37660
00af4270	mov x0,x20
00af4274	bl 0x00c35530
00af4278	adrp x1,0x2aa000
00af427c	add x1,x1,#0x9f7
00af4280	mov w2,#0x113
00af4284	mov x0,x22
00af4288	bl 0x00c32310
00af428c	mov x0,x21
00af4290	ldp x29,x30,[sp, #0x40]
00af4294	ldp x20,x19,[sp, #0x30]
00af4298	ldp x22,x21,[sp, #0x20]
00af429c	ldp x24,x23,[sp, #0x10]
00af42a0	add sp,sp,#0x50
00af42a4	ret
00af42a8	mov x0,x20
00af42ac	mov x1,x23
00af42b0	str xzr,[sp, #0x8]
00af42b4	bl 0x00c37bb0
00af42b8	mov x22,x0
00af42bc	cbz x0,0x00af42e0
00af42c0	add x1,sp,#0x8
00af42c4	mov x0,x22
00af42c8	bl 0x00c37880
00af42cc	sxtw x8,w0
00af42d0	mov x0,x22
00af42d4	str x8,[sp]
00af42d8	bl 0x00c37cc0
00af42dc	ldr x22,[sp, #0x8]
00af42e0	cbz x22,0x00af41f4
00af42e4	bl 0x00c38170
00af42e8	mov x20,x0
00af42ec	cbz x0,0x00af431c
00af42f0	str x22,[x20, #0x8]
00af42f4	ldr x8,[sp]
00af42f8	mov x0,xzr
00af42fc	mov x1,x19
00af4300	mov w2,w21
00af4304	mov x3,x20
00af4308	str w8,[x20]
00af430c	bl 0x00c407b0
00af4310	mov x21,x0
00af4314	mov x22,xzr
00af4318	b 0x00af4268
00af431c	bl 0x00c342a0
00af4320	adrp x0,0x2aa000
00af4324	adrp x2,0x2ce000
00af4328	add x0,x0,#0x9f7
00af432c	add x2,x2,#0x3fe
00af4330	mov w1,#0x106
00af4334	bl 0x00c342b0
00af4338	mov w1,#0x100
00af433c	mov w0,#0x22
00af4340	movk w1,#0xc, LSL #16
00af4344	mov x2,xzr
00af4348	bl 0x00c342c0
00af434c	b 0x00af4264
