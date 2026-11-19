; ssl_log_rsa_client_key_exchange @ 009b8b64
009b8b64	str x19,[sp, #-0x20]!
009b8b68	cmp x2,#0x8
009b8b6c	mov x19,x0
009b8b70	stp x29,x30,[sp, #0x10]
009b8b74	add x29,sp,#0x10
009b8b78	b.cs 0x009b8bc0
009b8b7c	bl 0x00c342a0
009b8b80	adrp x0,0x2c5000
009b8b84	adrp x2,0x2a1000
009b8b88	add x0,x0,#0x652
009b8b8c	add x2,x2,#0xf28
009b8b90	mov w1,#0x15c9
009b8b94	bl 0x00c342b0
009b8b98	mov w2,#0x103
009b8b9c	mov w1,#0x50
009b8ba0	movk w2,#0xc, LSL #16
009b8ba4	mov x0,x19
009b8ba8	mov x3,xzr
009b8bac	bl 0x00c34410
009b8bb0	ldp x29,x30,[sp, #0x10]
009b8bb4	mov w0,wzr
009b8bb8	ldr x19,[sp], #0x20
009b8bbc	ret
009b8bc0	ldp x29,x30,[sp, #0x10]
009b8bc4	mov x8,x1
009b8bc8	adrp x0,0x2db000
009b8bcc	mov x5,x4
009b8bd0	mov x4,x3
009b8bd4	add x0,x0,#0x996
009b8bd8	mov w3,#0x8
009b8bdc	mov x1,x19
009b8be0	mov x2,x8
009b8be4	ldr x19,[sp], #0x20
009b8be8	b 0x009b8bec
