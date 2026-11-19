; mbedtls_asn1_write_printable_string @ 00b85dbc
00b85dbc	str x21,[sp, #-0x30]!
00b85dc0	stp x20,x19,[sp, #0x10]
00b85dc4	stp x29,x30,[sp, #0x20]
00b85dc8	add x29,sp,#0x20
00b85dcc	ldr x8,[x0]
00b85dd0	mov x19,x3
00b85dd4	mov x20,x0
00b85dd8	mov x21,x1
00b85ddc	subs x9,x8,x1
00b85de0	b.cc 0x00b85dec
00b85de4	cmp x9,x19
00b85de8	b.cs 0x00b85e04
00b85dec	mov w19,#0xffffff94
00b85df0	mov w0,w19
00b85df4	ldp x29,x30,[sp, #0x20]
00b85df8	ldp x20,x19,[sp, #0x10]
00b85dfc	ldr x21,[sp], #0x30
00b85e00	ret
00b85e04	sub x0,x8,x19
00b85e08	mov x1,x2
00b85e0c	mov x2,x19
00b85e10	str x0,[x20]
00b85e14	bl 0x00c2ffd0
00b85e18	tbnz w19,#0x1f,0x00b85df0
00b85e1c	sxtw x9,w19
00b85e20	lsr x8,x9,#0x20
00b85e24	cbz x8,0x00b85e30
00b85e28	mov w19,#0xffffff9c
00b85e2c	b 0x00b85df0
00b85e30	mov w8,#0x1
00b85e34	cmp x9,#0x80
00b85e38	b.cc 0x00b85e4c
00b85e3c	mov x10,x9
00b85e40	lsr x10,x10,#0x8
00b85e44	add w8,w8,#0x1
00b85e48	cbnz x10,0x00b85e40
00b85e4c	ldr x10,[x20]
00b85e50	sub x11,x10,x21
00b85e54	cmp x11,w8, UXTW 
00b85e58	b.lt 0x00b85dec
00b85e5c	lsl x11,x19,#0x20
00b85e60	sub x12,x10,#0x1
00b85e64	lsr x11,x11,#0x20
00b85e68	lsr x9,x9,#0x8
00b85e6c	str x12,[x20]
00b85e70	sturb w11,[x10, #-0x1]
00b85e74	cbz x9,0x00b85e90
00b85e78	ldr x10,[x20]
00b85e7c	sub x11,x10,#0x1
00b85e80	str x11,[x20]
00b85e84	sturb w9,[x10, #-0x1]
00b85e88	lsr x9,x9,#0x8
00b85e8c	cbnz x9,0x00b85e78
00b85e90	cmp w8,#0x2
00b85e94	b.cc 0x00b85eac
00b85e98	ldr x9,[x20]
00b85e9c	add w10,w8,#0x7f
00b85ea0	sub x11,x9,#0x1
00b85ea4	str x11,[x20]
00b85ea8	sturb w10,[x9, #-0x1]
00b85eac	ldr x9,[x20]
00b85eb0	sub x10,x9,x21
00b85eb4	cmp x10,#0x1
00b85eb8	b.lt 0x00b85dec
00b85ebc	add w8,w19,w8
00b85ec0	sub x10,x9,#0x1
00b85ec4	mov w11,#0x13
00b85ec8	add w19,w8,#0x1
00b85ecc	str x10,[x20]
00b85ed0	sturb w11,[x9, #-0x1]
00b85ed4	b 0x00b85df0
