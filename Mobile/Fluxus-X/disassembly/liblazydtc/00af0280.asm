; WHIRLPOOL_BitUpdate @ 00af0280
00af0280	sub sp,sp,#0x80
00af0284	stp x28,x27,[sp, #0x20]
00af0288	stp x26,x25,[sp, #0x30]
00af028c	stp x24,x23,[sp, #0x40]
00af0290	stp x22,x21,[sp, #0x50]
00af0294	stp x20,x19,[sp, #0x60]
00af0298	stp x29,x30,[sp, #0x70]
00af029c	ldr w23,[x0, #0x80]
00af02a0	ldr x8,[x0, #0x88]
00af02a4	mov x27,x2
00af02a8	neg w9,w27
00af02ac	mov x26,x1
00af02b0	mov x19,x0
00af02b4	and w24,w9,#0x7
00af02b8	and w25,w23,#0x7
00af02bc	adds x8,x8,x2
00af02c0	add x29,sp,#0x70
00af02c4	str x8,[x0, #0x88]
00af02c8	b.cc 0x00af02ec
00af02cc	ldr x8,[x19, #0x90]
00af02d0	adds x8,x8,#0x1
00af02d4	str x8,[x19, #0x90]
00af02d8	b.ne 0x00af02ec
00af02dc	ldr x8,[x19, #0x98]
00af02e0	adds x8,x8,#0x1
00af02e4	str x8,[x19, #0x98]
00af02e8	b.eq 0x00af0590
00af02ec	orr w8,w24,w25
00af02f0	cbz w8,0x00af04c4
00af02f4	cbz x27,0x00af0570
00af02f8	add x8,x19,#0x40
00af02fc	str x8,[sp, #0x10]
00af0300	mov w8,#0x8
00af0304	sub w12,w8,w24
00af0308	sub w13,w8,w25
00af030c	cmp w25,w24
00af0310	lsr w8,w23,#0x3
00af0314	str x26,[sp, #0x8]
00af0318	b.eq 0x00af0478
00af031c	add x20,x26,#0x1
00af0320	mov w22,w23
00af0324	mov x21,x27
00af0328	str w13,[sp, #0x1c]
00af032c	ldurb w9,[x20, #-0x1]
00af0330	cmp x21,#0x9
00af0334	lsl w28,w9,w24
00af0338	b.cc 0x00af03e4
00af033c	ldrb w9,[x20]
00af0340	lsr w9,w9,w12
00af0344	orr w28,w9,w28
00af0348	add x9,x19,w8, UXTW 
00af034c	cbz w25,0x00af0368
00af0350	ldrb w10,[x9, #0x40]
00af0354	and w11,w28,#0xff
00af0358	lsr w11,w11,w25
00af035c	orr w10,w10,w11
00af0360	strb w10,[x9, #0x40]
00af0364	b 0x00af036c
00af0368	strb w28,[x9, #0x40]
00af036c	add w22,w22,#0x8
00af0370	cmp w22,#0x200
00af0374	b.cc 0x00af03b0
00af0378	ldr x1,[sp, #0x10]
00af037c	mov w2,#0x1
00af0380	mov x0,x19
00af0384	mov w26,w24
00af0388	mov w24,w12
00af038c	bl 0x00c40430
00af0390	ldr w13,[sp, #0x1c]
00af0394	mov w12,w24
00af0398	mov w24,w26
00af039c	mov w8,wzr
00af03a0	and w22,w22,#0x1ff
00af03a4	sub x21,x21,#0x8
00af03a8	cbnz w25,0x00af03bc
00af03ac	b 0x00af0404
00af03b0	add w8,w8,#0x1
00af03b4	sub x21,x21,#0x8
00af03b8	cbz w25,0x00af0404
00af03bc	and w9,w28,#0xff
00af03c0	add x10,x19,w8, UXTW 
00af03c4	lsr w8,w22,#0x3
00af03c8	cmp w25,w24
00af03cc	lsl w9,w9,w13
00af03d0	add x20,x20,#0x1
00af03d4	strb w9,[x10, #0x40]
00af03d8	str w22,[x19, #0x80]
00af03dc	b.ne 0x00af032c
00af03e0	b 0x00af0478
00af03e4	cbz w25,0x00af040c
00af03e8	add x9,x19,w8, UXTW 
00af03ec	ldrb w10,[x9, #0x40]
00af03f0	and w11,w28,#0xff
00af03f4	lsr w11,w11,w25
00af03f8	orr w10,w10,w11
00af03fc	strb w10,[x9, #0x40]
00af0400	b 0x00af0414
00af0404	mov x27,x21
00af0408	b 0x00af045c
00af040c	add x9,x19,w8, UXTW 
00af0410	strb w28,[x9, #0x40]
00af0414	add x22,x21,w22, UXTW 
00af0418	cmp w22,#0x200
00af041c	b.eq 0x00af042c
00af0420	add w8,w8,#0x1
00af0424	cbz w25,0x00af0454
00af0428	b 0x00af05a8
00af042c	ldr x1,[sp, #0x10]
00af0430	mov w2,#0x1
00af0434	mov x0,x19
00af0438	mov w21,w12
00af043c	bl 0x00c40430
00af0440	ldr w13,[sp, #0x1c]
00af0444	mov w12,w21
00af0448	mov w22,wzr
00af044c	mov w8,wzr
00af0450	cbnz w25,0x00af05a8
00af0454	mov x27,xzr
00af0458	sub x20,x20,#0x1
00af045c	mov w25,wzr
00af0460	mov x26,x20
00af0464	mov w23,w22
00af0468	mov w8,#0x8
00af046c	str w22,[x19, #0x80]
00af0470	cbnz x27,0x00af0308
00af0474	b 0x00af0570
00af0478	ldr x26,[sp, #0x8]
00af047c	add x8,x19,w8, UXTW 
00af0480	orr w10,wzr,#0xff
00af0484	lsr w10,w10,w25
00af0488	ldrb w9,[x26], #0x1
00af048c	ldrb w11,[x8, #0x40]
00af0490	add w23,w13,w23
00af0494	cmp w23,#0x200
00af0498	and w9,w9,w10
00af049c	orr w9,w11,w9
00af04a0	sub x27,x27,w13, UXTW 
00af04a4	strb w9,[x8, #0x40]
00af04a8	b.ne 0x00af04c0
00af04ac	ldr x1,[sp, #0x10]
00af04b0	mov w2,#0x1
00af04b4	mov x0,x19
00af04b8	bl 0x00c40430
00af04bc	mov w23,wzr
00af04c0	str w23,[x19, #0x80]
00af04c4	cbz x27,0x00af0570
00af04c8	add x22,x19,#0x40
00af04cc	mov w20,#0x200
00af04d0	cbz w23,0x00af0544
00af04d4	sub w9,w20,w23
00af04d8	subs x24,x27,x9
00af04dc	lsr w8,w23,#0x3
00af04e0	b.cs 0x00af0504
00af04e4	add x8,x19,w8, UXTW 
00af04e8	add x0,x8,#0x40
00af04ec	lsr x2,x27,#0x3
00af04f0	mov x1,x26
00af04f4	bl 0x00c2ffd0
00af04f8	add w23,w23,w27
00af04fc	mov x27,xzr
00af0500	b 0x00af0538
00af0504	ubfx x21,x9,#0x3,#0x1d
00af0508	add x8,x19,w8, UXTW 
00af050c	add x0,x8,#0x40
00af0510	mov x1,x26
00af0514	mov x2,x21
00af0518	bl 0x00c2ffd0
00af051c	mov w2,#0x1
00af0520	mov x0,x19
00af0524	mov x1,x22
00af0528	add x26,x26,x21
00af052c	bl 0x00c40430
00af0530	mov w23,wzr
00af0534	mov x27,x24
00af0538	str w23,[x19, #0x80]
00af053c	cbnz x27,0x00af04d0
00af0540	b 0x00af0570
00af0544	lsr x2,x27,#0x9
00af0548	cbz x2,0x00af04d4
00af054c	mov x0,x19
00af0550	mov x1,x26
00af0554	bl 0x00c40430
00af0558	lsr x8,x27,#0x3
00af055c	and x8,x8,#0x1fffffffffffffc0
00af0560	mov w23,wzr
00af0564	and x27,x27,#0x1ff
00af0568	add x26,x26,x8
00af056c	cbnz x27,0x00af04d0
00af0570	ldp x29,x30,[sp, #0x70]
00af0574	ldp x20,x19,[sp, #0x60]
00af0578	ldp x22,x21,[sp, #0x50]
00af057c	ldp x24,x23,[sp, #0x40]
00af0580	ldp x26,x25,[sp, #0x30]
00af0584	ldp x28,x27,[sp, #0x20]
00af0588	add sp,sp,#0x80
00af058c	ret
00af0590	ldr x8,[x19, #0xa0]
00af0594	add x8,x8,#0x1
00af0598	str x8,[x19, #0xa0]
00af059c	orr w8,w24,w25
00af05a0	cbnz w8,0x00af02f4
00af05a4	b 0x00af04c4
00af05a8	and w9,w28,#0xff
00af05ac	add x8,x19,w8, UXTW 
00af05b0	lsl w9,w9,w13
00af05b4	strb w9,[x8, #0x40]
00af05b8	str w22,[x19, #0x80]
00af05bc	b 0x00af0570
