; FUN_00a5a64c @ 00a5a64c
00a5a64c	sub sp,sp,#0x110
00a5a650	stp x26,x25,[sp, #0xc0]
00a5a654	stp x24,x23,[sp, #0xd0]
00a5a658	stp x22,x21,[sp, #0xe0]
00a5a65c	stp x20,x19,[sp, #0xf0]
00a5a660	mov x23,x6
00a5a664	mov w22,w5
00a5a668	mov x19,x4
00a5a66c	mov x20,x3
00a5a670	mov x25,x2
00a5a674	mov x24,x1
00a5a678	mov x21,x0
00a5a67c	mov w8,#0xffffffff
00a5a680	stp x28,x27,[sp, #0xb0]
00a5a684	stp x29,x30,[sp, #0x100]
00a5a688	add x29,sp,#0x100
00a5a68c	str w8,[x0, #0x6c]
00a5a690	cbz w5,0x00a5a6d8
00a5a694	cmn w22,#0x1
00a5a698	b.ne 0x00a5a6d4
00a5a69c	ldr w22,[x21, #0x10]
00a5a6a0	cbnz x24,0x00a5a6e0
00a5a6a4	ldr x8,[x21]
00a5a6a8	cbnz x8,0x00a5a6e0
00a5a6ac	bl 0x00c342a0
00a5a6b0	adrp x0,0x2a5000
00a5a6b4	adrp x2,0x2bd000
00a5a6b8	add x0,x0,#0xf9d
00a5a6bc	add x2,x2,#0xaa6
00a5a6c0	mov w1,#0x6d
00a5a6c4	bl 0x00c342b0
00a5a6c8	orr w0,wzr,#0x6
00a5a6cc	mov w1,#0x83
00a5a6d0	b 0x00a5af0c
00a5a6d4	mov w22,#0x1
00a5a6d8	str w22,[x21, #0x10]
00a5a6dc	cbz x24,0x00a5a6a4
00a5a6e0	ldr x8,[x21, #0x8]
00a5a6e4	cbz x8,0x00a5a704
00a5a6e8	ldr x9,[x21]
00a5a6ec	cbz x9,0x00a5a704
00a5a6f0	cbz x24,0x00a5a9b8
00a5a6f4	ldr w10,[x24]
00a5a6f8	ldr w9,[x9]
00a5a6fc	cmp w10,w9
00a5a700	b.eq 0x00a5a9b0
00a5a704	cbz x24,0x00a5a808
00a5a708	mov x26,xzr
00a5a70c	cbnz x25,0x00a5a720
00a5a710	ldr w0,[x24]
00a5a714	bl 0x00c368a0
00a5a718	ldr x8,[x21, #0x8]
00a5a71c	mov x26,x0
00a5a720	cbnz x25,0x00a5a828
00a5a724	cbnz x26,0x00a5a828
00a5a728	cbnz x8,0x00a5a828
00a5a72c	cbz x24,0x00a5a73c
00a5a730	ldr w8,[x24, #0x18]
00a5a734	cmp w8,#0x2
00a5a738	b.eq 0x00a5a828
00a5a73c	cbz x24,0x00a5a814
00a5a740	cbz x24,0x00a5a79c
00a5a744	ldr x8,[x21]
00a5a748	cbz x8,0x00a5a79c
00a5a74c	ldr x9,[x8, #0x30]
00a5a750	cbz x9,0x00a5a764
00a5a754	mov x0,x21
00a5a758	blr x9
00a5a75c	cbz w0,0x00a5af18
00a5a760	ldr x8,[x21]
00a5a764	ldr x0,[x21, #0x78]
00a5a768	ldrsw x1,[x8, #0x38]
00a5a76c	adrp x2,0x2a5000
00a5a770	add x2,x2,#0xf9d
00a5a774	mov w3,#0x9c
00a5a778	bl 0x00c345e0
00a5a77c	ldr x8,[x21]
00a5a780	str xzr,[x21, #0x78]
00a5a784	cbz x8,0x00a5a79c
00a5a788	ldr x25,[x21, #0x70]
00a5a78c	mov x0,x21
00a5a790	bl 0x00a5a430
00a5a794	str w22,[x21, #0x10]
00a5a798	str x25,[x21, #0x70]
00a5a79c	cbnz x24,0x00a5a7a4
00a5a7a0	ldr x24,[x21]
00a5a7a4	mov x27,x24
00a5a7a8	ldr x8,[x27, #0x78]!
00a5a7ac	cbz x8,0x00a5a868
00a5a7b0	ldr x25,[x21, #0xb0]
00a5a7b4	cmp x24,x25
00a5a7b8	b.eq 0x00a5ac50
00a5a7bc	ldr w8,[x24, #0x18]
00a5a7c0	cbnz w8,0x00a5a7dc
00a5a7c4	add x8,x24,#0x80
00a5a7c8	ldxr w9,[x8]
00a5a7cc	add w9,w9,#0x1
00a5a7d0	stxr w10,w9,[x8]
00a5a7d4	cbnz w10,0x00a5a7c8
00a5a7d8	ldr x25,[x21, #0xb0]
00a5a7dc	cbz x25,0x00a5ac4c
00a5a7e0	ldr w8,[x25, #0x18]
00a5a7e4	cbnz w8,0x00a5ac4c
00a5a7e8	add x9,x25,#0x80
00a5a7ec	ldxr w8,[x9]
00a5a7f0	subs w10,w8,#0x1
00a5a7f4	stxr w11,w10,[x9]
00a5a7f8	cbnz w11,0x00a5a7ec
00a5a7fc	b.ne 0x00a5ac0c
00a5a800	dmb ISHLD
00a5a804	b 0x00a5ac14
00a5a808	mov x26,xzr
00a5a80c	cbz x25,0x00a5a724
00a5a810	b 0x00a5a828
00a5a814	ldr x8,[x21]
00a5a818	cbz x8,0x00a5a740
00a5a81c	ldr w8,[x8, #0x18]
00a5a820	cmp w8,#0x2
00a5a824	b.ne 0x00a5a740
00a5a828	ldr x8,[x21]
00a5a82c	ldr x23,[x21, #0xb0]
00a5a830	cmp x8,x23
00a5a834	b.ne 0x00a5a83c
00a5a838	str xzr,[x21]
00a5a83c	cbz x23,0x00a5a8bc
00a5a840	ldr w8,[x23, #0x18]
00a5a844	cbnz w8,0x00a5a8bc
00a5a848	add x9,x23,#0x80
00a5a84c	ldxr w8,[x9]
00a5a850	subs w10,w8,#0x1
00a5a854	stxr w11,w10,[x9]
00a5a858	cbnz w11,0x00a5a84c
00a5a85c	b.ne 0x00a5a87c
00a5a860	dmb ISHLD
00a5a864	b 0x00a5a884
00a5a868	ldr w0,[x24]
00a5a86c	cbz w0,0x00a5ab48
00a5a870	bl 0x00c324f0
00a5a874	mov x2,x0
00a5a878	b 0x00a5ab50
00a5a87c	cmp w8,#0x1
00a5a880	b.gt 0x00a5a8bc
00a5a884	ldr x0,[x23, #0x68]
00a5a888	adrp x27,0x2a5000
00a5a88c	add x27,x27,#0xf9d
00a5a890	mov w2,#0x69b
00a5a894	mov x1,x27
00a5a898	bl 0x00c32310
00a5a89c	ldr x0,[x23, #0x78]
00a5a8a0	bl 0x00c3b690
00a5a8a4	ldr x0,[x23, #0x88]
00a5a8a8	bl 0x00c34d40
00a5a8ac	mov w2,#0x69e
00a5a8b0	mov x0,x23
00a5a8b4	mov x1,x27
00a5a8b8	bl 0x00c32310
00a5a8bc	str xzr,[x21, #0xb0]
00a5a8c0	cbz x24,0x00a5a9b0
00a5a8c4	ldr x8,[x21]
00a5a8c8	cbz x8,0x00a5a8e0
00a5a8cc	ldr x23,[x21, #0x70]
00a5a8d0	mov x0,x21
00a5a8d4	bl 0x00a5a430
00a5a8d8	str w22,[x21, #0x10]
00a5a8dc	str x23,[x21, #0x70]
00a5a8e0	cbz x25,0x00a5a90c
00a5a8e4	mov x0,x25
00a5a8e8	bl 0x00c323b0
00a5a8ec	cbnz w0,0x00a5a914
00a5a8f0	bl 0x00c342a0
00a5a8f4	adrp x0,0x2a5000
00a5a8f8	adrp x2,0x2bd000
00a5a8fc	add x0,x0,#0xf9d
00a5a900	add x2,x2,#0xaa6
00a5a904	mov w1,#0x137
00a5a908	b 0x00a5af00
00a5a90c	mov x25,x26
00a5a910	cbz x26,0x00a5a928
00a5a914	ldr w1,[x24]
00a5a918	mov x0,x25
00a5a91c	bl 0x00c36890
00a5a920	mov x24,x0
00a5a924	cbz x0,0x00a5a954
00a5a928	stp x24,x25,[x21]
00a5a92c	ldrsw x0,[x24, #0x38]
00a5a930	cbz w0,0x00a5a970
00a5a934	adrp x1,0x2a5000
00a5a938	add x1,x1,#0xf9d
00a5a93c	mov w2,#0x158
00a5a940	bl 0x00c34250
00a5a944	str x0,[x21, #0x78]
00a5a948	cbz x0,0x00a5aaa0
00a5a94c	ldr x8,[x21]
00a5a950	b 0x00a5a978
00a5a954	bl 0x00c342a0
00a5a958	adrp x0,0x2a5000
00a5a95c	adrp x2,0x2bd000
00a5a960	add x0,x0,#0xf9d
00a5a964	add x2,x2,#0xaa6
00a5a968	mov w1,#0x147
00a5a96c	b 0x00a5af00
00a5a970	mov x8,x24
00a5a974	str xzr,[x21, #0x78]
00a5a978	ldr w9,[x24, #0x8]
00a5a97c	ldr x10,[x21, #0x70]
00a5a980	str w9,[x21, #0x68]
00a5a984	and x9,x10,#0x1
00a5a988	str x9,[x21, #0x70]
00a5a98c	ldrb w8,[x8, #0x10]
00a5a990	tbz w8,#0x6,0x00a5a9b0
00a5a994	mov x0,x21
00a5a998	mov w1,wzr
00a5a99c	mov w2,wzr
00a5a9a0	mov x3,xzr
00a5a9a4	bl 0x00a5c100
00a5a9a8	cmp w0,#0x0
00a5a9ac	b.le 0x00a5abb4
00a5a9b0	ldr x9,[x21]
00a5a9b4	cbz x9,0x00a5af14
00a5a9b8	ldr w8,[x9, #0x4]
00a5a9bc	cmp w8,#0x10
00a5a9c0	b.hi 0x00a5af38
00a5a9c4	mov w9,#0x1
00a5a9c8	lsl w8,w9,w8
00a5a9cc	mov w9,#0x102
00a5a9d0	movk w9,#0x1, LSL #16
00a5a9d4	tst w8,w9
00a5a9d8	b.eq 0x00a5af38
00a5a9dc	ldrb w8,[x21, #0x70]
00a5a9e0	tbnz w8,#0x0,0x00a5aa28
00a5a9e4	mov x0,x21
00a5a9e8	bl 0x00c34b80
00a5a9ec	bl 0x00c35290
00a5a9f0	mov w8,#0x2
00a5a9f4	movk w8,#0x1, LSL #16
00a5a9f8	cmp w0,w8
00a5a9fc	b.ne 0x00a5aa28
00a5aa00	bl 0x00c342a0
00a5aa04	adrp x0,0x2a5000
00a5aa08	adrp x2,0x2bd000
00a5aa0c	add x0,x0,#0xf9d
00a5aa10	add x2,x2,#0xaa6
00a5aa14	mov w1,#0x179
00a5aa18	bl 0x00c342b0
00a5aa1c	orr w0,wzr,#0x6
00a5aa20	mov w1,#0xaa
00a5aa24	b 0x00a5af0c
00a5aa28	mov x0,x21
00a5aa2c	bl 0x00c34b80
00a5aa30	bl 0x00c35280
00a5aa34	tbnz w0,#0x4,0x00a5aafc
00a5aa38	mov x0,x21
00a5aa3c	bl 0x00c34b80
00a5aa40	bl 0x00c35290
00a5aa44	cmp w0,#0x5
00a5aa48	b.hi 0x00a5af14
00a5aa4c	adrp x9,0x766000
00a5aa50	mov w8,w0
00a5aa54	add x9,x9,#0x1d4
00a5aa58	ldrsw x8,[x9, x8, LSL #0x2]
00a5aa5c	add x8,x8,x9
00a5aa60	br x8
00a5aa64	str wzr,[x21, #0x58]
00a5aa68	mov x0,x21
00a5aa6c	bl 0x00c36300
00a5aa70	cmp w0,#0x11
00a5aa74	b.cc 0x00a5aad0
00a5aa78	bl 0x00c342a0
00a5aa7c	adrp x0,0x2a5000
00a5aa80	adrp x2,0x2bd000
00a5aa84	add x0,x0,#0xf9d
00a5aa88	add x2,x2,#0xaa6
00a5aa8c	mov w1,#0x18e
00a5aa90	bl 0x00c342b0
00a5aa94	orr w0,wzr,#0x6
00a5aa98	mov w1,#0xc2
00a5aa9c	b 0x00a5af0c
00a5aaa0	str xzr,[x21]
00a5aaa4	bl 0x00c342a0
00a5aaa8	adrp x0,0x2a5000
00a5aaac	adrp x2,0x2bd000
00a5aab0	add x0,x0,#0xf9d
00a5aab4	add x2,x2,#0xaa6
00a5aab8	mov w1,#0x15b
00a5aabc	bl 0x00c342b0
00a5aac0	mov w1,#0x100
00a5aac4	orr w0,wzr,#0x6
00a5aac8	movk w1,#0xc, LSL #16
00a5aacc	b 0x00a5af0c
00a5aad0	add x23,x21,#0x18
00a5aad4	sxtw x24,w0
00a5aad8	cbz x19,0x00a5aaec
00a5aadc	mov x0,x23
00a5aae0	mov x1,x19
00a5aae4	mov x2,x24
00a5aae8	bl 0x00c2ffd0
00a5aaec	add x0,x21,#0x28
00a5aaf0	mov x1,x23
00a5aaf4	mov x2,x24
00a5aaf8	bl 0x00c2ffd0
00a5aafc	ldr x8,[x21]
00a5ab00	cbnz x20,0x00a5ab0c
00a5ab04	ldrb w9,[x8, #0x10]
00a5ab08	tbz w9,#0x5,0x00a5ab2c
00a5ab0c	ldr x8,[x8, #0x20]
00a5ab10	mov x0,x21
00a5ab14	mov x1,x20
00a5ab18	mov x2,x19
00a5ab1c	mov w3,w22
00a5ab20	blr x8
00a5ab24	cbz w0,0x00a5af18
00a5ab28	ldr x8,[x21]
00a5ab2c	str wzr,[x21, #0x14]
00a5ab30	str wzr,[x21, #0x80]
00a5ab34	ldr w8,[x8, #0x4]
00a5ab38	mov w0,#0x1
00a5ab3c	sub w8,w8,#0x1
00a5ab40	str w8,[x21, #0x84]
00a5ab44	b 0x00a5af18
00a5ab48	adrp x2,0x29d000
00a5ab4c	add x2,x2,#0xc23
00a5ab50	adrp x3,0x2ab000
00a5ab54	adrp x4,0xa5c000
00a5ab58	adrp x5,0xa5d000
00a5ab5c	adrp x6,0xa5d000
00a5ab60	add x3,x3,#0x32c
00a5ab64	add x4,x4,#0xd0c
00a5ab68	add x5,x5,#0x1c4
00a5ab6c	add x6,x6,#0x1e8
00a5ab70	mov w1,#0x2
00a5ab74	mov x0,xzr
00a5ab78	bl 0x00c3bf50
00a5ab7c	cbz x0,0x00a5af18
00a5ab80	ldr x25,[x21, #0xb0]
00a5ab84	mov x24,x0
00a5ab88	cbz x25,0x00a5aed8
00a5ab8c	ldr w8,[x25, #0x18]
00a5ab90	cbnz w8,0x00a5aed8
00a5ab94	add x9,x25,#0x80
00a5ab98	ldxr w8,[x9]
00a5ab9c	subs w10,w8,#0x1
00a5aba0	stxr w11,w10,[x9]
00a5aba4	cbnz w11,0x00a5ab98
00a5aba8	b.ne 0x00a5ae98
00a5abac	dmb ISHLD
00a5abb0	b 0x00a5aea0
00a5abb4	str xzr,[x21]
00a5abb8	bl 0x00c342a0
00a5abbc	adrp x0,0x2a5000
00a5abc0	adrp x2,0x2bd000
00a5abc4	add x0,x0,#0xf9d
00a5abc8	add x2,x2,#0xaa6
00a5abcc	mov w1,#0x167
00a5abd0	b 0x00a5af00
00a5abd4	str wzr,[x21, #0x58]
00a5abd8	cbz x19,0x00a5aafc
00a5abdc	mov x0,x21
00a5abe0	bl 0x00c36300
00a5abe4	sub w8,w0,#0x1
00a5abe8	cmp w8,#0x10
00a5abec	b.cc 0x00a5ae84
00a5abf0	bl 0x00c342a0
00a5abf4	adrp x0,0x2a5000
00a5abf8	adrp x2,0x2bd000
00a5abfc	add x0,x0,#0xf9d
00a5ac00	add x2,x2,#0xaa6
00a5ac04	mov w1,#0x19c
00a5ac08	b 0x00a5aa90
00a5ac0c	cmp w8,#0x1
00a5ac10	b.gt 0x00a5ac4c
00a5ac14	ldr x0,[x25, #0x68]
00a5ac18	adrp x26,0x2a5000
00a5ac1c	add x26,x26,#0xf9d
00a5ac20	mov w2,#0x69b
00a5ac24	mov x1,x26
00a5ac28	bl 0x00c32310
00a5ac2c	ldr x0,[x25, #0x78]
00a5ac30	bl 0x00c3b690
00a5ac34	ldr x0,[x25, #0x88]
00a5ac38	bl 0x00c34d40
00a5ac3c	mov w2,#0x69e
00a5ac40	mov x0,x25
00a5ac44	mov x1,x26
00a5ac48	bl 0x00c32310
00a5ac4c	str x24,[x21, #0xb0]
00a5ac50	ldr x8,[x21, #0xa8]
00a5ac54	str x24,[x21]
00a5ac58	cbnz x8,0x00a5ac74
00a5ac5c	ldr x0,[x27]
00a5ac60	ldr x24,[x24, #0x90]
00a5ac64	bl 0x00c3b680
00a5ac68	blr x24
00a5ac6c	str x0,[x21, #0xa8]
00a5ac70	cbz x0,0x00a5ae24
00a5ac74	ldr x24,[x21, #0x70]
00a5ac78	tbz w24,#0x8,0x00a5ace4
00a5ac7c	mov x0,sp
00a5ac80	mov w2,#0x50
00a5ac84	mov w1,wzr
00a5ac88	bl 0x00c301c0
00a5ac8c	stur wzr,[x29, #-0x5c]
00a5ac90	ldr x8,[x21]
00a5ac94	orr x9,x24,#0x100
00a5ac98	str x9,[x21, #0x70]
00a5ac9c	cbz x8,0x00a5aca8
00a5aca0	ldr x8,[x8, #0x78]
00a5aca4	cbz x8,0x00a5ace4
00a5aca8	adrp x0,0x2bd000
00a5acac	add x0,x0,#0xa9e
00a5acb0	add x8,sp,#0x78
00a5acb4	sub x1,x29,#0x5c
00a5acb8	bl 0x00c37340
00a5acbc	ldr x8,[sp, #0x98]
00a5acc0	ldur q0,[sp, #0x88]
00a5acc4	ldur q1,[sp, #0x78]
00a5acc8	mov x2,sp
00a5accc	str x8,[sp, #0x20]
00a5acd0	stp q1,q0,[sp]
00a5acd4	ldr x0,[x21]
00a5acd8	ldr x1,[x21, #0xa8]
00a5acdc	bl 0x00c3cd70
00a5ace0	cbz w0,0x00a5af18
00a5ace4	cbz x23,0x00a5adc8
00a5ace8	mov x0,sp
00a5acec	orr w2,wzr,#0x78
00a5acf0	mov w1,wzr
00a5acf4	bl 0x00c301c0
00a5acf8	adrp x1,0x2bd000
00a5acfc	add x1,x1,#0xa97
00a5ad00	mov x0,x23
00a5ad04	bl 0x00c36530
00a5ad08	cbz x0,0x00a5ad2c
00a5ad0c	ldr x8,[x0, #0x20]
00a5ad10	mov w24,#0x1
00a5ad14	str x8,[sp, #0x20]
00a5ad18	ldr q0,[x0, #0x10]
00a5ad1c	str q0,[sp, #0x10]
00a5ad20	ldr q0,[x0]
00a5ad24	str q0,[sp]
00a5ad28	b 0x00a5ad30
00a5ad2c	mov x24,xzr
00a5ad30	adrp x1,0x2c3000
00a5ad34	add x1,x1,#0x9bc
00a5ad38	mov x0,x23
00a5ad3c	bl 0x00c36530
00a5ad40	cbz x0,0x00a5ad94
00a5ad44	ldr x8,[x0, #0x20]
00a5ad48	mov w9,#0x28
00a5ad4c	mov x10,sp
00a5ad50	madd x9,x24,x9,x10
00a5ad54	str x8,[x9, #0x20]
00a5ad58	ldr q0,[x0, #0x10]
00a5ad5c	str q0,[x9, #0x10]
00a5ad60	ldr q0,[x0]
00a5ad64	str q0,[x9]
00a5ad68	ldr x8,[x21]
00a5ad6c	cbz x8,0x00a5ada0
00a5ad70	ldr x8,[x8, #0xe0]
00a5ad74	cbz x8,0x00a5ada0
00a5ad78	ldr x0,[x21, #0xa8]
00a5ad7c	mov w9,#0xffffffff
00a5ad80	mov x1,sp
00a5ad84	str w9,[x21, #0x6c]
00a5ad88	blr x8
00a5ad8c	cbnz w0,0x00a5adc8
00a5ad90	b 0x00a5ada0
00a5ad94	cbz x24,0x00a5adc8
00a5ad98	ldr x8,[x21]
00a5ad9c	cbnz x8,0x00a5ad70
00a5ada0	bl 0x00c342a0
00a5ada4	adrp x0,0x2a5000
00a5ada8	adrp x2,0x2bd000
00a5adac	add x0,x0,#0xf9d
00a5adb0	add x2,x2,#0xaa6
00a5adb4	orr w1,wzr,#0xff
00a5adb8	bl 0x00c342b0
00a5adbc	orr w0,wzr,#0x6
00a5adc0	mov w1,#0xdd
00a5adc4	b 0x00a5af0c
00a5adc8	ldr x8,[x21]
00a5adcc	cbz w22,0x00a5adf4
00a5add0	ldr x25,[x8, #0x98]
00a5add4	cbnz x25,0x00a5adfc
00a5add8	bl 0x00c342a0
00a5addc	adrp x0,0x2a5000
00a5ade0	adrp x2,0x2bd000
00a5ade4	add x0,x0,#0xf9d
00a5ade8	add x2,x2,#0xaa6
00a5adec	mov w1,#0x108
00a5adf0	b 0x00a5af00
00a5adf4	ldr x25,[x8, #0xa0]
00a5adf8	cbz x25,0x00a5ae68
00a5adfc	ldr x22,[x21, #0xa8]
00a5ae00	cbz x20,0x00a5ae40
00a5ae04	mov x0,x21
00a5ae08	bl 0x00c3cca0
00a5ae0c	sxtw x24,w0
00a5ae10	cbz x19,0x00a5ae48
00a5ae14	mov x0,x21
00a5ae18	bl 0x00c36300
00a5ae1c	sxtw x4,w0
00a5ae20	b 0x00a5ae4c
00a5ae24	bl 0x00c342a0
00a5ae28	adrp x0,0x2a5000
00a5ae2c	adrp x2,0x2bd000
00a5ae30	add x0,x0,#0xf9d
00a5ae34	add x2,x2,#0xaa6
00a5ae38	mov w1,#0xd4
00a5ae3c	b 0x00a5af00
00a5ae40	mov x24,xzr
00a5ae44	cbnz x19,0x00a5ae14
00a5ae48	mov x4,xzr
00a5ae4c	mov x0,x22
00a5ae50	mov x1,x20
00a5ae54	mov x2,x24
00a5ae58	mov x3,x19
00a5ae5c	mov x5,x23
00a5ae60	blr x25
00a5ae64	b 0x00a5af18
00a5ae68	bl 0x00c342a0
00a5ae6c	adrp x0,0x2a5000
00a5ae70	adrp x2,0x2bd000
00a5ae74	add x0,x0,#0xf9d
00a5ae78	add x2,x2,#0xaa6
00a5ae7c	mov w1,#0x117
00a5ae80	b 0x00a5af00
00a5ae84	add x8,x21,#0x28
00a5ae88	sxtw x2,w0
00a5ae8c	mov x0,x8
00a5ae90	mov x1,x19
00a5ae94	b 0x00a5aaf8
00a5ae98	cmp w8,#0x1
00a5ae9c	b.gt 0x00a5aed8
00a5aea0	ldr x0,[x25, #0x68]
00a5aea4	adrp x26,0x2a5000
00a5aea8	add x26,x26,#0xf9d
00a5aeac	mov w2,#0x69b
00a5aeb0	mov x1,x26
00a5aeb4	bl 0x00c32310
00a5aeb8	ldr x0,[x25, #0x78]
00a5aebc	bl 0x00c3b690
00a5aec0	ldr x0,[x25, #0x88]
00a5aec4	bl 0x00c34d40
00a5aec8	mov w2,#0x69e
00a5aecc	mov x0,x25
00a5aed0	mov x1,x26
00a5aed4	bl 0x00c32310
00a5aed8	str x24,[x21, #0xb0]
00a5aedc	mov x27,x24
00a5aee0	ldr x8,[x27, #0x78]!
00a5aee4	cbnz x8,0x00a5a7b0
00a5aee8	bl 0x00c342a0
00a5aeec	adrp x0,0x2a5000
00a5aef0	adrp x2,0x2bd000
00a5aef4	add x0,x0,#0xf9d
00a5aef8	add x2,x2,#0xaa6
00a5aefc	mov w1,#0xc4
00a5af00	bl 0x00c342b0
00a5af04	orr w0,wzr,#0x6
00a5af08	mov w1,#0x86
00a5af0c	mov x2,xzr
00a5af10	bl 0x00c342c0
00a5af14	mov w0,wzr
00a5af18	ldp x29,x30,[sp, #0x100]
00a5af1c	ldp x20,x19,[sp, #0xf0]
00a5af20	ldp x22,x21,[sp, #0xe0]
00a5af24	ldp x24,x23,[sp, #0xd0]
00a5af28	ldp x26,x25,[sp, #0xc0]
00a5af2c	ldp x28,x27,[sp, #0xb0]
00a5af30	add sp,sp,#0x110
00a5af34	ret
00a5af38	adrp x0,0x2c9000
00a5af3c	adrp x1,0x2a5000
00a5af40	add x0,x0,#0x8cb
00a5af44	add x1,x1,#0xf9d
00a5af48	mov w2,#0x175
00a5af4c	bl 0x00c3c240
