; FUN_0087a7a0 @ 0087a7a0
0087a7a0	stp x29,x30,[sp, #-0x50]!
0087a7a4	str x25,[sp, #0x10]
0087a7a8	stp x24,x23,[sp, #0x20]
0087a7ac	stp x22,x21,[sp, #0x30]
0087a7b0	stp x20,x19,[sp, #0x40]
0087a7b4	mov x29,sp
0087a7b8	mov w22,w3
0087a7bc	mov x21,x2
0087a7c0	mov x19,x1
0087a7c4	mov x20,x0
0087a7c8	mov x23,x20
0087a7cc	sub x8,x19,x23
0087a7d0	mov x20,x23
0087a7d4	asr x8,x8,#0x3
0087a7d8	subs x9,x8,#0x2
0087a7dc	b.gt 0x0087a7f0
0087a7e0	b.cc 0x0087b118
0087a7e4	cmp x8,#0x2
0087a7e8	b.ne 0x0087a808
0087a7ec	b 0x0087acf8
0087a7f0	cmp x8,#0x3
0087a7f4	b.eq 0x0087ad1c
0087a7f8	cmp x8,#0x4
0087a7fc	b.eq 0x0087ad4c
0087a800	cmp x8,#0x5
0087a804	b.eq 0x0087accc
0087a808	cmp x8,#0x17
0087a80c	b.le 0x0087ad7c
0087a810	cbz x21,0x0087ae00
0087a814	lsr x9,x8,#0x1
0087a818	ldur w10,[x19, #-0x8]
0087a81c	cmp x8,#0x81
0087a820	add x9,x20,x9, LSL #0x3
0087a824	b.cc 0x0087a850
0087a828	ldr w11,[x9]
0087a82c	ldr w8,[x20]
0087a830	cmp w11,w8
0087a834	b.cs 0x0087a878
0087a838	ldr x8,[x20]
0087a83c	cmp w10,w11
0087a840	b.cs 0x0087a8f8
0087a844	ldur x10,[x19, #-0x8]
0087a848	str x10,[x20]
0087a84c	b 0x0087a918
0087a850	ldr w11,[x20]
0087a854	ldr w8,[x9]
0087a858	cmp w11,w8
0087a85c	b.cs 0x0087a8b4
0087a860	ldr x8,[x9]
0087a864	cmp w10,w11
0087a868	b.cs 0x0087a984
0087a86c	ldur x10,[x19, #-0x8]
0087a870	str x10,[x9]
0087a874	b 0x0087a9a4
0087a878	cmp w10,w11
0087a87c	b.cs 0x0087a91c
0087a880	ldur x8,[x19, #-0x8]
0087a884	ldr x10,[x9]
0087a888	str x8,[x9]
0087a88c	stur x10,[x19, #-0x8]
0087a890	ldr w8,[x9]
0087a894	ldr w10,[x20]
0087a898	cmp w8,w10
0087a89c	b.cs 0x0087a91c
0087a8a0	ldr x8,[x9]
0087a8a4	ldr x10,[x20]
0087a8a8	str x8,[x20]
0087a8ac	str x10,[x9]
0087a8b0	b 0x0087a91c
0087a8b4	cmp w10,w11
0087a8b8	b.cs 0x0087a9a8
0087a8bc	ldur x8,[x19, #-0x8]
0087a8c0	ldr x10,[x20]
0087a8c4	str x8,[x20]
0087a8c8	stur x10,[x19, #-0x8]
0087a8cc	ldr w8,[x20]
0087a8d0	ldr w10,[x9]
0087a8d4	cmp w8,w10
0087a8d8	b.cs 0x0087a9a8
0087a8dc	ldr x8,[x20]
0087a8e0	ldr x10,[x9]
0087a8e4	str x8,[x9]
0087a8e8	str x10,[x20]
0087a8ec	sub x21,x21,#0x1
0087a8f0	tbnz w22,#0x0,0x0087a9b0
0087a8f4	b 0x0087aaf4
0087a8f8	ldr x10,[x9]
0087a8fc	str x10,[x20]
0087a900	str x8,[x9]
0087a904	ldur w10,[x19, #-0x8]
0087a908	cmp w10,w8
0087a90c	b.cs 0x0087a91c
0087a910	ldur x10,[x19, #-0x8]
0087a914	str x10,[x9]
0087a918	stur x8,[x19, #-0x8]
0087a91c	ldur w10,[x9, #-0x8]
0087a920	ldr w8,[x20, #0x8]
0087a924	ldur w11,[x19, #-0x10]
0087a928	cmp w10,w8
0087a92c	b.cs 0x0087a948
0087a930	ldr x8,[x20, #0x8]
0087a934	cmp w11,w10
0087a938	b.cs 0x0087a9b8
0087a93c	ldur x10,[x19, #-0x10]
0087a940	str x10,[x20, #0x8]
0087a944	b 0x0087a9d8
0087a948	cmp w11,w10
0087a94c	b.cs 0x0087a9dc
0087a950	ldur x8,[x19, #-0x10]
0087a954	ldur x10,[x9, #-0x8]
0087a958	stur x8,[x9, #-0x8]
0087a95c	stur x10,[x19, #-0x10]
0087a960	ldur w8,[x9, #-0x8]
0087a964	ldr w10,[x20, #0x8]
0087a968	cmp w8,w10
0087a96c	b.cs 0x0087a9dc
0087a970	ldur x8,[x9, #-0x8]
0087a974	ldr x10,[x20, #0x8]
0087a978	str x8,[x20, #0x8]
0087a97c	stur x10,[x9, #-0x8]
0087a980	b 0x0087a9dc
0087a984	ldr x10,[x20]
0087a988	str x10,[x9]
0087a98c	str x8,[x20]
0087a990	ldur w9,[x19, #-0x8]
0087a994	cmp w9,w8
0087a998	b.cs 0x0087a9a8
0087a99c	ldur x9,[x19, #-0x8]
0087a9a0	str x9,[x20]
0087a9a4	stur x8,[x19, #-0x8]
0087a9a8	sub x21,x21,#0x1
0087a9ac	tbz w22,#0x0,0x0087aaf4
0087a9b0	ldr x8,[x20]
0087a9b4	b 0x0087ab08
0087a9b8	ldur x10,[x9, #-0x8]
0087a9bc	str x10,[x20, #0x8]
0087a9c0	stur x8,[x9, #-0x8]
0087a9c4	ldur w10,[x19, #-0x10]
0087a9c8	cmp w10,w8
0087a9cc	b.cs 0x0087a9dc
0087a9d0	ldur x10,[x19, #-0x10]
0087a9d4	stur x10,[x9, #-0x8]
0087a9d8	stur x8,[x19, #-0x10]
0087a9dc	ldr w10,[x9, #0x8]
0087a9e0	ldr w8,[x20, #0x10]
0087a9e4	ldur w11,[x19, #-0x18]
0087a9e8	cmp w10,w8
0087a9ec	b.cs 0x0087aa08
0087a9f0	ldr x8,[x20, #0x10]
0087a9f4	cmp w11,w10
0087a9f8	b.cs 0x0087aa44
0087a9fc	ldur x10,[x19, #-0x18]
0087aa00	str x10,[x20, #0x10]
0087aa04	b 0x0087aa64
0087aa08	cmp w11,w10
0087aa0c	b.cs 0x0087aa68
0087aa10	ldur x8,[x19, #-0x18]
0087aa14	ldr x10,[x9, #0x8]
0087aa18	str x8,[x9, #0x8]
0087aa1c	stur x10,[x19, #-0x18]
0087aa20	ldr w8,[x9, #0x8]
0087aa24	ldr w10,[x20, #0x10]
0087aa28	cmp w8,w10
0087aa2c	b.cs 0x0087aa68
0087aa30	ldr x8,[x9, #0x8]
0087aa34	ldr x10,[x20, #0x10]
0087aa38	str x8,[x20, #0x10]
0087aa3c	str x10,[x9, #0x8]
0087aa40	b 0x0087aa68
0087aa44	ldr x10,[x9, #0x8]
0087aa48	str x10,[x20, #0x10]
0087aa4c	str x8,[x9, #0x8]
0087aa50	ldur w10,[x19, #-0x18]
0087aa54	cmp w10,w8
0087aa58	b.cs 0x0087aa68
0087aa5c	ldur x10,[x19, #-0x18]
0087aa60	str x10,[x9, #0x8]
0087aa64	stur x8,[x19, #-0x18]
0087aa68	ldr w12,[x9]
0087aa6c	ldur w11,[x9, #-0x8]
0087aa70	ldr w10,[x9, #0x8]
0087aa74	cmp w12,w11
0087aa78	b.cs 0x0087aa9c
0087aa7c	ldur x8,[x9, #-0x8]
0087aa80	cmp w10,w12
0087aa84	b.cs 0x0087aac4
0087aa88	ldr x10,[x9, #0x8]
0087aa8c	str x8,[x9, #0x8]
0087aa90	ldr x8,[x9]
0087aa94	stur x10,[x9, #-0x8]
0087aa98	b 0x0087aae0
0087aa9c	ldr x8,[x9]
0087aaa0	cmp w10,w12
0087aaa4	b.cs 0x0087aae0
0087aaa8	ldr x10,[x9, #0x8]
0087aaac	cmp w11,w10
0087aab0	stp x10,x8,[x9]
0087aab4	b.ls 0x0087aadc
0087aab8	ldur x8,[x9, #-0x8]
0087aabc	stp x10,x8,[x9, #-0x8]
0087aac0	b 0x0087aae0
0087aac4	ldr x11,[x9]
0087aac8	cmp w10,w8
0087aacc	stp x11,x8,[x9, #-0x8]
0087aad0	b.cs 0x0087aae0
0087aad4	ldr x10,[x9, #0x8]
0087aad8	stp x10,x8,[x9]
0087aadc	mov x8,x10
0087aae0	ldr x10,[x20]
0087aae4	str x8,[x20]
0087aae8	str x10,[x9]
0087aaec	sub x21,x21,#0x1
0087aaf0	tbnz w22,#0x0,0x0087a9b0
0087aaf4	ldur w9,[x20, #-0x8]
0087aaf8	ldr w10,[x20]
0087aafc	ldr x8,[x20]
0087ab00	cmp w9,w10
0087ab04	b.cs 0x0087ac10
0087ab08	mov x9,xzr
0087ab0c	add x10,x20,x9
0087ab10	add x9,x9,#0x8
0087ab14	ldr w10,[x10, #0x8]
0087ab18	cmp w10,w8
0087ab1c	b.cc 0x0087ab0c
0087ab20	cmp x9,#0x8
0087ab24	add x9,x20,x9
0087ab28	mov x10,x19
0087ab2c	b.eq 0x0087ab40
0087ab30	ldr w11,[x10, #-0x8]!
0087ab34	cmp w11,w8
0087ab38	b.cs 0x0087ab30
0087ab3c	b 0x0087ab58
0087ab40	mov x10,x19
0087ab44	cmp x9,x10
0087ab48	b.cs 0x0087ab58
0087ab4c	ldr w11,[x10, #-0x8]!
0087ab50	cmp w11,w8
0087ab54	b.cs 0x0087ab44
0087ab58	cmp x9,x10
0087ab5c	b.cs 0x0087aba8
0087ab60	mov x11,x9
0087ab64	mov x12,x10
0087ab68	ldr x13,[x12]
0087ab6c	ldr x14,[x11]
0087ab70	str x13,[x11]
0087ab74	str x14,[x12]
0087ab78	ldr w13,[x11, #0x8]!
0087ab7c	cmp w13,w8
0087ab80	b.cc 0x0087ab78
0087ab84	ldr w13,[x12, #-0x8]!
0087ab88	cmp w13,w8
0087ab8c	b.cs 0x0087ab84
0087ab90	cmp x11,x12
0087ab94	b.cc 0x0087ab68
0087ab98	sub x24,x11,#0x8
0087ab9c	cmp x20,x24
0087aba0	b.ne 0x0087abb4
0087aba4	b 0x0087abbc
0087aba8	sub x24,x9,#0x8
0087abac	cmp x20,x24
0087abb0	b.eq 0x0087abbc
0087abb4	ldr x11,[x24]
0087abb8	str x11,[x20]
0087abbc	cmp x9,x10
0087abc0	str x8,[x24]
0087abc4	b.cc 0x0087abf0
0087abc8	mov x0,x20
0087abcc	mov x1,x24
0087abd0	bl 0x0087b2a4
0087abd4	add x23,x24,#0x8
0087abd8	mov w25,w0
0087abdc	mov x1,x19
0087abe0	mov x0,x23
0087abe4	bl 0x0087b2a4
0087abe8	tbnz w0,#0x0,0x0087acc0
0087abec	tbnz w25,#0x0,0x0087a7cc
0087abf0	and w3,w22,#0x1
0087abf4	mov x0,x20
0087abf8	mov x1,x24
0087abfc	mov x2,x21
0087ac00	bl 0x0087a7a0
0087ac04	mov w22,wzr
0087ac08	add x23,x24,#0x8
0087ac0c	b 0x0087a7cc
0087ac10	ldur w9,[x19, #-0x8]
0087ac14	cmp w9,w8
0087ac18	b.ls 0x0087ac30
0087ac1c	mov x23,x20
0087ac20	ldr w9,[x23, #0x8]!
0087ac24	cmp w9,w8
0087ac28	b.ls 0x0087ac20
0087ac2c	b 0x0087ac50
0087ac30	add x9,x20,#0x8
0087ac34	mov x23,x9
0087ac38	cmp x9,x19
0087ac3c	b.cs 0x0087ac50
0087ac40	mov x9,x23
0087ac44	ldr w10,[x9], #0x8
0087ac48	cmp w10,w8
0087ac4c	b.ls 0x0087ac34
0087ac50	cmp x23,x19
0087ac54	mov x9,x19
0087ac58	b.cs 0x0087ac98
0087ac5c	mov x9,x19
0087ac60	ldr w10,[x9, #-0x8]!
0087ac64	cmp w10,w8
0087ac68	b.hi 0x0087ac60
0087ac6c	b 0x0087ac98
0087ac70	ldr x10,[x9]
0087ac74	ldr x11,[x23]
0087ac78	str x10,[x23]
0087ac7c	str x11,[x9]
0087ac80	ldr w10,[x23, #0x8]!
0087ac84	cmp w10,w8
0087ac88	b.ls 0x0087ac80
0087ac8c	ldr w10,[x9, #-0x8]!
0087ac90	cmp w10,w8
0087ac94	b.hi 0x0087ac8c
0087ac98	cmp x23,x9
0087ac9c	b.cc 0x0087ac70
0087aca0	sub x9,x23,#0x8
0087aca4	cmp x20,x9
0087aca8	b.eq 0x0087acb4
0087acac	ldr x10,[x9]
0087acb0	str x10,[x20]
0087acb4	mov w22,wzr
0087acb8	str x8,[x9]
0087acbc	b 0x0087a7cc
0087acc0	mov x19,x24
0087acc4	tbz w25,#0x0,0x0087a7c8
0087acc8	b 0x0087b118
0087accc	sub x4,x19,#0x8
0087acd0	add x1,x20,#0x8
0087acd4	add x2,x20,#0x10
0087acd8	add x3,x20,#0x18
0087acdc	mov x0,x20
0087ace0	ldp x20,x19,[sp, #0x40]
0087ace4	ldr x25,[sp, #0x10]
0087ace8	ldp x22,x21,[sp, #0x30]
0087acec	ldp x24,x23,[sp, #0x20]
0087acf0	ldp x29,x30,[sp], #0x50
0087acf4	b 0x0087b130
0087acf8	ldur w8,[x19, #-0x8]
0087acfc	ldr w9,[x20]
0087ad00	cmp w8,w9
0087ad04	b.cs 0x0087b118
0087ad08	ldur x8,[x19, #-0x8]
0087ad0c	ldr x9,[x20]
0087ad10	str x8,[x20]
0087ad14	stur x9,[x19, #-0x8]
0087ad18	b 0x0087b118
0087ad1c	ldr w9,[x20, #0x8]
0087ad20	ldr w8,[x20]
0087ad24	ldur w10,[x19, #-0x8]
0087ad28	cmp w9,w8
0087ad2c	b.cs 0x0087afe4
0087ad30	ldr x8,[x20]
0087ad34	cmp w10,w9
0087ad38	b.cs 0x0087b090
0087ad3c	ldur x9,[x19, #-0x8]
0087ad40	str x9,[x20]
0087ad44	stur x8,[x19, #-0x8]
0087ad48	b 0x0087b118
0087ad4c	ldr w10,[x20, #0x8]
0087ad50	ldr w9,[x20]
0087ad54	ldr w8,[x20, #0x10]
0087ad58	cmp w10,w9
0087ad5c	b.cs 0x0087b01c
0087ad60	ldr x9,[x20]
0087ad64	cmp w8,w10
0087ad68	b.cs 0x0087b0b4
0087ad6c	ldr x8,[x20, #0x10]
0087ad70	str x9,[x20, #0x10]
0087ad74	str x8,[x20]
0087ad78	b 0x0087b0cc
0087ad7c	cmp x20,x19
0087ad80	add x9,x20,#0x8
0087ad84	ccmp x9,x19,#0x4,ne
0087ad88	cset w8,eq
0087ad8c	tbz w22,#0x0,0x0087b040
0087ad90	tbnz w8,#0x0,0x0087b118
0087ad94	mov x8,xzr
0087ad98	mov x10,x20
0087ad9c	b 0x0087adb8
0087ada0	mov x11,x20
0087ada4	str x9,[x11]
0087ada8	add x9,x10,#0x8
0087adac	add x8,x8,#0x8
0087adb0	cmp x9,x19
0087adb4	b.eq 0x0087b118
0087adb8	ldr w11,[x10, #0x8]
0087adbc	ldr w10,[x10]
0087adc0	cmp w11,w10
0087adc4	mov x10,x9
0087adc8	b.cs 0x0087ada8
0087adcc	ldr x9,[x10]
0087add0	mov x11,x8
0087add4	add x12,x20,x11
0087add8	ldr x13,[x12]
0087addc	str x13,[x12, #0x8]
0087ade0	cbz x11,0x0087ada0
0087ade4	ldur w12,[x12, #-0x8]
0087ade8	sub x11,x11,#0x8
0087adec	cmp w12,w9
0087adf0	b.hi 0x0087add4
0087adf4	add x11,x20,x11
0087adf8	add x11,x11,#0x8
0087adfc	b 0x0087ada4
0087ae00	cmp x20,x19
0087ae04	b.eq 0x0087b118
0087ae08	lsr x9,x9,#0x1
0087ae0c	mov x10,x9
0087ae10	b 0x0087ae24
0087ae14	str x14,[x13]
0087ae18	cmp x10,#0x0
0087ae1c	sub x10,x10,#0x1
0087ae20	b.le 0x0087af00
0087ae24	cmp x9,x10
0087ae28	b.cc 0x0087ae18
0087ae2c	mov w12,#0x1
0087ae30	lsl x11,x10,#0x1
0087ae34	bfm x12,x10,#0x3f,#0x3d
0087ae38	add x13,x11,#0x2
0087ae3c	add x11,x20,x12, LSL #0x3
0087ae40	cmp x13,x8
0087ae44	b.ge 0x0087ae68
0087ae48	mov x15,x11
0087ae4c	ldr w14,[x11]
0087ae50	ldr w16,[x15, #0x8]!
0087ae54	cmp w14,w16
0087ae58	csel w14,w14,w16,hi
0087ae5c	csel x11,x15,x11,cc
0087ae60	csel x12,x13,x12,cc
0087ae64	b 0x0087ae6c
0087ae68	ldr w14,[x11]
0087ae6c	add x13,x20,x10, LSL #0x3
0087ae70	ldr w15,[x13]
0087ae74	cmp w14,w15
0087ae78	b.cc 0x0087ae18
0087ae7c	ldr x14,[x13]
0087ae80	b 0x0087aea8
0087ae84	mov x17,x11
0087ae88	ldr w16,[x11]
0087ae8c	ldr w0,[x17, #0x8]!
0087ae90	cmp w16,w0
0087ae94	csel w16,w16,w0,hi
0087ae98	csel x11,x17,x11,cc
0087ae9c	csel x12,x12,x15,cc
0087aea0	cmp w16,w14
0087aea4	b.cc 0x0087ae14
0087aea8	mov x15,x13
0087aeac	mov x13,x11
0087aeb0	ldr x11,[x11]
0087aeb4	cmp x9,x12
0087aeb8	str x11,[x15]
0087aebc	b.lt 0x0087ae14
0087aec0	mov w15,#0x1
0087aec4	lsl x11,x12,#0x1
0087aec8	bfm x15,x12,#0x3f,#0x3e
0087aecc	add x12,x11,#0x2
0087aed0	add x11,x20,x15, LSL #0x3
0087aed4	cmp x12,x8
0087aed8	b.lt 0x0087ae84
0087aedc	ldr w16,[x11]
0087aee0	mov x12,x15
0087aee4	cmp w16,w14
0087aee8	b.cs 0x0087aea8
0087aeec	b 0x0087ae14
0087aef0	str x10,[x9]
0087aef4	cmp x8,#0x2
0087aef8	sub x8,x8,#0x1
0087aefc	b.le 0x0087b118
0087af00	sub x9,x8,#0x2
0087af04	ldr x10,[x20]
0087af08	mov x13,xzr
0087af0c	lsr x11,x9,#0x1
0087af10	mov x12,x20
0087af14	b 0x0087af40
0087af18	ldr w13,[x15, #0x10]!
0087af1c	ldur w17,[x15, #-0x8]
0087af20	cmp w17,w13
0087af24	csel x9,x15,x9,cc
0087af28	csel x13,x16,x14,cc
0087af2c	ldr x14,[x9]
0087af30	cmp x13,x11
0087af34	str x14,[x12]
0087af38	mov x12,x9
0087af3c	b.gt 0x0087af68
0087af40	lsl x9,x13,#0x1
0087af44	add x15,x12,x13, LSL #0x3
0087af48	mov w14,#0x1
0087af4c	bfm x14,x13,#0x3f,#0x3e
0087af50	add x16,x9,#0x2
0087af54	add x9,x15,#0x8
0087af58	cmp x16,x8
0087af5c	b.lt 0x0087af18
0087af60	mov x13,x14
0087af64	b 0x0087af2c
0087af68	sub x19,x19,#0x8
0087af6c	cmp x9,x19
0087af70	b.eq 0x0087aef0
0087af74	sub x11,x9,x20
0087af78	ldr x12,[x19]
0087af7c	add x11,x11,#0x8
0087af80	asr x11,x11,#0x3
0087af84	str x12,[x9]
0087af88	str x10,[x19]
0087af8c	subs x11,x11,#0x2
0087af90	b.lt 0x0087aef4
0087af94	lsr x10,x11,#0x1
0087af98	ldr w13,[x9]
0087af9c	add x12,x20,x10, LSL #0x3
0087afa0	ldr w11,[x12]
0087afa4	cmp w11,w13
0087afa8	b.cs 0x0087aef4
0087afac	ldr x11,[x9]
0087afb0	mov x13,x9
0087afb4	mov x9,x12
0087afb8	ldr x12,[x12]
0087afbc	str x12,[x13]
0087afc0	cbz x10,0x0087afdc
0087afc4	sub x10,x10,#0x1
0087afc8	lsr x10,x10,#0x1
0087afcc	add x12,x20,x10, LSL #0x3
0087afd0	ldr w13,[x12]
0087afd4	cmp w13,w11
0087afd8	b.cc 0x0087afb0
0087afdc	str x11,[x9]
0087afe0	b 0x0087aef4
0087afe4	cmp w10,w9
0087afe8	b.cs 0x0087b118
0087afec	ldur x8,[x19, #-0x8]
0087aff0	ldr x9,[x20, #0x8]
0087aff4	str x8,[x20, #0x8]
0087aff8	stur x9,[x19, #-0x8]
0087affc	ldr w8,[x20, #0x8]
0087b000	ldr w9,[x20]
0087b004	cmp w8,w9
0087b008	b.cs 0x0087b118
0087b00c	ldr q0,[x20]
0087b010	ext v0.16B,v0.16B,v0.16B,0x8
0087b014	str q0,[x20]
0087b018	b 0x0087b118
0087b01c	cmp w8,w10
0087b020	b.cs 0x0087b0d0
0087b024	ldp x8,x10,[x20, #0x8]
0087b028	cmp w9,w10
0087b02c	stp x10,x8,[x20, #0x8]
0087b030	b.ls 0x0087b0d0
0087b034	ldr x9,[x20]
0087b038	stp x10,x9,[x20]
0087b03c	b 0x0087b0d0
0087b040	tbz w8,#0x0,0x0087b054
0087b044	b 0x0087b118
0087b048	add x9,x20,#0x8
0087b04c	cmp x9,x19
0087b050	b.eq 0x0087b118
0087b054	ldr w8,[x20, #0x8]
0087b058	ldr w10,[x20]
0087b05c	mov x20,x9
0087b060	cmp w8,w10
0087b064	b.cs 0x0087b048
0087b068	ldr x8,[x20]
0087b06c	mov x9,x20
0087b070	ldur w11,[x9, #-0x10]
0087b074	mov x10,x9
0087b078	ldr x12,[x9, #-0x8]!
0087b07c	cmp w11,w8
0087b080	str x12,[x10]
0087b084	b.hi 0x0087b070
0087b088	str x8,[x9]
0087b08c	b 0x0087b048
0087b090	ldr x9,[x20, #0x8]
0087b094	stp x9,x8,[x20]
0087b098	ldur w9,[x19, #-0x8]
0087b09c	cmp w9,w8
0087b0a0	b.cs 0x0087b118
0087b0a4	ldur x9,[x19, #-0x8]
0087b0a8	str x9,[x20, #0x8]
0087b0ac	stur x8,[x19, #-0x8]
0087b0b0	b 0x0087b118
0087b0b4	ldr x10,[x20, #0x8]
0087b0b8	cmp w8,w9
0087b0bc	stp x10,x9,[x20]
0087b0c0	b.cs 0x0087b0d0
0087b0c4	ldr x8,[x20, #0x10]
0087b0c8	stp x8,x9,[x20, #0x8]
0087b0cc	mov w8,w9
0087b0d0	ldur w9,[x19, #-0x8]
0087b0d4	cmp w9,w8
0087b0d8	b.cs 0x0087b118
0087b0dc	ldur x8,[x19, #-0x8]
0087b0e0	ldr x9,[x20, #0x10]
0087b0e4	str x8,[x20, #0x10]
0087b0e8	stur x9,[x19, #-0x8]
0087b0ec	ldr w8,[x20, #0x10]
0087b0f0	ldr w9,[x20, #0x8]
0087b0f4	cmp w8,w9
0087b0f8	b.cs 0x0087b118
0087b0fc	ldp x10,x8,[x20, #0x8]
0087b100	ldr w9,[x20]
0087b104	cmp w9,w8
0087b108	stp x8,x10,[x20, #0x8]
0087b10c	b.ls 0x0087b118
0087b110	ldr x9,[x20]
0087b114	stp x8,x9,[x20]
0087b118	ldp x20,x19,[sp, #0x40]
0087b11c	ldr x25,[sp, #0x10]
0087b120	ldp x22,x21,[sp, #0x30]
0087b124	ldp x24,x23,[sp, #0x20]
0087b128	ldp x29,x30,[sp], #0x50
0087b12c	ret
