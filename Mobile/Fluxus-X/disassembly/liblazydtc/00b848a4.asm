; mbedtls_mpi_core_fill_random @ 00b848a4
00b848a4	str x27,[sp, #-0x60]!
00b848a8	stp x26,x25,[sp, #0x10]
00b848ac	stp x24,x23,[sp, #0x20]
00b848b0	stp x22,x21,[sp, #0x30]
00b848b4	stp x20,x19,[sp, #0x40]
00b848b8	stp x29,x30,[sp, #0x50]
00b848bc	add x29,sp,#0x50
00b848c0	lsr x25,x2,#0x3
00b848c4	tst x2,#0x7
00b848c8	cinc x27,x25,ne
00b848cc	mov x22,x4
00b848d0	mov x20,x3
00b848d4	mov x21,x2
00b848d8	mov x23,x1
00b848dc	cset w26,ne
00b848e0	cmp x27,x1
00b848e4	mov x19,x0
00b848e8	b.ls 0x00b848f4
00b848ec	orr w0,wzr,#0xfffffffc
00b848f0	b 0x00b84970
00b848f4	lsl x8,x27,#0x3
00b848f8	sub x24,x8,x21
00b848fc	mov x0,x19
00b84900	mov w1,wzr
00b84904	mov x2,x24
00b84908	bl 0x00c301c0
00b8490c	sub x8,x23,x27
00b84910	add x0,x19,x27, LSL #0x3
00b84914	lsl x2,x8,#0x3
00b84918	mov w1,wzr
00b8491c	bl 0x00c301c0
00b84920	add x1,x19,x24
00b84924	mov x0,x22
00b84928	mov x2,x21
00b8492c	blr x20
00b84930	cbnz w0,0x00b84970
00b84934	cbz x27,0x00b8496c
00b84938	add x8,x25,x26
00b8493c	add x8,x19,x8, LSL #0x3
00b84940	sub x8,x8,#0x10
00b84944	ldr x10,[x8, #0x8]
00b84948	ldr x9,[x19]
00b8494c	rev x10,x10
00b84950	rev x9,x9
00b84954	str x10,[x19], #0x8
00b84958	sub x10,x8,#0x8
00b8495c	cmp x19,x8
00b84960	str x9,[x8, #0x8]
00b84964	mov x8,x10
00b84968	b.ls 0x00b84944
00b8496c	mov w0,wzr
00b84970	ldp x29,x30,[sp, #0x50]
00b84974	ldp x20,x19,[sp, #0x40]
00b84978	ldp x22,x21,[sp, #0x30]
00b8497c	ldp x24,x23,[sp, #0x20]
00b84980	ldp x26,x25,[sp, #0x10]
00b84984	ldr x27,[sp], #0x60
00b84988	ret
