; ASN1_item_new_ex @ 009f72d0
009f72d0	sub sp,sp,#0x20
009f72d4	mov x4,x2
009f72d8	mov x3,x1
009f72dc	mov x1,x0
009f72e0	add x0,sp,#0x8
009f72e4	mov w2,wzr
009f72e8	stp x29,x30,[sp, #0x10]
009f72ec	add x29,sp,#0x10
009f72f0	str xzr,[sp, #0x8]
009f72f4	bl 0x009f7310
009f72f8	ldr x8,[sp, #0x8]
009f72fc	ldp x29,x30,[sp, #0x10]
009f7300	cmp w0,#0x0
009f7304	csel x0,x8,xzr,gt
009f7308	add sp,sp,#0x20
009f730c	ret
