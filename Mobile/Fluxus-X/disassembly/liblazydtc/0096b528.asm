; FUN_0096b528 @ 0096b528
0096b528	sub sp,sp,#0x150
0096b52c	stp x28,x27,[sp, #0xf0]
0096b530	stp x26,x25,[sp, #0x100]
0096b534	stp x24,x23,[sp, #0x110]
0096b538	stp x22,x21,[sp, #0x120]
0096b53c	stp x20,x19,[sp, #0x130]
0096b540	stp x29,x30,[sp, #0x140]
0096b544	add x29,sp,#0x140
0096b548	mrs x20,tpidr_el0
0096b54c	ldr x8,[x20, #0x28]
0096b550	mov x19,x0
0096b554	mov x0,x1
0096b558	stur x8,[x29, #-0x60]
0096b55c	bl 0x00c32930
0096b560	mov x21,x0
0096b564	cbz x0,0x0096c17c
0096b568	mov x0,x21
0096b56c	bl 0x00c325e0
0096b570	mov w25,w0
0096b574	mov x0,x19
0096b578	mov w1,w25
0096b57c	bl 0x00968f18
0096b580	cbnz w0,0x0096c180
0096b584	bl 0x00c32280
0096b588	bl 0x00c32240
0096b58c	mov x22,x0
0096b590	cbz x0,0x0096c17c
0096b594	cmp w25,#0x1
0096b598	str x20,[sp, #0x8]
0096b59c	b.lt 0x0096c168
0096b5a0	adrp x28,0x2d7000
0096b5a4	mov w23,wzr
0096b5a8	add x8,x19,#0xa82
0096b5ac	add x28,x28,#0x4c4
0096b5b0	stp x8,x21,[sp, #0x18]
0096b5b4	str w25,[sp, #0x14]
0096b5b8	mov x0,x21
0096b5bc	mov w1,w23
0096b5c0	bl 0x00c32610
0096b5c4	mov x26,x0
0096b5c8	str xzr,[sp, #0x48]
0096b5cc	bl 0x00c32d20
0096b5d0	mov w3,#0x31f
0096b5d4	mov x1,x0
0096b5d8	movk w3,#0x82, LSL #16
0096b5dc	mov x0,x22
0096b5e0	mov w2,wzr
0096b5e4	bl 0x00c32bd0
0096b5e8	orr w1,wzr,#0x3
0096b5ec	add x3,sp,#0x50
0096b5f0	mov x0,x22
0096b5f4	mov x2,xzr
0096b5f8	bl 0x00c321a0
0096b5fc	ldr x3,[sp, #0x50]
0096b600	adrp x2,0x2d9000
0096b604	mov x4,x0
0096b608	mov x0,x19
0096b60c	mov w1,w23
0096b610	add x2,x2,#0x2dd
0096b614	bl 0x00968fcc
0096b618	mov w1,#0x1
0096b61c	mov x0,x22
0096b620	mov x2,xzr
0096b624	mov x3,xzr
0096b628	bl 0x00c321a0
0096b62c	mov x0,x26
0096b630	bl 0x00c32cf0
0096b634	mov w3,#0x31f
0096b638	mov x1,x0
0096b63c	movk w3,#0x82, LSL #16
0096b640	mov x0,x22
0096b644	mov w2,wzr
0096b648	bl 0x00c32bd0
0096b64c	orr w1,wzr,#0x3
0096b650	add x3,sp,#0x50
0096b654	mov x0,x22
0096b658	mov x2,xzr
0096b65c	bl 0x00c321a0
0096b660	ldr x3,[sp, #0x50]
0096b664	adrp x2,0x2b3000
0096b668	mov x4,x0
0096b66c	mov x0,x19
0096b670	mov w1,w23
0096b674	add x2,x2,#0x97d
0096b678	bl 0x00968fcc
0096b67c	mov w1,#0x1
0096b680	mov x0,x22
0096b684	mov x2,xzr
0096b688	mov x3,xzr
0096b68c	bl 0x00c321a0
0096b690	mov x0,x26
0096b694	bl 0x00c32d30
0096b698	adrp x1,0x2c1000
0096b69c	mov x2,x0
0096b6a0	mov x0,x22
0096b6a4	add x1,x1,#0x2ec
0096b6a8	bl 0x00c32250
0096b6ac	orr w1,wzr,#0x3
0096b6b0	add x3,sp,#0x50
0096b6b4	mov x0,x22
0096b6b8	mov x2,xzr
0096b6bc	bl 0x00c321a0
0096b6c0	ldr x3,[sp, #0x50]
0096b6c4	adrp x2,0x2b3000
0096b6c8	mov x4,x0
0096b6cc	mov x0,x19
0096b6d0	mov w1,w23
0096b6d4	add x2,x2,#0x984
0096b6d8	bl 0x00968fcc
0096b6dc	mov w1,#0x1
0096b6e0	mov x0,x22
0096b6e4	mov x2,xzr
0096b6e8	mov x3,xzr
0096b6ec	bl 0x00c321a0
0096b6f0	mov x0,x26
0096b6f4	bl 0x00c32d10
0096b6f8	ldr w8,[x0, #0x4]
0096b6fc	mov x20,x0
0096b700	cmp w8,#0x102
0096b704	b.ne 0x0096b718
0096b708	adrp x1,0x2cc000
0096b70c	mov x0,x22
0096b710	add x1,x1,#0xc8b
0096b714	bl 0x00c32260
0096b718	ldr w8,[x20]
0096b71c	cmp w8,#0x1
0096b720	b.lt 0x0096b74c
0096b724	mov x21,xzr
0096b728	ldr x8,[x20, #0x8]
0096b72c	mov x0,x22
0096b730	mov x1,x28
0096b734	ldrb w2,[x8, x21]
0096b738	bl 0x00c32250
0096b73c	ldrsw x8,[x20]
0096b740	add x21,x21,#0x1
0096b744	cmp x21,x8
0096b748	b.lt 0x0096b728
0096b74c	orr w1,wzr,#0x3
0096b750	add x3,sp,#0x50
0096b754	mov x0,x22
0096b758	mov x2,xzr
0096b75c	bl 0x00c321a0
0096b760	ldr x3,[sp, #0x50]
0096b764	adrp x2,0x2c1000
0096b768	mov x4,x0
0096b76c	mov x0,x19
0096b770	mov w1,w23
0096b774	add x2,x2,#0x2f0
0096b778	bl 0x00968fcc
0096b77c	mov w1,#0x1
0096b780	mov x0,x22
0096b784	mov x2,xzr
0096b788	mov x3,xzr
0096b78c	bl 0x00c321a0
0096b790	add x0,sp,#0x48
0096b794	add x1,sp,#0x40
0096b798	mov x2,x26
0096b79c	stp xzr,xzr,[sp, #0x38]
0096b7a0	bl 0x00c32cc0
0096b7a4	ldr x3,[sp, #0x40]
0096b7a8	cbz x3,0x0096b810
0096b7ac	add x0,sp,#0x60
0096b7b0	mov x1,xzr
0096b7b4	mov x2,xzr
0096b7b8	str xzr,[sp, #0x60]
0096b7bc	bl 0x00c32b50
0096b7c0	ldr x1,[sp, #0x60]
0096b7c4	mov x0,x22
0096b7c8	bl 0x00c32da0
0096b7cc	orr w1,wzr,#0x3
0096b7d0	add x3,sp,#0x50
0096b7d4	mov x0,x22
0096b7d8	mov x2,xzr
0096b7dc	bl 0x00c321a0
0096b7e0	ldr x3,[sp, #0x50]
0096b7e4	adrp x2,0x2bd000
0096b7e8	mov x4,x0
0096b7ec	mov x0,x19
0096b7f0	mov w1,w23
0096b7f4	add x2,x2,#0x29d
0096b7f8	bl 0x00968fcc
0096b7fc	mov w1,#0x1
0096b800	mov x0,x22
0096b804	mov x2,xzr
0096b808	mov x3,xzr
0096b80c	bl 0x00c321a0
0096b810	mov x0,x26
0096b814	mov w24,w25
0096b818	bl 0x00c32cd0
0096b81c	mov x4,x0
0096b820	cbz x0,0x0096b88c
0096b824	add x0,sp,#0x38
0096b828	mov x1,xzr
0096b82c	mov x2,xzr
0096b830	mov x3,xzr
0096b834	bl 0x00c32be0
0096b838	ldr x1,[sp, #0x38]
0096b83c	cbz x1,0x0096b88c
0096b840	mov x0,x22
0096b844	bl 0x00c32da0
0096b848	orr w1,wzr,#0x3
0096b84c	add x3,sp,#0x50
0096b850	mov x0,x22
0096b854	mov x2,xzr
0096b858	bl 0x00c321a0
0096b85c	ldr x3,[sp, #0x50]
0096b860	adrp x2,0x2c7000
0096b864	mov x4,x0
0096b868	mov x0,x19
0096b86c	mov w1,w23
0096b870	add x2,x2,#0x20e
0096b874	bl 0x00968fcc
0096b878	mov w1,#0x1
0096b87c	mov x0,x22
0096b880	mov x2,xzr
0096b884	mov x3,xzr
0096b888	bl 0x00c321a0
0096b88c	mov x0,x26
0096b890	bl 0x00c32c80
0096b894	mov x27,x0
0096b898	bl 0x00c325e0
0096b89c	cmp w0,#0x1
0096b8a0	b.lt 0x0096b964
0096b8a4	mov x0,x27
0096b8a8	bl 0x00c325e0
0096b8ac	cmp w0,#0x1
0096b8b0	b.lt 0x0096b964
0096b8b4	mov w25,wzr
0096b8b8	mov x0,x27
0096b8bc	mov w1,w25
0096b8c0	bl 0x00c32610
0096b8c4	mov x20,x0
0096b8c8	bl 0x00c32280
0096b8cc	bl 0x00c32240
0096b8d0	mov x21,x0
0096b8d4	cbz x0,0x0096b964
0096b8d8	mov x0,x20
0096b8dc	bl 0x00c32b70
0096b8e0	mov x2,x0
0096b8e4	add x0,sp,#0x60
0096b8e8	mov w1,#0x80
0096b8ec	bl 0x00c32dc0
0096b8f0	mov x0,x21
0096b8f4	mov x1,x20
0096b8f8	mov x2,xzr
0096b8fc	mov w3,wzr
0096b900	bl 0x00c32b40
0096b904	cbnz w0,0x0096b91c
0096b908	mov x0,x20
0096b90c	bl 0x00c32b60
0096b910	mov x1,x0
0096b914	mov x0,x21
0096b918	bl 0x00c32150
0096b91c	mov w1,#0x73
0096b920	add x3,sp,#0x58
0096b924	mov x0,x21
0096b928	mov x2,xzr
0096b92c	bl 0x00c321a0
0096b930	ldr x8,[sp, #0x58]
0096b934	add x2,sp,#0x60
0096b938	mov x0,x19
0096b93c	mov w1,w23
0096b940	ldp x4,x3,[x8]
0096b944	bl 0x00968fcc
0096b948	mov x0,x21
0096b94c	bl 0x00c31a40
0096b950	mov x0,x27
0096b954	add w25,w25,#0x1
0096b958	bl 0x00c325e0
0096b95c	cmp w25,w0
0096b960	b.lt 0x0096b8b8
0096b964	mov x0,x26
0096b968	bl 0x00c32ca0
0096b96c	mov x1,x0
0096b970	mov x0,x22
0096b974	bl 0x00c32180
0096b978	orr w1,wzr,#0x3
0096b97c	add x3,sp,#0x50
0096b980	mov x0,x22
0096b984	mov x2,xzr
0096b988	bl 0x00c321a0
0096b98c	ldr x3,[sp, #0x50]
0096b990	adrp x2,0x2d1000
0096b994	mov x4,x0
0096b998	mov x0,x19
0096b99c	mov w1,w23
0096b9a0	add x2,x2,#0x23c
0096b9a4	bl 0x00968fcc
0096b9a8	mov w1,#0x1
0096b9ac	mov x0,x22
0096b9b0	mov x2,xzr
0096b9b4	mov x3,xzr
0096b9b8	bl 0x00c321a0
0096b9bc	mov x0,x26
0096b9c0	bl 0x00c32c90
0096b9c4	mov x1,x0
0096b9c8	mov x0,x22
0096b9cc	bl 0x00c32180
0096b9d0	orr w1,wzr,#0x3
0096b9d4	add x3,sp,#0x50
0096b9d8	mov x0,x22
0096b9dc	mov x2,xzr
0096b9e0	bl 0x00c321a0
0096b9e4	ldr x3,[sp, #0x50]
0096b9e8	adrp x2,0x2a9000
0096b9ec	mov x4,x0
0096b9f0	mov x0,x19
0096b9f4	mov w1,w23
0096b9f8	add x2,x2,#0x93d
0096b9fc	bl 0x00968fcc
0096ba00	mov w1,#0x1
0096ba04	mov x0,x22
0096ba08	mov x2,xzr
0096ba0c	mov x3,xzr
0096ba10	bl 0x00c321a0
0096ba14	mov x0,x26
0096ba18	bl 0x00c32d00
0096ba1c	mov x27,x0
0096ba20	cbz x0,0x0096ba94
0096ba24	mov x0,x27
0096ba28	bl 0x00c324b0
0096ba2c	ldr x21,[sp, #0x20]
0096ba30	cmp w0,#0x74
0096ba34	mov w25,w24
0096ba38	b.eq 0x0096bcc8
0096ba3c	adrp x24,0x29f000
0096ba40	cmp w0,#0x1c
0096ba44	add x24,x24,#0x8ab
0096ba48	b.eq 0x0096bae4
0096ba4c	cmp w0,#0x6
0096ba50	b.ne 0x0096c080
0096ba54	adrp x1,0x2a5000
0096ba58	add x2,sp,#0x40
0096ba5c	mov x0,x27
0096ba60	add x1,x1,#0x623
0096ba64	stp xzr,xzr,[sp, #0x38]
0096ba68	bl 0x00c32490
0096ba6c	adrp x1,0x2ab000
0096ba70	add x2,sp,#0x38
0096ba74	mov x0,x27
0096ba78	add x1,x1,#0x8a5
0096ba7c	bl 0x00c32490
0096ba80	ldr x0,[sp, #0x40]
0096ba84	cbz x0,0x0096bf28
0096ba88	bl 0x00c322f0
0096ba8c	mov w2,w0
0096ba90	b 0x0096bf2c
0096ba94	ldr x21,[sp, #0x20]
0096ba98	mov w25,w24
0096ba9c	adrp x24,0x29f000
0096baa0	add x24,x24,#0x8ab
0096baa4	cbz x19,0x0096c088
0096baa8	ldr x8,[sp, #0x18]
0096baac	ldrb w8,[x8, #0x3]
0096bab0	tbz w8,#0x4,0x0096c088
0096bab4	ldr x8,[x19, #0x12a0]
0096bab8	cbz x8,0x0096bac8
0096babc	ldr w8,[x8, #0x8]
0096bac0	cmp w8,#0x1
0096bac4	b.lt 0x0096c088
0096bac8	adrp x1,0x29d000
0096bacc	mov x0,x19
0096bad0	add x1,x1,#0x9cf
0096bad4	bl 0x00904c98
0096bad8	ldr x8,[sp, #0x48]
0096badc	cbnz x8,0x0096c090
0096bae0	b 0x0096c10c
0096bae4	adrp x25,0x2a3000
0096bae8	add x25,x25,#0x8e7
0096baec	add x2,sp,#0x40
0096baf0	mov x0,x27
0096baf4	mov x1,x25
0096baf8	stp xzr,xzr,[sp, #0x38]
0096bafc	stp xzr,xzr,[sp, #0x28]
0096bb00	bl 0x00c32490
0096bb04	adrp x1,0x2cf000
0096bb08	add x2,sp,#0x38
0096bb0c	mov x0,x27
0096bb10	add x1,x1,#0x3b1
0096bb14	bl 0x00c32490
0096bb18	adrp x1,0x2d9000
0096bb1c	add x2,sp,#0x30
0096bb20	mov x0,x27
0096bb24	add x1,x1,#0x2e5
0096bb28	bl 0x00c32490
0096bb2c	adrp x1,0x2ad000
0096bb30	add x2,sp,#0x28
0096bb34	mov x0,x27
0096bb38	add x1,x1,#0x463
0096bb3c	bl 0x00c32490
0096bb40	ldr x20,[sp, #0x40]
0096bb44	adrp x2,0x2ab000
0096bb48	adrp x3,0x2b3000
0096bb4c	add x0,sp,#0x60
0096bb50	mov w1,#0x20
0096bb54	add x2,x2,#0x906
0096bb58	add x3,x3,#0x98c
0096bb5c	mov x4,x25
0096bb60	bl 0x00c31b70
0096bb64	cbz x20,0x0096bb74
0096bb68	mov x0,x22
0096bb6c	mov x1,x20
0096bb70	bl 0x00c32300
0096bb74	orr w1,wzr,#0x3
0096bb78	add x3,sp,#0x58
0096bb7c	mov x0,x22
0096bb80	mov x2,xzr
0096bb84	bl 0x00c321a0
0096bb88	ldr x3,[sp, #0x58]
0096bb8c	mov x4,x0
0096bb90	add x2,sp,#0x60
0096bb94	mov x0,x19
0096bb98	mov w1,w23
0096bb9c	bl 0x00968fcc
0096bba0	mov w1,#0x1
0096bba4	mov x0,x22
0096bba8	mov x2,xzr
0096bbac	mov x3,xzr
0096bbb0	bl 0x00c321a0
0096bbb4	ldr x20,[sp, #0x38]
0096bbb8	adrp x2,0x2ab000
0096bbbc	adrp x3,0x2b3000
0096bbc0	adrp x4,0x2cf000
0096bbc4	add x0,sp,#0x60
0096bbc8	mov w1,#0x20
0096bbcc	add x2,x2,#0x906
0096bbd0	add x3,x3,#0x98c
0096bbd4	add x4,x4,#0x3b1
0096bbd8	bl 0x00c31b70
0096bbdc	cbz x20,0x0096bbec
0096bbe0	mov x0,x22
0096bbe4	mov x1,x20
0096bbe8	bl 0x00c32300
0096bbec	orr w1,wzr,#0x3
0096bbf0	add x3,sp,#0x58
0096bbf4	mov x0,x22
0096bbf8	mov x2,xzr
0096bbfc	bl 0x00c321a0
0096bc00	ldr x3,[sp, #0x58]
0096bc04	mov x4,x0
0096bc08	add x2,sp,#0x60
0096bc0c	mov x0,x19
0096bc10	mov w1,w23
0096bc14	bl 0x00968fcc
0096bc18	mov w1,#0x1
0096bc1c	mov x0,x22
0096bc20	mov x2,xzr
0096bc24	mov x3,xzr
0096bc28	bl 0x00c321a0
0096bc2c	ldr x20,[sp, #0x30]
0096bc30	adrp x2,0x2ab000
0096bc34	adrp x3,0x2b3000
0096bc38	adrp x4,0x2d9000
0096bc3c	add x0,sp,#0x60
0096bc40	mov w1,#0x20
0096bc44	add x2,x2,#0x906
0096bc48	add x3,x3,#0x98c
0096bc4c	add x4,x4,#0x2e5
0096bc50	bl 0x00c31b70
0096bc54	ldr w25,[sp, #0x14]
0096bc58	cbz x20,0x0096bc68
0096bc5c	mov x0,x22
0096bc60	mov x1,x20
0096bc64	bl 0x00c32300
0096bc68	orr w1,wzr,#0x3
0096bc6c	add x3,sp,#0x58
0096bc70	mov x0,x22
0096bc74	mov x2,xzr
0096bc78	bl 0x00c321a0
0096bc7c	ldr x3,[sp, #0x58]
0096bc80	mov x4,x0
0096bc84	add x2,sp,#0x60
0096bc88	mov x0,x19
0096bc8c	mov w1,w23
0096bc90	bl 0x00968fcc
0096bc94	mov w1,#0x1
0096bc98	mov x0,x22
0096bc9c	mov x2,xzr
0096bca0	mov x3,xzr
0096bca4	bl 0x00c321a0
0096bca8	ldr x20,[sp, #0x28]
0096bcac	adrp x2,0x2ab000
0096bcb0	adrp x3,0x2b3000
0096bcb4	add x0,sp,#0x60
0096bcb8	mov w1,#0x20
0096bcbc	add x2,x2,#0x906
0096bcc0	add x3,x3,#0x98c
0096bcc4	b 0x0096beac
0096bcc8	adrp x24,0x2a3000
0096bccc	add x24,x24,#0x8e7
0096bcd0	add x2,sp,#0x40
0096bcd4	mov x0,x27
0096bcd8	mov x1,x24
0096bcdc	stp xzr,xzr,[sp, #0x38]
0096bce0	stp xzr,xzr,[sp, #0x28]
0096bce4	bl 0x00c32490
0096bce8	adrp x1,0x2cf000
0096bcec	add x2,sp,#0x38
0096bcf0	mov x0,x27
0096bcf4	add x1,x1,#0x3b1
0096bcf8	bl 0x00c32490
0096bcfc	adrp x1,0x2d9000
0096bd00	add x2,sp,#0x30
0096bd04	mov x0,x27
0096bd08	add x1,x1,#0x2e5
0096bd0c	bl 0x00c32490
0096bd10	adrp x1,0x2ad000
0096bd14	add x2,sp,#0x28
0096bd18	mov x0,x27
0096bd1c	add x1,x1,#0x463
0096bd20	bl 0x00c32490
0096bd24	ldr x20,[sp, #0x40]
0096bd28	adrp x2,0x2ab000
0096bd2c	adrp x3,0x2c9000
0096bd30	add x0,sp,#0x60
0096bd34	mov w1,#0x20
0096bd38	add x2,x2,#0x906
0096bd3c	add x3,x3,#0x16f
0096bd40	mov x4,x24
0096bd44	bl 0x00c31b70
0096bd48	adrp x24,0x29f000
0096bd4c	add x24,x24,#0x8ab
0096bd50	cbz x20,0x0096bd60
0096bd54	mov x0,x22
0096bd58	mov x1,x20
0096bd5c	bl 0x00c32300
0096bd60	orr w1,wzr,#0x3
0096bd64	add x3,sp,#0x58
0096bd68	mov x0,x22
0096bd6c	mov x2,xzr
0096bd70	bl 0x00c321a0
0096bd74	ldr x3,[sp, #0x58]
0096bd78	mov x4,x0
0096bd7c	add x2,sp,#0x60
0096bd80	mov x0,x19
0096bd84	mov w1,w23
0096bd88	bl 0x00968fcc
0096bd8c	mov w1,#0x1
0096bd90	mov x0,x22
0096bd94	mov x2,xzr
0096bd98	mov x3,xzr
0096bd9c	bl 0x00c321a0
0096bda0	ldr x20,[sp, #0x38]
0096bda4	adrp x2,0x2ab000
0096bda8	adrp x3,0x2c9000
0096bdac	adrp x4,0x2cf000
0096bdb0	add x0,sp,#0x60
0096bdb4	mov w1,#0x20
0096bdb8	add x2,x2,#0x906
0096bdbc	add x3,x3,#0x16f
0096bdc0	add x4,x4,#0x3b1
0096bdc4	bl 0x00c31b70
0096bdc8	cbz x20,0x0096bdd8
0096bdcc	mov x0,x22
0096bdd0	mov x1,x20
0096bdd4	bl 0x00c32300
0096bdd8	orr w1,wzr,#0x3
0096bddc	add x3,sp,#0x58
0096bde0	mov x0,x22
0096bde4	mov x2,xzr
0096bde8	bl 0x00c321a0
0096bdec	ldr x3,[sp, #0x58]
0096bdf0	mov x4,x0
0096bdf4	add x2,sp,#0x60
0096bdf8	mov x0,x19
0096bdfc	mov w1,w23
0096be00	bl 0x00968fcc
0096be04	mov w1,#0x1
0096be08	mov x0,x22
0096be0c	mov x2,xzr
0096be10	mov x3,xzr
0096be14	bl 0x00c321a0
0096be18	ldr x20,[sp, #0x30]
0096be1c	adrp x2,0x2ab000
0096be20	adrp x3,0x2c9000
0096be24	adrp x4,0x2d9000
0096be28	add x0,sp,#0x60
0096be2c	mov w1,#0x20
0096be30	add x2,x2,#0x906
0096be34	add x3,x3,#0x16f
0096be38	add x4,x4,#0x2e5
0096be3c	bl 0x00c31b70
0096be40	cbz x20,0x0096be50
0096be44	mov x0,x22
0096be48	mov x1,x20
0096be4c	bl 0x00c32300
0096be50	orr w1,wzr,#0x3
0096be54	add x3,sp,#0x58
0096be58	mov x0,x22
0096be5c	mov x2,xzr
0096be60	bl 0x00c321a0
0096be64	ldr x3,[sp, #0x58]
0096be68	mov x4,x0
0096be6c	add x2,sp,#0x60
0096be70	mov x0,x19
0096be74	mov w1,w23
0096be78	bl 0x00968fcc
0096be7c	mov w1,#0x1
0096be80	mov x0,x22
0096be84	mov x2,xzr
0096be88	mov x3,xzr
0096be8c	bl 0x00c321a0
0096be90	ldr x20,[sp, #0x28]
0096be94	adrp x2,0x2ab000
0096be98	adrp x3,0x2c9000
0096be9c	add x0,sp,#0x60
0096bea0	mov w1,#0x20
0096bea4	add x2,x2,#0x906
0096bea8	add x3,x3,#0x16f
0096beac	adrp x4,0x2a9000
0096beb0	add x4,x4,#0x949
0096beb4	bl 0x00c31b70
0096beb8	cbz x20,0x0096bec8
0096bebc	mov x0,x22
0096bec0	mov x1,x20
0096bec4	bl 0x00c32300
0096bec8	orr w1,wzr,#0x3
0096becc	add x3,sp,#0x58
0096bed0	mov x0,x22
0096bed4	mov x2,xzr
0096bed8	bl 0x00c321a0
0096bedc	ldr x3,[sp, #0x58]
0096bee0	mov x4,x0
0096bee4	add x2,sp,#0x60
0096bee8	mov x0,x19
0096beec	mov w1,w23
0096bef0	bl 0x00968fcc
0096bef4	mov w1,#0x1
0096bef8	mov x0,x22
0096befc	mov x2,xzr
0096bf00	mov x3,xzr
0096bf04	bl 0x00c321a0
0096bf08	ldr x0,[sp, #0x40]
0096bf0c	bl 0x00c322e0
0096bf10	ldr x0,[sp, #0x38]
0096bf14	bl 0x00c322e0
0096bf18	ldr x0,[sp, #0x30]
0096bf1c	bl 0x00c322e0
0096bf20	ldr x0,[sp, #0x28]
0096bf24	b 0x0096c07c
0096bf28	mov w2,wzr
0096bf2c	adrp x1,0x2c6000
0096bf30	mov x0,x22
0096bf34	add x1,x1,#0xd41
0096bf38	bl 0x00c32250
0096bf3c	orr w1,wzr,#0x3
0096bf40	add x3,sp,#0x50
0096bf44	mov x0,x22
0096bf48	mov x2,xzr
0096bf4c	bl 0x00c321a0
0096bf50	ldr x3,[sp, #0x50]
0096bf54	adrp x2,0x2b5000
0096bf58	mov x4,x0
0096bf5c	mov x0,x19
0096bf60	mov w1,w23
0096bf64	add x2,x2,#0x61a
0096bf68	bl 0x00968fcc
0096bf6c	mov w1,#0x1
0096bf70	mov x0,x22
0096bf74	mov x2,xzr
0096bf78	mov x3,xzr
0096bf7c	bl 0x00c321a0
0096bf80	ldr x20,[sp, #0x40]
0096bf84	adrp x2,0x2ab000
0096bf88	adrp x3,0x2af000
0096bf8c	adrp x4,0x2a5000
0096bf90	add x0,sp,#0x60
0096bf94	mov w1,#0x20
0096bf98	add x2,x2,#0x906
0096bf9c	add x3,x3,#0x5e5
0096bfa0	add x4,x4,#0x623
0096bfa4	bl 0x00c31b70
0096bfa8	cbz x20,0x0096bfb8
0096bfac	mov x0,x22
0096bfb0	mov x1,x20
0096bfb4	bl 0x00c32300
0096bfb8	orr w1,wzr,#0x3
0096bfbc	add x3,sp,#0x58
0096bfc0	mov x0,x22
0096bfc4	mov x2,xzr
0096bfc8	bl 0x00c321a0
0096bfcc	ldr x3,[sp, #0x58]
0096bfd0	mov x4,x0
0096bfd4	add x2,sp,#0x60
0096bfd8	mov x0,x19
0096bfdc	mov w1,w23
0096bfe0	bl 0x00968fcc
0096bfe4	mov w1,#0x1
0096bfe8	mov x0,x22
0096bfec	mov x2,xzr
0096bff0	mov x3,xzr
0096bff4	bl 0x00c321a0
0096bff8	ldr x20,[sp, #0x38]
0096bffc	adrp x2,0x2ab000
0096c000	adrp x3,0x2af000
0096c004	adrp x4,0x2ab000
0096c008	add x0,sp,#0x60
0096c00c	mov w1,#0x20
0096c010	add x2,x2,#0x906
0096c014	add x3,x3,#0x5e5
0096c018	add x4,x4,#0x8a5
0096c01c	bl 0x00c31b70
0096c020	cbz x20,0x0096c030
0096c024	mov x0,x22
0096c028	mov x1,x20
0096c02c	bl 0x00c32300
0096c030	orr w1,wzr,#0x3
0096c034	add x3,sp,#0x58
0096c038	mov x0,x22
0096c03c	mov x2,xzr
0096c040	bl 0x00c321a0
0096c044	ldr x3,[sp, #0x58]
0096c048	mov x4,x0
0096c04c	add x2,sp,#0x60
0096c050	mov x0,x19
0096c054	mov w1,w23
0096c058	bl 0x00968fcc
0096c05c	mov w1,#0x1
0096c060	mov x0,x22
0096c064	mov x2,xzr
0096c068	mov x3,xzr
0096c06c	bl 0x00c321a0
0096c070	ldr x0,[sp, #0x40]
0096c074	bl 0x00c322e0
0096c078	ldr x0,[sp, #0x38]
0096c07c	bl 0x00c322e0
0096c080	mov x0,x27
0096c084	bl 0x00c32450
0096c088	ldr x8,[sp, #0x48]
0096c08c	cbz x8,0x0096c10c
0096c090	ldr w9,[x8]
0096c094	cmp w9,#0x1
0096c098	b.lt 0x0096c0c8
0096c09c	mov x20,xzr
0096c0a0	ldr x8,[x8, #0x8]
0096c0a4	mov x0,x22
0096c0a8	mov x1,x24
0096c0ac	ldrb w2,[x8, x20]
0096c0b0	bl 0x00c32250
0096c0b4	ldr x8,[sp, #0x48]
0096c0b8	add x20,x20,#0x1
0096c0bc	ldrsw x9,[x8]
0096c0c0	cmp x20,x9
0096c0c4	b.lt 0x0096c0a0
0096c0c8	orr w1,wzr,#0x3
0096c0cc	add x3,sp,#0x50
0096c0d0	mov x0,x22
0096c0d4	mov x2,xzr
0096c0d8	bl 0x00c321a0
0096c0dc	ldr x3,[sp, #0x50]
0096c0e0	adrp x2,0x2af000
0096c0e4	mov x4,x0
0096c0e8	mov x0,x19
0096c0ec	mov w1,w23
0096c0f0	add x2,x2,#0x5e9
0096c0f4	bl 0x00968fcc
0096c0f8	mov w1,#0x1
0096c0fc	mov x0,x22
0096c100	mov x2,xzr
0096c104	mov x3,xzr
0096c108	bl 0x00c321a0
0096c10c	mov x0,x22
0096c110	mov x1,x26
0096c114	bl 0x00c32660
0096c118	orr w1,wzr,#0x3
0096c11c	add x3,sp,#0x50
0096c120	mov x0,x22
0096c124	mov x2,xzr
0096c128	bl 0x00c321a0
0096c12c	ldr x3,[sp, #0x50]
0096c130	adrp x2,0x2a9000
0096c134	mov x4,x0
0096c138	mov x0,x19
0096c13c	mov w1,w23
0096c140	add x2,x2,#0x951
0096c144	bl 0x00968fcc
0096c148	mov w1,#0x1
0096c14c	mov x0,x22
0096c150	mov x2,xzr
0096c154	mov x3,xzr
0096c158	bl 0x00c321a0
0096c15c	add w23,w23,#0x1
0096c160	cmp w23,w25
0096c164	b.ne 0x0096b5b8
0096c168	mov x0,x22
0096c16c	bl 0x00c31a40
0096c170	ldr x20,[sp, #0x8]
0096c174	mov w0,wzr
0096c178	b 0x0096c180
0096c17c	mov w0,#0x1b
0096c180	ldr x8,[x20, #0x28]
0096c184	ldur x9,[x29, #-0x60]
0096c188	cmp x8,x9
0096c18c	b.ne 0x0096c1b0
0096c190	ldp x29,x30,[sp, #0x140]
0096c194	ldp x20,x19,[sp, #0x130]
0096c198	ldp x22,x21,[sp, #0x120]
0096c19c	ldp x24,x23,[sp, #0x110]
0096c1a0	ldp x26,x25,[sp, #0x100]
0096c1a4	ldp x28,x27,[sp, #0xf0]
0096c1a8	add sp,sp,#0x150
0096c1ac	ret
0096c1b0	bl 0x00c2fec0
