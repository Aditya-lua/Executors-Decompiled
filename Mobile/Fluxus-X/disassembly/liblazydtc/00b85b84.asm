; mbedtls_asn1_write_tagged_string @ 00b85b84
00b85b84	stp x22,x21,[sp, #-0x30]!
00b85b88	stp x20,x19,[sp, #0x10]
00b85b8c	stp x29,x30,[sp, #0x20]
00b85b90	add x29,sp,#0x20
00b85b94	ldr x8,[x0]
00b85b98	mov x19,x4
00b85b9c	mov x20,x0
00b85ba0	mov x22,x1
00b85ba4	subs x9,x8,x1
00b85ba8	mov w21,w2
00b85bac	b.cc 0x00b85bb8
00b85bb0	cmp x9,x19
00b85bb4	b.cs 0x00b85bd0
00b85bb8	mov w19,#0xffffff94
00b85bbc	mov w0,w19
00b85bc0	ldp x29,x30,[sp, #0x20]
00b85bc4	ldp x20,x19,[sp, #0x10]
00b85bc8	ldp x22,x21,[sp], #0x30
00b85bcc	ret
00b85bd0	sub x0,x8,x19
00b85bd4	mov x1,x3
00b85bd8	mov x2,x19
00b85bdc	str x0,[x20]
00b85be0	bl 0x00c2ffd0
00b85be4	tbnz w19,#0x1f,0x00b85bbc
00b85be8	sxtw x9,w19
00b85bec	lsr x8,x9,#0x20
00b85bf0	cbz x8,0x00b85bfc
00b85bf4	mov w19,#0xffffff9c
00b85bf8	b 0x00b85bbc
00b85bfc	mov w8,#0x1
00b85c00	cmp x9,#0x80
00b85c04	b.cc 0x00b85c18
00b85c08	mov x10,x9
00b85c0c	lsr x10,x10,#0x8
00b85c10	add w8,w8,#0x1
00b85c14	cbnz x10,0x00b85c0c
00b85c18	ldr x10,[x20]
00b85c1c	sub x11,x10,x22
00b85c20	cmp x11,w8, UXTW 
00b85c24	b.lt 0x00b85bb8
00b85c28	lsl x11,x19,#0x20
00b85c2c	sub x12,x10,#0x1
00b85c30	lsr x11,x11,#0x20
00b85c34	lsr x9,x9,#0x8
00b85c38	str x12,[x20]
00b85c3c	sturb w11,[x10, #-0x1]
00b85c40	cbz x9,0x00b85c5c
00b85c44	ldr x10,[x20]
00b85c48	sub x11,x10,#0x1
00b85c4c	str x11,[x20]
00b85c50	sturb w9,[x10, #-0x1]
00b85c54	lsr x9,x9,#0x8
00b85c58	cbnz x9,0x00b85c44
00b85c5c	cmp w8,#0x2
00b85c60	b.cc 0x00b85c78
00b85c64	ldr x9,[x20]
00b85c68	add w10,w8,#0x7f
00b85c6c	sub x11,x9,#0x1
00b85c70	str x11,[x20]
00b85c74	sturb w10,[x9, #-0x1]
00b85c78	ldr x9,[x20]
00b85c7c	sub x10,x9,x22
00b85c80	cmp x10,#0x1
00b85c84	b.lt 0x00b85bb8
00b85c88	add w8,w19,w8
00b85c8c	sub x10,x9,#0x1
00b85c90	add w19,w8,#0x1
00b85c94	str x10,[x20]
00b85c98	sturb w21,[x9, #-0x1]
00b85c9c	b 0x00b85bbc
