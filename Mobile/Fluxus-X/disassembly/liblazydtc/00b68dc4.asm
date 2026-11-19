; tls1_cbc_remove_padding_and_mac @ 00b68dc4
00b68dc4	str x21,[sp, #-0x20]!
00b68dc8	stp x20,x19,[sp, #0x10]
00b68dcc	ldr x9,[x0]
00b68dd0	cmp x5,#0x1
00b68dd4	cinc x11,x6,ne
00b68dd8	mov w8,wzr
00b68ddc	cmp x11,x9
00b68de0	b.hi 0x00b68e18
00b68de4	ldr x8,[sp, #0x20]
00b68de8	cmp x5,#0x1
00b68dec	b.ne 0x00b68df8
00b68df0	mov x7,#-0x1
00b68df4	b 0x00b68f2c
00b68df8	sub x14,x9,#0x1
00b68dfc	ldrb w10,[x2, x14]
00b68e00	cbz w7,0x00b68e28
00b68e04	mvn x8,x6
00b68e08	add x8,x9,x8
00b68e0c	sub x8,x8,x10
00b68e10	str x8,[x0]
00b68e14	mov w8,#0x1
00b68e18	ldp x20,x19,[sp, #0x10]
00b68e1c	mov w0,w8
00b68e20	ldr x21,[sp], #0x20
00b68e24	ret
00b68e28	add x11,x11,x10
00b68e2c	sub x16,x9,x11
00b68e30	eor x13,x11,x9
00b68e34	eor x11,x16,x11
00b68e38	cmp x9,#0x100
00b68e3c	mov w12,#0x100
00b68e40	orr x11,x11,x13
00b68e44	mov x15,#-0x1
00b68e48	csel x12,x9,x12,cc
00b68e4c	eor x11,x11,x9
00b68e50	ands w13,w12,#0x1ff
00b68e54	eor x11,x15,x11, ASR #0x3f
00b68e58	b.eq 0x00b68f10
00b68e5c	cmp w13,#0x1
00b68e60	b.ne 0x00b68e6c
00b68e64	mov x13,xzr
00b68e68	b 0x00b68ed8
00b68e6c	and x13,x12,#0x1fe
00b68e70	sub x15,x10,#0x1
00b68e74	add x17,x2,x14
00b68e78	mov x16,#-0x1
00b68e7c	mov x18,x13
00b68e80	ldrb w20,[x17]
00b68e84	ldurb w21,[x17, #-0x1]
00b68e88	add x7,x15,#0x1
00b68e8c	asr x19,x15,#0x3f
00b68e90	asr x7,x7,#0x3f
00b68e94	eor w20,w20,w10
00b68e98	eor w21,w21,w10
00b68e9c	bic w7,w20,w7
00b68ea0	bic w19,w21,w19
00b68ea4	mvn w7,w7
00b68ea8	mvn w19,w19
00b68eac	orr x7,x7,#-0x100
00b68eb0	orr x19,x19,#-0x100
00b68eb4	sub x15,x15,#0x2
00b68eb8	subs x18,x18,#0x2
00b68ebc	and x11,x11,x7
00b68ec0	and x16,x16,x19
00b68ec4	sub x17,x17,#0x2
00b68ec8	b.ne 0x00b68e80
00b68ecc	cmp x12,x13
00b68ed0	and x11,x16,x11
00b68ed4	b.eq 0x00b68f10
00b68ed8	sub x14,x14,x13
00b68edc	add x14,x2,x14
00b68ee0	sub x15,x10,x13
00b68ee4	ldrb w16,[x14], #-0x1
00b68ee8	asr x17,x15,#0x3f
00b68eec	add x13,x13,#0x1
00b68ef0	cmp x13,x12
00b68ef4	eor w16,w16,w10
00b68ef8	bic w16,w16,w17
00b68efc	mvn w16,w16
00b68f00	orr x16,x16,#-0x100
00b68f04	and x11,x11,x16
00b68f08	sub x15,x15,#0x1
00b68f0c	b.cc 0x00b68ee4
00b68f10	orr w12,wzr,#0xfe
00b68f14	sub x11,x12,w11, UXTB 
00b68f18	asr x7,x11,#0x3f
00b68f1c	add x10,x10,#0x1
00b68f20	and x10,x7,x10
00b68f24	sub x9,x9,x10
00b68f28	str x9,[x0]
00b68f2c	ldp x20,x19,[sp, #0x10]
00b68f30	str x8,[sp, #0x20]
00b68f34	ldr x21,[sp], #0x20
00b68f38	b 0x00b68b58
