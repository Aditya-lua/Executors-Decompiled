; LZ4_decompress_safe_continue @ 008da394
008da394	sub sp,sp,#0xf0
008da398	stp x29,x30,[sp, #0x90]
008da39c	stp x28,x27,[sp, #0xa0]
008da3a0	stp x26,x25,[sp, #0xb0]
008da3a4	stp x24,x23,[sp, #0xc0]
008da3a8	stp x22,x21,[sp, #0xd0]
008da3ac	stp x20,x19,[sp, #0xe0]
008da3b0	add x29,sp,#0x90
008da3b4	ldr x5,[x0, #0x18]
008da3b8	mov x24,x2
008da3bc	mov x19,x0
008da3c0	cbz x5,0x008da400
008da3c4	ldr x8,[x19, #0x8]
008da3c8	cmp x8,x24
008da3cc	b.eq 0x008da430
008da3d0	sub x8,x8,x5
008da3d4	mov x0,x1
008da3d8	mov x1,x24
008da3dc	mov w2,w3
008da3e0	mov w3,w4
008da3e4	mov x4,x8
008da3e8	str x5,[x19, #0x10]
008da3ec	str x8,[x19]
008da3f0	bl 0x00c30a10
008da3f4	cmp w0,#0x1
008da3f8	b.ge 0x008da41c
008da3fc	b 0x008dae4c
008da400	mov x0,x1
008da404	mov x1,x24
008da408	mov w2,w3
008da40c	mov w3,w4
008da410	bl 0x00c30320
008da414	cmp w0,#0x1
008da418	b.lt 0x008dae4c
008da41c	mov w8,w0
008da420	str x8,[x19, #0x18]
008da424	add x8,x24,x8
008da428	str x8,[x19, #0x8]
008da42c	b 0x008dae4c
008da430	mov w8,#0xffff
008da434	cmp x5,x8
008da438	b.cc 0x008da454
008da43c	mov x0,x1
008da440	mov x1,x24
008da444	mov w2,w3
008da448	mov w3,w4
008da44c	bl 0x00c30a00
008da450	b 0x008dae28
008da454	ldr x8,[x19, #0x10]
008da458	stur x8,[x29, #-0x8]
008da45c	cbz x8,0x008da4f8
008da460	mov w0,#0xffffffff
008da464	cbz x1,0x008dae4c
008da468	tbnz w4,#0x1f,0x008dae4c
008da46c	ldr x8,[x19]
008da470	ldur x9,[x29, #-0x8]
008da474	stur x1,[x29, #-0x10]
008da478	add x9,x8,x9
008da47c	cmp x8,#0x0
008da480	csel x8,xzr,x9,eq
008da484	stur x8,[x29, #-0x38]
008da488	cbz w4,0x008daa40
008da48c	cbz w3,0x008dae4c
008da490	ldur x8,[x29, #-0x8]
008da494	add x17,x1,w3, SXTW 
008da498	mov w9,w4
008da49c	add x0,x24,x9
008da4a0	sub x22,x24,x5
008da4a4	cmp w4,#0x40
008da4a8	lsr x2,x8,#0x10
008da4ac	sub x4,x17,#0x10
008da4b0	sub x21,x0,#0x20
008da4b4	mov x23,x1
008da4b8	str x5,[sp, #0x48]
008da4bc	str x9,[sp, #0x10]
008da4c0	stur x24,[x29, #-0x40]
008da4c4	stp x0,x17,[x29, #-0x20]
008da4c8	stp x4,x2,[x29, #-0x30]
008da4cc	b.cc 0x008dae90
008da4d0	mov x9,x1
008da4d4	cmp w3,#0x12
008da4d8	ldrb w8,[x9], #0x1
008da4dc	lsr x26,x8,#0x4
008da4e0	b.ge 0x008da514
008da4e4	ldur x24,[x29, #-0x40]
008da4e8	cmp x26,#0xf
008da4ec	mov x23,x9
008da4f0	b.eq 0x008daae8
008da4f4	b 0x008dab1c
008da4f8	mov x0,x1
008da4fc	mov x1,x24
008da500	mov w2,w3
008da504	mov w3,w4
008da508	mov x4,x5
008da50c	bl 0x008db0f8
008da510	b 0x008dae28
008da514	sub x10,x17,#0x40
008da518	sub x11,x17,#0xf
008da51c	ldur x24,[x29, #-0x40]
008da520	str x10,[sp, #0x30]
008da524	sub x10,x17,#0x6
008da528	sub x14,x17,#0x11
008da52c	stp x10,x11,[sp, #0x38]
008da530	sub x10,x0,#0x5
008da534	sub x15,x0,#0x40
008da538	str x10,[sp, #0x18]
008da53c	add x11,x22,#0x1
008da540	add x10,x22,#0x10
008da544	mov x23,x1
008da548	stp x10,x11,[sp]
008da54c	stp x15,x14,[sp, #0x20]
008da550	b 0x008da580
008da554	ldr x8,[x20]
008da558	str x8,[x25]
008da55c	ldr x8,[x20, #0x8]
008da560	str x8,[x25, #0x8]
008da564	ldrh w8,[x20, #0x10]
008da568	strh w8,[x25, #0x10]
008da56c	mov x9,x23
008da570	ldrb w8,[x9], #0x1
008da574	cmp x9,x14
008da578	lsr x26,x8,#0x4
008da57c	b.hi 0x008da4e8
008da580	cmp x26,#0xf
008da584	b.ne 0x008da5e8
008da588	ldr x10,[sp, #0x40]
008da58c	cmp x9,x10
008da590	b.cs 0x008daa38
008da594	ldrb w9,[x9]
008da598	add x23,x23,#0x2
008da59c	cmp x9,#0xff
008da5a0	b.eq 0x008da814
008da5a4	add x26,x9,#0xf
008da5a8	cmn x23,x26
008da5ac	b.cs 0x008daa60
008da5b0	add x25,x24,x26
008da5b4	cmp x25,x15
008da5b8	b.hi 0x008dab20
008da5bc	ldr x10,[sp, #0x30]
008da5c0	add x9,x23,x26
008da5c4	cmp x9,x10
008da5c8	b.hi 0x008dab20
008da5cc	ldp q1,q0,[x23, #0x20]
008da5d0	ldp q2,q3,[x23], #0x40
008da5d4	stp q1,q0,[x24, #0x20]
008da5d8	stp q2,q3,[x24], #0x40
008da5dc	cmp x24,x25
008da5e0	b.cc 0x008da5cc
008da5e4	b 0x008da5f8
008da5e8	ldr q0,[x9]
008da5ec	add x9,x9,x26
008da5f0	add x25,x24,x26
008da5f4	str q0,[x24]
008da5f8	mov x23,x9
008da5fc	and x8,x8,#0xf
008da600	ldrh w27,[x23], #0x2
008da604	cmp x8,#0xf
008da608	sub x20,x25,x27
008da60c	b.ne 0x008da648
008da610	ldr x8,[sp, #0x38]
008da614	cmp x23,x8
008da618	b.cs 0x008daa60
008da61c	ldrb w8,[x9, #0x2]
008da620	add x23,x9,#0x3
008da624	cmp x8,#0xff
008da628	b.eq 0x008da84c
008da62c	add x26,x8,#0x13
008da630	cmn x25,x26
008da634	b.cs 0x008daa60
008da638	add x8,x25,x26
008da63c	cmp x8,x15
008da640	b.cc 0x008da668
008da644	b 0x008dac18
008da648	add x26,x8,#0x4
008da64c	add x24,x25,x26
008da650	cmp x24,x15
008da654	b.cs 0x008dac18
008da658	cmp x20,x22
008da65c	b.cc 0x008da668
008da660	cmp w27,#0x8
008da664	b.cs 0x008da554
008da668	cbnz x2,0x008da67c
008da66c	ldur x8,[x29, #-0x8]
008da670	add x8,x20,x8
008da674	cmp x8,x22
008da678	b.cc 0x008daa60
008da67c	cmp x20,x22
008da680	add x24,x25,x26
008da684	b.cs 0x008da754
008da688	ldr x8,[sp, #0x18]
008da68c	cmp x24,x8
008da690	b.hi 0x008daa60
008da694	sub x28,x22,x20
008da698	subs x20,x26,x28
008da69c	b.ls 0x008da788
008da6a0	ldur x8,[x29, #-0x38]
008da6a4	mov x0,x25
008da6a8	mov x2,x28
008da6ac	sub x1,x8,x28
008da6b0	bl 0x00c2ffd0
008da6b4	add x0,x25,x28
008da6b8	sub x8,x0,x22
008da6bc	cmp x20,x8
008da6c0	b.ls 0x008da7c8
008da6c4	ldr x8,[sp, #0x8]
008da6c8	add x9,x26,x25
008da6cc	add x8,x8,x27
008da6d0	cmp x8,x9
008da6d4	csel x8,x8,x9,hi
008da6d8	ldr x9,[sp, #0x48]
008da6dc	add x8,x9,x8
008da6e0	ldur x9,[x29, #-0x40]
008da6e4	add x9,x9,x27
008da6e8	sub x9,x8,x9
008da6ec	cmp x9,#0x20
008da6f0	b.cc 0x008da7e8
008da6f4	ldp x17,x1,[x29, #-0x18]
008da6f8	cmp w27,#0x20
008da6fc	ldp x4,x2,[x29, #-0x30]
008da700	mov x8,x22
008da704	ldp x15,x14,[sp, #0x20]
008da708	b.cc 0x008da7f8
008da70c	ldr x13,[sp]
008da710	and x10,x9,#-0x20
008da714	sub x12,x27,x25
008da718	add x0,x0,x10
008da71c	add x8,x22,x10
008da720	add x11,x25,x13
008da724	add x11,x11,x12
008da728	mov x12,x13
008da72c	mov x13,x10
008da730	ldp q0,q1,[x12, #-0x10]
008da734	subs x13,x13,#0x20
008da738	add x12,x12,#0x20
008da73c	stp q0,q1,[x11, #-0x10]
008da740	add x11,x11,#0x20
008da744	b.ne 0x008da730
008da748	cmp x9,x10
008da74c	b.ne 0x008da7f8
008da750	b 0x008da808
008da754	cmp w27,#0xf
008da758	b.ls 0x008da884
008da75c	cmp w27,#0x3f
008da760	neg x8,x27
008da764	b.ls 0x008da7a0
008da768	add x9,x25,x8
008da76c	ldp q1,q0,[x9, #0x20]
008da770	ldp q2,q3,[x9]
008da774	stp q1,q0,[x25, #0x20]
008da778	stp q2,q3,[x25], #0x40
008da77c	cmp x25,x24
008da780	b.cc 0x008da768
008da784	b 0x008da56c
008da788	ldur x8,[x29, #-0x38]
008da78c	mov x0,x25
008da790	mov x2,x26
008da794	sub x1,x8,x28
008da798	bl 0x00c2ff60
008da79c	b 0x008da7d4
008da7a0	add x8,x25,x8
008da7a4	add x8,x8,#0x10
008da7a8	ldur q0,[x8, #-0x10]
008da7ac	str q0,[x25]
008da7b0	ldr q0,[x8], #0x20
008da7b4	str q0,[x25, #0x10]
008da7b8	add x25,x25,#0x20
008da7bc	cmp x25,x24
008da7c0	b.cc 0x008da7a8
008da7c4	b 0x008da56c
008da7c8	mov x1,x22
008da7cc	mov x2,x20
008da7d0	bl 0x00c2ffd0
008da7d4	ldp x17,x1,[x29, #-0x18]
008da7d8	ldur x4,[x29, #-0x30]
008da7dc	ldp x2,x0,[x29, #-0x28]
008da7e0	ldp x15,x14,[sp, #0x20]
008da7e4	b 0x008da56c
008da7e8	ldp x17,x1,[x29, #-0x18]
008da7ec	mov x8,x22
008da7f0	ldp x4,x2,[x29, #-0x30]
008da7f4	ldp x15,x14,[sp, #0x20]
008da7f8	ldrb w9,[x8], #0x1
008da7fc	strb w9,[x0], #0x1
008da800	cmp x0,x24
008da804	b.cc 0x008da7f8
008da808	mov x24,x0
008da80c	ldur x0,[x29, #-0x20]
008da810	b 0x008da56c
008da814	ldr x10,[sp, #0x40]
008da818	cmp x23,x10
008da81c	b.cs 0x008daa5c
008da820	ldrb w10,[x23], #0x1
008da824	cmp x10,#0xff
008da828	add x9,x9,x10
008da82c	b.eq 0x008da814
008da830	ldp x17,x1,[x29, #-0x18]
008da834	cmn x9,#0x1
008da838	ldp x2,x0,[x29, #-0x28]
008da83c	ldur x4,[x29, #-0x30]
008da840	ldp x15,x14,[sp, #0x20]
008da844	b.ne 0x008da5a4
008da848	b 0x008daa60
008da84c	ldr x9,[sp, #0x38]
008da850	cmp x23,x9
008da854	b.cs 0x008daa5c
008da858	ldrb w9,[x23], #0x1
008da85c	cmp x9,#0xff
008da860	add x8,x8,x9
008da864	b.eq 0x008da84c
008da868	ldp x17,x1,[x29, #-0x18]
008da86c	cmn x8,#0x1
008da870	ldp x2,x0,[x29, #-0x28]
008da874	ldur x4,[x29, #-0x30]
008da878	ldp x15,x14,[sp, #0x20]
008da87c	b.ne 0x008da62c
008da880	b 0x008daa60
008da884	cmp w27,#0x4
008da888	b.eq 0x008da8c0
008da88c	cmp w27,#0x2
008da890	b.eq 0x008da8b0
008da894	cmp w27,#0x1
008da898	b.ne 0x008da94c
008da89c	ldrb w9,[x20]
008da8a0	orr w10,wzr,#0x1010101
008da8a4	orr x8,x9,x9, LSL #0x8
008da8a8	mul w9,w9,w10
008da8ac	b 0x008da8b8
008da8b0	ldrh w8,[x20]
008da8b4	orr w9,w8,w8, LSL #0x10
008da8b8	mov x10,x8
008da8bc	b 0x008da8d0
008da8c0	ldr w9,[x20]
008da8c4	lsr w10,w9,#0x10
008da8c8	and x8,x9,#0xffff
008da8cc	mov w10,w10
008da8d0	orr x8,x8,x10, LSL #0x10
008da8d4	cmp x26,#0x9
008da8d8	orr x8,x8,x9, LSL #0x20
008da8dc	str x8,[x25]
008da8e0	b.cc 0x008da7d4
008da8e4	add x9,x26,x25
008da8e8	add x10,x25,#0x10
008da8ec	cmp x9,x10
008da8f0	csel x9,x9,x10,hi
008da8f4	sub x9,x9,x25
008da8f8	sub x10,x9,#0x9
008da8fc	add x9,x25,#0x8
008da900	cmp x10,#0x18
008da904	b.cc 0x008da93c
008da908	lsr x10,x10,#0x3
008da90c	dup v0.2D,x8
008da910	add x12,x25,#0x18
008da914	add x10,x10,#0x1
008da918	and x11,x10,#0x3ffffffffffffffc
008da91c	add x9,x9,x11, LSL #0x3
008da920	mov x13,x11
008da924	subs x13,x13,#0x4
008da928	stp q0,q0,[x12, #-0x10]
008da92c	add x12,x12,#0x20
008da930	b.ne 0x008da924
008da934	cmp x10,x11
008da938	b.eq 0x008da7d4
008da93c	str x8,[x9], #0x8
008da940	cmp x9,x24
008da944	b.cc 0x008da93c
008da948	b 0x008da7d4
008da94c	cmp w27,#0x7
008da950	b.hi 0x008da994
008da954	str wzr,[x25]
008da958	ldrh w8,[x20]
008da95c	strh w8,[x25]
008da960	ldrh w8,[x20, #0x2]
008da964	strh w8,[x25, #0x2]
008da968	adrp x8,0x364000
008da96c	add x8,x8,#0xe30
008da970	ldr w8,[x8, x27, LSL #0x2]
008da974	add x8,x20,x8
008da978	ldr w9,[x8]
008da97c	str w9,[x25, #0x4]
008da980	adrp x9,0x364000
008da984	add x9,x9,#0xdd0
008da988	ldrsw x9,[x9, x27, LSL #0x2]
008da98c	sub x20,x8,x9
008da990	b 0x008da99c
008da994	ldr x8,[x20], #0x8
008da998	str x8,[x25]
008da99c	add x8,x26,x25
008da9a0	add x9,x25,#0x10
008da9a4	cmp x8,x9
008da9a8	csel x8,x8,x9,hi
008da9ac	sub x8,x8,x25
008da9b0	sub x9,x8,#0x9
008da9b4	add x8,x25,#0x8
008da9b8	cmp x9,#0x18
008da9bc	b.cs 0x008da9c8
008da9c0	mov x9,x20
008da9c4	b 0x008daa24
008da9c8	sub x10,x25,x20
008da9cc	add x10,x10,#0x8
008da9d0	cmp x10,#0x20
008da9d4	b.cs 0x008da9e0
008da9d8	mov x9,x20
008da9dc	b 0x008daa24
008da9e0	lsr x9,x9,#0x3
008da9e4	add x13,x20,#0x10
008da9e8	add x10,x9,#0x1
008da9ec	and x11,x10,#0x3ffffffffffffffc
008da9f0	lsl x12,x11,#0x3
008da9f4	mov x14,x11
008da9f8	add x9,x20,x12
008da9fc	add x8,x8,x12
008daa00	add x12,x25,#0x18
008daa04	ldp q0,q1,[x13, #-0x10]
008daa08	subs x14,x14,#0x4
008daa0c	add x13,x13,#0x20
008daa10	stp q0,q1,[x12, #-0x10]
008daa14	add x12,x12,#0x20
008daa18	b.ne 0x008daa04
008daa1c	cmp x10,x11
008daa20	b.eq 0x008da7d4
008daa24	ldr x10,[x9], #0x8
008daa28	str x10,[x8], #0x8
008daa2c	cmp x8,x24
008daa30	b.cc 0x008daa24
008daa34	b 0x008da7d4
008daa38	mov x23,x9
008daa3c	b 0x008daa60
008daa40	cmp w3,#0x1
008daa44	b.ne 0x008dae4c
008daa48	ldur x8,[x29, #-0x10]
008daa4c	ldrb w8,[x8]
008daa50	cmp w8,#0x0
008daa54	csetm w0,ne
008daa58	b 0x008dae4c
008daa5c	ldur x1,[x29, #-0x10]
008daa60	mvn w8,w23
008daa64	add w0,w8,w1
008daa68	b 0x008dae28
008daa6c	cmp x23,x4
008daa70	b.cs 0x008dab1c
008daa74	cmp x24,x21
008daa78	b.hi 0x008dab1c
008daa7c	ldr q0,[x23]
008daa80	add x9,x23,x26
008daa84	and x10,x8,#0xf
008daa88	mov x23,x9
008daa8c	add x25,x24,x26
008daa90	cmp x10,#0xf
008daa94	str q0,[x24]
008daa98	ldrh w27,[x23], #0x2
008daa9c	sub x20,x25,x27
008daaa0	b.eq 0x008dabd4
008daaa4	cmp w27,#0x8
008daaa8	b.cc 0x008dabd4
008daaac	cmp x20,x22
008daab0	b.cc 0x008dabd4
008daab4	ldr x8,[x20]
008daab8	add x10,x25,x10
008daabc	add x23,x9,#0x3
008daac0	add x24,x10,#0x4
008daac4	str x8,[x25]
008daac8	ldr x8,[x20, #0x8]
008daacc	str x8,[x25, #0x8]
008daad0	ldrh w8,[x20, #0x10]
008daad4	strh w8,[x25, #0x10]
008daad8	ldrb w8,[x9, #0x2]
008daadc	lsr x26,x8,#0x4
008daae0	cmp x26,#0xf
008daae4	b.ne 0x008daa6c
008daae8	sub x10,x17,#0xf
008daaec	cmp x23,x10
008daaf0	b.cs 0x008daa60
008daaf4	ldrb w9,[x23], #0x1
008daaf8	cmp x9,#0xff
008daafc	b.eq 0x008daea4
008dab00	add x26,x9,#0xf
008dab04	cmn x24,x26
008dab08	cset w10,cs
008dab0c	cmn x23,x26
008dab10	cset w9,cs
008dab14	tbnz w10,#0x0,0x008daa60
008dab18	tbnz w9,#0x0,0x008daa60
008dab1c	add x25,x24,x26
008dab20	sub x9,x0,#0xc
008dab24	cmp x25,x9
008dab28	b.hi 0x008dadf8
008dab2c	add x9,x23,x26
008dab30	sub x10,x17,#0x8
008dab34	cmp x9,x10
008dab38	b.hi 0x008dadf8
008dab3c	add x10,x24,#0x8
008dab40	mvn x11,x24
008dab44	cmp x25,x10
008dab48	csel x10,x25,x10,hi
008dab4c	add x10,x10,x11
008dab50	cmp x10,#0x18
008dab54	b.cc 0x008dabac
008dab58	sub x11,x24,x23
008dab5c	cmp x11,#0x20
008dab60	b.cc 0x008dabac
008dab64	lsr x10,x10,#0x3
008dab68	add x14,x24,#0x10
008dab6c	add x15,x23,#0x10
008dab70	add x12,x10,#0x1
008dab74	and x13,x12,#0x3ffffffffffffffc
008dab78	lsl x11,x13,#0x3
008dab7c	mov x16,x13
008dab80	add x10,x23,x11
008dab84	add x11,x24,x11
008dab88	ldp q0,q1,[x15, #-0x10]
008dab8c	subs x16,x16,#0x4
008dab90	add x15,x15,#0x20
008dab94	stp q0,q1,[x14, #-0x10]
008dab98	add x14,x14,#0x20
008dab9c	b.ne 0x008dab88
008daba0	cmp x12,x13
008daba4	b.ne 0x008dabb4
008daba8	b 0x008dabc4
008dabac	mov x10,x23
008dabb0	mov x11,x24
008dabb4	ldr x12,[x10], #0x8
008dabb8	str x12,[x11], #0x8
008dabbc	cmp x11,x25
008dabc0	b.cc 0x008dabb4
008dabc4	ldrh w27,[x9], #0x2
008dabc8	and x10,x8,#0xf
008dabcc	mov x23,x9
008dabd0	sub x20,x25,x27
008dabd4	cmp x10,#0xf
008dabd8	b.ne 0x008dac14
008dabdc	sub x9,x17,#0x6
008dabe0	cmp x23,x9
008dabe4	b.cs 0x008daa60
008dabe8	ldrb w8,[x23], #0x1
008dabec	cmp x8,#0xff
008dabf0	b.eq 0x008daec8
008dabf4	add x10,x8,#0xf
008dabf8	cmn x25,x10
008dabfc	cset w9,cs
008dac00	cmn x8,#0x1
008dac04	mov w8,#0xf
008dac08	csel x10,x8,x10,eq
008dac0c	b.eq 0x008daa60
008dac10	tbnz w9,#0x0,0x008daa60
008dac14	add x26,x10,#0x4
008dac18	cbnz x2,0x008dac2c
008dac1c	ldur x8,[x29, #-0x8]
008dac20	add x8,x20,x8
008dac24	cmp x8,x22
008dac28	b.cc 0x008daa60
008dac2c	cmp x20,x22
008dac30	add x24,x25,x26
008dac34	b.cs 0x008dacfc
008dac38	sub x8,x0,#0x5
008dac3c	cmp x24,x8
008dac40	b.hi 0x008daa60
008dac44	sub x27,x22,x20
008dac48	subs x28,x26,x27
008dac4c	b.ls 0x008dad7c
008dac50	ldur x8,[x29, #-0x38]
008dac54	mov x0,x25
008dac58	mov x2,x27
008dac5c	sub x1,x8,x27
008dac60	bl 0x00c2ffd0
008dac64	add x0,x25,x27
008dac68	sub x8,x0,x22
008dac6c	cmp x28,x8
008dac70	b.ls 0x008dad94
008dac74	ldr x9,[sp, #0x48]
008dac78	ldur x10,[x29, #-0x40]
008dac7c	add x13,x26,x25
008dac80	add x9,x9,x20
008dac84	add x10,x25,x10
008dac88	sub x11,x10,x9
008dac8c	add x12,x11,#0x1
008dac90	cmp x12,x13
008dac94	csinc x11,x13,x11,ls
008dac98	add x9,x9,x11
008dac9c	sub x9,x9,x10
008daca0	cmp x9,#0x20
008daca4	b.cc 0x008dae6c
008daca8	ldp x17,x1,[x29, #-0x18]
008dacac	cmp x8,#0x20
008dacb0	ldp x4,x2,[x29, #-0x30]
008dacb4	mov x8,x22
008dacb8	b.cc 0x008dae78
008dacbc	and x10,x9,#-0x20
008dacc0	add x12,x27,x25
008dacc4	add x11,x22,#0x10
008dacc8	add x0,x0,x10
008daccc	add x8,x22,x10
008dacd0	add x12,x12,#0x10
008dacd4	mov x13,x10
008dacd8	ldp q0,q1,[x11, #-0x10]
008dacdc	subs x13,x13,#0x20
008dace0	add x11,x11,#0x20
008dace4	stp q0,q1,[x12, #-0x10]
008dace8	add x12,x12,#0x20
008dacec	b.ne 0x008dacd8
008dacf0	cmp x9,x10
008dacf4	b.ne 0x008dae78
008dacf8	b 0x008dae88
008dacfc	cmp x27,#0x7
008dad00	sub x8,x0,#0xc
008dad04	b.ls 0x008daee4
008dad08	ldr x9,[x20], #0x8
008dad0c	str x9,[x25]
008dad10	cmp x24,x8
008dad14	add x9,x25,#0x8
008dad18	b.hi 0x008daf34
008dad1c	ldr x8,[x20]
008dad20	cmp x26,#0x11
008dad24	str x8,[x9]
008dad28	b.cc 0x008dae90
008dad2c	add x8,x26,x25
008dad30	add x9,x25,#0x18
008dad34	cmp x8,x9
008dad38	csel x8,x8,x9,hi
008dad3c	sub x8,x8,x25
008dad40	sub x9,x8,#0x11
008dad44	add x8,x25,#0x10
008dad48	cmp x9,#0x28
008dad4c	b.cc 0x008dad60
008dad50	sub x10,x25,x20
008dad54	add x10,x10,#0x8
008dad58	cmp x10,#0x20
008dad5c	b.cs 0x008dadb0
008dad60	mov x9,x20
008dad64	add x9,x9,#0x8
008dad68	ldr x10,[x9], #0x8
008dad6c	str x10,[x8], #0x8
008dad70	cmp x8,x24
008dad74	b.cc 0x008dad68
008dad78	b 0x008dae90
008dad7c	ldur x8,[x29, #-0x38]
008dad80	mov x0,x25
008dad84	mov x2,x26
008dad88	sub x1,x8,x27
008dad8c	bl 0x00c2ff60
008dad90	b 0x008dada0
008dad94	mov x1,x22
008dad98	mov x2,x28
008dad9c	bl 0x00c2ffd0
008dada0	ldp x17,x1,[x29, #-0x18]
008dada4	ldur x4,[x29, #-0x30]
008dada8	ldp x2,x0,[x29, #-0x28]
008dadac	b 0x008dae90
008dadb0	lsr x9,x9,#0x3
008dadb4	add x13,x20,#0x18
008dadb8	add x10,x9,#0x1
008dadbc	and x11,x10,#0x3ffffffffffffffc
008dadc0	lsl x12,x11,#0x3
008dadc4	mov x14,x11
008dadc8	add x9,x20,x12
008dadcc	add x8,x8,x12
008dadd0	add x12,x25,#0x20
008dadd4	ldp q0,q1,[x13, #-0x10]
008dadd8	subs x14,x14,#0x4
008daddc	add x13,x13,#0x20
008dade0	stp q0,q1,[x12, #-0x10]
008dade4	add x12,x12,#0x20
008dade8	b.ne 0x008dadd4
008dadec	cmp x10,x11
008dadf0	b.eq 0x008dae90
008dadf4	b 0x008dad64
008dadf8	add x8,x23,x26
008dadfc	cmp x8,x17
008dae00	b.ne 0x008daa60
008dae04	cmp x25,x0
008dae08	b.hi 0x008daa60
008dae0c	mov x0,x24
008dae10	mov x1,x23
008dae14	mov x2,x26
008dae18	bl 0x00c2ff60
008dae1c	ldur x9,[x29, #-0x40]
008dae20	add w8,w24,w26
008dae24	sub w0,w8,w9
008dae28	cmp w0,#0x1
008dae2c	b.lt 0x008dae4c
008dae30	ldr x8,[x19, #0x18]
008dae34	ldr x10,[x19, #0x8]
008dae38	mov w9,w0
008dae3c	add x8,x8,x9
008dae40	add x9,x10,x9
008dae44	str x8,[x19, #0x18]
008dae48	str x9,[x19, #0x8]
008dae4c	ldp x20,x19,[sp, #0xe0]
008dae50	ldp x22,x21,[sp, #0xd0]
008dae54	ldp x24,x23,[sp, #0xc0]
008dae58	ldp x26,x25,[sp, #0xb0]
008dae5c	ldp x28,x27,[sp, #0xa0]
008dae60	ldp x29,x30,[sp, #0x90]
008dae64	add sp,sp,#0xf0
008dae68	ret
008dae6c	ldp x17,x1,[x29, #-0x18]
008dae70	mov x8,x22
008dae74	ldp x4,x2,[x29, #-0x30]
008dae78	ldrb w9,[x8], #0x1
008dae7c	strb w9,[x0], #0x1
008dae80	cmp x0,x24
008dae84	b.cc 0x008dae78
008dae88	mov x24,x0
008dae8c	ldur x0,[x29, #-0x20]
008dae90	ldrb w8,[x23], #0x1
008dae94	lsr x26,x8,#0x4
008dae98	cmp x26,#0xf
008dae9c	b.ne 0x008daa6c
008daea0	b 0x008daae8
008daea4	cmp x23,x10
008daea8	b.cs 0x008daa60
008daeac	ldrb w11,[x23], #0x1
008daeb0	cmp x11,#0xff
008daeb4	add x9,x9,x11
008daeb8	b.eq 0x008daea4
008daebc	cmn x9,#0x1
008daec0	b.ne 0x008dab00
008daec4	b 0x008daa60
008daec8	cmp x23,x9
008daecc	b.cs 0x008daa60
008daed0	ldrb w10,[x23], #0x1
008daed4	cmp x10,#0xff
008daed8	add x8,x8,x10
008daedc	b.eq 0x008daec8
008daee0	b 0x008dabf4
008daee4	str wzr,[x25]
008daee8	ldrb w9,[x20]
008daeec	strb w9,[x25]
008daef0	ldrb w9,[x20, #0x1]
008daef4	strb w9,[x25, #0x1]
008daef8	ldrb w9,[x20, #0x2]
008daefc	strb w9,[x25, #0x2]
008daf00	ldrb w9,[x20, #0x3]
008daf04	strb w9,[x25, #0x3]
008daf08	adrp x9,0x364000
008daf0c	add x9,x9,#0xe30
008daf10	ldr w9,[x9, x27, LSL #0x2]
008daf14	add x9,x20,x9
008daf18	ldr w10,[x9]
008daf1c	str w10,[x25, #0x4]
008daf20	adrp x10,0x364000
008daf24	add x10,x10,#0xdd0
008daf28	ldrsw x10,[x10, x27, LSL #0x2]
008daf2c	sub x20,x9,x10
008daf30	b 0x008dad10
008daf34	sub x8,x0,#0x5
008daf38	cmp x24,x8
008daf3c	b.hi 0x008daa5c
008daf40	sub x8,x0,#0x7
008daf44	cmp x9,x8
008daf48	b.cs 0x008daf84
008daf4c	ldur x10,[x29, #-0x40]
008daf50	ldr x11,[sp, #0x10]
008daf54	add x10,x10,x11
008daf58	add x11,x25,#0x10
008daf5c	sub x10,x10,#0x7
008daf60	cmp x10,x11
008daf64	csel x10,x10,x11,hi
008daf68	sub x10,x10,x25
008daf6c	sub x12,x10,#0x9
008daf70	cmp x12,#0x28
008daf74	b.cs 0x008daf90
008daf78	mov x10,x20
008daf7c	mov x11,x9
008daf80	b 0x008dafec
008daf84	mov x10,x20
008daf88	mov x8,x9
008daf8c	b 0x008db004
008daf90	sub x10,x25,x20
008daf94	mov x11,x9
008daf98	add x10,x10,#0x8
008daf9c	cmp x10,#0x20
008dafa0	mov x10,x20
008dafa4	b.cc 0x008dafec
008dafa8	lsr x10,x12,#0x3
008dafac	add x14,x25,#0x18
008dafb0	add x15,x20,#0x10
008dafb4	add x12,x10,#0x1
008dafb8	and x13,x12,#0x3ffffffffffffffc
008dafbc	lsl x11,x13,#0x3
008dafc0	mov x16,x13
008dafc4	add x10,x20,x11
008dafc8	add x11,x9,x11
008dafcc	ldp q0,q1,[x15, #-0x10]
008dafd0	subs x16,x16,#0x4
008dafd4	add x15,x15,#0x20
008dafd8	stp q0,q1,[x14, #-0x10]
008dafdc	add x14,x14,#0x20
008dafe0	b.ne 0x008dafcc
008dafe4	cmp x12,x13
008dafe8	b.eq 0x008daffc
008dafec	ldr x12,[x10], #0x8
008daff0	str x12,[x11], #0x8
008daff4	cmp x11,x8
008daff8	b.cc 0x008dafec
008daffc	sub x9,x8,x9
008db000	add x10,x20,x9
008db004	cmp x8,x24
008db008	b.cs 0x008dada0
008db00c	ldur x9,[x29, #-0x40]
008db010	ldr x11,[sp, #0x10]
008db014	add x12,x26,x25
008db018	add x9,x9,x11
008db01c	add x11,x25,#0x8
008db020	sub x9,x9,#0x7
008db024	cmp x9,x11
008db028	csel x11,x9,x11,hi
008db02c	sub x9,x12,x11
008db030	cmp x9,#0x8
008db034	b.cc 0x008db048
008db038	sub x12,x25,x20
008db03c	add x12,x12,#0x8
008db040	cmp x12,#0x20
008db044	b.cs 0x008db064
008db048	mov x13,x8
008db04c	mov x14,x10
008db050	ldrb w8,[x14], #0x1
008db054	strb w8,[x13], #0x1
008db058	cmp x13,x24
008db05c	b.cc 0x008db050
008db060	b 0x008dada0
008db064	cmp x9,#0x20
008db068	mov x12,xzr
008db06c	b.cc 0x008db0b8
008db070	sub x13,x11,x25
008db074	and x12,x9,#-0x20
008db078	add x14,x8,#0x10
008db07c	add x13,x13,x20
008db080	mov x15,x12
008db084	add x13,x13,#0x8
008db088	ldp q0,q1,[x13, #-0x10]
008db08c	subs x15,x15,#0x20
008db090	add x13,x13,#0x20
008db094	stp q0,q1,[x14, #-0x10]
008db098	add x14,x14,#0x20
008db09c	b.ne 0x008db088
008db0a0	cmp x9,x12
008db0a4	b.eq 0x008dada0
008db0a8	tst x9,#0x18
008db0ac	add x13,x8,x12
008db0b0	add x14,x10,x12
008db0b4	b.eq 0x008db050
008db0b8	add x13,x12,x11
008db0bc	and x11,x9,#-0x8
008db0c0	sub x15,x13,x25
008db0c4	add x14,x10,x11
008db0c8	add x13,x8,x11
008db0cc	add x10,x15,x20
008db0d0	add x8,x8,x12
008db0d4	sub x12,x12,x11
008db0d8	sub x10,x10,#0x8
008db0dc	ldr d0,[x10], #0x8
008db0e0	adds x12,x12,#0x8
008db0e4	str d0,[x8], #0x8
008db0e8	b.ne 0x008db0dc
008db0ec	cmp x9,x11
008db0f0	b.ne 0x008db050
008db0f4	b 0x008dada0
