; CONF_modules_load @ 00a0bf84
00a0bf84	sub sp,sp,#0x70
00a0bf88	stp x28,x27,[sp, #0x10]
00a0bf8c	stp x26,x25,[sp, #0x20]
00a0bf90	stp x24,x23,[sp, #0x30]
00a0bf94	stp x22,x21,[sp, #0x40]
00a0bf98	stp x20,x19,[sp, #0x50]
00a0bf9c	stp x29,x30,[sp, #0x60]
00a0bfa0	add x29,sp,#0x60
00a0bfa4	cbz x0,0x00a0c4a4
00a0bfa8	mov x21,x2
00a0bfac	adrp x2,0x2c1000
00a0bfb0	mov x20,x1
00a0bfb4	add x2,x2,#0xa3e
00a0bfb8	mov x1,xzr
00a0bfbc	mov x19,x0
00a0bfc0	bl 0x00c39500
00a0bfc4	mov x8,#-0x18
00a0bfc8	and x8,x21,x8
00a0bfcc	cmp x0,#0x0
00a0bfd0	csel x23,x21,x8,eq
00a0bfd4	bl 0x00c35250
00a0bfd8	cbz x20,0x00a0bff8
00a0bfdc	mov x0,x19
00a0bfe0	mov x1,xzr
00a0bfe4	mov x2,x20
00a0bfe8	bl 0x00c394c0
00a0bfec	mov x21,x0
00a0bff0	tbz w23,#0x5,0x00a0c010
00a0bff4	cbnz x21,0x00a0c010
00a0bff8	adrp x2,0x2a3000
00a0bffc	add x2,x2,#0xe57
00a0c000	mov x0,x19
00a0c004	mov x1,xzr
00a0c008	bl 0x00c394c0
00a0c00c	mov x21,x0
00a0c010	cbz x21,0x00a0c4a0
00a0c014	mov x0,x19
00a0c018	mov x1,x21
00a0c01c	bl 0x00c394b0
00a0c020	cbz x0,0x00a0c4c8
00a0c024	mov x20,x0
00a0c028	bl 0x00c35240
00a0c02c	mov x0,x20
00a0c030	bl 0x00c325e0
00a0c034	cmp w0,#0x1
00a0c038	b.lt 0x00a0c4a4
00a0c03c	adrp x24,0xd21000
00a0c040	adrp x25,0xa0c000
00a0c044	adrp x22,0x2c9000
00a0c048	mov w21,wzr
00a0c04c	add x24,x24,#0x938
00a0c050	add x25,x25,#0xcac
00a0c054	adrp x27,0xd21000
00a0c058	add x22,x22,#0x604
00a0c05c	str x19,[sp, #0x8]
00a0c060	mov x0,x20
00a0c064	mov w1,w21
00a0c068	bl 0x00c32610
00a0c06c	mov x19,x22
00a0c070	mov x22,x0
00a0c074	bl 0x00c35250
00a0c078	ldp x28,x26,[x22, #0x8]
00a0c07c	mov x0,x24
00a0c080	mov x1,x25
00a0c084	mov x22,x19
00a0c088	bl 0x00c34d60
00a0c08c	cbz w0,0x00a0c480
00a0c090	adrp x8,0xd21000
00a0c094	ldrb w8,[x8, #0x93c]
00a0c098	cbz w8,0x00a0c480
00a0c09c	mov w1,#0x2e
00a0c0a0	mov x0,x28
00a0c0a4	bl 0x00c31d40
00a0c0a8	cbz x0,0x00a0c0b4
00a0c0ac	sub x22,x0,x28
00a0c0b0	b 0x00a0c0c0
00a0c0b4	mov x0,x28
00a0c0b8	bl 0x00c2ff50
00a0c0bc	mov x22,x0
00a0c0c0	adrp x0,0xd21000
00a0c0c4	adrp x1,0xa0c000
00a0c0c8	add x0,x0,#0x940
00a0c0cc	add x1,x1,#0xcd0
00a0c0d0	bl 0x00c34d60
00a0c0d4	cbz w0,0x00a0c154
00a0c0d8	adrp x8,0xd21000
00a0c0dc	ldr w8,[x8, #0x944]
00a0c0e0	mov x24,xzr
00a0c0e4	cbz w8,0x00a0c158
00a0c0e8	adrp x8,0xd21000
00a0c0ec	ldr x0,[x8, #0x928]
00a0c0f0	bl 0x00c35680
00a0c0f4	cbz w0,0x00a0c154
00a0c0f8	ldr x0,[x27, #0x930]
00a0c0fc	bl 0x00c325e0
00a0c100	cmp w0,#0x1
00a0c104	b.lt 0x00a0c148
00a0c108	mov w25,wzr
00a0c10c	sxtw x22,w22
00a0c110	ldr x0,[x27, #0x930]
00a0c114	mov w1,w25
00a0c118	bl 0x00c32610
00a0c11c	mov x24,x0
00a0c120	ldr x0,[x0, #0x8]
00a0c124	mov x1,x28
00a0c128	mov x2,x22
00a0c12c	bl 0x00c31bb0
00a0c130	cbz w0,0x00a0c22c
00a0c134	ldr x0,[x27, #0x930]
00a0c138	add w25,w25,#0x1
00a0c13c	bl 0x00c325e0
00a0c140	cmp w25,w0
00a0c144	b.lt 0x00a0c110
00a0c148	adrp x8,0xd21000
00a0c14c	ldr x0,[x8, #0x928]
00a0c150	bl 0x00c35690
00a0c154	mov x24,xzr
00a0c158	tbnz w23,#0x3,0x00a0c23c
00a0c15c	cbnz x24,0x00a0c23c
00a0c160	ldr x0,[sp, #0x8]
00a0c164	adrp x2,0x2c4000
00a0c168	mov x1,x26
00a0c16c	add x2,x2,#0xe25
00a0c170	bl 0x00c393f0
00a0c174	cmp x0,#0x0
00a0c178	csel x25,x28,x0,eq
00a0c17c	mov x0,xzr
00a0c180	mov x1,x25
00a0c184	mov x2,xzr
00a0c188	mov w3,wzr
00a0c18c	bl 0x00c39570
00a0c190	mov x22,x0
00a0c194	cbz x0,0x00a0c1e0
00a0c198	adrp x1,0x2bb000
00a0c19c	mov x0,x22
00a0c1a0	add x1,x1,#0xa2c
00a0c1a4	bl 0x00c39550
00a0c1a8	cbz x0,0x00a0c1e8
00a0c1ac	adrp x1,0x2c9000
00a0c1b0	mov x24,x0
00a0c1b4	mov x0,x22
00a0c1b8	add x1,x1,#0x61b
00a0c1bc	bl 0x00c39550
00a0c1c0	mov x3,x0
00a0c1c4	mov x0,x22
00a0c1c8	mov x1,x28
00a0c1cc	mov x2,x24
00a0c1d0	bl 0x00a0c990
00a0c1d4	mov x24,x0
00a0c1d8	cbnz x0,0x00a0c240
00a0c1dc	b 0x00a0c1ec
00a0c1e0	mov w24,#0x6e
00a0c1e4	b 0x00a0c1ec
00a0c1e8	orr w24,wzr,#0x70
00a0c1ec	mov x0,x22
00a0c1f0	bl 0x00c39560
00a0c1f4	bl 0x00c342a0
00a0c1f8	adrp x2,0x2cf000
00a0c1fc	mov w1,#0x141
00a0c200	mov x0,x19
00a0c204	add x2,x2,#0x99c
00a0c208	bl 0x00c342b0
00a0c20c	adrp x2,0x2b5000
00a0c210	orr w0,wzr,#0xe
00a0c214	mov w1,w24
00a0c218	add x2,x2,#0xa93
00a0c21c	mov x3,x28
00a0c220	mov x4,x25
00a0c224	bl 0x00c342c0
00a0c228	b 0x00a0c2bc
00a0c22c	adrp x8,0xd21000
00a0c230	ldr x0,[x8, #0x928]
00a0c234	bl 0x00c35690
00a0c238	tbz w23,#0x3,0x00a0c15c
00a0c23c	cbz x24,0x00a0c2bc
00a0c240	mov w0,#0x28
00a0c244	mov w2,#0x19d
00a0c248	mov x1,x19
00a0c24c	mov x22,x19
00a0c250	bl 0x00c32320
00a0c254	cbz x0,0x00a0c434
00a0c258	mov x25,x0
00a0c25c	str x24,[x0]
00a0c260	mov w2,#0x1a2
00a0c264	mov x0,x28
00a0c268	mov x1,x22
00a0c26c	bl 0x00c34600
00a0c270	str x0,[x25, #0x8]
00a0c274	mov w2,#0x1a3
00a0c278	mov x0,x26
00a0c27c	mov x1,x22
00a0c280	bl 0x00c34600
00a0c284	str x0,[x25, #0x10]
00a0c288	str xzr,[x25, #0x20]
00a0c28c	cbz x0,0x00a0c400
00a0c290	ldr x8,[x25, #0x8]
00a0c294	cbz x8,0x00a0c400
00a0c298	ldr x8,[x24, #0x10]
00a0c29c	cbz x8,0x00a0c30c
00a0c2a0	ldr x1,[sp, #0x8]
00a0c2a4	mov x0,x25
00a0c2a8	blr x8
00a0c2ac	cmp w0,#0x1
00a0c2b0	mov w22,#0x1
00a0c2b4	b.ge 0x00a0c310
00a0c2b8	b 0x00a0c3ec
00a0c2bc	adrp x24,0xd21000
00a0c2c0	adrp x25,0xa0c000
00a0c2c4	add x24,x24,#0x938
00a0c2c8	add x25,x25,#0xcac
00a0c2cc	mov x22,x19
00a0c2d0	tbnz w23,#0x2,0x00a0c480
00a0c2d4	bl 0x00c342a0
00a0c2d8	adrp x2,0x2a3000
00a0c2dc	mov w1,#0x10a
00a0c2e0	mov x0,x22
00a0c2e4	add x2,x2,#0xe64
00a0c2e8	bl 0x00c342b0
00a0c2ec	adrp x2,0x2af000
00a0c2f0	orr w0,wzr,#0xe
00a0c2f4	mov w1,#0x71
00a0c2f8	add x2,x2,#0xd69
00a0c2fc	mov x3,x28
00a0c300	bl 0x00c342c0
00a0c304	tbnz w23,#0x0,0x00a0c484
00a0c308	b 0x00a0c50c
00a0c30c	mov w22,wzr
00a0c310	adrp x0,0xd21000
00a0c314	adrp x1,0xa0c000
00a0c318	add x0,x0,#0x940
00a0c31c	add x1,x1,#0xcd0
00a0c320	bl 0x00c34d60
00a0c324	cbz w0,0x00a0c3ec
00a0c328	adrp x8,0xd21000
00a0c32c	ldr w8,[x8, #0x944]
00a0c330	cbz w8,0x00a0c3ec
00a0c334	adrp x8,0xd21000
00a0c338	ldr x0,[x8, #0x928]
00a0c33c	bl 0x00c356a0
00a0c340	cbz w0,0x00a0c3ec
00a0c344	adrp x8,0xd21000
00a0c348	ldr x0,[x8, #0x948]
00a0c34c	cbnz x0,0x00a0c360
00a0c350	bl 0x00c34780
00a0c354	adrp x8,0xd21000
00a0c358	str x0,[x8, #0x948]
00a0c35c	cbz x0,0x00a0c3b4
00a0c360	mov x1,x25
00a0c364	bl 0x00c347a0
00a0c368	cbz w0,0x00a0c39c
00a0c36c	ldr w8,[x24, #0x20]
00a0c370	add w8,w8,#0x1
00a0c374	str w8,[x24, #0x20]
00a0c378	adrp x8,0xd21000
00a0c37c	ldr x0,[x8, #0x928]
00a0c380	bl 0x00c35690
00a0c384	adrp x24,0xd21000
00a0c388	adrp x25,0xa0c000
00a0c38c	add x24,x24,#0x938
00a0c390	add x25,x25,#0xcac
00a0c394	mov x22,x19
00a0c398	b 0x00a0c484
00a0c39c	adrp x8,0xd21000
00a0c3a0	ldr x0,[x8, #0x928]
00a0c3a4	bl 0x00c35690
00a0c3a8	bl 0x00c342a0
00a0c3ac	mov w1,#0x1c3
00a0c3b0	b 0x00a0c3c8
00a0c3b4	adrp x8,0xd21000
00a0c3b8	ldr x0,[x8, #0x928]
00a0c3bc	bl 0x00c35690
00a0c3c0	bl 0x00c342a0
00a0c3c4	mov w1,#0x1bc
00a0c3c8	adrp x2,0x2ab000
00a0c3cc	mov x0,x19
00a0c3d0	add x2,x2,#0xe77
00a0c3d4	bl 0x00c342b0
00a0c3d8	mov w1,#0x100
00a0c3dc	orr w0,wzr,#0xe
00a0c3e0	movk w1,#0xc, LSL #16
00a0c3e4	mov x2,xzr
00a0c3e8	bl 0x00c342c0
00a0c3ec	cbz w22,0x00a0c400
00a0c3f0	ldr x8,[x24, #0x18]
00a0c3f4	cbz x8,0x00a0c400
00a0c3f8	mov x0,x25
00a0c3fc	blr x8
00a0c400	ldr x0,[x25, #0x8]
00a0c404	mov w2,#0x1d4
00a0c408	mov x1,x19
00a0c40c	mov x22,x19
00a0c410	bl 0x00c32310
00a0c414	ldr x0,[x25, #0x10]
00a0c418	mov w2,#0x1d5
00a0c41c	mov x1,x19
00a0c420	bl 0x00c32310
00a0c424	mov w2,#0x1d6
00a0c428	mov x0,x25
00a0c42c	mov x1,x19
00a0c430	bl 0x00c32310
00a0c434	adrp x24,0xd21000
00a0c438	adrp x25,0xa0c000
00a0c43c	add x24,x24,#0x938
00a0c440	add x25,x25,#0xcac
00a0c444	tbnz w23,#0x2,0x00a0c480
00a0c448	bl 0x00c342a0
00a0c44c	adrp x2,0x2a3000
00a0c450	mov w1,#0x114
00a0c454	mov x0,x22
00a0c458	add x2,x2,#0xe64
00a0c45c	bl 0x00c342b0
00a0c460	adrp x2,0x2a2000
00a0c464	orr w0,wzr,#0xe
00a0c468	mov w1,#0x6d
00a0c46c	mov w5,#0xffffffff
00a0c470	add x2,x2,#0x1b7
00a0c474	mov x3,x28
00a0c478	mov x4,x26
00a0c47c	bl 0x00c342c0
00a0c480	tbz w23,#0x0,0x00a0c50c
00a0c484	bl 0x00c35240
00a0c488	mov x0,x20
00a0c48c	add w21,w21,#0x1
00a0c490	bl 0x00c325e0
00a0c494	cmp w21,w0
00a0c498	b.lt 0x00a0c060
00a0c49c	b 0x00a0c4a4
00a0c4a0	bl 0x00c35240
00a0c4a4	mov w0,#0x1
00a0c4a8	ldp x29,x30,[sp, #0x60]
00a0c4ac	ldp x20,x19,[sp, #0x50]
00a0c4b0	ldp x22,x21,[sp, #0x40]
00a0c4b4	ldp x24,x23,[sp, #0x30]
00a0c4b8	ldp x26,x25,[sp, #0x20]
00a0c4bc	ldp x28,x27,[sp, #0x10]
00a0c4c0	add sp,sp,#0x70
00a0c4c4	ret
00a0c4c8	tbnz w23,#0x2,0x00a0c518
00a0c4cc	bl 0x00c35ed0
00a0c4d0	bl 0x00c342a0
00a0c4d4	adrp x0,0x2c9000
00a0c4d8	adrp x2,0x2d5000
00a0c4dc	add x0,x0,#0x604
00a0c4e0	add x2,x2,#0xb07
00a0c4e4	mov w1,#0x98
00a0c4e8	bl 0x00c342b0
00a0c4ec	adrp x2,0x2d3000
00a0c4f0	add x2,x2,#0x916
00a0c4f4	orr w0,wzr,#0xe
00a0c4f8	orr w1,wzr,#0x7c
00a0c4fc	mov x3,x21
00a0c500	bl 0x00c342c0
00a0c504	mov w0,wzr
00a0c508	b 0x00a0c4a8
00a0c50c	bl 0x00c35ed0
00a0c510	mov w0,#0xffffffff
00a0c514	b 0x00a0c4a8
00a0c518	bl 0x00c35240
00a0c51c	mov w0,wzr
00a0c520	b 0x00a0c4a8
