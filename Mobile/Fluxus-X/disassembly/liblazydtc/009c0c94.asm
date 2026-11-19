; tls1_free @ 009c0c94
009c0c94	str x19,[sp, #-0x20]!
009c0c98	stp x29,x30,[sp, #0x10]
009c0c9c	mov x19,x0
009c0ca0	ldr x0,[x0, #0xae0]
009c0ca4	adrp x1,0x2c3000
009c0ca8	add x1,x1,#0x5d8
009c0cac	mov w2,#0x7b
009c0cb0	add x29,sp,#0x10
009c0cb4	bl 0x00c32310
009c0cb8	ldp x29,x30,[sp, #0x10]
009c0cbc	mov x0,x19
009c0cc0	ldr x19,[sp], #0x20
009c0cc4	b 0x00c34480
