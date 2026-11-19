; ossl_rsa_fromdata @ 00acf068
00acf068	sub sp,sp,#0x60
00acf06c	stp x24,x23,[sp, #0x20]
00acf070	stp x22,x21,[sp, #0x30]
00acf074	stp x20,x19,[sp, #0x40]
00acf078	stp x29,x30,[sp, #0x50]
00acf07c	add x29,sp,#0x50
00acf080	stp xzr,xzr,[sp, #0x8]
00acf084	str xzr,[sp]
00acf088	cbz x0,0x00acf2bc
00acf08c	mov x21,x1
00acf090	adrp x1,0x2a5000
00acf094	mov x20,x0
00acf098	add x1,x1,#0x623
00acf09c	mov x0,x21
00acf0a0	mov w19,w2
00acf0a4	bl 0x00c36530
00acf0a8	adrp x1,0x2ab000
00acf0ac	mov x23,x0
00acf0b0	add x1,x1,#0x8a5
00acf0b4	mov x0,x21
00acf0b8	bl 0x00c36530
00acf0bc	mov x22,x0
00acf0c0	cbz w19,0x00acf0e0
00acf0c4	adrp x1,0x2cf000
00acf0c8	add x1,x1,#0xc20
00acf0cc	mov x0,x21
00acf0d0	bl 0x00c36530
00acf0d4	mov x19,x0
00acf0d8	cbnz x23,0x00acf0e8
00acf0dc	b 0x00acf0f8
00acf0e0	mov x19,xzr
00acf0e4	cbz x23,0x00acf0f8
00acf0e8	add x1,sp,#0x10
00acf0ec	mov x0,x23
00acf0f0	bl 0x00c39d50
00acf0f4	cbz w0,0x00acf268
00acf0f8	cbz x22,0x00acf10c
00acf0fc	add x1,sp,#0x8
00acf100	mov x0,x22
00acf104	bl 0x00c39d50
00acf108	cbz w0,0x00acf268
00acf10c	cbz x19,0x00acf120
00acf110	mov x1,sp
00acf114	mov x0,x19
00acf118	bl 0x00c39d50
00acf11c	cbz w0,0x00acf268
00acf120	ldp x19,x2,[sp]
00acf124	ldr x1,[sp, #0x10]
00acf128	mov x0,x20
00acf12c	mov x3,x19
00acf130	bl 0x00c3fcb0
00acf134	cbz w0,0x00acf268
00acf138	stp xzr,xzr,[sp]
00acf13c	str xzr,[sp, #0x10]
00acf140	cbz x19,0x00acf2d4
00acf144	bl 0x00c34780
00acf148	mov x19,x0
00acf14c	cbz x0,0x00acf26c
00acf150	adrp x8,0xcb5000
00acf154	ldr x8,[x8, #0x798]
00acf158	ldr x1,[x8]
00acf15c	cbz x1,0x00acf198
00acf160	add x22,x8,#0x8
00acf164	mov x0,x21
00acf168	bl 0x00c36530
00acf16c	cbz x0,0x00acf190
00acf170	add x1,sp,#0x18
00acf174	str xzr,[sp, #0x18]
00acf178	bl 0x00c39d50
00acf17c	cbz w0,0x00acf26c
00acf180	ldr x1,[sp, #0x18]
00acf184	mov x0,x19
00acf188	bl 0x00c347a0
00acf18c	cbz w0,0x00acf2fc
00acf190	ldr x1,[x22], #0x8
00acf194	cbnz x1,0x00acf164
00acf198	bl 0x00c34780
00acf19c	mov x22,x0
00acf1a0	cbz x0,0x00acf270
00acf1a4	adrp x8,0xcb5000
00acf1a8	ldr x8,[x8, #0x790]
00acf1ac	ldr x1,[x8]
00acf1b0	cbz x1,0x00acf1ec
00acf1b4	add x23,x8,#0x8
00acf1b8	mov x0,x21
00acf1bc	bl 0x00c36530
00acf1c0	cbz x0,0x00acf1e4
00acf1c4	add x1,sp,#0x18
00acf1c8	str xzr,[sp, #0x18]
00acf1cc	bl 0x00c39d50
00acf1d0	cbz w0,0x00acf270
00acf1d4	ldr x1,[sp, #0x18]
00acf1d8	mov x0,x22
00acf1dc	bl 0x00c347a0
00acf1e0	cbz w0,0x00acf308
00acf1e4	ldr x1,[x23], #0x8
00acf1e8	cbnz x1,0x00acf1b8
00acf1ec	bl 0x00c34780
00acf1f0	mov x23,x0
00acf1f4	cbz x0,0x00acf274
00acf1f8	adrp x8,0xcb5000
00acf1fc	ldr x8,[x8, #0x788]
00acf200	ldr x1,[x8]
00acf204	cbz x1,0x00acf240
00acf208	add x24,x8,#0x8
00acf20c	mov x0,x21
00acf210	bl 0x00c36530
00acf214	cbz x0,0x00acf238
00acf218	add x1,sp,#0x18
00acf21c	str xzr,[sp, #0x18]
00acf220	bl 0x00c39d50
00acf224	cbz w0,0x00acf274
00acf228	ldr x1,[sp, #0x18]
00acf22c	mov x0,x23
00acf230	bl 0x00c347a0
00acf234	cbz w0,0x00acf314
00acf238	ldr x1,[x24], #0x8
00acf23c	cbnz x1,0x00acf20c
00acf240	mov x0,x19
00acf244	bl 0x00c325e0
00acf248	cbz w0,0x00acf2dc
00acf24c	mov x0,x20
00acf250	mov x1,x19
00acf254	mov x2,x22
00acf258	mov x3,x23
00acf25c	bl 0x00c3fd40
00acf260	cbnz w0,0x00acf2dc
00acf264	b 0x00acf274
00acf268	mov x19,xzr
00acf26c	mov x22,xzr
00acf270	mov x23,xzr
00acf274	ldr x0,[sp, #0x10]
00acf278	bl 0x00c36290
00acf27c	ldr x0,[sp, #0x8]
00acf280	adrp x20,0xcb5000
00acf284	ldr x20,[x20, #0x1c8]
00acf288	bl 0x00c36290
00acf28c	ldr x0,[sp]
00acf290	bl 0x00c36290
00acf294	mov x0,x19
00acf298	mov x1,x20
00acf29c	bl 0x00c32600
00acf2a0	mov x0,x22
00acf2a4	mov x1,x20
00acf2a8	bl 0x00c32600
00acf2ac	mov x0,x23
00acf2b0	mov x1,x20
00acf2b4	bl 0x00c32600
00acf2b8	mov w0,wzr
00acf2bc	ldp x29,x30,[sp, #0x50]
00acf2c0	ldp x20,x19,[sp, #0x40]
00acf2c4	ldp x22,x21,[sp, #0x30]
00acf2c8	ldp x24,x23,[sp, #0x20]
00acf2cc	add sp,sp,#0x60
00acf2d0	ret
00acf2d4	mov x22,xzr
00acf2d8	mov x23,xzr
00acf2dc	mov x0,x19
00acf2e0	bl 0x00c34770
00acf2e4	mov x0,x22
00acf2e8	bl 0x00c34770
00acf2ec	mov x0,x23
00acf2f0	bl 0x00c34770
00acf2f4	mov w0,#0x1
00acf2f8	b 0x00acf2bc
00acf2fc	ldr x0,[sp, #0x18]
00acf300	bl 0x00c322e0
00acf304	b 0x00acf26c
00acf308	ldr x0,[sp, #0x18]
00acf30c	bl 0x00c322e0
00acf310	b 0x00acf270
00acf314	ldr x0,[sp, #0x18]
00acf318	bl 0x00c322e0
00acf31c	b 0x00acf274
