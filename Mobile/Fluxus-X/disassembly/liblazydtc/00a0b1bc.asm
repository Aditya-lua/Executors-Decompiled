; bn_sqr_normal @ 00a0b1bc
00a0b1bc	str x27,[sp, #-0x60]!
00a0b1c0	stp x26,x25,[sp, #0x10]
00a0b1c4	add x8,x0,w2, SXTW  #0x4
00a0b1c8	mov x25,x0
00a0b1cc	stp x24,x23,[sp, #0x20]
00a0b1d0	stp x22,x21,[sp, #0x30]
00a0b1d4	stp x20,x19,[sp, #0x40]
00a0b1d8	stp x29,x30,[sp, #0x50]
00a0b1dc	mov x19,x3
00a0b1e0	mov w22,w2
00a0b1e4	mov x23,x1
00a0b1e8	mov x21,x0
00a0b1ec	lsl w20,w2,#0x1
00a0b1f0	cmp w2,#0x2
00a0b1f4	stur xzr,[x8, #-0x8]
00a0b1f8	str xzr,[x25], #0x8
00a0b1fc	add x29,sp,#0x50
00a0b200	b.lt 0x00a0b264
00a0b204	mov x1,x23
00a0b208	ldr x3,[x1], #0x8
00a0b20c	sxtw x8,w22
00a0b210	sub x26,x8,#0x1
00a0b214	mov x0,x25
00a0b218	mov w2,w26
00a0b21c	bl 0x00c38900
00a0b220	subs w24,w22,#0x2
00a0b224	str x0,[x25, x26, LSL #0x3]
00a0b228	b.eq 0x00a0b264
00a0b22c	add x8,x21,w22, SXTW  #0x3
00a0b230	add x25,x21,#0x18
00a0b234	add x27,x8,#0x8
00a0b238	add x26,x23,#0x10
00a0b23c	ldur x3,[x26, #-0x8]
00a0b240	mov x0,x25
00a0b244	mov x1,x26
00a0b248	mov w2,w24
00a0b24c	bl 0x00c388d0
00a0b250	str x0,[x27], #0x8
00a0b254	add x25,x25,#0x10
00a0b258	subs w24,w24,#0x1
00a0b25c	add x26,x26,#0x8
00a0b260	b.gt 0x00a0b23c
00a0b264	mov x0,x21
00a0b268	mov x1,x21
00a0b26c	mov x2,x21
00a0b270	mov w3,w20
00a0b274	bl 0x00c388b0
00a0b278	mov x0,x19
00a0b27c	mov x1,x23
00a0b280	mov w2,w22
00a0b284	bl 0x00c38930
00a0b288	mov x0,x21
00a0b28c	mov x1,x21
00a0b290	mov x2,x19
00a0b294	mov w3,w20
00a0b298	ldp x29,x30,[sp, #0x50]
00a0b29c	ldp x20,x19,[sp, #0x40]
00a0b2a0	ldp x22,x21,[sp, #0x30]
00a0b2a4	ldp x24,x23,[sp, #0x20]
00a0b2a8	ldp x26,x25,[sp, #0x10]
00a0b2ac	ldr x27,[sp], #0x60
00a0b2b0	b 0x00c388b0
