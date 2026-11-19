; FUN_0086c66c @ 0086c66c
0086c66c	sub sp,sp,#0x90
0086c670	stp x29,x30,[sp, #0x60]
0086c674	str x21,[sp, #0x70]
0086c678	stp x20,x19,[sp, #0x80]
0086c67c	add x29,sp,#0x60
0086c680	mrs x20,tpidr_el0
0086c684	ldr x8,[x20, #0x28]
0086c688	stur x8,[x29, #-0x8]
0086c68c	mov x8,x0
0086c690	ldr w9,[x8, #0x90]!
0086c694	ldur q0,[x8, #0x4]
0086c698	sub w10,w9,#0x106
0086c69c	stur q0,[x29, #-0x20]
0086c6a0	cmp w10,#0x2f
0086c6a4	b.hi 0x0086c6f0
0086c6a8	adrp x9,0x363000
0086c6ac	add x9,x9,#0x20f
0086c6b0	adr x11,0x86c6c0
0086c6b4	ldrb w12,[x9, x10]
0086c6b8	add x11,x11,x12, LSL #0x2
0086c6bc	br x11
0086c6c0	ldr x8,[x20, #0x28]
0086c6c4	ldur x9,[x29, #-0x8]
0086c6c8	cmp x8,x9
0086c6cc	b.ne 0x0086c910
0086c6d0	ldp x20,x19,[sp, #0x80]
0086c6d4	ldr x21,[sp, #0x70]
0086c6d8	ldp x29,x30,[sp, #0x60]
0086c6dc	add sp,sp,#0x90
0086c6e0	b 0x0086d048
0086c6e4	sub x1,x29,#0x20
0086c6e8	bl 0x0086c914
0086c6ec	b 0x0086c8ec
0086c6f0	cmp w9,#0x7b
0086c6f4	b.ne 0x0086c71c
0086c6f8	ldr x8,[x20, #0x28]
0086c6fc	ldur x9,[x29, #-0x8]
0086c700	cmp x8,x9
0086c704	b.ne 0x0086c910
0086c708	ldp x20,x19,[sp, #0x80]
0086c70c	ldr x21,[sp, #0x70]
0086c710	ldp x29,x30,[sp, #0x60]
0086c714	add sp,sp,#0x90
0086c718	b 0x0086d1b8
0086c71c	ldr x8,[x20, #0x28]
0086c720	ldur x9,[x29, #-0x8]
0086c724	cmp x8,x9
0086c728	b.ne 0x0086c910
0086c72c	mov w1,wzr
0086c730	ldp x20,x19,[sp, #0x80]
0086c734	ldr x21,[sp, #0x70]
0086c738	ldp x29,x30,[sp, #0x60]
0086c73c	add sp,sp,#0x90
0086c740	b 0x0085cb14
0086c744	mov x19,x0
0086c748	bl 0x00858f2c
0086c74c	stp xzr,xzr,[sp, #0x20]
0086c750	adrp x3,0x2ac000
0086c754	add x3,x3,#0xeef
0086c758	b 0x0086c8dc
0086c75c	mov x19,x0
0086c760	bl 0x00858f2c
0086c764	stp xzr,xzr,[sp, #0x20]
0086c768	adrp x3,0x2a7000
0086c76c	add x3,x3,#0xe0
0086c770	b 0x0086c8dc
0086c774	ldr x8,[x0, #0x160]
0086c778	mov x19,x0
0086c77c	ldurb w21,[x8, #-0x8]
0086c780	bl 0x00858f2c
0086c784	cmp w21,#0x1
0086c788	b.ne 0x0086c8d0
0086c78c	ldr x0,[x19, #0xe8]
0086c790	mov w1,#0x20
0086c794	bl 0x0084e938
0086c798	sub x1,x29,#0x20
0086c79c	mov x19,x0
0086c7a0	bl 0x0084ed88
0086c7a4	mov x0,x19
0086c7a8	b 0x0086c8ec
0086c7ac	ldr x8,[x20, #0x28]
0086c7b0	ldur x9,[x29, #-0x8]
0086c7b4	cmp x8,x9
0086c7b8	b.ne 0x0086c910
0086c7bc	ldp x20,x19,[sp, #0x80]
0086c7c0	ldr x21,[sp, #0x70]
0086c7c4	ldp x29,x30,[sp, #0x60]
0086c7c8	add sp,sp,#0x90
0086c7cc	b 0x00869ecc
0086c7d0	mov x19,x0
0086c7d4	bl 0x00858f2c
0086c7d8	ldr x0,[x19, #0xe8]
0086c7dc	mov w1,#0x20
0086c7e0	bl 0x0084e938
0086c7e4	mov x19,x0
0086c7e8	sub x1,x29,#0x20
0086c7ec	mov w2,wzr
0086c7f0	b 0x0086c814
0086c7f4	mov x19,x0
0086c7f8	bl 0x00858f2c
0086c7fc	ldr x0,[x19, #0xe8]
0086c800	mov w1,#0x20
0086c804	bl 0x0084e938
0086c808	mov x19,x0
0086c80c	sub x1,x29,#0x20
0086c810	mov w2,#0x1
0086c814	bl 0x0084ebf8
0086c818	mov x0,x19
0086c81c	b 0x0086c8ec
0086c820	ldr x8,[x20, #0x28]
0086c824	ldur x9,[x29, #-0x8]
0086c828	cmp x8,x9
0086c82c	b.ne 0x0086c910
0086c830	ldp x20,x19,[sp, #0x80]
0086c834	ldr x21,[sp, #0x70]
0086c838	ldp x29,x30,[sp, #0x60]
0086c83c	add sp,sp,#0x90
0086c840	b 0x0086cb0c
0086c844	ldp q0,q1,[x8]
0086c848	mov x19,x0
0086c84c	stp q0,q1,[sp, #0x20]
0086c850	bl 0x00858f2c
0086c854	add x2,sp,#0x20
0086c858	add x3,sp,#0x18
0086c85c	add x5,sp,#0x8
0086c860	mov x0,x19
0086c864	mov w1,wzr
0086c868	mov x4,xzr
0086c86c	mov w6,wzr
0086c870	mov x7,xzr
0086c874	stp xzr,xzr,[sp, #0x10]
0086c878	str xzr,[sp, #0x8]
0086c87c	bl 0x00863248
0086c880	b 0x0086c8ec
0086c884	ldr x8,[x20, #0x28]
0086c888	ldur x9,[x29, #-0x8]
0086c88c	cmp x8,x9
0086c890	b.ne 0x0086c910
0086c894	ldp x20,x19,[sp, #0x80]
0086c898	ldr x21,[sp, #0x70]
0086c89c	ldp x29,x30,[sp, #0x60]
0086c8a0	add sp,sp,#0x90
0086c8a4	b 0x0086d8c0
0086c8a8	mov x19,x0
0086c8ac	bl 0x00858f2c
0086c8b0	ldr x0,[x19, #0xe8]
0086c8b4	mov w1,#0x20
0086c8b8	bl 0x0084e938
0086c8bc	sub x1,x29,#0x20
0086c8c0	mov x19,x0
0086c8c4	bl 0x0084ebb0
0086c8c8	mov x0,x19
0086c8cc	b 0x0086c8ec
0086c8d0	adrp x3,0x2be000
0086c8d4	add x3,x3,#0xed5
0086c8d8	stp xzr,xzr,[sp, #0x20]
0086c8dc	sub x1,x29,#0x20
0086c8e0	add x2,sp,#0x20
0086c8e4	mov x0,x19
0086c8e8	bl 0x008659e8
0086c8ec	ldr x8,[x20, #0x28]
0086c8f0	ldur x9,[x29, #-0x8]
0086c8f4	cmp x8,x9
0086c8f8	b.ne 0x0086c910
0086c8fc	ldp x20,x19,[sp, #0x80]
0086c900	ldr x21,[sp, #0x70]
0086c904	ldp x29,x30,[sp, #0x60]
0086c908	add sp,sp,#0x90
0086c90c	ret
0086c910	bl 0x00c2fec0
