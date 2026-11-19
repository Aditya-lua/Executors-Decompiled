; FUN_0084c130 @ 0084c130
0084c130	sub sp,sp,#0x90
0084c134	stp x29,x30,[sp, #0x30]
0084c138	str x27,[sp, #0x40]
0084c13c	stp x26,x25,[sp, #0x50]
0084c140	stp x24,x23,[sp, #0x60]
0084c144	stp x22,x21,[sp, #0x70]
0084c148	stp x20,x19,[sp, #0x80]
0084c14c	add x29,sp,#0x30
0084c150	mrs x26,tpidr_el0
0084c154	mov x19,x0
0084c158	ldr x8,[x26, #0x28]
0084c15c	stur x8,[x29, #-0x8]
0084c160	ldr x8,[x0, #0x20]
0084c164	subs x8,x8,#0x2a
0084c168	b.cc 0x0084c190
0084c16c	ldr x9,[x19, #0x8]
0084c170	str x8,[x19, #0x20]
0084c174	ldr x8,[x9], #0x8
0084c178	str x9,[x19, #0x8]
0084c17c	str x8,[sp]
0084c180	mov x1,sp
0084c184	mov x0,x19
0084c188	bl 0x0084c38c
0084c18c	b 0x0084c308
0084c190	mov x8,x19
0084c194	ldp x27,x20,[x19, #0x8]
0084c198	ldr x9,[x8, #0x18]!
0084c19c	ldr x10,[x19]
0084c1a0	sub x21,x20,x27
0084c1a4	sub x11,x9,x10
0084c1a8	cmp x21,x11
0084c1ac	b.cs 0x0084c1d4
0084c1b0	mov w0,#0xfc0
0084c1b4	cmp x9,x20
0084c1b8	b.eq 0x0084c244
0084c1bc	bl 0x00c2fed0
0084c1c0	str x0,[sp]
0084c1c4	mov x1,sp
0084c1c8	mov x0,x19
0084c1cc	bl 0x0084c50c
0084c1d0	b 0x0084c308
0084c1d4	asr x11,x11,#0x2
0084c1d8	cmp x9,x10
0084c1dc	str x8,[sp, #0x20]
0084c1e0	csinc x9,x11,xzr,ne
0084c1e4	lsr x10,x9,#0x3d
0084c1e8	cbnz x10,0x0084c338
0084c1ec	lsl x25,x9,#0x3
0084c1f0	mov x0,x25
0084c1f4	bl 0x00c2fed0
0084c1f8	mov x24,x0
0084c1fc	add x22,x0,x21
0084c200	add x8,x0,x25
0084c204	stp x0,x22,[sp]
0084c208	stp x22,x8,[sp, #0x10]
0084c20c	mov w0,#0xfc0
0084c210	bl 0x00c2fed0
0084c214	mov x23,x0
0084c218	cmp x21,x25
0084c21c	b.ne 0x0084c294
0084c220	cmp x20,x27
0084c224	b.eq 0x0084c26c
0084c228	asr x8,x21,#0x3
0084c22c	add x8,x8,#0x1
0084c230	add x8,x8,x8, LSR #0x3f
0084c234	lsr x8,x8,#0x1
0084c238	sub x22,x22,x8, LSL #0x3
0084c23c	str x22,[sp, #0x8]
0084c240	b 0x0084c294
0084c244	bl 0x00c2fed0
0084c248	str x0,[sp]
0084c24c	mov x1,sp
0084c250	mov x0,x19
0084c254	bl 0x0084c68c
0084c258	ldr x8,[x19, #0x8]
0084c25c	ldr x9,[x8], #0x8
0084c260	str x8,[x19, #0x8]
0084c264	str x9,[sp]
0084c268	b 0x0084c180
0084c26c	mov w0,#0x8
0084c270	bl 0x00c2fed0
0084c274	mov x22,x0
0084c278	stp x0,x0,[sp]
0084c27c	add x8,x0,#0x8
0084c280	mov x0,x24
0084c284	mov x1,x21
0084c288	str x8,[sp, #0x18]
0084c28c	bl 0x00c2fe80
0084c290	ldr x20,[x19, #0x10]
0084c294	mov x8,#-0x7
0084c298	str x23,[x22], #0x8
0084c29c	sub x21,x8,x20
0084c2a0	str x22,[sp, #0x10]
0084c2a4	ldr x8,[x19, #0x8]
0084c2a8	cmp x20,x8
0084c2ac	b.eq 0x0084c2c8
0084c2b0	sub x20,x20,#0x8
0084c2b4	add x21,x21,#0x8
0084c2b8	mov x0,sp
0084c2bc	mov x1,x20
0084c2c0	bl 0x0084c820
0084c2c4	b 0x0084c2a4
0084c2c8	ldr x0,[x19]
0084c2cc	ldp q0,q1,[sp]
0084c2d0	stp x0,x8,[sp]
0084c2d4	ldp x9,x8,[x19, #0x10]
0084c2d8	stp q0,q1,[x19]
0084c2dc	cmp x20,x9
0084c2e0	stp x9,x8,[sp, #0x10]
0084c2e4	b.eq 0x0084c2fc
0084c2e8	neg x10,x21
0084c2ec	sub x10,x10,x9
0084c2f0	and x10,x10,#-0x8
0084c2f4	add x9,x9,x10
0084c2f8	str x9,[sp, #0x10]
0084c2fc	cbz x0,0x0084c308
0084c300	sub x1,x8,x0
0084c304	bl 0x00c2fe80
0084c308	ldr x8,[x26, #0x28]
0084c30c	ldur x9,[x29, #-0x8]
0084c310	cmp x8,x9
0084c314	b.ne 0x0084c388
0084c318	ldp x20,x19,[sp, #0x80]
0084c31c	ldr x27,[sp, #0x40]
0084c320	ldp x22,x21,[sp, #0x70]
0084c324	ldp x24,x23,[sp, #0x60]
0084c328	ldp x26,x25,[sp, #0x50]
0084c32c	ldp x29,x30,[sp, #0x30]
0084c330	add sp,sp,#0x90
0084c334	ret
0084c338	ldr x8,[x26, #0x28]
0084c33c	ldur x9,[x29, #-0x8]
0084c340	cmp x8,x9
0084c344	b.ne 0x0084c388
0084c348	bl 0x007fe1b8
0084c388	bl 0x00c2fec0
