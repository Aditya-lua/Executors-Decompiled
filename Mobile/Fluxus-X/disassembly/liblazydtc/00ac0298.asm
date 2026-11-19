; PKCS7_dataFinal @ 00ac0298
00ac0298	sub sp,sp,#0xc0
00ac029c	stp x28,x27,[sp, #0x60]
00ac02a0	stp x26,x25,[sp, #0x70]
00ac02a4	stp x24,x23,[sp, #0x80]
00ac02a8	stp x22,x21,[sp, #0x90]
00ac02ac	stp x20,x19,[sp, #0xa0]
00ac02b0	stp x29,x30,[sp, #0xb0]
00ac02b4	add x29,sp,#0xb0
00ac02b8	cbz x0,0x00ac0314
00ac02bc	mov x20,x1
00ac02c0	mov x21,x0
00ac02c4	bl 0x00c3f7f0
00ac02c8	ldr x8,[x21, #0x20]
00ac02cc	cbz x8,0x00ac033c
00ac02d0	mov x23,x0
00ac02d4	bl 0x00c31fa0
00ac02d8	cbz x0,0x00ac0364
00ac02dc	mov x19,x0
00ac02e0	ldr x0,[x21, #0x18]
00ac02e4	bl 0x00c37750
00ac02e8	sub w8,w0,#0x15
00ac02ec	cmp w8,#0x4
00ac02f0	str wzr,[x21, #0x10]
00ac02f4	b.hi 0x00ac039c
00ac02f8	adrp x9,0x774000
00ac02fc	add x9,x9,#0x54c
00ac0300	ldrsw x8,[x9, x8, LSL #0x2]
00ac0304	add x8,x8,x9
00ac0308	br x8
00ac030c	ldr x25,[x21, #0x20]
00ac0310	b 0x00ac0744
00ac0314	bl 0x00c342a0
00ac0318	adrp x0,0x29e000
00ac031c	adrp x2,0x2c8000
00ac0320	add x0,x0,#0x913
00ac0324	add x2,x2,#0x108
00ac0328	mov w1,#0x2e4
00ac032c	bl 0x00c342b0
00ac0330	mov w0,#0x21
00ac0334	mov w1,#0x8f
00ac0338	b 0x00ac038c
00ac033c	bl 0x00c342a0
00ac0340	adrp x0,0x29e000
00ac0344	adrp x2,0x2c8000
00ac0348	add x0,x0,#0x913
00ac034c	add x2,x2,#0x108
00ac0350	mov w1,#0x2eb
00ac0354	bl 0x00c342b0
00ac0358	mov w0,#0x21
00ac035c	mov w1,#0x7a
00ac0360	b 0x00ac038c
00ac0364	bl 0x00c342a0
00ac0368	adrp x0,0x29e000
00ac036c	adrp x2,0x2c8000
00ac0370	add x0,x0,#0x913
00ac0374	add x2,x2,#0x108
00ac0378	mov w1,#0x2f1
00ac037c	bl 0x00c342b0
00ac0380	mov w1,#0x100
00ac0384	mov w0,#0x21
00ac0388	movk w1,#0xc, LSL #16
00ac038c	mov x2,xzr
00ac0390	bl 0x00c342c0
00ac0394	mov w20,wzr
00ac0398	b 0x00ac08c8
00ac039c	bl 0x00c342a0
00ac03a0	adrp x0,0x29e000
00ac03a4	adrp x2,0x2c8000
00ac03a8	add x0,x0,#0x913
00ac03ac	add x2,x2,#0x108
00ac03b0	mov w1,#0x32b
00ac03b4	bl 0x00c342b0
00ac03b8	mov w0,#0x21
00ac03bc	orr w1,wzr,#0x70
00ac03c0	b 0x00ac08b4
00ac03c4	ldr x8,[x21, #0x20]
00ac03c8	ldp x24,x22,[x8, #0x20]
00ac03cc	ldr x0,[x22, #0x18]
00ac03d0	bl 0x00c37750
00ac03d4	cmp w0,#0x15
00ac03d8	b.ne 0x00ac0460
00ac03dc	ldr x25,[x22, #0x20]
00ac03e0	b 0x00ac050c
00ac03e4	ldr x8,[x21, #0x20]
00ac03e8	ldr x8,[x8, #0x10]
00ac03ec	ldr x25,[x8, #0x10]
00ac03f0	cbnz x25,0x00ac0744
00ac03f4	bl 0x00c38170
00ac03f8	cbz x0,0x00ac04d0
00ac03fc	ldr x8,[x21, #0x20]
00ac0400	mov x25,x0
00ac0404	ldr x8,[x8, #0x10]
00ac0408	str x0,[x8, #0x10]
00ac040c	b 0x00ac0744
00ac0410	ldr x8,[x21, #0x20]
00ac0414	ldp x24,x9,[x8, #0x20]
00ac0418	ldr x25,[x9, #0x10]
00ac041c	cbnz x25,0x00ac0544
00ac0420	bl 0x00c38170
00ac0424	cbz x0,0x00ac04ec
00ac0428	ldr x8,[x21, #0x20]
00ac042c	mov x25,x0
00ac0430	ldr x8,[x8, #0x28]
00ac0434	str x0,[x8, #0x10]
00ac0438	cbnz x24,0x00ac0548
00ac043c	b 0x00ac0744
00ac0440	ldr x8,[x21, #0x20]
00ac0444	ldr x22,[x8, #0x10]
00ac0448	ldr x0,[x22, #0x18]
00ac044c	bl 0x00c37750
00ac0450	cmp w0,#0x15
00ac0454	b.ne 0x00ac0498
00ac0458	ldr x25,[x22, #0x20]
00ac045c	b 0x00ac06bc
00ac0460	ldr x0,[x22, #0x18]
00ac0464	bl 0x00c37750
00ac0468	sub w8,w0,#0x15
00ac046c	cmp w8,#0x6
00ac0470	mov x25,xzr
00ac0474	b.cc 0x00ac050c
00ac0478	ldr x8,[x22, #0x20]
00ac047c	cbz x8,0x00ac0508
00ac0480	ldr w9,[x8]
00ac0484	mov x25,xzr
00ac0488	cmp w9,#0x4
00ac048c	b.ne 0x00ac050c
00ac0490	ldr x25,[x8, #0x8]
00ac0494	b 0x00ac050c
00ac0498	ldr x0,[x22, #0x18]
00ac049c	bl 0x00c37750
00ac04a0	sub w8,w0,#0x15
00ac04a4	cmp w8,#0x6
00ac04a8	mov x25,xzr
00ac04ac	b.cc 0x00ac06bc
00ac04b0	ldr x8,[x22, #0x20]
00ac04b4	cbz x8,0x00ac06b8
00ac04b8	ldr w9,[x8]
00ac04bc	mov x25,xzr
00ac04c0	cmp w9,#0x4
00ac04c4	b.ne 0x00ac06bc
00ac04c8	ldr x25,[x8, #0x8]
00ac04cc	b 0x00ac06bc
00ac04d0	bl 0x00c342a0
00ac04d4	adrp x0,0x29e000
00ac04d8	adrp x2,0x2c8000
00ac04dc	add x0,x0,#0x913
00ac04e0	add x2,x2,#0x108
00ac04e4	mov w1,#0x30f
00ac04e8	b 0x00ac08a4
00ac04ec	bl 0x00c342a0
00ac04f0	adrp x0,0x29e000
00ac04f4	adrp x2,0x2c8000
00ac04f8	add x0,x0,#0x913
00ac04fc	add x2,x2,#0x108
00ac0500	mov w1,#0x303
00ac0504	b 0x00ac08a4
00ac0508	mov x25,xzr
00ac050c	ldr x8,[x21, #0x20]
00ac0510	ldr x8,[x8, #0x28]
00ac0514	ldr x0,[x8, #0x18]
00ac0518	bl 0x00c37750
00ac051c	cmp w0,#0x15
00ac0520	b.ne 0x00ac0544
00ac0524	ldr w8,[x21, #0x14]
00ac0528	cbz w8,0x00ac0544
00ac052c	mov x0,x25
00ac0530	bl 0x00c35530
00ac0534	ldr x8,[x21, #0x20]
00ac0538	mov x25,xzr
00ac053c	ldr x8,[x8, #0x28]
00ac0540	str xzr,[x8, #0x20]
00ac0544	cbz x24,0x00ac0744
00ac0548	mov x0,x24
00ac054c	bl 0x00c325e0
00ac0550	cmp w0,#0x1
00ac0554	b.lt 0x00ac0744
00ac0558	str x25,[sp, #0x8]
00ac055c	mov w25,wzr
00ac0560	mov x0,x24
00ac0564	mov w1,w25
00ac0568	bl 0x00c32610
00ac056c	ldr x8,[x0, #0x38]
00ac0570	cbz x8,0x00ac069c
00ac0574	ldr x8,[x0, #0x10]
00ac0578	mov x27,x0
00ac057c	ldr x0,[x8]
00ac0580	bl 0x00c37750
00ac0584	mov w2,w0
00ac0588	add x0,sp,#0x10
00ac058c	mov x1,x20
00ac0590	bl 0x00ac08ec
00ac0594	cbz x0,0x00ac08bc
00ac0598	ldr x1,[sp, #0x10]
00ac059c	mov x0,x19
00ac05a0	bl 0x00c34bf0
00ac05a4	cbz w0,0x00ac08bc
00ac05a8	ldr x0,[x27, #0x18]
00ac05ac	bl 0x00c325e0
00ac05b0	cmp w0,#0x1
00ac05b4	b.lt 0x00ac062c
00ac05b8	ldr x28,[x27, #0x18]
00ac05bc	mov w1,#0x34
00ac05c0	mov w2,#0xffffffff
00ac05c4	mov x0,x28
00ac05c8	bl 0x00c3d100
00ac05cc	mov w1,w0
00ac05d0	mov x0,x28
00ac05d4	bl 0x00c3d0f0
00ac05d8	mov w1,wzr
00ac05dc	bl 0x00c3f610
00ac05e0	cbnz x0,0x00ac05f4
00ac05e4	mov x0,x27
00ac05e8	mov x1,xzr
00ac05ec	bl 0x00c3f740
00ac05f0	cbz w0,0x00ac088c
00ac05f4	add x1,sp,#0x20
00ac05f8	add x2,sp,#0x1c
00ac05fc	mov x0,x19
00ac0600	bl 0x00c31f60
00ac0604	cbz w0,0x00ac0814
00ac0608	ldr w2,[sp, #0x1c]
00ac060c	add x1,sp,#0x20
00ac0610	mov x0,x27
00ac0614	bl 0x00c3f750
00ac0618	cbz w0,0x00ac0830
00ac061c	mov x0,x27
00ac0620	bl 0x00ac09d0
00ac0624	cbnz w0,0x00ac069c
00ac0628	b 0x00ac08bc
00ac062c	ldr x0,[x27, #0x38]
00ac0630	bl 0x00c36440
00ac0634	adrp x1,0x29e000
00ac0638	str w0,[sp, #0x20]
00ac063c	mov w0,w0
00ac0640	mov w2,#0x351
00ac0644	add x1,x1,#0x913
00ac0648	bl 0x00c32320
00ac064c	cbz x0,0x00ac08bc
00ac0650	ldr x26,[x27, #0x38]
00ac0654	mov x28,x0
00ac0658	mov x0,x23
00ac065c	bl 0x00c3f7d0
00ac0660	mov x22,x0
00ac0664	mov x0,x23
00ac0668	bl 0x00c3f7e0
00ac066c	mov x5,x0
00ac0670	add x2,sp,#0x20
00ac0674	mov x0,x19
00ac0678	mov x1,x28
00ac067c	mov x3,x26
00ac0680	mov x4,x22
00ac0684	bl 0x00c3dbb0
00ac0688	cbz w0,0x00ac084c
00ac068c	ldr x0,[x27, #0x28]
00ac0690	ldr w2,[sp, #0x20]
00ac0694	mov x1,x28
00ac0698	bl 0x00c37be0
00ac069c	mov x0,x24
00ac06a0	add w25,w25,#0x1
00ac06a4	bl 0x00c325e0
00ac06a8	cmp w25,w0
00ac06ac	b.lt 0x00ac0560
00ac06b0	ldr x25,[sp, #0x8]
00ac06b4	b 0x00ac0744
00ac06b8	mov x25,xzr
00ac06bc	ldr x8,[x21, #0x20]
00ac06c0	ldr x8,[x8, #0x10]
00ac06c4	ldr x0,[x8, #0x18]
00ac06c8	bl 0x00c37750
00ac06cc	cmp w0,#0x15
00ac06d0	b.ne 0x00ac06f4
00ac06d4	ldr w8,[x21, #0x14]
00ac06d8	cbz w8,0x00ac06f4
00ac06dc	mov x0,x25
00ac06e0	bl 0x00c35530
00ac06e4	ldr x8,[x21, #0x20]
00ac06e8	mov x25,xzr
00ac06ec	ldr x8,[x8, #0x10]
00ac06f0	str xzr,[x8, #0x20]
00ac06f4	ldr x8,[x21, #0x20]
00ac06f8	ldr x8,[x8, #0x8]
00ac06fc	ldr x0,[x8]
00ac0700	bl 0x00c37750
00ac0704	mov w2,w0
00ac0708	add x0,sp,#0x10
00ac070c	mov x1,x20
00ac0710	bl 0x00ac08ec
00ac0714	cbz x0,0x00ac08bc
00ac0718	ldr x0,[sp, #0x10]
00ac071c	add x1,sp,#0x20
00ac0720	add x2,sp,#0x1c
00ac0724	bl 0x00c31f60
00ac0728	cbz w0,0x00ac08bc
00ac072c	ldr x8,[x21, #0x20]
00ac0730	ldr w2,[sp, #0x1c]
00ac0734	add x1,sp,#0x20
00ac0738	ldr x0,[x8, #0x18]
00ac073c	bl 0x00c377a0
00ac0740	cbz w0,0x00ac08bc
00ac0744	ldr x0,[x21, #0x18]
00ac0748	bl 0x00c37750
00ac074c	cmp w0,#0x16
00ac0750	b.ne 0x00ac076c
00ac0754	mov w1,#0x2
00ac0758	mov x0,x21
00ac075c	mov x2,xzr
00ac0760	mov x3,xzr
00ac0764	bl 0x00c3f770
00ac0768	cbnz x0,0x00ac07dc
00ac076c	cbz x25,0x00ac08bc
00ac0770	ldrb w8,[x25, #0x10]
00ac0774	tbnz w8,#0x4,0x00ac07dc
00ac0778	mov w1,#0x401
00ac077c	mov x0,x20
00ac0780	bl 0x00c355d0
00ac0784	mov x20,x0
00ac0788	cbz x0,0x00ac07e4
00ac078c	orr w1,wzr,#0x3
00ac0790	add x3,sp,#0x20
00ac0794	mov x0,x20
00ac0798	mov x2,xzr
00ac079c	bl 0x00c321a0
00ac07a0	mov x21,x0
00ac07a4	mov w1,#0x200
00ac07a8	mov x0,x20
00ac07ac	bl 0x00c322a0
00ac07b0	mov w1,#0x82
00ac07b4	mov x0,x20
00ac07b8	mov x2,xzr
00ac07bc	mov x3,xzr
00ac07c0	bl 0x00c321a0
00ac07c4	ldr x1,[sp, #0x20]
00ac07c8	mov x0,x25
00ac07cc	mov w2,w21
00ac07d0	bl 0x00c37be0
00ac07d4	mov w20,#0x1
00ac07d8	b 0x00ac08c0
00ac07dc	mov w20,#0x1
00ac07e0	b 0x00ac08c0
00ac07e4	bl 0x00c342a0
00ac07e8	adrp x0,0x29e000
00ac07ec	adrp x2,0x2c8000
00ac07f0	add x0,x0,#0x913
00ac07f4	add x2,x2,#0x108
00ac07f8	mov w1,#0x377
00ac07fc	bl 0x00c342b0
00ac0800	mov w0,#0x21
00ac0804	mov w1,#0x6b
00ac0808	mov x2,xzr
00ac080c	bl 0x00c342c0
00ac0810	b 0x00ac08c0
00ac0814	bl 0x00c342a0
00ac0818	adrp x0,0x29e000
00ac081c	adrp x2,0x2a2000
00ac0820	add x0,x0,#0x913
00ac0824	add x2,x2,#0xbe6
00ac0828	mov w1,#0x2c8
00ac082c	b 0x00ac0878
00ac0830	bl 0x00c342a0
00ac0834	adrp x0,0x29e000
00ac0838	adrp x2,0x2a2000
00ac083c	add x0,x0,#0x913
00ac0840	add x2,x2,#0xbe6
00ac0844	mov w1,#0x2cc
00ac0848	b 0x00ac08a4
00ac084c	adrp x20,0x29e000
00ac0850	add x20,x20,#0x913
00ac0854	mov w2,#0x358
00ac0858	mov x0,x28
00ac085c	mov x1,x20
00ac0860	bl 0x00c32310
00ac0864	bl 0x00c342a0
00ac0868	adrp x2,0x2c8000
00ac086c	add x2,x2,#0x108
00ac0870	mov w1,#0x359
00ac0874	mov x0,x20
00ac0878	bl 0x00c342b0
00ac087c	mov w1,#0x6
00ac0880	mov w0,#0x21
00ac0884	movk w1,#0x8, LSL #16
00ac0888	b 0x00ac08b4
00ac088c	bl 0x00c342a0
00ac0890	adrp x0,0x29e000
00ac0894	adrp x2,0x2a2000
00ac0898	add x0,x0,#0x913
00ac089c	add x2,x2,#0xbe6
00ac08a0	mov w1,#0x2c1
00ac08a4	bl 0x00c342b0
00ac08a8	mov w1,#0x100
00ac08ac	mov w0,#0x21
00ac08b0	movk w1,#0xc, LSL #16
00ac08b4	mov x2,xzr
00ac08b8	bl 0x00c342c0
00ac08bc	mov w20,wzr
00ac08c0	mov x0,x19
00ac08c4	bl 0x00c31f90
00ac08c8	mov w0,w20
00ac08cc	ldp x29,x30,[sp, #0xb0]
00ac08d0	ldp x20,x19,[sp, #0xa0]
00ac08d4	ldp x22,x21,[sp, #0x90]
00ac08d8	ldp x24,x23,[sp, #0x80]
00ac08dc	ldp x26,x25,[sp, #0x70]
00ac08e0	ldp x28,x27,[sp, #0x60]
00ac08e4	add sp,sp,#0xc0
00ac08e8	ret
