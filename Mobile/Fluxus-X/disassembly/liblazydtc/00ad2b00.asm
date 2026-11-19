; EVP_PKEY_CTX_get0_rsa_oaep_label @ 00ad2b00
00ad2b00	sub sp,sp,#0xa0
00ad2b04	stp x20,x19,[sp, #0x80]
00ad2b08	stp x29,x30,[sp, #0x90]
00ad2b0c	add x29,sp,#0x90
00ad2b10	cbz x0,0x00ad2bb4
00ad2b14	ldr w8,[x0]
00ad2b18	mov x20,x1
00ad2b1c	mov x19,x0
00ad2b20	cmp w8,#0x200
00ad2b24	b.eq 0x00ad2b30
00ad2b28	cmp w8,#0x400
00ad2b2c	b.ne 0x00ad2bb4
00ad2b30	adrp x1,0x2db000
00ad2b34	add x1,x1,#0x996
00ad2b38	mov x0,x19
00ad2b3c	bl 0x00c3dc40
00ad2b40	cbz w0,0x00ad2be8
00ad2b44	adrp x0,0x2bf000
00ad2b48	add x0,x0,#0xd88
00ad2b4c	add x8,sp,#0x8
00ad2b50	mov x1,x20
00ad2b54	mov x2,xzr
00ad2b58	bl 0x00c36de0
00ad2b5c	ldr x8,[sp, #0x28]
00ad2b60	ldur q0,[sp, #0x18]
00ad2b64	ldur q1,[sp, #0x8]
00ad2b68	str x8,[sp, #0x50]
00ad2b6c	add x8,sp,#0x8
00ad2b70	stp q1,q0,[sp, #0x30]
00ad2b74	bl 0x00c34c40
00ad2b78	ldr x8,[sp, #0x28]
00ad2b7c	ldur q0,[sp, #0x18]
00ad2b80	ldur q1,[sp, #0x8]
00ad2b84	add x1,sp,#0x30
00ad2b88	mov x0,x19
00ad2b8c	str x8,[sp, #0x78]
00ad2b90	stur q0,[sp, #0x68]
00ad2b94	stur q1,[sp, #0x58]
00ad2b98	bl 0x00c3d000
00ad2b9c	cbz w0,0x00ad2be8
00ad2ba0	ldr x8,[sp, #0x50]
00ad2ba4	lsr x9,x8,#0x1f
00ad2ba8	cmp x9,#0x0
00ad2bac	csinv w0,w8,wzr,eq
00ad2bb0	b 0x00ad2bec
00ad2bb4	bl 0x00c342a0
00ad2bb8	adrp x0,0x2b0000
00ad2bbc	adrp x2,0x2ae000
00ad2bc0	add x0,x0,#0x862
00ad2bc4	add x2,x2,#0x602
00ad2bc8	mov w1,#0x475
00ad2bcc	bl 0x00c342b0
00ad2bd0	orr w0,wzr,#0x6
00ad2bd4	mov w1,#0x93
00ad2bd8	mov x2,xzr
00ad2bdc	bl 0x00c342c0
00ad2be0	orr w0,wzr,#0xfffffffe
00ad2be4	b 0x00ad2bec
00ad2be8	mov w0,#0xffffffff
00ad2bec	ldp x29,x30,[sp, #0x90]
00ad2bf0	ldp x20,x19,[sp, #0x80]
00ad2bf4	add sp,sp,#0xa0
00ad2bf8	ret
