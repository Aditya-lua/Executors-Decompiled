; ix::userAgent @ 0098c790
0098c790	sub sp,sp,#0x190
0098c794	stp x28,x27,[sp, #0x130]
0098c798	stp x26,x25,[sp, #0x140]
0098c79c	stp x24,x23,[sp, #0x150]
0098c7a0	stp x22,x21,[sp, #0x160]
0098c7a4	stp x20,x19,[sp, #0x170]
0098c7a8	stp x29,x30,[sp, #0x180]
0098c7ac	add x29,sp,#0x180
0098c7b0	mov x21,x8
0098c7b4	adrp x25,0xcb4000
0098c7b8	adrp x8,0xcb4000
0098c7bc	mrs x24,tpidr_el0
0098c7c0	ldr x25,[x25, #0xc90]
0098c7c4	ldr x8,[x8, #0xc88]
0098c7c8	ldr x9,[x24, #0x28]
0098c7cc	mov x20,sp
0098c7d0	movi v0.2D,#0x0
0098c7d4	add x10,x8,#0x18
0098c7d8	add x19,x20,#0x80
0098c7dc	add x26,x25,#0x40
0098c7e0	mov v0.D[0x0],x10
0098c7e4	add x22,x20,#0x18
0098c7e8	add x8,x8,#0x40
0098c7ec	stur x9,[x29, #-0x60]
0098c7f0	str x26,[sp, #0x10]
0098c7f4	str x8,[sp, #0x80]
0098c7f8	str q0,[sp]
0098c7fc	mov x0,x19
0098c800	mov x1,x22
0098c804	bl 0x00c30100
0098c808	str xzr,[sp, #0x108]
0098c80c	adrp x9,0xcb4000
0098c810	ldr x9,[x9, #0xa08]
0098c814	mov w8,#0xffffffff
0098c818	add x23,x20,#0x10
0098c81c	fmov d0,x26
0098c820	str w8,[sp, #0x110]
0098c824	add x8,x9,#0x10
0098c828	add x20,x20,#0x20
0098c82c	add x27,x25,#0x18
0098c830	add x28,x25,#0x68
0098c834	mov v0.D[0x1],x8
0098c838	mov x0,x20
0098c83c	str x27,[sp]
0098c840	str x28,[sp, #0x80]
0098c844	str q0,[sp, #0x10]
0098c848	bl 0x00c30480
0098c84c	movi v0.2D,#0x0
0098c850	stur q0,[sp, #0x48]
0098c854	stur q0,[sp, #0x38]
0098c858	stur q0,[sp, #0x28]
0098c85c	adrp x9,0xcb4000
0098c860	ldr x9,[x9, #0xa00]
0098c864	orr w8,wzr,#0x18
0098c868	stur q0,[sp, #0x68]
0098c86c	stur q0,[sp, #0x58]
0098c870	add x26,x9,#0x10
0098c874	str x26,[sp, #0x18]
0098c878	str w8,[sp, #0x78]
0098c87c	adrp x1,0x2a5000
0098c880	add x1,x1,#0x76d
0098c884	orr w2,wzr,#0xc
0098c888	mov x0,x23
0098c88c	bl 0x00c30e90
0098c890	adrp x1,0x2c5000
0098c894	add x1,x1,#0x3d5
0098c898	orr w2,wzr,#0x6
0098c89c	bl 0x00c30e90
0098c8a0	adrp x1,0x2a1000
0098c8a4	add x1,x1,#0x9a2
0098c8a8	mov w2,#0x1
0098c8ac	mov x0,x23
0098c8b0	bl 0x00c30e90
0098c8b4	adrp x1,0x2cb000
0098c8b8	add x1,x1,#0x2c9
0098c8bc	orr w2,wzr,#0x7
0098c8c0	bl 0x00c30e90
0098c8c4	adrp x1,0x2ab000
0098c8c8	add x1,x1,#0x9a6
0098c8cc	mov w2,#0xd
0098c8d0	mov x0,x23
0098c8d4	bl 0x00c30e90
0098c8d8	adrp x1,0x2a9000
0098c8dc	add x1,x1,#0xa87
0098c8e0	mov w2,#0x19
0098c8e4	bl 0x00c30e90
0098c8e8	adrp x1,0x29f000
0098c8ec	add x1,x1,#0x9dc
0098c8f0	orr w2,wzr,#0x6
0098c8f4	mov x0,x23
0098c8f8	bl 0x00c30e90
0098c8fc	adrp x1,0x2a3000
0098c900	add x1,x1,#0x6b5
0098c904	mov w2,#0x5
0098c908	bl 0x00c30e90
0098c90c	mov x8,x21
0098c910	mov x0,x22
0098c914	bl 0x00c30e20
0098c918	adrp x11,0xcb4000
0098c91c	add x8,x25,#0x18
0098c920	ldr x11,[x11, #0xa00]
0098c924	str x8,[sp]
0098c928	ldrb w8,[sp, #0x58]
0098c92c	add x9,x25,#0x68
0098c930	add x10,x25,#0x40
0098c934	add x11,x11,#0x10
0098c938	str x9,[sp, #0x80]
0098c93c	stp x10,x11,[sp, #0x10]
0098c940	tbz w8,#0x0,0x0098c94c
0098c944	ldr x0,[sp, #0x68]
0098c948	bl 0x00c301d0
0098c94c	adrp x8,0xcb4000
0098c950	ldr x8,[x8, #0xa08]
0098c954	mov x0,x20
0098c958	add x8,x8,#0x10
0098c95c	str x8,[sp, #0x18]
0098c960	bl 0x00c30090
0098c964	mov x0,x19
0098c968	bl 0x00c30ee0
0098c96c	ldr x8,[x24, #0x28]
0098c970	ldur x9,[x29, #-0x60]
0098c974	cmp x8,x9
0098c978	b.ne 0x0098c99c
0098c97c	ldp x29,x30,[sp, #0x180]
0098c980	ldp x20,x19,[sp, #0x170]
0098c984	ldp x22,x21,[sp, #0x160]
0098c988	ldp x24,x23,[sp, #0x150]
0098c98c	ldp x26,x25,[sp, #0x140]
0098c990	ldp x28,x27,[sp, #0x130]
0098c994	add sp,sp,#0x190
0098c998	ret
0098c99c	bl 0x00c2fec0
