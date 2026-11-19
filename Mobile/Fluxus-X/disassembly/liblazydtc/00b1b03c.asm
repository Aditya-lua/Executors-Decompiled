; X509_ATTRIBUTE_create @ 00b1b03c
00b1b03c	stp x22,x21,[sp, #-0x30]!
00b1b040	stp x20,x19,[sp, #0x10]
00b1b044	stp x29,x30,[sp, #0x20]
00b1b048	add x29,sp,#0x20
00b1b04c	mov x19,x2
00b1b050	mov w21,w1
00b1b054	bl 0x00c37740
00b1b058	cbz x0,0x00b1b0c0
00b1b05c	mov x22,x0
00b1b060	adrp x0,0xc81000
00b1b064	add x0,x0,#0xfd0
00b1b068	bl 0x00c372e0
00b1b06c	mov x20,x0
00b1b070	cbz x0,0x00b1b0c4
00b1b074	str x22,[x20]
00b1b078	bl 0x00c37a40
00b1b07c	mov x22,x0
00b1b080	cbz x0,0x00b1b0a8
00b1b084	ldr x0,[x20, #0x8]
00b1b088	mov x1,x22
00b1b08c	bl 0x00c347a0
00b1b090	cbz w0,0x00b1b0a8
00b1b094	mov x0,x22
00b1b098	mov w1,w21
00b1b09c	mov x2,x19
00b1b0a0	bl 0x00c37a60
00b1b0a4	b 0x00b1b0c4
00b1b0a8	adrp x1,0xc81000
00b1b0ac	add x1,x1,#0xfd0
00b1b0b0	mov x0,x20
00b1b0b4	bl 0x00c36160
00b1b0b8	mov x0,x22
00b1b0bc	bl 0x00c37cc0
00b1b0c0	mov x20,xzr
00b1b0c4	mov x0,x20
00b1b0c8	ldp x29,x30,[sp, #0x20]
00b1b0cc	ldp x20,x19,[sp, #0x10]
00b1b0d0	ldp x22,x21,[sp], #0x30
00b1b0d4	ret
