; mbedtls_ecp_keypair_free @ 00b91bb0
00b91bb0	str x19,[sp, #-0x20]!
00b91bb4	stp x29,x30,[sp, #0x10]
00b91bb8	add x29,sp,#0x10
00b91bbc	mov x19,x0
00b91bc0	cbz x0,0x00b91bf4
00b91bc4	mov x0,x19
00b91bc8	bl 0x00c426b0
00b91bcc	add x0,x19,#0xc0
00b91bd0	bl 0x00c41bb0
00b91bd4	add x0,x19,#0xd0
00b91bd8	bl 0x00c41bb0
00b91bdc	add x0,x19,#0xe0
00b91be0	bl 0x00c41bb0
00b91be4	ldp x29,x30,[sp, #0x10]
00b91be8	add x0,x19,#0xf0
00b91bec	ldr x19,[sp], #0x20
00b91bf0	b 0x00c41bb0
00b91bf4	ldp x29,x30,[sp, #0x10]
00b91bf8	ldr x19,[sp], #0x20
00b91bfc	ret
