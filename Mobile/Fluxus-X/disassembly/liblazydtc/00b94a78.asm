; mbedtls_ecp_export @ 00b94a78
00b94a78	str x21,[sp, #-0x30]!
00b94a7c	stp x20,x19,[sp, #0x10]
00b94a80	stp x29,x30,[sp, #0x20]
00b94a84	add x29,sp,#0x20
00b94a88	mov x19,x3
00b94a8c	mov x21,x2
00b94a90	mov x20,x0
00b94a94	cbz x1,0x00b94aac
00b94a98	ldr w8,[x20]
00b94a9c	mov x0,x1
00b94aa0	mov w1,w8
00b94aa4	bl 0x00c42800
00b94aa8	cbnz w0,0x00b94af8
00b94aac	cbz x21,0x00b94ac0
00b94ab0	add x1,x20,#0xc0
00b94ab4	mov x0,x21
00b94ab8	bl 0x00c41b60
00b94abc	cbnz w0,0x00b94af8
00b94ac0	cbz x19,0x00b94af4
00b94ac4	add x1,x20,#0xd0
00b94ac8	mov x0,x19
00b94acc	bl 0x00c41b60
00b94ad0	cbnz w0,0x00b94af8
00b94ad4	add x0,x19,#0x10
00b94ad8	add x1,x20,#0xe0
00b94adc	bl 0x00c41b60
00b94ae0	cbnz w0,0x00b94af8
00b94ae4	add x0,x19,#0x20
00b94ae8	add x1,x20,#0xf0
00b94aec	bl 0x00c41b60
00b94af0	cbnz w0,0x00b94af8
00b94af4	mov w0,wzr
00b94af8	ldp x29,x30,[sp, #0x20]
00b94afc	ldp x20,x19,[sp, #0x10]
00b94b00	ldr x21,[sp], #0x30
00b94b04	ret
