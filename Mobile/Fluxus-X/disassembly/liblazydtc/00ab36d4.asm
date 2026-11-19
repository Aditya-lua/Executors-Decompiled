; ASN1_item_verify_ex @ 00ab36d4
00ab36d4	str x23,[sp, #-0x40]!
00ab36d8	stp x22,x21,[sp, #0x10]
00ab36dc	stp x20,x19,[sp, #0x20]
00ab36e0	mov x20,x3
00ab36e4	mov x21,x2
00ab36e8	mov x22,x1
00ab36ec	mov x23,x0
00ab36f0	mov x0,x5
00ab36f4	mov x1,x4
00ab36f8	mov x2,x6
00ab36fc	mov x3,x7
00ab3700	stp x29,x30,[sp, #0x30]
00ab3704	add x29,sp,#0x30
00ab3708	bl 0x00c3c270
00ab370c	cbz x0,0x00ab374c
00ab3710	mov x19,x0
00ab3714	mov x0,x23
00ab3718	mov x1,x22
00ab371c	mov x2,x21
00ab3720	mov x3,x20
00ab3724	mov x4,x19
00ab3728	bl 0x00ab3764
00ab372c	mov w20,w0
00ab3730	mov x0,x19
00ab3734	bl 0x00c36dc0
00ab3738	bl 0x00c34620
00ab373c	mov x0,x19
00ab3740	bl 0x00c31f90
00ab3744	mov w0,w20
00ab3748	b 0x00ab3750
00ab374c	mov w0,#0xffffffff
00ab3750	ldp x29,x30,[sp, #0x30]
00ab3754	ldp x20,x19,[sp, #0x20]
00ab3758	ldp x22,x21,[sp, #0x10]
00ab375c	ldr x23,[sp], #0x40
00ab3760	ret
