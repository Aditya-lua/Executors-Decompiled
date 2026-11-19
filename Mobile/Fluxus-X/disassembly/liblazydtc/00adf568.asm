; ossl_sha1_ctrl @ 00adf568
00adf568	sub sp,sp,#0x80
00adf56c	cmp w1,#0x1d
00adf570	stp x24,x23,[sp, #0x40]
00adf574	stp x22,x21,[sp, #0x50]
00adf578	stp x20,x19,[sp, #0x60]
00adf57c	stp x29,x30,[sp, #0x70]
00adf580	add x29,sp,#0x70
00adf584	b.ne 0x00adf678
00adf588	mov x19,x0
00adf58c	cbz x0,0x00adf680
00adf590	cmp w2,#0x30
00adf594	mov w0,wzr
00adf598	b.ne 0x00adf904
00adf59c	orr w2,wzr,#0x30
00adf5a0	mov x0,x19
00adf5a4	mov x1,x3
00adf5a8	mov x20,x3
00adf5ac	bl 0x00ade07c
00adf5b0	mov x8,#0x3636
00adf5b4	movk x8,#0x3636, LSL #16
00adf5b8	movk x8,#0x3636, LSL #32
00adf5bc	movk x8,#0x3636, LSL #48
00adf5c0	stp x8,x8,[sp, #0x30]
00adf5c4	stp x8,x8,[sp, #0x20]
00adf5c8	str x8,[sp, #0x18]
00adf5cc	mov x21,x19
00adf5d0	ldr w9,[x21, #0x14]!
00adf5d4	ldr w8,[x21, #0x4]
00adf5d8	cmn w9,#0x140
00adf5dc	add w10,w9,#0x140
00adf5e0	b.cc 0x00adf5ec
00adf5e4	add w8,w8,#0x1
00adf5e8	str w8,[x19, #0x18]
00adf5ec	ldr w9,[x19, #0x5c]
00adf5f0	add x22,x19,#0x1c
00adf5f4	stp w10,w8,[x19, #0x14]
00adf5f8	cbz w9,0x00adf688
00adf5fc	add x8,x9,#0x28
00adf600	cmp x8,#0x3f
00adf604	add x0,x22,x9
00adf608	b.ls 0x00adf6a8
00adf60c	mov w8,#0x40
00adf610	sub x24,x8,x9
00adf614	add x1,sp,#0x18
00adf618	mov x2,x24
00adf61c	add x23,sp,#0x18
00adf620	bl 0x00c2ffd0
00adf624	mov w2,#0x1
00adf628	mov x0,x19
00adf62c	mov x1,x22
00adf630	bl 0x00ade188
00adf634	mov w8,#0x28
00adf638	mov w2,#0x44
00adf63c	mov x0,x22
00adf640	mov w1,wzr
00adf644	add x23,x23,x24
00adf648	sub x24,x8,x24
00adf64c	bl 0x00c301c0
00adf650	lsr x2,x24,#0x6
00adf654	cbz x2,0x00adf670
00adf658	mov x0,x19
00adf65c	mov x1,x23
00adf660	bl 0x00ade188
00adf664	and x8,x24,#-0x40
00adf668	add x23,x23,x8
00adf66c	sub x24,x24,x8
00adf670	cbnz x24,0x00adf690
00adf674	b 0x00adf6cc
00adf678	orr w0,wzr,#0xfffffffe
00adf67c	b 0x00adf904
00adf680	mov w0,wzr
00adf684	b 0x00adf904
00adf688	add x23,sp,#0x18
00adf68c	mov w24,#0x28
00adf690	mov x0,x22
00adf694	mov x1,x23
00adf698	mov x2,x24
00adf69c	str w24,[x19, #0x5c]
00adf6a0	bl 0x00c2ffd0
00adf6a4	b 0x00adf6cc
00adf6a8	ldr x8,[sp, #0x38]
00adf6ac	str x8,[x0, #0x20]
00adf6b0	ldur q0,[sp, #0x28]
00adf6b4	str q0,[x0, #0x10]
00adf6b8	ldur q0,[sp, #0x18]
00adf6bc	str q0,[x0]
00adf6c0	ldr w8,[x19, #0x5c]
00adf6c4	add w8,w8,#0x28
00adf6c8	str w8,[x19, #0x5c]
00adf6cc	add x0,sp,#0x4
00adf6d0	mov x1,x19
00adf6d4	bl 0x00adf3a0
00adf6d8	mov w2,#0x4c
00adf6dc	mov x0,x21
00adf6e0	mov w1,wzr
00adf6e4	bl 0x00c301c0
00adf6e8	adrp x8,0x29c000
00adf6ec	ldr q0,[x8, #0x2e0]
00adf6f0	mov w8,#0xe1f0
00adf6f4	movk w8,#0xc3d2, LSL #16
00adf6f8	orr w2,wzr,#0x30
00adf6fc	mov x0,x19
00adf700	mov x1,x20
00adf704	str q0,[x19]
00adf708	str w8,[x19, #0x10]
00adf70c	bl 0x00ade07c
00adf710	mov x8,#0x5c5c
00adf714	movk x8,#0x5c5c, LSL #16
00adf718	movk x8,#0x5c5c, LSL #32
00adf71c	movk x8,#0x5c5c, LSL #48
00adf720	stp x8,x8,[sp, #0x30]
00adf724	stp x8,x8,[sp, #0x20]
00adf728	str x8,[sp, #0x18]
00adf72c	ldp w8,w9,[x19, #0x14]
00adf730	cmn w8,#0x140
00adf734	add w10,w8,#0x140
00adf738	b.cc 0x00adf744
00adf73c	add w9,w9,#0x1
00adf740	str w9,[x19, #0x18]
00adf744	ldr w8,[x19, #0x5c]
00adf748	add x20,x19,#0x1c
00adf74c	stp w10,w9,[x19, #0x14]
00adf750	cbz w8,0x00adf7d0
00adf754	add x9,x8,#0x28
00adf758	cmp x9,#0x3f
00adf75c	add x0,x20,x8
00adf760	b.ls 0x00adf7f0
00adf764	mov w9,#0x40
00adf768	sub x22,x9,x8
00adf76c	add x1,sp,#0x18
00adf770	mov x2,x22
00adf774	add x21,sp,#0x18
00adf778	bl 0x00c2ffd0
00adf77c	mov w2,#0x1
00adf780	mov x0,x19
00adf784	mov x1,x20
00adf788	bl 0x00ade188
00adf78c	mov w8,#0x28
00adf790	mov w2,#0x44
00adf794	mov x0,x20
00adf798	mov w1,wzr
00adf79c	add x21,x21,x22
00adf7a0	sub x22,x8,x22
00adf7a4	bl 0x00c301c0
00adf7a8	lsr x2,x22,#0x6
00adf7ac	cbz x2,0x00adf7c8
00adf7b0	mov x0,x19
00adf7b4	mov x1,x21
00adf7b8	bl 0x00ade188
00adf7bc	and x8,x22,#-0x40
00adf7c0	add x21,x21,x8
00adf7c4	sub x22,x22,x8
00adf7c8	cbnz x22,0x00adf7d8
00adf7cc	b 0x00adf814
00adf7d0	add x21,sp,#0x18
00adf7d4	mov w22,#0x28
00adf7d8	mov x0,x20
00adf7dc	mov x1,x21
00adf7e0	mov x2,x22
00adf7e4	str w22,[x19, #0x5c]
00adf7e8	bl 0x00c2ffd0
00adf7ec	b 0x00adf814
00adf7f0	ldr x8,[sp, #0x38]
00adf7f4	str x8,[x0, #0x20]
00adf7f8	ldur q0,[sp, #0x28]
00adf7fc	str q0,[x0, #0x10]
00adf800	ldur q0,[sp, #0x18]
00adf804	str q0,[x0]
00adf808	ldr w8,[x19, #0x5c]
00adf80c	add w8,w8,#0x28
00adf810	str w8,[x19, #0x5c]
00adf814	ldp w8,w9,[x19, #0x14]
00adf818	cmn w8,#0xa0
00adf81c	add w10,w8,#0xa0
00adf820	b.cc 0x00adf82c
00adf824	add w9,w9,#0x1
00adf828	str w9,[x19, #0x18]
00adf82c	ldr w8,[x19, #0x5c]
00adf830	add x20,x19,#0x1c
00adf834	stp w10,w9,[x19, #0x14]
00adf838	cbz w8,0x00adf8b8
00adf83c	add x9,x8,#0x14
00adf840	cmp x9,#0x3f
00adf844	add x0,x20,x8
00adf848	b.ls 0x00adf8d8
00adf84c	mov w9,#0x40
00adf850	sub x22,x9,x8
00adf854	add x1,sp,#0x4
00adf858	mov x2,x22
00adf85c	add x21,sp,#0x4
00adf860	bl 0x00c2ffd0
00adf864	mov w2,#0x1
00adf868	mov x0,x19
00adf86c	mov x1,x20
00adf870	bl 0x00ade188
00adf874	mov w8,#0x14
00adf878	mov w2,#0x44
00adf87c	mov x0,x20
00adf880	mov w1,wzr
00adf884	add x21,x21,x22
00adf888	sub x22,x8,x22
00adf88c	bl 0x00c301c0
00adf890	lsr x2,x22,#0x6
00adf894	cbz x2,0x00adf8b0
00adf898	mov x0,x19
00adf89c	mov x1,x21
00adf8a0	bl 0x00ade188
00adf8a4	and x8,x22,#-0x40
00adf8a8	add x21,x21,x8
00adf8ac	sub x22,x22,x8
00adf8b0	cbnz x22,0x00adf8c0
00adf8b4	b 0x00adf8f4
00adf8b8	add x21,sp,#0x4
00adf8bc	mov w22,#0x14
00adf8c0	mov x0,x20
00adf8c4	mov x1,x21
00adf8c8	mov x2,x22
00adf8cc	str w22,[x19, #0x5c]
00adf8d0	bl 0x00c2ffd0
00adf8d4	b 0x00adf8f4
00adf8d8	ldr w8,[sp, #0x14]
00adf8dc	str w8,[x0, #0x10]
00adf8e0	ldur q0,[sp, #0x4]
00adf8e4	str q0,[x0]
00adf8e8	ldr w8,[x19, #0x5c]
00adf8ec	add w8,w8,#0x14
00adf8f0	str w8,[x19, #0x5c]
00adf8f4	add x0,sp,#0x4
00adf8f8	mov w1,#0x14
00adf8fc	bl 0x00c34750
00adf900	mov w0,#0x1
00adf904	ldp x29,x30,[sp, #0x70]
00adf908	ldp x20,x19,[sp, #0x60]
00adf90c	ldp x22,x21,[sp, #0x50]
00adf910	ldp x24,x23,[sp, #0x40]
00adf914	add sp,sp,#0x80
00adf918	ret
