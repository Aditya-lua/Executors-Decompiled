; ssl3_get_record @ 009cd0a0
009cd0a0	sub sp,sp,#0xe0
009cd0a4	stp x28,x27,[sp, #0x80]
009cd0a8	stp x26,x25,[sp, #0x90]
009cd0ac	stp x24,x23,[sp, #0xa0]
009cd0b0	stp x22,x21,[sp, #0xb0]
009cd0b4	stp x20,x19,[sp, #0xc0]
009cd0b8	stp x29,x30,[sp, #0xd0]
009cd0bc	add x8,x0,#0xc58
009cd0c0	ldr x11,[x0, #0xa20]
009cd0c4	str x8,[sp, #0x8]
009cd0c8	ldr x8,[x0, #0x918]
009cd0cc	adrp x12,0x29a000
009cd0d0	str d8,[sp, #0x70]
009cd0d4	ldr d8,[x12, #0xa98]
009cd0d8	mov w23,#0x12a8
009cd0dc	cmp x11,#0x0
009cd0e0	mov x19,x0
009cd0e4	mov x26,xzr
009cd0e8	mov x28,xzr
009cd0ec	str x8,[sp, #0x10]
009cd0f0	mov w8,#0x1
009cd0f4	mov w9,#0x12c8
009cd0f8	mov w10,#0x10
009cd0fc	add x13,x0,x23
009cd100	csinc x11,x11,xzr,ne
009cd104	mov w24,#0x12b0
009cd108	add x29,sp,#0xd0
009cd10c	str x13,[sp, #0x18]
009cd110	str x11,[sp, #0x20]
009cd114	ldr w11,[x19, #0xc64]
009cd118	mov x27,x9
009cd11c	mov x21,x10
009cd120	str x8,[sp, #0x28]
009cd124	cmp w11,#0xf1
009cd128	b.ne 0x009cd138
009cd12c	ldr x8,[x19, #0x1cb0]
009cd130	cmp x8,#0x4
009cd134	b.hi 0x009cd310
009cd138	ldr x8,[sp, #0x28]
009cd13c	ldr x2,[x19, #0xc88]
009cd140	mov w1,#0x5
009cd144	sub x5,x29,#0x58
009cd148	cmp x8,#0x1
009cd14c	cset w4,eq
009cd150	mov x0,x19
009cd154	mov w3,wzr
009cd158	bl 0x00c36cc0
009cd15c	mov w25,w0
009cd160	cmp w0,#0x1
009cd164	b.lt 0x009cdff0
009cd168	ldr x9,[x19, #0x1cb0]
009cd16c	mov w8,#0xf1
009cd170	str w8,[x19, #0xc64]
009cd174	tbnz x9,#0x3f,0x009cd9ac
009cd178	cmp x9,#0x2
009cd17c	b.cc 0x009cd918
009cd180	cmp x9,#0x2
009cd184	b.eq 0x009cd918
009cd188	ldr x3,[x19, #0x1ca8]
009cd18c	ldr w10,[x19, #0x38]
009cd190	ldrb w8,[x3]
009cd194	ldrb w25,[x3, #0x1]
009cd198	ldrb w22,[x3, #0x2]
009cd19c	cbz w10,0x009cd1e8
009cd1a0	ldr w10,[x19, #0x1d08]
009cd1a4	cbz w10,0x009cd1e8
009cd1a8	tbz w8,#0x7,0x009cd1e8
009cd1ac	cmp w22,#0x1
009cd1b0	b.ne 0x009cd1e8
009cd1b4	lsl x8,x8,#0x8
009cd1b8	and x8,x8,#0x7f00
009cd1bc	orr x8,x8,x25
009cd1c0	add x9,x19,x26
009cd1c4	str d8,[x19,x23]
009cd1c8	str x8,[x9, #0x12b0]
009cd1cc	ldr x9,[x19, #0xc88]
009cd1d0	sub x9,x9,#0x2
009cd1d4	cmp x8,x9
009cd1d8	b.hi 0x009cdd50
009cd1dc	cmp x8,#0x8
009cd1e0	b.hi 0x009cd310
009cd1e4	b 0x009cdd78
009cd1e8	sub x9,x9,#0x3
009cd1ec	cmp x9,#0x1
009cd1f0	b.ls 0x009cda4c
009cd1f4	ldrb w9,[x3, #0x3]
009cd1f8	ldrb w10,[x3, #0x4]
009cd1fc	bfm w22,w25,#0x18,#0x7
009cd200	add x20,x19,x26
009cd204	str w8,[x20, #0x12ac]
009cd208	bfm x10,x9,#0x38,#0x7
009cd20c	str x10,[x20, #0x12b0]
009cd210	str w22,[x19, x23#0x0]
009cd214	ldr x8,[x19, #0x4c0]
009cd218	cbz x8,0x009cd238
009cd21c	ldr x6,[x19, #0x4c8]
009cd220	mov w2,#0x100
009cd224	mov w4,#0x5
009cd228	mov w0,wzr
009cd22c	mov w1,w22
009cd230	mov x5,x19
009cd234	blr x8
009cd238	ldr w8,[x19, #0xa08]
009cd23c	cbz w8,0x009cd2a4
009cd240	cmp w25,#0x3
009cd244	b.ne 0x009cdac4
009cd248	ldr x8,[x19, #0x8]
009cd24c	ldr x9,[x8, #0xc0]
009cd250	ldrb w9,[x9, #0x60]
009cd254	tbnz w9,#0x3,0x009cd2fc
009cd258	ldr w8,[x8]
009cd25c	cmp w8,#0x304
009cd260	b.lt 0x009cd2fc
009cd264	cmp w8,#0x10, LSL #12
009cd268	b.eq 0x009cd2fc
009cd26c	ldr x8,[x19, #0x848]
009cd270	cbz x8,0x009cd2fc
009cd274	ldr w8,[x20, #0x12ac]
009cd278	cmp w8,#0x17
009cd27c	b.eq 0x009cd2f0
009cd280	cmp w8,#0x15
009cd284	b.eq 0x009cd2e4
009cd288	cmp w8,#0x14
009cd28c	b.ne 0x009cdda0
009cd290	ldr x8,[x19, #0x240]
009cd294	cbz x8,0x009cd2f0
009cd298	ldr x8,[x19, #0x2c8]
009cd29c	cbz x8,0x009cd2f0
009cd2a0	b 0x009cdda0
009cd2a4	ldr x8,[x19, #0x8]
009cd2a8	ldr x9,[x8, #0xc0]
009cd2ac	ldrb w9,[x9, #0x60]
009cd2b0	tbnz w9,#0x3,0x009cd2c8
009cd2b4	ldr w8,[x8]
009cd2b8	cmp w8,#0x304
009cd2bc	b.lt 0x009cd2c8
009cd2c0	cmp w8,#0x10, LSL #12
009cd2c4	b.ne 0x009cd240
009cd2c8	ldr w8,[x19, #0x8e8]
009cd2cc	cmp w8,#0x1
009cd2d0	b.eq 0x009cd240
009cd2d4	ldr w8,[x19]
009cd2d8	cmp w22,w8
009cd2dc	b.eq 0x009cd240
009cd2e0	b 0x009cdeb8
009cd2e4	ldr w8,[x19, #0x80]
009cd2e8	cmp w8,#0x1
009cd2ec	b.ne 0x009cdda0
009cd2f0	ldr w8,[x19, x23#0x0]
009cd2f4	cmp w8,#0x303
009cd2f8	b.ne 0x009cde94
009cd2fc	ldr x8,[x19, #0xc88]
009cd300	ldr x9,[x20, #0x12b0]
009cd304	sub x8,x8,#0x5
009cd308	cmp x9,x8
009cd30c	b.hi 0x009cdb74
009cd310	ldr x8,[x19, #0x8]
009cd314	ldr x9,[x8, #0xc0]
009cd318	ldrb w9,[x9, #0x60]
009cd31c	tbnz w9,#0x3,0x009cd350
009cd320	ldr w8,[x8]
009cd324	cmp w8,#0x304
009cd328	b.lt 0x009cd350
009cd32c	cmp w8,#0x10, LSL #12
009cd330	b.eq 0x009cd350
009cd334	add x8,x19,x26
009cd338	ldr x8,[x8, #0x12b0]
009cd33c	mov w9,#0x4101
009cd340	cmp x8,x9
009cd344	b.cs 0x009cdce4
009cd348	add x22,x19,x24
009cd34c	b 0x009cd384
009cd350	ldr x9,[x19, #0x870]
009cd354	add x8,x19,x26
009cd358	ldr x8,[x8, #0x12b0]
009cd35c	mov w10,#0x4140
009cd360	cmp x9,#0x0
009cd364	mov w9,#0x4540
009cd368	csel x9,x10,x9,eq
009cd36c	cmp x8,x9
009cd370	b.hi 0x009cda30
009cd374	mov w9,#0x50
009cd378	madd x9,x28,x9,x19
009cd37c	mov w10,#0x12b0
009cd380	add x22,x9,x10
009cd384	ldr w9,[x19, x23#0x0]
009cd388	sub x10,x8,#0x3
009cd38c	cmp w9,#0x2
009cd390	csel x1,x10,x8,eq
009cd394	cbz x1,0x009cd3c0
009cd398	mov w3,#0x1
009cd39c	sub x5,x29,#0x58
009cd3a0	mov x0,x19
009cd3a4	mov x2,x1
009cd3a8	mov w4,wzr
009cd3ac	bl 0x00c36cc0
009cd3b0	mov w25,w0
009cd3b4	cmp w0,#0x1
009cd3b8	b.lt 0x009cdff0
009cd3bc	ldr w9,[x19, x23#0x0]
009cd3c0	orr w8,wzr,#0xf0
009cd3c4	str w8,[x19, #0xc64]
009cd3c8	ldr x8,[x19, #0x1ca8]
009cd3cc	cmp w9,#0x2
009cd3d0	mov w9,#0x5
009cd3d4	mov w10,#0x2
009cd3d8	csel x9,x10,x9,eq
009cd3dc	add x20,x19,x26
009cd3e0	add x8,x8,x9
009cd3e4	str x8,[x20, #0x12d0]
009cd3e8	str x8,[x19, x27#0x0]
009cd3ec	ldp x10,x9,[sp, #0x20]
009cd3f0	ldr x8,[x22]
009cd3f4	str wzr,[x20, #0x12e0]
009cd3f8	cmp x9,x10
009cd3fc	str x8,[x20, #0x12b8]
009cd400	str xzr,[x19, #0x1cb0]
009cd404	str wzr,[x19, #0x1d08]
009cd408	b.cs 0x009cd49c
009cd40c	ldr w8,[x20, #0x12ac]
009cd410	cmp w8,#0x17
009cd414	b.ne 0x009cd49c
009cd418	ldr x8,[x19, #0x8]
009cd41c	ldr x8,[x8, #0xc0]
009cd420	ldrb w8,[x8, #0x60]
009cd424	tbz w8,#0x0,0x009cd49c
009cd428	ldr x0,[x19, #0x848]
009cd42c	cbz x0,0x009cd49c
009cd430	bl 0x00c34b80
009cd434	bl 0x00c35280
009cd438	tbz w0,#0x17,0x009cd49c
009cd43c	ldr x8,[x19, #0xc78]
009cd440	cbz x8,0x009cd49c
009cd444	ldr x10,[x19, #0xc98]
009cd448	cmp x10,#0x5
009cd44c	b.cc 0x009cd49c
009cd450	ldr x9,[x19, #0xc90]
009cd454	add x8,x8,x9
009cd458	ldrb w9,[x8]
009cd45c	cmp w9,#0x17
009cd460	b.ne 0x009cd49c
009cd464	ldrb w11,[x8, #0x3]
009cd468	ldrb w12,[x8, #0x4]
009cd46c	ldr x8,[sp, #0x28]
009cd470	add x28,x28,#0x1
009cd474	add x26,x26,#0x50
009cd478	bfm x12,x11,#0x38,#0x7
009cd47c	add x11,x12,#0x5
009cd480	add x8,x8,#0x1
009cd484	add x24,x24,#0x50
009cd488	add x9,x27,#0x50
009cd48c	add x23,x23,#0x50
009cd490	cmp x10,x11
009cd494	add x10,x21,#0x10
009cd498	b.cs 0x009cd114
009cd49c	ldr x8,[sp, #0x28]
009cd4a0	subs x26,x8,#0x1
009cd4a4	b.ne 0x009cd4f0
009cd4a8	ldr w8,[x19, #0x12ac]
009cd4ac	cmp w8,#0x14
009cd4b0	b.ne 0x009cd4f0
009cd4b4	ldr x8,[x19, #0x8]
009cd4b8	ldr x9,[x8, #0xc0]
009cd4bc	ldrb w9,[x9, #0x60]
009cd4c0	tbnz w9,#0x3,0x009cd4d8
009cd4c4	ldr w8,[x8]
009cd4c8	cmp w8,#0x304
009cd4cc	b.lt 0x009cd4d8
009cd4d0	cmp w8,#0x10, LSL #12
009cd4d4	b.ne 0x009cd4e0
009cd4d8	ldr w8,[x19, #0x8e8]
009cd4dc	cbz w8,0x009cd4f0
009cd4e0	ldr x8,[x19, #0x240]
009cd4e4	cbz x8,0x009cd9d0
009cd4e8	ldr x8,[x19, #0x2c8]
009cd4ec	cbz x8,0x009cd9d0
009cd4f0	ldr x0,[x19, #0x860]
009cd4f4	cbz x0,0x009cd59c
009cd4f8	bl 0x00c34c00
009cd4fc	cbz x0,0x009cd59c
009cd500	bl 0x00c34c20
009cd504	cmp w0,#0x40
009cd508	b.hi 0x009cd950
009cd50c	sxtw x25,w0
009cd510	ldrb w8,[x19, #0xa9]
009cd514	tbz w8,#0x0,0x009cd5a8
009cd518	ldr x8,[x19, #0x860]
009cd51c	cbz x8,0x009cd5a8
009cd520	ldr x8,[sp, #0x28]
009cd524	cbz x8,0x009cd594
009cd528	mov w8,#0x12a8
009cd52c	mov x20,xzr
009cd530	add x21,x19,x8
009cd534	ldr x8,[x21, #0x8]
009cd538	subs x22,x8,x25
009cd53c	b.cc 0x009cdcc8
009cd540	str x22,[x21, #0x8]
009cd544	ldr x8,[x19, #0x8]
009cd548	ldr x23,[x21, #0x20]
009cd54c	add x2,sp,#0x30
009cd550	mov x0,x19
009cd554	ldr x8,[x8, #0xc0]
009cd558	mov x1,x21
009cd55c	mov w3,wzr
009cd560	ldr x8,[x8, #0x8]
009cd564	blr x8
009cd568	cbz w0,0x009cdb90
009cd56c	add x1,x23,x22
009cd570	add x0,sp,#0x30
009cd574	mov x2,x25
009cd578	bl 0x00c362f0
009cd57c	cbnz w0,0x009cdb90
009cd580	ldr x8,[sp, #0x28]
009cd584	add x20,x20,#0x1
009cd588	add x21,x21,#0x50
009cd58c	cmp x20,x8
009cd590	b.cc 0x009cd534
009cd594	mov x25,xzr
009cd598	b 0x009cd5d0
009cd59c	mov x25,xzr
009cd5a0	ldrb w8,[x19, #0xa9]
009cd5a4	tbnz w8,#0x0,0x009cd518
009cd5a8	cbz x25,0x009cd5d0
009cd5ac	adrp x1,0x2cf000
009cd5b0	add x1,x1,#0x7d6
009cd5b4	mov w2,#0x23c
009cd5b8	mov x0,x21
009cd5bc	bl 0x00c34250
009cd5c0	cbz x0,0x009cd97c
009cd5c4	mov x28,x0
009cd5c8	mov x22,x0
009cd5cc	b 0x009cd5d8
009cd5d0	mov x28,xzr
009cd5d4	mov x22,xzr
009cd5d8	bl 0x00c35250
009cd5dc	ldr x8,[x19, #0x8]
009cd5e0	ldr x1,[sp, #0x18]
009cd5e4	ldr x2,[sp, #0x28]
009cd5e8	mov x0,x19
009cd5ec	ldr x8,[x8, #0xc0]
009cd5f0	mov w3,wzr
009cd5f4	mov x4,x22
009cd5f8	mov x5,x25
009cd5fc	ldr x8,[x8]
009cd600	blr x8
009cd604	cbz w0,0x009cd934
009cd608	mov w24,w0
009cd60c	bl 0x00c35ed0
009cd610	ldr x8,[sp, #0x10]
009cd614	cbz x8,0x009cd6bc
009cd618	ldr x8,[x19, #0x848]
009cd61c	cbz x8,0x009cd6bc
009cd620	ldrb w8,[x19, #0xa9]
009cd624	tbnz w8,#0x0,0x009cd6bc
009cd628	ldr x0,[x19, #0x860]
009cd62c	bl 0x00c34c00
009cd630	cbz x0,0x009cd6bc
009cd634	ldr x8,[sp, #0x28]
009cd638	cbz x8,0x009cd6bc
009cd63c	mov w8,#0x4400
009cd640	mov w9,#0x12a8
009cd644	add x20,x25,x8
009cd648	add x23,x19,x9
009cd64c	mov x21,#-0x1
009cd650	mov x27,x22
009cd654	ldr x8,[x19, #0x8]
009cd658	add x2,sp,#0x30
009cd65c	mov x0,x19
009cd660	mov x1,x23
009cd664	ldr x8,[x8, #0xc0]
009cd668	mov w3,wzr
009cd66c	ldr x8,[x8, #0x8]
009cd670	blr x8
009cd674	cbz x27,0x009cd694
009cd678	cbz w0,0x009cd694
009cd67c	ldr x1,[x27]
009cd680	cbz x1,0x009cd694
009cd684	add x0,sp,#0x30
009cd688	mov x2,x25
009cd68c	bl 0x00c362f0
009cd690	cbz w0,0x009cd698
009cd694	mov w24,wzr
009cd698	ldr x8,[x23, #0x8]
009cd69c	add x21,x21,#0x1
009cd6a0	add x27,x27,#0x10
009cd6a4	add x23,x23,#0x50
009cd6a8	cmp x8,x20
009cd6ac	csel w24,wzr,w24,hi
009cd6b0	cmp x26,x21
009cd6b4	b.ne 0x009cd654
009cd6b8	cbz w24,0x009cdf04
009cd6bc	ldr x8,[sp, #0x28]
009cd6c0	str x28,[sp, #0x20]
009cd6c4	cbz x8,0x009cd8d0
009cd6c8	mov x24,xzr
009cd6cc	mov w25,#0x50
009cd6d0	mov w28,#0x12b0
009cd6d4	mov w23,#0x4401
009cd6d8	ldr x0,[x19, #0x870]
009cd6dc	cbz x0,0x009cd760
009cd6e0	madd x8,x24,x25,x19
009cd6e4	ldr x4,[x8, #0x12b0]
009cd6e8	cmp x4,x23
009cd6ec	b.cs 0x009cdd28
009cd6f0	madd x9,x24,x25,x19
009cd6f4	ldr x1,[x9, #0x12d8]
009cd6f8	add x21,x8,x28
009cd6fc	mov w8,#0x12d8
009cd700	add x20,x9,x8
009cd704	cbnz x1,0x009cd734
009cd708	adrp x1,0x2cf000
009cd70c	mov w0,#0x4540
009cd710	mov w2,#0x325
009cd714	add x1,x1,#0x7d6
009cd718	bl 0x00c32320
009cd71c	str x0,[x20]
009cd720	cbz x0,0x009cdca0
009cd724	mov x1,x0
009cd728	ldr x0,[x19, #0x870]
009cd72c	ldr x4,[x21]
009cd730	nop
009cd734	madd x27,x24,x25,x19
009cd738	ldr x3,[x27, #0x12c8]
009cd73c	mov w2,#0x4000
009cd740	bl 0x00c36d30
009cd744	tbnz w0,#0x1f,0x009cdca0
009cd748	sxtw x8,w0
009cd74c	str x8,[x21]
009cd750	ldr x8,[x20]
009cd754	mov w9,#0x12c8
009cd758	add x9,x27,x9
009cd75c	str x8,[x9]
009cd760	ldr x8,[x19, #0x8]
009cd764	ldr x9,[x8, #0xc0]
009cd768	ldr w9,[x9, #0x60]
009cd76c	tbnz w9,#0x3,0x009cd828
009cd770	ldr w10,[x8]
009cd774	cmp w10,#0x304
009cd778	b.lt 0x009cd828
009cd77c	cmp w10,#0x10, LSL #12
009cd780	b.eq 0x009cd828
009cd784	ldr x10,[x19, #0x848]
009cd788	cbz x10,0x009cd828
009cd78c	madd x10,x24,x25,x19
009cd790	ldr w11,[x10, #0x12ac]
009cd794	cmp w11,#0x15
009cd798	b.eq 0x009cd828
009cd79c	cmp w11,#0x17
009cd7a0	b.ne 0x009cdf60
009cd7a4	madd x12,x24,x25,x19
009cd7a8	ldr x13,[x12, #0x12b0]
009cd7ac	cbz x13,0x009cdf60
009cd7b0	madd x11,x24,x25,x19
009cd7b4	ldr x11,[x11, #0x12c8]
009cd7b8	mov w14,#0x12ac
009cd7bc	add x10,x10,x14
009cd7c0	add x12,x12,x28
009cd7c4	sub x13,x13,#0x1
009cd7c8	cbz x13,0x009cd7dc
009cd7cc	ldrb w14,[x11, x13]
009cd7d0	sub x13,x13,#0x1
009cd7d4	cbz w14,0x009cd7c8
009cd7d8	add x13,x13,#0x1
009cd7dc	str x13,[x12]
009cd7e0	add x3,x11,x13
009cd7e4	ldrb w11,[x3]
009cd7e8	sub w12,w11,#0x15
009cd7ec	cmp w12,#0x3
009cd7f0	str w11,[x10]
009cd7f4	b.cs 0x009cdf7c
009cd7f8	ldr x10,[x19, #0x4c0]
009cd7fc	cbz x10,0x009cd828
009cd800	ldr w1,[x19]
009cd804	ldr x6,[x19, #0x4c8]
009cd808	mov w2,#0x101
009cd80c	mov w4,#0x1
009cd810	mov w0,wzr
009cd814	mov x5,x19
009cd818	blr x10
009cd81c	ldr x8,[x19, #0x8]
009cd820	ldr x9,[x8, #0xc0]
009cd824	ldr w9,[x9, #0x60]
009cd828	tbnz w9,#0x3,0x009cd860
009cd82c	ldr w8,[x8]
009cd830	cmp w8,#0x304
009cd834	b.lt 0x009cd860
009cd838	cmp w8,#0x10, LSL #12
009cd83c	b.eq 0x009cd860
009cd840	madd x8,x24,x25,x19
009cd844	ldr w8,[x8, #0x12ac]
009cd848	sub w8,w8,#0x15
009cd84c	cmp w8,#0x1
009cd850	b.hi 0x009cd860
009cd854	madd x8,x24,x25,x19
009cd858	ldr x8,[x8, #0x12b0]
009cd85c	cbz x8,0x009cdf1c
009cd860	madd x8,x24,x25,x19
009cd864	ldr x8,[x8, #0x12b0]
009cd868	cmp x8,#0x4, LSL #12
009cd86c	b.hi 0x009cdc84
009cd870	ldr x9,[x19, #0x918]
009cd874	cbz x9,0x009cd898
009cd878	ldrb w9,[x9, #0x368]
009cd87c	sub w9,w9,#0x1
009cd880	cmp w9,#0x3
009cd884	b.hi 0x009cd898
009cd888	mov w10,#0x200
009cd88c	lsl w9,w10,w9
009cd890	cmp x8,x9
009cd894	b.hi 0x009cde00
009cd898	madd x9,x24,x25,x19
009cd89c	str xzr,[x9, #0x12c0]
009cd8a0	cbz x8,0x009cd8ac
009cd8a4	str xzr,[x19, #0x1cd0]
009cd8a8	b 0x009cd8c0
009cd8ac	ldr x8,[x19, #0x1cd0]
009cd8b0	add x8,x8,#0x1
009cd8b4	cmp x8,#0x21
009cd8b8	str x8,[x19, #0x1cd0]
009cd8bc	b.cs 0x009cddc8
009cd8c0	ldr x8,[sp, #0x28]
009cd8c4	add x24,x24,#0x1
009cd8c8	cmp x24,x8
009cd8cc	b.cc 0x009cd6d8
009cd8d0	ldr w8,[x19, #0x84]
009cd8d4	cmp w8,#0xb
009cd8d8	b.ne 0x009cd900
009cd8dc	ldr w8,[x19, #0x12ac]
009cd8e0	cmp w8,#0x17
009cd8e4	b.ne 0x009cd900
009cd8e8	ldr x1,[x19, #0x12b0]
009cd8ec	mov x0,x19
009cd8f0	mov x2,xzr
009cd8f4	mov w3,wzr
009cd8f8	bl 0x009ccf94
009cd8fc	cbz w0,0x009cde30
009cd900	ldr x8,[sp, #0x28]
009cd904	mov w25,#0x1
009cd908	str x8,[x19, #0xc68]
009cd90c	ldr x28,[sp, #0x20]
009cd910	cbnz x22,0x009cde3c
009cd914	b 0x009cdff0
009cd918	bl 0x00c342a0
009cd91c	adrp x0,0x2cf000
009cd920	adrp x2,0x2cb000
009cd924	add x0,x0,#0x7d6
009cd928	add x2,x2,#0x5c7
009cd92c	mov w1,#0xf7
009cd930	b 0x009cda88
009cd934	mov x0,x19
009cd938	bl 0x00c35ce0
009cd93c	cbz w0,0x009cdbb8
009cd940	bl 0x00c35ed0
009cd944	mov w25,#0xffffffff
009cd948	cbnz x22,0x009cde3c
009cd94c	b 0x009cdff0
009cd950	bl 0x00c342a0
009cd954	adrp x0,0x2cf000
009cd958	adrp x2,0x2cb000
009cd95c	add x0,x0,#0x7d6
009cd960	add x2,x2,#0x5c7
009cd964	mov w1,#0x216
009cd968	bl 0x00c342b0
009cd96c	mov w2,#0x6
009cd970	mov w1,#0x50
009cd974	movk w2,#0x8, LSL #16
009cd978	b 0x009cdfe0
009cd97c	bl 0x00c342a0
009cd980	adrp x0,0x2cf000
009cd984	adrp x2,0x2cb000
009cd988	add x0,x0,#0x7d6
009cd98c	add x2,x2,#0x5c7
009cd990	mov w1,#0x23e
009cd994	bl 0x00c342b0
009cd998	mov w8,#0x103
009cd99c	movk w8,#0xc, LSL #16
009cd9a0	sub w2,w8,#0x3
009cd9a4	mov w1,#0x50
009cd9a8	b 0x009cdfe0
009cd9ac	bl 0x00c342a0
009cd9b0	adrp x0,0x2cf000
009cd9b4	adrp x2,0x2cb000
009cd9b8	add x0,x0,#0x7d6
009cd9bc	add x2,x2,#0x5c7
009cd9c0	mov w1,#0xf1
009cd9c4	bl 0x00c342b0
009cd9c8	mov w1,#0x50
009cd9cc	b 0x009cda90
009cd9d0	ldr x8,[x22]
009cd9d4	cmp x8,#0x1
009cd9d8	b.ne 0x009cda9c
009cd9dc	ldr x8,[x19, x27#0x0]
009cd9e0	ldrb w8,[x8]
009cd9e4	cmp w8,#0x1
009cd9e8	b.ne 0x009cda9c
009cd9ec	ldr x8,[x19, #0x1cd0]
009cd9f0	mov w9,#0x16
009cd9f4	str w9,[x19, #0x12ac]
009cd9f8	add x8,x8,#0x1
009cd9fc	cmp x8,#0x21
009cda00	str x8,[x19, #0x1cd0]
009cda04	b.cc 0x009cddf0
009cda08	bl 0x00c342a0
009cda0c	adrp x0,0x2cf000
009cda10	adrp x2,0x2cb000
009cda14	add x0,x0,#0x7d6
009cda18	add x2,x2,#0x5c7
009cda1c	mov w1,#0x200
009cda20	bl 0x00c342b0
009cda24	mov w1,#0xa
009cda28	mov w2,#0x106
009cda2c	b 0x009cdfe0
009cda30	bl 0x00c342a0
009cda34	adrp x0,0x2cf000
009cda38	adrp x2,0x2cb000
009cda3c	add x0,x0,#0x7d6
009cda40	add x2,x2,#0x5c7
009cda44	mov w1,#0x1a1
009cda48	b 0x009cdcfc
009cda4c	ldr x8,[x19, #0x4c0]
009cda50	cbz x8,0x009cda70
009cda54	ldr x6,[x19, #0x4c8]
009cda58	mov w2,#0x100
009cda5c	mov w4,#0x5
009cda60	mov w0,wzr
009cda64	mov w1,wzr
009cda68	mov x5,x19
009cda6c	blr x8
009cda70	bl 0x00c342a0
009cda74	adrp x0,0x2cf000
009cda78	adrp x2,0x2cb000
009cda7c	add x0,x0,#0x7d6
009cda80	add x2,x2,#0x5c7
009cda84	mov w1,#0x123
009cda88	bl 0x00c342b0
009cda8c	mov w1,#0x32
009cda90	mov w2,#0x103
009cda94	movk w2,#0xc, LSL #16
009cda98	b 0x009cdfe0
009cda9c	bl 0x00c342a0
009cdaa0	adrp x0,0x2cf000
009cdaa4	adrp x2,0x2cb000
009cdaa8	add x0,x0,#0x7d6
009cdaac	add x2,x2,#0x5c7
009cdab0	mov w1,#0x1f4
009cdab4	bl 0x00c342b0
009cdab8	mov w1,#0x2f
009cdabc	mov w2,#0x104
009cdac0	b 0x009cdfe0
009cdac4	ldr w8,[x19, #0x1d08]
009cdac8	cbz w8,0x009cdd0c
009cdacc	ldr x20,[x19, #0x1ca8]
009cdad0	adrp x1,0x2b7000
009cdad4	add x1,x1,#0x3db
009cdad8	mov w2,#0x4
009cdadc	mov x0,x20
009cdae0	bl 0x00c31bb0
009cdae4	cbz w0,0x009cdc4c
009cdae8	adrp x1,0x29f000
009cdaec	add x1,x1,#0xea6
009cdaf0	mov w2,#0x5
009cdaf4	mov x0,x20
009cdaf8	bl 0x00c31bb0
009cdafc	cbz w0,0x009cdc4c
009cdb00	adrp x1,0x2d3000
009cdb04	add x1,x1,#0x815
009cdb08	mov w2,#0x5
009cdb0c	mov x0,x20
009cdb10	bl 0x00c31bb0
009cdb14	cbz w0,0x009cdc4c
009cdb18	adrp x1,0x2b9000
009cdb1c	add x1,x1,#0x9ff
009cdb20	mov w2,#0x4
009cdb24	mov x0,x20
009cdb28	bl 0x00c31bb0
009cdb2c	cbz w0,0x009cdc4c
009cdb30	adrp x1,0x2b7000
009cdb34	add x1,x1,#0x7e6
009cdb38	mov w2,#0x5
009cdb3c	mov x0,x20
009cdb40	bl 0x00c31bb0
009cdb44	mov w20,w0
009cdb48	bl 0x00c342a0
009cdb4c	adrp x0,0x2cf000
009cdb50	adrp x2,0x2cb000
009cdb54	add x0,x0,#0x7d6
009cdb58	add x2,x2,#0x5c7
009cdb5c	cbz w20,0x009cdfa4
009cdb60	mov w1,#0x163
009cdb64	bl 0x00c342b0
009cdb68	mov w1,#0xffffffff
009cdb6c	mov w2,#0x10b
009cdb70	b 0x009cdc70
009cdb74	bl 0x00c342a0
009cdb78	adrp x0,0x2cf000
009cdb7c	adrp x2,0x2cb000
009cdb80	add x0,x0,#0x7d6
009cdb84	add x2,x2,#0x5c7
009cdb88	mov w1,#0x181
009cdb8c	b 0x009cdd68
009cdb90	bl 0x00c342a0
009cdb94	adrp x0,0x2cf000
009cdb98	adrp x2,0x2cb000
009cdb9c	add x0,x0,#0x7d6
009cdba0	add x2,x2,#0x5c7
009cdba4	mov w1,#0x230
009cdba8	bl 0x00c342b0
009cdbac	mov w1,#0x14
009cdbb0	mov w2,#0x119
009cdbb4	b 0x009cdfe0
009cdbb8	ldr x8,[sp, #0x28]
009cdbbc	cmp x8,#0x1
009cdbc0	b.ne 0x009cdc0c
009cdbc4	mov x0,x19
009cdbc8	bl 0x00c36ca0
009cdbcc	cbz w0,0x009cdc0c
009cdbd0	bl 0x00c35240
009cdbd4	ldr x1,[x19, #0x12b0]
009cdbd8	mov w2,#0x68
009cdbdc	mov x0,x19
009cdbe0	mov w3,wzr
009cdbe4	bl 0x009ccf94
009cdbe8	cbz w0,0x009cdf10
009cdbec	ldr x0,[sp, #0x8]
009cdbf0	mov w25,#0x1
009cdbf4	str xzr,[x19, #0x12b0]
009cdbf8	str w25,[x19, #0x12e0]
009cdbfc	str x25,[x19, #0xc68]
009cdc00	bl 0x00c34c60
009cdc04	cbnz x22,0x009cde3c
009cdc08	b 0x009cdff0
009cdc0c	bl 0x00c35ed0
009cdc10	bl 0x00c342a0
009cdc14	adrp x0,0x2cf000
009cdc18	adrp x2,0x2cb000
009cdc1c	add x0,x0,#0x7d6
009cdc20	add x2,x2,#0x5c7
009cdc24	mov w1,#0x26f
009cdc28	bl 0x00c342b0
009cdc2c	mov w1,#0x14
009cdc30	mov w2,#0x119
009cdc34	mov x0,x19
009cdc38	mov x3,xzr
009cdc3c	bl 0x00c34410
009cdc40	mov w25,#0xffffffff
009cdc44	cbnz x22,0x009cde3c
009cdc48	b 0x009cdff0
009cdc4c	bl 0x00c342a0
009cdc50	adrp x0,0x2cf000
009cdc54	adrp x2,0x2cb000
009cdc58	add x0,x0,#0x7d6
009cdc5c	add x2,x2,#0x5c7
009cdc60	mov w1,#0x159
009cdc64	bl 0x00c342b0
009cdc68	mov w1,#0xffffffff
009cdc6c	mov w2,#0x9c
009cdc70	mov x0,x19
009cdc74	mov x3,xzr
009cdc78	mov w25,#0xffffffff
009cdc7c	bl 0x00c34410
009cdc80	b 0x009cdff0
009cdc84	bl 0x00c342a0
009cdc88	adrp x0,0x2cf000
009cdc8c	adrp x2,0x2cb000
009cdc90	add x0,x0,#0x7d6
009cdc94	add x2,x2,#0x5c7
009cdc98	mov w1,#0x2e3
009cdc9c	b 0x009cde18
009cdca0	bl 0x00c342a0
009cdca4	adrp x0,0x2cf000
009cdca8	adrp x2,0x2cb000
009cdcac	add x0,x0,#0x7d6
009cdcb0	add x2,x2,#0x5c7
009cdcb4	mov w1,#0x2ab
009cdcb8	bl 0x00c342b0
009cdcbc	orr w1,wzr,#0x1e
009cdcc0	mov w2,#0x6b
009cdcc4	b 0x009cde24
009cdcc8	bl 0x00c342a0
009cdccc	adrp x0,0x2cf000
009cdcd0	adrp x2,0x2cb000
009cdcd4	add x0,x0,#0x7d6
009cdcd8	add x2,x2,#0x5c7
009cdcdc	mov w1,#0x228
009cdce0	b 0x009cdd90
009cdce4	bl 0x00c342a0
009cdce8	adrp x0,0x2cf000
009cdcec	adrp x2,0x2cb000
009cdcf0	add x0,x0,#0x7d6
009cdcf4	add x2,x2,#0x5c7
009cdcf8	mov w1,#0x18c
009cdcfc	bl 0x00c342b0
009cdd00	mov w1,#0x16
009cdd04	mov w2,#0x96
009cdd08	b 0x009cdfe0
009cdd0c	bl 0x00c342a0
009cdd10	adrp x0,0x2cf000
009cdd14	adrp x2,0x2cb000
009cdd18	add x0,x0,#0x7d6
009cdd1c	add x2,x2,#0x5c7
009cdd20	mov w1,#0x167
009cdd24	b 0x009cdfd4
009cdd28	bl 0x00c342a0
009cdd2c	adrp x0,0x2cf000
009cdd30	adrp x2,0x2cb000
009cdd34	add x0,x0,#0x7d6
009cdd38	add x2,x2,#0x5c7
009cdd3c	mov w1,#0x2a6
009cdd40	bl 0x00c342b0
009cdd44	mov w1,#0x16
009cdd48	mov w2,#0x8c
009cdd4c	b 0x009cde24
009cdd50	bl 0x00c342a0
009cdd54	adrp x0,0x2cf000
009cdd58	adrp x2,0x2cb000
009cdd5c	add x0,x0,#0x7d6
009cdd60	add x2,x2,#0x5c7
009cdd64	mov w1,#0x111
009cdd68	bl 0x00c342b0
009cdd6c	mov w1,#0x16
009cdd70	mov w2,#0xc6
009cdd74	b 0x009cdfe0
009cdd78	bl 0x00c342a0
009cdd7c	adrp x0,0x2cf000
009cdd80	adrp x2,0x2cb000
009cdd84	add x0,x0,#0x7d6
009cdd88	add x2,x2,#0x5c7
009cdd8c	mov w1,#0x116
009cdd90	bl 0x00c342b0
009cdd94	mov w1,#0x32
009cdd98	mov w2,#0xa0
009cdd9c	b 0x009cdfe0
009cdda0	bl 0x00c342a0
009cdda4	adrp x0,0x2cf000
009cdda8	adrp x2,0x2cb000
009cddac	add x0,x0,#0x7d6
009cddb0	add x2,x2,#0x5c7
009cddb4	mov w1,#0x174
009cddb8	bl 0x00c342b0
009cddbc	mov w1,#0xa
009cddc0	mov w2,#0x1bb
009cddc4	b 0x009cdfe0
009cddc8	bl 0x00c342a0
009cddcc	adrp x0,0x2cf000
009cddd0	adrp x2,0x2cb000
009cddd4	add x0,x0,#0x7d6
009cddd8	add x2,x2,#0x5c7
009cdddc	orr w1,wzr,#0x300
009cdde0	bl 0x00c342b0
009cdde4	mov w1,#0xa
009cdde8	mov w2,#0x12a
009cddec	b 0x009cde24
009cddf0	mov w25,#0x1
009cddf4	str w25,[x20, #0x12e0]
009cddf8	str x25,[x19, #0xc68]
009cddfc	b 0x009cdff0
009cde00	bl 0x00c342a0
009cde04	adrp x0,0x2cf000
009cde08	adrp x2,0x2cb000
009cde0c	add x0,x0,#0x7d6
009cde10	add x2,x2,#0x5c7
009cde14	mov w1,#0x2ee
009cde18	bl 0x00c342b0
009cde1c	mov w1,#0x16
009cde20	mov w2,#0x92
009cde24	mov x0,x19
009cde28	mov x3,xzr
009cde2c	bl 0x00c34410
009cde30	mov w25,#0xffffffff
009cde34	ldr x28,[sp, #0x20]
009cde38	cbz x22,0x009cdff0
009cde3c	ldr x8,[sp, #0x28]
009cde40	cbz x8,0x009cde7c
009cde44	adrp x19,0x2cf000
009cde48	add x20,x22,#0x8
009cde4c	mov x21,#-0x1
009cde50	add x19,x19,#0x7d6
009cde54	ldr w8,[x20]
009cde58	cbz w8,0x009cde6c
009cde5c	ldur x0,[x20, #-0x8]
009cde60	mov w2,#0x317
009cde64	mov x1,x19
009cde68	bl 0x00c32310
009cde6c	add x21,x21,#0x1
009cde70	cmp x26,x21
009cde74	add x20,x20,#0x10
009cde78	b.ne 0x009cde54
009cde7c	adrp x1,0x2cf000
009cde80	add x1,x1,#0x7d6
009cde84	mov w2,#0x319
009cde88	mov x0,x28
009cde8c	bl 0x00c32310
009cde90	b 0x009cdff0
009cde94	bl 0x00c342a0
009cde98	adrp x0,0x2cf000
009cde9c	adrp x2,0x2cb000
009cdea0	add x0,x0,#0x7d6
009cdea4	add x2,x2,#0x5c7
009cdea8	mov w1,#0x179
009cdeac	bl 0x00c342b0
009cdeb0	mov w1,#0x32
009cdeb4	b 0x009cdfdc
009cdeb8	lsl w9,w25,#0x8
009cdebc	and w8,w8,#0xff00
009cdec0	cmp w8,w9
009cdec4	b.ne 0x009cdfbc
009cdec8	ldr x8,[x19, #0x878]
009cdecc	cbnz x8,0x009cdfbc
009cded0	ldr x8,[x19, #0x890]
009cded4	cbnz x8,0x009cdfbc
009cded8	add x8,x19,x26
009cdedc	ldr w8,[x8, #0x12ac]
009cdee0	cmp w8,#0x15
009cdee4	b.ne 0x009cdfb8
009cdee8	bl 0x00c342a0
009cdeec	adrp x0,0x2cf000
009cdef0	adrp x2,0x2cb000
009cdef4	add x0,x0,#0x7d6
009cdef8	add x2,x2,#0x5c7
009cdefc	mov w1,#0x143
009cdf00	b 0x009cdb64
009cdf04	mov x0,x19
009cdf08	bl 0x00c35ce0
009cdf0c	cbz w0,0x009cdf44
009cdf10	mov w25,#0xffffffff
009cdf14	cbnz x22,0x009cde3c
009cdf18	b 0x009cdff0
009cdf1c	bl 0x00c342a0
009cdf20	adrp x0,0x2cf000
009cdf24	adrp x2,0x2cb000
009cdf28	add x0,x0,#0x7d6
009cdf2c	add x2,x2,#0x5c7
009cdf30	mov w1,#0x2d5
009cdf34	bl 0x00c342b0
009cdf38	mov w1,#0xa
009cdf3c	mov w2,#0x10f
009cdf40	b 0x009cde24
009cdf44	bl 0x00c342a0
009cdf48	adrp x0,0x2cf000
009cdf4c	adrp x2,0x2cb000
009cdf50	add x0,x0,#0x7d6
009cdf54	add x2,x2,#0x5c7
009cdf58	mov w1,#0x299
009cdf5c	b 0x009cdc28
009cdf60	bl 0x00c342a0
009cdf64	adrp x0,0x2cf000
009cdf68	adrp x2,0x2cb000
009cdf6c	add x0,x0,#0x7d6
009cdf70	add x2,x2,#0x5c7
009cdf74	mov w1,#0x2b7
009cdf78	b 0x009cdf94
009cdf7c	bl 0x00c342a0
009cdf80	adrp x0,0x2cf000
009cdf84	adrp x2,0x2cb000
009cdf88	add x0,x0,#0x7d6
009cdf8c	add x2,x2,#0x5c7
009cdf90	mov w1,#0x2c5
009cdf94	bl 0x00c342b0
009cdf98	mov w1,#0xa
009cdf9c	mov w2,#0x1bb
009cdfa0	b 0x009cde24
009cdfa4	mov w1,#0x15d
009cdfa8	bl 0x00c342b0
009cdfac	mov w1,#0xffffffff
009cdfb0	mov w2,#0x9b
009cdfb4	b 0x009cdc70
009cdfb8	str w22,[x19]
009cdfbc	bl 0x00c342a0
009cdfc0	adrp x0,0x2cf000
009cdfc4	adrp x2,0x2cb000
009cdfc8	add x0,x0,#0x7d6
009cdfcc	add x2,x2,#0x5c7
009cdfd0	mov w1,#0x14c
009cdfd4	bl 0x00c342b0
009cdfd8	mov w1,#0x46
009cdfdc	mov w2,#0x10b
009cdfe0	mov x0,x19
009cdfe4	mov x3,xzr
009cdfe8	bl 0x00c34410
009cdfec	mov w25,#0xffffffff
009cdff0	mov w0,w25
009cdff4	ldp x29,x30,[sp, #0xd0]
009cdff8	ldp x20,x19,[sp, #0xc0]
009cdffc	ldp x22,x21,[sp, #0xb0]
009ce000	ldp x24,x23,[sp, #0xa0]
009ce004	ldp x26,x25,[sp, #0x90]
009ce008	ldp x28,x27,[sp, #0x80]
009ce00c	ldr d8,[sp, #0x70]
009ce010	add sp,sp,#0xe0
009ce014	ret
