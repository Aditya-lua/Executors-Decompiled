; ossl_ffc_params_FIPS186_2_gen_verify @ 00a7e6f8
00a7e6f8	sub sp,sp,#0x1f0
00a7e6fc	mov w8,#0xffffffff
00a7e700	stp x28,x27,[sp, #0x190]
00a7e704	stp x26,x25,[sp, #0x1a0]
00a7e708	stp x24,x23,[sp, #0x1b0]
00a7e70c	stp x22,x21,[sp, #0x1c0]
00a7e710	stp x20,x19,[sp, #0x1d0]
00a7e714	stp x29,x30,[sp, #0x1e0]
00a7e718	str x7,[sp, #0xb8]
00a7e71c	stp w8,wzr,[sp, #0xc0]
00a7e720	ldp x26,x23,[x1, #0x20]
00a7e724	mov x25,x6
00a7e728	mov x28,x5
00a7e72c	mov x27,x4
00a7e730	mov w22,w2
00a7e734	mov x21,x1
00a7e738	mov x20,x0
00a7e73c	mov w24,wzr
00a7e740	add x29,sp,#0x1e0
00a7e744	cbnz w2,0x00a7e74c
00a7e748	ldr w24,[x21, #0x40]
00a7e74c	str wzr,[x25]
00a7e750	ldr x1,[x21, #0x48]
00a7e754	cbz x1,0x00a7e788
00a7e758	ldr x2,[x21, #0x50]
00a7e75c	mov x0,x20
00a7e760	bl 0x00c357f0
00a7e764	mov x19,x0
00a7e768	cbz x0,0x00a7e7c4
00a7e76c	cbz x28,0x00a7e7d4
00a7e770	cmp x27,#0x1ff
00a7e774	b.hi 0x00a7e7ec
00a7e778	mov w8,#0x20000
00a7e77c	mov w26,wzr
00a7e780	mov x20,xzr
00a7e784	b 0x00a7e85c
00a7e788	cmp x27,#0x7ff
00a7e78c	mov w8,#0xa0
00a7e790	mov w9,#0x100
00a7e794	csel x8,x9,x8,hi
00a7e798	cmp x28,#0x0
00a7e79c	csel x28,x8,x28,eq
00a7e7a0	cmp x28,#0xa0
00a7e7a4	b.eq 0x00a7e828
00a7e7a8	cmp x28,#0x100
00a7e7ac	b.eq 0x00a7e834
00a7e7b0	cmp x28,#0xe0
00a7e7b4	b.ne 0x00a7e840
00a7e7b8	adrp x1,0x2b9000
00a7e7bc	add x1,x1,#0xf7b
00a7e7c0	b 0x00a7e758
00a7e7c4	mov w26,wzr
00a7e7c8	mov x20,xzr
00a7e7cc	mov x28,xzr
00a7e7d0	b 0x00a7e864
00a7e7d4	mov x0,x19
00a7e7d8	bl 0x00c34c20
00a7e7dc	lsl w8,w0,#0x3
00a7e7e0	sxtw x28,w8
00a7e7e4	cmp x27,#0x1ff
00a7e7e8	b.ls 0x00a7e778
00a7e7ec	str w24,[sp, #0xb4]
00a7e7f0	lsr x24,x28,#0x3
00a7e7f4	cmp x24,#0x20
00a7e7f8	b.hi 0x00a7e850
00a7e7fc	mov w8,#0x1
00a7e800	mov x9,#0x10100000
00a7e804	lsl x8,x8,x24
00a7e808	movk x9,#0x1, LSL #32
00a7e80c	tst x8,x9
00a7e810	b.eq 0x00a7e850
00a7e814	cbz x26,0x00a7e8b0
00a7e818	cmp x23,x24
00a7e81c	b.cs 0x00a7e8a0
00a7e820	mov w8,#0x40000
00a7e824	b 0x00a7e77c
00a7e828	adrp x1,0x2d1000
00a7e82c	add x1,x1,#0x42e
00a7e830	b 0x00a7e758
00a7e834	adrp x1,0x2b1000
00a7e838	add x1,x1,#0x8bd
00a7e83c	b 0x00a7e758
00a7e840	mov w26,wzr
00a7e844	mov x20,xzr
00a7e848	mov x19,xzr
00a7e84c	b 0x00a7e858
00a7e850	mov w26,wzr
00a7e854	mov x20,xzr
00a7e858	mov w8,#0x20
00a7e85c	mov x28,xzr
00a7e860	str w8,[x25]
00a7e864	mov x0,x20
00a7e868	bl 0x00c38a30
00a7e86c	mov x0,x28
00a7e870	bl 0x00c38f70
00a7e874	mov x0,x19
00a7e878	bl 0x00c35800
00a7e87c	mov w0,w26
00a7e880	ldp x29,x30,[sp, #0x1e0]
00a7e884	ldp x20,x19,[sp, #0x1d0]
00a7e888	ldp x22,x21,[sp, #0x1c0]
00a7e88c	ldp x24,x23,[sp, #0x1b0]
00a7e890	ldp x26,x25,[sp, #0x1a0]
00a7e894	ldp x28,x27,[sp, #0x190]
00a7e898	add sp,sp,#0x1f0
00a7e89c	ret
00a7e8a0	csel x2,x24,x23,hi
00a7e8a4	add x0,sp,#0xe8
00a7e8a8	mov x1,x26
00a7e8ac	bl 0x00c2ffd0
00a7e8b0	mov x0,x20
00a7e8b4	bl 0x00c38a60
00a7e8b8	mov x20,x0
00a7e8bc	cbz x0,0x00a7e960
00a7e8c0	mov x0,x20
00a7e8c4	bl 0x00c38a90
00a7e8c8	mov x0,x20
00a7e8cc	bl 0x00c38a40
00a7e8d0	str x0,[sp, #0x80]
00a7e8d4	mov x0,x20
00a7e8d8	bl 0x00c38a40
00a7e8dc	str x0,[sp, #0x90]
00a7e8e0	mov x0,x20
00a7e8e4	bl 0x00c38a40
00a7e8e8	str x0,[sp, #0xa8]
00a7e8ec	mov x0,x20
00a7e8f0	bl 0x00c38a40
00a7e8f4	str x0,[sp, #0x88]
00a7e8f8	mov x0,x20
00a7e8fc	bl 0x00c38a40
00a7e900	str x0,[sp, #0x98]
00a7e904	mov x0,x20
00a7e908	bl 0x00c38a40
00a7e90c	cbz x0,0x00a7ee30
00a7e910	add x8,x27,#0x3f
00a7e914	mov x23,x0
00a7e918	and x27,x8,#-0x40
00a7e91c	bl 0x00c38de0
00a7e920	mov x1,x0
00a7e924	sub x2,x27,#0x1
00a7e928	mov x0,x23
00a7e92c	str x2,[sp, #0x78]
00a7e930	bl 0x00c38fc0
00a7e934	cbz w0,0x00a7ee30
00a7e938	cbz w22,0x00a7e96c
00a7e93c	ldp x8,x9,[x21]
00a7e940	cmp x8,#0x0
00a7e944	cset w8,ne
00a7e948	cmp x9,#0x0
00a7e94c	cset w9,ne
00a7e950	eor w8,w8,w9
00a7e954	tbz w8,#0x0,0x00a7e99c
00a7e958	mov w8,#0x800
00a7e95c	b 0x00a7ecfc
00a7e960	mov w26,wzr
00a7e964	mov x28,xzr
00a7e968	b 0x00a7e864
00a7e96c	ldr w8,[sp, #0xb4]
00a7e970	tbz w8,#0x0,0x00a7e980
00a7e974	cbz x26,0x00a7ecf8
00a7e978	ldr w8,[x21, #0x30]
00a7e97c	tbnz w8,#0x1f,0x00a7ecf8
00a7e980	ldr w9,[sp, #0xb4]
00a7e984	and w8,w9,#0x1
00a7e988	tbz w9,#0x1,0x00a7e9a4
00a7e98c	ldr x9,[x21, #0x10]
00a7e990	cbnz x9,0x00a7e9a4
00a7e994	mov w8,#0x400
00a7e998	b 0x00a7ecfc
00a7e99c	ldr w8,[sp, #0xb4]
00a7e9a0	and w8,w8,#0x1
00a7e9a4	str x23,[sp, #0x40]
00a7e9a8	cbnz w8,0x00a7ea44
00a7e9ac	ldr x8,[x21]
00a7e9b0	cbz x8,0x00a7ea44
00a7e9b4	ldr x26,[x21, #0x8]
00a7e9b8	mov x27,x8
00a7e9bc	bl 0x00c38f80
00a7e9c0	mov x28,x0
00a7e9c4	cbz x0,0x00a7edf0
00a7e9c8	mov x0,x28
00a7e9cc	mov x1,x27
00a7e9d0	mov x2,x20
00a7e9d4	bl 0x00c38f90
00a7e9d8	cbz w0,0x00a7edf0
00a7e9dc	cbz w22,0x00a7ed0c
00a7e9e0	bl 0x00c38de0
00a7e9e4	ldr x25,[sp, #0x40]
00a7e9e8	mov x2,x0
00a7e9ec	mov x1,x27
00a7e9f0	mov x0,x25
00a7e9f4	bl 0x00c38880
00a7e9f8	cbz w0,0x00a7edf0
00a7e9fc	ldr x23,[sp, #0x80]
00a7ea00	mov x1,xzr
00a7ea04	mov x2,x25
00a7ea08	mov x3,x26
00a7ea0c	mov x0,x23
00a7ea10	mov x4,x20
00a7ea14	bl 0x00c38ab0
00a7ea18	cbz w0,0x00a7edf0
00a7ea1c	ldp x2,x3,[sp, #0x90]
00a7ea20	add x7,sp,#0xc0
00a7ea24	mov x0,x20
00a7ea28	mov x1,x28
00a7ea2c	mov x4,x27
00a7ea30	mov x5,x23
00a7ea34	mov x6,x25
00a7ea38	bl 0x00a7e5fc
00a7ea3c	cbnz w0,0x00a7ed38
00a7ea40	b 0x00a7edf0
00a7ea44	sub x8,x24,#0x1
00a7ea48	ldr x14,[sp, #0x78]
00a7ea4c	str x8,[sp, #0x68]
00a7ea50	sxtw x8,w24
00a7ea54	lsl w9,w27,#0x2
00a7ea58	str x8,[sp, #0x70]
00a7ea5c	ubfx x10,x28,#0x3,#0x20
00a7ea60	orr x8,xzr,#-0x3333333333333334
00a7ea64	ubfx x11,x28,#0x3,#0x5
00a7ea68	sub w9,w9,#0x1
00a7ea6c	movk x8,#0xcccd
00a7ea70	sub x12,x29,#0x98
00a7ea74	str w9,[sp, #0x3c]
00a7ea78	sub x9,x10,x11
00a7ea7c	cmp x26,#0x0
00a7ea80	sub x13,x29,#0xd8
00a7ea84	umulh x8,x14,x8
00a7ea88	stp x11,x9,[sp, #0x58]
00a7ea8c	add x9,x12,#0x10
00a7ea90	str x27,[sp, #0x30]
00a7ea94	add x27,sp,#0xc8
00a7ea98	cset w23,eq
00a7ea9c	str x9,[sp, #0x50]
00a7eaa0	add x9,x13,#0x10
00a7eaa4	lsr x8,x8,#0x7
00a7eaa8	str wzr,[sp, #0xa4]
00a7eaac	str x10,[sp, #0x78]
00a7eab0	str x9,[sp, #0x48]
00a7eab4	str x8,[sp, #0x28]
00a7eab8	mov x0,x20
00a7eabc	bl 0x00c38aa0
00a7eac0	ldr x28,[sp, #0xb8]
00a7eac4	mov x26,x0
00a7eac8	ldr w2,[sp, #0xa4]
00a7eacc	mov x0,x28
00a7ead0	mov w1,wzr
00a7ead4	bl 0x00c39100
00a7ead8	cbz w0,0x00a7ee30
00a7eadc	cbz w23,0x00a7eafc
00a7eae0	add x1,sp,#0xe8
00a7eae4	mov x0,x26
00a7eae8	mov x2,x24
00a7eaec	mov w3,wzr
00a7eaf0	bl 0x00c347b0
00a7eaf4	cmp w0,#0x1
00a7eaf8	b.lt 0x00a7ee30
00a7eafc	ldr w8,[sp, #0xa4]
00a7eb00	add x0,sp,#0xc8
00a7eb04	add x1,sp,#0xe8
00a7eb08	mov x2,x24
00a7eb0c	add w8,w8,#0x1
00a7eb10	str w8,[sp, #0xa4]
00a7eb14	bl 0x00c2ffd0
00a7eb18	sub x0,x29,#0x98
00a7eb1c	add x1,sp,#0xe8
00a7eb20	mov x2,x24
00a7eb24	bl 0x00c2ffd0
00a7eb28	ldr x8,[sp, #0x70]
00a7eb2c	subs x9,x8,#0x1
00a7eb30	b.lt 0x00a7eb50
00a7eb34	add x8,x27,x8
00a7eb38	ldurb w10,[x8, #-0x1]
00a7eb3c	add w10,w10,#0x1
00a7eb40	tst w10,#0xff
00a7eb44	sturb w10,[x8, #-0x1]
00a7eb48	mov x8,x9
00a7eb4c	b.eq 0x00a7eb2c
00a7eb50	add x0,sp,#0xe8
00a7eb54	sub x2,x29,#0xd8
00a7eb58	mov x1,x24
00a7eb5c	mov x3,xzr
00a7eb60	mov x4,x19
00a7eb64	mov x5,xzr
00a7eb68	bl 0x00c370c0
00a7eb6c	cbz w0,0x00a7ee30
00a7eb70	add x0,sp,#0xc8
00a7eb74	sub x2,x29,#0x98
00a7eb78	mov x1,x24
00a7eb7c	mov x3,xzr
00a7eb80	mov x4,x19
00a7eb84	mov x5,xzr
00a7eb88	bl 0x00c370c0
00a7eb8c	cbz w0,0x00a7ee30
00a7eb90	cmp w24,#0x1
00a7eb94	b.lt 0x00a7ec0c
00a7eb98	ldr x8,[sp, #0x78]
00a7eb9c	mov x10,xzr
00a7eba0	cmp x8,#0x20
00a7eba4	b.cc 0x00a7ebdc
00a7eba8	ldr x8,[sp, #0x60]
00a7ebac	ldp x9,x10,[sp, #0x48]
00a7ebb0	ldp q0,q1,[x10, #-0x10]
00a7ebb4	ldp q2,q3,[x9, #-0x10]
00a7ebb8	add x10,x10,#0x20
00a7ebbc	subs x8,x8,#0x20
00a7ebc0	eor v0.16B,v2.16B,v0.16B
00a7ebc4	eor v1.16B,v3.16B,v1.16B
00a7ebc8	stp q0,q1,[x9, #-0x10]
00a7ebcc	add x9,x9,#0x20
00a7ebd0	b.ne 0x00a7ebb0
00a7ebd4	ldp x8,x10,[sp, #0x58]
00a7ebd8	cbz x8,0x00a7ec0c
00a7ebdc	ldr x8,[sp, #0x78]
00a7ebe0	sub x9,x29,#0xd8
00a7ebe4	sub x11,x29,#0x98
00a7ebe8	add x9,x9,x10
00a7ebec	sub x8,x8,x10
00a7ebf0	add x10,x11,x10
00a7ebf4	ldrb w11,[x10], #0x1
00a7ebf8	ldrb w12,[x9]
00a7ebfc	subs x8,x8,#0x1
00a7ec00	eor w11,w12,w11
00a7ec04	strb w11,[x9], #0x1
00a7ec08	b.ne 0x00a7ebf4
00a7ec0c	ldurb w8,[x29, #-0xd8]
00a7ec10	ldr x9,[sp, #0x68]
00a7ec14	sub x10,x29,#0xd8
00a7ec18	ldr x2,[sp, #0xa8]
00a7ec1c	orr w8,w8,#0x80
00a7ec20	sturb w8,[x29, #-0xd8]
00a7ec24	ldrb w8,[x10, x9]
00a7ec28	sub x0,x29,#0xd8
00a7ec2c	mov w1,w24
00a7ec30	orr w8,w8,#0x1
00a7ec34	strb w8,[x10, x9]
00a7ec38	bl 0x00c36970
00a7ec3c	cbz x0,0x00a7ee30
00a7ec40	ldr x0,[sp, #0xa8]
00a7ec44	mov x1,x20
00a7ec48	mov x2,x28
00a7ec4c	bl 0x00c39110
00a7ec50	cmp w0,#0x0
00a7ec54	b.gt 0x00a7ec64
00a7ec58	mov w23,#0x1
00a7ec5c	cbz w0,0x00a7eac8
00a7ec60	b 0x00a7ee30
00a7ec64	mov w1,#0x2
00a7ec68	mov x0,x28
00a7ec6c	mov w2,wzr
00a7ec70	bl 0x00c39100
00a7ec74	cbz w0,0x00a7ee30
00a7ec78	orr w1,wzr,#0x3
00a7ec7c	mov x0,x28
00a7ec80	mov w2,wzr
00a7ec84	bl 0x00c39100
00a7ec88	cbz w0,0x00a7ee30
00a7ec8c	ldr w26,[sp, #0x3c]
00a7ec90	cbnz w22,0x00a7eca4
00a7ec94	ldr w26,[x21, #0x30]
00a7ec98	ldr w8,[sp, #0x3c]
00a7ec9c	cmp w26,w8
00a7eca0	b.gt 0x00a7ee44
00a7eca4	add x8,sp,#0xc4
00a7eca8	stp x8,x25,[sp, #0x10]
00a7ecac	ldp x3,x8,[sp, #0x28]
00a7ecb0	ldr x6,[sp, #0xa8]
00a7ecb4	ldr x7,[sp, #0x88]
00a7ecb8	add x4,sp,#0xc8
00a7ecbc	mov x0,x20
00a7ecc0	mov x1,x19
00a7ecc4	mov w2,w26
00a7ecc8	mov x5,x24
00a7eccc	str x28,[sp, #0x8]
00a7ecd0	str w8,[sp]
00a7ecd4	bl 0x00a7e31c
00a7ecd8	cmp w0,#0x0
00a7ecdc	b.gt 0x00a7edf8
00a7ece0	mov w26,wzr
00a7ece4	mov x28,xzr
00a7ece8	cmn w0,#0x1
00a7ecec	mov w23,#0x1
00a7ecf0	b.ne 0x00a7eab8
00a7ecf4	b 0x00a7ee38
00a7ecf8	mov w8,#0x200
00a7ecfc	mov w26,wzr
00a7ed00	mov x28,xzr
00a7ed04	str w8,[x25]
00a7ed08	b 0x00a7ee38
00a7ed0c	ldr w8,[sp, #0xb4]
00a7ed10	tbz w8,#0x1,0x00a7ed38
00a7ed14	ldr x4,[x21, #0x10]
00a7ed18	ldr x5,[sp, #0x98]
00a7ed1c	mov x0,x20
00a7ed20	mov x1,x28
00a7ed24	mov x2,x27
00a7ed28	mov x3,x26
00a7ed2c	mov x6,x25
00a7ed30	bl 0x00c3dd20
00a7ed34	cbz w0,0x00a7edf0
00a7ed38	ldr x0,[sp, #0xb8]
00a7ed3c	orr w1,wzr,#0x3
00a7ed40	mov w2,#0x1
00a7ed44	bl 0x00c39100
00a7ed48	cbz w0,0x00a7edf0
00a7ed4c	cbz w22,0x00a7ede0
00a7ed50	ldr x0,[x21]
00a7ed54	cmp x27,x0
00a7ed58	b.eq 0x00a7ed6c
00a7ed5c	bl 0x00c36290
00a7ed60	mov x0,x27
00a7ed64	bl 0x00c369a0
00a7ed68	str x0,[x21]
00a7ed6c	ldr x0,[x21, #0x8]
00a7ed70	ldr x22,[sp, #0x90]
00a7ed74	cmp x26,x0
00a7ed78	b.eq 0x00a7ed8c
00a7ed7c	bl 0x00c36290
00a7ed80	mov x0,x26
00a7ed84	bl 0x00c369a0
00a7ed88	str x0,[x21, #0x8]
00a7ed8c	ldr x0,[x21, #0x10]
00a7ed90	cmp x22,x0
00a7ed94	b.eq 0x00a7edac
00a7ed98	bl 0x00c36290
00a7ed9c	mov x0,x22
00a7eda0	bl 0x00c369a0
00a7eda4	mov x22,x0
00a7eda8	str x0,[x21, #0x10]
00a7edac	ldr x8,[x21]
00a7edb0	cbz x8,0x00a7edf0
00a7edb4	ldr x8,[x21, #0x8]
00a7edb8	cbz x8,0x00a7edf0
00a7edbc	cbz x22,0x00a7edf0
00a7edc0	ldr w3,[sp, #0xc4]
00a7edc4	add x1,sp,#0xe8
00a7edc8	mov x0,x21
00a7edcc	mov x2,x24
00a7edd0	bl 0x00c39cf0
00a7edd4	cbz w0,0x00a7edf0
00a7edd8	ldr w8,[sp, #0xc0]
00a7eddc	str w8,[x21, #0x3c]
00a7ede0	ldr w8,[sp, #0xb4]
00a7ede4	ubfx w8,w8,#0x1,#0x1
00a7ede8	add w26,w8,#0x1
00a7edec	b 0x00a7ee38
00a7edf0	mov w26,wzr
00a7edf4	b 0x00a7ee38
00a7edf8	ldr x0,[sp, #0xb8]
00a7edfc	mov w1,#0x2
00a7ee00	mov w2,#0x1
00a7ee04	bl 0x00c39100
00a7ee08	cbz w0,0x00a7ee30
00a7ee0c	cbz w22,0x00a7ee4c
00a7ee10	ldr w8,[sp, #0xb4]
00a7ee14	ldr x26,[sp, #0xa8]
00a7ee18	ldr x27,[sp, #0x88]
00a7ee1c	mov x28,xzr
00a7ee20	and w8,w8,#0x3
00a7ee24	cmp w8,#0x1
00a7ee28	b.ne 0x00a7e9bc
00a7ee2c	b 0x00a7ede0
00a7ee30	mov w26,wzr
00a7ee34	mov x28,xzr
00a7ee38	mov x0,x20
00a7ee3c	bl 0x00c38a20
00a7ee40	b 0x00a7e864
00a7ee44	mov w8,#0x1000
00a7ee48	b 0x00a7ecfc
00a7ee4c	ldr w8,[sp, #0xc4]
00a7ee50	cmp w8,w26
00a7ee54	b.ne 0x00a7ee70
00a7ee58	ldr x1,[x21]
00a7ee5c	ldr x0,[sp, #0x88]
00a7ee60	bl 0x00c38cc0
00a7ee64	cbz w0,0x00a7ee10
00a7ee68	mov w8,#0x2000
00a7ee6c	b 0x00a7ecfc
00a7ee70	mov w8,#0x10000
00a7ee74	b 0x00a7ecfc
