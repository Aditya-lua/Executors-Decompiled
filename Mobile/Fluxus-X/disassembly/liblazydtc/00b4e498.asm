; FUN_00b4e498 @ 00b4e498
00b4e498	stp x22,x21,[sp, #-0x30]!
00b4e49c	stp x20,x19,[sp, #0x10]
00b4e4a0	mov x20,x1
00b4e4a4	adrp x1,0x2ab000
00b4e4a8	mov x19,x0
00b4e4ac	add x1,x1,#0xf0e
00b4e4b0	mov x0,x20
00b4e4b4	stp x29,x30,[sp, #0x20]
00b4e4b8	add x29,sp,#0x20
00b4e4bc	bl 0x00c36530
00b4e4c0	cbz x0,0x00b4e4d0
00b4e4c4	add x1,x19,#0x7c
00b4e4c8	bl 0x00c36510
00b4e4cc	cbz w0,0x00b4e890
00b4e4d0	adrp x1,0x2a2000
00b4e4d4	add x1,x1,#0x238
00b4e4d8	mov x0,x20
00b4e4dc	bl 0x00c36530
00b4e4e0	cbz x0,0x00b4e528
00b4e4e4	ldr w8,[x0, #0x8]
00b4e4e8	mov x22,x0
00b4e4ec	mov w21,wzr
00b4e4f0	cmp w8,#0x4
00b4e4f4	b.ne 0x00b4e894
00b4e4f8	ldr x0,[x19, #0x8]
00b4e4fc	adrp x21,0x2c6000
00b4e500	add x21,x21,#0x737
00b4e504	mov w2,#0x455
00b4e508	mov x1,x21
00b4e50c	bl 0x00c32310
00b4e510	ldr x0,[x22, #0x10]
00b4e514	mov w2,#0x455
00b4e518	mov x1,x21
00b4e51c	bl 0x00c34600
00b4e520	str x0,[x19, #0x8]
00b4e524	cbz x0,0x00b4e890
00b4e528	adrp x1,0x2a0000
00b4e52c	add x1,x1,#0x20
00b4e530	mov x0,x20
00b4e534	bl 0x00c36530
00b4e538	cbz x0,0x00b4e580
00b4e53c	ldr w8,[x0, #0x8]
00b4e540	mov x22,x0
00b4e544	mov w21,wzr
00b4e548	cmp w8,#0x4
00b4e54c	b.ne 0x00b4e894
00b4e550	ldr x0,[x19, #0x28]
00b4e554	adrp x21,0x2c6000
00b4e558	add x21,x21,#0x737
00b4e55c	mov w2,#0x456
00b4e560	mov x1,x21
00b4e564	bl 0x00c32310
00b4e568	ldr x0,[x22, #0x10]
00b4e56c	mov w2,#0x456
00b4e570	mov x1,x21
00b4e574	bl 0x00c34600
00b4e578	str x0,[x19, #0x28]
00b4e57c	cbz x0,0x00b4e890
00b4e580	adrp x1,0x2a3000
00b4e584	add x1,x1,#0xf03
00b4e588	mov x0,x20
00b4e58c	bl 0x00c36530
00b4e590	cbz x0,0x00b4e5d8
00b4e594	ldr w8,[x0, #0x8]
00b4e598	mov x22,x0
00b4e59c	mov w21,wzr
00b4e5a0	cmp w8,#0x4
00b4e5a4	b.ne 0x00b4e894
00b4e5a8	ldr x0,[x19, #0x10]
00b4e5ac	adrp x21,0x2c6000
00b4e5b0	add x21,x21,#0x737
00b4e5b4	mov w2,#0x457
00b4e5b8	mov x1,x21
00b4e5bc	bl 0x00c32310
00b4e5c0	ldr x0,[x22, #0x10]
00b4e5c4	mov w2,#0x457
00b4e5c8	mov x1,x21
00b4e5cc	bl 0x00c34600
00b4e5d0	str x0,[x19, #0x10]
00b4e5d4	cbz x0,0x00b4e890
00b4e5d8	adrp x1,0x2cb000
00b4e5dc	add x1,x1,#0x7b8
00b4e5e0	mov x0,x20
00b4e5e4	bl 0x00c36530
00b4e5e8	cbz x0,0x00b4e630
00b4e5ec	ldr w8,[x0, #0x8]
00b4e5f0	mov x22,x0
00b4e5f4	mov w21,wzr
00b4e5f8	cmp w8,#0x4
00b4e5fc	b.ne 0x00b4e894
00b4e600	ldr x0,[x19, #0x18]
00b4e604	adrp x21,0x2c6000
00b4e608	add x21,x21,#0x737
00b4e60c	mov w2,#0x458
00b4e610	mov x1,x21
00b4e614	bl 0x00c32310
00b4e618	ldr x0,[x22, #0x10]
00b4e61c	mov w2,#0x458
00b4e620	mov x1,x21
00b4e624	bl 0x00c34600
00b4e628	str x0,[x19, #0x18]
00b4e62c	cbz x0,0x00b4e890
00b4e630	adrp x1,0x2bf000
00b4e634	add x1,x1,#0xb68
00b4e638	mov x0,x20
00b4e63c	bl 0x00c36530
00b4e640	cbz x0,0x00b4e688
00b4e644	ldr w8,[x0, #0x8]
00b4e648	mov x22,x0
00b4e64c	mov w21,wzr
00b4e650	cmp w8,#0x4
00b4e654	b.ne 0x00b4e894
00b4e658	ldr x0,[x19, #0x20]
00b4e65c	adrp x21,0x2c6000
00b4e660	add x21,x21,#0x737
00b4e664	mov w2,#0x459
00b4e668	mov x1,x21
00b4e66c	bl 0x00c32310
00b4e670	ldr x0,[x22, #0x10]
00b4e674	mov w2,#0x459
00b4e678	mov x1,x21
00b4e67c	bl 0x00c34600
00b4e680	str x0,[x19, #0x20]
00b4e684	cbz x0,0x00b4e890
00b4e688	adrp x1,0x2a3000
00b4e68c	add x1,x1,#0x8e7
00b4e690	mov x0,x20
00b4e694	bl 0x00c36530
00b4e698	cbz x0,0x00b4e6c8
00b4e69c	mov x22,x19
00b4e6a0	ldr x8,[x22, #0x30]!
00b4e6a4	mov x21,x0
00b4e6a8	cbnz x8,0x00b4e6b8
00b4e6ac	bl 0x00c37710
00b4e6b0	str x0,[x22]
00b4e6b4	cbz x0,0x00b4e890
00b4e6b8	mov x0,x21
00b4e6bc	mov x1,x22
00b4e6c0	bl 0x00c39d50
00b4e6c4	cbz w0,0x00b4e890
00b4e6c8	adrp x1,0x2a3000
00b4e6cc	add x1,x1,#0x74f
00b4e6d0	mov x0,x20
00b4e6d4	bl 0x00c36530
00b4e6d8	cbz x0,0x00b4e708
00b4e6dc	mov x22,x19
00b4e6e0	ldr x8,[x22, #0x38]!
00b4e6e4	mov x21,x0
00b4e6e8	cbnz x8,0x00b4e6f8
00b4e6ec	bl 0x00c37710
00b4e6f0	str x0,[x22]
00b4e6f4	cbz x0,0x00b4e890
00b4e6f8	mov x0,x21
00b4e6fc	mov x1,x22
00b4e700	bl 0x00c39d50
00b4e704	cbz w0,0x00b4e890
00b4e708	adrp x1,0x2ad000
00b4e70c	add x1,x1,#0xabd
00b4e710	mov x0,x20
00b4e714	bl 0x00c36530
00b4e718	cbz x0,0x00b4e748
00b4e71c	mov x22,x19
00b4e720	ldr x8,[x22, #0x40]!
00b4e724	mov x21,x0
00b4e728	cbnz x8,0x00b4e738
00b4e72c	bl 0x00c37710
00b4e730	str x0,[x22]
00b4e734	cbz x0,0x00b4e890
00b4e738	mov x0,x21
00b4e73c	mov x1,x22
00b4e740	bl 0x00c39d50
00b4e744	cbz w0,0x00b4e890
00b4e748	adrp x1,0x2bb000
00b4e74c	add x1,x1,#0xa73
00b4e750	mov x0,x20
00b4e754	bl 0x00c36530
00b4e758	cbz x0,0x00b4e788
00b4e75c	mov x22,x19
00b4e760	ldr x8,[x22, #0x48]!
00b4e764	mov x21,x0
00b4e768	cbnz x8,0x00b4e778
00b4e76c	bl 0x00c37710
00b4e770	str x0,[x22]
00b4e774	cbz x0,0x00b4e890
00b4e778	mov x0,x21
00b4e77c	mov x1,x22
00b4e780	bl 0x00c39d50
00b4e784	cbz w0,0x00b4e890
00b4e788	adrp x1,0x2ab000
00b4e78c	add x1,x1,#0xf4d
00b4e790	mov x0,x20
00b4e794	bl 0x00c36530
00b4e798	cbz x0,0x00b4e7c8
00b4e79c	mov x22,x19
00b4e7a0	ldr x8,[x22, #0x50]!
00b4e7a4	mov x21,x0
00b4e7a8	cbnz x8,0x00b4e7b8
00b4e7ac	bl 0x00c37710
00b4e7b0	str x0,[x22]
00b4e7b4	cbz x0,0x00b4e890
00b4e7b8	mov x0,x21
00b4e7bc	mov x1,x22
00b4e7c0	bl 0x00c39d50
00b4e7c4	cbz w0,0x00b4e890
00b4e7c8	adrp x1,0x2bb000
00b4e7cc	add x1,x1,#0x864
00b4e7d0	mov x0,x20
00b4e7d4	bl 0x00c36530
00b4e7d8	cbz x0,0x00b4e828
00b4e7dc	ldr w8,[x0, #0x8]
00b4e7e0	mov x22,x0
00b4e7e4	mov w21,wzr
00b4e7e8	cmp w8,#0x5
00b4e7ec	b.ne 0x00b4e894
00b4e7f0	ldr x0,[x19, #0x60]
00b4e7f4	adrp x21,0x2c6000
00b4e7f8	add x21,x21,#0x737
00b4e7fc	mov w2,#0x461
00b4e800	mov x1,x21
00b4e804	bl 0x00c32310
00b4e808	ldr x1,[x22, #0x18]
00b4e80c	mov w3,#0x461
00b4e810	mov x2,x21
00b4e814	str x1,[x19, #0x70]
00b4e818	ldr x0,[x22, #0x10]
00b4e81c	bl 0x00c345f0
00b4e820	str x0,[x19, #0x60]
00b4e824	cbz x0,0x00b4e890
00b4e828	adrp x1,0x2c5000
00b4e82c	add x1,x1,#0x89e
00b4e830	mov x0,x20
00b4e834	bl 0x00c36530
00b4e838	cbz x0,0x00b4e888
00b4e83c	ldr w8,[x0, #0x8]
00b4e840	mov x20,x0
00b4e844	mov w21,wzr
00b4e848	cmp w8,#0x5
00b4e84c	b.ne 0x00b4e894
00b4e850	ldr x0,[x19, #0x58]
00b4e854	adrp x21,0x2c6000
00b4e858	add x21,x21,#0x737
00b4e85c	mov w2,#0x463
00b4e860	mov x1,x21
00b4e864	bl 0x00c32310
00b4e868	ldr x1,[x20, #0x18]
00b4e86c	mov w3,#0x463
00b4e870	mov x2,x21
00b4e874	str x1,[x19, #0x68]
00b4e878	ldr x0,[x20, #0x10]
00b4e87c	bl 0x00c345f0
00b4e880	str x0,[x19, #0x58]
00b4e884	cbz x0,0x00b4e890
00b4e888	mov w21,#0x1
00b4e88c	b 0x00b4e894
00b4e890	mov w21,wzr
00b4e894	mov x0,xzr
00b4e898	bl 0x00c3a770
00b4e89c	ldp x29,x30,[sp, #0x20]
00b4e8a0	ldp x20,x19,[sp, #0x10]
00b4e8a4	mov w0,w21
00b4e8a8	ldp x22,x21,[sp], #0x30
00b4e8ac	ret
