; FUN_00b2d43c @ 00b2d43c
00b2d43c	sub sp,sp,#0x80
00b2d440	stp x26,x25,[sp, #0x30]
00b2d444	stp x24,x23,[sp, #0x40]
00b2d448	stp x22,x21,[sp, #0x50]
00b2d44c	stp x20,x19,[sp, #0x60]
00b2d450	stp x29,x30,[sp, #0x70]
00b2d454	add x29,sp,#0x70
00b2d458	mov x24,x5
00b2d45c	mov x26,x4
00b2d460	mov x22,x3
00b2d464	mov x19,x2
00b2d468	mov x20,x1
00b2d46c	mov x21,x0
00b2d470	str xzr,[x2]
00b2d474	bl 0x00c41000
00b2d478	cbz w0,0x00b2d754
00b2d47c	cmp x22,x24
00b2d480	b.cs 0x00b2d4b8
00b2d484	bl 0x00c342a0
00b2d488	adrp x0,0x2c6000
00b2d48c	adrp x2,0x2da000
00b2d490	add x0,x0,#0x600
00b2d494	add x2,x2,#0xb53
00b2d498	mov w1,#0x8b
00b2d49c	bl 0x00c342b0
00b2d4a0	mov w0,#0x39
00b2d4a4	mov w1,#0x6a
00b2d4a8	mov x2,xzr
00b2d4ac	bl 0x00c342c0
00b2d4b0	mov w0,wzr
00b2d4b4	b 0x00b2d754
00b2d4b8	tst x24,#-0x3ffffff9
00b2d4bc	mov w0,wzr
00b2d4c0	b.ne 0x00b2d754
00b2d4c4	ldrb w8,[x21, #0x6c]
00b2d4c8	tbnz w8,#0x1,0x00b2d600
00b2d4cc	cmp x24,#0x18
00b2d4d0	b.cc 0x00b2d73c
00b2d4d4	cbz x20,0x00b2d6e4
00b2d4d8	mov x8,#0xdd4a
00b2d4dc	movk x8,#0x2ca2, LSL #16
00b2d4e0	movk x8,#0xe879, LSL #32
00b2d4e4	movk x8,#0x521, LSL #48
00b2d4e8	mov x22,x21
00b2d4ec	str x8,[x22, #0x20]!
00b2d4f0	ldr x8,[x21, #0xa8]
00b2d4f4	add x1,sp,#0x28
00b2d4f8	mov w3,#0x8
00b2d4fc	mov x0,x21
00b2d500	ldr x8,[x8, #0x8]
00b2d504	mov x2,x26
00b2d508	blr x8
00b2d50c	cmp x20,x26
00b2d510	b.ne 0x00b2d528
00b2d514	add x1,x20,#0x8
00b2d518	sub x2,x24,#0x8
00b2d51c	mov x0,x20
00b2d520	bl 0x00c2ff60
00b2d524	sub x26,x20,#0x8
00b2d528	ldr x8,[x21, #0xa8]
00b2d52c	sub x25,x24,#0x10
00b2d530	add x2,x26,#0x8
00b2d534	mov x0,x21
00b2d538	ldr x8,[x8, #0x8]
00b2d53c	mov x1,x20
00b2d540	mov x3,x25
00b2d544	blr x8
00b2d548	ldr x8,[x21, #0xa8]
00b2d54c	add x9,x26,x24
00b2d550	sub x2,x9,#0x8
00b2d554	add x1,sp,#0x20
00b2d558	ldr x8,[x8, #0x8]
00b2d55c	mov w3,#0x8
00b2d560	mov x0,x21
00b2d564	blr x8
00b2d568	add x0,sp,#0x28
00b2d56c	mov w2,#0x8
00b2d570	mov x1,xzr
00b2d574	bl 0x00c37260
00b2d578	mov x0,x20
00b2d57c	mov x1,xzr
00b2d580	mov x2,x25
00b2d584	bl 0x00c37260
00b2d588	add x1,sp,#0x20
00b2d58c	mov w2,#0x8
00b2d590	mov x0,x22
00b2d594	bl 0x00c37260
00b2d598	ldr x8,[x21, #0xa8]
00b2d59c	mov x0,x21
00b2d5a0	mov x1,x20
00b2d5a4	mov x2,x20
00b2d5a8	ldr x8,[x8, #0x8]
00b2d5ac	mov x3,x25
00b2d5b0	blr x8
00b2d5b4	ldr x8,[x21, #0xa8]
00b2d5b8	add x1,sp,#0x28
00b2d5bc	add x2,sp,#0x28
00b2d5c0	mov w3,#0x8
00b2d5c4	ldr x8,[x8, #0x8]
00b2d5c8	mov x0,x21
00b2d5cc	blr x8
00b2d5d0	add x2,sp,#0x8
00b2d5d4	mov x0,x20
00b2d5d8	mov x1,x25
00b2d5dc	bl 0x00c3e4c0
00b2d5e0	cbz x0,0x00b2d6f4
00b2d5e4	add x0,sp,#0x8
00b2d5e8	add x1,sp,#0x28
00b2d5ec	mov w2,#0x8
00b2d5f0	bl 0x00c362f0
00b2d5f4	cmp w0,#0x0
00b2d5f8	csinv w23,w25,wzr,eq
00b2d5fc	b 0x00b2d6f8
00b2d600	add x23,x24,#0x10
00b2d604	cbz x20,0x00b2d740
00b2d608	add x22,x20,#0x8
00b2d60c	mov x0,x22
00b2d610	mov x1,x26
00b2d614	mov x2,x24
00b2d618	bl 0x00c2ff60
00b2d61c	add x2,sp,#0x8
00b2d620	mov x0,x26
00b2d624	mov x1,x24
00b2d628	bl 0x00c3e4c0
00b2d62c	cbz x0,0x00b2d6d4
00b2d630	ldr x8,[sp, #0x8]
00b2d634	add x9,x20,x24
00b2d638	add x0,sp,#0x8
00b2d63c	mov w1,#0x14
00b2d640	str x8,[x9, #0x8]
00b2d644	bl 0x00c34750
00b2d648	ldr x0,[x21, #0xb8]
00b2d64c	add x1,x21,#0x20
00b2d650	mov w2,#0x8
00b2d654	mov w3,wzr
00b2d658	bl 0x00c347b0
00b2d65c	cmp w0,#0x1
00b2d660	b.lt 0x00b2d6d4
00b2d664	ldr x8,[x21, #0x20]
00b2d668	add x3,x24,#0x8
00b2d66c	mov x0,x21
00b2d670	mov x1,x22
00b2d674	str x8,[x20]
00b2d678	ldr x8,[x21, #0xa8]
00b2d67c	mov x2,x22
00b2d680	ldr x8,[x8, #0x8]
00b2d684	blr x8
00b2d688	mov x0,x20
00b2d68c	mov x1,xzr
00b2d690	mov x2,x23
00b2d694	bl 0x00c37260
00b2d698	mov x9,#0xdd4a
00b2d69c	ldr x8,[x21, #0xa8]
00b2d6a0	movk x9,#0x2ca2, LSL #16
00b2d6a4	movk x9,#0xe879, LSL #32
00b2d6a8	movk x9,#0x521, LSL #48
00b2d6ac	str x9,[x21, #0x20]
00b2d6b0	ldr x8,[x8, #0x8]
00b2d6b4	mov x0,x21
00b2d6b8	mov x1,x20
00b2d6bc	mov x2,x20
00b2d6c0	mov x3,x23
00b2d6c4	blr x8
00b2d6c8	cmp w23,#0x1
00b2d6cc	b.ge 0x00b2d748
00b2d6d0	b 0x00b2d4b0
00b2d6d4	mov w23,wzr
00b2d6d8	cmp w23,#0x1
00b2d6dc	b.ge 0x00b2d748
00b2d6e0	b 0x00b2d4b0
00b2d6e4	sub w23,w24,#0x10
00b2d6e8	cmp w23,#0x1
00b2d6ec	b.ge 0x00b2d748
00b2d6f0	b 0x00b2d4b0
00b2d6f4	mov w23,#0xffffffff
00b2d6f8	add x0,sp,#0x28
00b2d6fc	mov w1,#0x8
00b2d700	bl 0x00c34750
00b2d704	add x0,sp,#0x8
00b2d708	mov w1,#0x14
00b2d70c	bl 0x00c34750
00b2d710	add x0,sp,#0x20
00b2d714	mov w1,#0x8
00b2d718	bl 0x00c34750
00b2d71c	mov w1,#0x10
00b2d720	mov x0,x22
00b2d724	bl 0x00c34750
00b2d728	cmn w23,#0x1
00b2d72c	b.ne 0x00b2d740
00b2d730	mov x0,x20
00b2d734	mov x1,x25
00b2d738	bl 0x00c34750
00b2d73c	mov w23,#0xffffffff
00b2d740	cmp w23,#0x1
00b2d744	b.lt 0x00b2d4b0
00b2d748	sxtw x8,w23
00b2d74c	mov w0,#0x1
00b2d750	str x8,[x19]
00b2d754	ldp x29,x30,[sp, #0x70]
00b2d758	ldp x20,x19,[sp, #0x60]
00b2d75c	ldp x22,x21,[sp, #0x50]
00b2d760	ldp x24,x23,[sp, #0x40]
00b2d764	ldp x26,x25,[sp, #0x30]
00b2d768	add sp,sp,#0x80
00b2d76c	ret
