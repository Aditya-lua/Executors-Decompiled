; gf_strong_reduce @ 00a4a620
00a4a620	ldp x10,x11,[x0, #0x30]
00a4a624	ldp x12,x13,[x0, #0x20]
00a4a628	ldp x14,x15,[x0, #0x10]
00a4a62c	ldp x16,x17,[x0]
00a4a630	lsr x18,x11,#0x38
00a4a634	and x11,x11,#0xffffffffffffff
00a4a638	and x1,x10,#0xffffffffffffff
00a4a63c	add x10,x11,x10, LSR #0x38
00a4a640	and x2,x13,#0xffffffffffffff
00a4a644	add x11,x1,x13, LSR #0x38
00a4a648	and x13,x15,#0xffffffffffffff
00a4a64c	add x13,x13,x14, LSR #0x38
00a4a650	and x14,x14,#0xffffffffffffff
00a4a654	add x14,x14,x17, LSR #0x38
00a4a658	and x17,x17,#0xffffffffffffff
00a4a65c	add x17,x17,x16, LSR #0x38
00a4a660	and x16,x16,#0xffffffffffffff
00a4a664	orr x8,xzr,#-0xffffffffffffff
00a4a668	add x1,x12,x18
00a4a66c	add x16,x16,x18
00a4a670	mov x9,#-0x1
00a4a674	add x12,x2,x1, LSR #0x38
00a4a678	and x18,x1,#0xffffffffffffff
00a4a67c	adds x1,x16,x8
00a4a680	add x15,x18,x15, LSR #0x38
00a4a684	adcs x18,xzr,x9
00a4a688	extr x1,x18,x1,#0x38
00a4a68c	asr x18,x18,#0x38
00a4a690	adds x17,x1,x17
00a4a694	adcs x18,x18,xzr
00a4a698	adds x17,x17,x8
00a4a69c	adcs x18,x18,x9
00a4a6a0	asr x1,x18,#0x38
00a4a6a4	extr x18,x18,x17,#0x38
00a4a6a8	adds x14,x18,x14
00a4a6ac	adcs x18,x1,xzr
00a4a6b0	adds x14,x14,x8
00a4a6b4	adcs x18,x18,x9
00a4a6b8	asr x1,x18,#0x38
00a4a6bc	extr x18,x18,x14,#0x38
00a4a6c0	adds x13,x18,x13
00a4a6c4	adcs x18,x1,xzr
00a4a6c8	adds x13,x13,x8
00a4a6cc	adcs x18,x18,x9
00a4a6d0	extr x1,x18,x13,#0x38
00a4a6d4	adds x15,x1,x15
00a4a6d8	mov x1,#0x2
00a4a6dc	asr x18,x18,#0x38
00a4a6e0	movk x1,#0xff00, LSL #48
00a4a6e4	adcs x18,x18,xzr
00a4a6e8	adds x15,x15,x1
00a4a6ec	adcs x18,x18,x9
00a4a6f0	and x1,x15,#0xffffffffffffff
00a4a6f4	extr x15,x18,x15,#0x38
00a4a6f8	asr x18,x18,#0x38
00a4a6fc	adds x12,x15,x12
00a4a700	adcs x15,x18,xzr
00a4a704	adds x12,x12,x8
00a4a708	adcs x15,x15,x9
00a4a70c	and x18,x12,#0xffffffffffffff
00a4a710	extr x12,x15,x12,#0x38
00a4a714	asr x15,x15,#0x38
00a4a718	adds x11,x12,x11
00a4a71c	adcs x12,x15,xzr
00a4a720	adds x11,x11,x8
00a4a724	adcs x12,x12,x9
00a4a728	and x15,x11,#0xffffffffffffff
00a4a72c	extr x11,x12,x11,#0x38
00a4a730	asr x12,x12,#0x38
00a4a734	adds x10,x11,x10
00a4a738	adcs x11,x12,xzr
00a4a73c	adds x8,x10,x8
00a4a740	adcs x9,x11,x9
00a4a744	add x16,x16,#0x1
00a4a748	extr x9,x9,x8,#0x38
00a4a74c	and x16,x16,#0xffffffffffffff
00a4a750	and x10,x9,#0xffffffffffffff
00a4a754	add x12,x10,x16
00a4a758	and x17,x17,#0xffffffffffffff
00a4a75c	extr x16,xzr,x12,#0x38
00a4a760	fmov d1,x12
00a4a764	add x12,x16,x17
00a4a768	add x12,x12,x10
00a4a76c	and x14,x14,#0xffffffffffffff
00a4a770	extr x16,xzr,x12,#0x38
00a4a774	fmov d2,x12
00a4a778	adds x12,x16,x14
00a4a77c	adcs x14,xzr,xzr
00a4a780	adds x12,x12,x10
00a4a784	movi v0.2D,#0xffffffffffffff
00a4a788	mov v1.D[0x1],v2.D[0x0]
00a4a78c	adcs x14,x14,xzr
00a4a790	and x13,x13,#0xffffffffffffff
00a4a794	and v1.16B,v1.16B,v0.16B
00a4a798	lsr x16,x14,#0x38
00a4a79c	extr x14,x14,x12,#0x38
00a4a7a0	str q1,[x0]
00a4a7a4	fmov d1,x12
00a4a7a8	adds x12,x14,x13
00a4a7ac	adcs x13,x16,xzr
00a4a7b0	adds x12,x12,x10
00a4a7b4	adcs x13,x13,xzr
00a4a7b8	extr x14,x13,x12,#0x38
00a4a7bc	fmov d2,x12
00a4a7c0	lsr x12,x13,#0x38
00a4a7c4	adds x13,x14,x1
00a4a7c8	and x11,x9,#0xfffffffffffffe
00a4a7cc	adcs x12,x12,xzr
00a4a7d0	adds x11,x13,x11
00a4a7d4	mov v1.D[0x1],v2.D[0x0]
00a4a7d8	adcs x12,x12,xzr
00a4a7dc	and v1.16B,v1.16B,v0.16B
00a4a7e0	lsr x13,x12,#0x38
00a4a7e4	extr x12,x12,x11,#0x38
00a4a7e8	str q1,[x0, #0x10]
00a4a7ec	fmov d1,x11
00a4a7f0	adds x11,x12,x18
00a4a7f4	adcs x12,x13,xzr
00a4a7f8	adds x11,x11,x10
00a4a7fc	adcs x12,x12,xzr
00a4a800	extr x13,x12,x11,#0x38
00a4a804	fmov d2,x11
00a4a808	lsr x11,x12,#0x38
00a4a80c	adds x12,x13,x15
00a4a810	adcs x11,x11,xzr
00a4a814	adds x10,x12,x10
00a4a818	adcs x11,x11,xzr
00a4a81c	extr x11,x11,x10,#0x38
00a4a820	mov v1.D[0x1],v2.D[0x0]
00a4a824	add x8,x11,x8
00a4a828	and v1.16B,v1.16B,v0.16B
00a4a82c	add x8,x8,x9
00a4a830	str q1,[x0, #0x20]
00a4a834	fmov d1,x10
00a4a838	fmov d2,x8
00a4a83c	mov v1.D[0x1],v2.D[0x0]
00a4a840	and v0.16B,v1.16B,v0.16B
00a4a844	str q0,[x0, #0x30]
00a4a848	ret
