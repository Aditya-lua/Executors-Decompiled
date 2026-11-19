; X509_CRL_load_http @ 00b15bc8
00b15bc8	sub sp,sp,#0x70
00b15bcc	str x23,[sp, #0x30]
00b15bd0	stp x22,x21,[sp, #0x40]
00b15bd4	stp x20,x19,[sp, #0x50]
00b15bd8	stp x29,x30,[sp, #0x60]
00b15bdc	add x29,sp,#0x60
00b15be0	mov w19,w3
00b15be4	mov x20,x2
00b15be8	mov x21,x1
00b15bec	mov x22,x0
00b15bf0	bl 0x00c3f5f0
00b15bf4	mov w8,#0x9000
00b15bf8	mov x23,x0
00b15bfc	movk w8,#0x1, LSL #16
00b15c00	mov w9,#0x1
00b15c04	mov w7,#0x400
00b15c08	mov x0,x22
00b15c0c	mov x1,xzr
00b15c10	mov x2,xzr
00b15c14	mov x3,x21
00b15c18	mov x4,x20
00b15c1c	mov x5,xzr
00b15c20	mov x6,xzr
00b15c24	stp xzr,xzr,[sp]
00b15c28	str w19,[sp, #0x20]
00b15c2c	str x8,[sp, #0x18]
00b15c30	str w9,[sp, #0x10]
00b15c34	bl 0x00c3dd60
00b15c38	mov x19,x0
00b15c3c	mov x0,x23
00b15c40	mov x1,x19
00b15c44	mov x2,xzr
00b15c48	bl 0x00c37420
00b15c4c	mov x20,x0
00b15c50	mov x0,x19
00b15c54	bl 0x00c31a40
00b15c58	mov x0,x20
00b15c5c	ldp x29,x30,[sp, #0x60]
00b15c60	ldp x20,x19,[sp, #0x50]
00b15c64	ldp x22,x21,[sp, #0x40]
00b15c68	ldr x23,[sp, #0x30]
00b15c6c	add sp,sp,#0x70
00b15c70	ret
