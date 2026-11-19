; mbedtls_ecjpake_write_round_one @ 00ba07ec
00ba07ec	sub sp,sp,#0xb0
00ba07f0	stp x28,x27,[sp, #0x50]
00ba07f4	stp x26,x25,[sp, #0x60]
00ba07f8	stp x24,x23,[sp, #0x70]
00ba07fc	stp x22,x21,[sp, #0x80]
00ba0800	stp x20,x19,[sp, #0x90]
00ba0804	stp x29,x30,[sp, #0xa0]
00ba0808	add x29,sp,#0xa0
00ba080c	mrs x23,tpidr_el0
00ba0810	ldr x8,[x23, #0x28]
00ba0814	mov x24,x5
00ba0818	mov x20,x4
00ba081c	mov x22,x2
00ba0820	str x8,[sp, #0x48]
00ba0824	ldr w8,[x0]
00ba0828	ldp w26,w9,[x0, #0xc8]
00ba082c	mov x27,x0
00ba0830	mov x21,x1
00ba0834	str x1,[sp, #0x38]
00ba0838	tbnz x2,#0x3f,0x00ba08ec
00ba083c	add x25,x27,#0x8
00ba0840	add x1,x27,#0x40
00ba0844	add x28,x27,#0x1c0
00ba0848	add x19,x27,#0xd0
00ba084c	mov x0,x25
00ba0850	stp x3,x1,[sp, #0x20]
00ba0854	mov x2,x28
00ba0858	mov x3,x19
00ba085c	mov x4,x20
00ba0860	mov x5,x24
00ba0864	stp w8,w9,[sp, #0x30]
00ba0868	bl 0x00c42670
00ba086c	cbnz w0,0x00ba08f0
00ba0870	ldr w2,[sp, #0x34]
00ba0874	add x3,sp,#0x40
00ba0878	mov x0,x25
00ba087c	mov x1,x19
00ba0880	mov x4,x21
00ba0884	mov x5,x22
00ba0888	bl 0x00c427e0
00ba088c	cbnz w0,0x00ba08f0
00ba0890	adrp x9,0xcab000
00ba0894	add x9,x9,#0x448
00ba0898	ldr x8,[sp, #0x40]
00ba089c	ldr x9,[x9, x26, LSL #0x3]
00ba08a0	ldr x26,[sp, #0x28]
00ba08a4	ldp w0,w2,[sp, #0x30]
00ba08a8	add x22,x21,x22
00ba08ac	add x8,x21,x8
00ba08b0	add x7,sp,#0x38
00ba08b4	mov x1,x25
00ba08b8	mov x3,x26
00ba08bc	mov x4,x28
00ba08c0	mov x5,x19
00ba08c4	mov x6,x9
00ba08c8	str x8,[sp, #0x38]
00ba08cc	stp x20,x24,[sp, #0x8]
00ba08d0	str x22,[sp]
00ba08d4	mov x19,x9
00ba08d8	bl 0x00ba1078
00ba08dc	cbnz w0,0x00ba08f0
00ba08e0	ldr x28,[sp, #0x38]
00ba08e4	cmp x28,x22
00ba08e8	b.ls 0x00ba0920
00ba08ec	mov w0,#0xffffb100
00ba08f0	ldr x8,[x23, #0x28]
00ba08f4	ldr x9,[sp, #0x48]
00ba08f8	cmp x8,x9
00ba08fc	b.ne 0x00ba09b8
00ba0900	ldp x29,x30,[sp, #0xa0]
00ba0904	ldp x20,x19,[sp, #0x90]
00ba0908	ldp x22,x21,[sp, #0x80]
00ba090c	ldp x24,x23,[sp, #0x70]
00ba0910	ldp x26,x25,[sp, #0x60]
00ba0914	ldp x28,x27,[sp, #0x50]
00ba0918	add sp,sp,#0xb0
00ba091c	ret
00ba0920	str x19,[sp, #0x18]
00ba0924	add x19,x27,#0x1d0
00ba0928	add x27,x27,#0x100
00ba092c	mov x0,x25
00ba0930	mov x1,x26
00ba0934	mov x2,x19
00ba0938	mov x3,x27
00ba093c	mov x4,x20
00ba0940	mov x5,x24
00ba0944	bl 0x00c42670
00ba0948	cbnz w0,0x00ba08f0
00ba094c	ldr w2,[sp, #0x34]
00ba0950	sub x5,x22,x28
00ba0954	add x3,sp,#0x40
00ba0958	mov x0,x25
00ba095c	mov x1,x27
00ba0960	mov x4,x28
00ba0964	bl 0x00c427e0
00ba0968	cbnz w0,0x00ba08f0
00ba096c	ldr x8,[sp, #0x40]
00ba0970	ldp w0,w2,[sp, #0x30]
00ba0974	ldr x6,[sp, #0x18]
00ba0978	add x7,sp,#0x38
00ba097c	add x8,x28,x8
00ba0980	mov x1,x25
00ba0984	mov x3,x26
00ba0988	mov x4,x19
00ba098c	mov x5,x27
00ba0990	str x8,[sp, #0x38]
00ba0994	stp x20,x24,[sp, #0x8]
00ba0998	str x22,[sp]
00ba099c	bl 0x00ba1078
00ba09a0	cbnz w0,0x00ba08f0
00ba09a4	ldr x8,[sp, #0x38]
00ba09a8	ldr x9,[sp, #0x20]
00ba09ac	sub x8,x8,x21
00ba09b0	str x8,[x9]
00ba09b4	b 0x00ba08f0
00ba09b8	bl 0x00c2fec0
