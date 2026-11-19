; cpr::Session::GetDownloadFileLength @ 008ef7c0
008ef7c0	sub sp,sp,#0x70
008ef7c4	stp x24,x23,[sp, #0x30]
008ef7c8	stp x22,x21,[sp, #0x40]
008ef7cc	stp x20,x19,[sp, #0x50]
008ef7d0	stp x29,x30,[sp, #0x60]
008ef7d4	add x29,sp,#0x60
008ef7d8	mrs x24,tpidr_el0
008ef7dc	ldr x8,[x24, #0x28]
008ef7e0	mov x9,#-0x1
008ef7e4	mov x21,x0
008ef7e8	mov x19,x0
008ef7ec	str x8,[sp, #0x28]
008ef7f0	str x9,[sp, #0x20]
008ef7f4	ldrb w8,[x21, #0x30]!
008ef7f8	ldur x9,[x21, #-0x18]
008ef7fc	ldr x0,[x9]
008ef800	tbnz w8,#0x0,0x008ef80c
008ef804	add x2,x21,#0x1
008ef808	b 0x008ef810
008ef80c	ldr x2,[x19, #0x40]
008ef810	mov w1,#0x2712
008ef814	bl 0x00c317c0
008ef818	ldrb w22,[x21]
008ef81c	tbnz w22,#0x0,0x008ef848
008ef820	add x20,x21,#0x1
008ef824	lsr w2,w22,#0x1
008ef828	cbz x2,0x008ef850
008ef82c	mov w1,#0x3a
008ef830	mov x0,x20
008ef834	bl 0x00c300a0
008ef838	sub x8,x0,x20
008ef83c	cmp x0,#0x0
008ef840	csinv x8,x8,xzr,ne
008ef844	b 0x008ef854
008ef848	ldp x2,x20,[x19, #0x38]
008ef84c	cbnz x2,0x008ef82c
008ef850	mov x8,#-0x1
008ef854	stp xzr,xzr,[sp, #0x8]
008ef858	str xzr,[sp, #0x18]
008ef85c	ldp x9,x10,[x19, #0x38]
008ef860	lsr w11,w22,#0x1
008ef864	tst w22,#0x1
008ef868	csel x9,x11,x9,eq
008ef86c	csinc x21,x10,x21,ne
008ef870	cmp x9,x8
008ef874	csel x20,x9,x8,cc
008ef878	cmn x20,#0x10
008ef87c	b.cs 0x008efa18
008ef880	cmp x20,#0x17
008ef884	b.cs 0x008ef8a0
008ef888	add x9,sp,#0x8
008ef88c	lsl w8,w20,#0x1
008ef890	orr x22,x9,#0x1
008ef894	strb w8,[sp, #0x8]
008ef898	cbnz x20,0x008ef8c0
008ef89c	b 0x008ef8d0
008ef8a0	add x8,x20,#0x10
008ef8a4	and x23,x8,#-0x10
008ef8a8	mov x0,x23
008ef8ac	bl 0x00c2fed0
008ef8b0	orr x8,x23,#0x1
008ef8b4	mov x22,x0
008ef8b8	stp x20,x0,[sp, #0x10]
008ef8bc	str x8,[sp, #0x8]
008ef8c0	mov x0,x22
008ef8c4	mov x1,x21
008ef8c8	mov x2,x20
008ef8cc	bl 0x00c2ffd0
008ef8d0	strb wzr,[x22, x20]
008ef8d4	add x20,x19,#0x68
008ef8d8	add x1,sp,#0x8
008ef8dc	mov x0,x20
008ef8e0	bl 0x00c310f0
008ef8e4	tbz w0,#0x0,0x008ef964
008ef8e8	ldr x8,[x19, #0x18]
008ef8ec	ldr x21,[x8]
008ef8f0	add x1,sp,#0x8
008ef8f4	mov x0,x20
008ef8f8	bl 0x00c310e0
008ef8fc	ldrb w8,[x0]
008ef900	ldr x9,[x0, #0x10]
008ef904	tst w8,#0x1
008ef908	csinc x2,x9,x0,ne
008ef90c	mov w1,#0x2714
008ef910	mov x0,x21
008ef914	bl 0x00c317c0
008ef918	add x20,x19,#0x80
008ef91c	add x1,sp,#0x8
008ef920	mov x0,x20
008ef924	bl 0x00c31160
008ef928	tbz w0,#0x0,0x008ef964
008ef92c	ldr x8,[x19, #0x18]
008ef930	ldr x0,[x8]
008ef934	mov w1,#0x6f
008ef938	orr x2,xzr,#-0x11
008ef93c	bl 0x00c317c0
008ef940	ldr x8,[x19, #0x18]
008ef944	ldr x21,[x8]
008ef948	add x1,sp,#0x8
008ef94c	mov x0,x20
008ef950	bl 0x00c31150
008ef954	mov x2,x0
008ef958	mov w1,#0x2716
008ef95c	mov x0,x21
008ef960	bl 0x00c317c0
008ef964	ldr x8,[x19, #0x18]
008ef968	ldr x0,[x8]
008ef96c	mov w1,#0x50
008ef970	mov w2,#0x1
008ef974	bl 0x00c317c0
008ef978	ldr x8,[x19, #0x18]
008ef97c	ldr x0,[x8]
008ef980	mov w1,#0x2c
008ef984	mov w2,#0x1
008ef988	bl 0x00c317c0
008ef98c	mov x0,x19
008ef990	bl 0x00c31250
008ef994	cbnz w0,0x008ef9d8
008ef998	str xzr,[sp]
008ef99c	ldr x8,[x19, #0x18]
008ef9a0	ldr x0,[x8]
008ef9a4	mov w1,#0x2
008ef9a8	movk w1,#0x20, LSL #16
008ef9ac	mov x2,sp
008ef9b0	bl 0x00c317a0
008ef9b4	ldr x8,[sp]
008ef9b8	cmp x8,#0xc8
008ef9bc	b.ne 0x008ef9d8
008ef9c0	ldr x8,[x19, #0x18]
008ef9c4	ldr x0,[x8]
008ef9c8	mov w1,#0xf
008ef9cc	movk w1,#0x60, LSL #16
008ef9d0	add x2,sp,#0x20
008ef9d4	bl 0x00c317a0
008ef9d8	ldrb w8,[sp, #0x8]
008ef9dc	ldr x19,[sp, #0x20]
008ef9e0	tbz w8,#0x0,0x008ef9ec
008ef9e4	ldr x0,[sp, #0x18]
008ef9e8	bl 0x00c301d0
008ef9ec	ldr x8,[x24, #0x28]
008ef9f0	ldr x9,[sp, #0x28]
008ef9f4	cmp x8,x9
008ef9f8	b.ne 0x008efa20
008ef9fc	mov x0,x19
008efa00	ldp x29,x30,[sp, #0x60]
008efa04	ldp x20,x19,[sp, #0x50]
008efa08	ldp x22,x21,[sp, #0x40]
008efa0c	ldp x24,x23,[sp, #0x30]
008efa10	add sp,sp,#0x70
008efa14	ret
008efa18	add x0,sp,#0x8
008efa1c	bl 0x00c30ce0
008efa20	bl 0x00c2fec0
