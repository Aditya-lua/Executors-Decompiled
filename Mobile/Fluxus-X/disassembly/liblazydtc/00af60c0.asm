; X509v3_addr_add_prefix @ 00af60c0
00af60c0	sub sp,sp,#0x40
00af60c4	stp x22,x21,[sp, #0x10]
00af60c8	stp x20,x19,[sp, #0x20]
00af60cc	stp x29,x30,[sp, #0x30]
00af60d0	add x29,sp,#0x30
00af60d4	mov w19,w4
00af60d8	mov x21,x3
00af60dc	mov w22,w1
00af60e0	bl 0x00af615c
00af60e4	cbz x0,0x00af6148
00af60e8	cmp w22,#0x2
00af60ec	cset w8,eq
00af60f0	cmp w22,#0x1
00af60f4	lsl w8,w8,#0x4
00af60f8	mov w9,#0x4
00af60fc	mov x20,x0
00af6100	csel w3,w9,w8,eq
00af6104	add x0,sp,#0x8
00af6108	mov x1,x21
00af610c	mov w2,w19
00af6110	bl 0x00af6210
00af6114	cbz w0,0x00af6148
00af6118	ldr x19,[sp, #0x8]
00af611c	mov x0,x20
00af6120	mov x1,x19
00af6124	bl 0x00c347a0
00af6128	cbz w0,0x00af6134
00af612c	mov w0,#0x1
00af6130	b 0x00af6148
00af6134	adrp x1,0xc7e000
00af6138	add x1,x1,#0x788
00af613c	mov x0,x19
00af6140	bl 0x00c36160
00af6144	mov w0,wzr
00af6148	ldp x29,x30,[sp, #0x30]
00af614c	ldp x20,x19,[sp, #0x20]
00af6150	ldp x22,x21,[sp, #0x10]
00af6154	add sp,sp,#0x40
00af6158	ret
