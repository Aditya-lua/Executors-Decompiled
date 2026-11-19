; BN_bn2hex @ 00aa02b8
00aa02b8	str x19,[sp, #-0x20]!
00aa02bc	stp x29,x30,[sp, #0x10]
00aa02c0	add x29,sp,#0x10
00aa02c4	mov x19,x0
00aa02c8	bl 0x00c369b0
00aa02cc	cbz w0,0x00aa02f0
00aa02d0	ldp x29,x30,[sp, #0x10]
00aa02d4	adrp x0,0x2cb000
00aa02d8	adrp x1,0x2a6000
00aa02dc	add x0,x0,#0x723
00aa02e0	add x1,x1,#0x3aa
00aa02e4	orr w2,wzr,#0x18
00aa02e8	ldr x19,[sp], #0x20
00aa02ec	b 0x00c34600
00aa02f0	ldr w8,[x19, #0x8]
00aa02f4	mov w9,#0x2
00aa02f8	adrp x1,0x2a6000
00aa02fc	add x1,x1,#0x3aa
00aa0300	bfm w9,w8,#0x1c,#0x1b
00aa0304	sxtw x0,w9
00aa0308	mov w2,#0x19
00aa030c	bl 0x00c32320
00aa0310	cbz x0,0x00aa051c
00aa0314	ldr w8,[x19, #0x10]
00aa0318	mov x10,x0
00aa031c	cbz w8,0x00aa032c
00aa0320	mov w8,#0x2d
00aa0324	mov x10,x0
00aa0328	strb w8,[x10], #0x1
00aa032c	ldrsw x8,[x19, #0x8]
00aa0330	cmp w8,#0x1
00aa0334	b.lt 0x00aa0514
00aa0338	adrp x9,0x2a3000
00aa033c	mov w12,wzr
00aa0340	add x9,x9,#0x64c
00aa0344	ldr x11,[x19]
00aa0348	add x11,x11,x8, LSL #0x3
00aa034c	ldur x11,[x11, #-0x8]
00aa0350	lsr x13,x11,#0x38
00aa0354	orr w13,w12,w13
00aa0358	cbz w13,0x00aa0388
00aa035c	lsr x12,x11,#0x3c
00aa0360	ubfx x11,x11,#0x38,#0x4
00aa0364	ldrb w12,[x9, x12]
00aa0368	ldrb w11,[x9, x11]
00aa036c	strb w12,[x10]
00aa0370	strb w11,[x10, #0x1]
00aa0374	ldr x11,[x19]
00aa0378	add x10,x10,#0x2
00aa037c	mov w12,#0x1
00aa0380	add x11,x11,x8, LSL #0x3
00aa0384	ldur x11,[x11, #-0x8]
00aa0388	ubfx x13,x11,#0x30,#0x8
00aa038c	orr w14,w13,w12
00aa0390	cbz w14,0x00aa03c0
00aa0394	lsr w12,w13,#0x4
00aa0398	ubfx x11,x11,#0x30,#0x4
00aa039c	ldrb w12,[x9, w12, UXTW ]
00aa03a0	ldrb w11,[x9, x11]
00aa03a4	strb w12,[x10]
00aa03a8	strb w11,[x10, #0x1]
00aa03ac	ldr x11,[x19]
00aa03b0	add x10,x10,#0x2
00aa03b4	mov w12,#0x1
00aa03b8	add x11,x11,x8, LSL #0x3
00aa03bc	ldur x11,[x11, #-0x8]
00aa03c0	ubfx x13,x11,#0x28,#0x8
00aa03c4	orr w14,w13,w12
00aa03c8	cbz w14,0x00aa03f8
00aa03cc	lsr w12,w13,#0x4
00aa03d0	ubfx x11,x11,#0x28,#0x4
00aa03d4	ldrb w12,[x9, w12, UXTW ]
00aa03d8	ldrb w11,[x9, x11]
00aa03dc	strb w12,[x10]
00aa03e0	strb w11,[x10, #0x1]
00aa03e4	ldr x11,[x19]
00aa03e8	add x10,x10,#0x2
00aa03ec	mov w12,#0x1
00aa03f0	add x11,x11,x8, LSL #0x3
00aa03f4	ldur x11,[x11, #-0x8]
00aa03f8	ubfx x13,x11,#0x20,#0x8
00aa03fc	orr w14,w13,w12
00aa0400	cbz w14,0x00aa0430
00aa0404	lsr w12,w13,#0x4
00aa0408	ubfx x11,x11,#0x20,#0x4
00aa040c	ldrb w12,[x9, w12, UXTW ]
00aa0410	ldrb w11,[x9, x11]
00aa0414	strb w12,[x10]
00aa0418	strb w11,[x10, #0x1]
00aa041c	ldr x11,[x19]
00aa0420	add x10,x10,#0x2
00aa0424	mov w12,#0x1
00aa0428	add x11,x11,x8, LSL #0x3
00aa042c	ldur x11,[x11, #-0x8]
00aa0430	ubfx x13,x11,#0x18,#0x8
00aa0434	orr w14,w13,w12
00aa0438	cbz w14,0x00aa0468
00aa043c	lsr w12,w13,#0x4
00aa0440	ubfx x11,x11,#0x18,#0x4
00aa0444	ldrb w12,[x9, w12, UXTW ]
00aa0448	ldrb w11,[x9, x11]
00aa044c	strb w12,[x10]
00aa0450	strb w11,[x10, #0x1]
00aa0454	ldr x11,[x19]
00aa0458	add x10,x10,#0x2
00aa045c	mov w12,#0x1
00aa0460	add x11,x11,x8, LSL #0x3
00aa0464	ldur x11,[x11, #-0x8]
00aa0468	ubfx w13,w11,#0x10,#0x8
00aa046c	orr w14,w13,w12
00aa0470	cbz w14,0x00aa04a0
00aa0474	lsr w12,w13,#0x4
00aa0478	ubfx x11,x11,#0x10,#0x4
00aa047c	ldrb w12,[x9, w12, UXTW ]
00aa0480	ldrb w11,[x9, x11]
00aa0484	strb w12,[x10]
00aa0488	strb w11,[x10, #0x1]
00aa048c	ldr x11,[x19]
00aa0490	add x10,x10,#0x2
00aa0494	mov w12,#0x1
00aa0498	add x11,x11,x8, LSL #0x3
00aa049c	ldur x11,[x11, #-0x8]
00aa04a0	ubfx w13,w11,#0x8,#0x8
00aa04a4	orr w14,w13,w12
00aa04a8	cbz w14,0x00aa04d8
00aa04ac	lsr w12,w13,#0x4
00aa04b0	ubfx x11,x11,#0x8,#0x4
00aa04b4	ldrb w12,[x9, w12, UXTW ]
00aa04b8	ldrb w11,[x9, x11]
00aa04bc	strb w12,[x10]
00aa04c0	strb w11,[x10, #0x1]
00aa04c4	ldr x11,[x19]
00aa04c8	add x10,x10,#0x2
00aa04cc	mov w12,#0x1
00aa04d0	add x11,x11,x8, LSL #0x3
00aa04d4	ldur x11,[x11, #-0x8]
00aa04d8	and w13,w11,#0xff
00aa04dc	orr w14,w13,w12
00aa04e0	sub x8,x8,#0x1
00aa04e4	cbz w14,0x00aa0508
00aa04e8	lsr w12,w13,#0x4
00aa04ec	and x11,x11,#0xf
00aa04f0	ldrb w12,[x9, w12, UXTW ]
00aa04f4	ldrb w11,[x9, x11]
00aa04f8	strb w12,[x10]
00aa04fc	strb w11,[x10, #0x1]
00aa0500	add x10,x10,#0x2
00aa0504	mov w12,#0x1
00aa0508	add x11,x8,#0x1
00aa050c	cmp x11,#0x1
00aa0510	b.gt 0x00aa0344
00aa0514	strb wzr,[x10]
00aa0518	b 0x00aa0550
00aa051c	bl 0x00c342a0
00aa0520	adrp x0,0x2a6000
00aa0524	adrp x2,0x2b4000
00aa0528	add x0,x0,#0x3aa
00aa052c	add x2,x2,#0x4c2
00aa0530	mov w1,#0x1b
00aa0534	bl 0x00c342b0
00aa0538	mov w1,#0x100
00aa053c	orr w0,wzr,#0x3
00aa0540	movk w1,#0xc, LSL #16
00aa0544	mov x2,xzr
00aa0548	bl 0x00c342c0
00aa054c	mov x0,xzr
00aa0550	ldp x29,x30,[sp, #0x10]
00aa0554	ldr x19,[sp], #0x20
00aa0558	ret
