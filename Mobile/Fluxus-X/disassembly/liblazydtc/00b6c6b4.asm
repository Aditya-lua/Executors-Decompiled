; mbedtls_chacha20_starts @ 00b6c6b4
00b6c6b4	stp x20,x19,[sp, #-0x20]!
00b6c6b8	stp x29,x30,[sp, #0x10]
00b6c6bc	add x29,sp,#0x10
00b6c6c0	str w2,[x0, #0x30]
00b6c6c4	ldr w8,[x1]
00b6c6c8	mov x19,x0
00b6c6cc	mov w20,#0x40
00b6c6d0	str w8,[x0, #0x34]
00b6c6d4	ldr w8,[x1, #0x4]
00b6c6d8	str w8,[x0, #0x38]
00b6c6dc	ldr w8,[x1, #0x8]
00b6c6e0	mov w1,#0x40
00b6c6e4	str w8,[x0, #0x3c]
00b6c6e8	add x0,x0,#0x40
00b6c6ec	bl 0x00c42220
00b6c6f0	str x20,[x19, #0x80]
00b6c6f4	ldp x29,x30,[sp, #0x10]
00b6c6f8	mov w0,wzr
00b6c6fc	ldp x20,x19,[sp], #0x20
00b6c700	ret
