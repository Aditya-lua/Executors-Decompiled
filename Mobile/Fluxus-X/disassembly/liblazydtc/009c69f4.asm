; tls13_derive_finishedkey @ 009c69f4
009c69f4	sub sp,sp,#0x20
009c69f8	mov x7,x3
009c69fc	adrp x3,0x74c000
009c6a00	mov x8,x4
009c6a04	mov w9,#0x1
009c6a08	add x3,x3,#0xe2a
009c6a0c	mov w4,#0x8
009c6a10	mov x5,xzr
009c6a14	mov x6,xzr
009c6a18	stp x29,x30,[sp, #0x10]
009c6a1c	add x29,sp,#0x10
009c6a20	str w9,[sp, #0x8]
009c6a24	str x8,[sp]
009c6a28	bl 0x009c6600
009c6a2c	ldp x29,x30,[sp, #0x10]
009c6a30	add sp,sp,#0x20
009c6a34	ret
