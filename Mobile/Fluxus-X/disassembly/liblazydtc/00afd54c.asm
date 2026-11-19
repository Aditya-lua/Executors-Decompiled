; SCT_print @ 00afd54c
00afd54c	sub sp,sp,#0x70
00afd550	stp x22,x21,[sp, #0x40]
00afd554	stp x20,x19,[sp, #0x50]
00afd558	mov w22,w2
00afd55c	mov x19,x1
00afd560	mov x20,x0
00afd564	str x25,[sp, #0x20]
00afd568	stp x24,x23,[sp, #0x30]
00afd56c	stp x29,x30,[sp, #0x60]
00afd570	add x29,sp,#0x60
00afd574	cbz x3,0x00afd58c
00afd578	ldp x1,x2,[x20, #0x18]
00afd57c	mov x0,x3
00afd580	bl 0x00c39750
00afd584	mov x23,x0
00afd588	b 0x00afd590
00afd58c	mov x23,xzr
00afd590	adrp x24,0x2ab000
00afd594	adrp x1,0x2c8000
00afd598	add x24,x24,#0x32c
00afd59c	add x1,x1,#0x3c2
00afd5a0	mov x0,x19
00afd5a4	mov w2,w22
00afd5a8	mov x3,x24
00afd5ac	bl 0x00c32250
00afd5b0	add w21,w22,#0x4
00afd5b4	adrp x1,0x2d8000
00afd5b8	add x1,x1,#0x8b9
00afd5bc	mov x0,x19
00afd5c0	mov w2,w21
00afd5c4	mov x3,x24
00afd5c8	bl 0x00c32250
00afd5cc	ldr w8,[x20]
00afd5d0	cbz w8,0x00afd624
00afd5d4	add w21,w22,#0x10
00afd5d8	adrp x1,0x2a2000
00afd5dc	adrp x3,0x2ab000
00afd5e0	add x1,x1,#0xdb0
00afd5e4	add x3,x3,#0x32c
00afd5e8	mov x0,x19
00afd5ec	mov w2,w21
00afd5f0	bl 0x00c32250
00afd5f4	ldr x3,[x20, #0x8]
00afd5f8	ldr w4,[x20, #0x10]
00afd5fc	mov x0,x19
00afd600	mov w1,w21
00afd604	ldp x29,x30,[sp, #0x60]
00afd608	ldp x20,x19,[sp, #0x50]
00afd60c	ldp x22,x21,[sp, #0x40]
00afd610	ldp x24,x23,[sp, #0x30]
00afd614	ldr x25,[sp, #0x20]
00afd618	mov w2,#0x10
00afd61c	add sp,sp,#0x70
00afd620	b 0x00c385d0
00afd624	adrp x1,0x2d4000
00afd628	add x1,x1,#0x4ff
00afd62c	mov x0,x19
00afd630	bl 0x00c32250
00afd634	cbz x23,0x00afd660
00afd638	mov x0,x23
00afd63c	bl 0x00c39760
00afd640	adrp x1,0x2d8000
00afd644	adrp x3,0x2ab000
00afd648	mov x4,x0
00afd64c	add x1,x1,#0x8ca
00afd650	add x3,x3,#0x32c
00afd654	mov x0,x19
00afd658	mov w2,w21
00afd65c	bl 0x00c32250
00afd660	adrp x23,0x2ab000
00afd664	adrp x1,0x2ce000
00afd668	add x23,x23,#0x32c
00afd66c	add x1,x1,#0x471
00afd670	mov x0,x19
00afd674	mov w2,w21
00afd678	mov x3,x23
00afd67c	bl 0x00c32250
00afd680	ldr x3,[x20, #0x18]
00afd684	ldr w4,[x20, #0x20]
00afd688	add w22,w22,#0x10
00afd68c	mov w2,#0x10
00afd690	mov x0,x19
00afd694	mov w1,w22
00afd698	bl 0x00c385d0
00afd69c	adrp x1,0x2cc000
00afd6a0	add x1,x1,#0x192
00afd6a4	mov x0,x19
00afd6a8	mov w2,w21
00afd6ac	mov x3,x23
00afd6b0	bl 0x00c32250
00afd6b4	ldr x24,[x20, #0x28]
00afd6b8	bl 0x00c38130
00afd6bc	cbz x0,0x00afd768
00afd6c0	mov x9,#0x99ef
00afd6c4	movk x9,#0x3afe, LSL #16
00afd6c8	movk x9,#0xb5d4, LSL #32
00afd6cc	lsr x8,x24,#0xa
00afd6d0	movk x9,#0x31, LSL #48
00afd6d4	mov w10,#0x5c00
00afd6d8	umulh x8,x8,x9
00afd6dc	mov x25,#0xf7cf
00afd6e0	movk w10,#0x526, LSL #16
00afd6e4	lsr x2,x8,#0x6
00afd6e8	movk x25,#0xe353, LSL #16
00afd6ec	msub x8,x2,x10,x24
00afd6f0	movk x25,#0x9ba5, LSL #32
00afd6f4	lsr x8,x8,#0x3
00afd6f8	movk x25,#0x20c4, LSL #48
00afd6fc	umulh x8,x8,x25
00afd700	lsr x3,x8,#0x4
00afd704	mov x1,xzr
00afd708	mov x23,x0
00afd70c	bl 0x00c374b0
00afd710	mov x0,x23
00afd714	bl 0x00c32130
00afd718	lsr x8,x24,#0x3
00afd71c	umulh x8,x8,x25
00afd720	lsr x8,x8,#0x4
00afd724	mov w9,#0x3e8
00afd728	adrp x2,0x2a4000
00afd72c	mov x3,x0
00afd730	msub w4,w8,w9,w24
00afd734	add x2,x2,#0x9ce
00afd738	add x0,sp,#0xc
00afd73c	mov w1,#0x14
00afd740	bl 0x00c34d30
00afd744	add x1,sp,#0xc
00afd748	mov x0,x23
00afd74c	bl 0x00c374e0
00afd750	cbz w0,0x00afd760
00afd754	mov x0,x19
00afd758	mov x1,x23
00afd75c	bl 0x00c374d0
00afd760	mov x0,x23
00afd764	bl 0x00c38120
00afd768	adrp x1,0x2c6000
00afd76c	adrp x3,0x2ab000
00afd770	add x1,x1,#0x30e
00afd774	add x3,x3,#0x32c
00afd778	mov x0,x19
00afd77c	mov w2,w21
00afd780	bl 0x00c32250
00afd784	ldr x4,[x20, #0x38]
00afd788	cbz x4,0x00afd7a4
00afd78c	ldr x3,[x20, #0x30]
00afd790	mov w2,#0x10
00afd794	mov x0,x19
00afd798	mov w1,w22
00afd79c	bl 0x00c385d0
00afd7a0	b 0x00afd7b4
00afd7a4	adrp x1,0x2c6000
00afd7a8	add x1,x1,#0xe43
00afd7ac	mov x0,x19
00afd7b0	bl 0x00c32250
00afd7b4	adrp x1,0x2a4000
00afd7b8	adrp x3,0x2ab000
00afd7bc	add x1,x1,#0x9bd
00afd7c0	add x3,x3,#0x32c
00afd7c4	mov x0,x19
00afd7c8	mov w2,w21
00afd7cc	bl 0x00c32250
00afd7d0	mov x0,x20
00afd7d4	bl 0x00c39840
00afd7d8	cbz w0,0x00afd7f8
00afd7dc	bl 0x00c34d80
00afd7e0	adrp x1,0x2b6000
00afd7e4	mov x2,x0
00afd7e8	add x1,x1,#0xc62
00afd7ec	mov x0,x19
00afd7f0	bl 0x00c32250
00afd7f4	b 0x00afd810
00afd7f8	ldrb w2,[x20, #0x40]
00afd7fc	ldrb w3,[x20, #0x41]
00afd800	adrp x1,0x2d8000
00afd804	add x1,x1,#0x8dd
00afd808	mov x0,x19
00afd80c	bl 0x00c32250
00afd810	adrp x1,0x2b6000
00afd814	adrp x3,0x2ab000
00afd818	add x1,x1,#0x533
00afd81c	add x3,x3,#0x32c
00afd820	mov x0,x19
00afd824	mov w2,w21
00afd828	bl 0x00c32250
00afd82c	ldr x3,[x20, #0x48]
00afd830	ldr w4,[x20, #0x50]
00afd834	mov w2,#0x10
00afd838	mov x0,x19
00afd83c	mov w1,w22
00afd840	bl 0x00c385d0
00afd844	ldp x29,x30,[sp, #0x60]
00afd848	ldp x20,x19,[sp, #0x50]
00afd84c	ldp x22,x21,[sp, #0x40]
00afd850	ldp x24,x23,[sp, #0x30]
00afd854	ldr x25,[sp, #0x20]
00afd858	add sp,sp,#0x70
00afd85c	ret
