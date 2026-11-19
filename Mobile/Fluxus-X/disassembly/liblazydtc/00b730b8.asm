; mbedtls_ct_memcmp @ 00b730b8
00b730b8	cmp x2,#0x4
00b730bc	b.cs 0x00b730d4
00b730c0	mov w8,wzr
00b730c4	mov x11,xzr
00b730c8	cmp x11,x2
00b730cc	b.cc 0x00b73110
00b730d0	b 0x00b73138
00b730d4	mov x9,xzr
00b730d8	mov w8,wzr
00b730dc	add x10,x0,x9
00b730e0	add x12,x1,x9
00b730e4	ldr w10,[x10]
00b730e8	ldr w12,[x12]
00b730ec	add x11,x9,#0x4
00b730f0	add x9,x9,#0x8
00b730f4	eor w10,w12,w10
00b730f8	cmp x9,x2
00b730fc	orr w8,w10,w8
00b73100	mov x9,x11
00b73104	b.ls 0x00b730dc
00b73108	cmp x11,x2
00b7310c	b.cs 0x00b73138
00b73110	add x9,x0,x11
00b73114	add x10,x1,x11
00b73118	sub x11,x2,x11
00b7311c	ldrb w12,[x9], #0x1
00b73120	ldrb w13,[x10], #0x1
00b73124	subs x11,x11,#0x1
00b73128	eor w12,w13,w12
00b7312c	and w12,w12,#0xff
00b73130	orr w8,w8,w12
00b73134	b.ne 0x00b7311c
00b73138	and w9,w8,#0xffff
00b7313c	orr w0,w9,w8, LSR #0x10
00b73140	ret
