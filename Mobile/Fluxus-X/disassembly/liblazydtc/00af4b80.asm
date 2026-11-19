; X509V3_EXT_conf @ 00af4b80
00af4b80	str x23,[sp, #-0x40]!
00af4b84	mov x23,x0
00af4b88	mov x0,xzr
00af4b8c	stp x22,x21,[sp, #0x10]
00af4b90	stp x20,x19,[sp, #0x20]
00af4b94	stp x29,x30,[sp, #0x30]
00af4b98	add x29,sp,#0x30
00af4b9c	mov x20,x3
00af4ba0	mov x21,x2
00af4ba4	mov x22,x1
00af4ba8	bl 0x00c394e0
00af4bac	cbz x0,0x00af4bf0
00af4bb0	mov x1,x23
00af4bb4	mov x19,x0
00af4bb8	bl 0x00c39470
00af4bbc	mov x0,x19
00af4bc0	mov x1,x22
00af4bc4	mov x2,xzr
00af4bc8	mov x3,x21
00af4bcc	mov x4,x20
00af4bd0	bl 0x00af3e8c
00af4bd4	mov x20,x0
00af4bd8	mov x0,x19
00af4bdc	mov x1,xzr
00af4be0	bl 0x00c39470
00af4be4	mov x0,x19
00af4be8	bl 0x00c39480
00af4bec	mov x0,x20
00af4bf0	ldp x29,x30,[sp, #0x30]
00af4bf4	ldp x20,x19,[sp, #0x20]
00af4bf8	ldp x22,x21,[sp, #0x10]
00af4bfc	ldr x23,[sp], #0x40
00af4c00	ret
