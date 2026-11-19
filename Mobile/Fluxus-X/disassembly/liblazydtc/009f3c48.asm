; ASN1_item_ex_d2i @ 009f3c48
009f3c48	sub sp,sp,#0x50
009f3c4c	str x21,[sp, #0x20]
009f3c50	stp x20,x19,[sp, #0x30]
009f3c54	stp x29,x30,[sp, #0x40]
009f3c58	add x29,sp,#0x40
009f3c5c	cbz x0,0x009f3c98
009f3c60	mov x19,x3
009f3c64	cbz x3,0x009f3c98
009f3c68	mov x3,x19
009f3c6c	mov x20,x0
009f3c70	stp xzr,xzr,[sp, #0x8]
009f3c74	str wzr,[sp]
009f3c78	bl 0x009f3da0
009f3c7c	mov w21,w0
009f3c80	cmp w0,#0x0
009f3c84	b.gt 0x009f3ccc
009f3c88	mov x0,x20
009f3c8c	mov x1,x19
009f3c90	bl 0x00c37f90
009f3c94	b 0x009f3ccc
009f3c98	bl 0x00c342a0
009f3c9c	adrp x0,0x2ad000
009f3ca0	adrp x2,0x2c9000
009f3ca4	add x0,x0,#0x9c8
009f3ca8	add x2,x2,#0x5c7
009f3cac	mov w1,#0x73
009f3cb0	bl 0x00c342b0
009f3cb4	mov w1,#0x102
009f3cb8	mov w0,#0xd
009f3cbc	movk w1,#0xc, LSL #16
009f3cc0	mov x2,xzr
009f3cc4	bl 0x00c342c0
009f3cc8	mov w21,wzr
009f3ccc	mov w0,w21
009f3cd0	ldp x29,x30,[sp, #0x40]
009f3cd4	ldp x20,x19,[sp, #0x30]
009f3cd8	ldr x21,[sp, #0x20]
009f3cdc	add sp,sp,#0x50
009f3ce0	ret
