; FUN_007fe708 @ 007fe708
007fe708	sub sp,sp,#0x50
007fe70c	stp x29,x30,[sp, #0x10]
007fe710	stp x24,x23,[sp, #0x20]
007fe714	stp x22,x21,[sp, #0x30]
007fe718	stp x20,x19,[sp, #0x40]
007fe71c	add x29,sp,#0x10
007fe720	mrs x22,tpidr_el0
007fe724	mov x19,x0
007fe728	mov w21,w2
007fe72c	ldr x8,[x22, #0x28]
007fe730	mov x20,x1
007fe734	add x0,sp,#0x4
007fe738	mov x1,x19
007fe73c	mov w2,#0x1
007fe740	str x8,[sp, #0x8]
007fe744	bl 0x00c30140
007fe748	ldrb w8,[sp, #0x4]
007fe74c	cmp w8,#0x1
007fe750	b.ne 0x007fe81c
007fe754	ldrb w8,[x20]
007fe758	tbnz w8,#0x0,0x007fe764
007fe75c	strh wzr,[x20]
007fe760	b 0x007fe770
007fe764	ldr x8,[x20, #0x10]
007fe768	strb wzr,[x8]
007fe76c	str xzr,[x20, #0x8]
007fe770	mov x23,xzr
007fe774	add x24,x19,#0x28
007fe778	and w21,w21,#0xff
007fe77c	ldr x8,[x19]
007fe780	ldur x8,[x8, #-0x18]
007fe784	ldr x0,[x24, x8#0x0]
007fe788	ldp x8,x9,[x0, #0x18]
007fe78c	cmp x8,x9
007fe790	b.eq 0x007fe7a4
007fe794	add x9,x8,#0x1
007fe798	str x9,[x0, #0x18]
007fe79c	ldrb w1,[x8]
007fe7a0	b 0x007fe7bc
007fe7a4	ldr x8,[x0]
007fe7a8	ldr x8,[x8, #0x50]
007fe7ac	blr x8
007fe7b0	mov w1,w0
007fe7b4	cmn w1,#0x1
007fe7b8	b.eq 0x007fe7f4
007fe7bc	cmp w21,w1, UXTB 
007fe7c0	b.eq 0x007fe7ec
007fe7c4	mov x0,x20
007fe7c8	bl 0x00c30150
007fe7cc	ldrb w8,[x20]
007fe7d0	sub x23,x23,#0x1
007fe7d4	tbz w8,#0x0,0x007fe77c
007fe7d8	ldr x8,[x20, #0x8]
007fe7dc	cmn x8,#0x9
007fe7e0	b.ne 0x007fe77c
007fe7e4	mov w8,#0x4
007fe7e8	b 0x007fe804
007fe7ec	mov w8,wzr
007fe7f0	b 0x007fe804
007fe7f4	cmp x23,#0x0
007fe7f8	mov w8,#0x2
007fe7fc	mov w9,#0x6
007fe800	csel w8,w9,w8,eq
007fe804	ldr x9,[x19]
007fe808	ldur x9,[x9, #-0x18]
007fe80c	add x0,x19,x9
007fe810	ldr w9,[x0, #0x20]
007fe814	orr w1,w9,w8
007fe818	bl 0x00c30130
007fe81c	ldr x8,[x22, #0x28]
007fe820	ldr x9,[sp, #0x8]
007fe824	cmp x8,x9
007fe828	b.ne 0x007fe8b8
007fe82c	mov x0,x19
007fe830	ldp x20,x19,[sp, #0x40]
007fe834	ldp x22,x21,[sp, #0x30]
007fe838	ldp x24,x23,[sp, #0x20]
007fe83c	ldp x29,x30,[sp, #0x10]
007fe840	add sp,sp,#0x50
007fe844	ret
007fe8b8	bl 0x00c2fec0
