; ASN1_item_sign_ex @ 00ab0680
00ab0680	stp x26,x25,[sp, #-0x50]!
00ab0684	stp x29,x30,[sp, #0x40]
00ab0688	add x29,sp,#0x40
00ab068c	stp x22,x21,[sp, #0x20]
00ab0690	mov x21,x3
00ab0694	mov x22,x2
00ab0698	ldp x2,x3,[x29, #0x10]
00ab069c	stp x24,x23,[sp, #0x10]
00ab06a0	mov x23,x1
00ab06a4	mov x26,x0
00ab06a8	mov x0,x6
00ab06ac	mov x1,x5
00ab06b0	stp x20,x19,[sp, #0x30]
00ab06b4	mov x25,x7
00ab06b8	mov x24,x6
00ab06bc	mov x20,x4
00ab06c0	bl 0x00c3c270
00ab06c4	cbz x0,0x00ab0708
00ab06c8	mov x1,xzr
00ab06cc	mov x2,x25
00ab06d0	mov x3,xzr
00ab06d4	mov x4,x24
00ab06d8	mov x19,x0
00ab06dc	bl 0x00c3c170
00ab06e0	cbz w0,0x00ab0740
00ab06e4	mov x0,x26
00ab06e8	mov x1,x23
00ab06ec	mov x2,x22
00ab06f0	mov x3,x21
00ab06f4	mov x4,x20
00ab06f8	mov x5,x19
00ab06fc	bl 0x00ab0774
00ab0700	mov w20,w0
00ab0704	b 0x00ab0744
00ab0708	bl 0x00c342a0
00ab070c	adrp x0,0x2dc000
00ab0710	adrp x2,0x2a6000
00ab0714	add x0,x0,#0x798
00ab0718	add x2,x2,#0x66e
00ab071c	mov w1,#0x88
00ab0720	bl 0x00c342b0
00ab0724	mov w1,#0x100
00ab0728	mov w0,#0xd
00ab072c	movk w1,#0xc, LSL #16
00ab0730	mov x2,xzr
00ab0734	bl 0x00c342c0
00ab0738	mov w20,wzr
00ab073c	b 0x00ab0758
00ab0740	mov w20,wzr
00ab0744	mov x0,x19
00ab0748	bl 0x00c36dc0
00ab074c	bl 0x00c34620
00ab0750	mov x0,x19
00ab0754	bl 0x00c31f90
00ab0758	mov w0,w20
00ab075c	ldp x29,x30,[sp, #0x40]
00ab0760	ldp x20,x19,[sp, #0x30]
00ab0764	ldp x22,x21,[sp, #0x20]
00ab0768	ldp x24,x23,[sp, #0x10]
00ab076c	ldp x26,x25,[sp], #0x50
00ab0770	ret
