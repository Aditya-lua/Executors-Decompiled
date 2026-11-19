; ossl_ec_GFp_simple_ladder_post @ 00a3becc
00a3becc	sub sp,sp,#0x70
00a3bed0	stp x28,x27,[sp, #0x10]
00a3bed4	stp x26,x25,[sp, #0x20]
00a3bed8	stp x24,x23,[sp, #0x30]
00a3bedc	stp x22,x21,[sp, #0x40]
00a3bee0	stp x20,x19,[sp, #0x50]
00a3bee4	stp x29,x30,[sp, #0x60]
00a3bee8	ldr x8,[x1, #0x20]
00a3beec	mov x21,x0
00a3bef0	add x29,sp,#0x60
00a3bef4	mov x19,x4
00a3bef8	mov x0,x8
00a3befc	mov x22,x3
00a3bf00	mov x25,x2
00a3bf04	mov x20,x1
00a3bf08	bl 0x00c369b0
00a3bf0c	cbz w0,0x00a3bf38
00a3bf10	mov x0,x21
00a3bf14	mov x1,x20
00a3bf18	ldp x29,x30,[sp, #0x60]
00a3bf1c	ldp x20,x19,[sp, #0x50]
00a3bf20	ldp x22,x21,[sp, #0x40]
00a3bf24	ldp x24,x23,[sp, #0x30]
00a3bf28	ldp x26,x25,[sp, #0x20]
00a3bf2c	ldp x28,x27,[sp, #0x10]
00a3bf30	add sp,sp,#0x70
00a3bf34	b 0x00c3af10
00a3bf38	ldr x0,[x25, #0x20]
00a3bf3c	bl 0x00c369b0
00a3bf40	cbz w0,0x00a3bf70
00a3bf44	mov x0,x20
00a3bf48	mov x1,x22
00a3bf4c	bl 0x00c3acc0
00a3bf50	cbz w0,0x00a3c368
00a3bf54	mov x0,x21
00a3bf58	mov x1,x20
00a3bf5c	mov x2,x19
00a3bf60	bl 0x00c3af00
00a3bf64	cmp w0,#0x0
00a3bf68	cset w0,ne
00a3bf6c	b 0x00a3c390
00a3bf70	mov x0,x19
00a3bf74	bl 0x00c38a90
00a3bf78	mov x0,x19
00a3bf7c	bl 0x00c38a40
00a3bf80	str x0,[sp]
00a3bf84	mov x0,x19
00a3bf88	bl 0x00c38a40
00a3bf8c	mov x23,x0
00a3bf90	mov x0,x19
00a3bf94	bl 0x00c38a40
00a3bf98	mov x24,x0
00a3bf9c	mov x0,x19
00a3bfa0	bl 0x00c38a40
00a3bfa4	mov x26,x0
00a3bfa8	mov x0,x19
00a3bfac	bl 0x00c38a40
00a3bfb0	mov x27,x0
00a3bfb4	mov x0,x19
00a3bfb8	bl 0x00c38a40
00a3bfbc	str x0,[sp, #0x8]
00a3bfc0	mov x0,x19
00a3bfc4	bl 0x00c38a40
00a3bfc8	cbz x0,0x00a3c380
00a3bfcc	ldr x1,[x22, #0x18]
00a3bfd0	ldr x2,[x21, #0x40]
00a3bfd4	mov x28,x0
00a3bfd8	mov x0,x27
00a3bfdc	bl 0x00c38ed0
00a3bfe0	cbz w0,0x00a3c380
00a3bfe4	ldr x8,[x21]
00a3bfe8	ldr x2,[x20, #0x10]
00a3bfec	mov x0,x21
00a3bff0	mov x1,x28
00a3bff4	ldr x8,[x8, #0xf8]
00a3bff8	mov x3,x27
00a3bffc	mov x4,x19
00a3c000	blr x8
00a3c004	cbz w0,0x00a3c380
00a3c008	ldr x8,[x21]
00a3c00c	ldr x2,[x25, #0x20]
00a3c010	mov x0,x21
00a3c014	mov x1,x28
00a3c018	ldr x8,[x8, #0xf8]
00a3c01c	mov x3,x28
00a3c020	mov x4,x19
00a3c024	blr x8
00a3c028	cbz w0,0x00a3c380
00a3c02c	ldr x8,[x21]
00a3c030	ldr x2,[x20, #0x20]
00a3c034	ldr x1,[sp, #0x8]
00a3c038	mov x0,x21
00a3c03c	ldr x8,[x8, #0xf8]
00a3c040	mov x3,x28
00a3c044	mov x4,x19
00a3c048	blr x8
00a3c04c	cbz w0,0x00a3c380
00a3c050	ldr x1,[x21, #0x68]
00a3c054	ldr x2,[x21, #0x40]
00a3c058	mov x0,x23
00a3c05c	bl 0x00c38ed0
00a3c060	cbz w0,0x00a3c380
00a3c064	ldr x8,[x21]
00a3c068	ldr x2,[x25, #0x20]
00a3c06c	mov x0,x21
00a3c070	mov x1,x23
00a3c074	ldr x8,[x8, #0xf8]
00a3c078	mov x3,x23
00a3c07c	mov x4,x19
00a3c080	blr x8
00a3c084	cbz w0,0x00a3c380
00a3c088	ldr x8,[x21]
00a3c08c	ldr x2,[x20, #0x20]
00a3c090	mov x0,x21
00a3c094	mov x1,x26
00a3c098	ldr x8,[x8, #0x100]
00a3c09c	mov x3,x19
00a3c0a0	blr x8
00a3c0a4	cbz w0,0x00a3c380
00a3c0a8	ldr x8,[x21]
00a3c0ac	mov x0,x21
00a3c0b0	mov x1,x24
00a3c0b4	mov x2,x26
00a3c0b8	ldr x8,[x8, #0xf8]
00a3c0bc	mov x3,x23
00a3c0c0	mov x4,x19
00a3c0c4	blr x8
00a3c0c8	cbz w0,0x00a3c380
00a3c0cc	ldr x8,[x21]
00a3c0d0	ldr x2,[x20, #0x20]
00a3c0d4	ldr x3,[x21, #0x60]
00a3c0d8	mov x0,x21
00a3c0dc	ldr x8,[x8, #0xf8]
00a3c0e0	mov x1,x28
00a3c0e4	mov x4,x19
00a3c0e8	blr x8
00a3c0ec	cbz w0,0x00a3c380
00a3c0f0	ldr x8,[x21]
00a3c0f4	ldr x2,[x22, #0x10]
00a3c0f8	ldr x3,[x20, #0x10]
00a3c0fc	mov x0,x21
00a3c100	ldr x8,[x8, #0xf8]
00a3c104	mov x1,x23
00a3c108	mov x4,x19
00a3c10c	blr x8
00a3c110	cbz w0,0x00a3c380
00a3c114	ldr x3,[x21, #0x40]
00a3c118	mov x0,x23
00a3c11c	mov x1,x23
00a3c120	mov x2,x28
00a3c124	bl 0x00c38ec0
00a3c128	cbz w0,0x00a3c380
00a3c12c	ldr x8,[x21]
00a3c130	ldr x2,[x25, #0x20]
00a3c134	mov x0,x21
00a3c138	mov x1,x23
00a3c13c	ldr x8,[x8, #0xf8]
00a3c140	mov x3,x23
00a3c144	mov x4,x19
00a3c148	blr x8
00a3c14c	cbz w0,0x00a3c380
00a3c150	ldr x8,[x21]
00a3c154	ldr x2,[x22, #0x10]
00a3c158	ldr x22,[sp]
00a3c15c	ldr x3,[x20, #0x20]
00a3c160	ldr x8,[x8, #0xf8]
00a3c164	mov x0,x21
00a3c168	mov x1,x22
00a3c16c	mov x4,x19
00a3c170	blr x8
00a3c174	cbz w0,0x00a3c380
00a3c178	ldr x1,[x20, #0x10]
00a3c17c	ldr x3,[x21, #0x40]
00a3c180	mov x0,x28
00a3c184	mov x2,x22
00a3c188	bl 0x00c38ec0
00a3c18c	cbz w0,0x00a3c380
00a3c190	ldr x8,[x21]
00a3c194	mov x0,x21
00a3c198	mov x1,x28
00a3c19c	mov x2,x28
00a3c1a0	ldr x8,[x8, #0xf8]
00a3c1a4	mov x3,x23
00a3c1a8	mov x4,x19
00a3c1ac	blr x8
00a3c1b0	cbz w0,0x00a3c380
00a3c1b4	ldr x3,[x21, #0x40]
00a3c1b8	mov x0,x28
00a3c1bc	mov x1,x28
00a3c1c0	mov x2,x24
00a3c1c4	bl 0x00c38ec0
00a3c1c8	cbz w0,0x00a3c380
00a3c1cc	ldr x0,[sp]
00a3c1d0	ldr x2,[x20, #0x10]
00a3c1d4	ldr x3,[x21, #0x40]
00a3c1d8	mov x1,x0
00a3c1dc	bl 0x00c38f20
00a3c1e0	cbz w0,0x00a3c380
00a3c1e4	ldr x8,[x21]
00a3c1e8	ldr x1,[sp]
00a3c1ec	mov x0,x21
00a3c1f0	mov x3,x19
00a3c1f4	ldr x8,[x8, #0x100]
00a3c1f8	mov x2,x1
00a3c1fc	blr x8
00a3c200	cbz w0,0x00a3c380
00a3c204	ldr x8,[x21]
00a3c208	ldr x1,[sp]
00a3c20c	ldr x3,[x25, #0x10]
00a3c210	mov x0,x21
00a3c214	ldr x8,[x8, #0xf8]
00a3c218	mov x2,x1
00a3c21c	mov x4,x19
00a3c220	blr x8
00a3c224	cbz w0,0x00a3c380
00a3c228	ldr x0,[sp]
00a3c22c	ldr x3,[x21, #0x40]
00a3c230	mov x1,x28
00a3c234	mov x2,x0
00a3c238	bl 0x00c38f20
00a3c23c	cbz w0,0x00a3c380
00a3c240	ldr x8,[x21]
00a3c244	ldr x2,[x25, #0x20]
00a3c248	mov x0,x21
00a3c24c	mov x1,x23
00a3c250	ldr x8,[x8, #0xf8]
00a3c254	mov x3,x27
00a3c258	mov x4,x19
00a3c25c	blr x8
00a3c260	cbz w0,0x00a3c380
00a3c264	ldr x8,[x21]
00a3c268	mov x0,x21
00a3c26c	mov x1,x23
00a3c270	mov x2,x26
00a3c274	ldr x8,[x8, #0xf8]
00a3c278	mov x3,x23
00a3c27c	mov x4,x19
00a3c280	blr x8
00a3c284	cbz w0,0x00a3c380
00a3c288	ldr x8,[x21]
00a3c28c	ldr x9,[x8, #0x120]
00a3c290	cbz x9,0x00a3c2b0
00a3c294	mov x0,x21
00a3c298	mov x1,x23
00a3c29c	mov x2,x23
00a3c2a0	mov x3,x19
00a3c2a4	blr x9
00a3c2a8	cbz w0,0x00a3c380
00a3c2ac	ldr x8,[x21]
00a3c2b0	ldr x8,[x8, #0x110]
00a3c2b4	mov x0,x21
00a3c2b8	mov x1,x23
00a3c2bc	mov x2,x23
00a3c2c0	mov x3,x19
00a3c2c4	blr x8
00a3c2c8	cbz w0,0x00a3c380
00a3c2cc	ldr x8,[x21]
00a3c2d0	ldr x9,[x8, #0x118]
00a3c2d4	cbz x9,0x00a3c2f4
00a3c2d8	mov x0,x21
00a3c2dc	mov x1,x23
00a3c2e0	mov x2,x23
00a3c2e4	mov x3,x19
00a3c2e8	blr x9
00a3c2ec	cbz w0,0x00a3c380
00a3c2f0	ldr x8,[x21]
00a3c2f4	ldr x8,[x8, #0xf8]
00a3c2f8	ldr x1,[x20, #0x10]
00a3c2fc	ldr x2,[sp, #0x8]
00a3c300	mov x0,x21
00a3c304	mov x3,x23
00a3c308	mov x4,x19
00a3c30c	blr x8
00a3c310	cbz w0,0x00a3c380
00a3c314	ldr x8,[x21]
00a3c318	ldr x1,[x20, #0x18]
00a3c31c	ldr x2,[sp]
00a3c320	mov x0,x21
00a3c324	ldr x8,[x8, #0xf8]
00a3c328	mov x3,x23
00a3c32c	mov x4,x19
00a3c330	blr x8
00a3c334	cbz w0,0x00a3c380
00a3c338	ldr x8,[x21]
00a3c33c	ldr x9,[x8, #0x128]
00a3c340	ldr x8,[x20, #0x20]
00a3c344	cbz x9,0x00a3c370
00a3c348	mov x0,x21
00a3c34c	mov x1,x8
00a3c350	mov x2,x19
00a3c354	blr x9
00a3c358	cbz w0,0x00a3c380
00a3c35c	mov w21,#0x1
00a3c360	str w21,[x20, #0x28]
00a3c364	b 0x00a3c384
00a3c368	mov w21,wzr
00a3c36c	b 0x00a3c38c
00a3c370	mov w1,#0x1
00a3c374	mov x0,x8
00a3c378	bl 0x00c37720
00a3c37c	cbnz w0,0x00a3c35c
00a3c380	mov w21,wzr
00a3c384	mov x0,x19
00a3c388	bl 0x00c38a20
00a3c38c	mov w0,w21
00a3c390	ldp x29,x30,[sp, #0x60]
00a3c394	ldp x20,x19,[sp, #0x50]
00a3c398	ldp x22,x21,[sp, #0x40]
00a3c39c	ldp x24,x23,[sp, #0x30]
00a3c3a0	ldp x26,x25,[sp, #0x20]
00a3c3a4	ldp x28,x27,[sp, #0x10]
00a3c3a8	add sp,sp,#0x70
00a3c3ac	ret
