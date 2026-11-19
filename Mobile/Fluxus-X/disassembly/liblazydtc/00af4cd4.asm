; X509V3_EXT_add_conf @ 00af4cd4
00af4cd4	str x23,[sp, #-0x40]!
00af4cd8	mov x23,x0
00af4cdc	mov x0,xzr
00af4ce0	stp x22,x21,[sp, #0x10]
00af4ce4	stp x20,x19,[sp, #0x20]
00af4ce8	stp x29,x30,[sp, #0x30]
00af4cec	add x29,sp,#0x30
00af4cf0	mov x22,x3
00af4cf4	mov x20,x2
00af4cf8	mov x21,x1
00af4cfc	bl 0x00c394e0
00af4d00	cbz x0,0x00af4d48
00af4d04	mov x1,x23
00af4d08	mov x19,x0
00af4d0c	bl 0x00c39470
00af4d10	add x8,x22,#0x68
00af4d14	cmp x22,#0x0
00af4d18	csel x3,xzr,x8,eq
00af4d1c	mov x0,x19
00af4d20	mov x1,x21
00af4d24	mov x2,x20
00af4d28	bl 0x00af47a0
00af4d2c	mov w20,w0
00af4d30	mov x0,x19
00af4d34	mov x1,xzr
00af4d38	bl 0x00c39470
00af4d3c	mov x0,x19
00af4d40	bl 0x00c39480
00af4d44	mov w0,w20
00af4d48	ldp x29,x30,[sp, #0x30]
00af4d4c	ldp x20,x19,[sp, #0x20]
00af4d50	ldp x22,x21,[sp, #0x10]
00af4d54	ldr x23,[sp], #0x40
00af4d58	ret
