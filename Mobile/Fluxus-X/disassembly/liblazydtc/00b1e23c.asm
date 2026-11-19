; X509_PUBKEY_eq @ 00b1e23c
00b1e23c	stp x20,x19,[sp, #-0x20]!
00b1e240	cmp x0,x1
00b1e244	stp x29,x30,[sp, #0x10]
00b1e248	add x29,sp,#0x10
00b1e24c	b.eq 0x00b1e2b4
00b1e250	mov x20,x0
00b1e254	cbz x0,0x00b1e2c4
00b1e258	mov x19,x1
00b1e25c	mov w0,wzr
00b1e260	cbz x1,0x00b1e2c8
00b1e264	ldr x0,[x20]
00b1e268	cbz x0,0x00b1e2bc
00b1e26c	ldr x1,[x19]
00b1e270	cbz x1,0x00b1e2bc
00b1e274	bl 0x00c38210
00b1e278	mov w8,w0
00b1e27c	mov w0,wzr
00b1e280	cbnz w8,0x00b1e2c8
00b1e284	mov x0,x20
00b1e288	bl 0x00b1d11c
00b1e28c	cbz x0,0x00b1e2bc
00b1e290	mov x20,x0
00b1e294	mov x0,x19
00b1e298	bl 0x00b1d11c
00b1e29c	cbz x0,0x00b1e2bc
00b1e2a0	ldp x29,x30,[sp, #0x10]
00b1e2a4	mov x1,x0
00b1e2a8	mov x0,x20
00b1e2ac	ldp x20,x19,[sp], #0x20
00b1e2b0	b 0x00c35f70
00b1e2b4	mov w0,#0x1
00b1e2b8	b 0x00b1e2c8
00b1e2bc	orr w0,wzr,#0xfffffffe
00b1e2c0	b 0x00b1e2c8
00b1e2c4	mov w0,wzr
00b1e2c8	ldp x29,x30,[sp, #0x10]
00b1e2cc	ldp x20,x19,[sp], #0x20
00b1e2d0	ret
