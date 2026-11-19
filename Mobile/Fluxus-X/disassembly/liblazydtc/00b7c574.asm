; mbedtls_asn1_get_enum @ 00b7c574
00b7c574	ldr x10,[x0]
00b7c578	sub x8,x1,x10
00b7c57c	cmp x8,#0x1
00b7c580	b.lt 0x00b7c5c0
00b7c584	ldrb w8,[x10]
00b7c588	cmp w8,#0xa
00b7c58c	b.ne 0x00b7c5cc
00b7c590	add x9,x10,#0x1
00b7c594	sub x8,x1,x9
00b7c598	cmp x8,#0x1
00b7c59c	str x9,[x0]
00b7c5a0	b.lt 0x00b7c5d8
00b7c5a4	ldrb w9,[x9]
00b7c5a8	tbnz w9,#0x7,0x00b7c5e4
00b7c5ac	add x8,x10,#0x2
00b7c5b0	str x8,[x0]
00b7c5b4	ldrb w9,[x10, #0x1]
00b7c5b8	mov x10,x8
00b7c5bc	b 0x00b7c638
00b7c5c0	mov w8,#0xffffffa0
00b7c5c4	mov w0,w8
00b7c5c8	ret
00b7c5cc	mov w8,#0xffffff9e
00b7c5d0	mov w0,w8
00b7c5d4	ret
00b7c5d8	mov w8,#0xffffffa0
00b7c5dc	mov w0,w8
00b7c5e0	ret
00b7c5e4	and w12,w9,#0x7f
00b7c5e8	sub w11,w12,#0x1
00b7c5ec	cmp w11,#0x3
00b7c5f0	b.ls 0x00b7c600
00b7c5f4	mov w8,#0xffffff9c
00b7c5f8	mov w0,w8
00b7c5fc	ret
00b7c600	cmp x8,x12
00b7c604	b.le 0x00b7c690
00b7c608	mov x9,xzr
00b7c60c	add x8,x10,#0x2
00b7c610	neg w12,w12
00b7c614	str x8,[x0]
00b7c618	ldrb w13,[x8], #0x1
00b7c61c	adds w12,w12,#0x1
00b7c620	bfm x13,x9,#0x38,#0x37
00b7c624	mov x9,x13
00b7c628	str x8,[x0]
00b7c62c	b.ne 0x00b7c618
00b7c630	add x10,x10,x11
00b7c634	add x10,x10,#0x3
00b7c638	sub x10,x1,x10
00b7c63c	cmp x9,x10
00b7c640	b.ls 0x00b7c650
00b7c644	mov w8,#0xffffffa0
00b7c648	mov w0,w8
00b7c64c	ret
00b7c650	cbz x9,0x00b7c69c
00b7c654	ldrsb w10,[x8]
00b7c658	tbnz w10,#0x1f,0x00b7c6a8
00b7c65c	cbnz w10,0x00b7c67c
00b7c660	add x8,x8,#0x1
00b7c664	subs x9,x9,#0x1
00b7c668	str x8,[x0]
00b7c66c	b.eq 0x00b7c6cc
00b7c670	ldrb w10,[x8], #0x1
00b7c674	cbz w10,0x00b7c664
00b7c678	sub x8,x8,#0x1
00b7c67c	cmp x9,#0x4
00b7c680	b.ls 0x00b7c6b4
00b7c684	mov w8,#0xffffff9c
00b7c688	mov w0,w8
00b7c68c	ret
00b7c690	mov w8,#0xffffffa0
00b7c694	mov w0,w8
00b7c698	ret
00b7c69c	mov w8,#0xffffff9c
00b7c6a0	mov w0,w8
00b7c6a4	ret
00b7c6a8	mov w8,#0xffffff9c
00b7c6ac	mov w0,w8
00b7c6b0	ret
00b7c6b4	b.ne 0x00b7c6d8
00b7c6b8	sxtb w10,w10
00b7c6bc	tbz w10,#0x1f,0x00b7c6d8
00b7c6c0	mov w8,#0xffffff9c
00b7c6c4	mov w0,w8
00b7c6c8	ret
00b7c6cc	mov w0,wzr
00b7c6d0	str wzr,[x2]
00b7c6d4	ret
00b7c6d8	mov w11,wzr
00b7c6dc	add x10,x8,#0x1
00b7c6e0	mov w8,wzr
00b7c6e4	str wzr,[x2]
00b7c6e8	ldurb w12,[x10, #-0x1]
00b7c6ec	subs x9,x9,#0x1
00b7c6f0	bfm w12,w11,#0x18,#0x17
00b7c6f4	str w12,[x2]
00b7c6f8	str x10,[x0]
00b7c6fc	add x10,x10,#0x1
00b7c700	mov w11,w12
00b7c704	b.ne 0x00b7c6e8
00b7c708	mov w0,w8
00b7c70c	ret
