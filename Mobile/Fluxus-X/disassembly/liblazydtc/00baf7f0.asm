; FUN_00baf7f0 @ 00baf7f0
00baf7f0	str x28,[sp, #-0x40]!
00baf7f4	stp x22,x21,[sp, #0x10]
00baf7f8	stp x20,x19,[sp, #0x20]
00baf7fc	stp x29,x30,[sp, #0x30]
00baf800	add x29,sp,#0x30
00baf804	sub sp,sp,#0x500
00baf808	mrs x22,tpidr_el0
00baf80c	ldr x8,[x22, #0x28]
00baf810	mov w20,w2
00baf814	mov x21,x1
00baf818	mov w19,w0
00baf81c	add x0,sp,#0x40
00baf820	mov w1,#0x61
00baf824	mov w2,#0x3e8
00baf828	stur x8,[x29, #-0x38]
00baf82c	bl 0x00c301c0
00baf830	cbz w19,0x00baf844
00baf834	adrp x0,0x2a5000
00baf838	add x0,x0,#0x2b
00baf83c	mov x1,x21
00baf840	bl 0x00c41af0
00baf844	add x0,sp,#0x428
00baf848	mov w2,#0xd0
00baf84c	mov w1,wzr
00baf850	bl 0x00c301c0
00baf854	sub w21,w20,#0x1
00baf858	cmp w21,#0x3
00baf85c	b.hi 0x00baf8ac
00baf860	mov x9,#0x1c
00baf864	mov x10,#0x90
00baf868	movk x9,#0x20, LSL #16
00baf86c	movk x10,#0x88, LSL #16
00baf870	mov w8,w21
00baf874	movk x9,#0x30, LSL #32
00baf878	movk x10,#0x68, LSL #32
00baf87c	movk x9,#0x40, LSL #48
00baf880	movk x10,#0x48, LSL #48
00baf884	lsl x8,x8,#0x4
00baf888	lsr x9,x9,x8
00baf88c	lsr x8,x10,x8
00baf890	add x0,sp,#0x428
00baf894	mov w2,#0xcc
00baf898	mov w1,wzr
00baf89c	strh w9,[sp, #0x4f4]
00baf8a0	strh w8,[sp, #0x4f6]
00baf8a4	bl 0x00c301c0
00baf8a8	b 0x00baf8bc
00baf8ac	cbz w19,0x00baf8bc
00baf8b0	adrp x0,0x2da000
00baf8b4	add x0,x0,#0xd5d
00baf8b8	bl 0x00c41af0
00baf8bc	mov w20,#0x3e8
00baf8c0	add x0,sp,#0x428
00baf8c4	add x1,sp,#0x40
00baf8c8	mov w2,#0x3e8
00baf8cc	bl 0x00c42b30
00baf8d0	subs w20,w20,#0x1
00baf8d4	b.ne 0x00baf8c0
00baf8d8	add x0,sp,#0x428
00baf8dc	mov x1,sp
00baf8e0	mov w2,#0x40
00baf8e4	bl 0x00c42af0
00baf8e8	mov w20,w0
00baf8ec	cbz w0,0x00baf908
00baf8f0	cbz w19,0x00baf99c
00baf8f4	adrp x0,0x2c2000
00baf8f8	add x0,x0,#0xc2c
00baf8fc	mov w1,w20
00baf900	bl 0x00c41af0
00baf904	b 0x00baf99c
00baf908	cmp w21,#0x3
00baf90c	b.hi 0x00baf9d4
00baf910	adrp x8,0x788000
00baf914	add x8,x8,#0xce8
00baf918	ldrsw x9,[x8, x21, LSL #0x2]
00baf91c	add x8,x9,x8
00baf920	br x8
00baf924	adrp x1,0x788000
00baf928	add x1,x1,#0xe88
00baf92c	mov x0,sp
00baf930	orr w2,wzr,#0x1c
00baf934	b 0x00baf970
00baf938	adrp x1,0x788000
00baf93c	add x1,x1,#0xec4
00baf940	mov x0,sp
00baf944	orr w2,wzr,#0x30
00baf948	b 0x00baf970
00baf94c	adrp x1,0x788000
00baf950	add x1,x1,#0xef4
00baf954	mov x0,sp
00baf958	mov w2,#0x40
00baf95c	b 0x00baf970
00baf960	adrp x1,0x788000
00baf964	add x1,x1,#0xea4
00baf968	mov x0,sp
00baf96c	mov w2,#0x20
00baf970	bl 0x00c300b0
00baf974	mov w20,w0
00baf978	cbz w19,0x00baf98c
00baf97c	cbz w20,0x00baf98c
00baf980	adrp x0,0x77c000
00baf984	add x0,x0,#0x854
00baf988	bl 0x00c30760
00baf98c	cbz w19,0x00baf99c
00baf990	adrp x0,0x77c000
00baf994	add x0,x0,#0x87c
00baf998	bl 0x00c30760
00baf99c	add x0,sp,#0x428
00baf9a0	mov w1,#0xd0
00baf9a4	bl 0x00c42220
00baf9a8	ldr x8,[x22, #0x28]
00baf9ac	ldur x9,[x29, #-0x38]
00baf9b0	cmp x8,x9
00baf9b4	b.ne 0x00baf9e0
00baf9b8	mov w0,w20
00baf9bc	add sp,sp,#0x500
00baf9c0	ldp x29,x30,[sp, #0x30]
00baf9c4	ldp x20,x19,[sp, #0x20]
00baf9c8	ldp x22,x21,[sp, #0x10]
00baf9cc	ldr x28,[sp], #0x40
00baf9d0	ret
00baf9d4	mov w20,wzr
00baf9d8	cbnz w19,0x00baf990
00baf9dc	b 0x00baf99c
00baf9e0	bl 0x00c2fec0
