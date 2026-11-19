; FUN_00b5e540 @ 00b5e540
00b5e540	sub sp,sp,#0x60
00b5e544	stp x26,x25,[sp, #0x10]
00b5e548	stp x24,x23,[sp, #0x20]
00b5e54c	stp x22,x21,[sp, #0x30]
00b5e550	stp x20,x19,[sp, #0x40]
00b5e554	stp x29,x30,[sp, #0x50]
00b5e558	mov x20,x0
00b5e55c	ldr x0,[x0, #0x10]
00b5e560	add x29,sp,#0x50
00b5e564	mov x23,x5
00b5e568	mov x22,x4
00b5e56c	mov x24,x3
00b5e570	mov x19,x2
00b5e574	mov x21,x1
00b5e578	bl 0x00c3fab0
00b5e57c	ldr x8,[x20, #0x20]
00b5e580	mov w25,w0
00b5e584	cbz x8,0x00b5e5e8
00b5e588	mov x0,x8
00b5e58c	bl 0x00c34c20
00b5e590	sxtw x26,w0
00b5e594	bl 0x00c41000
00b5e598	cbz w0,0x00b5e6ec
00b5e59c	sxtw x25,w25
00b5e5a0	cbz x21,0x00b5e5f8
00b5e5a4	cmp x25,x24
00b5e5a8	b.ls 0x00b5e604
00b5e5ac	bl 0x00c342a0
00b5e5b0	adrp x0,0x2a3000
00b5e5b4	adrp x2,0x2b8000
00b5e5b8	add x0,x0,#0x265
00b5e5bc	add x2,x2,#0xb4a
00b5e5c0	mov w1,#0x213
00b5e5c4	bl 0x00c342b0
00b5e5c8	adrp x2,0x2c0000
00b5e5cc	add x2,x2,#0x989
00b5e5d0	mov w0,#0x39
00b5e5d4	mov w1,#0xb3
00b5e5d8	mov x3,x24
00b5e5dc	mov x4,x25
00b5e5e0	bl 0x00c342c0
00b5e5e4	b 0x00b5e6e8
00b5e5e8	mov x26,xzr
00b5e5ec	bl 0x00c41000
00b5e5f0	cbnz w0,0x00b5e59c
00b5e5f4	b 0x00b5e6ec
00b5e5f8	str x25,[x19]
00b5e5fc	mov w0,#0x1
00b5e600	b 0x00b5e6ec
00b5e604	cbz x26,0x00b5e68c
00b5e608	cmp x26,x23
00b5e60c	b.ne 0x00b5e6bc
00b5e610	ldr x0,[x20, #0x20]
00b5e614	adrp x1,0x2ac000
00b5e618	add x1,x1,#0x3ff
00b5e61c	bl 0x00c34610
00b5e620	cbz w0,0x00b5e708
00b5e624	ldr w8,[x20, #0x68]
00b5e628	cmp w8,#0x1
00b5e62c	b.ne 0x00b5e77c
00b5e630	ldr x5,[x20, #0x10]
00b5e634	add x4,sp,#0xc
00b5e638	mov w0,wzr
00b5e63c	mov x1,x22
00b5e640	mov w2,w23
00b5e644	mov x3,x21
00b5e648	bl 0x00c40000
00b5e64c	cmp w0,#0x0
00b5e650	b.le 0x00b5e7a4
00b5e654	ldr w21,[sp, #0xc]
00b5e658	cmp w21,#0x0
00b5e65c	b.gt 0x00b5e6b0
00b5e660	bl 0x00c342a0
00b5e664	adrp x0,0x2a3000
00b5e668	adrp x2,0x2b8000
00b5e66c	add x0,x0,#0x265
00b5e670	add x2,x2,#0xb4a
00b5e674	mov w1,#0x28c
00b5e678	bl 0x00c342b0
00b5e67c	mov w1,#0x4
00b5e680	mov w0,#0x39
00b5e684	movk w1,#0x8, LSL #16
00b5e688	b 0x00b5e6e0
00b5e68c	ldr x3,[x20, #0x10]
00b5e690	ldr w4,[x20, #0x68]
00b5e694	mov w0,w23
00b5e698	mov x1,x22
00b5e69c	mov x2,x21
00b5e6a0	bl 0x00c3fde0
00b5e6a4	mov w21,w0
00b5e6a8	cmp w21,#0x0
00b5e6ac	b.le 0x00b5e660
00b5e6b0	sxtw x8,w21
00b5e6b4	str x8,[x19]
00b5e6b8	b 0x00b5e5fc
00b5e6bc	bl 0x00c342a0
00b5e6c0	adrp x0,0x2a3000
00b5e6c4	adrp x2,0x2b8000
00b5e6c8	add x0,x0,#0x265
00b5e6cc	add x2,x2,#0xb4a
00b5e6d0	mov w1,#0x21a
00b5e6d4	bl 0x00c342b0
00b5e6d8	mov w0,#0x39
00b5e6dc	mov w1,#0xa6
00b5e6e0	mov x2,xzr
00b5e6e4	bl 0x00c342c0
00b5e6e8	mov w0,wzr
00b5e6ec	ldp x29,x30,[sp, #0x50]
00b5e6f0	ldp x20,x19,[sp, #0x40]
00b5e6f4	ldp x22,x21,[sp, #0x30]
00b5e6f8	ldp x24,x23,[sp, #0x20]
00b5e6fc	ldp x26,x25,[sp, #0x10]
00b5e700	add sp,sp,#0x60
00b5e704	ret
00b5e708	ldr w8,[x20, #0x68]
00b5e70c	cmp w8,#0x1
00b5e710	b.eq 0x00b5e7c0
00b5e714	cmp w8,#0x6
00b5e718	b.eq 0x00b5e7f4
00b5e71c	cmp w8,#0x5
00b5e720	b.ne 0x00b5e860
00b5e724	ldr x0,[x20, #0x10]
00b5e728	bl 0x00c3fab0
00b5e72c	add x24,x23,#0x1
00b5e730	cmp x24,w0, SXTW 
00b5e734	b.ls 0x00b5e890
00b5e738	bl 0x00c342a0
00b5e73c	adrp x0,0x2a3000
00b5e740	adrp x2,0x2b8000
00b5e744	add x0,x0,#0x265
00b5e748	add x2,x2,#0xb4a
00b5e74c	mov w1,#0x235
00b5e750	bl 0x00c342b0
00b5e754	ldr x0,[x20, #0x10]
00b5e758	bl 0x00c3fab0
00b5e75c	adrp x2,0x2b4000
00b5e760	mov w3,w0
00b5e764	add x2,x2,#0xf17
00b5e768	mov w0,#0x39
00b5e76c	mov w1,#0xab
00b5e770	mov x4,x24
00b5e774	bl 0x00c342c0
00b5e778	b 0x00b5e6e8
00b5e77c	bl 0x00c342a0
00b5e780	adrp x0,0x2a3000
00b5e784	adrp x2,0x2b8000
00b5e788	add x0,x0,#0x265
00b5e78c	add x2,x2,#0xb4a
00b5e790	mov w1,#0x223
00b5e794	bl 0x00c342b0
00b5e798	adrp x2,0x2ac000
00b5e79c	add x2,x2,#0xb8a
00b5e7a0	b 0x00b5e884
00b5e7a4	bl 0x00c342a0
00b5e7a8	adrp x0,0x2a3000
00b5e7ac	adrp x2,0x2b8000
00b5e7b0	add x0,x0,#0x265
00b5e7b4	add x2,x2,#0xb4a
00b5e7b8	mov w1,#0x22b
00b5e7bc	b 0x00b5e678
00b5e7c0	ldr w0,[x20, #0x30]
00b5e7c4	ldr x5,[x20, #0x10]
00b5e7c8	add x4,sp,#0x8
00b5e7cc	mov x1,x22
00b5e7d0	mov w2,w23
00b5e7d4	mov x3,x21
00b5e7d8	bl 0x00c3fff0
00b5e7dc	cmp w0,#0x1
00b5e7e0	b.lt 0x00b5e8ec
00b5e7e4	ldr w21,[sp, #0x8]
00b5e7e8	cmp w21,#0x0
00b5e7ec	b.gt 0x00b5e6b0
00b5e7f0	b 0x00b5e660
00b5e7f4	ldr w23,[x20, #0xb4]
00b5e7f8	cmn w23,#0x1
00b5e7fc	b.eq 0x00b5e954
00b5e800	ldr w8,[x20, #0xb0]
00b5e804	cmn w8,#0x1
00b5e808	b.ne 0x00b5e90c
00b5e80c	ldr x0,[x20, #0x20]
00b5e810	bl 0x00c34c20
00b5e814	cmp w23,w0
00b5e818	b.le 0x00b5e908
00b5e81c	bl 0x00c342a0
00b5e820	adrp x0,0x2a3000
00b5e824	adrp x2,0x2b8000
00b5e828	add x0,x0,#0x265
00b5e82c	add x2,x2,#0xb4a
00b5e830	mov w1,#0x259
00b5e834	bl 0x00c342b0
00b5e838	ldr x0,[x20, #0x20]
00b5e83c	ldr w19,[x20, #0xb4]
00b5e840	bl 0x00c34c20
00b5e844	adrp x2,0x2d4000
00b5e848	mov w4,w0
00b5e84c	add x2,x2,#0x8d9
00b5e850	mov w0,#0x39
00b5e854	mov w1,#0xac
00b5e858	mov w3,w19
00b5e85c	b 0x00b5e94c
00b5e860	bl 0x00c342a0
00b5e864	adrp x0,0x2a3000
00b5e868	adrp x2,0x2b8000
00b5e86c	add x0,x0,#0x265
00b5e870	add x2,x2,#0xb4a
00b5e874	mov w1,#0x27f
00b5e878	bl 0x00c342b0
00b5e87c	adrp x2,0x2b6000
00b5e880	add x2,x2,#0xa2c
00b5e884	mov w0,#0x39
00b5e888	mov w1,#0xa8
00b5e88c	b 0x00b5e6e4
00b5e890	ldr x0,[x20, #0xb8]
00b5e894	cbnz x0,0x00b5e8bc
00b5e898	ldr x0,[x20, #0x10]
00b5e89c	bl 0x00c3fab0
00b5e8a0	adrp x1,0x2a3000
00b5e8a4	sxtw x0,w0
00b5e8a8	add x1,x1,#0x265
00b5e8ac	mov w2,#0x1e7
00b5e8b0	bl 0x00c32320
00b5e8b4	str x0,[x20, #0xb8]
00b5e8b8	cbz x0,0x00b5ea20
00b5e8bc	mov x1,x22
00b5e8c0	mov x2,x23
00b5e8c4	bl 0x00c2ffd0
00b5e8c8	ldr w0,[x20, #0x30]
00b5e8cc	bl 0x00c3ffd0
00b5e8d0	ldr x8,[x20, #0xb8]
00b5e8d4	mov w4,#0x5
00b5e8d8	strb w0,[x8, x23]
00b5e8dc	ldr x1,[x20, #0xb8]
00b5e8e0	ldr x3,[x20, #0x10]
00b5e8e4	mov w0,w24
00b5e8e8	b 0x00b5e9b4
00b5e8ec	bl 0x00c342a0
00b5e8f0	adrp x0,0x2a3000
00b5e8f4	adrp x2,0x2b8000
00b5e8f8	add x0,x0,#0x265
00b5e8fc	add x2,x2,#0xb4a
00b5e900	mov w1,#0x24c
00b5e904	b 0x00b5e678
00b5e908	ldr w8,[x20, #0xb0]
00b5e90c	tbnz w8,#0x1f,0x00b5e954
00b5e910	ldr w9,[x20, #0xb4]
00b5e914	cmp w8,w9
00b5e918	b.ge 0x00b5e954
00b5e91c	bl 0x00c342a0
00b5e920	adrp x0,0x2a3000
00b5e924	adrp x2,0x2b8000
00b5e928	add x0,x0,#0x265
00b5e92c	add x2,x2,#0xb4a
00b5e930	mov w1,#0x265
00b5e934	bl 0x00c342b0
00b5e938	ldp w4,w3,[x20, #0xb0]
00b5e93c	adrp x2,0x2a1000
00b5e940	add x2,x2,#0xbd
00b5e944	mov w0,#0x39
00b5e948	mov w1,#0xac
00b5e94c	bl 0x00c342c0
00b5e950	b 0x00b5e6e8
00b5e954	ldr x1,[x20, #0xb8]
00b5e958	cbnz x1,0x00b5e984
00b5e95c	ldr x0,[x20, #0x10]
00b5e960	bl 0x00c3fab0
00b5e964	adrp x1,0x2a3000
00b5e968	sxtw x0,w0
00b5e96c	add x1,x1,#0x265
00b5e970	mov w2,#0x1e7
00b5e974	bl 0x00c32320
00b5e978	mov x1,x0
00b5e97c	str x0,[x20, #0xb8]
00b5e980	cbz x0,0x00b5ea04
00b5e984	ldr x0,[x20, #0x10]
00b5e988	ldr x3,[x20, #0x20]
00b5e98c	ldr x4,[x20, #0x70]
00b5e990	ldr w5,[x20, #0xb0]
00b5e994	mov x2,x22
00b5e998	bl 0x00c3ffe0
00b5e99c	cbz w0,0x00b5e9e8
00b5e9a0	ldr x0,[x20, #0x10]
00b5e9a4	bl 0x00c3fab0
00b5e9a8	ldr x1,[x20, #0xb8]
00b5e9ac	ldr x3,[x20, #0x10]
00b5e9b0	orr w4,wzr,#0x3
00b5e9b4	mov x2,x21
00b5e9b8	bl 0x00c3fde0
00b5e9bc	ldr x22,[x20, #0xb8]
00b5e9c0	mov w21,w0
00b5e9c4	cbz x22,0x00b5e6a8
00b5e9c8	ldr x0,[x20, #0x10]
00b5e9cc	bl 0x00c3fab0
00b5e9d0	sxtw x1,w0
00b5e9d4	mov x0,x22
00b5e9d8	bl 0x00c34750
00b5e9dc	cmp w21,#0x0
00b5e9e0	b.gt 0x00b5e6b0
00b5e9e4	b 0x00b5e660
00b5e9e8	bl 0x00c342a0
00b5e9ec	adrp x0,0x2a3000
00b5e9f0	adrp x2,0x2b8000
00b5e9f4	add x0,x0,#0x265
00b5e9f8	add x2,x2,#0xb4a
00b5e9fc	mov w1,#0x276
00b5ea00	b 0x00b5e678
00b5ea04	bl 0x00c342a0
00b5ea08	adrp x0,0x2a3000
00b5ea0c	adrp x2,0x2c2000
00b5ea10	add x0,x0,#0x265
00b5ea14	add x2,x2,#0x3a7
00b5ea18	mov w1,#0x1e8
00b5ea1c	b 0x00b5ea68
00b5ea20	bl 0x00c342a0
00b5ea24	adrp x19,0x2a3000
00b5ea28	add x19,x19,#0x265
00b5ea2c	adrp x2,0x2c2000
00b5ea30	add x2,x2,#0x3a7
00b5ea34	mov w1,#0x1e8
00b5ea38	mov x0,x19
00b5ea3c	bl 0x00c342b0
00b5ea40	mov w1,#0x100
00b5ea44	mov w0,#0x39
00b5ea48	movk w1,#0xc, LSL #16
00b5ea4c	mov x2,xzr
00b5ea50	bl 0x00c342c0
00b5ea54	bl 0x00c342a0
00b5ea58	adrp x2,0x2b8000
00b5ea5c	add x2,x2,#0xb4a
00b5ea60	mov w1,#0x23b
00b5ea64	mov x0,x19
00b5ea68	bl 0x00c342b0
00b5ea6c	mov w1,#0x100
00b5ea70	mov w0,#0x39
00b5ea74	movk w1,#0xc, LSL #16
00b5ea78	b 0x00b5e6e0
