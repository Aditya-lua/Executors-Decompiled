; FUN_00afe110 @ 00afe110
00afe110	sub sp,sp,#0xc0
00afe114	str x23,[sp, #0x80]
00afe118	stp x22,x21,[sp, #0x90]
00afe11c	stp x20,x19,[sp, #0xa0]
00afe120	stp x29,x30,[sp, #0xb0]
00afe124	add x29,sp,#0xb0
00afe128	cbz x0,0x00afe2bc
00afe12c	ldr x8,[x0]
00afe130	mov w21,w2
00afe134	mov x19,x1
00afe138	mov x20,x0
00afe13c	cbnz x8,0x00afe150
00afe140	ldr x8,[x20, #0x10]
00afe144	cbnz x8,0x00afe150
00afe148	ldr x8,[x20, #0x8]
00afe14c	cbz x8,0x00afe2b8
00afe150	adrp x1,0x2c2000
00afe154	adrp x3,0x2ab000
00afe158	add x1,x1,#0x523
00afe15c	add x3,x3,#0x32c
00afe160	mov x0,x19
00afe164	mov w2,w21
00afe168	bl 0x00c32250
00afe16c	cmp w0,#0x1
00afe170	b.lt 0x00afe2b8
00afe174	ldr x0,[x20]
00afe178	cbz x0,0x00afe200
00afe17c	bl 0x00c37750
00afe180	bl 0x00c34d80
00afe184	adrp x23,0x2ab000
00afe188	adrp x1,0x2da000
00afe18c	add x23,x23,#0x32c
00afe190	mov x22,x0
00afe194	add x1,x1,#0x6ed
00afe198	mov x0,x19
00afe19c	mov w2,w21
00afe1a0	mov x3,x23
00afe1a4	bl 0x00c32250
00afe1a8	cmp w0,#0x1
00afe1ac	b.lt 0x00afe2b8
00afe1b0	ldr x2,[x20]
00afe1b4	mov x0,sp
00afe1b8	mov w1,#0x80
00afe1bc	mov w3,#0x1
00afe1c0	bl 0x00c32500
00afe1c4	adrp x8,0x2b8000
00afe1c8	adrp x9,0x2b3000
00afe1cc	cmp x22,#0x0
00afe1d0	add x8,x8,#0x73b
00afe1d4	add x9,x9,#0x97b
00afe1d8	adrp x1,0x2c8000
00afe1dc	csel x2,x22,x23,ne
00afe1e0	csel x3,x8,x23,ne
00afe1e4	csel x5,x9,x23,ne
00afe1e8	add x1,x1,#0x3e3
00afe1ec	mov x4,sp
00afe1f0	mov x0,x19
00afe1f4	bl 0x00c32250
00afe1f8	cmp w0,#0x0
00afe1fc	b.le 0x00afe2b8
00afe200	ldr x8,[x20, #0x10]
00afe204	cbz x8,0x00afe258
00afe208	adrp x1,0x2ac000
00afe20c	adrp x3,0x2ab000
00afe210	add x1,x1,#0x84b
00afe214	add x3,x3,#0x32c
00afe218	mov x0,x19
00afe21c	mov w2,w21
00afe220	bl 0x00c32250
00afe224	cmp w0,#0x1
00afe228	b.lt 0x00afe2b8
00afe22c	ldr x1,[x20, #0x10]
00afe230	mov x0,x19
00afe234	bl 0x00c32150
00afe238	cmp w0,#0x1
00afe23c	b.lt 0x00afe2b8
00afe240	adrp x1,0x2c4000
00afe244	add x1,x1,#0xdae
00afe248	mov x0,x19
00afe24c	bl 0x00c32250
00afe250	cmp w0,#0x1
00afe254	b.lt 0x00afe2b8
00afe258	ldr x8,[x20, #0x8]
00afe25c	cbz x8,0x00afe2b0
00afe260	adrp x1,0x2a2000
00afe264	adrp x3,0x2ab000
00afe268	add x1,x1,#0xdc7
00afe26c	add x3,x3,#0x32c
00afe270	mov x0,x19
00afe274	mov w2,w21
00afe278	bl 0x00c32250
00afe27c	cmp w0,#0x1
00afe280	b.lt 0x00afe2b8
00afe284	ldr x1,[x20, #0x8]
00afe288	mov x0,x19
00afe28c	bl 0x00c32150
00afe290	cmp w0,#0x1
00afe294	b.lt 0x00afe2b8
00afe298	adrp x1,0x2c4000
00afe29c	add x1,x1,#0xdae
00afe2a0	mov x0,x19
00afe2a4	bl 0x00c32250
00afe2a8	cmp w0,#0x0
00afe2ac	b.le 0x00afe2b8
00afe2b0	mov w0,#0x1
00afe2b4	b 0x00afe2bc
00afe2b8	mov w0,wzr
00afe2bc	ldp x29,x30,[sp, #0xb0]
00afe2c0	ldp x20,x19,[sp, #0xa0]
00afe2c4	ldp x22,x21,[sp, #0x90]
00afe2c8	ldr x23,[sp, #0x80]
00afe2cc	add sp,sp,#0xc0
00afe2d0	ret
