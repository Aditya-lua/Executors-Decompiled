; mbedtls_mpi_core_read_be @ 00b83860
00b83860	str x23,[sp, #-0x40]!
00b83864	stp x22,x21,[sp, #0x10]
00b83868	stp x20,x19,[sp, #0x20]
00b8386c	stp x29,x30,[sp, #0x30]
00b83870	add x29,sp,#0x30
00b83874	lsr x8,x3,#0x3
00b83878	tst x3,#0x7
00b8387c	cinc x8,x8,ne
00b83880	mov x21,x3
00b83884	mov x22,x2
00b83888	mov x20,x1
00b8388c	cmp x8,x1
00b83890	mov x19,x0
00b83894	b.ls 0x00b838a0
00b83898	orr w0,wzr,#0xfffffff8
00b8389c	b 0x00b8390c
00b838a0	cbz x20,0x00b83908
00b838a4	lsl x23,x20,#0x3
00b838a8	mov x0,x19
00b838ac	mov w1,wzr
00b838b0	mov x2,x23
00b838b4	bl 0x00c301c0
00b838b8	cbz x21,0x00b838d0
00b838bc	sub x8,x23,x21
00b838c0	add x0,x19,x8
00b838c4	mov x1,x22
00b838c8	mov x2,x21
00b838cc	bl 0x00c2ffd0
00b838d0	cmp x20,#0x1
00b838d4	b.mi 0x00b83908
00b838d8	add x8,x19,x20, LSL #0x3
00b838dc	sub x8,x8,#0x10
00b838e0	ldr x10,[x8, #0x8]
00b838e4	ldr x9,[x19]
00b838e8	rev x10,x10
00b838ec	rev x9,x9
00b838f0	str x10,[x19], #0x8
00b838f4	sub x10,x8,#0x8
00b838f8	cmp x19,x8
00b838fc	str x9,[x8, #0x8]
00b83900	mov x8,x10
00b83904	b.ls 0x00b838e0
00b83908	mov w0,wzr
00b8390c	ldp x29,x30,[sp, #0x30]
00b83910	ldp x20,x19,[sp, #0x20]
00b83914	ldp x22,x21,[sp, #0x10]
00b83918	ldr x23,[sp], #0x40
00b8391c	ret
