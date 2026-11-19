; ssl_hmac_free @ 009c3c1c
009c3c1c	cbz x0,0x009c3c5c
009c3c20	str x19,[sp, #-0x20]!
009c3c24	stp x29,x30,[sp, #0x10]
009c3c28	mov x19,x0
009c3c2c	ldr x0,[x0]
009c3c30	add x29,sp,#0x10
009c3c34	bl 0x00c36370
009c3c38	mov x0,x19
009c3c3c	bl 0x00c36640
009c3c40	ldp x29,x30,[sp, #0x10]
009c3c44	adrp x1,0x2c3000
009c3c48	add x1,x1,#0x5d8
009c3c4c	mov w2,#0xd74
009c3c50	mov x0,x19
009c3c54	ldr x19,[sp], #0x20
009c3c58	b 0x00c32310
009c3c5c	ret
