; FUN_00a4761c @ 00a4761c
00a4761c	sub sp,sp,#0x150
00a47620	stp x20,x19,[sp, #0x130]
00a47624	mov x20,x0
00a47628	add x0,sp,#0x40
00a4762c	stp x28,x25,[sp, #0x100]
00a47630	stp x24,x23,[sp, #0x110]
00a47634	stp x22,x21,[sp, #0x120]
00a47638	stp x29,x30,[sp, #0x140]
00a4763c	add x29,sp,#0x140
00a47640	mov w19,w2
00a47644	mov x22,x1
00a47648	bl 0x00c3a4d0
00a4764c	add x1,x22,#0x40
00a47650	sub x0,x29,#0x80
00a47654	bl 0x00c3a4d0
00a47658	ldp x8,x10,[sp, #0x40]
00a4765c	ldp x9,x11,[x29, #-0x80]
00a47660	ldp x12,x14,[sp, #0x50]
00a47664	ldp x13,x15,[x29, #-0x70]
00a47668	ldp x16,x18,[sp, #0x60]
00a4766c	add x8,x9,x8
00a47670	add x10,x11,x10
00a47674	add x12,x13,x12
00a47678	ldp x9,x13,[sp, #0x70]
00a4767c	add x14,x15,x14
00a47680	ldp x11,x15,[x29, #-0x50]
00a47684	ldp x17,x0,[x29, #-0x60]
00a47688	mov x21,x20
00a4768c	add x9,x11,x9
00a47690	add x11,x15,x13
00a47694	add x16,x17,x16
00a47698	add x17,x0,x18
00a4769c	lsr x13,x11,#0x38
00a476a0	and x11,x11,#0xffffffffffffff
00a476a4	and x15,x9,#0xffffffffffffff
00a476a8	and x18,x17,#0xffffffffffffff
00a476ac	and x0,x14,#0xffffffffffffff
00a476b0	add x9,x11,x9, LSR #0x38
00a476b4	and x11,x12,#0xffffffffffffff
00a476b8	add x15,x15,x17, LSR #0x38
00a476bc	add x16,x13,x16
00a476c0	and x17,x10,#0xffffffffffffff
00a476c4	add x12,x0,x12, LSR #0x38
00a476c8	and x0,x8,#0xffffffffffffff
00a476cc	add x10,x11,x10, LSR #0x38
00a476d0	stp x15,x9,[sp, #0x30]
00a476d4	add x9,x18,x16, LSR #0x38
00a476d8	and x11,x16,#0xffffffffffffff
00a476dc	add x8,x17,x8, LSR #0x38
00a476e0	add x25,x13,x0
00a476e4	str x9,[sp, #0x28]
00a476e8	add x9,x11,x14, LSR #0x38
00a476ec	stp x12,x9,[sp, #0x18]
00a476f0	stp x8,x10,[sp, #0x8]
00a476f4	str x25,[sp]
00a476f8	ldr x8,[x22, #0x40]
00a476fc	ldr x9,[x22]
00a47700	add x0,sp,#0x80
00a47704	add x8,x9,x8
00a47708	str x8,[x21, #0xc0]!
00a4770c	ldr x9,[x22, #0x48]
00a47710	ldr x10,[x22, #0x8]
00a47714	and x14,x8,#0xffffffffffffff
00a47718	mov x1,x21
00a4771c	add x9,x10,x9
00a47720	str x9,[x20, #0xc8]
00a47724	ldr x10,[x22, #0x50]
00a47728	ldr x11,[x22, #0x10]
00a4772c	and x16,x9,#0xffffffffffffff
00a47730	add x8,x16,x8, LSR #0x38
00a47734	add x10,x11,x10
00a47738	str x10,[x20, #0xd0]
00a4773c	ldr x11,[x22, #0x58]
00a47740	ldr x12,[x22, #0x18]
00a47744	and x16,x10,#0xffffffffffffff
00a47748	add x9,x16,x9, LSR #0x38
00a4774c	add x11,x12,x11
00a47750	str x11,[x20, #0xd8]
00a47754	ldr x12,[x22, #0x60]
00a47758	ldr x13,[x22, #0x20]
00a4775c	and x16,x11,#0xffffffffffffff
00a47760	add x10,x16,x10, LSR #0x38
00a47764	add x12,x13,x12
00a47768	str x12,[x20, #0xe0]
00a4776c	ldr x13,[x22, #0x68]
00a47770	ldr x15,[x22, #0x28]
00a47774	add x13,x15,x13
00a47778	str x13,[x20, #0xe8]
00a4777c	ldr x15,[x22, #0x70]
00a47780	ldr x17,[x22, #0x30]
00a47784	add x15,x17,x15
00a47788	str x15,[x20, #0xf0]
00a4778c	ldr x16,[x22, #0x78]
00a47790	ldr x17,[x22, #0x38]
00a47794	stp x8,x9,[x20, #0xc8]
00a47798	and x8,x15,#0xffffffffffffff
00a4779c	add x8,x8,x13, LSR #0x38
00a477a0	and x9,x13,#0xffffffffffffff
00a477a4	add x13,x17,x16
00a477a8	lsr x16,x13,#0x38
00a477ac	and x13,x13,#0xffffffffffffff
00a477b0	add x12,x16,x12
00a477b4	add x13,x13,x15, LSR #0x38
00a477b8	add x9,x9,x12, LSR #0x38
00a477bc	and x12,x12,#0xffffffffffffff
00a477c0	add x14,x16,x14
00a477c4	stp x8,x13,[x20, #0xf0]
00a477c8	add x8,x12,x11, LSR #0x38
00a477cc	str x10,[x20, #0xd8]
00a477d0	stp x8,x9,[x20, #0xe0]
00a477d4	str x14,[x21]
00a477d8	bl 0x00c3a4d0
00a477dc	ldp x8,x9,[sp, #0x80]
00a477e0	ldp x11,x13,[sp, #0x90]
00a477e4	ldp x10,x12,[sp, #0x8]
00a477e8	ldp x14,x16,[sp, #0x18]
00a477ec	ldp x15,x17,[sp, #0xa0]
00a477f0	ldp x0,x2,[sp, #0xb0]
00a477f4	ldp x18,x1,[sp, #0x28]
00a477f8	ldp x3,x5,[sp, #0x38]
00a477fc	orr x23,xzr,#0x1fffffffffffffe
00a47800	orr x24,xzr,#0x1fffffffffffffc
00a47804	add x9,x9,x23
00a47808	add x13,x13,x23
00a4780c	ldp x4,x6,[x29, #-0x80]
00a47810	sub x9,x9,x10
00a47814	add x11,x11,x23
00a47818	sub x13,x13,x14
00a4781c	ldp x10,x14,[x29, #-0x70]
00a47820	add x15,x15,x24
00a47824	add x17,x17,x23
00a47828	add x0,x0,x23
00a4782c	add x2,x2,x23
00a47830	sub x11,x11,x12
00a47834	ldp x7,x12,[sp, #0x48]
00a47838	sub x15,x15,x16
00a4783c	sub x17,x17,x18
00a47840	sub x0,x0,x1
00a47844	ldp x16,x1,[sp, #0x58]
00a47848	sub x2,x2,x3
00a4784c	ldp x18,x3,[x29, #-0x60]
00a47850	add x6,x6,x23
00a47854	add x14,x14,x23
00a47858	add x4,x4,x23
00a4785c	sub x6,x6,x7
00a47860	add x10,x10,x23
00a47864	sub x14,x14,x16
00a47868	ldp x7,x16,[x29, #-0x50]
00a4786c	add x18,x18,x24
00a47870	sub x4,x4,x5
00a47874	sub x10,x10,x12
00a47878	ldp x5,x12,[sp, #0x68]
00a4787c	sub x18,x18,x1
00a47880	ldr x1,[sp, #0x78]
00a47884	add x8,x8,x23
00a47888	add x3,x3,x23
00a4788c	add x7,x7,x23
00a47890	add x16,x16,x23
00a47894	sub x8,x8,x25
00a47898	sub x3,x3,x5
00a4789c	sub x12,x7,x12
00a478a0	sub x16,x16,x1
00a478a4	lsr x1,x2,#0x38
00a478a8	and x5,x13,#0xffffffffffffff
00a478ac	and x7,x11,#0xffffffffffffff
00a478b0	and x2,x2,#0xffffffffffffff
00a478b4	add x11,x5,x11, LSR #0x38
00a478b8	and x5,x9,#0xffffffffffffff
00a478bc	add x9,x7,x9, LSR #0x38
00a478c0	and x7,x8,#0xffffffffffffff
00a478c4	add x2,x2,x0, LSR #0x38
00a478c8	and x0,x0,#0xffffffffffffff
00a478cc	add x15,x1,x15
00a478d0	add x1,x1,x7
00a478d4	and x7,x14,#0xffffffffffffff
00a478d8	add x0,x0,x17, LSR #0x38
00a478dc	and x17,x17,#0xffffffffffffff
00a478e0	add x8,x5,x8, LSR #0x38
00a478e4	lsr x5,x16,#0x38
00a478e8	add x7,x7,x10, LSR #0x38
00a478ec	and x10,x10,#0xffffffffffffff
00a478f0	add x17,x17,x15, LSR #0x38
00a478f4	and x15,x15,#0xffffffffffffff
00a478f8	add x10,x10,x6, LSR #0x38
00a478fc	and x6,x6,#0xffffffffffffff
00a47900	add x18,x5,x18
00a47904	add x13,x15,x13, LSR #0x38
00a47908	and x15,x16,#0xffffffffffffff
00a4790c	add x6,x6,x4, LSR #0x38
00a47910	and x4,x4,#0xffffffffffffff
00a47914	str x17,[sp, #0xa8]
00a47918	add x15,x15,x12, LSR #0x38
00a4791c	and x12,x12,#0xffffffffffffff
00a47920	and x16,x3,#0xffffffffffffff
00a47924	and x17,x18,#0xffffffffffffff
00a47928	add x4,x5,x4
00a4792c	stp x0,x2,[sp, #0xb0]
00a47930	add x12,x12,x3, LSR #0x38
00a47934	add x16,x16,x18, LSR #0x38
00a47938	add x14,x17,x14, LSR #0x38
00a4793c	str x1,[sp, #0x80]
00a47940	add x1,x22,#0x80
00a47944	mov x0,x20
00a47948	stp x11,x13,[sp, #0x98]
00a4794c	stp x8,x9,[sp, #0x88]
00a47950	stp x12,x15,[x20, #0xf0]
00a47954	stp x14,x16,[x20, #0xe0]
00a47958	stp x10,x7,[x20, #0xd0]
00a4795c	str x6,[x20, #0xc8]
00a47960	str x4,[x21]
00a47964	bl 0x00c3a4d0
00a47968	ldp x12,x13,[x20, #0x30]
00a4796c	ldp x14,x15,[x20, #0x20]
00a47970	ldp x10,x11,[x20, #0x10]
00a47974	ldp x8,x9,[x20]
00a47978	ubfx x18,x13,#0x37,#0x8
00a4797c	ubfiz x13,x13,#0x1,#0x37
00a47980	lsr x0,x12,#0x37
00a47984	ubfiz x12,x12,#0x1,#0x37
00a47988	lsr x1,x15,#0x37
00a4798c	add x13,x13,w0, UXTB 
00a47990	ubfiz x0,x11,#0x1,#0x37
00a47994	add x12,x12,w1, UXTB 
00a47998	lsr x1,x10,#0x37
00a4799c	ldp x16,x17,[x20, #0xc8]
00a479a0	ubfiz x10,x10,#0x1,#0x37
00a479a4	add x0,x0,w1, UXTB 
00a479a8	lsr x1,x9,#0x37
00a479ac	ubfiz x9,x9,#0x1,#0x37
00a479b0	add x10,x10,w1, UXTB 
00a479b4	lsr x1,x8,#0x37
00a479b8	ubfiz x8,x8,#0x1,#0x37
00a479bc	add x14,x18,x14, LSL #0x1
00a479c0	ubfiz x15,x15,#0x1,#0x37
00a479c4	add x9,x9,w1, UXTB 
00a479c8	add x8,x18,x8
00a479cc	lsr x11,x11,#0x37
00a479d0	add x15,x15,x14, LSR #0x38
00a479d4	and x14,x14,#0xffffffffffffff
00a479d8	ldp x18,x1,[x20, #0xd8]
00a479dc	stp x8,x9,[x20, #0x80]
00a479e0	add x9,x9,x23
00a479e4	add x11,x14,w11, UXTB 
00a479e8	add x14,x10,x23
00a479ec	sub x9,x9,x16
00a479f0	sub x14,x14,x17
00a479f4	ldp x16,x17,[x20, #0xe8]
00a479f8	stp x10,x0,[x20, #0x90]
00a479fc	add x10,x0,x23
00a47a00	sub x10,x10,x18
00a47a04	add x18,x12,x23
00a47a08	sub x17,x18,x17
00a47a0c	ldr x18,[x20, #0xf8]
00a47a10	stp x12,x13,[x20, #0xb0]
00a47a14	add x12,x13,x23
00a47a18	stp x11,x15,[x20, #0xa0]
00a47a1c	sub x12,x12,x18
00a47a20	and x18,x10,#0xffffffffffffff
00a47a24	and x0,x14,#0xffffffffffffff
00a47a28	add x14,x18,x14, LSR #0x38
00a47a2c	ldr x18,[x21]
00a47a30	add x13,x15,x23
00a47a34	add x11,x11,x24
00a47a38	add x8,x8,x23
00a47a3c	sub x13,x13,x16
00a47a40	lsr x15,x12,#0x38
00a47a44	and x12,x12,#0xffffffffffffff
00a47a48	and x16,x17,#0xffffffffffffff
00a47a4c	sub x11,x11,x1
00a47a50	add x12,x12,x17, LSR #0x38
00a47a54	and x17,x9,#0xffffffffffffff
00a47a58	add x16,x16,x13, LSR #0x38
00a47a5c	and x13,x13,#0xffffffffffffff
00a47a60	add x9,x0,x9, LSR #0x38
00a47a64	add x11,x15,x11
00a47a68	sub x8,x8,x18
00a47a6c	stp x16,x12,[x29, #-0x50]
00a47a70	add x12,x13,x11, LSR #0x38
00a47a74	and x11,x11,#0xffffffffffffff
00a47a78	stp x9,x14,[x29, #-0x70]
00a47a7c	add x9,x17,x8, LSR #0x38
00a47a80	and x8,x8,#0xffffffffffffff
00a47a84	add x10,x11,x10, LSR #0x38
00a47a88	add x8,x15,x8
00a47a8c	sub x1,x29,#0x80
00a47a90	add x2,sp,#0x80
00a47a94	mov x0,x20
00a47a98	add x22,x20,#0x80
00a47a9c	stp x10,x12,[x29, #-0x60]
00a47aa0	stp x8,x9,[x29, #-0x80]
00a47aa4	bl 0x00c3a4b0
00a47aa8	sub x2,x29,#0x80
00a47aac	mov x0,x22
00a47ab0	mov x1,x21
00a47ab4	bl 0x00c3a4b0
00a47ab8	add x0,x20,#0x40
00a47abc	mov x2,sp
00a47ac0	mov x1,x21
00a47ac4	bl 0x00c3a4b0
00a47ac8	cbnz w19,0x00a47adc
00a47acc	add x1,sp,#0x80
00a47ad0	mov x2,sp
00a47ad4	mov x0,x21
00a47ad8	bl 0x00c3a4b0
00a47adc	ldp x29,x30,[sp, #0x140]
00a47ae0	ldp x20,x19,[sp, #0x130]
00a47ae4	ldp x22,x21,[sp, #0x120]
00a47ae8	ldp x24,x23,[sp, #0x110]
00a47aec	ldp x28,x25,[sp, #0x100]
00a47af0	add sp,sp,#0x150
00a47af4	ret
