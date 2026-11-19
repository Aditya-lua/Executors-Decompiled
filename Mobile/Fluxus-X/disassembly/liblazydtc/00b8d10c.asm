; psa_key_derivation_output_bytes @ 00b8d10c
00b8d10c	stp x28,x27,[sp, #-0x60]!
00b8d110	stp x26,x25,[sp, #0x10]
00b8d114	stp x24,x23,[sp, #0x20]
00b8d118	stp x22,x21,[sp, #0x30]
00b8d11c	stp x20,x19,[sp, #0x40]
00b8d120	stp x29,x30,[sp, #0x50]
00b8d124	add x29,sp,#0x50
00b8d128	sub sp,sp,#0x200
00b8d12c	mrs x24,tpidr_el0
00b8d130	ldr x8,[x24, #0x28]
00b8d134	mov w9,#0x9000000
00b8d138	mov x19,x2
00b8d13c	mov x21,x1
00b8d140	stur x8,[x29, #-0x60]
00b8d144	ldr w8,[x0]
00b8d148	mov x23,x0
00b8d14c	and w10,w8,#0x7f000000
00b8d150	and w11,w8,#0xfe00ffff
00b8d154	orr w11,w11,#0x8000000
00b8d158	cmp w10,w9
00b8d15c	csel w25,w11,w8,eq
00b8d160	cbz w8,0x00b8d328
00b8d164	cbz x19,0x00b8d19c
00b8d168	mov w1,#0x1
00b8d16c	mov x0,x19
00b8d170	bl 0x00c30a30
00b8d174	mov x28,x0
00b8d178	cbz x0,0x00b8d234
00b8d17c	mov x9,x23
00b8d180	ldr x8,[x9, #0x8]!
00b8d184	mov x22,x19
00b8d188	subs x10,x8,x19
00b8d18c	b.cs 0x00b8d1bc
00b8d190	mov w26,#0xffffff71
00b8d194	str xzr,[x9]
00b8d198	b 0x00b8d8c8
00b8d19c	mov x9,x23
00b8d1a0	ldr x8,[x9, #0x8]!
00b8d1a4	cbz x8,0x00b8d244
00b8d1a8	mov x22,xzr
00b8d1ac	mov x28,xzr
00b8d1b0	mov x21,xzr
00b8d1b4	subs x10,x8,x19
00b8d1b8	b.cc 0x00b8d190
00b8d1bc	mov w11,#0xff00
00b8d1c0	and w8,w25,#0xffffff00
00b8d1c4	movk w11,#0xf7ff, LSL #16
00b8d1c8	add w11,w8,w11
00b8d1cc	lsr w11,w11,#0x8
00b8d1d0	cmp w11,#0x4
00b8d1d4	str x10,[x9]
00b8d1d8	stp x22,x21,[sp, #0x40]
00b8d1dc	b.hi 0x00b8d288
00b8d1e0	mov w9,#0x1
00b8d1e4	lsl w9,w9,w11
00b8d1e8	mov w10,#0x19
00b8d1ec	tst w9,w10
00b8d1f0	b.eq 0x00b8d24c
00b8d1f4	and w9,w25,#0xff
00b8d1f8	mov w27,#0x2000000
00b8d1fc	sub w9,w9,#0x3
00b8d200	cmp w9,#0xf
00b8d204	bfxil w27,w25,#0x0,#0x8
00b8d208	b.hi 0x00b8d384
00b8d20c	adrp x10,0x780000
00b8d210	add x10,x10,#0x7a0
00b8d214	ldrsw x9,[x10, x9, LSL #0x2]
00b8d218	mov w11,#0x10
00b8d21c	add x9,x9,x10
00b8d220	br x9
00b8d224	orr w11,wzr,#0x1c
00b8d228	ldrb w10,[x23, #0x22]
00b8d22c	tbz w10,#0x1,0x00b8d3b4
00b8d230	b 0x00b8d3a0
00b8d234	mov x22,xzr
00b8d238	mov x21,xzr
00b8d23c	mov w26,#0xffffff73
00b8d240	b 0x00b8d8c8
00b8d244	mov w0,#0xffffff71
00b8d248	b 0x00b8d8fc
00b8d24c	and w8,w25,#0xff
00b8d250	mov w22,#0x2000000
00b8d254	sub w8,w8,#0x3
00b8d258	add x27,x23,#0x10
00b8d25c	cmp w8,#0xf
00b8d260	bfxil w22,w25,#0x0,#0x8
00b8d264	b.hi 0x00b8d554
00b8d268	adrp x9,0x780000
00b8d26c	add x9,x9,#0x720
00b8d270	ldrsw x8,[x9, x8, LSL #0x2]
00b8d274	add x8,x8,x9
00b8d278	mov w9,#0x10
00b8d27c	br x8
00b8d280	orr w9,wzr,#0x1c
00b8d284	b 0x00b8d568
00b8d288	mov w8,#0x400
00b8d28c	movk w8,#0x800, LSL #16
00b8d290	add w8,w8,#0x209
00b8d294	cmp w25,w8
00b8d298	b.ne 0x00b8d2fc
00b8d29c	cmp x19,#0x20
00b8d2a0	str xzr,[sp, #0x60]
00b8d2a4	b.ne 0x00b8d368
00b8d2a8	mov w8,#0x13
00b8d2ac	movk w8,#0x200, LSL #16
00b8d2b0	add x1,x23,#0x10
00b8d2b4	sub w0,w8,#0xa
00b8d2b8	mov w2,#0x20
00b8d2bc	mov w4,#0x20
00b8d2c0	add x5,sp,#0x60
00b8d2c4	mov x3,x28
00b8d2c8	bl 0x00c42cd0
00b8d2cc	mov w26,w0
00b8d2d0	cbnz w0,0x00b8d8c0
00b8d2d4	ldr x8,[sp, #0x60]
00b8d2d8	cmp x8,#0x20
00b8d2dc	mov w8,#0xffffff7c
00b8d2e0	csel w26,wzr,w8,eq
00b8d2e4	cbnz w26,0x00b8d8c4
00b8d2e8	b 0x00b8d828
00b8d2ec	mov w11,#0x20
00b8d2f0	ldrb w10,[x23, #0x22]
00b8d2f4	tbz w10,#0x1,0x00b8d3b4
00b8d2f8	b 0x00b8d3a0
00b8d2fc	cbz x28,0x00b8d328
00b8d300	cbz x21,0x00b8d8f0
00b8d304	cbz x22,0x00b8d318
00b8d308	mov x0,x21
00b8d30c	mov x1,x28
00b8d310	mov x2,x22
00b8d314	bl 0x00c2ffd0
00b8d318	mov x0,x28
00b8d31c	bl 0x00c30960
00b8d320	mov w0,#0xffffff77
00b8d324	b 0x00b8d8fc
00b8d328	mov w0,#0xffffff77
00b8d32c	b 0x00b8d8fc
00b8d330	mov w11,#0x14
00b8d334	ldrb w10,[x23, #0x22]
00b8d338	tbz w10,#0x1,0x00b8d3b4
00b8d33c	b 0x00b8d3a0
00b8d340	orr w11,wzr,#0x30
00b8d344	ldrb w10,[x23, #0x22]
00b8d348	tbz w10,#0x1,0x00b8d3b4
00b8d34c	b 0x00b8d3a0
00b8d350	mov w9,#0x20
00b8d354	b 0x00b8d568
00b8d358	mov w9,#0x14
00b8d35c	b 0x00b8d568
00b8d360	orr w9,wzr,#0x30
00b8d364	b 0x00b8d568
00b8d368	mov w26,#0xffffff79
00b8d36c	cbnz w26,0x00b8d8c4
00b8d370	b 0x00b8d828
00b8d374	mov w11,#0x40
00b8d378	ldrb w10,[x23, #0x22]
00b8d37c	tbz w10,#0x1,0x00b8d3b4
00b8d380	b 0x00b8d3a0
00b8d384	mov w9,#0x13
00b8d388	movk w9,#0x200, LSL #16
00b8d38c	cmp w27,w9
00b8d390	cset w9,eq
00b8d394	lsl w11,w9,#0x6
00b8d398	ldrb w10,[x23, #0x22]
00b8d39c	tbz w10,#0x1,0x00b8d3b4
00b8d3a0	mov w9,#0x400
00b8d3a4	movk w9,#0x800, LSL #16
00b8d3a8	cmp w8,w9
00b8d3ac	b.eq 0x00b8d3c0
00b8d3b0	tbnz w10,#0x2,0x00b8d3c0
00b8d3b4	mov w26,#0xffffff77
00b8d3b8	cbnz w26,0x00b8d8c4
00b8d3bc	b 0x00b8d828
00b8d3c0	cmp w8,w9
00b8d3c4	orr w8,wzr,#0xff
00b8d3c8	add x9,x23,#0x63
00b8d3cc	csel w8,wzr,w8,eq
00b8d3d0	orr w10,w10,#0x3
00b8d3d4	add x12,x23,#0x23
00b8d3d8	add x22,x23,#0xa8
00b8d3dc	stp x24,x9,[sp, #0x18]
00b8d3e0	and x9,x11,#0xff
00b8d3e4	str w8,[sp, #0x2c]
00b8d3e8	add x8,x23,#0xb0
00b8d3ec	mov x21,x19
00b8d3f0	mov x20,x28
00b8d3f4	stp x12,x9,[sp, #0x30]
00b8d3f8	strb w10,[x23, #0x22]
00b8d3fc	stp x11,x8,[sp, #0x8]
00b8d400	str x22,[sp, #0x50]
00b8d404	cbz x21,0x00b8d540
00b8d408	ldrb w8,[x23, #0x20]
00b8d40c	mov x0,x20
00b8d410	sub w9,w11,w8
00b8d414	cmp x21,w9, UXTB 
00b8d418	csel w22,w21,w9,cc
00b8d41c	add x8,x23,x8
00b8d420	and x25,x22,#0xff
00b8d424	add x1,x8,#0x23
00b8d428	mov x2,x25
00b8d42c	bl 0x00c2ffd0
00b8d430	ldrb w8,[x23, #0x20]
00b8d434	subs x21,x21,x25
00b8d438	add w8,w22,w8
00b8d43c	strb w8,[x23, #0x20]
00b8d440	b.eq 0x00b8d540
00b8d444	ldrb w8,[x23, #0x21]
00b8d448	ldr w9,[sp, #0x2c]
00b8d44c	cmp w9,w8
00b8d450	b.eq 0x00b8d3b4
00b8d454	ldr x22,[sp, #0x50]
00b8d458	ldr x2,[sp, #0x20]
00b8d45c	ldr x3,[sp, #0x38]
00b8d460	add w8,w8,#0x1
00b8d464	mov x0,x22
00b8d468	mov w1,w27
00b8d46c	strb w8,[x23, #0x21]
00b8d470	strb wzr,[x23, #0x20]
00b8d474	bl 0x00b914d0
00b8d478	mov w26,w0
00b8d47c	cbnz w0,0x00b8d8c0
00b8d480	ldrb w8,[x23, #0x21]
00b8d484	cmp w8,#0x1
00b8d488	b.eq 0x00b8d4a0
00b8d48c	ldp x1,x2,[sp, #0x30]
00b8d490	mov x0,x22
00b8d494	bl 0x00c42d60
00b8d498	mov w26,w0
00b8d49c	cbnz w0,0x00b8d8c0
00b8d4a0	ldp x1,x2,[x23, #0x10]
00b8d4a4	mov x0,x22
00b8d4a8	bl 0x00c42d60
00b8d4ac	mov w26,w0
00b8d4b0	cbnz w0,0x00b8d8c0
00b8d4b4	mov x24,x28
00b8d4b8	mov w28,w27
00b8d4bc	ldr w27,[x22]
00b8d4c0	cbz w27,0x00b8d818
00b8d4c4	mov w0,#0x1
00b8d4c8	mov w1,#0x1
00b8d4cc	bl 0x00c30a30
00b8d4d0	mov x22,x0
00b8d4d4	cbz x0,0x00b8d85c
00b8d4d8	ldrb w8,[x23, #0x21]
00b8d4dc	cmp w27,#0x1
00b8d4e0	strb w8,[x22]
00b8d4e4	b.ne 0x00b8d86c
00b8d4e8	ldr x0,[sp, #0x10]
00b8d4ec	mov w2,#0x1
00b8d4f0	mov x1,x22
00b8d4f4	bl 0x00c43080
00b8d4f8	mov w26,w0
00b8d4fc	cbnz w0,0x00b8d8a4
00b8d500	mov x0,x22
00b8d504	add x20,x20,x25
00b8d508	bl 0x00c30960
00b8d50c	ldr x22,[sp, #0x50]
00b8d510	ldr x1,[sp, #0x30]
00b8d514	mov w2,#0x40
00b8d518	add x3,sp,#0x60
00b8d51c	mov x0,x22
00b8d520	bl 0x00c42d50
00b8d524	mov w27,w28
00b8d528	mov x28,x24
00b8d52c	ldr x24,[sp, #0x18]
00b8d530	ldr x11,[sp, #0x8]
00b8d534	mov w26,w0
00b8d538	cbz w0,0x00b8d404
00b8d53c	b 0x00b8d8c0
00b8d540	mov w26,wzr
00b8d544	cbnz w26,0x00b8d8c4
00b8d548	b 0x00b8d828
00b8d54c	mov w9,#0x40
00b8d550	b 0x00b8d568
00b8d554	mov w8,#0x13
00b8d558	movk w8,#0x200, LSL #16
00b8d55c	cmp w22,w8
00b8d560	cset w8,eq
00b8d564	lsl w9,w8,#0x6
00b8d568	ldr w8,[x27, #0x4]
00b8d56c	cmp w8,#0x5
00b8d570	b.eq 0x00b8d584
00b8d574	cmp w8,#0x4
00b8d578	b.ne 0x00b8d808
00b8d57c	mov w8,#0x5
00b8d580	str w8,[x27, #0x4]
00b8d584	mov w8,#0x13
00b8d588	movk w8,#0x200, LSL #16
00b8d58c	cmp w22,w8
00b8d590	cset w8,eq
00b8d594	str w9,[sp, #0x2c]
00b8d598	cbz x19,0x00b8d828
00b8d59c	lsl w8,w8,#0x6
00b8d5a0	str w8,[sp, #0x50]
00b8d5a4	add x8,x23,#0x58
00b8d5a8	str x8,[sp, #0x30]
00b8d5ac	add x8,sp,#0x60
00b8d5b0	add x9,x23,#0x98
00b8d5b4	add x8,x8,#0x8
00b8d5b8	str x9,[sp]
00b8d5bc	str x8,[sp, #0x38]
00b8d5c0	str x28,[sp, #0x20]
00b8d5c4	str x19,[sp, #0x10]
00b8d5c8	ldrb w8,[x27]
00b8d5cc	cbnz x8,0x00b8d7ac
00b8d5d0	ldr w21,[sp, #0x50]
00b8d5d4	and w8,w25,#0xff
00b8d5d8	sub w8,w8,#0x3
00b8d5dc	cmp w8,#0xf
00b8d5e0	b.hi 0x00b8d628
00b8d5e4	adrp x9,0x780000
00b8d5e8	add x9,x9,#0x760
00b8d5ec	ldrsw x8,[x9, x8, LSL #0x2]
00b8d5f0	mov w21,#0x10
00b8d5f4	add x8,x8,x9
00b8d5f8	br x8
00b8d5fc	orr w21,wzr,#0x1c
00b8d600	b 0x00b8d628
00b8d604	mov w21,#0x20
00b8d608	b 0x00b8d628
00b8d60c	mov w21,#0x14
00b8d610	b 0x00b8d628
00b8d614	orr w21,wzr,#0x30
00b8d618	b 0x00b8d628
00b8d61c	mov w21,#0x40
00b8d620	b 0x00b8d628
00b8d624	ldr w21,[sp, #0x50]
00b8d628	add x0,sp,#0x60
00b8d62c	mov w2,#0x190
00b8d630	mov w1,wzr
00b8d634	bl 0x00c301c0
00b8d638	ldrb w8,[x27, #0x1]
00b8d63c	cmp w8,#0xff
00b8d640	b.eq 0x00b8d810
00b8d644	ldp x2,x3,[x23, #0x18]
00b8d648	add w8,w8,#0x1
00b8d64c	add x0,sp,#0x60
00b8d650	mov w1,w22
00b8d654	strb w8,[x23, #0x11]
00b8d658	strb w21,[x23, #0x10]
00b8d65c	bl 0x00b914d0
00b8d660	mov w20,w0
00b8d664	cbz w0,0x00b8d684
00b8d668	ldr w0,[sp, #0x60]
00b8d66c	cbz w0,0x00b8d6d8
00b8d670	cmp w0,#0x1
00b8d674	b.ne 0x00b8d6c0
00b8d678	ldr x0,[sp, #0x38]
00b8d67c	bl 0x00c43040
00b8d680	b 0x00b8d6c4
00b8d684	ldrb w8,[x27, #0x1]
00b8d688	cmp w8,#0x1
00b8d68c	b.ne 0x00b8d6ec
00b8d690	ldp x1,x2,[x23, #0x38]
00b8d694	add x0,sp,#0x60
00b8d698	bl 0x00c42d60
00b8d69c	mov w20,w0
00b8d6a0	cbnz w0,0x00b8d668
00b8d6a4	ldp x1,x2,[x23, #0x28]
00b8d6a8	add x0,sp,#0x60
00b8d6ac	bl 0x00c42d60
00b8d6b0	mov w20,w0
00b8d6b4	cbnz w0,0x00b8d668
00b8d6b8	and x26,x21,#0xff
00b8d6bc	b 0x00b8d708
00b8d6c0	mov w0,#0xffffff79
00b8d6c4	ldrb w8,[sp, #0x65]
00b8d6c8	strb wzr,[sp, #0x64]
00b8d6cc	str wzr,[sp, #0x60]
00b8d6d0	and w8,w8,#0xfe
00b8d6d4	strb w8,[sp, #0x65]
00b8d6d8	cmp w0,#0x0
00b8d6dc	ccmp w20,#0x0,#0x0,ne
00b8d6e0	csel w26,w0,w20,eq
00b8d6e4	cbz w26,0x00b8d5c8
00b8d6e8	b 0x00b8d8c4
00b8d6ec	ldr x1,[sp, #0x30]
00b8d6f0	and x26,x21,#0xff
00b8d6f4	add x0,sp,#0x60
00b8d6f8	mov x2,x26
00b8d6fc	bl 0x00c42d60
00b8d700	mov w20,w0
00b8d704	cbnz w0,0x00b8d668
00b8d708	ldr x1,[sp, #0x30]
00b8d70c	add x0,sp,#0x60
00b8d710	add x3,sp,#0x58
00b8d714	mov x2,x26
00b8d718	bl 0x00c42d50
00b8d71c	ldr x8,[sp, #0x58]
00b8d720	cmp x8,x26
00b8d724	mov w8,#0xffffff69
00b8d728	csel w20,w0,w8,eq
00b8d72c	cbnz w20,0x00b8d668
00b8d730	ldp x2,x3,[x23, #0x18]
00b8d734	add x0,sp,#0x60
00b8d738	mov w1,w22
00b8d73c	bl 0x00b914d0
00b8d740	mov w20,w0
00b8d744	cbnz w0,0x00b8d668
00b8d748	ldr x1,[sp, #0x30]
00b8d74c	add x0,sp,#0x60
00b8d750	mov x2,x26
00b8d754	bl 0x00c42d60
00b8d758	mov w20,w0
00b8d75c	cbnz w0,0x00b8d668
00b8d760	ldp x1,x2,[x23, #0x38]
00b8d764	add x0,sp,#0x60
00b8d768	bl 0x00c42d60
00b8d76c	mov w20,w0
00b8d770	cbnz w0,0x00b8d668
00b8d774	ldp x1,x2,[x23, #0x28]
00b8d778	add x0,sp,#0x60
00b8d77c	bl 0x00c42d60
00b8d780	mov w20,w0
00b8d784	cbnz w0,0x00b8d668
00b8d788	ldr x1,[sp]
00b8d78c	add x0,sp,#0x60
00b8d790	add x3,sp,#0x58
00b8d794	mov x2,x26
00b8d798	bl 0x00c42d50
00b8d79c	mov w20,w0
00b8d7a0	ldr w0,[sp, #0x60]
00b8d7a4	cbnz w0,0x00b8d670
00b8d7a8	b 0x00b8d6d8
00b8d7ac	ldr x21,[sp, #0x10]
00b8d7b0	ldr w9,[sp, #0x2c]
00b8d7b4	ldr x26,[sp, #0x20]
00b8d7b8	cmp x21,x8
00b8d7bc	sub w9,w9,w8
00b8d7c0	csel w10,w21,w8,cc
00b8d7c4	add x8,x27,w9, UXTB 
00b8d7c8	and x20,x10,#0xff
00b8d7cc	add x1,x8,#0x88
00b8d7d0	mov x0,x26
00b8d7d4	mov x2,x20
00b8d7d8	str x10,[sp, #0x8]
00b8d7dc	bl 0x00c2ffd0
00b8d7e0	ldrb w8,[x27]
00b8d7e4	ldr x9,[sp, #0x8]
00b8d7e8	add x26,x26,x20
00b8d7ec	sub x21,x21,x20
00b8d7f0	str x26,[sp, #0x20]
00b8d7f4	sub w8,w8,w9
00b8d7f8	strb w8,[x27]
00b8d7fc	str x21,[sp, #0x10]
00b8d800	cbnz x21,0x00b8d5c8
00b8d804	b 0x00b8d828
00b8d808	mov w26,#0xffffff77
00b8d80c	b 0x00b8d8c4
00b8d810	mov w26,#0xffffff69
00b8d814	b 0x00b8d8c4
00b8d818	mov x28,x24
00b8d81c	ldr x24,[sp, #0x18]
00b8d820	mov w26,#0xffffff77
00b8d824	cbnz w26,0x00b8d8c4
00b8d828	ldp x22,x21,[sp, #0x40]
00b8d82c	mov w26,wzr
00b8d830	mov w0,wzr
00b8d834	cbz x28,0x00b8d8fc
00b8d838	cbz x21,0x00b8d8f0
00b8d83c	cbz x22,0x00b8d850
00b8d840	mov x0,x21
00b8d844	mov x1,x28
00b8d848	mov x2,x22
00b8d84c	bl 0x00c2ffd0
00b8d850	mov x0,x28
00b8d854	bl 0x00c30960
00b8d858	b 0x00b8d8f8
00b8d85c	mov x28,x24
00b8d860	ldr x24,[sp, #0x18]
00b8d864	mov w26,#0xffffff73
00b8d868	b 0x00b8d8b8
00b8d86c	mov w26,#0xffffff79
00b8d870	mov x28,x24
00b8d874	cbz w27,0x00b8d8b4
00b8d878	ldr x24,[sp, #0x18]
00b8d87c	cmp w27,#0x1
00b8d880	b.ne 0x00b8d88c
00b8d884	ldr x0,[sp, #0x10]
00b8d888	bl 0x00c43040
00b8d88c	ldrb w8,[x23, #0xad]
00b8d890	strb wzr,[x23, #0xac]
00b8d894	str wzr,[x23, #0xa8]
00b8d898	and w8,w8,#0xfe
00b8d89c	strb w8,[x23, #0xad]
00b8d8a0	b 0x00b8d8b8
00b8d8a4	ldr x8,[sp, #0x50]
00b8d8a8	ldr w27,[x8]
00b8d8ac	mov x28,x24
00b8d8b0	cbnz w27,0x00b8d878
00b8d8b4	ldr x24,[sp, #0x18]
00b8d8b8	mov x0,x22
00b8d8bc	bl 0x00c30960
00b8d8c0	cbz w26,0x00b8d828
00b8d8c4	ldp x22,x21,[sp, #0x40]
00b8d8c8	ldr w20,[x23]
00b8d8cc	mov x0,x23
00b8d8d0	bl 0x00c42d20
00b8d8d4	str w20,[x23]
00b8d8d8	cbz x28,0x00b8d8f8
00b8d8dc	mov w1,#0x21
00b8d8e0	mov x0,x28
00b8d8e4	mov x2,x19
00b8d8e8	bl 0x00c301c0
00b8d8ec	cbnz x21,0x00b8d83c
00b8d8f0	mov w0,#0xffffff69
00b8d8f4	b 0x00b8d8fc
00b8d8f8	mov w0,w26
00b8d8fc	ldr x8,[x24, #0x28]
00b8d900	ldur x9,[x29, #-0x60]
00b8d904	cmp x8,x9
00b8d908	b.ne 0x00b8d92c
00b8d90c	add sp,sp,#0x200
00b8d910	ldp x29,x30,[sp, #0x50]
00b8d914	ldp x20,x19,[sp, #0x40]
00b8d918	ldp x22,x21,[sp, #0x30]
00b8d91c	ldp x24,x23,[sp, #0x20]
00b8d920	ldp x26,x25,[sp, #0x10]
00b8d924	ldp x28,x27,[sp], #0x60
00b8d928	ret
00b8d92c	bl 0x00c2fec0
