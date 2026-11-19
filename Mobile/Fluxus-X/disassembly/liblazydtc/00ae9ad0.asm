; OSSL_STORE_expect @ 00ae9ad0
00ae9ad0	sub sp,sp,#0xa0
00ae9ad4	stp x29,x30,[sp, #0x90]
00ae9ad8	add x29,sp,#0x90
00ae9adc	str x19,[sp, #0x80]
00ae9ae0	stur w1,[x29, #-0x4]
00ae9ae4	cbz x0,0x00ae9b24
00ae9ae8	cmp w1,#0x7
00ae9aec	b.cs 0x00ae9b24
00ae9af0	ldr w8,[x0, #0x38]
00ae9af4	mov x19,x0
00ae9af8	cbz w8,0x00ae9b68
00ae9afc	bl 0x00c342a0
00ae9b00	adrp x0,0x2c2000
00ae9b04	adrp x2,0x2d0000
00ae9b08	add x0,x0,#0x3bd
00ae9b0c	add x2,x2,#0x3af
00ae9b10	mov w1,#0x11d
00ae9b14	bl 0x00c342b0
00ae9b18	mov w0,#0x2c
00ae9b1c	mov w1,#0x75
00ae9b20	b 0x00ae9b4c
00ae9b24	bl 0x00c342a0
00ae9b28	adrp x0,0x2c2000
00ae9b2c	adrp x2,0x2d0000
00ae9b30	add x0,x0,#0x3bd
00ae9b34	add x2,x2,#0x3af
00ae9b38	mov w1,#0x119
00ae9b3c	bl 0x00c342b0
00ae9b40	mov w1,#0x106
00ae9b44	mov w0,#0x2c
00ae9b48	movk w1,#0x8, LSL #16
00ae9b4c	mov x2,xzr
00ae9b50	bl 0x00c342c0
00ae9b54	mov w0,wzr
00ae9b58	ldp x29,x30,[sp, #0x90]
00ae9b5c	ldr x19,[sp, #0x80]
00ae9b60	add sp,sp,#0xa0
00ae9b64	ret
00ae9b68	ldr x8,[x19, #0x8]
00ae9b6c	str w1,[x19, #0x28]
00ae9b70	cbz x8,0x00ae9bd0
00ae9b74	ldr x8,[x8, #0xa8]
00ae9b78	cbz x8,0x00ae9bf0
00ae9b7c	add x0,sp,#0x30
00ae9b80	mov w2,#0x50
00ae9b84	mov w1,wzr
00ae9b88	bl 0x00c301c0
00ae9b8c	adrp x0,0x2b8000
00ae9b90	add x0,x0,#0x658
00ae9b94	add x8,sp,#0x8
00ae9b98	sub x1,x29,#0x4
00ae9b9c	bl 0x00c36260
00ae9ba0	ldr x8,[sp, #0x28]
00ae9ba4	ldur q0,[sp, #0x18]
00ae9ba8	ldur q1,[sp, #0x8]
00ae9bac	add x1,sp,#0x30
00ae9bb0	str x8,[sp, #0x50]
00ae9bb4	stp q1,q0,[sp, #0x30]
00ae9bb8	ldp x8,x0,[x19, #0x8]
00ae9bbc	ldr x8,[x8, #0xa8]
00ae9bc0	blr x8
00ae9bc4	ldr x8,[x19, #0x8]
00ae9bc8	cbnz x8,0x00ae9b58
00ae9bcc	b 0x00ae9bd4
00ae9bd0	mov w0,#0x1
00ae9bd4	ldr x8,[x19]
00ae9bd8	ldr x8,[x8, #0x28]
00ae9bdc	cbz x8,0x00ae9b58
00ae9be0	ldr x0,[x19, #0x10]
00ae9be4	ldur w1,[x29, #-0x4]
00ae9be8	blr x8
00ae9bec	b 0x00ae9b58
00ae9bf0	mov w0,#0x1
00ae9bf4	b 0x00ae9b58
