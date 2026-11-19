; BF_encrypt @ 00a8d41c
00a8d41c	ldp w9,w10,[x0]
00a8d420	ldp w11,w12,[x1]
00a8d424	mov w13,#0x100
00a8d428	add x8,x1,#0x48
00a8d42c	mov w14,#0x200
00a8d430	eor w9,w11,w9
00a8d434	ldp w11,w16,[x1, #0x8]
00a8d438	orr w15,wzr,#0x300
00a8d43c	eor w10,w12,w10
00a8d440	lsr w12,w9,#0x18
00a8d444	bfxil w13,w9,#0x10,#0x8
00a8d448	bfxil w14,w9,#0x8,#0x8
00a8d44c	bfxil w15,w9,#0x0,#0x8
00a8d450	eor w9,w11,w9
00a8d454	ldr w11,[x8, w12, UXTW #0x2]
00a8d458	ldr w12,[x8, w13, UXTW #0x2]
00a8d45c	ldr w14,[x8, w14, UXTW #0x2]
00a8d460	ldr w15,[x8, w15, UXTW #0x2]
00a8d464	mov w13,#0x100
00a8d468	add w11,w12,w11
00a8d46c	eor w11,w11,w14
00a8d470	add w11,w11,w15
00a8d474	eor w10,w10,w11
00a8d478	mov w12,#0x200
00a8d47c	lsr w11,w10,#0x18
00a8d480	bfxil w13,w10,#0x10,#0x8
00a8d484	orr w14,wzr,#0x300
00a8d488	bfxil w12,w10,#0x8,#0x8
00a8d48c	ldr w11,[x8, w11, UXTW #0x2]
00a8d490	ldr w13,[x8, w13, UXTW #0x2]
00a8d494	bfxil w14,w10,#0x0,#0x8
00a8d498	ldr w12,[x8, w12, UXTW #0x2]
00a8d49c	ldr w14,[x8, w14, UXTW #0x2]
00a8d4a0	add w11,w13,w11
00a8d4a4	mov w15,#0x100
00a8d4a8	eor w11,w11,w12
00a8d4ac	add w11,w11,w14
00a8d4b0	ldp w12,w14,[x1, #0x10]
00a8d4b4	eor w9,w9,w11
00a8d4b8	eor w10,w16,w10
00a8d4bc	mov w16,#0x200
00a8d4c0	orr w13,wzr,#0x300
00a8d4c4	lsr w11,w9,#0x18
00a8d4c8	bfxil w15,w9,#0x10,#0x8
00a8d4cc	bfxil w16,w9,#0x8,#0x8
00a8d4d0	bfxil w13,w9,#0x0,#0x8
00a8d4d4	eor w9,w12,w9
00a8d4d8	ldr w11,[x8, w11, UXTW #0x2]
00a8d4dc	ldr w12,[x8, w15, UXTW #0x2]
00a8d4e0	ldr w16,[x8, w16, UXTW #0x2]
00a8d4e4	ldr w13,[x8, w13, UXTW #0x2]
00a8d4e8	mov w15,#0x100
00a8d4ec	add w11,w12,w11
00a8d4f0	eor w11,w11,w16
00a8d4f4	add w11,w11,w13
00a8d4f8	eor w10,w10,w11
00a8d4fc	mov w12,#0x200
00a8d500	orr w16,wzr,#0x300
00a8d504	lsr w11,w10,#0x18
00a8d508	bfxil w15,w10,#0x10,#0x8
00a8d50c	bfxil w12,w10,#0x8,#0x8
00a8d510	bfxil w16,w10,#0x0,#0x8
00a8d514	eor w10,w14,w10
00a8d518	ldr w11,[x8, w11, UXTW #0x2]
00a8d51c	ldr w14,[x8, w15, UXTW #0x2]
00a8d520	ldr w12,[x8, w12, UXTW #0x2]
00a8d524	ldr w16,[x8, w16, UXTW #0x2]
00a8d528	mov w13,#0x100
00a8d52c	add w11,w14,w11
00a8d530	eor w11,w11,w12
00a8d534	add w11,w11,w16
00a8d538	ldp w12,w16,[x1, #0x18]
00a8d53c	eor w9,w9,w11
00a8d540	mov w15,#0x200
00a8d544	orr w14,wzr,#0x300
00a8d548	lsr w11,w9,#0x18
00a8d54c	bfxil w13,w9,#0x10,#0x8
00a8d550	bfxil w15,w9,#0x8,#0x8
00a8d554	bfxil w14,w9,#0x0,#0x8
00a8d558	eor w9,w12,w9
00a8d55c	ldr w11,[x8, w11, UXTW #0x2]
00a8d560	ldr w12,[x8, w13, UXTW #0x2]
00a8d564	ldr w15,[x8, w15, UXTW #0x2]
00a8d568	ldr w14,[x8, w14, UXTW #0x2]
00a8d56c	mov w13,#0x100
00a8d570	add w11,w12,w11
00a8d574	eor w11,w11,w15
00a8d578	add w11,w11,w14
00a8d57c	eor w10,w10,w11
00a8d580	mov w12,#0x200
00a8d584	lsr w11,w10,#0x18
00a8d588	bfxil w13,w10,#0x10,#0x8
00a8d58c	orr w15,wzr,#0x300
00a8d590	bfxil w12,w10,#0x8,#0x8
00a8d594	ldr w11,[x8, w11, UXTW #0x2]
00a8d598	ldr w13,[x8, w13, UXTW #0x2]
00a8d59c	bfxil w15,w10,#0x0,#0x8
00a8d5a0	ldr w12,[x8, w12, UXTW #0x2]
00a8d5a4	ldr w15,[x8, w15, UXTW #0x2]
00a8d5a8	add w11,w13,w11
00a8d5ac	mov w14,#0x100
00a8d5b0	eor w11,w11,w12
00a8d5b4	add w11,w11,w15
00a8d5b8	ldp w12,w15,[x1, #0x20]
00a8d5bc	eor w9,w9,w11
00a8d5c0	eor w10,w16,w10
00a8d5c4	mov w16,#0x200
00a8d5c8	orr w13,wzr,#0x300
00a8d5cc	lsr w11,w9,#0x18
00a8d5d0	bfxil w14,w9,#0x10,#0x8
00a8d5d4	bfxil w16,w9,#0x8,#0x8
00a8d5d8	bfxil w13,w9,#0x0,#0x8
00a8d5dc	eor w9,w12,w9
00a8d5e0	ldr w11,[x8, w11, UXTW #0x2]
00a8d5e4	ldr w12,[x8, w14, UXTW #0x2]
00a8d5e8	ldr w16,[x8, w16, UXTW #0x2]
00a8d5ec	ldr w13,[x8, w13, UXTW #0x2]
00a8d5f0	mov w14,#0x100
00a8d5f4	add w11,w12,w11
00a8d5f8	eor w11,w11,w16
00a8d5fc	add w11,w11,w13
00a8d600	eor w10,w10,w11
00a8d604	mov w12,#0x200
00a8d608	lsr w11,w10,#0x18
00a8d60c	bfxil w14,w10,#0x10,#0x8
00a8d610	orr w16,wzr,#0x300
00a8d614	bfxil w12,w10,#0x8,#0x8
00a8d618	ldr w11,[x8, w11, UXTW #0x2]
00a8d61c	ldr w14,[x8, w14, UXTW #0x2]
00a8d620	bfxil w16,w10,#0x0,#0x8
00a8d624	ldr w12,[x8, w12, UXTW #0x2]
00a8d628	ldr w16,[x8, w16, UXTW #0x2]
00a8d62c	add w11,w14,w11
00a8d630	mov w13,#0x100
00a8d634	eor w11,w11,w12
00a8d638	add w11,w11,w16
00a8d63c	ldp w12,w16,[x1, #0x28]
00a8d640	eor w9,w9,w11
00a8d644	eor w10,w15,w10
00a8d648	mov w15,#0x200
00a8d64c	orr w14,wzr,#0x300
00a8d650	lsr w11,w9,#0x18
00a8d654	bfxil w13,w9,#0x10,#0x8
00a8d658	bfxil w15,w9,#0x8,#0x8
00a8d65c	bfxil w14,w9,#0x0,#0x8
00a8d660	eor w9,w12,w9
00a8d664	ldr w11,[x8, w11, UXTW #0x2]
00a8d668	ldr w12,[x8, w13, UXTW #0x2]
00a8d66c	ldr w15,[x8, w15, UXTW #0x2]
00a8d670	ldr w14,[x8, w14, UXTW #0x2]
00a8d674	mov w13,#0x100
00a8d678	add w11,w12,w11
00a8d67c	eor w11,w11,w15
00a8d680	add w11,w11,w14
00a8d684	eor w10,w10,w11
00a8d688	mov w12,#0x200
00a8d68c	lsr w11,w10,#0x18
00a8d690	bfxil w13,w10,#0x10,#0x8
00a8d694	orr w15,wzr,#0x300
00a8d698	bfxil w12,w10,#0x8,#0x8
00a8d69c	ldr w11,[x8, w11, UXTW #0x2]
00a8d6a0	ldr w13,[x8, w13, UXTW #0x2]
00a8d6a4	bfxil w15,w10,#0x0,#0x8
00a8d6a8	ldr w12,[x8, w12, UXTW #0x2]
00a8d6ac	ldr w15,[x8, w15, UXTW #0x2]
00a8d6b0	add w11,w13,w11
00a8d6b4	mov w14,#0x100
00a8d6b8	eor w11,w11,w12
00a8d6bc	add w11,w11,w15
00a8d6c0	ldp w12,w15,[x1, #0x30]
00a8d6c4	eor w9,w9,w11
00a8d6c8	eor w10,w16,w10
00a8d6cc	mov w16,#0x200
00a8d6d0	orr w13,wzr,#0x300
00a8d6d4	lsr w11,w9,#0x18
00a8d6d8	bfxil w14,w9,#0x10,#0x8
00a8d6dc	bfxil w16,w9,#0x8,#0x8
00a8d6e0	bfxil w13,w9,#0x0,#0x8
00a8d6e4	eor w9,w12,w9
00a8d6e8	ldr w11,[x8, w11, UXTW #0x2]
00a8d6ec	ldr w12,[x8, w14, UXTW #0x2]
00a8d6f0	ldr w16,[x8, w16, UXTW #0x2]
00a8d6f4	ldr w13,[x8, w13, UXTW #0x2]
00a8d6f8	mov w14,#0x100
00a8d6fc	add w11,w12,w11
00a8d700	eor w11,w11,w16
00a8d704	add w11,w11,w13
00a8d708	eor w10,w10,w11
00a8d70c	mov w12,#0x200
00a8d710	lsr w11,w10,#0x18
00a8d714	bfxil w14,w10,#0x10,#0x8
00a8d718	orr w16,wzr,#0x300
00a8d71c	bfxil w12,w10,#0x8,#0x8
00a8d720	ldr w11,[x8, w11, UXTW #0x2]
00a8d724	ldr w14,[x8, w14, UXTW #0x2]
00a8d728	bfxil w16,w10,#0x0,#0x8
00a8d72c	ldr w12,[x8, w12, UXTW #0x2]
00a8d730	ldr w16,[x8, w16, UXTW #0x2]
00a8d734	add w11,w14,w11
00a8d738	mov w13,#0x100
00a8d73c	eor w11,w11,w12
00a8d740	add w11,w11,w16
00a8d744	ldp w12,w16,[x1, #0x38]
00a8d748	eor w9,w9,w11
00a8d74c	eor w10,w15,w10
00a8d750	mov w15,#0x200
00a8d754	lsr w11,w9,#0x18
00a8d758	bfxil w13,w9,#0x10,#0x8
00a8d75c	orr w14,wzr,#0x300
00a8d760	bfxil w15,w9,#0x8,#0x8
00a8d764	ldr w11,[x8, w11, UXTW #0x2]
00a8d768	ldr w13,[x8, w13, UXTW #0x2]
00a8d76c	bfxil w14,w9,#0x0,#0x8
00a8d770	eor w9,w12,w9
00a8d774	ldr w12,[x8, w15, UXTW #0x2]
00a8d778	ldr w14,[x8, w14, UXTW #0x2]
00a8d77c	add w11,w13,w11
00a8d780	mov w13,#0x100
00a8d784	eor w11,w11,w12
00a8d788	add w11,w11,w14
00a8d78c	eor w10,w10,w11
00a8d790	mov w12,#0x200
00a8d794	lsr w11,w10,#0x18
00a8d798	bfxil w13,w10,#0x10,#0x8
00a8d79c	orr w14,wzr,#0x300
00a8d7a0	bfxil w12,w10,#0x8,#0x8
00a8d7a4	ldr w11,[x8, w11, UXTW #0x2]
00a8d7a8	ldr w13,[x8, w13, UXTW #0x2]
00a8d7ac	bfxil w14,w10,#0x0,#0x8
00a8d7b0	ldr w12,[x8, w12, UXTW #0x2]
00a8d7b4	ldr w14,[x8, w14, UXTW #0x2]
00a8d7b8	add w11,w13,w11
00a8d7bc	eor w10,w16,w10
00a8d7c0	eor w11,w11,w12
00a8d7c4	add w11,w11,w14
00a8d7c8	ldp w14,w16,[x1, #0x40]
00a8d7cc	mov w15,#0x100
00a8d7d0	eor w9,w9,w11
00a8d7d4	mov w13,#0x200
00a8d7d8	orr w12,wzr,#0x300
00a8d7dc	lsr w11,w9,#0x18
00a8d7e0	bfxil w15,w9,#0x10,#0x8
00a8d7e4	bfxil w13,w9,#0x8,#0x8
00a8d7e8	bfxil w12,w9,#0x0,#0x8
00a8d7ec	eor w9,w14,w9
00a8d7f0	ldr w11,[x8, w11, UXTW #0x2]
00a8d7f4	ldr w14,[x8, w15, UXTW #0x2]
00a8d7f8	ldr w13,[x8, w13, UXTW #0x2]
00a8d7fc	ldr w12,[x8, w12, UXTW #0x2]
00a8d800	mov w15,#0x100
00a8d804	add w11,w14,w11
00a8d808	eor w11,w11,w13
00a8d80c	add w11,w11,w12
00a8d810	eor w10,w10,w11
00a8d814	mov w14,#0x200
00a8d818	lsr w11,w10,#0x18
00a8d81c	bfxil w15,w10,#0x10,#0x8
00a8d820	orr w13,wzr,#0x300
00a8d824	bfxil w14,w10,#0x8,#0x8
00a8d828	ldr w11,[x8, w11, UXTW #0x2]
00a8d82c	ldr w12,[x8, w15, UXTW #0x2]
00a8d830	bfxil w13,w10,#0x0,#0x8
00a8d834	ldr w14,[x8, w14, UXTW #0x2]
00a8d838	ldr w8,[x8, w13, UXTW #0x2]
00a8d83c	add w11,w12,w11
00a8d840	eor w10,w16,w10
00a8d844	eor w11,w11,w14
00a8d848	add w8,w11,w8
00a8d84c	eor w8,w9,w8
00a8d850	stp w10,w8,[x0]
00a8d854	ret
