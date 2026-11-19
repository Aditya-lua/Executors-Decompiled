; X509_VERIFY_PARAM_move_peername @ 00b14664
00b14664	str x21,[sp, #-0x30]!
00b14668	stp x20,x19,[sp, #0x10]
00b1466c	mov x19,x1
00b14670	mov x20,x0
00b14674	stp x29,x30,[sp, #0x20]
00b14678	add x29,sp,#0x20
00b1467c	cbz x1,0x00b14688
00b14680	ldr x21,[x19, #0x48]
00b14684	b 0x00b1468c
00b14688	mov x21,xzr
00b1468c	ldr x0,[x20, #0x48]
00b14690	cmp x0,x21
00b14694	b.eq 0x00b146ac
00b14698	adrp x1,0x2d8000
00b1469c	add x1,x1,#0xa44
00b146a0	mov w2,#0x1a9
00b146a4	bl 0x00c32310
00b146a8	str x21,[x20, #0x48]
00b146ac	cbz x19,0x00b146b4
00b146b0	str xzr,[x19, #0x48]
00b146b4	ldp x29,x30,[sp, #0x20]
00b146b8	ldp x20,x19,[sp, #0x10]
00b146bc	ldr x21,[sp], #0x30
00b146c0	ret
