; tls_construct_ctos_session_ticket @ 009d2a44
009d2a44	str x21,[sp, #-0x30]!
009d2a48	stp x20,x19,[sp, #0x10]
009d2a4c	stp x29,x30,[sp, #0x20]
009d2a50	add x29,sp,#0x20
009d2a54	mov x20,x1
009d2a58	mov x19,x0
009d2a5c	bl 0x00c367f0
009d2a60	cbz w0,0x009d2afc
009d2a64	ldr w9,[x19, #0x3c]
009d2a68	ldr x8,[x19, #0x918]
009d2a6c	cbz w9,0x009d2ac8
009d2a70	cbz x8,0x009d2ae8
009d2a74	ldr x8,[x19, #0xae0]
009d2a78	cbz x8,0x009d2ae8
009d2a7c	ldr x9,[x8, #0x8]
009d2a80	cbz x9,0x009d2ae8
009d2a84	ldrh w21,[x8]
009d2a88	adrp x1,0x2bf000
009d2a8c	add x1,x1,#0x967
009d2a90	mov w2,#0x10e
009d2a94	mov x0,x21
009d2a98	bl 0x00c32320
009d2a9c	ldr x8,[x19, #0x918]
009d2aa0	str x0,[x8, #0x338]
009d2aa4	cbz x0,0x009d2b88
009d2aa8	ldr x8,[x19, #0xae0]
009d2aac	mov x2,x21
009d2ab0	ldr x1,[x8, #0x8]
009d2ab4	bl 0x00c2ffd0
009d2ab8	ldr x8,[x19, #0x918]
009d2abc	str x21,[x8, #0x340]
009d2ac0	cbnz x21,0x009d2b08
009d2ac4	b 0x009d2ae8
009d2ac8	cbz x8,0x009d2ae8
009d2acc	ldr x9,[x8, #0x338]
009d2ad0	cbz x9,0x009d2a74
009d2ad4	ldr w9,[x8]
009d2ad8	cmp w9,#0x304
009d2adc	b.eq 0x009d2a74
009d2ae0	ldr x21,[x8, #0x340]
009d2ae4	cbnz x21,0x009d2b08
009d2ae8	ldr x8,[x19, #0xae0]
009d2aec	cbz x8,0x009d2b04
009d2af0	ldr x8,[x8, #0x8]
009d2af4	mov x21,xzr
009d2af8	cbnz x8,0x009d2b08
009d2afc	mov w0,#0x2
009d2b00	b 0x009d2b78
009d2b04	mov x21,xzr
009d2b08	mov w1,#0x23
009d2b0c	mov w2,#0x2
009d2b10	mov x0,x20
009d2b14	bl 0x00c343a0
009d2b18	cbz w0,0x009d2b40
009d2b1c	ldr x8,[x19, #0x918]
009d2b20	mov w3,#0x2
009d2b24	mov x0,x20
009d2b28	mov x2,x21
009d2b2c	ldr x1,[x8, #0x338]
009d2b30	bl 0x00c36f70
009d2b34	cbz w0,0x009d2b40
009d2b38	mov w0,#0x1
009d2b3c	b 0x009d2b78
009d2b40	bl 0x00c342a0
009d2b44	adrp x0,0x2bf000
009d2b48	adrp x2,0x2bf000
009d2b4c	add x0,x0,#0x967
009d2b50	add x2,x2,#0x99b
009d2b54	mov w1,#0x120
009d2b58	bl 0x00c342b0
009d2b5c	mov w2,#0x103
009d2b60	mov w1,#0x50
009d2b64	movk w2,#0xc, LSL #16
009d2b68	mov x0,x19
009d2b6c	mov x3,xzr
009d2b70	bl 0x00c34410
009d2b74	mov w0,wzr
009d2b78	ldp x29,x30,[sp, #0x20]
009d2b7c	ldp x20,x19,[sp, #0x10]
009d2b80	ldr x21,[sp], #0x30
009d2b84	ret
009d2b88	bl 0x00c342a0
009d2b8c	adrp x0,0x2bf000
009d2b90	adrp x2,0x2bf000
009d2b94	add x0,x0,#0x967
009d2b98	add x2,x2,#0x99b
009d2b9c	mov w1,#0x110
009d2ba0	b 0x009d2b58
