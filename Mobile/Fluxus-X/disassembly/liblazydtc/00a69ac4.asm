; EVP_PBE_find_ex @ 00a69ac4
00a69ac4	sub sp,sp,#0x60
00a69ac8	str x23,[sp, #0x20]
00a69acc	stp x22,x21,[sp, #0x30]
00a69ad0	stp x20,x19,[sp, #0x40]
00a69ad4	stp x29,x30,[sp, #0x50]
00a69ad8	add x29,sp,#0x50
00a69adc	cbz w1,0x00a69b7c
00a69ae0	adrp x23,0xd21000
00a69ae4	mov w8,w0
00a69ae8	ldr x0,[x23, #0xb40]
00a69aec	mov x19,x5
00a69af0	mov x20,x4
00a69af4	mov x21,x3
00a69af8	mov x22,x2
00a69afc	stp w8,w1,[sp]
00a69b00	cbz x0,0x00a69b20
00a69b04	mov x1,sp
00a69b08	bl 0x00c34760
00a69b0c	ldr x8,[x23, #0xb40]
00a69b10	mov w1,w0
00a69b14	mov x0,x8
00a69b18	bl 0x00c32610
00a69b1c	cbnz x0,0x00a69b44
00a69b20	adrp x1,0xc5e000
00a69b24	adrp x4,0xa69000
00a69b28	add x1,x1,#0x550
00a69b2c	add x4,x4,#0xe6c
00a69b30	mov x0,sp
00a69b34	mov w2,#0x1d
00a69b38	mov w3,#0x20
00a69b3c	bl 0x00c35830
00a69b40	cbz x0,0x00a69b80
00a69b44	cbz x22,0x00a69b50
00a69b48	ldr w8,[x0, #0x8]
00a69b4c	str w8,[x22]
00a69b50	cbz x21,0x00a69b5c
00a69b54	ldr w8,[x0, #0xc]
00a69b58	str w8,[x21]
00a69b5c	cbz x20,0x00a69b68
00a69b60	ldr x8,[x0, #0x10]
00a69b64	str x8,[x20]
00a69b68	cbz x19,0x00a69b74
00a69b6c	ldr x8,[x0, #0x18]
00a69b70	str x8,[x19]
00a69b74	mov w0,#0x1
00a69b78	b 0x00a69b80
00a69b7c	mov w0,wzr
00a69b80	ldp x29,x30,[sp, #0x50]
00a69b84	ldp x20,x19,[sp, #0x40]
00a69b88	ldp x22,x21,[sp, #0x30]
00a69b8c	ldr x23,[sp, #0x20]
00a69b90	add sp,sp,#0x60
00a69b94	ret
