; ASN1_item_d2i_bio_ex @ 00abdbec
00abdbec	sub sp,sp,#0x50
00abdbf0	stp x23,xzr,[sp, #0x10]
00abdbf4	stp x22,x21,[sp, #0x20]
00abdbf8	stp x20,x19,[sp, #0x30]
00abdbfc	stp x29,x30,[sp, #0x40]
00abdc00	add x29,sp,#0x40
00abdc04	cbz x1,0x00abdc5c
00abdc08	mov x8,x1
00abdc0c	mov x23,x0
00abdc10	add x1,sp,#0x18
00abdc14	mov x0,x8
00abdc18	mov x19,x4
00abdc1c	mov x20,x3
00abdc20	mov x22,x2
00abdc24	bl 0x00abd860
00abdc28	ldr x21,[sp, #0x18]
00abdc2c	tbnz w0,#0x1f,0x00abdc64
00abdc30	ldr x8,[x21, #0x8]
00abdc34	sxtw x2,w0
00abdc38	add x1,sp,#0x8
00abdc3c	mov x0,x22
00abdc40	mov x3,x23
00abdc44	mov x4,x20
00abdc48	mov x5,x19
00abdc4c	str x8,[sp, #0x8]
00abdc50	bl 0x00c37a00
00abdc54	mov x19,x0
00abdc58	b 0x00abdc68
00abdc5c	mov x19,xzr
00abdc60	b 0x00abdc70
00abdc64	mov x19,xzr
00abdc68	mov x0,x21
00abdc6c	bl 0x00c35660
00abdc70	mov x0,x19
00abdc74	ldp x29,x30,[sp, #0x40]
00abdc78	ldp x20,x19,[sp, #0x30]
00abdc7c	ldp x22,x21,[sp, #0x20]
00abdc80	ldr x23,[sp, #0x10]
00abdc84	add sp,sp,#0x50
00abdc88	ret
