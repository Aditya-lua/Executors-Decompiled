; openssl_strerror_r @ 00a9bc38
00a9bc38	stp x20,x19,[sp, #-0x20]!
00a9bc3c	mov w8,w0
00a9bc40	cmp x2,#0x2
00a9bc44	mov w0,wzr
00a9bc48	stp x29,x30,[sp, #0x10]
00a9bc4c	add x29,sp,#0x10
00a9bc50	b.cc 0x00a9bc90
00a9bc54	mov w0,w8
00a9bc58	mov x20,x2
00a9bc5c	mov x19,x1
00a9bc60	bl 0x00c30b90
00a9bc64	cbz x0,0x00a9bc90
00a9bc68	ldrb w8,[x0]
00a9bc6c	cbz w8,0x00a9bc88
00a9bc70	sub x20,x20,#0x1
00a9bc74	add x0,x0,#0x1
00a9bc78	cmp x20,#0x1
00a9bc7c	strb w8,[x19], #0x1
00a9bc80	b.hi 0x00a9bc68
00a9bc84	cbz x20,0x00a9bc8c
00a9bc88	strb wzr,[x19]
00a9bc8c	mov w0,#0x1
00a9bc90	ldp x29,x30,[sp, #0x10]
00a9bc94	ldp x20,x19,[sp], #0x20
00a9bc98	ret
