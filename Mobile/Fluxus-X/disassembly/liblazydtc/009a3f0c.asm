; ix::SocketOpenSSL::openSSLCheckServerCert @ 009a3f0c
009a3f0c	str x19,[sp, #-0x20]!
009a3f10	stp x29,x30,[sp, #0x10]
009a3f14	add x29,sp,#0x10
009a3f18	mov x0,x1
009a3f1c	mov x19,x3
009a3f20	bl 0x00c328e0
009a3f24	cbz x0,0x009a3f34
009a3f28	bl 0x00c31a90
009a3f2c	mov w0,#0x1
009a3f30	b 0x009a3f4c
009a3f34	adrp x1,0x29d000
009a3f38	add x1,x1,#0xa95
009a3f3c	orr w2,wzr,#0x38
009a3f40	mov x0,x19
009a3f44	bl 0x00c31090
009a3f48	mov w0,wzr
009a3f4c	ldp x29,x30,[sp, #0x10]
009a3f50	ldr x19,[sp], #0x20
009a3f54	ret
