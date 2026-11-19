; X509v3_addr_validate_path @ 00af7e7c
00af7e7c	str x19,[sp, #-0x20]!
00af7e80	stp x29,x30,[sp, #0x10]
00af7e84	mov x19,x0
00af7e88	ldr x0,[x0, #0x98]
00af7e8c	add x29,sp,#0x10
00af7e90	cbz x0,0x00af7ebc
00af7e94	bl 0x00c325e0
00af7e98	cbz w0,0x00af7ebc
00af7e9c	ldr x8,[x19, #0x38]
00af7ea0	cbz x8,0x00af7ebc
00af7ea4	ldr x1,[x19, #0x98]
00af7ea8	ldp x29,x30,[sp, #0x10]
00af7eac	mov x0,x19
00af7eb0	mov x2,xzr
00af7eb4	ldr x19,[sp], #0x20
00af7eb8	b 0x00af7ed4
00af7ebc	mov w8,#0x1
00af7ec0	str w8,[x19, #0xb0]
00af7ec4	ldp x29,x30,[sp, #0x10]
00af7ec8	mov w0,wzr
00af7ecc	ldr x19,[sp], #0x20
00af7ed0	ret
