; BIO_CONNECT_free @ 00b19a18
00b19a18	cbz x0,0x00b19a74
00b19a1c	stp x20,x19,[sp, #-0x20]!
00b19a20	stp x29,x30,[sp, #0x10]
00b19a24	mov x19,x0
00b19a28	ldr x0,[x0, #0x8]
00b19a2c	adrp x20,0x2bc000
00b19a30	add x20,x20,#0x77a
00b19a34	mov w2,#0x10d
00b19a38	mov x1,x20
00b19a3c	add x29,sp,#0x10
00b19a40	bl 0x00c32310
00b19a44	ldr x0,[x19, #0x10]
00b19a48	mov w2,#0x10e
00b19a4c	mov x1,x20
00b19a50	bl 0x00c32310
00b19a54	ldr x0,[x19, #0x20]
00b19a58	bl 0x00c384d0
00b19a5c	ldp x29,x30,[sp, #0x10]
00b19a60	mov w2,#0x110
00b19a64	mov x0,x19
00b19a68	mov x1,x20
00b19a6c	ldp x20,x19,[sp], #0x20
00b19a70	b 0x00c32310
00b19a74	ret
