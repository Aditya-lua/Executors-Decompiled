; tls_parse_ctos_post_handshake_auth @ 009d8a8c
009d8a8c	str x19,[sp, #-0x20]!
009d8a90	stp x29,x30,[sp, #0x10]
009d8a94	ldr x8,[x1, #0x8]
009d8a98	mov x19,x0
009d8a9c	add x29,sp,#0x10
009d8aa0	cbz x8,0x009d8adc
009d8aa4	bl 0x00c342a0
009d8aa8	adrp x0,0x2d7000
009d8aac	adrp x2,0x2d5000
009d8ab0	add x0,x0,#0xae0
009d8ab4	add x2,x2,#0x9ac
009d8ab8	mov w1,#0x4ca
009d8abc	bl 0x00c342b0
009d8ac0	mov w1,#0x32
009d8ac4	mov w2,#0x116
009d8ac8	mov x0,x19
009d8acc	mov x3,xzr
009d8ad0	bl 0x00c34410
009d8ad4	mov w0,wzr
009d8ad8	b 0x009d8ae8
009d8adc	mov w8,#0x2
009d8ae0	mov w0,#0x1
009d8ae4	str w8,[x19, #0xba8]
009d8ae8	ldp x29,x30,[sp, #0x10]
009d8aec	ldr x19,[sp], #0x20
009d8af0	ret
