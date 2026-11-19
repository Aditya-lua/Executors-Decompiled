; FUN_008fe638 @ 008fe638
008fe638	sub sp,sp,#0xd0
008fe63c	stp x28,x27,[sp, #0x70]
008fe640	stp x26,x25,[sp, #0x80]
008fe644	stp x24,x23,[sp, #0x90]
008fe648	stp x22,x21,[sp, #0xa0]
008fe64c	stp x20,x19,[sp, #0xb0]
008fe650	stp x29,x30,[sp, #0xc0]
008fe654	add x29,sp,#0xc0
008fe658	mrs x23,tpidr_el0
008fe65c	ldr x8,[x23, #0x28]
008fe660	mov x19,x0
008fe664	stur x8,[x29, #-0x58]
008fe668	bl 0x00c30180
008fe66c	ldr x1,[x19]
008fe670	str xzr,[x19]
008fe674	ldr w0,[x0]
008fe678	bl 0x00c30190
008fe67c	ldr x20,[x19, #0x8]
008fe680	add x8,x20,#0x20
008fe684	ldar w8,[x8]
008fe688	cbz w8,0x008fe968
008fe68c	adrp x8,0x29c000
008fe690	ldr q0,[x8, #0xf10]
008fe694	mov w26,#0x4240
008fe698	add x21,x20,#0xa8
008fe69c	add x22,x20,#0xd0
008fe6a0	add x24,x20,#0x30
008fe6a4	mov w25,#0x1
008fe6a8	movk w26,#0xf, LSL #16
008fe6ac	add x27,sp,#0x30
008fe6b0	mov w28,#0x1
008fe6b4	str q0,[sp]
008fe6b8	add x8,x20,#0x20
008fe6bc	ldar w8,[x8]
008fe6c0	cmp w8,#0x2
008fe6c4	b.ne 0x008fe6d0
008fe6c8	bl 0x00c31950
008fe6cc	b 0x008fe6b8
008fe6d0	str xzr,[sp, #0x50]
008fe6d4	str x21,[sp, #0x20]
008fe6d8	strb w25,[sp, #0x28]
008fe6dc	mov x0,x21
008fe6e0	bl 0x00c2ff10
008fe6e4	ldr x25,[x20, #0x18]
008fe6e8	bl 0x00c31900
008fe6ec	madd x8,x25,x26,x0
008fe6f0	str x8,[sp, #0x18]
008fe6f4	add x25,x20,#0x20
008fe6f8	ldar w8,[x25]
008fe6fc	cbz w8,0x008fe728
008fe700	ldr x8,[x20, #0xa0]
008fe704	cbnz x8,0x008fe728
008fe708	add x1,sp,#0x20
008fe70c	add x2,sp,#0x18
008fe710	mov x0,x22
008fe714	bl 0x008fea6c
008fe718	cmp w0,#0x1
008fe71c	b.ne 0x008fe6f4
008fe720	add x8,x20,#0x20
008fe724	ldar wzr,[x8]
008fe728	ldar w8,[x25]
008fe72c	cbz w8,0x008fe7b4
008fe730	ldr x8,[x20, #0xa0]
008fe734	cbz x8,0x008fe790
008fe738	tbnz w28,#0x0,0x008fe74c
008fe73c	ldaxr x8,[x24]
008fe740	sub x8,x8,#0x1
008fe744	stlxr w9,x8,[x24]
008fe748	cbnz w9,0x008fe73c
008fe74c	ldr x8,[x20, #0x98]
008fe750	ldr x9,[x20, #0x80]
008fe754	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008fe758	movk x10,#0xc0c1
008fe75c	umulh x10,x8,x10
008fe760	ldr x0,[sp, #0x50]
008fe764	lsr x10,x10,#0x6
008fe768	ldr x26,[x9, x10, LSL #0x3]
008fe76c	mov w9,#0x55
008fe770	msub x25,x10,x9,x8
008fe774	cmp x27,x0
008fe778	str xzr,[sp, #0x50]
008fe77c	b.eq 0x008fe7c4
008fe780	cbz x0,0x008fe7d0
008fe784	ldr x8,[x0]
008fe788	ldr x8,[x8, #0x28]
008fe78c	b 0x008fe7cc
008fe790	add x8,x20,#0x28
008fe794	ldar x8,[x8]
008fe798	ldr x9,[x20, #0x8]
008fe79c	cmp x8,x9
008fe7a0	b.ls 0x008fe800
008fe7a4	bl 0x00c31940
008fe7a8	mov x1,x0
008fe7ac	mov x0,x20
008fe7b0	bl 0x00c318b0
008fe7b4	mov w26,#0x1
008fe7b8	ldrb w8,[sp, #0x28]
008fe7bc	cbnz w8,0x008fe8cc
008fe7c0	b 0x008fe8d4
008fe7c4	ldr x8,[x0]
008fe7c8	ldr x8,[x8, #0x20]
008fe7cc	blr x8
008fe7d0	orr w12,wzr,#0x30
008fe7d4	madd x8,x25,x12,x26
008fe7d8	ldr x9,[x8, #0x20]!
008fe7dc	cbz x9,0x008fe7f8
008fe7e0	madd x10,x25,x12,x26
008fe7e4	cmp x10,x9
008fe7e8	b.eq 0x008fe810
008fe7ec	str x9,[sp, #0x50]
008fe7f0	str xzr,[x8]
008fe7f4	b 0x008fe82c
008fe7f8	str xzr,[sp, #0x50]
008fe7fc	b 0x008fe82c
008fe800	mov w26,#0x2
008fe804	ldrb w8,[sp, #0x28]
008fe808	cbnz w8,0x008fe8cc
008fe80c	b 0x008fe8d4
008fe810	str x27,[sp, #0x50]
008fe814	ldr x0,[x8]
008fe818	ldr x8,[x0]
008fe81c	ldr x8,[x8, #0x18]
008fe820	add x1,sp,#0x30
008fe824	blr x8
008fe828	orr w12,wzr,#0x30
008fe82c	ldr x8,[x20, #0x98]
008fe830	ldr x9,[x20, #0x80]
008fe834	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008fe838	movk x10,#0xc0c1
008fe83c	umulh x10,x8,x10
008fe840	lsr x10,x10,#0x6
008fe844	ldr x9,[x9, x10, LSL #0x3]
008fe848	mov w11,#0x55
008fe84c	msub x8,x10,x11,x8
008fe850	madd x8,x8,x12,x9
008fe854	ldr x0,[x8, #0x20]
008fe858	cmp x8,x0
008fe85c	b.eq 0x008fe870
008fe860	cbz x0,0x008fe87c
008fe864	ldr x8,[x0]
008fe868	ldr x8,[x8, #0x28]
008fe86c	b 0x008fe878
008fe870	ldr x8,[x0]
008fe874	ldr x8,[x8, #0x20]
008fe878	blr x8
008fe87c	ldur q0,[x20, #0x98]
008fe880	ldr q1,[sp]
008fe884	mov w26,wzr
008fe888	add v0.2D,v0.2D,v1.2D
008fe88c	fmov x8,d0
008fe890	cmp x8,#0xaa
008fe894	stur q0,[x20, #0x98]
008fe898	b.cc 0x008fe8c4
008fe89c	ldr x8,[x20, #0x80]
008fe8a0	ldr x0,[x8]
008fe8a4	bl 0x00c301d0
008fe8a8	ldr x8,[x20, #0x80]
008fe8ac	ldr x9,[x20, #0x98]
008fe8b0	mov w26,wzr
008fe8b4	add x8,x8,#0x8
008fe8b8	sub x9,x9,#0x55
008fe8bc	str x8,[x20, #0x80]
008fe8c0	str x9,[x20, #0x98]
008fe8c4	ldrb w8,[sp, #0x28]
008fe8c8	cbz w8,0x008fe8d4
008fe8cc	ldr x0,[sp, #0x20]
008fe8d0	bl 0x00c2ff20
008fe8d4	cbnz w26,0x008fe904
008fe8d8	ldr x0,[sp, #0x50]
008fe8dc	cbz x0,0x008fe924
008fe8e0	ldr x8,[x0]
008fe8e4	ldr x8,[x8, #0x30]
008fe8e8	blr x8
008fe8ec	ldaxr x8,[x24]
008fe8f0	add x8,x8,#0x1
008fe8f4	stlxr w9,x8,[x24]
008fe8f8	cbnz w9,0x008fe8ec
008fe8fc	mov w26,wzr
008fe900	mov w28,wzr
008fe904	ldr x8,[sp, #0x50]
008fe908	mov x0,x8
008fe90c	cmp x27,x8
008fe910	b.eq 0x008fe934
008fe914	cbz x0,0x008fe940
008fe918	ldr x8,[x0]
008fe91c	ldr x8,[x8, #0x28]
008fe920	b 0x008fe93c
008fe924	mov x8,xzr
008fe928	mov w26,wzr
008fe92c	cmp x27,x8
008fe930	b.ne 0x008fe914
008fe934	ldr x8,[x0]
008fe938	ldr x8,[x8, #0x20]
008fe93c	blr x8
008fe940	orr w8,w26,#0x2
008fe944	mov w26,#0x4240
008fe948	cmp w8,#0x2
008fe94c	mov w25,#0x1
008fe950	movk w26,#0xf, LSL #16
008fe954	b.ne 0x008fe964
008fe958	add x8,x20,#0x20
008fe95c	ldar w8,[x8]
008fe960	cbnz w8,0x008fe6b8
008fe964	cbz x19,0x008fe98c
008fe968	ldr x20,[x19]
008fe96c	str xzr,[x19]
008fe970	cbz x20,0x008fe984
008fe974	mov x0,x20
008fe978	bl 0x00c301a0
008fe97c	mov x0,x20
008fe980	bl 0x00c301d0
008fe984	mov x0,x19
008fe988	bl 0x00c301d0
008fe98c	ldr x8,[x23, #0x28]
008fe990	ldur x9,[x29, #-0x58]
008fe994	cmp x8,x9
008fe998	b.ne 0x008fe9c0
008fe99c	ldp x29,x30,[sp, #0xc0]
008fe9a0	ldp x20,x19,[sp, #0xb0]
008fe9a4	ldp x22,x21,[sp, #0xa0]
008fe9a8	ldp x24,x23,[sp, #0x90]
008fe9ac	ldp x26,x25,[sp, #0x80]
008fe9b0	ldp x28,x27,[sp, #0x70]
008fe9b4	mov x0,xzr
008fe9b8	add sp,sp,#0xd0
008fe9bc	ret
008fe9c0	bl 0x00c2fec0
