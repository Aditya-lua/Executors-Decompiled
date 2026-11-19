; FUN_00bea2fc @ 00bea2fc
00bea2fc	paciasp
00bea300	stp x29,x30,[sp, #-0x50]!
00bea304	stp x26,x25,[sp, #0x10]
00bea308	stp x24,x23,[sp, #0x20]
00bea30c	stp x22,x21,[sp, #0x30]
00bea310	stp x20,x19,[sp, #0x40]
00bea314	mov x29,sp
00bea318	mov x21,x0
00bea31c	ldr x0,[x0]
00bea320	mov w22,w4
00bea324	mov x23,x3
00bea328	mov x19,x2
00bea32c	mov x20,x1
00bea330	cbz x0,0x00bea380
00bea334	ldp x8,x9,[x0, #0x18]
00bea338	cmp x8,x9
00bea33c	b.eq 0x00bea34c
00bea340	mov w24,wzr
00bea344	cbnz x20,0x00bea388
00bea348	b 0x00bea370
00bea34c	ldr x8,[x0]
00bea350	ldr x8,[x8, #0x48]
00bea354	blr x8
00bea358	cmn w0,#0x1
00bea35c	b.eq 0x00bea37c
00bea360	ldr x8,[x21]
00bea364	cmp x8,#0x0
00bea368	cset w24,eq
00bea36c	cbnz x20,0x00bea388
00bea370	tbnz w24,#0x0,0x00bea3d8
00bea374	mov x20,xzr
00bea378	b 0x00bea398
00bea37c	str xzr,[x21]
00bea380	mov w24,#0x1
00bea384	cbz x20,0x00bea370
00bea388	ldp x8,x9,[x20, #0x18]
00bea38c	cmp x8,x9
00bea390	b.eq 0x00bea3b4
00bea394	tbz w24,#0x0,0x00bea3d8
00bea398	ldr x0,[x21]
00bea39c	ldp x8,x9,[x0, #0x18]
00bea3a0	cmp x8,x9
00bea3a4	b.eq 0x00bea3e4
00bea3a8	ldrb w1,[x8]
00bea3ac	tbz w1,#0x7,0x00bea3f8
00bea3b0	b 0x00bea408
00bea3b4	ldr x8,[x20]
00bea3b8	mov x0,x20
00bea3bc	ldr x8,[x8, #0x48]
00bea3c0	blr x8
00bea3c4	cmn w0,#0x1
00bea3c8	cset w8,eq
00bea3cc	csel x20,xzr,x20,eq
00bea3d0	cmp w24,w8
00bea3d4	b.ne 0x00bea398
00bea3d8	mov w24,wzr
00bea3dc	mov w8,#0x6
00bea3e0	b 0x00bea410
00bea3e4	ldr x8,[x0]
00bea3e8	ldr x8,[x8, #0x48]
00bea3ec	blr x8
00bea3f0	mov w1,w0
00bea3f4	tbnz w1,#0x7,0x00bea408
00bea3f8	ldr x8,[x23, #0x10]
00bea3fc	and x9,x1,#0xff
00bea400	ldr x8,[x8, x9, LSL #0x3]
00bea404	tbnz w8,#0x6,0x00bea43c
00bea408	mov w24,wzr
00bea40c	mov w8,#0x4
00bea410	ldr w9,[x19]
00bea414	orr w8,w9,w8
00bea418	str w8,[x19]
00bea41c	mov w0,w24
00bea420	ldp x20,x19,[sp, #0x40]
00bea424	ldp x22,x21,[sp, #0x30]
00bea428	ldp x24,x23,[sp, #0x20]
00bea42c	ldp x26,x25,[sp, #0x10]
00bea430	ldp x29,x30,[sp], #0x50
00bea434	autiasp
00bea438	ret
00bea43c	ldr x8,[x23]
00bea440	mov x0,x23
00bea444	mov w2,wzr
00bea448	ldr x8,[x8, #0x48]
00bea44c	blr x8
00bea450	mov w8,w0
00bea454	ldr x0,[x21]
00bea458	and w24,w8,#0xff
00bea45c	ldp x9,x10,[x0, #0x18]
00bea460	cmp x9,x10
00bea464	b.eq 0x00bea474
00bea468	add x8,x9,#0x1
00bea46c	str x8,[x0, #0x18]
00bea470	b 0x00bea480
00bea474	ldr x8,[x0]
00bea478	ldr x8,[x8, #0x50]
00bea47c	blr x8
00bea480	mov w26,#0xa
00bea484	b 0x00bea4a4
00bea488	ldr x9,[x8]
00bea48c	mov x0,x8
00bea490	ldr x9,[x9, #0x50]
00bea494	blr x9
00bea498	mul w8,w24,w26
00bea49c	sub w22,w22,#0x1
00bea4a0	add w24,w8,w25, UXTB 
00bea4a4	ldr x0,[x21]
00bea4a8	cbz x0,0x00bea4f4
00bea4ac	ldp x8,x9,[x0, #0x18]
00bea4b0	cmp x8,x9
00bea4b4	b.eq 0x00bea4c4
00bea4b8	mov w25,wzr
00bea4bc	cbnz x20,0x00bea4fc
00bea4c0	b 0x00bea4e8
00bea4c4	ldr x8,[x0]
00bea4c8	ldr x8,[x8, #0x48]
00bea4cc	blr x8
00bea4d0	cmn w0,#0x1
00bea4d4	b.eq 0x00bea4f0
00bea4d8	ldr x8,[x21]
00bea4dc	cmp x8,#0x0
00bea4e0	cset w25,eq
00bea4e4	cbnz x20,0x00bea4fc
00bea4e8	mov w8,#0x1
00bea4ec	b 0x00bea52c
00bea4f0	str xzr,[x21]
00bea4f4	mov w25,#0x1
00bea4f8	cbz x20,0x00bea4e8
00bea4fc	ldp x8,x9,[x20, #0x18]
00bea500	cmp x8,x9
00bea504	b.eq 0x00bea510
00bea508	mov w8,wzr
00bea50c	b 0x00bea52c
00bea510	ldr x8,[x20]
00bea514	mov x0,x20
00bea518	ldr x8,[x8, #0x48]
00bea51c	blr x8
00bea520	cmn w0,#0x1
00bea524	cset w8,eq
00bea528	csel x20,xzr,x20,eq
00bea52c	ldr x0,[x21]
00bea530	cmp w25,w8
00bea534	sub w24,w24,#0x30
00bea538	b.eq 0x00bea5b4
00bea53c	cmp w22,#0x2
00bea540	b.lt 0x00bea5b4
00bea544	ldp x8,x9,[x0, #0x18]
00bea548	cmp x8,x9
00bea54c	b.eq 0x00bea55c
00bea550	ldrb w1,[x8]
00bea554	tbz w1,#0x7,0x00bea570
00bea558	b 0x00bea41c
00bea55c	ldr x8,[x0]
00bea560	ldr x8,[x8, #0x48]
00bea564	blr x8
00bea568	mov w1,w0
00bea56c	tbnz w1,#0x7,0x00bea41c
00bea570	ldr x8,[x23, #0x10]
00bea574	and x9,x1,#0xff
00bea578	ldr x8,[x8, x9, LSL #0x3]
00bea57c	tbz w8,#0x6,0x00bea41c
00bea580	ldr x8,[x23]
00bea584	mov x0,x23
00bea588	mov w2,wzr
00bea58c	ldr x8,[x8, #0x48]
00bea590	blr x8
00bea594	ldr x8,[x21]
00bea598	mov w25,w0
00bea59c	ldp x9,x10,[x8, #0x18]
00bea5a0	cmp x9,x10
00bea5a4	b.eq 0x00bea488
00bea5a8	add x9,x9,#0x1
00bea5ac	str x9,[x8, #0x18]
00bea5b0	b 0x00bea498
00bea5b4	cbz x0,0x00bea5f4
00bea5b8	ldp x8,x9,[x0, #0x18]
00bea5bc	cmp x8,x9
00bea5c0	b.eq 0x00bea5cc
00bea5c4	mov w21,wzr
00bea5c8	b 0x00bea5f8
00bea5cc	ldr x8,[x0]
00bea5d0	ldr x8,[x8, #0x48]
00bea5d4	blr x8
00bea5d8	cmn w0,#0x1
00bea5dc	b.eq 0x00bea5f0
00bea5e0	ldr x8,[x21]
00bea5e4	cmp x8,#0x0
00bea5e8	cset w21,eq
00bea5ec	b 0x00bea5f8
00bea5f0	str xzr,[x21]
00bea5f4	mov w21,#0x1
00bea5f8	cbz x20,0x00bea610
00bea5fc	ldp x8,x9,[x20, #0x18]
00bea600	cmp x8,x9
00bea604	b.eq 0x00bea618
00bea608	tbnz w21,#0x0,0x00bea41c
00bea60c	b 0x00bea638
00bea610	tbz w21,#0x0,0x00bea41c
00bea614	b 0x00bea638
00bea618	ldr x8,[x20]
00bea61c	mov x0,x20
00bea620	ldr x8,[x8, #0x48]
00bea624	blr x8
00bea628	cmn w0,#0x1
00bea62c	cset w8,eq
00bea630	eor w8,w21,w8
00bea634	tbnz w8,#0x0,0x00bea41c
00bea638	mov w8,#0x2
00bea63c	b 0x00bea410
