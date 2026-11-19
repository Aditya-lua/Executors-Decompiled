; mbedtls_psa_mac_compute @ 00b9e45c
00b9e45c	stp x28,x27,[sp, #-0x60]!
00b9e460	stp x26,x25,[sp, #0x10]
00b9e464	stp x24,x23,[sp, #0x20]
00b9e468	stp x22,x21,[sp, #0x30]
00b9e46c	stp x20,x19,[sp, #0x40]
00b9e470	stp x29,x30,[sp, #0x50]
00b9e474	add x29,sp,#0x50
00b9e478	sub sp,sp,#0x1a0
00b9e47c	mrs x27,tpidr_el0
00b9e480	ldr x8,[x27, #0x28]
00b9e484	mov x24,x2
00b9e488	mov x25,x1
00b9e48c	mov x26,x0
00b9e490	add x0,sp,#0x8
00b9e494	mov w2,#0x188
00b9e498	mov w1,wzr
00b9e49c	mov x19,x7
00b9e4a0	mov x21,x6
00b9e4a4	mov x22,x5
00b9e4a8	mov x23,x4
00b9e4ac	mov w20,w3
00b9e4b0	stur x8,[x29, #-0x60]
00b9e4b4	bl 0x00c301c0
00b9e4b8	add x0,sp,#0x8
00b9e4bc	mov x1,x26
00b9e4c0	mov x2,x25
00b9e4c4	mov x3,x24
00b9e4c8	mov w4,w20
00b9e4cc	bl 0x00b9dd04
00b9e4d0	mov w20,w0
00b9e4d4	cbz w0,0x00b9e508
00b9e4d8	ldr w8,[sp, #0x8]
00b9e4dc	cbz w8,0x00b9e5f4
00b9e4e0	mov w10,#0x200
00b9e4e4	and w9,w8,#0xffc07fff
00b9e4e8	movk w10,#0x3c0, LSL #16
00b9e4ec	cmp w9,w10
00b9e4f0	b.ne 0x00b9e54c
00b9e4f4	add x8,sp,#0x8
00b9e4f8	add x0,x8,#0x8
00b9e4fc	bl 0x00c30290
00b9e500	str wzr,[sp, #0x8]
00b9e504	b 0x00b9e5f4
00b9e508	cbz x22,0x00b9e5bc
00b9e50c	ldr w8,[sp, #0x8]
00b9e510	cbz w8,0x00b9e5e8
00b9e514	mov w10,#0x200
00b9e518	and w9,w8,#0xffc07fff
00b9e51c	movk w10,#0x3c0, LSL #16
00b9e520	cmp w9,w10
00b9e524	b.ne 0x00b9e590
00b9e528	add x8,sp,#0x8
00b9e52c	add x0,x8,#0x8
00b9e530	mov x1,x23
00b9e534	mov x2,x22
00b9e538	bl 0x00c42450
00b9e53c	bl 0x00c42bf0
00b9e540	mov w20,w0
00b9e544	cbnz w0,0x00b9e4d8
00b9e548	b 0x00b9e5bc
00b9e54c	and w8,w8,#0x7fc00000
00b9e550	orr w9,wzr,#0x3800000
00b9e554	cmp w8,w9
00b9e558	b.ne 0x00b9e57c
00b9e55c	add x19,sp,#0x8
00b9e560	add x0,x19,#0xf8
00b9e564	mov w1,#0x90
00b9e568	bl 0x00c42220
00b9e56c	add x0,x19,#0x10
00b9e570	bl 0x00c42cc0
00b9e574	str wzr,[sp, #0x8]
00b9e578	b 0x00b9e5f4
00b9e57c	add x0,sp,#0x8
00b9e580	mov w2,#0x188
00b9e584	mov w1,wzr
00b9e588	bl 0x00c301c0
00b9e58c	b 0x00b9e5f4
00b9e590	and w8,w8,#0x7fc00000
00b9e594	orr w9,wzr,#0x3800000
00b9e598	cmp w8,w9
00b9e59c	b.ne 0x00b9e5e8
00b9e5a0	add x8,sp,#0x8
00b9e5a4	add x0,x8,#0x10
00b9e5a8	mov x1,x23
00b9e5ac	mov x2,x22
00b9e5b0	bl 0x00c42d00
00b9e5b4	mov w20,w0
00b9e5b8	cbnz w0,0x00b9e4d8
00b9e5bc	add x0,sp,#0x8
00b9e5c0	mov x1,x21
00b9e5c4	mov x2,x19
00b9e5c8	bl 0x00b9e1e0
00b9e5cc	mov w20,w0
00b9e5d0	cbnz w0,0x00b9e4d8
00b9e5d4	ldr x8,[x29, #0x10]
00b9e5d8	str x19,[x8]
00b9e5dc	ldr w8,[sp, #0x8]
00b9e5e0	cbnz w8,0x00b9e4e0
00b9e5e4	b 0x00b9e5f4
00b9e5e8	mov w20,#0xffffff77
00b9e5ec	ldr w8,[sp, #0x8]
00b9e5f0	cbnz w8,0x00b9e4e0
00b9e5f4	ldr x8,[x27, #0x28]
00b9e5f8	ldur x9,[x29, #-0x60]
00b9e5fc	cmp x8,x9
00b9e600	b.ne 0x00b9e628
00b9e604	mov w0,w20
00b9e608	add sp,sp,#0x1a0
00b9e60c	ldp x29,x30,[sp, #0x50]
00b9e610	ldp x20,x19,[sp, #0x40]
00b9e614	ldp x22,x21,[sp, #0x30]
00b9e618	ldp x24,x23,[sp, #0x20]
00b9e61c	ldp x26,x25,[sp, #0x10]
00b9e620	ldp x28,x27,[sp], #0x60
00b9e624	ret
00b9e628	bl 0x00c2fec0
