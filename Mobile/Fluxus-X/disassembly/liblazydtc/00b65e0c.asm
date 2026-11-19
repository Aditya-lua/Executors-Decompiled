; ossl_cipher_generic_stream_final @ 00b65e0c
00b65e0c	stp x20,x19,[sp, #-0x20]!
00b65e10	stp x29,x30,[sp, #0x10]
00b65e14	add x29,sp,#0x10
00b65e18	mov x19,x2
00b65e1c	mov x20,x0
00b65e20	bl 0x00c41000
00b65e24	cbz w0,0x00b65e6c
00b65e28	ldrb w8,[x20, #0x6c]
00b65e2c	tbnz w8,#0x3,0x00b65e64
00b65e30	bl 0x00c342a0
00b65e34	adrp x0,0x2c4000
00b65e38	adrp x2,0x2ab000
00b65e3c	add x0,x0,#0x898
00b65e40	add x2,x2,#0x98
00b65e44	mov w1,#0x21a
00b65e48	bl 0x00c342b0
00b65e4c	mov w0,#0x39
00b65e50	mov w1,#0x72
00b65e54	mov x2,xzr
00b65e58	bl 0x00c342c0
00b65e5c	mov w0,wzr
00b65e60	b 0x00b65e6c
00b65e64	mov w0,#0x1
00b65e68	str xzr,[x19]
00b65e6c	ldp x29,x30,[sp, #0x10]
00b65e70	ldp x20,x19,[sp], #0x20
00b65e74	ret
