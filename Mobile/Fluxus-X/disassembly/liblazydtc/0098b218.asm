; ix::setThreadName @ 0098b218
0098b218	sub sp,sp,#0x60
0098b21c	stp x24,x23,[sp, #0x20]
0098b220	stp x22,x21,[sp, #0x30]
0098b224	stp x20,x19,[sp, #0x40]
0098b228	stp x29,x30,[sp, #0x50]
0098b22c	add x29,sp,#0x50
0098b230	mrs x23,tpidr_el0
0098b234	ldr x8,[x23, #0x28]
0098b238	mov x19,x0
0098b23c	str x8,[sp, #0x18]
0098b240	bl 0x00c31940
0098b244	stp xzr,xzr,[sp, #0x8]
0098b248	str xzr,[sp]
0098b24c	ldrb w8,[x19]
0098b250	ldp x9,x10,[x19, #0x8]
0098b254	lsr w11,w8,#0x1
0098b258	tst w8,#0x1
0098b25c	csel x8,x11,x9,eq
0098b260	csinc x21,x10,x19,ne
0098b264	cmp x8,#0xf
0098b268	orr w9,wzr,#0xf
0098b26c	csel x20,x8,x9,cc
0098b270	cmn x20,#0x10
0098b274	b.cs 0x0098b324
0098b278	mov x19,x0
0098b27c	cmp x20,#0x17
0098b280	b.cs 0x0098b2a0
0098b284	mov x9,sp
0098b288	orr x24,x9,#0x1
0098b28c	lsl w8,w20,#0x1
0098b290	mov x22,x24
0098b294	strb w8,[sp]
0098b298	cbnz x20,0x0098b2c0
0098b29c	b 0x0098b2d0
0098b2a0	mov w0,#0x10
0098b2a4	bl 0x00c2fed0
0098b2a8	mov w8,#0x11
0098b2ac	mov x9,sp
0098b2b0	mov x22,x0
0098b2b4	stp x20,x0,[sp, #0x8]
0098b2b8	str x8,[sp]
0098b2bc	orr x24,x9,#0x1
0098b2c0	mov x0,x22
0098b2c4	mov x1,x21
0098b2c8	mov x2,x20
0098b2cc	bl 0x00c2ffd0
0098b2d0	strb wzr,[x22, x20]
0098b2d4	ldrb w8,[sp]
0098b2d8	ldr x9,[sp, #0x10]
0098b2dc	tst w8,#0x1
0098b2e0	csel x1,x24,x9,eq
0098b2e4	mov x0,x19
0098b2e8	bl 0x00c336d0
0098b2ec	ldrb w8,[sp]
0098b2f0	tbz w8,#0x0,0x0098b2fc
0098b2f4	ldr x0,[sp, #0x10]
0098b2f8	bl 0x00c301d0
0098b2fc	ldr x8,[x23, #0x28]
0098b300	ldr x9,[sp, #0x18]
0098b304	cmp x8,x9
0098b308	b.ne 0x0098b32c
0098b30c	ldp x29,x30,[sp, #0x50]
0098b310	ldp x20,x19,[sp, #0x40]
0098b314	ldp x22,x21,[sp, #0x30]
0098b318	ldp x24,x23,[sp, #0x20]
0098b31c	add sp,sp,#0x60
0098b320	ret
0098b324	mov x0,sp
0098b328	bl 0x00c30ce0
0098b32c	bl 0x00c2fec0
