; mbedtls_asn1_get_bitstring_null @ 00b7cb20
00b7cb20	ldr x8,[x0]
00b7cb24	sub x9,x1,x8
00b7cb28	cmp x9,#0x1
00b7cb2c	b.lt 0x00b7cb70
00b7cb30	ldrb w9,[x8]
00b7cb34	cmp w9,#0x3
00b7cb38	b.ne 0x00b7cb7c
00b7cb3c	add x10,x8,#0x1
00b7cb40	sub x9,x1,x10
00b7cb44	cmp x9,#0x1
00b7cb48	str x10,[x0]
00b7cb4c	b.lt 0x00b7cb88
00b7cb50	ldrb w10,[x10]
00b7cb54	tbnz w10,#0x7,0x00b7cb94
00b7cb58	add x9,x8,#0x2
00b7cb5c	str x9,[x0]
00b7cb60	ldrb w10,[x8, #0x1]
00b7cb64	mov x8,x9
00b7cb68	str x10,[x2]
00b7cb6c	b 0x00b7cbf0
00b7cb70	mov w8,#0xffffffa0
00b7cb74	mov w0,w8
00b7cb78	ret
00b7cb7c	mov w8,#0xffffff9e
00b7cb80	mov w0,w8
00b7cb84	ret
00b7cb88	mov w8,#0xffffffa0
00b7cb8c	mov w0,w8
00b7cb90	ret
00b7cb94	and w12,w10,#0x7f
00b7cb98	sub w11,w12,#0x1
00b7cb9c	cmp w11,#0x3
00b7cba0	b.ls 0x00b7cbb0
00b7cba4	mov w8,#0xffffff9c
00b7cba8	mov w0,w8
00b7cbac	ret
00b7cbb0	cmp x9,x12
00b7cbb4	b.le 0x00b7cc28
00b7cbb8	mov x10,xzr
00b7cbbc	add x9,x8,#0x2
00b7cbc0	neg w12,w12
00b7cbc4	str xzr,[x2]
00b7cbc8	str x9,[x0]
00b7cbcc	ldrb w13,[x9], #0x1
00b7cbd0	adds w12,w12,#0x1
00b7cbd4	bfm x13,x10,#0x38,#0x37
00b7cbd8	mov x10,x13
00b7cbdc	str x13,[x2]
00b7cbe0	str x9,[x0]
00b7cbe4	b.ne 0x00b7cbcc
00b7cbe8	add x8,x8,x11
00b7cbec	add x8,x8,#0x3
00b7cbf0	sub x8,x1,x8
00b7cbf4	cmp x10,x8
00b7cbf8	b.ls 0x00b7cc08
00b7cbfc	mov w8,#0xffffffa0
00b7cc00	mov w0,w8
00b7cc04	ret
00b7cc08	cbz x10,0x00b7cc34
00b7cc0c	sub x8,x10,#0x1
00b7cc10	str x8,[x2]
00b7cc14	ldrb w8,[x9]
00b7cc18	cbz w8,0x00b7cc40
00b7cc1c	mov w8,#0xffffff98
00b7cc20	mov w0,w8
00b7cc24	ret
00b7cc28	mov w8,#0xffffffa0
00b7cc2c	mov w0,w8
00b7cc30	ret
00b7cc34	mov w8,#0xffffff98
00b7cc38	mov w0,w8
00b7cc3c	ret
00b7cc40	add x9,x9,#0x1
00b7cc44	str x9,[x0]
00b7cc48	mov w0,w8
00b7cc4c	ret
