; FUN_00bda608 @ 00bda608
00bda608	paciasp
00bda60c	sub sp,sp,#0x100
00bda610	stp x29,x30,[sp, #0xa0]
00bda614	stp x28,x27,[sp, #0xb0]
00bda618	stp x26,x25,[sp, #0xc0]
00bda61c	stp x24,x23,[sp, #0xd0]
00bda620	stp x22,x21,[sp, #0xe0]
00bda624	stp x20,x19,[sp, #0xf0]
00bda628	add x29,sp,#0xa0
00bda62c	sub x8,x3,x2
00bda630	orr x9,xzr,#-0x5555555555555556
00bda634	mov x19,x5
00bda638	asr x8,x8,#0x3
00bda63c	movk x9,#0xaaab
00bda640	mov x26,x4
00bda644	mov x22,x3
00bda648	mov x23,x2
00bda64c	mov x24,x1
00bda650	mul x27,x8,x9
00bda654	mov x25,x0
00bda658	str w6,[sp, #0x38]
00bda65c	cmp x27,#0x65
00bda660	b.cc 0x00bda67c
00bda664	mov x0,x27
00bda668	bl 0x00c308d0
00bda66c	str x0,[sp, #0x28]
00bda670	str x0,[sp, #0x10]
00bda674	cbnz x0,0x00bda688
00bda678	bl 0x00c43cc0
00bda67c	add x8,sp,#0x3c
00bda680	str xzr,[sp, #0x10]
00bda684	str x8,[sp, #0x28]
00bda688	cmp x23,x22
00bda68c	str x19,[sp, #0x8]
00bda690	b.eq 0x00bda6e0
00bda694	ldr x10,[sp, #0x28]
00bda698	mov x21,xzr
00bda69c	mov w8,#0x1
00bda6a0	mov x9,x23
00bda6a4	ldrb w11,[x9]
00bda6a8	ldr x12,[x9, #0x8]
00bda6ac	add x9,x9,#0x18
00bda6b0	lsr x13,x11,#0x1
00bda6b4	tst w11,#0x1
00bda6b8	csel x11,x13,x12,eq
00bda6bc	cmp x11,#0x0
00bda6c0	cset w11,eq
00bda6c4	cinc w12,w8,eq
00bda6c8	cinc x21,x21,eq
00bda6cc	cmp x9,x22
00bda6d0	sub x27,x27,x11
00bda6d4	strb w12,[x10], #0x1
00bda6d8	b.ne 0x00bda6a4
00bda6dc	b 0x00bda6e8
00bda6e0	mov x27,xzr
00bda6e4	mov x21,xzr
00bda6e8	mov x19,xzr
00bda6ec	stp x25,x23,[sp, #0x18]
00bda6f0	ldr x0,[x25]
00bda6f4	cbnz x0,0x00bda708
00bda6f8	b 0x00bda750
00bda6fc	add x19,x19,#0x1
00bda700	ldr x0,[x25]
00bda704	cbz x0,0x00bda750
00bda708	ldp x8,x9,[x0, #0x18]
00bda70c	cmp x8,x9
00bda710	b.eq 0x00bda724
00bda714	mov w20,wzr
00bda718	cbnz x24,0x00bda758
00bda71c	mov w8,#0x1
00bda720	b 0x00bda788
00bda724	ldr x8,[x0]
00bda728	ldr x8,[x8, #0x48]
00bda72c	blr x8
00bda730	cmn w0,#0x1
00bda734	b.eq 0x00bda74c
00bda738	ldr x8,[x25]
00bda73c	cmp x8,#0x0
00bda740	cset w20,eq
00bda744	cbnz x24,0x00bda758
00bda748	b 0x00bda71c
00bda74c	str xzr,[x25]
00bda750	mov w20,#0x1
00bda754	cbz x24,0x00bda71c
00bda758	ldp x8,x9,[x24, #0x18]
00bda75c	cmp x8,x9
00bda760	b.eq 0x00bda76c
00bda764	mov w8,wzr
00bda768	b 0x00bda788
00bda76c	ldr x8,[x24]
00bda770	ldr x8,[x8, #0x48]
00bda774	mov x0,x24
00bda778	blr x8
00bda77c	cmn w0,#0x1
00bda780	cset w8,eq
00bda784	csel x24,xzr,x24,eq
00bda788	ldr x0,[x25]
00bda78c	cmp w20,w8
00bda790	b.eq 0x00bda938
00bda794	cbz x27,0x00bda938
00bda798	ldp x8,x9,[x0, #0x18]
00bda79c	cmp x8,x9
00bda7a0	b.eq 0x00bda7ac
00bda7a4	ldrb w1,[x8]
00bda7a8	b 0x00bda7bc
00bda7ac	ldr x8,[x0]
00bda7b0	ldr x8,[x8, #0x48]
00bda7b4	blr x8
00bda7b8	mov w1,w0
00bda7bc	ldr w8,[sp, #0x38]
00bda7c0	tbnz w8,#0x0,0x00bda7d8
00bda7c4	ldr x8,[x26]
00bda7c8	ldr x8,[x8, #0x18]
00bda7cc	mov x0,x26
00bda7d0	blr x8
00bda7d4	mov w1,w0
00bda7d8	cmp x23,x22
00bda7dc	b.eq 0x00bda6fc
00bda7e0	mov x20,x23
00bda7e4	ldr x23,[sp, #0x28]
00bda7e8	str x24,[sp, #0x30]
00bda7ec	mov w25,wzr
00bda7f0	add x24,x19,#0x1
00bda7f4	and w28,w1,#0xff
00bda7f8	b 0x00bda814
00bda7fc	sub x27,x27,#0x1
00bda800	strb wzr,[x23]
00bda804	add x20,x20,#0x18
00bda808	add x23,x23,#0x1
00bda80c	cmp x20,x22
00bda810	b.eq 0x00bda88c
00bda814	ldrb w8,[x23]
00bda818	cmp w8,#0x1
00bda81c	b.ne 0x00bda804
00bda820	ldrb w8,[x20]
00bda824	ldr x9,[x20, #0x10]
00bda828	tst w8,#0x1
00bda82c	csinc x8,x9,x20,ne
00bda830	ldrb w1,[x8, x19]
00bda834	ldr w8,[sp, #0x38]
00bda838	tbnz w8,#0x0,0x00bda850
00bda83c	ldr x8,[x26]
00bda840	ldr x8,[x8, #0x18]
00bda844	mov x0,x26
00bda848	blr x8
00bda84c	mov w1,w0
00bda850	cmp w28,w1, UXTB 
00bda854	b.ne 0x00bda7fc
00bda858	ldrb w8,[x20]
00bda85c	ldr x9,[x20, #0x8]
00bda860	lsr x10,x8,#0x1
00bda864	tst w8,#0x1
00bda868	csel x8,x10,x9,eq
00bda86c	cmp x8,x24
00bda870	b.ne 0x00bda884
00bda874	mov w8,#0x2
00bda878	sub x27,x27,#0x1
00bda87c	add x21,x21,#0x1
00bda880	strb w8,[x23]
00bda884	mov w25,#0x1
00bda888	b 0x00bda804
00bda88c	tbz w25,#0x0,0x00bda8b0
00bda890	ldp x25,x23,[sp, #0x18]
00bda894	ldr x0,[x25]
00bda898	ldp x8,x9,[x0, #0x18]
00bda89c	cmp x8,x9
00bda8a0	b.eq 0x00bda8c8
00bda8a4	add x8,x8,#0x1
00bda8a8	str x8,[x0, #0x18]
00bda8ac	b 0x00bda8d4
00bda8b0	ldp x25,x23,[sp, #0x18]
00bda8b4	add x19,x19,#0x1
00bda8b8	ldr x24,[sp, #0x30]
00bda8bc	ldr x0,[x25]
00bda8c0	cbnz x0,0x00bda708
00bda8c4	b 0x00bda750
00bda8c8	ldr x8,[x0]
00bda8cc	ldr x8,[x8, #0x50]
00bda8d0	blr x8
00bda8d4	add x8,x21,x27
00bda8d8	ldr x24,[sp, #0x30]
00bda8dc	cmp x8,#0x2
00bda8e0	b.cc 0x00bda6fc
00bda8e4	ldr x10,[sp, #0x28]
00bda8e8	add x8,x19,#0x1
00bda8ec	mov x9,x23
00bda8f0	b 0x00bda904
00bda8f4	add x9,x9,#0x18
00bda8f8	add x10,x10,#0x1
00bda8fc	cmp x9,x22
00bda900	b.eq 0x00bda6fc
00bda904	ldrb w11,[x10]
00bda908	cmp w11,#0x2
00bda90c	b.ne 0x00bda8f4
00bda910	ldrb w11,[x9]
00bda914	ldr x12,[x9, #0x8]
00bda918	lsr x13,x11,#0x1
00bda91c	tst w11,#0x1
00bda920	csel x11,x13,x12,eq
00bda924	cmp x11,x8
00bda928	b.eq 0x00bda8f4
00bda92c	sub x21,x21,#0x1
00bda930	strb wzr,[x10]
00bda934	b 0x00bda8f4
00bda938	cbz x0,0x00bda9d8
00bda93c	ldp x8,x9,[x0, #0x18]
00bda940	ldr x20,[sp, #0x8]
00bda944	cmp x8,x9
00bda948	b.eq 0x00bda9ec
00bda94c	mov w19,wzr
00bda950	cbz x24,0x00bda9e4
00bda954	ldp x8,x9,[x24, #0x18]
00bda958	cmp x8,x9
00bda95c	b.eq 0x00bdaa14
00bda960	tbnz w19,#0x0,0x00bda970
00bda964	ldr w8,[x20]
00bda968	orr w8,w8,#0x2
00bda96c	str w8,[x20]
00bda970	cmp x23,x22
00bda974	b.eq 0x00bda998
00bda978	ldr x9,[sp, #0x28]
00bda97c	ldrb w8,[x9]
00bda980	cmp w8,#0x2
00bda984	b.eq 0x00bda9a4
00bda988	add x23,x23,#0x18
00bda98c	add x9,x9,#0x1
00bda990	cmp x23,x22
00bda994	b.ne 0x00bda97c
00bda998	ldr w8,[x20]
00bda99c	orr w8,w8,#0x4
00bda9a0	str w8,[x20]
00bda9a4	ldr x0,[sp, #0x10]
00bda9a8	cbz x0,0x00bda9b0
00bda9ac	bl 0x00c30960
00bda9b0	mov x0,x23
00bda9b4	ldp x20,x19,[sp, #0xf0]
00bda9b8	ldp x22,x21,[sp, #0xe0]
00bda9bc	ldp x24,x23,[sp, #0xd0]
00bda9c0	ldp x26,x25,[sp, #0xc0]
00bda9c4	ldp x28,x27,[sp, #0xb0]
00bda9c8	ldp x29,x30,[sp, #0xa0]
00bda9cc	add sp,sp,#0x100
00bda9d0	autiasp
00bda9d4	ret
00bda9d8	ldr x20,[sp, #0x8]
00bda9dc	mov w19,#0x1
00bda9e0	cbnz x24,0x00bda954
00bda9e4	tbnz w19,#0x0,0x00bda964
00bda9e8	b 0x00bda970
00bda9ec	ldr x8,[x0]
00bda9f0	ldr x8,[x8, #0x48]
00bda9f4	blr x8
00bda9f8	cmn w0,#0x1
00bda9fc	b.eq 0x00bdaa38
00bdaa00	ldr x8,[x25]
00bdaa04	cmp x8,#0x0
00bdaa08	cset w19,eq
00bdaa0c	cbnz x24,0x00bda954
00bdaa10	b 0x00bda9e4
00bdaa14	ldr x8,[x24]
00bdaa18	ldr x8,[x8, #0x48]
00bdaa1c	mov x0,x24
00bdaa20	blr x8
00bdaa24	cmn w0,#0x1
00bdaa28	cset w8,eq
00bdaa2c	eor w8,w19,w8
00bdaa30	tbz w8,#0x0,0x00bda964
00bdaa34	b 0x00bda970
00bdaa38	mov w19,#0x1
00bdaa3c	str xzr,[x25]
00bdaa40	cbnz x24,0x00bda954
00bdaa44	b 0x00bda9e4
