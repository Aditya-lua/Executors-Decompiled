; X509V3_EXT_CRL_add_conf @ 00af4d5c
00af4d5c	str x23,[sp, #-0x40]!
00af4d60	mov x23,x0
00af4d64	mov x0,xzr
00af4d68	stp x22,x21,[sp, #0x10]
00af4d6c	stp x20,x19,[sp, #0x20]
00af4d70	stp x29,x30,[sp, #0x30]
00af4d74	add x29,sp,#0x30
00af4d78	mov x22,x3
00af4d7c	mov x20,x2
00af4d80	mov x21,x1
00af4d84	bl 0x00c394e0
00af4d88	cbz x0,0x00af4dd0
00af4d8c	mov x1,x23
00af4d90	mov x19,x0
00af4d94	bl 0x00c39470
00af4d98	add x8,x22,#0x38
00af4d9c	cmp x22,#0x0
00af4da0	csel x3,xzr,x8,eq
00af4da4	mov x0,x19
00af4da8	mov x1,x21
00af4dac	mov x2,x20
00af4db0	bl 0x00af47a0
00af4db4	mov w20,w0
00af4db8	mov x0,x19
00af4dbc	mov x1,xzr
00af4dc0	bl 0x00c39470
00af4dc4	mov x0,x19
00af4dc8	bl 0x00c39480
00af4dcc	mov w0,w20
00af4dd0	ldp x29,x30,[sp, #0x30]
00af4dd4	ldp x20,x19,[sp, #0x20]
00af4dd8	ldp x22,x21,[sp, #0x10]
00af4ddc	ldr x23,[sp], #0x40
00af4de0	ret
