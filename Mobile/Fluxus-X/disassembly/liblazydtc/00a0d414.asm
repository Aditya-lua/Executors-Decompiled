; NCONF_get_number_e @ 00a0d414
00a0d414	str x27,[sp, #-0x60]!
00a0d418	stp x26,x25,[sp, #0x10]
00a0d41c	stp x24,x23,[sp, #0x20]
00a0d420	stp x22,x21,[sp, #0x30]
00a0d424	stp x20,x19,[sp, #0x40]
00a0d428	stp x29,x30,[sp, #0x50]
00a0d42c	add x29,sp,#0x50
00a0d430	cbz x3,0x00a0d4e4
00a0d434	mov x19,x3
00a0d438	mov x20,x0
00a0d43c	bl 0x00a0d210
00a0d440	cbz x0,0x00a0d540
00a0d444	adrp x22,0xa0d000
00a0d448	adrp x23,0xa0d000
00a0d44c	mov x21,x0
00a0d450	add x22,x22,#0x9e0
00a0d454	add x23,x23,#0x9d8
00a0d458	cbz x20,0x00a0d474
00a0d45c	ldr x8,[x20]
00a0d460	ldp x9,x8,[x8, #0x38]
00a0d464	cmp x9,#0x0
00a0d468	csel x23,x23,x9,eq
00a0d46c	cmp x8,#0x0
00a0d470	csel x22,x22,x8,eq
00a0d474	ldrb w1,[x21]
00a0d478	mov x0,x20
00a0d47c	blr x23
00a0d480	mov x24,xzr
00a0d484	cbz w0,0x00a0d4d8
00a0d488	orr x26,xzr,#0x6666666666666666
00a0d48c	add x21,x21,#0x1
00a0d490	orr x25,xzr,#0x7fffffffffffffff
00a0d494	movk x26,#0x6667
00a0d498	mov w27,#0xa
00a0d49c	ldurb w1,[x21, #-0x1]
00a0d4a0	mov x0,x20
00a0d4a4	blr x22
00a0d4a8	sxtw x8,w0
00a0d4ac	sub x9,x25,x8
00a0d4b0	smulh x9,x9,x26
00a0d4b4	asr x10,x9,#0x2
00a0d4b8	add x9,x10,x9, LSR #0x3f
00a0d4bc	cmp x24,x9
00a0d4c0	b.gt 0x00a0d510
00a0d4c4	ldrb w1,[x21], #0x1
00a0d4c8	mov x0,x20
00a0d4cc	madd x24,x24,x27,x8
00a0d4d0	blr x23
00a0d4d4	cbnz w0,0x00a0d49c
00a0d4d8	mov w0,#0x1
00a0d4dc	str x24,[x19]
00a0d4e0	b 0x00a0d540
00a0d4e4	bl 0x00c342a0
00a0d4e8	adrp x0,0x2af000
00a0d4ec	adrp x2,0x2d7000
00a0d4f0	add x0,x0,#0xd73
00a0d4f4	add x2,x2,#0xc73
00a0d4f8	mov w1,#0x153
00a0d4fc	bl 0x00c342b0
00a0d500	mov w1,#0x102
00a0d504	orr w0,wzr,#0xe
00a0d508	movk w1,#0xc, LSL #16
00a0d50c	b 0x00a0d534
00a0d510	bl 0x00c342a0
00a0d514	adrp x0,0x2af000
00a0d518	adrp x2,0x2d7000
00a0d51c	add x0,x0,#0xd73
00a0d520	add x2,x2,#0xc73
00a0d524	mov w1,#0x166
00a0d528	bl 0x00c342b0
00a0d52c	orr w0,wzr,#0xe
00a0d530	mov w1,#0x79
00a0d534	mov x2,xzr
00a0d538	bl 0x00c342c0
00a0d53c	mov w0,wzr
00a0d540	ldp x29,x30,[sp, #0x50]
00a0d544	ldp x20,x19,[sp, #0x40]
00a0d548	ldp x22,x21,[sp, #0x30]
00a0d54c	ldp x24,x23,[sp, #0x20]
00a0d550	ldp x26,x25,[sp, #0x10]
00a0d554	ldr x27,[sp], #0x60
00a0d558	ret
