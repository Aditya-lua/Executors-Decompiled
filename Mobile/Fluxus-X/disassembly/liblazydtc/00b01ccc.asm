; X509_check_purpose @ 00b01ccc
00b01ccc	sub sp,sp,#0x60
00b01cd0	stp x22,x21,[sp, #0x30]
00b01cd4	stp x20,x19,[sp, #0x40]
00b01cd8	stp x29,x30,[sp, #0x50]
00b01cdc	add x29,sp,#0x50
00b01ce0	mov w19,w2
00b01ce4	mov w21,w1
00b01ce8	mov x20,x0
00b01cec	bl 0x00b01d98
00b01cf0	cbz w0,0x00b01d78
00b01cf4	cmn w21,#0x1
00b01cf8	b.eq 0x00b01d2c
00b01cfc	sub w8,w21,#0x1
00b01d00	cmp w8,#0x8
00b01d04	b.hi 0x00b01d34
00b01d08	adrp x9,0xcc9000
00b01d0c	add x9,x9,#0xa28
00b01d10	orr w10,wzr,#0x30
00b01d14	smaddl x0,w8,w10,x9
00b01d18	ldr x8,[x0, #0x10]
00b01d1c	mov x1,x20
00b01d20	mov w2,w19
00b01d24	blr x8
00b01d28	b 0x00b01d7c
00b01d2c	mov w0,#0x1
00b01d30	b 0x00b01d7c
00b01d34	adrp x22,0xd22000
00b01d38	ldr x0,[x22, #0x7e0]
00b01d3c	cbz x0,0x00b01d78
00b01d40	mov x1,sp
00b01d44	str w21,[sp]
00b01d48	bl 0x00c34760
00b01d4c	tbnz w0,#0x1f,0x00b01d78
00b01d50	add w8,w0,#0x9
00b01d54	mov w1,w0
00b01d58	cmn w8,#0x1
00b01d5c	b.eq 0x00b01d78
00b01d60	tbnz w8,#0x1f,0x00b01d90
00b01d64	cmp w8,#0x8
00b01d68	b.le 0x00b01d08
00b01d6c	ldr x0,[x22, #0x7e0]
00b01d70	bl 0x00c32610
00b01d74	b 0x00b01d18
00b01d78	mov w0,#0xffffffff
00b01d7c	ldp x29,x30,[sp, #0x50]
00b01d80	ldp x20,x19,[sp, #0x40]
00b01d84	ldp x22,x21,[sp, #0x30]
00b01d88	add sp,sp,#0x60
00b01d8c	ret
00b01d90	mov x0,xzr
00b01d94	b 0x00b01d18
