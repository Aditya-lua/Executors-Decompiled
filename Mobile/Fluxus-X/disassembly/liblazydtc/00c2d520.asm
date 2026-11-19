; FUN_00c2d520 @ 00c2d520
00c2d520	paciasp
00c2d524	stp x29,x30,[sp, #-0x60]!
00c2d528	stp x28,x27,[sp, #0x10]
00c2d52c	stp x26,x25,[sp, #0x20]
00c2d530	stp x24,x23,[sp, #0x30]
00c2d534	stp x22,x21,[sp, #0x40]
00c2d538	stp x20,x19,[sp, #0x50]
00c2d53c	mov x29,sp
00c2d540	sub sp,sp,#0x6a0
00c2d544	ldp x10,x8,[x2, #0x8]
00c2d548	mov x19,sp
00c2d54c	ldr x9,[x2]
00c2d550	ldp x11,x12,[x1, #0x10]
00c2d554	mov x20,x5
00c2d558	mov x22,x2
00c2d55c	mov x28,xzr
00c2d560	add x9,x10,x9
00c2d564	add x24,x5,#0x18
00c2d568	adrp x23,0x78d000
00c2d56c	add x23,x23,#0x760
00c2d570	stp x8,x9,[x29, #-0x38]
00c2d574	mov x8,#-0x1
00c2d578	ldp x9,x10,[x1]
00c2d57c	stp x8,x11,[x29, #-0x28]
00c2d580	str w4,[x19, #0x2c]
00c2d584	stp x0,x1,[x19, #0x18]
00c2d588	add x8,x10,x9
00c2d58c	sub x9,x3,x12
00c2d590	add x10,x5,#0x238
00c2d594	stp x8,x9,[x29, #-0x18]
00c2d598	add x8,x19,#0x40
00c2d59c	add x9,x8,#0x238
00c2d5a0	add x8,x8,#0x18
00c2d5a4	stp xzr,x8,[x19, #0x30]
00c2d5a8	stp x9,x10,[x19, #0x8]
00c2d5ac	b 0x00c2d5bc
00c2d5b0	add x28,x28,#0x18
00c2d5b4	cmp x28,#0x30
00c2d5b8	b.eq 0x00c2dd6c
00c2d5bc	sub x8,x29,#0x38
00c2d5c0	add x8,x8,x28
00c2d5c4	ldp x9,x25,[x8]
00c2d5c8	ldr x21,[x8, #0x10]
00c2d5cc	cmp x9,x25
00c2d5d0	stur x9,[x29, #-0x40]
00c2d5d4	ccmp x21,#0x0,#0x4,cc
00c2d5d8	b.eq 0x00c2d5b0
00c2d5dc	mov x26,xzr
00c2d5e0	mov x8,x9
00c2d5e4	ldrb w10,[x8], #0x1
00c2d5e8	stur x8,[x29, #-0x40]
00c2d5ec	cmp w10,#0x2f
00c2d5f0	b.hi 0x00c2dcc0
00c2d5f4	adr x11,0xc2d604
00c2d5f8	ldrh w12,[x23, x10, LSL #0x1]
00c2d5fc	add x11,x11,x12, LSL #0x2
00c2d600	br x11
00c2d604	bti j
00c2d608	ldrb w3,[x22, #0x18]
00c2d60c	ldr x0,[x19, #0x18]
00c2d610	sub x1,x29,#0x40
00c2d614	mov x2,x25
00c2d618	mov x4,xzr
00c2d61c	bl 0x00c2e33c
00c2d620	mov x26,x0
00c2d624	b 0x00c2dd50
00c2d628	bti j
00c2d62c	sub x0,x29,#0x40
00c2d630	mov x1,x25
00c2d634	bl 0x00c2e6c8
00c2d638	ldur x10,[x29, #-0x40]
00c2d63c	mov x8,xzr
00c2d640	mov x9,#-0x7
00c2d644	mov x12,x10
00c2d648	cmp x12,x25
00c2d64c	b.eq 0x00c2df28
00c2d650	ldrb w11,[x12], #0x1
00c2d654	add x9,x9,#0x7
00c2d658	add x10,x10,#0x1
00c2d65c	and x13,x11,#0x7f
00c2d660	lsl x13,x13,x9
00c2d664	orr x8,x13,x8
00c2d668	tbnz w11,#0x7,0x00c2d648
00c2d66c	cmp x0,#0x60
00c2d670	stur x10,[x29, #-0x40]
00c2d674	b.cs 0x00c2deb4
00c2d678	add x10,x9,#0x7
00c2d67c	mov x12,#-0x1
00c2d680	cmp x9,#0x39
00c2d684	mov w9,#0x3f
00c2d688	lsl x10,x12,x10
00c2d68c	ccmp w11,w9,#0x0,cc
00c2d690	csel w9,w10,wzr,hi
00c2d694	ldr w10,[x22, #0x2c]
00c2d698	orr w8,w8,w9
00c2d69c	mul w8,w10,w8
00c2d6a0	stp w0,w8,[x20]
00c2d6a4	b 0x00c2dd50
00c2d6a8	bti j
00c2d6ac	sub x0,x29,#0x40
00c2d6b0	mov x1,x25
00c2d6b4	bl 0x00c2e6c8
00c2d6b8	cmp x0,#0x60
00c2d6bc	b.cs 0x00c2ddd8
00c2d6c0	ldur x9,[x29, #-0x40]
00c2d6c4	mov x8,xzr
00c2d6c8	mov x10,#-0x7
00c2d6cc	mov x12,x9
00c2d6d0	cmp x12,x25
00c2d6d4	b.eq 0x00c2dfc4
00c2d6d8	ldrb w11,[x12], #0x1
00c2d6dc	add x10,x10,#0x7
00c2d6e0	add x9,x9,#0x1
00c2d6e4	and x13,x11,#0x7f
00c2d6e8	lsl x13,x13,x10
00c2d6ec	orr x8,x13,x8
00c2d6f0	tbnz w11,#0x7,0x00c2d6d0
00c2d6f4	add x12,x24,x0, LSL #0x4
00c2d6f8	cmp x10,#0x39
00c2d6fc	add w10,w10,#0x7
00c2d700	mov x13,#-0x1
00c2d704	mov w14,#0x3f
00c2d708	stur x9,[x29, #-0x40]
00c2d70c	lsl x13,x13,x10
00c2d710	ldrb w15,[x12, #0x4]
00c2d714	ccmp w11,w14,#0x0,cc
00c2d718	ldrsw x10,[x22, #0x2c]
00c2d71c	csel x11,x13,xzr,hi
00c2d720	tbnz w15,#0x0,0x00c2d738
00c2d724	ldr x13,[x19, #0x38]
00c2d728	ldr q0,[x12]
00c2d72c	mov w9,#0x1
00c2d730	strb w9,[x12, #0x4]
00c2d734	str q0,[x13,x0, lsl #4]
00c2d738	orr x8,x8,x11
00c2d73c	mov w9,#0x4
00c2d740	b 0x00c2dba0
00c2d744	bti j
00c2d748	sub x0,x29,#0x40
00c2d74c	mov x1,x25
00c2d750	bl 0x00c2e6c8
00c2d754	cmp x0,#0x60
00c2d758	b.cs 0x00c2dd90
00c2d75c	str w0,[x20]
00c2d760	b 0x00c2dd50
00c2d764	bti j
00c2d768	sub x0,x29,#0x40
00c2d76c	mov x1,x25
00c2d770	bl 0x00c2e6c8
00c2d774	str w0,[x20, #0x10]
00c2d778	b 0x00c2dd50
00c2d77c	bti j
00c2d780	ldrb w8,[x20, #0x23c]
00c2d784	tbnz w8,#0x0,0x00c2d79c
00c2d788	ldp x9,x8,[x19, #0x8]
00c2d78c	ldr q0,[x8]
00c2d790	mov w8,#0x1
00c2d794	strb w8,[x20, #0x23c]
00c2d798	str q0,[x9]
00c2d79c	ldr x9,[x19, #0x20]
00c2d7a0	ldr x8,[x20, #0x240]
00c2d7a4	ldr x9,[x9, #0x18]
00c2d7a8	eor x8,x8,#0x3
00c2d7ac	str x8,[x20, #0x240]
00c2d7b0	add x9,x26,x9
00c2d7b4	sub x8,x9,#0x4
00c2d7b8	str x8,[x20, #0x618]
00c2d7bc	b 0x00c2dd50
00c2d7c0	bti j
00c2d7c4	sub x27,sp,#0x630
00c2d7c8	mov sp,x27
00c2d7cc	ldr x8,[x19, #0x30]
00c2d7d0	mov x0,x27
00c2d7d4	mov x1,x20
00c2d7d8	mov w2,#0x620
00c2d7dc	str x8,[x0], #0x8
00c2d7e0	bl 0x00c2ffd0
00c2d7e4	str x27,[x19, #0x30]
00c2d7e8	b 0x00c2dd50
00c2d7ec	bti j
00c2d7f0	sub x0,x29,#0x40
00c2d7f4	mov x1,x25
00c2d7f8	bl 0x00c2e6c8
00c2d7fc	cmp x0,#0x60
00c2d800	b.cs 0x00c2dd74
00c2d804	add x8,x24,x0, LSL #0x4
00c2d808	ldrb w9,[x8, #0x4]
00c2d80c	tbnz w9,#0x0,0x00c2d824
00c2d810	ldr x10,[x19, #0x38]
00c2d814	ldr q0,[x8]
00c2d818	mov w9,#0x1
00c2d81c	strb w9,[x8, #0x4]
00c2d820	str q0,[x10,x0, lsl #4]
00c2d824	ldur x9,[x29, #-0x40]
00c2d828	mov w10,#0x7
00c2d82c	b 0x00c2dbf0
00c2d830	bti j
00c2d834	sub x0,x29,#0x40
00c2d838	mov x1,x25
00c2d83c	bl 0x00c2e6c8
00c2d840	mov x27,x0
00c2d844	sub x0,x29,#0x40
00c2d848	mov x1,x25
00c2d84c	bl 0x00c2e6c8
00c2d850	cmp x27,#0x60
00c2d854	b.cs 0x00c2ddbc
00c2d858	stp w27,w0,[x20]
00c2d85c	b 0x00c2dd50
00c2d860	bti j
00c2d864	mov x9,xzr
00c2d868	mov x10,#-0x7
00c2d86c	mov x11,x8
00c2d870	cmp x11,x25
00c2d874	b.eq 0x00c2df5c
00c2d878	ldrb w12,[x11], #0x1
00c2d87c	add x10,x10,#0x7
00c2d880	add x8,x8,#0x1
00c2d884	and x13,x12,#0x7f
00c2d888	lsl x13,x13,x10
00c2d88c	orr x9,x13,x9
00c2d890	tbnz w12,#0x7,0x00c2d870
00c2d894	add w11,w10,#0x7
00c2d898	mov x13,#-0x1
00c2d89c	cmp x10,#0x39
00c2d8a0	mov w10,#0x3f
00c2d8a4	lsl x11,x13,x11
00c2d8a8	stur x8,[x29, #-0x40]
00c2d8ac	ccmp w12,w10,#0x0,cc
00c2d8b0	csel w10,w11,wzr,hi
00c2d8b4	ldr w11,[x22, #0x2c]
00c2d8b8	orr w9,w9,w10
00c2d8bc	mul w9,w11,w9
00c2d8c0	str w9,[x20, #0x4]
00c2d8c4	b 0x00c2dd50
00c2d8c8	bti j
00c2d8cc	ldrb w8,[x9, #0x1]
00c2d8d0	ldr w10,[x22, #0x28]
00c2d8d4	add x9,x9,#0x2
00c2d8d8	b 0x00c2da58
00c2d8dc	bti j
00c2d8e0	sub x0,x29,#0x40
00c2d8e4	mov x1,x25
00c2d8e8	bl 0x00c2e6c8
00c2d8ec	mov x27,x0
00c2d8f0	sub x0,x29,#0x40
00c2d8f4	mov x1,x25
00c2d8f8	bl 0x00c2e6c8
00c2d8fc	cmp x27,#0x60
00c2d900	b.cs 0x00c2dda0
00c2d904	add x8,x24,x27, LSL #0x4
00c2d908	ldrsw x9,[x22, #0x2c]
00c2d90c	ldrb w10,[x8, #0x4]
00c2d910	tbnz w10,#0x0,0x00c2dd40
00c2d914	ldr x11,[x19, #0x38]
00c2d918	ldr q0,[x8]
00c2d91c	mov w10,#0x1
00c2d920	strb w10,[x8, #0x4]
00c2d924	str q0,[x11,x27, lsl #4]
00c2d928	b 0x00c2dd40
00c2d92c	bti j
00c2d930	ldr x8,[x19, #0x30]
00c2d934	cbz x8,0x00c2df00
00c2d938	add x1,x8,#0x8
00c2d93c	mov x0,x20
00c2d940	mov w2,#0x620
00c2d944	mov x27,x8
00c2d948	bl 0x00c2ffd0
00c2d94c	ldr x27,[x27]
00c2d950	str x27,[x19, #0x30]
00c2d954	b 0x00c2dd50
00c2d958	bti j
00c2d95c	ldr w8,[x19, #0x2c]
00c2d960	cmp w8,#0x4
00c2d964	b.ne 0x00c2dd50
00c2d968	ldrb w8,[x20, #0x23c]
00c2d96c	tbnz w8,#0x0,0x00c2d984
00c2d970	ldp x9,x8,[x19, #0x8]
00c2d974	ldr q0,[x8]
00c2d978	mov w8,#0x1
00c2d97c	strb w8,[x20, #0x23c]
00c2d980	str q0,[x9]
00c2d984	ldr x8,[x20, #0x240]
00c2d988	eor x8,x8,#0x1
00c2d98c	str x8,[x20, #0x240]
00c2d990	b 0x00c2dd50
00c2d994	bti j
00c2d998	sub x0,x29,#0x40
00c2d99c	mov x1,x25
00c2d9a0	bl 0x00c2e6c8
00c2d9a4	cmp x0,#0x60
00c2d9a8	b.cs 0x00c2de48
00c2d9ac	add x8,x24,x0, LSL #0x4
00c2d9b0	ldrb w9,[x8, #0x4]
00c2d9b4	cmp w9,#0x1
00c2d9b8	b.ne 0x00c2dd50
00c2d9bc	ldr x9,[x19, #0x38]
00c2d9c0	ldr q0,[x9,x0, lsl #4]
00c2d9c4	b 0x00c2dcf4
00c2d9c8	bti j
00c2d9cc	sub x0,x29,#0x40
00c2d9d0	mov x1,x25
00c2d9d4	bl 0x00c2e6c8
00c2d9d8	cmp x0,#0x60
00c2d9dc	b.cs 0x00c2de64
00c2d9e0	add x8,x24,x0, LSL #0x4
00c2d9e4	ldrb w9,[x8, #0x4]
00c2d9e8	tbnz w9,#0x0,0x00c2da00
00c2d9ec	ldr x10,[x19, #0x38]
00c2d9f0	ldr q0,[x8]
00c2d9f4	mov w9,#0x1
00c2d9f8	strb w9,[x8, #0x4]
00c2d9fc	str q0,[x10,x0, lsl #4]
00c2da00	mov w9,#0x1
00c2da04	str w9,[x8]
00c2da08	b 0x00c2dd50
00c2da0c	bti j
00c2da10	sub x0,x29,#0x40
00c2da14	mov x1,x25
00c2da18	bl 0x00c2e6c8
00c2da1c	str w0,[x20, #0x4]
00c2da20	b 0x00c2dd50
00c2da24	bti j
00c2da28	str wzr,[x20]
00c2da2c	str x8,[x20, #0x8]
00c2da30	b 0x00c2dbf8
00c2da34	bti j
00c2da38	ldurh w8,[x9, #0x1]
00c2da3c	ldr w10,[x22, #0x28]
00c2da40	add x9,x9,#0x3
00c2da44	b 0x00c2da58
00c2da48	bti j
00c2da4c	ldur w8,[x9, #0x1]
00c2da50	ldr w10,[x22, #0x28]
00c2da54	add x9,x9,#0x5
00c2da58	mul w8,w10,w8
00c2da5c	add x26,x26,x8
00c2da60	stur x9,[x29, #-0x40]
00c2da64	b 0x00c2dd50
00c2da68	bti j
00c2da6c	sub x0,x29,#0x40
00c2da70	mov x1,x25
00c2da74	bl 0x00c2e6c8
00c2da78	mov x27,x0
00c2da7c	sub x0,x29,#0x40
00c2da80	mov x1,x25
00c2da84	bl 0x00c2e6c8
00c2da88	cmp x27,#0x60
00c2da8c	b.cs 0x00c2de10
00c2da90	cmp x0,#0x60
00c2da94	b.cs 0x00c2ded0
00c2da98	add x8,x24,x27, LSL #0x4
00c2da9c	ldrb w9,[x8, #0x4]
00c2daa0	tbnz w9,#0x0,0x00c2dab8
00c2daa4	ldr x10,[x19, #0x38]
00c2daa8	ldr q0,[x8]
00c2daac	mov w9,#0x1
00c2dab0	strb w9,[x8, #0x4]
00c2dab4	str q0,[x10,x27, lsl #4]
00c2dab8	mov w9,#0x5
00c2dabc	str x0,[x8, #0x8]
00c2dac0	str w9,[x8]
00c2dac4	b 0x00c2dd50
00c2dac8	bti j
00c2dacc	sub x0,x29,#0x40
00c2dad0	mov x1,x25
00c2dad4	bl 0x00c2e6c8
00c2dad8	cmp x0,#0x60
00c2dadc	b.cs 0x00c2dea4
00c2dae0	add x8,x24,x0, LSL #0x4
00c2dae4	ldrb w9,[x8, #0x4]
00c2dae8	tbnz w9,#0x0,0x00c2db00
00c2daec	ldr x10,[x19, #0x38]
00c2daf0	ldr q0,[x8]
00c2daf4	mov w9,#0x1
00c2daf8	strb w9,[x8, #0x4]
00c2dafc	str q0,[x10,x0, lsl #4]
00c2db00	str wzr,[x8]
00c2db04	b 0x00c2dd50
00c2db08	bti j
00c2db0c	sub x0,x29,#0x40
00c2db10	mov x1,x25
00c2db14	bl 0x00c2e6c8
00c2db18	cmp x0,#0x60
00c2db1c	b.cs 0x00c2de2c
00c2db20	ldur x9,[x29, #-0x40]
00c2db24	mov x8,xzr
00c2db28	mov x10,#-0x7
00c2db2c	mov x12,x9
00c2db30	cmp x12,x25
00c2db34	b.eq 0x00c2df90
00c2db38	ldrb w11,[x12], #0x1
00c2db3c	add x10,x10,#0x7
00c2db40	add x9,x9,#0x1
00c2db44	and x13,x11,#0x7f
00c2db48	lsl x13,x13,x10
00c2db4c	orr x8,x13,x8
00c2db50	tbnz w11,#0x7,0x00c2db30
00c2db54	add x12,x24,x0, LSL #0x4
00c2db58	cmp x10,#0x39
00c2db5c	add w10,w10,#0x7
00c2db60	mov x13,#-0x1
00c2db64	mov w14,#0x3f
00c2db68	stur x9,[x29, #-0x40]
00c2db6c	lsl x13,x13,x10
00c2db70	ldrb w15,[x12, #0x4]
00c2db74	ccmp w11,w14,#0x0,cc
00c2db78	ldrsw x10,[x22, #0x2c]
00c2db7c	csel x11,x13,xzr,hi
00c2db80	tbnz w15,#0x0,0x00c2db98
00c2db84	ldr x13,[x19, #0x38]
00c2db88	ldr q0,[x12]
00c2db8c	mov w9,#0x1
00c2db90	strb w9,[x12, #0x4]
00c2db94	str q0,[x13,x0, lsl #4]
00c2db98	orr x8,x8,x11
00c2db9c	mov w9,#0x2
00c2dba0	mul x8,x8,x10
00c2dba4	str w9,[x12]
00c2dba8	str x8,[x12, #0x8]
00c2dbac	b 0x00c2dd50
00c2dbb0	bti j
00c2dbb4	sub x0,x29,#0x40
00c2dbb8	mov x1,x25
00c2dbbc	bl 0x00c2e6c8
00c2dbc0	cmp x0,#0x60
00c2dbc4	b.cs 0x00c2de74
00c2dbc8	add x8,x24,x0, LSL #0x4
00c2dbcc	ldrb w9,[x8, #0x4]
00c2dbd0	tbnz w9,#0x0,0x00c2dbe8
00c2dbd4	ldr x10,[x19, #0x38]
00c2dbd8	ldr q0,[x8]
00c2dbdc	mov w9,#0x1
00c2dbe0	strb w9,[x8, #0x4]
00c2dbe4	str q0,[x10,x0, lsl #4]
00c2dbe8	ldur x9,[x29, #-0x40]
00c2dbec	mov w10,#0x6
00c2dbf0	str w10,[x8]
00c2dbf4	str x9,[x8, #0x8]
00c2dbf8	sub x0,x29,#0x40
00c2dbfc	mov x1,x25
00c2dc00	bl 0x00c2e6c8
00c2dc04	ldur x8,[x29, #-0x40]
00c2dc08	add x8,x8,x0
00c2dc0c	stur x8,[x29, #-0x40]
00c2dc10	b 0x00c2dd50
00c2dc14	bti j
00c2dc18	sub x0,x29,#0x40
00c2dc1c	mov x1,x25
00c2dc20	bl 0x00c2e6c8
00c2dc24	mov x27,x0
00c2dc28	cmp x0,#0x60
00c2dc2c	b.cs 0x00c2de84
00c2dc30	sub x0,x29,#0x40
00c2dc34	mov x1,x25
00c2dc38	bl 0x00c2e6c8
00c2dc3c	add x8,x24,x27, LSL #0x4
00c2dc40	ldrsw x9,[x22, #0x2c]
00c2dc44	ldrb w10,[x8, #0x4]
00c2dc48	tbnz w10,#0x0,0x00c2dc60
00c2dc4c	ldr x11,[x19, #0x38]
00c2dc50	ldr q0,[x8]
00c2dc54	mov w10,#0x1
00c2dc58	strb w10,[x8, #0x4]
00c2dc5c	str q0,[x11,x27, lsl #4]
00c2dc60	mul x9,x0,x9
00c2dc64	mov w10,#0x4
00c2dc68	b 0x00c2dd48
00c2dc6c	bti j
00c2dc70	sub x0,x29,#0x40
00c2dc74	mov x1,x25
00c2dc78	bl 0x00c2e6c8
00c2dc7c	cmp x0,#0x60
00c2dc80	b.cs 0x00c2ddf4
00c2dc84	mov x27,x0
00c2dc88	sub x0,x29,#0x40
00c2dc8c	mov x1,x25
00c2dc90	bl 0x00c2e6c8
00c2dc94	add x8,x24,x27, LSL #0x4
00c2dc98	ldrsw x9,[x22, #0x2c]
00c2dc9c	ldrb w10,[x8, #0x4]
00c2dca0	tbnz w10,#0x0,0x00c2dcb8
00c2dca4	ldr x11,[x19, #0x38]
00c2dca8	ldr q0,[x8]
00c2dcac	mov w10,#0x1
00c2dcb0	strb w10,[x8, #0x4]
00c2dcb4	str q0,[x11,x27, lsl #4]
00c2dcb8	mneg x9,x0,x9
00c2dcbc	b 0x00c2dd44
00c2dcc0	bti j
00c2dcc4	lsr w8,w10,#0x6
00c2dcc8	and x27,x10,#0x3f
00c2dccc	cmp w8,#0x1
00c2dcd0	b.le 0x00c2dcfc
00c2dcd4	cmp w8,#0x3
00c2dcd8	b.ne 0x00c2dd10
00c2dcdc	add x8,x24,x27, LSL #0x4
00c2dce0	ldrb w9,[x8, #0x4]
00c2dce4	cmp w9,#0x1
00c2dce8	b.ne 0x00c2dd50
00c2dcec	ldr x9,[x19, #0x38]
00c2dcf0	ldr q0,[x9,x27, lsl #4]
00c2dcf4	str q0,[x8]
00c2dcf8	b 0x00c2dd50
00c2dcfc	b.ne 0x00c2df00
00c2dd00	ldr w8,[x22, #0x28]
00c2dd04	mul w8,w8,w27
00c2dd08	add x26,x26,x8
00c2dd0c	b 0x00c2dd50
00c2dd10	sub x0,x29,#0x40
00c2dd14	mov x1,x25
00c2dd18	bl 0x00c2e6c8
00c2dd1c	add x8,x24,w27, UXTW  #0x4
00c2dd20	ldrsw x9,[x22, #0x2c]
00c2dd24	ldrb w10,[x8, #0x4]
00c2dd28	tbnz w10,#0x0,0x00c2dd40
00c2dd2c	mov w10,#0x1
00c2dd30	ldr q0,[x8]
00c2dd34	strb w10,[x8, #0x4]
00c2dd38	ldr x10,[x19, #0x38]
00c2dd3c	str q0,[x10,w27, uxtw #4]
00c2dd40	mul x9,x0,x9
00c2dd44	mov w10,#0x2
00c2dd48	str w10,[x8]
00c2dd4c	str x9,[x8, #0x8]
00c2dd50	bti j
00c2dd54	ldur x9,[x29, #-0x40]
00c2dd58	cmp x9,x25
00c2dd5c	b.cs 0x00c2d5b0
00c2dd60	cmp x26,x21
00c2dd64	b.cc 0x00c2d5e0
00c2dd68	b 0x00c2d5b0
00c2dd6c	mov w0,#0x1
00c2dd70	b 0x00c2df04
00c2dd74	adrp x8,0xcb4000
00c2dd78	adrp x0,0x2ca000
00c2dd7c	add x0,x0,#0xa05
00c2dd80	ldr x8,[x8, #0xba0]
00c2dd84	mov w1,#0x45
00c2dd88	add x3,x8,#0x130
00c2dd8c	b 0x00c2dee8
00c2dd90	adrp x8,0xcb4000
00c2dd94	adrp x0,0x2d2000
00c2dd98	add x0,x0,#0xb5b
00c2dd9c	b 0x00c2de54
00c2dda0	adrp x8,0xcb4000
00c2dda4	adrp x0,0x2ac000
00c2dda8	add x0,x0,#0xd98
00c2ddac	ldr x8,[x8, #0xba0]
00c2ddb0	mov w1,#0x46
00c2ddb4	add x3,x8,#0x130
00c2ddb8	b 0x00c2dee8
00c2ddbc	adrp x8,0xcb4000
00c2ddc0	adrp x0,0x2a5000
00c2ddc4	add x0,x0,#0x13c
00c2ddc8	ldr x8,[x8, #0xba0]
00c2ddcc	mov w1,#0x3e
00c2ddd0	add x3,x8,#0x130
00c2ddd4	b 0x00c2dee8
00c2ddd8	adrp x8,0xcb4000
00c2dddc	adrp x0,0x2da000
00c2dde0	add x0,x0,#0xe57
00c2dde4	ldr x8,[x8, #0xba0]
00c2dde8	mov w1,#0x44
00c2ddec	add x3,x8,#0x130
00c2ddf0	b 0x00c2dee8
00c2ddf4	adrp x8,0xcb4000
00c2ddf8	adrp x0,0x2d0000
00c2ddfc	add x0,x0,#0xaed
00c2de00	ldr x8,[x8, #0xba0]
00c2de04	mov w1,#0x53
00c2de08	add x3,x8,#0x130
00c2de0c	b 0x00c2dee8
00c2de10	adrp x8,0xcb4000
00c2de14	adrp x0,0x2d2000
00c2de18	add x0,x0,#0xb1b
00c2de1c	ldr x8,[x8, #0xba0]
00c2de20	mov w1,#0x3f
00c2de24	add x3,x8,#0x130
00c2de28	b 0x00c2dee8
00c2de2c	adrp x8,0xcb4000
00c2de30	adrp x0,0x2c0000
00c2de34	add x0,x0,#0xd4e
00c2de38	ldr x8,[x8, #0xba0]
00c2de3c	mov w1,#0x49
00c2de40	add x3,x8,#0x130
00c2de44	b 0x00c2dee8
00c2de48	adrp x8,0xcb4000
00c2de4c	adrp x0,0x2c8000
00c2de50	add x0,x0,#0xa33
00c2de54	ldr x8,[x8, #0xba0]
00c2de58	add x3,x8,#0x130
00c2de5c	mov w1,#0x47
00c2de60	b 0x00c2dee8
00c2de64	adrp x8,0xcb4000
00c2de68	adrp x0,0x2d4000
00c2de6c	add x0,x0,#0xca5
00c2de70	b 0x00c2dedc
00c2de74	adrp x8,0xcb4000
00c2de78	adrp x0,0x2be000
00c2de7c	add x0,x0,#0xdd6
00c2de80	b 0x00c2dec0
00c2de84	adrp x8,0xcb4000
00c2de88	adrp x1,0x2a6000
00c2de8c	add x1,x1,#0xfa2
00c2de90	ldr x8,[x8, #0xba0]
00c2de94	mov x2,x27
00c2de98	add x0,x8,#0x130
00c2de9c	bl 0x00c30940
00c2dea0	b 0x00c2def0
00c2dea4	adrp x8,0xcb4000
00c2dea8	adrp x0,0x2dd000
00c2deac	add x0,x0,#0x35b
00c2deb0	b 0x00c2dec0
00c2deb4	adrp x8,0xcb4000
00c2deb8	adrp x0,0x2a9000
00c2debc	add x0,x0,#0x15f
00c2dec0	ldr x8,[x8, #0xba0]
00c2dec4	add x3,x8,#0x130
00c2dec8	mov w1,#0x41
00c2decc	b 0x00c2dee8
00c2ded0	adrp x8,0xcb4000
00c2ded4	adrp x0,0x2b8000
00c2ded8	add x0,x0,#0xd53
00c2dedc	ldr x8,[x8, #0xba0]
00c2dee0	add x3,x8,#0x130
00c2dee4	mov w1,#0x40
00c2dee8	mov w2,#0x1
00c2deec	bl 0x00c308f0
00c2def0	adrp x8,0xcb4000
00c2def4	ldr x8,[x8, #0xba0]
00c2def8	add x0,x8,#0x130
00c2defc	bl 0x00c30c50
00c2df00	mov w0,wzr
00c2df04	mov sp,x29
00c2df08	ldp x20,x19,[sp, #0x50]
00c2df0c	ldp x22,x21,[sp, #0x40]
00c2df10	ldp x24,x23,[sp, #0x30]
00c2df14	ldp x26,x25,[sp, #0x20]
00c2df18	ldp x28,x27,[sp, #0x10]
00c2df1c	ldp x29,x30,[sp], #0x60
00c2df20	autiasp
00c2df24	ret
00c2df28	adrp x20,0xcb4000
00c2df2c	adrp x1,0x2a1000
00c2df30	add x1,x1,#0x45d
00c2df34	ldr x20,[x20, #0xba0]
00c2df38	adrp x2,0x2c2000
00c2df3c	add x2,x2,#0xcb4
00c2df40	adrp x3,0x2b3000
00c2df44	add x3,x3,#0x329
00c2df48	add x0,x20,#0x130
00c2df4c	bl 0x00c30940
00c2df50	add x0,x20,#0x130
00c2df54	bl 0x00c30c50
00c2df58	bl 0x00c30b40
00c2df5c	adrp x20,0xcb4000
00c2df60	adrp x1,0x2a1000
00c2df64	add x1,x1,#0x45d
00c2df68	ldr x20,[x20, #0xba0]
00c2df6c	adrp x2,0x2c2000
00c2df70	add x2,x2,#0xcb4
00c2df74	adrp x3,0x2b3000
00c2df78	add x3,x3,#0x329
00c2df7c	add x0,x20,#0x130
00c2df80	bl 0x00c30940
00c2df84	add x0,x20,#0x130
00c2df88	bl 0x00c30c50
00c2df8c	bl 0x00c30b40
00c2df90	adrp x20,0xcb4000
00c2df94	adrp x1,0x2a1000
00c2df98	add x1,x1,#0x45d
00c2df9c	ldr x20,[x20, #0xba0]
00c2dfa0	adrp x2,0x2c2000
00c2dfa4	add x2,x2,#0xcb4
00c2dfa8	adrp x3,0x2b3000
00c2dfac	add x3,x3,#0x329
00c2dfb0	add x0,x20,#0x130
00c2dfb4	bl 0x00c30940
00c2dfb8	add x0,x20,#0x130
00c2dfbc	bl 0x00c30c50
00c2dfc0	bl 0x00c30b40
00c2dfc4	adrp x20,0xcb4000
00c2dfc8	adrp x1,0x2a1000
00c2dfcc	add x1,x1,#0x45d
00c2dfd0	ldr x20,[x20, #0xba0]
00c2dfd4	adrp x2,0x2c2000
00c2dfd8	add x2,x2,#0xcb4
00c2dfdc	adrp x3,0x2b3000
00c2dfe0	add x3,x3,#0x329
00c2dfe4	add x0,x20,#0x130
00c2dfe8	bl 0x00c30940
00c2dfec	add x0,x20,#0x130
00c2dff0	bl 0x00c30c50
00c2dff4	bl 0x00c30b40
