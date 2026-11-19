; tls12_copy_sigalgs @ 009c3eec
009c3eec	str x25,[sp, #-0x50]!
009c3ef0	stp x24,x23,[sp, #0x10]
009c3ef4	stp x22,x21,[sp, #0x20]
009c3ef8	stp x20,x19,[sp, #0x30]
009c3efc	stp x29,x30,[sp, #0x40]
009c3f00	add x29,sp,#0x40
009c3f04	cbz x3,0x009c3fd0
009c3f08	mov x19,x3
009c3f0c	mov x20,x2
009c3f10	mov x21,x1
009c3f14	mov x22,x0
009c3f18	mov w23,wzr
009c3f1c	mov x25,xzr
009c3f20	b 0x009c3f2c
009c3f24	mov w23,wzr
009c3f28	b 0x009c3fc0
009c3f2c	ldrh w1,[x20, x25, LSL #0x1]
009c3f30	mov x0,x22
009c3f34	bl 0x009c21e4
009c3f38	cbz x0,0x009c3fc0
009c3f3c	mov x24,x0
009c3f40	mov w1,#0xb
009c3f44	movk w1,#0x5, LSL #16
009c3f48	mov x0,x22
009c3f4c	mov x2,x24
009c3f50	bl 0x009c3c60
009c3f54	cbz w0,0x009c3fc0
009c3f58	ldrh w1,[x20, x25, LSL #0x1]
009c3f5c	mov w2,#0x2
009c3f60	mov x0,x21
009c3f64	bl 0x00c343a0
009c3f68	cbz w0,0x009c3ffc
009c3f6c	cbnz w23,0x009c3fc0
009c3f70	ldr x8,[x22, #0x8]
009c3f74	ldr x9,[x8, #0xc0]
009c3f78	ldrb w9,[x9, #0x60]
009c3f7c	tbnz w9,#0x3,0x009c3fbc
009c3f80	ldr w8,[x8]
009c3f84	cmp w8,#0x304
009c3f88	b.lt 0x009c3fbc
009c3f8c	cmp w8,#0x10, LSL #12
009c3f90	b.eq 0x009c3fbc
009c3f94	ldr w8,[x24, #0x14]
009c3f98	mov w23,wzr
009c3f9c	cmp w8,#0x6
009c3fa0	b.eq 0x009c3fc0
009c3fa4	ldr w8,[x24, #0xc]
009c3fa8	cmp w8,#0x40
009c3fac	b.eq 0x009c3f24
009c3fb0	cmp w8,#0x2a3
009c3fb4	mov w23,wzr
009c3fb8	b.eq 0x009c3fc0
009c3fbc	mov w23,#0x1
009c3fc0	add x25,x25,#0x1
009c3fc4	cmp x25,x19
009c3fc8	b.cc 0x009c3f2c
009c3fcc	cbnz w23,0x009c4000
009c3fd0	bl 0x00c342a0
009c3fd4	adrp x0,0x2c3000
009c3fd8	adrp x2,0x2d1000
009c3fdc	add x0,x0,#0x5d8
009c3fe0	add x2,x2,#0x654
009c3fe4	mov w1,#0x899
009c3fe8	bl 0x00c342b0
009c3fec	mov w0,#0x14
009c3ff0	mov w1,#0x76
009c3ff4	mov x2,xzr
009c3ff8	bl 0x00c342c0
009c3ffc	mov w23,wzr
009c4000	mov w0,w23
009c4004	ldp x29,x30,[sp, #0x40]
009c4008	ldp x20,x19,[sp, #0x30]
009c400c	ldp x22,x21,[sp, #0x20]
009c4010	ldp x24,x23,[sp, #0x10]
009c4014	ldr x25,[sp], #0x50
009c4018	ret
