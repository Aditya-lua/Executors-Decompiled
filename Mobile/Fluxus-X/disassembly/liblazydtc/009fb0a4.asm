; BIO_ADDR_service_string @ 009fb0a4
009fb0a4	sub sp,sp,#0x20
009fb0a8	add x3,sp,#0x8
009fb0ac	mov x2,xzr
009fb0b0	stp x29,x30,[sp, #0x10]
009fb0b4	add x29,sp,#0x10
009fb0b8	str xzr,[sp, #0x8]
009fb0bc	bl 0x009fae58
009fb0c0	ldr x8,[sp, #0x8]
009fb0c4	ldp x29,x30,[sp, #0x10]
009fb0c8	cmp w0,#0x0
009fb0cc	csel x0,xzr,x8,eq
009fb0d0	add sp,sp,#0x20
009fb0d4	ret
