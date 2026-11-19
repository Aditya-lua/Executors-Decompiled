; mbedtls_psa_ffdh_key_agreement @ 00b9d434
00b9d434	sub sp,sp,#0xb0
00b9d438	stp x26,x25,[sp, #0x60]
00b9d43c	stp x24,x23,[sp, #0x70]
00b9d440	stp x22,x21,[sp, #0x80]
00b9d444	stp x20,x19,[sp, #0x90]
00b9d448	stp x29,x30,[sp, #0xa0]
00b9d44c	add x29,sp,#0xa0
00b9d450	mrs x26,tpidr_el0
00b9d454	ldr x8,[x26, #0x28]
00b9d458	mov x19,x7
00b9d45c	mov x21,x5
00b9d460	mov x24,x3
00b9d464	mov x20,x2
00b9d468	mov x23,x1
00b9d46c	mov x25,x0
00b9d470	cmp x2,x4
00b9d474	mov w22,#0xffffff79
00b9d478	stur x8,[x29, #-0x48]
00b9d47c	b.ne 0x00b9d538
00b9d480	cmp x20,x6
00b9d484	b.hi 0x00b9d538
00b9d488	ldrb w8,[x25, #0x1]
00b9d48c	cmp w8,#0x72
00b9d490	b.ne 0x00b9d534
00b9d494	add x0,sp,#0x48
00b9d498	bl 0x00c41c00
00b9d49c	add x0,sp,#0x38
00b9d4a0	bl 0x00c41c00
00b9d4a4	add x0,sp,#0x28
00b9d4a8	bl 0x00c41c00
00b9d4ac	add x0,sp,#0x18
00b9d4b0	bl 0x00c41c00
00b9d4b4	add x0,sp,#0x8
00b9d4b8	bl 0x00c41c00
00b9d4bc	ldrh w8,[x25, #0x2]
00b9d4c0	add x8,x8,#0x7
00b9d4c4	lsr x8,x8,#0x3
00b9d4c8	sub x9,x8,#0x100
00b9d4cc	ror x8,x9,#0x7
00b9d4d0	cmp x8,#0x6
00b9d4d4	b.hi 0x00b9d4e8
00b9d4d8	ubfx x9,x9,#0x7,#0x8
00b9d4dc	mov w10,#0x57
00b9d4e0	lsr w9,w10,w9
00b9d4e4	tbnz w9,#0x0,0x00b9d568
00b9d4e8	mov w19,wzr
00b9d4ec	mov w24,#0xffffff92
00b9d4f0	mov w22,#0xffffff79
00b9d4f4	add x0,sp,#0x48
00b9d4f8	bl 0x00c41bb0
00b9d4fc	add x0,sp,#0x38
00b9d500	bl 0x00c41bb0
00b9d504	add x0,sp,#0x28
00b9d508	bl 0x00c41bb0
00b9d50c	add x0,sp,#0x18
00b9d510	bl 0x00c41bb0
00b9d514	add x0,sp,#0x8
00b9d518	bl 0x00c41bb0
00b9d51c	cbz w19,0x00b9d538
00b9d520	cbz w24,0x00b9d538
00b9d524	mov w0,w24
00b9d528	bl 0x00c42bf0
00b9d52c	mov w22,w0
00b9d530	b 0x00b9d538
00b9d534	mov w22,#0xffffff79
00b9d538	ldr x8,[x26, #0x28]
00b9d53c	ldur x9,[x29, #-0x48]
00b9d540	cmp x8,x9
00b9d544	b.ne 0x00b9d644
00b9d548	mov w0,w22
00b9d54c	ldp x29,x30,[sp, #0xa0]
00b9d550	ldp x20,x19,[sp, #0x90]
00b9d554	ldp x22,x21,[sp, #0x80]
00b9d558	ldp x24,x23,[sp, #0x70]
00b9d55c	ldp x26,x25,[sp, #0x60]
00b9d560	add sp,sp,#0xb0
00b9d564	ret
00b9d568	lsl x22,x8,#0x3
00b9d56c	adrp x8,0xcab000
00b9d570	adrp x9,0x787000
00b9d574	add x8,x8,#0x3d0
00b9d578	add x9,x9,#0x4f0
00b9d57c	ldr x1,[x8, x22#0x0]
00b9d580	ldr x2,[x9, x22#0x0]
00b9d584	add x0,sp,#0x48
00b9d588	bl 0x00c41ca0
00b9d58c	cbnz w0,0x00b9d5ac
00b9d590	adrp x8,0xcab000
00b9d594	add x8,x8,#0x410
00b9d598	ldr x1,[x8, x22#0x0]
00b9d59c	add x0,sp,#0x38
00b9d5a0	mov w2,#0x1
00b9d5a4	bl 0x00c41ca0
00b9d5a8	cbz w0,0x00b9d5c4
00b9d5ac	bl 0x00c42bf0
00b9d5b0	mov w22,w0
00b9d5b4	cbz w0,0x00b9d5c4
00b9d5b8	mov w19,wzr
00b9d5bc	mov w24,#0xffffff92
00b9d5c0	b 0x00b9d4f4
00b9d5c4	add x0,sp,#0x28
00b9d5c8	mov x1,x24
00b9d5cc	mov x2,x20
00b9d5d0	bl 0x00c41ca0
00b9d5d4	mov w24,w0
00b9d5d8	cbnz w0,0x00b9d62c
00b9d5dc	add x0,sp,#0x18
00b9d5e0	mov x1,x23
00b9d5e4	mov x2,x20
00b9d5e8	bl 0x00c41ca0
00b9d5ec	mov w24,w0
00b9d5f0	cbnz w0,0x00b9d62c
00b9d5f4	add x0,sp,#0x8
00b9d5f8	add x1,sp,#0x18
00b9d5fc	add x2,sp,#0x28
00b9d600	add x3,sp,#0x48
00b9d604	mov x4,xzr
00b9d608	bl 0x00c41b80
00b9d60c	mov w24,w0
00b9d610	cbnz w0,0x00b9d62c
00b9d614	add x0,sp,#0x8
00b9d618	mov x1,x21
00b9d61c	mov x2,x20
00b9d620	bl 0x00c41d80
00b9d624	mov w24,w0
00b9d628	cbz w0,0x00b9d638
00b9d62c	mov w22,wzr
00b9d630	mov w19,#0x1
00b9d634	b 0x00b9d4f4
00b9d638	mov w22,wzr
00b9d63c	str x20,[x19]
00b9d640	b 0x00b9d630
00b9d644	bl 0x00c2fec0
