; PKCS12_item_pack_safebag @ 00abae44
00abae44	str x23,[sp, #-0x40]!
00abae48	stp x22,x21,[sp, #0x10]
00abae4c	stp x20,x19,[sp, #0x20]
00abae50	stp x29,x30,[sp, #0x30]
00abae54	add x29,sp,#0x30
00abae58	mov w20,w3
00abae5c	mov w23,w2
00abae60	mov x21,x1
00abae64	mov x22,x0
00abae68	bl 0x00c3f3e0
00abae6c	cbz x0,0x00abaeb4
00abae70	mov x19,x0
00abae74	mov w0,w23
00abae78	bl 0x00c37740
00abae7c	mov x2,x19
00abae80	str x0,[x2], #0x8
00abae84	mov x0,x22
00abae88	mov x1,x21
00abae8c	bl 0x00c37a90
00abae90	cbz x0,0x00abaee8
00abae94	bl 0x00c3f420
00abae98	cbz x0,0x00abaf04
00abae9c	mov x21,x0
00abaea0	str x19,[x0, #0x8]
00abaea4	mov w0,w20
00abaea8	bl 0x00c37740
00abaeac	str x0,[x21]
00abaeb0	b 0x00abaf40
00abaeb4	bl 0x00c342a0
00abaeb8	adrp x0,0x2c6000
00abaebc	adrp x2,0x2ba000
00abaec0	add x0,x0,#0x176
00abaec4	add x2,x2,#0x641
00abaec8	mov w1,#0x1b
00abaecc	bl 0x00c342b0
00abaed0	mov w1,#0x100
00abaed4	mov w0,#0x23
00abaed8	movk w1,#0xc, LSL #16
00abaedc	mov x2,xzr
00abaee0	bl 0x00c342c0
00abaee4	b 0x00abaf3c
00abaee8	bl 0x00c342a0
00abaeec	adrp x0,0x2c6000
00abaef0	adrp x2,0x2ba000
00abaef4	add x0,x0,#0x176
00abaef8	add x2,x2,#0x641
00abaefc	mov w1,#0x20
00abaf00	b 0x00abaf1c
00abaf04	bl 0x00c342a0
00abaf08	adrp x0,0x2c6000
00abaf0c	adrp x2,0x2ba000
00abaf10	add x0,x0,#0x176
00abaf14	add x2,x2,#0x641
00abaf18	mov w1,#0x24
00abaf1c	bl 0x00c342b0
00abaf20	mov w1,#0x100
00abaf24	mov w0,#0x23
00abaf28	movk w1,#0xc, LSL #16
00abaf2c	mov x2,xzr
00abaf30	bl 0x00c342c0
00abaf34	mov x0,x19
00abaf38	bl 0x00c3f3d0
00abaf3c	mov x21,xzr
00abaf40	mov x0,x21
00abaf44	ldp x29,x30,[sp, #0x30]
00abaf48	ldp x20,x19,[sp, #0x20]
00abaf4c	ldp x22,x21,[sp, #0x10]
00abaf50	ldr x23,[sp], #0x40
00abaf54	ret
