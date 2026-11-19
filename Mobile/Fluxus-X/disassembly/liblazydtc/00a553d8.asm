; ERR_pop_to_mark @ 00a553d8
00a553d8	str x23,[sp, #-0x40]!
00a553dc	stp x22,x21,[sp, #0x10]
00a553e0	stp x20,x19,[sp, #0x20]
00a553e4	stp x29,x30,[sp, #0x30]
00a553e8	add x29,sp,#0x30
00a553ec	bl 0x00a54260
00a553f0	cbz x0,0x00a554dc
00a553f4	ldr w8,[x0, #0x384]
00a553f8	ldr w9,[x0, #0x380]
00a553fc	mov x19,x0
00a55400	mov w0,wzr
00a55404	cmp w8,w9
00a55408	b.eq 0x00a554dc
00a5540c	adrp x20,0x2d3000
00a55410	mov w21,#0xffffffff
00a55414	add x20,x20,#0xaa2
00a55418	orr w22,wzr,#0xf
00a5541c	add x8,x19,w9, SXTW  #0x2
00a55420	ldr w10,[x8, #0x40]!
00a55424	cbnz w10,0x00a554d0
00a55428	sxtw x9,w9
00a5542c	add x10,x19,x9, LSL #0x2
00a55430	ldrb w11,[x10, #0x200]
00a55434	add x12,x19,x9, LSL #0x3
00a55438	add x13,x12,#0x100
00a5543c	tbnz w11,#0x0,0x00a55450
00a55440	mov w11,wzr
00a55444	str xzr,[x13]
00a55448	str xzr,[x12, #0x180]
00a5544c	b 0x00a55460
00a55450	ldr x11,[x13]
00a55454	cbz x11,0x00a55468
00a55458	strb wzr,[x11]
00a5545c	mov w11,#0x1
00a55460	add x10,x10,#0x200
00a55464	str w11,[x10]
00a55468	str wzr,[x8]
00a5546c	add x8,x19,x9, LSL #0x2
00a55470	add x23,x19,x9, LSL #0x3
00a55474	str wzr,[x8]
00a55478	str xzr,[x23, #0x80]
00a5547c	str w21,[x8, #0x2c0]
00a55480	ldr x0,[x23, #0x240]
00a55484	mov w2,#0x56
00a55488	mov x1,x20
00a5548c	bl 0x00c32310
00a55490	ldr x0,[x23, #0x300]
00a55494	mov w2,#0x58
00a55498	mov x1,x20
00a5549c	str xzr,[x23, #0x240]
00a554a0	bl 0x00c32310
00a554a4	str xzr,[x23, #0x300]
00a554a8	ldr w8,[x19, #0x380]
00a554ac	ldr w10,[x19, #0x384]
00a554b0	sub w9,w8,#0x1
00a554b4	cmp w8,#0x0
00a554b8	csel w9,w9,w22,gt
00a554bc	cmp w10,w9
00a554c0	str w9,[x19, #0x380]
00a554c4	b.ne 0x00a5541c
00a554c8	mov w0,wzr
00a554cc	b 0x00a554dc
00a554d0	sub w9,w10,#0x1
00a554d4	mov w0,#0x1
00a554d8	str w9,[x8]
00a554dc	ldp x29,x30,[sp, #0x30]
00a554e0	ldp x20,x19,[sp, #0x20]
00a554e4	ldp x22,x21,[sp, #0x10]
00a554e8	ldr x23,[sp], #0x40
00a554ec	ret
