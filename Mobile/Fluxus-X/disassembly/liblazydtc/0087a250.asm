; FUN_0087a250 @ 0087a250
0087a250	stp x29,x30,[sp, #-0x40]!
0087a254	stp x24,x23,[sp, #0x10]
0087a258	stp x22,x21,[sp, #0x20]
0087a25c	stp x20,x19,[sp, #0x30]
0087a260	mov x29,sp
0087a264	ldp x9,x8,[x0]
0087a268	sub x21,x8,x9
0087a26c	asr x8,x21,#0x5
0087a270	add x8,x8,#0x1
0087a274	lsr x10,x8,#0x3b
0087a278	cbnz x10,0x0087a3a4
0087a27c	ldr x10,[x0, #0x10]
0087a280	orr x11,xzr,#0x7fffffffffffffe0
0087a284	mov x19,x0
0087a288	sub x9,x10,x9
0087a28c	asr x10,x9,#0x4
0087a290	cmp x10,x8
0087a294	csel x8,x10,x8,hi
0087a298	cmp x9,x11
0087a29c	mov x9,#0x7ffffffffffffff
0087a2a0	csel x8,x8,x9,cc
0087a2a4	lsr x9,x8,#0x3b
0087a2a8	cbnz x9,0x0087a3a8
0087a2ac	lsl x22,x8,#0x5
0087a2b0	mov x20,x1
0087a2b4	mov x0,x22
0087a2b8	bl 0x00c2fed0
0087a2bc	ldr q0,[x20]
0087a2c0	ldr x8,[x20, #0x10]
0087a2c4	add x9,x0,x21
0087a2c8	stp xzr,xzr,[x20]
0087a2cc	ldrb w10,[x20, #0x1c]
0087a2d0	add x22,x0,x22
0087a2d4	str xzr,[x20, #0x10]
0087a2d8	ldp x21,x24,[x19]
0087a2dc	str x8,[x9, #0x10]
0087a2e0	ldr w8,[x20, #0x18]
0087a2e4	add x20,x9,#0x20
0087a2e8	strb w10,[x9, #0x1c]
0087a2ec	str q0,[x9]
0087a2f0	str w8,[x9, #0x18]
0087a2f4	subs x8,x21,x24
0087a2f8	add x23,x9,x8
0087a2fc	b.eq 0x0087a370
0087a300	mov x8,x21
0087a304	mov x9,x23
0087a308	ldr x10,[x8, #0x10]
0087a30c	ldr q0,[x8]
0087a310	str x10,[x9, #0x10]
0087a314	str q0,[x9]
0087a318	ldrb w10,[x8, #0x1c]
0087a31c	ldr w11,[x8, #0x18]
0087a320	stp xzr,xzr,[x8, #0x8]
0087a324	str xzr,[x8]
0087a328	add x8,x8,#0x20
0087a32c	cmp x8,x24
0087a330	strb w10,[x9, #0x1c]
0087a334	str w11,[x9, #0x18]
0087a338	add x9,x9,#0x20
0087a33c	b.ne 0x0087a308
0087a340	b 0x0087a350
0087a344	add x21,x21,#0x20
0087a348	cmp x21,x24
0087a34c	b.eq 0x0087a36c
0087a350	ldrb w8,[x21]
0087a354	tbz w8,#0x0,0x0087a344
0087a358	ldr x8,[x21]
0087a35c	ldr x0,[x21, #0x10]
0087a360	and x1,x8,#-0x2
0087a364	bl 0x00c2fe80
0087a368	b 0x0087a344
0087a36c	ldr x21,[x19]
0087a370	ldr x8,[x19, #0x10]
0087a374	stp x23,x20,[x19]
0087a378	str x22,[x19, #0x10]
0087a37c	cbz x21,0x0087a38c
0087a380	sub x1,x8,x21
0087a384	mov x0,x21
0087a388	bl 0x00c2fe80
0087a38c	mov x0,x20
0087a390	ldp x20,x19,[sp, #0x30]
0087a394	ldp x22,x21,[sp, #0x20]
0087a398	ldp x24,x23,[sp, #0x10]
0087a39c	ldp x29,x30,[sp], #0x40
0087a3a0	ret
0087a3a4	bl 0x0087a3ac
0087a3a8	bl 0x007fe1b8
