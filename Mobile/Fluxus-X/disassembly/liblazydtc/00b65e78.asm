; ossl_cipher_generic_cipher @ 00b65e78
00b65e78	stp x24,x23,[sp, #-0x40]!
00b65e7c	stp x22,x21,[sp, #0x10]
00b65e80	stp x20,x19,[sp, #0x20]
00b65e84	stp x29,x30,[sp, #0x30]
00b65e88	add x29,sp,#0x30
00b65e8c	mov x19,x5
00b65e90	mov x21,x4
00b65e94	mov x24,x3
00b65e98	mov x20,x2
00b65e9c	mov x22,x1
00b65ea0	mov x23,x0
00b65ea4	bl 0x00c41000
00b65ea8	cbz w0,0x00b65f68
00b65eac	ldrb w8,[x23, #0x6c]
00b65eb0	tbnz w8,#0x3,0x00b65edc
00b65eb4	bl 0x00c342a0
00b65eb8	adrp x0,0x2c4000
00b65ebc	adrp x2,0x2ab000
00b65ec0	add x0,x0,#0x898
00b65ec4	add x2,x2,#0xb9
00b65ec8	mov w1,#0x22c
00b65ecc	bl 0x00c342b0
00b65ed0	mov w0,#0x39
00b65ed4	mov w1,#0x72
00b65ed8	b 0x00b65f5c
00b65edc	cmp x24,x19
00b65ee0	b.cs 0x00b65f0c
00b65ee4	bl 0x00c342a0
00b65ee8	adrp x0,0x2c4000
00b65eec	adrp x2,0x2ab000
00b65ef0	add x0,x0,#0x898
00b65ef4	add x2,x2,#0xb9
00b65ef8	mov w1,#0x231
00b65efc	bl 0x00c342b0
00b65f00	mov w0,#0x39
00b65f04	mov w1,#0x6a
00b65f08	b 0x00b65f5c
00b65f0c	ldr x8,[x23, #0xa8]
00b65f10	mov x0,x23
00b65f14	mov x1,x22
00b65f18	mov x2,x21
00b65f1c	ldr x8,[x8, #0x8]
00b65f20	mov x3,x19
00b65f24	blr x8
00b65f28	cbz w0,0x00b65f38
00b65f2c	mov w0,#0x1
00b65f30	str x19,[x20]
00b65f34	b 0x00b65f68
00b65f38	bl 0x00c342a0
00b65f3c	adrp x0,0x2c4000
00b65f40	adrp x2,0x2ab000
00b65f44	add x0,x0,#0x898
00b65f48	add x2,x2,#0xb9
00b65f4c	mov w1,#0x236
00b65f50	bl 0x00c342b0
00b65f54	mov w0,#0x39
00b65f58	mov w1,#0x66
00b65f5c	mov x2,xzr
00b65f60	bl 0x00c342c0
00b65f64	mov w0,wzr
00b65f68	ldp x29,x30,[sp, #0x30]
00b65f6c	ldp x20,x19,[sp, #0x20]
00b65f70	ldp x22,x21,[sp, #0x10]
00b65f74	ldp x24,x23,[sp], #0x40
00b65f78	ret
