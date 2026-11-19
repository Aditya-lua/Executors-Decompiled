; ossl_pkcs7_ctx_propagate @ 00ac340c
00ac340c	stp x20,x19,[sp, #-0x20]!
00ac3410	stp x29,x30,[sp, #0x10]
00ac3414	ldr x9,[x0, #0x28]
00ac3418	mov x8,x0
00ac341c	ldr x0,[x1, #0x30]
00ac3420	mov x19,x1
00ac3424	str x9,[x1, #0x28]
00ac3428	ldr x20,[x8, #0x30]
00ac342c	add x29,sp,#0x10
00ac3430	cbz x0,0x00ac3448
00ac3434	adrp x1,0x2ce000
00ac3438	add x1,x1,#0x1ca
00ac343c	mov w2,#0x1e8
00ac3440	bl 0x00c32310
00ac3444	str xzr,[x19, #0x30]
00ac3448	cbz x20,0x00ac3468
00ac344c	adrp x1,0x2ce000
00ac3450	add x1,x1,#0x1ca
00ac3454	mov w2,#0x1ec
00ac3458	mov x0,x20
00ac345c	bl 0x00c34600
00ac3460	str x0,[x19, #0x30]
00ac3464	cbz x0,0x00ac3478
00ac3468	mov x0,x19
00ac346c	bl 0x00ac3128
00ac3470	mov w0,#0x1
00ac3474	b 0x00ac34ac
00ac3478	bl 0x00c342a0
00ac347c	adrp x0,0x2ce000
00ac3480	adrp x2,0x2b4000
00ac3484	add x0,x0,#0x1ca
00ac3488	add x2,x2,#0x892
00ac348c	mov w1,#0x1ee
00ac3490	bl 0x00c342b0
00ac3494	mov w1,#0x100
00ac3498	mov w0,#0x39
00ac349c	movk w1,#0xc, LSL #16
00ac34a0	mov x2,xzr
00ac34a4	bl 0x00c342c0
00ac34a8	mov w0,wzr
00ac34ac	ldp x29,x30,[sp, #0x10]
00ac34b0	ldp x20,x19,[sp], #0x20
00ac34b4	ret
