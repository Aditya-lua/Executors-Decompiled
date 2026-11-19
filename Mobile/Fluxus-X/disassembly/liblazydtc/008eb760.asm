; cpr::Session::Session @ 008eb760
008eb760	sub sp,sp,#0x90
008eb764	stp x26,x25,[sp, #0x40]
008eb768	stp x24,x23,[sp, #0x50]
008eb76c	stp x22,x21,[sp, #0x60]
008eb770	stp x20,x19,[sp, #0x70]
008eb774	stp x29,x30,[sp, #0x80]
008eb778	add x29,sp,#0x80
008eb77c	mrs x26,tpidr_el0
008eb780	ldr x8,[x26, #0x28]
008eb784	mov x19,x0
008eb788	str x8,[sp, #0x38]
008eb78c	stp xzr,xzr,[x0]
008eb790	strh wzr,[x0, #0x10]
008eb794	mov w0,#0x120
008eb798	bl 0x00c2fed0
008eb79c	mov x21,x0
008eb7a0	bl 0x00c30fb0
008eb7a4	str x21,[x19, #0x18]
008eb7a8	mov w0,#0x20
008eb7ac	bl 0x00c2fed0
008eb7b0	adrp x8,0xcb4000
008eb7b4	ldr x8,[x8, #0xd58]
008eb7b8	str x21,[x0, #0x18]
008eb7bc	adrp x9,0xc48000
008eb7c0	add x9,x9,#0x978
008eb7c4	movi v0.2D,#0x0
008eb7c8	mov x25,x19
008eb7cc	add x8,x8,#0x10
008eb7d0	str x8,[x0]
008eb7d4	mov w8,#0x1
008eb7d8	stur q0,[x0, #0x8]
008eb7dc	str q0,[x25, #0x88]!
008eb7e0	add x9,x9,#0x10
008eb7e4	sturb w8,[x25, #-0x40]
008eb7e8	mov x8,x25
008eb7ec	stp x0,x9,[x25, #-0x68]
008eb7f0	stur q0,[x25, #-0x50]
008eb7f4	stur xzr,[x25, #-0x58]
008eb7f8	stur q0,[x25, #-0x30]
008eb7fc	stur xzr,[x25, #-0x38]
008eb800	str q0,[x8, #-0x18]!
008eb804	stur x8,[x25, #-0x20]
008eb808	mov x8,x25
008eb80c	stur x25,[x25, #-0x8]
008eb810	str q0,[x8, #0x18]!
008eb814	orr w9,wzr,#0x3f800000
008eb818	str x8,[x25, #0x10]
008eb81c	mov x24,x25
008eb820	add x8,x25,#0x198
008eb824	add x0,x25,#0x1b8
008eb828	mov w2,#0x6a
008eb82c	mov w1,wzr
008eb830	str q0,[x24, #0x28]!
008eb834	str w9,[x25, #0x48]
008eb838	stur q0,[x25, #0x38]
008eb83c	str xzr,[x25, #0x88]
008eb840	stur q0,[x25, #0x58]
008eb844	str xzr,[x25, #0x98]
008eb848	str xzr,[x25, #0xc8]
008eb84c	str xzr,[x25, #0xd8]
008eb850	str xzr,[x25, #0x108]
008eb854	str xzr,[x25, #0x118]
008eb858	str xzr,[x25, #0x148]
008eb85c	str xzr,[x25, #0x158]
008eb860	str xzr,[x25, #0x188]
008eb864	strb wzr,[x25, #0x1b0]
008eb868	strb wzr,[x25, #0x1a8]
008eb86c	str q0,[x8]
008eb870	bl 0x00c301c0
008eb874	mov w0,#0xb
008eb878	bl 0x00c31850
008eb87c	ldr x20,[x0, #0x8]
008eb880	stp xzr,xzr,[sp, #0x20]
008eb884	str xzr,[sp, #0x30]
008eb888	mov x0,x20
008eb88c	bl 0x00c2ff50
008eb890	mov x21,x0
008eb894	cmn x0,#0x10
008eb898	b.cs 0x008eba08
008eb89c	cmp x21,#0x17
008eb8a0	b.cs 0x008eb8bc
008eb8a4	add x9,sp,#0x20
008eb8a8	lsl w8,w21,#0x1
008eb8ac	orr x22,x9,#0x1
008eb8b0	strb w8,[sp, #0x20]
008eb8b4	cbnz x21,0x008eb8dc
008eb8b8	b 0x008eb8ec
008eb8bc	add x8,x21,#0x10
008eb8c0	and x23,x8,#-0x10
008eb8c4	mov x0,x23
008eb8c8	bl 0x00c2fed0
008eb8cc	orr x8,x23,#0x1
008eb8d0	mov x22,x0
008eb8d4	stp x21,x0,[sp, #0x28]
008eb8d8	str x8,[sp, #0x20]
008eb8dc	mov x0,x22
008eb8e0	mov x1,x20
008eb8e4	mov x2,x21
008eb8e8	bl 0x00c2ffd0
008eb8ec	strb wzr,[x22, x21]
008eb8f0	adrp x2,0x2b3000
008eb8f4	add x2,x2,#0x4e9
008eb8f8	add x0,sp,#0x20
008eb8fc	mov w3,#0x5
008eb900	mov x1,xzr
008eb904	bl 0x00c314c0
008eb908	ldr x8,[x0, #0x10]
008eb90c	str x8,[sp, #0x10]
008eb910	ldr q0,[x0]
008eb914	str q0,[sp]
008eb918	stp xzr,xzr,[x0, #0x8]
008eb91c	str xzr,[x0]
008eb920	ldrb w8,[sp, #0x20]
008eb924	tbz w8,#0x0,0x008eb930
008eb928	ldr x0,[sp, #0x30]
008eb92c	bl 0x00c301d0
008eb930	ldr x8,[x19, #0x18]
008eb934	ldrb w9,[sp]
008eb938	ldr x10,[sp, #0x10]
008eb93c	ldr x0,[x8]
008eb940	mov x8,sp
008eb944	orr x8,x8,#0x1
008eb948	tst w9,#0x1
008eb94c	csel x2,x8,x10,eq
008eb950	mov w1,#0x2722
008eb954	bl 0x00c317c0
008eb958	mov w8,#0x32
008eb95c	mov w9,#0x1
008eb960	orr w10,wzr,#0x7
008eb964	stp x8,xzr,[sp, #0x20]
008eb968	strh w9,[sp, #0x28]
008eb96c	strb w10,[sp, #0x2a]
008eb970	add x1,sp,#0x20
008eb974	mov x0,x19
008eb978	bl 0x00c31220
008eb97c	ldr x8,[x19, #0x18]
008eb980	ldr x0,[x8]
008eb984	mov w1,#0x2b
008eb988	mov w2,#0x1
008eb98c	bl 0x00c317c0
008eb990	ldr x2,[x19, #0x18]
008eb994	ldr x0,[x2], #0x20
008eb998	mov w1,#0x271a
008eb99c	bl 0x00c317c0
008eb9a0	ldr x8,[x19, #0x18]
008eb9a4	ldr x0,[x8]
008eb9a8	adrp x2,0x2ab000
008eb9ac	add x2,x2,#0x32c
008eb9b0	mov w1,#0x272f
008eb9b4	bl 0x00c317c0
008eb9b8	ldr x8,[x19, #0x18]
008eb9bc	ldr x0,[x8]
008eb9c0	mov w1,#0xd5
008eb9c4	mov w2,#0x1
008eb9c8	bl 0x00c317c0
008eb9cc	ldrb w8,[sp]
008eb9d0	tbz w8,#0x0,0x008eb9dc
008eb9d4	ldr x0,[sp, #0x10]
008eb9d8	bl 0x00c301d0
008eb9dc	ldr x8,[x26, #0x28]
008eb9e0	ldr x9,[sp, #0x38]
008eb9e4	cmp x8,x9
008eb9e8	b.ne 0x008eba10
008eb9ec	ldp x29,x30,[sp, #0x80]
008eb9f0	ldp x20,x19,[sp, #0x70]
008eb9f4	ldp x22,x21,[sp, #0x60]
008eb9f8	ldp x24,x23,[sp, #0x50]
008eb9fc	ldp x26,x25,[sp, #0x40]
008eba00	add sp,sp,#0x90
008eba04	ret
008eba08	add x0,sp,#0x20
008eba0c	bl 0x00c30ce0
008eba10	bl 0x00c2fec0
