; ossl_decoder_from_algorithm @ 00a4e650
00a4e650	str x25,[sp, #-0x50]!
00a4e654	stp x24,x23,[sp, #0x10]
00a4e658	stp x22,x21,[sp, #0x20]
00a4e65c	stp x20,x19,[sp, #0x30]
00a4e660	stp x29,x30,[sp, #0x40]
00a4e664	ldr x25,[x1, #0x10]
00a4e668	mov w23,w0
00a4e66c	mov x0,x2
00a4e670	add x29,sp,#0x40
00a4e674	mov x20,x2
00a4e678	mov x21,x1
00a4e67c	bl 0x00c3b2f0
00a4e680	adrp x1,0x2db000
00a4e684	mov x22,x0
00a4e688	add x1,x1,#0xf32
00a4e68c	mov w0,#0x80
00a4e690	orr w2,wzr,#0x1f
00a4e694	bl 0x00c34250
00a4e698	cbz x0,0x00a4e8c8
00a4e69c	mov x19,x0
00a4e6a0	bl 0x00c34d50
00a4e6a4	add x24,x19,#0x28
00a4e6a8	str x0,[x19, #0x30]
00a4e6ac	cbz x0,0x00a4e6f4
00a4e6b0	mov w8,#0x1
00a4e6b4	mov x0,x21
00a4e6b8	stlr w8,[x24]
00a4e6bc	str w23,[x19, #0x8]
00a4e6c0	bl 0x00c3b4e0
00a4e6c4	str x0,[x19, #0x10]
00a4e6c8	cbz x0,0x00a4e710
00a4e6cc	str x21,[x19, #0x18]
00a4e6d0	ldr x1,[x21, #0x8]
00a4e6d4	mov x0,x22
00a4e6d8	bl 0x00c3b660
00a4e6dc	str x0,[x19, #0x20]
00a4e6e0	cbz x0,0x00a4e800
00a4e6e4	adrp x9,0x765000
00a4e6e8	add x8,x25,#0x8
00a4e6ec	add x9,x9,#0xf90
00a4e6f0	b 0x00a4e734
00a4e6f4	ldxr w8,[x24]
00a4e6f8	subs w9,w8,#0x1
00a4e6fc	stxr w10,w9,[x24]
00a4e700	cbnz w10,0x00a4e6f4
00a4e704	b.ne 0x00a4e880
00a4e708	dmb ISHLD
00a4e70c	b 0x00a4e888
00a4e710	ldxr w9,[x24]
00a4e714	subs w8,w9,#0x1
00a4e718	stxr w10,w8,[x24]
00a4e71c	cbnz w10,0x00a4e710
00a4e720	b.ne 0x00a4e8fc
00a4e724	dmb ISHLD
00a4e728	ldr x8,[x19, #0x10]
00a4e72c	b 0x00a4e90c
00a4e730	add x8,x8,#0x10
00a4e734	ldur w10,[x8, #-0x8]
00a4e738	cmp w10,#0x14
00a4e73c	b.hi 0x00a4e730
00a4e740	ldrsw x10,[x9, x10, LSL #0x2]
00a4e744	add x10,x10,x9
00a4e748	br x10
00a4e74c	ldr x10,[x19, #0x38]
00a4e750	cbnz x10,0x00a4e730
00a4e754	ldr x10,[x8], #0x10
00a4e758	str x10,[x19, #0x38]
00a4e75c	b 0x00a4e734
00a4e760	ldr x10,[x19, #0x40]
00a4e764	cbnz x10,0x00a4e730
00a4e768	ldr x10,[x8], #0x10
00a4e76c	str x10,[x19, #0x40]
00a4e770	b 0x00a4e734
00a4e774	ldr x10,[x19, #0x48]
00a4e778	cbnz x10,0x00a4e730
00a4e77c	ldr x10,[x8], #0x10
00a4e780	str x10,[x19, #0x48]
00a4e784	b 0x00a4e734
00a4e788	ldr x10,[x19, #0x50]
00a4e78c	cbnz x10,0x00a4e730
00a4e790	ldr x10,[x8], #0x10
00a4e794	str x10,[x19, #0x50]
00a4e798	b 0x00a4e734
00a4e79c	ldr x10,[x19, #0x58]
00a4e7a0	cbnz x10,0x00a4e730
00a4e7a4	ldr x10,[x8], #0x10
00a4e7a8	str x10,[x19, #0x58]
00a4e7ac	b 0x00a4e734
00a4e7b0	ldr x10,[x19, #0x60]
00a4e7b4	cbnz x10,0x00a4e730
00a4e7b8	ldr x10,[x8], #0x10
00a4e7bc	str x10,[x19, #0x60]
00a4e7c0	b 0x00a4e734
00a4e7c4	ldr x10,[x19, #0x68]
00a4e7c8	cbnz x10,0x00a4e730
00a4e7cc	ldr x10,[x8], #0x10
00a4e7d0	str x10,[x19, #0x68]
00a4e7d4	b 0x00a4e734
00a4e7d8	ldr x10,[x19, #0x70]
00a4e7dc	cbnz x10,0x00a4e730
00a4e7e0	ldr x10,[x8], #0x10
00a4e7e4	str x10,[x19, #0x70]
00a4e7e8	b 0x00a4e734
00a4e7ec	ldr x10,[x19, #0x78]
00a4e7f0	cbnz x10,0x00a4e730
00a4e7f4	ldr x10,[x8]
00a4e7f8	str x10,[x19, #0x78]
00a4e7fc	b 0x00a4e730
00a4e800	ldxr w8,[x24]
00a4e804	subs w9,w8,#0x1
00a4e808	stxr w10,w9,[x24]
00a4e80c	cbnz w10,0x00a4e800
00a4e810	b.ne 0x00a4e860
00a4e814	dmb ISHLD
00a4e818	b 0x00a4e86c
00a4e81c	ldp x9,x8,[x19, #0x38]
00a4e820	cbz x9,0x00a4e968
00a4e824	cbz x8,0x00a4e96c
00a4e828	ldr x8,[x19, #0x70]
00a4e82c	cbz x8,0x00a4e96c
00a4e830	cbz x20,0x00a4e840
00a4e834	mov x0,x20
00a4e838	bl 0x00c3b6a0
00a4e83c	cbz w0,0x00a4e84c
00a4e840	mov x0,x19
00a4e844	str x20,[x19]
00a4e848	b 0x00a4e950
00a4e84c	ldxr w8,[x24]
00a4e850	subs w9,w8,#0x1
00a4e854	stxr w10,w9,[x24]
00a4e858	cbnz w10,0x00a4e84c
00a4e85c	b.eq 0x00a4e814
00a4e860	cmp w8,#0x1
00a4e864	mov x0,xzr
00a4e868	b.gt 0x00a4e950
00a4e86c	ldr x0,[x19, #0x10]
00a4e870	adrp x20,0x2db000
00a4e874	add x20,x20,#0xf32
00a4e878	mov w2,#0x3d
00a4e87c	b 0x00a4e91c
00a4e880	cmp w8,#0x1
00a4e884	b.gt 0x00a4e8c8
00a4e888	ldr x0,[x19, #0x10]
00a4e88c	adrp x20,0x2db000
00a4e890	add x20,x20,#0xf32
00a4e894	mov w2,#0x3d
00a4e898	mov x1,x20
00a4e89c	bl 0x00c32310
00a4e8a0	ldr x0,[x19, #0x20]
00a4e8a4	bl 0x00c3b670
00a4e8a8	ldr x0,[x19]
00a4e8ac	bl 0x00c3b690
00a4e8b0	ldr x0,[x19, #0x30]
00a4e8b4	bl 0x00c34d40
00a4e8b8	mov w2,#0x41
00a4e8bc	mov x0,x19
00a4e8c0	mov x1,x20
00a4e8c4	bl 0x00c32310
00a4e8c8	bl 0x00c342a0
00a4e8cc	adrp x0,0x2db000
00a4e8d0	adrp x2,0x2d1000
00a4e8d4	add x0,x0,#0xf32
00a4e8d8	add x2,x2,#0x950
00a4e8dc	mov w1,#0x22
00a4e8e0	bl 0x00c342b0
00a4e8e4	mov w1,#0x100
00a4e8e8	orr w0,wzr,#0x3c
00a4e8ec	movk w1,#0xc, LSL #16
00a4e8f0	mov x2,xzr
00a4e8f4	bl 0x00c342c0
00a4e8f8	b 0x00a4e94c
00a4e8fc	mov x8,xzr
00a4e900	cmp w9,#0x1
00a4e904	mov x0,xzr
00a4e908	b.gt 0x00a4e950
00a4e90c	adrp x20,0x2db000
00a4e910	add x20,x20,#0xf32
00a4e914	mov w2,#0x3d
00a4e918	mov x0,x8
00a4e91c	mov x1,x20
00a4e920	bl 0x00c32310
00a4e924	ldr x0,[x19, #0x20]
00a4e928	bl 0x00c3b670
00a4e92c	ldr x0,[x19]
00a4e930	bl 0x00c3b690
00a4e934	ldr x0,[x19, #0x30]
00a4e938	bl 0x00c34d40
00a4e93c	mov w2,#0x41
00a4e940	mov x0,x19
00a4e944	mov x1,x20
00a4e948	bl 0x00c32310
00a4e94c	mov x0,xzr
00a4e950	ldp x29,x30,[sp, #0x40]
00a4e954	ldp x20,x19,[sp, #0x30]
00a4e958	ldp x22,x21,[sp, #0x20]
00a4e95c	ldp x24,x23,[sp, #0x10]
00a4e960	ldr x25,[sp], #0x50
00a4e964	ret
00a4e968	cbz x8,0x00a4e828
00a4e96c	ldxr w8,[x24]
00a4e970	subs w9,w8,#0x1
00a4e974	stxr w10,w9,[x24]
00a4e978	cbnz w10,0x00a4e96c
00a4e97c	b.ne 0x00a4e988
00a4e980	dmb ISHLD
00a4e984	b 0x00a4e990
00a4e988	cmp w8,#0x1
00a4e98c	b.gt 0x00a4e9d0
00a4e990	ldr x0,[x19, #0x10]
00a4e994	adrp x20,0x2db000
00a4e998	add x20,x20,#0xf32
00a4e99c	mov w2,#0x3d
00a4e9a0	mov x1,x20
00a4e9a4	bl 0x00c32310
00a4e9a8	ldr x0,[x19, #0x20]
00a4e9ac	bl 0x00c3b670
00a4e9b0	ldr x0,[x19]
00a4e9b4	bl 0x00c3b690
00a4e9b8	ldr x0,[x19, #0x30]
00a4e9bc	bl 0x00c34d40
00a4e9c0	mov w2,#0x41
00a4e9c4	mov x0,x19
00a4e9c8	mov x1,x20
00a4e9cc	bl 0x00c32310
00a4e9d0	bl 0x00c342a0
00a4e9d4	adrp x0,0x2db000
00a4e9d8	adrp x2,0x2a5000
00a4e9dc	add x0,x0,#0xf32
00a4e9e0	add x2,x2,#0xebe
00a4e9e4	mov w1,#0x127
00a4e9e8	bl 0x00c342b0
00a4e9ec	mov w8,#0x100
00a4e9f0	movk w8,#0xc, LSL #16
00a4e9f4	add w1,w8,#0x8
00a4e9f8	orr w0,wzr,#0x3c
00a4e9fc	b 0x00a4e8f0
