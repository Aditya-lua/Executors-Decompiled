; PKCS8_pkey_get0 @ 009f2af8
009f2af8	stp x22,x21,[sp, #-0x30]!
009f2afc	stp x20,x19,[sp, #0x10]
009f2b00	mov x20,x4
009f2b04	mov x19,x3
009f2b08	mov x21,x2
009f2b0c	mov x22,x1
009f2b10	stp x29,x30,[sp, #0x20]
009f2b14	add x29,sp,#0x20
009f2b18	cbz x0,0x009f2b28
009f2b1c	ldr x8,[x20, #0x8]
009f2b20	ldr x8,[x8]
009f2b24	str x8,[x0]
009f2b28	cbz x22,0x009f2b44
009f2b2c	ldr x0,[x20, #0x10]
009f2b30	bl 0x00c32130
009f2b34	str x0,[x22]
009f2b38	ldr x0,[x20, #0x10]
009f2b3c	bl 0x00c32140
009f2b40	str w0,[x21]
009f2b44	cbz x19,0x009f2b50
009f2b48	ldr x8,[x20, #0x8]
009f2b4c	str x8,[x19]
009f2b50	ldp x29,x30,[sp, #0x20]
009f2b54	ldp x20,x19,[sp, #0x10]
009f2b58	mov w0,#0x1
009f2b5c	ldp x22,x21,[sp], #0x30
009f2b60	ret
