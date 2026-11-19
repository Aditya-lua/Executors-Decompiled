; tls13_generate_handshake_secret @ 009c6d00
009c6d00	str x21,[sp, #-0x30]!
009c6d04	stp x20,x19,[sp, #0x10]
009c6d08	stp x29,x30,[sp, #0x20]
009c6d0c	add x29,sp,#0x20
009c6d10	mov x19,x2
009c6d14	mov x20,x1
009c6d18	mov x21,x0
009c6d1c	bl 0x00c34a10
009c6d20	mov x3,x20
009c6d24	mov x4,x19
009c6d28	ldp x29,x30,[sp, #0x20]
009c6d2c	ldp x20,x19,[sp, #0x10]
009c6d30	add x2,x21,#0x544
009c6d34	add x5,x21,#0x584
009c6d38	mov x1,x0
009c6d3c	mov x0,x21
009c6d40	ldr x21,[sp], #0x30
009c6d44	b 0x009c6a38
