; ssl_handshake_hash @ 009b7ecc
009b7ecc	stp x24,x23,[sp, #-0x40]!
009b7ed0	stp x22,x21,[sp, #0x10]
009b7ed4	stp x20,x19,[sp, #0x20]
009b7ed8	stp x29,x30,[sp, #0x30]
009b7edc	ldr x23,[x0, #0x190]
009b7ee0	mov x19,x0
009b7ee4	add x29,sp,#0x30
009b7ee8	mov x21,x3
009b7eec	mov x0,x23
009b7ef0	mov x20,x2
009b7ef4	mov x22,x1
009b7ef8	bl 0x00c34c00
009b7efc	bl 0x00c34c20
009b7f00	tbnz w0,#0x1f,0x009b7f10
009b7f04	sxtw x24,w0
009b7f08	cmp x24,x20
009b7f0c	b.ls 0x009b7f4c
009b7f10	bl 0x00c342a0
009b7f14	adrp x0,0x2c5000
009b7f18	adrp x2,0x2cd000
009b7f1c	add x0,x0,#0x652
009b7f20	add x2,x2,#0x5fb
009b7f24	mov w1,#0x12e3
009b7f28	bl 0x00c342b0
009b7f2c	mov w2,#0x103
009b7f30	mov w1,#0x50
009b7f34	movk w2,#0xc, LSL #16
009b7f38	mov x0,x19
009b7f3c	mov x3,xzr
009b7f40	bl 0x00c34410
009b7f44	mov x20,xzr
009b7f48	b 0x009b7fdc
009b7f4c	bl 0x00c31fa0
009b7f50	mov x20,x0
009b7f54	cbz x0,0x009b7f8c
009b7f58	mov x0,x20
009b7f5c	mov x1,x23
009b7f60	bl 0x00c34bf0
009b7f64	cbz w0,0x009b7fa8
009b7f68	mov x0,x20
009b7f6c	mov x1,x22
009b7f70	mov x2,xzr
009b7f74	bl 0x00c31f60
009b7f78	cmp w0,#0x0
009b7f7c	b.le 0x009b7fa8
009b7f80	mov w19,#0x1
009b7f84	str x24,[x21]
009b7f88	b 0x009b7fe0
009b7f8c	bl 0x00c342a0
009b7f90	adrp x0,0x2c5000
009b7f94	adrp x2,0x2cd000
009b7f98	add x0,x0,#0x652
009b7f9c	add x2,x2,#0x5fb
009b7fa0	mov w1,#0x12e9
009b7fa4	b 0x009b7fc0
009b7fa8	bl 0x00c342a0
009b7fac	adrp x0,0x2c5000
009b7fb0	adrp x2,0x2cd000
009b7fb4	add x0,x0,#0x652
009b7fb8	add x2,x2,#0x5fb
009b7fbc	mov w1,#0x12ef
009b7fc0	bl 0x00c342b0
009b7fc4	mov w2,#0x103
009b7fc8	mov w1,#0x50
009b7fcc	movk w2,#0xc, LSL #16
009b7fd0	mov x0,x19
009b7fd4	mov x3,xzr
009b7fd8	bl 0x00c34410
009b7fdc	mov w19,wzr
009b7fe0	mov x0,x20
009b7fe4	bl 0x00c31f90
009b7fe8	mov w0,w19
009b7fec	ldp x29,x30,[sp, #0x30]
009b7ff0	ldp x20,x19,[sp, #0x20]
009b7ff4	ldp x22,x21,[sp, #0x10]
009b7ff8	ldp x24,x23,[sp], #0x40
009b7ffc	ret
