; BIO_new_socket @ 00a00f88
00a00f88	str x21,[sp, #-0x30]!
00a00f8c	stp x20,x19,[sp, #0x10]
00a00f90	mov w20,w0
00a00f94	adrp x0,0xc59000
00a00f98	add x0,x0,#0x608
00a00f9c	stp x29,x30,[sp, #0x20]
00a00fa0	add x29,sp,#0x20
00a00fa4	mov w21,w1
00a00fa8	bl 0x00c32240
00a00fac	mov x19,x0
00a00fb0	cbz x0,0x00a00fc8
00a00fb4	sxtw x2,w21
00a00fb8	mov w1,#0x68
00a00fbc	mov x0,x19
00a00fc0	mov w3,w20
00a00fc4	bl 0x00c35600
00a00fc8	mov x0,x19
00a00fcc	ldp x29,x30,[sp, #0x20]
00a00fd0	ldp x20,x19,[sp, #0x10]
00a00fd4	ldr x21,[sp], #0x30
00a00fd8	ret
