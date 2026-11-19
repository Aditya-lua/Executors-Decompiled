; ossl_rsa_padding_add_PKCS1_type_2_ex @ 00ad5d34
00ad5d34	stp x24,x23,[sp, #-0x40]!
00ad5d38	sub w8,w2,#0xb
00ad5d3c	cmp w8,w4
00ad5d40	stp x22,x21,[sp, #0x10]
00ad5d44	stp x20,x19,[sp, #0x20]
00ad5d48	stp x29,x30,[sp, #0x30]
00ad5d4c	add x29,sp,#0x30
00ad5d50	b.ge 0x00ad5d7c
00ad5d54	bl 0x00c342a0
00ad5d58	adrp x0,0x2d8000
00ad5d5c	adrp x2,0x2c4000
00ad5d60	add x0,x0,#0x794
00ad5d64	add x2,x2,#0x211
00ad5d68	mov w1,#0x81
00ad5d6c	bl 0x00c342b0
00ad5d70	mov w0,#0x4
00ad5d74	mov w1,#0x6e
00ad5d78	b 0x00ad5e3c
00ad5d7c	mov w20,w4
00ad5d80	tbnz w4,#0x1f,0x00ad5e18
00ad5d84	mov x21,x1
00ad5d88	mov w8,#0x200
00ad5d8c	sub w9,w2,#0x3
00ad5d90	strh w8,[x21], #0x2
00ad5d94	sub w23,w9,w20
00ad5d98	mov x19,x3
00ad5d9c	sxtw x2,w23
00ad5da0	mov x1,x21
00ad5da4	mov w3,wzr
00ad5da8	mov x22,x0
00ad5dac	bl 0x00c347b0
00ad5db0	cmp w0,#0x1
00ad5db4	b.lt 0x00ad5e44
00ad5db8	cmp w23,#0x1
00ad5dbc	b.lt 0x00ad5dfc
00ad5dc0	mov w24,wzr
00ad5dc4	ldrb w8,[x21]
00ad5dc8	cbnz w8,0x00ad5dec
00ad5dcc	mov w2,#0x1
00ad5dd0	mov x0,x22
00ad5dd4	mov x1,x21
00ad5dd8	mov w3,wzr
00ad5ddc	bl 0x00c347b0
00ad5de0	cmp w0,#0x1
00ad5de4	b.ge 0x00ad5dc4
00ad5de8	b 0x00ad5e44
00ad5dec	add w24,w24,#0x1
00ad5df0	cmp w24,w23
00ad5df4	add x21,x21,#0x1
00ad5df8	b.lt 0x00ad5dc4
00ad5dfc	strb wzr,[x21], #0x1
00ad5e00	mov w2,w20
00ad5e04	mov x0,x21
00ad5e08	mov x1,x19
00ad5e0c	bl 0x00c2ffd0
00ad5e10	mov w0,#0x1
00ad5e14	b 0x00ad5e48
00ad5e18	bl 0x00c342a0
00ad5e1c	adrp x0,0x2d8000
00ad5e20	adrp x2,0x2c4000
00ad5e24	add x0,x0,#0x794
00ad5e28	add x2,x2,#0x211
00ad5e2c	mov w1,#0x84
00ad5e30	bl 0x00c342b0
00ad5e34	mov w0,#0x4
00ad5e38	mov w1,#0xb5
00ad5e3c	mov x2,xzr
00ad5e40	bl 0x00c342c0
00ad5e44	mov w0,wzr
00ad5e48	ldp x29,x30,[sp, #0x30]
00ad5e4c	ldp x20,x19,[sp, #0x20]
00ad5e50	ldp x22,x21,[sp, #0x10]
00ad5e54	ldp x24,x23,[sp], #0x40
00ad5e58	ret
