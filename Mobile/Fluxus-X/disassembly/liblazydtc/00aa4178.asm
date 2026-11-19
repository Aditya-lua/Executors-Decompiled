; FUN_00aa4178 @ 00aa4178
00aa4178	stp x22,x21,[sp, #-0x30]!
00aa417c	stp x20,x19,[sp, #0x10]
00aa4180	stp x29,x30,[sp, #0x20]
00aa4184	mov x19,x0
00aa4188	ldr x0,[x0, #0x20]
00aa418c	add x29,sp,#0x20
00aa4190	bl 0x00c35680
00aa4194	cbz w0,0x00aa41d4
00aa4198	ldr x0,[x19, #0x20]
00aa419c	ldrb w20,[x19, #0x48]
00aa41a0	bl 0x00c35690
00aa41a4	tbnz w20,#0x0,0x00aa41b0
00aa41a8	mov w20,#0x1
00aa41ac	b 0x00aa41d8
00aa41b0	ldr x0,[x19, #0x20]
00aa41b4	bl 0x00c356a0
00aa41b8	cbz w0,0x00aa41d4
00aa41bc	ldrb w8,[x19, #0x48]
00aa41c0	tbnz w8,#0x0,0x00aa41ec
00aa41c4	ldr x0,[x19, #0x20]
00aa41c8	bl 0x00c35690
00aa41cc	mov w20,#0x1
00aa41d0	b 0x00aa41d8
00aa41d4	mov w20,wzr
00aa41d8	mov w0,w20
00aa41dc	ldp x29,x30,[sp, #0x20]
00aa41e0	ldp x20,x19,[sp, #0x10]
00aa41e4	ldp x22,x21,[sp], #0x30
00aa41e8	ret
00aa41ec	adrp x8,0xcb5000
00aa41f0	ldr x8,[x8, #0x6a8]
00aa41f4	ldr x0,[x8]
00aa41f8	cbz x0,0x00aa428c
00aa41fc	mov w21,wzr
00aa4200	add x22,x8,#0x20
00aa4204	ldrb w8,[x22]
00aa4208	tbz w8,#0x0,0x00aa425c
00aa420c	ldur x1,[x22, #-0x10]
00aa4210	mov x2,xzr
00aa4214	bl 0x00aa2f50
00aa4218	mov x20,x0
00aa421c	cbz x0,0x00aa4290
00aa4220	ldr x8,[x19]
00aa4224	str x8,[x20, #0x50]
00aa4228	bl 0x00c3be00
00aa422c	str w0,[x20, #0x60]
00aa4230	mov x0,x20
00aa4234	mov w1,wzr
00aa4238	mov w2,wzr
00aa423c	bl 0x00aa3714
00aa4240	tbnz w0,#0x1f,0x00aa4284
00aa4244	str x19,[x20, #0x58]
00aa4248	ldr x0,[x19, #0x8]
00aa424c	mov x1,x20
00aa4250	bl 0x00c347a0
00aa4254	cbz w0,0x00aa4284
00aa4258	add w21,w21,#0x1
00aa425c	ldr x0,[x22, #0x8]
00aa4260	add x22,x22,#0x28
00aa4264	cbnz x0,0x00aa4204
00aa4268	cmp w21,#0x1
00aa426c	b.lt 0x00aa428c
00aa4270	ldrb w8,[x19, #0x48]
00aa4274	mov w20,#0x1
00aa4278	and w8,w8,#0xfe
00aa427c	strb w8,[x19, #0x48]
00aa4280	b 0x00aa4290
00aa4284	mov x0,x20
00aa4288	bl 0x00aa2c44
00aa428c	mov w20,wzr
00aa4290	ldr x0,[x19, #0x20]
00aa4294	bl 0x00c35690
00aa4298	b 0x00aa41d8
