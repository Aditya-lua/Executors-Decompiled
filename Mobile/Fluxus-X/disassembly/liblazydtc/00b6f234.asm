; mbedtls_aes_crypt_cfb128 @ 00b6f234
00b6f234	str x25,[sp, #-0x50]!
00b6f238	stp x24,x23,[sp, #0x10]
00b6f23c	stp x22,x21,[sp, #0x20]
00b6f240	stp x20,x19,[sp, #0x30]
00b6f244	stp x29,x30,[sp, #0x40]
00b6f248	add x29,sp,#0x40
00b6f24c	mov x20,x6
00b6f250	mov x21,x5
00b6f254	mov x22,x4
00b6f258	mov x19,x3
00b6f25c	mov x23,x2
00b6f260	cmp w1,#0x1
00b6f264	mov x24,x0
00b6f268	b.hi 0x00b6f278
00b6f26c	ldr x25,[x19]
00b6f270	cmp x25,#0xf
00b6f274	b.ls 0x00b6f280
00b6f278	orr w0,wzr,#0xffffffdf
00b6f27c	b 0x00b6f308
00b6f280	cbz w1,0x00b6f2c4
00b6f284	cbz x23,0x00b6f300
00b6f288	cbnz x25,0x00b6f29c
00b6f28c	mov x0,x24
00b6f290	mov x1,x22
00b6f294	mov x2,x22
00b6f298	bl 0x00c419a0
00b6f29c	ldrb w8,[x22, x25]
00b6f2a0	ldrb w9,[x21], #0x1
00b6f2a4	add w10,w25,#0x1
00b6f2a8	subs x23,x23,#0x1
00b6f2ac	eor w8,w9,w8
00b6f2b0	strb w8,[x20], #0x1
00b6f2b4	strb w8,[x22, x25]
00b6f2b8	and x25,x10,#0xf
00b6f2bc	b.ne 0x00b6f288
00b6f2c0	b 0x00b6f300
00b6f2c4	cbz x23,0x00b6f300
00b6f2c8	cbnz x25,0x00b6f2dc
00b6f2cc	mov x0,x24
00b6f2d0	mov x1,x22
00b6f2d4	mov x2,x22
00b6f2d8	bl 0x00c419a0
00b6f2dc	ldrb w8,[x21], #0x1
00b6f2e0	ldrb w9,[x22, x25]
00b6f2e4	add w10,w25,#0x1
00b6f2e8	subs x23,x23,#0x1
00b6f2ec	eor w9,w9,w8
00b6f2f0	strb w9,[x20], #0x1
00b6f2f4	strb w8,[x22, x25]
00b6f2f8	and x25,x10,#0xf
00b6f2fc	b.ne 0x00b6f2c8
00b6f300	mov w0,wzr
00b6f304	str x25,[x19]
00b6f308	ldp x29,x30,[sp, #0x40]
00b6f30c	ldp x20,x19,[sp, #0x30]
00b6f310	ldp x22,x21,[sp, #0x20]
00b6f314	ldp x24,x23,[sp, #0x10]
00b6f318	ldr x25,[sp], #0x50
00b6f31c	ret
