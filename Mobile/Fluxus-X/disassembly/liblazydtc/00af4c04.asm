; X509V3_EXT_conf_nid @ 00af4c04
00af4c04	str x23,[sp, #-0x40]!
00af4c08	mov x23,x0
00af4c0c	mov x0,xzr
00af4c10	stp x22,x21,[sp, #0x10]
00af4c14	stp x20,x19,[sp, #0x20]
00af4c18	stp x29,x30,[sp, #0x30]
00af4c1c	add x29,sp,#0x30
00af4c20	mov x20,x3
00af4c24	mov w21,w2
00af4c28	mov x22,x1
00af4c2c	bl 0x00c394e0
00af4c30	cbz x0,0x00af4c70
00af4c34	mov x1,x23
00af4c38	mov x19,x0
00af4c3c	bl 0x00c39470
00af4c40	mov x0,x19
00af4c44	mov x1,x22
00af4c48	mov w2,w21
00af4c4c	mov x3,x20
00af4c50	bl 0x00af404c
00af4c54	mov x20,x0
00af4c58	mov x0,x19
00af4c5c	mov x1,xzr
00af4c60	bl 0x00c39470
00af4c64	mov x0,x19
00af4c68	bl 0x00c39480
00af4c6c	mov x0,x20
00af4c70	ldp x29,x30,[sp, #0x30]
00af4c74	ldp x20,x19,[sp, #0x20]
00af4c78	ldp x22,x21,[sp, #0x10]
00af4c7c	ldr x23,[sp], #0x40
00af4c80	ret
