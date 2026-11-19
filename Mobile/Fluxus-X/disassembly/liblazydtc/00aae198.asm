; OBJ_obj2nid @ 00aae198
00aae198	sub sp,sp,#0x30
00aae19c	stp x29,x30,[sp, #0x20]
00aae1a0	add x29,sp,#0x20
00aae1a4	str x19,[sp, #0x10]
00aae1a8	stur x0,[x29, #-0x8]
00aae1ac	cbz x0,0x00aae240
00aae1b0	mov x19,x0
00aae1b4	ldr w0,[x0, #0x10]
00aae1b8	cbnz w0,0x00aae240
00aae1bc	ldr w8,[x19, #0x14]
00aae1c0	cbz w8,0x00aae1f8
00aae1c4	mov w0,#0x40
00aae1c8	mov x1,xzr
00aae1cc	bl 0x00c35500
00aae1d0	adrp x8,0xd22000
00aae1d4	ldr x0,[x8, #0x188]
00aae1d8	cbz x0,0x00aae200
00aae1dc	mov x1,sp
00aae1e0	str wzr,[sp]
00aae1e4	str x19,[sp, #0x8]
00aae1e8	bl 0x00c34de0
00aae1ec	cbz x0,0x00aae200
00aae1f0	ldr x8,[x0, #0x8]
00aae1f4	b 0x00aae23c
00aae1f8	mov w0,wzr
00aae1fc	b 0x00aae240
00aae200	adrp x1,0x76e000
00aae204	adrp x4,0xaaf000
00aae208	add x1,x1,#0xa44
00aae20c	add x4,x4,#0x34
00aae210	sub x0,x29,#0x8
00aae214	mov w2,#0x456
00aae218	mov w3,#0x4
00aae21c	mov w5,wzr
00aae220	bl 0x00c3de50
00aae224	cbz x0,0x00aae240
00aae228	ldr w8,[x0]
00aae22c	adrp x10,0xc6d000
00aae230	mov w9,#0x28
00aae234	add x10,x10,#0xa58
00aae238	madd x8,x8,x9,x10
00aae23c	ldr w0,[x8, #0x10]
00aae240	ldp x29,x30,[sp, #0x20]
00aae244	ldr x19,[sp, #0x10]
00aae248	add sp,sp,#0x30
00aae24c	ret
