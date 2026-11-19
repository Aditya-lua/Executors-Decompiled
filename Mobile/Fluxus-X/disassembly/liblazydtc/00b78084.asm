; mbedtls_gcm_free @ 00b78084
00b78084	str x19,[sp, #-0x20]!
00b78088	stp x29,x30,[sp, #0x10]
00b7808c	add x29,sp,#0x10
00b78090	mov x19,x0
00b78094	cbz x0,0x00b780b4
00b78098	mov x0,x19
00b7809c	bl 0x00c30290
00b780a0	ldp x29,x30,[sp, #0x10]
00b780a4	mov w1,#0x1a8
00b780a8	mov x0,x19
00b780ac	ldr x19,[sp], #0x20
00b780b0	b 0x00c42220
00b780b4	ldp x29,x30,[sp, #0x10]
00b780b8	ldr x19,[sp], #0x20
00b780bc	ret
