; PKCS12_pack_p7data @ 00abaf58
00abaf58	str x21,[sp, #-0x30]!
00abaf5c	stp x20,x19,[sp, #0x10]
00abaf60	stp x29,x30,[sp, #0x20]
00abaf64	add x29,sp,#0x20
00abaf68	mov x20,x0
00abaf6c	bl 0x00c3f590
00abaf70	mov x19,x0
00abaf74	cbz x0,0x00abafd4
00abaf78	mov w0,#0x15
00abaf7c	bl 0x00c37740
00abaf80	str x0,[x19, #0x18]
00abaf84	bl 0x00c38170
00abaf88	str x0,[x19, #0x20]
00abaf8c	cbz x0,0x00abb008
00abaf90	add x21,x19,#0x20
00abaf94	bl 0x00c3f410
00abaf98	mov x1,x0
00abaf9c	mov x0,x20
00abafa0	mov x2,x21
00abafa4	bl 0x00c37a90
00abafa8	cbnz x0,0x00abb044
00abafac	bl 0x00c342a0
00abafb0	adrp x0,0x2c6000
00abafb4	adrp x2,0x2b2000
00abafb8	add x0,x0,#0x176
00abafbc	add x2,x2,#0x989
00abafc0	mov w1,#0x40
00abafc4	bl 0x00c342b0
00abafc8	mov w0,#0x23
00abafcc	mov w1,#0x64
00abafd0	b 0x00abb030
00abafd4	bl 0x00c342a0
00abafd8	adrp x0,0x2c6000
00abafdc	adrp x2,0x2b2000
00abafe0	add x0,x0,#0x176
00abafe4	add x2,x2,#0x989
00abafe8	mov w1,#0x36
00abafec	bl 0x00c342b0
00abaff0	mov w1,#0x100
00abaff4	mov w0,#0x23
00abaff8	movk w1,#0xc, LSL #16
00abaffc	mov x2,xzr
00abb000	bl 0x00c342c0
00abb004	b 0x00abb044
00abb008	bl 0x00c342a0
00abb00c	adrp x0,0x2c6000
00abb010	adrp x2,0x2b2000
00abb014	add x0,x0,#0x176
00abb018	add x2,x2,#0x989
00abb01c	mov w1,#0x3b
00abb020	bl 0x00c342b0
00abb024	mov w1,#0x100
00abb028	mov w0,#0x23
00abb02c	movk w1,#0xc, LSL #16
00abb030	mov x2,xzr
00abb034	bl 0x00c342c0
00abb038	mov x0,x19
00abb03c	bl 0x00c3f560
00abb040	mov x19,xzr
00abb044	mov x0,x19
00abb048	ldp x29,x30,[sp, #0x20]
00abb04c	ldp x20,x19,[sp, #0x10]
00abb050	ldr x21,[sp], #0x30
00abb054	ret
