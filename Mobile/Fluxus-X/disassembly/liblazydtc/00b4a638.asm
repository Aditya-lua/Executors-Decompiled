; FUN_00b4a638 @ 00b4a638
00b4a638	sub sp,sp,#0x140
00b4a63c	stp x28,x27,[sp, #0xe0]
00b4a640	stp x26,x25,[sp, #0xf0]
00b4a644	stp x24,x23,[sp, #0x100]
00b4a648	stp x22,x21,[sp, #0x110]
00b4a64c	stp x20,x19,[sp, #0x120]
00b4a650	stp x29,x30,[sp, #0x130]
00b4a654	add x29,sp,#0x130
00b4a658	mov x21,x3
00b4a65c	mov x20,x2
00b4a660	mov x19,x1
00b4a664	mov x22,x0
00b4a668	bl 0x00c41000
00b4a66c	cbz w0,0x00b4a70c
00b4a670	mov x0,x22
00b4a674	mov x1,x21
00b4a678	bl 0x00b4ab88
00b4a67c	cbz w0,0x00b4a70c
00b4a680	ldr w8,[x22, #0x98]
00b4a684	cbz w8,0x00b4a6b8
00b4a688	ldr x8,[x22, #0x50]
00b4a68c	cbz x8,0x00b4a6b8
00b4a690	bl 0x00c342a0
00b4a694	adrp x0,0x2ae000
00b4a698	adrp x2,0x2d2000
00b4a69c	add x0,x0,#0xb4d
00b4a6a0	add x2,x2,#0x85e
00b4a6a4	mov w1,#0x19f
00b4a6a8	bl 0x00c342b0
00b4a6ac	mov w0,#0x39
00b4a6b0	mov w1,#0xc6
00b4a6b4	b 0x00b4a704
00b4a6b8	ldr x8,[x22, #0x30]
00b4a6bc	cbz x8,0x00b4a734
00b4a6c0	ldr x8,[x22, #0x40]
00b4a6c4	cbnz x8,0x00b4a6e0
00b4a6c8	ldr x8,[x22, #0x48]
00b4a6cc	cbnz x8,0x00b4a6e0
00b4a6d0	ldr x8,[x22, #0x50]
00b4a6d4	cbnz x8,0x00b4a6e0
00b4a6d8	ldr x8,[x22, #0x58]
00b4a6dc	cbz x8,0x00b4a734
00b4a6e0	bl 0x00c342a0
00b4a6e4	adrp x0,0x2ae000
00b4a6e8	adrp x2,0x2d2000
00b4a6ec	add x0,x0,#0xb4d
00b4a6f0	add x2,x2,#0x85e
00b4a6f4	mov w1,#0x1ab
00b4a6f8	bl 0x00c342b0
00b4a6fc	mov w0,#0x39
00b4a700	mov w1,#0x73
00b4a704	mov x2,xzr
00b4a708	bl 0x00c342c0
00b4a70c	mov w28,wzr
00b4a710	mov w0,w28
00b4a714	ldp x29,x30,[sp, #0x130]
00b4a718	ldp x20,x19,[sp, #0x120]
00b4a71c	ldp x22,x21,[sp, #0x110]
00b4a720	ldp x24,x23,[sp, #0x100]
00b4a724	ldp x26,x25,[sp, #0xf0]
00b4a728	ldp x28,x27,[sp, #0xe0]
00b4a72c	add sp,sp,#0x140
00b4a730	ret
00b4a734	ldr x8,[x22, #0x20]
00b4a738	cbz x8,0x00b4a798
00b4a73c	add x0,x22,#0x8
00b4a740	bl 0x00c41160
00b4a744	cbz x0,0x00b4a7e8
00b4a748	ldr x21,[x22, #0x88]
00b4a74c	cbz x21,0x00b4a7c0
00b4a750	ldr x24,[x22, #0x90]
00b4a754	cbz x24,0x00b4a7c0
00b4a758	ldr x25,[x22, #0x40]
00b4a75c	mov x23,x0
00b4a760	cbz x25,0x00b4a810
00b4a764	ldr x8,[x22, #0x60]
00b4a768	lsr x8,x8,#0x1e
00b4a76c	cbz x8,0x00b4a810
00b4a770	bl 0x00c342a0
00b4a774	adrp x0,0x2ae000
00b4a778	adrp x2,0x2d2000
00b4a77c	add x0,x0,#0xb4d
00b4a780	add x2,x2,#0x85e
00b4a784	orr w1,wzr,#0x1c0
00b4a788	bl 0x00c342b0
00b4a78c	mov w0,#0x39
00b4a790	mov w1,#0xc8
00b4a794	b 0x00b4a704
00b4a798	bl 0x00c342a0
00b4a79c	adrp x0,0x2ae000
00b4a7a0	adrp x2,0x2d2000
00b4a7a4	add x0,x0,#0xb4d
00b4a7a8	add x2,x2,#0x85e
00b4a7ac	mov w1,#0x1af
00b4a7b0	bl 0x00c342b0
00b4a7b4	mov w0,#0x39
00b4a7b8	mov w1,#0x84
00b4a7bc	b 0x00b4a704
00b4a7c0	bl 0x00c342a0
00b4a7c4	adrp x0,0x2ae000
00b4a7c8	adrp x2,0x2d2000
00b4a7cc	add x0,x0,#0xb4d
00b4a7d0	add x2,x2,#0x85e
00b4a7d4	mov w1,#0x1b8
00b4a7d8	bl 0x00c342b0
00b4a7dc	mov w0,#0x39
00b4a7e0	mov w1,#0x90
00b4a7e4	b 0x00b4a704
00b4a7e8	bl 0x00c342a0
00b4a7ec	adrp x0,0x2ae000
00b4a7f0	adrp x2,0x2d2000
00b4a7f4	add x0,x0,#0xb4d
00b4a7f8	add x2,x2,#0x85e
00b4a7fc	mov w1,#0x1b4
00b4a800	bl 0x00c342b0
00b4a804	mov w0,#0x39
00b4a808	mov w1,#0x81
00b4a80c	b 0x00b4a704
00b4a810	ldr w8,[x22, #0x98]
00b4a814	cbz w8,0x00b4a820
00b4a818	ldr x8,[x22, #0x80]
00b4a81c	b 0x00b4a824
00b4a820	mov x8,xzr
00b4a824	ldp x5,x6,[x22, #0x30]
00b4a828	ldp x13,x10,[x22, #0x58]
00b4a82c	ldp x11,x12,[x22, #0x48]
00b4a830	ldp x28,x27,[x22, #0x68]
00b4a834	ldr x26,[x22, #0x78]
00b4a838	lsr x9,x8,#0x18
00b4a83c	stp xzr,xzr,[sp, #0x88]
00b4a840	cbz x9,0x00b4a87c
00b4a844	mov x21,xzr
00b4a848	mov x24,xzr
00b4a84c	mov w25,wzr
00b4a850	cbnz w25,0x00b4a9bc
00b4a854	bl 0x00c342a0
00b4a858	adrp x0,0x2ae000
00b4a85c	adrp x2,0x2d2000
00b4a860	add x0,x0,#0xb4d
00b4a864	add x2,x2,#0x85e
00b4a868	mov w1,#0x1cc
00b4a86c	bl 0x00c342b0
00b4a870	mov w0,#0x39
00b4a874	mov w1,#0x8d
00b4a878	b 0x00b4a704
00b4a87c	lsl w8,w8,#0x3
00b4a880	add x0,sp,#0x98
00b4a884	mov x1,xzr
00b4a888	mov x2,xzr
00b4a88c	mov x3,x21
00b4a890	mov x4,x24
00b4a894	mov x7,x25
00b4a898	str xzr,[sp, #0x40]
00b4a89c	stp x13,x26,[sp, #0x28]
00b4a8a0	stp x12,x27,[sp, #0x18]
00b4a8a4	stp x13,x12,[sp, #0x58]
00b4a8a8	stp x11,x28,[sp, #0x8]
00b4a8ac	stp x11,x10,[sp, #0x68]
00b4a8b0	str x10,[sp]
00b4a8b4	str w8,[sp, #0x54]
00b4a8b8	str w8,[sp, #0x38]
00b4a8bc	stp x6,x5,[sp, #0x78]
00b4a8c0	bl 0x00b4b034
00b4a8c4	cbz w0,0x00b4a9a4
00b4a8c8	add x0,sp,#0x98
00b4a8cc	add x1,sp,#0x88
00b4a8d0	bl 0x00c34370
00b4a8d4	cbz w0,0x00b4a9a4
00b4a8d8	add x0,sp,#0x98
00b4a8dc	bl 0x00c34340
00b4a8e0	ldr x0,[sp, #0x88]
00b4a8e4	adrp x1,0x2ae000
00b4a8e8	add x1,x1,#0xb4d
00b4a8ec	mov w2,#0xe4
00b4a8f0	bl 0x00c34250
00b4a8f4	cbz x0,0x00b4a9a4
00b4a8f8	ldr w9,[sp, #0x54]
00b4a8fc	add x8,sp,#0x90
00b4a900	str x8,[sp, #0x40]
00b4a904	ldp x8,x6,[sp, #0x70]
00b4a908	str w9,[sp, #0x38]
00b4a90c	ldr x9,[sp, #0x58]
00b4a910	ldr x2,[sp, #0x88]
00b4a914	str x8,[sp]
00b4a918	ldr x8,[sp, #0x68]
00b4a91c	stp x9,x26,[sp, #0x28]
00b4a920	ldr x9,[sp, #0x60]
00b4a924	ldr x5,[sp, #0x80]
00b4a928	mov x10,x0
00b4a92c	add x0,sp,#0x98
00b4a930	mov x1,x10
00b4a934	mov x3,x21
00b4a938	mov x4,x24
00b4a93c	mov x7,x25
00b4a940	stp x9,x27,[sp, #0x18]
00b4a944	stp x8,x28,[sp, #0x8]
00b4a948	mov x26,x10
00b4a94c	bl 0x00b4b034
00b4a950	cbz w0,0x00b4a9a4
00b4a954	add x0,sp,#0x98
00b4a958	bl 0x00c36c50
00b4a95c	cmp x0,x26
00b4a960	b.ne 0x00b4a9a4
00b4a964	ldr x8,[sp, #0x90]
00b4a968	mov x21,xzr
00b4a96c	mov x24,xzr
00b4a970	mov w25,wzr
00b4a974	cbz x8,0x00b4a9b0
00b4a978	ldrb w9,[x8]
00b4a97c	cmp w9,#0x4
00b4a980	b.ne 0x00b4a9a4
00b4a984	ldrb w9,[x8, #0x1]
00b4a988	cmp w9,#0x4
00b4a98c	b.ne 0x00b4a9a4
00b4a990	ldr x24,[sp, #0x88]
00b4a994	add x28,x8,#0x2
00b4a998	mov w25,#0x1
00b4a99c	mov x21,x26
00b4a9a0	b 0x00b4a9b0
00b4a9a4	mov x21,xzr
00b4a9a8	mov x24,xzr
00b4a9ac	mov w25,wzr
00b4a9b0	add x0,sp,#0x98
00b4a9b4	bl 0x00c34340
00b4a9b8	cbz w25,0x00b4a854
00b4a9bc	sub x8,x20,#0x1
00b4a9c0	lsr x8,x8,#0x1e
00b4a9c4	cbnz x8,0x00b4aae4
00b4a9c8	mov w8,#0x40000000
00b4a9cc	cmp x24,x8
00b4a9d0	b.hi 0x00b4aae4
00b4a9d4	ldr x26,[x22, #0x28]
00b4a9d8	mov w8,#0x1
00b4a9dc	movk w8,#0x4000, LSL #16
00b4a9e0	cmp x26,x8
00b4a9e4	b.cs 0x00b4aae4
00b4a9e8	ldr x8,[x22, #0x20]
00b4a9ec	mov x0,x23
00b4a9f0	str x8,[sp, #0x80]
00b4a9f4	bl 0x00c34c20
00b4a9f8	mov w27,w0
00b4a9fc	cmp w0,#0x1
00b4aa00	b.lt 0x00b4ab10
00b4aa04	bl 0x00c31fa0
00b4aa08	mov x22,x0
00b4aa0c	bl 0x00c31fa0
00b4aa10	mov x25,x0
00b4aa14	cbz x22,0x00b4ab44
00b4aa18	str x28,[sp, #0x78]
00b4aa1c	mov w28,wzr
00b4aa20	cbz x25,0x00b4ab48
00b4aa24	mov x0,x25
00b4aa28	mov x1,x23
00b4aa2c	bl 0x00c32430
00b4aa30	cbz w0,0x00b4ab44
00b4aa34	ldr x9,[sp, #0x78]
00b4aa38	mov w8,#0x1000000
00b4aa3c	mov x0,x22
00b4aa40	mov x1,x25
00b4aa44	str w8,[x9]
00b4aa48	bl 0x00c34bf0
00b4aa4c	cbz w0,0x00b4ab44
00b4aa50	sxtw x23,w27
00b4aa54	mov w27,#0x2
00b4aa58	ldr x1,[sp, #0x80]
00b4aa5c	mov x0,x22
00b4aa60	mov x2,x26
00b4aa64	bl 0x00c31f80
00b4aa68	cbz w0,0x00b4ab44
00b4aa6c	mov x0,x22
00b4aa70	mov x1,x21
00b4aa74	mov x2,x24
00b4aa78	bl 0x00c31f80
00b4aa7c	cbz w0,0x00b4ab44
00b4aa80	subs x28,x20,x23
00b4aa84	b.cc 0x00b4ab18
00b4aa88	mov x0,x22
00b4aa8c	mov x1,x19
00b4aa90	mov x2,xzr
00b4aa94	bl 0x00c31f60
00b4aa98	cbz w0,0x00b4ab44
00b4aa9c	cmp x23,x20
00b4aaa0	b.eq 0x00b4ab3c
00b4aaa4	ldr x11,[sp, #0x78]
00b4aaa8	lsr x8,x27,#0x18
00b4aaac	lsr x9,x27,#0x10
00b4aab0	lsr x10,x27,#0x8
00b4aab4	mov x0,x22
00b4aab8	mov x1,x25
00b4aabc	add x19,x19,x23
00b4aac0	strb w8,[x11]
00b4aac4	strb w9,[x11, #0x1]
00b4aac8	strb w10,[x11, #0x2]
00b4aacc	strb w27,[x11, #0x3]
00b4aad0	bl 0x00c34bf0
00b4aad4	add x27,x27,#0x1
00b4aad8	mov x20,x28
00b4aadc	cbnz w0,0x00b4aa58
00b4aae0	b 0x00b4ab44
00b4aae4	bl 0x00c342a0
00b4aae8	adrp x0,0x2ae000
00b4aaec	adrp x2,0x2c0000
00b4aaf0	add x0,x0,#0xb4d
00b4aaf4	add x2,x2,#0x969
00b4aaf8	mov w1,#0x118
00b4aafc	bl 0x00c342b0
00b4ab00	mov w0,#0x39
00b4ab04	mov w1,#0x8e
00b4ab08	mov x2,xzr
00b4ab0c	bl 0x00c342c0
00b4ab10	mov w28,wzr
00b4ab14	b 0x00b4ab64
00b4ab18	add x1,sp,#0x98
00b4ab1c	mov x0,x22
00b4ab20	mov x2,xzr
00b4ab24	bl 0x00c31f60
00b4ab28	cbz w0,0x00b4ab44
00b4ab2c	add x1,sp,#0x98
00b4ab30	mov x0,x19
00b4ab34	mov x2,x20
00b4ab38	bl 0x00c2ffd0
00b4ab3c	mov w28,#0x1
00b4ab40	b 0x00b4ab48
00b4ab44	mov w28,wzr
00b4ab48	mov x0,x22
00b4ab4c	bl 0x00c31f90
00b4ab50	mov x0,x25
00b4ab54	bl 0x00c31f90
00b4ab58	add x0,sp,#0x98
00b4ab5c	mov w1,#0x40
00b4ab60	bl 0x00c34750
00b4ab64	adrp x1,0x2ae000
00b4ab68	add x1,x1,#0xb4d
00b4ab6c	mov w2,#0x1d1
00b4ab70	mov x0,x21
00b4ab74	bl 0x00c32310
00b4ab78	b 0x00b4a710
