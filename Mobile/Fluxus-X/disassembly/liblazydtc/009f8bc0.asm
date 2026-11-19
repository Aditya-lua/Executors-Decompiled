; FUN_009f8bc0 @ 009f8bc0
009f8bc0	sub sp,sp,#0x50
009f8bc4	stp x22,x21,[sp, #0x20]
009f8bc8	stp x20,x19,[sp, #0x30]
009f8bcc	stp x29,x30,[sp, #0x40]
009f8bd0	stp xzr,x1,[sp, #0x10]
009f8bd4	str wzr,[sp, #0xc]
009f8bd8	ldr x19,[x0]
009f8bdc	mov x20,x5
009f8be0	mov w21,w2
009f8be4	add x29,sp,#0x40
009f8be8	cbnz x19,0x009f8c10
009f8bec	adrp x1,0x2db000
009f8bf0	mov x22,x0
009f8bf4	add x1,x1,#0xdbc
009f8bf8	mov w0,#0x8
009f8bfc	orr w2,wzr,#0x1f
009f8c00	bl 0x00c34250
009f8c04	mov x19,x0
009f8c08	str x0,[x22]
009f8c0c	cbz x0,0x009f8cac
009f8c10	cbz w21,0x009f8c64
009f8c14	sxtw x3,w21
009f8c18	add x0,sp,#0x10
009f8c1c	add x1,sp,#0xc
009f8c20	add x2,sp,#0x18
009f8c24	bl 0x00c37610
009f8c28	cbz w0,0x009f8ce0
009f8c2c	ldr x10,[x20, #0x28]
009f8c30	ldr w9,[sp, #0xc]
009f8c34	tbnz w10,#0x1,0x009f8c74
009f8c38	cbz w9,0x009f8c74
009f8c3c	bl 0x00c342a0
009f8c40	adrp x0,0x2db000
009f8c44	adrp x2,0x2ab000
009f8c48	add x0,x0,#0xdbc
009f8c4c	add x2,x2,#0xe23
009f8c50	mov w1,#0x61
009f8c54	bl 0x00c342b0
009f8c58	mov w0,#0xd
009f8c5c	mov w1,#0xe2
009f8c60	b 0x009f8cd4
009f8c64	mov x8,xzr
009f8c68	mov w0,#0x1
009f8c6c	str x8,[x19]
009f8c70	b 0x009f8ce0
009f8c74	ldr x8,[sp, #0x10]
009f8c78	tbz x8,#0x3f,0x009f8cf4
009f8c7c	tbz w10,#0x1,0x009f8cf4
009f8c80	cbnz w9,0x009f8cf4
009f8c84	bl 0x00c342a0
009f8c88	adrp x0,0x2db000
009f8c8c	adrp x2,0x2ab000
009f8c90	add x0,x0,#0xdbc
009f8c94	add x2,x2,#0xe23
009f8c98	mov w1,#0x66
009f8c9c	bl 0x00c342b0
009f8ca0	mov w0,#0xd
009f8ca4	mov w1,#0xdf
009f8ca8	b 0x009f8cd4
009f8cac	bl 0x00c342a0
009f8cb0	adrp x0,0x2db000
009f8cb4	adrp x2,0x2a2000
009f8cb8	add x0,x0,#0xdbc
009f8cbc	add x2,x2,#0x180
009f8cc0	mov w1,#0x20
009f8cc4	bl 0x00c342b0
009f8cc8	mov w1,#0x100
009f8ccc	mov w0,#0xd
009f8cd0	movk w1,#0xc, LSL #16
009f8cd4	mov x2,xzr
009f8cd8	bl 0x00c342c0
009f8cdc	mov w0,wzr
009f8ce0	ldp x29,x30,[sp, #0x40]
009f8ce4	ldp x20,x19,[sp, #0x30]
009f8ce8	ldp x22,x21,[sp, #0x20]
009f8cec	add sp,sp,#0x50
009f8cf0	ret
009f8cf4	cbz w9,0x009f8c68
009f8cf8	neg x8,x8
009f8cfc	str x8,[sp, #0x10]
009f8d00	b 0x009f8c68
