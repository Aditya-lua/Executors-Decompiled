; FUN_00bba0f0 @ 00bba0f0
00bba0f0	cbz x2,0x00bba278
00bba0f4	cmp x4,#0xa
00bba0f8	b.cs 0x00bba104
00bba0fc	mov x0,#-0x14
00bba100	ret
00bba104	ldr w8,[x5], #0x4
00bba108	and w8,w8,#0xff0000
00bba10c	cmp w8,#0xb0, LSL #12
00bba110	b.ne 0x00bba278
00bba114	ldrh w12,[x3]
00bba118	ldrh w13,[x3, #0x2]
00bba11c	add x9,x3,#0x6
00bba120	ldrh w14,[x3, #0x4]
00bba124	mov x8,xzr
00bba128	add x11,x9,x12
00bba12c	cmp x12,#0x8
00bba130	add x10,x11,x13
00bba134	stp x9,x11,[x0, #0x78]
00bba138	add x9,x10,x14
00bba13c	stp x10,x9,[x0, #0x88]
00bba140	b.cc 0x00bba270
00bba144	cmp w13,#0x8
00bba148	b.cc 0x00bba270
00bba14c	cmp w14,#0x8
00bba150	b.cc 0x00bba270
00bba154	add x12,x12,x13
00bba158	add x12,x12,x14
00bba15c	add x12,x12,#0x6
00bba160	sub x13,x4,x12
00bba164	cmp x13,#0x8
00bba168	b.cc 0x00bba270
00bba16c	cmp x4,x12
00bba170	b.cs 0x00bba17c
00bba174	mov x0,#-0x14
00bba178	ret
00bba17c	sub x8,x11,#0x8
00bba180	sub x12,x10,#0x8
00bba184	add x13,x2,#0x3
00bba188	stp x8,x12,[x0]
00bba18c	add x8,x3,x4
00bba190	lsr x13,x13,#0x2
00bba194	sub x12,x9,#0x8
00bba198	sub x14,x8,#0x8
00bba19c	stp x12,x14,[x0, #0x10]
00bba1a0	bic x12,x2,x2, ASR #0x3f
00bba1a4	add x14,x1,x13
00bba1a8	add x15,x14,x13
00bba1ac	stp x1,x14,[x0, #0x20]
00bba1b0	add x12,x1,x12
00bba1b4	add x13,x15,x13
00bba1b8	cmp x13,x12
00bba1bc	stp x15,x13,[x0, #0x30]
00bba1c0	b.cs 0x00bba278
00bba1c4	ldurb w13,[x11, #-0x1]
00bba1c8	mov w15,#0x8
00bba1cc	ldur x11,[x11, #-0x8]
00bba1d0	clz w14,w13
00bba1d4	cmp w13,#0x0
00bba1d8	orr x11,x11,#0x1
00bba1dc	eor w14,w14,#0x1f
00bba1e0	sub w13,w15,w14
00bba1e4	csel x13,xzr,x13,eq
00bba1e8	lsl x11,x11,x13
00bba1ec	str x11,[x0, #0x40]
00bba1f0	ldurb w11,[x10, #-0x1]
00bba1f4	ldur x10,[x10, #-0x8]
00bba1f8	clz w13,w11
00bba1fc	cmp w11,#0x0
00bba200	orr x10,x10,#0x1
00bba204	eor w13,w13,#0x1f
00bba208	sub w11,w15,w13
00bba20c	csel x11,xzr,x11,eq
00bba210	lsl x10,x10,x11
00bba214	str x10,[x0, #0x48]
00bba218	ldurb w10,[x9, #-0x1]
00bba21c	ldur x9,[x9, #-0x8]
00bba220	clz w11,w10
00bba224	cmp w10,#0x0
00bba228	orr x9,x9,#0x1
00bba22c	eor w11,w11,#0x1f
00bba230	sub w10,w15,w11
00bba234	csel x10,xzr,x10,eq
00bba238	lsl x9,x9,x10
00bba23c	str x9,[x0, #0x50]
00bba240	ldurb w9,[x8, #-0x1]
00bba244	ldur x8,[x8, #-0x8]
00bba248	stp x3,x12,[x0, #0x68]
00bba24c	clz w10,w9
00bba250	cmp w9,#0x0
00bba254	orr x8,x8,#0x1
00bba258	eor w10,w10,#0x1f
00bba25c	sub w9,w15,w10
00bba260	csel x9,xzr,x9,eq
00bba264	lsl x8,x8,x9
00bba268	stp x8,x5,[x0, #0x58]
00bba26c	mov w8,#0x1
00bba270	mov x0,x8
00bba274	ret
00bba278	mov x0,xzr
00bba27c	ret
