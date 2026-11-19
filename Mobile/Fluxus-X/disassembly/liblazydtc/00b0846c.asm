; X509_ATTRIBUTE_create_by_NID @ 00b0846c
00b0846c	str x23,[sp, #-0x40]!
00b08470	mov x23,x0
00b08474	mov w0,w1
00b08478	stp x22,x21,[sp, #0x10]
00b0847c	stp x20,x19,[sp, #0x20]
00b08480	stp x29,x30,[sp, #0x30]
00b08484	add x29,sp,#0x30
00b08488	mov w20,w4
00b0848c	mov x21,x3
00b08490	mov w22,w2
00b08494	bl 0x00c37740
00b08498	cbz x0,0x00b084c8
00b0849c	mov x19,x0
00b084a0	mov x0,x23
00b084a4	mov x1,x19
00b084a8	mov w2,w22
00b084ac	mov x3,x21
00b084b0	mov w4,w20
00b084b4	bl 0x00b08184
00b084b8	cbnz x0,0x00b084f8
00b084bc	mov x0,x19
00b084c0	bl 0x00c37660
00b084c4	b 0x00b084f4
00b084c8	bl 0x00c342a0
00b084cc	adrp x0,0x2ba000
00b084d0	adrp x2,0x2bc000
00b084d4	add x0,x0,#0x8ba
00b084d8	add x2,x2,#0x68d
00b084dc	mov w1,#0x10a
00b084e0	bl 0x00c342b0
00b084e4	mov w0,#0xb
00b084e8	mov w1,#0x6d
00b084ec	mov x2,xzr
00b084f0	bl 0x00c342c0
00b084f4	mov x0,xzr
00b084f8	ldp x29,x30,[sp, #0x30]
00b084fc	ldp x20,x19,[sp, #0x20]
00b08500	ldp x22,x21,[sp, #0x10]
00b08504	ldr x23,[sp], #0x40
00b08508	ret
