; evp_pkey_copy_downgraded @ 00a6c140
00a6c140	str x25,[sp, #-0x50]!
00a6c144	stp x24,x23,[sp, #0x10]
00a6c148	stp x22,x21,[sp, #0x20]
00a6c14c	stp x20,x19,[sp, #0x30]
00a6c150	stp x29,x30,[sp, #0x40]
00a6c154	add x29,sp,#0x40
00a6c158	cbz x0,0x00a6c3cc
00a6c15c	ldr x8,[x1, #0x20]
00a6c160	mov x19,x0
00a6c164	cbnz x8,0x00a6c170
00a6c168	ldr x8,[x1, #0x68]
00a6c16c	cbz x8,0x00a6c3c8
00a6c170	ldr x22,[x1, #0x60]
00a6c174	cbz x22,0x00a6c3c8
00a6c178	ldr x23,[x1, #0x68]
00a6c17c	ldr w24,[x1]
00a6c180	mov x0,x22
00a6c184	bl 0x00c3bf30
00a6c188	cmn w24,#0x1
00a6c18c	mov x20,x0
00a6c190	b.eq 0x00a6c1e4
00a6c194	cbnz w24,0x00a6c1d8
00a6c198	bl 0x00c342a0
00a6c19c	adrp x0,0x2c1000
00a6c1a0	adrp x2,0x2c9000
00a6c1a4	add x0,x0,#0xcf9
00a6c1a8	add x2,x2,#0x9e2
00a6c1ac	orr w1,wzr,#0x7f0
00a6c1b0	bl 0x00c342b0
00a6c1b4	mov w8,#0x100
00a6c1b8	movk w8,#0xc, LSL #16
00a6c1bc	adrp x2,0x2aa000
00a6c1c0	add w1,w8,#0x3
00a6c1c4	add x2,x2,#0x201
00a6c1c8	orr w0,wzr,#0x6
00a6c1cc	mov x3,x20
00a6c1d0	bl 0x00c342c0
00a6c1d4	b 0x00a6c3c8
00a6c1d8	mov w0,w24
00a6c1dc	bl 0x00c324f0
00a6c1e0	mov x20,x0
00a6c1e4	ldr x21,[x19]
00a6c1e8	cbz x21,0x00a6c230
00a6c1ec	mov w1,#0x1
00a6c1f0	mov x0,x21
00a6c1f4	bl 0x00c3d2e0
00a6c1f8	mov x0,x21
00a6c1fc	bl 0x00a6f0e0
00a6c200	mov x25,x21
00a6c204	ldr x0,[x25, #0x60]!
00a6c208	cbz x0,0x00a6c220
00a6c20c	ldr x1,[x21, #0x68]
00a6c210	bl 0x00c3b730
00a6c214	ldr x0,[x21, #0x60]
00a6c218	bl 0x00c36350
00a6c21c	stp xzr,xzr,[x25]
00a6c220	str wzr,[x21]
00a6c224	ldr x0,[x19]
00a6c228	mov x21,xzr
00a6c22c	b 0x00a6c240
00a6c230	bl 0x00a6edc4
00a6c234	mov x21,x0
00a6c238	str x0,[x19]
00a6c23c	cbz x0,0x00a6c2d8
00a6c240	mov w4,#0xffffffff
00a6c244	mov x1,xzr
00a6c248	mov w2,w24
00a6c24c	mov x3,xzr
00a6c250	mov x5,xzr
00a6c254	bl 0x00a6d2f4
00a6c258	cbz w0,0x00a6c3b0
00a6c25c	cbz x23,0x00a6c2d0
00a6c260	ldr x8,[x19]
00a6c264	ldr x8,[x8, #0x8]
00a6c268	ldr x8,[x8, #0x128]
00a6c26c	cbz x8,0x00a6c30c
00a6c270	ldr x0,[x22, #0x18]
00a6c274	bl 0x00c3b2f0
00a6c278	ldr x1,[x19]
00a6c27c	mov x2,xzr
00a6c280	bl 0x00c34640
00a6c284	mov x24,x0
00a6c288	cbz x0,0x00a6c344
00a6c28c	ldr x8,[x19]
00a6c290	mov w2,#0x87
00a6c294	mov x0,x22
00a6c298	mov x1,x23
00a6c29c	ldr x8,[x8, #0x8]
00a6c2a0	mov x4,x24
00a6c2a4	ldr x3,[x8, #0x128]
00a6c2a8	bl 0x00c3d130
00a6c2ac	cbz w0,0x00a6c374
00a6c2b0	ldr x0,[x19]
00a6c2b4	ldr x8,[x0, #0x8]
00a6c2b8	ldr x8,[x8, #0x118]
00a6c2bc	blr x8
00a6c2c0	ldr x8,[x19]
00a6c2c4	str x0,[x8, #0x80]
00a6c2c8	mov x0,x24
00a6c2cc	bl 0x00c34620
00a6c2d0	mov w0,#0x1
00a6c2d4	b 0x00a6c3cc
00a6c2d8	bl 0x00c342a0
00a6c2dc	adrp x0,0x2c1000
00a6c2e0	adrp x2,0x2c9000
00a6c2e4	add x0,x0,#0xcf9
00a6c2e8	add x2,x2,#0x9e2
00a6c2ec	orr w1,wzr,#0x7fe
00a6c2f0	bl 0x00c342b0
00a6c2f4	mov w1,#0x100
00a6c2f8	orr w0,wzr,#0x6
00a6c2fc	movk w1,#0xc, LSL #16
00a6c300	mov x2,xzr
00a6c304	bl 0x00c342c0
00a6c308	b 0x00a6c3c8
00a6c30c	bl 0x00c342a0
00a6c310	adrp x0,0x2c1000
00a6c314	adrp x2,0x2c9000
00a6c318	add x0,x0,#0xcf9
00a6c31c	add x2,x2,#0x9e2
00a6c320	mov w1,#0x80b
00a6c324	bl 0x00c342b0
00a6c328	adrp x2,0x2c9000
00a6c32c	add x2,x2,#0x9fb
00a6c330	orr w0,wzr,#0x6
00a6c334	mov w1,#0xce
00a6c338	mov x3,x20
00a6c33c	bl 0x00c342c0
00a6c340	b 0x00a6c37c
00a6c344	bl 0x00c342a0
00a6c348	adrp x0,0x2c1000
00a6c34c	adrp x2,0x2c9000
00a6c350	add x0,x0,#0xcf9
00a6c354	add x2,x2,#0x9e2
00a6c358	mov w1,#0x818
00a6c35c	bl 0x00c342b0
00a6c360	mov w1,#0x100
00a6c364	orr w0,wzr,#0x6
00a6c368	movk w1,#0xc, LSL #16
00a6c36c	mov x2,xzr
00a6c370	bl 0x00c342c0
00a6c374	mov x0,x24
00a6c378	bl 0x00c34620
00a6c37c	bl 0x00c342a0
00a6c380	adrp x0,0x2c1000
00a6c384	adrp x2,0x2c9000
00a6c388	add x0,x0,#0xcf9
00a6c38c	add x2,x2,#0x9e2
00a6c390	mov w1,#0x828
00a6c394	bl 0x00c342b0
00a6c398	adrp x2,0x2c9000
00a6c39c	add x2,x2,#0x9fb
00a6c3a0	orr w0,wzr,#0x6
00a6c3a4	mov w1,#0xcd
00a6c3a8	mov x3,x20
00a6c3ac	bl 0x00c342c0
00a6c3b0	cbz x21,0x00a6c3c8
00a6c3b4	mov x0,x21
00a6c3b8	bl 0x00a6c7fc
00a6c3bc	mov w0,wzr
00a6c3c0	str xzr,[x19]
00a6c3c4	b 0x00a6c3cc
00a6c3c8	mov w0,wzr
00a6c3cc	ldp x29,x30,[sp, #0x40]
00a6c3d0	ldp x20,x19,[sp, #0x30]
00a6c3d4	ldp x22,x21,[sp, #0x20]
00a6c3d8	ldp x24,x23,[sp, #0x10]
00a6c3dc	ldr x25,[sp], #0x50
00a6c3e0	ret
