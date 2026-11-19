; ossl_ec_GFp_simple_dbl @ 00a3a53c
00a3a53c	sub sp,sp,#0x70
00a3a540	stp x22,x21,[sp, #0x40]
00a3a544	mov x21,x1
00a3a548	mov x1,x2
00a3a54c	stp x28,x27,[sp, #0x10]
00a3a550	stp x26,x25,[sp, #0x20]
00a3a554	stp x24,x23,[sp, #0x30]
00a3a558	stp x20,x19,[sp, #0x50]
00a3a55c	stp x29,x30,[sp, #0x60]
00a3a560	add x29,sp,#0x60
00a3a564	mov x19,x3
00a3a568	mov x28,x2
00a3a56c	mov x23,x0
00a3a570	bl 0x00c3ae10
00a3a574	cbz w0,0x00a3a58c
00a3a578	ldr x0,[x21, #0x20]
00a3a57c	bl 0x00c38e00
00a3a580	str wzr,[x21, #0x28]
00a3a584	mov w21,#0x1
00a3a588	b 0x00a3a918
00a3a58c	ldr x8,[x23]
00a3a590	ldr x22,[x23, #0x40]
00a3a594	mov x20,xzr
00a3a598	ldp x24,x27,[x8, #0xf8]
00a3a59c	cbnz x19,0x00a3a5b4
00a3a5a0	ldr x0,[x23, #0xa8]
00a3a5a4	bl 0x00c38a60
00a3a5a8	mov x20,x0
00a3a5ac	mov x19,x0
00a3a5b0	cbz x0,0x00a3a708
00a3a5b4	mov x0,x19
00a3a5b8	str x24,[sp]
00a3a5bc	bl 0x00c38a90
00a3a5c0	mov x0,x19
00a3a5c4	bl 0x00c38a40
00a3a5c8	mov x24,x0
00a3a5cc	mov x0,x19
00a3a5d0	bl 0x00c38a40
00a3a5d4	mov x26,x0
00a3a5d8	mov x0,x19
00a3a5dc	bl 0x00c38a40
00a3a5e0	str x0,[sp, #0x8]
00a3a5e4	mov x0,x19
00a3a5e8	bl 0x00c38a40
00a3a5ec	cbz x0,0x00a3a904
00a3a5f0	ldr w8,[x28, #0x28]
00a3a5f4	mov x25,x0
00a3a5f8	cbz w8,0x00a3a678
00a3a5fc	ldr x2,[x28, #0x10]
00a3a600	mov x0,x23
00a3a604	mov x1,x24
00a3a608	mov x3,x19
00a3a60c	blr x27
00a3a610	cbz w0,0x00a3a904
00a3a614	mov x0,x26
00a3a618	mov x1,x24
00a3a61c	mov x2,x22
00a3a620	bl 0x00c38ed0
00a3a624	cbz w0,0x00a3a904
00a3a628	mov x0,x24
00a3a62c	mov x1,x24
00a3a630	mov x2,x26
00a3a634	mov x3,x22
00a3a638	bl 0x00c38ec0
00a3a63c	cbz w0,0x00a3a904
00a3a640	ldr x2,[x23, #0x60]
00a3a644	mov x0,x26
00a3a648	mov x1,x24
00a3a64c	mov x3,x22
00a3a650	bl 0x00c38ec0
00a3a654	cbz w0,0x00a3a904
00a3a658	ldr w8,[x28, #0x28]
00a3a65c	ldr x2,[x28, #0x18]
00a3a660	cbz w8,0x00a3a7b4
00a3a664	mov x0,x24
00a3a668	mov x1,x2
00a3a66c	bl 0x00c36990
00a3a670	cbnz x0,0x00a3a7d0
00a3a674	b 0x00a3a904
00a3a678	ldr w8,[x23, #0x70]
00a3a67c	cbz w8,0x00a3a710
00a3a680	ldr x2,[x28, #0x20]
00a3a684	mov x0,x23
00a3a688	mov x1,x26
00a3a68c	mov x3,x19
00a3a690	blr x27
00a3a694	cbz w0,0x00a3a904
00a3a698	ldr x1,[x28, #0x10]
00a3a69c	mov x0,x24
00a3a6a0	mov x2,x26
00a3a6a4	mov x3,x22
00a3a6a8	bl 0x00c38ec0
00a3a6ac	cbz w0,0x00a3a904
00a3a6b0	ldr x1,[x28, #0x10]
00a3a6b4	ldr x0,[sp, #0x8]
00a3a6b8	mov x2,x26
00a3a6bc	mov x3,x22
00a3a6c0	bl 0x00c38f20
00a3a6c4	cbz w0,0x00a3a904
00a3a6c8	ldp x8,x3,[sp]
00a3a6cc	mov x0,x23
00a3a6d0	mov x1,x26
00a3a6d4	mov x2,x24
00a3a6d8	mov x4,x19
00a3a6dc	blr x8
00a3a6e0	cbz w0,0x00a3a904
00a3a6e4	mov x0,x24
00a3a6e8	mov x1,x26
00a3a6ec	mov x2,x22
00a3a6f0	bl 0x00c38ed0
00a3a6f4	cbz w0,0x00a3a904
00a3a6f8	mov x0,x26
00a3a6fc	mov x1,x24
00a3a700	mov x2,x26
00a3a704	b 0x00a3a64c
00a3a708	mov w21,wzr
00a3a70c	b 0x00a3a918
00a3a710	ldr x2,[x28, #0x10]
00a3a714	mov x0,x23
00a3a718	mov x1,x24
00a3a71c	mov x3,x19
00a3a720	blr x27
00a3a724	cbz w0,0x00a3a904
00a3a728	mov x0,x26
00a3a72c	mov x1,x24
00a3a730	mov x2,x22
00a3a734	bl 0x00c38ed0
00a3a738	cbz w0,0x00a3a904
00a3a73c	mov x0,x24
00a3a740	mov x1,x24
00a3a744	mov x2,x26
00a3a748	mov x3,x22
00a3a74c	bl 0x00c38ec0
00a3a750	cbz w0,0x00a3a904
00a3a754	ldr x2,[x28, #0x20]
00a3a758	mov x0,x23
00a3a75c	mov x1,x26
00a3a760	mov x3,x19
00a3a764	blr x27
00a3a768	cbz w0,0x00a3a904
00a3a76c	mov x0,x23
00a3a770	mov x1,x26
00a3a774	mov x2,x26
00a3a778	mov x3,x19
00a3a77c	blr x27
00a3a780	cbz w0,0x00a3a904
00a3a784	ldr x3,[x23, #0x60]
00a3a788	ldr x8,[sp]
00a3a78c	mov x0,x23
00a3a790	mov x1,x26
00a3a794	mov x2,x26
00a3a798	mov x4,x19
00a3a79c	blr x8
00a3a7a0	cbz w0,0x00a3a904
00a3a7a4	mov x0,x26
00a3a7a8	mov x1,x26
00a3a7ac	mov x2,x24
00a3a7b0	b 0x00a3a64c
00a3a7b4	ldr x3,[x28, #0x20]
00a3a7b8	ldr x8,[sp]
00a3a7bc	mov x0,x23
00a3a7c0	mov x1,x24
00a3a7c4	mov x4,x19
00a3a7c8	blr x8
00a3a7cc	cbz w0,0x00a3a904
00a3a7d0	ldr x0,[x21, #0x20]
00a3a7d4	mov x1,x24
00a3a7d8	mov x2,x22
00a3a7dc	bl 0x00c38ed0
00a3a7e0	cbz w0,0x00a3a904
00a3a7e4	str wzr,[x21, #0x28]
00a3a7e8	ldr x2,[x28, #0x18]
00a3a7ec	mov x0,x23
00a3a7f0	mov x1,x25
00a3a7f4	mov x3,x19
00a3a7f8	blr x27
00a3a7fc	cbz w0,0x00a3a904
00a3a800	ldr x2,[x28, #0x10]
00a3a804	ldp x8,x28,[sp]
00a3a808	mov x0,x23
00a3a80c	mov x3,x25
00a3a810	mov x4,x19
00a3a814	mov x1,x28
00a3a818	blr x8
00a3a81c	cbz w0,0x00a3a904
00a3a820	mov w2,#0x2
00a3a824	mov x0,x28
00a3a828	mov x1,x28
00a3a82c	mov x3,x22
00a3a830	bl 0x00c38ee0
00a3a834	cbz w0,0x00a3a904
00a3a838	mov x0,x24
00a3a83c	mov x1,x28
00a3a840	mov x2,x22
00a3a844	bl 0x00c38ed0
00a3a848	cbz w0,0x00a3a904
00a3a84c	ldr x1,[x21, #0x10]
00a3a850	mov x0,x23
00a3a854	mov x2,x26
00a3a858	mov x3,x19
00a3a85c	blr x27
00a3a860	cbz w0,0x00a3a904
00a3a864	ldr x0,[x21, #0x10]
00a3a868	mov x2,x24
00a3a86c	mov x3,x22
00a3a870	mov x1,x0
00a3a874	bl 0x00c38f20
00a3a878	cbz w0,0x00a3a904
00a3a87c	mov x0,x23
00a3a880	mov x1,x24
00a3a884	mov x2,x25
00a3a888	mov x3,x19
00a3a88c	blr x27
00a3a890	cbz w0,0x00a3a904
00a3a894	orr w2,wzr,#0x3
00a3a898	mov x0,x25
00a3a89c	mov x1,x24
00a3a8a0	mov x3,x22
00a3a8a4	bl 0x00c38ee0
00a3a8a8	cbz w0,0x00a3a904
00a3a8ac	ldr x2,[x21, #0x10]
00a3a8b0	mov x0,x24
00a3a8b4	mov x1,x28
00a3a8b8	mov x3,x22
00a3a8bc	bl 0x00c38f20
00a3a8c0	cbz w0,0x00a3a904
00a3a8c4	ldr x8,[sp]
00a3a8c8	mov x0,x23
00a3a8cc	mov x1,x24
00a3a8d0	mov x2,x26
00a3a8d4	mov x3,x24
00a3a8d8	mov x4,x19
00a3a8dc	blr x8
00a3a8e0	cbz w0,0x00a3a904
00a3a8e4	ldr x0,[x21, #0x18]
00a3a8e8	mov x1,x24
00a3a8ec	mov x2,x25
00a3a8f0	mov x3,x22
00a3a8f4	bl 0x00c38f20
00a3a8f8	cmp w0,#0x0
00a3a8fc	cset w21,ne
00a3a900	b 0x00a3a908
00a3a904	mov w21,wzr
00a3a908	mov x0,x19
00a3a90c	bl 0x00c38a20
00a3a910	mov x0,x20
00a3a914	bl 0x00c38a30
00a3a918	mov w0,w21
00a3a91c	ldp x29,x30,[sp, #0x60]
00a3a920	ldp x20,x19,[sp, #0x50]
00a3a924	ldp x22,x21,[sp, #0x40]
00a3a928	ldp x24,x23,[sp, #0x30]
00a3a92c	ldp x26,x25,[sp, #0x20]
00a3a930	ldp x28,x27,[sp, #0x10]
00a3a934	add sp,sp,#0x70
00a3a938	ret
