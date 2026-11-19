; mbedtls_rsa_free @ 00ba5c8c
00ba5c8c	str x19,[sp, #-0x20]!
00ba5c90	stp x29,x30,[sp, #0x10]
00ba5c94	add x29,sp,#0x10
00ba5c98	mov x19,x0
00ba5c9c	cbz x0,0x00ba5d10
00ba5ca0	add x0,x19,#0xc0
00ba5ca4	bl 0x00c41bb0
00ba5ca8	add x0,x19,#0xd0
00ba5cac	bl 0x00c41bb0
00ba5cb0	add x0,x19,#0x90
00ba5cb4	bl 0x00c41bb0
00ba5cb8	add x0,x19,#0x30
00ba5cbc	bl 0x00c41bb0
00ba5cc0	add x0,x19,#0x50
00ba5cc4	bl 0x00c41bb0
00ba5cc8	add x0,x19,#0x40
00ba5ccc	bl 0x00c41bb0
00ba5cd0	add x0,x19,#0x20
00ba5cd4	bl 0x00c41bb0
00ba5cd8	add x0,x19,#0x10
00ba5cdc	bl 0x00c41bb0
00ba5ce0	add x0,x19,#0xb0
00ba5ce4	bl 0x00c41bb0
00ba5ce8	add x0,x19,#0xa0
00ba5cec	bl 0x00c41bb0
00ba5cf0	add x0,x19,#0x80
00ba5cf4	bl 0x00c41bb0
00ba5cf8	add x0,x19,#0x70
00ba5cfc	bl 0x00c41bb0
00ba5d00	ldp x29,x30,[sp, #0x10]
00ba5d04	add x0,x19,#0x60
00ba5d08	ldr x19,[sp], #0x20
00ba5d0c	b 0x00c41bb0
00ba5d10	ldp x29,x30,[sp, #0x10]
00ba5d14	ldr x19,[sp], #0x20
00ba5d18	ret
