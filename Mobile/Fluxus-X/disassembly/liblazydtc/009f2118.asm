; ASN1_parse_dump @ 009f2118
009f2118	sub sp,sp,#0x20
009f211c	mov w6,w4
009f2120	mov w5,w3
009f2124	str x1,[sp, #0x8]
009f2128	add x1,sp,#0x8
009f212c	mov w3,wzr
009f2130	mov w4,wzr
009f2134	stp x29,x30,[sp, #0x10]
009f2138	add x29,sp,#0x10
009f213c	bl 0x009f15d0
009f2140	ldp x29,x30,[sp, #0x10]
009f2144	add sp,sp,#0x20
009f2148	ret
