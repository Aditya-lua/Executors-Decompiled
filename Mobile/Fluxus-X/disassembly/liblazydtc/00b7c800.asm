; mbedtls_asn1_get_bitstring @ 00b7c800
00b7c800	ldr x8,[x0]
00b7c804	sub x9,x1,x8
00b7c808	cmp x9,#0x1
00b7c80c	b.lt 0x00b7c850
00b7c810	ldrb w9,[x8]
00b7c814	cmp w9,#0x3
00b7c818	b.ne 0x00b7c858
00b7c81c	add x10,x8,#0x1
00b7c820	sub x9,x1,x10
00b7c824	cmp x9,#0x1
00b7c828	str x10,[x0]
00b7c82c	b.lt 0x00b7c860
00b7c830	ldrb w10,[x10]
00b7c834	tbnz w10,#0x7,0x00b7c868
00b7c838	add x9,x8,#0x2
00b7c83c	str x9,[x0]
00b7c840	ldrb w10,[x8, #0x1]
00b7c844	mov x8,x9
00b7c848	str x10,[x2]
00b7c84c	b 0x00b7c8c0
00b7c850	mov w0,#0xffffffa0
00b7c854	ret
00b7c858	mov w0,#0xffffff9e
00b7c85c	ret
00b7c860	mov w0,#0xffffffa0
00b7c864	ret
00b7c868	and w12,w10,#0x7f
00b7c86c	sub w11,w12,#0x1
00b7c870	cmp w11,#0x3
00b7c874	b.ls 0x00b7c880
00b7c878	mov w0,#0xffffff9c
00b7c87c	ret
00b7c880	cmp x9,x12
00b7c884	b.le 0x00b7c91c
00b7c888	mov x10,xzr
00b7c88c	add x9,x8,#0x2
00b7c890	neg w12,w12
00b7c894	str xzr,[x2]
00b7c898	str x9,[x0]
00b7c89c	ldrb w13,[x9], #0x1
00b7c8a0	adds w12,w12,#0x1
00b7c8a4	bfm x13,x10,#0x38,#0x37
00b7c8a8	mov x10,x13
00b7c8ac	str x13,[x2]
00b7c8b0	str x9,[x0]
00b7c8b4	b.ne 0x00b7c89c
00b7c8b8	add x8,x8,x11
00b7c8bc	add x8,x8,#0x3
00b7c8c0	sub x11,x1,x8
00b7c8c4	sub x8,x10,#0x1
00b7c8c8	cmp x8,x11
00b7c8cc	b.cs 0x00b7c8ec
00b7c8d0	str x8,[x2]
00b7c8d4	ldrb w10,[x9]
00b7c8d8	cmp w10,#0x7
00b7c8dc	strb w10,[x2, #0x8]
00b7c8e0	b.ls 0x00b7c8f4
00b7c8e4	mov w0,#0xffffff9c
00b7c8e8	ret
00b7c8ec	mov w0,#0xffffffa0
00b7c8f0	ret
00b7c8f4	add x9,x9,#0x1
00b7c8f8	str x9,[x0]
00b7c8fc	str x9,[x2, #0x10]
00b7c900	ldr x9,[x0]
00b7c904	add x8,x9,x8
00b7c908	str x8,[x0]
00b7c90c	cmp x8,x1
00b7c910	mov w8,#0xffffff9a
00b7c914	csel w0,wzr,w8,eq
00b7c918	ret
00b7c91c	mov w0,#0xffffffa0
00b7c920	ret
