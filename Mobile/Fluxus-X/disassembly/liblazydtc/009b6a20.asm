; ssl_check_srvr_ecc_cert_and_alg @ 009b6a20
009b6a20	stp x29,x30,[sp, #-0x10]!
009b6a24	ldr x8,[x1, #0x2e0]
009b6a28	mov x29,sp
009b6a2c	ldrb w8,[x8, #0x20]
009b6a30	tbnz w8,#0x3,0x009b6a40
009b6a34	mov w0,#0x1
009b6a38	ldp x29,x30,[sp], #0x10
009b6a3c	ret
009b6a40	bl 0x00c35c50
009b6a44	tbnz w0,#0x7,0x009b6a80
009b6a48	bl 0x00c342a0
009b6a4c	adrp x0,0x2c5000
009b6a50	adrp x2,0x2b1000
009b6a54	add x0,x0,#0x652
009b6a58	add x2,x2,#0xedd
009b6a5c	mov w1,#0xe80
009b6a60	bl 0x00c342b0
009b6a64	mov w0,#0x14
009b6a68	mov w1,#0x13e
009b6a6c	mov x2,xzr
009b6a70	bl 0x00c342c0
009b6a74	mov w0,wzr
009b6a78	ldp x29,x30,[sp], #0x10
009b6a7c	ret
009b6a80	mov w0,#0x1
009b6a84	ldp x29,x30,[sp], #0x10
009b6a88	ret
