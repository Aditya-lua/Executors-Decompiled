; FUN_00b1c130 @ 00b1c130
00b1c130	sub sp,sp,#0x60
00b1c134	stp x24,x23,[sp, #0x20]
00b1c138	stp x22,x21,[sp, #0x30]
00b1c13c	stp x20,x19,[sp, #0x40]
00b1c140	stp x29,x30,[sp, #0x50]
00b1c144	ldr x22,[x1]
00b1c148	cmp x2,#0x100, LSL #12
00b1c14c	mov w8,#0x100000
00b1c150	adrp x3,0xc82000
00b1c154	mov x19,x1
00b1c158	mov x20,x0
00b1c15c	csel x2,x2,x8,lt
00b1c160	add x3,x3,#0x580
00b1c164	add x0,sp,#0x10
00b1c168	add x1,sp,#0x18
00b1c16c	add x29,sp,#0x50
00b1c170	stp xzr,xzr,[sp, #0x8]
00b1c174	str x22,[sp, #0x18]
00b1c178	bl 0x00c37f80
00b1c17c	cmp w0,#0x1
00b1c180	b.lt 0x00b1c32c
00b1c184	ldr x21,[x20]
00b1c188	cbz x21,0x00b1c1d0
00b1c18c	ldr x0,[x21, #0x10]
00b1c190	bl 0x00c35660
00b1c194	adrp x1,0xcb5000
00b1c198	ldr x0,[x21]
00b1c19c	ldr x1,[x1, #0x850]
00b1c1a0	bl 0x00c32600
00b1c1a4	ldr x0,[x21, #0x18]
00b1c1a8	adrp x23,0x2c6000
00b1c1ac	add x23,x23,#0x46b
00b1c1b0	mov w2,#0x7b
00b1c1b4	mov x1,x23
00b1c1b8	bl 0x00c32310
00b1c1bc	orr w2,wzr,#0x7c
00b1c1c0	mov x0,x21
00b1c1c4	mov x1,x23
00b1c1c8	bl 0x00c32310
00b1c1cc	str xzr,[x20]
00b1c1d0	add x0,sp,#0x8
00b1c1d4	mov x1,xzr
00b1c1d8	bl 0x00b1bfd8
00b1c1dc	ldr x21,[sp, #0x8]
00b1c1e0	cbz w0,0x00b1c2d0
00b1c1e4	ldr x8,[sp, #0x18]
00b1c1e8	ldr x0,[x21, #0x10]
00b1c1ec	sub x1,x8,x22
00b1c1f0	bl 0x00c37000
00b1c1f4	cbz x0,0x00b1c2d0
00b1c1f8	ldr x8,[x21, #0x10]
00b1c1fc	ldr x9,[sp, #0x18]
00b1c200	mov x1,x22
00b1c204	ldr x0,[x8, #0x8]
00b1c208	sub x2,x9,x22
00b1c20c	bl 0x00c2ffd0
00b1c210	ldr x0,[sp, #0x10]
00b1c214	bl 0x00c325e0
00b1c218	cmp w0,#0x1
00b1c21c	b.lt 0x00b1c29c
00b1c220	mov w22,wzr
00b1c224	ldr x0,[sp, #0x10]
00b1c228	mov w1,w22
00b1c22c	bl 0x00c32610
00b1c230	mov x23,x0
00b1c234	bl 0x00c325e0
00b1c238	cmp w0,#0x1
00b1c23c	b.lt 0x00b1c288
00b1c240	mov w24,wzr
00b1c244	mov x0,x23
00b1c248	mov w1,w24
00b1c24c	bl 0x00c32610
00b1c250	str w22,[x0, #0x10]
00b1c254	mov x1,x0
00b1c258	ldr x0,[x21]
00b1c25c	bl 0x00c347a0
00b1c260	cbz w0,0x00b1c2d4
00b1c264	mov x0,x23
00b1c268	mov w1,w24
00b1c26c	mov x2,xzr
00b1c270	bl 0x00c38080
00b1c274	mov x0,x23
00b1c278	add w24,w24,#0x1
00b1c27c	bl 0x00c325e0
00b1c280	cmp w24,w0
00b1c284	b.lt 0x00b1c244
00b1c288	ldr x0,[sp, #0x10]
00b1c28c	add w22,w22,#0x1
00b1c290	bl 0x00c325e0
00b1c294	cmp w22,w0
00b1c298	b.lt 0x00b1c224
00b1c29c	mov x0,x21
00b1c2a0	bl 0x00b1c55c
00b1c2a4	cbz w0,0x00b1c2d0
00b1c2a8	mov w23,w0
00b1c2ac	ldr x0,[sp, #0x10]
00b1c2b0	adrp x1,0xb1c000
00b1c2b4	add x1,x1,#0x9e0
00b1c2b8	bl 0x00c32600
00b1c2bc	str wzr,[x21, #0x8]
00b1c2c0	str x21,[x20]
00b1c2c4	ldr x8,[sp, #0x18]
00b1c2c8	str x8,[x19]
00b1c2cc	b 0x00b1c330
00b1c2d0	cbz x21,0x00b1c2e4
00b1c2d4	adrp x1,0xc82000
00b1c2d8	add x1,x1,#0x4b0
00b1c2dc	mov x0,x21
00b1c2e0	bl 0x00c36160
00b1c2e4	ldr x0,[sp, #0x10]
00b1c2e8	adrp x1,0xb1c000
00b1c2ec	add x1,x1,#0x9e4
00b1c2f0	bl 0x00c32600
00b1c2f4	bl 0x00c342a0
00b1c2f8	adrp x0,0x2c6000
00b1c2fc	adrp x2,0x2b2000
00b1c300	add x0,x0,#0x46b
00b1c304	add x2,x2,#0xe66
00b1c308	mov w1,#0xcf
00b1c30c	bl 0x00c342b0
00b1c310	mov w1,#0x10a
00b1c314	mov w0,#0xd
00b1c318	movk w1,#0x8, LSL #16
00b1c31c	mov x2,xzr
00b1c320	bl 0x00c342c0
00b1c324	mov w23,wzr
00b1c328	b 0x00b1c330
00b1c32c	mov w23,w0
00b1c330	mov w0,w23
00b1c334	ldp x29,x30,[sp, #0x50]
00b1c338	ldp x20,x19,[sp, #0x40]
00b1c33c	ldp x22,x21,[sp, #0x30]
00b1c340	ldp x24,x23,[sp, #0x20]
00b1c344	add sp,sp,#0x60
00b1c348	ret
