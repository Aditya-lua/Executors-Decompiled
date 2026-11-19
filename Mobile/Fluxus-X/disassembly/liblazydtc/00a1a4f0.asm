; BN_generate_prime_ex2 @ 00a1a4f0
00a1a4f0	sub sp,sp,#0xc0
00a1a4f4	cmp w1,#0x800
00a1a4f8	mov w8,#0x40
00a1a4fc	mov w9,#0x80
00a1a500	stp x26,x25,[sp, #0x70]
00a1a504	csel w26,w9,w8,gt
00a1a508	cmp w1,#0x1
00a1a50c	stp x28,x27,[sp, #0x60]
00a1a510	stp x24,x23,[sp, #0x80]
00a1a514	stp x22,x21,[sp, #0x90]
00a1a518	stp x20,x19,[sp, #0xa0]
00a1a51c	stp x29,x30,[sp, #0xb0]
00a1a520	add x29,sp,#0xb0
00a1a524	b.gt 0x00a1a544
00a1a528	bl 0x00c342a0
00a1a52c	adrp x0,0x2c1000
00a1a530	adrp x2,0x2a5000
00a1a534	add x0,x0,#0xa97
00a1a538	add x2,x2,#0xd04
00a1a53c	mov w1,#0x87
00a1a540	b 0x00a1a590
00a1a544	mov x19,x6
00a1a548	mov x21,x5
00a1a54c	mov x23,x4
00a1a550	mov x22,x3
00a1a554	mov w24,w2
00a1a558	mov w25,w1
00a1a55c	mov x27,x0
00a1a560	cmp w1,#0x3
00a1a564	b.eq 0x00a1a5cc
00a1a568	cmp w25,#0x5
00a1a56c	b.gt 0x00a1a5cc
00a1a570	cbz w24,0x00a1a5cc
00a1a574	cbnz x22,0x00a1a5cc
00a1a578	bl 0x00c342a0
00a1a57c	adrp x0,0x2c1000
00a1a580	adrp x2,0x2a5000
00a1a584	add x0,x0,#0xa97
00a1a588	add x2,x2,#0xd04
00a1a58c	mov w1,#0x8f
00a1a590	bl 0x00c342b0
00a1a594	orr w0,wzr,#0x3
00a1a598	mov w1,#0x76
00a1a59c	mov x2,xzr
00a1a5a0	bl 0x00c342c0
00a1a5a4	mov w28,wzr
00a1a5a8	mov w0,w28
00a1a5ac	ldp x29,x30,[sp, #0xb0]
00a1a5b0	ldp x20,x19,[sp, #0xa0]
00a1a5b4	ldp x22,x21,[sp, #0x90]
00a1a5b8	ldp x24,x23,[sp, #0x80]
00a1a5bc	ldp x26,x25,[sp, #0x70]
00a1a5c0	ldp x28,x27,[sp, #0x60]
00a1a5c4	add sp,sp,#0xc0
00a1a5c8	ret
00a1a5cc	adrp x1,0x2c1000
00a1a5d0	add x1,x1,#0xa97
00a1a5d4	mov w0,#0x1000
00a1a5d8	mov w2,#0x93
00a1a5dc	bl 0x00c34250
00a1a5e0	cbz x0,0x00a1a678
00a1a5e4	mov x20,x0
00a1a5e8	mov x0,x19
00a1a5ec	bl 0x00c38a90
00a1a5f0	mov x0,x19
00a1a5f4	bl 0x00c38a40
00a1a5f8	str x0,[sp, #0x50]
00a1a5fc	cbz x0,0x00a1ab8c
00a1a600	cmp w25,#0x1, LSL #12
00a1a604	mov w8,#0x800
00a1a608	mov w9,#0x400
00a1a60c	mov w10,#0x2
00a1a610	mov w11,#0x4
00a1a614	orr w12,wzr,#0x3
00a1a618	mov w13,#0x5
00a1a61c	csel w8,w9,w8,le
00a1a620	cmp w24,#0x0
00a1a624	csel x10,x11,x10,ne
00a1a628	csel x11,x12,x13,eq
00a1a62c	mov w9,#0x80
00a1a630	str x10,[sp, #0x10]
00a1a634	mov w10,#0x40
00a1a638	stp x21,x11,[sp, #0x20]
00a1a63c	csinc x11,x12,xzr,ne
00a1a640	cmp w25,#0x201
00a1a644	csel w9,w10,w9,lt
00a1a648	orr w10,wzr,#0x180
00a1a64c	cmp w25,#0x801
00a1a650	csel w8,w10,w8,lt
00a1a654	cmp w25,#0x401
00a1a658	str x22,[sp, #0x58]
00a1a65c	csel w22,w9,w8,lt
00a1a660	sub x8,x22,#0x1
00a1a664	str wzr,[sp, #0x48]
00a1a668	str x11,[sp, #0x18]
00a1a66c	str x8,[sp, #0x40]
00a1a670	str w26,[sp, #0x4c]
00a1a674	b 0x00a1a6ac
00a1a678	bl 0x00c342a0
00a1a67c	adrp x0,0x2c1000
00a1a680	adrp x2,0x2a5000
00a1a684	add x0,x0,#0xa97
00a1a688	add x2,x2,#0xd04
00a1a68c	mov w1,#0x95
00a1a690	bl 0x00c342b0
00a1a694	mov w1,#0x100
00a1a698	orr w0,wzr,#0x3
00a1a69c	movk w1,#0xc, LSL #16
00a1a6a0	b 0x00a1a59c
00a1a6a4	ldr x23,[sp, #0x8]
00a1a6a8	str w26,[sp, #0x48]
00a1a6ac	ldr x8,[sp, #0x58]
00a1a6b0	cbz x8,0x00a1a8a0
00a1a6b4	mov x0,x19
00a1a6b8	bl 0x00c38a90
00a1a6bc	mov x0,x19
00a1a6c0	bl 0x00c38a40
00a1a6c4	adrp x26,0x753000
00a1a6c8	add x26,x26,#0x948
00a1a6cc	str x0,[sp, #0x38]
00a1a6d0	cbz x0,0x00a1ab84
00a1a6d4	ldr x8,[sp, #0x40]
00a1a6d8	ldr x0,[sp, #0x58]
00a1a6dc	ldrh w28,[x26, x8, LSL #0x1]
00a1a6e0	bl 0x00c38cf0
00a1a6e4	cmp x0,x28
00a1a6e8	b.ls 0x00a1a6f8
00a1a6ec	ldr x0,[sp, #0x58]
00a1a6f0	bl 0x00c38cf0
00a1a6f4	mov x28,x0
00a1a6f8	mov w3,#0x1
00a1a6fc	mov x0,x27
00a1a700	mov w1,w25
00a1a704	mov w2,wzr
00a1a708	mov w4,wzr
00a1a70c	mov x5,x19
00a1a710	bl 0x00c39170
00a1a714	cbz w0,0x00a1ab84
00a1a718	mvn x28,x28
00a1a71c	ldr x1,[sp, #0x38]
00a1a720	ldr x3,[sp, #0x58]
00a1a724	mov x0,xzr
00a1a728	mov x2,x27
00a1a72c	mov x4,x19
00a1a730	bl 0x00c38ab0
00a1a734	cbz w0,0x00a1ab84
00a1a738	ldr x2,[sp, #0x38]
00a1a73c	mov x0,x27
00a1a740	mov x1,x27
00a1a744	bl 0x00c38880
00a1a748	cbz w0,0x00a1ab84
00a1a74c	cbz x23,0x00a1a768
00a1a750	mov x0,x27
00a1a754	mov x1,x27
00a1a758	mov x2,x23
00a1a75c	bl 0x00c38870
00a1a760	cbnz w0,0x00a1a778
00a1a764	b 0x00a1ab84
00a1a768	ldr x1,[sp, #0x18]
00a1a76c	mov x0,x27
00a1a770	bl 0x00c376e0
00a1a774	cbz w0,0x00a1ab84
00a1a778	mov x0,x27
00a1a77c	bl 0x00c322f0
00a1a780	cmp w0,w25
00a1a784	b.lt 0x00a1a79c
00a1a788	mov x0,x27
00a1a78c	bl 0x00c38cf0
00a1a790	ldr x8,[sp, #0x28]
00a1a794	cmp x0,x8
00a1a798	b.cs 0x00a1a7b0
00a1a79c	ldr x2,[sp, #0x58]
00a1a7a0	mov x0,x27
00a1a7a4	mov x1,x27
00a1a7a8	bl 0x00c38870
00a1a7ac	cbz w0,0x00a1ab84
00a1a7b0	mov w21,#0x1
00a1a7b4	ldrh w1,[x26, x21, LSL #0x1]
00a1a7b8	mov x0,x27
00a1a7bc	bl 0x00c39200
00a1a7c0	cmn x0,#0x1
00a1a7c4	b.eq 0x00a1ab84
00a1a7c8	strh w0,[x20, x21, LSL #0x1]
00a1a7cc	add x21,x21,#0x1
00a1a7d0	cmp x21,x22
00a1a7d4	b.cc 0x00a1a7b4
00a1a7d8	stp x28,x23,[sp]
00a1a7dc	mov x28,xzr
00a1a7e0	str x19,[sp, #0x30]
00a1a7e4	cmp w25,#0x20
00a1a7e8	lsr x8,x28,#0x1f
00a1a7ec	cset w9,lt
00a1a7f0	cmp x8,#0x0
00a1a7f4	cset w8,eq
00a1a7f8	and w23,w9,w8
00a1a7fc	mov w21,#0x1
00a1a800	ldrh w19,[x26, x21, LSL #0x1]
00a1a804	cbz w23,0x00a1a828
00a1a808	mov x0,x27
00a1a80c	mul x26,x19,x19
00a1a810	bl 0x00c38cf0
00a1a814	add x8,x0,x28
00a1a818	cmp x26,x8
00a1a81c	adrp x26,0x753000
00a1a820	add x26,x26,#0x948
00a1a824	b.hi 0x00a1aa04
00a1a828	ldrh w8,[x20, x21, LSL #0x1]
00a1a82c	add x8,x28,x8
00a1a830	udiv x9,x8,x19
00a1a834	msub x8,x9,x19,x8
00a1a838	cbz w24,0x00a1a848
00a1a83c	cmp x8,#0x2
00a1a840	b.cs 0x00a1a84c
00a1a844	b 0x00a1a85c
00a1a848	cbz x8,0x00a1a85c
00a1a84c	add x21,x21,#0x1
00a1a850	cmp x21,x22
00a1a854	b.cc 0x00a1a800
00a1a858	b 0x00a1aa04
00a1a85c	ldr x0,[sp, #0x58]
00a1a860	bl 0x00c38cf0
00a1a864	ldr x8,[sp]
00a1a868	add x28,x0,x28
00a1a86c	cmp x28,x8
00a1a870	b.ls 0x00a1a7e4
00a1a874	ldr x19,[sp, #0x30]
00a1a878	mov w3,#0x1
00a1a87c	mov x0,x27
00a1a880	mov w1,w25
00a1a884	mov w2,wzr
00a1a888	mov w4,wzr
00a1a88c	mov x5,x19
00a1a890	bl 0x00c39170
00a1a894	ldp x28,x23,[sp]
00a1a898	cbnz w0,0x00a1a71c
00a1a89c	b 0x00a1ab84
00a1a8a0	mov w2,#0x1
00a1a8a4	mov w3,#0x1
00a1a8a8	mov x0,x27
00a1a8ac	mov w1,w25
00a1a8b0	mov w4,wzr
00a1a8b4	mov x5,x19
00a1a8b8	bl 0x00c39150
00a1a8bc	adrp x9,0x753000
00a1a8c0	add x9,x9,#0x948
00a1a8c4	cbz w0,0x00a1ab8c
00a1a8c8	ldr x8,[sp, #0x40]
00a1a8cc	str x23,[sp, #0x8]
00a1a8d0	ldrh w8,[x9, x8, LSL #0x1]
00a1a8d4	mvn x8,x8
00a1a8d8	str x8,[sp, #0x38]
00a1a8dc	cbz w24,0x00a1a8f0
00a1a8e0	mov w1,#0x1
00a1a8e4	mov x0,x27
00a1a8e8	bl 0x00c38db0
00a1a8ec	cbz w0,0x00a1ab8c
00a1a8f0	adrp x26,0x753000
00a1a8f4	mov w21,#0x1
00a1a8f8	add x26,x26,#0x948
00a1a8fc	ldrh w1,[x26, x21, LSL #0x1]
00a1a900	mov x0,x27
00a1a904	bl 0x00c39200
00a1a908	cmn x0,#0x1
00a1a90c	b.eq 0x00a1ab8c
00a1a910	strh w0,[x20, x21, LSL #0x1]
00a1a914	add x21,x21,#0x1
00a1a918	cmp x21,x22
00a1a91c	b.cc 0x00a1a8fc
00a1a920	mov x28,xzr
00a1a924	str x19,[sp, #0x30]
00a1a928	cmp w25,#0x20
00a1a92c	lsr x8,x28,#0x1f
00a1a930	cset w9,lt
00a1a934	cmp x8,#0x0
00a1a938	cset w8,eq
00a1a93c	and w23,w9,w8
00a1a940	mov w21,#0x1
00a1a944	ldrh w19,[x26, x21, LSL #0x1]
00a1a948	cbz w23,0x00a1a96c
00a1a94c	mov x0,x27
00a1a950	mul x26,x19,x19
00a1a954	bl 0x00c38cf0
00a1a958	add x8,x0,x28
00a1a95c	cmp x26,x8
00a1a960	adrp x26,0x753000
00a1a964	add x26,x26,#0x948
00a1a968	b.hi 0x00a1a9b8
00a1a96c	ldrh w8,[x20, x21, LSL #0x1]
00a1a970	add x8,x28,x8
00a1a974	udiv x9,x8,x19
00a1a978	msub x8,x9,x19,x8
00a1a97c	cbz w24,0x00a1a98c
00a1a980	cmp x8,#0x2
00a1a984	b.cs 0x00a1a990
00a1a988	b 0x00a1a9a0
00a1a98c	cbz x8,0x00a1a9a0
00a1a990	add x21,x21,#0x1
00a1a994	cmp x21,x22
00a1a998	b.cc 0x00a1a944
00a1a99c	b 0x00a1a9b8
00a1a9a0	ldr x8,[sp, #0x10]
00a1a9a4	add x28,x28,x8
00a1a9a8	ldp x19,x8,[sp, #0x30]
00a1a9ac	cmp x28,x8
00a1a9b0	b.ls 0x00a1a928
00a1a9b4	b 0x00a1a9dc
00a1a9b8	mov x0,x27
00a1a9bc	mov x1,x28
00a1a9c0	bl 0x00c376e0
00a1a9c4	cbz w0,0x00a1abb0
00a1a9c8	mov x0,x27
00a1a9cc	bl 0x00c322f0
00a1a9d0	ldr x19,[sp, #0x30]
00a1a9d4	cmp w0,w25
00a1a9d8	b.eq 0x00a1aa24
00a1a9dc	mov w2,#0x1
00a1a9e0	mov w3,#0x1
00a1a9e4	mov x0,x27
00a1a9e8	mov w1,w25
00a1a9ec	mov w4,wzr
00a1a9f0	mov x5,x19
00a1a9f4	bl 0x00c39150
00a1a9f8	mov w28,wzr
00a1a9fc	cbnz w0,0x00a1a8dc
00a1aa00	b 0x00a1ab90
00a1aa04	mov x0,x27
00a1aa08	mov x1,x28
00a1aa0c	bl 0x00c376e0
00a1aa10	ldr x19,[sp, #0x30]
00a1aa14	mov w28,w0
00a1aa18	mov x0,x19
00a1aa1c	bl 0x00c38a20
00a1aa20	cbz w28,0x00a1ab90
00a1aa24	ldr x21,[sp, #0x20]
00a1aa28	ldr x23,[sp, #0x8]
00a1aa2c	ldr w26,[sp, #0x4c]
00a1aa30	cbz x21,0x00a1aa7c
00a1aa34	ldr w8,[x21]
00a1aa38	cmp w8,#0x2
00a1aa3c	b.eq 0x00a1aa64
00a1aa40	cmp w8,#0x1
00a1aa44	b.ne 0x00a1ab8c
00a1aa48	ldr x8,[x21, #0x10]
00a1aa4c	cbz x8,0x00a1aa7c
00a1aa50	ldr x2,[x21, #0x8]
00a1aa54	ldr w1,[sp, #0x48]
00a1aa58	mov w0,wzr
00a1aa5c	blr x8
00a1aa60	b 0x00a1aa7c
00a1aa64	ldr x8,[x21, #0x10]
00a1aa68	ldr w1,[sp, #0x48]
00a1aa6c	mov w0,wzr
00a1aa70	mov x2,x21
00a1aa74	blr x8
00a1aa78	cbz w0,0x00a1ab8c
00a1aa7c	ldr w8,[sp, #0x48]
00a1aa80	add w28,w8,#0x1
00a1aa84	cbz w24,0x00a1ab50
00a1aa88	ldr x0,[sp, #0x50]
00a1aa8c	mov x1,x27
00a1aa90	bl 0x00c39080
00a1aa94	cbz w0,0x00a1ab8c
00a1aa98	mov w26,w28
00a1aa9c	str x23,[sp, #0x8]
00a1aaa0	mov w23,wzr
00a1aaa4	mov w1,#0x1
00a1aaa8	mov x0,x27
00a1aaac	mov x2,x19
00a1aab0	mov w3,wzr
00a1aab4	mov x4,x21
00a1aab8	bl 0x00a1abb8
00a1aabc	cmn w0,#0x1
00a1aac0	b.eq 0x00a1ab8c
00a1aac4	cbz w0,0x00a1a6a4
00a1aac8	ldr x0,[sp, #0x50]
00a1aacc	mov w1,#0x1
00a1aad0	mov x2,x19
00a1aad4	mov w3,wzr
00a1aad8	mov x4,x21
00a1aadc	bl 0x00a1abb8
00a1aae0	ldr w28,[sp, #0x4c]
00a1aae4	cmn w0,#0x1
00a1aae8	b.eq 0x00a1ab8c
00a1aaec	cbz w0,0x00a1a6a4
00a1aaf0	cbz x21,0x00a1ab3c
00a1aaf4	ldr w8,[x21]
00a1aaf8	cmp w8,#0x2
00a1aafc	b.eq 0x00a1ab24
00a1ab00	cmp w8,#0x1
00a1ab04	b.ne 0x00a1ab8c
00a1ab08	ldr x8,[x21, #0x10]
00a1ab0c	cbz x8,0x00a1ab3c
00a1ab10	ldr x2,[x21, #0x8]
00a1ab14	ldr w1,[sp, #0x48]
00a1ab18	mov w0,#0x2
00a1ab1c	blr x8
00a1ab20	b 0x00a1ab3c
00a1ab24	ldr x8,[x21, #0x10]
00a1ab28	ldr w1,[sp, #0x48]
00a1ab2c	mov w0,#0x2
00a1ab30	mov x2,x21
00a1ab34	blr x8
00a1ab38	cbz w0,0x00a1ab8c
00a1ab3c	add w23,w23,#0x1
00a1ab40	cmp w23,w28
00a1ab44	mov w28,#0x1
00a1ab48	b.cc 0x00a1aaa4
00a1ab4c	b 0x00a1ab90
00a1ab50	mov x0,x27
00a1ab54	mov w1,w26
00a1ab58	mov x2,x19
00a1ab5c	mov w3,wzr
00a1ab60	mov x4,x21
00a1ab64	bl 0x00a1abb8
00a1ab68	str w28,[sp, #0x48]
00a1ab6c	cbz w0,0x00a1a6ac
00a1ab70	cmn w0,#0x1
00a1ab74	mov w28,wzr
00a1ab78	b.eq 0x00a1ab90
00a1ab7c	mov w28,#0x1
00a1ab80	b 0x00a1ab90
00a1ab84	mov x0,x19
00a1ab88	bl 0x00c38a20
00a1ab8c	mov w28,wzr
00a1ab90	adrp x1,0x2c1000
00a1ab94	add x1,x1,#0xa97
00a1ab98	mov w2,#0xce
00a1ab9c	mov x0,x20
00a1aba0	bl 0x00c32310
00a1aba4	mov x0,x19
00a1aba8	bl 0x00c38a20
00a1abac	b 0x00a1a5a8
00a1abb0	ldr x19,[sp, #0x30]
00a1abb4	b 0x00a1ab8c
