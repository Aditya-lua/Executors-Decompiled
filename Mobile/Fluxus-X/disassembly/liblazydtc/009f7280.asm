; ASN1_item_new @ 009f7280
009f7280	sub sp,sp,#0x20
009f7284	mov x1,x0
009f7288	add x0,sp,#0x8
009f728c	mov w2,wzr
009f7290	mov x3,xzr
009f7294	mov x4,xzr
009f7298	stp x29,x30,[sp, #0x10]
009f729c	add x29,sp,#0x10
009f72a0	str xzr,[sp, #0x8]
009f72a4	bl 0x009f7310
009f72a8	ldr x8,[sp, #0x8]
009f72ac	ldp x29,x30,[sp, #0x10]
009f72b0	cmp w0,#0x0
009f72b4	csel x0,x8,xzr,gt
009f72b8	add sp,sp,#0x20
009f72bc	ret
