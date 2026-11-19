; EVP_KDF_CTX_new @ 00a63f28
00a63f28	str x21,[sp, #-0x30]!
00a63f2c	stp x20,x19,[sp, #0x10]
00a63f30	stp x29,x30,[sp, #0x20]
00a63f34	add x29,sp,#0x20
00a63f38	cbz x0,0x00a6400c
00a63f3c	adrp x1,0x2a0000
00a63f40	mov x20,x0
00a63f44	add x1,x1,#0x2e6
00a63f48	mov w0,#0x10
00a63f4c	orr w2,wzr,#0x1e
00a63f50	bl 0x00c34250
00a63f54	mov x19,x0
00a63f58	cbz x0,0x00a63f88
00a63f5c	ldr x0,[x20]
00a63f60	ldr x21,[x20, #0x30]
00a63f64	bl 0x00c3b680
00a63f68	blr x21
00a63f6c	str x0,[x19, #0x8]
00a63f70	cbz x0,0x00a63fbc
00a63f74	mov x0,x20
00a63f78	bl 0x00c3d270
00a63f7c	cbz w0,0x00a63fbc
00a63f80	str x20,[x19]
00a63f84	b 0x00a64010
00a63f88	bl 0x00c342a0
00a63f8c	adrp x0,0x2a0000
00a63f90	adrp x2,0x2a4000
00a63f94	add x0,x0,#0x2e6
00a63f98	add x2,x2,#0x6d
00a63f9c	mov w1,#0x22
00a63fa0	bl 0x00c342b0
00a63fa4	mov w1,#0x100
00a63fa8	orr w0,wzr,#0x6
00a63fac	movk w1,#0xc, LSL #16
00a63fb0	mov x2,xzr
00a63fb4	bl 0x00c342c0
00a63fb8	b 0x00a63ff8
00a63fbc	bl 0x00c342a0
00a63fc0	adrp x0,0x2a0000
00a63fc4	adrp x2,0x2a4000
00a63fc8	add x0,x0,#0x2e6
00a63fcc	add x2,x2,#0x6d
00a63fd0	mov w1,#0x22
00a63fd4	bl 0x00c342b0
00a63fd8	mov w1,#0x100
00a63fdc	orr w0,wzr,#0x6
00a63fe0	movk w1,#0xc, LSL #16
00a63fe4	mov x2,xzr
00a63fe8	bl 0x00c342c0
00a63fec	ldr x8,[x20, #0x40]
00a63ff0	ldr x0,[x19, #0x8]
00a63ff4	blr x8
00a63ff8	adrp x1,0x2a0000
00a63ffc	add x1,x1,#0x2e6
00a64000	mov w2,#0x25
00a64004	mov x0,x19
00a64008	bl 0x00c32310
00a6400c	mov x19,xzr
00a64010	mov x0,x19
00a64014	ldp x29,x30,[sp, #0x20]
00a64018	ldp x20,x19,[sp, #0x10]
00a6401c	ldr x21,[sp], #0x30
00a64020	ret
