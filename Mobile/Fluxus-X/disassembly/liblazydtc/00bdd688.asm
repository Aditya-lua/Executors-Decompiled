; FUN_00bdd688 @ 00bdd688
00bdd688	paciasp
00bdd68c	sub sp,sp,#0x1b0
00bdd690	stp x29,x30,[sp, #0x150]
00bdd694	stp x28,x27,[sp, #0x160]
00bdd698	stp x26,x25,[sp, #0x170]
00bdd69c	stp x24,x23,[sp, #0x180]
00bdd6a0	stp x22,x21,[sp, #0x190]
00bdd6a4	stp x20,x19,[sp, #0x1a0]
00bdd6a8	add x29,sp,#0x150
00bdd6ac	mov x0,x3
00bdd6b0	mov x21,x2
00bdd6b4	mov x19,x1
00bdd6b8	sub x8,x29,#0x48
00bdd6bc	sub x1,x29,#0x24
00bdd6c0	sub x2,x29,#0x28
00bdd6c4	sub x3,x29,#0x2c
00bdd6c8	stp x5,x4,[sp, #0x20]
00bdd6cc	sub x25,x29,#0x68
00bdd6d0	bl 0x00c44100
00bdd6d4	stp xzr,xzr,[x25, #0x8]
00bdd6d8	str xzr,[x25, #0x18]
00bdd6dc	sub x0,x29,#0x60
00bdd6e0	mov w1,#0x16
00bdd6e4	mov w2,wzr
00bdd6e8	sub x20,x29,#0x60
00bdd6ec	bl 0x00c30250
00bdd6f0	ldurb w8,[x29, #-0x60]
00bdd6f4	ldr x9,[x25, #0x18]
00bdd6f8	mov w26,wzr
00bdd6fc	add x27,sp,#0x48
00bdd700	mov w10,#0x1
00bdd704	orr x28,x20,#0x1
00bdd708	tst w8,#0x1
00bdd70c	mov w8,#0x45
00bdd710	add x22,sp,#0x3c
00bdd714	csinc x23,x9,x20,ne
00bdd718	add x20,sp,#0x40
00bdd71c	str wzr,[sp, #0x3c]
00bdd720	str x27,[sp, #0x40]
00bdd724	strb w10,[sp, #0x38]
00bdd728	strb w8,[sp, #0x34]
00bdd72c	str x23,[x25]
00bdd730	b 0x00bdd73c
00bdd734	add x8,x8,#0x1
00bdd738	str x8,[x19, #0x18]
00bdd73c	cbz x19,0x00bdd768
00bdd740	ldp x8,x9,[x19, #0x18]
00bdd744	cmp x8,x9
00bdd748	b.eq 0x00bdd778
00bdd74c	mov w24,wzr
00bdd750	cbz x21,0x00bdd770
00bdd754	ldp x8,x9,[x21, #0x18]
00bdd758	cmp x8,x9
00bdd75c	b.eq 0x00bdd79c
00bdd760	tbnz w24,#0x0,0x00bdd7c0
00bdd764	b 0x00bdd994
00bdd768	mov w24,#0x1
00bdd76c	cbnz x21,0x00bdd754
00bdd770	tbz w24,#0x0,0x00bdd7c0
00bdd774	b 0x00bdd994
00bdd778	ldr x8,[x19]
00bdd77c	ldr x8,[x8, #0x48]
00bdd780	mov x0,x19
00bdd784	blr x8
00bdd788	cmn w0,#0x1
00bdd78c	cset w24,eq
00bdd790	csel x19,xzr,x19,eq
00bdd794	cbnz x21,0x00bdd754
00bdd798	b 0x00bdd770
00bdd79c	ldr x8,[x21]
00bdd7a0	ldr x8,[x8, #0x48]
00bdd7a4	mov x0,x21
00bdd7a8	blr x8
00bdd7ac	cmn w0,#0x1
00bdd7b0	cset w8,eq
00bdd7b4	csel x21,xzr,x21,eq
00bdd7b8	cmp w24,w8
00bdd7bc	b.eq 0x00bdd994
00bdd7c0	ldurb w8,[x29, #-0x60]
00bdd7c4	ldr x9,[x25, #0x10]
00bdd7c8	ldr x11,[x25]
00bdd7cc	lsr x10,x8,#0x1
00bdd7d0	tst w8,#0x1
00bdd7d4	csel x24,x10,x9,eq
00bdd7d8	add x9,x23,x24
00bdd7dc	cmp x11,x9
00bdd7e0	b.ne 0x00bdd89c
00bdd7e4	cmp x24,#0x1
00bdd7e8	b.lt 0x00bdd800
00bdd7ec	sub x0,x29,#0x60
00bdd7f0	mov x1,x24
00bdd7f4	mov w2,wzr
00bdd7f8	bl 0x00c30250
00bdd7fc	b 0x00bdd824
00bdd800	lsl x9,x24,#0x1
00bdd804	tbnz w8,#0x0,0x00bdd818
00bdd808	lsl w8,w9,#0x1
00bdd80c	sturb w8,[x29, #-0x60]
00bdd810	mov x8,x28
00bdd814	b 0x00bdd820
00bdd818	ldr x8,[x25, #0x18]
00bdd81c	str x9,[x25, #0x10]
00bdd820	strb wzr,[x8, x9]
00bdd824	ldp x9,x10,[x25, #0x8]
00bdd828	ldurb w8,[x29, #-0x60]
00bdd82c	tst w8,#0x1
00bdd830	mov w8,#0x16
00bdd834	and x11,x9,#-0x2
00bdd838	ubfx x12,x9,#0x1,#0x7
00bdd83c	sub x11,x11,#0x1
00bdd840	csel x8,x8,x11,eq
00bdd844	tst x9,#0x1
00bdd848	csel x10,x12,x10,eq
00bdd84c	subs x1,x8,x10
00bdd850	b.ls 0x00bdd864
00bdd854	sub x0,x29,#0x60
00bdd858	mov w2,wzr
00bdd85c	bl 0x00c30250
00bdd860	b 0x00bdd884
00bdd864	tbnz w9,#0x0,0x00bdd878
00bdd868	lsl w9,w8,#0x1
00bdd86c	sturb w9,[x29, #-0x60]
00bdd870	mov x9,x28
00bdd874	b 0x00bdd880
00bdd878	ldr x9,[x25, #0x18]
00bdd87c	str x8,[x25, #0x10]
00bdd880	strb wzr,[x9, x8]
00bdd884	ldurb w8,[x29, #-0x60]
00bdd888	ldr x9,[x25, #0x18]
00bdd88c	tst w8,#0x1
00bdd890	csel x23,x28,x9,eq
00bdd894	add x8,x23,x24
00bdd898	str x8,[x25]
00bdd89c	ldp x8,x9,[x19, #0x18]
00bdd8a0	cmp x8,x9
00bdd8a4	b.eq 0x00bdd8b0
00bdd8a8	ldrb w0,[x8]
00bdd8ac	b 0x00bdd8c0
00bdd8b0	ldr x8,[x19]
00bdd8b4	ldr x8,[x8, #0x48]
00bdd8b8	mov x0,x19
00bdd8bc	blr x8
00bdd8c0	ldurb w6,[x29, #-0x2c]
00bdd8c4	ldurb w5,[x29, #-0x28]
00bdd8c8	add x1,sp,#0x38
00bdd8cc	sub x8,x29,#0x24
00bdd8d0	add x2,sp,#0x34
00bdd8d4	sub x4,x29,#0x68
00bdd8d8	sub x7,x29,#0x48
00bdd8dc	mov x3,x23
00bdd8e0	stp x22,x8,[sp, #0x10]
00bdd8e4	stp x27,x20,[sp]
00bdd8e8	bl 0x00c44110
00bdd8ec	cbnz w0,0x00bdd994
00bdd8f0	tbz w26,#0x0,0x00bdd8fc
00bdd8f4	mov w26,#0x1
00bdd8f8	b 0x00bdd95c
00bdd8fc	ldr x8,[x25]
00bdd900	sub x9,x8,x23
00bdd904	cmp x9,#0x1
00bdd908	b.lt 0x00bdd958
00bdd90c	ldrb w8,[x23]
00bdd910	cmp w8,#0x2b
00bdd914	b.eq 0x00bdd920
00bdd918	cmp w8,#0x2d
00bdd91c	b.ne 0x00bdd97c
00bdd920	cmp x9,#0x1
00bdd924	b.eq 0x00bdd958
00bdd928	cmp w8,#0x2d
00bdd92c	b.eq 0x00bdd938
00bdd930	cmp w8,#0x2b
00bdd934	b.ne 0x00bdd958
00bdd938	ldrb w8,[x23, #0x1]
00bdd93c	mov w26,#0x1
00bdd940	cmp w8,#0x2e
00bdd944	b.eq 0x00bdd95c
00bdd948	sub w8,w8,#0x30
00bdd94c	cmp w8,#0x9
00bdd950	b.ls 0x00bdd95c
00bdd954	b 0x00bdd994
00bdd958	mov w26,wzr
00bdd95c	ldp x8,x9,[x19, #0x18]
00bdd960	cmp x8,x9
00bdd964	b.ne 0x00bdd734
00bdd968	ldr x8,[x19]
00bdd96c	ldr x8,[x8, #0x50]
00bdd970	mov x0,x19
00bdd974	blr x8
00bdd978	b 0x00bdd73c
00bdd97c	cmp w8,#0x2e
00bdd980	mov w26,#0x1
00bdd984	b.eq 0x00bdd95c
00bdd988	sub w8,w8,#0x30
00bdd98c	cmp w8,#0xa
00bdd990	b.cc 0x00bdd95c
00bdd994	ldurb w8,[x29, #-0x48]
00bdd998	ldr x9,[x25, #0x28]
00bdd99c	ldr x22,[sp, #0x28]
00bdd9a0	lsr x10,x8,#0x1
00bdd9a4	tst w8,#0x1
00bdd9a8	csel x8,x10,x9,eq
00bdd9ac	cbz x8,0x00bdd9dc
00bdd9b0	ldrb w8,[sp, #0x38]
00bdd9b4	cmp w8,#0x1
00bdd9b8	b.ne 0x00bdd9dc
00bdd9bc	ldr x8,[sp, #0x40]
00bdd9c0	add x9,sp,#0x48
00bdd9c4	sub x9,x8,x9
00bdd9c8	cmp x9,#0x9f
00bdd9cc	b.gt 0x00bdd9dc
00bdd9d0	ldr w9,[sp, #0x3c]
00bdd9d4	str w9,[x8], #0x4
00bdd9d8	str x8,[sp, #0x40]
00bdd9dc	ldr x1,[x25]
00bdd9e0	mov x0,x23
00bdd9e4	mov x2,x22
00bdd9e8	bl 0x00c0c854
00bdd9ec	ldurb w10,[x29, #-0x48]
00bdd9f0	ldr x12,[sp, #0x40]
00bdd9f4	add x11,sp,#0x48
00bdd9f8	ldr x8,[x25, #0x28]
00bdd9fc	lsr x9,x10,#0x1
00bdda00	ands w13,w10,#0x1
00bdda04	sub x11,x12,x11
00bdda08	csel x8,x9,x8,eq
00bdda0c	ldr x9,[sp, #0x20]
00bdda10	cmp x11,#0x5
00bdda14	str d0,[x9]
00bdda18	b.lt 0x00bddb78
00bdda1c	cbz x8,0x00bddb78
00bdda20	sub x8,x12,#0x4
00bdda24	add x9,sp,#0x48
00bdda28	cmp x9,x8
00bdda2c	cset w11,cc
00bdda30	cmp x9,x12
00bdda34	b.eq 0x00bddae4
00bdda38	cbz w11,0x00bddae4
00bdda3c	add x10,sp,#0x48
00bdda40	sub x14,x12,#0x8
00bdda44	add x11,x10,#0x4
00bdda48	cmp x14,x11
00bdda4c	csel x13,x14,x11,hi
00bdda50	sub x13,x13,#0x4
00bdda54	cmp x13,x10
00bdda58	cinc x15,x10,ne
00bdda5c	cmp x13,x10
00bdda60	sub x15,x13,x15
00bdda64	lsr x15,x15,#0x3
00bdda68	cinc x13,x15,ne
00bdda6c	cmp x13,#0x13
00bdda70	b.cc 0x00bddab8
00bdda74	cmp x14,x11
00bdda78	csel x14,x14,x11,hi
00bdda7c	sub x14,x14,#0x4
00bdda80	cmp x14,x10
00bdda84	cinc x15,x10,ne
00bdda88	cmp x14,x10
00bdda8c	sub x15,x14,x15
00bdda90	lsr x15,x15,#0x3
00bdda94	cinc x14,x15,ne
00bdda98	cmp x10,x12
00bdda9c	b.cs 0x00bddc5c
00bddaa0	lsl x14,x14,#0x2
00bddaa4	sub x15,x12,x14
00bddaa8	add x11,x11,x14
00bddaac	sub x14,x15,#0x4
00bddab0	cmp x14,x11
00bddab4	b.cs 0x00bddc5c
00bddab8	mov x11,x8
00bddabc	add x10,x10,#0x4
00bddac0	ldr w12,[x11]
00bddac4	ldur w13,[x10, #-0x4]
00bddac8	stur w12,[x10, #-0x4]
00bddacc	str w13,[x11], #-0x4
00bddad0	cmp x10,x11
00bddad4	add x10,x10,#0x4
00bddad8	b.cc 0x00bddac0
00bddadc	ldurb w10,[x29, #-0x48]
00bddae0	and w13,w10,#0x1
00bddae4	ldr x11,[x25, #0x30]
00bddae8	cmp w13,#0x0
00bddaec	sub x12,x29,#0x48
00bddaf0	csinc x11,x11,x12,ne
00bddaf4	cmp x9,x8
00bddaf8	b.cs 0x00bddb50
00bddafc	lsr w9,w10,#0x1
00bddb00	ldr x10,[x25, #0x28]
00bddb04	cmp w13,#0x0
00bddb08	csel x9,x9,x10,eq
00bddb0c	add x10,sp,#0x48
00bddb10	add x9,x11,x9
00bddb14	b 0x00bddb30
00bddb18	sub x12,x9,x11
00bddb1c	add x10,x10,#0x4
00bddb20	cmp x12,#0x1
00bddb24	cinc x11,x11,gt
00bddb28	cmp x10,x8
00bddb2c	b.cs 0x00bddb50
00bddb30	ldrb w12,[x11]
00bddb34	cbz w12,0x00bddb18
00bddb38	cmp w12,#0xff
00bddb3c	b.eq 0x00bddb18
00bddb40	ldr w13,[x10]
00bddb44	cmp w13,w12
00bddb48	b.eq 0x00bddb18
00bddb4c	b 0x00bddb70
00bddb50	ldrb w9,[x11]
00bddb54	cbz w9,0x00bddb78
00bddb58	cmp w9,#0xff
00bddb5c	b.eq 0x00bddb78
00bddb60	ldr w8,[x8]
00bddb64	sub w8,w8,#0x1
00bddb68	cmp w8,w9
00bddb6c	b.cc 0x00bddb78
00bddb70	mov w8,#0x4
00bddb74	str w8,[x22]
00bddb78	cbz x19,0x00bddc04
00bddb7c	ldp x8,x9,[x19, #0x18]
00bddb80	cmp x8,x9
00bddb84	b.eq 0x00bddc14
00bddb88	mov w20,wzr
00bddb8c	cbz x21,0x00bddc0c
00bddb90	ldp x8,x9,[x21, #0x18]
00bddb94	cmp x8,x9
00bddb98	b.eq 0x00bddc38
00bddb9c	tbnz w20,#0x0,0x00bddbac
00bddba0	ldr w8,[x22]
00bddba4	orr w8,w8,#0x2
00bddba8	str w8,[x22]
00bddbac	ldurb w8,[x29, #-0x60]
00bddbb0	tbz w8,#0x0,0x00bddbc4
00bddbb4	ldr x8,[x25, #0x8]
00bddbb8	ldr x0,[x25, #0x18]
00bddbbc	and x1,x8,#-0x2
00bddbc0	bl 0x00c2fe80
00bddbc4	ldurb w8,[x29, #-0x48]
00bddbc8	tbz w8,#0x0,0x00bddbdc
00bddbcc	ldr x8,[x25, #0x20]
00bddbd0	ldr x0,[x25, #0x30]
00bddbd4	and x1,x8,#-0x2
00bddbd8	bl 0x00c2fe80
00bddbdc	mov x0,x19
00bddbe0	ldp x20,x19,[sp, #0x1a0]
00bddbe4	ldp x22,x21,[sp, #0x190]
00bddbe8	ldp x24,x23,[sp, #0x180]
00bddbec	ldp x26,x25,[sp, #0x170]
00bddbf0	ldp x28,x27,[sp, #0x160]
00bddbf4	ldp x29,x30,[sp, #0x150]
00bddbf8	add sp,sp,#0x1b0
00bddbfc	autiasp
00bddc00	ret
00bddc04	mov w20,#0x1
00bddc08	cbnz x21,0x00bddb90
00bddc0c	tbnz w20,#0x0,0x00bddba0
00bddc10	b 0x00bddbac
00bddc14	ldr x8,[x19]
00bddc18	ldr x8,[x8, #0x48]
00bddc1c	mov x0,x19
00bddc20	blr x8
00bddc24	cmn w0,#0x1
00bddc28	cset w20,eq
00bddc2c	csel x19,xzr,x19,eq
00bddc30	cbnz x21,0x00bddb90
00bddc34	b 0x00bddc0c
00bddc38	ldr x8,[x21]
00bddc3c	ldr x8,[x8, #0x48]
00bddc40	mov x0,x21
00bddc44	blr x8
00bddc48	cmn w0,#0x1
00bddc4c	cset w8,eq
00bddc50	eor w8,w20,w8
00bddc54	tbz w8,#0x0,0x00bddba0
00bddc58	b 0x00bddbac
00bddc5c	add x13,x13,#0x1
00bddc60	add x15,sp,#0x48
00bddc64	sub x12,x12,#0x10
00bddc68	and x14,x13,#0x7ffffffffffffff8
00bddc6c	lsl x10,x14,#0x2
00bddc70	mov x16,x14
00bddc74	sub x11,x8,x10
00bddc78	add x10,x15,x10
00bddc7c	add x15,x15,#0x10
00bddc80	ldp q1,q0,[x12, #-0x10]
00bddc84	sub x16,x16,#0x8
00bddc88	ldp q2,q3,[x15, #-0x10]
00bddc8c	rev64 v0.4S,v0.4S
00bddc90	rev64 v1.4S,v1.4S
00bddc94	rev64 v2.4S,v2.4S
00bddc98	rev64 v3.4S,v3.4S
00bddc9c	ext v0.16B,v0.16B,v0.16B,0x8
00bddca0	ext v1.16B,v1.16B,v1.16B,0x8
00bddca4	ext v2.16B,v2.16B,v2.16B,0x8
00bddca8	ext v3.16B,v3.16B,v3.16B,0x8
00bddcac	stp q0,q1,[x15, #-0x10]
00bddcb0	add x15,x15,#0x20
00bddcb4	stp q3,q2,[x12, #-0x10]
00bddcb8	sub x12,x12,#0x20
00bddcbc	cbnz x16,0x00bddc80
00bddcc0	cmp x13,x14
00bddcc4	b.eq 0x00bddadc
00bddcc8	b 0x00bddabc
