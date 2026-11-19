; BIO_ADDR_hostname_string @ 009fae24
009fae24	sub sp,sp,#0x20
009fae28	add x2,sp,#0x8
009fae2c	mov x3,xzr
009fae30	stp x29,x30,[sp, #0x10]
009fae34	add x29,sp,#0x10
009fae38	str xzr,[sp, #0x8]
009fae3c	bl 0x009fae58
009fae40	ldr x8,[sp, #0x8]
009fae44	ldp x29,x30,[sp, #0x10]
009fae48	cmp w0,#0x0
009fae4c	csel x0,xzr,x8,eq
009fae50	add sp,sp,#0x20
009fae54	ret
