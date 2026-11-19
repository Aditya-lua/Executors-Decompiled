; BIO_ptr_ctrl @ 009fcd44
009fcd44	sub sp,sp,#0x20
009fcd48	add x3,sp,#0x8
009fcd4c	stp x29,x30,[sp, #0x10]
009fcd50	add x29,sp,#0x10
009fcd54	str xzr,[sp, #0x8]
009fcd58	bl 0x009fcb54
009fcd5c	ldr x8,[sp, #0x8]
009fcd60	ldp x29,x30,[sp, #0x10]
009fcd64	cmp x0,#0x1
009fcd68	csel x0,xzr,x8,lt
009fcd6c	add sp,sp,#0x20
009fcd70	ret
