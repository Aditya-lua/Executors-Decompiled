; ossl_ec_GF2m_simple_group_set_curve @ 00a29d8c
00a29d8c	stp x22,x21,[sp, #-0x30]!
00a29d90	stp x20,x19,[sp, #0x10]
00a29d94	stp x29,x30,[sp, #0x20]
00a29d98	mov x19,x0
00a29d9c	ldr x0,[x0, #0x40]
00a29da0	add x29,sp,#0x20
00a29da4	mov x20,x3
00a29da8	mov x22,x2
00a29dac	bl 0x00c36990
00a29db0	cbz x0,0x00a29e8c
00a29db4	ldr x0,[x19, #0x40]
00a29db8	add x21,x19,#0x48
00a29dbc	orr w2,wzr,#0x6
00a29dc0	mov x1,x21
00a29dc4	bl 0x00c38bc0
00a29dc8	orr w8,w0,#0x2
00a29dcc	cmp w8,#0x6
00a29dd0	b.ne 0x00a29e5c
00a29dd4	ldr x0,[x19, #0x60]
00a29dd8	mov x1,x22
00a29ddc	mov x2,x21
00a29de0	bl 0x00c38b50
00a29de4	cbz w0,0x00a29e8c
00a29de8	ldr w8,[x19, #0x48]
00a29dec	ldr x0,[x19, #0x60]
00a29df0	add w9,w8,#0x3f
00a29df4	add w8,w8,#0x7e
00a29df8	cmp w9,#0x0
00a29dfc	csel w8,w8,w9,lt
00a29e00	asr w1,w8,#0x6
00a29e04	bl 0x00c38e80
00a29e08	cbz x0,0x00a29e8c
00a29e0c	ldr x0,[x19, #0x60]
00a29e10	bl 0x00c38c00
00a29e14	ldr x0,[x19, #0x68]
00a29e18	mov x1,x20
00a29e1c	mov x2,x21
00a29e20	bl 0x00c38b50
00a29e24	cbz w0,0x00a29e8c
00a29e28	ldr w8,[x19, #0x48]
00a29e2c	ldr x0,[x19, #0x68]
00a29e30	add w9,w8,#0x3f
00a29e34	add w8,w8,#0x7e
00a29e38	cmp w9,#0x0
00a29e3c	csel w8,w8,w9,lt
00a29e40	asr w1,w8,#0x6
00a29e44	bl 0x00c38e80
00a29e48	cbz x0,0x00a29e8c
00a29e4c	ldr x0,[x19, #0x68]
00a29e50	bl 0x00c38c00
00a29e54	mov w0,#0x1
00a29e58	b 0x00a29e8c
00a29e5c	bl 0x00c342a0
00a29e60	adrp x0,0x29e000
00a29e64	adrp x2,0x2c1000
00a29e68	add x0,x0,#0x82
00a29e6c	add x2,x2,#0xae0
00a29e70	orr w1,wzr,#0x70
00a29e74	bl 0x00c342b0
00a29e78	mov w0,#0x10
00a29e7c	mov w1,#0x83
00a29e80	mov x2,xzr
00a29e84	bl 0x00c342c0
00a29e88	mov w0,wzr
00a29e8c	ldp x29,x30,[sp, #0x20]
00a29e90	ldp x20,x19,[sp, #0x10]
00a29e94	ldp x22,x21,[sp], #0x30
00a29e98	ret
