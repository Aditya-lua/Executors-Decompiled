; ssl_cert_new @ 009abd00
009abd00	stp x20,x19,[sp, #-0x20]!
009abd04	adrp x1,0x2d5000
009abd08	add x1,x1,#0x6b3
009abd0c	mov w0,#0x218
009abd10	orr w2,wzr,#0x3f
009abd14	stp x29,x30,[sp, #0x10]
009abd18	add x29,sp,#0x10
009abd1c	bl 0x00c34250
009abd20	mov x19,x0
009abd24	cbz x0,0x009abda8
009abd28	adrp x11,0x9ab000
009abd2c	add x8,x19,#0x20
009abd30	add x9,x19,#0x208
009abd34	mov w10,#0x1
009abd38	add x11,x11,#0xde8
009abd3c	str x8,[x19]
009abd40	stlr w10,[x9]
009abd44	str x11,[x19, #0x1e8]
009abd48	str w10,[x19, #0x1f0]
009abd4c	str xzr,[x19, #0x1f8]
009abd50	bl 0x00c34d50
009abd54	str x0,[x19, #0x210]
009abd58	cbnz x0,0x009abdd8
009abd5c	bl 0x00c342a0
009abd60	adrp x20,0x2d5000
009abd64	add x20,x20,#0x6b3
009abd68	adrp x2,0x2d7000
009abd6c	add x2,x2,#0x87d
009abd70	mov w1,#0x4d
009abd74	mov x0,x20
009abd78	bl 0x00c342b0
009abd7c	mov w1,#0x100
009abd80	mov w0,#0x14
009abd84	movk w1,#0xc, LSL #16
009abd88	mov x2,xzr
009abd8c	bl 0x00c342c0
009abd90	mov w2,#0x4e
009abd94	mov x0,x19
009abd98	mov x1,x20
009abd9c	bl 0x00c32310
009abda0	mov x19,xzr
009abda4	b 0x009abdd8
009abda8	bl 0x00c342a0
009abdac	adrp x0,0x2d5000
009abdb0	adrp x2,0x2d7000
009abdb4	add x0,x0,#0x6b3
009abdb8	add x2,x2,#0x87d
009abdbc	mov w1,#0x42
009abdc0	bl 0x00c342b0
009abdc4	mov w1,#0x100
009abdc8	mov w0,#0x14
009abdcc	movk w1,#0xc, LSL #16
009abdd0	mov x2,xzr
009abdd4	bl 0x00c342c0
009abdd8	ldp x29,x30,[sp, #0x10]
009abddc	mov x0,x19
009abde0	ldp x20,x19,[sp], #0x20
009abde4	ret
