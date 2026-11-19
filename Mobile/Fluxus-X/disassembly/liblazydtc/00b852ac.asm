; mbedtls_asn1_write_len @ 00b852ac
00b852ac	lsr x9,x2,#0x20
00b852b0	mov x8,x0
00b852b4	cbz x9,0x00b852c0
00b852b8	mov w0,#0xffffff9c
00b852bc	ret
00b852c0	mov w0,#0x1
00b852c4	cmp x2,#0x80
00b852c8	b.cc 0x00b852dc
00b852cc	mov x9,x2
00b852d0	lsr x9,x9,#0x8
00b852d4	add w0,w0,#0x1
00b852d8	cbnz x9,0x00b852d0
00b852dc	ldr x10,[x8]
00b852e0	sub x9,x10,x1
00b852e4	cmp x9,w0, UXTW 
00b852e8	b.ge 0x00b852f4
00b852ec	mov w0,#0xffffff94
00b852f0	ret
00b852f4	sub x11,x10,#0x1
00b852f8	lsr x9,x2,#0x8
00b852fc	str x11,[x8]
00b85300	sturb w2,[x10, #-0x1]
00b85304	cbz x9,0x00b85320
00b85308	ldr x10,[x8]
00b8530c	sub x11,x10,#0x1
00b85310	str x11,[x8]
00b85314	sturb w9,[x10, #-0x1]
00b85318	lsr x9,x9,#0x8
00b8531c	cbnz x9,0x00b85308
00b85320	cmp w0,#0x2
00b85324	b.cc 0x00b8533c
00b85328	ldr x9,[x8]
00b8532c	add w10,w0,#0x7f
00b85330	sub x11,x9,#0x1
00b85334	str x11,[x8]
00b85338	sturb w10,[x9, #-0x1]
00b8533c	ret
