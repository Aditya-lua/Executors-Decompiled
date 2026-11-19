; mbedtls_asn1_get_len @ 00b7c13c
00b7c13c	ldr x10,[x0]
00b7c140	sub x8,x1,x10
00b7c144	cmp x8,#0x1
00b7c148	b.lt 0x00b7c178
00b7c14c	ldrb w9,[x10]
00b7c150	tbnz w9,#0x7,0x00b7c180
00b7c154	add x8,x10,#0x1
00b7c158	str x8,[x0]
00b7c15c	ldrb w11,[x10]
00b7c160	str x11,[x2]
00b7c164	sub x8,x1,x8
00b7c168	cmp x11,x8
00b7c16c	mov w8,#0xffffffa0
00b7c170	csel w0,w8,wzr,hi
00b7c174	ret
00b7c178	mov w0,#0xffffffa0
00b7c17c	ret
00b7c180	and w11,w9,#0x7f
00b7c184	sub w9,w11,#0x1
00b7c188	cmp w9,#0x3
00b7c18c	b.ls 0x00b7c198
00b7c190	mov w0,#0xffffff9c
00b7c194	ret
00b7c198	cmp x8,x11
00b7c19c	b.le 0x00b7c1d4
00b7c1a0	mov x9,xzr
00b7c1a4	add x8,x10,#0x1
00b7c1a8	neg w10,w11
00b7c1ac	str xzr,[x2]
00b7c1b0	str x8,[x0]
00b7c1b4	ldrb w11,[x8], #0x1
00b7c1b8	adds w10,w10,#0x1
00b7c1bc	bfm x11,x9,#0x38,#0x37
00b7c1c0	mov x9,x11
00b7c1c4	str x11,[x2]
00b7c1c8	str x8,[x0]
00b7c1cc	b.ne 0x00b7c1b4
00b7c1d0	b 0x00b7c164
00b7c1d4	mov w0,#0xffffffa0
00b7c1d8	ret
