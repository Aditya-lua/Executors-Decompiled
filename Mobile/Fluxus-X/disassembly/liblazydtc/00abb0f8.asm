; PKCS12_pack_p7encdata_ex @ 00abb0f8
00abb0f8	sub sp,sp,#0x70
00abb0fc	stp x29,x30,[sp, #0x60]
00abb100	add x29,sp,#0x60
00abb104	stp x26,x25,[sp, #0x20]
00abb108	ldr x25,[x29, #0x10]
00abb10c	stp x24,x23,[sp, #0x30]
00abb110	stp x22,x21,[sp, #0x40]
00abb114	mov x24,x1
00abb118	mov w22,w0
00abb11c	mov x0,x7
00abb120	mov x1,x25
00abb124	stp x28,x27,[sp, #0x10]
00abb128	stp x20,x19,[sp, #0x50]
00abb12c	mov x21,x7
00abb130	mov x20,x6
00abb134	mov w27,w5
00abb138	mov w26,w4
00abb13c	mov x28,x3
00abb140	mov w23,w2
00abb144	bl 0x00c3f5a0
00abb148	mov x19,x0
00abb14c	cbz x0,0x00abb198
00abb150	mov w1,#0x1a
00abb154	mov x0,x19
00abb158	bl 0x00c3f5b0
00abb15c	cbz w0,0x00abb1cc
00abb160	str w23,[sp, #0x4]
00abb164	str x20,[sp, #0x8]
00abb168	bl 0x00c35250
00abb16c	mov w0,w22
00abb170	bl 0x00c324f0
00abb174	mov x1,x0
00abb178	mov x0,x21
00abb17c	mov x2,x25
00abb180	bl 0x00c35260
00abb184	mov x23,x0
00abb188	cbz x0,0x00abb200
00abb18c	bl 0x00c35240
00abb190	mov x20,x23
00abb194	b 0x00abb218
00abb198	bl 0x00c342a0
00abb19c	adrp x0,0x2c6000
00abb1a0	adrp x2,0x2be000
00abb1a4	add x0,x0,#0x176
00abb1a8	add x2,x2,#0x1ed
00abb1ac	mov w1,#0x67
00abb1b0	bl 0x00c342b0
00abb1b4	mov w1,#0x100
00abb1b8	mov w0,#0x23
00abb1bc	movk w1,#0xc, LSL #16
00abb1c0	mov x2,xzr
00abb1c4	bl 0x00c342c0
00abb1c8	b 0x00abb33c
00abb1cc	bl 0x00c342a0
00abb1d0	adrp x0,0x2c6000
00abb1d4	adrp x2,0x2be000
00abb1d8	add x0,x0,#0x176
00abb1dc	add x2,x2,#0x1ed
00abb1e0	mov w1,#0x6b
00abb1e4	bl 0x00c342b0
00abb1e8	mov w0,#0x23
00abb1ec	orr w1,wzr,#0x78
00abb1f0	mov x2,xzr
00abb1f4	bl 0x00c342c0
00abb1f8	mov x23,xzr
00abb1fc	b 0x00abb328
00abb200	mov w0,w22
00abb204	bl 0x00c324f0
00abb208	bl 0x00c35300
00abb20c	mov x20,x0
00abb210	bl 0x00c35240
00abb214	cbz x20,0x00abb2d8
00abb218	mov w5,#0xffffffff
00abb21c	mov x0,x20
00abb220	mov w1,w27
00abb224	mov x2,x28
00abb228	mov w3,w26
00abb22c	mov x4,xzr
00abb230	mov x6,x21
00abb234	bl 0x00c37e70
00abb238	mov x22,x0
00abb23c	cbz x0,0x00abb2f8
00abb240	ldr x8,[x19, #0x20]
00abb244	ldr x8,[x8, #0x8]
00abb248	ldr x0,[x8, #0x8]
00abb24c	bl 0x00c38240
00abb250	ldr x8,[x19, #0x20]
00abb254	ldr x8,[x8, #0x8]
00abb258	str x22,[x8, #0x8]
00abb25c	ldr x8,[x19, #0x20]
00abb260	ldr x8,[x8, #0x8]
00abb264	ldr x0,[x8, #0x10]
00abb268	bl 0x00c35530
00abb26c	bl 0x00c3f410
00abb270	ldr w3,[sp, #0x4]
00abb274	ldr x4,[sp, #0x8]
00abb278	mov x1,x0
00abb27c	mov w5,#0x1
00abb280	mov x0,x22
00abb284	mov x2,x24
00abb288	mov x6,x21
00abb28c	mov x7,x25
00abb290	bl 0x00c3f490
00abb294	ldr x8,[x19, #0x20]
00abb298	ldr x8,[x8, #0x8]
00abb29c	str x0,[x8, #0x10]
00abb2a0	cbz x0,0x00abb2b0
00abb2a4	mov x0,x23
00abb2a8	bl 0x00c357d0
00abb2ac	b 0x00abb33c
00abb2b0	bl 0x00c342a0
00abb2b4	adrp x0,0x2c6000
00abb2b8	adrp x2,0x2be000
00abb2bc	add x0,x0,#0x176
00abb2c0	add x2,x2,#0x1ed
00abb2c4	mov w1,#0x85
00abb2c8	bl 0x00c342b0
00abb2cc	mov w0,#0x23
00abb2d0	mov w1,#0x67
00abb2d4	b 0x00abb320
00abb2d8	mov w0,w22
00abb2dc	mov w1,w27
00abb2e0	mov x2,x28
00abb2e4	mov w3,w26
00abb2e8	mov x4,x21
00abb2ec	bl 0x00c37e10
00abb2f0	mov x22,x0
00abb2f4	cbnz x0,0x00abb240
00abb2f8	bl 0x00c342a0
00abb2fc	adrp x0,0x2c6000
00abb300	adrp x2,0x2be000
00abb304	add x0,x0,#0x176
00abb308	add x2,x2,#0x1ed
00abb30c	orr w1,wzr,#0x7c
00abb310	bl 0x00c342b0
00abb314	mov w1,#0x100
00abb318	mov w0,#0x23
00abb31c	movk w1,#0xc, LSL #16
00abb320	mov x2,xzr
00abb324	bl 0x00c342c0
00abb328	mov x0,x19
00abb32c	bl 0x00c3f560
00abb330	mov x0,x23
00abb334	bl 0x00c357d0
00abb338	mov x19,xzr
00abb33c	mov x0,x19
00abb340	ldp x29,x30,[sp, #0x60]
00abb344	ldp x20,x19,[sp, #0x50]
00abb348	ldp x22,x21,[sp, #0x40]
00abb34c	ldp x24,x23,[sp, #0x30]
00abb350	ldp x26,x25,[sp, #0x20]
00abb354	ldp x28,x27,[sp, #0x10]
00abb358	add sp,sp,#0x70
00abb35c	ret
