; mbedtls_ecdh_calc_secret @ 00b9b4dc
00b9b4dc	sub sp,sp,#0xa0
00b9b4e0	stp x28,x27,[sp, #0x40]
00b9b4e4	stp x26,x25,[sp, #0x50]
00b9b4e8	stp x24,x23,[sp, #0x60]
00b9b4ec	stp x22,x21,[sp, #0x70]
00b9b4f0	stp x20,x19,[sp, #0x80]
00b9b4f4	stp x29,x30,[sp, #0x90]
00b9b4f8	add x29,sp,#0x90
00b9b4fc	mrs x20,tpidr_el0
00b9b500	ldr x8,[x20, #0x28]
00b9b504	mov x25,x5
00b9b508	mov x26,x4
00b9b50c	mov x23,x3
00b9b510	str x8,[sp, #0x38]
00b9b514	ldr w8,[x0, #0x8]
00b9b518	mov x19,x2
00b9b51c	mov x22,x0
00b9b520	mov x21,x1
00b9b524	cmp w8,#0x1
00b9b528	b.ne 0x00b9b5bc
00b9b52c	ldr x8,[x22, #0x88]
00b9b530	cbz x8,0x00b9b5bc
00b9b534	add x8,x22,#0x140
00b9b538	add x0,sp,#0x8
00b9b53c	add x24,x22,#0x10
00b9b540	str x8,[sp]
00b9b544	add x27,x22,#0x110
00b9b548	add x28,x22,#0xd0
00b9b54c	bl 0x00c42760
00b9b550	add x1,sp,#0x8
00b9b554	mov x0,x24
00b9b558	mov x2,x28
00b9b55c	mov x3,x27
00b9b560	mov x4,x26
00b9b564	mov x5,x25
00b9b568	mov x6,xzr
00b9b56c	bl 0x00c42710
00b9b570	mov w25,w0
00b9b574	cbnz w0,0x00b9b59c
00b9b578	add x0,sp,#0x8
00b9b57c	bl 0x00c426d0
00b9b580	cbz w0,0x00b9b58c
00b9b584	mov w25,#0xffffb080
00b9b588	b 0x00b9b59c
00b9b58c	ldr x0,[sp]
00b9b590	add x1,sp,#0x8
00b9b594	bl 0x00c41b60
00b9b598	mov w25,w0
00b9b59c	add x0,sp,#0x8
00b9b5a0	bl 0x00c42750
00b9b5a4	cbnz w25,0x00b9b5c0
00b9b5a8	ldr x25,[sp]
00b9b5ac	mov x0,x25
00b9b5b0	bl 0x00c41d30
00b9b5b4	cmp x0,x23
00b9b5b8	b.ls 0x00b9b5f4
00b9b5bc	mov w25,#0xffffb080
00b9b5c0	ldr x8,[x20, #0x28]
00b9b5c4	ldr x9,[sp, #0x38]
00b9b5c8	cmp x8,x9
00b9b5cc	b.ne 0x00b9b640
00b9b5d0	mov w0,w25
00b9b5d4	ldp x29,x30,[sp, #0x90]
00b9b5d8	ldp x20,x19,[sp, #0x80]
00b9b5dc	ldp x22,x21,[sp, #0x70]
00b9b5e0	ldp x24,x23,[sp, #0x60]
00b9b5e4	ldp x26,x25,[sp, #0x50]
00b9b5e8	ldp x28,x27,[sp, #0x40]
00b9b5ec	add sp,sp,#0xa0
00b9b5f0	ret
00b9b5f4	ldr x8,[x22, #0x88]
00b9b5f8	mov x0,x24
00b9b5fc	lsr x9,x8,#0x3
00b9b600	tst x8,#0x7
00b9b604	cinc x8,x9,ne
00b9b608	str x8,[x21]
00b9b60c	bl 0x00c42690
00b9b610	ldr x2,[x21]
00b9b614	cmp w0,#0x2
00b9b618	b.ne 0x00b9b62c
00b9b61c	mov x0,x25
00b9b620	mov x1,x19
00b9b624	bl 0x00c41d90
00b9b628	b 0x00b9b638
00b9b62c	mov x0,x25
00b9b630	mov x1,x19
00b9b634	bl 0x00c41d80
00b9b638	mov w25,w0
00b9b63c	b 0x00b9b5c0
00b9b640	bl 0x00c2fec0
