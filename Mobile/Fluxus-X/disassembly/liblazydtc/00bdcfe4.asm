; FUN_00bdcfe4 @ 00bdcfe4
00bdcfe4	paciasp
00bdcfe8	sub sp,sp,#0x1b0
00bdcfec	stp x29,x30,[sp, #0x150]
00bdcff0	stp x28,x27,[sp, #0x160]
00bdcff4	stp x26,x25,[sp, #0x170]
00bdcff8	stp x24,x23,[sp, #0x180]
00bdcffc	stp x22,x21,[sp, #0x190]
00bdd000	stp x20,x19,[sp, #0x1a0]
00bdd004	add x29,sp,#0x150
00bdd008	mov x0,x3
00bdd00c	mov x21,x2
00bdd010	mov x19,x1
00bdd014	sub x8,x29,#0x48
00bdd018	sub x1,x29,#0x24
00bdd01c	sub x2,x29,#0x28
00bdd020	sub x3,x29,#0x2c
00bdd024	stp x5,x4,[sp, #0x20]
00bdd028	sub x25,x29,#0x68
00bdd02c	bl 0x00c44100
00bdd030	stp xzr,xzr,[x25, #0x8]
00bdd034	str xzr,[x25, #0x18]
00bdd038	sub x0,x29,#0x60
00bdd03c	mov w1,#0x16
00bdd040	mov w2,wzr
00bdd044	sub x20,x29,#0x60
00bdd048	bl 0x00c30250
00bdd04c	ldurb w8,[x29, #-0x60]
00bdd050	ldr x9,[x25, #0x18]
00bdd054	mov w26,wzr
00bdd058	add x27,sp,#0x48
00bdd05c	mov w10,#0x1
00bdd060	orr x28,x20,#0x1
00bdd064	tst w8,#0x1
00bdd068	mov w8,#0x45
00bdd06c	add x22,sp,#0x3c
00bdd070	csinc x23,x9,x20,ne
00bdd074	add x20,sp,#0x40
00bdd078	str wzr,[sp, #0x3c]
00bdd07c	str x27,[sp, #0x40]
00bdd080	strb w10,[sp, #0x38]
00bdd084	strb w8,[sp, #0x34]
00bdd088	str x23,[x25]
00bdd08c	b 0x00bdd098
00bdd090	add x8,x8,#0x1
00bdd094	str x8,[x19, #0x18]
00bdd098	cbz x19,0x00bdd0c4
00bdd09c	ldp x8,x9,[x19, #0x18]
00bdd0a0	cmp x8,x9
00bdd0a4	b.eq 0x00bdd0d4
00bdd0a8	mov w24,wzr
00bdd0ac	cbz x21,0x00bdd0cc
00bdd0b0	ldp x8,x9,[x21, #0x18]
00bdd0b4	cmp x8,x9
00bdd0b8	b.eq 0x00bdd0f8
00bdd0bc	tbnz w24,#0x0,0x00bdd11c
00bdd0c0	b 0x00bdd2f0
00bdd0c4	mov w24,#0x1
00bdd0c8	cbnz x21,0x00bdd0b0
00bdd0cc	tbz w24,#0x0,0x00bdd11c
00bdd0d0	b 0x00bdd2f0
00bdd0d4	ldr x8,[x19]
00bdd0d8	ldr x8,[x8, #0x48]
00bdd0dc	mov x0,x19
00bdd0e0	blr x8
00bdd0e4	cmn w0,#0x1
00bdd0e8	cset w24,eq
00bdd0ec	csel x19,xzr,x19,eq
00bdd0f0	cbnz x21,0x00bdd0b0
00bdd0f4	b 0x00bdd0cc
00bdd0f8	ldr x8,[x21]
00bdd0fc	ldr x8,[x8, #0x48]
00bdd100	mov x0,x21
00bdd104	blr x8
00bdd108	cmn w0,#0x1
00bdd10c	cset w8,eq
00bdd110	csel x21,xzr,x21,eq
00bdd114	cmp w24,w8
00bdd118	b.eq 0x00bdd2f0
00bdd11c	ldurb w8,[x29, #-0x60]
00bdd120	ldr x9,[x25, #0x10]
00bdd124	ldr x11,[x25]
00bdd128	lsr x10,x8,#0x1
00bdd12c	tst w8,#0x1
00bdd130	csel x24,x10,x9,eq
00bdd134	add x9,x23,x24
00bdd138	cmp x11,x9
00bdd13c	b.ne 0x00bdd1f8
00bdd140	cmp x24,#0x1
00bdd144	b.lt 0x00bdd15c
00bdd148	sub x0,x29,#0x60
00bdd14c	mov x1,x24
00bdd150	mov w2,wzr
00bdd154	bl 0x00c30250
00bdd158	b 0x00bdd180
00bdd15c	lsl x9,x24,#0x1
00bdd160	tbnz w8,#0x0,0x00bdd174
00bdd164	lsl w8,w9,#0x1
00bdd168	sturb w8,[x29, #-0x60]
00bdd16c	mov x8,x28
00bdd170	b 0x00bdd17c
00bdd174	ldr x8,[x25, #0x18]
00bdd178	str x9,[x25, #0x10]
00bdd17c	strb wzr,[x8, x9]
00bdd180	ldp x9,x10,[x25, #0x8]
00bdd184	ldurb w8,[x29, #-0x60]
00bdd188	tst w8,#0x1
00bdd18c	mov w8,#0x16
00bdd190	and x11,x9,#-0x2
00bdd194	ubfx x12,x9,#0x1,#0x7
00bdd198	sub x11,x11,#0x1
00bdd19c	csel x8,x8,x11,eq
00bdd1a0	tst x9,#0x1
00bdd1a4	csel x10,x12,x10,eq
00bdd1a8	subs x1,x8,x10
00bdd1ac	b.ls 0x00bdd1c0
00bdd1b0	sub x0,x29,#0x60
00bdd1b4	mov w2,wzr
00bdd1b8	bl 0x00c30250
00bdd1bc	b 0x00bdd1e0
00bdd1c0	tbnz w9,#0x0,0x00bdd1d4
00bdd1c4	lsl w9,w8,#0x1
00bdd1c8	sturb w9,[x29, #-0x60]
00bdd1cc	mov x9,x28
00bdd1d0	b 0x00bdd1dc
00bdd1d4	ldr x9,[x25, #0x18]
00bdd1d8	str x8,[x25, #0x10]
00bdd1dc	strb wzr,[x9, x8]
00bdd1e0	ldurb w8,[x29, #-0x60]
00bdd1e4	ldr x9,[x25, #0x18]
00bdd1e8	tst w8,#0x1
00bdd1ec	csel x23,x28,x9,eq
00bdd1f0	add x8,x23,x24
00bdd1f4	str x8,[x25]
00bdd1f8	ldp x8,x9,[x19, #0x18]
00bdd1fc	cmp x8,x9
00bdd200	b.eq 0x00bdd20c
00bdd204	ldrb w0,[x8]
00bdd208	b 0x00bdd21c
00bdd20c	ldr x8,[x19]
00bdd210	ldr x8,[x8, #0x48]
00bdd214	mov x0,x19
00bdd218	blr x8
00bdd21c	ldurb w6,[x29, #-0x2c]
00bdd220	ldurb w5,[x29, #-0x28]
00bdd224	add x1,sp,#0x38
00bdd228	sub x8,x29,#0x24
00bdd22c	add x2,sp,#0x34
00bdd230	sub x4,x29,#0x68
00bdd234	sub x7,x29,#0x48
00bdd238	mov x3,x23
00bdd23c	stp x22,x8,[sp, #0x10]
00bdd240	stp x27,x20,[sp]
00bdd244	bl 0x00c44110
00bdd248	cbnz w0,0x00bdd2f0
00bdd24c	tbz w26,#0x0,0x00bdd258
00bdd250	mov w26,#0x1
00bdd254	b 0x00bdd2b8
00bdd258	ldr x8,[x25]
00bdd25c	sub x9,x8,x23
00bdd260	cmp x9,#0x1
00bdd264	b.lt 0x00bdd2b4
00bdd268	ldrb w8,[x23]
00bdd26c	cmp w8,#0x2b
00bdd270	b.eq 0x00bdd27c
00bdd274	cmp w8,#0x2d
00bdd278	b.ne 0x00bdd2d8
00bdd27c	cmp x9,#0x1
00bdd280	b.eq 0x00bdd2b4
00bdd284	cmp w8,#0x2d
00bdd288	b.eq 0x00bdd294
00bdd28c	cmp w8,#0x2b
00bdd290	b.ne 0x00bdd2b4
00bdd294	ldrb w8,[x23, #0x1]
00bdd298	mov w26,#0x1
00bdd29c	cmp w8,#0x2e
00bdd2a0	b.eq 0x00bdd2b8
00bdd2a4	sub w8,w8,#0x30
00bdd2a8	cmp w8,#0x9
00bdd2ac	b.ls 0x00bdd2b8
00bdd2b0	b 0x00bdd2f0
00bdd2b4	mov w26,wzr
00bdd2b8	ldp x8,x9,[x19, #0x18]
00bdd2bc	cmp x8,x9
00bdd2c0	b.ne 0x00bdd090
00bdd2c4	ldr x8,[x19]
00bdd2c8	ldr x8,[x8, #0x50]
00bdd2cc	mov x0,x19
00bdd2d0	blr x8
00bdd2d4	b 0x00bdd098
00bdd2d8	cmp w8,#0x2e
00bdd2dc	mov w26,#0x1
00bdd2e0	b.eq 0x00bdd2b8
00bdd2e4	sub w8,w8,#0x30
00bdd2e8	cmp w8,#0xa
00bdd2ec	b.cc 0x00bdd2b8
00bdd2f0	ldurb w8,[x29, #-0x48]
00bdd2f4	ldr x9,[x25, #0x28]
00bdd2f8	ldr x22,[sp, #0x28]
00bdd2fc	lsr x10,x8,#0x1
00bdd300	tst w8,#0x1
00bdd304	csel x8,x10,x9,eq
00bdd308	cbz x8,0x00bdd338
00bdd30c	ldrb w8,[sp, #0x38]
00bdd310	cmp w8,#0x1
00bdd314	b.ne 0x00bdd338
00bdd318	ldr x8,[sp, #0x40]
00bdd31c	add x9,sp,#0x48
00bdd320	sub x9,x8,x9
00bdd324	cmp x9,#0x9f
00bdd328	b.gt 0x00bdd338
00bdd32c	ldr w9,[sp, #0x3c]
00bdd330	str w9,[x8], #0x4
00bdd334	str x8,[sp, #0x40]
00bdd338	ldr x1,[x25]
00bdd33c	mov x0,x23
00bdd340	mov x2,x22
00bdd344	bl 0x00c0c73c
00bdd348	ldurb w10,[x29, #-0x48]
00bdd34c	ldr x12,[sp, #0x40]
00bdd350	add x11,sp,#0x48
00bdd354	ldr x8,[x25, #0x28]
00bdd358	lsr x9,x10,#0x1
00bdd35c	ands w13,w10,#0x1
00bdd360	sub x11,x12,x11
00bdd364	csel x8,x9,x8,eq
00bdd368	ldr x9,[sp, #0x20]
00bdd36c	cmp x11,#0x5
00bdd370	str s0,[x9]
00bdd374	b.lt 0x00bdd4d4
00bdd378	cbz x8,0x00bdd4d4
00bdd37c	sub x8,x12,#0x4
00bdd380	add x9,sp,#0x48
00bdd384	cmp x9,x8
00bdd388	cset w11,cc
00bdd38c	cmp x9,x12
00bdd390	b.eq 0x00bdd440
00bdd394	cbz w11,0x00bdd440
00bdd398	add x10,sp,#0x48
00bdd39c	sub x14,x12,#0x8
00bdd3a0	add x11,x10,#0x4
00bdd3a4	cmp x14,x11
00bdd3a8	csel x13,x14,x11,hi
00bdd3ac	sub x13,x13,#0x4
00bdd3b0	cmp x13,x10
00bdd3b4	cinc x15,x10,ne
00bdd3b8	cmp x13,x10
00bdd3bc	sub x15,x13,x15
00bdd3c0	lsr x15,x15,#0x3
00bdd3c4	cinc x13,x15,ne
00bdd3c8	cmp x13,#0x13
00bdd3cc	b.cc 0x00bdd414
00bdd3d0	cmp x14,x11
00bdd3d4	csel x14,x14,x11,hi
00bdd3d8	sub x14,x14,#0x4
00bdd3dc	cmp x14,x10
00bdd3e0	cinc x15,x10,ne
00bdd3e4	cmp x14,x10
00bdd3e8	sub x15,x14,x15
00bdd3ec	lsr x15,x15,#0x3
00bdd3f0	cinc x14,x15,ne
00bdd3f4	cmp x10,x12
00bdd3f8	b.cs 0x00bdd5b8
00bdd3fc	lsl x14,x14,#0x2
00bdd400	sub x15,x12,x14
00bdd404	add x11,x11,x14
00bdd408	sub x14,x15,#0x4
00bdd40c	cmp x14,x11
00bdd410	b.cs 0x00bdd5b8
00bdd414	mov x11,x8
00bdd418	add x10,x10,#0x4
00bdd41c	ldr w12,[x11]
00bdd420	ldur w13,[x10, #-0x4]
00bdd424	stur w12,[x10, #-0x4]
00bdd428	str w13,[x11], #-0x4
00bdd42c	cmp x10,x11
00bdd430	add x10,x10,#0x4
00bdd434	b.cc 0x00bdd41c
00bdd438	ldurb w10,[x29, #-0x48]
00bdd43c	and w13,w10,#0x1
00bdd440	ldr x11,[x25, #0x30]
00bdd444	cmp w13,#0x0
00bdd448	sub x12,x29,#0x48
00bdd44c	csinc x11,x11,x12,ne
00bdd450	cmp x9,x8
00bdd454	b.cs 0x00bdd4ac
00bdd458	lsr w9,w10,#0x1
00bdd45c	ldr x10,[x25, #0x28]
00bdd460	cmp w13,#0x0
00bdd464	csel x9,x9,x10,eq
00bdd468	add x10,sp,#0x48
00bdd46c	add x9,x11,x9
00bdd470	b 0x00bdd48c
00bdd474	sub x12,x9,x11
00bdd478	add x10,x10,#0x4
00bdd47c	cmp x12,#0x1
00bdd480	cinc x11,x11,gt
00bdd484	cmp x10,x8
00bdd488	b.cs 0x00bdd4ac
00bdd48c	ldrb w12,[x11]
00bdd490	cbz w12,0x00bdd474
00bdd494	cmp w12,#0xff
00bdd498	b.eq 0x00bdd474
00bdd49c	ldr w13,[x10]
00bdd4a0	cmp w13,w12
00bdd4a4	b.eq 0x00bdd474
00bdd4a8	b 0x00bdd4cc
00bdd4ac	ldrb w9,[x11]
00bdd4b0	cbz w9,0x00bdd4d4
00bdd4b4	cmp w9,#0xff
00bdd4b8	b.eq 0x00bdd4d4
00bdd4bc	ldr w8,[x8]
00bdd4c0	sub w8,w8,#0x1
00bdd4c4	cmp w8,w9
00bdd4c8	b.cc 0x00bdd4d4
00bdd4cc	mov w8,#0x4
00bdd4d0	str w8,[x22]
00bdd4d4	cbz x19,0x00bdd560
00bdd4d8	ldp x8,x9,[x19, #0x18]
00bdd4dc	cmp x8,x9
00bdd4e0	b.eq 0x00bdd570
00bdd4e4	mov w20,wzr
00bdd4e8	cbz x21,0x00bdd568
00bdd4ec	ldp x8,x9,[x21, #0x18]
00bdd4f0	cmp x8,x9
00bdd4f4	b.eq 0x00bdd594
00bdd4f8	tbnz w20,#0x0,0x00bdd508
00bdd4fc	ldr w8,[x22]
00bdd500	orr w8,w8,#0x2
00bdd504	str w8,[x22]
00bdd508	ldurb w8,[x29, #-0x60]
00bdd50c	tbz w8,#0x0,0x00bdd520
00bdd510	ldr x8,[x25, #0x8]
00bdd514	ldr x0,[x25, #0x18]
00bdd518	and x1,x8,#-0x2
00bdd51c	bl 0x00c2fe80
00bdd520	ldurb w8,[x29, #-0x48]
00bdd524	tbz w8,#0x0,0x00bdd538
00bdd528	ldr x8,[x25, #0x20]
00bdd52c	ldr x0,[x25, #0x30]
00bdd530	and x1,x8,#-0x2
00bdd534	bl 0x00c2fe80
00bdd538	mov x0,x19
00bdd53c	ldp x20,x19,[sp, #0x1a0]
00bdd540	ldp x22,x21,[sp, #0x190]
00bdd544	ldp x24,x23,[sp, #0x180]
00bdd548	ldp x26,x25,[sp, #0x170]
00bdd54c	ldp x28,x27,[sp, #0x160]
00bdd550	ldp x29,x30,[sp, #0x150]
00bdd554	add sp,sp,#0x1b0
00bdd558	autiasp
00bdd55c	ret
00bdd560	mov w20,#0x1
00bdd564	cbnz x21,0x00bdd4ec
00bdd568	tbnz w20,#0x0,0x00bdd4fc
00bdd56c	b 0x00bdd508
00bdd570	ldr x8,[x19]
00bdd574	ldr x8,[x8, #0x48]
00bdd578	mov x0,x19
00bdd57c	blr x8
00bdd580	cmn w0,#0x1
00bdd584	cset w20,eq
00bdd588	csel x19,xzr,x19,eq
00bdd58c	cbnz x21,0x00bdd4ec
00bdd590	b 0x00bdd568
00bdd594	ldr x8,[x21]
00bdd598	ldr x8,[x8, #0x48]
00bdd59c	mov x0,x21
00bdd5a0	blr x8
00bdd5a4	cmn w0,#0x1
00bdd5a8	cset w8,eq
00bdd5ac	eor w8,w20,w8
00bdd5b0	tbz w8,#0x0,0x00bdd4fc
00bdd5b4	b 0x00bdd508
00bdd5b8	add x13,x13,#0x1
00bdd5bc	add x15,sp,#0x48
00bdd5c0	sub x12,x12,#0x10
00bdd5c4	and x14,x13,#0x7ffffffffffffff8
00bdd5c8	lsl x10,x14,#0x2
00bdd5cc	mov x16,x14
00bdd5d0	sub x11,x8,x10
00bdd5d4	add x10,x15,x10
00bdd5d8	add x15,x15,#0x10
00bdd5dc	ldp q1,q0,[x12, #-0x10]
00bdd5e0	sub x16,x16,#0x8
00bdd5e4	ldp q2,q3,[x15, #-0x10]
00bdd5e8	rev64 v0.4S,v0.4S
00bdd5ec	rev64 v1.4S,v1.4S
00bdd5f0	rev64 v2.4S,v2.4S
00bdd5f4	rev64 v3.4S,v3.4S
00bdd5f8	ext v0.16B,v0.16B,v0.16B,0x8
00bdd5fc	ext v1.16B,v1.16B,v1.16B,0x8
00bdd600	ext v2.16B,v2.16B,v2.16B,0x8
00bdd604	ext v3.16B,v3.16B,v3.16B,0x8
00bdd608	stp q0,q1,[x15, #-0x10]
00bdd60c	add x15,x15,#0x20
00bdd610	stp q3,q2,[x12, #-0x10]
00bdd614	sub x12,x12,#0x20
00bdd618	cbnz x16,0x00bdd5dc
00bdd61c	cmp x13,x14
00bdd620	b.eq 0x00bdd438
00bdd624	b 0x00bdd418
