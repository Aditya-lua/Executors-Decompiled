; SSL_load_client_CA_file_ex @ 009ad118
009ad118	str x23,[sp, #-0x40]!
009ad11c	stp x22,x21,[sp, #0x10]
009ad120	stp x20,x19,[sp, #0x20]
009ad124	stp x29,x30,[sp, #0x30]
009ad128	add x29,sp,#0x30
009ad12c	mov x23,x2
009ad130	mov x21,x1
009ad134	mov x22,x0
009ad138	bl 0x00c32270
009ad13c	bl 0x00c32240
009ad140	mov x19,x0
009ad144	adrp x0,0x9ad000
009ad148	adrp x1,0x9ad000
009ad14c	add x0,x0,#0x334
009ad150	add x1,x1,#0x344
009ad154	str xzr,[sp, #0x8]
009ad158	bl 0x00c34dd0
009ad15c	mov x20,x0
009ad160	cbz x19,0x009ad244
009ad164	cbz x20,0x009ad244
009ad168	mov x0,x21
009ad16c	mov x1,x23
009ad170	bl 0x00c350a0
009ad174	str x0,[sp, #0x8]
009ad178	cbz x0,0x009ad260
009ad17c	mov w1,#0x6c
009ad180	orr w2,wzr,#0x3
009ad184	mov x0,x19
009ad188	mov x3,x22
009ad18c	bl 0x00c321a0
009ad190	cmp w0,#0x1
009ad194	b.lt 0x009ad290
009ad198	mov x0,x21
009ad19c	bl 0x00c34e10
009ad1a0	mov x21,x0
009ad1a4	add x1,sp,#0x8
009ad1a8	mov x0,x19
009ad1ac	mov x2,xzr
009ad1b0	mov x3,xzr
009ad1b4	bl 0x00c31a60
009ad1b8	cbz x0,0x009ad2b4
009ad1bc	mov x23,xzr
009ad1c0	mov x22,xzr
009ad1c4	cbnz x22,0x009ad1d4
009ad1c8	bl 0x00c34780
009ad1cc	mov x22,x0
009ad1d0	cbz x0,0x009ad300
009ad1d4	ldr x0,[sp, #0x8]
009ad1d8	bl 0x00c32d20
009ad1dc	cbz x0,0x009ad2f8
009ad1e0	bl 0x00c34f50
009ad1e4	mov x23,x0
009ad1e8	cbz x0,0x009ad29c
009ad1ec	mov x0,x20
009ad1f0	mov x1,x23
009ad1f4	bl 0x00c34de0
009ad1f8	cbz x0,0x009ad20c
009ad1fc	mov x0,x23
009ad200	bl 0x00c34810
009ad204	mov x23,xzr
009ad208	b 0x009ad228
009ad20c	mov x0,x20
009ad210	mov x1,x23
009ad214	bl 0x00c34dc0
009ad218	mov x0,x22
009ad21c	mov x1,x23
009ad220	bl 0x00c347a0
009ad224	cbz w0,0x009ad29c
009ad228	add x1,sp,#0x8
009ad22c	mov x0,x19
009ad230	mov x2,xzr
009ad234	mov x3,xzr
009ad238	bl 0x00c31a60
009ad23c	cbnz x0,0x009ad1c4
009ad240	b 0x009ad2b8
009ad244	bl 0x00c342a0
009ad248	adrp x0,0x2d5000
009ad24c	adrp x2,0x2b7000
009ad250	add x0,x0,#0x6b3
009ad254	add x2,x2,#0x5e8
009ad258	mov w1,#0x280
009ad25c	b 0x009ad278
009ad260	bl 0x00c342a0
009ad264	adrp x0,0x2d5000
009ad268	adrp x2,0x2b7000
009ad26c	add x0,x0,#0x6b3
009ad270	add x2,x2,#0x5e8
009ad274	mov w1,#0x286
009ad278	bl 0x00c342b0
009ad27c	mov w1,#0x100
009ad280	mov w0,#0x14
009ad284	movk w1,#0xc, LSL #16
009ad288	mov x2,xzr
009ad28c	bl 0x00c342c0
009ad290	mov x22,xzr
009ad294	mov x23,xzr
009ad298	mov x21,xzr
009ad29c	mov x0,x23
009ad2a0	bl 0x00c34810
009ad2a4	adrp x1,0xcb5000
009ad2a8	ldr x1,[x1, #0x140]
009ad2ac	mov x0,x22
009ad2b0	bl 0x00c32600
009ad2b4	mov x22,xzr
009ad2b8	mov x0,x21
009ad2bc	bl 0x00c34e10
009ad2c0	mov x0,x19
009ad2c4	bl 0x00c31a40
009ad2c8	ldr x0,[sp, #0x8]
009ad2cc	bl 0x00c31a90
009ad2d0	mov x0,x20
009ad2d4	bl 0x00c34db0
009ad2d8	cbz x22,0x009ad2e0
009ad2dc	bl 0x00c323e0
009ad2e0	mov x0,x22
009ad2e4	ldp x29,x30,[sp, #0x30]
009ad2e8	ldp x20,x19,[sp, #0x20]
009ad2ec	ldp x22,x21,[sp, #0x10]
009ad2f0	ldr x23,[sp], #0x40
009ad2f4	ret
009ad2f8	mov x23,xzr
009ad2fc	b 0x009ad29c
009ad300	bl 0x00c342a0
009ad304	adrp x0,0x2d5000
009ad308	adrp x2,0x2b7000
009ad30c	add x0,x0,#0x6b3
009ad310	add x2,x2,#0x5e8
009ad314	mov w1,#0x294
009ad318	bl 0x00c342b0
009ad31c	mov w1,#0x100
009ad320	mov w0,#0x14
009ad324	movk w1,#0xc, LSL #16
009ad328	mov x2,xzr
009ad32c	bl 0x00c342c0
009ad330	b 0x009ad29c
