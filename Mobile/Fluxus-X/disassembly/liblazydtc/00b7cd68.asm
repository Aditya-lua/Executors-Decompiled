; mbedtls_asn1_get_alg @ 00b7cd68
00b7cd68	ldr x10,[x0]
00b7cd6c	sub x8,x1,x10
00b7cd70	cmp x8,#0x1
00b7cd74	b.lt 0x00b7cdc4
00b7cd78	ldrb w8,[x10]
00b7cd7c	cmp w8,#0x30
00b7cd80	b.ne 0x00b7cdcc
00b7cd84	add x9,x10,#0x1
00b7cd88	sub x8,x1,x9
00b7cd8c	cmp x8,#0x1
00b7cd90	str x9,[x0]
00b7cd94	b.lt 0x00b7cdd4
00b7cd98	ldrb w9,[x9]
00b7cd9c	tbnz w9,#0x7,0x00b7cddc
00b7cda0	add x8,x10,#0x2
00b7cda4	str x8,[x0]
00b7cda8	ldrb w9,[x10, #0x1]
00b7cdac	mov x10,x8
00b7cdb0	sub x10,x1,x10
00b7cdb4	cmp x9,x10
00b7cdb8	b.ls 0x00b7cdf4
00b7cdbc	mov w0,#0xffffffa0
00b7cdc0	ret
00b7cdc4	mov w0,#0xffffffa0
00b7cdc8	ret
00b7cdcc	mov w0,#0xffffff9e
00b7cdd0	ret
00b7cdd4	mov w0,#0xffffffa0
00b7cdd8	ret
00b7cddc	and w12,w9,#0x7f
00b7cde0	sub w11,w12,#0x1
00b7cde4	cmp w11,#0x3
00b7cde8	b.ls 0x00b7ce60
00b7cdec	mov w0,#0xffffff9c
00b7cdf0	ret
00b7cdf4	sub x10,x1,x8
00b7cdf8	cmp x10,#0x1
00b7cdfc	b.lt 0x00b7cea4
00b7ce00	ldrb w11,[x8]
00b7ce04	subs x10,x9,#0x1
00b7ce08	str w11,[x2]
00b7ce0c	b.lt 0x00b7ceac
00b7ce10	ldrb w11,[x8]
00b7ce14	cmp w11,#0x6
00b7ce18	b.ne 0x00b7ceb4
00b7ce1c	add x11,x8,#0x1
00b7ce20	cmp x10,#0x1
00b7ce24	str x11,[x0]
00b7ce28	b.lt 0x00b7cebc
00b7ce2c	ldrb w11,[x11]
00b7ce30	tbnz w11,#0x7,0x00b7cec4
00b7ce34	add x12,x8,#0x2
00b7ce38	str x12,[x0]
00b7ce3c	ldrb w10,[x8, #0x1]
00b7ce40	mov x11,x12
00b7ce44	str x10,[x2, #0x8]
00b7ce48	add x8,x8,x9
00b7ce4c	sub x9,x8,x12
00b7ce50	cmp x10,x9
00b7ce54	b.ls 0x00b7cedc
00b7ce58	mov w0,#0xffffffa0
00b7ce5c	ret
00b7ce60	cmp x8,x12
00b7ce64	b.le 0x00b7ce9c
00b7ce68	mov x9,xzr
00b7ce6c	add x8,x10,#0x2
00b7ce70	neg w12,w12
00b7ce74	str x8,[x0]
00b7ce78	ldrb w13,[x8], #0x1
00b7ce7c	adds w12,w12,#0x1
00b7ce80	bfm x13,x9,#0x38,#0x37
00b7ce84	mov x9,x13
00b7ce88	str x8,[x0]
00b7ce8c	b.ne 0x00b7ce78
00b7ce90	add x10,x10,x11
00b7ce94	add x10,x10,#0x3
00b7ce98	b 0x00b7cdb0
00b7ce9c	mov w0,#0xffffffa0
00b7cea0	ret
00b7cea4	mov w0,#0xffffffa0
00b7cea8	ret
00b7ceac	mov w0,#0xffffffa0
00b7ceb0	ret
00b7ceb4	mov w0,#0xffffff9e
00b7ceb8	ret
00b7cebc	mov w0,#0xffffffa0
00b7cec0	ret
00b7cec4	and w13,w11,#0x7f
00b7cec8	sub w12,w13,#0x1
00b7cecc	cmp w12,#0x3
00b7ced0	b.ls 0x00b7cf2c
00b7ced4	mov w0,#0xffffff9c
00b7ced8	ret
00b7cedc	str x11,[x2, #0x10]
00b7cee0	ldr x9,[x0]
00b7cee4	add x12,x9,x10
00b7cee8	cmp x12,x8
00b7ceec	str x12,[x0]
00b7cef0	b.eq 0x00b7cf78
00b7cef4	ldrb w11,[x12], #0x1
00b7cef8	str w11,[x3]
00b7cefc	sub x11,x8,x12
00b7cf00	cmp x11,#0x1
00b7cf04	str x12,[x0]
00b7cf08	b.lt 0x00b7cf98
00b7cf0c	ldrb w13,[x12]
00b7cf10	tbnz w13,#0x7,0x00b7cfa0
00b7cf14	add x9,x12,#0x1
00b7cf18	str x9,[x0]
00b7cf1c	ldrb w11,[x12]
00b7cf20	mov x12,x9
00b7cf24	str x11,[x3, #0x8]
00b7cf28	b 0x00b7cffc
00b7cf2c	cmp x10,x13
00b7cf30	b.le 0x00b7cf70
00b7cf34	mov x10,xzr
00b7cf38	add x11,x8,#0x2
00b7cf3c	neg w13,w13
00b7cf40	str xzr,[x2, #0x8]
00b7cf44	str x11,[x0]
00b7cf48	ldrb w14,[x11], #0x1
00b7cf4c	adds w13,w13,#0x1
00b7cf50	bfm x14,x10,#0x38,#0x37
00b7cf54	mov x10,x14
00b7cf58	str x14,[x2, #0x8]
00b7cf5c	str x11,[x0]
00b7cf60	b.ne 0x00b7cf48
00b7cf64	add x12,x8,x12
00b7cf68	add x12,x12,#0x3
00b7cf6c	b 0x00b7ce48
00b7cf70	mov w0,#0xffffffa0
00b7cf74	ret
00b7cf78	stp x29,x30,[sp, #-0x10]!
00b7cf7c	mov x29,sp
00b7cf80	orr w1,wzr,#0x18
00b7cf84	mov x0,x3
00b7cf88	bl 0x00c42220
00b7cf8c	mov w0,wzr
00b7cf90	ldp x29,x30,[sp], #0x10
00b7cf94	ret
00b7cf98	mov w0,#0xffffffa0
00b7cf9c	ret
00b7cfa0	and w13,w13,#0x7f
00b7cfa4	sub w14,w13,#0x1
00b7cfa8	cmp w14,#0x3
00b7cfac	b.ls 0x00b7cfb8
00b7cfb0	mov w0,#0xffffff9c
00b7cfb4	ret
00b7cfb8	cmp x11,x13
00b7cfbc	b.le 0x00b7d030
00b7cfc0	add x10,x10,x14
00b7cfc4	mov x11,xzr
00b7cfc8	add x12,x12,#0x1
00b7cfcc	add x10,x10,#0x3
00b7cfd0	neg w13,w13
00b7cfd4	str xzr,[x3, #0x8]
00b7cfd8	str x12,[x0]
00b7cfdc	ldrb w14,[x12], #0x1
00b7cfe0	adds w13,w13,#0x1
00b7cfe4	bfm x14,x11,#0x38,#0x37
00b7cfe8	mov x11,x14
00b7cfec	str x14,[x3, #0x8]
00b7cff0	str x12,[x0]
00b7cff4	b.ne 0x00b7cfdc
00b7cff8	add x9,x9,x10
00b7cffc	sub x9,x8,x9
00b7d000	cmp x11,x9
00b7d004	b.ls 0x00b7d010
00b7d008	mov w0,#0xffffffa0
00b7d00c	ret
00b7d010	str x12,[x3, #0x10]
00b7d014	ldr x9,[x0]
00b7d018	add x9,x9,x11
00b7d01c	cmp x9,x8
00b7d020	mov w8,#0xffffff9a
00b7d024	str x9,[x0]
00b7d028	csel w0,wzr,w8,eq
00b7d02c	ret
00b7d030	mov w0,#0xffffffa0
00b7d034	ret
