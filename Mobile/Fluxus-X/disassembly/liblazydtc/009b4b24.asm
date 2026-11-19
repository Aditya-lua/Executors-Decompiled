; FUN_009b4b24 @ 009b4b24
009b4b24	sub sp,sp,#0x60
009b4b28	stp x22,x21,[sp, #0x30]
009b4b2c	stp x20,x19,[sp, #0x40]
009b4b30	stp x29,x30,[sp, #0x50]
009b4b34	ldr x8,[x0, #0x30]
009b4b38	add x29,sp,#0x50
009b4b3c	cbz x8,0x009b4b98
009b4b40	ldrb w8,[x0, #0x44]
009b4b44	mov x20,x0
009b4b48	mov w0,wzr
009b4b4c	tbnz w8,#0x1,0x009b4bc8
009b4b50	ldrb w8,[x20, #0x9f1]
009b4b54	mov x19,x3
009b4b58	mov x21,x2
009b4b5c	mov x22,x1
009b4b60	tbz w8,#0x0,0x009b4b6c
009b4b64	bl 0x00c355a0
009b4b68	cbz x0,0x009b4bdc
009b4b6c	ldr x8,[x20, #0x8]
009b4b70	mov x0,x20
009b4b74	mov x1,x22
009b4b78	mov x2,x21
009b4b7c	ldr x4,[x8, #0x40]
009b4b80	mov x3,x19
009b4b84	ldp x29,x30,[sp, #0x50]
009b4b88	ldp x20,x19,[sp, #0x40]
009b4b8c	ldp x22,x21,[sp, #0x30]
009b4b90	add sp,sp,#0x60
009b4b94	br x4
009b4b98	bl 0x00c342a0
009b4b9c	adrp x0,0x2c5000
009b4ba0	adrp x2,0x2d1000
009b4ba4	add x0,x0,#0x652
009b4ba8	add x2,x2,#0x561
009b4bac	mov w1,#0x7c3
009b4bb0	bl 0x00c342b0
009b4bb4	mov w0,#0x14
009b4bb8	mov w1,#0x114
009b4bbc	mov x2,xzr
009b4bc0	bl 0x00c342c0
009b4bc4	mov w0,#0xffffffff
009b4bc8	ldp x29,x30,[sp, #0x50]
009b4bcc	ldp x20,x19,[sp, #0x40]
009b4bd0	ldp x22,x21,[sp, #0x30]
009b4bd4	add sp,sp,#0x60
009b4bd8	ret
009b4bdc	stp x20,x22,[sp, #0x8]
009b4be0	str x21,[sp, #0x18]
009b4be4	str wzr,[sp, #0x20]
009b4be8	ldr x8,[x20, #0x8]
009b4bec	adrp x2,0x9b4000
009b4bf0	add x2,x2,#0x86c
009b4bf4	add x1,sp,#0x8
009b4bf8	ldr x8,[x8, #0x40]
009b4bfc	mov x0,x20
009b4c00	str x8,[sp, #0x28]
009b4c04	bl 0x009b4724
009b4c08	ldr x8,[x20, #0x1d38]
009b4c0c	str x8,[x19]
009b4c10	b 0x009b4bc8
