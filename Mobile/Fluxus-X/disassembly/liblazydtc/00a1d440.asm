; BN_div_recp @ 00a1d440
00a1d440	str x27,[sp, #-0x60]!
00a1d444	stp x24,x23,[sp, #0x20]
00a1d448	mov x23,x0
00a1d44c	mov x0,x4
00a1d450	stp x26,x25,[sp, #0x10]
00a1d454	stp x22,x21,[sp, #0x30]
00a1d458	stp x20,x19,[sp, #0x40]
00a1d45c	stp x29,x30,[sp, #0x50]
00a1d460	add x29,sp,#0x50
00a1d464	mov x19,x4
00a1d468	mov x21,x3
00a1d46c	mov x20,x2
00a1d470	mov x22,x1
00a1d474	bl 0x00c38a90
00a1d478	cbz x23,0x00a1d4dc
00a1d47c	cbz x22,0x00a1d4ec
00a1d480	mov x0,x19
00a1d484	bl 0x00c38a40
00a1d488	mov x25,x0
00a1d48c	mov x0,x19
00a1d490	bl 0x00c38a40
00a1d494	mov x24,x0
00a1d498	cbz x0,0x00a1d6a0
00a1d49c	mov x0,x20
00a1d4a0	mov x1,x21
00a1d4a4	bl 0x00c369c0
00a1d4a8	tbnz w0,#0x1f,0x00a1d4fc
00a1d4ac	mov x0,x20
00a1d4b0	bl 0x00c322f0
00a1d4b4	ldp w8,w9,[x21, #0x30]
00a1d4b8	lsl w8,w8,#0x1
00a1d4bc	cmp w8,w0
00a1d4c0	csel w26,w8,w0,gt
00a1d4c4	cmp w26,w9
00a1d4c8	b.ne 0x00a1d51c
00a1d4cc	mov w27,w26
00a1d4d0	cmn w27,#0x1
00a1d4d4	b.ne 0x00a1d57c
00a1d4d8	b 0x00a1d69c
00a1d4dc	mov x0,x19
00a1d4e0	bl 0x00c38a40
00a1d4e4	mov x23,x0
00a1d4e8	cbnz x22,0x00a1d480
00a1d4ec	mov x0,x19
00a1d4f0	bl 0x00c38a40
00a1d4f4	mov x22,x0
00a1d4f8	b 0x00a1d480
00a1d4fc	mov x0,x23
00a1d500	bl 0x00c38e00
00a1d504	mov x0,x22
00a1d508	mov x1,x20
00a1d50c	bl 0x00c36990
00a1d510	cmp x0,#0x0
00a1d514	cset w24,ne
00a1d518	b 0x00a1d6a0
00a1d51c	mov x0,x19
00a1d520	bl 0x00c38a90
00a1d524	mov x0,x19
00a1d528	bl 0x00c38a40
00a1d52c	cbz x0,0x00a1d564
00a1d530	mov w1,w26
00a1d534	mov x27,x0
00a1d538	bl 0x00c38db0
00a1d53c	cbz w0,0x00a1d564
00a1d540	add x0,x21,#0x18
00a1d544	mov x1,xzr
00a1d548	mov x2,x27
00a1d54c	mov x3,x21
00a1d550	mov x4,x19
00a1d554	bl 0x00c38ab0
00a1d558	cmp w0,#0x0
00a1d55c	csinv w27,w26,wzr,ne
00a1d560	b 0x00a1d568
00a1d564	mov w27,#0xffffffff
00a1d568	mov x0,x19
00a1d56c	bl 0x00c38a20
00a1d570	str w27,[x21, #0x34]
00a1d574	cmn w27,#0x1
00a1d578	b.eq 0x00a1d69c
00a1d57c	ldr w2,[x21, #0x30]
00a1d580	mov x0,x25
00a1d584	mov x1,x20
00a1d588	bl 0x00c39070
00a1d58c	cbz w0,0x00a1d69c
00a1d590	add x2,x21,#0x18
00a1d594	mov x0,x24
00a1d598	mov x1,x25
00a1d59c	mov x3,x19
00a1d5a0	bl 0x00c39060
00a1d5a4	cbz w0,0x00a1d69c
00a1d5a8	ldr w8,[x21, #0x30]
00a1d5ac	mov x0,x23
00a1d5b0	mov x1,x24
00a1d5b4	sub w2,w26,w8
00a1d5b8	bl 0x00c39070
00a1d5bc	cbz w0,0x00a1d69c
00a1d5c0	mov x0,x24
00a1d5c4	mov x1,x21
00a1d5c8	mov x2,x23
00a1d5cc	mov x3,x19
00a1d5d0	str wzr,[x23, #0x10]
00a1d5d4	bl 0x00c39060
00a1d5d8	cbz w0,0x00a1d69c
00a1d5dc	mov x0,x22
00a1d5e0	mov x1,x20
00a1d5e4	mov x2,x24
00a1d5e8	bl 0x00c388a0
00a1d5ec	cbz w0,0x00a1d69c
00a1d5f0	mov w25,#0xffffffff
00a1d5f4	str wzr,[x22, #0x10]
00a1d5f8	mov x0,x22
00a1d5fc	mov x1,x21
00a1d600	bl 0x00c369c0
00a1d604	tbnz w0,#0x1f,0x00a1d640
00a1d608	add w25,w25,#0x1
00a1d60c	cmp w25,#0x3
00a1d610	b.cs 0x00a1d670
00a1d614	mov x0,x22
00a1d618	mov x1,x22
00a1d61c	mov x2,x21
00a1d620	bl 0x00c388a0
00a1d624	cbz w0,0x00a1d69c
00a1d628	mov w1,#0x1
00a1d62c	mov x0,x23
00a1d630	bl 0x00c376e0
00a1d634	mov w24,wzr
00a1d638	cbnz w0,0x00a1d5f8
00a1d63c	b 0x00a1d6a0
00a1d640	mov x0,x22
00a1d644	bl 0x00c369b0
00a1d648	mov w8,wzr
00a1d64c	cbnz w0,0x00a1d654
00a1d650	ldr w8,[x20, #0x10]
00a1d654	str w8,[x22, #0x10]
00a1d658	ldr w8,[x20, #0x10]
00a1d65c	ldr w9,[x21, #0x10]
00a1d660	mov w24,#0x1
00a1d664	eor w8,w9,w8
00a1d668	str w8,[x23, #0x10]
00a1d66c	b 0x00a1d6a0
00a1d670	bl 0x00c342a0
00a1d674	adrp x0,0x2af000
00a1d678	adrp x2,0x2c5000
00a1d67c	add x0,x0,#0xddf
00a1d680	add x2,x2,#0x86b
00a1d684	mov w1,#0x95
00a1d688	bl 0x00c342b0
00a1d68c	orr w0,wzr,#0x3
00a1d690	mov w1,#0x65
00a1d694	mov x2,xzr
00a1d698	bl 0x00c342c0
00a1d69c	mov w24,wzr
00a1d6a0	mov x0,x19
00a1d6a4	bl 0x00c38a20
00a1d6a8	mov w0,w24
00a1d6ac	ldp x29,x30,[sp, #0x50]
00a1d6b0	ldp x20,x19,[sp, #0x40]
00a1d6b4	ldp x22,x21,[sp, #0x30]
00a1d6b8	ldp x24,x23,[sp, #0x20]
00a1d6bc	ldp x26,x25,[sp, #0x10]
00a1d6c0	ldr x27,[sp], #0x60
00a1d6c4	ret
