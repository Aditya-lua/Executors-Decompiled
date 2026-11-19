; X509V3_EXT_nconf_nid @ 00af404c
00af404c	str x25,[sp, #-0x50]!
00af4050	stp x22,x21,[sp, #0x20]
00af4054	mov x22,x0
00af4058	mov x0,x3
00af405c	stp x24,x23,[sp, #0x10]
00af4060	stp x20,x19,[sp, #0x30]
00af4064	stp x29,x30,[sp, #0x40]
00af4068	add x29,sp,#0x40
00af406c	mov x21,x3
00af4070	mov w20,w2
00af4074	mov x19,x1
00af4078	bl 0x00c2ff50
00af407c	cmp x0,#0x9
00af4080	b.cc 0x00af409c
00af4084	adrp x1,0x2a0000
00af4088	add x1,x1,#0xc8d
00af408c	mov w2,#0x9
00af4090	mov x0,x21
00af4094	bl 0x00c31bb0
00af4098	cbz w0,0x00af4120
00af409c	mov w23,wzr
00af40a0	mov x0,x21
00af40a4	bl 0x00c2ff50
00af40a8	cmp x0,#0x4
00af40ac	b.cc 0x00af40f4
00af40b0	adrp x1,0x2d6000
00af40b4	mov x24,x0
00af40b8	add x1,x1,#0x64b
00af40bc	mov w2,#0x4
00af40c0	mov x0,x21
00af40c4	mov w25,#0x4
00af40c8	bl 0x00c31bb0
00af40cc	cbz w0,0x00af413c
00af40d0	cmp x24,#0x5
00af40d4	b.cc 0x00af40f4
00af40d8	adrp x1,0x2a2000
00af40dc	add x1,x1,#0xd63
00af40e0	mov w2,#0x5
00af40e4	mov x0,x21
00af40e8	mov w25,#0x5
00af40ec	bl 0x00c31bb0
00af40f0	cbz w0,0x00af4144
00af40f4	mov x0,x22
00af40f8	mov x1,x19
00af40fc	mov w2,w20
00af4100	mov w3,w23
00af4104	mov x4,x21
00af4108	ldp x29,x30,[sp, #0x40]
00af410c	ldp x20,x19,[sp, #0x30]
00af4110	ldp x22,x21,[sp, #0x20]
00af4114	ldp x24,x23,[sp, #0x10]
00af4118	ldr x25,[sp], #0x50
00af411c	b 0x00af4350
00af4120	add x21,x21,#0x8
00af4124	ldrb w0,[x21, #0x1]!
00af4128	mov w1,#0x8
00af412c	bl 0x00c377c0
00af4130	cbnz w0,0x00af4124
00af4134	mov w23,#0x1
00af4138	b 0x00af40a0
00af413c	mov w22,#0x1
00af4140	b 0x00af4148
00af4144	mov w22,#0x2
00af4148	add x8,x21,x25
00af414c	sub x21,x8,#0x1
00af4150	ldrb w0,[x21, #0x1]!
00af4154	mov w1,#0x8
00af4158	bl 0x00c377c0
00af415c	cbnz w0,0x00af4150
00af4160	mov w0,w20
00af4164	bl 0x00c324f0
00af4168	mov x1,x21
00af416c	mov w2,w23
00af4170	mov w3,w22
00af4174	mov x4,x19
00af4178	ldp x29,x30,[sp, #0x40]
00af417c	ldp x20,x19,[sp, #0x30]
00af4180	ldp x22,x21,[sp, #0x20]
00af4184	ldp x24,x23,[sp, #0x10]
00af4188	ldr x25,[sp], #0x50
00af418c	b 0x00af4190
