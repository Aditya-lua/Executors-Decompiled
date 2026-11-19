; ix::WebSocketHandshake::genRandomString @ 0099b164
0099b164	sub sp,sp,#0x70
0099b168	stp x24,x23,[sp, #0x30]
0099b16c	stp x22,x21,[sp, #0x40]
0099b170	stp x20,x19,[sp, #0x50]
0099b174	stp x29,x30,[sp, #0x60]
0099b178	add x29,sp,#0x60
0099b17c	mrs x23,tpidr_el0
0099b180	mov x20,x8
0099b184	ldr x8,[x23, #0x28]
0099b188	mov w0,#0x20
0099b18c	mov w21,w1
0099b190	str x8,[sp, #0x28]
0099b194	bl 0x00c2fed0
0099b198	adrp x8,0x29d000
0099b19c	add x8,x8,#0xa49
0099b1a0	ldur q0,[x8, #0xa]
0099b1a4	orr w9,wzr,#0x18
0099b1a8	stp xzr,xzr,[sp, #0x8]
0099b1ac	strb w9,[sp, #0x8]
0099b1b0	adrp x9,0x2cd000
0099b1b4	add x9,x9,#0x391
0099b1b8	stur q0,[x0, #0xa]
0099b1bc	ldr q0,[x8]
0099b1c0	ldr x9,[x9]
0099b1c4	mov w8,#0x646e
0099b1c8	mov x19,x0
0099b1cc	movk w8,#0x6d6f, LSL #16
0099b1d0	str xzr,[sp, #0x18]
0099b1d4	stur w8,[sp, #0x11]
0099b1d8	strb wzr,[x0, #0x1a]
0099b1dc	str q0,[x0]
0099b1e0	stur x9,[sp, #0x9]
0099b1e4	strb wzr,[sp, #0x15]
0099b1e8	add x0,sp,#0x20
0099b1ec	add x1,sp,#0x8
0099b1f0	bl 0x00c331e0
0099b1f4	ldrb w8,[sp, #0x8]
0099b1f8	tbz w8,#0x0,0x0099b204
0099b1fc	ldr x0,[sp, #0x18]
0099b200	bl 0x00c301d0
0099b204	add x0,sp,#0x20
0099b208	bl 0x00c33200
0099b20c	mov w8,w0
0099b210	add x8,x8,w0, UXTW  #0x1
0099b214	adrp x9,0x29a000
0099b218	lsr x8,x8,#0x20
0099b21c	ldr d0,[x9, #0x3f8]
0099b220	sub w9,w0,w8
0099b224	add w8,w8,w9, LSR #0x1
0099b228	lsr w8,w8,#0x1e
0099b22c	lsl w9,w8,#0x1f
0099b230	sub w8,w9,w8
0099b234	subs w8,w0,w8
0099b238	csinc x8,x8,xzr,ne
0099b23c	sxtw x22,w21
0099b240	stp xzr,xzr,[x20]
0099b244	str xzr,[x20, #0x10]
0099b248	str d0,[sp]
0099b24c	str x8,[sp, #0x8]
0099b250	cbz w21,0x0099b2ac
0099b254	mov x0,x20
0099b258	mov x1,x22
0099b25c	mov w2,wzr
0099b260	bl 0x00c30250
0099b264	cmp w21,#0x1
0099b268	b.lt 0x0099b2bc
0099b26c	mov x21,xzr
0099b270	add x24,x20,#0x1
0099b274	mov x0,sp
0099b278	add x1,sp,#0x8
0099b27c	mov x2,sp
0099b280	bl 0x00c33be0
0099b284	ldrb w8,[x20]
0099b288	ldr x9,[x20, #0x10]
0099b28c	ldrb w10,[x19, w0, SXTW ]
0099b290	tst w8,#0x1
0099b294	csel x8,x24,x9,eq
0099b298	strb w10,[x8, x21]
0099b29c	add x21,x21,#0x1
0099b2a0	cmp x21,x22
0099b2a4	b.lt 0x0099b274
0099b2a8	b 0x0099b2bc
0099b2ac	add x8,x20,x22
0099b2b0	lsl w9,w21,#0x1
0099b2b4	strb wzr,[x8, #0x1]
0099b2b8	strb w9,[x20]
0099b2bc	add x0,sp,#0x20
0099b2c0	bl 0x00c331f0
0099b2c4	mov x0,x19
0099b2c8	bl 0x00c301d0
0099b2cc	ldr x8,[x23, #0x28]
0099b2d0	ldr x9,[sp, #0x28]
0099b2d4	cmp x8,x9
0099b2d8	b.ne 0x0099b2f4
0099b2dc	ldp x29,x30,[sp, #0x60]
0099b2e0	ldp x20,x19,[sp, #0x50]
0099b2e4	ldp x22,x21,[sp, #0x40]
0099b2e8	ldp x24,x23,[sp, #0x30]
0099b2ec	add sp,sp,#0x70
0099b2f0	ret
0099b2f4	bl 0x00c2fec0
