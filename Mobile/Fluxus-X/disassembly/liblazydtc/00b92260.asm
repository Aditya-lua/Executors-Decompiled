; mbedtls_ecp_tls_read_group @ 00b92260
00b92260	cmp x2,#0x3
00b92264	b.cs 0x00b92270
00b92268	mov w0,#0xffffb080
00b9226c	ret
00b92270	ldr x8,[x1]
00b92274	add x9,x8,#0x1
00b92278	str x9,[x1]
00b9227c	ldrb w9,[x8]
00b92280	cmp w9,#0x3
00b92284	b.ne 0x00b922c4
00b92288	ldurh w9,[x8, #0x1]
00b9228c	add x10,x8,#0x3
00b92290	str x10,[x1]
00b92294	rev w9,w9
00b92298	lsr w9,w9,#0x10
00b9229c	sub w8,w9,#0x12
00b922a0	and w9,w8,#0xffff
00b922a4	cmp w9,#0xc
00b922a8	b.hi 0x00b922cc
00b922ac	adrp x9,0xca8000
00b922b0	sxth x8,w8
00b922b4	add x9,x9,#0x5f0
00b922b8	ldr x8,[x9, x8, LSL #0x3]
00b922bc	ldr w1,[x8]
00b922c0	b 0x00c42800
00b922c4	mov w0,#0xffffb080
00b922c8	ret
00b922cc	mov w0,#0xffffb180
00b922d0	ret
