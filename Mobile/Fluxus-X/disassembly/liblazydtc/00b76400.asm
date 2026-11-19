; FUN_00b76400 @ 00b76400
00b76400	sub sp,sp,#0xd0
00b76404	stp x24,x23,[sp, #0x90]
00b76408	stp x22,x21,[sp, #0xa0]
00b7640c	stp x20,x19,[sp, #0xb0]
00b76410	stp x29,x30,[sp, #0xc0]
00b76414	add x29,sp,#0xc0
00b76418	mrs x22,tpidr_el0
00b7641c	ldr x8,[x22, #0x28]
00b76420	mov x19,x0
00b76424	stur x8,[x29, #-0x38]
00b76428	ldr w8,[x0, #0x1c]
00b7642c	cbz w8,0x00b764c4
00b76430	cmp w8,#0x1
00b76434	b.lt 0x00b764cc
00b76438	mov x20,xzr
00b7643c	mov w23,wzr
00b76440	add x24,x19,#0x40
00b76444	ldr w8,[x24]
00b76448	str xzr,[sp]
00b7644c	ldp x9,x0,[x24, #-0x20]
00b76450	add x1,sp,#0x8
00b76454	cmp w8,#0x1
00b76458	mov w2,#0x80
00b7645c	mov x3,sp
00b76460	csinc w23,w23,wzr,ne
00b76464	blr x9
00b76468	mov w21,w0
00b7646c	cbnz w0,0x00b764d0
00b76470	ldr x3,[sp]
00b76474	cbz x3,0x00b764a0
00b76478	add x2,sp,#0x8
00b7647c	mov x0,x19
00b76480	mov w1,w20
00b76484	bl 0x00b762e0
00b76488	mov w21,w0
00b7648c	cbnz w0,0x00b764dc
00b76490	ldr x8,[sp]
00b76494	ldur x9,[x24, #-0x10]
00b76498	add x8,x9,x8
00b7649c	stur x8,[x24, #-0x10]
00b764a0	ldrsw x8,[x19, #0x1c]
00b764a4	add x20,x20,#0x1
00b764a8	add x24,x24,#0x28
00b764ac	cmp x20,x8
00b764b0	b.lt 0x00b76444
00b764b4	cmp w23,#0x0
00b764b8	orr w8,wzr,#0xffffffc3
00b764bc	csel w21,w8,wzr,eq
00b764c0	b 0x00b764d0
00b764c4	orr w21,wzr,#0xffffffc0
00b764c8	b 0x00b764dc
00b764cc	orr w21,wzr,#0xffffffc3
00b764d0	add x0,sp,#0x8
00b764d4	mov w1,#0x80
00b764d8	bl 0x00c42220
00b764dc	ldr x8,[x22, #0x28]
00b764e0	ldur x9,[x29, #-0x38]
00b764e4	cmp x8,x9
00b764e8	b.ne 0x00b76508
00b764ec	mov w0,w21
00b764f0	ldp x29,x30,[sp, #0xc0]
00b764f4	ldp x20,x19,[sp, #0xb0]
00b764f8	ldp x22,x21,[sp, #0xa0]
00b764fc	ldp x24,x23,[sp, #0x90]
00b76500	add sp,sp,#0xd0
00b76504	ret
00b76508	bl 0x00c2fec0
