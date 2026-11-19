; DSA_security_bits @ 00a20b4c
00a20b4c	str x19,[sp, #-0x20]!
00a20b50	stp x29,x30,[sp, #0x10]
00a20b54	mov x19,x0
00a20b58	ldr x0,[x0, #0x8]
00a20b5c	add x29,sp,#0x10
00a20b60	cbz x0,0x00a20b94
00a20b64	ldr x8,[x19, #0x10]
00a20b68	cbz x8,0x00a20b94
00a20b6c	bl 0x00c322f0
00a20b70	ldr x8,[x19, #0x10]
00a20b74	mov w19,w0
00a20b78	mov x0,x8
00a20b7c	bl 0x00c322f0
00a20b80	ldp x29,x30,[sp, #0x10]
00a20b84	mov w1,w0
00a20b88	mov w0,w19
00a20b8c	ldr x19,[sp], #0x20
00a20b90	b 0x00c38da0
00a20b94	ldp x29,x30,[sp, #0x10]
00a20b98	mov w0,#0xffffffff
00a20b9c	ldr x19,[sp], #0x20
00a20ba0	ret
