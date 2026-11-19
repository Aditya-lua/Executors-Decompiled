; mbedtls_hmac_drbg_reseed @ 00b9c418
00b9c418	sub sp,sp,#0x1e0
00b9c41c	str x28,[sp, #0x190]
00b9c420	stp x24,x23,[sp, #0x1a0]
00b9c424	stp x22,x21,[sp, #0x1b0]
00b9c428	stp x20,x19,[sp, #0x1c0]
00b9c42c	stp x29,x30,[sp, #0x1d0]
00b9c430	add x29,sp,#0x1d0
00b9c434	mrs x24,tpidr_el0
00b9c438	ldr x8,[x24, #0x28]
00b9c43c	mov x20,x2
00b9c440	mov x21,x1
00b9c444	mov x19,x0
00b9c448	cmp x2,#0x100
00b9c44c	orr w23,wzr,#0xfffffffb
00b9c450	stur x8,[x29, #-0x48]
00b9c454	b.hi 0x00b9c4e4
00b9c458	ldr x22,[x19, #0x60]
00b9c45c	add x8,x22,x20
00b9c460	cmp x8,#0x180
00b9c464	b.hi 0x00b9c4e4
00b9c468	add x0,sp,#0x8
00b9c46c	orr w2,wzr,#0x180
00b9c470	mov w1,wzr
00b9c474	bl 0x00c301c0
00b9c478	ldp x8,x0,[x19, #0x70]
00b9c47c	add x1,sp,#0x8
00b9c480	mov x2,x22
00b9c484	blr x8
00b9c488	cbz w0,0x00b9c494
00b9c48c	orr w23,wzr,#0xfffffff7
00b9c490	b 0x00b9c4e4
00b9c494	ldr x22,[x19, #0x60]
00b9c498	cbz x21,0x00b9c4b8
00b9c49c	cbz x20,0x00b9c4b8
00b9c4a0	add x8,sp,#0x8
00b9c4a4	add x0,x8,x22
00b9c4a8	mov x1,x21
00b9c4ac	mov x2,x20
00b9c4b0	bl 0x00c2ffd0
00b9c4b4	add x22,x22,x20
00b9c4b8	add x1,sp,#0x8
00b9c4bc	mov x0,x19
00b9c4c0	mov x2,x22
00b9c4c4	bl 0x00c428c0
00b9c4c8	mov w23,w0
00b9c4cc	cbnz w0,0x00b9c4d8
00b9c4d0	mov w8,#0x1
00b9c4d4	str w8,[x19, #0x58]
00b9c4d8	add x0,sp,#0x8
00b9c4dc	mov x1,x22
00b9c4e0	bl 0x00c42220
00b9c4e4	ldr x8,[x24, #0x28]
00b9c4e8	ldur x9,[x29, #-0x48]
00b9c4ec	cmp x8,x9
00b9c4f0	b.ne 0x00b9c514
00b9c4f4	mov w0,w23
00b9c4f8	ldp x29,x30,[sp, #0x1d0]
00b9c4fc	ldp x20,x19,[sp, #0x1c0]
00b9c500	ldp x22,x21,[sp, #0x1b0]
00b9c504	ldp x24,x23,[sp, #0x1a0]
00b9c508	ldr x28,[sp, #0x190]
00b9c50c	add sp,sp,#0x1e0
00b9c510	ret
00b9c514	bl 0x00c2fec0
