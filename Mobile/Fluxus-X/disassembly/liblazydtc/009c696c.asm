; tls13_derive_key @ 009c696c
009c696c	sub sp,sp,#0x20
009c6970	mov x7,x3
009c6974	adrp x3,0x74c000
009c6978	mov x8,x4
009c697c	mov w9,#0x1
009c6980	add x3,x3,#0xe1c
009c6984	orr w4,wzr,#0x3
009c6988	mov x5,xzr
009c698c	mov x6,xzr
009c6990	stp x29,x30,[sp, #0x10]
009c6994	add x29,sp,#0x10
009c6998	str w9,[sp, #0x8]
009c699c	str x8,[sp]
009c69a0	bl 0x009c6600
009c69a4	ldp x29,x30,[sp, #0x10]
009c69a8	add sp,sp,#0x20
009c69ac	ret
