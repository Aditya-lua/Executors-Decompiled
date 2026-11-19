; X509_issuer_and_serial_cmp @ 00b08d48
00b08d48	stp x20,x19,[sp, #-0x20]!
00b08d4c	mov x20,x0
00b08d50	stp x29,x30,[sp, #0x10]
00b08d54	add x29,sp,#0x10
00b08d58	cbz x1,0x00b08d80
00b08d5c	cbz x20,0x00b08d8c
00b08d60	mov x19,x1
00b08d64	add x0,x20,#0x8
00b08d68	add x1,x1,#0x8
00b08d6c	bl 0x00c37560
00b08d70	cbz w0,0x00b08d9c
00b08d74	asr w8,w0,#0x1f
00b08d78	orr w0,w8,#0x1
00b08d7c	b 0x00b08d90
00b08d80	cmp x20,#0x0
00b08d84	cset w0,ne
00b08d88	b 0x00b08d90
00b08d8c	mov w0,#0xffffffff
00b08d90	ldp x29,x30,[sp, #0x10]
00b08d94	ldp x20,x19,[sp], #0x20
00b08d98	ret
00b08d9c	ldr x0,[x20, #0x30]
00b08da0	ldr x1,[x19, #0x30]
00b08da4	ldp x29,x30,[sp, #0x10]
00b08da8	ldp x20,x19,[sp], #0x20
00b08dac	b 0x00b08db0
