; mbedtls_mpi_copy @ 00b7d790
00b7d790	str x25,[sp, #-0x50]!
00b7d794	stp x24,x23,[sp, #0x10]
00b7d798	stp x22,x21,[sp, #0x20]
00b7d79c	stp x20,x19,[sp, #0x30]
00b7d7a0	stp x29,x30,[sp, #0x40]
00b7d7a4	add x29,sp,#0x40
00b7d7a8	mov x19,x1
00b7d7ac	mov x20,x0
00b7d7b0	cmp x0,x1
00b7d7b4	b.eq 0x00b7d8ac
00b7d7b8	ldrh w8,[x19, #0xa]
00b7d7bc	cbz x8,0x00b7d85c
00b7d7c0	lsl x9,x8,#0x3
00b7d7c4	neg x10,x8
00b7d7c8	mov x8,x10
00b7d7cc	cmn x10,#0x1
00b7d7d0	mov x21,x9
00b7d7d4	b.eq 0x00b7d7f0
00b7d7d8	ldr x9,[x19]
00b7d7dc	add x10,x8,#0x1
00b7d7e0	add x9,x9,x21
00b7d7e4	ldur x11,[x9, #-0x8]
00b7d7e8	sub x9,x21,#0x8
00b7d7ec	cbz x11,0x00b7d7c8
00b7d7f0	ldrh w25,[x20, #0xa]
00b7d7f4	ldrh w9,[x19, #0x8]
00b7d7f8	neg x22,x8
00b7d7fc	cmp x22,x25
00b7d800	strh w9,[x20, #0x8]
00b7d804	b.ls 0x00b7d880
00b7d808	mov w8,#0x2710
00b7d80c	cmp x22,x8
00b7d810	b.hi 0x00b7d8c8
00b7d814	mov w1,#0x8
00b7d818	mov x0,x22
00b7d81c	bl 0x00c30a30
00b7d820	mov x23,x0
00b7d824	cbz x0,0x00b7d8c8
00b7d828	ldr x24,[x20]
00b7d82c	cbz x24,0x00b7d850
00b7d830	lsl x25,x25,#0x3
00b7d834	mov x0,x23
00b7d838	mov x1,x24
00b7d83c	mov x2,x25
00b7d840	bl 0x00c2ffd0
00b7d844	mov x0,x24
00b7d848	mov x1,x25
00b7d84c	bl 0x00c42230
00b7d850	strh w22,[x20, #0xa]
00b7d854	str x23,[x20]
00b7d858	b 0x00b7d89c
00b7d85c	ldrh w8,[x20, #0xa]
00b7d860	cbz x8,0x00b7d8ac
00b7d864	ldr x0,[x20]
00b7d868	mov w9,#0x1
00b7d86c	lsl x2,x8,#0x3
00b7d870	mov w1,wzr
00b7d874	strh w9,[x20, #0x8]
00b7d878	bl 0x00c301c0
00b7d87c	b 0x00b7d8ac
00b7d880	ldr x9,[x20]
00b7d884	add x8,x25,x8
00b7d888	lsl x2,x8,#0x3
00b7d88c	mov w1,wzr
00b7d890	add x0,x9,x21
00b7d894	bl 0x00c301c0
00b7d898	ldr x23,[x20]
00b7d89c	ldr x1,[x19]
00b7d8a0	mov x0,x23
00b7d8a4	mov x2,x21
00b7d8a8	bl 0x00c2ffd0
00b7d8ac	mov w0,wzr
00b7d8b0	ldp x29,x30,[sp, #0x40]
00b7d8b4	ldp x20,x19,[sp, #0x30]
00b7d8b8	ldp x22,x21,[sp, #0x20]
00b7d8bc	ldp x24,x23,[sp, #0x10]
00b7d8c0	ldr x25,[sp], #0x50
00b7d8c4	ret
00b7d8c8	orr w0,wzr,#0xfffffff0
00b7d8cc	b 0x00b7d8b0
