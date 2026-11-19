; mbedtls_asn1_write_bool @ 00b858a4
00b858a4	ldr x8,[x0]
00b858a8	sub x9,x8,x1
00b858ac	cmp x9,#0x1
00b858b0	b.lt 0x00b8590c
00b858b4	cmp w2,#0x0
00b858b8	sub x9,x8,#0x1
00b858bc	csetm w10,ne
00b858c0	str x9,[x0]
00b858c4	sturb w10,[x8, #-0x1]
00b858c8	ldr x9,[x0]
00b858cc	sub x8,x9,x1
00b858d0	cmp x8,#0x1
00b858d4	b.lt 0x00b85914
00b858d8	sub x10,x9,#0x1
00b858dc	mov w8,#0x1
00b858e0	str x10,[x0]
00b858e4	sturb w8,[x9, #-0x1]
00b858e8	ldr x9,[x0]
00b858ec	sub x10,x9,x1
00b858f0	cmp x10,#0x1
00b858f4	b.lt 0x00b8591c
00b858f8	sub x10,x9,#0x1
00b858fc	str x10,[x0]
00b85900	orr w0,wzr,#0x3
00b85904	sturb w8,[x9, #-0x1]
00b85908	ret
00b8590c	mov w0,#0xffffff94
00b85910	ret
00b85914	mov w0,#0xffffff94
00b85918	ret
00b8591c	mov w0,#0xffffff94
00b85920	ret
