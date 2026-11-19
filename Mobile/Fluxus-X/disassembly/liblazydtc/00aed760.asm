; UI_new_method @ 00aed760
00aed760	str x21,[sp, #-0x30]!
00aed764	adrp x1,0x2a0000
00aed768	mov x21,x0
00aed76c	add x1,x1,#0xc2f
00aed770	orr w0,wzr,#0x38
00aed774	mov w2,#0x19
00aed778	stp x20,x19,[sp, #0x10]
00aed77c	stp x29,x30,[sp, #0x20]
00aed780	add x29,sp,#0x20
00aed784	bl 0x00c34250
00aed788	mov x19,x0
00aed78c	cbz x0,0x00aed828
00aed790	bl 0x00c34d50
00aed794	str x0,[x19, #0x30]
00aed798	cbz x0,0x00aed85c
00aed79c	cbnz x21,0x00aed7b4
00aed7a0	bl 0x00c40390
00aed7a4	mov x21,x0
00aed7a8	cbnz x0,0x00aed7b4
00aed7ac	bl 0x00c403e0
00aed7b0	mov x21,x0
00aed7b4	mov x20,x19
00aed7b8	str x21,[x20], #0x18
00aed7bc	mov w0,#0xb
00aed7c0	mov x1,x19
00aed7c4	mov x2,x20
00aed7c8	bl 0x00c356e0
00aed7cc	cbnz w0,0x00aed8a4
00aed7d0	ldrb w8,[x19, #0x28]
00aed7d4	tbz w8,#0x1,0x00aed7ec
00aed7d8	ldr x8,[x19]
00aed7dc	ldr x1,[x19, #0x10]
00aed7e0	mov x0,x19
00aed7e4	ldr x8,[x8, #0x38]
00aed7e8	blr x8
00aed7ec	ldr x0,[x19, #0x8]
00aed7f0	adrp x1,0xaed000
00aed7f4	add x1,x1,#0x930
00aed7f8	bl 0x00c32600
00aed7fc	mov w0,#0xb
00aed800	mov x1,x19
00aed804	mov x2,x20
00aed808	bl 0x00c356c0
00aed80c	ldr x0,[x19, #0x30]
00aed810	bl 0x00c34d40
00aed814	adrp x1,0x2a0000
00aed818	add x1,x1,#0xc2f
00aed81c	mov w2,#0x53
00aed820	mov x0,x19
00aed824	b 0x00aed89c
00aed828	bl 0x00c342a0
00aed82c	adrp x0,0x2a0000
00aed830	adrp x2,0x2ca000
00aed834	add x0,x0,#0xc2f
00aed838	add x2,x2,#0x3f9
00aed83c	orr w1,wzr,#0x1c
00aed840	bl 0x00c342b0
00aed844	mov w1,#0x100
00aed848	mov w0,#0x28
00aed84c	movk w1,#0xc, LSL #16
00aed850	mov x2,xzr
00aed854	bl 0x00c342c0
00aed858	b 0x00aed8a4
00aed85c	bl 0x00c342a0
00aed860	adrp x20,0x2a0000
00aed864	add x20,x20,#0xc2f
00aed868	adrp x2,0x2ca000
00aed86c	add x2,x2,#0x3f9
00aed870	mov w1,#0x22
00aed874	mov x0,x20
00aed878	bl 0x00c342b0
00aed87c	mov w1,#0x100
00aed880	mov w0,#0x28
00aed884	movk w1,#0xc, LSL #16
00aed888	mov x2,xzr
00aed88c	bl 0x00c342c0
00aed890	mov w2,#0x23
00aed894	mov x0,x19
00aed898	mov x1,x20
00aed89c	bl 0x00c32310
00aed8a0	mov x19,xzr
00aed8a4	mov x0,x19
00aed8a8	ldp x29,x30,[sp, #0x20]
00aed8ac	ldp x20,x19,[sp, #0x10]
00aed8b0	ldr x21,[sp], #0x30
00aed8b4	ret
