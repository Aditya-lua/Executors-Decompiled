; CRYPTO_gcm128_decrypt @ 00aaa634
00aaa634	sub sp,sp,#0xa0
00aaa638	stp x28,x27,[sp, #0x40]
00aaa63c	stp x26,x25,[sp, #0x50]
00aaa640	stp x24,x23,[sp, #0x60]
00aaa644	stp x22,x21,[sp, #0x70]
00aaa648	stp x20,x19,[sp, #0x80]
00aaa64c	stp x29,x30,[sp, #0x90]
00aaa650	ldr x8,[x0, #0x38]
00aaa654	orr x10,xzr,#0xfffffffe0
00aaa658	mov x19,x0
00aaa65c	mov w0,#0xffffffff
00aaa660	adds x8,x8,x3
00aaa664	cset w9,cs
00aaa668	cmp x8,x10
00aaa66c	add x29,sp,#0x90
00aaa670	b.hi 0x00aaaae8
00aaa674	tbnz w9,#0x0,0x00aaaae8
00aaa678	ldr w9,[x19, #0x174]
00aaa67c	ldp x24,x21,[x19, #0x178]
00aaa680	mov x23,x3
00aaa684	mov x20,x2
00aaa688	mov x22,x1
00aaa68c	str x8,[x19, #0x38]
00aaa690	cbz w9,0x00aaa6b4
00aaa694	cbz x23,0x00aaa740
00aaa698	ldr q0,[x19, #0x40]
00aaa69c	add x8,x19,#0x188
00aaa6a0	mov w11,#0x10
00aaa6a4	str q0,[x8]
00aaa6a8	str wzr,[x19, #0x174]
00aaa6ac	stp xzr,xzr,[x19, #0x40]
00aaa6b0	b 0x00aaa6b8
00aaa6b4	ldr w11,[x19, #0x170]
00aaa6b8	ldr w25,[x19, #0xc]
00aaa6bc	ands w8,w11,#0xf
00aaa6c0	b.eq 0x00aaa714
00aaa6c4	cbz x23,0x00aaa708
00aaa6c8	add x9,x19,#0x10
00aaa6cc	ldrb w10,[x22], #0x1
00aaa6d0	add x12,x19,w11, UXTW 
00aaa6d4	add w11,w11,#0x1
00aaa6d8	sub x28,x23,#0x1
00aaa6dc	strb w10,[x12, #0x188]
00aaa6e0	ldrb w12,[x9, w8, UXTW ]
00aaa6e4	add w8,w8,#0x1
00aaa6e8	ands w8,w8,#0xf
00aaa6ec	eor w10,w12,w10
00aaa6f0	strb w10,[x20], #0x1
00aaa6f4	b.eq 0x00aaa704
00aaa6f8	cmp x23,#0x1
00aaa6fc	mov x23,x28
00aaa700	b.ne 0x00aaa6cc
00aaa704	cbz w8,0x00aaa758
00aaa708	mov w0,wzr
00aaa70c	str w11,[x19, #0x170]
00aaa710	b 0x00aaaae8
00aaa714	cmp x23,#0x10
00aaa718	b.cc 0x00aaa738
00aaa71c	cbz w11,0x00aaa738
00aaa720	add x0,x19,#0x40
00aaa724	add x1,x19,#0x60
00aaa728	add x2,x19,#0x188
00aaa72c	mov w3,w11
00aaa730	bl 0x00aaa048
00aaa734	mov w11,wzr
00aaa738	mov x28,x23
00aaa73c	b 0x00aaa770
00aaa740	add x0,x19,#0x40
00aaa744	add x1,x19,#0x60
00aaa748	bl 0x00aa9de0
00aaa74c	mov w0,wzr
00aaa750	str wzr,[x19, #0x174]
00aaa754	b 0x00aaaae8
00aaa758	add x0,x19,#0x40
00aaa75c	add x1,x19,#0x60
00aaa760	add x2,x19,#0x188
00aaa764	mov w3,w11
00aaa768	bl 0x00aaa048
00aaa76c	mov w11,wzr
00aaa770	cmp x28,#0xc00
00aaa774	rev w23,w25
00aaa778	str w11,[sp, #0xc]
00aaa77c	b.cc 0x00aaa854
00aaa780	add x8,x19,#0x40
00aaa784	str x8,[sp, #0x18]
00aaa788	add x8,x19,#0x60
00aaa78c	add x26,x19,#0x10
00aaa790	add w27,w23,#0x1
00aaa794	str x8,[sp, #0x10]
00aaa798	ldp x1,x0,[sp, #0x10]
00aaa79c	orr w3,wzr,#0xc00
00aaa7a0	mov x2,x22
00aaa7a4	str w23,[sp, #0x30]
00aaa7a8	str x28,[sp, #0x38]
00aaa7ac	bl 0x00aaa048
00aaa7b0	mov x25,xzr
00aaa7b4	add x8,x22,#0xc00
00aaa7b8	str x8,[sp, #0x28]
00aaa7bc	str w27,[sp, #0x24]
00aaa7c0	mov x0,x19
00aaa7c4	mov x1,x26
00aaa7c8	mov x2,x21
00aaa7cc	add x23,x20,x25
00aaa7d0	add x28,x22,x25
00aaa7d4	blr x24
00aaa7d8	lsr w8,w27,#0x18
00aaa7dc	lsr w9,w27,#0x10
00aaa7e0	strb w8,[x19, #0xc]
00aaa7e4	lsr w8,w27,#0x8
00aaa7e8	strb w27,[x19, #0xf]
00aaa7ec	strb w9,[x19, #0xd]
00aaa7f0	strb w8,[x19, #0xe]
00aaa7f4	ldr x9,[x19, #0x10]
00aaa7f8	ldr x8,[x28]
00aaa7fc	add x25,x25,#0x10
00aaa800	cmp x25,#0xc00
00aaa804	add w27,w27,#0x1
00aaa808	eor x8,x9,x8
00aaa80c	str x8,[x23]
00aaa810	ldr x8,[x28, #0x8]
00aaa814	ldr x9,[x19, #0x18]
00aaa818	eor x8,x9,x8
00aaa81c	str x8,[x23, #0x8]
00aaa820	b.ne 0x00aaa7c0
00aaa824	ldr x28,[sp, #0x38]
00aaa828	ldr w23,[sp, #0x30]
00aaa82c	ldr w27,[sp, #0x24]
00aaa830	ldr x8,[sp, #0x28]
00aaa834	sub x28,x28,#0xc00
00aaa838	add x20,x20,#0xc00
00aaa83c	add w23,w23,#0xc0
00aaa840	cmp x28,#0xbff
00aaa844	add w27,w27,#0xc0
00aaa848	mov x22,x8
00aaa84c	b.hi 0x00aaa798
00aaa850	b 0x00aaa858
00aaa854	mov x8,x22
00aaa858	mov x26,x8
00aaa85c	ands x3,x28,#-0x10
00aaa860	b.eq 0x00aaa930
00aaa864	add x0,x19,#0x40
00aaa868	add x1,x19,#0x60
00aaa86c	mov x2,x26
00aaa870	bl 0x00aaa048
00aaa874	subs x9,x28,#0x10
00aaa878	b.cc 0x00aaa930
00aaa87c	lsr x8,x9,#0x4
00aaa880	str x9,[sp, #0x38]
00aaa884	and x9,x9,#-0x10
00aaa888	add w8,w23,w8
00aaa88c	str x9,[sp, #0x30]
00aaa890	add x9,x9,#0x10
00aaa894	str w8,[sp, #0x24]
00aaa898	mov x8,x26
00aaa89c	add x22,x19,#0x10
00aaa8a0	add x26,x26,x9
00aaa8a4	add w25,w23,#0x1
00aaa8a8	mov x27,x20
00aaa8ac	mov x23,x8
00aaa8b0	str x9,[sp, #0x28]
00aaa8b4	mov x0,x19
00aaa8b8	mov x1,x22
00aaa8bc	mov x2,x21
00aaa8c0	blr x24
00aaa8c4	lsr w8,w25,#0x18
00aaa8c8	lsr w9,w25,#0x10
00aaa8cc	strb w8,[x19, #0xc]
00aaa8d0	lsr w8,w25,#0x8
00aaa8d4	strb w25,[x19, #0xf]
00aaa8d8	strb w9,[x19, #0xd]
00aaa8dc	strb w8,[x19, #0xe]
00aaa8e0	ldr x9,[x19, #0x10]
00aaa8e4	ldr x8,[x23]
00aaa8e8	sub x28,x28,#0x10
00aaa8ec	add w25,w25,#0x1
00aaa8f0	cmp x28,#0xf
00aaa8f4	eor x8,x9,x8
00aaa8f8	str x8,[x27]
00aaa8fc	ldr x8,[x23, #0x8]
00aaa900	ldr x9,[x19, #0x18]
00aaa904	add x23,x23,#0x10
00aaa908	eor x8,x9,x8
00aaa90c	str x8,[x27, #0x8]
00aaa910	add x27,x27,#0x10
00aaa914	b.hi 0x00aaa8b4
00aaa918	ldp x8,x9,[sp, #0x28]
00aaa91c	add x20,x20,x8
00aaa920	ldr x8,[sp, #0x38]
00aaa924	sub x28,x8,x9
00aaa928	ldr w8,[sp, #0x24]
00aaa92c	add w23,w8,#0x1
00aaa930	cbz x28,0x00aaa984
00aaa934	add x22,x19,#0x10
00aaa938	mov x0,x19
00aaa93c	mov x1,x22
00aaa940	mov x2,x21
00aaa944	blr x24
00aaa948	add w8,w23,#0x1
00aaa94c	cmp x28,#0x20
00aaa950	lsr w9,w8,#0x18
00aaa954	lsr w10,w8,#0x10
00aaa958	lsr w11,w8,#0x8
00aaa95c	strb w9,[x19, #0xc]
00aaa960	strb w10,[x19, #0xd]
00aaa964	strb w11,[x19, #0xe]
00aaa968	strb w8,[x19, #0xf]
00aaa96c	b.cs 0x00aaa98c
00aaa970	ldr w1,[sp, #0xc]
00aaa974	mov w8,wzr
00aaa978	mov x9,x28
00aaa97c	mov w11,w1
00aaa980	b 0x00aaaab0
00aaa984	ldr w1,[sp, #0xc]
00aaa988	b 0x00aaaae0
00aaa98c	ldr w1,[sp, #0xc]
00aaa990	sub x8,x28,#0x1
00aaa994	cmn w1,w8
00aaa998	b.cs 0x00aaaaa4
00aaa99c	lsr x8,x8,#0x20
00aaa9a0	cbnz x8,0x00aaaaa4
00aaa9a4	add x8,x19,#0x188
00aaa9a8	mov w10,w1
00aaa9ac	add x16,x20,x28
00aaa9b0	add x9,x8,x10
00aaa9b4	add x11,x28,x10
00aaa9b8	add x13,x8,x11
00aaa9bc	cmp x9,x16
00aaa9c0	add x12,x26,x28
00aaa9c4	cset w8,cc
00aaa9c8	cmp x20,x13
00aaa9cc	add x17,x19,#0x10
00aaa9d0	cset w11,cc
00aaa9d4	cmp x9,x12
00aaa9d8	add x14,x17,x28
00aaa9dc	and w18,w8,w11
00aaa9e0	cset w8,cc
00aaa9e4	cmp x26,x13
00aaa9e8	cset w11,cc
00aaa9ec	cmp x9,x14
00aaa9f0	cset w9,cc
00aaa9f4	cmp x13,x17
00aaa9f8	cset w13,hi
00aaa9fc	cmp x20,x12
00aaaa00	cset w12,cc
00aaaa04	cmp x26,x16
00aaaa08	cset w15,cc
00aaaa0c	cmp x20,x14
00aaaa10	cset w14,cc
00aaaa14	cmp x16,x17
00aaaa18	cset w16,hi
00aaaa1c	tbnz w18,#0x0,0x00aaaaa4
00aaaa20	and w8,w8,w11
00aaaa24	tbnz w8,#0x0,0x00aaaaa4
00aaaa28	and w8,w9,w13
00aaaa2c	tbnz w8,#0x0,0x00aaaaa4
00aaaa30	and w8,w12,w15
00aaaa34	tbnz w8,#0x0,0x00aaaaa4
00aaaa38	and w8,w14,w16
00aaaa3c	tbnz w8,#0x0,0x00aaaaa4
00aaaa40	and x8,x28,#-0x20
00aaaa44	mov x12,xzr
00aaaa48	sub x9,x28,x8
00aaaa4c	add w11,w1,w8
00aaaa50	and x14,x12,#0xffffffe0
00aaaa54	add x15,x26,x14
00aaaa58	ldp q0,q1,[x15]
00aaaa5c	add w13,w10,w12
00aaaa60	add x13,x19,x13
00aaaa64	add x15,x13,#0x188
00aaaa68	add x13,x13,#0x198
00aaaa6c	str q0,[x15]
00aaaa70	add x15,x22,x14
00aaaa74	str q1,[x13]
00aaaa78	ldp q2,q3,[x15]
00aaaa7c	add x12,x12,#0x20
00aaaa80	add x13,x20,x14
00aaaa84	cmp x8,x12
00aaaa88	eor v0.16B,v2.16B,v0.16B
00aaaa8c	eor v1.16B,v3.16B,v1.16B
00aaaa90	stp q0,q1,[x13]
00aaaa94	b.ne 0x00aaaa50
00aaaa98	cmp x28,x8
00aaaa9c	b.ne 0x00aaaab0
00aaaaa0	b 0x00aaaadc
00aaaaa4	mov w8,wzr
00aaaaa8	mov x9,x28
00aaaaac	mov w11,w1
00aaaab0	mov w10,w8
00aaaab4	ldrb w12,[x26, x10]
00aaaab8	add x13,x19,w11, UXTW 
00aaaabc	subs x9,x9,#0x1
00aaaac0	add w11,w11,#0x1
00aaaac4	strb w12,[x13, #0x188]
00aaaac8	ldrb w13,[x22, x10]
00aaaacc	add w8,w8,#0x1
00aaaad0	eor w12,w13,w12
00aaaad4	strb w12,[x20, x10]
00aaaad8	b.ne 0x00aaaab0
00aaaadc	add w1,w1,w28
00aaaae0	mov w0,wzr
00aaaae4	str w1,[x19, #0x170]
00aaaae8	ldp x29,x30,[sp, #0x90]
00aaaaec	ldp x20,x19,[sp, #0x80]
00aaaaf0	ldp x22,x21,[sp, #0x70]
00aaaaf4	ldp x24,x23,[sp, #0x60]
00aaaaf8	ldp x26,x25,[sp, #0x50]
00aaaafc	ldp x28,x27,[sp, #0x40]
00aaab00	add sp,sp,#0xa0
00aaab04	ret
