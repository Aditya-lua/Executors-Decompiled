; std::__ndk1::money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__do_get @ 00bef678
00bef678	paciasp
00bef67c	stp x29,x30,[sp, #-0x60]!
00bef680	stp x28,x27,[sp, #0x10]
00bef684	stp x26,x25,[sp, #0x20]
00bef688	stp x24,x23,[sp, #0x30]
00bef68c	stp x22,x21,[sp, #0x40]
00bef690	stp x20,x19,[sp, #0x50]
00bef694	mov x29,sp
00bef698	sub sp,sp,#0x2a0
00bef69c	mov x21,x0
00bef6a0	ldr x0,[x0]
00bef6a4	mov x23,x7
00bef6a8	mov x24,x5
00bef6ac	mov x19,x3
00bef6b0	mov w26,w2
00bef6b4	mov x22,x1
00bef6b8	str x6,[sp, #0x40]
00bef6bc	str w4,[sp, #0x4c]
00bef6c0	cbz x0,0x00bef710
00bef6c4	ldp x8,x9,[x0, #0x18]
00bef6c8	cmp x8,x9
00bef6cc	b.eq 0x00bef6f8
00bef6d0	ldr w0,[x8]
00bef6d4	cmn w0,#0x1
00bef6d8	b.eq 0x00bef70c
00bef6dc	ldr x8,[x21]
00bef6e0	cmp x8,#0x0
00bef6e4	cset w20,eq
00bef6e8	cbnz x22,0x00bef718
00bef6ec	tbnz w20,#0x0,0x00bef810
00bef6f0	mov x22,xzr
00bef6f4	b 0x00bef750
00bef6f8	ldr x8,[x0]
00bef6fc	ldr x8,[x8, #0x48]
00bef700	blr x8
00bef704	cmn w0,#0x1
00bef708	b.ne 0x00bef6dc
00bef70c	str xzr,[x21]
00bef710	mov w20,#0x1
00bef714	cbz x22,0x00bef6ec
00bef718	ldp x8,x9,[x22, #0x18]
00bef71c	cmp x8,x9
00bef720	b.eq 0x00bef72c
00bef724	ldr w0,[x8]
00bef728	b 0x00bef73c
00bef72c	ldr x8,[x22]
00bef730	mov x0,x22
00bef734	ldr x8,[x8, #0x48]
00bef738	blr x8
00bef73c	cmn w0,#0x1
00bef740	cset w8,eq
00bef744	csel x22,xzr,x22,eq
00bef748	eor w8,w20,w8
00bef74c	tbz w8,#0x0,0x00bef810
00bef750	str x24,[sp, #0x18]
00bef754	stp xzr,xzr,[sp, #0xe0]
00bef758	str xzr,[sp, #0xf0]
00bef75c	stp xzr,xzr,[sp, #0xc8]
00bef760	str xzr,[sp, #0xd8]
00bef764	stp xzr,xzr,[sp, #0xb0]
00bef768	str xzr,[sp, #0xc0]
00bef76c	stp xzr,xzr,[sp, #0x98]
00bef770	str xzr,[sp, #0xa8]
00bef774	stp xzr,xzr,[sp, #0x80]
00bef778	str xzr,[sp, #0x90]
00bef77c	add x8,sp,#0x7c
00bef780	add x20,sp,#0x98
00bef784	and w0,w26,#0x1
00bef788	add x2,sp,#0x104
00bef78c	add x3,sp,#0x100
00bef790	add x4,sp,#0xfc
00bef794	add x5,sp,#0xe0
00bef798	add x6,sp,#0xc8
00bef79c	add x7,sp,#0xb0
00bef7a0	mov x1,x19
00bef7a4	stp x20,x8,[sp]
00bef7a8	add x24,sp,#0x104
00bef7ac	add x19,sp,#0xc8
00bef7b0	add x28,sp,#0xb0
00bef7b4	bl 0x00c44230
00bef7b8	ldp x9,x26,[x29, #0x60]
00bef7bc	orr x10,x28,#0x4
00bef7c0	add x27,sp,#0x108
00bef7c4	str x10,[sp, #0x28]
00bef7c8	orr x10,x20,#0x4
00bef7cc	orr x11,x19,#0x4
00bef7d0	str x10,[sp, #0x10]
00bef7d4	add x10,x27,#0x190
00bef7d8	str xzr,[sp, #0x50]
00bef7dc	add x8,sp,#0x80
00bef7e0	mov x25,xzr
00bef7e4	str x9,[sp, #0x58]
00bef7e8	ldr x9,[x9]
00bef7ec	orr x8,x8,#0x4
00bef7f0	stp x11,x10,[sp, #0x68]
00bef7f4	adrp x10,0xcb5000
00bef7f8	add x20,sp,#0x108
00bef7fc	ldr x10,[x10, #0xc18]
00bef800	str x8,[sp, #0x20]
00bef804	str x9,[x26]
00bef808	str x10,[sp, #0x60]
00bef80c	b 0x00bef844
00bef810	ldr w8,[x24]
00bef814	mov w21,wzr
00bef818	orr w8,w8,#0x4
00bef81c	str w8,[x24]
00bef820	b 0x00bf0850
00bef824	ldr x9,[sp, #0x58]
00bef828	ldr x8,[x26]
00bef82c	ldr x9,[x9]
00bef830	cmp x8,x9
00bef834	b.eq 0x00bf077c
00bef838	add x25,x25,#0x1
00bef83c	cmp x25,#0x4
00bef840	b.eq 0x00bf052c
00bef844	ldr x0,[x21]
00bef848	cbz x0,0x00bef890
00bef84c	ldp x8,x9,[x0, #0x18]
00bef850	cmp x8,x9
00bef854	b.eq 0x00bef860
00bef858	ldr w0,[x8]
00bef85c	b 0x00bef86c
00bef860	ldr x8,[x0]
00bef864	ldr x8,[x8, #0x48]
00bef868	blr x8
00bef86c	cmn w0,#0x1
00bef870	b.eq 0x00bef88c
00bef874	ldr x8,[x21]
00bef878	cmp x8,#0x0
00bef87c	cset w19,eq
00bef880	cbnz x22,0x00bef898
00bef884	tbz w19,#0x0,0x00bef8d0
00bef888	b 0x00bf052c
00bef88c	str xzr,[x21]
00bef890	mov w19,#0x1
00bef894	cbz x22,0x00bef884
00bef898	ldp x8,x9,[x22, #0x18]
00bef89c	cmp x8,x9
00bef8a0	b.eq 0x00bef8ac
00bef8a4	ldr w0,[x8]
00bef8a8	b 0x00bef8bc
00bef8ac	ldr x8,[x22]
00bef8b0	ldr x8,[x8, #0x48]
00bef8b4	mov x0,x22
00bef8b8	blr x8
00bef8bc	cmn w0,#0x1
00bef8c0	cset w8,eq
00bef8c4	csel x22,xzr,x22,eq
00bef8c8	eor w8,w19,w8
00bef8cc	tbz w8,#0x0,0x00bf052c
00bef8d0	ldrb w8,[x24, x25]
00bef8d4	cmp w8,#0x1
00bef8d8	b.le 0x00befaf4
00bef8dc	cmp w8,#0x2
00bef8e0	b.eq 0x00befb20
00bef8e4	cmp w8,#0x3
00bef8e8	b.eq 0x00befb58
00bef8ec	cmp w8,#0x4
00bef8f0	b.ne 0x00bef838
00bef8f4	mov w24,wzr
00bef8f8	b 0x00bef904
00bef8fc	add x8,x8,#0x4
00bef900	str x8,[x0, #0x18]
00bef904	ldr x0,[x21]
00bef908	cbz x0,0x00bef950
00bef90c	ldp x8,x9,[x0, #0x18]
00bef910	cmp x8,x9
00bef914	b.eq 0x00bef920
00bef918	ldr w0,[x8]
00bef91c	b 0x00bef92c
00bef920	ldr x8,[x0]
00bef924	ldr x8,[x8, #0x48]
00bef928	blr x8
00bef92c	cmn w0,#0x1
00bef930	b.eq 0x00bef94c
00bef934	ldr x8,[x21]
00bef938	cmp x8,#0x0
00bef93c	cset w19,eq
00bef940	cbnz x22,0x00bef958
00bef944	tbz w19,#0x0,0x00bef990
00bef948	b 0x00bf0054
00bef94c	str xzr,[x21]
00bef950	mov w19,#0x1
00bef954	cbz x22,0x00bef944
00bef958	ldp x8,x9,[x22, #0x18]
00bef95c	cmp x8,x9
00bef960	b.eq 0x00bef96c
00bef964	ldr w0,[x8]
00bef968	b 0x00bef97c
00bef96c	ldr x8,[x22]
00bef970	ldr x8,[x8, #0x48]
00bef974	mov x0,x22
00bef978	blr x8
00bef97c	cmn w0,#0x1
00bef980	cset w8,eq
00bef984	csel x22,xzr,x22,eq
00bef988	cmp w19,w8
00bef98c	b.eq 0x00bf0054
00bef990	ldr x0,[x21]
00bef994	ldp x8,x9,[x0, #0x18]
00bef998	cmp x8,x9
00bef99c	b.eq 0x00bef9a8
00bef9a0	ldr w28,[x8]
00bef9a4	b 0x00bef9b8
00bef9a8	ldr x8,[x0]
00bef9ac	ldr x8,[x8, #0x48]
00bef9b0	blr x8
00bef9b4	mov w28,w0
00bef9b8	ldr x8,[x23]
00bef9bc	ldr x8,[x8, #0x18]
00bef9c0	mov x0,x23
00bef9c4	mov w1,#0x40
00bef9c8	mov w2,w28
00bef9cc	blr x8
00bef9d0	tbz w0,#0x0,0x00befa0c
00bef9d4	ldr x8,[x26]
00bef9d8	ldr x9,[x29, #0x70]
00bef9dc	cmp x8,x9
00bef9e0	b.ne 0x00bef9f8
00bef9e4	ldr x0,[sp, #0x58]
00bef9e8	add x2,x29,#0x70
00bef9ec	mov x1,x26
00bef9f0	bl 0x00bf11d8
00bef9f4	ldr x8,[x26]
00bef9f8	str w28,[x8], #0x4
00bef9fc	add w24,w24,#0x1
00befa00	add x28,sp,#0xb0
00befa04	str x8,[x26]
00befa08	b 0x00befad4
00befa0c	ldrb w8,[sp, #0xe0]
00befa10	ldr x9,[sp, #0xe8]
00befa14	lsr x10,x8,#0x1
00befa18	tst w8,#0x1
00befa1c	csel x8,x10,x9,eq
00befa20	cbz x8,0x00befd0c
00befa24	cbz w24,0x00bf0050
00befa28	ldr w8,[sp, #0xfc]
00befa2c	cmp w28,w8
00befa30	b.ne 0x00befd0c
00befa34	ldr x8,[sp, #0x70]
00befa38	cmp x20,x8
00befa3c	b.ne 0x00befac8
00befa40	subs x20,x8,x27
00befa44	mov w9,#0x4
00befa48	lsl x8,x20,#0x1
00befa4c	csel x8,x9,x8,eq
00befa50	mov x9,#0x7fffffffffffffff
00befa54	cmp x20,x9
00befa58	adrp x9,0xcb5000
00befa5c	csinv x28,x8,xzr,cc
00befa60	ldr x8,[sp, #0x60]
00befa64	ldr x9,[x9, #0xc18]
00befa68	cmp x8,x9
00befa6c	b.eq 0x00befa88
00befa70	mov x0,x27
00befa74	mov x1,x28
00befa78	bl 0x00c30950
00befa7c	mov x19,x0
00befa80	cbnz x0,0x00befaa8
00befa84	b 0x00bf0878
00befa88	mov x0,x28
00befa8c	bl 0x00c308d0
00befa90	cbz x0,0x00bf0878
00befa94	mov x19,x0
00befa98	cbz x27,0x00befaa8
00befa9c	ldr x8,[sp, #0x60]
00befaa0	mov x0,x27
00befaa4	blr x8
00befaa8	and x8,x28,#-0x4
00befaac	add x20,x19,x20
00befab0	mov x27,x19
00befab4	add x8,x19,x8
00befab8	str x8,[sp, #0x70]
00befabc	adrp x8,0xcb4000
00befac0	ldr x8,[x8, #0xbf8]
00befac4	str x8,[sp, #0x60]
00befac8	add x28,sp,#0xb0
00befacc	str w24,[x20], #0x4
00befad0	mov w24,wzr
00befad4	ldr x0,[x21]
00befad8	ldp x8,x9,[x0, #0x18]
00befadc	cmp x8,x9
00befae0	b.ne 0x00bef8fc
00befae4	ldr x8,[x0]
00befae8	ldr x8,[x8, #0x50]
00befaec	blr x8
00befaf0	b 0x00bef904
00befaf4	cbz w8,0x00befb88
00befaf8	cmp w8,#0x1
00befafc	b.ne 0x00bef838
00befb00	cmp x25,#0x3
00befb04	b.eq 0x00bf052c
00befb08	ldr x0,[x21]
00befb0c	ldp x8,x9,[x0, #0x18]
00befb10	cmp x8,x9
00befb14	b.eq 0x00befbbc
00befb18	ldr w2,[x8]
00befb1c	b 0x00befbcc
00befb20	ldr x8,[sp, #0x50]
00befb24	str x20,[sp, #0x38]
00befb28	cbnz x8,0x00befb94
00befb2c	cmp x25,#0x2
00befb30	b.cc 0x00befb94
00befb34	ldrb w8,[sp, #0x107]
00befb38	ldr w9,[sp, #0x4c]
00befb3c	tst w8,#0xff
00befb40	ccmp x25,#0x2,#0x0,ne
00befb44	cset w8,ne
00befb48	tbnz w9,#0x9,0x00befc68
00befb4c	tbz w8,#0x0,0x00befc68
00befb50	str xzr,[sp, #0x50]
00befb54	b 0x00bef838
00befb58	ldrb w8,[sp, #0xb0]
00befb5c	ldr x10,[sp, #0xb8]
00befb60	lsr x11,x8,#0x1
00befb64	ands w9,w8,#0x1
00befb68	csel x10,x11,x10,eq
00befb6c	cbz x10,0x00befd68
00befb70	ldr x0,[x21]
00befb74	ldp x10,x11,[x0, #0x18]
00befb78	cmp x10,x11
00befb7c	b.eq 0x00befd1c
00befb80	ldr w0,[x10]
00befb84	b 0x00befd30
00befb88	cmp x25,#0x3
00befb8c	b.ne 0x00bf03d0
00befb90	b 0x00bf052c
00befb94	ldrb w19,[sp, #0xc8]
00befb98	ldr x24,[sp, #0xd8]
00befb9c	add x8,sp,#0x104
00befba0	ldr x9,[sp, #0x68]
00befba4	str x27,[sp, #0x30]
00befba8	ands w27,w19,#0x1
00befbac	csel x20,x9,x24,eq
00befbb0	cbz x25,0x00befec8
00befbb4	mov x28,x20
00befbb8	b 0x00befc84
00befbbc	ldr x8,[x0]
00befbc0	ldr x8,[x8, #0x48]
00befbc4	blr x8
00befbc8	mov w2,w0
00befbcc	ldr x8,[x23]
00befbd0	ldr x8,[x8, #0x18]
00befbd4	mov x0,x23
00befbd8	mov w1,#0x1
00befbdc	blr x8
00befbe0	tbz w0,#0x0,0x00bf077c
00befbe4	ldr x0,[x21]
00befbe8	ldp x8,x9,[x0, #0x18]
00befbec	cmp x8,x9
00befbf0	b.eq 0x00befc14
00befbf4	ldr w28,[x8], #0x4
00befbf8	str x8,[x0, #0x18]
00befbfc	ldrb w9,[sp, #0x80]
00befc00	tbnz w9,#0x0,0x00befc2c
00befc04	cmp w9,#0x8
00befc08	b.ne 0x00bf04dc
00befc0c	mov w19,#0x4
00befc10	b 0x00befc40
00befc14	ldr x8,[x0]
00befc18	ldr x8,[x8, #0x50]
00befc1c	blr x8
00befc20	mov w28,w0
00befc24	ldrb w9,[sp, #0x80]
00befc28	tbz w9,#0x0,0x00befc04
00befc2c	ldp x9,x8,[sp, #0x80]
00befc30	and x9,x9,#-0x2
00befc34	sub x19,x9,#0x1
00befc38	cmp x8,x19
00befc3c	b.ne 0x00bf03b8
00befc40	add x0,sp,#0x80
00befc44	mov x1,x19
00befc48	mov w2,#0x1
00befc4c	mov x3,x19
00befc50	mov x4,x19
00befc54	mov x5,xzr
00befc58	mov x6,xzr
00befc5c	bl 0x00c43d70
00befc60	mov x8,x19
00befc64	b 0x00bf03b8
00befc68	ldrb w19,[sp, #0xc8]
00befc6c	ldr x24,[sp, #0xd8]
00befc70	add x8,sp,#0x104
00befc74	ldr x9,[sp, #0x68]
00befc78	str x27,[sp, #0x30]
00befc7c	tst w19,#0x1
00befc80	csel x28,x9,x24,eq
00befc84	add x8,x25,x8
00befc88	and w27,w19,#0x1
00befc8c	ldurb w8,[x8, #-0x1]
00befc90	cmp w8,#0x1
00befc94	b.hi 0x00befec0
00befc98	ldr x8,[sp, #0xd0]
00befc9c	lsr w9,w19,#0x1
00befca0	ldr x10,[sp, #0x68]
00befca4	cmp w27,#0x0
00befca8	csel x10,x10,x24,eq
00befcac	csel x8,x9,x8,eq
00befcb0	add x8,x10,x8, LSL #0x2
00befcb4	cmp x28,x8
00befcb8	b.eq 0x00befe70
00befcbc	ldr x8,[x23]
00befcc0	ldr w2,[x28]
00befcc4	ldr x8,[x8, #0x18]
00befcc8	mov x0,x23
00befccc	mov w1,#0x1
00befcd0	blr x8
00befcd4	ldrb w19,[sp, #0xc8]
00befcd8	ldr x24,[sp, #0xd8]
00befcdc	tbz w0,#0x0,0x00befe6c
00befce0	ldr x8,[sp, #0xd0]
00befce4	lsr x9,x19,#0x1
00befce8	ldr x10,[sp, #0x68]
00befcec	ands w27,w19,#0x1
00befcf0	add x28,x28,#0x4
00befcf4	csel x10,x10,x24,eq
00befcf8	csel x8,x9,x8,eq
00befcfc	add x8,x10,x8, LSL #0x2
00befd00	cmp x28,x8
00befd04	b.ne 0x00befcbc
00befd08	b 0x00befe70
00befd0c	add x28,sp,#0xb0
00befd10	cmp x27,x20
00befd14	b.ne 0x00bf005c
00befd18	b 0x00bf0144
00befd1c	ldr x8,[x0]
00befd20	ldr x8,[x8, #0x48]
00befd24	blr x8
00befd28	ldrb w8,[sp, #0xb0]
00befd2c	and w9,w8,#0x1
00befd30	ldr x10,[sp, #0xc0]
00befd34	ldr x11,[sp, #0x28]
00befd38	cmp w9,#0x0
00befd3c	csel x10,x11,x10,eq
00befd40	ldr w10,[x10]
00befd44	cmp w0,w10
00befd48	b.ne 0x00befd68
00befd4c	ldr x0,[x21]
00befd50	ldp x10,x11,[x0, #0x18]
00befd54	cmp x10,x11
00befd58	b.eq 0x00befe2c
00befd5c	add x10,x10,#0x4
00befd60	str x10,[x0, #0x18]
00befd64	b 0x00befe40
00befd68	ldrb w9,[sp, #0x98]
00befd6c	ldr x11,[sp, #0xa0]
00befd70	lsr x12,x9,#0x1
00befd74	ands w10,w9,#0x1
00befd78	csel x11,x12,x11,eq
00befd7c	cbz x11,0x00befde8
00befd80	ldr x0,[x21]
00befd84	ldp x8,x11,[x0, #0x18]
00befd88	cmp x8,x11
00befd8c	b.eq 0x00befd98
00befd90	ldr w0,[x8]
00befd94	b 0x00befdac
00befd98	ldr x8,[x0]
00befd9c	ldr x8,[x8, #0x48]
00befda0	blr x8
00befda4	ldrb w9,[sp, #0x98]
00befda8	and w10,w9,#0x1
00befdac	ldr x8,[sp, #0xa8]
00befdb0	ldr x11,[sp, #0x10]
00befdb4	cmp w10,#0x0
00befdb8	csel x8,x11,x8,eq
00befdbc	ldr w8,[x8]
00befdc0	cmp w0,w8
00befdc4	b.ne 0x00befde4
00befdc8	ldr x0,[x21]
00befdcc	ldp x8,x11,[x0, #0x18]
00befdd0	cmp x8,x11
00befdd4	b.eq 0x00bf00b4
00befdd8	add x8,x8,#0x4
00befddc	str x8,[x0, #0x18]
00befde0	b 0x00bf00c8
00befde4	ldrb w8,[sp, #0xb0]
00befde8	ldr x10,[sp, #0xb8]
00befdec	lsr w11,w8,#0x1
00befdf0	tst w8,#0x1
00befdf4	ldr x12,[sp, #0xa0]
00befdf8	lsr w13,w9,#0x1
00befdfc	csel x8,x11,x10,eq
00befe00	tst w9,#0x1
00befe04	csel x9,x13,x12,eq
00befe08	cbz x8,0x00befe14
00befe0c	cbz x9,0x00befe18
00befe10	b 0x00bf077c
00befe14	cbz x9,0x00bef838
00befe18	cmp x8,#0x0
00befe1c	ldr x9,[sp, #0x40]
00befe20	cset w8,ne
00befe24	strb w8,[x9]
00befe28	b 0x00bef838
00befe2c	ldr x8,[x0]
00befe30	ldr x8,[x8, #0x50]
00befe34	blr x8
00befe38	ldrb w8,[sp, #0xb0]
00befe3c	and w9,w8,#0x1
00befe40	ldr x10,[sp, #0xb8]
00befe44	lsr w8,w8,#0x1
00befe48	cmp w9,#0x0
00befe4c	csel x8,x8,x10,eq
00befe50	cmp x8,#0x1
00befe54	ldr x8,[sp, #0x40]
00befe58	strb wzr,[x8]
00befe5c	ldr x8,[sp, #0x50]
00befe60	csel x8,x28,x8,hi
00befe64	str x8,[sp, #0x50]
00befe68	b 0x00bef838
00befe6c	and w27,w19,#0x1
00befe70	ldrb w8,[sp, #0x80]
00befe74	ldr x11,[sp, #0x68]
00befe78	cmp w27,#0x0
00befe7c	ldr x9,[sp, #0x88]
00befe80	lsr x10,x8,#0x1
00befe84	csel x20,x11,x24,eq
00befe88	tst w8,#0x1
00befe8c	sub x2,x28,x20
00befe90	csel x9,x10,x9,eq
00befe94	cmp x9,x2, ASR #0x2
00befe98	b.cc 0x00befec4
00befe9c	ldr x10,[sp, #0x90]
00befea0	tst w8,#0x1
00befea4	ldr x8,[sp, #0x20]
00befea8	mov x1,x20
00befeac	csel x8,x8,x10,eq
00befeb0	add x8,x8,x9, LSL #0x2
00befeb4	sub x0,x8,x2
00befeb8	bl 0x00c300b0
00befebc	cbnz w0,0x00befec4
00befec0	mov x20,x28
00befec4	add x28,sp,#0xb0
00befec8	ldr x8,[sp, #0xd0]
00befecc	lsr w9,w19,#0x1
00befed0	ldr x10,[sp, #0x68]
00befed4	cmp w27,#0x0
00befed8	csel x10,x10,x24,eq
00befedc	csel x8,x9,x8,eq
00befee0	add x8,x10,x8, LSL #0x2
00befee4	cmp x20,x8
00befee8	b.eq 0x00bf0008
00befeec	ldr x27,[sp, #0x30]
00befef0	add x24,sp,#0x104
00befef4	b 0x00beff2c
00befef8	add x8,x8,#0x4
00befefc	str x8,[x0, #0x18]
00beff00	ldrb w8,[sp, #0xc8]
00beff04	ldp x10,x9,[sp, #0xd0]
00beff08	add x20,x20,#0x4
00beff0c	lsr x11,x8,#0x1
00beff10	tst w8,#0x1
00beff14	ldr x8,[sp, #0x68]
00beff18	csel x8,x8,x9,eq
00beff1c	csel x9,x11,x10,eq
00beff20	add x8,x8,x9, LSL #0x2
00beff24	cmp x20,x8
00beff28	b.eq 0x00bf0010
00beff2c	ldr x0,[x21]
00beff30	cbz x0,0x00beff78
00beff34	ldp x8,x9,[x0, #0x18]
00beff38	cmp x8,x9
00beff3c	b.eq 0x00beff48
00beff40	ldr w0,[x8]
00beff44	b 0x00beff54
00beff48	ldr x8,[x0]
00beff4c	ldr x8,[x8, #0x48]
00beff50	blr x8
00beff54	cmn w0,#0x1
00beff58	b.eq 0x00beff74
00beff5c	ldr x8,[x21]
00beff60	cmp x8,#0x0
00beff64	cset w19,eq
00beff68	cbnz x22,0x00beff80
00beff6c	tbz w19,#0x0,0x00beffb8
00beff70	b 0x00bf0010
00beff74	str xzr,[x21]
00beff78	mov w19,#0x1
00beff7c	cbz x22,0x00beff6c
00beff80	ldp x8,x9,[x22, #0x18]
00beff84	cmp x8,x9
00beff88	b.eq 0x00beff94
00beff8c	ldr w0,[x8]
00beff90	b 0x00beffa4
00beff94	ldr x8,[x22]
00beff98	ldr x8,[x8, #0x48]
00beff9c	mov x0,x22
00beffa0	blr x8
00beffa4	cmn w0,#0x1
00beffa8	cset w8,eq
00beffac	csel x22,xzr,x22,eq
00beffb0	cmp w19,w8
00beffb4	b.eq 0x00bf0010
00beffb8	ldr x0,[x21]
00beffbc	ldp x8,x9,[x0, #0x18]
00beffc0	cmp x8,x9
00beffc4	b.eq 0x00beffd0
00beffc8	ldr w0,[x8]
00beffcc	b 0x00beffdc
00beffd0	ldr x8,[x0]
00beffd4	ldr x8,[x8, #0x48]
00beffd8	blr x8
00beffdc	ldr w8,[x20]
00beffe0	cmp w0,w8
00beffe4	b.ne 0x00bf0010
00beffe8	ldr x0,[x21]
00beffec	ldp x8,x9,[x0, #0x18]
00befff0	cmp x8,x9
00befff4	b.ne 0x00befef8
00befff8	ldr x8,[x0]
00befffc	ldr x8,[x8, #0x50]
00bf0000	blr x8
00bf0004	b 0x00beff00
00bf0008	ldr x27,[sp, #0x30]
00bf000c	add x24,sp,#0x104
00bf0010	ldr w8,[sp, #0x4c]
00bf0014	tbnz w8,#0x9,0x00bf0020
00bf0018	ldr x20,[sp, #0x38]
00bf001c	b 0x00bef838
00bf0020	ldrb w8,[sp, #0xc8]
00bf0024	ldp x10,x9,[sp, #0xd0]
00bf0028	lsr x11,x8,#0x1
00bf002c	tst w8,#0x1
00bf0030	ldr x8,[sp, #0x68]
00bf0034	csel x8,x8,x9,eq
00bf0038	csel x9,x11,x10,eq
00bf003c	add x8,x8,x9, LSL #0x2
00bf0040	cmp x20,x8
00bf0044	ldr x20,[sp, #0x38]
00bf0048	b.eq 0x00bef838
00bf004c	b 0x00bf077c
00bf0050	add x28,sp,#0xb0
00bf0054	cmp x27,x20
00bf0058	b.eq 0x00bf0144
00bf005c	cbz w24,0x00bf0144
00bf0060	ldr x8,[sp, #0x70]
00bf0064	cmp x20,x8
00bf0068	b.ne 0x00bf0140
00bf006c	subs x20,x8,x27
00bf0070	mov w9,#0x4
00bf0074	lsl x8,x20,#0x1
00bf0078	csel x8,x9,x8,eq
00bf007c	mov x9,#0x7fffffffffffffff
00bf0080	cmp x20,x9
00bf0084	adrp x9,0xcb5000
00bf0088	csinv x28,x8,xzr,cc
00bf008c	ldr x8,[sp, #0x60]
00bf0090	ldr x9,[x9, #0xc18]
00bf0094	cmp x8,x9
00bf0098	b.eq 0x00bf00fc
00bf009c	mov x0,x27
00bf00a0	mov x1,x28
00bf00a4	bl 0x00c30950
00bf00a8	mov x19,x0
00bf00ac	cbnz x0,0x00bf011c
00bf00b0	b 0x00bf0880
00bf00b4	ldr x8,[x0]
00bf00b8	ldr x8,[x8, #0x50]
00bf00bc	blr x8
00bf00c0	ldrb w9,[sp, #0x98]
00bf00c4	and w10,w9,#0x1
00bf00c8	ldr x8,[sp, #0xa0]
00bf00cc	lsr w9,w9,#0x1
00bf00d0	cmp w10,#0x0
00bf00d4	csel x8,x9,x8,eq
00bf00d8	mov w9,#0x1
00bf00dc	cmp x8,#0x1
00bf00e0	ldr x8,[sp, #0x40]
00bf00e4	strb w9,[x8]
00bf00e8	ldr x8,[sp, #0x50]
00bf00ec	add x9,sp,#0x98
00bf00f0	csel x8,x9,x8,hi
00bf00f4	str x8,[sp, #0x50]
00bf00f8	b 0x00bef838
00bf00fc	mov x0,x28
00bf0100	bl 0x00c308d0
00bf0104	cbz x0,0x00bf0880
00bf0108	mov x19,x0
00bf010c	cbz x27,0x00bf011c
00bf0110	ldr x8,[sp, #0x60]
00bf0114	mov x0,x27
00bf0118	blr x8
00bf011c	and x8,x28,#-0x4
00bf0120	add x20,x19,x20
00bf0124	mov x27,x19
00bf0128	add x8,x19,x8
00bf012c	add x28,sp,#0xb0
00bf0130	str x8,[sp, #0x70]
00bf0134	adrp x8,0xcb4000
00bf0138	ldr x8,[x8, #0xbf8]
00bf013c	str x8,[sp, #0x60]
00bf0140	str w24,[x20], #0x4
00bf0144	ldr w8,[sp, #0x7c]
00bf0148	add x24,sp,#0x104
00bf014c	cmp w8,#0x1
00bf0150	b.lt 0x00bef824
00bf0154	ldr x0,[x21]
00bf0158	cbz x0,0x00bf01a4
00bf015c	ldp x8,x9,[x0, #0x18]
00bf0160	cmp x8,x9
00bf0164	b.eq 0x00bf0170
00bf0168	ldr w0,[x8]
00bf016c	b 0x00bf017c
00bf0170	ldr x8,[x0]
00bf0174	ldr x8,[x8, #0x48]
00bf0178	blr x8
00bf017c	cmn w0,#0x1
00bf0180	b.eq 0x00bf01a0
00bf0184	ldr x8,[x21]
00bf0188	cmp x8,#0x0
00bf018c	cset w19,eq
00bf0190	cbnz x22,0x00bf01ac
00bf0194	tbnz w19,#0x0,0x00bf077c
00bf0198	mov x22,xzr
00bf019c	b 0x00bf01e4
00bf01a0	str xzr,[x21]
00bf01a4	mov w19,#0x1
00bf01a8	cbz x22,0x00bf0194
00bf01ac	ldp x8,x9,[x22, #0x18]
00bf01b0	cmp x8,x9
00bf01b4	b.eq 0x00bf01c0
00bf01b8	ldr w0,[x8]
00bf01bc	b 0x00bf01d0
00bf01c0	ldr x8,[x22]
00bf01c4	ldr x8,[x8, #0x48]
00bf01c8	mov x0,x22
00bf01cc	blr x8
00bf01d0	cmn w0,#0x1
00bf01d4	cset w8,eq
00bf01d8	csel x22,xzr,x22,eq
00bf01dc	cmp w19,w8
00bf01e0	b.eq 0x00bf077c
00bf01e4	ldr x0,[x21]
00bf01e8	ldp x8,x9,[x0, #0x18]
00bf01ec	cmp x8,x9
00bf01f0	b.eq 0x00bf01fc
00bf01f4	ldr w0,[x8]
00bf01f8	b 0x00bf0208
00bf01fc	ldr x8,[x0]
00bf0200	ldr x8,[x8, #0x48]
00bf0204	blr x8
00bf0208	ldr w8,[sp, #0x100]
00bf020c	cmp w0,w8
00bf0210	b.ne 0x00bf077c
00bf0214	ldr x0,[x21]
00bf0218	ldp x8,x9,[x0, #0x18]
00bf021c	cmp x8,x9
00bf0220	b.eq 0x00bf0230
00bf0224	add x8,x8,#0x4
00bf0228	str x8,[x0, #0x18]
00bf022c	b 0x00bf023c
00bf0230	ldr x8,[x0]
00bf0234	ldr x8,[x8, #0x50]
00bf0238	blr x8
00bf023c	ldr w8,[sp, #0x7c]
00bf0240	cmp w8,#0x1
00bf0244	b.ge 0x00bf025c
00bf0248	b 0x00bef824
00bf024c	add x9,x9,#0x4
00bf0250	str x9,[x0, #0x18]
00bf0254	cmp w8,#0x0
00bf0258	b.le 0x00bef824
00bf025c	ldr x0,[x21]
00bf0260	cbz x0,0x00bf02ac
00bf0264	ldp x8,x9,[x0, #0x18]
00bf0268	cmp x8,x9
00bf026c	b.eq 0x00bf0278
00bf0270	ldr w0,[x8]
00bf0274	b 0x00bf0284
00bf0278	ldr x8,[x0]
00bf027c	ldr x8,[x8, #0x48]
00bf0280	blr x8
00bf0284	cmn w0,#0x1
00bf0288	b.eq 0x00bf02a8
00bf028c	ldr x8,[x21]
00bf0290	cmp x8,#0x0
00bf0294	cset w19,eq
00bf0298	cbnz x22,0x00bf02b4
00bf029c	tbnz w19,#0x0,0x00bf077c
00bf02a0	mov x22,xzr
00bf02a4	b 0x00bf02ec
00bf02a8	str xzr,[x21]
00bf02ac	mov w19,#0x1
00bf02b0	cbz x22,0x00bf029c
00bf02b4	ldp x8,x9,[x22, #0x18]
00bf02b8	cmp x8,x9
00bf02bc	b.eq 0x00bf02c8
00bf02c0	ldr w0,[x8]
00bf02c4	b 0x00bf02d8
00bf02c8	ldr x8,[x22]
00bf02cc	ldr x8,[x8, #0x48]
00bf02d0	mov x0,x22
00bf02d4	blr x8
00bf02d8	cmn w0,#0x1
00bf02dc	cset w8,eq
00bf02e0	csel x22,xzr,x22,eq
00bf02e4	cmp w19,w8
00bf02e8	b.eq 0x00bf077c
00bf02ec	ldr x0,[x21]
00bf02f0	ldp x8,x9,[x0, #0x18]
00bf02f4	cmp x8,x9
00bf02f8	b.eq 0x00bf0304
00bf02fc	ldr w2,[x8]
00bf0300	b 0x00bf0314
00bf0304	ldr x8,[x0]
00bf0308	ldr x8,[x8, #0x48]
00bf030c	blr x8
00bf0310	mov w2,w0
00bf0314	ldr x8,[x23]
00bf0318	ldr x8,[x8, #0x18]
00bf031c	mov x0,x23
00bf0320	mov w1,#0x40
00bf0324	blr x8
00bf0328	tbz w0,#0x0,0x00bf077c
00bf032c	ldr x8,[x26]
00bf0330	ldr x9,[x29, #0x70]
00bf0334	cmp x8,x9
00bf0338	b.ne 0x00bf034c
00bf033c	ldr x0,[sp, #0x58]
00bf0340	add x2,x29,#0x70
00bf0344	mov x1,x26
00bf0348	bl 0x00bf11d8
00bf034c	ldr x0,[x21]
00bf0350	ldp x8,x9,[x0, #0x18]
00bf0354	cmp x8,x9
00bf0358	b.eq 0x00bf0364
00bf035c	ldr w8,[x8]
00bf0360	b 0x00bf0378
00bf0364	ldr x8,[x0]
00bf0368	ldr x8,[x8, #0x48]
00bf036c	blr x8
00bf0370	mov w8,w0
00bf0374	ldr x0,[x21]
00bf0378	ldr x9,[x26]
00bf037c	str w8,[x9], #0x4
00bf0380	ldr w8,[sp, #0x7c]
00bf0384	str x9,[x26]
00bf0388	ldp x9,x10,[x0, #0x18]
00bf038c	sub w8,w8,#0x1
00bf0390	str w8,[sp, #0x7c]
00bf0394	cmp x9,x10
00bf0398	b.ne 0x00bf024c
00bf039c	ldr x8,[x0]
00bf03a0	ldr x8,[x8, #0x50]
00bf03a4	blr x8
00bf03a8	ldr w8,[sp, #0x7c]
00bf03ac	cmp w8,#0x0
00bf03b0	b.gt 0x00bf025c
00bf03b4	b 0x00bef824
00bf03b8	ldr x9,[sp, #0x90]
00bf03bc	add x10,x8,#0x1
00bf03c0	str x10,[sp, #0x88]
00bf03c4	add x8,x9,x8, LSL #0x2
00bf03c8	stp w28,wzr,[x8]
00bf03cc	add x28,sp,#0xb0
00bf03d0	ldr x0,[x21]
00bf03d4	mov w19,#0x1
00bf03d8	cbz x0,0x00bf0410
00bf03dc	ldp x8,x9,[x0, #0x18]
00bf03e0	cmp x8,x9
00bf03e4	b.eq 0x00bf03f0
00bf03e8	ldr w0,[x8]
00bf03ec	b 0x00bf03fc
00bf03f0	ldr x8,[x0]
00bf03f4	ldr x8,[x8, #0x48]
00bf03f8	blr x8
00bf03fc	cmn w0,#0x1
00bf0400	b.eq 0x00bf0450
00bf0404	ldr x8,[x21]
00bf0408	cmp x8,#0x0
00bf040c	cset w19,eq
00bf0410	cbz x22,0x00bf0458
00bf0414	ldp x8,x9,[x22, #0x18]
00bf0418	cmp x8,x9
00bf041c	b.eq 0x00bf0428
00bf0420	ldr w0,[x8]
00bf0424	b 0x00bf0438
00bf0428	ldr x8,[x22]
00bf042c	ldr x8,[x8, #0x48]
00bf0430	mov x0,x22
00bf0434	blr x8
00bf0438	cmn w0,#0x1
00bf043c	cset w8,eq
00bf0440	csel x22,xzr,x22,eq
00bf0444	cmp w19,w8
00bf0448	b.eq 0x00bef838
00bf044c	b 0x00bf045c
00bf0450	str xzr,[x21]
00bf0454	cbnz x22,0x00bf0414
00bf0458	tbnz w19,#0x0,0x00bef838
00bf045c	ldr x0,[x21]
00bf0460	ldp x8,x9,[x0, #0x18]
00bf0464	cmp x8,x9
00bf0468	b.eq 0x00bf0474
00bf046c	ldr w2,[x8]
00bf0470	b 0x00bf0484
00bf0474	ldr x8,[x0]
00bf0478	ldr x8,[x8, #0x48]
00bf047c	blr x8
00bf0480	mov w2,w0
00bf0484	ldr x8,[x23]
00bf0488	ldr x8,[x8, #0x18]
00bf048c	mov x0,x23
00bf0490	mov w1,#0x1
00bf0494	blr x8
00bf0498	tbz w0,#0x0,0x00bef838
00bf049c	ldr x0,[x21]
00bf04a0	ldp x8,x9,[x0, #0x18]
00bf04a4	cmp x8,x9
00bf04a8	b.eq 0x00bf04b8
00bf04ac	ldr w28,[x8], #0x4
00bf04b0	str x8,[x0, #0x18]
00bf04b4	b 0x00bf04c8
00bf04b8	ldr x8,[x0]
00bf04bc	ldr x8,[x8, #0x50]
00bf04c0	blr x8
00bf04c4	mov w28,w0
00bf04c8	ldrb w9,[sp, #0x80]
00bf04cc	tbnz w9,#0x0,0x00bf04f0
00bf04d0	cmp w9,#0x8
00bf04d4	mov w19,#0x4
00bf04d8	b.eq 0x00bf0504
00bf04dc	lsr x8,x9,#0x1
00bf04e0	add w9,w9,#0x2
00bf04e4	strb w9,[sp, #0x80]
00bf04e8	ldr x9,[sp, #0x20]
00bf04ec	b 0x00bf03c4
00bf04f0	ldp x9,x8,[sp, #0x80]
00bf04f4	and x9,x9,#-0x2
00bf04f8	sub x19,x9,#0x1
00bf04fc	cmp x8,x19
00bf0500	b.ne 0x00bf03b8
00bf0504	add x0,sp,#0x80
00bf0508	mov x1,x19
00bf050c	mov w2,#0x1
00bf0510	mov x3,x19
00bf0514	mov x4,x19
00bf0518	mov x5,xzr
00bf051c	mov x6,xzr
00bf0520	bl 0x00c43d70
00bf0524	mov x8,x19
00bf0528	b 0x00bf03b8
00bf052c	ldr x25,[sp, #0x50]
00bf0530	mov x26,x20
00bf0534	cbz x25,0x00bf0680
00bf0538	ldrb w8,[x25]
00bf053c	ldr x9,[x25, #0x8]
00bf0540	lsr x10,x8,#0x1
00bf0544	tst w8,#0x1
00bf0548	csel x8,x10,x9,eq
00bf054c	cmp x8,#0x2
00bf0550	b.cc 0x00bf0680
00bf0554	add x19,x25,#0x4
00bf0558	mov w20,#0x2
00bf055c	mov w23,#0x1
00bf0560	b 0x00bf0590
00bf0564	add x8,x8,#0x4
00bf0568	str x8,[x0, #0x18]
00bf056c	ldrb w8,[x25]
00bf0570	ldr x9,[x25, #0x8]
00bf0574	mov w23,w20
00bf0578	add w20,w20,#0x1
00bf057c	lsr x10,x8,#0x1
00bf0580	tst w8,#0x1
00bf0584	csel x8,x10,x9,eq
00bf0588	cmp x8,x23
00bf058c	b.ls 0x00bf0680
00bf0590	ldr x0,[x21]
00bf0594	cbz x0,0x00bf05e0
00bf0598	ldp x8,x9,[x0, #0x18]
00bf059c	cmp x8,x9
00bf05a0	b.eq 0x00bf05ac
00bf05a4	ldr w0,[x8]
00bf05a8	b 0x00bf05b8
00bf05ac	ldr x8,[x0]
00bf05b0	ldr x8,[x8, #0x48]
00bf05b4	blr x8
00bf05b8	cmn w0,#0x1
00bf05bc	b.eq 0x00bf05dc
00bf05c0	ldr x8,[x21]
00bf05c4	cmp x8,#0x0
00bf05c8	cset w24,eq
00bf05cc	cbnz x22,0x00bf05e8
00bf05d0	tbnz w24,#0x0,0x00bf077c
00bf05d4	mov x22,xzr
00bf05d8	b 0x00bf0620
00bf05dc	str xzr,[x21]
00bf05e0	mov w24,#0x1
00bf05e4	cbz x22,0x00bf05d0
00bf05e8	ldp x8,x9,[x22, #0x18]
00bf05ec	cmp x8,x9
00bf05f0	b.eq 0x00bf05fc
00bf05f4	ldr w0,[x8]
00bf05f8	b 0x00bf060c
00bf05fc	ldr x8,[x22]
00bf0600	ldr x8,[x8, #0x48]
00bf0604	mov x0,x22
00bf0608	blr x8
00bf060c	cmn w0,#0x1
00bf0610	cset w8,eq
00bf0614	csel x22,xzr,x22,eq
00bf0618	cmp w24,w8
00bf061c	b.eq 0x00bf077c
00bf0620	ldr x0,[x21]
00bf0624	ldp x8,x9,[x0, #0x18]
00bf0628	cmp x8,x9
00bf062c	b.eq 0x00bf0638
00bf0630	ldr w0,[x8]
00bf0634	b 0x00bf0644
00bf0638	ldr x8,[x0]
00bf063c	ldr x8,[x8, #0x48]
00bf0640	blr x8
00bf0644	ldrb w8,[x25]
00bf0648	ldr x9,[x25, #0x10]
00bf064c	tst w8,#0x1
00bf0650	csel x8,x19,x9,eq
00bf0654	ldr w8,[x8, x23, LSL #0x2]
00bf0658	cmp w0,w8
00bf065c	b.ne 0x00bf077c
00bf0660	ldr x0,[x21]
00bf0664	ldp x8,x9,[x0, #0x18]
00bf0668	cmp x8,x9
00bf066c	b.ne 0x00bf0564
00bf0670	ldr x8,[x0]
00bf0674	ldr x8,[x8, #0x50]
00bf0678	blr x8
00bf067c	b 0x00bf056c
00bf0680	cmp x27,x26
00bf0684	b.eq 0x00bf0740
00bf0688	ldrb w9,[sp, #0xe0]
00bf068c	ldr x8,[sp, #0xe8]
00bf0690	sub x11,x26,x27
00bf0694	mov w21,#0x1
00bf0698	lsr x10,x9,#0x1
00bf069c	tst w9,#0x1
00bf06a0	csel x8,x10,x8,eq
00bf06a4	cmp x11,#0x5
00bf06a8	b.lt 0x00bf0790
00bf06ac	cbz x8,0x00bf0790
00bf06b0	sub x8,x26,#0x4
00bf06b4	cmp x27,x8
00bf06b8	b.cs 0x00bf0748
00bf06bc	add x9,x27,#0x4
00bf06c0	mov x10,x8
00bf06c4	ldr w11,[x10]
00bf06c8	ldur w12,[x9, #-0x4]
00bf06cc	stur w11,[x9, #-0x4]
00bf06d0	str w12,[x10], #-0x4
00bf06d4	cmp x9,x10
00bf06d8	add x9,x9,#0x4
00bf06dc	b.cc 0x00bf06c4
00bf06e0	ldrb w9,[sp, #0xe0]
00bf06e4	ldp x12,x11,[sp, #0xe8]
00bf06e8	lsr x10,x9,#0x1
00bf06ec	tst w9,#0x1
00bf06f0	add x9,sp,#0xe0
00bf06f4	csinc x9,x11,x9,ne
00bf06f8	mov x11,x27
00bf06fc	csel x10,x10,x12,eq
00bf0700	add x10,x9,x10
00bf0704	b 0x00bf0720
00bf0708	sub x12,x10,x9
00bf070c	add x11,x11,#0x4
00bf0710	cmp x12,#0x1
00bf0714	cinc x9,x9,gt
00bf0718	cmp x11,x8
00bf071c	b.cs 0x00bf0758
00bf0720	ldrb w12,[x9]
00bf0724	cbz w12,0x00bf0708
00bf0728	cmp w12,#0xff
00bf072c	b.eq 0x00bf0708
00bf0730	ldr w13,[x11]
00bf0734	cmp w13,w12
00bf0738	b.eq 0x00bf0708
00bf073c	b 0x00bf077c
00bf0740	mov w21,#0x1
00bf0744	b 0x00bf0790
00bf0748	ldr x10,[sp, #0xf0]
00bf074c	tst w9,#0x1
00bf0750	add x9,sp,#0xe0
00bf0754	csinc x9,x10,x9,ne
00bf0758	ldrb w9,[x9]
00bf075c	mov w21,#0x1
00bf0760	cbz w9,0x00bf0790
00bf0764	cmp w9,#0xff
00bf0768	b.eq 0x00bf0790
00bf076c	ldr w8,[x8]
00bf0770	sub w8,w8,#0x1
00bf0774	cmp w8,w9
00bf0778	b.cc 0x00bf0790
00bf077c	ldr x9,[sp, #0x18]
00bf0780	mov w21,wzr
00bf0784	ldr w8,[x9]
00bf0788	orr w8,w8,#0x4
00bf078c	str w8,[x9]
00bf0790	ldrb w8,[sp, #0x80]
00bf0794	tbnz w8,#0x0,0x00bf07c0
00bf0798	ldrb w8,[sp, #0x98]
00bf079c	tbnz w8,#0x0,0x00bf07dc
00bf07a0	ldrb w8,[sp, #0xb0]
00bf07a4	tbnz w8,#0x0,0x00bf07f8
00bf07a8	ldrb w8,[sp, #0xc8]
00bf07ac	tbnz w8,#0x0,0x00bf0814
00bf07b0	ldrb w8,[sp, #0xe0]
00bf07b4	tbnz w8,#0x0,0x00bf0830
00bf07b8	cbnz x27,0x00bf0844
00bf07bc	b 0x00bf0850
00bf07c0	ldr x8,[sp, #0x80]
00bf07c4	ldr x0,[sp, #0x90]
00bf07c8	lsl x8,x8,#0x2
00bf07cc	and x1,x8,#-0x8
00bf07d0	bl 0x00c2fe80
00bf07d4	ldrb w8,[sp, #0x98]
00bf07d8	tbz w8,#0x0,0x00bf07a0
00bf07dc	ldr x8,[sp, #0x98]
00bf07e0	ldr x0,[sp, #0xa8]
00bf07e4	lsl x8,x8,#0x2
00bf07e8	and x1,x8,#-0x8
00bf07ec	bl 0x00c2fe80
00bf07f0	ldrb w8,[sp, #0xb0]
00bf07f4	tbz w8,#0x0,0x00bf07a8
00bf07f8	ldr x8,[sp, #0xb0]
00bf07fc	ldr x0,[sp, #0xc0]
00bf0800	lsl x8,x8,#0x2
00bf0804	and x1,x8,#-0x8
00bf0808	bl 0x00c2fe80
00bf080c	ldrb w8,[sp, #0xc8]
00bf0810	tbz w8,#0x0,0x00bf07b0
00bf0814	ldr x8,[sp, #0xc8]
00bf0818	ldr x0,[sp, #0xd8]
00bf081c	lsl x8,x8,#0x2
00bf0820	and x1,x8,#-0x8
00bf0824	bl 0x00c2fe80
00bf0828	ldrb w8,[sp, #0xe0]
00bf082c	tbz w8,#0x0,0x00bf07b8
00bf0830	ldr x8,[sp, #0xe0]
00bf0834	ldr x0,[sp, #0xf0]
00bf0838	and x1,x8,#-0x2
00bf083c	bl 0x00c2fe80
00bf0840	cbz x27,0x00bf0850
00bf0844	ldr x8,[sp, #0x60]
00bf0848	mov x0,x27
00bf084c	blr x8
00bf0850	mov w0,w21
00bf0854	add sp,sp,#0x2a0
00bf0858	ldp x20,x19,[sp, #0x50]
00bf085c	ldp x22,x21,[sp, #0x40]
00bf0860	ldp x24,x23,[sp, #0x30]
00bf0864	ldp x26,x25,[sp, #0x20]
00bf0868	ldp x28,x27,[sp, #0x10]
00bf086c	ldp x29,x30,[sp], #0x60
00bf0870	autiasp
00bf0874	ret
00bf0878	str x27,[sp, #0x30]
00bf087c	bl 0x00c43cc0
00bf0880	str x27,[sp, #0x30]
00bf0884	bl 0x00c43cc0
00bf0888	bl 0x007fe114
