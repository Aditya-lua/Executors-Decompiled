; std::__ndk1::__time_get_storage<wchar_t>::__analyze @ 00c04f40
00c04f40	paciasp
00c04f44	stp x29,x30,[sp, #-0x60]!
00c04f48	stp x28,x27,[sp, #0x10]
00c04f4c	stp x26,x25,[sp, #0x20]
00c04f50	stp x24,x23,[sp, #0x30]
00c04f54	stp x22,x21,[sp, #0x40]
00c04f58	stp x20,x19,[sp, #0x50]
00c04f5c	mov x29,sp
00c04f60	sub sp,sp,#0x280
00c04f64	mov x19,x8
00c04f68	adrp x8,0x29c000
00c04f6c	sub x27,x29,#0x50
00c04f70	ldr q0,[x8, #0x6d0]
00c04f74	adrp x8,0x29c000
00c04f78	ldr x4,[x0]
00c04f7c	ldr q1,[x8, #0xc20]
00c04f80	mov w8,#0xffffffff
00c04f84	mov x20,x2
00c04f88	mov w26,w1
00c04f8c	mov x22,x0
00c04f90	stp xzr,xzr,[x27, #0x20]
00c04f94	str xzr,[x27, #0x30]
00c04f98	sub x0,x29,#0xb4
00c04f9c	sub x2,x29,#0xb8
00c04fa0	stur w8,[x29, #-0x30]
00c04fa4	mov w8,#0x25
00c04fa8	sub x3,x29,#0x50
00c04fac	sturb w1,[x29, #-0xb7]
00c04fb0	mov w1,#0x64
00c04fb4	sub x21,x29,#0xb4
00c04fb8	stp q0,q1,[x27]
00c04fbc	sturb wzr,[x29, #-0xb6]
00c04fc0	sturb w8,[x29, #-0xb8]
00c04fc4	bl 0x00c43b60
00c04fc8	ldr x0,[x22]
00c04fcc	stp x21,xzr,[sp, #0x28]
00c04fd0	str x22,[sp, #0x8]
00c04fd4	bl 0x00c43880
00c04fd8	mov x22,x0
00c04fdc	str x0,[x27, #0x38]
00c04fe0	add x0,sp,#0x38
00c04fe4	add x1,sp,#0x28
00c04fe8	add x3,sp,#0x30
00c04fec	mov w2,#0x64
00c04ff0	bl 0x00c43af0
00c04ff4	mov x25,x0
00c04ff8	cbz x22,0x00c05004
00c04ffc	mov x0,x22
00c05000	bl 0x00c43880
00c05004	cmn x25,#0x1
00c05008	b.eq 0x00c065a4
00c0500c	stp xzr,xzr,[x19]
00c05010	str xzr,[x19, #0x10]
00c05014	cbz x25,0x00c06580
00c05018	add x8,sp,#0x38
00c0501c	ldr x9,[sp, #0x8]
00c05020	add x28,sp,#0x38
00c05024	add x25,x8,x25, LSL #0x2
00c05028	and w8,w26,#0xff
00c0502c	add x22,x9,#0x8
00c05030	add x23,x9,#0x158
00c05034	add x10,x9,#0x398
00c05038	add x9,x19,#0x4
00c0503c	str w8,[sp, #0x4]
00c05040	stp x10,x9,[sp, #0x10]
00c05044	b 0x00c05098
00c05048	mov w26,#0x4
00c0504c	mov x0,x19
00c05050	mov x1,x26
00c05054	mov w2,#0x1
00c05058	mov x3,x26
00c0505c	mov x4,x26
00c05060	mov x5,xzr
00c05064	mov x6,xzr
00c05068	bl 0x00c43d70
00c0506c	mov x9,x26
00c05070	ldr x8,[x19, #0x10]
00c05074	add x10,x9,#0x1
00c05078	str x10,[x19, #0x8]
00c0507c	add x8,x8,x9, LSL #0x2
00c05080	mov w9,#0x61
00c05084	stp w9,wzr,[x8]
00c05088	ldr x24,[x27, #0x38]
00c0508c	cmp x24,x25
00c05090	mov x28,x24
00c05094	b.eq 0x00c06580
00c05098	ldr x8,[x20]
00c0509c	ldr w2,[x28]
00c050a0	ldr x8,[x8, #0x18]
00c050a4	mov x0,x20
00c050a8	mov w1,#0x1
00c050ac	blr x8
00c050b0	tbz w0,#0x0,0x00c050cc
00c050b4	ldrb w9,[x19]
00c050b8	tbnz w9,#0x0,0x00c05118
00c050bc	cmp w9,#0x8
00c050c0	b.ne 0x00c051a8
00c050c4	mov w26,#0x4
00c050c8	b 0x00c0512c
00c050cc	str x28,[x27, #0x38]
00c050d0	str wzr,[sp, #0x24]
00c050d4	sub x0,x29,#0x18
00c050d8	add x5,sp,#0x24
00c050dc	mov x1,x25
00c050e0	mov x2,x22
00c050e4	mov x3,x23
00c050e8	mov x4,x20
00c050ec	mov w6,wzr
00c050f0	bl 0x00c065ec
00c050f4	sub x21,x0,x22
00c050f8	cmp x21,#0x14f
00c050fc	b.gt 0x00c05160
00c05100	ldrb w9,[x19]
00c05104	tbnz w9,#0x0,0x00c051f8
00c05108	cmp w9,#0x8
00c0510c	b.ne 0x00c0542c
00c05110	mov w26,#0x4
00c05114	b 0x00c0520c
00c05118	ldp x9,x8,[x19]
00c0511c	and x9,x9,#-0x2
00c05120	sub x26,x9,#0x1
00c05124	cmp x8,x26
00c05128	b.ne 0x00c05150
00c0512c	mov x0,x19
00c05130	mov x1,x26
00c05134	mov w2,#0x1
00c05138	mov x3,x26
00c0513c	mov x4,x26
00c05140	mov x5,xzr
00c05144	mov x6,xzr
00c05148	bl 0x00c43d70
00c0514c	mov x8,x26
00c05150	ldr x9,[x19, #0x10]
00c05154	add x10,x8,#0x1
00c05158	str x10,[x19, #0x8]
00c0515c	b 0x00c051b8
00c05160	str x28,[x27, #0x38]
00c05164	ldr x3,[sp, #0x10]
00c05168	sub x0,x29,#0x18
00c0516c	add x5,sp,#0x24
00c05170	mov x1,x25
00c05174	mov x2,x23
00c05178	mov x4,x20
00c0517c	mov w6,wzr
00c05180	bl 0x00c065ec
00c05184	sub x24,x0,x23
00c05188	cmp x24,#0x23f
00c0518c	b.gt 0x00c05240
00c05190	ldrb w9,[x19]
00c05194	tbnz w9,#0x0,0x00c054e8
00c05198	cmp w9,#0x8
00c0519c	b.ne 0x00c05584
00c051a0	mov w26,#0x4
00c051a4	b 0x00c054fc
00c051a8	lsr x8,x9,#0x1
00c051ac	add w9,w9,#0x2
00c051b0	strb w9,[x19]
00c051b4	ldr x9,[sp, #0x18]
00c051b8	lsl x8,x8,#0x2
00c051bc	mov w10,#0x20
00c051c0	str x10,[x9, x8#0x0]
00c051c4	add x8,x28,#0x4
00c051c8	mov x24,x8
00c051cc	cmp x8,x25
00c051d0	b.eq 0x00c0508c
00c051d4	ldr x8,[x20]
00c051d8	ldr w2,[x24]
00c051dc	ldr x8,[x8, #0x18]
00c051e0	mov x0,x20
00c051e4	mov w1,#0x1
00c051e8	blr x8
00c051ec	add x8,x24,#0x4
00c051f0	tbnz w0,#0x0,0x00c051c8
00c051f4	b 0x00c0508c
00c051f8	ldp x9,x8,[x19]
00c051fc	and x9,x9,#-0x2
00c05200	sub x26,x9,#0x1
00c05204	cmp x8,x26
00c05208	b.ne 0x00c05230
00c0520c	mov x0,x19
00c05210	mov x1,x26
00c05214	mov w2,#0x1
00c05218	mov x3,x26
00c0521c	mov x4,x26
00c05220	mov x5,xzr
00c05224	mov x6,xzr
00c05228	bl 0x00c43d70
00c0522c	mov x8,x26
00c05230	ldr x9,[x19, #0x10]
00c05234	add x10,x8,#0x1
00c05238	str x10,[x19, #0x8]
00c0523c	b 0x00c0543c
00c05240	ldr x12,[sp, #0x8]
00c05244	ldrb w8,[x12, #0x398]
00c05248	ldrb w9,[x12, #0x3b0]
00c0524c	ldr x10,[x12, #0x3a0]
00c05250	lsr x11,x8,#0x1
00c05254	tst w8,#0x1
00c05258	ldr x8,[x12, #0x3b8]
00c0525c	lsr x12,x9,#0x1
00c05260	csel x10,x11,x10,eq
00c05264	tst w9,#0x1
00c05268	csel x8,x12,x8,eq
00c0526c	cmn x10,x8
00c05270	b.eq 0x00c052c0
00c05274	str x28,[x27, #0x38]
00c05278	ldp x8,x2,[sp, #0x8]
00c0527c	sub x0,x29,#0x18
00c05280	add x5,sp,#0x24
00c05284	mov x1,x25
00c05288	mov x4,x20
00c0528c	mov w6,wzr
00c05290	add x3,x8,#0x3c8
00c05294	bl 0x00c065ec
00c05298	ldr x8,[sp, #0x10]
00c0529c	sub x8,x0,x8
00c052a0	cmp x8,#0x2f
00c052a4	b.gt 0x00c052c0
00c052a8	ldrb w9,[x19]
00c052ac	tbnz w9,#0x0,0x00c05750
00c052b0	cmp w9,#0x8
00c052b4	b.ne 0x00c05908
00c052b8	mov w26,#0x4
00c052bc	b 0x00c05764
00c052c0	ldr x8,[x20]
00c052c4	str x28,[x27, #0x38]
00c052c8	ldr w2,[x28]
00c052cc	ldr x8,[x8, #0x18]
00c052d0	mov x0,x20
00c052d4	mov w1,#0x40
00c052d8	blr x8
00c052dc	ldr w26,[x28]
00c052e0	ldr x8,[x20]
00c052e4	tbz w0,#0x0,0x00c05530
00c052e8	ldr x8,[x8, #0x18]
00c052ec	mov x0,x20
00c052f0	mov w1,#0x40
00c052f4	mov w2,w26
00c052f8	blr x8
00c052fc	tbz w0,#0x0,0x00c05664
00c05300	ldr x8,[x20]
00c05304	ldr x8,[x8, #0x68]
00c05308	mov x0,x20
00c0530c	mov w1,w26
00c05310	mov w2,wzr
00c05314	blr x8
00c05318	add x24,x28,#0x4
00c0531c	and w8,w0,#0xff
00c05320	cmp x24,x25
00c05324	sub w21,w8,#0x30
00c05328	b.eq 0x00c05798
00c0532c	ldr x8,[x20]
00c05330	ldr w26,[x24]
00c05334	ldr x8,[x8, #0x18]
00c05338	mov x0,x20
00c0533c	mov w1,#0x40
00c05340	mov w2,w26
00c05344	blr x8
00c05348	tbz w0,#0x0,0x00c057a8
00c0534c	ldr x8,[x20]
00c05350	ldr x8,[x8, #0x68]
00c05354	mov x0,x20
00c05358	mov w1,w26
00c0535c	mov w2,wzr
00c05360	blr x8
00c05364	mov w8,#0xa
00c05368	add x24,x28,#0x8
00c0536c	mul w8,w21,w8
00c05370	cmp x24,x25
00c05374	add w8,w8,w0, UXTB 
00c05378	sub w21,w8,#0x30
00c0537c	b.eq 0x00c05798
00c05380	ldr x8,[x20]
00c05384	ldr w26,[x24]
00c05388	ldr x8,[x8, #0x18]
00c0538c	mov x0,x20
00c05390	mov w1,#0x40
00c05394	mov w2,w26
00c05398	blr x8
00c0539c	tbz w0,#0x0,0x00c057a8
00c053a0	ldr x8,[x20]
00c053a4	ldr x8,[x8, #0x68]
00c053a8	mov x0,x20
00c053ac	mov w1,w26
00c053b0	mov w2,wzr
00c053b4	blr x8
00c053b8	mov w8,#0xa
00c053bc	add x24,x28,#0xc
00c053c0	mul w8,w21,w8
00c053c4	cmp x24,x25
00c053c8	add w8,w8,w0, UXTB 
00c053cc	sub w21,w8,#0x30
00c053d0	b.eq 0x00c05798
00c053d4	ldr x8,[x20]
00c053d8	ldr w26,[x24]
00c053dc	ldr x8,[x8, #0x18]
00c053e0	mov x0,x20
00c053e4	mov w1,#0x40
00c053e8	mov w2,w26
00c053ec	blr x8
00c053f0	tbz w0,#0x0,0x00c057a8
00c053f4	ldr x8,[x20]
00c053f8	ldr x8,[x8, #0x68]
00c053fc	mov x0,x20
00c05400	mov w1,w26
00c05404	mov w2,wzr
00c05408	blr x8
00c0540c	mov w8,#0xa
00c05410	add x28,x28,#0x10
00c05414	mul w8,w21,w8
00c05418	add w8,w8,w0, UXTB 
00c0541c	sub w21,w8,#0x30
00c05420	cmp x28,x25
00c05424	b.ne 0x00c057a4
00c05428	b 0x00c05a64
00c0542c	lsr x8,x9,#0x1
00c05430	add w9,w9,#0x2
00c05434	strb w9,[x19]
00c05438	ldr x9,[sp, #0x18]
00c0543c	lsl x8,x8,#0x2
00c05440	mov w10,#0x25
00c05444	cmp x21,#0xa7
00c05448	str x10,[x9, x8#0x0]
00c0544c	ldrb w8,[x19]
00c05450	b.gt 0x00c05468
00c05454	tbnz w8,#0x0,0x00c05488
00c05458	cmp w8,#0x8
00c0545c	b.ne 0x00c05568
00c05460	mov w26,#0x4
00c05464	b 0x00c0549c
00c05468	tbnz w8,#0x0,0x00c054d0
00c0546c	cmp w8,#0x8
00c05470	b.eq 0x00c05048
00c05474	lsr x9,x8,#0x1
00c05478	add w8,w8,#0x2
00c0547c	strb w8,[x19]
00c05480	ldr x8,[sp, #0x18]
00c05484	b 0x00c0507c
00c05488	ldp x8,x9,[x19]
00c0548c	and x8,x8,#-0x2
00c05490	sub x26,x8,#0x1
00c05494	cmp x9,x26
00c05498	b.ne 0x00c054c0
00c0549c	mov x0,x19
00c054a0	mov x1,x26
00c054a4	mov w2,#0x1
00c054a8	mov x3,x26
00c054ac	mov x4,x26
00c054b0	mov x5,xzr
00c054b4	mov x6,xzr
00c054b8	bl 0x00c43d70
00c054bc	mov x9,x26
00c054c0	ldr x8,[x19, #0x10]
00c054c4	add x10,x9,#0x1
00c054c8	str x10,[x19, #0x8]
00c054cc	b 0x00c05578
00c054d0	ldp x8,x9,[x19]
00c054d4	and x8,x8,#-0x2
00c054d8	sub x26,x8,#0x1
00c054dc	cmp x9,x26
00c054e0	b.eq 0x00c0504c
00c054e4	b 0x00c05070
00c054e8	ldp x9,x8,[x19]
00c054ec	and x9,x9,#-0x2
00c054f0	sub x26,x9,#0x1
00c054f4	cmp x8,x26
00c054f8	b.ne 0x00c05520
00c054fc	mov x0,x19
00c05500	mov x1,x26
00c05504	mov w2,#0x1
00c05508	mov x3,x26
00c0550c	mov x4,x26
00c05510	mov x5,xzr
00c05514	mov x6,xzr
00c05518	bl 0x00c43d70
00c0551c	mov x8,x26
00c05520	ldr x9,[x19, #0x10]
00c05524	add x10,x8,#0x1
00c05528	str x10,[x19, #0x8]
00c0552c	b 0x00c05594
00c05530	ldr x8,[x8, #0x68]
00c05534	mov x0,x20
00c05538	mov w1,w26
00c0553c	mov w2,wzr
00c05540	blr x8
00c05544	and w8,w0,#0xff
00c05548	cmp w8,#0x25
00c0554c	b.ne 0x00c0567c
00c05550	ldrb w9,[x19]
00c05554	tbnz w9,#0x0,0x00c05850
00c05558	cmp w9,#0x8
00c0555c	b.ne 0x00c059a4
00c05560	mov w26,#0x4
00c05564	b 0x00c05864
00c05568	lsr x9,x8,#0x1
00c0556c	add w8,w8,#0x2
00c05570	strb w8,[x19]
00c05574	ldr x8,[sp, #0x18]
00c05578	add x8,x8,x9, LSL #0x2
00c0557c	mov w9,#0x41
00c05580	b 0x00c05084
00c05584	lsr x8,x9,#0x1
00c05588	add w9,w9,#0x2
00c0558c	strb w9,[x19]
00c05590	ldr x9,[sp, #0x18]
00c05594	lsl x8,x8,#0x2
00c05598	mov w10,#0x25
00c0559c	cmp x24,#0x11f
00c055a0	str x10,[x9, x8#0x0]
00c055a4	ldrb w8,[x19]
00c055a8	b.gt 0x00c055c0
00c055ac	tbnz w8,#0x0,0x00c055d4
00c055b0	cmp w8,#0x8
00c055b4	b.ne 0x00c05698
00c055b8	mov w26,#0x4
00c055bc	b 0x00c055e8
00c055c0	tbnz w8,#0x0,0x00c0561c
00c055c4	cmp w8,#0x8
00c055c8	b.ne 0x00c056b4
00c055cc	mov w26,#0x4
00c055d0	b 0x00c05630
00c055d4	ldp x8,x9,[x19]
00c055d8	and x8,x8,#-0x2
00c055dc	sub x26,x8,#0x1
00c055e0	cmp x9,x26
00c055e4	b.ne 0x00c0560c
00c055e8	mov x0,x19
00c055ec	mov x1,x26
00c055f0	mov w2,#0x1
00c055f4	mov x3,x26
00c055f8	mov x4,x26
00c055fc	mov x5,xzr
00c05600	mov x6,xzr
00c05604	bl 0x00c43d70
00c05608	mov x9,x26
00c0560c	ldr x8,[x19, #0x10]
00c05610	add x10,x9,#0x1
00c05614	str x10,[x19, #0x8]
00c05618	b 0x00c056a8
00c0561c	ldp x8,x9,[x19]
00c05620	and x8,x8,#-0x2
00c05624	sub x26,x8,#0x1
00c05628	cmp x9,x26
00c0562c	b.ne 0x00c05654
00c05630	mov x0,x19
00c05634	mov x1,x26
00c05638	mov w2,#0x1
00c0563c	mov x3,x26
00c05640	mov x4,x26
00c05644	mov x5,xzr
00c05648	mov x6,xzr
00c0564c	bl 0x00c43d70
00c05650	mov x9,x26
00c05654	ldr x8,[x19, #0x10]
00c05658	add x10,x9,#0x1
00c0565c	str x10,[x19, #0x8]
00c05660	b 0x00c056c4
00c05664	mov w21,wzr
00c05668	mov w8,#0x4
00c0566c	ldr w9,[sp, #0x24]
00c05670	orr w8,w9,w8
00c05674	str w8,[sp, #0x24]
00c05678	b 0x00c057a4
00c0567c	ldrb w9,[x19]
00c05680	ldr w21,[x28]
00c05684	tbnz w9,#0x0,0x00c05898
00c05688	cmp w9,#0x8
00c0568c	b.ne 0x00c05a20
00c05690	mov w26,#0x4
00c05694	b 0x00c058ac
00c05698	lsr x9,x8,#0x1
00c0569c	add w8,w8,#0x2
00c056a0	strb w8,[x19]
00c056a4	ldr x8,[sp, #0x18]
00c056a8	add x8,x8,x9, LSL #0x2
00c056ac	mov w9,#0x42
00c056b0	b 0x00c056cc
00c056b4	lsr x9,x8,#0x1
00c056b8	add w8,w8,#0x2
00c056bc	strb w8,[x19]
00c056c0	ldr x8,[sp, #0x18]
00c056c4	add x8,x8,x9, LSL #0x2
00c056c8	mov w9,#0x62
00c056cc	stp w9,wzr,[x8]
00c056d0	ldr w9,[sp, #0x4]
00c056d4	cmp w9,#0x78
00c056d8	b.ne 0x00c05088
00c056dc	asr x8,x24,#0x3
00c056e0	orr x9,xzr,#-0x5555555555555556
00c056e4	movk x9,#0xaaab
00c056e8	mul x8,x8,x9
00c056ec	mov w9,#0x18
00c056f0	madd x8,x8,x9,x23
00c056f4	ldrb w9,[x8]
00c056f8	ldr x10,[x8, #0x10]
00c056fc	add x8,x8,#0x4
00c05700	tst w9,#0x1
00c05704	ldr x9,[x20]
00c05708	csel x8,x8,x10,eq
00c0570c	ldr w2,[x8]
00c05710	ldr x8,[x9, #0x18]
00c05714	mov x0,x20
00c05718	mov w1,#0x40
00c0571c	blr x8
00c05720	tbz w0,#0x0,0x00c05088
00c05724	ldrb w8,[x19]
00c05728	ldp x10,x9,[x19, #0x8]
00c0572c	lsr x11,x8,#0x1
00c05730	tst w8,#0x1
00c05734	ldr x8,[sp, #0x18]
00c05738	csel x8,x8,x9,eq
00c0573c	csel x9,x11,x10,eq
00c05740	add x8,x8,x9, LSL #0x2
00c05744	mov w9,#0x6d
00c05748	stur w9,[x8, #-0x4]
00c0574c	b 0x00c05088
00c05750	ldp x9,x8,[x19]
00c05754	and x9,x9,#-0x2
00c05758	sub x26,x9,#0x1
00c0575c	cmp x8,x26
00c05760	b.ne 0x00c05788
00c05764	mov x0,x19
00c05768	mov x1,x26
00c0576c	mov w2,#0x1
00c05770	mov x3,x26
00c05774	mov x4,x26
00c05778	mov x5,xzr
00c0577c	mov x6,xzr
00c05780	bl 0x00c43d70
00c05784	mov x8,x26
00c05788	ldr x9,[x19, #0x10]
00c0578c	add x10,x8,#0x1
00c05790	str x10,[x19, #0x8]
00c05794	b 0x00c05918
00c05798	mov x28,x24
00c0579c	cmp x28,x25
00c057a0	b.eq 0x00c05a64
00c057a4	mov x24,x28
00c057a8	cmp w21,#0x1e
00c057ac	b.le 0x00c057e8
00c057b0	cmp w21,#0x3c
00c057b4	b.gt 0x00c05820
00c057b8	cmp w21,#0x1f
00c057bc	b.eq 0x00c05ae4
00c057c0	cmp w21,#0x37
00c057c4	b.eq 0x00c05a9c
00c057c8	cmp w21,#0x3b
00c057cc	b.ne 0x00c05b14
00c057d0	ldrb w9,[x19]
00c057d4	tbnz w9,#0x0,0x00c05dac
00c057d8	cmp w9,#0x8
00c057dc	b.ne 0x00c06230
00c057e0	mov w26,#0x4
00c057e4	b 0x00c05dc0
00c057e8	cmp w21,#0xa
00c057ec	b.le 0x00c058e0
00c057f0	cmp w21,#0xb
00c057f4	b.eq 0x00c05acc
00c057f8	cmp w21,#0xc
00c057fc	b.eq 0x00c05a84
00c05800	cmp w21,#0x17
00c05804	b.ne 0x00c05b14
00c05808	ldrb w9,[x19]
00c0580c	tbnz w9,#0x0,0x00c05d1c
00c05810	cmp w9,#0x8
00c05814	b.ne 0x00c06138
00c05818	mov w26,#0x4
00c0581c	b 0x00c05d30
00c05820	cmp w21,#0x3d
00c05824	b.eq 0x00c05afc
00c05828	cmp w21,#0x16c
00c0582c	b.eq 0x00c05ab4
00c05830	cmp w21,#0x80d
00c05834	b.ne 0x00c05b14
00c05838	ldrb w9,[x19]
00c0583c	tbnz w9,#0x0,0x00c05df4
00c05840	cmp w9,#0x8
00c05844	b.ne 0x00c062ac
00c05848	mov w26,#0x4
00c0584c	b 0x00c05e08
00c05850	ldp x9,x8,[x19]
00c05854	and x9,x9,#-0x2
00c05858	sub x26,x9,#0x1
00c0585c	cmp x8,x26
00c05860	b.ne 0x00c05888
00c05864	mov x0,x19
00c05868	mov x1,x26
00c0586c	mov w2,#0x1
00c05870	mov x3,x26
00c05874	mov x4,x26
00c05878	mov x5,xzr
00c0587c	mov x6,xzr
00c05880	bl 0x00c43d70
00c05884	mov x8,x26
00c05888	ldr x9,[x19, #0x10]
00c0588c	add x10,x8,#0x1
00c05890	str x10,[x19, #0x8]
00c05894	b 0x00c059b4
00c05898	ldp x9,x8,[x19]
00c0589c	and x9,x9,#-0x2
00c058a0	sub x26,x9,#0x1
00c058a4	cmp x8,x26
00c058a8	b.ne 0x00c058d0
00c058ac	mov x0,x19
00c058b0	mov x1,x26
00c058b4	mov w2,#0x1
00c058b8	mov x3,x26
00c058bc	mov x4,x26
00c058c0	mov x5,xzr
00c058c4	mov x6,xzr
00c058c8	bl 0x00c43d70
00c058cc	mov x8,x26
00c058d0	ldr x9,[x19, #0x10]
00c058d4	add x10,x8,#0x1
00c058d8	str x10,[x19, #0x8]
00c058dc	b 0x00c05a30
00c058e0	cmp w21,#0x6
00c058e4	b.eq 0x00c05a6c
00c058e8	cmp w21,#0x7
00c058ec	b.ne 0x00c05b14
00c058f0	ldrb w9,[x19]
00c058f4	tbnz w9,#0x0,0x00c05bfc
00c058f8	cmp w9,#0x8
00c058fc	b.ne 0x00c05f48
00c05900	mov w26,#0x4
00c05904	b 0x00c05c10
00c05908	lsr x8,x9,#0x1
00c0590c	add w9,w9,#0x2
00c05910	strb w9,[x19]
00c05914	ldr x9,[sp, #0x18]
00c05918	lsl x8,x8,#0x2
00c0591c	mov w10,#0x25
00c05920	str x10,[x9, x8#0x0]
00c05924	ldrb w9,[x19]
00c05928	tbnz w9,#0x0,0x00c0593c
00c0592c	cmp w9,#0x8
00c05930	b.ne 0x00c05984
00c05934	mov w26,#0x4
00c05938	b 0x00c05950
00c0593c	ldp x9,x8,[x19]
00c05940	and x9,x9,#-0x2
00c05944	sub x26,x9,#0x1
00c05948	cmp x8,x26
00c0594c	b.ne 0x00c05974
00c05950	mov x0,x19
00c05954	mov x1,x26
00c05958	mov w2,#0x1
00c0595c	mov x3,x26
00c05960	mov x4,x26
00c05964	mov x5,xzr
00c05968	mov x6,xzr
00c0596c	bl 0x00c43d70
00c05970	mov x8,x26
00c05974	ldr x9,[x19, #0x10]
00c05978	add x10,x8,#0x1
00c0597c	str x10,[x19, #0x8]
00c05980	b 0x00c05994
00c05984	lsr x8,x9,#0x1
00c05988	add w9,w9,#0x2
00c0598c	strb w9,[x19]
00c05990	ldr x9,[sp, #0x18]
00c05994	lsl x8,x8,#0x2
00c05998	mov w10,#0x70
00c0599c	str x10,[x9, x8#0x0]
00c059a0	b 0x00c05088
00c059a4	lsr x8,x9,#0x1
00c059a8	add w9,w9,#0x2
00c059ac	strb w9,[x19]
00c059b0	ldr x9,[sp, #0x18]
00c059b4	lsl x8,x8,#0x2
00c059b8	mov w10,#0x25
00c059bc	str x10,[x9, x8#0x0]
00c059c0	ldrb w9,[x19]
00c059c4	tbnz w9,#0x0,0x00c059d8
00c059c8	cmp w9,#0x8
00c059cc	b.ne 0x00c05a40
00c059d0	mov w26,#0x4
00c059d4	b 0x00c059ec
00c059d8	ldp x9,x8,[x19]
00c059dc	and x9,x9,#-0x2
00c059e0	sub x26,x9,#0x1
00c059e4	cmp x8,x26
00c059e8	b.ne 0x00c05a10
00c059ec	mov x0,x19
00c059f0	mov x1,x26
00c059f4	mov w2,#0x1
00c059f8	mov x3,x26
00c059fc	mov x4,x26
00c05a00	mov x5,xzr
00c05a04	mov x6,xzr
00c05a08	bl 0x00c43d70
00c05a0c	mov x8,x26
00c05a10	ldr x9,[x19, #0x10]
00c05a14	add x10,x8,#0x1
00c05a18	str x10,[x19, #0x8]
00c05a1c	b 0x00c05a50
00c05a20	lsr x8,x9,#0x1
00c05a24	add w9,w9,#0x2
00c05a28	strb w9,[x19]
00c05a2c	ldr x9,[sp, #0x18]
00c05a30	add x8,x9,x8, LSL #0x2
00c05a34	add x24,x28,#0x4
00c05a38	stp w21,wzr,[x8]
00c05a3c	b 0x00c0508c
00c05a40	lsr x8,x9,#0x1
00c05a44	add w9,w9,#0x2
00c05a48	strb w9,[x19]
00c05a4c	ldr x9,[sp, #0x18]
00c05a50	lsl x8,x8,#0x2
00c05a54	mov w10,#0x25
00c05a58	add x24,x28,#0x4
00c05a5c	str x10,[x9, x8#0x0]
00c05a60	b 0x00c0508c
00c05a64	mov w8,#0x2
00c05a68	b 0x00c0566c
00c05a6c	ldrb w9,[x19]
00c05a70	tbnz w9,#0x0,0x00c05bb4
00c05a74	cmp w9,#0x8
00c05a78	b.ne 0x00c05ecc
00c05a7c	mov w26,#0x4
00c05a80	b 0x00c05bc8
00c05a84	ldrb w9,[x19]
00c05a88	tbnz w9,#0x0,0x00c05c44
00c05a8c	cmp w9,#0x8
00c05a90	b.ne 0x00c05fc4
00c05a94	mov w26,#0x4
00c05a98	b 0x00c05c58
00c05a9c	ldrb w9,[x19]
00c05aa0	tbnz w9,#0x0,0x00c05c8c
00c05aa4	cmp w9,#0x8
00c05aa8	b.ne 0x00c06040
00c05aac	mov w26,#0x4
00c05ab0	b 0x00c05ca0
00c05ab4	ldrb w9,[x19]
00c05ab8	tbnz w9,#0x0,0x00c05cd4
00c05abc	cmp w9,#0x8
00c05ac0	b.ne 0x00c060bc
00c05ac4	mov w26,#0x4
00c05ac8	b 0x00c05ce8
00c05acc	ldrb w9,[x19]
00c05ad0	tbnz w9,#0x0,0x00c05d64
00c05ad4	cmp w9,#0x8
00c05ad8	b.ne 0x00c061b4
00c05adc	mov w26,#0x4
00c05ae0	b 0x00c05d78
00c05ae4	ldrb w9,[x19]
00c05ae8	tbnz w9,#0x0,0x00c05e3c
00c05aec	cmp w9,#0x8
00c05af0	b.ne 0x00c06328
00c05af4	mov w26,#0x4
00c05af8	b 0x00c05e50
00c05afc	ldrb w9,[x19]
00c05b00	tbnz w9,#0x0,0x00c05e84
00c05b04	cmp w9,#0x8
00c05b08	b.ne 0x00c063a4
00c05b0c	mov w26,#0x4
00c05b10	b 0x00c05e98
00c05b14	ldr x8,[x27, #0x38]
00c05b18	cmp x8,x24
00c05b1c	b.ne 0x00c05b74
00c05b20	b 0x00c0508c
00c05b24	mov w26,#0x4
00c05b28	mov x0,x19
00c05b2c	mov x1,x26
00c05b30	mov w2,#0x1
00c05b34	mov x3,x26
00c05b38	mov x4,x26
00c05b3c	mov x5,xzr
00c05b40	mov x6,xzr
00c05b44	bl 0x00c43d70
00c05b48	ldr x8,[x27, #0x38]
00c05b4c	mov x9,x26
00c05b50	ldr x10,[x19, #0x10]
00c05b54	add x11,x9,#0x1
00c05b58	str x11,[x19, #0x8]
00c05b5c	add x9,x10,x9, LSL #0x2
00c05b60	add x8,x8,#0x4
00c05b64	cmp x8,x24
00c05b68	stp w21,wzr,[x9]
00c05b6c	str x8,[x27, #0x38]
00c05b70	b.eq 0x00c0508c
00c05b74	ldrb w10,[x19]
00c05b78	ldr w21,[x8]
00c05b7c	tbnz w10,#0x0,0x00c05b9c
00c05b80	cmp w10,#0x8
00c05b84	b.eq 0x00c05b24
00c05b88	lsr x9,x10,#0x1
00c05b8c	add w10,w10,#0x2
00c05b90	strb w10,[x19]
00c05b94	ldr x10,[sp, #0x18]
00c05b98	b 0x00c05b5c
00c05b9c	ldp x10,x9,[x19]
00c05ba0	and x10,x10,#-0x2
00c05ba4	sub x26,x10,#0x1
00c05ba8	cmp x9,x26
00c05bac	b.eq 0x00c05b28
00c05bb0	b 0x00c05b50
00c05bb4	ldp x9,x8,[x19]
00c05bb8	and x9,x9,#-0x2
00c05bbc	sub x26,x9,#0x1
00c05bc0	cmp x8,x26
00c05bc4	b.ne 0x00c05bec
00c05bc8	mov x0,x19
00c05bcc	mov x1,x26
00c05bd0	mov w2,#0x1
00c05bd4	mov x3,x26
00c05bd8	mov x4,x26
00c05bdc	mov x5,xzr
00c05be0	mov x6,xzr
00c05be4	bl 0x00c43d70
00c05be8	mov x8,x26
00c05bec	ldr x9,[x19, #0x10]
00c05bf0	add x10,x8,#0x1
00c05bf4	str x10,[x19, #0x8]
00c05bf8	b 0x00c05edc
00c05bfc	ldp x9,x8,[x19]
00c05c00	and x9,x9,#-0x2
00c05c04	sub x26,x9,#0x1
00c05c08	cmp x8,x26
00c05c0c	b.ne 0x00c05c34
00c05c10	mov x0,x19
00c05c14	mov x1,x26
00c05c18	mov w2,#0x1
00c05c1c	mov x3,x26
00c05c20	mov x4,x26
00c05c24	mov x5,xzr
00c05c28	mov x6,xzr
00c05c2c	bl 0x00c43d70
00c05c30	mov x8,x26
00c05c34	ldr x9,[x19, #0x10]
00c05c38	add x10,x8,#0x1
00c05c3c	str x10,[x19, #0x8]
00c05c40	b 0x00c05f58
00c05c44	ldp x9,x8,[x19]
00c05c48	and x9,x9,#-0x2
00c05c4c	sub x26,x9,#0x1
00c05c50	cmp x8,x26
00c05c54	b.ne 0x00c05c7c
00c05c58	mov x0,x19
00c05c5c	mov x1,x26
00c05c60	mov w2,#0x1
00c05c64	mov x3,x26
00c05c68	mov x4,x26
00c05c6c	mov x5,xzr
00c05c70	mov x6,xzr
00c05c74	bl 0x00c43d70
00c05c78	mov x8,x26
00c05c7c	ldr x9,[x19, #0x10]
00c05c80	add x10,x8,#0x1
00c05c84	str x10,[x19, #0x8]
00c05c88	b 0x00c05fd4
00c05c8c	ldp x9,x8,[x19]
00c05c90	and x9,x9,#-0x2
00c05c94	sub x26,x9,#0x1
00c05c98	cmp x8,x26
00c05c9c	b.ne 0x00c05cc4
00c05ca0	mov x0,x19
00c05ca4	mov x1,x26
00c05ca8	mov w2,#0x1
00c05cac	mov x3,x26
00c05cb0	mov x4,x26
00c05cb4	mov x5,xzr
00c05cb8	mov x6,xzr
00c05cbc	bl 0x00c43d70
00c05cc0	mov x8,x26
00c05cc4	ldr x9,[x19, #0x10]
00c05cc8	add x10,x8,#0x1
00c05ccc	str x10,[x19, #0x8]
00c05cd0	b 0x00c06050
00c05cd4	ldp x9,x8,[x19]
00c05cd8	and x9,x9,#-0x2
00c05cdc	sub x26,x9,#0x1
00c05ce0	cmp x8,x26
00c05ce4	b.ne 0x00c05d0c
00c05ce8	mov x0,x19
00c05cec	mov x1,x26
00c05cf0	mov w2,#0x1
00c05cf4	mov x3,x26
00c05cf8	mov x4,x26
00c05cfc	mov x5,xzr
00c05d00	mov x6,xzr
00c05d04	bl 0x00c43d70
00c05d08	mov x8,x26
00c05d0c	ldr x9,[x19, #0x10]
00c05d10	add x10,x8,#0x1
00c05d14	str x10,[x19, #0x8]
00c05d18	b 0x00c060cc
00c05d1c	ldp x9,x8,[x19]
00c05d20	and x9,x9,#-0x2
00c05d24	sub x26,x9,#0x1
00c05d28	cmp x8,x26
00c05d2c	b.ne 0x00c05d54
00c05d30	mov x0,x19
00c05d34	mov x1,x26
00c05d38	mov w2,#0x1
00c05d3c	mov x3,x26
00c05d40	mov x4,x26
00c05d44	mov x5,xzr
00c05d48	mov x6,xzr
00c05d4c	bl 0x00c43d70
00c05d50	mov x8,x26
00c05d54	ldr x9,[x19, #0x10]
00c05d58	add x10,x8,#0x1
00c05d5c	str x10,[x19, #0x8]
00c05d60	b 0x00c06148
00c05d64	ldp x9,x8,[x19]
00c05d68	and x9,x9,#-0x2
00c05d6c	sub x26,x9,#0x1
00c05d70	cmp x8,x26
00c05d74	b.ne 0x00c05d9c
00c05d78	mov x0,x19
00c05d7c	mov x1,x26
00c05d80	mov w2,#0x1
00c05d84	mov x3,x26
00c05d88	mov x4,x26
00c05d8c	mov x5,xzr
00c05d90	mov x6,xzr
00c05d94	bl 0x00c43d70
00c05d98	mov x8,x26
00c05d9c	ldr x9,[x19, #0x10]
00c05da0	add x10,x8,#0x1
00c05da4	str x10,[x19, #0x8]
00c05da8	b 0x00c061c4
00c05dac	ldp x9,x8,[x19]
00c05db0	and x9,x9,#-0x2
00c05db4	sub x26,x9,#0x1
00c05db8	cmp x8,x26
00c05dbc	b.ne 0x00c05de4
00c05dc0	mov x0,x19
00c05dc4	mov x1,x26
00c05dc8	mov w2,#0x1
00c05dcc	mov x3,x26
00c05dd0	mov x4,x26
00c05dd4	mov x5,xzr
00c05dd8	mov x6,xzr
00c05ddc	bl 0x00c43d70
00c05de0	mov x8,x26
00c05de4	ldr x9,[x19, #0x10]
00c05de8	add x10,x8,#0x1
00c05dec	str x10,[x19, #0x8]
00c05df0	b 0x00c06240
00c05df4	ldp x9,x8,[x19]
00c05df8	and x9,x9,#-0x2
00c05dfc	sub x26,x9,#0x1
00c05e00	cmp x8,x26
00c05e04	b.ne 0x00c05e2c
00c05e08	mov x0,x19
00c05e0c	mov x1,x26
00c05e10	mov w2,#0x1
00c05e14	mov x3,x26
00c05e18	mov x4,x26
00c05e1c	mov x5,xzr
00c05e20	mov x6,xzr
00c05e24	bl 0x00c43d70
00c05e28	mov x8,x26
00c05e2c	ldr x9,[x19, #0x10]
00c05e30	add x10,x8,#0x1
00c05e34	str x10,[x19, #0x8]
00c05e38	b 0x00c062bc
00c05e3c	ldp x9,x8,[x19]
00c05e40	and x9,x9,#-0x2
00c05e44	sub x26,x9,#0x1
00c05e48	cmp x8,x26
00c05e4c	b.ne 0x00c05e74
00c05e50	mov x0,x19
00c05e54	mov x1,x26
00c05e58	mov w2,#0x1
00c05e5c	mov x3,x26
00c05e60	mov x4,x26
00c05e64	mov x5,xzr
00c05e68	mov x6,xzr
00c05e6c	bl 0x00c43d70
00c05e70	mov x8,x26
00c05e74	ldr x9,[x19, #0x10]
00c05e78	add x10,x8,#0x1
00c05e7c	str x10,[x19, #0x8]
00c05e80	b 0x00c06338
00c05e84	ldp x9,x8,[x19]
00c05e88	and x9,x9,#-0x2
00c05e8c	sub x26,x9,#0x1
00c05e90	cmp x8,x26
00c05e94	b.ne 0x00c05ebc
00c05e98	mov x0,x19
00c05e9c	mov x1,x26
00c05ea0	mov w2,#0x1
00c05ea4	mov x3,x26
00c05ea8	mov x4,x26
00c05eac	mov x5,xzr
00c05eb0	mov x6,xzr
00c05eb4	bl 0x00c43d70
00c05eb8	mov x8,x26
00c05ebc	ldr x9,[x19, #0x10]
00c05ec0	add x10,x8,#0x1
00c05ec4	str x10,[x19, #0x8]
00c05ec8	b 0x00c063b4
00c05ecc	lsr x8,x9,#0x1
00c05ed0	add w9,w9,#0x2
00c05ed4	strb w9,[x19]
00c05ed8	ldr x9,[sp, #0x18]
00c05edc	lsl x8,x8,#0x2
00c05ee0	mov w10,#0x25
00c05ee4	str x10,[x9, x8#0x0]
00c05ee8	ldrb w9,[x19]
00c05eec	tbnz w9,#0x0,0x00c05f00
00c05ef0	cmp w9,#0x8
00c05ef4	b.ne 0x00c06420
00c05ef8	mov w26,#0x4
00c05efc	b 0x00c05f14
00c05f00	ldp x9,x8,[x19]
00c05f04	and x9,x9,#-0x2
00c05f08	sub x26,x9,#0x1
00c05f0c	cmp x8,x26
00c05f10	b.ne 0x00c05f38
00c05f14	mov x0,x19
00c05f18	mov x1,x26
00c05f1c	mov w2,#0x1
00c05f20	mov x3,x26
00c05f24	mov x4,x26
00c05f28	mov x5,xzr
00c05f2c	mov x6,xzr
00c05f30	bl 0x00c43d70
00c05f34	mov x8,x26
00c05f38	ldr x9,[x19, #0x10]
00c05f3c	add x10,x8,#0x1
00c05f40	str x10,[x19, #0x8]
00c05f44	b 0x00c06430
00c05f48	lsr x8,x9,#0x1
00c05f4c	add w9,w9,#0x2
00c05f50	strb w9,[x19]
00c05f54	ldr x9,[sp, #0x18]
00c05f58	lsl x8,x8,#0x2
00c05f5c	mov w10,#0x25
00c05f60	str x10,[x9, x8#0x0]
00c05f64	ldrb w9,[x19]
00c05f68	tbnz w9,#0x0,0x00c05f7c
00c05f6c	cmp w9,#0x8
00c05f70	b.ne 0x00c06440
00c05f74	mov w26,#0x4
00c05f78	b 0x00c05f90
00c05f7c	ldp x9,x8,[x19]
00c05f80	and x9,x9,#-0x2
00c05f84	sub x26,x9,#0x1
00c05f88	cmp x8,x26
00c05f8c	b.ne 0x00c05fb4
00c05f90	mov x0,x19
00c05f94	mov x1,x26
00c05f98	mov w2,#0x1
00c05f9c	mov x3,x26
00c05fa0	mov x4,x26
00c05fa4	mov x5,xzr
00c05fa8	mov x6,xzr
00c05fac	bl 0x00c43d70
00c05fb0	mov x8,x26
00c05fb4	ldr x9,[x19, #0x10]
00c05fb8	add x10,x8,#0x1
00c05fbc	str x10,[x19, #0x8]
00c05fc0	b 0x00c06450
00c05fc4	lsr x8,x9,#0x1
00c05fc8	add w9,w9,#0x2
00c05fcc	strb w9,[x19]
00c05fd0	ldr x9,[sp, #0x18]
00c05fd4	lsl x8,x8,#0x2
00c05fd8	mov w10,#0x25
00c05fdc	str x10,[x9, x8#0x0]
00c05fe0	ldrb w9,[x19]
00c05fe4	tbnz w9,#0x0,0x00c05ff8
00c05fe8	cmp w9,#0x8
00c05fec	b.ne 0x00c06460
00c05ff0	mov w26,#0x4
00c05ff4	b 0x00c0600c
00c05ff8	ldp x9,x8,[x19]
00c05ffc	and x9,x9,#-0x2
00c06000	sub x26,x9,#0x1
00c06004	cmp x8,x26
00c06008	b.ne 0x00c06030
00c0600c	mov x0,x19
00c06010	mov x1,x26
00c06014	mov w2,#0x1
00c06018	mov x3,x26
00c0601c	mov x4,x26
00c06020	mov x5,xzr
00c06024	mov x6,xzr
00c06028	bl 0x00c43d70
00c0602c	mov x8,x26
00c06030	ldr x9,[x19, #0x10]
00c06034	add x10,x8,#0x1
00c06038	str x10,[x19, #0x8]
00c0603c	b 0x00c06470
00c06040	lsr x8,x9,#0x1
00c06044	add w9,w9,#0x2
00c06048	strb w9,[x19]
00c0604c	ldr x9,[sp, #0x18]
00c06050	lsl x8,x8,#0x2
00c06054	mov w10,#0x25
00c06058	str x10,[x9, x8#0x0]
00c0605c	ldrb w9,[x19]
00c06060	tbnz w9,#0x0,0x00c06074
00c06064	cmp w9,#0x8
00c06068	b.ne 0x00c06480
00c0606c	mov w26,#0x4
00c06070	b 0x00c06088
00c06074	ldp x9,x8,[x19]
00c06078	and x9,x9,#-0x2
00c0607c	sub x26,x9,#0x1
00c06080	cmp x8,x26
00c06084	b.ne 0x00c060ac
00c06088	mov x0,x19
00c0608c	mov x1,x26
00c06090	mov w2,#0x1
00c06094	mov x3,x26
00c06098	mov x4,x26
00c0609c	mov x5,xzr
00c060a0	mov x6,xzr
00c060a4	bl 0x00c43d70
00c060a8	mov x8,x26
00c060ac	ldr x9,[x19, #0x10]
00c060b0	add x10,x8,#0x1
00c060b4	str x10,[x19, #0x8]
00c060b8	b 0x00c06490
00c060bc	lsr x8,x9,#0x1
00c060c0	add w9,w9,#0x2
00c060c4	strb w9,[x19]
00c060c8	ldr x9,[sp, #0x18]
00c060cc	lsl x8,x8,#0x2
00c060d0	mov w10,#0x25
00c060d4	str x10,[x9, x8#0x0]
00c060d8	ldrb w9,[x19]
00c060dc	tbnz w9,#0x0,0x00c060f0
00c060e0	cmp w9,#0x8
00c060e4	b.ne 0x00c064a0
00c060e8	mov w26,#0x4
00c060ec	b 0x00c06104
00c060f0	ldp x9,x8,[x19]
00c060f4	and x9,x9,#-0x2
00c060f8	sub x26,x9,#0x1
00c060fc	cmp x8,x26
00c06100	b.ne 0x00c06128
00c06104	mov x0,x19
00c06108	mov x1,x26
00c0610c	mov w2,#0x1
00c06110	mov x3,x26
00c06114	mov x4,x26
00c06118	mov x5,xzr
00c0611c	mov x6,xzr
00c06120	bl 0x00c43d70
00c06124	mov x8,x26
00c06128	ldr x9,[x19, #0x10]
00c0612c	add x10,x8,#0x1
00c06130	str x10,[x19, #0x8]
00c06134	b 0x00c064b0
00c06138	lsr x8,x9,#0x1
00c0613c	add w9,w9,#0x2
00c06140	strb w9,[x19]
00c06144	ldr x9,[sp, #0x18]
00c06148	lsl x8,x8,#0x2
00c0614c	mov w10,#0x25
00c06150	str x10,[x9, x8#0x0]
00c06154	ldrb w9,[x19]
00c06158	tbnz w9,#0x0,0x00c0616c
00c0615c	cmp w9,#0x8
00c06160	b.ne 0x00c064c0
00c06164	mov w26,#0x4
00c06168	b 0x00c06180
00c0616c	ldp x9,x8,[x19]
00c06170	and x9,x9,#-0x2
00c06174	sub x26,x9,#0x1
00c06178	cmp x8,x26
00c0617c	b.ne 0x00c061a4
00c06180	mov x0,x19
00c06184	mov x1,x26
00c06188	mov w2,#0x1
00c0618c	mov x3,x26
00c06190	mov x4,x26
00c06194	mov x5,xzr
00c06198	mov x6,xzr
00c0619c	bl 0x00c43d70
00c061a0	mov x8,x26
00c061a4	ldr x9,[x19, #0x10]
00c061a8	add x10,x8,#0x1
00c061ac	str x10,[x19, #0x8]
00c061b0	b 0x00c064d0
00c061b4	lsr x8,x9,#0x1
00c061b8	add w9,w9,#0x2
00c061bc	strb w9,[x19]
00c061c0	ldr x9,[sp, #0x18]
00c061c4	lsl x8,x8,#0x2
00c061c8	mov w10,#0x25
00c061cc	str x10,[x9, x8#0x0]
00c061d0	ldrb w9,[x19]
00c061d4	tbnz w9,#0x0,0x00c061e8
00c061d8	cmp w9,#0x8
00c061dc	b.ne 0x00c064e0
00c061e0	mov w26,#0x4
00c061e4	b 0x00c061fc
00c061e8	ldp x9,x8,[x19]
00c061ec	and x9,x9,#-0x2
00c061f0	sub x26,x9,#0x1
00c061f4	cmp x8,x26
00c061f8	b.ne 0x00c06220
00c061fc	mov x0,x19
00c06200	mov x1,x26
00c06204	mov w2,#0x1
00c06208	mov x3,x26
00c0620c	mov x4,x26
00c06210	mov x5,xzr
00c06214	mov x6,xzr
00c06218	bl 0x00c43d70
00c0621c	mov x8,x26
00c06220	ldr x9,[x19, #0x10]
00c06224	add x10,x8,#0x1
00c06228	str x10,[x19, #0x8]
00c0622c	b 0x00c064f0
00c06230	lsr x8,x9,#0x1
00c06234	add w9,w9,#0x2
00c06238	strb w9,[x19]
00c0623c	ldr x9,[sp, #0x18]
00c06240	lsl x8,x8,#0x2
00c06244	mov w10,#0x25
00c06248	str x10,[x9, x8#0x0]
00c0624c	ldrb w9,[x19]
00c06250	tbnz w9,#0x0,0x00c06264
00c06254	cmp w9,#0x8
00c06258	b.ne 0x00c06500
00c0625c	mov w26,#0x4
00c06260	b 0x00c06278
00c06264	ldp x9,x8,[x19]
00c06268	and x9,x9,#-0x2
00c0626c	sub x26,x9,#0x1
00c06270	cmp x8,x26
00c06274	b.ne 0x00c0629c
00c06278	mov x0,x19
00c0627c	mov x1,x26
00c06280	mov w2,#0x1
00c06284	mov x3,x26
00c06288	mov x4,x26
00c0628c	mov x5,xzr
00c06290	mov x6,xzr
00c06294	bl 0x00c43d70
00c06298	mov x8,x26
00c0629c	ldr x9,[x19, #0x10]
00c062a0	add x10,x8,#0x1
00c062a4	str x10,[x19, #0x8]
00c062a8	b 0x00c06510
00c062ac	lsr x8,x9,#0x1
00c062b0	add w9,w9,#0x2
00c062b4	strb w9,[x19]
00c062b8	ldr x9,[sp, #0x18]
00c062bc	lsl x8,x8,#0x2
00c062c0	mov w10,#0x25
00c062c4	str x10,[x9, x8#0x0]
00c062c8	ldrb w9,[x19]
00c062cc	tbnz w9,#0x0,0x00c062e0
00c062d0	cmp w9,#0x8
00c062d4	b.ne 0x00c06520
00c062d8	mov w26,#0x4
00c062dc	b 0x00c062f4
00c062e0	ldp x9,x8,[x19]
00c062e4	and x9,x9,#-0x2
00c062e8	sub x26,x9,#0x1
00c062ec	cmp x8,x26
00c062f0	b.ne 0x00c06318
00c062f4	mov x0,x19
00c062f8	mov x1,x26
00c062fc	mov w2,#0x1
00c06300	mov x3,x26
00c06304	mov x4,x26
00c06308	mov x5,xzr
00c0630c	mov x6,xzr
00c06310	bl 0x00c43d70
00c06314	mov x8,x26
00c06318	ldr x9,[x19, #0x10]
00c0631c	add x10,x8,#0x1
00c06320	str x10,[x19, #0x8]
00c06324	b 0x00c06530
00c06328	lsr x8,x9,#0x1
00c0632c	add w9,w9,#0x2
00c06330	strb w9,[x19]
00c06334	ldr x9,[sp, #0x18]
00c06338	lsl x8,x8,#0x2
00c0633c	mov w10,#0x25
00c06340	str x10,[x9, x8#0x0]
00c06344	ldrb w9,[x19]
00c06348	tbnz w9,#0x0,0x00c0635c
00c0634c	cmp w9,#0x8
00c06350	b.ne 0x00c06540
00c06354	mov w26,#0x4
00c06358	b 0x00c06370
00c0635c	ldp x9,x8,[x19]
00c06360	and x9,x9,#-0x2
00c06364	sub x26,x9,#0x1
00c06368	cmp x8,x26
00c0636c	b.ne 0x00c06394
00c06370	mov x0,x19
00c06374	mov x1,x26
00c06378	mov w2,#0x1
00c0637c	mov x3,x26
00c06380	mov x4,x26
00c06384	mov x5,xzr
00c06388	mov x6,xzr
00c0638c	bl 0x00c43d70
00c06390	mov x8,x26
00c06394	ldr x9,[x19, #0x10]
00c06398	add x10,x8,#0x1
00c0639c	str x10,[x19, #0x8]
00c063a0	b 0x00c06550
00c063a4	lsr x8,x9,#0x1
00c063a8	add w9,w9,#0x2
00c063ac	strb w9,[x19]
00c063b0	ldr x9,[sp, #0x18]
00c063b4	lsl x8,x8,#0x2
00c063b8	mov w10,#0x25
00c063bc	str x10,[x9, x8#0x0]
00c063c0	ldrb w9,[x19]
00c063c4	tbnz w9,#0x0,0x00c063d8
00c063c8	cmp w9,#0x8
00c063cc	b.ne 0x00c06560
00c063d0	mov w26,#0x4
00c063d4	b 0x00c063ec
00c063d8	ldp x9,x8,[x19]
00c063dc	and x9,x9,#-0x2
00c063e0	sub x26,x9,#0x1
00c063e4	cmp x8,x26
00c063e8	b.ne 0x00c06410
00c063ec	mov x0,x19
00c063f0	mov x1,x26
00c063f4	mov w2,#0x1
00c063f8	mov x3,x26
00c063fc	mov x4,x26
00c06400	mov x5,xzr
00c06404	mov x6,xzr
00c06408	bl 0x00c43d70
00c0640c	mov x8,x26
00c06410	ldr x9,[x19, #0x10]
00c06414	add x10,x8,#0x1
00c06418	str x10,[x19, #0x8]
00c0641c	b 0x00c06570
00c06420	lsr x8,x9,#0x1
00c06424	add w9,w9,#0x2
00c06428	strb w9,[x19]
00c0642c	ldr x9,[sp, #0x18]
00c06430	lsl x8,x8,#0x2
00c06434	mov w10,#0x77
00c06438	str x10,[x9, x8#0x0]
00c0643c	b 0x00c0508c
00c06440	lsr x8,x9,#0x1
00c06444	add w9,w9,#0x2
00c06448	strb w9,[x19]
00c0644c	ldr x9,[sp, #0x18]
00c06450	lsl x8,x8,#0x2
00c06454	mov w10,#0x75
00c06458	str x10,[x9, x8#0x0]
00c0645c	b 0x00c0508c
00c06460	lsr x8,x9,#0x1
00c06464	add w9,w9,#0x2
00c06468	strb w9,[x19]
00c0646c	ldr x9,[sp, #0x18]
00c06470	lsl x8,x8,#0x2
00c06474	mov w10,#0x6d
00c06478	str x10,[x9, x8#0x0]
00c0647c	b 0x00c0508c
00c06480	lsr x8,x9,#0x1
00c06484	add w9,w9,#0x2
00c06488	strb w9,[x19]
00c0648c	ldr x9,[sp, #0x18]
00c06490	lsl x8,x8,#0x2
00c06494	mov w10,#0x4d
00c06498	str x10,[x9, x8#0x0]
00c0649c	b 0x00c0508c
00c064a0	lsr x8,x9,#0x1
00c064a4	add w9,w9,#0x2
00c064a8	strb w9,[x19]
00c064ac	ldr x9,[sp, #0x18]
00c064b0	lsl x8,x8,#0x2
00c064b4	mov w10,#0x6a
00c064b8	str x10,[x9, x8#0x0]
00c064bc	b 0x00c0508c
00c064c0	lsr x8,x9,#0x1
00c064c4	add w9,w9,#0x2
00c064c8	strb w9,[x19]
00c064cc	ldr x9,[sp, #0x18]
00c064d0	lsl x8,x8,#0x2
00c064d4	mov w10,#0x48
00c064d8	str x10,[x9, x8#0x0]
00c064dc	b 0x00c0508c
00c064e0	lsr x8,x9,#0x1
00c064e4	add w9,w9,#0x2
00c064e8	strb w9,[x19]
00c064ec	ldr x9,[sp, #0x18]
00c064f0	lsl x8,x8,#0x2
00c064f4	mov w10,#0x49
00c064f8	str x10,[x9, x8#0x0]
00c064fc	b 0x00c0508c
00c06500	lsr x8,x9,#0x1
00c06504	add w9,w9,#0x2
00c06508	strb w9,[x19]
00c0650c	ldr x9,[sp, #0x18]
00c06510	lsl x8,x8,#0x2
00c06514	mov w10,#0x53
00c06518	str x10,[x9, x8#0x0]
00c0651c	b 0x00c0508c
00c06520	lsr x8,x9,#0x1
00c06524	add w9,w9,#0x2
00c06528	strb w9,[x19]
00c0652c	ldr x9,[sp, #0x18]
00c06530	lsl x8,x8,#0x2
00c06534	mov w10,#0x59
00c06538	str x10,[x9, x8#0x0]
00c0653c	b 0x00c0508c
00c06540	lsr x8,x9,#0x1
00c06544	add w9,w9,#0x2
00c06548	strb w9,[x19]
00c0654c	ldr x9,[sp, #0x18]
00c06550	lsl x8,x8,#0x2
00c06554	mov w10,#0x64
00c06558	str x10,[x9, x8#0x0]
00c0655c	b 0x00c0508c
00c06560	lsr x8,x9,#0x1
00c06564	add w9,w9,#0x2
00c06568	strb w9,[x19]
00c0656c	ldr x9,[sp, #0x18]
00c06570	lsl x8,x8,#0x2
00c06574	mov w10,#0x79
00c06578	str x10,[x9, x8#0x0]
00c0657c	b 0x00c0508c
00c06580	add sp,sp,#0x280
00c06584	ldp x20,x19,[sp, #0x50]
00c06588	ldp x22,x21,[sp, #0x40]
00c0658c	ldp x24,x23,[sp, #0x30]
00c06590	ldp x26,x25,[sp, #0x20]
00c06594	ldp x28,x27,[sp, #0x10]
00c06598	ldp x29,x30,[sp], #0x60
00c0659c	autiasp
00c065a0	ret
00c065a4	adrp x0,0x29f000
00c065a8	add x0,x0,#0x109
00c065ac	bl 0x00c43d00
00c065b0	b 0x00c065d8
00c065d8	mov x20,x0
00c065dc	mov x0,x19
00c065e0	bl 0x00c43d50
00c065e4	mov x0,x20
00c065e8	bl 0x00c2c090
