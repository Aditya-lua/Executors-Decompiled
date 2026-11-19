; ssl_sort_cipher_list @ 009a7f04
009a7f04	str x19,[sp, #-0x20]!
009a7f08	adrp x19,0x9a7000
009a7f0c	adrp x0,0xcc4000
009a7f10	add x19,x19,#0xf68
009a7f14	add x0,x0,#0xe30
009a7f18	mov w1,#0x5
009a7f1c	mov w2,#0x50
009a7f20	mov x3,x19
009a7f24	stp x29,x30,[sp, #0x10]
009a7f28	add x29,sp,#0x10
009a7f2c	bl 0x00c31d30
009a7f30	adrp x0,0xcc4000
009a7f34	add x0,x0,#0xfc0
009a7f38	mov w1,#0xa7
009a7f3c	mov w2,#0x50
009a7f40	mov x3,x19
009a7f44	bl 0x00c31d30
009a7f48	ldp x29,x30,[sp, #0x10]
009a7f4c	adrp x0,0xcc8000
009a7f50	add x0,x0,#0x3f0
009a7f54	mov w1,#0x2
009a7f58	mov w2,#0x50
009a7f5c	mov x3,x19
009a7f60	ldr x19,[sp], #0x20
009a7f64	b 0x00c31d30
