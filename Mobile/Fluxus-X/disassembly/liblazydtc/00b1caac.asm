; X509_PUBKEY_new_ex @ 00b1caac
00b1caac	str x21,[sp, #-0x30]!
00b1cab0	stp x20,x19,[sp, #0x10]
00b1cab4	mov x20,x1
00b1cab8	mov x21,x0
00b1cabc	adrp x0,0xc82000
00b1cac0	add x0,x0,#0x640
00b1cac4	mov x1,x21
00b1cac8	mov x2,x20
00b1cacc	stp x29,x30,[sp, #0x20]
00b1cad0	add x29,sp,#0x20
00b1cad4	bl 0x00c380f0
00b1cad8	mov x19,x0
00b1cadc	cbz x0,0x00b1cb30
00b1cae0	ldr x0,[x19, #0x20]
00b1cae4	adrp x1,0x2bc000
00b1cae8	add x1,x1,#0x79f
00b1caec	mov w2,#0x34
00b1caf0	str x21,[x19, #0x18]
00b1caf4	bl 0x00c32310
00b1caf8	str xzr,[x19, #0x20]
00b1cafc	cbz x20,0x00b1cb30
00b1cb00	adrp x1,0x2bc000
00b1cb04	add x1,x1,#0x79f
00b1cb08	mov w2,#0x37
00b1cb0c	mov x0,x20
00b1cb10	bl 0x00c34600
00b1cb14	str x0,[x19, #0x20]
00b1cb18	cbnz x0,0x00b1cb30
00b1cb1c	adrp x1,0xc82000
00b1cb20	add x1,x1,#0x640
00b1cb24	mov x0,x19
00b1cb28	bl 0x00c36160
00b1cb2c	mov x19,xzr
00b1cb30	mov x0,x19
00b1cb34	ldp x29,x30,[sp, #0x20]
00b1cb38	ldp x20,x19,[sp, #0x10]
00b1cb3c	ldr x21,[sp], #0x30
00b1cb40	ret
