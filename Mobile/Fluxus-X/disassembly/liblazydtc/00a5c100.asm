; EVP_CIPHER_CTX_ctrl @ 00a5c100
00a5c100	sub sp,sp,#0x130
00a5c104	stp x24,x23,[sp, #0xf0]
00a5c108	mov w23,w2
00a5c10c	stp x22,x21,[sp, #0x100]
00a5c110	stp x20,x19,[sp, #0x110]
00a5c114	stp x29,x30,[sp, #0x120]
00a5c118	add x29,sp,#0x120
00a5c11c	mov w21,w1
00a5c120	mov x19,x0
00a5c124	sxtw x22,w23
00a5c128	add x0,sp,#0x30
00a5c12c	mov w2,#0xa0
00a5c130	mov w1,wzr
00a5c134	str x28,[sp, #0xe0]
00a5c138	mov x20,x3
00a5c13c	stur x22,[x29, #-0x48]
00a5c140	bl 0x00c301c0
00a5c144	cbz x19,0x00a5c198
00a5c148	ldr x8,[x19]
00a5c14c	cbz x8,0x00a5c198
00a5c150	ldr x9,[x8, #0x78]
00a5c154	cbz x9,0x00a5c1e8
00a5c158	cmp w21,#0x27
00a5c15c	b.hi 0x00a5c70c
00a5c160	adrp x9,0x766000
00a5c164	mov w8,w21
00a5c168	add x9,x9,#0x1ec
00a5c16c	ldrsw x8,[x9, x8, LSL #0x2]
00a5c170	add x24,sp,#0x30
00a5c174	mov w21,#0x1
00a5c178	add x8,x8,x9
00a5c17c	br x8
00a5c180	adrp x0,0x2bd000
00a5c184	add x0,x0,#0xa97
00a5c188	add x8,sp,#0x8
00a5c18c	sub x1,x29,#0x48
00a5c190	bl 0x00c36270
00a5c194	b 0x00a5c6dc
00a5c198	bl 0x00c342a0
00a5c19c	adrp x0,0x2a5000
00a5c1a0	adrp x2,0x2cf000
00a5c1a4	add x0,x0,#0xf9d
00a5c1a8	add x2,x2,#0xb79
00a5c1ac	mov w1,#0x450
00a5c1b0	bl 0x00c342b0
00a5c1b4	orr w0,wzr,#0x6
00a5c1b8	mov w1,#0x83
00a5c1bc	mov x2,xzr
00a5c1c0	bl 0x00c342c0
00a5c1c4	mov w21,wzr
00a5c1c8	mov w0,w21
00a5c1cc	ldp x29,x30,[sp, #0x120]
00a5c1d0	ldp x20,x19,[sp, #0x110]
00a5c1d4	ldp x22,x21,[sp, #0x100]
00a5c1d8	ldp x24,x23,[sp, #0xf0]
00a5c1dc	ldr x28,[sp, #0xe0]
00a5c1e0	add sp,sp,#0x130
00a5c1e4	ret
00a5c1e8	ldr x8,[x8, #0x50]
00a5c1ec	cbz x8,0x00a5c208
00a5c1f0	mov x0,x19
00a5c1f4	mov w1,w21
00a5c1f8	mov w2,w23
00a5c1fc	mov x3,x20
00a5c200	blr x8
00a5c204	b 0x00a5c700
00a5c208	bl 0x00c342a0
00a5c20c	adrp x0,0x2a5000
00a5c210	adrp x2,0x2cf000
00a5c214	add x0,x0,#0xf9d
00a5c218	add x2,x2,#0xb79
00a5c21c	mov w1,#0x506
00a5c220	bl 0x00c342b0
00a5c224	orr w0,wzr,#0x6
00a5c228	mov w1,#0x84
00a5c22c	b 0x00a5c1bc
00a5c230	mov w21,wzr
00a5c234	adrp x0,0x2bb000
00a5c238	add x0,x0,#0xc69
00a5c23c	add x8,sp,#0x8
00a5c240	sub x1,x29,#0x48
00a5c244	bl 0x00c36270
00a5c248	b 0x00a5c2a0
00a5c24c	mov w21,wzr
00a5c250	tbnz w23,#0x1f,0x00a5c1c4
00a5c254	adrp x0,0x2c7000
00a5c258	add x0,x0,#0x9d3
00a5c25c	add x8,sp,#0x8
00a5c260	sub x1,x29,#0x4c
00a5c264	stur w23,[x29, #-0x4c]
00a5c268	bl 0x00c37340
00a5c26c	b 0x00a5c2a0
00a5c270	adrp x0,0x2c9000
00a5c274	add x0,x0,#0x8ae
00a5c278	b 0x00a5c2e8
00a5c27c	tbz w23,#0x1f,0x00a5c340
00a5c280	b 0x00a5c1c4
00a5c284	mov w21,wzr
00a5c288	adrp x0,0x2c5000
00a5c28c	add x0,x0,#0xa75
00a5c290	add x8,sp,#0x8
00a5c294	mov x1,x20
00a5c298	mov x2,x22
00a5c29c	bl 0x00c34c50
00a5c2a0	ldr x8,[sp, #0x28]
00a5c2a4	ldur q0,[sp, #0x18]
00a5c2a8	ldur q1,[sp, #0x8]
00a5c2ac	add x2,sp,#0x30
00a5c2b0	str x8,[sp, #0x50]
00a5c2b4	stp q1,q0,[sp, #0x30]
00a5c2b8	ldr x0,[x19]
00a5c2bc	ldr x1,[x19, #0xa8]
00a5c2c0	cbnz w21,0x00a5c6fc
00a5c2c4	b 0x00a5c318
00a5c2c8	adrp x0,0x2d7000
00a5c2cc	add x0,x0,#0xec0
00a5c2d0	b 0x00a5c418
00a5c2d4	tbz w23,#0x1f,0x00a5c2e0
00a5c2d8	mov x22,xzr
00a5c2dc	stur xzr,[x29, #-0x48]
00a5c2e0	adrp x0,0x29e000
00a5c2e4	add x0,x0,#0x174
00a5c2e8	add x8,sp,#0x8
00a5c2ec	mov x1,x20
00a5c2f0	mov x2,x22
00a5c2f4	bl 0x00c34c50
00a5c2f8	ldr x8,[sp, #0x28]
00a5c2fc	ldur q0,[sp, #0x18]
00a5c300	ldur q1,[sp, #0x8]
00a5c304	add x2,sp,#0x30
00a5c308	str x8,[sp, #0x50]
00a5c30c	stp q1,q0,[sp, #0x30]
00a5c310	ldr x0,[x19]
00a5c314	ldr x1,[x19, #0xa8]
00a5c318	bl 0x00c3cd60
00a5c31c	b 0x00a5c700
00a5c320	sub w8,w23,#0x2
00a5c324	cmp w8,#0x6
00a5c328	mov w21,wzr
00a5c32c	b.hi 0x00a5c1c8
00a5c330	orr w8,wzr,#0xf
00a5c334	sub w8,w8,w23
00a5c338	sxtw x8,w8
00a5c33c	stur x8,[x29, #-0x48]
00a5c340	adrp x0,0x2c3000
00a5c344	add x0,x0,#0x9bc
00a5c348	add x8,sp,#0x8
00a5c34c	sub x1,x29,#0x48
00a5c350	bl 0x00c36270
00a5c354	ldr x8,[sp, #0x28]
00a5c358	ldur q0,[sp, #0x18]
00a5c35c	ldur q1,[sp, #0x8]
00a5c360	mov w9,#0xffffffff
00a5c364	str x8,[sp, #0x50]
00a5c368	stp q1,q0,[sp, #0x30]
00a5c36c	str w9,[x19, #0x6c]
00a5c370	b 0x00a5c6f0
00a5c374	adrp x0,0x2c3000
00a5c378	add x0,x0,#0x9c2
00a5c37c	add x8,sp,#0x8
00a5c380	mov x1,x20
00a5c384	mov x2,x22
00a5c388	bl 0x00c34c50
00a5c38c	ldr x8,[sp, #0x28]
00a5c390	ldur q0,[sp, #0x18]
00a5c394	ldur q1,[sp, #0x8]
00a5c398	add x2,sp,#0x30
00a5c39c	str x8,[sp, #0x50]
00a5c3a0	stp q1,q0,[sp, #0x30]
00a5c3a4	ldr x0,[x19]
00a5c3a8	ldr x1,[x19, #0xa8]
00a5c3ac	bl 0x00c3cd70
00a5c3b0	cmp w0,#0x1
00a5c3b4	b.lt 0x00a5c700
00a5c3b8	adrp x0,0x2d1000
00a5c3bc	add x0,x0,#0xa00
00a5c3c0	add x8,sp,#0x8
00a5c3c4	sub x1,x29,#0x48
00a5c3c8	bl 0x00c36270
00a5c3cc	ldr x8,[sp, #0x28]
00a5c3d0	ldur q0,[sp, #0x18]
00a5c3d4	ldur q1,[sp, #0x8]
00a5c3d8	add x2,sp,#0x30
00a5c3dc	str x8,[sp, #0x50]
00a5c3e0	stp q1,q0,[sp, #0x30]
00a5c3e4	ldr x0,[x19]
00a5c3e8	ldr x1,[x19, #0xa8]
00a5c3ec	bl 0x00c3cd60
00a5c3f0	cmp w0,#0x1
00a5c3f4	b.ge 0x00a5c6b8
00a5c3f8	b 0x00a5c700
00a5c3fc	tbnz w23,#0x1f,0x00a5c73c
00a5c400	adrp x0,0x2cd000
00a5c404	add x0,x0,#0xa64
00a5c408	b 0x00a5c418
00a5c40c	tbnz w23,#0x1f,0x00a5c1c4
00a5c410	adrp x0,0x2a0000
00a5c414	add x0,x0,#0x23d
00a5c418	add x8,sp,#0x8
00a5c41c	mov x1,x20
00a5c420	mov x2,x22
00a5c424	bl 0x00c34c50
00a5c428	b 0x00a5c6dc
00a5c42c	cmp w23,#0x20
00a5c430	mov w21,wzr
00a5c434	b.lt 0x00a5c1c8
00a5c438	ldp x1,x2,[x20, #0x8]
00a5c43c	adrp x0,0x2af000
00a5c440	add x0,x0,#0xf52
00a5c444	add x8,sp,#0x8
00a5c448	bl 0x00c34c50
00a5c44c	ldr x8,[sp, #0x28]
00a5c450	ldur q0,[sp, #0x18]
00a5c454	ldur q1,[sp, #0x8]
00a5c458	add x20,x20,#0x18
00a5c45c	adrp x0,0x2a7000
00a5c460	str x8,[sp, #0x50]
00a5c464	add x0,x0,#0xf70
00a5c468	add x8,sp,#0x8
00a5c46c	mov x1,x20
00a5c470	add x22,sp,#0x30
00a5c474	stp q1,q0,[sp, #0x30]
00a5c478	bl 0x00c37340
00a5c47c	ldr x8,[sp, #0x28]
00a5c480	ldur q0,[sp, #0x18]
00a5c484	ldur q1,[sp, #0x8]
00a5c488	add x2,sp,#0x30
00a5c48c	str x8,[sp, #0x78]
00a5c490	stur q0,[sp, #0x68]
00a5c494	stur q1,[sp, #0x58]
00a5c498	ldr x0,[x19]
00a5c49c	ldr x1,[x19, #0xa8]
00a5c4a0	bl 0x00c3cd70
00a5c4a4	cmp w0,#0x1
00a5c4a8	b.lt 0x00a5c734
00a5c4ac	adrp x0,0x2c9000
00a5c4b0	add x0,x0,#0x8b6
00a5c4b4	add x8,sp,#0x8
00a5c4b8	sub x1,x29,#0x48
00a5c4bc	add x21,x22,#0x28
00a5c4c0	bl 0x00c36270
00a5c4c4	ldr x8,[sp, #0x28]
00a5c4c8	ldur q0,[sp, #0x18]
00a5c4cc	ldur q1,[sp, #0x8]
00a5c4d0	adrp x0,0x2a7000
00a5c4d4	str x8,[sp, #0x50]
00a5c4d8	add x0,x0,#0xf70
00a5c4dc	add x8,sp,#0x8
00a5c4e0	mov x1,x20
00a5c4e4	stp q1,q0,[sp, #0x30]
00a5c4e8	bl 0x00c37340
00a5c4ec	ldr x8,[sp, #0x28]
00a5c4f0	ldur q0,[sp, #0x8]
00a5c4f4	ldur q1,[sp, #0x18]
00a5c4f8	str x8,[x21, #0x20]
00a5c4fc	add x8,sp,#0x8
00a5c500	stp q0,q1,[x21]
00a5c504	bl 0x00c34c40
00a5c508	ldr x8,[sp, #0x28]
00a5c50c	ldur q0,[sp, #0x18]
00a5c510	ldur q1,[sp, #0x8]
00a5c514	add x2,sp,#0x30
00a5c518	str x8,[sp, #0xa0]
00a5c51c	str q0,[x24, #0x60]
00a5c520	str q1,[sp, #0x80]
00a5c524	b 0x00a5c6a4
00a5c528	ldr x1,[x20]
00a5c52c	ldr x2,[x20, #0x10]
00a5c530	adrp x0,0x2c3000
00a5c534	add x0,x0,#0x9c9
00a5c538	add x8,sp,#0x8
00a5c53c	bl 0x00c34c50
00a5c540	ldr x8,[sp, #0x28]
00a5c544	ldur q0,[sp, #0x18]
00a5c548	ldur q1,[sp, #0x8]
00a5c54c	adrp x0,0x2cb000
00a5c550	str x8,[sp, #0x50]
00a5c554	add x0,x0,#0x947
00a5c558	stp q1,q0,[sp, #0x30]
00a5c55c	ldp x1,x2,[x20, #0x8]
00a5c560	add x8,sp,#0x8
00a5c564	add x22,sp,#0x30
00a5c568	bl 0x00c34c50
00a5c56c	ldr x8,[sp, #0x28]
00a5c570	ldur q0,[sp, #0x18]
00a5c574	ldur q1,[sp, #0x8]
00a5c578	adrp x0,0x2a7000
00a5c57c	str x8,[sp, #0x78]
00a5c580	add x1,x20,#0x18
00a5c584	add x0,x0,#0xf70
00a5c588	add x8,sp,#0x8
00a5c58c	stur q0,[sp, #0x68]
00a5c590	stur q1,[sp, #0x58]
00a5c594	bl 0x00c37340
00a5c598	ldr x8,[sp, #0x28]
00a5c59c	ldur q0,[sp, #0x18]
00a5c5a0	ldur q1,[sp, #0x8]
00a5c5a4	add x2,sp,#0x30
00a5c5a8	str x8,[sp, #0xa0]
00a5c5ac	str q0,[x24, #0x60]
00a5c5b0	str q1,[sp, #0x80]
00a5c5b4	ldr x0,[x19]
00a5c5b8	ldr x1,[x19, #0xa8]
00a5c5bc	bl 0x00c3cd70
00a5c5c0	cmp w0,#0x1
00a5c5c4	b.lt 0x00a5c734
00a5c5c8	adrp x0,0x2b9000
00a5c5cc	add x0,x0,#0xdf0
00a5c5d0	add x8,sp,#0x8
00a5c5d4	sub x1,x29,#0x48
00a5c5d8	add x20,x22,#0x28
00a5c5dc	bl 0x00c36270
00a5c5e0	ldr x8,[sp, #0x28]
00a5c5e4	ldur q0,[sp, #0x18]
00a5c5e8	ldur q1,[sp, #0x8]
00a5c5ec	str x8,[sp, #0x50]
00a5c5f0	add x8,sp,#0x8
00a5c5f4	stp q1,q0,[sp, #0x30]
00a5c5f8	bl 0x00c34c40
00a5c5fc	ldr x8,[sp, #0x28]
00a5c600	ldur q0,[sp, #0x8]
00a5c604	ldur q1,[sp, #0x18]
00a5c608	add x2,sp,#0x30
00a5c60c	str x8,[x20, #0x20]
00a5c610	stp q0,q1,[x20]
00a5c614	b 0x00a5c6a4
00a5c618	adrp x0,0x2ad000
00a5c61c	add x0,x0,#0xc83
00a5c620	add x8,sp,#0x8
00a5c624	sub x1,x29,#0x48
00a5c628	bl 0x00c36270
00a5c62c	ldr x8,[sp, #0x28]
00a5c630	ldur q0,[sp, #0x18]
00a5c634	ldur q1,[sp, #0x8]
00a5c638	add x2,sp,#0x30
00a5c63c	str x8,[sp, #0x50]
00a5c640	stp q1,q0,[sp, #0x30]
00a5c644	ldr x0,[x19]
00a5c648	ldr x1,[x19, #0xa8]
00a5c64c	bl 0x00c3cd70
00a5c650	cmp w0,#0x1
00a5c654	b.lt 0x00a5c1c4
00a5c658	adrp x0,0x2b9000
00a5c65c	add x0,x0,#0xddd
00a5c660	add x8,sp,#0x8
00a5c664	sub x1,x29,#0x48
00a5c668	bl 0x00c36270
00a5c66c	ldr x8,[sp, #0x28]
00a5c670	ldur q0,[sp, #0x18]
00a5c674	ldur q1,[sp, #0x8]
00a5c678	str x8,[sp, #0x50]
00a5c67c	add x8,sp,#0x8
00a5c680	stp q1,q0,[sp, #0x30]
00a5c684	bl 0x00c34c40
00a5c688	ldr x8,[sp, #0x28]
00a5c68c	ldur q0,[sp, #0x18]
00a5c690	ldur q1,[sp, #0x8]
00a5c694	add x2,sp,#0x30
00a5c698	str x8,[sp, #0x78]
00a5c69c	stur q0,[sp, #0x68]
00a5c6a0	stur q1,[sp, #0x58]
00a5c6a4	ldr x0,[x19]
00a5c6a8	ldr x1,[x19, #0xa8]
00a5c6ac	bl 0x00c3cd60
00a5c6b0	cmp w0,#0x1
00a5c6b4	b.lt 0x00a5c1c4
00a5c6b8	ldur w21,[x29, #-0x48]
00a5c6bc	b 0x00a5c1c8
00a5c6c0	tbnz w23,#0x1f,0x00a5c1c4
00a5c6c4	adrp x0,0x2af000
00a5c6c8	add x0,x0,#0xf4c
00a5c6cc	add x8,sp,#0x8
00a5c6d0	sub x1,x29,#0x4c
00a5c6d4	stur w23,[x29, #-0x4c]
00a5c6d8	bl 0x00c37340
00a5c6dc	ldr x8,[sp, #0x28]
00a5c6e0	ldur q0,[sp, #0x18]
00a5c6e4	ldur q1,[sp, #0x8]
00a5c6e8	str x8,[sp, #0x50]
00a5c6ec	stp q1,q0,[sp, #0x30]
00a5c6f0	ldr x0,[x19]
00a5c6f4	ldr x1,[x19, #0xa8]
00a5c6f8	add x2,sp,#0x30
00a5c6fc	bl 0x00c3cd70
00a5c700	mov w21,w0
00a5c704	cmn w0,#0x1
00a5c708	b.ne 0x00a5c1c8
00a5c70c	bl 0x00c342a0
00a5c710	adrp x0,0x2a5000
00a5c714	adrp x2,0x2cf000
00a5c718	add x0,x0,#0xf9d
00a5c71c	add x2,x2,#0xb79
00a5c720	mov w1,#0x50e
00a5c724	bl 0x00c342b0
00a5c728	orr w0,wzr,#0x6
00a5c72c	mov w1,#0x85
00a5c730	b 0x00a5c1bc
00a5c734	mov w21,w0
00a5c738	b 0x00a5c1c8
00a5c73c	mov w21,#0xffffffff
00a5c740	b 0x00a5c1c8
