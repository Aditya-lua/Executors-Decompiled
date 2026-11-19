; ASN1_item_verify @ 00ab3644
00ab3644	str x23,[sp, #-0x40]!
00ab3648	stp x22,x21,[sp, #0x10]
00ab364c	stp x20,x19,[sp, #0x20]
00ab3650	mov x20,x3
00ab3654	mov x21,x2
00ab3658	mov x22,x1
00ab365c	mov x23,x0
00ab3660	mov x0,x4
00ab3664	mov x1,xzr
00ab3668	mov x2,xzr
00ab366c	mov x3,xzr
00ab3670	stp x29,x30,[sp, #0x30]
00ab3674	add x29,sp,#0x30
00ab3678	bl 0x00c3c270
00ab367c	cbz x0,0x00ab36bc
00ab3680	mov x19,x0
00ab3684	mov x0,x23
00ab3688	mov x1,x22
00ab368c	mov x2,x21
00ab3690	mov x3,x20
00ab3694	mov x4,x19
00ab3698	bl 0x00ab3764
00ab369c	mov w20,w0
00ab36a0	mov x0,x19
00ab36a4	bl 0x00c36dc0
00ab36a8	bl 0x00c34620
00ab36ac	mov x0,x19
00ab36b0	bl 0x00c31f90
00ab36b4	mov w0,w20
00ab36b8	b 0x00ab36c0
00ab36bc	mov w0,#0xffffffff
00ab36c0	ldp x29,x30,[sp, #0x30]
00ab36c4	ldp x20,x19,[sp, #0x20]
00ab36c8	ldp x22,x21,[sp, #0x10]
00ab36cc	ldr x23,[sp], #0x40
00ab36d0	ret
