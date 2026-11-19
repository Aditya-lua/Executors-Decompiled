; cpr::Session::DeleteAsync @ 008f0774
008f0774	sub sp,sp,#0x70
008f0778	stp x26,x25,[sp, #0x20]
008f077c	stp x24,x23,[sp, #0x30]
008f0780	stp x22,x21,[sp, #0x40]
008f0784	stp x20,x19,[sp, #0x50]
008f0788	stp x29,x30,[sp, #0x60]
008f078c	add x29,sp,#0x60
008f0790	mrs x24,tpidr_el0
008f0794	mov x20,x8
008f0798	ldr x8,[x24, #0x28]
008f079c	str x8,[sp, #0x18]
008f07a0	mov x8,sp
008f07a4	bl 0x00c31300
008f07a8	bl 0x00c30d70
008f07ac	add x8,x0,#0x20
008f07b0	ldar w8,[x8]
008f07b4	mov x21,x0
008f07b8	cbnz w8,0x008f07c8
008f07bc	mov x0,x21
008f07c0	mov x1,xzr
008f07c4	bl 0x00c31330
008f07c8	add x8,x21,#0x30
008f07cc	ldar x8,[x8]
008f07d0	cbnz x8,0x008f07f0
008f07d4	add x8,x21,#0x28
008f07d8	ldar x8,[x8]
008f07dc	ldr x9,[x21, #0x10]
008f07e0	cmp x8,x9
008f07e4	b.cs 0x008f07f0
008f07e8	mov x0,x21
008f07ec	bl 0x00c31320
008f07f0	ldp x23,x22,[sp]
008f07f4	stp xzr,xzr,[sp]
008f07f8	orr w0,wzr,#0x60
008f07fc	bl 0x00c2fed0
008f0800	str xzr,[x0, #0x10]
008f0804	adrp x8,0xcb4000
008f0808	ldr x8,[x8, #0xd50]
008f080c	adrp x9,0xc4e000
008f0810	add x9,x9,#0x8f8
008f0814	mov x25,x0
008f0818	mov x26,x0
008f081c	add x8,x8,#0x10
008f0820	add x9,x9,#0x10
008f0824	mov x19,x0
008f0828	str xzr,[x25, #0x8]!
008f082c	str x8,[x0]
008f0830	str x9,[x26, #0x20]!
008f0834	str x26,[x0, #0x40]
008f0838	stp x23,x22,[x0, #0x28]
008f083c	mov w0,#0x188
008f0840	bl 0x00c2fed0
008f0844	mov x23,x0
008f0848	add x0,x0,#0x8
008f084c	mov w2,#0x6c
008f0850	mov w1,wzr
008f0854	bl 0x00c301c0
008f0858	adrp x8,0xcb4000
008f085c	ldr x8,[x8, #0xd40]
008f0860	str x23,[x19, #0x50]
008f0864	add x8,x8,#0x10
008f0868	str x8,[x23]
008f086c	add x0,sp,#0x10
008f0870	mov x1,x23
008f0874	bl 0x00c316e0
008f0878	add x22,x21,#0xa8
008f087c	mov x0,x22
008f0880	bl 0x00c2ff10
008f0884	ldxr x8,[x25]
008f0888	add x8,x8,#0x1
008f088c	stxr w9,x8,[x25]
008f0890	cbnz w9,0x008f0884
008f0894	ldp x9,x10,[x21, #0x80]
008f0898	ldp x12,x8,[x21, #0x98]
008f089c	mov w11,#0x55
008f08a0	subs x13,x10,x9
008f08a4	asr x13,x13,#0x3
008f08a8	mul x11,x13,x11
008f08ac	sub x11,x11,#0x1
008f08b0	csel x13,xzr,x11,eq
008f08b4	add x11,x8,x12
008f08b8	cmp x13,x11
008f08bc	b.ne 0x008f08d4
008f08c0	add x0,x21,#0x78
008f08c4	bl 0x00c31620
008f08c8	ldp x11,x8,[x21, #0x98]
008f08cc	ldp x9,x10,[x21, #0x80]
008f08d0	add x11,x11,x8
008f08d4	cmp x10,x9
008f08d8	b.eq 0x008f0904
008f08dc	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f08e0	movk x10,#0xc0c1
008f08e4	umulh x10,x11,x10
008f08e8	lsr x10,x10,#0x6
008f08ec	ldr x9,[x9, x10, LSL #0x3]
008f08f0	mov w12,#0x55
008f08f4	msub x10,x10,x12,x11
008f08f8	orr w11,wzr,#0x30
008f08fc	madd x9,x10,x11,x9
008f0900	b 0x008f0908
008f0904	mov x9,xzr
008f0908	adrp x10,0xc4e000
008f090c	add x10,x10,#0x958
008f0910	add x8,x8,#0x1
008f0914	add x10,x10,#0x10
008f0918	mov x0,x22
008f091c	stp x26,x19,[x9, #0x8]
008f0920	str x9,[x9, #0x20]
008f0924	str x10,[x9]
008f0928	str x8,[x21, #0xa0]
008f092c	bl 0x00c2ff20
008f0930	add x0,x21,#0xd0
008f0934	bl 0x00c315f0
008f0938	ldr x21,[sp, #0x10]
008f093c	ldaxr x8,[x25]
008f0940	sub x9,x8,#0x1
008f0944	stlxr w10,x9,[x25]
008f0948	cbnz w10,0x008f093c
008f094c	cbnz x8,0x008f0968
008f0950	ldr x8,[x19]
008f0954	mov x0,x19
008f0958	ldr x8,[x8, #0x10]
008f095c	blr x8
008f0960	mov x0,x19
008f0964	bl 0x00c2ff00
008f0968	ldr x19,[sp, #0x8]
008f096c	stp xzr,xzr,[x20, #0x8]
008f0970	str x21,[x20]
008f0974	cbz x19,0x008f09a8
008f0978	add x8,x19,#0x8
008f097c	ldaxr x9,[x8]
008f0980	sub x10,x9,#0x1
008f0984	stlxr w11,x10,[x8]
008f0988	cbnz w11,0x008f097c
008f098c	cbnz x9,0x008f09a8
008f0990	ldr x8,[x19]
008f0994	mov x0,x19
008f0998	ldr x8,[x8, #0x10]
008f099c	blr x8
008f09a0	mov x0,x19
008f09a4	bl 0x00c2ff00
008f09a8	ldr x8,[x24, #0x28]
008f09ac	ldr x9,[sp, #0x18]
008f09b0	cmp x8,x9
008f09b4	b.ne 0x008f09d4
008f09b8	ldp x29,x30,[sp, #0x60]
008f09bc	ldp x20,x19,[sp, #0x50]
008f09c0	ldp x22,x21,[sp, #0x40]
008f09c4	ldp x24,x23,[sp, #0x30]
008f09c8	ldp x26,x25,[sp, #0x20]
008f09cc	add sp,sp,#0x70
008f09d0	ret
008f09d4	bl 0x00c2fec0
