; FUN_008a426c @ 008a426c
008a426c	stp x29,x30,[sp, #-0x20]!
008a4270	stp x20,x19,[sp, #0x10]
008a4274	mov x29,sp
008a4278	ldr x8,[x1, #0x20]
008a427c	mov x20,x0
008a4280	mov x19,x1
008a4284	mov x1,x20
008a4288	ldr x9,[x8]
008a428c	mov x0,x8
008a4290	ldr x9,[x9]
008a4294	blr x9
008a4298	ldr x8,[x20, #0x108]
008a429c	cbz x8,0x008a4354
008a42a0	ldr x8,[x19, #0x20]
008a42a4	mov x11,#0x2d69
008a42a8	movk x11,#0xeb38, LSL #16
008a42ac	lsl w9,w8,#0x3
008a42b0	lsr x10,x8,#0x20
008a42b4	movk x11,#0xea08, LSL #32
008a42b8	movk x11,#0x9ddf, LSL #48
008a42bc	add x9,x9,#0x8
008a42c0	eor x9,x9,x10
008a42c4	mul x9,x9,x11
008a42c8	eor x10,x10,x9, LSR #0x2f
008a42cc	eor x9,x10,x9
008a42d0	mov x10,#0x959d
008a42d4	mul x9,x9,x11
008a42d8	movk x10,#0xb8f4, LSL #16
008a42dc	movk x10,#0xd34f, LSL #32
008a42e0	movk x10,#0x949d, LSL #48
008a42e4	eor x9,x9,x9, LSR #0x2f
008a42e8	mul x9,x9,x10
008a42ec	ldrb w10,[x20, #0x110]
008a42f0	lsr x9,x9,x10
008a42f4	ldr x10,[x20, #0xf8]
008a42f8	lsr x11,x9,#0x6
008a42fc	ldr x11,[x10, x11, LSL #0x3]
008a4300	lsr x11,x11,x9
008a4304	tbz w11,#0x0,0x008a4354
008a4308	ldr x12,[x20, #0x100]
008a430c	ldr x11,[x20, #0xe0]
008a4310	sub x12,x12,#0x1
008a4314	lsl x13,x9,#0x4
008a4318	ldr x13,[x11, x13#0x0]
008a431c	cmp x13,x8
008a4320	b.eq 0x008a4340
008a4324	add x9,x9,#0x1
008a4328	and x9,x9,x12
008a432c	lsr x13,x9,#0x6
008a4330	ldr x13,[x10, x13, LSL #0x3]
008a4334	lsr x13,x13,x9
008a4338	tbnz w13,#0x0,0x008a4314
008a433c	b 0x008a4354
008a4340	add x8,x11,x9, LSL #0x4
008a4344	mov x0,x20
008a4348	mov x1,x19
008a434c	ldr x2,[x8, #0x8]
008a4350	bl 0x008a63d0
008a4354	mov w0,wzr
008a4358	ldp x20,x19,[sp, #0x10]
008a435c	ldp x29,x30,[sp], #0x20
008a4360	ret
