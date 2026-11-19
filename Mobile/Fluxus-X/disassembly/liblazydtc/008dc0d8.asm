; LZ4_decompress_safe_partial_usingDict @ 008dc0d8
008dc0d8	sub sp,sp,#0x70
008dc0dc	stp x29,x30,[sp, #0x10]
008dc0e0	stp x28,x27,[sp, #0x20]
008dc0e4	stp x26,x25,[sp, #0x30]
008dc0e8	stp x24,x23,[sp, #0x40]
008dc0ec	stp x22,x21,[sp, #0x50]
008dc0f0	stp x20,x19,[sp, #0x60]
008dc0f4	add x29,sp,#0x10
008dc0f8	mov x20,x1
008dc0fc	cbz w6,0x008dc138
008dc100	mov w8,w6
008dc104	sxtw x6,w8
008dc108	add x9,x5,x6
008dc10c	cmp x9,x20
008dc110	b.eq 0x008dc15c
008dc114	mov x1,x20
008dc118	ldp x20,x19,[sp, #0x60]
008dc11c	ldp x22,x21,[sp, #0x50]
008dc120	ldp x24,x23,[sp, #0x40]
008dc124	ldp x26,x25,[sp, #0x30]
008dc128	ldp x28,x27,[sp, #0x20]
008dc12c	ldp x29,x30,[sp, #0x10]
008dc130	add sp,sp,#0x70
008dc134	b 0x00c30a20
008dc138	mov x1,x20
008dc13c	ldp x20,x19,[sp, #0x60]
008dc140	ldp x22,x21,[sp, #0x50]
008dc144	ldp x24,x23,[sp, #0x40]
008dc148	ldp x26,x25,[sp, #0x30]
008dc14c	ldp x28,x27,[sp, #0x20]
008dc150	ldp x29,x30,[sp, #0x10]
008dc154	add sp,sp,#0x70
008dc158	b 0x00c309f0
008dc15c	cmp w3,w4
008dc160	mov w9,#0xffff
008dc164	mov x21,x0
008dc168	csel w22,w3,w4,lt
008dc16c	mov w0,#0xffffffff
008dc170	cmp w8,w9
008dc174	b.lt 0x008dc1ac
008dc178	cbz x21,0x008dd2c8
008dc17c	tbnz w22,#0x1f,0x008dd2c8
008dc180	cbz w22,0x008dc980
008dc184	cbz w2,0x008dd2c8
008dc188	add x23,x21,w2, SXTW 
008dc18c	add x30,x20,x22
008dc190	cmp w22,#0x40
008dc194	sub x27,x30,#0x20
008dc198	sub x25,x23,#0x10
008dc19c	stp x21,x25,[sp]
008dc1a0	b.cs 0x008dc20c
008dc1a4	mov x28,xzr
008dc1a8	b 0x008dcde0
008dc1ac	cbz x21,0x008dd2c8
008dc1b0	tbnz w22,#0x1f,0x008dd2c8
008dc1b4	cbz w22,0x008dc980
008dc1b8	cbz w2,0x008dd2c8
008dc1bc	add x25,x21,w2, SXTW 
008dc1c0	add x3,x20,w22, UXTW 
008dc1c4	sub x26,x20,x6
008dc1c8	cmp w22,#0x40
008dc1cc	mov x22,x20
008dc1d0	sub x27,x25,#0x10
008dc1d4	sub x28,x3,#0x20
008dc1d8	stp x21,x3,[sp]
008dc1dc	b.cc 0x008dd224
008dc1e0	ldr x21,[sp]
008dc1e4	cmp w2,#0x12
008dc1e8	mov x16,x21
008dc1ec	ldrb w19,[x16], #0x1
008dc1f0	lsr x17,x19,#0x4
008dc1f4	b.ge 0x008dc234
008dc1f8	mov x22,x20
008dc1fc	cmp x17,#0xf
008dc200	mov x21,x16
008dc204	b.eq 0x008dcf20
008dc208	b 0x008dcf54
008dc20c	mov x8,x21
008dc210	cmp w2,#0x12
008dc214	ldrb w19,[x8], #0x1
008dc218	lsr x3,x19,#0x4
008dc21c	b.ge 0x008dc5c0
008dc220	mov x28,xzr
008dc224	cmp x3,#0xf
008dc228	mov x21,x8
008dc22c	b.eq 0x008dca24
008dc230	b 0x008dca5c
008dc234	sub x8,x25,#0x11
008dc238	sub x9,x25,#0xf
008dc23c	sub x10,x3,#0x40
008dc240	sub x11,x25,#0x40
008dc244	adrp x12,0x364000
008dc248	add x12,x12,#0xe30
008dc24c	sub x13,x25,#0x6
008dc250	adrp x14,0x364000
008dc254	add x14,x14,#0xdd0
008dc258	orr w15,wzr,#0x1010101
008dc25c	mov x22,x20
008dc260	b 0x008dc290
008dc264	ldr x16,[x1]
008dc268	str x16,[x0]
008dc26c	ldr x16,[x1, #0x8]
008dc270	str x16,[x0, #0x8]
008dc274	ldrh w16,[x1, #0x10]
008dc278	strh w16,[x0, #0x10]
008dc27c	mov x16,x21
008dc280	ldrb w19,[x16], #0x1
008dc284	cmp x16,x8
008dc288	lsr x17,x19,#0x4
008dc28c	b.hi 0x008dc1fc
008dc290	cmp x17,#0xf
008dc294	b.ne 0x008dc2f0
008dc298	cmp x16,x9
008dc29c	b.cs 0x008dc988
008dc2a0	ldrb w16,[x16]
008dc2a4	add x21,x21,#0x2
008dc2a8	cmp x16,#0xff
008dc2ac	b.eq 0x008dc3d4
008dc2b0	add x17,x16,#0xf
008dc2b4	cmn x21,x17
008dc2b8	b.cs 0x008dc994
008dc2bc	add x0,x22,x17
008dc2c0	cmp x0,x10
008dc2c4	b.hi 0x008dcf58
008dc2c8	add x2,x21,x17
008dc2cc	cmp x2,x11
008dc2d0	b.hi 0x008dcf58
008dc2d4	ldp q1,q0,[x21, #0x20]
008dc2d8	ldp q2,q3,[x21], #0x40
008dc2dc	stp q1,q0,[x22, #0x20]
008dc2e0	stp q2,q3,[x22], #0x40
008dc2e4	cmp x22,x0
008dc2e8	b.cc 0x008dc2d4
008dc2ec	b 0x008dc300
008dc2f0	ldr q0,[x16]
008dc2f4	add x2,x16,x17
008dc2f8	add x0,x22,x17
008dc2fc	str q0,[x22]
008dc300	mov x21,x2
008dc304	and x17,x19,#0xf
008dc308	ldrh w16,[x21], #0x2
008dc30c	cmp x17,#0xf
008dc310	sub x1,x0,x16
008dc314	b.ne 0x008dc34c
008dc318	cmp x21,x13
008dc31c	b.cs 0x008dc994
008dc320	ldrb w17,[x2, #0x2]
008dc324	add x21,x2,#0x3
008dc328	cmp x17,#0xff
008dc32c	b.eq 0x008dc3fc
008dc330	add x17,x17,#0x13
008dc334	cmn x0,x17
008dc338	b.cs 0x008dc994
008dc33c	add x2,x0,x17
008dc340	cmp x2,x10
008dc344	b.cc 0x008dc36c
008dc348	b 0x008dd0a8
008dc34c	add x17,x17,#0x4
008dc350	add x22,x0,x17
008dc354	cmp x22,x10
008dc358	b.cs 0x008dd0a8
008dc35c	cmp x1,x26
008dc360	b.cc 0x008dc36c
008dc364	cmp w16,#0x8
008dc368	b.cs 0x008dc264
008dc36c	cmp x1,x26
008dc370	b.cc 0x008dc994
008dc374	cmp w16,#0xf
008dc378	add x22,x0,x17
008dc37c	b.ls 0x008dc424
008dc380	cmp w16,#0x3f
008dc384	neg x16,x16
008dc388	b.ls 0x008dc3ac
008dc38c	add x17,x0,x16
008dc390	ldp q1,q0,[x17, #0x20]
008dc394	ldp q2,q3,[x17]
008dc398	stp q1,q0,[x0, #0x20]
008dc39c	stp q2,q3,[x0], #0x40
008dc3a0	cmp x0,x22
008dc3a4	b.cc 0x008dc38c
008dc3a8	b 0x008dc27c
008dc3ac	add x16,x0,x16
008dc3b0	add x16,x16,#0x10
008dc3b4	ldur q0,[x16, #-0x10]
008dc3b8	str q0,[x0]
008dc3bc	ldr q0,[x16], #0x20
008dc3c0	str q0,[x0, #0x10]
008dc3c4	add x0,x0,#0x20
008dc3c8	cmp x0,x22
008dc3cc	b.cc 0x008dc3b4
008dc3d0	b 0x008dc27c
008dc3d4	cmp x21,x9
008dc3d8	b.cs 0x008dc994
008dc3dc	ldrb w17,[x21], #0x1
008dc3e0	cmp x17,#0xff
008dc3e4	add x16,x16,x17
008dc3e8	b.eq 0x008dc3d4
008dc3ec	ldr x3,[sp, #0x8]
008dc3f0	cmn x16,#0x1
008dc3f4	b.ne 0x008dc2b0
008dc3f8	b 0x008dc994
008dc3fc	cmp x21,x13
008dc400	b.cs 0x008dc994
008dc404	ldrb w2,[x21], #0x1
008dc408	cmp x2,#0xff
008dc40c	add x17,x17,x2
008dc410	b.eq 0x008dc3fc
008dc414	ldr x3,[sp, #0x8]
008dc418	cmn x17,#0x1
008dc41c	b.ne 0x008dc330
008dc420	b 0x008dc994
008dc424	cmp w16,#0x4
008dc428	b.eq 0x008dc45c
008dc42c	cmp w16,#0x2
008dc430	b.eq 0x008dc44c
008dc434	cmp w16,#0x1
008dc438	b.ne 0x008dc4e8
008dc43c	ldrb w1,[x1]
008dc440	orr x16,x1,x1, LSL #0x8
008dc444	mul w1,w1,w15
008dc448	b 0x008dc454
008dc44c	ldrh w16,[x1]
008dc450	orr w1,w16,w16, LSL #0x10
008dc454	mov x2,x16
008dc458	b 0x008dc46c
008dc45c	ldr w1,[x1]
008dc460	lsr w2,w1,#0x10
008dc464	and x16,x1,#0xffff
008dc468	mov w2,w2
008dc46c	orr x16,x16,x2, LSL #0x10
008dc470	cmp x17,#0x9
008dc474	orr x16,x16,x1, LSL #0x20
008dc478	str x16,[x0]
008dc47c	b.cc 0x008dc570
008dc480	add x17,x17,x0
008dc484	add x1,x0,#0x10
008dc488	cmp x17,x1
008dc48c	csel x17,x17,x1,hi
008dc490	sub x17,x17,x0
008dc494	sub x1,x17,#0x9
008dc498	add x17,x0,#0x8
008dc49c	cmp x1,#0x18
008dc4a0	b.cc 0x008dc4d8
008dc4a4	lsr x1,x1,#0x3
008dc4a8	dup v0.2D,x16
008dc4ac	add x0,x0,#0x18
008dc4b0	add x1,x1,#0x1
008dc4b4	and x2,x1,#0x3ffffffffffffffc
008dc4b8	add x17,x17,x2, LSL #0x3
008dc4bc	mov x3,x2
008dc4c0	subs x3,x3,#0x4
008dc4c4	stp q0,q0,[x0, #-0x10]
008dc4c8	add x0,x0,#0x20
008dc4cc	b.ne 0x008dc4c0
008dc4d0	cmp x1,x2
008dc4d4	b.eq 0x008dc570
008dc4d8	str x16,[x17], #0x8
008dc4dc	cmp x17,x22
008dc4e0	b.cc 0x008dc4d8
008dc4e4	b 0x008dc570
008dc4e8	cmp w16,#0x7
008dc4ec	b.hi 0x008dc520
008dc4f0	str wzr,[x0]
008dc4f4	ldrh w2,[x1]
008dc4f8	strh w2,[x0]
008dc4fc	ldrh w2,[x1, #0x2]
008dc500	strh w2,[x0, #0x2]
008dc504	ldr w2,[x12, x16, LSL #0x2]
008dc508	add x1,x1,x2
008dc50c	ldr w2,[x1]
008dc510	str w2,[x0, #0x4]
008dc514	ldrsw x16,[x14, x16, LSL #0x2]
008dc518	sub x1,x1,x16
008dc51c	b 0x008dc528
008dc520	ldr x16,[x1], #0x8
008dc524	str x16,[x0]
008dc528	add x16,x17,x0
008dc52c	add x17,x0,#0x10
008dc530	cmp x16,x17
008dc534	csel x16,x16,x17,hi
008dc538	sub x16,x16,x0
008dc53c	sub x17,x16,#0x9
008dc540	add x16,x0,#0x8
008dc544	cmp x17,#0x18
008dc548	b.cc 0x008dc55c
008dc54c	sub x2,x0,x1
008dc550	add x2,x2,#0x8
008dc554	cmp x2,#0x20
008dc558	b.cs 0x008dc578
008dc55c	mov x17,x1
008dc560	ldr x0,[x17], #0x8
008dc564	str x0,[x16], #0x8
008dc568	cmp x16,x22
008dc56c	b.cc 0x008dc560
008dc570	ldr x3,[sp, #0x8]
008dc574	b 0x008dc27c
008dc578	lsr x17,x17,#0x3
008dc57c	add x0,x0,#0x18
008dc580	add x2,x17,#0x1
008dc584	and x3,x2,#0x3ffffffffffffffc
008dc588	lsl x4,x3,#0x3
008dc58c	add x17,x1,x4
008dc590	add x16,x16,x4
008dc594	add x1,x1,#0x10
008dc598	mov x4,x3
008dc59c	ldp q0,q1,[x1, #-0x10]
008dc5a0	subs x4,x4,#0x4
008dc5a4	add x1,x1,#0x20
008dc5a8	stp q0,q1,[x0, #-0x10]
008dc5ac	add x0,x0,#0x20
008dc5b0	b.ne 0x008dc59c
008dc5b4	cmp x2,x3
008dc5b8	b.ne 0x008dc560
008dc5bc	b 0x008dc570
008dc5c0	mov x28,xzr
008dc5c4	sub x9,x23,#0x11
008dc5c8	sub x10,x23,#0xf
008dc5cc	sub x11,x30,#0x40
008dc5d0	sub x12,x23,#0x40
008dc5d4	sub x13,x23,#0x6
008dc5d8	add x14,x20,#0x8
008dc5dc	add x15,x20,#0x10
008dc5e0	adrp x16,0x364000
008dc5e4	add x16,x16,#0xe30
008dc5e8	add x17,x20,#0x18
008dc5ec	adrp x0,0x364000
008dc5f0	add x0,x0,#0xdd0
008dc5f4	orr w1,wzr,#0x1010101
008dc5f8	mov x2,x20
008dc5fc	b 0x008dc630
008dc600	ldr x8,[x7]
008dc604	str x8,[x5]
008dc608	ldr x8,[x7, #0x8]
008dc60c	str x8,[x5, #0x8]
008dc610	ldrh w8,[x7, #0x10]
008dc614	strh w8,[x5, #0x10]
008dc618	mov x8,x21
008dc61c	add x2,x20,x28
008dc620	ldrb w19,[x8], #0x1
008dc624	cmp x8,x9
008dc628	lsr x3,x19,#0x4
008dc62c	b.hi 0x008dc224
008dc630	cmp x3,#0xf
008dc634	b.ne 0x008dc694
008dc638	cmp x8,x10
008dc63c	b.cs 0x008dc990
008dc640	ldrb w8,[x8]
008dc644	add x21,x21,#0x2
008dc648	cmp x8,#0xff
008dc64c	b.eq 0x008dc788
008dc650	add x3,x8,#0xf
008dc654	cmn x21,x3
008dc658	b.cs 0x008dc994
008dc65c	add x8,x3,x28
008dc660	add x5,x20,x8
008dc664	cmp x5,x11
008dc668	b.hi 0x008dca60
008dc66c	add x4,x21,x3
008dc670	cmp x4,x12
008dc674	b.hi 0x008dca60
008dc678	ldp q1,q0,[x21, #0x20]
008dc67c	ldp q2,q3,[x21], #0x40
008dc680	stp q1,q0,[x2, #0x20]
008dc684	stp q2,q3,[x2], #0x40
008dc688	cmp x2,x5
008dc68c	b.cc 0x008dc678
008dc690	b 0x008dc6a4
008dc694	ldr q0,[x8]
008dc698	add x4,x8,x3
008dc69c	add x8,x28,x3
008dc6a0	str q0,[x2]
008dc6a4	mov x21,x4
008dc6a8	and x6,x19,#0xf
008dc6ac	add x5,x20,x8
008dc6b0	ldrh w2,[x21], #0x2
008dc6b4	cmp x6,#0xf
008dc6b8	sub x3,x8,x2
008dc6bc	add x7,x20,x3
008dc6c0	b.ne 0x008dc6f8
008dc6c4	cmp x21,x13
008dc6c8	b.cs 0x008dc994
008dc6cc	ldrb w6,[x4, #0x2]
008dc6d0	add x21,x4,#0x3
008dc6d4	cmp x6,#0xff
008dc6d8	b.eq 0x008dc7b0
008dc6dc	add x6,x6,#0x13
008dc6e0	cmn x5,x6
008dc6e4	b.cs 0x008dc994
008dc6e8	add x4,x5,x6
008dc6ec	cmp x4,x11
008dc6f0	b.cc 0x008dc714
008dc6f4	b 0x008dcbe0
008dc6f8	add x6,x6,#0x4
008dc6fc	add x28,x8,x6
008dc700	add x4,x20,x28
008dc704	cmp x4,x11
008dc708	b.cs 0x008dcbe0
008dc70c	cmp w2,#0x8
008dc710	b.cs 0x008dc600
008dc714	cmn x3,#0x10, LSL #12
008dc718	b.lt 0x008dc994
008dc71c	add x28,x6,x8
008dc720	cmp w2,#0xf
008dc724	add x4,x20,x28
008dc728	b.ls 0x008dc7d8
008dc72c	cmp w2,#0x3f
008dc730	b.ls 0x008dc758
008dc734	neg x8,x2
008dc738	add x2,x5,x8
008dc73c	ldp q1,q0,[x2, #0x20]
008dc740	ldp q2,q3,[x2]
008dc744	stp q1,q0,[x5, #0x20]
008dc748	stp q2,q3,[x5], #0x40
008dc74c	cmp x5,x4
008dc750	b.cc 0x008dc738
008dc754	b 0x008dc618
008dc758	add x2,x15,x8
008dc75c	add x8,x15,x3
008dc760	ldur q0,[x8, #-0x10]
008dc764	add x3,x2,#0x10
008dc768	add x5,x2,#0x20
008dc76c	cmp x3,x4
008dc770	stur q0,[x2, #-0x10]
008dc774	ldr q0,[x8], #0x20
008dc778	str q0,[x2]
008dc77c	mov x2,x5
008dc780	b.cc 0x008dc760
008dc784	b 0x008dc618
008dc788	cmp x21,x10
008dc78c	b.cs 0x008dc994
008dc790	ldrb w3,[x21], #0x1
008dc794	cmp x3,#0xff
008dc798	add x8,x8,x3
008dc79c	b.eq 0x008dc788
008dc7a0	ldr x25,[sp, #0x8]
008dc7a4	cmn x8,#0x1
008dc7a8	b.ne 0x008dc650
008dc7ac	b 0x008dc994
008dc7b0	cmp x21,x13
008dc7b4	b.cs 0x008dc994
008dc7b8	ldrb w4,[x21], #0x1
008dc7bc	cmp x4,#0xff
008dc7c0	add x6,x6,x4
008dc7c4	b.eq 0x008dc7b0
008dc7c8	ldr x25,[sp, #0x8]
008dc7cc	cmn x6,#0x1
008dc7d0	b.ne 0x008dc6dc
008dc7d4	b 0x008dc994
008dc7d8	cmp w2,#0x4
008dc7dc	b.eq 0x008dc810
008dc7e0	cmp w2,#0x2
008dc7e4	b.eq 0x008dc800
008dc7e8	cmp w2,#0x1
008dc7ec	b.ne 0x008dc8a0
008dc7f0	ldrb w3,[x7]
008dc7f4	orr x2,x3,x3, LSL #0x8
008dc7f8	mul w3,w3,w1
008dc7fc	b 0x008dc808
008dc800	ldrh w2,[x7]
008dc804	orr w3,w2,w2, LSL #0x10
008dc808	mov x7,x2
008dc80c	b 0x008dc820
008dc810	ldr w3,[x7]
008dc814	lsr w7,w3,#0x10
008dc818	and x2,x3,#0xffff
008dc81c	mov w7,w7
008dc820	orr x2,x2,x7, LSL #0x10
008dc824	orr x2,x2,x3, LSL #0x20
008dc828	str x2,[x5], #0x8
008dc82c	cmp x5,x4
008dc830	b.cs 0x008dc930
008dc834	add x3,x6,x20
008dc838	add x6,x15,x8
008dc83c	add x3,x3,x8
008dc840	cmp x3,x6
008dc844	csel x3,x3,x6,hi
008dc848	add x6,x8,x20
008dc84c	sub x3,x3,x6
008dc850	sub x3,x3,#0x9
008dc854	cmp x3,#0x18
008dc858	b.cc 0x008dc890
008dc85c	lsr x3,x3,#0x3
008dc860	dup v0.2D,x2
008dc864	add x8,x17,x8
008dc868	add x3,x3,#0x1
008dc86c	and x6,x3,#0x3ffffffffffffffc
008dc870	add x5,x5,x6, LSL #0x3
008dc874	mov x7,x6
008dc878	subs x7,x7,#0x4
008dc87c	stp q0,q0,[x8, #-0x10]
008dc880	add x8,x8,#0x20
008dc884	b.ne 0x008dc878
008dc888	cmp x3,x6
008dc88c	b.eq 0x008dc930
008dc890	str x2,[x5], #0x8
008dc894	cmp x5,x4
008dc898	b.cc 0x008dc890
008dc89c	b 0x008dc930
008dc8a0	cmp w2,#0x7
008dc8a4	b.hi 0x008dc8d8
008dc8a8	str wzr,[x5]
008dc8ac	ldrh w3,[x7]
008dc8b0	strh w3,[x5]
008dc8b4	ldrh w3,[x7, #0x2]
008dc8b8	strh w3,[x5, #0x2]
008dc8bc	ldr w3,[x16, x2, LSL #0x2]
008dc8c0	add x3,x7,x3
008dc8c4	ldr w7,[x3]
008dc8c8	str w7,[x5, #0x4]
008dc8cc	ldrsw x2,[x0, x2, LSL #0x2]
008dc8d0	sub x7,x3,x2
008dc8d4	b 0x008dc8e0
008dc8d8	ldr x2,[x7], #0x8
008dc8dc	str x2,[x5]
008dc8e0	add x2,x6,x20
008dc8e4	add x3,x15,x8
008dc8e8	add x2,x2,x8
008dc8ec	cmp x2,x3
008dc8f0	csel x2,x2,x3,hi
008dc8f4	add x3,x8,x20
008dc8f8	sub x2,x2,x3
008dc8fc	sub x3,x2,#0x9
008dc900	add x2,x5,#0x8
008dc904	cmp x3,#0x18
008dc908	b.cc 0x008dc91c
008dc90c	add x5,x14,x8
008dc910	sub x5,x5,x7
008dc914	cmp x5,#0x20
008dc918	b.cs 0x008dc938
008dc91c	mov x3,x7
008dc920	ldr x8,[x3], #0x8
008dc924	str x8,[x2], #0x8
008dc928	cmp x2,x4
008dc92c	b.cc 0x008dc920
008dc930	ldr x25,[sp, #0x8]
008dc934	b 0x008dc618
008dc938	lsr x3,x3,#0x3
008dc93c	add x8,x17,x8
008dc940	add x5,x3,#0x1
008dc944	and x6,x5,#0x3ffffffffffffffc
008dc948	lsl x19,x6,#0x3
008dc94c	add x3,x7,x19
008dc950	add x2,x2,x19
008dc954	add x7,x7,#0x10
008dc958	mov x19,x6
008dc95c	ldp q0,q1,[x7, #-0x10]
008dc960	subs x19,x19,#0x4
008dc964	add x7,x7,#0x20
008dc968	stp q0,q1,[x8, #-0x10]
008dc96c	add x8,x8,#0x20
008dc970	b.ne 0x008dc95c
008dc974	cmp x5,x6
008dc978	b.ne 0x008dc920
008dc97c	b 0x008dc930
008dc980	mov w0,wzr
008dc984	b 0x008dd2c8
008dc988	mov x21,x16
008dc98c	b 0x008dc994
008dc990	mov x21,x8
008dc994	ldr x9,[sp]
008dc998	mvn w8,w21
008dc99c	add w0,w8,w9
008dc9a0	b 0x008dd2c8
008dc9a4	cmp x21,x25
008dc9a8	b.cs 0x008dca5c
008dc9ac	add x8,x20,x28
008dc9b0	cmp x8,x27
008dc9b4	b.hi 0x008dca5c
008dc9b8	ldr q0,[x21]
008dc9bc	add x9,x21,x3
008dc9c0	and x10,x19,#0xf
008dc9c4	mov x21,x9
008dc9c8	cmp x10,#0xf
008dc9cc	str q0,[x8]
008dc9d0	add x8,x28,x3
008dc9d4	ldrh w2,[x21], #0x2
008dc9d8	sub x3,x8,x2
008dc9dc	b.eq 0x008dcb98
008dc9e0	cmp w2,#0x8
008dc9e4	b.cc 0x008dcb98
008dc9e8	add x11,x20,x3
008dc9ec	add x13,x20,x8
008dc9f0	add x8,x10,x8
008dc9f4	ldr x12,[x11]
008dc9f8	add x28,x8,#0x4
008dc9fc	add x21,x9,#0x3
008dca00	str x12,[x13]
008dca04	ldr x12,[x11, #0x8]
008dca08	str x12,[x13, #0x8]
008dca0c	ldrh w11,[x11, #0x10]
008dca10	strh w11,[x13, #0x10]
008dca14	ldrb w19,[x9, #0x2]
008dca18	lsr x3,x19,#0x4
008dca1c	cmp x3,#0xf
008dca20	b.ne 0x008dc9a4
008dca24	sub x10,x23,#0xf
008dca28	cmp x21,x10
008dca2c	b.cs 0x008dc994
008dca30	ldrb w8,[x21], #0x1
008dca34	add x9,x20,x28
008dca38	cmp x8,#0xff
008dca3c	b.eq 0x008dce14
008dca40	add x3,x8,#0xf
008dca44	cmn x9,x3
008dca48	cset w9,cs
008dca4c	cmn x21,x3
008dca50	cset w8,cs
008dca54	tbnz w9,#0x0,0x008dc994
008dca58	tbnz w8,#0x0,0x008dc994
008dca5c	add x8,x3,x28
008dca60	add x10,x20,x8
008dca64	sub x9,x30,#0xc
008dca68	add x0,x20,x28
008dca6c	cmp x10,x9
008dca70	b.hi 0x008dca84
008dca74	add x9,x21,x3
008dca78	sub x11,x23,#0x8
008dca7c	cmp x9,x11
008dca80	b.ls 0x008dcaec
008dca84	add x8,x21,x3
008dca88	sub x9,x23,x21
008dca8c	mov x25,x30
008dca90	add x11,x0,x9
008dca94	cmp x8,x23
008dca98	csel x24,x11,x10,hi
008dca9c	cmp x24,x30
008dcaa0	b.hi 0x008dcdfc
008dcaa4	cmp x8,x23
008dcaa8	mov x26,x22
008dcaac	mov x1,x21
008dcab0	csel x22,x9,x3,hi
008dcab4	mov x2,x22
008dcab8	bl 0x00c2ff60
008dcabc	add x8,x28,x22
008dcac0	cmp x24,x25
008dcac4	add x24,x20,x8
008dcac8	b.eq 0x008dcdf4
008dcacc	mov x30,x25
008dcad0	add x9,x21,x22
008dcad4	sub x10,x23,#0x2
008dcad8	ldr x25,[sp, #0x8]
008dcadc	cmp x9,x10
008dcae0	mov x22,x26
008dcae4	b.cc 0x008dcb88
008dcae8	b 0x008dcdf4
008dcaec	add x11,x28,x20
008dcaf0	add x13,x8,x20
008dcaf4	add x12,x11,#0x8
008dcaf8	cmp x12,x13
008dcafc	csel x12,x12,x13,hi
008dcb00	mvn x13,x28
008dcb04	add x12,x12,x13
008dcb08	sub x12,x12,x20
008dcb0c	cmp x12,#0x28
008dcb10	b.cs 0x008dcb1c
008dcb14	mov x11,x21
008dcb18	b 0x008dcb78
008dcb1c	sub x11,x11,x21
008dcb20	cmp x11,#0x20
008dcb24	b.cs 0x008dcb30
008dcb28	mov x11,x21
008dcb2c	b 0x008dcb78
008dcb30	lsr x11,x12,#0x3
008dcb34	add x15,x28,x20
008dcb38	add x12,x11,#0x1
008dcb3c	and x13,x12,#0x3ffffffffffffffc
008dcb40	lsl x14,x13,#0x3
008dcb44	mov x16,x13
008dcb48	add x11,x21,x14
008dcb4c	add x0,x0,x14
008dcb50	add x14,x15,#0x10
008dcb54	add x15,x21,#0x10
008dcb58	ldp q0,q1,[x15, #-0x10]
008dcb5c	subs x16,x16,#0x4
008dcb60	add x15,x15,#0x20
008dcb64	stp q0,q1,[x14, #-0x10]
008dcb68	add x14,x14,#0x20
008dcb6c	b.ne 0x008dcb58
008dcb70	cmp x12,x13
008dcb74	b.eq 0x008dcb88
008dcb78	ldr x12,[x11], #0x8
008dcb7c	str x12,[x0], #0x8
008dcb80	cmp x0,x10
008dcb84	b.cc 0x008dcb78
008dcb88	ldrh w2,[x9], #0x2
008dcb8c	and x10,x19,#0xf
008dcb90	mov x21,x9
008dcb94	sub x3,x8,x2
008dcb98	cmp x10,#0xf
008dcb9c	b.ne 0x008dcbdc
008dcba0	sub x10,x23,#0x6
008dcba4	cmp x21,x10
008dcba8	b.cs 0x008dc994
008dcbac	ldrb w9,[x21], #0x1
008dcbb0	add x11,x20,x8
008dcbb4	cmp x9,#0xff
008dcbb8	b.eq 0x008dce38
008dcbbc	add x10,x9,#0xf
008dcbc0	cmn x11,x10
008dcbc4	cset w11,cs
008dcbc8	cmn x9,#0x1
008dcbcc	mov w9,#0xf
008dcbd0	csel x10,x9,x10,eq
008dcbd4	b.eq 0x008dc994
008dcbd8	tbnz w11,#0x0,0x008dc994
008dcbdc	add x6,x10,#0x4
008dcbe0	cmn x3,#0x10, LSL #12
008dcbe4	b.lt 0x008dc994
008dcbe8	add x28,x8,x6
008dcbec	sub x10,x30,#0xc
008dcbf0	add x0,x20,x8
008dcbf4	add x9,x20,x28
008dcbf8	add x1,x20,x3
008dcbfc	cmp x9,x10
008dcc00	b.ls 0x008dccf0
008dcc04	sub x9,x22,x8
008dcc08	cmp x6,x9
008dcc0c	csel x2,x6,x9,cc
008dcc10	add x9,x1,x2
008dcc14	add x28,x2,x8
008dcc18	cmp x9,x0
008dcc1c	add x24,x20,x28
008dcc20	b.ls 0x008dcd64
008dcc24	cmp x2,#0x1
008dcc28	b.lt 0x008dcdd8
008dcc2c	add x9,x8,x20
008dcc30	add x10,x9,x2
008dcc34	add x11,x9,#0x1
008dcc38	cmp x10,x11
008dcc3c	csinc x10,x10,x9,hi
008dcc40	sub x9,x10,x9
008dcc44	cmp x9,#0x8
008dcc48	b.cc 0x008dcdc0
008dcc4c	sub x10,x8,x3
008dcc50	mov x11,x0
008dcc54	mov x12,x1
008dcc58	cmp x10,#0x20
008dcc5c	b.cc 0x008dcdc8
008dcc60	cmp x9,#0x20
008dcc64	mov x10,xzr
008dcc68	b.cc 0x008dccb4
008dcc6c	and x10,x9,#-0x20
008dcc70	add x11,x3,x20
008dcc74	add x12,x8,x20
008dcc78	add x11,x11,#0x10
008dcc7c	add x12,x12,#0x10
008dcc80	mov x13,x10
008dcc84	ldp q0,q1,[x11, #-0x10]
008dcc88	subs x13,x13,#0x20
008dcc8c	add x11,x11,#0x20
008dcc90	stp q0,q1,[x12, #-0x10]
008dcc94	add x12,x12,#0x20
008dcc98	b.ne 0x008dcc84
008dcc9c	cmp x9,x10
008dcca0	b.eq 0x008dcdd8
008dcca4	tst x9,#0x18
008dcca8	add x11,x0,x10
008dccac	add x12,x1,x10
008dccb0	b.eq 0x008dcdc8
008dccb4	and x13,x9,#-0x8
008dccb8	add x14,x3,x10
008dccbc	add x15,x8,x10
008dccc0	add x11,x0,x13
008dccc4	add x12,x1,x13
008dccc8	add x8,x20,x14
008dcccc	add x14,x20,x15
008dccd0	sub x10,x10,x13
008dccd4	ldr d0,[x8], #0x8
008dccd8	adds x10,x10,#0x8
008dccdc	str d0,[x14], #0x8
008dcce0	b.ne 0x008dccd4
008dcce4	cmp x9,x13
008dcce8	b.ne 0x008dcdc8
008dccec	b 0x008dcdd8
008dccf0	cmp x2,#0x7
008dccf4	b.ls 0x008dce54
008dccf8	ldr x10,[x1], #0x8
008dccfc	str x10,[x0]
008dcd00	ldr x10,[x1]
008dcd04	cmp x6,#0x11
008dcd08	str x10,[x0, #0x8]
008dcd0c	b.cc 0x008dcde0
008dcd10	add x11,x8,x20
008dcd14	add x10,x11,x6
008dcd18	add x12,x11,#0x18
008dcd1c	cmp x10,x12
008dcd20	csel x10,x10,x12,hi
008dcd24	sub x10,x10,x11
008dcd28	sub x12,x10,#0x11
008dcd2c	add x10,x0,#0x10
008dcd30	cmp x12,#0x38
008dcd34	b.cc 0x008dcd48
008dcd38	sub x11,x11,x1
008dcd3c	add x11,x11,#0x8
008dcd40	cmp x11,#0x20
008dcd44	b.cs 0x008dcd74
008dcd48	mov x8,x1
008dcd4c	add x8,x8,#0x8
008dcd50	ldr x11,[x8], #0x8
008dcd54	str x11,[x10], #0x8
008dcd58	cmp x10,x9
008dcd5c	b.cc 0x008dcd50
008dcd60	b 0x008dcde0
008dcd64	mov x19,x30
008dcd68	bl 0x00c2ffd0
008dcd6c	mov x30,x19
008dcd70	b 0x008dcdd8
008dcd74	lsr x11,x12,#0x3
008dcd78	add x14,x8,x20
008dcd7c	add x11,x11,#0x1
008dcd80	and x12,x11,#0x3ffffffffffffffc
008dcd84	lsl x13,x12,#0x3
008dcd88	mov x15,x12
008dcd8c	add x8,x1,x13
008dcd90	add x10,x10,x13
008dcd94	add x13,x14,#0x20
008dcd98	add x14,x1,#0x18
008dcd9c	ldp q0,q1,[x14, #-0x10]
008dcda0	subs x15,x15,#0x4
008dcda4	add x14,x14,#0x20
008dcda8	stp q0,q1,[x13, #-0x10]
008dcdac	add x13,x13,#0x20
008dcdb0	b.ne 0x008dcd9c
008dcdb4	cmp x11,x12
008dcdb8	b.eq 0x008dcde0
008dcdbc	b 0x008dcd4c
008dcdc0	mov x11,x0
008dcdc4	mov x12,x1
008dcdc8	ldrb w8,[x12], #0x1
008dcdcc	strb w8,[x11], #0x1
008dcdd0	cmp x11,x24
008dcdd4	b.cc 0x008dcdc8
008dcdd8	cmp x28,x22
008dcddc	b.eq 0x008dcdf4
008dcde0	ldrb w19,[x21], #0x1
008dcde4	lsr x3,x19,#0x4
008dcde8	cmp x3,#0xf
008dcdec	b.ne 0x008dc9a4
008dcdf0	b 0x008dca24
008dcdf4	sub w0,w24,w20
008dcdf8	b 0x008dd2c8
008dcdfc	sub x2,x22,x28
008dce00	mov x1,x21
008dce04	bl 0x00c2ff60
008dce08	mov x24,x25
008dce0c	sub w0,w24,w20
008dce10	b 0x008dd2c8
008dce14	cmp x21,x10
008dce18	b.cs 0x008dc994
008dce1c	ldrb w11,[x21], #0x1
008dce20	cmp x11,#0xff
008dce24	add x8,x8,x11
008dce28	b.eq 0x008dce14
008dce2c	cmn x8,#0x1
008dce30	b.ne 0x008dca40
008dce34	b 0x008dc994
008dce38	cmp x21,x10
008dce3c	b.cs 0x008dc994
008dce40	ldrb w12,[x21], #0x1
008dce44	cmp x12,#0xff
008dce48	add x9,x9,x12
008dce4c	b.eq 0x008dce38
008dce50	b 0x008dcbbc
008dce54	str wzr,[x0]
008dce58	ldrb w10,[x1]
008dce5c	strb w10,[x0]
008dce60	ldrb w10,[x1, #0x1]
008dce64	strb w10,[x0, #0x1]
008dce68	ldrb w10,[x1, #0x2]
008dce6c	strb w10,[x0, #0x2]
008dce70	ldrb w10,[x1, #0x3]
008dce74	strb w10,[x0, #0x3]
008dce78	adrp x10,0x364000
008dce7c	add x10,x10,#0xe30
008dce80	ldr w10,[x10, x2, LSL #0x2]
008dce84	add x10,x1,x10
008dce88	ldr w11,[x10]
008dce8c	str w11,[x0, #0x4]
008dce90	adrp x11,0x364000
008dce94	add x11,x11,#0xdd0
008dce98	ldrsw x11,[x11, x2, LSL #0x2]
008dce9c	sub x1,x10,x11
008dcea0	b 0x008dcd00
008dcea4	cmp x21,x27
008dcea8	b.cs 0x008dcf54
008dceac	cmp x22,x28
008dceb0	b.hi 0x008dcf54
008dceb4	ldr q0,[x21]
008dceb8	add x8,x21,x17
008dcebc	and x9,x19,#0xf
008dcec0	mov x21,x8
008dcec4	add x0,x22,x17
008dcec8	cmp x9,#0xf
008dcecc	str q0,[x22]
008dced0	ldrh w16,[x21], #0x2
008dced4	sub x1,x0,x16
008dced8	b.eq 0x008dd064
008dcedc	cmp w16,#0x8
008dcee0	b.cc 0x008dd064
008dcee4	cmp x1,x26
008dcee8	b.cc 0x008dd064
008dceec	ldr x10,[x1]
008dcef0	add x9,x0,x9
008dcef4	add x21,x8,#0x3
008dcef8	add x22,x9,#0x4
008dcefc	str x10,[x0]
008dcf00	ldr x10,[x1, #0x8]
008dcf04	str x10,[x0, #0x8]
008dcf08	ldrh w10,[x1, #0x10]
008dcf0c	strh w10,[x0, #0x10]
008dcf10	ldrb w19,[x8, #0x2]
008dcf14	lsr x17,x19,#0x4
008dcf18	cmp x17,#0xf
008dcf1c	b.ne 0x008dcea4
008dcf20	sub x9,x25,#0xf
008dcf24	cmp x21,x9
008dcf28	b.cs 0x008dc994
008dcf2c	ldrb w8,[x21], #0x1
008dcf30	cmp x8,#0xff
008dcf34	b.eq 0x008dd29c
008dcf38	add x17,x8,#0xf
008dcf3c	cmn x22,x17
008dcf40	cset w9,cs
008dcf44	cmn x21,x17
008dcf48	cset w8,cs
008dcf4c	tbnz w9,#0x0,0x008dc994
008dcf50	tbnz w8,#0x0,0x008dc994
008dcf54	add x0,x22,x17
008dcf58	sub x8,x3,#0xc
008dcf5c	cmp x0,x8
008dcf60	b.hi 0x008dcf74
008dcf64	add x8,x21,x17
008dcf68	sub x9,x25,#0x8
008dcf6c	cmp x8,x9
008dcf70	b.ls 0x008dcfcc
008dcf74	add x8,x21,x17
008dcf78	sub x9,x25,x21
008dcf7c	add x10,x22,x9
008dcf80	cmp x8,x25
008dcf84	csel x24,x10,x0,hi
008dcf88	cmp x24,x3
008dcf8c	b.hi 0x008dd280
008dcf90	cmp x8,x25
008dcf94	mov x0,x22
008dcf98	mov x1,x21
008dcf9c	csel x23,x9,x17,hi
008dcfa0	mov x2,x23
008dcfa4	bl 0x00c2ff60
008dcfa8	ldr x3,[sp, #0x8]
008dcfac	add x0,x22,x23
008dcfb0	cmp x24,x3
008dcfb4	b.eq 0x008dd2c4
008dcfb8	add x8,x21,x23
008dcfbc	sub x9,x25,#0x2
008dcfc0	cmp x8,x9
008dcfc4	b.cc 0x008dd054
008dcfc8	b 0x008dd2c4
008dcfcc	add x9,x22,#0x8
008dcfd0	mvn x10,x22
008dcfd4	cmp x0,x9
008dcfd8	csel x9,x0,x9,hi
008dcfdc	add x9,x9,x10
008dcfe0	cmp x9,#0x18
008dcfe4	b.cc 0x008dd03c
008dcfe8	sub x10,x22,x21
008dcfec	cmp x10,#0x20
008dcff0	b.cc 0x008dd03c
008dcff4	lsr x9,x9,#0x3
008dcff8	add x13,x22,#0x10
008dcffc	add x14,x21,#0x10
008dd000	add x11,x9,#0x1
008dd004	and x12,x11,#0x3ffffffffffffffc
008dd008	lsl x10,x12,#0x3
008dd00c	mov x15,x12
008dd010	add x9,x21,x10
008dd014	add x10,x22,x10
008dd018	ldp q0,q1,[x14, #-0x10]
008dd01c	subs x15,x15,#0x4
008dd020	add x14,x14,#0x20
008dd024	stp q0,q1,[x13, #-0x10]
008dd028	add x13,x13,#0x20
008dd02c	b.ne 0x008dd018
008dd030	cmp x11,x12
008dd034	b.ne 0x008dd044
008dd038	b 0x008dd054
008dd03c	mov x9,x21
008dd040	mov x10,x22
008dd044	ldr x11,[x9], #0x8
008dd048	str x11,[x10], #0x8
008dd04c	cmp x10,x0
008dd050	b.cc 0x008dd044
008dd054	ldrh w16,[x8], #0x2
008dd058	and x9,x19,#0xf
008dd05c	mov x21,x8
008dd060	sub x1,x0,x16
008dd064	cmp x9,#0xf
008dd068	b.ne 0x008dd0a4
008dd06c	sub x9,x25,#0x6
008dd070	cmp x21,x9
008dd074	b.cs 0x008dc994
008dd078	ldrb w8,[x21], #0x1
008dd07c	cmp x8,#0xff
008dd080	b.eq 0x008dd2e8
008dd084	add x9,x8,#0xf
008dd088	cmn x0,x9
008dd08c	cset w10,cs
008dd090	cmn x8,#0x1
008dd094	mov w8,#0xf
008dd098	csel x9,x8,x9,eq
008dd09c	b.eq 0x008dc994
008dd0a0	tbnz w10,#0x0,0x008dc994
008dd0a4	add x17,x9,#0x4
008dd0a8	cmp x1,x26
008dd0ac	b.cc 0x008dc994
008dd0b0	add x22,x0,x17
008dd0b4	sub x8,x3,#0xc
008dd0b8	cmp x22,x8
008dd0bc	b.ls 0x008dd188
008dd0c0	sub x8,x3,x0
008dd0c4	cmp x17,x8
008dd0c8	csel x2,x17,x8,cc
008dd0cc	add x8,x1,x2
008dd0d0	add x22,x0,x2
008dd0d4	cmp x8,x0
008dd0d8	b.ls 0x008dd1f8
008dd0dc	cbz x2,0x008dd21c
008dd0e0	add x8,x2,x0
008dd0e4	add x9,x0,#0x1
008dd0e8	cmp x8,x9
008dd0ec	csinc x8,x8,x0,hi
008dd0f0	sub x8,x8,x0
008dd0f4	cmp x8,#0x8
008dd0f8	b.cc 0x008dd204
008dd0fc	sub x9,x0,x1
008dd100	cmp x9,#0x20
008dd104	b.cc 0x008dd204
008dd108	cmp x8,#0x20
008dd10c	mov x11,xzr
008dd110	b.cc 0x008dd154
008dd114	and x11,x8,#-0x20
008dd118	add x9,x1,#0x10
008dd11c	add x10,x0,#0x10
008dd120	mov x12,x11
008dd124	ldp q0,q1,[x9, #-0x10]
008dd128	subs x12,x12,#0x20
008dd12c	add x9,x9,#0x20
008dd130	stp q0,q1,[x10, #-0x10]
008dd134	add x10,x10,#0x20
008dd138	b.ne 0x008dd124
008dd13c	cmp x8,x11
008dd140	b.eq 0x008dd21c
008dd144	tst x8,#0x18
008dd148	add x9,x0,x11
008dd14c	add x10,x1,x11
008dd150	b.eq 0x008dd20c
008dd154	and x12,x8,#-0x8
008dd158	add x13,x1,x11
008dd15c	add x14,x0,x11
008dd160	add x9,x0,x12
008dd164	add x10,x1,x12
008dd168	sub x11,x11,x12
008dd16c	ldr d0,[x13], #0x8
008dd170	adds x11,x11,#0x8
008dd174	str d0,[x14], #0x8
008dd178	b.ne 0x008dd16c
008dd17c	cmp x8,x12
008dd180	b.ne 0x008dd20c
008dd184	b 0x008dd21c
008dd188	cmp x16,#0x7
008dd18c	b.ls 0x008dd304
008dd190	ldr x8,[x1], #0x8
008dd194	str x8,[x0]
008dd198	ldr x8,[x1]
008dd19c	cmp x17,#0x11
008dd1a0	str x8,[x0, #0x8]
008dd1a4	b.cc 0x008dd224
008dd1a8	add x8,x17,x0
008dd1ac	add x9,x0,#0x18
008dd1b0	cmp x8,x9
008dd1b4	csel x8,x8,x9,hi
008dd1b8	sub x8,x8,x0
008dd1bc	sub x9,x8,#0x11
008dd1c0	add x8,x0,#0x10
008dd1c4	cmp x9,#0x28
008dd1c8	b.cc 0x008dd1dc
008dd1cc	sub x10,x0,x1
008dd1d0	add x10,x10,#0x8
008dd1d4	cmp x10,#0x20
008dd1d8	b.cs 0x008dd238
008dd1dc	mov x9,x1
008dd1e0	add x9,x9,#0x8
008dd1e4	ldr x10,[x9], #0x8
008dd1e8	str x10,[x8], #0x8
008dd1ec	cmp x8,x22
008dd1f0	b.cc 0x008dd1e4
008dd1f4	b 0x008dd224
008dd1f8	bl 0x00c2ffd0
008dd1fc	ldr x3,[sp, #0x8]
008dd200	b 0x008dd21c
008dd204	mov x9,x0
008dd208	mov x10,x1
008dd20c	ldrb w8,[x10], #0x1
008dd210	strb w8,[x9], #0x1
008dd214	cmp x9,x22
008dd218	b.cc 0x008dd20c
008dd21c	cmp x22,x3
008dd220	b.eq 0x008dd2c0
008dd224	ldrb w19,[x21], #0x1
008dd228	lsr x17,x19,#0x4
008dd22c	cmp x17,#0xf
008dd230	b.ne 0x008dcea4
008dd234	b 0x008dcf20
008dd238	lsr x9,x9,#0x3
008dd23c	add x13,x1,#0x18
008dd240	add x10,x9,#0x1
008dd244	and x11,x10,#0x3ffffffffffffffc
008dd248	lsl x12,x11,#0x3
008dd24c	mov x14,x11
008dd250	add x9,x1,x12
008dd254	add x8,x8,x12
008dd258	add x12,x0,#0x20
008dd25c	ldp q0,q1,[x13, #-0x10]
008dd260	subs x14,x14,#0x4
008dd264	add x13,x13,#0x20
008dd268	stp q0,q1,[x12, #-0x10]
008dd26c	add x12,x12,#0x20
008dd270	b.ne 0x008dd25c
008dd274	cmp x10,x11
008dd278	b.eq 0x008dd224
008dd27c	b 0x008dd1e0
008dd280	sub x2,x3,x22
008dd284	mov x0,x22
008dd288	mov x1,x21
008dd28c	mov x19,x3
008dd290	bl 0x00c2ff60
008dd294	mov x0,x19
008dd298	b 0x008dd2c4
008dd29c	cmp x21,x9
008dd2a0	b.cs 0x008dc994
008dd2a4	ldrb w10,[x21], #0x1
008dd2a8	cmp x10,#0xff
008dd2ac	add x8,x8,x10
008dd2b0	b.eq 0x008dd29c
008dd2b4	cmn x8,#0x1
008dd2b8	b.ne 0x008dcf38
008dd2bc	b 0x008dc994
008dd2c0	mov x0,x3
008dd2c4	sub w0,w0,w20
008dd2c8	ldp x20,x19,[sp, #0x60]
008dd2cc	ldp x22,x21,[sp, #0x50]
008dd2d0	ldp x24,x23,[sp, #0x40]
008dd2d4	ldp x26,x25,[sp, #0x30]
008dd2d8	ldp x28,x27,[sp, #0x20]
008dd2dc	ldp x29,x30,[sp, #0x10]
008dd2e0	add sp,sp,#0x70
008dd2e4	ret
008dd2e8	cmp x21,x9
008dd2ec	b.cs 0x008dc994
008dd2f0	ldrb w10,[x21], #0x1
008dd2f4	cmp x10,#0xff
008dd2f8	add x8,x8,x10
008dd2fc	b.eq 0x008dd2e8
008dd300	b 0x008dd084
008dd304	str wzr,[x0]
008dd308	ldrb w8,[x1]
008dd30c	strb w8,[x0]
008dd310	ldrb w8,[x1, #0x1]
008dd314	strb w8,[x0, #0x1]
008dd318	ldrb w8,[x1, #0x2]
008dd31c	strb w8,[x0, #0x2]
008dd320	ldrb w8,[x1, #0x3]
008dd324	strb w8,[x0, #0x3]
008dd328	adrp x8,0x364000
008dd32c	add x8,x8,#0xe30
008dd330	ldr w8,[x8, x16, LSL #0x2]
008dd334	add x8,x1,x8
008dd338	ldr w9,[x8]
008dd33c	str w9,[x0, #0x4]
008dd340	adrp x9,0x364000
008dd344	add x9,x9,#0xdd0
008dd348	ldrsw x9,[x9, x16, LSL #0x2]
008dd34c	sub x1,x8,x9
008dd350	b 0x008dd198
