; mbedtls_des_setkey_dec @ 00b74d40
00b74d40	str x19,[sp, #-0x20]!
00b74d44	stp x29,x30,[sp, #0x10]
00b74d48	add x29,sp,#0x10
00b74d4c	mov x19,x0
00b74d50	bl 0x00c424b0
00b74d54	ldp x10,x8,[x19, #0x70]
00b74d58	ldp x9,x11,[x19]
00b74d5c	mov w0,wzr
00b74d60	stp x8,x10,[x19]
00b74d64	stp x11,x9,[x19, #0x70]
00b74d68	ldp x8,x9,[x19, #0x60]
00b74d6c	ldp x10,x11,[x19, #0x10]
00b74d70	stp x9,x8,[x19, #0x10]
00b74d74	stp x11,x10,[x19, #0x60]
00b74d78	ldp x9,x10,[x19, #0x50]
00b74d7c	ldp x8,x11,[x19, #0x20]
00b74d80	stp x10,x9,[x19, #0x20]
00b74d84	stp x11,x8,[x19, #0x50]
00b74d88	ldp x8,x10,[x19, #0x40]
00b74d8c	ldp x9,x11,[x19, #0x30]
00b74d90	stp x10,x8,[x19, #0x30]
00b74d94	stp x11,x9,[x19, #0x40]
00b74d98	ldp x29,x30,[sp, #0x10]
00b74d9c	ldr x19,[sp], #0x20
00b74da0	ret
