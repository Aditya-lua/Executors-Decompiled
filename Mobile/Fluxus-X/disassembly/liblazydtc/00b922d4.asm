; mbedtls_ecp_tls_read_group_id @ 00b922d4
00b922d4	cmp x2,#0x3
00b922d8	b.cs 0x00b922e8
00b922dc	mov w8,#0xffffb080
00b922e0	mov w0,w8
00b922e4	ret
00b922e8	ldr x8,[x1]
00b922ec	add x9,x8,#0x1
00b922f0	str x9,[x1]
00b922f4	ldrb w9,[x8]
00b922f8	cmp w9,#0x3
00b922fc	b.ne 0x00b92344
00b92300	ldurh w9,[x8, #0x1]
00b92304	add x8,x8,#0x3
00b92308	str x8,[x1]
00b9230c	rev w9,w9
00b92310	lsr w9,w9,#0x10
00b92314	sub w9,w9,#0x12
00b92318	and w10,w9,#0xffff
00b9231c	cmp w10,#0xc
00b92320	b.hi 0x00b92350
00b92324	adrp x10,0xca8000
00b92328	sxth x9,w9
00b9232c	add x10,x10,#0x5f0
00b92330	ldr x9,[x10, x9, LSL #0x3]
00b92334	ldr w9,[x9]
00b92338	str w9,[x0]
00b9233c	mov w0,wzr
00b92340	ret
00b92344	mov w8,#0xffffb080
00b92348	mov w0,w8
00b9234c	ret
00b92350	mov w8,#0xffffb180
00b92354	mov w0,w8
00b92358	ret
