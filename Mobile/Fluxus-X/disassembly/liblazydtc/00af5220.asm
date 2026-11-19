; FUN_00af5220 @ 00af5220
00af5220	sub sp,sp,#0xc0
00af5224	stp x22,x21,[sp, #0x90]
00af5228	mov x21,x0
00af522c	mov x0,x1
00af5230	stp x28,x27,[sp, #0x60]
00af5234	stp x26,x25,[sp, #0x70]
00af5238	stp x24,x23,[sp, #0x80]
00af523c	stp x20,x19,[sp, #0xa0]
00af5240	stp x29,x30,[sp, #0xb0]
00af5244	add x29,sp,#0xb0
00af5248	mov x26,x2
00af524c	mov x20,x1
00af5250	bl 0x00c325e0
00af5254	cmp w0,#0x1
00af5258	b.lt 0x00af5344
00af525c	adrp x23,0x2d6000
00af5260	adrp x24,0x2b0000
00af5264	mov w22,wzr
00af5268	orr x19,xzr,#0x100000000
00af526c	add x23,x23,#0x650
00af5270	add x24,x24,#0x939
00af5274	mov x25,x26
00af5278	str x26,[sp, #0x8]
00af527c	mov x0,x20
00af5280	mov w1,w22
00af5284	mov x26,x25
00af5288	bl 0x00c32610
00af528c	ldr x1,[x0, #0x8]
00af5290	mov x27,x0
00af5294	mov x0,x21
00af5298	mov x2,x25
00af529c	bl 0x00c40850
00af52a0	cbz x0,0x00af535c
00af52a4	mov w1,w22
00af52a8	mov x25,x0
00af52ac	bl 0x00c32610
00af52b0	ldr x2,[x27]
00af52b4	mov x26,x0
00af52b8	add x0,sp,#0x10
00af52bc	mov w1,#0x50
00af52c0	bl 0x00c32dc0
00af52c4	add x0,sp,#0x10
00af52c8	bl 0x00c2ff50
00af52cc	ldr x8,[x26, #0x8]
00af52d0	mov x27,x0
00af52d4	mov x0,x8
00af52d8	bl 0x00c2ff50
00af52dc	add w8,w27,w0
00af52e0	add w8,w8,#0x3
00af52e4	add x8,x19,x8, LSL #0x20
00af52e8	asr x28,x8,#0x20
00af52ec	mov w2,#0x52
00af52f0	mov x0,x28
00af52f4	mov x1,x23
00af52f8	bl 0x00c32320
00af52fc	cbz x0,0x00af5358
00af5300	ldr x4,[x26, #0x8]
00af5304	add x3,sp,#0x10
00af5308	mov x1,x28
00af530c	mov x2,x24
00af5310	mov x27,x0
00af5314	bl 0x00c34d30
00af5318	ldr x0,[x26, #0x8]
00af531c	mov w2,#0x56
00af5320	mov x1,x23
00af5324	bl 0x00c32310
00af5328	mov x0,x20
00af532c	str x27,[x26, #0x8]
00af5330	add w22,w22,#0x1
00af5334	bl 0x00c325e0
00af5338	cmp w22,w0
00af533c	b.lt 0x00af527c
00af5340	b 0x00af53b0
00af5344	mov x25,x26
00af5348	cbnz x26,0x00af53b0
00af534c	bl 0x00c34780
00af5350	mov x25,x0
00af5354	b 0x00af53b0
00af5358	mov x26,x25
00af535c	bl 0x00c342a0
00af5360	adrp x0,0x2d6000
00af5364	adrp x2,0x2a2000
00af5368	add x0,x0,#0x650
00af536c	add x2,x2,#0xd69
00af5370	mov w1,#0x5e
00af5374	bl 0x00c342b0
00af5378	mov w1,#0x100
00af537c	mov w0,#0x22
00af5380	movk w1,#0xc, LSL #16
00af5384	mov x2,xzr
00af5388	bl 0x00c342c0
00af538c	ldr x8,[sp, #0x8]
00af5390	cbnz x8,0x00af53ac
00af5394	mov x25,xzr
00af5398	cbz x26,0x00af53b0
00af539c	adrp x1,0xcb5000
00af53a0	ldr x1,[x1, #0x4b0]
00af53a4	mov x0,x26
00af53a8	bl 0x00c32600
00af53ac	mov x25,xzr
00af53b0	mov x0,x25
00af53b4	ldp x29,x30,[sp, #0xb0]
00af53b8	ldp x20,x19,[sp, #0xa0]
00af53bc	ldp x22,x21,[sp, #0x90]
00af53c0	ldp x24,x23,[sp, #0x80]
00af53c4	ldp x26,x25,[sp, #0x70]
00af53c8	ldp x28,x27,[sp, #0x60]
00af53cc	add sp,sp,#0xc0
00af53d0	ret
