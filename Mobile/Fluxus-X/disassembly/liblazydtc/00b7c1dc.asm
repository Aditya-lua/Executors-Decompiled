; mbedtls_asn1_get_tag @ 00b7c1dc
00b7c1dc	ldr x8,[x0]
00b7c1e0	sub x9,x1,x8
00b7c1e4	cmp x9,#0x1
00b7c1e8	b.lt 0x00b7c228
00b7c1ec	ldrb w9,[x8]
00b7c1f0	cmp w9,w3
00b7c1f4	b.ne 0x00b7c230
00b7c1f8	add x10,x8,#0x1
00b7c1fc	sub x9,x1,x10
00b7c200	cmp x9,#0x1
00b7c204	str x10,[x0]
00b7c208	b.lt 0x00b7c238
00b7c20c	ldrb w10,[x10]
00b7c210	tbnz w10,#0x7,0x00b7c240
00b7c214	add x10,x8,#0x2
00b7c218	str x10,[x0]
00b7c21c	ldrb w9,[x8, #0x1]
00b7c220	str x9,[x2]
00b7c224	b 0x00b7c2a0
00b7c228	mov w0,#0xffffffa0
00b7c22c	ret
00b7c230	mov w0,#0xffffff9e
00b7c234	ret
00b7c238	mov w0,#0xffffffa0
00b7c23c	ret
00b7c240	and w12,w10,#0x7f
00b7c244	sub w10,w12,#0x1
00b7c248	cmp w10,#0x3
00b7c24c	b.ls 0x00b7c258
00b7c250	mov w0,#0xffffff9c
00b7c254	ret
00b7c258	cmp x9,x12
00b7c25c	b.le 0x00b7c2b4
00b7c260	mov x9,xzr
00b7c264	add x13,x8,#0x2
00b7c268	add x10,x10,#0x3
00b7c26c	add x11,x8,#0x3
00b7c270	neg w12,w12
00b7c274	str xzr,[x2]
00b7c278	str x13,[x0]
00b7c27c	ldurb w13,[x11, #-0x1]
00b7c280	adds w12,w12,#0x1
00b7c284	bfm x13,x9,#0x38,#0x37
00b7c288	mov x9,x13
00b7c28c	str x13,[x2]
00b7c290	str x11,[x0]
00b7c294	add x11,x11,#0x1
00b7c298	b.ne 0x00b7c27c
00b7c29c	add x10,x8,x10
00b7c2a0	sub x8,x1,x10
00b7c2a4	cmp x9,x8
00b7c2a8	mov w8,#0xffffffa0
00b7c2ac	csel w0,w8,wzr,hi
00b7c2b0	ret
00b7c2b4	mov w0,#0xffffffa0
00b7c2b8	ret
