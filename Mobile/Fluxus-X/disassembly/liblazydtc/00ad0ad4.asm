; BN_BLINDING_new @ 00ad0ad4
00ad0ad4	stp x22,x21,[sp, #-0x30]!
00ad0ad8	mov x21,x1
00ad0adc	adrp x1,0x2be000
00ad0ae0	stp x20,x19,[sp, #0x10]
00ad0ae4	mov x20,x2
00ad0ae8	mov x22,x0
00ad0aec	add x1,x1,#0x30a
00ad0af0	mov w0,#0x50
00ad0af4	mov w2,#0x24
00ad0af8	stp x29,x30,[sp, #0x20]
00ad0afc	add x29,sp,#0x20
00ad0b00	bl 0x00c34250
00ad0b04	mov x19,x0
00ad0b08	cbz x0,0x00ad0b80
00ad0b0c	bl 0x00c34d50
00ad0b10	str x0,[x19, #0x48]
00ad0b14	cbz x0,0x00ad0bf0
00ad0b18	bl 0x00c3ecb0
00ad0b1c	str x0,[x19, #0x20]
00ad0b20	cbz x22,0x00ad0b34
00ad0b24	mov x0,x22
00ad0b28	bl 0x00c369a0
00ad0b2c	str x0,[x19]
00ad0b30	cbz x0,0x00ad0bb4
00ad0b34	cbz x21,0x00ad0b48
00ad0b38	mov x0,x21
00ad0b3c	bl 0x00c369a0
00ad0b40	str x0,[x19, #0x8]
00ad0b44	cbz x0,0x00ad0bb4
00ad0b48	mov x0,x20
00ad0b4c	bl 0x00c369a0
00ad0b50	str x0,[x19, #0x18]
00ad0b54	cbz x0,0x00ad0bb4
00ad0b58	mov w1,#0x4
00ad0b5c	mov x0,x20
00ad0b60	bl 0x00c38ce0
00ad0b64	cbz w0,0x00ad0b74
00ad0b68	ldr x0,[x19, #0x18]
00ad0b6c	mov w1,#0x4
00ad0b70	bl 0x00c38dc0
00ad0b74	mov w8,#0xffffffff
00ad0b78	str w8,[x19, #0x28]
00ad0b7c	b 0x00ad0c38
00ad0b80	bl 0x00c342a0
00ad0b84	adrp x0,0x2be000
00ad0b88	adrp x2,0x2bc000
00ad0b8c	add x0,x0,#0x30a
00ad0b90	add x2,x2,#0x3d8
00ad0b94	mov w1,#0x25
00ad0b98	bl 0x00c342b0
00ad0b9c	mov w1,#0x100
00ad0ba0	orr w0,wzr,#0x3
00ad0ba4	movk w1,#0xc, LSL #16
00ad0ba8	mov x2,xzr
00ad0bac	bl 0x00c342c0
00ad0bb0	b 0x00ad0c38
00ad0bb4	ldr x0,[x19]
00ad0bb8	bl 0x00c36290
00ad0bbc	ldr x0,[x19, #0x8]
00ad0bc0	bl 0x00c36290
00ad0bc4	ldr x0,[x19, #0x10]
00ad0bc8	bl 0x00c36290
00ad0bcc	ldr x0,[x19, #0x18]
00ad0bd0	bl 0x00c36290
00ad0bd4	ldr x0,[x19, #0x48]
00ad0bd8	bl 0x00c34d40
00ad0bdc	adrp x1,0x2be000
00ad0be0	add x1,x1,#0x30a
00ad0be4	mov w2,#0x5a
00ad0be8	mov x0,x19
00ad0bec	b 0x00ad0c30
00ad0bf0	bl 0x00c342a0
00ad0bf4	adrp x20,0x2be000
00ad0bf8	add x20,x20,#0x30a
00ad0bfc	adrp x2,0x2bc000
00ad0c00	add x2,x2,#0x3d8
00ad0c04	mov w1,#0x2b
00ad0c08	mov x0,x20
00ad0c0c	bl 0x00c342b0
00ad0c10	mov w1,#0x100
00ad0c14	orr w0,wzr,#0x3
00ad0c18	movk w1,#0xc, LSL #16
00ad0c1c	mov x2,xzr
00ad0c20	bl 0x00c342c0
00ad0c24	mov w2,#0x2c
00ad0c28	mov x0,x19
00ad0c2c	mov x1,x20
00ad0c30	bl 0x00c32310
00ad0c34	mov x19,xzr
00ad0c38	mov x0,x19
00ad0c3c	ldp x29,x30,[sp, #0x20]
00ad0c40	ldp x20,x19,[sp, #0x10]
00ad0c44	ldp x22,x21,[sp], #0x30
00ad0c48	ret
