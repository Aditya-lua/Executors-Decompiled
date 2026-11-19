; PKCS7_stream @ 00ac39dc
00ac39dc	stp x20,x19,[sp, #-0x20]!
00ac39e0	stp x29,x30,[sp, #0x10]
00ac39e4	ldr x8,[x1, #0x18]
00ac39e8	mov x19,x0
00ac39ec	add x29,sp,#0x10
00ac39f0	mov x20,x1
00ac39f4	mov x0,x8
00ac39f8	bl 0x00c37750
00ac39fc	sub w8,w0,#0x15
00ac3a00	cmp w8,#0x3
00ac3a04	b.hi 0x00ac3a28
00ac3a08	adrp x9,0x774000
00ac3a0c	add x9,x9,#0x6d8
00ac3a10	ldrsw x8,[x9, x8, LSL #0x2]
00ac3a14	add x8,x8,x9
00ac3a18	br x8
00ac3a1c	ldr x0,[x20, #0x20]
00ac3a20	cbnz x0,0x00ac3a90
00ac3a24	b 0x00ac3aa8
00ac3a28	mov w0,wzr
00ac3a2c	b 0x00ac3aa8
00ac3a30	ldr x8,[x20, #0x20]
00ac3a34	ldr x8,[x8, #0x28]
00ac3a38	ldr x0,[x8, #0x20]
00ac3a3c	cbnz x0,0x00ac3a90
00ac3a40	b 0x00ac3aa8
00ac3a44	ldr x8,[x20, #0x20]
00ac3a48	ldr x8,[x8, #0x10]
00ac3a4c	ldr x0,[x8, #0x10]
00ac3a50	cbnz x0,0x00ac3a90
00ac3a54	bl 0x00c38170
00ac3a58	ldr x8,[x20, #0x20]
00ac3a5c	ldr x8,[x8, #0x10]
00ac3a60	str x0,[x8, #0x10]
00ac3a64	cbnz x0,0x00ac3a90
00ac3a68	b 0x00ac3aa8
00ac3a6c	ldr x8,[x20, #0x20]
00ac3a70	ldr x8,[x8, #0x28]
00ac3a74	ldr x0,[x8, #0x10]
00ac3a78	cbnz x0,0x00ac3a90
00ac3a7c	bl 0x00c38170
00ac3a80	ldr x8,[x20, #0x20]
00ac3a84	ldr x8,[x8, #0x28]
00ac3a88	str x0,[x8, #0x10]
00ac3a8c	cbz x0,0x00ac3aa8
00ac3a90	ldr x8,[x0, #0x10]
00ac3a94	add x9,x0,#0x8
00ac3a98	orr x8,x8,#0x10
00ac3a9c	str x8,[x0, #0x10]
00ac3aa0	mov w0,#0x1
00ac3aa4	str x9,[x19]
00ac3aa8	ldp x29,x30,[sp, #0x10]
00ac3aac	ldp x20,x19,[sp], #0x20
00ac3ab0	ret
