; EVP_DigestUpdate @ 00a57ef4
00a57ef4	stp x29,x30,[sp, #-0x10]!
00a57ef8	mov x29,sp
00a57efc	cbz x2,0x00a57f8c
00a57f00	ldr x9,[x0, #0x28]
00a57f04	cbz x9,0x00a57f60
00a57f08	ldr w8,[x9]
00a57f0c	sub w10,w8,#0x10
00a57f10	cmp w10,#0x30
00a57f14	b.hi 0x00a57f30
00a57f18	mov w11,#0x1
00a57f1c	lsl x10,x11,x10
00a57f20	mov x11,#0x1000000010000
00a57f24	movk x11,#0x1
00a57f28	tst x10,x11
00a57f2c	b.ne 0x00a57f40
00a57f30	cmp w8,#0x100
00a57f34	b.eq 0x00a57f40
00a57f38	cmp w8,#0x80
00a57f3c	b.ne 0x00a57f60
00a57f40	ldr x9,[x9, #0x30]
00a57f44	cbz x9,0x00a57f60
00a57f48	cmp w8,#0x100
00a57f4c	b.eq 0x00a57fa4
00a57f50	cmp w8,#0x80
00a57f54	b.ne 0x00a57fac
00a57f58	ldp x29,x30,[sp], #0x10
00a57f5c	b 0x00c36d90
00a57f60	ldr x8,[x0, #0x8]
00a57f64	cbz x8,0x00a57f98
00a57f68	ldr x9,[x8, #0x70]
00a57f6c	cbz x9,0x00a57f98
00a57f70	ldrb w9,[x0, #0x19]
00a57f74	tbnz w9,#0x0,0x00a57f98
00a57f78	ldr x3,[x8, #0x98]
00a57f7c	cbz x3,0x00a57fc8
00a57f80	ldr x0,[x0, #0x38]
00a57f84	ldp x29,x30,[sp], #0x10
00a57f88	br x3
00a57f8c	mov w0,#0x1
00a57f90	ldp x29,x30,[sp], #0x10
00a57f94	ret
00a57f98	ldr x3,[x0, #0x30]
00a57f9c	ldp x29,x30,[sp], #0x10
00a57fa0	br x3
00a57fa4	ldp x29,x30,[sp], #0x10
00a57fa8	b 0x00c37280
00a57fac	bl 0x00c342a0
00a57fb0	adrp x0,0x2b7000
00a57fb4	adrp x2,0x2a2000
00a57fb8	add x0,x0,#0xc61
00a57fbc	add x2,x2,#0x37b
00a57fc0	mov w1,#0x18b
00a57fc4	b 0x00a57fe0
00a57fc8	bl 0x00c342a0
00a57fcc	adrp x0,0x2b7000
00a57fd0	adrp x2,0x2a2000
00a57fd4	add x0,x0,#0xc61
00a57fd8	add x2,x2,#0x37b
00a57fdc	mov w1,#0x195
00a57fe0	bl 0x00c342b0
00a57fe4	orr w0,wzr,#0x6
00a57fe8	mov w1,#0xbd
00a57fec	mov x2,xzr
00a57ff0	bl 0x00c342c0
00a57ff4	mov w0,wzr
00a57ff8	ldp x29,x30,[sp], #0x10
00a57ffc	ret
