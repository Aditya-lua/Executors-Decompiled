; mbedtls_asn1_get_mpi @ 00b7c710
00b7c710	stp x20,x19,[sp, #-0x20]!
00b7c714	stp x29,x30,[sp, #0x10]
00b7c718	add x29,sp,#0x10
00b7c71c	ldr x9,[x0]
00b7c720	mov x19,x0
00b7c724	sub x8,x1,x9
00b7c728	cmp x8,#0x1
00b7c72c	b.lt 0x00b7c7d0
00b7c730	ldrb w8,[x9]
00b7c734	cmp w8,#0x2
00b7c738	b.ne 0x00b7c76c
00b7c73c	add x10,x9,#0x1
00b7c740	sub x8,x1,x10
00b7c744	cmp x8,#0x1
00b7c748	str x10,[x19]
00b7c74c	b.lt 0x00b7c7d0
00b7c750	ldrb w10,[x10]
00b7c754	tbnz w10,#0x7,0x00b7c774
00b7c758	add x8,x9,#0x2
00b7c75c	str x8,[x19]
00b7c760	ldrb w20,[x9, #0x1]
00b7c764	mov x9,x8
00b7c768	b 0x00b7c7c4
00b7c76c	mov w0,#0xffffff9e
00b7c770	b 0x00b7c7d4
00b7c774	and w11,w10,#0x7f
00b7c778	sub w10,w11,#0x1
00b7c77c	cmp w10,#0x3
00b7c780	b.ls 0x00b7c78c
00b7c784	mov w0,#0xffffff9c
00b7c788	b 0x00b7c7d4
00b7c78c	cmp x8,x11
00b7c790	b.le 0x00b7c7d0
00b7c794	mov x20,xzr
00b7c798	add x8,x9,#0x2
00b7c79c	neg w11,w11
00b7c7a0	str x8,[x19]
00b7c7a4	ldrb w12,[x8], #0x1
00b7c7a8	adds w11,w11,#0x1
00b7c7ac	bfm x12,x20,#0x38,#0x37
00b7c7b0	mov x20,x12
00b7c7b4	str x8,[x19]
00b7c7b8	b.ne 0x00b7c7a4
00b7c7bc	add x9,x9,x10
00b7c7c0	add x9,x9,#0x3
00b7c7c4	sub x9,x1,x9
00b7c7c8	cmp x20,x9
00b7c7cc	b.ls 0x00b7c7e0
00b7c7d0	mov w0,#0xffffffa0
00b7c7d4	ldp x29,x30,[sp, #0x10]
00b7c7d8	ldp x20,x19,[sp], #0x20
00b7c7dc	ret
00b7c7e0	mov x0,x2
00b7c7e4	mov x1,x8
00b7c7e8	mov x2,x20
00b7c7ec	bl 0x00c41ca0
00b7c7f0	ldr x8,[x19]
00b7c7f4	add x8,x8,x20
00b7c7f8	str x8,[x19]
00b7c7fc	b 0x00b7c7d4
