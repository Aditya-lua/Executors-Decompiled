; mbedtls_asn1_write_utf8_string @ 00b85ca0
00b85ca0	str x21,[sp, #-0x30]!
00b85ca4	stp x20,x19,[sp, #0x10]
00b85ca8	stp x29,x30,[sp, #0x20]
00b85cac	add x29,sp,#0x20
00b85cb0	ldr x8,[x0]
00b85cb4	mov x19,x3
00b85cb8	mov x20,x0
00b85cbc	mov x21,x1
00b85cc0	subs x9,x8,x1
00b85cc4	b.cc 0x00b85cd0
00b85cc8	cmp x9,x19
00b85ccc	b.cs 0x00b85ce8
00b85cd0	mov w19,#0xffffff94
00b85cd4	mov w0,w19
00b85cd8	ldp x29,x30,[sp, #0x20]
00b85cdc	ldp x20,x19,[sp, #0x10]
00b85ce0	ldr x21,[sp], #0x30
00b85ce4	ret
00b85ce8	sub x0,x8,x19
00b85cec	mov x1,x2
00b85cf0	mov x2,x19
00b85cf4	str x0,[x20]
00b85cf8	bl 0x00c2ffd0
00b85cfc	tbnz w19,#0x1f,0x00b85cd4
00b85d00	sxtw x9,w19
00b85d04	lsr x8,x9,#0x20
00b85d08	cbz x8,0x00b85d14
00b85d0c	mov w19,#0xffffff9c
00b85d10	b 0x00b85cd4
00b85d14	mov w8,#0x1
00b85d18	cmp x9,#0x80
00b85d1c	b.cc 0x00b85d30
00b85d20	mov x10,x9
00b85d24	lsr x10,x10,#0x8
00b85d28	add w8,w8,#0x1
00b85d2c	cbnz x10,0x00b85d24
00b85d30	ldr x10,[x20]
00b85d34	sub x11,x10,x21
00b85d38	cmp x11,w8, UXTW 
00b85d3c	b.lt 0x00b85cd0
00b85d40	lsl x11,x19,#0x20
00b85d44	sub x12,x10,#0x1
00b85d48	lsr x11,x11,#0x20
00b85d4c	lsr x9,x9,#0x8
00b85d50	str x12,[x20]
00b85d54	sturb w11,[x10, #-0x1]
00b85d58	cbz x9,0x00b85d74
00b85d5c	ldr x10,[x20]
00b85d60	sub x11,x10,#0x1
00b85d64	str x11,[x20]
00b85d68	sturb w9,[x10, #-0x1]
00b85d6c	lsr x9,x9,#0x8
00b85d70	cbnz x9,0x00b85d5c
00b85d74	cmp w8,#0x2
00b85d78	b.cc 0x00b85d90
00b85d7c	ldr x9,[x20]
00b85d80	add w10,w8,#0x7f
00b85d84	sub x11,x9,#0x1
00b85d88	str x11,[x20]
00b85d8c	sturb w10,[x9, #-0x1]
00b85d90	ldr x9,[x20]
00b85d94	sub x10,x9,x21
00b85d98	cmp x10,#0x1
00b85d9c	b.lt 0x00b85cd0
00b85da0	add w8,w19,w8
00b85da4	sub x10,x9,#0x1
00b85da8	orr w11,wzr,#0xc
00b85dac	add w19,w8,#0x1
00b85db0	str x10,[x20]
00b85db4	sturb w11,[x9, #-0x1]
00b85db8	b 0x00b85cd4
