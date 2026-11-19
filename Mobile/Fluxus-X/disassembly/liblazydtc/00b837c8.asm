; mbedtls_mpi_core_read_le @ 00b837c8
00b837c8	str x21,[sp, #-0x30]!
00b837cc	stp x20,x19,[sp, #0x10]
00b837d0	stp x29,x30,[sp, #0x20]
00b837d4	add x29,sp,#0x20
00b837d8	lsr x8,x3,#0x3
00b837dc	tst x3,#0x7
00b837e0	cinc x8,x8,ne
00b837e4	mov x19,x3
00b837e8	mov x20,x2
00b837ec	cmp x8,x1
00b837f0	mov x21,x0
00b837f4	b.ls 0x00b83800
00b837f8	orr w0,wzr,#0xfffffff8
00b837fc	b 0x00b83850
00b83800	cbz x21,0x00b8384c
00b83804	lsl x2,x1,#0x3
00b83808	mov x0,x21
00b8380c	mov w1,wzr
00b83810	bl 0x00c301c0
00b83814	cbz x19,0x00b8384c
00b83818	mov x8,xzr
00b8381c	mov x9,xzr
00b83820	ldrb w11,[x20, x9]
00b83824	and x12,x9,#-0x8
00b83828	ldr x13,[x21, x12#0x0]
00b8382c	and x10,x8,#0x38
00b83830	add x9,x9,#0x1
00b83834	lsl x10,x11,x10
00b83838	cmp x19,x9
00b8383c	orr x10,x10,x13
00b83840	add x8,x8,#0x8
00b83844	str x10,[x21, x12#0x0]
00b83848	b.ne 0x00b83820
00b8384c	mov w0,wzr
00b83850	ldp x29,x30,[sp, #0x20]
00b83854	ldp x20,x19,[sp, #0x10]
00b83858	ldr x21,[sp], #0x30
00b8385c	ret
