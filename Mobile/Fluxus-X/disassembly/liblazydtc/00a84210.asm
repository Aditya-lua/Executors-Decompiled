; ossl_crypto_alloc_ex_data_intern @ 00a84210
00a84210	str x23,[sp, #-0x40]!
00a84214	stp x22,x21,[sp, #0x10]
00a84218	stp x20,x19,[sp, #0x20]
00a8421c	stp x29,x30,[sp, #0x30]
00a84220	ldr x8,[x2]
00a84224	mov w23,w0
00a84228	add x29,sp,#0x30
00a8422c	mov w19,w3
00a84230	mov x0,x8
00a84234	mov x20,x2
00a84238	mov x21,x1
00a8423c	bl 0x00c3dee0
00a84240	cbz x0,0x00a842dc
00a84244	cmp w23,#0x12
00a84248	b.cc 0x00a84284
00a8424c	bl 0x00c342a0
00a84250	adrp x0,0x2a6000
00a84254	adrp x2,0x2b2000
00a84258	add x0,x0,#0xa7
00a8425c	add x2,x2,#0x2d9
00a84260	mov w1,#0x23
00a84264	bl 0x00c342b0
00a84268	mov w1,#0x106
00a8426c	orr w0,wzr,#0xf
00a84270	movk w1,#0x8, LSL #16
00a84274	mov x2,xzr
00a84278	bl 0x00c342c0
00a8427c	mov w0,wzr
00a84280	b 0x00a842dc
00a84284	mov x22,x0
00a84288	ldr x0,[x0]
00a8428c	cbz x0,0x00a842dc
00a84290	bl 0x00c356a0
00a84294	cbz w0,0x00a842dc
00a84298	add x8,x22,w23, SXTW  #0x3
00a8429c	ldr x0,[x8, #0x8]
00a842a0	mov w1,w19
00a842a4	bl 0x00c32610
00a842a8	ldr x8,[x22]
00a842ac	mov x22,x0
00a842b0	mov x0,x8
00a842b4	bl 0x00c35690
00a842b8	ldr x8,[x22, #0x18]
00a842bc	cbz x8,0x00a8427c
00a842c0	ldp x4,x5,[x22]
00a842c4	mov x0,x21
00a842c8	mov x1,xzr
00a842cc	mov x2,x20
00a842d0	mov w3,w19
00a842d4	blr x8
00a842d8	mov w0,#0x1
00a842dc	ldp x29,x30,[sp, #0x30]
00a842e0	ldp x20,x19,[sp, #0x20]
00a842e4	ldp x22,x21,[sp, #0x10]
00a842e8	ldr x23,[sp], #0x40
00a842ec	ret
