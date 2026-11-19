; OSSL_parse_url @ 00b1a64c
00b1a64c	sub sp,sp,#0xd0
00b1a650	stp x26,x25,[sp, #0x80]
00b1a654	stp x24,x23,[sp, #0x90]
00b1a658	stp x22,x21,[sp, #0xa0]
00b1a65c	stp x20,x19,[sp, #0xb0]
00b1a660	mov x19,x7
00b1a664	mov x20,x5
00b1a668	mov x21,x4
00b1a66c	mov x22,x3
00b1a670	mov x23,x2
00b1a674	mov x24,x1
00b1a678	mov x26,x0
00b1a67c	stp x28,x27,[sp, #0x70]
00b1a680	stp x29,x30,[sp, #0xc0]
00b1a684	add x29,sp,#0xc0
00b1a688	cbz x1,0x00b1a690
00b1a68c	str xzr,[x24]
00b1a690	cbz x23,0x00b1a698
00b1a694	str xzr,[x23]
00b1a698	cbz x22,0x00b1a6a0
00b1a69c	str xzr,[x22]
00b1a6a0	cbz x21,0x00b1a6a8
00b1a6a4	str xzr,[x21]
00b1a6a8	ldr x8,[x29, #0x10]
00b1a6ac	cbz x20,0x00b1a6b4
00b1a6b0	str wzr,[x20]
00b1a6b4	cbz x6,0x00b1a6bc
00b1a6b8	str xzr,[x6]
00b1a6bc	cbz x8,0x00b1a6c4
00b1a6c0	str xzr,[x8]
00b1a6c4	cbz x19,0x00b1a6cc
00b1a6c8	str xzr,[x19]
00b1a6cc	cbz x26,0x00b1a748
00b1a6d0	adrp x1,0x2c0000
00b1a6d4	add x1,x1,#0xfba
00b1a6d8	mov x0,x26
00b1a6dc	stp x6,x8,[sp, #0x58]
00b1a6e0	bl 0x00c30c40
00b1a6e4	mov x8,x26
00b1a6e8	mov x27,x26
00b1a6ec	cbz x0,0x00b1a700
00b1a6f0	cmp x0,x26
00b1a6f4	b.eq 0x00b1aaa0
00b1a6f8	add x27,x0,#0x3
00b1a6fc	mov x8,x0
00b1a700	mov w1,#0x40
00b1a704	mov x0,x27
00b1a708	str x8,[sp, #0x48]
00b1a70c	bl 0x00c30890
00b1a710	cmp x0,#0x0
00b1a714	csinc x28,x27,x0,eq
00b1a718	ldrb w8,[x28]
00b1a71c	csel x25,x27,x0,eq
00b1a720	cmp w8,#0x5b
00b1a724	b.ne 0x00b1a77c
00b1a728	add x0,x28,#0x1
00b1a72c	mov w1,#0x5d
00b1a730	bl 0x00c30890
00b1a734	cbz x0,0x00b1aaa0
00b1a738	stp x20,x25,[sp, #0x38]
00b1a73c	str x19,[sp, #0x50]
00b1a740	add x20,x0,#0x1
00b1a744	b 0x00b1a7e0
00b1a748	bl 0x00c342a0
00b1a74c	adrp x0,0x2aa000
00b1a750	adrp x2,0x2a8000
00b1a754	add x0,x0,#0xc80
00b1a758	add x2,x2,#0xa51
00b1a75c	mov w1,#0x46
00b1a760	bl 0x00c342b0
00b1a764	mov w1,#0x102
00b1a768	mov w0,#0x3d
00b1a76c	movk w1,#0xc, LSL #16
00b1a770	mov x2,xzr
00b1a774	bl 0x00c342c0
00b1a778	b 0x00b1aba0
00b1a77c	mov w1,#0x3a
00b1a780	mov x0,x28
00b1a784	stp x20,x25,[sp, #0x38]
00b1a788	str x19,[sp, #0x50]
00b1a78c	bl 0x00c30890
00b1a790	mov x20,x0
00b1a794	cbnz x0,0x00b1a7e0
00b1a798	mov w1,#0x2f
00b1a79c	mov x0,x28
00b1a7a0	bl 0x00c30890
00b1a7a4	mov x20,x0
00b1a7a8	cbnz x0,0x00b1a7e0
00b1a7ac	orr w1,wzr,#0x3f
00b1a7b0	mov x0,x28
00b1a7b4	bl 0x00c30890
00b1a7b8	mov x20,x0
00b1a7bc	cbnz x0,0x00b1a7e0
00b1a7c0	mov w1,#0x23
00b1a7c4	mov x0,x28
00b1a7c8	bl 0x00c30890
00b1a7cc	mov x20,x0
00b1a7d0	cbnz x0,0x00b1a7e0
00b1a7d4	mov x0,x28
00b1a7d8	bl 0x00c2ff50
00b1a7dc	add x20,x28,x0
00b1a7e0	mov x8,x20
00b1a7e4	ldrb w9,[x8], #0x1
00b1a7e8	adrp x10,0x2cb000
00b1a7ec	add x10,x10,#0x723
00b1a7f0	adrp x1,0x2cb000
00b1a7f4	cmp w9,#0x3a
00b1a7f8	csel x25,x8,x10,eq
00b1a7fc	add x1,x1,#0x1c1
00b1a800	sub x2,x29,#0x54
00b1a804	mov x0,x25
00b1a808	csel x19,x8,x20,eq
00b1a80c	bl 0x00c30c30
00b1a810	cmp w0,#0x1
00b1a814	b.lt 0x00b1aa2c
00b1a818	ldur w8,[x29, #-0x54]
00b1a81c	lsr w8,w8,#0x10
00b1a820	cbnz w8,0x00b1aa2c
00b1a824	sub x8,x25,#0x1
00b1a828	str x21,[sp, #0x30]
00b1a82c	ldrb w9,[x8, #0x1]!
00b1a830	sub w9,w9,#0x30
00b1a834	cmp w9,#0xa
00b1a838	b.cc 0x00b1a82c
00b1a83c	sub x10,x8,x25
00b1a840	add x8,x19,x10
00b1a844	cmp x25,x19
00b1a848	csel x21,x8,x19,eq
00b1a84c	ldrb w8,[x21]
00b1a850	cmp w8,#0x3f
00b1a854	b.hi 0x00b1aa6c
00b1a858	mov w9,#0x1
00b1a85c	lsl x8,x9,x8
00b1a860	orr x9,xzr,#-0x7fffffffffffffff
00b1a864	movk x9,#0x8008, LSL #32
00b1a868	tst x8,x9
00b1a86c	b.eq 0x00b1aa6c
00b1a870	ldr x8,[sp, #0x50]
00b1a874	mov x0,x21
00b1a878	stp x10,x22,[sp, #0x20]
00b1a87c	cmp x8,#0x0
00b1a880	cset w19,eq
00b1a884	bl 0x00c2ff50
00b1a888	add x22,x21,x0
00b1a88c	orr w1,wzr,#0x3f
00b1a890	mov x0,x21
00b1a894	bl 0x00c30890
00b1a898	cmp x0,#0x0
00b1a89c	cset w9,eq
00b1a8a0	orr w9,w19,w9
00b1a8a4	csel x8,x21,x0,eq
00b1a8a8	cmp w9,#0x0
00b1a8ac	str x21,[sp, #0x18]
00b1a8b0	csel x19,x22,x0,ne
00b1a8b4	csinc x21,x22,x0,ne
00b1a8b8	mov w1,#0x23
00b1a8bc	mov x0,x8
00b1a8c0	bl 0x00c30890
00b1a8c4	cmp x21,x19
00b1a8c8	csel x8,x0,x19,eq
00b1a8cc	cmp x0,#0x0
00b1a8d0	csel x19,x19,x8,eq
00b1a8d4	csel x8,x22,x0,eq
00b1a8d8	stp x8,x21,[sp, #0x8]
00b1a8dc	csinc x21,x22,x0,eq
00b1a8e0	str x22,[sp]
00b1a8e4	cbz x24,0x00b1a90c
00b1a8e8	ldr x8,[sp, #0x48]
00b1a8ec	adrp x2,0x2aa000
00b1a8f0	add x2,x2,#0xc80
00b1a8f4	mov w3,#0x23
00b1a8f8	sub x1,x8,x26
00b1a8fc	mov x0,x26
00b1a900	bl 0x00c36180
00b1a904	str x0,[x24]
00b1a908	cbz x0,0x00b1abc4
00b1a90c	mov x26,x21
00b1a910	str x19,[sp, #0x48]
00b1a914	ldr x19,[sp, #0x50]
00b1a918	ldp x22,x21,[sp, #0x28]
00b1a91c	cbz x22,0x00b1a940
00b1a920	adrp x2,0x2aa000
00b1a924	sub x1,x20,x28
00b1a928	add x2,x2,#0xc80
00b1a92c	mov w3,#0x23
00b1a930	mov x0,x28
00b1a934	bl 0x00c36180
00b1a938	str x0,[x22]
00b1a93c	cbz x0,0x00b1aacc
00b1a940	cbz x21,0x00b1a964
00b1a944	ldr x1,[sp, #0x20]
00b1a948	adrp x2,0x2aa000
00b1a94c	add x2,x2,#0xc80
00b1a950	mov w3,#0x23
00b1a954	mov x0,x25
00b1a958	bl 0x00c36180
00b1a95c	str x0,[x21]
00b1a960	cbz x0,0x00b1aacc
00b1a964	cbz x23,0x00b1a98c
00b1a968	ldr x8,[sp, #0x40]
00b1a96c	adrp x2,0x2aa000
00b1a970	add x2,x2,#0xc80
00b1a974	mov w3,#0x23
00b1a978	sub x1,x8,x27
00b1a97c	mov x0,x27
00b1a980	bl 0x00c36180
00b1a984	str x0,[x23]
00b1a988	cbz x0,0x00b1aacc
00b1a98c	cbz x19,0x00b1a9b0
00b1a990	ldp x8,x0,[sp, #0x8]
00b1a994	adrp x2,0x2aa000
00b1a998	add x2,x2,#0xc80
00b1a99c	mov w3,#0x23
00b1a9a0	sub x1,x8,x0
00b1a9a4	bl 0x00c36180
00b1a9a8	str x0,[x19]
00b1a9ac	cbz x0,0x00b1aacc
00b1a9b0	ldr x8,[sp, #0x60]
00b1a9b4	cbz x8,0x00b1a9e0
00b1a9b8	ldr x8,[sp]
00b1a9bc	adrp x2,0x2aa000
00b1a9c0	add x2,x2,#0xc80
00b1a9c4	mov w3,#0x23
00b1a9c8	sub x1,x8,x26
00b1a9cc	mov x0,x26
00b1a9d0	bl 0x00c36180
00b1a9d4	ldr x8,[sp, #0x60]
00b1a9d8	str x0,[x8]
00b1a9dc	cbz x0,0x00b1aacc
00b1a9e0	ldr x9,[sp, #0x38]
00b1a9e4	cbz x9,0x00b1a9f0
00b1a9e8	ldur w8,[x29, #-0x54]
00b1a9ec	str w8,[x9]
00b1a9f0	ldr x0,[sp, #0x18]
00b1a9f4	ldr x25,[sp, #0x58]
00b1a9f8	ldrb w8,[x0]
00b1a9fc	cmp w8,#0x2f
00b1aa00	b.ne 0x00b1abd0
00b1aa04	cbz x25,0x00b1ac14
00b1aa08	ldr x8,[sp, #0x48]
00b1aa0c	adrp x2,0x2aa000
00b1aa10	add x2,x2,#0xc80
00b1aa14	mov w3,#0x23
00b1aa18	sub x1,x8,x0
00b1aa1c	bl 0x00c36180
00b1aa20	str x0,[x25]
00b1aa24	cbnz x0,0x00b1ac14
00b1aa28	b 0x00b1aacc
00b1aa2c	bl 0x00c342a0
00b1aa30	adrp x0,0x2aa000
00b1aa34	adrp x2,0x2a8000
00b1aa38	add x0,x0,#0xc80
00b1aa3c	add x2,x2,#0xa51
00b1aa40	mov w1,#0x7a
00b1aa44	bl 0x00c342b0
00b1aa48	adrp x2,0x2b6000
00b1aa4c	add x2,x2,#0xc62
00b1aa50	mov w0,#0x3d
00b1aa54	mov w1,#0x7b
00b1aa58	mov x3,x25
00b1aa5c	bl 0x00c342c0
00b1aa60	ldr x19,[sp, #0x50]
00b1aa64	cbnz x24,0x00b1aad0
00b1aa68	b 0x00b1aae8
00b1aa6c	bl 0x00c342a0
00b1aa70	adrp x0,0x2aa000
00b1aa74	adrp x2,0x2a8000
00b1aa78	add x0,x0,#0xc80
00b1aa7c	add x2,x2,#0xa51
00b1aa80	mov w1,#0x85
00b1aa84	bl 0x00c342b0
00b1aa88	mov w0,#0x3d
00b1aa8c	mov w1,#0x7d
00b1aa90	mov x2,xzr
00b1aa94	bl 0x00c342c0
00b1aa98	ldr x19,[sp, #0x50]
00b1aa9c	ldr x21,[sp, #0x30]
00b1aaa0	bl 0x00c342a0
00b1aaa4	adrp x0,0x2aa000
00b1aaa8	adrp x2,0x2a8000
00b1aaac	add x0,x0,#0xc80
00b1aab0	add x2,x2,#0xa51
00b1aab4	mov w1,#0xb3
00b1aab8	bl 0x00c342b0
00b1aabc	mov w0,#0x3d
00b1aac0	mov w1,#0x65
00b1aac4	mov x2,xzr
00b1aac8	bl 0x00c342c0
00b1aacc	cbz x24,0x00b1aae8
00b1aad0	ldr x0,[x24]
00b1aad4	adrp x1,0x2aa000
00b1aad8	add x1,x1,#0xc80
00b1aadc	mov w2,#0x29
00b1aae0	bl 0x00c32310
00b1aae4	str xzr,[x24]
00b1aae8	cbz x23,0x00b1ab04
00b1aaec	ldr x0,[x23]
00b1aaf0	adrp x1,0x2aa000
00b1aaf4	add x1,x1,#0xc80
00b1aaf8	mov w2,#0x29
00b1aafc	bl 0x00c32310
00b1ab00	str xzr,[x23]
00b1ab04	ldr x20,[sp, #0x58]
00b1ab08	cbz x22,0x00b1ab24
00b1ab0c	ldr x0,[x22]
00b1ab10	adrp x1,0x2aa000
00b1ab14	add x1,x1,#0xc80
00b1ab18	mov w2,#0x29
00b1ab1c	bl 0x00c32310
00b1ab20	str xzr,[x22]
00b1ab24	cbz x21,0x00b1ab40
00b1ab28	ldr x0,[x21]
00b1ab2c	adrp x1,0x2aa000
00b1ab30	add x1,x1,#0xc80
00b1ab34	mov w2,#0x29
00b1ab38	bl 0x00c32310
00b1ab3c	str xzr,[x21]
00b1ab40	cbz x20,0x00b1ab5c
00b1ab44	ldr x0,[x20]
00b1ab48	adrp x1,0x2aa000
00b1ab4c	add x1,x1,#0xc80
00b1ab50	mov w2,#0x29
00b1ab54	bl 0x00c32310
00b1ab58	str xzr,[x20]
00b1ab5c	cbz x19,0x00b1ab78
00b1ab60	ldr x0,[x19]
00b1ab64	adrp x1,0x2aa000
00b1ab68	add x1,x1,#0xc80
00b1ab6c	mov w2,#0x29
00b1ab70	bl 0x00c32310
00b1ab74	str xzr,[x19]
00b1ab78	ldr x19,[sp, #0x60]
00b1ab7c	cbz x19,0x00b1aba0
00b1ab80	ldr x0,[x19]
00b1ab84	adrp x1,0x2aa000
00b1ab88	add x1,x1,#0xc80
00b1ab8c	mov w2,#0x29
00b1ab90	bl 0x00c32310
00b1ab94	mov w0,wzr
00b1ab98	str xzr,[x19]
00b1ab9c	b 0x00b1aba4
00b1aba0	mov w0,wzr
00b1aba4	ldp x29,x30,[sp, #0xc0]
00b1aba8	ldp x20,x19,[sp, #0xb0]
00b1abac	ldp x22,x21,[sp, #0xa0]
00b1abb0	ldp x24,x23,[sp, #0x90]
00b1abb4	ldp x26,x25,[sp, #0x80]
00b1abb8	ldp x28,x27,[sp, #0x70]
00b1abbc	add sp,sp,#0xd0
00b1abc0	ret
00b1abc4	ldr x19,[sp, #0x50]
00b1abc8	ldp x22,x21,[sp, #0x28]
00b1abcc	b 0x00b1aad4
00b1abd0	cbz x25,0x00b1ac14
00b1abd4	ldr x8,[sp, #0x48]
00b1abd8	adrp x1,0x2aa000
00b1abdc	add x1,x1,#0xc80
00b1abe0	mov w2,#0xac
00b1abe4	add x8,x8,#0x1
00b1abe8	sub x8,x8,x0
00b1abec	add x20,x8,#0x1
00b1abf0	mov x0,x20
00b1abf4	bl 0x00c32320
00b1abf8	str x0,[x25]
00b1abfc	cbz x0,0x00b1aacc
00b1ac00	ldr x3,[sp, #0x18]
00b1ac04	adrp x2,0x2a5000
00b1ac08	add x2,x2,#0x696
00b1ac0c	mov x1,x20
00b1ac10	bl 0x00c34d30
00b1ac14	mov w0,#0x1
00b1ac18	b 0x00b1aba4
