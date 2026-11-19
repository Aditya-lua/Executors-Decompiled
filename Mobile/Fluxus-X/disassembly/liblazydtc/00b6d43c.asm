; mbedtls_chachapoly_auth_decrypt @ 00b6d43c
00b6d43c	sub sp,sp,#0xb0
00b6d440	str x27,[sp, #0x50]
00b6d444	stp x26,x25,[sp, #0x60]
00b6d448	stp x24,x23,[sp, #0x70]
00b6d44c	stp x22,x21,[sp, #0x80]
00b6d450	stp x20,x19,[sp, #0x90]
00b6d454	stp x29,x30,[sp, #0xa0]
00b6d458	add x29,sp,#0xa0
00b6d45c	mrs x27,tpidr_el0
00b6d460	ldr x8,[x27, #0x28]
00b6d464	mov x20,x1
00b6d468	mov x1,x2
00b6d46c	mov w2,wzr
00b6d470	mov x19,x7
00b6d474	mov x23,x6
00b6d478	mov x21,x5
00b6d47c	mov x24,x4
00b6d480	mov x25,x3
00b6d484	mov x22,x0
00b6d488	str x8,[sp, #0x48]
00b6d48c	bl 0x00c420a0
00b6d490	mov w26,w0
00b6d494	cbnz w0,0x00b6d4e8
00b6d498	movi v0.2D,#0x0
00b6d49c	mov w1,#0x40
00b6d4a0	add x2,sp,#0x8
00b6d4a4	add x3,sp,#0x8
00b6d4a8	mov x0,x22
00b6d4ac	stur q0,[sp, #0x38]
00b6d4b0	stur q0,[sp, #0x28]
00b6d4b4	stur q0,[sp, #0x18]
00b6d4b8	stur q0,[sp, #0x8]
00b6d4bc	bl 0x00c420b0
00b6d4c0	mov w26,w0
00b6d4c4	cbnz w0,0x00b6d4e8
00b6d4c8	add x0,x22,#0x88
00b6d4cc	add x1,sp,#0x8
00b6d4d0	bl 0x00c42280
00b6d4d4	mov w26,w0
00b6d4d8	cbnz w0,0x00b6d4e8
00b6d4dc	movi v0.2S,#0x1
00b6d4e0	stp xzr,xzr,[x22, #0xd8]
00b6d4e4	str d0,[x22, #0xe8]
00b6d4e8	add x0,sp,#0x8
00b6d4ec	mov w1,#0x40
00b6d4f0	bl 0x00c42220
00b6d4f4	cbnz w26,0x00b6d584
00b6d4f8	ldr w8,[x22, #0xe8]
00b6d4fc	cmp w8,#0x1
00b6d500	b.ne 0x00b6d580
00b6d504	ldr x8,[x22, #0xd8]
00b6d508	add x0,x22,#0x88
00b6d50c	mov x1,x25
00b6d510	mov x2,x24
00b6d514	add x8,x8,x24
00b6d518	str x8,[x22, #0xd8]
00b6d51c	bl 0x00c42290
00b6d520	mov w26,w0
00b6d524	cbnz w0,0x00b6d584
00b6d528	mov x0,x22
00b6d52c	mov x1,x20
00b6d530	mov x2,x23
00b6d534	mov x3,x19
00b6d538	bl 0x00c42130
00b6d53c	mov w26,w0
00b6d540	cbnz w0,0x00b6d584
00b6d544	add x1,sp,#0x8
00b6d548	mov x0,x22
00b6d54c	bl 0x00c420e0
00b6d550	mov w26,w0
00b6d554	cbnz w0,0x00b6d584
00b6d558	add x1,sp,#0x8
00b6d55c	mov w2,#0x10
00b6d560	mov x0,x21
00b6d564	bl 0x00c42190
00b6d568	cbz w0,0x00b6d5b8
00b6d56c	mov x0,x19
00b6d570	mov x1,x20
00b6d574	bl 0x00c42220
00b6d578	mov w26,#0xffffffaa
00b6d57c	b 0x00b6d584
00b6d580	mov w26,#0xffffffac
00b6d584	ldr x8,[x27, #0x28]
00b6d588	ldr x9,[sp, #0x48]
00b6d58c	cmp x8,x9
00b6d590	b.ne 0x00b6d5c0
00b6d594	mov w0,w26
00b6d598	ldp x29,x30,[sp, #0xa0]
00b6d59c	ldp x20,x19,[sp, #0x90]
00b6d5a0	ldp x22,x21,[sp, #0x80]
00b6d5a4	ldp x24,x23,[sp, #0x70]
00b6d5a8	ldp x26,x25,[sp, #0x60]
00b6d5ac	ldr x27,[sp, #0x50]
00b6d5b0	add sp,sp,#0xb0
00b6d5b4	ret
00b6d5b8	mov w26,wzr
00b6d5bc	b 0x00b6d584
00b6d5c0	bl 0x00c2fec0
