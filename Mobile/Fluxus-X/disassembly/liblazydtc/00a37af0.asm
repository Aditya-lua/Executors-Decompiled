; ossl_ec_GFp_mont_field_inv @ 00a37af0
00a37af0	stp x24,x23,[sp, #-0x40]!
00a37af4	stp x22,x21,[sp, #0x10]
00a37af8	stp x20,x19,[sp, #0x20]
00a37afc	stp x29,x30,[sp, #0x30]
00a37b00	ldr x8,[x0, #0x78]
00a37b04	add x29,sp,#0x30
00a37b08	cbz x8,0x00a37be0
00a37b0c	mov x19,x3
00a37b10	mov x22,x2
00a37b14	mov x23,x0
00a37b18	mov x21,x1
00a37b1c	mov x20,xzr
00a37b20	cbnz x3,0x00a37b38
00a37b24	ldr x0,[x23, #0xa8]
00a37b28	bl 0x00c38a80
00a37b2c	mov x19,x0
00a37b30	mov x20,x0
00a37b34	cbz x0,0x00a37be0
00a37b38	mov x0,x19
00a37b3c	bl 0x00c38a90
00a37b40	mov x0,x19
00a37b44	bl 0x00c38a40
00a37b48	cbz x0,0x00a37bc8
00a37b4c	mov w1,#0x2
00a37b50	mov x24,x0
00a37b54	bl 0x00c37720
00a37b58	cbz w0,0x00a37bc8
00a37b5c	ldr x1,[x23, #0x40]
00a37b60	mov x0,x24
00a37b64	mov x2,x24
00a37b68	bl 0x00c38880
00a37b6c	cbz w0,0x00a37bc8
00a37b70	ldr x3,[x23, #0x40]
00a37b74	ldr x5,[x23, #0x78]
00a37b78	mov x0,x21
00a37b7c	mov x1,x22
00a37b80	mov x2,x24
00a37b84	mov x4,x19
00a37b88	bl 0x00c38ae0
00a37b8c	cbz w0,0x00a37bc8
00a37b90	mov x0,x21
00a37b94	bl 0x00c369b0
00a37b98	cbz w0,0x00a37bfc
00a37b9c	bl 0x00c342a0
00a37ba0	adrp x0,0x2bf000
00a37ba4	adrp x2,0x2aa000
00a37ba8	add x0,x0,#0xbb4
00a37bac	add x2,x2,#0xfa
00a37bb0	orr w1,wzr,#0xff
00a37bb4	bl 0x00c342b0
00a37bb8	mov w0,#0x10
00a37bbc	mov w1,#0xa5
00a37bc0	mov x2,xzr
00a37bc4	bl 0x00c342c0
00a37bc8	mov w21,wzr
00a37bcc	mov x0,x19
00a37bd0	bl 0x00c38a20
00a37bd4	mov x0,x20
00a37bd8	bl 0x00c38a30
00a37bdc	b 0x00a37be4
00a37be0	mov w21,wzr
00a37be4	mov w0,w21
00a37be8	ldp x29,x30,[sp, #0x30]
00a37bec	ldp x20,x19,[sp, #0x20]
00a37bf0	ldp x22,x21,[sp, #0x10]
00a37bf4	ldp x24,x23,[sp], #0x40
00a37bf8	ret
00a37bfc	mov w21,#0x1
00a37c00	b 0x00a37bcc
