; mbedtls_asn1_write_ia5_string @ 00b85ed8
00b85ed8	str x21,[sp, #-0x30]!
00b85edc	stp x20,x19,[sp, #0x10]
00b85ee0	stp x29,x30,[sp, #0x20]
00b85ee4	add x29,sp,#0x20
00b85ee8	ldr x8,[x0]
00b85eec	mov x19,x3
00b85ef0	mov x20,x0
00b85ef4	mov x21,x1
00b85ef8	subs x9,x8,x1
00b85efc	b.cc 0x00b85f08
00b85f00	cmp x9,x19
00b85f04	b.cs 0x00b85f20
00b85f08	mov w19,#0xffffff94
00b85f0c	mov w0,w19
00b85f10	ldp x29,x30,[sp, #0x20]
00b85f14	ldp x20,x19,[sp, #0x10]
00b85f18	ldr x21,[sp], #0x30
00b85f1c	ret
00b85f20	sub x0,x8,x19
00b85f24	mov x1,x2
00b85f28	mov x2,x19
00b85f2c	str x0,[x20]
00b85f30	bl 0x00c2ffd0
00b85f34	tbnz w19,#0x1f,0x00b85f0c
00b85f38	sxtw x9,w19
00b85f3c	lsr x8,x9,#0x20
00b85f40	cbz x8,0x00b85f4c
00b85f44	mov w19,#0xffffff9c
00b85f48	b 0x00b85f0c
00b85f4c	mov w8,#0x1
00b85f50	cmp x9,#0x80
00b85f54	b.cc 0x00b85f68
00b85f58	mov x10,x9
00b85f5c	lsr x10,x10,#0x8
00b85f60	add w8,w8,#0x1
00b85f64	cbnz x10,0x00b85f5c
00b85f68	ldr x10,[x20]
00b85f6c	sub x11,x10,x21
00b85f70	cmp x11,w8, UXTW 
00b85f74	b.lt 0x00b85f08
00b85f78	lsl x11,x19,#0x20
00b85f7c	sub x12,x10,#0x1
00b85f80	lsr x11,x11,#0x20
00b85f84	lsr x9,x9,#0x8
00b85f88	str x12,[x20]
00b85f8c	sturb w11,[x10, #-0x1]
00b85f90	cbz x9,0x00b85fac
00b85f94	ldr x10,[x20]
00b85f98	sub x11,x10,#0x1
00b85f9c	str x11,[x20]
00b85fa0	sturb w9,[x10, #-0x1]
00b85fa4	lsr x9,x9,#0x8
00b85fa8	cbnz x9,0x00b85f94
00b85fac	cmp w8,#0x2
00b85fb0	b.cc 0x00b85fc8
00b85fb4	ldr x9,[x20]
00b85fb8	add w10,w8,#0x7f
00b85fbc	sub x11,x9,#0x1
00b85fc0	str x11,[x20]
00b85fc4	sturb w10,[x9, #-0x1]
00b85fc8	ldr x9,[x20]
00b85fcc	sub x10,x9,x21
00b85fd0	cmp x10,#0x1
00b85fd4	b.lt 0x00b85f08
00b85fd8	add w8,w19,w8
00b85fdc	sub x10,x9,#0x1
00b85fe0	mov w11,#0x16
00b85fe4	add w19,w8,#0x1
00b85fe8	str x10,[x20]
00b85fec	sturb w11,[x9, #-0x1]
00b85ff0	b 0x00b85f0c
