; mbedtls_asn1_get_bool @ 00b7c2bc
00b7c2bc	ldr x8,[x0]
00b7c2c0	sub x9,x1,x8
00b7c2c4	cmp x9,#0x1
00b7c2c8	b.lt 0x00b7c308
00b7c2cc	ldrb w9,[x8]
00b7c2d0	cmp w9,#0x1
00b7c2d4	b.ne 0x00b7c314
00b7c2d8	add x10,x8,#0x1
00b7c2dc	sub x9,x1,x10
00b7c2e0	cmp x9,#0x1
00b7c2e4	str x10,[x0]
00b7c2e8	b.lt 0x00b7c320
00b7c2ec	ldrb w10,[x10]
00b7c2f0	tbnz w10,#0x7,0x00b7c32c
00b7c2f4	add x9,x8,#0x2
00b7c2f8	str x9,[x0]
00b7c2fc	ldrb w10,[x8, #0x1]
00b7c300	mov x8,x9
00b7c304	b 0x00b7c380
00b7c308	mov w8,#0xffffffa0
00b7c30c	mov w0,w8
00b7c310	ret
00b7c314	mov w8,#0xffffff9e
00b7c318	mov w0,w8
00b7c31c	ret
00b7c320	mov w8,#0xffffffa0
00b7c324	mov w0,w8
00b7c328	ret
00b7c32c	and w12,w10,#0x7f
00b7c330	sub w11,w12,#0x1
00b7c334	cmp w11,#0x3
00b7c338	b.ls 0x00b7c348
00b7c33c	mov w8,#0xffffff9c
00b7c340	mov w0,w8
00b7c344	ret
00b7c348	cmp x9,x12
00b7c34c	b.le 0x00b7c3cc
00b7c350	mov x10,xzr
00b7c354	add x9,x8,#0x2
00b7c358	neg w12,w12
00b7c35c	str x9,[x0]
00b7c360	ldrb w13,[x9], #0x1
00b7c364	adds w12,w12,#0x1
00b7c368	bfm x13,x10,#0x38,#0x37
00b7c36c	mov x10,x13
00b7c370	str x9,[x0]
00b7c374	b.ne 0x00b7c360
00b7c378	add x8,x8,x11
00b7c37c	add x8,x8,#0x3
00b7c380	sub x8,x1,x8
00b7c384	cmp x10,x8
00b7c388	b.ls 0x00b7c398
00b7c38c	mov w8,#0xffffffa0
00b7c390	mov w0,w8
00b7c394	ret
00b7c398	cmp x10,#0x1
00b7c39c	b.ne 0x00b7c3c0
00b7c3a0	ldrb w10,[x9], #0x1
00b7c3a4	mov w8,wzr
00b7c3a8	cmp w10,#0x0
00b7c3ac	cset w10,ne
00b7c3b0	str w10,[x2]
00b7c3b4	str x9,[x0]
00b7c3b8	mov w0,w8
00b7c3bc	ret
00b7c3c0	mov w8,#0xffffff9c
00b7c3c4	mov w0,w8
00b7c3c8	ret
00b7c3cc	mov w8,#0xffffffa0
00b7c3d0	mov w0,w8
00b7c3d4	ret
