; X509_issuer_and_serial_hash @ 00b08e78
00b08e78	sub sp,sp,#0x40
00b08e7c	stp x22,x21,[sp, #0x10]
00b08e80	stp x20,x19,[sp, #0x20]
00b08e84	stp x29,x30,[sp, #0x30]
00b08e88	add x29,sp,#0x30
00b08e8c	mov x22,x0
00b08e90	bl 0x00c31fa0
00b08e94	mov x19,x0
00b08e98	cbz x0,0x00b08f44
00b08e9c	ldr x0,[x22, #0x30]
00b08ea0	mov x1,xzr
00b08ea4	mov w2,wzr
00b08ea8	bl 0x00c40ae0
00b08eac	mov x20,x0
00b08eb0	cbz x0,0x00b08f5c
00b08eb4	ldp x0,x2,[x22, #0x170]
00b08eb8	adrp x1,0x2d5000
00b08ebc	add x1,x1,#0x3fd
00b08ec0	bl 0x00c357f0
00b08ec4	mov x21,x0
00b08ec8	cbz x0,0x00b08f54
00b08ecc	mov x0,x19
00b08ed0	mov x1,x21
00b08ed4	mov x2,xzr
00b08ed8	bl 0x00c31f70
00b08edc	cbz w0,0x00b08f54
00b08ee0	mov x0,x20
00b08ee4	bl 0x00c2ff50
00b08ee8	mov x2,x0
00b08eec	mov x0,x19
00b08ef0	mov x1,x20
00b08ef4	bl 0x00c31f80
00b08ef8	cbz w0,0x00b08f54
00b08efc	ldr x1,[x22, #0x10]
00b08f00	ldrsw x2,[x22, #0x8]
00b08f04	mov x0,x19
00b08f08	bl 0x00c31f80
00b08f0c	cbz w0,0x00b08f54
00b08f10	mov x1,sp
00b08f14	mov x0,x19
00b08f18	mov x2,xzr
00b08f1c	bl 0x00c31f60
00b08f20	cbz w0,0x00b08f54
00b08f24	ldrb w22,[sp]
00b08f28	ldrb w8,[sp, #0x1]
00b08f2c	ldrb w9,[sp, #0x2]
00b08f30	ldrb w10,[sp, #0x3]
00b08f34	bfm x22,x8,#0x38,#0x7
00b08f38	bfm x22,x9,#0x30,#0x7
00b08f3c	bfm x22,x10,#0x28,#0x7
00b08f40	b 0x00b08f64
00b08f44	mov x22,xzr
00b08f48	mov x20,xzr
00b08f4c	mov x21,xzr
00b08f50	b 0x00b08f64
00b08f54	mov x22,xzr
00b08f58	b 0x00b08f64
00b08f5c	mov x22,xzr
00b08f60	mov x21,xzr
00b08f64	adrp x1,0x2d4000
00b08f68	add x1,x1,#0x58a
00b08f6c	mov w2,#0x44
00b08f70	mov x0,x20
00b08f74	bl 0x00c32310
00b08f78	mov x0,x21
00b08f7c	bl 0x00c35800
00b08f80	mov x0,x19
00b08f84	bl 0x00c31f90
00b08f88	mov x0,x22
00b08f8c	ldp x29,x30,[sp, #0x30]
00b08f90	ldp x20,x19,[sp, #0x20]
00b08f94	ldp x22,x21,[sp, #0x10]
00b08f98	add sp,sp,#0x40
00b08f9c	ret
