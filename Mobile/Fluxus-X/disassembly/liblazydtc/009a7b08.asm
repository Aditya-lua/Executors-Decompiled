; dtls1_write_app_data_bytes @ 009a7b08
009a7b08	str x23,[sp, #-0x40]!
009a7b0c	stp x22,x21,[sp, #0x10]
009a7b10	stp x20,x19,[sp, #0x20]
009a7b14	stp x29,x30,[sp, #0x30]
009a7b18	add x29,sp,#0x30
009a7b1c	mov x19,x4
009a7b20	mov x20,x3
009a7b24	mov x21,x2
009a7b28	mov w22,w1
009a7b2c	mov x23,x0
009a7b30	bl 0x00c344e0
009a7b34	cbz w0,0x009a7b44
009a7b38	mov x0,x23
009a7b3c	bl 0x00c34510
009a7b40	cbz w0,0x009a7bb8
009a7b44	cmp x20,#0x4, LSL #12
009a7b48	b.ls 0x009a7b90
009a7b4c	bl 0x00c342a0
009a7b50	adrp x0,0x2d1000
009a7b54	adrp x2,0x2c3000
009a7b58	add x0,x0,#0x326
009a7b5c	add x2,x2,#0x334
009a7b60	orr w1,wzr,#0x1c
009a7b64	bl 0x00c342b0
009a7b68	mov w0,#0x14
009a7b6c	mov w1,#0x14e
009a7b70	mov x2,xzr
009a7b74	bl 0x00c342c0
009a7b78	mov w0,#0xffffffff
009a7b7c	ldp x29,x30,[sp, #0x30]
009a7b80	ldp x20,x19,[sp, #0x20]
009a7b84	ldp x22,x21,[sp, #0x10]
009a7b88	ldr x23,[sp], #0x40
009a7b8c	ret
009a7b90	mov w1,w22
009a7b94	mov x2,x21
009a7b98	mov x3,x20
009a7b9c	mov x4,x19
009a7ba0	ldp x29,x30,[sp, #0x30]
009a7ba4	ldp x20,x19,[sp, #0x20]
009a7ba8	ldp x22,x21,[sp, #0x10]
009a7bac	mov x0,x23
009a7bb0	ldr x23,[sp], #0x40
009a7bb4	b 0x00c34500
009a7bb8	ldr x8,[x23, #0x30]
009a7bbc	mov x0,x23
009a7bc0	blr x8
009a7bc4	tbnz w0,#0x1f,0x009a7b7c
009a7bc8	cbnz w0,0x009a7b44
009a7bcc	bl 0x00c342a0
009a7bd0	adrp x0,0x2d1000
009a7bd4	adrp x2,0x2c3000
009a7bd8	add x0,x0,#0x326
009a7bdc	add x2,x2,#0x334
009a7be0	mov w1,#0x16
009a7be4	bl 0x00c342b0
009a7be8	mov w0,#0x14
009a7bec	mov w1,#0xe5
009a7bf0	b 0x009a7b70
