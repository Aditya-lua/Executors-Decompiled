; FUN_007fd0d4 @ 007fd0d4
007fd0d4	sub sp,sp,#0xb0
007fd0d8	stp x29,x30,[sp, #0x50]
007fd0dc	stp x28,x27,[sp, #0x60]
007fd0e0	stp x26,x25,[sp, #0x70]
007fd0e4	stp x24,x23,[sp, #0x80]
007fd0e8	stp x22,x21,[sp, #0x90]
007fd0ec	stp x20,x19,[sp, #0xa0]
007fd0f0	add x29,sp,#0x50
007fd0f4	mrs x10,tpidr_el0
007fd0f8	mov x19,x0
007fd0fc	ldr x8,[x10, #0x28]
007fd100	stur x8,[x29, #-0x8]
007fd104	adrp x8,0xcca000
007fd108	ldr x26,[x8, #0x938]
007fd10c	ldr x8,[x0, #0x1b0]
007fd110	ldr x9,[x26, #0x18]
007fd114	str x8,[x26]
007fd118	cbz x9,0x007fd704
007fd11c	cmp x19,x9
007fd120	b.eq 0x007fd708
007fd124	ldr x9,[x26, #0x20]
007fd128	cmp x19,x9
007fd12c	b.eq 0x007fd150
007fd130	cbz x8,0x007fd708
007fd134	add x8,x26,#0x29
007fd138	str x19,[x26, #0x20]
007fd13c	mov w9,#0x1
007fd140	stlrb wzr,[x8]
007fd144	add x8,x26,#0x28
007fd148	stp xzr,xzr,[x26, #0x8]
007fd14c	stlrb w9,[x8]
007fd150	str x10,[sp, #0x8]
007fd154	add x8,x26,#0x28
007fd158	ldarb w8,[x8]
007fd15c	tbz w8,#0x0,0x007fd744
007fd160	ldr x0,[x26, #0x8]
007fd164	cbz x0,0x007fd7a8
007fd168	add x8,x26,#0x28
007fd16c	stlrb wzr,[x8]
007fd170	bl 0x008aa7f4
007fd174	ldr x8,[x0, #0x10]
007fd178	str x0,[x26, #0x10]
007fd17c	cbz x8,0x007fd1b8
007fd180	adrp x9,0xcc4000
007fd184	mov x10,#-0xc1
007fd188	adrp x11,0xcca000
007fd18c	ldr x9,[x9, #0x430]
007fd190	movk x10,#0x203f, LSL #48
007fd194	mov w20,#0x8
007fd198	str w20,[x8, #0x48]
007fd19c	orr x21,x9,x10
007fd1a0	ldr x9,[x11, #0xae8]
007fd1a4	str x21,[x8, #0x98]
007fd1a8	blr x9
007fd1ac	cbz x0,0x007fd1b8
007fd1b0	str w20,[x0]
007fd1b4	str x21,[x0, #0x28]
007fd1b8	ldr x0,[x26, #0x10]
007fd1bc	bl 0x008b73b4
007fd1c0	ldr x0,[x26, #0x10]
007fd1c4	mov w1,wzr
007fd1c8	mov w2,wzr
007fd1cc	bl 0x008ad0b0
007fd1d0	adrp x8,0xcca000
007fd1d4	add x8,x8,#0xaf8
007fd1d8	ldr x0,[x26, #0x10]
007fd1dc	ldarb w8,[x8]
007fd1e0	adrp x20,0xcca000
007fd1e4	add x20,x20,#0xaf0
007fd1e8	tbz w8,#0x0,0x007fd7d4
007fd1ec	adrp x8,0xcca000
007fd1f0	ldrb w8,[x8, #0xaf3]
007fd1f4	cmp w8,#0x1
007fd1f8	b.ne 0x007fd228
007fd1fc	ldrb w8,[x20]
007fd200	ldrb w9,[x20, #0x1]
007fd204	mov w10,#0x3b
007fd208	ldrb w11,[x20, #0x2]
007fd20c	strb wzr,[x20, #0x3]
007fd210	eor w8,w8,#0xbbbbbbbb
007fd214	eor w9,w9,w10
007fd218	strb w8,[x20]
007fd21c	eor w8,w11,#0xffffffc1
007fd220	strb w9,[x20, #0x1]
007fd224	strb w8,[x20, #0x2]
007fd228	adrp x2,0xcca000
007fd22c	add x2,x2,#0xaf0
007fd230	mov w1,#0xffffd8ee
007fd234	bl 0x008ad800
007fd238	ldr x0,[x26, #0x10]
007fd23c	mov w1,wzr
007fd240	mov w2,wzr
007fd244	bl 0x008ad0b0
007fd248	adrp x8,0xcca000
007fd24c	add x8,x8,#0xb08
007fd250	ldr x0,[x26, #0x10]
007fd254	ldarb w8,[x8]
007fd258	adrp x9,0xcca000
007fd25c	add x9,x9,#0xb00
007fd260	tbz w8,#0x0,0x007fd82c
007fd264	adrp x8,0xcca000
007fd268	ldrb w8,[x8, #0xb07]
007fd26c	cmp w8,#0x1
007fd270	b.ne 0x007fd2c4
007fd274	ldr s0,[x9]
007fd278	adrp x8,0x29a000
007fd27c	mov w10,#0x53
007fd280	ldr d1,[x8, #0x168]
007fd284	ldrb w8,[x9, #0x4]
007fd288	ldrb w11,[x9, #0x5]
007fd28c	uxtl v0.8H,v0.8B
007fd290	mov w12,#0x57
007fd294	strb wzr,[x9, #0x7]
007fd298	eor w8,w8,w10
007fd29c	ldrb w10,[x9, #0x6]
007fd2a0	eor w11,w11,w12
007fd2a4	strb w8,[x9, #0x4]
007fd2a8	mov w8,#0x5f
007fd2ac	eor v0.8B,v0.8B,v1.8B
007fd2b0	eor w8,w10,w8
007fd2b4	strb w11,[x9, #0x5]
007fd2b8	strb w8,[x9, #0x6]
007fd2bc	uzp1 v0.8B,v0.8B,v0.8B
007fd2c0	str s0,[x9]
007fd2c4	adrp x2,0xcca000
007fd2c8	add x2,x2,#0xb00
007fd2cc	mov w1,#0xffffd8ee
007fd2d0	bl 0x008ad800
007fd2d4	ldr x0,[x26, #0x8]
007fd2d8	mov w1,#0xffffffff
007fd2dc	bl 0x008ae664
007fd2e0	ldr x0,[x26, #0x8]
007fd2e4	mov w1,#0xfffffffe
007fd2e8	bl 0x008aa994
007fd2ec	ldr x0,[x26, #0x10]
007fd2f0	cbz x0,0x007fd7a8
007fd2f4	adrp x8,0xcca000
007fd2f8	add x8,x8,#0xb20
007fd2fc	adrp x20,0xcca000
007fd300	add x20,x20,#0xb10
007fd304	ldarb w8,[x8]
007fd308	tbz w8,#0x0,0x007fd890
007fd30c	adrp x8,0xcca000
007fd310	ldrb w8,[x8, #0xb19]
007fd314	cmp w8,#0x1
007fd318	b.ne 0x007fd344
007fd31c	adrp x8,0x29a000
007fd320	ldr d0,[x20]
007fd324	mov w9,#0x7b
007fd328	ldr d1,[x8, #0x688]
007fd32c	ldrb w8,[x20, #0x8]
007fd330	strb wzr,[x20, #0x9]
007fd334	eor v0.8B,v0.8B,v1.8B
007fd338	eor w8,w8,w9
007fd33c	strb w8,[x20, #0x8]
007fd340	str d0,[x20]
007fd344	adrp x2,0xcca000
007fd348	add x2,x2,#0xb10
007fd34c	mov w1,#0xffffd8ee
007fd350	bl 0x008acba4
007fd354	adrp x8,0xcca000
007fd358	add x8,x8,#0xb30
007fd35c	ldr x0,[x26, #0x10]
007fd360	ldarb w8,[x8]
007fd364	adrp x20,0xcca000
007fd368	add x20,x20,#0xb28
007fd36c	tbz w8,#0x0,0x007fd8f0
007fd370	adrp x8,0xcca000
007fd374	ldrb w8,[x8, #0xb2c]
007fd378	cmp w8,#0x1
007fd37c	b.ne 0x007fd3a0
007fd380	ldr s0,[x20]
007fd384	adrp x8,0x29a000
007fd388	strb wzr,[x20, #0x4]
007fd38c	ldr d1,[x8, #0x558]
007fd390	uxtl v0.8H,v0.8B
007fd394	eor v0.8B,v0.8B,v1.8B
007fd398	uzp1 v0.8B,v0.8B,v0.8B
007fd39c	str s0,[x20]
007fd3a0	adrp x2,0xcca000
007fd3a4	add x2,x2,#0xb28
007fd3a8	mov w1,#0xffffffff
007fd3ac	bl 0x008acba4
007fd3b0	adrp x8,0xcca000
007fd3b4	add x8,x8,#0xb48
007fd3b8	ldr x0,[x26, #0x10]
007fd3bc	ldarb w8,[x8]
007fd3c0	adrp x9,0xcca000
007fd3c4	add x9,x9,#0xb38
007fd3c8	tbz w8,#0x0,0x007fd950
007fd3cc	adrp x8,0xcca000
007fd3d0	ldrb w8,[x8, #0xb44]
007fd3d4	cmp w8,#0x1
007fd3d8	b.ne 0x007fd410
007fd3dc	ldr s0,[x9, #0x8]
007fd3e0	adrp x8,0x29a000
007fd3e4	strb wzr,[x9, #0xc]
007fd3e8	ldr d1,[x8, #0x170]
007fd3ec	adrp x8,0x29a000
007fd3f0	uxtl v0.8H,v0.8B
007fd3f4	ldr d2,[x8, #0x870]
007fd3f8	eor v0.8B,v0.8B,v1.8B
007fd3fc	ldr d1,[x9]
007fd400	eor v1.8B,v1.8B,v2.8B
007fd404	uzp1 v0.8B,v0.8B,v0.8B
007fd408	str d1,[x9]
007fd40c	str s0,[x9, #0x8]
007fd410	adrp x1,0xcca000
007fd414	add x1,x1,#0xb38
007fd418	bl 0x008ac4a8
007fd41c	ldr x0,[x26, #0x10]
007fd420	mov w1,#0x1
007fd424	mov w2,#0x1
007fd428	bl 0x008add48
007fd42c	adrp x8,0xcca000
007fd430	add x8,x8,#0xb58
007fd434	ldr x0,[x26, #0x10]
007fd438	ldarb w8,[x8]
007fd43c	adrp x9,0xcca000
007fd440	add x9,x9,#0xb50
007fd444	tbz w8,#0x0,0x007fd9c8
007fd448	adrp x8,0xcca000
007fd44c	ldrb w8,[x8, #0xb57]
007fd450	cmp w8,#0x1
007fd454	b.ne 0x007fd4a8
007fd458	ldr s0,[x9]
007fd45c	adrp x8,0x29a000
007fd460	mov w10,#0x93
007fd464	ldr d1,[x8, #0x98]
007fd468	ldrb w8,[x9, #0x4]
007fd46c	ldrb w11,[x9, #0x5]
007fd470	uxtl v0.8H,v0.8B
007fd474	mov w12,#0x4d
007fd478	strb wzr,[x9, #0x7]
007fd47c	eor w8,w8,w10
007fd480	ldrb w10,[x9, #0x6]
007fd484	eor w11,w11,w12
007fd488	strb w8,[x9, #0x4]
007fd48c	mov w8,#0x8b
007fd490	eor v0.8B,v0.8B,v1.8B
007fd494	eor w8,w10,w8
007fd498	strb w11,[x9, #0x5]
007fd49c	strb w8,[x9, #0x6]
007fd4a0	uzp1 v0.8B,v0.8B,v0.8B
007fd4a4	str s0,[x9]
007fd4a8	adrp x2,0xcca000
007fd4ac	add x2,x2,#0xb50
007fd4b0	mov w1,#0xffffd8ee
007fd4b4	bl 0x008ad800
007fd4b8	ldr x0,[x26, #0x10]
007fd4bc	mov w1,#0xfffffffe
007fd4c0	bl 0x008aa994
007fd4c4	ldr x0,[x26, #0x10]
007fd4c8	bl 0x0084e83c
007fd4cc	bl 0x00804e40
007fd4d0	sub x24,x29,#0x20
007fd4d4	add x8,sp,#0x18
007fd4d8	orr x20,xzr,#-0x3f3f3f3f3f3f3f40
007fd4dc	movk x20,#0xc0c1
007fd4e0	mov w21,#0xaa
007fd4e4	orr x25,x24,#0x1
007fd4e8	orr x8,x8,#0x1
007fd4ec	mov w28,#0x18
007fd4f0	str x8,[sp, #0x10]
007fd4f4	b 0x007fd4fc
007fd4f8	cbz x27,0x007fd744
007fd4fc	stp xzr,xzr,[x29, #-0x20]
007fd500	stur xzr,[x29, #-0x10]
007fd504	add x0,x26,#0x60
007fd508	bl 0x00c2ff10
007fd50c	ldr x27,[x26, #0x58]
007fd510	cbz x27,0x007fd560
007fd514	ldr x8,[x26, #0x50]
007fd518	ldr x10,[x26, #0x38]
007fd51c	umulh x9,x8,x20
007fd520	lsr x9,x9,#0x7
007fd524	msub x8,x9,x21,x8
007fd528	ldr x9,[x10, x9, LSL #0x3]
007fd52c	nop
007fd530	madd x8,x8,x28,x9
007fd534	cmp x24,x8
007fd538	b.eq 0x007fd5a0
007fd53c	ldurb w10,[x29, #-0x20]
007fd540	ldrb w9,[x8]
007fd544	tbnz w10,#0x0,0x007fd574
007fd548	tbnz w9,#0x0,0x007fd594
007fd54c	ldr x9,[x8, #0x10]
007fd550	ldr q0,[x8]
007fd554	stur x9,[x29, #-0x10]
007fd558	stur q0,[x29, #-0x20]
007fd55c	b 0x007fd5a0
007fd560	add x0,x26,#0x60
007fd564	bl 0x00c2ff20
007fd568	ldurb w8,[x29, #-0x20]
007fd56c	tbnz w8,#0x0,0x007fd6f0
007fd570	b 0x007fd4f8
007fd574	ldp x11,x10,[x8, #0x8]
007fd578	lsr x12,x9,#0x1
007fd57c	tst w9,#0x1
007fd580	csinc x1,x10,x8,ne
007fd584	csel x2,x12,x11,eq
007fd588	sub x0,x29,#0x20
007fd58c	bl 0x007fe004
007fd590	b 0x007fd5a0
007fd594	ldp x2,x1,[x8, #0x8]
007fd598	sub x0,x29,#0x20
007fd59c	bl 0x007fdf5c
007fd5a0	ldr x8,[x26, #0x50]
007fd5a4	ldr x11,[x26, #0x38]
007fd5a8	umulh x9,x8,x20
007fd5ac	lsr x9,x9,#0x7
007fd5b0	msub x10,x9,x21,x8
007fd5b4	ldr x9,[x11, x9, LSL #0x3]
007fd5b8	nop
007fd5bc	madd x9,x10,x28,x9
007fd5c0	ldrb w10,[x9]
007fd5c4	tbz w10,#0x0,0x007fd5dc
007fd5c8	ldr x8,[x9]
007fd5cc	ldr x0,[x9, #0x10]
007fd5d0	and x1,x8,#-0x2
007fd5d4	bl 0x00c2fe80
007fd5d8	ldr x8,[x26, #0x50]
007fd5dc	ldr x9,[x26, #0x58]
007fd5e0	add x8,x8,#0x1
007fd5e4	cmp x8,#0x154
007fd5e8	sub x9,x9,#0x1
007fd5ec	stp x8,x9,[x26, #0x50]
007fd5f0	b.cc 0x007fd61c
007fd5f4	ldr x8,[x26, #0x38]
007fd5f8	mov w1,#0xff0
007fd5fc	ldr x0,[x8]
007fd600	bl 0x00c2fe80
007fd604	ldr x8,[x26, #0x38]
007fd608	ldr x9,[x26, #0x50]
007fd60c	add x8,x8,#0x8
007fd610	sub x9,x9,#0xaa
007fd614	str x8,[x26, #0x38]
007fd618	str x9,[x26, #0x50]
007fd61c	add x0,x26,#0x60
007fd620	bl 0x00c2ff20
007fd624	ldurb w8,[x29, #-0x20]
007fd628	ldur x9,[x29, #-0x10]
007fd62c	adrp x10,0xcca000
007fd630	ldr x20,[x10, #0x948]
007fd634	tst w8,#0x1
007fd638	csel x22,x25,x9,eq
007fd63c	mov x0,x22
007fd640	bl 0x00c2ff50
007fd644	cmn x0,#0x8
007fd648	b.cs 0x007fd7bc
007fd64c	mov x21,x0
007fd650	cmp x0,#0x17
007fd654	b.cs 0x007fd66c
007fd658	lsl w8,w21,#0x1
007fd65c	ldr x23,[sp, #0x10]
007fd660	strb w8,[sp, #0x18]
007fd664	cbnz x21,0x007fd698
007fd668	b 0x007fd6a8
007fd66c	orr x8,x21,#0x7
007fd670	mov w9,#0x1a
007fd674	cmp x8,#0x17
007fd678	csinc x24,x9,x8,eq
007fd67c	mov x0,x24
007fd680	bl 0x00c2fed0
007fd684	orr x8,x24,#0x1
007fd688	mov x23,x0
007fd68c	stp x21,x0,[sp, #0x20]
007fd690	str x8,[sp, #0x18]
007fd694	sub x24,x29,#0x20
007fd698	mov x0,x23
007fd69c	mov x1,x22
007fd6a0	mov x2,x21
007fd6a4	bl 0x00c2ff60
007fd6a8	strb wzr,[x23, x21]
007fd6ac	add x1,sp,#0x18
007fd6b0	mov x0,x20
007fd6b4	bl 0x00804318
007fd6b8	ldrb w8,[sp, #0x18]
007fd6bc	orr x20,xzr,#-0x3f3f3f3f3f3f3f40
007fd6c0	mov w21,#0xaa
007fd6c4	movk x20,#0xc0c1
007fd6c8	tbnz w8,#0x0,0x007fd6d8
007fd6cc	ldurb w8,[x29, #-0x20]
007fd6d0	tbz w8,#0x0,0x007fd4f8
007fd6d4	b 0x007fd6f0
007fd6d8	ldr x8,[sp, #0x18]
007fd6dc	ldr x0,[sp, #0x28]
007fd6e0	and x1,x8,#-0x2
007fd6e4	bl 0x00c2fe80
007fd6e8	ldurb w8,[x29, #-0x20]
007fd6ec	tbz w8,#0x0,0x007fd4f8
007fd6f0	ldur x8,[x29, #-0x20]
007fd6f4	ldur x0,[x29, #-0x10]
007fd6f8	and x1,x8,#-0x2
007fd6fc	bl 0x00c2fe80
007fd700	b 0x007fd4f8
007fd704	str x19,[x26, #0x18]
007fd708	adrp x8,0xcca000
007fd70c	ldr x1,[x8, #0x970]
007fd710	ldr x8,[x10, #0x28]
007fd714	ldur x9,[x29, #-0x8]
007fd718	cmp x8,x9
007fd71c	b.ne 0x007fda9c
007fd720	mov x0,x19
007fd724	ldp x20,x19,[sp, #0xa0]
007fd728	ldp x22,x21,[sp, #0x90]
007fd72c	ldp x24,x23,[sp, #0x80]
007fd730	ldp x26,x25,[sp, #0x70]
007fd734	ldp x28,x27,[sp, #0x60]
007fd738	ldp x29,x30,[sp, #0x50]
007fd73c	add sp,sp,#0xb0
007fd740	br x1
007fd744	ldr x8,[x26, #0x10]
007fd748	cbz x8,0x007fd764
007fd74c	adrp x8,0xcca000
007fd750	ldr x9,[x8, #0x948]
007fd754	ldarb w9,[x9]
007fd758	tbnz w9,#0x0,0x007fd764
007fd75c	ldr x0,[x8, #0x948]
007fd760	bl 0x008038d8
007fd764	adrp x8,0xcca000
007fd768	mov x0,x19
007fd76c	ldr x8,[x8, #0x970]
007fd770	blr x8
007fd774	ldr x8,[sp, #0x8]
007fd778	ldr x8,[x8, #0x28]
007fd77c	ldur x9,[x29, #-0x8]
007fd780	cmp x8,x9
007fd784	b.ne 0x007fda9c
007fd788	ldp x20,x19,[sp, #0xa0]
007fd78c	ldp x22,x21,[sp, #0x90]
007fd790	ldp x24,x23,[sp, #0x80]
007fd794	ldp x26,x25,[sp, #0x70]
007fd798	ldp x28,x27,[sp, #0x60]
007fd79c	ldp x29,x30,[sp, #0x50]
007fd7a0	add sp,sp,#0xb0
007fd7a4	ret
007fd7a8	adrp x8,0xcca000
007fd7ac	ldr x1,[x8, #0x970]
007fd7b0	ldr x8,[sp, #0x8]
007fd7b4	ldr x8,[x8, #0x28]
007fd7b8	b 0x007fd714
007fd7bc	ldr x8,[sp, #0x8]
007fd7c0	ldr x8,[x8, #0x28]
007fd7c4	ldur x9,[x29, #-0x8]
007fd7c8	cmp x8,x9
007fd7cc	b.ne 0x007fda9c
007fd7d0	bl 0x007fe124
007fd7d4	adrp x8,0xcca000
007fd7d8	add x8,x8,#0xaf8
007fd7dc	mov x21,x0
007fd7e0	mov x0,x8
007fd7e4	bl 0x00c2fe90
007fd7e8	mov w8,w0
007fd7ec	mov x0,x21
007fd7f0	cbz w8,0x007fd1ec
007fd7f4	adrp x8,0x29b000
007fd7f8	nop
007fd7fc	adr x0,0x7fdf18
007fd800	ldr d0,[x8, #0xa50]
007fd804	adrp x2,0xc48000
007fd808	add x2,x2,#0x880
007fd80c	mov x1,x20
007fd810	str s0,[x20]
007fd814	bl 0x00c2fe70
007fd818	adrp x0,0xcca000
007fd81c	add x0,x0,#0xaf8
007fd820	bl 0x00c2fea0
007fd824	mov x0,x21
007fd828	b 0x007fd1ec
007fd82c	adrp x8,0xcca000
007fd830	add x8,x8,#0xb08
007fd834	mov x21,x0
007fd838	mov x0,x8
007fd83c	mov x20,x9
007fd840	bl 0x00c2fe90
007fd844	mov x9,x20
007fd848	mov w8,w0
007fd84c	mov x0,x21
007fd850	cbz w8,0x007fd264
007fd854	adrp x8,0x29a000
007fd858	nop
007fd85c	adr x0,0x7fdf24
007fd860	ldr d0,[x8, #0xe80]
007fd864	adrp x2,0xc48000
007fd868	add x2,x2,#0x880
007fd86c	mov x1,x20
007fd870	str d0,[x9]
007fd874	bl 0x00c2fe70
007fd878	adrp x0,0xcca000
007fd87c	add x0,x0,#0xb08
007fd880	bl 0x00c2fea0
007fd884	mov x9,x20
007fd888	mov x0,x21
007fd88c	b 0x007fd264
007fd890	adrp x8,0xcca000
007fd894	add x8,x8,#0xb20
007fd898	mov x21,x0
007fd89c	mov x0,x8
007fd8a0	bl 0x00c2fe90
007fd8a4	mov w8,w0
007fd8a8	mov x0,x21
007fd8ac	cbz w8,0x007fd30c
007fd8b0	adrp x8,0x29b000
007fd8b4	nop
007fd8b8	adr x0,0x7fdf30
007fd8bc	ldr d0,[x8, #0xca0]
007fd8c0	mov w8,#0x17b
007fd8c4	adrp x2,0xc48000
007fd8c8	add x2,x2,#0x880
007fd8cc	mov x1,x20
007fd8d0	strh w8,[x20, #0x8]
007fd8d4	str d0,[x20]
007fd8d8	bl 0x00c2fe70
007fd8dc	adrp x0,0xcca000
007fd8e0	add x0,x0,#0xb20
007fd8e4	bl 0x00c2fea0
007fd8e8	mov x0,x21
007fd8ec	b 0x007fd30c
007fd8f0	adrp x8,0xcca000
007fd8f4	add x8,x8,#0xb30
007fd8f8	mov x21,x0
007fd8fc	mov x0,x8
007fd900	bl 0x00c2fe90
007fd904	mov w8,w0
007fd908	mov x0,x21
007fd90c	cbz w8,0x007fd370
007fd910	adrp x8,0x29a000
007fd914	mov w9,#0x1
007fd918	nop
007fd91c	adr x0,0x7fdf3c
007fd920	ldr d0,[x8, #0x690]
007fd924	adrp x2,0xc48000
007fd928	add x2,x2,#0x880
007fd92c	mov x1,x20
007fd930	strb w9,[x20, #0x4]
007fd934	str s0,[x20]
007fd938	bl 0x00c2fe70
007fd93c	adrp x0,0xcca000
007fd940	add x0,x0,#0xb30
007fd944	bl 0x00c2fea0
007fd948	mov x0,x21
007fd94c	b 0x007fd370
007fd950	adrp x8,0xcca000
007fd954	add x8,x8,#0xb48
007fd958	mov x21,x0
007fd95c	mov x0,x8
007fd960	mov x20,x9
007fd964	bl 0x00c2fe90
007fd968	mov x9,x20
007fd96c	mov w8,w0
007fd970	mov x0,x21
007fd974	cbz w8,0x007fd3cc
007fd978	adrp x8,0x29a000
007fd97c	adrp x11,0x29b000
007fd980	mov w10,#0x1
007fd984	ldr d0,[x8, #0x408]
007fd988	ldr d1,[x11, #0x630]
007fd98c	nop
007fd990	adr x0,0x7fdf44
007fd994	adrp x2,0xc48000
007fd998	add x2,x2,#0x880
007fd99c	mov x1,x20
007fd9a0	strb w10,[x9, #0xc]
007fd9a4	str d0,[x9]
007fd9a8	str s1,[x9, #0x8]
007fd9ac	bl 0x00c2fe70
007fd9b0	adrp x0,0xcca000
007fd9b4	add x0,x0,#0xb48
007fd9b8	bl 0x00c2fea0
007fd9bc	mov x9,x20
007fd9c0	mov x0,x21
007fd9c4	b 0x007fd3cc
007fd9c8	adrp x8,0xcca000
007fd9cc	add x8,x8,#0xb58
007fd9d0	mov x21,x0
007fd9d4	mov x0,x8
007fd9d8	mov x20,x9
007fd9dc	bl 0x00c2fe90
007fd9e0	mov x9,x20
007fd9e4	mov w8,w0
007fd9e8	mov x0,x21
007fd9ec	cbz w8,0x007fd448
007fd9f0	adrp x8,0x29a000
007fd9f4	nop
007fd9f8	adr x0,0x7fdf50
007fd9fc	ldr d0,[x8, #0x178]
007fda00	adrp x2,0xc48000
007fda04	add x2,x2,#0x880
007fda08	mov x1,x20
007fda0c	str d0,[x9]
007fda10	bl 0x00c2fe70
007fda14	adrp x0,0xcca000
007fda18	add x0,x0,#0xb58
007fda1c	bl 0x00c2fea0
007fda20	mov x9,x20
007fda24	mov x0,x21
007fda28	b 0x007fd448
007fda9c	bl 0x00c2fec0
