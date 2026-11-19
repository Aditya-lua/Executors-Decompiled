; mbedtls_sha512_finish @ 00bae3e4
00bae3e4	stp x22,x21,[sp, #-0x30]!
00bae3e8	stp x20,x19,[sp, #0x10]
00bae3ec	stp x29,x30,[sp, #0x20]
00bae3f0	add x29,sp,#0x20
00bae3f4	mov x21,x0
00bae3f8	ldr x22,[x21], #0x50
00bae3fc	mov x20,x1
00bae400	mov x19,x0
00bae404	mov w9,#0x80
00bae408	and w8,w22,#0x7f
00bae40c	add w10,w8,#0x1
00bae410	cmp w10,#0x70
00bae414	add x0,x21,x10
00bae418	strb w9,[x21, w8, UXTW ]
00bae41c	b.hi 0x00bae434
00bae420	mov w9,#0x6f
00bae424	sub w2,w9,w8
00bae428	mov w1,wzr
00bae42c	bl 0x00c301c0
00bae430	b 0x00bae460
00bae434	eor w2,w8,#0x7f
00bae438	mov w1,wzr
00bae43c	bl 0x00c301c0
00bae440	mov x0,x19
00bae444	mov x1,x21
00bae448	bl 0x00c43500
00bae44c	orr w2,wzr,#0x70
00bae450	mov x0,x21
00bae454	mov w1,wzr
00bae458	bl 0x00c301c0
00bae45c	ldr x22,[x19]
00bae460	ldr x8,[x19, #0x8]
00bae464	lsl x9,x22,#0x3
00bae468	rev x9,x9
00bae46c	mov x0,x19
00bae470	extr x8,x8,x22,#0x3d
00bae474	rev x8,x8
00bae478	mov x1,x21
00bae47c	stp x8,x9,[x19, #0xc0]
00bae480	bl 0x00c43500
00bae484	ldr x8,[x19, #0x10]
00bae488	rev x8,x8
00bae48c	str x8,[x20]
00bae490	ldr x8,[x19, #0x18]
00bae494	rev x8,x8
00bae498	str x8,[x20, #0x8]
00bae49c	ldr x8,[x19, #0x20]
00bae4a0	rev x8,x8
00bae4a4	str x8,[x20, #0x10]
00bae4a8	ldr x8,[x19, #0x28]
00bae4ac	rev x8,x8
00bae4b0	str x8,[x20, #0x18]
00bae4b4	ldr x8,[x19, #0x30]
00bae4b8	rev x8,x8
00bae4bc	str x8,[x20, #0x20]
00bae4c0	ldr x8,[x19, #0x38]
00bae4c4	rev x8,x8
00bae4c8	str x8,[x20, #0x28]
00bae4cc	ldr w8,[x19, #0xd0]
00bae4d0	cbnz w8,0x00bae4ec
00bae4d4	ldr x8,[x19, #0x40]
00bae4d8	rev x8,x8
00bae4dc	str x8,[x20, #0x30]
00bae4e0	ldr x8,[x19, #0x48]
00bae4e4	rev x8,x8
00bae4e8	str x8,[x20, #0x38]
00bae4ec	mov w1,#0xd8
00bae4f0	mov x0,x19
00bae4f4	bl 0x00c42220
00bae4f8	ldp x29,x30,[sp, #0x20]
00bae4fc	ldp x20,x19,[sp, #0x10]
00bae500	mov w0,wzr
00bae504	ldp x22,x21,[sp], #0x30
00bae508	ret
