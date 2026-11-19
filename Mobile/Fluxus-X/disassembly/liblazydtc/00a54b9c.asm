; ERR_reason_error_string @ 00a54b9c
00a54b9c	sub sp,sp,#0x40
00a54ba0	stp x20,x19,[sp, #0x20]
00a54ba4	mov x19,x0
00a54ba8	adrp x0,0xd21000
00a54bac	adrp x1,0xa53000
00a54bb0	add x0,x0,#0xa30
00a54bb4	add x1,x1,#0xf8c
00a54bb8	str x21,[sp, #0x10]
00a54bbc	stp x29,x30,[sp, #0x30]
00a54bc0	add x29,sp,#0x30
00a54bc4	bl 0x00c34d60
00a54bc8	mov w8,w0
00a54bcc	mov x0,xzr
00a54bd0	tbnz w19,#0x1f,0x00a54c64
00a54bd4	cbz w8,0x00a54c64
00a54bd8	adrp x8,0xd21000
00a54bdc	ldr w8,[x8, #0xa34]
00a54be0	cbz w8,0x00a54c64
00a54be4	adrp x21,0xd21000
00a54be8	ldr x0,[x21, #0xa20]
00a54bec	and x8,x19,#0x7fffffff
00a54bf0	str x8,[sp]
00a54bf4	bl 0x00c35680
00a54bf8	cbz w0,0x00a54c20
00a54bfc	adrp x8,0xd21000
00a54c00	ldr x0,[x8, #0xa28]
00a54c04	mov x1,sp
00a54c08	bl 0x00c34de0
00a54c0c	ldr x8,[x21, #0xa20]
00a54c10	mov x20,x0
00a54c14	mov x0,x8
00a54c18	bl 0x00c35690
00a54c1c	cbnz x20,0x00a54c58
00a54c20	ldr x0,[x21, #0xa20]
00a54c24	and x8,x19,#0x7fffff
00a54c28	str x8,[sp]
00a54c2c	bl 0x00c35680
00a54c30	cbz w0,0x00a54c60
00a54c34	adrp x8,0xd21000
00a54c38	ldr x0,[x8, #0xa28]
00a54c3c	mov x1,sp
00a54c40	bl 0x00c34de0
00a54c44	ldr x8,[x21, #0xa20]
00a54c48	mov x20,x0
00a54c4c	mov x0,x8
00a54c50	bl 0x00c35690
00a54c54	cbz x20,0x00a54c60
00a54c58	ldr x0,[x20, #0x8]
00a54c5c	b 0x00a54c64
00a54c60	mov x0,xzr
00a54c64	ldp x29,x30,[sp, #0x30]
00a54c68	ldp x20,x19,[sp, #0x20]
00a54c6c	ldr x21,[sp, #0x10]
00a54c70	add sp,sp,#0x40
00a54c74	ret
