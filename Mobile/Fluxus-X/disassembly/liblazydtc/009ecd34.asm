; ASN1_OBJECT_create @ 009ecd34
009ecd34	sub sp,sp,#0x40
009ecd38	stp w0,w2,[sp, #0x18]
009ecd3c	mov w8,#0xd
009ecd40	add x0,sp,#0x8
009ecd44	stp x29,x30,[sp, #0x30]
009ecd48	add x29,sp,#0x30
009ecd4c	stp x3,x4,[sp, #0x8]
009ecd50	str x1,[sp, #0x20]
009ecd54	str w8,[sp, #0x28]
009ecd58	bl 0x00c37730
009ecd5c	ldp x29,x30,[sp, #0x30]
009ecd60	add sp,sp,#0x40
009ecd64	ret
