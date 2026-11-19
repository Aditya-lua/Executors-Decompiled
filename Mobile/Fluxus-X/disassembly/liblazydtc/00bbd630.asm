; FUN_00bbd630 @ 00bbd630
00bbd630	sub sp,sp,#0x160
00bbd634	stp x29,x30,[sp, #0x100]
00bbd638	stp x28,x27,[sp, #0x110]
00bbd63c	stp x26,x25,[sp, #0x120]
00bbd640	stp x24,x23,[sp, #0x130]
00bbd644	stp x22,x21,[sp, #0x140]
00bbd648	stp x20,x19,[sp, #0x150]
00bbd64c	add x29,sp,#0x100
00bbd650	mrs x21,tpidr_el0
00bbd654	mov w10,w5
00bbd658	mov x20,x1
00bbd65c	ldr x8,[x21, #0x28]
00bbd660	mov w9,#0x683c
00bbd664	mov x22,x0
00bbd668	add x24,x0,x9
00bbd66c	stur x8,[x29, #-0x10]
00bbd670	bic x8,x2,x2, ASR #0x3f
00bbd674	ldr x1,[x0, #0x75a8]
00bbd678	ldr x5,[x0, #0x7698]
00bbd67c	add x28,x20,x8
00bbd680	stur x1,[x29, #-0x30]
00bbd684	cbz w10,0x00bbd6e4
00bbd688	ldr x8,[x22, #0x74c8]
00bbd68c	ldr x11,[x22, #0x74d0]
00bbd690	ldr x9,[x22, #0x74d8]
00bbd694	str x8,[sp, #0x48]
00bbd698	mov w8,#0x1
00bbd69c	stp x9,x11,[x29, #-0x78]
00bbd6a0	str w8,[x24, #0xcf8]
00bbd6a4	cbz x4,0x00bbd850
00bbd6a8	ldp w25,w6,[x24]
00bbd6ac	ldr w17,[x24, #0x8]
00bbd6b0	mov w15,w10
00bbd6b4	subs x10,x4,#0x8
00bbd6b8	b.cc 0x00bbd744
00bbd6bc	ldr x9,[x3, x10#0x0]
00bbd6c0	lsr x8,x9,#0x38
00bbd6c4	cbz x8,0x00bbd850
00bbd6c8	cmn x4,#0x78
00bbd6cc	b.hi 0x00bbd850
00bbd6d0	clz w8,w8
00bbd6d4	mov w11,#0x8
00bbd6d8	eor w8,w8,#0x1f
00bbd6dc	sub w11,w11,w8
00bbd6e0	b 0x00bbd7e8
00bbd6e4	mov x23,x20
00bbd6e8	ldr w8,[x24, #0xe64]
00bbd6ec	cmp w8,#0x2
00bbd6f0	b.ne 0x00bbd72c
00bbd6f4	sub x19,x5,x1
00bbd6f8	sub x8,x28,x23
00bbd6fc	cmp x19,x8
00bbd700	b.hi 0x00bbd73c
00bbd704	cbz x23,0x00bbd718
00bbd708	mov x0,x23
00bbd70c	mov x2,x19
00bbd710	bl 0x00c2ff60
00bbd714	add x23,x23,x19
00bbd718	mov w8,#0x76a4
00bbd71c	add x9,x22,#0x17, LSL #12
00bbd720	str wzr,[x24, #0xe64]
00bbd724	add x1,x22,x8
00bbd728	add x5,x9,#0x6a4
00bbd72c	sub x19,x5,x1
00bbd730	sub x8,x28,x23
00bbd734	cmp x19,x8
00bbd738	b.ls 0x00bbd76c
00bbd73c	mov x0,#-0x46
00bbd740	b 0x00bbebc4
00bbd744	ldrb w9,[x3]
00bbd748	cmp x4,#0x4
00bbd74c	b.gt 0x00bbd784
00bbd750	cmp x4,#0x2
00bbd754	b.eq 0x00bbd7c4
00bbd758	cmp x4,#0x3
00bbd75c	b.eq 0x00bbd7bc
00bbd760	cmp x4,#0x4
00bbd764	b.eq 0x00bbd7b4
00bbd768	b 0x00bbd7cc
00bbd76c	cbz x23,0x00bbe01c
00bbd770	mov x0,x23
00bbd774	mov x2,x19
00bbd778	bl 0x00c2ffd0
00bbd77c	add x8,x23,x19
00bbd780	b 0x00bbe020
00bbd784	cmp x4,#0x5
00bbd788	b.eq 0x00bbd7ac
00bbd78c	cmp x4,#0x6
00bbd790	b.eq 0x00bbd7a4
00bbd794	cmp x4,#0x7
00bbd798	b.ne 0x00bbd7cc
00bbd79c	ldrb w8,[x3, #0x6]
00bbd7a0	orr x9,x9,x8, LSL #0x30
00bbd7a4	ldrb w8,[x3, #0x5]
00bbd7a8	add x9,x9,x8, LSL #0x28
00bbd7ac	ldrb w8,[x3, #0x4]
00bbd7b0	add x9,x9,x8, LSL #0x20
00bbd7b4	ldrb w8,[x3, #0x3]
00bbd7b8	add x9,x9,x8, LSL #0x18
00bbd7bc	ldrb w8,[x3, #0x2]
00bbd7c0	add x9,x9,x8, LSL #0x10
00bbd7c4	ldrb w8,[x3, #0x1]
00bbd7c8	add x9,x9,x8, LSL #0x8
00bbd7cc	add x8,x3,x4
00bbd7d0	ldurb w8,[x8, #-0x1]
00bbd7d4	cbz w8,0x00bbd850
00bbd7d8	clz w8,w8
00bbd7dc	mov x10,xzr
00bbd7e0	sub w8,w8,w4, LSL #0x3
00bbd7e4	add w11,w8,#0x29
00bbd7e8	ldr x8,[x22]
00bbd7ec	str x28,[sp, #0x28]
00bbd7f0	ldr w13,[x8, #0x4]
00bbd7f4	add w12,w13,w11
00bbd7f8	adrp x11,0x789000
00bbd7fc	add x11,x11,#0xa30
00bbd800	ldr w11,[x11, x13, LSL #0x2]
00bbd804	cmp w12,#0x40
00bbd808	neg w13,w12
00bbd80c	b.hi 0x00bbec00
00bbd810	cmp x10,#0x8
00bbd814	add x14,x3,x10
00bbd818	mov w28,w15
00bbd81c	b.ge 0x00bbd858
00bbd820	mov x27,x9
00bbd824	stur x3,[x29, #-0x40]
00bbd828	cbz x10,0x00bbd86c
00bbd82c	lsr w15,w12,#0x3
00bbd830	sub x16,x14,x15
00bbd834	cmp x16,x3
00bbd838	csel w10,w10,w15,cc
00bbd83c	sub x14,x14,x10
00bbd840	sub w12,w12,w10, LSL #0x3
00bbd844	ldr x27,[x14]
00bbd848	stur x14,[x29, #-0x40]
00bbd84c	b 0x00bbd86c
00bbd850	mov x0,#-0x14
00bbd854	b 0x00bbebc4
00bbd858	lsr w10,w12,#0x3
00bbd85c	and w12,w12,#0x7
00bbd860	sub x10,x14,x10
00bbd864	ldr x27,[x10]
00bbd868	stur x10,[x29, #-0x40]
00bbd86c	ldr x10,[x22, #0x10]
00bbd870	add x1,x3,#0x8
00bbd874	str x3,[sp, #0x50]
00bbd878	stp x21,x20,[sp, #0x38]
00bbd87c	ldr w14,[x10, #0x4]
00bbd880	str x24,[sp, #0x20]
00bbd884	str x17,[sp, #0x80]
00bbd888	add w15,w14,w12
00bbd88c	lsr x12,x9,x13
00bbd890	neg w9,w15
00bbd894	cmp w15,#0x40
00bbd898	lsr x13,x27,x9
00bbd89c	adrp x9,0x789000
00bbd8a0	add x9,x9,#0xa30
00bbd8a4	ldr w14,[x9, x14, LSL #0x2]
00bbd8a8	b.hi 0x00bbec18
00bbd8ac	ldur x0,[x29, #-0x40]
00bbd8b0	cmp x0,x1
00bbd8b4	b.cs 0x00bbd8e0
00bbd8b8	cmp x0,x3
00bbd8bc	b.eq 0x00bbd8f4
00bbd8c0	lsr w9,w15,#0x3
00bbd8c4	sub w17,w0,w3
00bbd8c8	sub x16,x0,x9
00bbd8cc	cmp x16,x3
00bbd8d0	csel w9,w17,w9,cc
00bbd8d4	sub x0,x0,x9
00bbd8d8	sub w15,w15,w9, LSL #0x3
00bbd8dc	b 0x00bbd8ec
00bbd8e0	lsr w9,w15,#0x3
00bbd8e4	and w15,w15,#0x7
00bbd8e8	sub x0,x0,x9
00bbd8ec	ldr x27,[x0]
00bbd8f0	stur x0,[x29, #-0x40]
00bbd8f4	ldr x9,[x22, #0x8]
00bbd8f8	adrp x17,0x789000
00bbd8fc	add x17,x17,#0xa30
00bbd900	ldr x21,[sp, #0x48]
00bbd904	and x3,x12,x11
00bbd908	ldr w16,[x9, #0x4]
00bbd90c	add w19,w16,w15
00bbd910	ldr w16,[x17, x16, LSL #0x2]
00bbd914	and x17,x13,x14
00bbd918	neg w15,w19
00bbd91c	cmp w19,#0x40
00bbd920	lsr x15,x27,x15
00bbd924	and x20,x15,x16
00bbd928	b.hi 0x00bbec28
00bbd92c	ldur x15,[x29, #-0x40]
00bbd930	cmp x15,x1
00bbd934	b.cs 0x00bbd964
00bbd938	ldr x14,[sp, #0x50]
00bbd93c	cmp x15,x14
00bbd940	b.eq 0x00bbd978
00bbd944	lsr w11,w19,#0x3
00bbd948	sub w13,w15,w14
00bbd94c	sub x12,x15,x11
00bbd950	cmp x12,x14
00bbd954	csel w11,w13,w11,cc
00bbd958	sub x15,x15,x11
00bbd95c	sub w19,w19,w11, LSL #0x3
00bbd960	b 0x00bbd970
00bbd964	lsr w11,w19,#0x3
00bbd968	and w19,w19,#0x7
00bbd96c	sub x15,x15,x11
00bbd970	ldr x27,[x15]
00bbd974	stur x15,[x29, #-0x40]
00bbd978	add x4,x8,#0x8
00bbd97c	add x8,x21,#0x10
00bbd980	ldr x23,[sp, #0x40]
00bbd984	add x7,x10,#0x8
00bbd988	add x30,x9,#0x8
00bbd98c	str x8,[sp, #0x30]
00bbd990	add x8,x21,#0x18
00bbd994	stur x22,[x29, #-0x48]
00bbd998	str x8,[sp, #0x18]
00bbd99c	stp x1,x30,[sp, #0x58]
00bbd9a0	stp x4,x5,[sp, #0x70]
00bbd9a4	str x7,[sp, #0x68]
00bbd9a8	add x9,x7,x17, LSL #0x3
00bbd9ac	add x10,x4,x3, LSL #0x3
00bbd9b0	ldrb w12,[x9, #0x2]
00bbd9b4	ldr w8,[x10, #0x4]
00bbd9b8	ldr w11,[x9, #0x4]
00bbd9bc	cmp w12,#0x2
00bbd9c0	b.cc 0x00bbd9e8
00bbd9c4	lsl x13,x27,x19
00bbd9c8	neg w14,w12
00bbd9cc	str x6,[sp, #0x80]
00bbd9d0	mov x6,x25
00bbd9d4	add w19,w19,w12
00bbd9d8	lsr x13,x13,x14
00bbd9dc	add x11,x13,x11
00bbd9e0	mov x25,x11
00bbd9e4	b 0x00bbd9fc
00bbd9e8	cmp w8,#0x0
00bbd9ec	cbnz w12,0x00bbde6c
00bbd9f0	csel x11,x25,x6,eq
00bbd9f4	csel x25,x6,x25,eq
00bbd9f8	mov x6,x11
00bbd9fc	add x11,x30,x20, LSL #0x3
00bbda00	ldrb w14,[x11, #0x2]
00bbda04	ldr w16,[x11, #0x4]
00bbda08	cbz w14,0x00bbda24
00bbda0c	lsl x13,x27,x19
00bbda10	neg w15,w14
00bbda14	add w26,w19,w14
00bbda18	lsr x13,x13,x15
00bbda1c	add x16,x13,x16
00bbda20	b 0x00bbda28
00bbda24	mov w26,w19
00bbda28	ldrb w13,[x10, #0x2]
00bbda2c	add w14,w14,w13
00bbda30	add w12,w14,w12
00bbda34	and w12,w12,#0xff
00bbda38	cmp w12,#0x1f
00bbda3c	b.cs 0x00bbdd88
00bbda40	cbz w13,0x00bbda58
00bbda44	lsl x12,x27,x26
00bbda48	neg w14,w13
00bbda4c	add w26,w26,w13
00bbda50	lsr x12,x12,x14
00bbda54	add x8,x12,x8
00bbda58	subs w2,w28,#0x1
00bbda5c	b.ne 0x00bbda7c
00bbda60	ldur x11,[x29, #-0x30]
00bbda64	ldr x12,[x22, #0x7698]
00bbda68	add x10,x11,x8
00bbda6c	cmp x10,x12
00bbda70	b.hi 0x00bbe068
00bbda74	stur x26,[x29, #-0x38]
00bbda78	b 0x00bbdb98
00bbda7c	ldrb w15,[x10, #0x3]
00bbda80	ldrb w14,[x11, #0x3]
00bbda84	ldrb w12,[x9, #0x3]
00bbda88	stur x25,[x29, #-0x50]
00bbda8c	mov x25,x6
00bbda90	mov x6,x21
00bbda94	add w17,w26,w15
00bbda98	mov x21,x30
00bbda9c	mov x30,x7
00bbdaa0	mov x7,x4
00bbdaa4	mov x4,x16
00bbdaa8	add w16,w17,w14
00bbdaac	add w13,w16,w12
00bbdab0	cmp w13,#0x40
00bbdab4	b.hi 0x00bbde90
00bbdab8	ldur x24,[x29, #-0x40]
00bbdabc	mov x19,x1
00bbdac0	cmp x24,x1
00bbdac4	b.cs 0x00bbdafc
00bbdac8	ldr x3,[sp, #0x50]
00bbdacc	cmp x24,x3
00bbdad0	b.eq 0x00bbdea0
00bbdad4	lsr w0,w13,#0x3
00bbdad8	mov w20,w2
00bbdadc	sub w2,w24,w3
00bbdae0	sub x1,x24,x0
00bbdae4	cmp x1,x3
00bbdae8	csel w0,w2,w0,cc
00bbdaec	mov w2,w20
00bbdaf0	sub x24,x24,x0
00bbdaf4	sub w0,w13,w0, LSL #0x3
00bbdaf8	b 0x00bbdb08
00bbdafc	lsr w0,w13,#0x3
00bbdb00	sub x24,x24,x0
00bbdb04	and w0,w13,#0x7
00bbdb08	ldr x26,[x24]
00bbdb0c	stp x24,x0,[x29, #-0x40]
00bbdb10	ldrh w0,[x10]
00bbdb14	ldrh w1,[x11]
00bbdb18	neg w10,w17
00bbdb1c	neg w11,w16
00bbdb20	adrp x17,0x789000
00bbdb24	add x17,x17,#0xa30
00bbdb28	neg w13,w13
00bbdb2c	ldr w15,[x17, w15, UXTW #0x2]
00bbdb30	lsr x10,x27,x10
00bbdb34	lsr x16,x27,x11
00bbdb38	ldr w14,[x17, w14, UXTW #0x2]
00bbdb3c	ldur x11,[x29, #-0x30]
00bbdb40	lsr x13,x27,x13
00bbdb44	ldr w17,[x17, w12, UXTW #0x2]
00bbdb48	ldr x12,[x22, #0x7698]
00bbdb4c	ldrh w9,[x9]
00bbdb50	and x15,x10,x15
00bbdb54	add x10,x11,x8
00bbdb58	and x14,x16,x14
00bbdb5c	and x13,x13,x17
00bbdb60	cmp x10,x12
00bbdb64	add x3,x15,x0
00bbdb68	add x20,x14,x1
00bbdb6c	add x17,x13,x9
00bbdb70	b.hi 0x00bbe078
00bbdb74	mov x16,x4
00bbdb78	mov x4,x7
00bbdb7c	mov x7,x30
00bbdb80	mov x30,x21
00bbdb84	mov x21,x6
00bbdb88	mov x6,x25
00bbdb8c	ldur x25,[x29, #-0x50]
00bbdb90	mov x27,x26
00bbdb94	mov x1,x19
00bbdb98	cmp x10,x5
00bbdb9c	sub x2,x10,#0x20
00bbdba0	b.hi 0x00bbdd2c
00bbdba4	add x0,x8,x16
00bbdba8	add x9,x23,x0
00bbdbac	cmp x9,x2
00bbdbb0	b.hi 0x00bbdd2c
00bbdbb4	ldr q0,[x11]
00bbdbb8	subs x9,x8,#0x10
00bbdbbc	add x19,x23,x8
00bbdbc0	str q0,[x23]
00bbdbc4	b.hi 0x00bbdde0
00bbdbc8	sub x22,x19,x21
00bbdbcc	sub x9,x19,x25
00bbdbd0	stur x10,[x29, #-0x30]
00bbdbd4	cmp x25,x22
00bbdbd8	b.ls 0x00bbdc7c
00bbdbdc	ldur x8,[x29, #-0x70]
00bbdbe0	sub x8,x19,x8
00bbdbe4	cmp x25,x8
00bbdbe8	b.hi 0x00bbebbc
00bbdbec	mov x24,x27
00bbdbf0	mov x27,x21
00bbdbf4	sub x21,x9,x21
00bbdbf8	ldur x9,[x29, #-0x78]
00bbdbfc	stur w28,[x29, #-0x60]
00bbdc00	mov x26,x20
00bbdc04	stp x17,x23,[x29, #-0x58]
00bbdc08	mov x23,x3
00bbdc0c	mov x28,x25
00bbdc10	add x1,x9,x21
00bbdc14	mov x25,x6
00bbdc18	stur x0,[x29, #-0x68]
00bbdc1c	add x8,x1,x16
00bbdc20	cmp x8,x9
00bbdc24	b.ls 0x00bbdcd0
00bbdc28	neg x2,x21
00bbdc2c	mov x0,x19
00bbdc30	mov x20,x16
00bbdc34	bl 0x00c2ff60
00bbdc38	ldp x1,x30,[sp, #0x58]
00bbdc3c	mov x3,x23
00bbdc40	ldp x4,x5,[sp, #0x70]
00bbdc44	mov x6,x25
00bbdc48	ldp x17,x23,[x29, #-0x58]
00bbdc4c	mov x25,x28
00bbdc50	ldr x7,[sp, #0x68]
00bbdc54	ldur w28,[x29, #-0x60]
00bbdc58	mov x16,x20
00bbdc5c	ldur x0,[x29, #-0x68]
00bbdc60	sub x19,x19,x21
00bbdc64	add x12,x21,x20
00bbdc68	mov x9,x27
00bbdc6c	mov x21,x27
00bbdc70	mov x20,x26
00bbdc74	mov x27,x24
00bbdc78	b 0x00bbdc80
00bbdc7c	mov x12,x16
00bbdc80	cmp x25,#0x10
00bbdc84	b.cc 0x00bbde18
00bbdc88	ldr q0,[x9]
00bbdc8c	cmp x12,#0x11
00bbdc90	str q0,[x19]
00bbdc94	b.cs 0x00bbdca0
00bbdc98	ldur x22,[x29, #-0x48]
00bbdc9c	b 0x00bbdd10
00bbdca0	ldur x22,[x29, #-0x48]
00bbdca4	add x8,x19,x12
00bbdca8	add x10,x19,#0x10
00bbdcac	add x9,x9,#0x20
00bbdcb0	ldur q0,[x9, #-0x10]
00bbdcb4	str q0,[x10]
00bbdcb8	ldr q0,[x9], #0x20
00bbdcbc	str q0,[x10, #0x10]
00bbdcc0	add x10,x10,#0x20
00bbdcc4	cmp x10,x8
00bbdcc8	b.cc 0x00bbdcb0
00bbdccc	b 0x00bbdd10
00bbdcd0	mov x0,x19
00bbdcd4	mov x2,x16
00bbdcd8	bl 0x00c2ff60
00bbdcdc	ldp x1,x30,[sp, #0x58]
00bbdce0	mov x3,x23
00bbdce4	ldp x4,x5,[sp, #0x70]
00bbdce8	mov x6,x25
00bbdcec	ldp x23,x22,[x29, #-0x50]
00bbdcf0	mov x25,x28
00bbdcf4	ldr x7,[sp, #0x68]
00bbdcf8	ldur x17,[x29, #-0x58]
00bbdcfc	mov x21,x27
00bbdd00	ldur w28,[x29, #-0x60]
00bbdd04	ldur x0,[x29, #-0x68]
00bbdd08	mov x20,x26
00bbdd0c	mov x27,x24
00bbdd10	cmn x0,#0x78
00bbdd14	b.hi 0x00bbebb4
00bbdd18	ldur x19,[x29, #-0x38]
00bbdd1c	subs w28,w28,#0x1
00bbdd20	add x23,x23,x0
00bbdd24	b.ne 0x00bbd9a8
00bbdd28	b 0x00bbe028
00bbdd2c	stp x8,x16,[x29, #-0x28]
00bbdd30	ldp x8,x7,[x29, #-0x78]
00bbdd34	mov x26,x1
00bbdd38	ldr x1,[sp, #0x28]
00bbdd3c	mov x24,x22
00bbdd40	mov x22,x3
00bbdd44	sub x3,x29,#0x28
00bbdd48	sub x4,x29,#0x30
00bbdd4c	mov x0,x23
00bbdd50	mov x19,x6
00bbdd54	mov x6,x21
00bbdd58	stur x25,[x29, #-0x18]
00bbdd5c	stur x17,[x29, #-0x58]
00bbdd60	str x8,[sp]
00bbdd64	bl 0x00bc006c
00bbdd68	ldp x30,x7,[sp, #0x60]
00bbdd6c	mov x1,x26
00bbdd70	ldp x4,x5,[sp, #0x70]
00bbdd74	mov x3,x22
00bbdd78	ldur x17,[x29, #-0x58]
00bbdd7c	mov x22,x24
00bbdd80	mov x6,x19
00bbdd84	b 0x00bbdd10
00bbdd88	cmp w26,#0x40
00bbdd8c	b.hi 0x00bbe00c
00bbdd90	ldur x0,[x29, #-0x40]
00bbdd94	cmp x0,x1
00bbdd98	b.cs 0x00bbdeb0
00bbdd9c	mov x2,x17
00bbdda0	mov x17,x16
00bbdda4	ldr x16,[sp, #0x50]
00bbdda8	cmp x0,x16
00bbddac	b.eq 0x00bbddd4
00bbddb0	lsr w12,w26,#0x3
00bbddb4	sub w15,w0,w16
00bbddb8	sub x14,x0,x12
00bbddbc	cmp x14,x16
00bbddc0	csel w12,w15,w12,cc
00bbddc4	sub x0,x0,x12
00bbddc8	sub w26,w26,w12, LSL #0x3
00bbddcc	ldr x27,[x0]
00bbddd0	stur x0,[x29, #-0x40]
00bbddd4	mov x16,x17
00bbddd8	mov x17,x2
00bbdddc	b 0x00bbda40
00bbdde0	ldr q0,[x11, #0x10]
00bbdde4	cmp x9,#0x11
00bbdde8	str q0,[x23, #0x10]
00bbddec	b.cc 0x00bbdbc8
00bbddf0	add x8,x23,#0x20
00bbddf4	add x9,x11,#0x30
00bbddf8	ldur q0,[x9, #-0x10]
00bbddfc	str q0,[x8]
00bbde00	ldr q0,[x9], #0x20
00bbde04	str q0,[x8, #0x10]
00bbde08	add x8,x8,#0x20
00bbde0c	cmp x8,x19
00bbde10	b.cc 0x00bbddf8
00bbde14	b 0x00bbdbc8
00bbde18	cmp x25,#0x7
00bbde1c	b.hi 0x00bbdec8
00bbde20	ldrb w8,[x9]
00bbde24	adrp x10,0x364000
00bbde28	add x10,x10,#0xd10
00bbde2c	ldrsw x10,[x10, x25, LSL #0x2]
00bbde30	strb w8,[x19]
00bbde34	ldrb w8,[x9, #0x1]
00bbde38	strb w8,[x19, #0x1]
00bbde3c	ldrb w8,[x9, #0x2]
00bbde40	strb w8,[x19, #0x2]
00bbde44	ldrb w8,[x9, #0x3]
00bbde48	strb w8,[x19, #0x3]
00bbde4c	adrp x8,0x364000
00bbde50	add x8,x8,#0xe10
00bbde54	ldr w8,[x8, x25, LSL #0x2]
00bbde58	add x8,x9,x8
00bbde5c	ldr w9,[x8]
00bbde60	str w9,[x19, #0x4]
00bbde64	sub x9,x8,x10
00bbde68	b 0x00bbded0
00bbde6c	lsl x13,x27,x19
00bbde70	cinc w11,w11,eq
00bbde74	add x11,x11,x13, LSR #0x3f
00bbde78	cmp x11,#0x1
00bbde7c	b.eq 0x00bbdfe0
00bbde80	cmp x11,#0x3
00bbde84	b.ne 0x00bbdfcc
00bbde88	sub x11,x25,#0x1
00bbde8c	b 0x00bbdfd8
00bbde90	adrp x0,0x789000
00bbde94	add x0,x0,#0xab0
00bbde98	mov x19,x1
00bbde9c	stur x0,[x29, #-0x40]
00bbdea0	mov w0,w13
00bbdea4	mov x26,x27
00bbdea8	stur x0,[x29, #-0x38]
00bbdeac	b 0x00bbdb10
00bbdeb0	lsr w12,w26,#0x3
00bbdeb4	and w26,w26,#0x7
00bbdeb8	sub x0,x0,x12
00bbdebc	ldr x27,[x0]
00bbdec0	stur x0,[x29, #-0x40]
00bbdec4	b 0x00bbda40
00bbdec8	ldr x8,[x9]
00bbdecc	str x8,[x19]
00bbded0	cmp x12,#0x9
00bbded4	b.cc 0x00bbdc98
00bbded8	add x11,x9,#0x8
00bbdedc	add x10,x19,#0x8
00bbdee0	add x8,x19,x12
00bbdee4	sub x13,x10,x11
00bbdee8	cmp x13,#0xf
00bbdeec	b.gt 0x00bbdf90
00bbdef0	cmp x25,x22
00bbdef4	add x12,x16,x21
00bbdef8	ldr x15,[sp, #0x30]
00bbdefc	csel x14,x25,x22,cc
00bbdf00	add x12,x12,x14
00bbdf04	csel x14,x25,x22,hi
00bbdf08	add x12,x12,x14
00bbdf0c	add x15,x15,x14
00bbdf10	sub x12,x12,x25
00bbdf14	cmp x12,x15
00bbdf18	csel x12,x12,x15,hi
00bbdf1c	add x15,x14,x21
00bbdf20	sub x12,x12,x15
00bbdf24	sub x12,x12,#0x9
00bbdf28	cmp x12,#0x18
00bbdf2c	b.cc 0x00bbdff4
00bbdf30	ldur x22,[x29, #-0x48]
00bbdf34	cmp x13,#0x20
00bbdf38	b.cc 0x00bbdff8
00bbdf3c	lsr x12,x12,#0x3
00bbdf40	ldr x16,[sp, #0x18]
00bbdf44	sub x14,x14,x23
00bbdf48	add x9,x9,#0x18
00bbdf4c	add x12,x12,#0x1
00bbdf50	add x16,x23,x16
00bbdf54	and x13,x12,#0x3ffffffffffffffc
00bbdf58	add x14,x16,x14
00bbdf5c	lsl x15,x13,#0x3
00bbdf60	add x10,x10,x15
00bbdf64	add x11,x11,x15
00bbdf68	mov x15,x13
00bbdf6c	ldp q0,q1,[x9, #-0x10]
00bbdf70	subs x15,x15,#0x4
00bbdf74	add x9,x9,#0x20
00bbdf78	stp q0,q1,[x14, #-0x10]
00bbdf7c	add x14,x14,#0x20
00bbdf80	b.ne 0x00bbdf6c
00bbdf84	cmp x12,x13
00bbdf88	b.ne 0x00bbdff8
00bbdf8c	b 0x00bbdd10
00bbdf90	sub x12,x12,#0x8
00bbdf94	ldr q0,[x11]
00bbdf98	cmp x12,#0x11
00bbdf9c	str q0,[x10]
00bbdfa0	b.cc 0x00bbdc98
00bbdfa4	add x10,x19,#0x18
00bbdfa8	add x9,x9,#0x28
00bbdfac	ldur q0,[x9, #-0x10]
00bbdfb0	str q0,[x10]
00bbdfb4	ldr q0,[x9], #0x20
00bbdfb8	str q0,[x10, #0x10]
00bbdfbc	add x10,x10,#0x20
00bbdfc0	cmp x10,x8
00bbdfc4	b.cc 0x00bbdfac
00bbdfc8	b 0x00bbdc98
00bbdfcc	cmp x11,#0x0
00bbdfd0	ldr x11,[sp, #0x80]
00bbdfd4	csel x11,x25,x11,eq
00bbdfd8	str x6,[sp, #0x80]
00bbdfdc	mov x6,x11
00bbdfe0	cmp x6,#0x0
00bbdfe4	add w19,w19,#0x1
00bbdfe8	csinv x11,x6,xzr,ne
00bbdfec	mov x6,x25
00bbdff0	b 0x00bbd9e0
00bbdff4	ldur x22,[x29, #-0x48]
00bbdff8	ldr x9,[x11], #0x8
00bbdffc	str x9,[x10], #0x8
00bbe000	cmp x10,x8
00bbe004	b.cc 0x00bbdff8
00bbe008	b 0x00bbdd10
00bbe00c	adrp x12,0x789000
00bbe010	add x12,x12,#0xab0
00bbe014	stur x12,[x29, #-0x40]
00bbe018	b 0x00bbda40
00bbe01c	mov x8,xzr
00bbe020	sub x0,x8,x20
00bbe024	b 0x00bbebc4
00bbe028	ldr x28,[sp, #0x28]
00bbe02c	ldur x27,[x29, #-0x40]
00bbe030	ldr x8,[sp, #0x50]
00bbe034	cmp x27,x8
00bbe038	b.ne 0x00bbebbc
00bbe03c	ldr x21,[sp, #0x38]
00bbe040	cmp w19,#0x40
00bbe044	mov x0,#-0x14
00bbe048	b.ne 0x00bbebc4
00bbe04c	ldr x24,[sp, #0x20]
00bbe050	ldur x1,[x29, #-0x30]
00bbe054	ldr x8,[sp, #0x80]
00bbe058	ldr x20,[sp, #0x40]
00bbe05c	stp w25,w6,[x24]
00bbe060	str w8,[x24, #0x8]
00bbe064	b 0x00bbd6e8
00bbe068	stur x17,[x29, #-0x58]
00bbe06c	mov w17,w26
00bbe070	mov x26,x27
00bbe074	b 0x00bbe0a8
00bbe078	stur x17,[x29, #-0x58]
00bbe07c	ldur x17,[x29, #-0x38]
00bbe080	mov x16,x4
00bbe084	mov x4,x7
00bbe088	mov x7,x30
00bbe08c	mov x30,x21
00bbe090	mov x21,x6
00bbe094	mov x6,x25
00bbe098	ldur x25,[x29, #-0x50]
00bbe09c	cmp w28,#0x1
00bbe0a0	mov x1,x19
00bbe0a4	b.lt 0x00bbebbc
00bbe0a8	subs x9,x12,x11
00bbe0ac	stur w28,[x29, #-0x60]
00bbe0b0	str x20,[sp, #0x8]
00bbe0b4	b.eq 0x00bbe0d8
00bbe0b8	ldr x28,[sp, #0x28]
00bbe0bc	ldur x27,[x29, #-0x40]
00bbe0c0	sub x10,x28,x23
00bbe0c4	cmp x9,x10
00bbe0c8	b.ls 0x00bbe0ec
00bbe0cc	ldr x21,[sp, #0x38]
00bbe0d0	mov x0,#-0x46
00bbe0d4	b 0x00bbebc4
00bbe0d8	ldr x28,[sp, #0x28]
00bbe0dc	ldur x27,[x29, #-0x40]
00bbe0e0	mov x0,x23
00bbe0e4	stur x17,[x29, #-0x38]
00bbe0e8	b 0x00bbe32c
00bbe0ec	sub x13,x23,x11
00bbe0f0	add x10,x23,x9
00bbe0f4	stur x17,[x29, #-0x38]
00bbe0f8	cmn x13,#0x8
00bbe0fc	b.gt 0x00bbe16c
00bbe100	cmp x9,#0x7
00bbe104	b.ls 0x00bbe16c
00bbe108	cmn x13,#0x11
00bbe10c	b.hi 0x00bbe230
00bbe110	sub x12,x10,#0x20
00bbe114	mov x14,x23
00bbe118	mov x5,x6
00bbe11c	cmp x23,x12
00bbe120	b.hi 0x00bbe1b8
00bbe124	sub x13,x12,x14
00bbe128	ldr q0,[x11]
00bbe12c	cmp x13,#0x11
00bbe130	str q0,[x14]
00bbe134	b.cc 0x00bbe15c
00bbe138	add x14,x23,#0x10
00bbe13c	add x15,x11,#0x20
00bbe140	ldur q0,[x15, #-0x10]
00bbe144	str q0,[x14]
00bbe148	ldr q0,[x15], #0x20
00bbe14c	str q0,[x14, #0x10]
00bbe150	add x14,x14,#0x20
00bbe154	cmp x14,x12
00bbe158	b.cc 0x00bbe140
00bbe15c	mov x6,x16
00bbe160	add x11,x11,x13
00bbe164	mov x14,x23
00bbe168	b 0x00bbe240
00bbe16c	add x12,x23,x12
00bbe170	add x14,x23,#0x1
00bbe174	mov x5,x6
00bbe178	sub x12,x12,x11
00bbe17c	mov x6,x16
00bbe180	cmp x12,x14
00bbe184	csinc x12,x12,x23,hi
00bbe188	sub x12,x12,x23
00bbe18c	cmp x12,#0x8
00bbe190	b.cc 0x00bbe1ac
00bbe194	cmp x13,#0x20
00bbe198	b.cc 0x00bbe1ac
00bbe19c	cmp x12,#0x20
00bbe1a0	b.cs 0x00bbe1c4
00bbe1a4	mov x15,xzr
00bbe1a8	b 0x00bbe1fc
00bbe1ac	mov x13,x23
00bbe1b0	mov x14,x11
00bbe1b4	b 0x00bbe2ec
00bbe1b8	mov x6,x16
00bbe1bc	mov x12,x14
00bbe1c0	b 0x00bbe240
00bbe1c4	and x15,x12,#-0x20
00bbe1c8	add x13,x11,#0x10
00bbe1cc	add x14,x23,#0x10
00bbe1d0	mov x16,x15
00bbe1d4	ldp q0,q1,[x13, #-0x10]
00bbe1d8	subs x16,x16,#0x20
00bbe1dc	add x13,x13,#0x20
00bbe1e0	stp q0,q1,[x14, #-0x10]
00bbe1e4	add x14,x14,#0x20
00bbe1e8	b.ne 0x00bbe1d4
00bbe1ec	cmp x12,x15
00bbe1f0	b.eq 0x00bbe31c
00bbe1f4	tst x12,#0x18
00bbe1f8	b.eq 0x00bbe2e4
00bbe1fc	and x16,x12,#-0x8
00bbe200	add x17,x23,x15
00bbe204	add x13,x23,x16
00bbe208	add x14,x11,x16
00bbe20c	add x11,x11,x15
00bbe210	sub x15,x15,x16
00bbe214	ldr d0,[x11], #0x8
00bbe218	adds x15,x15,#0x8
00bbe21c	str d0,[x17], #0x8
00bbe220	b.ne 0x00bbe214
00bbe224	cmp x12,x16
00bbe228	b.ne 0x00bbe2ec
00bbe22c	b 0x00bbe31c
00bbe230	mov x5,x6
00bbe234	mov x6,x16
00bbe238	mov x14,x23
00bbe23c	mov x12,x23
00bbe240	add x13,x9,x14
00bbe244	sub x13,x13,x12
00bbe248	cmp x13,#0x8
00bbe24c	b.cc 0x00bbe26c
00bbe250	sub x14,x12,x11
00bbe254	cmp x14,#0x20
00bbe258	b.cc 0x00bbe26c
00bbe25c	cmp x13,#0x20
00bbe260	b.cs 0x00bbe278
00bbe264	mov x16,xzr
00bbe268	b 0x00bbe2b0
00bbe26c	mov x14,x12
00bbe270	mov x15,x11
00bbe274	b 0x00bbe308
00bbe278	and x16,x13,#-0x20
00bbe27c	add x14,x11,#0x10
00bbe280	add x15,x12,#0x10
00bbe284	mov x17,x16
00bbe288	ldp q0,q1,[x14, #-0x10]
00bbe28c	subs x17,x17,#0x20
00bbe290	add x14,x14,#0x20
00bbe294	stp q0,q1,[x15, #-0x10]
00bbe298	add x15,x15,#0x20
00bbe29c	b.ne 0x00bbe288
00bbe2a0	cmp x13,x16
00bbe2a4	b.eq 0x00bbe31c
00bbe2a8	tst x13,#0x18
00bbe2ac	b.eq 0x00bbe300
00bbe2b0	and x17,x13,#-0x8
00bbe2b4	add x0,x12,x16
00bbe2b8	add x14,x12,x17
00bbe2bc	add x15,x11,x17
00bbe2c0	add x11,x11,x16
00bbe2c4	sub x16,x16,x17
00bbe2c8	ldr d0,[x11], #0x8
00bbe2cc	adds x16,x16,#0x8
00bbe2d0	str d0,[x0], #0x8
00bbe2d4	b.ne 0x00bbe2c8
00bbe2d8	cmp x13,x17
00bbe2dc	b.ne 0x00bbe308
00bbe2e0	b 0x00bbe31c
00bbe2e4	add x13,x23,x15
00bbe2e8	add x14,x11,x15
00bbe2ec	ldrb w11,[x14], #0x1
00bbe2f0	strb w11,[x13], #0x1
00bbe2f4	cmp x13,x10
00bbe2f8	b.cc 0x00bbe2ec
00bbe2fc	b 0x00bbe31c
00bbe300	add x14,x12,x16
00bbe304	add x15,x11,x16
00bbe308	add x11,x12,x13
00bbe30c	ldrb w12,[x15], #0x1
00bbe310	strb w12,[x14], #0x1
00bbe314	cmp x14,x11
00bbe318	b.ne 0x00bbe30c
00bbe31c	sub x8,x8,x9
00bbe320	mov x0,x10
00bbe324	mov x16,x6
00bbe328	mov x6,x5
00bbe32c	ldr x11,[sp, #0x20]
00bbe330	add x9,x22,#0x17, LSL #12
00bbe334	add x19,x0,x8
00bbe338	add x5,x9,#0x6a4
00bbe33c	sub x9,x19,x25
00bbe340	cmp x8,#0x10, LSL #12
00bbe344	add x10,x11,#0xe68
00bbe348	str wzr,[x11, #0xe64]
00bbe34c	sub x17,x28,#0x20
00bbe350	stur x10,[x29, #-0x30]
00bbe354	prfm PLDL1KEEP,[x9]
00bbe358	ldur x20,[x29, #-0x58]
00bbe35c	str x5,[sp, #0x78]
00bbe360	str x17,[sp, #0x10]
00bbe364	b.gt 0x00bbec38
00bbe368	add x11,x8,x16
00bbe36c	mov x13,x11
00bbe370	add x11,x0,x11
00bbe374	cmp x11,x17
00bbe378	b.hi 0x00bbec38
00bbe37c	ldr q0,[x10]
00bbe380	add x11,x22,x8
00bbe384	mov w12,#0x76a4
00bbe388	subs x10,x8,#0x10
00bbe38c	add x8,x11,x12
00bbe390	mov x23,x0
00bbe394	str q0,[x0]
00bbe398	b.hi 0x00bbeca0
00bbe39c	sub x22,x19,x21
00bbe3a0	stur x8,[x29, #-0x30]
00bbe3a4	cmp x25,x22
00bbe3a8	stur x27,[x29, #-0x40]
00bbe3ac	b.ls 0x00bbe444
00bbe3b0	ldur x8,[x29, #-0x70]
00bbe3b4	stur x13,[x29, #-0x68]
00bbe3b8	str x26,[sp, #0x30]
00bbe3bc	sub x8,x19,x8
00bbe3c0	stur x25,[x29, #-0x50]
00bbe3c4	cmp x25,x8
00bbe3c8	b.hi 0x00bbebbc
00bbe3cc	mov x27,x21
00bbe3d0	sub x21,x9,x21
00bbe3d4	ldur x9,[x29, #-0x78]
00bbe3d8	mov x24,x3
00bbe3dc	mov x25,x6
00bbe3e0	str w2,[sp, #0x18]
00bbe3e4	add x1,x9,x21
00bbe3e8	add x8,x1,x16
00bbe3ec	cmp x8,x9
00bbe3f0	b.ls 0x00bbe4a4
00bbe3f4	neg x2,x21
00bbe3f8	mov x0,x19
00bbe3fc	mov x26,x16
00bbe400	bl 0x00c2ff60
00bbe404	mov x6,x25
00bbe408	ldp x20,x25,[x29, #-0x58]
00bbe40c	ldp x1,x30,[sp, #0x58]
00bbe410	mov x16,x26
00bbe414	ldp x4,x5,[sp, #0x70]
00bbe418	add x12,x21,x26
00bbe41c	ldr x7,[sp, #0x68]
00bbe420	ldr w2,[sp, #0x18]
00bbe424	sub x19,x19,x21
00bbe428	ldr x26,[sp, #0x30]
00bbe42c	ldr x17,[sp, #0x10]
00bbe430	mov x9,x27
00bbe434	ldur x13,[x29, #-0x68]
00bbe438	mov x21,x27
00bbe43c	mov x3,x24
00bbe440	b 0x00bbe448
00bbe444	mov x12,x16
00bbe448	cmp x25,#0x10
00bbe44c	b.cc 0x00bbece4
00bbe450	ldr q0,[x9]
00bbe454	cmp x12,#0x11
00bbe458	mov x0,x13
00bbe45c	str q0,[x19]
00bbe460	b.cs 0x00bbe470
00bbe464	ldur x22,[x29, #-0x48]
00bbe468	ldur x19,[x29, #-0x38]
00bbe46c	b 0x00bbe4e4
00bbe470	ldur x22,[x29, #-0x48]
00bbe474	add x8,x19,x12
00bbe478	add x10,x19,#0x10
00bbe47c	add x9,x9,#0x20
00bbe480	ldur q0,[x9, #-0x10]
00bbe484	str q0,[x10]
00bbe488	ldr q0,[x9], #0x20
00bbe48c	str q0,[x10, #0x10]
00bbe490	add x10,x10,#0x20
00bbe494	cmp x10,x8
00bbe498	b.cc 0x00bbe480
00bbe49c	ldur x19,[x29, #-0x38]
00bbe4a0	b 0x00bbe4e4
00bbe4a4	mov x0,x19
00bbe4a8	mov x2,x16
00bbe4ac	bl 0x00c2ff60
00bbe4b0	mov x6,x25
00bbe4b4	ldp x25,x22,[x29, #-0x50]
00bbe4b8	ldp x1,x30,[sp, #0x58]
00bbe4bc	mov x21,x27
00bbe4c0	ldp x4,x5,[sp, #0x70]
00bbe4c4	mov x3,x24
00bbe4c8	ldr x7,[sp, #0x68]
00bbe4cc	ldr w2,[sp, #0x18]
00bbe4d0	ldr x26,[sp, #0x30]
00bbe4d4	ldur x19,[x29, #-0x38]
00bbe4d8	ldr x17,[sp, #0x10]
00bbe4dc	ldur x0,[x29, #-0x68]
00bbe4e0	ldur x20,[x29, #-0x58]
00bbe4e4	cmn x0,#0x78
00bbe4e8	b.hi 0x00bbebb4
00bbe4ec	ldur w8,[x29, #-0x60]
00bbe4f0	add x23,x23,x0
00bbe4f4	cmp w8,#0x1
00bbe4f8	b.eq 0x00bbe02c
00bbe4fc	ldr x28,[sp, #0x8]
00bbe500	ldur x27,[x29, #-0x40]
00bbe504	add x9,x21,#0x10
00bbe508	add x8,x21,#0x18
00bbe50c	mov w24,w19
00bbe510	stp x8,x9,[x29, #-0x68]
00bbe514	add x9,x7,x20, LSL #0x3
00bbe518	add x10,x4,x3, LSL #0x3
00bbe51c	mov x19,x26
00bbe520	stur x23,[x29, #-0x50]
00bbe524	ldrb w12,[x9, #0x2]
00bbe528	ldr w8,[x10, #0x4]
00bbe52c	ldr w11,[x9, #0x4]
00bbe530	cmp w12,#0x2
00bbe534	b.cc 0x00bbe55c
00bbe538	lsl x13,x26,x24
00bbe53c	neg w14,w12
00bbe540	str x6,[sp, #0x80]
00bbe544	mov x23,x25
00bbe548	add w24,w24,w12
00bbe54c	lsr x13,x13,x14
00bbe550	add x11,x13,x11
00bbe554	mov x25,x11
00bbe558	b 0x00bbe56c
00bbe55c	cbnz w12,0x00bbe990
00bbe560	cmp w8,#0x0
00bbe564	csel x23,x25,x6,eq
00bbe568	csel x25,x6,x25,eq
00bbe56c	add x11,x30,x28, LSL #0x3
00bbe570	ldrb w14,[x11, #0x2]
00bbe574	ldr w16,[x11, #0x4]
00bbe578	cbz w14,0x00bbe594
00bbe57c	lsl x13,x26,x24
00bbe580	neg w15,w14
00bbe584	add w26,w24,w14
00bbe588	lsr x13,x13,x15
00bbe58c	add x16,x13,x16
00bbe590	b 0x00bbe598
00bbe594	mov w26,w24
00bbe598	ldrb w13,[x10, #0x2]
00bbe59c	stur x23,[x29, #-0x38]
00bbe5a0	add w14,w14,w13
00bbe5a4	add w12,w14,w12
00bbe5a8	and w12,w12,#0xff
00bbe5ac	cmp w12,#0x1f
00bbe5b0	b.cs 0x00bbe8ac
00bbe5b4	ldur x23,[x29, #-0x50]
00bbe5b8	cbz w13,0x00bbe5d0
00bbe5bc	lsl x12,x19,x26
00bbe5c0	neg w14,w13
00bbe5c4	add w26,w26,w13
00bbe5c8	lsr x12,x12,x14
00bbe5cc	add x8,x12,x8
00bbe5d0	cmp w2,#0x1
00bbe5d4	b.ne 0x00bbe5e0
00bbe5d8	mov w24,w26
00bbe5dc	b 0x00bbe6ac
00bbe5e0	ldrb w12,[x10, #0x3]
00bbe5e4	ldrb w13,[x11, #0x3]
00bbe5e8	mov x20,x16
00bbe5ec	ldrb w15,[x9, #0x3]
00bbe5f0	adrp x0,0x789000
00bbe5f4	add x0,x0,#0xa30
00bbe5f8	add w14,w26,w12
00bbe5fc	ldr w12,[x0, w12, UXTW #0x2]
00bbe600	mov x6,x17
00bbe604	neg w16,w14
00bbe608	add w14,w14,w13
00bbe60c	ldr w13,[x0, w13, UXTW #0x2]
00bbe610	lsr x16,x19,x16
00bbe614	add w24,w14,w15
00bbe618	neg w17,w14
00bbe61c	lsr x14,x19,x17
00bbe620	ldr w15,[x0, w15, UXTW #0x2]
00bbe624	ldrh w10,[x10]
00bbe628	and x12,x16,x12
00bbe62c	neg w16,w24
00bbe630	ldrh w11,[x11]
00bbe634	lsr x16,x19,x16
00bbe638	ldrh w9,[x9]
00bbe63c	and x13,x14,x13
00bbe640	cmp w24,#0x40
00bbe644	add x3,x12,x10
00bbe648	add x28,x13,x11
00bbe64c	and x14,x16,x15
00bbe650	add x10,x14,x9
00bbe654	b.hi 0x00bbe9c4
00bbe658	cmp x27,x1
00bbe65c	mov x17,x6
00bbe660	mov x16,x20
00bbe664	b.cs 0x00bbe698
00bbe668	ldr x12,[sp, #0x50]
00bbe66c	mov x20,x10
00bbe670	cmp x27,x12
00bbe674	b.eq 0x00bbe6ac
00bbe678	lsr w9,w24,#0x3
00bbe67c	sub w11,w27,w12
00bbe680	sub x10,x27,x9
00bbe684	cmp x10,x12
00bbe688	csel w9,w11,w9,cc
00bbe68c	sub x27,x27,x9
00bbe690	sub w24,w24,w9, LSL #0x3
00bbe694	b 0x00bbe6a8
00bbe698	lsr w9,w24,#0x3
00bbe69c	and w24,w24,#0x7
00bbe6a0	mov x20,x10
00bbe6a4	sub x27,x27,x9
00bbe6a8	ldr x19,[x27]
00bbe6ac	ldur x11,[x29, #-0x30]
00bbe6b0	str x19,[sp, #0x30]
00bbe6b4	add x19,x23,x8
00bbe6b8	sub x9,x19,x25
00bbe6bc	add x10,x11,x8
00bbe6c0	prfm PLDL1KEEP,[x9]
00bbe6c4	cmp x10,x5
00bbe6c8	b.hi 0x00bbe848
00bbe6cc	add x0,x8,x16
00bbe6d0	add x12,x23,x0
00bbe6d4	cmp x12,x17
00bbe6d8	b.hi 0x00bbe848
00bbe6dc	ldr q0,[x11]
00bbe6e0	subs x8,x8,#0x10
00bbe6e4	str q0,[x23]
00bbe6e8	b.hi 0x00bbe8f8
00bbe6ec	sub x22,x19,x21
00bbe6f0	ldur x6,[x29, #-0x38]
00bbe6f4	stur x10,[x29, #-0x30]
00bbe6f8	cmp x25,x22
00bbe6fc	b.ls 0x00bbe794
00bbe700	ldur x8,[x29, #-0x70]
00bbe704	stur x24,[x29, #-0x40]
00bbe708	sub x8,x19,x8
00bbe70c	cmp x25,x8
00bbe710	b.hi 0x00bbebbc
00bbe714	mov x26,x20
00bbe718	mov x20,x28
00bbe71c	mov x28,x21
00bbe720	sub x21,x9,x21
00bbe724	ldur x9,[x29, #-0x78]
00bbe728	mov x24,x0
00bbe72c	str w2,[sp, #0x18]
00bbe730	add x1,x9,x21
00bbe734	stur x3,[x29, #-0x58]
00bbe738	add x8,x1,x16
00bbe73c	cmp x8,x9
00bbe740	b.ls 0x00bbe7f0
00bbe744	neg x2,x21
00bbe748	mov x0,x19
00bbe74c	mov x23,x16
00bbe750	bl 0x00c2ff60
00bbe754	mov x16,x23
00bbe758	add x12,x21,x23
00bbe75c	mov x0,x24
00bbe760	ldp x1,x30,[sp, #0x58]
00bbe764	ldr x7,[sp, #0x68]
00bbe768	ldp x4,x5,[sp, #0x70]
00bbe76c	ldr w2,[sp, #0x18]
00bbe770	ldp x3,x23,[x29, #-0x58]
00bbe774	sub x19,x19,x21
00bbe778	ldp x24,x6,[x29, #-0x40]
00bbe77c	mov x9,x28
00bbe780	ldr x17,[sp, #0x10]
00bbe784	mov x21,x28
00bbe788	mov x28,x20
00bbe78c	mov x20,x26
00bbe790	b 0x00bbe798
00bbe794	mov x12,x16
00bbe798	cmp x25,#0x10
00bbe79c	b.cc 0x00bbe930
00bbe7a0	ldr q0,[x9]
00bbe7a4	cmp x12,#0x11
00bbe7a8	str q0,[x19]
00bbe7ac	b.cs 0x00bbe7c0
00bbe7b0	ldur x22,[x29, #-0x48]
00bbe7b4	cmn x0,#0x78
00bbe7b8	b.ls 0x00bbe834
00bbe7bc	b 0x00bbebb4
00bbe7c0	ldur x22,[x29, #-0x48]
00bbe7c4	add x8,x19,x12
00bbe7c8	add x10,x19,#0x10
00bbe7cc	add x9,x9,#0x20
00bbe7d0	ldur q0,[x9, #-0x10]
00bbe7d4	str q0,[x10]
00bbe7d8	ldr q0,[x9], #0x20
00bbe7dc	str q0,[x10, #0x10]
00bbe7e0	add x10,x10,#0x20
00bbe7e4	cmp x10,x8
00bbe7e8	b.cc 0x00bbe7d0
00bbe7ec	b 0x00bbe82c
00bbe7f0	mov x0,x19
00bbe7f4	mov x2,x16
00bbe7f8	bl 0x00c2ff60
00bbe7fc	ldp x23,x22,[x29, #-0x50]
00bbe800	mov x0,x24
00bbe804	ldp x1,x30,[sp, #0x58]
00bbe808	mov x21,x28
00bbe80c	ldp x4,x5,[sp, #0x70]
00bbe810	mov x28,x20
00bbe814	ldp x24,x6,[x29, #-0x40]
00bbe818	mov x20,x26
00bbe81c	ldr x7,[sp, #0x68]
00bbe820	ldur x3,[x29, #-0x58]
00bbe824	ldr w2,[sp, #0x18]
00bbe828	ldr x17,[sp, #0x10]
00bbe82c	cmn x0,#0x78
00bbe830	b.hi 0x00bbebb4
00bbe834	ldr x26,[sp, #0x30]
00bbe838	subs w2,w2,#0x1
00bbe83c	add x23,x23,x0
00bbe840	b.ne 0x00bbe514
00bbe844	b 0x00bbebf4
00bbe848	ldp x7,x6,[x29, #-0x78]
00bbe84c	mov x26,x24
00bbe850	mov x24,x1
00bbe854	ldr x1,[sp, #0x28]
00bbe858	str w2,[sp, #0x18]
00bbe85c	sub x2,x29,#0x28
00bbe860	mov x19,x3
00bbe864	sub x3,x29,#0x30
00bbe868	mov x0,x23
00bbe86c	mov x4,x5
00bbe870	mov x5,x21
00bbe874	stp x8,x16,[x29, #-0x28]
00bbe878	stur x25,[x29, #-0x18]
00bbe87c	bl 0x00bbf92c
00bbe880	ldp x30,x7,[sp, #0x60]
00bbe884	mov x1,x24
00bbe888	ldp x4,x5,[sp, #0x70]
00bbe88c	mov x24,x26
00bbe890	ldr w2,[sp, #0x18]
00bbe894	ldr x17,[sp, #0x10]
00bbe898	mov x3,x19
00bbe89c	ldur x6,[x29, #-0x38]
00bbe8a0	cmn x0,#0x78
00bbe8a4	b.ls 0x00bbe834
00bbe8a8	b 0x00bbebb4
00bbe8ac	mov x0,x16
00bbe8b0	cmp w26,#0x40
00bbe8b4	b.hi 0x00bbeba0
00bbe8b8	cmp x27,x1
00bbe8bc	b.cs 0x00bbe9dc
00bbe8c0	ldr x12,[sp, #0x50]
00bbe8c4	mov x14,x27
00bbe8c8	cmp x27,x12
00bbe8cc	b.eq 0x00bbeaf0
00bbe8d0	lsr w12,w26,#0x3
00bbe8d4	ldr x16,[sp, #0x50]
00bbe8d8	mov x27,x14
00bbe8dc	sub x14,x14,x12
00bbe8e0	sub w15,w27,w16
00bbe8e4	cmp x14,x16
00bbe8e8	csel w12,w15,w12,cc
00bbe8ec	sub x27,x27,x12
00bbe8f0	sub w26,w26,w12, LSL #0x3
00bbe8f4	b 0x00bbe9e8
00bbe8f8	ldr q0,[x11, #0x10]
00bbe8fc	cmp x8,#0x11
00bbe900	str q0,[x23, #0x10]
00bbe904	b.cc 0x00bbe6ec
00bbe908	add x8,x23,#0x20
00bbe90c	add x11,x11,#0x30
00bbe910	ldur q0,[x11, #-0x10]
00bbe914	str q0,[x8]
00bbe918	ldr q0,[x11], #0x20
00bbe91c	str q0,[x8, #0x10]
00bbe920	add x8,x8,#0x20
00bbe924	cmp x8,x19
00bbe928	b.cc 0x00bbe910
00bbe92c	b 0x00bbe6ec
00bbe930	mov x14,x16
00bbe934	mov x26,x0
00bbe938	mov x17,x25
00bbe93c	cmp x25,#0x7
00bbe940	b.hi 0x00bbea14
00bbe944	ldrb w8,[x9]
00bbe948	adrp x10,0x364000
00bbe94c	add x10,x10,#0xd10
00bbe950	ldrsw x10,[x10, x17, LSL #0x2]
00bbe954	strb w8,[x19]
00bbe958	ldrb w8,[x9, #0x1]
00bbe95c	strb w8,[x19, #0x1]
00bbe960	ldrb w8,[x9, #0x2]
00bbe964	strb w8,[x19, #0x2]
00bbe968	ldrb w8,[x9, #0x3]
00bbe96c	strb w8,[x19, #0x3]
00bbe970	adrp x8,0x364000
00bbe974	add x8,x8,#0xe10
00bbe978	ldr w8,[x8, x17, LSL #0x2]
00bbe97c	add x8,x9,x8
00bbe980	ldr w9,[x8]
00bbe984	str w9,[x19, #0x4]
00bbe988	sub x9,x8,x10
00bbe98c	b 0x00bbea1c
00bbe990	cmp w8,#0x0
00bbe994	lsl x13,x26,x24
00bbe998	mov x23,x25
00bbe99c	cinc w11,w11,eq
00bbe9a0	mov x5,x6
00bbe9a4	mov x14,x24
00bbe9a8	add x11,x11,x13, LSR #0x3f
00bbe9ac	cmp x11,#0x1
00bbe9b0	b.eq 0x00bbeb70
00bbe9b4	cmp x11,#0x3
00bbe9b8	b.ne 0x00bbeb5c
00bbe9bc	sub x11,x23,#0x1
00bbe9c0	b 0x00bbeb68
00bbe9c4	adrp x27,0x789000
00bbe9c8	add x27,x27,#0xab0
00bbe9cc	mov x17,x6
00bbe9d0	mov x16,x20
00bbe9d4	mov x20,x10
00bbe9d8	b 0x00bbe6ac
00bbe9dc	lsr w12,w26,#0x3
00bbe9e0	and w26,w26,#0x7
00bbe9e4	sub x27,x27,x12
00bbe9e8	ldr x19,[x27]
00bbe9ec	ldur x22,[x29, #-0x48]
00bbe9f0	ldr x21,[sp, #0x48]
00bbe9f4	ldr x1,[sp, #0x58]
00bbe9f8	ldp x4,x5,[sp, #0x70]
00bbe9fc	mov x16,x0
00bbea00	ldp x30,x7,[sp, #0x60]
00bbea04	ldur x23,[x29, #-0x50]
00bbea08	ldr x17,[sp, #0x10]
00bbea0c	cbnz w13,0x00bbe5bc
00bbea10	b 0x00bbe5d0
00bbea14	ldr x8,[x9]
00bbea18	str x8,[x19]
00bbea1c	cmp x12,#0x9
00bbea20	b.cc 0x00bbeb38
00bbea24	add x11,x9,#0x8
00bbea28	add x10,x19,#0x8
00bbea2c	add x8,x19,x12
00bbea30	sub x13,x10,x11
00bbea34	cmp x13,#0xf
00bbea38	b.gt 0x00bbeb00
00bbea3c	ldr x16,[sp, #0x48]
00bbea40	cmp x17,x22
00bbea44	ldur x15,[x29, #-0x60]
00bbea48	add x12,x14,x16
00bbea4c	csel x14,x17,x22,cc
00bbea50	add x12,x12,x14
00bbea54	csel x14,x17,x22,hi
00bbea58	add x12,x12,x14
00bbea5c	add x15,x15,x14
00bbea60	sub x12,x12,x17
00bbea64	cmp x12,x15
00bbea68	csel x12,x12,x15,hi
00bbea6c	add x15,x14,x16
00bbea70	sub x12,x12,x15
00bbea74	sub x12,x12,#0x9
00bbea78	cmp x12,#0x18
00bbea7c	b.cc 0x00bbeadc
00bbea80	cmp x13,#0x20
00bbea84	b.cc 0x00bbeadc
00bbea88	lsr x12,x12,#0x3
00bbea8c	ldur x0,[x29, #-0x50]
00bbea90	ldur x16,[x29, #-0x68]
00bbea94	add x9,x9,#0x18
00bbea98	add x12,x12,#0x1
00bbea9c	add x16,x0,x16
00bbeaa0	sub x14,x14,x0
00bbeaa4	and x13,x12,#0x3ffffffffffffffc
00bbeaa8	add x14,x16,x14
00bbeaac	lsl x15,x13,#0x3
00bbeab0	add x10,x10,x15
00bbeab4	add x11,x11,x15
00bbeab8	mov x15,x13
00bbeabc	ldp q0,q1,[x9, #-0x10]
00bbeac0	subs x15,x15,#0x4
00bbeac4	add x9,x9,#0x20
00bbeac8	stp q0,q1,[x14, #-0x10]
00bbeacc	add x14,x14,#0x20
00bbead0	b.ne 0x00bbeabc
00bbead4	cmp x12,x13
00bbead8	b.eq 0x00bbeb38
00bbeadc	ldr x9,[x11], #0x8
00bbeae0	str x9,[x10], #0x8
00bbeae4	cmp x10,x8
00bbeae8	b.cc 0x00bbeadc
00bbeaec	b 0x00bbeb38
00bbeaf0	ldur x22,[x29, #-0x48]
00bbeaf4	ldr x21,[sp, #0x48]
00bbeaf8	mov x27,x14
00bbeafc	b 0x00bbe9f4
00bbeb00	sub x12,x12,#0x8
00bbeb04	ldr q0,[x11]
00bbeb08	cmp x12,#0x11
00bbeb0c	str q0,[x10]
00bbeb10	b.cc 0x00bbeb38
00bbeb14	add x10,x19,#0x18
00bbeb18	add x9,x9,#0x28
00bbeb1c	ldur q0,[x9, #-0x10]
00bbeb20	str q0,[x10]
00bbeb24	ldr q0,[x9], #0x20
00bbeb28	str q0,[x10, #0x10]
00bbeb2c	add x10,x10,#0x20
00bbeb30	cmp x10,x8
00bbeb34	b.cc 0x00bbeb1c
00bbeb38	ldp x23,x22,[x29, #-0x50]
00bbeb3c	mov x25,x17
00bbeb40	ldp x1,x30,[sp, #0x58]
00bbeb44	mov x0,x26
00bbeb48	ldp x4,x5,[sp, #0x70]
00bbeb4c	ldur x6,[x29, #-0x38]
00bbeb50	ldr x21,[sp, #0x48]
00bbeb54	ldr x7,[sp, #0x68]
00bbeb58	b 0x00bbe828
00bbeb5c	cmp x11,#0x0
00bbeb60	ldr x11,[sp, #0x80]
00bbeb64	csel x11,x23,x11,eq
00bbeb68	str x5,[sp, #0x80]
00bbeb6c	mov x5,x11
00bbeb70	cmp x5,#0x0
00bbeb74	ldp x1,x30,[sp, #0x58]
00bbeb78	csinv x25,x5,xzr,ne
00bbeb7c	ldp x4,x5,[sp, #0x70]
00bbeb80	mov x24,x14
00bbeb84	ldur x22,[x29, #-0x48]
00bbeb88	ldr x21,[sp, #0x48]
00bbeb8c	ldr x7,[sp, #0x68]
00bbeb90	ldr x17,[sp, #0x10]
00bbeb94	add w24,w24,#0x1
00bbeb98	mov x26,x19
00bbeb9c	b 0x00bbe56c
00bbeba0	ldur x22,[x29, #-0x48]
00bbeba4	ldr x21,[sp, #0x48]
00bbeba8	adrp x27,0x789000
00bbebac	add x27,x27,#0xab0
00bbebb0	b 0x00bbe9f8
00bbebb4	ldr x21,[sp, #0x38]
00bbebb8	b 0x00bbebc4
00bbebbc	ldr x21,[sp, #0x38]
00bbebc0	mov x0,#-0x14
00bbebc4	ldr x8,[x21, #0x28]
00bbebc8	ldur x9,[x29, #-0x10]
00bbebcc	cmp x8,x9
00bbebd0	b.ne 0x00bbee7c
00bbebd4	ldp x20,x19,[sp, #0x150]
00bbebd8	ldp x22,x21,[sp, #0x140]
00bbebdc	ldp x24,x23,[sp, #0x130]
00bbebe0	ldp x26,x25,[sp, #0x120]
00bbebe4	ldp x28,x27,[sp, #0x110]
00bbebe8	ldp x29,x30,[sp, #0x100]
00bbebec	add sp,sp,#0x160
00bbebf0	ret
00bbebf4	ldr x28,[sp, #0x28]
00bbebf8	mov w19,w24
00bbebfc	b 0x00bbe030
00bbec00	adrp x10,0x789000
00bbec04	add x10,x10,#0xab0
00bbec08	mov x27,x9
00bbec0c	stur x10,[x29, #-0x40]
00bbec10	mov w28,w15
00bbec14	b 0x00bbd86c
00bbec18	adrp x9,0x789000
00bbec1c	add x9,x9,#0xab0
00bbec20	stur x9,[x29, #-0x40]
00bbec24	b 0x00bbd8f4
00bbec28	adrp x11,0x789000
00bbec2c	add x11,x11,#0xab0
00bbec30	stur x11,[x29, #-0x40]
00bbec34	b 0x00bbd978
00bbec38	mov x19,x6
00bbec3c	ldp x7,x6,[x29, #-0x78]
00bbec40	str x26,[sp, #0x30]
00bbec44	mov w26,w2
00bbec48	sub x2,x29,#0x28
00bbec4c	mov x20,x3
00bbec50	sub x3,x29,#0x30
00bbec54	mov x24,x1
00bbec58	mov x1,x28
00bbec5c	mov x4,x5
00bbec60	mov x5,x21
00bbec64	stp x8,x16,[x29, #-0x28]
00bbec68	mov x23,x0
00bbec6c	stur x25,[x29, #-0x18]
00bbec70	bl 0x00bbf92c
00bbec74	ldp x30,x7,[sp, #0x60]
00bbec78	mov w2,w26
00bbec7c	ldp x4,x5,[sp, #0x70]
00bbec80	mov x3,x20
00bbec84	ldr x26,[sp, #0x30]
00bbec88	ldr x17,[sp, #0x10]
00bbec8c	mov x6,x19
00bbec90	ldur x20,[x29, #-0x58]
00bbec94	ldur x19,[x29, #-0x38]
00bbec98	mov x1,x24
00bbec9c	b 0x00bbe4e4
00bbeca0	ldr x11,[sp, #0x20]
00bbeca4	cmp x10,#0x11
00bbeca8	add x11,x11,#0xe78
00bbecac	ldr q0,[x11]
00bbecb0	str q0,[x23, #0x10]
00bbecb4	b.cc 0x00bbe39c
00bbecb8	ldr x11,[sp, #0x20]
00bbecbc	add x10,x23,#0x20
00bbecc0	add x11,x11,#0xe98
00bbecc4	ldur q0,[x11, #-0x10]
00bbecc8	str q0,[x10]
00bbeccc	ldr q0,[x11], #0x20
00bbecd0	str q0,[x10, #0x10]
00bbecd4	add x10,x10,#0x20
00bbecd8	cmp x10,x19
00bbecdc	b.cc 0x00bbecc4
00bbece0	b 0x00bbe39c
00bbece4	mov x14,x16
00bbece8	mov x0,x13
00bbecec	mov x5,x6
00bbecf0	mov x17,x25
00bbecf4	cmp x25,#0x7
00bbecf8	b.hi 0x00bbed48
00bbecfc	ldrb w8,[x9]
00bbed00	adrp x10,0x364000
00bbed04	add x10,x10,#0xd10
00bbed08	ldrsw x10,[x10, x17, LSL #0x2]
00bbed0c	strb w8,[x19]
00bbed10	ldrb w8,[x9, #0x1]
00bbed14	strb w8,[x19, #0x1]
00bbed18	ldrb w8,[x9, #0x2]
00bbed1c	strb w8,[x19, #0x2]
00bbed20	ldrb w8,[x9, #0x3]
00bbed24	strb w8,[x19, #0x3]
00bbed28	adrp x8,0x364000
00bbed2c	add x8,x8,#0xe10
00bbed30	ldr w8,[x8, x17, LSL #0x2]
00bbed34	add x8,x9,x8
00bbed38	ldr w9,[x8]
00bbed3c	str w9,[x19, #0x4]
00bbed40	sub x9,x8,x10
00bbed44	b 0x00bbed50
00bbed48	ldr x8,[x9]
00bbed4c	str x8,[x19]
00bbed50	cmp x12,#0x9
00bbed54	b.cc 0x00bbee50
00bbed58	add x11,x9,#0x8
00bbed5c	add x10,x19,#0x8
00bbed60	add x8,x19,x12
00bbed64	sub x13,x10,x11
00bbed68	cmp x13,#0xf
00bbed6c	b.gt 0x00bbee18
00bbed70	ldr x15,[sp, #0x48]
00bbed74	cmp x17,x22
00bbed78	add x12,x14,x15
00bbed7c	csel x14,x17,x22,cc
00bbed80	add x12,x12,x14
00bbed84	csel x14,x17,x22,hi
00bbed88	add x12,x12,x14
00bbed8c	add x15,x14,x15
00bbed90	sub x12,x12,x17
00bbed94	add x16,x15,#0x10
00bbed98	cmp x12,x16
00bbed9c	csel x12,x12,x16,hi
00bbeda0	sub x12,x12,x15
00bbeda4	sub x12,x12,#0x9
00bbeda8	cmp x12,#0x18
00bbedac	b.cc 0x00bbee04
00bbedb0	cmp x13,#0x20
00bbedb4	b.cc 0x00bbee04
00bbedb8	lsr x12,x12,#0x3
00bbedbc	ldr x16,[sp, #0x48]
00bbedc0	add x9,x9,#0x18
00bbedc4	add x12,x12,#0x1
00bbedc8	add x14,x16,x14
00bbedcc	and x13,x12,#0x3ffffffffffffffc
00bbedd0	add x14,x14,#0x18
00bbedd4	lsl x15,x13,#0x3
00bbedd8	add x10,x10,x15
00bbeddc	add x11,x11,x15
00bbede0	mov x15,x13
00bbede4	ldp q0,q1,[x9, #-0x10]
00bbede8	subs x15,x15,#0x4
00bbedec	add x9,x9,#0x20
00bbedf0	stp q0,q1,[x14, #-0x10]
00bbedf4	add x14,x14,#0x20
00bbedf8	b.ne 0x00bbede4
00bbedfc	cmp x12,x13
00bbee00	b.eq 0x00bbee50
00bbee04	ldr x9,[x11], #0x8
00bbee08	str x9,[x10], #0x8
00bbee0c	cmp x10,x8
00bbee10	b.cc 0x00bbee04
00bbee14	b 0x00bbee50
00bbee18	sub x12,x12,#0x8
00bbee1c	ldr q0,[x11]
00bbee20	cmp x12,#0x11
00bbee24	str q0,[x10]
00bbee28	b.cc 0x00bbee50
00bbee2c	add x10,x19,#0x18
00bbee30	add x9,x9,#0x28
00bbee34	ldur q0,[x9, #-0x10]
00bbee38	str q0,[x10]
00bbee3c	ldr q0,[x9], #0x20
00bbee40	str q0,[x10, #0x10]
00bbee44	add x10,x10,#0x20
00bbee48	cmp x10,x8
00bbee4c	b.cc 0x00bbee34
00bbee50	mov x6,x5
00bbee54	ldp x1,x30,[sp, #0x58]
00bbee58	ldp x4,x5,[sp, #0x70]
00bbee5c	mov x25,x17
00bbee60	ldr x28,[sp, #0x28]
00bbee64	ldur x22,[x29, #-0x48]
00bbee68	ldr x21,[sp, #0x48]
00bbee6c	ldr x7,[sp, #0x68]
00bbee70	ldur x19,[x29, #-0x38]
00bbee74	ldr x17,[sp, #0x10]
00bbee78	b 0x00bbe4e4
00bbee7c	bl 0x00c2fec0
