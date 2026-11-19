; std::__ndk1::to_string @ 00bca228
00bca228	paciasp
00bca22c	sub sp,sp,#0x60
00bca230	str d8,[sp, #0x20]
00bca234	stp x29,x30,[sp, #0x28]
00bca238	str x23,[sp, #0x38]
00bca23c	stp x22,x21,[sp, #0x40]
00bca240	stp x20,x19,[sp, #0x50]
00bca244	add x29,sp,#0x28
00bca248	fmov s8,s0
00bca24c	mov x19,x8
00bca250	stp xzr,xzr,[sp, #0x8]
00bca254	str xzr,[sp, #0x18]
00bca258	add x0,sp,#0x8
00bca25c	mov w1,#0x16
00bca260	mov w2,wzr
00bca264	add x20,sp,#0x8
00bca268	bl 0x00c30250
00bca26c	ldrb w8,[sp, #0x8]
00bca270	fcvt d8,s8
00bca274	ldr x9,[sp, #0x10]
00bca278	orr x21,x20,#0x1
00bca27c	adrp x20,0x2a1000
00bca280	add x20,x20,#0x3e2
00bca284	lsr x10,x8,#0x1
00bca288	tst w8,#0x1
00bca28c	mov w22,#0x1
00bca290	csel x23,x10,x9,eq
00bca294	b 0x00bca2a8
00bca298	add x0,sp,#0x8
00bca29c	mov w2,wzr
00bca2a0	bl 0x00c30250
00bca2a4	ldrb w8,[sp, #0x8]
00bca2a8	fmov d0,d8
00bca2ac	ldr x9,[sp, #0x18]
00bca2b0	tst w8,#0x1
00bca2b4	add x1,x23,#0x1
00bca2b8	mov x2,x20
00bca2bc	csel x0,x21,x9,eq
00bca2c0	bl 0x00c31ed0
00bca2c4	tbnz w0,#0x1f,0x00bca2dc
00bca2c8	mov w8,w0
00bca2cc	cmp x23,x8
00bca2d0	b.cs 0x00bca320
00bca2d4	mov x23,x8
00bca2d8	b 0x00bca2e0
00bca2dc	orr x23,x22,x23, LSL #0x1
00bca2e0	ldrb w8,[sp, #0x8]
00bca2e4	ldr x9,[sp, #0x10]
00bca2e8	lsr x10,x8,#0x1
00bca2ec	tst w8,#0x1
00bca2f0	csel x9,x10,x9,eq
00bca2f4	subs x1,x23,x9
00bca2f8	b.hi 0x00bca298
00bca2fc	tbnz w8,#0x0,0x00bca310
00bca300	lsl w8,w23,#0x1
00bca304	strb w8,[sp, #0x8]
00bca308	mov x8,x21
00bca30c	b 0x00bca318
00bca310	ldr x8,[sp, #0x18]
00bca314	str x23,[sp, #0x10]
00bca318	strb wzr,[x8, x23]
00bca31c	b 0x00bca2a4
00bca320	ldrb w9,[sp, #0x8]
00bca324	ldr x10,[sp, #0x10]
00bca328	lsr x11,x9,#0x1
00bca32c	tst w9,#0x1
00bca330	csel x10,x11,x10,eq
00bca334	subs x1,x8,x10
00bca338	b.ls 0x00bca34c
00bca33c	add x0,sp,#0x8
00bca340	mov w2,wzr
00bca344	bl 0x00c30250
00bca348	b 0x00bca368
00bca34c	tbnz w9,#0x0,0x00bca35c
00bca350	lsl w9,w0,#0x1
00bca354	strb w9,[sp, #0x8]
00bca358	b 0x00bca364
00bca35c	ldr x21,[sp, #0x18]
00bca360	str x8,[sp, #0x10]
00bca364	strb wzr,[x21, x8]
00bca368	ldur q0,[sp, #0x8]
00bca36c	ldr x8,[sp, #0x18]
00bca370	add x0,sp,#0x8
00bca374	stp xzr,xzr,[sp, #0x10]
00bca378	str q0,[x19]
00bca37c	str x8,[x19, #0x10]
00bca380	str xzr,[sp, #0x8]
00bca384	bl 0x00c43db0
00bca388	ldp x20,x19,[sp, #0x50]
00bca38c	ldr x23,[sp, #0x38]
00bca390	ldp x22,x21,[sp, #0x40]
00bca394	ldr d8,[sp, #0x20]
00bca398	ldp x29,x30,[sp, #0x28]
00bca39c	add sp,sp,#0x60
00bca3a0	autiasp
00bca3a4	ret
