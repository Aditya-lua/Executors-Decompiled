; FUN_00a93170 @ 00a93170
00a93170	sub sp,sp,#0x70
00a93174	stp x28,x27,[sp, #0x10]
00a93178	stp x26,x25,[sp, #0x20]
00a9317c	stp x24,x23,[sp, #0x30]
00a93180	stp x22,x21,[sp, #0x40]
00a93184	stp x20,x19,[sp, #0x50]
00a93188	stp x29,x30,[sp, #0x60]
00a9318c	add x29,sp,#0x60
00a93190	cbz x3,0x00a93274
00a93194	lsr x8,x3,#0x1b
00a93198	mov w9,#0x8000000
00a9319c	cmp x8,#0x0
00a931a0	mov x20,x2
00a931a4	mov x21,x1
00a931a8	mov x22,x0
00a931ac	add x23,x0,#0x28
00a931b0	mov w10,#0x1
00a931b4	orr w11,wzr,#0xffffff80
00a931b8	csel x27,x3,x9,eq
00a931bc	lsl x19,x27,#0x3
00a931c0	str x3,[sp]
00a931c4	cbz x19,0x00a93258
00a931c8	mov x25,xzr
00a931cc	lsr x26,x25,#0x3
00a931d0	ldrb w8,[x20, x26]
00a931d4	and w28,w25,#0x7
00a931d8	eor w9,w28,#0x7
00a931dc	lsl w9,w10,w9
00a931e0	tst w9,w8
00a931e4	csel w8,wzr,w11,eq
00a931e8	mov x0,x22
00a931ec	strb w8,[sp, #0xc]
00a931f0	bl 0x00c3cea0
00a931f4	mov x24,x0
00a931f8	mov x0,x22
00a931fc	bl 0x00c3cec0
00a93200	mov w6,w0
00a93204	add x0,sp,#0xc
00a93208	add x1,sp,#0x8
00a9320c	mov w2,#0x1
00a93210	mov w3,#0x1
00a93214	mov x4,x24
00a93218	mov x5,x23
00a9321c	bl 0x00c399d0
00a93220	ldrb w9,[sp, #0x8]
00a93224	ldrb w8,[x21, x26]
00a93228	orr w10,wzr,#0xffffff7f
00a9322c	asr w10,w10,w28
00a93230	and w9,w9,#0x80
00a93234	add x25,x25,#0x1
00a93238	and w8,w10,w8
00a9323c	lsr w9,w9,w28
00a93240	orr w11,wzr,#0xffffff80
00a93244	mov w10,#0x1
00a93248	orr w8,w9,w8
00a9324c	cmp x19,x25
00a93250	strb w8,[x21, x26]
00a93254	b.ne 0x00a931cc
00a93258	ldr x3,[sp]
00a9325c	add x20,x20,x27
00a93260	add x21,x21,x27
00a93264	sub x3,x3,x27
00a93268	cmp x3,x27
00a9326c	csel x27,x3,x27,cc
00a93270	cbnz x3,0x00a931bc
00a93274	ldp x29,x30,[sp, #0x60]
00a93278	ldp x20,x19,[sp, #0x50]
00a9327c	ldp x22,x21,[sp, #0x40]
00a93280	ldp x24,x23,[sp, #0x30]
00a93284	ldp x26,x25,[sp, #0x20]
00a93288	ldp x28,x27,[sp, #0x10]
00a9328c	mov w0,#0x1
00a93290	add sp,sp,#0x70
00a93294	ret
