; FUN_00afa314 @ 00afa314
00afa314	stp x28,x27,[sp, #-0x60]!
00afa318	stp x20,x19,[sp, #0x40]
00afa31c	mov x19,x0
00afa320	stp x26,x25,[sp, #0x10]
00afa324	stp x24,x23,[sp, #0x20]
00afa328	stp x22,x21,[sp, #0x30]
00afa32c	stp x29,x30,[sp, #0x50]
00afa330	add x29,sp,#0x50
00afa334	cbz x1,0x00afa6e4
00afa338	mov x0,x1
00afa33c	mov x22,x2
00afa340	mov x21,x1
00afa344	bl 0x00c325e0
00afa348	cmp w0,#0x1
00afa34c	b.lt 0x00afa6e4
00afa350	cbnz x19,0x00afa35c
00afa354	mov w0,wzr
00afa358	cbz x22,0x00afa738
00afa35c	cbz x19,0x00afa368
00afa360	ldr x8,[x19, #0x38]
00afa364	cbz x8,0x00afa6e8
00afa368	cbz x22,0x00afa378
00afa36c	mov x20,xzr
00afa370	mov w26,#0xffffffff
00afa374	b 0x00afa394
00afa378	mov x0,x21
00afa37c	mov w1,wzr
00afa380	bl 0x00c32610
00afa384	ldr x22,[x0, #0x130]
00afa388	cbz x22,0x00afa418
00afa38c	mov x20,x0
00afa390	mov w26,wzr
00afa394	ldr x0,[x22]
00afa398	bl 0x00af94bc
00afa39c	cbz w0,0x00afa3bc
00afa3a0	ldr x0,[x22, #0x8]
00afa3a4	bl 0x00af94bc
00afa3a8	cbz w0,0x00afa3bc
00afa3ac	mov w23,#0x1
00afa3b0	ldr x8,[x22]
00afa3b4	cbnz x8,0x00afa3ec
00afa3b8	b 0x00afa410
00afa3bc	cbz x19,0x00afa734
00afa3c0	ldr x9,[x19, #0x38]
00afa3c4	mov w8,#0x29
00afa3c8	mov w0,wzr
00afa3cc	mov x1,x19
00afa3d0	stp w26,w8,[x19, #0xac]
00afa3d4	str x20,[x19, #0xb8]
00afa3d8	blr x9
00afa3dc	mov w23,w0
00afa3e0	cbz w0,0x00afa738
00afa3e4	ldr x8,[x22]
00afa3e8	cbz x8,0x00afa410
00afa3ec	ldr w9,[x8]
00afa3f0	cmp w9,#0x1
00afa3f4	b.eq 0x00afa420
00afa3f8	cbnz w9,0x00afa410
00afa3fc	mov x24,xzr
00afa400	mov w28,#0x1
00afa404	ldr x8,[x22, #0x8]
00afa408	cbnz x8,0x00afa430
00afa40c	b 0x00afa44c
00afa410	mov x24,xzr
00afa414	b 0x00afa424
00afa418	mov w0,#0x1
00afa41c	b 0x00afa738
00afa420	ldr x24,[x8, #0x8]
00afa424	mov w28,wzr
00afa428	ldr x8,[x22, #0x8]
00afa42c	cbz x8,0x00afa44c
00afa430	ldr w9,[x8]
00afa434	cmp w9,#0x1
00afa438	b.eq 0x00afa454
00afa43c	cbnz w9,0x00afa44c
00afa440	mov x25,xzr
00afa444	mov w27,#0x1
00afa448	b 0x00afa45c
00afa44c	mov x25,xzr
00afa450	b 0x00afa458
00afa454	ldr x25,[x8, #0x8]
00afa458	mov w27,wzr
00afa45c	add w22,w26,#0x1
00afa460	b 0x00afa468
00afa464	add w22,w22,#0x1
00afa468	mov x0,x21
00afa46c	bl 0x00c325e0
00afa470	cmp w22,w0
00afa474	b.ge 0x00afa678
00afa478	mov x0,x21
00afa47c	mov w1,w22
00afa480	bl 0x00c32610
00afa484	cbz x0,0x00afa6e4
00afa488	ldr x26,[x0, #0x130]
00afa48c	mov x20,x0
00afa490	cbz x26,0x00afa550
00afa494	ldr x0,[x26]
00afa498	bl 0x00af94bc
00afa49c	cbz w0,0x00afa4ac
00afa4a0	ldr x0,[x26, #0x8]
00afa4a4	bl 0x00af94bc
00afa4a8	cbnz w0,0x00afa4d4
00afa4ac	cbz x19,0x00afa734
00afa4b0	ldr x8,[x19, #0x38]
00afa4b4	mov w9,#0x29
00afa4b8	mov w0,wzr
00afa4bc	mov x1,x19
00afa4c0	stp w22,w9,[x19, #0xac]
00afa4c4	str x20,[x19, #0xb8]
00afa4c8	blr x8
00afa4cc	mov w23,w0
00afa4d0	cbz w0,0x00afa738
00afa4d4	ldr x8,[x20, #0x130]
00afa4d8	ldr x9,[x8]
00afa4dc	cbz x24,0x00afa51c
00afa4e0	cbnz x9,0x00afa51c
00afa4e4	cbz x19,0x00afa734
00afa4e8	ldr x8,[x19, #0x38]
00afa4ec	mov w9,#0x2e
00afa4f0	mov w0,wzr
00afa4f4	mov x1,x19
00afa4f8	stp w22,w9,[x19, #0xac]
00afa4fc	str x20,[x19, #0xb8]
00afa500	blr x8
00afa504	cbz w0,0x00afa738
00afa508	ldr x8,[x20, #0x130]
00afa50c	mov w23,w0
00afa510	mov x24,xzr
00afa514	mov w28,wzr
00afa518	ldr x9,[x8]
00afa51c	cbz x9,0x00afa5c4
00afa520	ldr w10,[x9]
00afa524	cmp w10,#0x1
00afa528	b.ne 0x00afa5c4
00afa52c	cbnz w28,0x00afa548
00afa530	ldr x0,[x9, #0x8]
00afa534	mov x1,x24
00afa538	bl 0x00afa190
00afa53c	cbz w0,0x00afa594
00afa540	ldr x8,[x20, #0x130]
00afa544	ldr x9,[x8]
00afa548	ldr x24,[x9, #0x8]
00afa54c	b 0x00afa5c0
00afa550	orr x8,x24,x25
00afa554	cbz x8,0x00afa584
00afa558	cbz x19,0x00afa734
00afa55c	ldr x8,[x19, #0x38]
00afa560	mov w9,#0x2e
00afa564	mov w0,wzr
00afa568	mov x1,x19
00afa56c	stp w22,w9,[x19, #0xac]
00afa570	str x20,[x19, #0xb8]
00afa574	blr x8
00afa578	mov w23,w0
00afa57c	cbnz w0,0x00afa464
00afa580	b 0x00afa738
00afa584	mov x24,xzr
00afa588	mov x25,xzr
00afa58c	add w22,w22,#0x1
00afa590	b 0x00afa468
00afa594	cbz x19,0x00afa734
00afa598	ldr x8,[x19, #0x38]
00afa59c	mov w9,#0x2e
00afa5a0	mov w0,wzr
00afa5a4	mov x1,x19
00afa5a8	stp w22,w9,[x19, #0xac]
00afa5ac	str x20,[x19, #0xb8]
00afa5b0	blr x8
00afa5b4	cbz w0,0x00afa738
00afa5b8	ldr x8,[x20, #0x130]
00afa5bc	mov w23,w0
00afa5c0	mov w28,wzr
00afa5c4	ldr x8,[x8, #0x8]
00afa5c8	cbz x25,0x00afa608
00afa5cc	cbnz x8,0x00afa608
00afa5d0	cbz x19,0x00afa734
00afa5d4	ldr x8,[x19, #0x38]
00afa5d8	mov w9,#0x2e
00afa5dc	mov w0,wzr
00afa5e0	mov x1,x19
00afa5e4	stp w22,w9,[x19, #0xac]
00afa5e8	str x20,[x19, #0xb8]
00afa5ec	blr x8
00afa5f0	cbz w0,0x00afa738
00afa5f4	ldr x8,[x20, #0x130]
00afa5f8	mov w23,w0
00afa5fc	mov x25,xzr
00afa600	mov w27,wzr
00afa604	ldr x8,[x8, #0x8]
00afa608	cbz x8,0x00afa464
00afa60c	ldr w9,[x8]
00afa610	cmp w9,#0x1
00afa614	b.ne 0x00afa464
00afa618	cbnz w27,0x00afa634
00afa61c	ldr x0,[x8, #0x8]
00afa620	mov x1,x25
00afa624	bl 0x00afa190
00afa628	cbz w0,0x00afa644
00afa62c	ldr x8,[x20, #0x130]
00afa630	ldr x8,[x8, #0x8]
00afa634	ldr x25,[x8, #0x8]
00afa638	mov w27,wzr
00afa63c	add w22,w22,#0x1
00afa640	b 0x00afa468
00afa644	cbz x19,0x00afa734
00afa648	ldr x8,[x19, #0x38]
00afa64c	mov w9,#0x2e
00afa650	mov w0,wzr
00afa654	mov x1,x19
00afa658	stp w22,w9,[x19, #0xac]
00afa65c	str x20,[x19, #0xb8]
00afa660	blr x8
00afa664	mov w23,w0
00afa668	mov w27,wzr
00afa66c	mov w0,wzr
00afa670	cbnz w23,0x00afa464
00afa674	b 0x00afa738
00afa678	cbz x20,0x00afa6e4
00afa67c	ldr x8,[x20, #0x130]
00afa680	cbz x8,0x00afa72c
00afa684	ldr x9,[x8]
00afa688	cbz x9,0x00afa694
00afa68c	ldr w9,[x9]
00afa690	cbz w9,0x00afa6f8
00afa694	ldr x8,[x8, #0x8]
00afa698	cbz x8,0x00afa72c
00afa69c	ldr w8,[x8]
00afa6a0	cmp w8,#0x0
00afa6a4	csel w0,w23,wzr,ne
00afa6a8	cbnz w8,0x00afa738
00afa6ac	cbz x19,0x00afa738
00afa6b0	mov w8,#0x2e
00afa6b4	stp w22,w8,[x19, #0xac]
00afa6b8	str x20,[x19, #0xb8]
00afa6bc	ldr x2,[x19, #0x38]
00afa6c0	mov x1,x19
00afa6c4	ldp x29,x30,[sp, #0x50]
00afa6c8	ldp x20,x19,[sp, #0x40]
00afa6cc	ldp x22,x21,[sp, #0x30]
00afa6d0	ldp x24,x23,[sp, #0x20]
00afa6d4	ldp x26,x25,[sp, #0x10]
00afa6d8	mov w0,wzr
00afa6dc	ldp x28,x27,[sp], #0x60
00afa6e0	br x2
00afa6e4	cbz x19,0x00afa734
00afa6e8	mov w8,#0x1
00afa6ec	mov w0,wzr
00afa6f0	str w8,[x19, #0xb0]
00afa6f4	b 0x00afa738
00afa6f8	cbz x19,0x00afa734
00afa6fc	ldr x9,[x19, #0x38]
00afa700	mov w8,#0x2e
00afa704	mov w0,wzr
00afa708	mov x1,x19
00afa70c	stp w22,w8,[x19, #0xac]
00afa710	str x20,[x19, #0xb8]
00afa714	blr x9
00afa718	cbz w0,0x00afa738
00afa71c	ldr x8,[x20, #0x130]
00afa720	mov w23,w0
00afa724	ldr x8,[x8, #0x8]
00afa728	cbnz x8,0x00afa69c
00afa72c	mov w0,w23
00afa730	b 0x00afa738
00afa734	mov w0,wzr
00afa738	ldp x29,x30,[sp, #0x50]
00afa73c	ldp x20,x19,[sp, #0x40]
00afa740	ldp x22,x21,[sp, #0x30]
00afa744	ldp x24,x23,[sp, #0x20]
00afa748	ldp x26,x25,[sp, #0x10]
00afa74c	ldp x28,x27,[sp], #0x60
00afa750	ret
