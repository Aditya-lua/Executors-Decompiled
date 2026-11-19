; ossl_ffc_numbers_to_dh_named_group @ 00a7cae0
00a7cae0	str x23,[sp, #-0x40]!
00a7cae4	stp x20,x19,[sp, #0x20]
00a7cae8	adrp x19,0xc61000
00a7caec	stp x22,x21,[sp, #0x10]
00a7caf0	mov x20,x2
00a7caf4	mov x21,x1
00a7caf8	mov x22,x0
00a7cafc	mov x23,xzr
00a7cb00	add x19,x19,#0x108
00a7cb04	stp x29,x30,[sp, #0x30]
00a7cb08	add x29,sp,#0x30
00a7cb0c	ldr x1,[x19, #0x18]
00a7cb10	mov x0,x22
00a7cb14	bl 0x00c38cc0
00a7cb18	cbnz w0,0x00a7cb40
00a7cb1c	ldr x1,[x19, #0x28]
00a7cb20	mov x0,x20
00a7cb24	bl 0x00c38cc0
00a7cb28	cbnz w0,0x00a7cb40
00a7cb2c	cbz x21,0x00a7cb54
00a7cb30	ldr x1,[x19, #0x20]
00a7cb34	mov x0,x21
00a7cb38	bl 0x00c38cc0
00a7cb3c	cbz w0,0x00a7cb54
00a7cb40	add x23,x23,#0x1
00a7cb44	cmp x23,#0xe
00a7cb48	add x19,x19,#0x30
00a7cb4c	b.cc 0x00a7cb0c
00a7cb50	mov x19,xzr
00a7cb54	mov x0,x19
00a7cb58	ldp x29,x30,[sp, #0x30]
00a7cb5c	ldp x20,x19,[sp, #0x20]
00a7cb60	ldp x22,x21,[sp, #0x10]
00a7cb64	ldr x23,[sp], #0x40
00a7cb68	ret
