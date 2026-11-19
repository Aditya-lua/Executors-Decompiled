; mbedtls_asn1_traverse_sequence_of @ 00b7c924
00b7c924	str x27,[sp, #-0x60]!
00b7c928	stp x26,x25,[sp, #0x10]
00b7c92c	stp x24,x23,[sp, #0x20]
00b7c930	stp x22,x21,[sp, #0x30]
00b7c934	stp x20,x19,[sp, #0x40]
00b7c938	stp x29,x30,[sp, #0x50]
00b7c93c	add x29,sp,#0x50
00b7c940	ldr x9,[x0]
00b7c944	mov x19,x7
00b7c948	mov x20,x6
00b7c94c	mov w21,w5
00b7c950	sub x8,x1,x9
00b7c954	mov w22,w4
00b7c958	mov w23,w3
00b7c95c	mov x24,x0
00b7c960	mov x25,x1
00b7c964	cmp x8,#0x1
00b7c968	mov w26,w2
00b7c96c	b.lt 0x00b7caf8
00b7c970	ldrb w8,[x9]
00b7c974	cmp w8,#0x30
00b7c978	b.ne 0x00b7cb00
00b7c97c	add x10,x9,#0x1
00b7c980	sub x8,x25,x10
00b7c984	cmp x8,#0x1
00b7c988	str x10,[x24]
00b7c98c	b.lt 0x00b7caf8
00b7c990	ldrb w10,[x10]
00b7c994	tbnz w10,#0x7,0x00b7c9c8
00b7c998	add x8,x9,#0x2
00b7c99c	str x8,[x24]
00b7c9a0	ldrb w10,[x9, #0x1]
00b7c9a4	mov x9,x8
00b7c9a8	sub x9,x25,x9
00b7c9ac	cmp x10,x9
00b7c9b0	b.hi 0x00b7caf8
00b7c9b4	add x9,x8,x10
00b7c9b8	cmp x9,x25
00b7c9bc	b.eq 0x00b7ca1c
00b7c9c0	mov w0,#0xffffff9a
00b7c9c4	b 0x00b7cb04
00b7c9c8	and w12,w10,#0x7f
00b7c9cc	sub w11,w12,#0x1
00b7c9d0	cmp w11,#0x3
00b7c9d4	b.ls 0x00b7c9e0
00b7c9d8	mov w0,#0xffffff9c
00b7c9dc	b 0x00b7cb04
00b7c9e0	cmp x8,x12
00b7c9e4	b.le 0x00b7caf8
00b7c9e8	mov x10,xzr
00b7c9ec	add x8,x9,#0x2
00b7c9f0	neg w12,w12
00b7c9f4	str x8,[x24]
00b7c9f8	ldrb w13,[x8], #0x1
00b7c9fc	adds w12,w12,#0x1
00b7ca00	bfm x13,x10,#0x38,#0x37
00b7ca04	mov x10,x13
00b7ca08	str x8,[x24]
00b7ca0c	b.ne 0x00b7c9f8
00b7ca10	add x9,x9,x11
00b7ca14	add x9,x9,#0x3
00b7ca18	b 0x00b7c9a8
00b7ca1c	cmp x8,x25
00b7ca20	mov w0,wzr
00b7ca24	b.cs 0x00b7cb04
00b7ca28	add x9,x8,#0x1
00b7ca2c	str x9,[x24]
00b7ca30	ldrb w1,[x8]
00b7ca34	and w10,w1,w26
00b7ca38	cmp w10,w23, UXTB 
00b7ca3c	b.ne 0x00b7cb00
00b7ca40	sub x10,x25,x9
00b7ca44	cmp x10,#0x1
00b7ca48	b.lt 0x00b7caf8
00b7ca4c	ldrb w9,[x9]
00b7ca50	tbnz w9,#0x7,0x00b7ca68
00b7ca54	add x2,x8,#0x2
00b7ca58	str x2,[x24]
00b7ca5c	ldrb w27,[x8, #0x1]
00b7ca60	mov x8,x2
00b7ca64	b 0x00b7cab0
00b7ca68	and w11,w9,#0x7f
00b7ca6c	sub w9,w11,#0x1
00b7ca70	cmp w9,#0x3
00b7ca74	b.hi 0x00b7c9d8
00b7ca78	cmp x10,x11
00b7ca7c	b.le 0x00b7caf8
00b7ca80	mov x27,xzr
00b7ca84	add x2,x8,#0x2
00b7ca88	neg w10,w11
00b7ca8c	str x2,[x24]
00b7ca90	ldrb w11,[x2], #0x1
00b7ca94	adds w10,w10,#0x1
00b7ca98	bfm x11,x27,#0x38,#0x37
00b7ca9c	mov x27,x11
00b7caa0	str x2,[x24]
00b7caa4	b.ne 0x00b7ca90
00b7caa8	add x8,x8,x9
00b7caac	add x8,x8,#0x3
00b7cab0	sub x8,x25,x8
00b7cab4	cmp x27,x8
00b7cab8	b.hi 0x00b7caf8
00b7cabc	cbz x20,0x00b7cae0
00b7cac0	and w8,w1,w22
00b7cac4	cmp w8,w21, UXTB 
00b7cac8	b.ne 0x00b7cae0
00b7cacc	mov x0,x19
00b7cad0	mov x3,x27
00b7cad4	blr x20
00b7cad8	cbnz w0,0x00b7cb04
00b7cadc	ldr x2,[x24]
00b7cae0	add x8,x2,x27
00b7cae4	mov w0,wzr
00b7cae8	cmp x8,x25
00b7caec	str x8,[x24]
00b7caf0	b.cc 0x00b7ca28
00b7caf4	b 0x00b7cb04
00b7caf8	mov w0,#0xffffffa0
00b7cafc	b 0x00b7cb04
00b7cb00	mov w0,#0xffffff9e
00b7cb04	ldp x29,x30,[sp, #0x50]
00b7cb08	ldp x20,x19,[sp, #0x40]
00b7cb0c	ldp x22,x21,[sp, #0x30]
00b7cb10	ldp x24,x23,[sp, #0x20]
00b7cb14	ldp x26,x25,[sp, #0x10]
00b7cb18	ldr x27,[sp], #0x60
00b7cb1c	ret
