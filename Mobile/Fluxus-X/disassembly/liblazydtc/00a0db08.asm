; OPENSSL_INIT_new @ 00a0db08
00a0db08	stp x29,x30,[sp, #-0x10]!
00a0db0c	orr w0,wzr,#0x18
00a0db10	mov x29,sp
00a0db14	bl 0x00c308d0
00a0db18	cbz x0,0x00a0db28
00a0db1c	mov w8,#0x32
00a0db20	stp xzr,xzr,[x0]
00a0db24	str x8,[x0, #0x10]
00a0db28	ldp x29,x30,[sp], #0x10
00a0db2c	ret
