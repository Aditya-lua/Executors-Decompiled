; CONF_parse_list @ 00a0cb88
00a0cb88	str x25,[sp, #-0x50]!
00a0cb8c	stp x24,x23,[sp, #0x10]
00a0cb90	stp x22,x21,[sp, #0x20]
00a0cb94	stp x20,x19,[sp, #0x30]
00a0cb98	stp x29,x30,[sp, #0x40]
00a0cb9c	add x29,sp,#0x40
00a0cba0	cbz x0,0x00a0cc64
00a0cba4	mov x19,x4
00a0cba8	mov x20,x3
00a0cbac	mov w21,w2
00a0cbb0	mov w22,w1
00a0cbb4	mov x23,x0
00a0cbb8	cbz w21,0x00a0cbd8
00a0cbbc	ldrb w8,[x23]
00a0cbc0	cbz w8,0x00a0cbd8
00a0cbc4	and w0,w8,#0xff
00a0cbc8	bl 0x00c33dc0
00a0cbcc	cbz w0,0x00a0cbd8
00a0cbd0	ldrb w8,[x23, #0x1]!
00a0cbd4	cbnz w8,0x00a0cbc4
00a0cbd8	mov x0,x23
00a0cbdc	mov w1,w22
00a0cbe0	bl 0x00c30890
00a0cbe4	mov x24,x0
00a0cbe8	cmp x0,x23
00a0cbec	b.eq 0x00a0cc08
00a0cbf0	ldrb w8,[x23]
00a0cbf4	cbz w8,0x00a0cc08
00a0cbf8	cbz x24,0x00a0cc14
00a0cbfc	sub x25,x24,#0x1
00a0cc00	cbnz w21,0x00a0cc28
00a0cc04	b 0x00a0cc38
00a0cc08	mov x0,xzr
00a0cc0c	mov w1,wzr
00a0cc10	b 0x00a0cc44
00a0cc14	mov x0,x23
00a0cc18	bl 0x00c2ff50
00a0cc1c	add x8,x23,x0
00a0cc20	sub x25,x8,#0x1
00a0cc24	cbz w21,0x00a0cc38
00a0cc28	add x25,x25,#0x1
00a0cc2c	ldrb w0,[x25, #-0x1]!
00a0cc30	bl 0x00c33dc0
00a0cc34	cbnz w0,0x00a0cc2c
00a0cc38	sub w8,w25,w23
00a0cc3c	add w1,w8,#0x1
00a0cc40	mov x0,x23
00a0cc44	mov x2,x19
00a0cc48	blr x20
00a0cc4c	cmp w0,#0x1
00a0cc50	b.lt 0x00a0cc94
00a0cc54	add x23,x24,#0x1
00a0cc58	cbnz x24,0x00a0cbb8
00a0cc5c	mov w0,#0x1
00a0cc60	b 0x00a0cc94
00a0cc64	bl 0x00c342a0
00a0cc68	adrp x0,0x2c9000
00a0cc6c	adrp x2,0x2a2000
00a0cc70	add x0,x0,#0x604
00a0cc74	add x2,x2,#0x1a7
00a0cc78	mov w1,#0x29d
00a0cc7c	bl 0x00c342b0
00a0cc80	orr w0,wzr,#0xe
00a0cc84	mov w1,#0x73
00a0cc88	mov x2,xzr
00a0cc8c	bl 0x00c342c0
00a0cc90	mov w0,wzr
00a0cc94	ldp x29,x30,[sp, #0x40]
00a0cc98	ldp x20,x19,[sp, #0x30]
00a0cc9c	ldp x22,x21,[sp, #0x20]
00a0cca0	ldp x24,x23,[sp, #0x10]
00a0cca4	ldr x25,[sp], #0x50
00a0cca8	ret
