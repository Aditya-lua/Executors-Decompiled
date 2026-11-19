; mbedtls_ecdh_setup @ 00b9af4c
00b9af4c	str x21,[sp, #-0x30]!
00b9af50	stp x20,x19,[sp, #0x10]
00b9af54	stp x29,x30,[sp, #0x20]
00b9af58	add x29,sp,#0x20
00b9af5c	mov w8,#0x1
00b9af60	add x21,x0,#0x10
00b9af64	mov x20,x0
00b9af68	strb wzr,[x0]
00b9af6c	stp w1,w8,[x0, #0x4]
00b9af70	mov x0,x21
00b9af74	mov w19,w1
00b9af78	bl 0x00c426c0
00b9af7c	add x0,x20,#0xd0
00b9af80	bl 0x00c41c00
00b9af84	add x0,x20,#0xe0
00b9af88	bl 0x00c42760
00b9af8c	add x0,x20,#0x110
00b9af90	bl 0x00c42760
00b9af94	add x0,x20,#0x140
00b9af98	bl 0x00c41c00
00b9af9c	mov x0,x21
00b9afa0	mov w1,w19
00b9afa4	bl 0x00c42800
00b9afa8	ldp x29,x30,[sp, #0x20]
00b9afac	ldp x20,x19,[sp, #0x10]
00b9afb0	cmp w0,#0x0
00b9afb4	mov w8,#0xffffb180
00b9afb8	csel w0,wzr,w8,eq
00b9afbc	ldr x21,[sp], #0x30
00b9afc0	ret
