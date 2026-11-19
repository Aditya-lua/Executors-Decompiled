; mbedtls_cipher_info_from_string @ 00b69a98
00b69a98	str x21,[sp, #-0x30]!
00b69a9c	stp x20,x19,[sp, #0x10]
00b69aa0	stp x29,x30,[sp, #0x20]
00b69aa4	add x29,sp,#0x20
00b69aa8	mov x20,x0
00b69aac	cbz x0,0x00b69ae0
00b69ab0	adrp x8,0xcb5000
00b69ab4	ldr x8,[x8, #0xa88]
00b69ab8	ldr x19,[x8, #0x8]
00b69abc	cbz x19,0x00b69ae4
00b69ac0	add x21,x8,#0x18
00b69ac4	ldr x0,[x19]
00b69ac8	mov x1,x20
00b69acc	bl 0x00c301f0
00b69ad0	cbz w0,0x00b69ae4
00b69ad4	ldr x19,[x21], #0x10
00b69ad8	cbnz x19,0x00b69ac4
00b69adc	b 0x00b69ae4
00b69ae0	mov x19,xzr
00b69ae4	mov x0,x19
00b69ae8	ldp x29,x30,[sp, #0x20]
00b69aec	ldp x20,x19,[sp, #0x10]
00b69af0	ldr x21,[sp], #0x30
00b69af4	ret
