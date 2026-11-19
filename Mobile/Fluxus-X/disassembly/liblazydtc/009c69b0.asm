; tls13_derive_iv @ 009c69b0
009c69b0	sub sp,sp,#0x20
009c69b4	mov x7,x3
009c69b8	adrp x3,0x74c000
009c69bc	mov x8,x4
009c69c0	mov w9,#0x1
009c69c4	add x3,x3,#0xe27
009c69c8	mov w4,#0x2
009c69cc	mov x5,xzr
009c69d0	mov x6,xzr
009c69d4	stp x29,x30,[sp, #0x10]
009c69d8	add x29,sp,#0x10
009c69dc	str w9,[sp, #0x8]
009c69e0	str x8,[sp]
009c69e4	bl 0x009c6600
009c69e8	ldp x29,x30,[sp, #0x10]
009c69ec	add sp,sp,#0x20
009c69f0	ret
