; mbedtls_ccm_self_test @ 00b6c384
00b6c384	sub sp,sp,#0x180
00b6c388	stp x28,x27,[sp, #0x120]
00b6c38c	stp x26,x25,[sp, #0x130]
00b6c390	stp x24,x23,[sp, #0x140]
00b6c394	stp x22,x21,[sp, #0x150]
00b6c398	stp x20,x19,[sp, #0x160]
00b6c39c	stp x29,x30,[sp, #0x170]
00b6c3a0	add x29,sp,#0x170
00b6c3a4	mrs x22,tpidr_el0
00b6c3a8	ldr x8,[x22, #0x28]
00b6c3ac	mov w19,w0
00b6c3b0	add x0,sp,#0x60
00b6c3b4	mov w2,#0xb0
00b6c3b8	mov w1,wzr
00b6c3bc	stur x8,[x29, #-0x60]
00b6c3c0	bl 0x00c301c0
00b6c3c4	mov w0,#0x2
00b6c3c8	mov w1,#0x80
00b6c3cc	mov w2,#0x1
00b6c3d0	bl 0x00c42160
00b6c3d4	mov x21,x0
00b6c3d8	cbz x0,0x00b6c428
00b6c3dc	ldr w8,[x21, #0x8]
00b6c3e0	and w8,w8,#0x1f
00b6c3e4	cmp w8,#0x10
00b6c3e8	b.ne 0x00b6c428
00b6c3ec	add x8,sp,#0x60
00b6c3f0	add x20,x8,#0x48
00b6c3f4	mov x0,x20
00b6c3f8	bl 0x00c30290
00b6c3fc	mov x0,x20
00b6c400	mov x1,x21
00b6c404	bl 0x00c30280
00b6c408	cbnz w0,0x00b6c428
00b6c40c	adrp x1,0x77c000
00b6c410	add x1,x1,#0x8d8
00b6c414	mov w2,#0x80
00b6c418	mov w3,#0x1
00b6c41c	mov x0,x20
00b6c420	bl 0x00c302a0
00b6c424	cbz w0,0x00b6c46c
00b6c428	cbz w19,0x00b6c438
00b6c42c	adrp x0,0x2c0000
00b6c430	add x0,x0,#0x9f6
00b6c434	bl 0x00c41af0
00b6c438	mov w0,#0x1
00b6c43c	ldr x8,[x22, #0x28]
00b6c440	ldur x9,[x29, #-0x60]
00b6c444	cmp x8,x9
00b6c448	b.ne 0x00b6c614
00b6c44c	ldp x29,x30,[sp, #0x170]
00b6c450	ldp x20,x19,[sp, #0x160]
00b6c454	ldp x22,x21,[sp, #0x150]
00b6c458	ldp x24,x23,[sp, #0x140]
00b6c45c	ldp x26,x25,[sp, #0x130]
00b6c460	ldp x28,x27,[sp, #0x120]
00b6c464	add sp,sp,#0x180
00b6c468	ret
00b6c46c	adrp x21,0x77c000
00b6c470	adrp x26,0x77c000
00b6c474	mov x23,xzr
00b6c478	add x21,x21,#0x988
00b6c47c	add x25,sp,#0x48
00b6c480	add x26,x26,#0x8e8
00b6c484	str x20,[sp, #0x20]
00b6c488	cbz w19,0x00b6c49c
00b6c48c	adrp x0,0x2d6000
00b6c490	add w1,w23,#0x1
00b6c494	add x0,x0,#0xcf8
00b6c498	bl 0x00c41af0
00b6c49c	adrp x8,0x77c000
00b6c4a0	lsl x24,x23,#0x3
00b6c4a4	add x8,x8,#0x900
00b6c4a8	ldr x27,[x8, x24#0x0]
00b6c4ac	orr w8,wzr,#0x18
00b6c4b0	cmp x23,#0x2
00b6c4b4	movi v0.2D,#0x0
00b6c4b8	sub x8,x8,x27
00b6c4bc	csel x2,xzr,x8,eq
00b6c4c0	add x0,x25,x27
00b6c4c4	mov w1,wzr
00b6c4c8	stur q0,[sp, #0x38]
00b6c4cc	stur q0,[sp, #0x28]
00b6c4d0	bl 0x00c301c0
00b6c4d4	add x0,sp,#0x48
00b6c4d8	mov x1,x26
00b6c4dc	mov x2,x27
00b6c4e0	mov x20,x26
00b6c4e4	bl 0x00c2ffd0
00b6c4e8	adrp x8,0x77c000
00b6c4ec	add x8,x8,#0x928
00b6c4f0	ldr x28,[x8, x24#0x0]
00b6c4f4	adrp x8,0x77c000
00b6c4f8	add x8,x8,#0x958
00b6c4fc	ldr x26,[x8, x24#0x0]
00b6c500	adrp x8,0x77c000
00b6c504	add x8,x8,#0x970
00b6c508	ldr x25,[x8, x24#0x0]
00b6c50c	add x8,sp,#0x28
00b6c510	adrp x2,0x77c000
00b6c514	adrp x4,0x77c000
00b6c518	add x24,x8,x27
00b6c51c	add x0,sp,#0x60
00b6c520	add x6,sp,#0x48
00b6c524	add x7,sp,#0x28
00b6c528	mov x1,x27
00b6c52c	add x2,x2,#0x918
00b6c530	mov x3,x28
00b6c534	add x4,x4,#0x940
00b6c538	mov x5,x26
00b6c53c	stp x24,x25,[sp]
00b6c540	bl 0x00c41fe0
00b6c544	cbnz w0,0x00b6c600
00b6c548	add x2,x25,x27
00b6c54c	add x0,sp,#0x28
00b6c550	mov x1,x21
00b6c554	bl 0x00c300b0
00b6c558	cbnz w0,0x00b6c600
00b6c55c	adrp x3,0x77c000
00b6c560	adrp x5,0x77c000
00b6c564	stp x24,x25,[sp, #0x8]
00b6c568	add x0,sp,#0x60
00b6c56c	add x7,sp,#0x28
00b6c570	add x25,sp,#0x48
00b6c574	mov w1,wzr
00b6c578	mov x2,x27
00b6c57c	add x3,x3,#0x918
00b6c580	mov x4,x28
00b6c584	add x5,x5,#0x940
00b6c588	mov x6,x26
00b6c58c	stp xzr,xzr,[sp, #0x48]
00b6c590	str xzr,[sp, #0x58]
00b6c594	str x25,[sp]
00b6c598	bl 0x00b6c17c
00b6c59c	cbnz w0,0x00b6c600
00b6c5a0	add x0,sp,#0x48
00b6c5a4	mov x1,x20
00b6c5a8	mov x2,x27
00b6c5ac	mov x26,x20
00b6c5b0	bl 0x00c300b0
00b6c5b4	cbnz w0,0x00b6c600
00b6c5b8	cbz w19,0x00b6c5c8
00b6c5bc	adrp x0,0x77c000
00b6c5c0	add x0,x0,#0x87c
00b6c5c4	bl 0x00c30760
00b6c5c8	add x23,x23,#0x1
00b6c5cc	cmp x23,#0x3
00b6c5d0	add x21,x21,#0x20
00b6c5d4	b.cc 0x00b6c488
00b6c5d8	ldr x0,[sp, #0x20]
00b6c5dc	bl 0x00c30290
00b6c5e0	add x0,sp,#0x60
00b6c5e4	mov w1,#0xb0
00b6c5e8	bl 0x00c42220
00b6c5ec	cbz w19,0x00b6c5f8
00b6c5f0	mov w0,#0xa
00b6c5f4	bl 0x00c42240
00b6c5f8	mov w0,wzr
00b6c5fc	b 0x00b6c43c
00b6c600	cbz w19,0x00b6c438
00b6c604	adrp x0,0x77c000
00b6c608	add x0,x0,#0x854
00b6c60c	bl 0x00c30760
00b6c610	b 0x00b6c438
00b6c614	bl 0x00c2fec0
