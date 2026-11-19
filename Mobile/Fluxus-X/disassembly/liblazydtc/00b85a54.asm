; mbedtls_asn1_write_enum @ 00b85a54
00b85a54	mov w8,#0x1
00b85a58	ldr x9,[x0]
00b85a5c	sub x10,x9,x1
00b85a60	cmp x10,#0x1
00b85a64	b.lt 0x00b85aa4
00b85a68	sub x10,x9,#0x1
00b85a6c	cmp w2,#0xff
00b85a70	str x10,[x0]
00b85a74	sturb w2,[x9, #-0x1]
00b85a78	asr w2,w2,#0x8
00b85a7c	add x8,x8,#0x1
00b85a80	b.gt 0x00b85a58
00b85a84	ldr x9,[x0]
00b85a88	ldrsb w10,[x9]
00b85a8c	tbnz w10,#0x1f,0x00b85aac
00b85a90	sub x8,x8,#0x1
00b85a94	lsr x9,x8,#0x20
00b85a98	cbz x9,0x00b85acc
00b85a9c	mov w0,#0xffffff9c
00b85aa0	ret
00b85aa4	mov w0,#0xffffff94
00b85aa8	ret
00b85aac	sub x10,x9,x1
00b85ab0	cmp x10,#0x1
00b85ab4	b.lt 0x00b85b74
00b85ab8	sub x10,x9,#0x1
00b85abc	str x10,[x0]
00b85ac0	sturb wzr,[x9, #-0x1]
00b85ac4	lsr x9,x8,#0x20
00b85ac8	cbnz x9,0x00b85a9c
00b85acc	mov w9,#0x1
00b85ad0	cmp x8,#0x80
00b85ad4	b.cc 0x00b85ae8
00b85ad8	mov x10,x8
00b85adc	lsr x10,x10,#0x8
00b85ae0	add w9,w9,#0x1
00b85ae4	cbnz x10,0x00b85adc
00b85ae8	ldr x11,[x0]
00b85aec	sub x10,x11,x1
00b85af0	cmp x10,w9, UXTW 
00b85af4	b.ge 0x00b85b00
00b85af8	mov w0,#0xffffff94
00b85afc	ret
00b85b00	sub x12,x11,#0x1
00b85b04	lsr x10,x8,#0x8
00b85b08	str x12,[x0]
00b85b0c	sturb w8,[x11, #-0x1]
00b85b10	cbz x10,0x00b85b2c
00b85b14	ldr x11,[x0]
00b85b18	sub x12,x11,#0x1
00b85b1c	str x12,[x0]
00b85b20	sturb w10,[x11, #-0x1]
00b85b24	lsr x10,x10,#0x8
00b85b28	cbnz x10,0x00b85b14
00b85b2c	cmp w9,#0x2
00b85b30	b.cc 0x00b85b48
00b85b34	ldr x10,[x0]
00b85b38	add w11,w9,#0x7f
00b85b3c	sub x12,x10,#0x1
00b85b40	str x12,[x0]
00b85b44	sturb w11,[x10, #-0x1]
00b85b48	ldr x10,[x0]
00b85b4c	sub x11,x10,x1
00b85b50	cmp x11,#0x1
00b85b54	b.lt 0x00b85b7c
00b85b58	sub x11,x10,#0x1
00b85b5c	add w8,w8,w9
00b85b60	mov w12,#0xa
00b85b64	str x11,[x0]
00b85b68	add w0,w8,#0x1
00b85b6c	sturb w12,[x10, #-0x1]
00b85b70	ret
00b85b74	mov w0,#0xffffff94
00b85b78	ret
00b85b7c	mov w0,#0xffffff94
00b85b80	ret
