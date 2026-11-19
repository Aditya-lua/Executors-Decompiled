; ssl_evp_cipher_free @ 009b67a4
009b67a4	str x19,[sp, #-0x20]!
009b67a8	stp x29,x30,[sp, #0x10]
009b67ac	add x29,sp,#0x10
009b67b0	cbz x0,0x009b67d0
009b67b4	mov x19,x0
009b67b8	bl 0x00c34bb0
009b67bc	cbz x0,0x009b67d0
009b67c0	ldp x29,x30,[sp, #0x10]
009b67c4	mov x0,x19
009b67c8	ldr x19,[sp], #0x20
009b67cc	b 0x00c357d0
009b67d0	ldp x29,x30,[sp, #0x10]
009b67d4	ldr x19,[sp], #0x20
009b67d8	ret
