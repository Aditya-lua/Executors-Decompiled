; async_start_func @ 009f8eb8
009f8eb8	str x23,[sp, #-0x40]!
009f8ebc	adrp x0,0xd21000
009f8ec0	add x0,x0,#0x8e8
009f8ec4	stp x22,x21,[sp, #0x10]
009f8ec8	stp x20,x19,[sp, #0x20]
009f8ecc	stp x29,x30,[sp, #0x30]
009f8ed0	add x29,sp,#0x30
009f8ed4	bl 0x00c38360
009f8ed8	cbz x0,0x009f8f2c
009f8edc	adrp x20,0x29d000
009f8ee0	adrp x21,0x2d7000
009f8ee4	mov x19,x0
009f8ee8	orr w22,wzr,#0x3
009f8eec	add x20,x20,#0xf33
009f8ef0	add x21,x21,#0xbfc
009f8ef4	ldr x23,[x19, #0x8]
009f8ef8	ldp x8,x0,[x23, #0x8]
009f8efc	blr x8
009f8f00	stp w0,w22,[x23, #0x18]
009f8f04	bl 0x00c342a0
009f8f08	mov w1,#0xac
009f8f0c	mov x0,x20
009f8f10	mov x2,x21
009f8f14	bl 0x00c342b0
009f8f18	mov w0,#0x33
009f8f1c	mov w1,#0x66
009f8f20	mov x2,xzr
009f8f24	bl 0x00c342c0
009f8f28	b 0x009f8ef4
009f8f2c	bl 0x00c342a0
009f8f30	adrp x0,0x29d000
009f8f34	adrp x2,0x2d7000
009f8f38	add x0,x0,#0xf33
009f8f3c	add x2,x2,#0xbfc
009f8f40	mov w1,#0x9c
009f8f44	bl 0x00c342b0
009f8f48	ldp x29,x30,[sp, #0x30]
009f8f4c	ldp x20,x19,[sp, #0x20]
009f8f50	ldp x22,x21,[sp, #0x10]
009f8f54	mov w1,#0x103
009f8f58	mov w0,#0x33
009f8f5c	movk w1,#0xc, LSL #16
009f8f60	mov x2,xzr
009f8f64	ldr x23,[sp], #0x40
009f8f68	b 0x00c342c0
