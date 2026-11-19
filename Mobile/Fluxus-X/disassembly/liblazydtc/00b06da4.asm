; X509_check_email @ 00b06da4
00b06da4	stp x22,x21,[sp, #-0x30]!
00b06da8	stp x20,x19,[sp, #0x10]
00b06dac	stp x29,x30,[sp, #0x20]
00b06db0	add x29,sp,#0x20
00b06db4	cbz x1,0x00b06de4
00b06db8	mov w19,w3
00b06dbc	mov x22,x2
00b06dc0	mov x20,x1
00b06dc4	mov x21,x0
00b06dc8	cbz x2,0x00b06df8
00b06dcc	subs x8,x22,#0x1
00b06dd0	csinc x2,x8,xzr,ne
00b06dd4	mov x0,x20
00b06dd8	mov w1,wzr
00b06ddc	bl 0x00c300a0
00b06de0	cbz x0,0x00b06e04
00b06de4	ldp x29,x30,[sp, #0x20]
00b06de8	ldp x20,x19,[sp, #0x10]
00b06dec	orr w0,wzr,#0xfffffffe
00b06df0	ldp x22,x21,[sp], #0x30
00b06df4	ret
00b06df8	mov x0,x20
00b06dfc	bl 0x00c2ff50
00b06e00	mov x22,x0
00b06e04	cmp x22,#0x2
00b06e08	b.cc 0x00b06e1c
00b06e0c	sub x8,x22,#0x1
00b06e10	ldrb w9,[x20, x8]
00b06e14	cmp w9,#0x0
00b06e18	csel x22,x8,x22,eq
00b06e1c	mov x1,x20
00b06e20	mov w3,w19
00b06e24	ldp x29,x30,[sp, #0x20]
00b06e28	ldp x20,x19,[sp, #0x10]
00b06e2c	mov w4,#0x1
00b06e30	mov x0,x21
00b06e34	mov x2,x22
00b06e38	mov x5,xzr
00b06e3c	ldp x22,x21,[sp], #0x30
00b06e40	b 0x00b06b10
