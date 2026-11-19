; ssl_get_EC_curve_nid @ 009c2aa8
009c2aa8	sub sp,sp,#0x50
009c2aac	add x1,sp,#0xc
009c2ab0	mov w2,#0x32
009c2ab4	mov x3,xzr
009c2ab8	stp x29,x30,[sp, #0x40]
009c2abc	add x29,sp,#0x40
009c2ac0	bl 0x00c324a0
009c2ac4	cmp w0,#0x1
009c2ac8	b.lt 0x009c2ad8
009c2acc	add x0,sp,#0xc
009c2ad0	bl 0x00c364a0
009c2ad4	b 0x009c2adc
009c2ad8	mov w0,wzr
009c2adc	ldp x29,x30,[sp, #0x40]
009c2ae0	add sp,sp,#0x50
009c2ae4	ret
