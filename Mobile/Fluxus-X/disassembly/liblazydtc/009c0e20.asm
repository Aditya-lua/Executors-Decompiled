; FUN_009c0e20 @ 009c0e20
009c0e20	sub sp,sp,#0x20
009c0e24	stp x1,x0,[sp]
009c0e28	adrp x1,0x2d7000
009c0e2c	adrp x2,0x9c5000
009c0e30	add x1,x1,#0xa59
009c0e34	add x2,x2,#0xef0
009c0e38	mov x3,sp
009c0e3c	stp x29,x30,[sp, #0x10]
009c0e40	add x29,sp,#0x10
009c0e44	bl 0x00c36550
009c0e48	ldp x29,x30,[sp, #0x10]
009c0e4c	add sp,sp,#0x20
009c0e50	ret
