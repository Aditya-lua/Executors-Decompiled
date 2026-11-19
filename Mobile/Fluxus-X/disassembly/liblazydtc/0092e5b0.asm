; curl_multi_setopt @ 0092e5b0
0092e5b0	sub sp,sp,#0xf0
0092e5b4	stp x29,x30,[sp, #0xe0]
0092e5b8	add x29,sp,#0xe0
0092e5bc	stp q6,q7,[sp, #0x60]
0092e5c0	stp q4,q5,[sp, #0x40]
0092e5c4	stp q2,q3,[sp, #0x20]
0092e5c8	stp q0,q1,[sp]
0092e5cc	stp x6,x7,[x29, #-0x38]
0092e5d0	stp x4,x5,[x29, #-0x48]
0092e5d4	stp x2,x3,[x29, #-0x58]
0092e5d8	mrs x9,tpidr_el0
0092e5dc	ldr x8,[x9, #0x28]
0092e5e0	stur x8,[x29, #-0x8]
0092e5e4	cbz x0,0x0092e6a0
0092e5e8	ldr w8,[x0]
0092e5ec	mov w10,#0xab1e
0092e5f0	movk w10,#0xb, LSL #16
0092e5f4	cmp w8,w10
0092e5f8	b.ne 0x0092e6a0
0092e5fc	ldrb w8,[x0, #0x231]
0092e600	tbnz w8,#0x2,0x0092e6c4
0092e604	orr x10,xzr,#-0x7f00000080
0092e608	movk x10,#0xffd0
0092e60c	add x11,x29,#0x10
0092e610	mov x12,sp
0092e614	sub x13,x29,#0x58
0092e618	mov w14,#0x2711
0092e61c	mov w8,wzr
0092e620	stur x10,[x29, #-0x10]
0092e624	stur x11,[x29, #-0x28]
0092e628	add x10,x12,#0x80
0092e62c	add x11,x13,#0x30
0092e630	cmp w1,w14
0092e634	stp x11,x10,[x29, #-0x20]
0092e638	b.le 0x0092e6cc
0092e63c	mov w10,#0x4e23
0092e640	cmp w1,w10
0092e644	b.gt 0x0092e728
0092e648	mov w10,#0xffffd8ee
0092e64c	add w10,w1,w10
0092e650	cmp w10,#0xd
0092e654	b.hi 0x0092e8bc
0092e658	adrp x11,0x747000
0092e65c	add x11,x11,#0x40
0092e660	ldrsw x10,[x11, x10, LSL #0x2]
0092e664	add x10,x10,x11
0092e668	br x10
0092e66c	ldursw x8,[x29, #-0x10]
0092e670	tbz w8,#0x1f,0x0092e684
0092e674	add w10,w8,#0x8
0092e678	cmp w10,#0x0
0092e67c	stur w10,[x29, #-0x10]
0092e680	b.le 0x0092e9e0
0092e684	ldur x10,[x29, #-0x28]
0092e688	add x8,x10,#0x8
0092e68c	stur x8,[x29, #-0x28]
0092e690	ldr x10,[x10]
0092e694	mov w8,wzr
0092e698	str x10,[x0, #0x88]
0092e69c	b 0x0092e6a4
0092e6a0	mov w8,#0x1
0092e6a4	ldr x9,[x9, #0x28]
0092e6a8	ldur x10,[x29, #-0x8]
0092e6ac	cmp x9,x10
0092e6b0	b.ne 0x0092ea10
0092e6b4	ldp x29,x30,[sp, #0xe0]
0092e6b8	mov w0,w8
0092e6bc	add sp,sp,#0xf0
0092e6c0	ret
0092e6c4	mov w8,#0x8
0092e6c8	b 0x0092e6a4
0092e6cc	sub w10,w1,#0x3
0092e6d0	cmp w10,#0xd
0092e6d4	b.hi 0x0092e8fc
0092e6d8	adrp x11,0x747000
0092e6dc	add x11,x11,#0x8
0092e6e0	ldrsw x10,[x11, x10, LSL #0x2]
0092e6e4	add x10,x10,x11
0092e6e8	br x10
0092e6ec	ldursw x8,[x29, #-0x10]
0092e6f0	tbz w8,#0x1f,0x0092e704
0092e6f4	add w10,w8,#0x8
0092e6f8	cmp w10,#0x0
0092e6fc	stur w10,[x29, #-0x10]
0092e700	b.le 0x0092e984
0092e704	ldur x10,[x29, #-0x28]
0092e708	add x8,x10,#0x8
0092e70c	stur x8,[x29, #-0x28]
0092e710	ldr w10,[x10]
0092e714	ldrb w11,[x0, #0x231]
0092e718	mov w8,wzr
0092e71c	bfxil w11,w10,#0x1,#0x1
0092e720	strb w11,[x0, #0x231]
0092e724	b 0x0092e6a4
0092e728	mov w10,#0xffff8ac7
0092e72c	add w10,w1,w10
0092e730	cmp w10,#0x2
0092e734	b.cc 0x0092e6a4
0092e738	mov w8,#0x4e24
0092e73c	cmp w1,w8
0092e740	b.eq 0x0092e784
0092e744	mov w8,#0x4e2e
0092e748	cmp w1,w8
0092e74c	b.ne 0x0092e8fc
0092e750	ldursw x8,[x29, #-0x10]
0092e754	tbz w8,#0x1f,0x0092e768
0092e758	add w10,w8,#0x8
0092e75c	cmp w10,#0x0
0092e760	stur w10,[x29, #-0x10]
0092e764	b.le 0x0092e96c
0092e768	ldur x10,[x29, #-0x28]
0092e76c	add x8,x10,#0x8
0092e770	stur x8,[x29, #-0x28]
0092e774	ldr x10,[x10]
0092e778	mov w8,wzr
0092e77c	str x10,[x0, #0x90]
0092e780	b 0x0092e6a4
0092e784	ldursw x8,[x29, #-0x10]
0092e788	tbz w8,#0x1f,0x0092e79c
0092e78c	add w10,w8,#0x8
0092e790	cmp w10,#0x0
0092e794	stur w10,[x29, #-0x10]
0092e798	b.le 0x0092e978
0092e79c	ldur x10,[x29, #-0x28]
0092e7a0	add x8,x10,#0x8
0092e7a4	stur x8,[x29, #-0x28]
0092e7a8	ldr x10,[x10]
0092e7ac	mov w8,wzr
0092e7b0	str x10,[x0, #0x200]
0092e7b4	b 0x0092e6a4
0092e7b8	ldursw x8,[x29, #-0x10]
0092e7bc	tbz w8,#0x1f,0x0092e7d0
0092e7c0	add w10,w8,#0x8
0092e7c4	cmp w10,#0x0
0092e7c8	stur w10,[x29, #-0x10]
0092e7cc	b.le 0x0092e990
0092e7d0	ldur x8,[x29, #-0x28]
0092e7d4	add x10,x8,#0x8
0092e7d8	stur x10,[x29, #-0x28]
0092e7dc	ldr x10,[x8]
0092e7e0	mov w8,wzr
0092e7e4	lsr x11,x10,#0x20
0092e7e8	cbnz x11,0x0092e6a4
0092e7ec	mov w8,wzr
0092e7f0	str w10,[x0, #0x22c]
0092e7f4	b 0x0092e6a4
0092e7f8	ldursw x8,[x29, #-0x10]
0092e7fc	tbz w8,#0x1f,0x0092e810
0092e800	add w10,w8,#0x8
0092e804	cmp w10,#0x0
0092e808	stur w10,[x29, #-0x10]
0092e80c	b.le 0x0092e99c
0092e810	ldur x10,[x29, #-0x28]
0092e814	add x8,x10,#0x8
0092e818	stur x8,[x29, #-0x28]
0092e81c	ldr x10,[x10]
0092e820	orr w11,wzr,#0x7ffffffe
0092e824	mov w8,wzr
0092e828	sub x12,x10,#0x1
0092e82c	cmp x12,x11
0092e830	mov w11,#0x64
0092e834	csel w10,w11,w10,hi
0092e838	str w10,[x0, #0x228]
0092e83c	b 0x0092e6a4
0092e840	ldursw x8,[x29, #-0x10]
0092e844	tbz w8,#0x1f,0x0092e858
0092e848	add w10,w8,#0x8
0092e84c	cmp w10,#0x0
0092e850	stur w10,[x29, #-0x10]
0092e854	b.le 0x0092e9a8
0092e858	ldur x10,[x29, #-0x28]
0092e85c	add x8,x10,#0x8
0092e860	stur x8,[x29, #-0x28]
0092e864	ldr x10,[x10]
0092e868	mov w8,wzr
0092e86c	str x10,[x0, #0x1e8]
0092e870	b 0x0092e6a4
0092e874	ldursw x8,[x29, #-0x10]
0092e878	tbz w8,#0x1f,0x0092e88c
0092e87c	add w10,w8,#0x8
0092e880	cmp w10,#0x1
0092e884	stur w10,[x29, #-0x10]
0092e888	b.lt 0x0092e9b4
0092e88c	ldur x8,[x29, #-0x28]
0092e890	add x10,x8,#0x8
0092e894	stur x10,[x29, #-0x28]
0092e898	ldr x8,[x8]
0092e89c	str x8,[x0, #0x1f0]
0092e8a0	ldur x10,[x29, #-0x28]
0092e8a4	add x8,x10,#0x8
0092e8a8	stur x8,[x29, #-0x28]
0092e8ac	ldr x10,[x10]
0092e8b0	mov w8,wzr
0092e8b4	str x10,[x0, #0x1f8]
0092e8b8	b 0x0092e6a4
0092e8bc	mov w8,#0x4e21
0092e8c0	cmp w1,w8
0092e8c4	b.ne 0x0092e8fc
0092e8c8	ldursw x8,[x29, #-0x10]
0092e8cc	tbz w8,#0x1f,0x0092e8e0
0092e8d0	add w10,w8,#0x8
0092e8d4	cmp w10,#0x0
0092e8d8	stur w10,[x29, #-0x10]
0092e8dc	b.le 0x0092ea04
0092e8e0	ldur x10,[x29, #-0x28]
0092e8e4	add x8,x10,#0x8
0092e8e8	stur x8,[x29, #-0x28]
0092e8ec	ldr x10,[x10]
0092e8f0	mov w8,wzr
0092e8f4	str x10,[x0, #0x80]
0092e8f8	b 0x0092e6a4
0092e8fc	orr w8,wzr,#0x6
0092e900	b 0x0092e6a4
0092e904	ldursw x8,[x29, #-0x10]
0092e908	tbz w8,#0x1f,0x0092e91c
0092e90c	add w10,w8,#0x8
0092e910	cmp w10,#0x0
0092e914	stur w10,[x29, #-0x10]
0092e918	b.le 0x0092e9ec
0092e91c	ldur x10,[x29, #-0x28]
0092e920	add x8,x10,#0x8
0092e924	stur x8,[x29, #-0x28]
0092e928	ldr x10,[x10]
0092e92c	mov w8,wzr
0092e930	str x10,[x0, #0x208]
0092e934	b 0x0092e6a4
0092e938	ldursw x8,[x29, #-0x10]
0092e93c	tbz w8,#0x1f,0x0092e950
0092e940	add w10,w8,#0x8
0092e944	cmp w10,#0x0
0092e948	stur w10,[x29, #-0x10]
0092e94c	b.le 0x0092e9f8
0092e950	ldur x10,[x29, #-0x28]
0092e954	add x8,x10,#0x8
0092e958	stur x8,[x29, #-0x28]
0092e95c	ldr x10,[x10]
0092e960	mov w8,wzr
0092e964	str x10,[x0, #0x98]
0092e968	b 0x0092e6a4
0092e96c	ldur x10,[x29, #-0x20]
0092e970	add x10,x10,x8
0092e974	b 0x0092e774
0092e978	ldur x10,[x29, #-0x20]
0092e97c	add x10,x10,x8
0092e980	b 0x0092e7a8
0092e984	ldur x10,[x29, #-0x20]
0092e988	add x10,x10,x8
0092e98c	b 0x0092e710
0092e990	ldur x10,[x29, #-0x20]
0092e994	add x8,x10,x8
0092e998	b 0x0092e7dc
0092e99c	ldur x10,[x29, #-0x20]
0092e9a0	add x10,x10,x8
0092e9a4	b 0x0092e81c
0092e9a8	ldur x10,[x29, #-0x20]
0092e9ac	add x10,x10,x8
0092e9b0	b 0x0092e864
0092e9b4	ldur x11,[x29, #-0x20]
0092e9b8	ldr x11,[x11, x8#0x0]
0092e9bc	str x11,[x0, #0x1f0]
0092e9c0	tbz w10,#0x1f,0x0092e8a0
0092e9c4	add w8,w8,#0x10
0092e9c8	cmp w8,#0x0
0092e9cc	stur w8,[x29, #-0x10]
0092e9d0	b.gt 0x0092e8a0
0092e9d4	ldur x8,[x29, #-0x20]
0092e9d8	add x10,x8,w10, SXTW 
0092e9dc	b 0x0092e8ac
0092e9e0	ldur x10,[x29, #-0x20]
0092e9e4	add x10,x10,x8
0092e9e8	b 0x0092e690
0092e9ec	ldur x10,[x29, #-0x20]
0092e9f0	add x10,x10,x8
0092e9f4	b 0x0092e928
0092e9f8	ldur x10,[x29, #-0x20]
0092e9fc	add x10,x10,x8
0092ea00	b 0x0092e95c
0092ea04	ldur x10,[x29, #-0x20]
0092ea08	add x10,x10,x8
0092ea0c	b 0x0092e8ec
0092ea10	bl 0x00c2fec0
