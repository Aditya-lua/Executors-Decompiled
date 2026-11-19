; FUN_0085a5d4 @ 0085a5d4
0085a5d4	sub sp,sp,#0x1c0
0085a5d8	stp x29,x30,[sp, #0x160]
0085a5dc	stp x28,x27,[sp, #0x170]
0085a5e0	stp x26,x25,[sp, #0x180]
0085a5e4	stp x24,x23,[sp, #0x190]
0085a5e8	stp x22,x21,[sp, #0x1a0]
0085a5ec	stp x20,x19,[sp, #0x1b0]
0085a5f0	add x29,sp,#0x160
0085a5f4	mrs x22,tpidr_el0
0085a5f8	mov x20,x0
0085a5fc	mov x19,x0
0085a600	ldr x8,[x22, #0x28]
0085a604	sub x25,x29,#0x88
0085a608	stur x8,[x29, #-0x18]
0085a60c	ldr x23,[x20, #0x94]!
0085a610	bl 0x00858f2c
0085a614	sub x8,x29,#0x48
0085a618	mov x0,x19
0085a61c	mov w1,wzr
0085a620	bl 0x00860d94
0085a624	mov x21,x19
0085a628	str x22,[sp, #0x48]
0085a62c	ldr w8,[x21, #0x90]!
0085a630	cmp w8,#0x3d
0085a634	b.ne 0x0085a670
0085a638	ldur x26,[x19, #0x94]
0085a63c	mov x0,x19
0085a640	bl 0x00858f2c
0085a644	mov x0,x19
0085a648	mov w1,wzr
0085a64c	bl 0x0086060c
0085a650	ldr w8,[x19, #0x90]
0085a654	str x0,[sp, #0x40]
0085a658	cmp w8,#0x2c
0085a65c	b.ne 0x0085a6f8
0085a660	mov x0,x19
0085a664	bl 0x00858f2c
0085a668	ldr x8,[x19, #0xb0]
0085a66c	b 0x0085a710
0085a670	ldr x8,[x19, #0x308]
0085a674	ldr x9,[x19, #0x300]
0085a678	add x0,x19,#0x300
0085a67c	stp xzr,xzr,[x29, #-0x98]
0085a680	sub x8,x8,x9
0085a684	orr x9,xzr,#-0x5555555555555556
0085a688	asr x8,x8,#0x4
0085a68c	movk x9,#0xaaab
0085a690	mul x8,x8,x9
0085a694	stp x0,x8,[x29, #-0x88]
0085a698	sub x1,x29,#0x48
0085a69c	bl 0x00870aa0
0085a6a0	ldr w27,[x21]
0085a6a4	mov w8,#0x1
0085a6a8	stur x8,[x29, #-0x78]
0085a6ac	cmp w27,#0x2c
0085a6b0	b.ne 0x0085aa4c
0085a6b4	ldrb w8,[x19, #0x68]
0085a6b8	cmp w8,#0x1
0085a6bc	b.ne 0x0085aa1c
0085a6c0	ldur x8,[x19, #0x94]
0085a6c4	str x8,[sp, #0x98]
0085a6c8	mov x0,x19
0085a6cc	bl 0x00858f2c
0085a6d0	sub x8,x29,#0x70
0085a6d4	sub x1,x29,#0x88
0085a6d8	sub x3,x29,#0x98
0085a6dc	add x4,sp,#0x98
0085a6e0	mov x0,x19
0085a6e4	mov w2,wzr
0085a6e8	mov x5,xzr
0085a6ec	mov w6,wzr
0085a6f0	bl 0x008614c0
0085a6f4	b 0x0085aa48
0085a6f8	adrp x2,0x2a1000
0085a6fc	add x2,x2,#0x4bb
0085a700	mov x0,x19
0085a704	mov w1,#0x2c
0085a708	bl 0x0086e3b4
0085a70c	mov x8,#-0x1
0085a710	mov x0,x19
0085a714	mov w1,wzr
0085a718	str x8,[sp, #0x28]
0085a71c	bl 0x0086060c
0085a720	ldr w20,[x19, #0x90]
0085a724	str x0,[sp, #0x38]
0085a728	cmp w20,#0x2c
0085a72c	b.ne 0x0085a758
0085a730	ldur x8,[x19, #0x94]
0085a734	mov x0,x19
0085a738	str x8,[sp, #0x20]
0085a73c	bl 0x00858f2c
0085a740	mov x0,x19
0085a744	mov w1,wzr
0085a748	bl 0x0086060c
0085a74c	ldr w20,[x19, #0x90]
0085a750	str x0,[sp, #0x30]
0085a754	b 0x0085a764
0085a758	mov x8,#-0x1
0085a75c	str xzr,[sp, #0x30]
0085a760	str x8,[sp, #0x20]
0085a764	ldp q0,q1,[x21]
0085a768	cmp w20,#0x125
0085a76c	stp q0,q1,[x29, #-0x70]
0085a770	b.ne 0x0085a780
0085a774	mov x0,x19
0085a778	bl 0x00858f2c
0085a77c	b 0x0085a794
0085a780	adrp x2,0x2b5000
0085a784	add x2,x2,#0x195
0085a788	mov x0,x19
0085a78c	mov w1,#0x125
0085a790	bl 0x0086e3b4
0085a794	ldr x8,[x19, #0x160]
0085a798	ldp x22,x24,[x19, #0x1b8]
0085a79c	add x0,x19,#0x180
0085a7a0	sub x1,x29,#0x48
0085a7a4	ldur w9,[x8, #-0x4]
0085a7a8	add w9,w9,#0x1
0085a7ac	stur w9,[x8, #-0x4]
0085a7b0	bl 0x0086e18c
0085a7b4	ldp x8,x27,[x19, #0x158]
0085a7b8	mov x21,x0
0085a7bc	ldr x0,[x19, #0xe8]
0085a7c0	mov w1,#0x40
0085a7c4	sub x8,x27,x8
0085a7c8	asr x8,x8,#0x3
0085a7cc	sub x28,x8,#0x1
0085a7d0	bl 0x0084e938
0085a7d4	ldur x8,[x29, #-0x48]
0085a7d8	ldur x9,[x29, #-0x30]
0085a7dc	mov x1,x21
0085a7e0	ldr x10,[x21]
0085a7e4	ldur w11,[x27, #-0x4]
0085a7e8	ldurb w12,[x29, #-0x20]
0085a7ec	str x8,[x0]
0085a7f0	ldur q0,[x25, #0x48]
0085a7f4	stp x10,x28,[x0, #0x18]
0085a7f8	str x11,[x0, #0x28]
0085a7fc	strb w12,[x0, #0x30]
0085a800	stur q0,[x0, #0x8]
0085a804	strb wzr,[x0, #0x31]
0085a808	str x9,[x0, #0x38]
0085a80c	str x0,[x21]
0085a810	add x0,x19,#0x1b8
0085a814	bl 0x0086e2d0
0085a818	ldp x9,x8,[x19, #0x1b8]
0085a81c	mov x0,x19
0085a820	ldr x27,[x21]
0085a824	sub x21,x8,x9
0085a828	bl 0x00859498
0085a82c	ldp x8,x9,[x19, #0x1b8]
0085a830	ubfx x21,x21,#0x3,#0x20
0085a834	mov x28,x0
0085a838	sub x10,x9,x8
0085a83c	asr x10,x10,#0x3
0085a840	cmp x10,x21
0085a844	b.ls 0x0085a8bc
0085a848	str w20,[sp, #0x1c]
0085a84c	mov x20,x22
0085a850	mov x22,x24
0085a854	mov x24,x28
0085a858	mov x28,x27
0085a85c	mov x27,x26
0085a860	mov x26,x23
0085a864	ldr x8,[x19, #0x1b8]
0085a868	add x0,x19,#0x180
0085a86c	sub x25,x10,#0x1
0085a870	add x8,x8,x10, LSL #0x3
0085a874	ldur x1,[x8, #-0x8]
0085a878	ldr x23,[x1, #0x18]
0085a87c	bl 0x0086e18c
0085a880	cmp x25,x21
0085a884	mov x10,x25
0085a888	str x23,[x0]
0085a88c	b.hi 0x0085a864
0085a890	ldp x8,x9,[x19, #0x1b8]
0085a894	mov x23,x26
0085a898	mov x26,x27
0085a89c	mov x27,x28
0085a8a0	mov x28,x24
0085a8a4	mov x24,x22
0085a8a8	mov x22,x20
0085a8ac	ldr w20,[sp, #0x1c]
0085a8b0	sub x10,x9,x8
0085a8b4	sub x25,x29,#0x88
0085a8b8	asr x10,x10,#0x3
0085a8bc	subs x1,x21,x10
0085a8c0	sub x22,x24,x22
0085a8c4	b.ls 0x0085a8d8
0085a8c8	add x0,x19,#0x1b8
0085a8cc	bl 0x00870174
0085a8d0	ldp x8,x9,[x19, #0x1b8]
0085a8d4	b 0x0085a8e4
0085a8d8	b.cs 0x0085a8e4
0085a8dc	add x9,x8,x21, LSL #0x3
0085a8e0	str x9,[x19, #0x1c0]
0085a8e4	ldr x10,[x19, #0x160]
0085a8e8	sub x9,x9,x8
0085a8ec	ubfx x21,x22,#0x3,#0x20
0085a8f0	asr x9,x9,#0x3
0085a8f4	ldur w11,[x10, #-0x4]
0085a8f8	cmp x9,x21
0085a8fc	sub w11,w11,#0x1
0085a900	stur w11,[x10, #-0x4]
0085a904	b.ls 0x0085a948
0085a908	mov x24,x23
0085a90c	ldr x8,[x19, #0x1b8]
0085a910	add x0,x19,#0x180
0085a914	sub x23,x9,#0x1
0085a918	add x8,x8,x9, LSL #0x3
0085a91c	ldur x1,[x8, #-0x8]
0085a920	ldr x22,[x1, #0x18]
0085a924	bl 0x0086e18c
0085a928	cmp x23,x21
0085a92c	mov x9,x23
0085a930	str x22,[x0]
0085a934	b.hi 0x0085a90c
0085a938	ldp x8,x9,[x19, #0x1b8]
0085a93c	mov x23,x24
0085a940	sub x9,x9,x8
0085a944	asr x9,x9,#0x3
0085a948	subs x1,x21,x9
0085a94c	b.ls 0x0085a95c
0085a950	add x0,x19,#0x1b8
0085a954	bl 0x00870174
0085a958	b 0x0085a968
0085a95c	b.cs 0x0085a968
0085a960	add x8,x8,x21, LSL #0x3
0085a964	str x8,[x19, #0x1c0]
0085a968	ldur w8,[x29, #-0x70]
0085a96c	ldur x9,[x25, #0x1c]
0085a970	cmp w20,#0x125
0085a974	ldur x21,[x19, #0x9c]
0085a978	sub x10,x29,#0x70
0085a97c	sub x2,x29,#0x88
0085a980	mov x0,x19
0085a984	mov w1,#0x128
0085a988	stur w8,[x29, #-0x88]
0085a98c	cset w20,eq
0085a990	orr x22,x10,#0x4
0085a994	stur x9,[x25, #0x4]
0085a998	bl 0x00861094
0085a99c	and w8,w0,#0x1
0085a9a0	mov w1,#0x60
0085a9a4	stp x23,x21,[x29, #-0x88]
0085a9a8	strb w8,[x28, #0x30]
0085a9ac	ldr x0,[x19, #0xe8]
0085a9b0	bl 0x0084e938
0085a9b4	ldp x4,x3,[sp, #0x38]
0085a9b8	sub x1,x29,#0x88
0085a9bc	ldr x5,[sp, #0x30]
0085a9c0	mov x2,x27
0085a9c4	mov x6,x28
0085a9c8	mov w7,w20
0085a9cc	mov x21,x0
0085a9d0	str x22,[sp]
0085a9d4	bl 0x0084ff54
0085a9d8	ldrb w8,[x19, #0x68]
0085a9dc	cmp w8,#0x1
0085a9e0	b.ne 0x0085b010
0085a9e4	ldr x0,[x19, #0xe8]
0085a9e8	mov w1,#0x24
0085a9ec	bl 0x0084e938
0085a9f0	ldp x4,x3,[sp, #0x20]
0085a9f4	mov x2,x26
0085a9f8	ldur x1,[x29, #-0x28]
0085a9fc	mov x20,x0
0085aa00	bl 0x00851f50
0085aa04	add x0,x19,#0x4b0
0085aa08	sub x1,x29,#0x88
0085aa0c	stur x21,[x29, #-0x88]
0085aa10	bl 0x00860fa0
0085aa14	str x20,[x0]
0085aa18	b 0x0085b010
0085aa1c	mov x0,x19
0085aa20	bl 0x00858f2c
0085aa24	sub x8,x29,#0x70
0085aa28	sub x1,x29,#0x88
0085aa2c	mov x0,x19
0085aa30	mov w2,wzr
0085aa34	mov x3,xzr
0085aa38	mov x4,xzr
0085aa3c	mov x5,xzr
0085aa40	mov w6,wzr
0085aa44	bl 0x008614c0
0085aa48	ldr w27,[x21]
0085aa4c	ldr q0,[x20]
0085aa50	cmp w27,#0x12d
0085aa54	str q0,[sp, #0xb0]
0085aa58	b.ne 0x0085aa68
0085aa5c	mov x0,x19
0085aa60	bl 0x00858f2c
0085aa64	b 0x0085aa7c
0085aa68	adrp x2,0x2b5000
0085aa6c	add x2,x2,#0x195
0085aa70	mov x0,x19
0085aa74	mov w1,#0x12d
0085aa78	bl 0x0086e3b4
0085aa7c	ldr x8,[x19, #0x2a8]
0085aa80	ldr x9,[x19, #0x2a0]
0085aa84	ldr x10,[x19, #0x458]
0085aa88	ldr x11,[x19, #0x450]
0085aa8c	sub x8,x8,x9
0085aa90	add x9,x19,#0x2a0
0085aa94	asr x8,x8,#0x3
0085aa98	sub x10,x10,x11
0085aa9c	stp xzr,x9,[sp, #0x90]
0085aaa0	asr x9,x10,#0x3
0085aaa4	add x11,x19,#0x450
0085aaa8	stp x8,xzr,[sp, #0xa0]
0085aaac	ldrb w8,[x19, #0x68]
0085aab0	stp x11,x9,[sp, #0x80]
0085aab4	cmp w8,#0x0
0085aab8	add x8,sp,#0x80
0085aabc	csel x2,x8,xzr,ne
0085aac0	add x1,sp,#0x98
0085aac4	mov x0,x19
0085aac8	bl 0x00861848
0085aacc	ldp q0,q1,[x21]
0085aad0	ldr w20,[x21]
0085aad4	cmp w20,#0x125
0085aad8	stp q0,q1,[x29, #-0x70]
0085aadc	b.ne 0x0085aaec
0085aae0	mov x0,x19
0085aae4	bl 0x00858f2c
0085aae8	b 0x0085ab00
0085aaec	adrp x2,0x2b5000
0085aaf0	add x2,x2,#0x195
0085aaf4	mov x0,x19
0085aaf8	mov w1,#0x125
0085aafc	bl 0x0086e3b4
0085ab00	ldr x8,[x19, #0x160]
0085ab04	str w20,[sp, #0x30]
0085ab08	add x21,x19,#0x318
0085ab0c	ldp x20,x24,[x19, #0x1b8]
0085ab10	ldur w9,[x8, #-0x4]
0085ab14	add w9,w9,#0x1
0085ab18	stur w9,[x8, #-0x4]
0085ab1c	ldr x8,[x19, #0x320]
0085ab20	ldr x9,[x19, #0x318]
0085ab24	ldur x26,[x29, #-0x78]
0085ab28	stp x9,x8,[sp, #0x20]
0085ab2c	sub x8,x8,x9
0085ab30	stp x23,x8,[sp, #0x38]
0085ab34	cbz x26,0x0085abf8
0085ab38	ldp x25,x8,[x29, #-0x88]
0085ab3c	str w27,[sp, #0x1c]
0085ab40	mov x27,x26
0085ab44	stp x20,x24,[sp, #0x8]
0085ab48	add x8,x8,x8, LSL #0x1
0085ab4c	lsl x23,x8,#0x4
0085ab50	ldr x28,[x25]
0085ab54	add x0,x19,#0x180
0085ab58	add x1,x28,x23
0085ab5c	bl 0x0086e18c
0085ab60	ldp x24,x22,[x19, #0x158]
0085ab64	mov x20,x0
0085ab68	ldr x0,[x19, #0xe8]
0085ab6c	mov w1,#0x40
0085ab70	bl 0x0084e938
0085ab74	add x8,x28,x23
0085ab78	sub x9,x22,x24
0085ab7c	ldr x11,[x20]
0085ab80	ldr x10,[x8]
0085ab84	ldur w12,[x22, #-0x4]
0085ab88	asr x9,x9,#0x3
0085ab8c	ldr x13,[x8, #0x18]
0085ab90	ldrb w14,[x8, #0x28]
0085ab94	str x10,[x0]
0085ab98	sub x9,x9,#0x1
0085ab9c	ldur q0,[x8, #0x8]
0085aba0	stp x11,x9,[x0, #0x18]
0085aba4	str x12,[x0, #0x28]
0085aba8	strb w14,[x0, #0x30]
0085abac	strb wzr,[x0, #0x31]
0085abb0	stur q0,[x0, #0x8]
0085abb4	str x13,[x0, #0x38]
0085abb8	str x0,[x20]
0085abbc	add x0,x19,#0x1b8
0085abc0	mov x1,x20
0085abc4	bl 0x0086e2d0
0085abc8	ldr x8,[x20]
0085abcc	str x8,[sp, #0x70]
0085abd0	add x1,sp,#0x70
0085abd4	mov x0,x21
0085abd8	bl 0x0086e2d0
0085abdc	subs x27,x27,#0x1
0085abe0	add x23,x23,#0x30
0085abe4	b.ne 0x0085ab50
0085abe8	ldp x23,x22,[x19, #0x1b8]
0085abec	ldr w27,[sp, #0x1c]
0085abf0	ldp x20,x24,[sp, #0x8]
0085abf4	b 0x0085ac00
0085abf8	mov x23,x20
0085abfc	mov x22,x24
0085ac00	mov x0,x19
0085ac04	bl 0x00859498
0085ac08	ldp x8,x9,[x19, #0x1b8]
0085ac0c	sub x10,x22,x23
0085ac10	ubfx x23,x10,#0x3,#0x20
0085ac14	mov x28,x0
0085ac18	sub x11,x9,x8
0085ac1c	asr x25,x11,#0x3
0085ac20	cmp x25,x23
0085ac24	b.ls 0x0085ac5c
0085ac28	ldr x8,[x19, #0x1b8]
0085ac2c	add x8,x8,x25, LSL #0x3
0085ac30	ldur x1,[x8, #-0x8]
0085ac34	ldr x22,[x1, #0x18]
0085ac38	add x0,x19,#0x180
0085ac3c	bl 0x0086e18c
0085ac40	sub x25,x25,#0x1
0085ac44	str x22,[x0]
0085ac48	cmp x25,x23
0085ac4c	b.hi 0x0085ac28
0085ac50	ldp x8,x9,[x19, #0x1b8]
0085ac54	sub x10,x9,x8
0085ac58	asr x25,x10,#0x3
0085ac5c	subs x1,x23,x25
0085ac60	b.ls 0x0085ac74
0085ac64	add x0,x19,#0x1b8
0085ac68	bl 0x00870174
0085ac6c	ldp x8,x9,[x19, #0x1b8]
0085ac70	b 0x0085ac80
0085ac74	b.cs 0x0085ac80
0085ac78	add x9,x8,x23, LSL #0x3
0085ac7c	str x9,[x19, #0x1c0]
0085ac80	ldr x10,[x19, #0x160]
0085ac84	sub x11,x24,x20
0085ac88	sub x9,x9,x8
0085ac8c	asr x23,x9,#0x3
0085ac90	ubfx x22,x11,#0x3,#0x20
0085ac94	ldur w12,[x10, #-0x4]
0085ac98	cmp x23,x22
0085ac9c	sub w9,w12,#0x1
0085aca0	stur w9,[x10, #-0x4]
0085aca4	b.ls 0x0085acdc
0085aca8	ldr x8,[x19, #0x1b8]
0085acac	add x8,x8,x23, LSL #0x3
0085acb0	ldur x1,[x8, #-0x8]
0085acb4	ldr x24,[x1, #0x18]
0085acb8	add x0,x19,#0x180
0085acbc	bl 0x0086e18c
0085acc0	sub x23,x23,#0x1
0085acc4	str x24,[x0]
0085acc8	cmp x23,x22
0085accc	b.hi 0x0085aca8
0085acd0	ldp x8,x9,[x19, #0x1b8]
0085acd4	sub x9,x9,x8
0085acd8	asr x23,x9,#0x3
0085acdc	subs x1,x22,x23
0085ace0	b.ls 0x0085acf0
0085ace4	add x0,x19,#0x1b8
0085ace8	bl 0x00870174
0085acec	b 0x0085acfc
0085acf0	b.cs 0x0085acfc
0085acf4	add x8,x8,x22, LSL #0x3
0085acf8	str x8,[x19, #0x1c0]
0085acfc	sub x9,x29,#0x88
0085ad00	ldur w8,[x29, #-0x70]
0085ad04	ldur x23,[x19, #0x9c]
0085ad08	ldur x9,[x9, #0x1c]
0085ad0c	str w8,[sp, #0x70]
0085ad10	stur x9,[sp, #0x74]
0085ad14	add x2,sp,#0x70
0085ad18	mov x0,x19
0085ad1c	mov w1,#0x128
0085ad20	bl 0x00861094
0085ad24	and w8,w0,#0x1
0085ad28	strb w8,[x28, #0x30]
0085ad2c	ldr x8,[sp, #0x38]
0085ad30	ldr x22,[x19, #0xe8]
0085ad34	stp x8,x23,[sp, #0x70]
0085ad38	cbz x26,0x0085ad9c
0085ad3c	ldr x21,[x21]
0085ad40	lsl x1,x26,#0x3
0085ad44	mov x0,x22
0085ad48	bl 0x0084e938
0085ad4c	ldp x13,x12,[sp, #0x20]
0085ad50	cmp x26,#0x8
0085ad54	b.cc 0x0085ad6c
0085ad58	add x8,x13,x0
0085ad5c	add x9,x21,x12
0085ad60	sub x8,x8,x9
0085ad64	cmp x8,#0x20
0085ad68	b.cs 0x0085b048
0085ad6c	mov x8,xzr
0085ad70	lsl x10,x8,#0x3
0085ad74	sub x8,x26,x8
0085ad78	add x9,x12,x10
0085ad7c	add x10,x0,x10
0085ad80	sub x9,x9,x13
0085ad84	add x9,x21,x9
0085ad88	ldr x11,[x9], #0x8
0085ad8c	subs x8,x8,#0x1
0085ad90	str x11,[x10], #0x8
0085ad94	b.ne 0x0085ad88
0085ad98	b 0x0085ada0
0085ad9c	mov x0,xzr
0085ada0	ldr x21,[sp, #0xa8]
0085ada4	stp x0,x26,[sp, #0x60]
0085ada8	cbz x21,0x0085ae08
0085adac	ldp x8,x24,[sp, #0x98]
0085adb0	lsl x1,x21,#0x3
0085adb4	ldr x0,[x19, #0xe8]
0085adb8	ldr x23,[x8]
0085adbc	bl 0x0084e938
0085adc0	cmp x21,#0x8
0085adc4	b.cc 0x0085addc
0085adc8	lsl x8,x24,#0x3
0085adcc	add x10,x8,x23
0085add0	sub x8,x0,x10
0085add4	cmp x8,#0x20
0085add8	b.cs 0x0085b084
0085addc	mov x8,xzr
0085ade0	lsl x10,x8,#0x3
0085ade4	sub x8,x21,x8
0085ade8	add x9,x10,x24, LSL #0x3
0085adec	add x10,x0,x10
0085adf0	add x9,x23,x9
0085adf4	ldr x11,[x9], #0x8
0085adf8	subs x8,x8,#0x1
0085adfc	str x11,[x10], #0x8
0085ae00	b.ne 0x0085adf4
0085ae04	b 0x0085ae0c
0085ae08	mov x0,xzr
0085ae0c	stp x0,x21,[sp, #0x50]
0085ae10	mov x0,x22
0085ae14	mov w1,#0x70
0085ae18	bl 0x0084e938
0085ae1c	ldr w8,[sp, #0x30]
0085ae20	mov x21,x0
0085ae24	cmp w8,#0x125
0085ae28	sub x8,x29,#0x70
0085ae2c	cset w7,eq
0085ae30	cmp w27,#0x12d
0085ae34	orr x8,x8,#0x4
0085ae38	cset w5,eq
0085ae3c	add x1,sp,#0x70
0085ae40	add x2,sp,#0x60
0085ae44	add x3,sp,#0x50
0085ae48	add x6,sp,#0xb0
0085ae4c	mov x4,x28
0085ae50	str x8,[sp]
0085ae54	bl 0x00850054
0085ae58	ldrb w8,[x19, #0x68]
0085ae5c	cmp w8,#0x1
0085ae60	b.ne 0x0085af24
0085ae64	ldr x24,[x19, #0xe8]
0085ae68	sub x1,x29,#0x88
0085ae6c	mov x0,x19
0085ae70	bl 0x0086191c
0085ae74	ldr x23,[sp, #0x90]
0085ae78	mov x20,x0
0085ae7c	mov x22,x1
0085ae80	cbz x23,0x0085aee4
0085ae84	ldp x8,x27,[sp, #0x80]
0085ae88	lsl x1,x23,#0x3
0085ae8c	ldr x0,[x19, #0xe8]
0085ae90	ldr x26,[x8]
0085ae94	bl 0x0084e938
0085ae98	mov x25,x0
0085ae9c	cmp x23,#0x8
0085aea0	b.cc 0x0085aeb8
0085aea4	lsl x8,x27,#0x3
0085aea8	add x10,x8,x26
0085aeac	sub x8,x25,x10
0085aeb0	cmp x8,#0x20
0085aeb4	b.cs 0x0085b0b8
0085aeb8	mov x8,xzr
0085aebc	lsl x10,x8,#0x3
0085aec0	sub x8,x23,x8
0085aec4	add x9,x10,x27, LSL #0x3
0085aec8	add x10,x25,x10
0085aecc	add x9,x26,x9
0085aed0	ldr x11,[x9], #0x8
0085aed4	subs x8,x8,#0x1
0085aed8	str x11,[x10], #0x8
0085aedc	b.ne 0x0085aed0
0085aee0	b 0x0085aee8
0085aee4	mov x25,xzr
0085aee8	mov x0,x24
0085aeec	mov w1,#0x38
0085aef0	bl 0x0084e938
0085aef4	ldp x3,x4,[x29, #-0x98]
0085aef8	mov x24,x0
0085aefc	mov x1,x20
0085af00	mov x2,x22
0085af04	mov x5,x25
0085af08	mov x6,x23
0085af0c	bl 0x00851f70
0085af10	str x21,[sp, #0x70]
0085af14	add x0,x19,#0x4b0
0085af18	add x1,sp,#0x70
0085af1c	bl 0x00860fa0
0085af20	str x24,[x0]
0085af24	ldr x9,[x19, #0x318]
0085af28	ldr x10,[sp, #0x40]
0085af2c	ldr x8,[x19, #0x320]
0085af30	add x20,x10,x9
0085af34	cmp x20,x8
0085af38	b.eq 0x0085af60
0085af3c	sub x9,x8,x20
0085af40	add x1,x20,x9
0085af44	subs x22,x8,x1
0085af48	b.eq 0x0085af58
0085af4c	mov x0,x20
0085af50	mov x2,x22
0085af54	bl 0x00c2ff60
0085af58	add x8,x20,x22
0085af5c	str x8,[x19, #0x320]
0085af60	ldp x22,x9,[sp, #0x80]
0085af64	ldp x10,x8,[x22]
0085af68	add x19,x10,x9, LSL #0x3
0085af6c	cmp x19,x8
0085af70	b.eq 0x0085af98
0085af74	sub x9,x8,x19
0085af78	add x1,x19,x9
0085af7c	subs x20,x8,x1
0085af80	b.eq 0x0085af90
0085af84	mov x0,x19
0085af88	mov x2,x20
0085af8c	bl 0x00c2ff60
0085af90	add x8,x19,x20
0085af94	str x8,[x22, #0x8]
0085af98	ldp x22,x9,[sp, #0x98]
0085af9c	ldp x10,x8,[x22]
0085afa0	add x19,x10,x9, LSL #0x3
0085afa4	cmp x19,x8
0085afa8	b.eq 0x0085afd0
0085afac	sub x9,x8,x19
0085afb0	add x1,x19,x9
0085afb4	subs x20,x8,x1
0085afb8	b.eq 0x0085afc8
0085afbc	mov x0,x19
0085afc0	mov x2,x20
0085afc4	bl 0x00c2ff60
0085afc8	add x8,x19,x20
0085afcc	str x8,[x22, #0x8]
0085afd0	ldp x20,x9,[x29, #-0x88]
0085afd4	mov w10,#0x30
0085afd8	ldp x11,x8,[x20]
0085afdc	nop
0085afe0	madd x19,x9,x10,x11
0085afe4	cmp x19,x8
0085afe8	b.eq 0x0085b010
0085afec	sub x9,x8,x19
0085aff0	add x1,x19,x9
0085aff4	subs x22,x8,x1
0085aff8	b.eq 0x0085b008
0085affc	sub x2,x22,#0x7
0085b000	mov x0,x19
0085b004	bl 0x00c2ff60
0085b008	add x8,x19,x22
0085b00c	str x8,[x20, #0x8]
0085b010	ldr x8,[sp, #0x48]
0085b014	ldr x8,[x8, #0x28]
0085b018	ldur x9,[x29, #-0x18]
0085b01c	cmp x8,x9
0085b020	b.ne 0x0085b254
0085b024	mov x0,x21
0085b028	ldp x20,x19,[sp, #0x1b0]
0085b02c	ldp x22,x21,[sp, #0x1a0]
0085b030	ldp x24,x23,[sp, #0x190]
0085b034	ldp x26,x25,[sp, #0x180]
0085b038	ldp x28,x27,[sp, #0x170]
0085b03c	ldp x29,x30,[sp, #0x160]
0085b040	add sp,sp,#0x1c0
0085b044	ret
0085b048	ldr x9,[sp, #0x40]
0085b04c	and x8,x26,#-0x4
0085b050	mov x11,x8
0085b054	add x10,x9,x21
0085b058	add x9,x0,#0x10
0085b05c	add x10,x10,#0x10
0085b060	ldp q0,q1,[x10, #-0x10]
0085b064	subs x11,x11,#0x4
0085b068	add x10,x10,#0x20
0085b06c	stp q0,q1,[x9, #-0x10]
0085b070	add x9,x9,#0x20
0085b074	b.ne 0x0085b060
0085b078	cmp x26,x8
0085b07c	b.eq 0x0085ada0
0085b080	b 0x0085ad70
0085b084	and x8,x21,#-0x4
0085b088	add x9,x0,#0x10
0085b08c	add x10,x10,#0x10
0085b090	mov x11,x8
0085b094	ldp q0,q1,[x10, #-0x10]
0085b098	subs x11,x11,#0x4
0085b09c	add x10,x10,#0x20
0085b0a0	stp q0,q1,[x9, #-0x10]
0085b0a4	add x9,x9,#0x20
0085b0a8	b.ne 0x0085b094
0085b0ac	cmp x21,x8
0085b0b0	b.eq 0x0085ae0c
0085b0b4	b 0x0085ade0
0085b0b8	and x8,x23,#-0x4
0085b0bc	add x9,x25,#0x10
0085b0c0	add x10,x10,#0x10
0085b0c4	mov x11,x8
0085b0c8	ldp q0,q1,[x10, #-0x10]
0085b0cc	subs x11,x11,#0x4
0085b0d0	add x10,x10,#0x20
0085b0d4	stp q0,q1,[x9, #-0x10]
0085b0d8	add x9,x9,#0x20
0085b0dc	b.ne 0x0085b0c8
0085b0e0	cmp x23,x8
0085b0e4	b.eq 0x0085aee8
0085b0e8	b 0x0085aebc
0085b254	bl 0x00c2fec0
