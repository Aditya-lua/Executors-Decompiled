; FUN_00b4c140 @ 00b4c140
00b4c140	stp x24,x23,[sp, #-0x40]!
00b4c144	stp x22,x21,[sp, #0x10]
00b4c148	stp x20,x19,[sp, #0x20]
00b4c14c	stp x29,x30,[sp, #0x30]
00b4c150	add x29,sp,#0x30
00b4c154	mov x22,x2
00b4c158	mov x23,x1
00b4c15c	mov x20,x0
00b4c160	bl 0x00c41000
00b4c164	mov x19,xzr
00b4c168	cbz x20,0x00b4c398
00b4c16c	cbz w0,0x00b4c398
00b4c170	ldr w1,[x20, #0x14]
00b4c174	cbz w1,0x00b4c1cc
00b4c178	orr w8,wzr,#0x3
00b4c17c	str w8,[x20, #0x3c]
00b4c180	ldr x8,[x20, #0x8]
00b4c184	cbnz x8,0x00b4c1e0
00b4c188	cbnz w1,0x00b4c1a0
00b4c18c	ldr w0,[x20, #0x18]
00b4c190	bl 0x00c39ec0
00b4c194	mov w1,w0
00b4c198	str w0,[x20, #0x14]
00b4c19c	cbz w0,0x00b4c2e8
00b4c1a0	ldr x0,[x20]
00b4c1a4	bl 0x00c39ef0
00b4c1a8	mov x19,x0
00b4c1ac	cbz x0,0x00b4c398
00b4c1b0	mov x0,x19
00b4c1b4	bl 0x00c39d70
00b4c1b8	mov x21,x0
00b4c1bc	mov w23,wzr
00b4c1c0	mov x22,xzr
00b4c1c4	add x24,x20,#0x10
00b4c1c8	b 0x00b4c314
00b4c1cc	ldr w8,[x20, #0x3c]
00b4c1d0	cmp w8,#0x3
00b4c1d4	b.ne 0x00b4c1e0
00b4c1d8	ldr x8,[x20, #0x8]
00b4c1dc	cbz x8,0x00b4c188
00b4c1e0	ldr x0,[x20]
00b4c1e4	bl 0x00c39c50
00b4c1e8	mov x19,x0
00b4c1ec	cbz x0,0x00b4c398
00b4c1f0	mov x0,x19
00b4c1f4	bl 0x00c39d70
00b4c1f8	ldr x1,[x20, #0x8]
00b4c1fc	mov x21,x0
00b4c200	cbz x1,0x00b4c210
00b4c204	mov x0,x21
00b4c208	bl 0x00c39c80
00b4c20c	cbz w0,0x00b4c2b4
00b4c210	ldp x1,x2,[x20, #0x28]
00b4c214	mov x0,x21
00b4c218	bl 0x00c3dcc0
00b4c21c	cbz w0,0x00b4c2b4
00b4c220	ldr w1,[x20, #0x38]
00b4c224	cmn w1,#0x1
00b4c228	b.eq 0x00b4c254
00b4c22c	mov x0,x21
00b4c230	bl 0x00c3dcd0
00b4c234	ldr w1,[x20, #0x44]
00b4c238	cmn w1,#0x1
00b4c23c	b.eq 0x00b4c264
00b4c240	mov x0,x21
00b4c244	bl 0x00c3dcf0
00b4c248	ldr x1,[x20, #0x50]
00b4c24c	cbnz x1,0x00b4c26c
00b4c250	b 0x00b4c27c
00b4c254	ldr w1,[x20, #0x48]
00b4c258	cbz w1,0x00b4c264
00b4c25c	mov x0,x21
00b4c260	bl 0x00c3dce0
00b4c264	ldr x1,[x20, #0x50]
00b4c268	cbz x1,0x00b4c27c
00b4c26c	ldr x2,[x20, #0x58]
00b4c270	mov x0,x21
00b4c274	bl 0x00c3dc90
00b4c278	cbz w0,0x00b4c2b4
00b4c27c	stp x23,x22,[x20, #0x60]
00b4c280	bl 0x00c38c40
00b4c284	mov x22,x0
00b4c288	cbz x0,0x00b4c2a0
00b4c28c	adrp x1,0xb4d000
00b4c290	add x1,x1,#0x4
00b4c294	mov x0,x22
00b4c298	mov x2,x20
00b4c29c	bl 0x00c38c50
00b4c2a0	mov x24,x20
00b4c2a4	ldrb w8,[x24, #0x10]!
00b4c2a8	tbnz w8,#0x2,0x00b4c2c8
00b4c2ac	mov w23,wzr
00b4c2b0	b 0x00b4c314
00b4c2b4	mov x22,xzr
00b4c2b8	mov x0,x19
00b4c2bc	bl 0x00c39ab0
00b4c2c0	mov x19,xzr
00b4c2c4	b 0x00b4c390
00b4c2c8	ldr w1,[x20, #0x3c]
00b4c2cc	ldr w2,[x20, #0x18]
00b4c2d0	cbz w1,0x00b4c2f0
00b4c2d4	ldr w3,[x20, #0x20]
00b4c2d8	mov x0,x19
00b4c2dc	mov x4,x22
00b4c2e0	bl 0x00c39eb0
00b4c2e4	b 0x00b4c308
00b4c2e8	mov x19,xzr
00b4c2ec	b 0x00b4c398
00b4c2f0	ldr w8,[x20, #0x40]
00b4c2f4	mov x0,x19
00b4c2f8	mov w1,w2
00b4c2fc	mov x3,x22
00b4c300	mov w2,w8
00b4c304	bl 0x00c39ea0
00b4c308	mov w23,w0
00b4c30c	cmp w0,#0x1
00b4c310	b.lt 0x00b4c2b8
00b4c314	ldrb w8,[x24]
00b4c318	tst w8,#0x3
00b4c31c	b.eq 0x00b4c36c
00b4c320	ldr x8,[x21]
00b4c324	cbz x8,0x00b4c388
00b4c328	ldr x8,[x21, #0x10]
00b4c32c	cbz x8,0x00b4c388
00b4c330	ldrsw x1,[x20, #0x4c]
00b4c334	cmp w1,#0x1
00b4c338	b.lt 0x00b4c344
00b4c33c	mov x0,x19
00b4c340	bl 0x00c39d40
00b4c344	ldr w8,[x20, #0x3c]
00b4c348	mov w1,#0x4
00b4c34c	mov x0,x21
00b4c350	cmp w8,#0x1
00b4c354	cset w2,eq
00b4c358	bl 0x00c3dcb0
00b4c35c	mov x0,x19
00b4c360	bl 0x00c39d10
00b4c364	cmp w0,#0x1
00b4c368	b.lt 0x00b4c388
00b4c36c	orr w1,wzr,#0xf000
00b4c370	mov x0,x19
00b4c374	bl 0x00c39aa0
00b4c378	ldr w1,[x20, #0x70]
00b4c37c	mov x0,x19
00b4c380	bl 0x00c39b40
00b4c384	b 0x00b4c390
00b4c388	cmp w23,#0x0
00b4c38c	b.le 0x00b4c2b8
00b4c390	mov x0,x22
00b4c394	bl 0x00c38c20
00b4c398	mov x0,x19
00b4c39c	ldp x29,x30,[sp, #0x30]
00b4c3a0	ldp x20,x19,[sp, #0x20]
00b4c3a4	ldp x22,x21,[sp, #0x10]
00b4c3a8	ldp x24,x23,[sp], #0x40
00b4c3ac	ret
