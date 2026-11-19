; X509_NAME_get_text_by_NID @ 00b14b14
00b14b14	str x21,[sp, #-0x30]!
00b14b18	mov x21,x0
00b14b1c	mov w0,w1
00b14b20	stp x20,x19,[sp, #0x10]
00b14b24	stp x29,x30,[sp, #0x20]
00b14b28	add x29,sp,#0x20
00b14b2c	mov w19,w3
00b14b30	mov x20,x2
00b14b34	bl 0x00c37740
00b14b38	cbz x0,0x00b14b5c
00b14b3c	mov x2,x20
00b14b40	mov w3,w19
00b14b44	ldp x29,x30,[sp, #0x20]
00b14b48	ldp x20,x19,[sp, #0x10]
00b14b4c	mov x1,x0
00b14b50	mov x0,x21
00b14b54	ldr x21,[sp], #0x30
00b14b58	b 0x00b14b70
00b14b5c	ldp x29,x30,[sp, #0x20]
00b14b60	ldp x20,x19,[sp, #0x10]
00b14b64	mov w0,#0xffffffff
00b14b68	ldr x21,[sp], #0x30
00b14b6c	ret
